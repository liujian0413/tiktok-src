package org.apache.http.impl.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

public class DefaultRequestDirector implements RequestDirector {
    protected final ClientConnectionManager connManager;
    protected final HttpProcessor httpProcessor;
    protected final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    protected ManagedClientConnection managedConn;
    private int maxRedirects;
    protected final HttpParams params;
    protected final AuthenticationHandler proxyAuthHandler;
    protected final AuthState proxyAuthState;
    private int redirectCount;
    protected final RedirectHandler redirectHandler;
    protected final HttpRequestExecutor requestExec;
    protected final HttpRequestRetryHandler retryHandler;
    protected final ConnectionReuseStrategy reuseStrategy;
    protected final HttpRoutePlanner routePlanner;
    protected final AuthenticationHandler targetAuthHandler;
    protected final AuthState targetAuthState;
    protected final UserTokenHandler userTokenHandler;
    private HttpHost virtualHost;

    /* access modifiers changed from: protected */
    public void releaseConnection() {
        try {
            this.managedConn.releaseConnection();
        } catch (IOException e) {
            this.log.debug("IOException releasing connection", e);
        }
        this.managedConn = null;
    }

    private void abortConnection() {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            this.managedConn = null;
            try {
                managedClientConnection.abortConnection();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug(e.getMessage(), e);
                }
            }
            try {
                managedClientConnection.releaseConnection();
            } catch (IOException e2) {
                this.log.debug("Error releasing connection", e2);
            }
        }
    }

    private RequestWrapper wrapRequest(HttpRequest httpRequest) throws ProtocolException {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            return new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
        }
        return new RequestWrapper(httpRequest);
    }

    /* access modifiers changed from: protected */
    public HttpRequest createConnectRequest(HttpRoute httpRoute, HttpContext httpContext) {
        HttpHost targetHost = httpRoute.getTargetHost();
        String hostName = targetHost.getHostName();
        int port = targetHost.getPort();
        if (port < 0) {
            port = this.connManager.getSchemeRegistry().getScheme(targetHost.getSchemeName()).getDefaultPort();
        }
        StringBuilder sb = new StringBuilder(hostName.length() + 6);
        sb.append(hostName);
        sb.append(':');
        sb.append(Integer.toString(port));
        return new BasicHttpRequest("CONNECT", sb.toString(), HttpProtocolParams.getVersion(this.params));
    }

    /* access modifiers changed from: protected */
    public void rewriteRequestURI(RequestWrapper requestWrapper, HttpRoute httpRoute) throws ProtocolException {
        try {
            URI uri = requestWrapper.getURI();
            if (httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) {
                if (uri.isAbsolute()) {
                    requestWrapper.setURI(URIUtils.rewriteURI(uri, null));
                }
            } else if (!uri.isAbsolute()) {
                requestWrapper.setURI(URIUtils.rewriteURI(uri, httpRoute.getTargetHost()));
            }
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder("Invalid URI: ");
            sb.append(requestWrapper.getRequestLine().getUri());
            throw new ProtocolException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public void establishRoute(HttpRoute httpRoute, HttpContext httpContext) throws HttpException, IOException {
        int nextStep;
        BasicRouteDirector basicRouteDirector = new BasicRouteDirector();
        do {
            HttpRoute route = this.managedConn.getRoute();
            nextStep = basicRouteDirector.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    StringBuilder sb = new StringBuilder("Unable to establish route.\nplanned = ");
                    sb.append(httpRoute);
                    sb.append("\ncurrent = ");
                    sb.append(route);
                    throw new IllegalStateException(sb.toString());
                case 0:
                    break;
                case 1:
                case 2:
                    this.managedConn.open(httpRoute, httpContext, this.params);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(httpRoute, httpContext);
                    this.log.debug("Tunnel to target created.");
                    this.managedConn.tunnelTarget(createTunnelToTarget, this.params);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpContext);
                    this.log.debug("Tunnel to proxy created.");
                    this.managedConn.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy, this.params);
                    continue;
                case 5:
                    this.managedConn.layerProtocol(httpContext, this.params);
                    continue;
                default:
                    StringBuilder sb2 = new StringBuilder("Unknown step indicator ");
                    sb2.append(nextStep);
                    sb2.append(" from RouteDirector.");
                    throw new IllegalStateException(sb2.toString());
            }
        } while (nextStep > 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean createTunnelToTarget(org.apache.http.conn.routing.HttpRoute r17, org.apache.http.protocol.HttpContext r18) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r16 = this;
            r7 = r16
            r8 = r18
            org.apache.http.HttpHost r9 = r17.getProxyHost()
            org.apache.http.HttpHost r10 = r17.getTargetHost()
            r11 = 0
            r12 = 0
            r1 = r11
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x0122
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L_0x0024
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            org.apache.http.params.HttpParams r1 = r7.params
            r14 = r17
            r0.open(r14, r8, r1)
            goto L_0x0026
        L_0x0024:
            r14 = r17
        L_0x0026:
            org.apache.http.HttpRequest r0 = r16.createConnectRequest(r17, r18)
            org.apache.http.params.HttpParams r1 = r7.params
            r0.setParams(r1)
            java.lang.String r1 = "http.target_host"
            r8.setAttribute(r1, r10)
            java.lang.String r1 = "http.proxy_host"
            r8.setAttribute(r1, r9)
            java.lang.String r1 = "http.connection"
            org.apache.http.conn.ManagedClientConnection r2 = r7.managedConn
            r8.setAttribute(r1, r2)
            java.lang.String r1 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r2 = r7.targetAuthState
            r8.setAttribute(r1, r2)
            java.lang.String r1 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r2 = r7.proxyAuthState
            r8.setAttribute(r1, r2)
            java.lang.String r1 = "http.request"
            r8.setAttribute(r1, r0)
            org.apache.http.protocol.HttpRequestExecutor r1 = r7.requestExec
            org.apache.http.protocol.HttpProcessor r2 = r7.httpProcessor
            r1.preProcess(r0, r2, r8)
            org.apache.http.protocol.HttpRequestExecutor r1 = r7.requestExec
            org.apache.http.conn.ManagedClientConnection r2 = r7.managedConn
            org.apache.http.HttpResponse r15 = r1.execute(r0, r2, r8)
            org.apache.http.params.HttpParams r0 = r7.params
            r15.setParams(r0)
            org.apache.http.protocol.HttpRequestExecutor r0 = r7.requestExec
            org.apache.http.protocol.HttpProcessor r1 = r7.httpProcessor
            r0.postProcess(r15, r1, r8)
            org.apache.http.StatusLine r0 = r15.getStatusLine()
            int r0 = r0.getStatusCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x010a
            java.lang.String r0 = "http.auth.credentials-provider"
            java.lang.Object r0 = r8.getAttribute(r0)
            r6 = r0
            org.apache.http.client.CredentialsProvider r6 = (org.apache.http.client.CredentialsProvider) r6
            if (r6 == 0) goto L_0x0106
            org.apache.http.params.HttpParams r0 = r7.params
            boolean r0 = org.apache.http.client.params.HttpClientParams.isAuthenticating(r0)
            if (r0 == 0) goto L_0x0106
            org.apache.http.client.AuthenticationHandler r0 = r7.proxyAuthHandler
            boolean r0 = r0.isAuthenticationRequested(r15, r8)
            if (r0 == 0) goto L_0x0101
            org.apache.commons.logging.Log r0 = r7.log
            java.lang.String r1 = "Proxy requested authentication"
            r0.debug(r1)
            org.apache.http.client.AuthenticationHandler r0 = r7.proxyAuthHandler
            java.util.Map r2 = r0.getChallenges(r15, r8)
            org.apache.http.auth.AuthState r3 = r7.proxyAuthState     // Catch:{ AuthenticationException -> 0x00b2 }
            org.apache.http.client.AuthenticationHandler r4 = r7.proxyAuthHandler     // Catch:{ AuthenticationException -> 0x00b2 }
            r1 = r16
            r5 = r15
            r13 = r6
            r6 = r18
            r1.processChallenges(r2, r3, r4, r5, r6)     // Catch:{ AuthenticationException -> 0x00b0 }
            goto L_0x00d4
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            r0 = move-exception
            r13 = r6
        L_0x00b4:
            org.apache.commons.logging.Log r1 = r7.log
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L_0x00d4
            org.apache.commons.logging.Log r1 = r7.log
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Authentication error: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.warn(r0)
            goto L_0x0123
        L_0x00d4:
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            r7.updateAuthState(r0, r9, r13)
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            org.apache.http.auth.Credentials r0 = r0.getCredentials()
            if (r0 == 0) goto L_0x0106
            org.apache.http.ConnectionReuseStrategy r0 = r7.reuseStrategy
            boolean r0 = r0.keepAlive(r15, r8)
            if (r0 == 0) goto L_0x00fb
            org.apache.commons.logging.Log r0 = r7.log
            java.lang.String r1 = "Connection kept alive"
            r0.debug(r1)
            org.apache.http.HttpEntity r0 = r15.getEntity()
            if (r0 == 0) goto L_0x00f9
            r0.consumeContent()
        L_0x00f9:
            r0 = 0
            goto L_0x0107
        L_0x00fb:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.close()
            goto L_0x00f9
        L_0x0101:
            org.apache.http.auth.AuthState r0 = r7.proxyAuthState
            r0.setAuthScope(r11)
        L_0x0106:
            r0 = 1
        L_0x0107:
            r1 = r15
            goto L_0x0010
        L_0x010a:
            org.apache.http.HttpException r0 = new org.apache.http.HttpException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected response to CONNECT request: "
            r1.<init>(r2)
            org.apache.http.StatusLine r2 = r15.getStatusLine()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0122:
            r15 = r1
        L_0x0123:
            org.apache.http.StatusLine r0 = r15.getStatusLine()
            int r0 = r0.getStatusCode()
            r1 = 299(0x12b, float:4.19E-43)
            if (r0 <= r1) goto L_0x015a
            org.apache.http.HttpEntity r0 = r15.getEntity()
            if (r0 == 0) goto L_0x013d
            org.apache.http.entity.BufferedHttpEntity r1 = new org.apache.http.entity.BufferedHttpEntity
            r1.<init>(r0)
            r15.setEntity(r1)
        L_0x013d:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.close()
            org.apache.http.impl.client.TunnelRefusedException r0 = new org.apache.http.impl.client.TunnelRefusedException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CONNECT refused by proxy: "
            r1.<init>(r2)
            org.apache.http.StatusLine r2 = r15.getStatusLine()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r15)
            throw r0
        L_0x015a:
            org.apache.http.conn.ManagedClientConnection r0 = r7.managedConn
            r0.markReusable()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.createTunnelToTarget(org.apache.http.conn.routing.HttpRoute, org.apache.http.protocol.HttpContext):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpContext httpContext) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter("http.default-host");
        }
        if (httpHost != null) {
            return this.routePlanner.determineRoute(httpHost, httpRequest, httpContext);
        }
        throw new IllegalStateException("Target host must not be null, or set in parameters.");
    }

    private void updateAuthState(AuthState authState, HttpHost httpHost, CredentialsProvider credentialsProvider) {
        if (authState.isValid()) {
            String hostName = httpHost.getHostName();
            int port = httpHost.getPort();
            if (port < 0) {
                port = this.connManager.getSchemeRegistry().getScheme(httpHost).getDefaultPort();
            }
            AuthScheme authScheme = authState.getAuthScheme();
            AuthScope authScope = new AuthScope(hostName, port, authScheme.getRealm(), authScheme.getSchemeName());
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                StringBuilder sb = new StringBuilder("Authentication scope: ");
                sb.append(authScope);
                log2.debug(sb.toString());
            }
            Credentials credentials = authState.getCredentials();
            if (credentials == null) {
                credentials = credentialsProvider.getCredentials(authScope);
                if (this.log.isDebugEnabled()) {
                    if (credentials != null) {
                        this.log.debug("Found credentials");
                    } else {
                        this.log.debug("Credentials not found");
                    }
                }
            } else if (authScheme.isComplete()) {
                this.log.debug("Authentication failed");
                credentials = null;
            }
            authState.setAuthScope(authScope);
            authState.setCredentials(credentials);
        }
    }

    /* access modifiers changed from: protected */
    public RoutedRequest handleResponse(RoutedRequest routedRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        HttpRoute route = routedRequest.getRoute();
        RequestWrapper request = routedRequest.getRequest();
        HttpParams params2 = request.getParams();
        if (!HttpClientParams.isRedirecting(params2) || !this.redirectHandler.isRedirectRequested(httpResponse, httpContext)) {
            CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute("http.auth.credentials-provider");
            if (credentialsProvider != null && HttpClientParams.isAuthenticating(params2)) {
                if (this.targetAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                    if (httpHost == null) {
                        httpHost = route.getTargetHost();
                    }
                    this.log.debug("Target requested authentication");
                    try {
                        processChallenges(this.targetAuthHandler.getChallenges(httpResponse, httpContext), this.targetAuthState, this.targetAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log2 = this.log;
                            StringBuilder sb = new StringBuilder("Authentication error: ");
                            sb.append(e.getMessage());
                            log2.warn(sb.toString());
                            return null;
                        }
                    }
                    updateAuthState(this.targetAuthState, httpHost, credentialsProvider);
                    if (this.targetAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.targetAuthState.setAuthScope(null);
                if (this.proxyAuthHandler.isAuthenticationRequested(httpResponse, httpContext)) {
                    HttpHost proxyHost = route.getProxyHost();
                    this.log.debug("Proxy requested authentication");
                    try {
                        processChallenges(this.proxyAuthHandler.getChallenges(httpResponse, httpContext), this.proxyAuthState, this.proxyAuthHandler, httpResponse, httpContext);
                    } catch (AuthenticationException e2) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            StringBuilder sb2 = new StringBuilder("Authentication error: ");
                            sb2.append(e2.getMessage());
                            log3.warn(sb2.toString());
                            return null;
                        }
                    }
                    updateAuthState(this.proxyAuthState, proxyHost, credentialsProvider);
                    if (this.proxyAuthState.getCredentials() != null) {
                        return routedRequest;
                    }
                    return null;
                }
                this.proxyAuthState.setAuthScope(null);
            }
            return null;
        } else if (this.redirectCount < this.maxRedirects) {
            this.redirectCount++;
            this.virtualHost = null;
            URI locationURI = this.redirectHandler.getLocationURI(httpResponse, httpContext);
            HttpHost httpHost2 = new HttpHost(locationURI.getHost(), locationURI.getPort(), locationURI.getScheme());
            this.targetAuthState.setAuthScope(null);
            this.proxyAuthState.setAuthScope(null);
            if (!route.getTargetHost().equals(httpHost2)) {
                this.targetAuthState.invalidate();
                AuthScheme authScheme = this.proxyAuthState.getAuthScheme();
                if (authScheme != null && authScheme.isConnectionBased()) {
                    this.proxyAuthState.invalidate();
                }
            }
            HttpRedirect httpRedirect = new HttpRedirect(request.getMethod(), locationURI);
            httpRedirect.setHeaders(request.getOriginal().getAllHeaders());
            RequestWrapper requestWrapper = new RequestWrapper(httpRedirect);
            requestWrapper.setParams(params2);
            HttpRoute determineRoute = determineRoute(httpHost2, requestWrapper, httpContext);
            RoutedRequest routedRequest2 = new RoutedRequest(requestWrapper, determineRoute);
            if (this.log.isDebugEnabled()) {
                Log log4 = this.log;
                StringBuilder sb3 = new StringBuilder("Redirecting to '");
                sb3.append(locationURI);
                sb3.append("' via ");
                sb3.append(determineRoute);
                log4.debug(sb3.toString());
            }
            return routedRequest2;
        } else {
            StringBuilder sb4 = new StringBuilder("Maximum redirects (");
            sb4.append(this.maxRedirects);
            sb4.append(") exceeded");
            throw new RedirectException(sb4.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ab, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e0, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e4, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02e7, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e8, code lost:
        abortConnection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02eb, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        r2 = r0;
        r3 = new java.io.InterruptedIOException();
        r3.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016b, code lost:
        r18 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0188, code lost:
        if (r1.log.isInfoEnabled() != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018a, code lost:
        r4 = r1.log;
        r5 = new java.lang.StringBuilder("I/O exception (");
        r5.append(r2.getClass().getName());
        r5.append(") caught when processing request: ");
        r5.append(r2.getMessage());
        r4.info(r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        if (r1.log.isDebugEnabled() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
        r1.log.debug(r2.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c2, code lost:
        r1.log.info("Retrying request");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cd, code lost:
        if (r13.isTunnelled() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        r1.log.debug("Reopening the direct connection.");
        r1.managedConn.open(r13, r3, r1.params);
        r16 = r2;
        r4 = r18;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        r1.log.debug("Proxied connection. Need to start over.");
        r16 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ef, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02aa A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }, ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b0 A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }, ExcHandler: HttpException (r0v0 'e' org.apache.http.HttpException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:2:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0182 A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r21, org.apache.http.HttpRequest r22, org.apache.http.protocol.HttpContext r23) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            r3 = r23
            org.apache.http.impl.client.RequestWrapper r4 = r1.wrapRequest(r2)
            org.apache.http.params.HttpParams r5 = r1.params
            r4.setParams(r5)
            r5 = r21
            org.apache.http.conn.routing.HttpRoute r5 = r1.determineRoute(r5, r4, r3)
            org.apache.http.params.HttpParams r6 = r22.getParams()
            java.lang.String r7 = "http.virtual-host"
            java.lang.Object r6 = r6.getParameter(r7)
            org.apache.http.HttpHost r6 = (org.apache.http.HttpHost) r6
            r1.virtualHost = r6
            org.apache.http.impl.client.RoutedRequest r6 = new org.apache.http.impl.client.RoutedRequest
            r6.<init>(r4, r5)
            org.apache.http.params.HttpParams r4 = r1.params
            long r4 = org.apache.http.conn.params.ConnManagerParams.getTimeout(r4)
            r9 = r6
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0033:
            if (r6 != 0) goto L_0x02b3
            org.apache.http.impl.client.RequestWrapper r11 = r9.getRequest()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.routing.HttpRoute r13 = r9.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r14 = "http.user-token"
            java.lang.Object r14 = r3.getAttribute(r14)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r15 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r15 != 0) goto L_0x0096
            org.apache.http.conn.ClientConnectionManager r15 = r1.connManager     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ClientConnectionRequest r15 = r15.requestConnection(r13, r14)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r7 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 == 0) goto L_0x0057
            r7 = r2
            org.apache.http.client.methods.AbortableHttpRequest r7 = (org.apache.http.client.methods.AbortableHttpRequest) r7     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.setConnectionRequest(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0057:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x008b }
            org.apache.http.conn.ManagedClientConnection r7 = r15.getConnection(r4, r7)     // Catch:{ InterruptedException -> 0x008b }
            r1.managedConn = r7     // Catch:{ InterruptedException -> 0x008b }
            org.apache.http.params.HttpParams r7 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r7 = org.apache.http.params.HttpConnectionParams.isStaleCheckingEnabled(r7)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 == 0) goto L_0x0096
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r7 = r7.isOpen()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 == 0) goto L_0x0096
            org.apache.commons.logging.Log r7 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r15 = "Stale connection check"
            r7.debug(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r7 = r7.isStale()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 == 0) goto L_0x0096
            org.apache.commons.logging.Log r7 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r15 = "Stale connection detected"
            r7.debug(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x0096
        L_0x008b:
            r0 = move-exception
            r2 = r0
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.<init>()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.initCause(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r3     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0096:
            boolean r7 = r2 instanceof org.apache.http.client.methods.AbortableHttpRequest     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 == 0) goto L_0x00a2
            r7 = r2
            org.apache.http.client.methods.AbortableHttpRequest r7 = (org.apache.http.client.methods.AbortableHttpRequest) r7     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r15 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.setReleaseTrigger(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00a2:
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r7 = r7.isOpen()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 != 0) goto L_0x00b2
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r15 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.open(r13, r3, r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x00bd
        L_0x00b2:
            org.apache.http.conn.ManagedClientConnection r7 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r15 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            int r15 = org.apache.http.params.HttpConnectionParams.getSoTimeout(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.setSocketTimeout(r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00bd:
            r1.establishRoute(r13, r3)     // Catch:{ TunnelRefusedException -> 0x0292 }
            r11.resetHeaders()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r1.rewriteRequestURI(r11, r13)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.HttpHost r7 = r1.virtualHost     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r7 != 0) goto L_0x00ce
            org.apache.http.HttpHost r7 = r13.getTargetHost()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x00ce:
            org.apache.http.HttpHost r15 = r13.getProxyHost()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = "http.target_host"
            r3.setAttribute(r8, r7)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r7 = "http.proxy_host"
            r3.setAttribute(r7, r15)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r7 = "http.connection"
            org.apache.http.conn.ManagedClientConnection r8 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r7, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r7 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r8 = r1.targetAuthState     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r7, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r7 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r8 = r1.proxyAuthState     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.setAttribute(r7, r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpRequestExecutor r7 = r1.requestExec     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpProcessor r8 = r1.httpProcessor     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.preProcess(r11, r8, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r8 = 1
            r7 = 1
            r15 = 0
            r16 = 0
        L_0x00fd:
            if (r7 == 0) goto L_0x01f0
            int r12 = r12 + 1
            r11.incrementExecCount()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            int r2 = r11.getExecCount()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 <= r8) goto L_0x012b
            boolean r2 = r11.isRepeatable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x012b
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r3 = "Cannot retry non-repeatable request"
            r2.debug(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2 = r16
            if (r2 == 0) goto L_0x0123
            org.apache.http.client.NonRepeatableRequestException r3 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = "Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed."
            r3.<init>(r4, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r3     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0123:
            org.apache.http.client.NonRepeatableRequestException r2 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r3 = "Cannot retry request with a non-repeatable request entity."
            r2.<init>(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            throw r2     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x012b:
            r2 = r16
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            boolean r8 = r8.isDebugEnabled()     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            if (r8 == 0) goto L_0x0152
            org.apache.commons.logging.Log r8 = r1.log     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r18 = r4
            java.lang.String r4 = "Attempt "
            r2.<init>(r4)     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r2.append(r12)     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            java.lang.String r4 = " to execute request"
            r2.append(r4)     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r8.debug(r2)     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            goto L_0x0156
        L_0x0152:
            r17 = r2
            r18 = r4
        L_0x0156:
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            org.apache.http.HttpResponse r2 = r2.execute(r11, r4, r3)     // Catch:{ IOException -> 0x0168, HttpException -> 0x02b0, RuntimeException -> 0x02aa }
            r15 = r2
            r16 = r17
        L_0x0161:
            r4 = r18
            r2 = r22
            r7 = 0
        L_0x0166:
            r8 = 1
            goto L_0x00fd
        L_0x0168:
            r0 = move-exception
            goto L_0x016d
        L_0x016a:
            r0 = move-exception
            r18 = r4
        L_0x016d:
            r2 = r0
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = "Closing the connection."
            r4.debug(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.client.HttpRequestRetryHandler r4 = r1.retryHandler     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r4 = r4.retryRequest(r2, r12, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 == 0) goto L_0x01ef
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r4 = r4.isInfoEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 == 0) goto L_0x01b1
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = "I/O exception ("
            r5.<init>(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.Class r8 = r2.getClass()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = r8.getName()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.append(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = ") caught when processing request: "
            r5.append(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r5.append(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = r5.toString()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.info(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x01b1:
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 == 0) goto L_0x01c2
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.debug(r5, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x01c2:
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = "Retrying request"
            r4.info(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r4 = r13.isTunnelled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 != 0) goto L_0x01e4
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = "Reopening the direct connection."
            r4.debug(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.params.HttpParams r5 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.open(r13, r3, r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r16 = r2
            r4 = r18
            r2 = r22
            goto L_0x0166
        L_0x01e4:
            org.apache.commons.logging.Log r4 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r5 = "Proxied connection. Need to start over."
            r4.debug(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r16 = r2
            goto L_0x0161
        L_0x01ef:
            throw r2     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x01f0:
            r18 = r4
            if (r15 == 0) goto L_0x028b
            org.apache.http.params.HttpParams r2 = r1.params     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r15.setParams(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpRequestExecutor r2 = r1.requestExec     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.protocol.HttpProcessor r4 = r1.httpProcessor     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.postProcess(r15, r4, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.ConnectionReuseStrategy r2 = r1.reuseStrategy     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r10 = r2.keepAlive(r15, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r10 == 0) goto L_0x0243
            org.apache.http.conn.ConnectionKeepAliveStrategy r2 = r1.keepAliveStrategy     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            long r4 = r2.getKeepAliveDuration(r15, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.setIdleDuration(r4, r7)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r2 = r2.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x0243
            r7 = 0
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x023c
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r8 = "Connection can be kept alive for "
            r7.<init>(r8)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r7.append(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = " ms"
            r7.append(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = r7.toString()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.debug(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x0243
        L_0x023c:
            org.apache.commons.logging.Log r2 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = "Connection can be kept alive indefinitely"
            r2.debug(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0243:
            org.apache.http.impl.client.RoutedRequest r2 = r1.handleResponse(r9, r15, r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x024b
            r6 = 1
            goto L_0x0273
        L_0x024b:
            if (r10 == 0) goto L_0x025c
            org.apache.http.HttpEntity r4 = r15.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 == 0) goto L_0x0256
            r4.consumeContent()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0256:
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.markReusable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x0261
        L_0x025c:
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.close()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0261:
            org.apache.http.conn.routing.HttpRoute r4 = r2.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.routing.HttpRoute r5 = r9.getRoute()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r4 = r4.equals(r5)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r4 != 0) goto L_0x0272
            r20.releaseConnection()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x0272:
            r9 = r2
        L_0x0273:
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x028b
            if (r14 != 0) goto L_0x028b
            org.apache.http.client.UserTokenHandler r2 = r1.userTokenHandler     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.Object r2 = r2.getUserToken(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = "http.user-token"
            r3.setAttribute(r4, r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x028b
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r4.setState(r2)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x028b:
            r11 = r15
            r4 = r18
            r2 = r22
            goto L_0x0033
        L_0x0292:
            r0 = move-exception
            r2 = r0
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r3 = r3.isDebugEnabled()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r3 == 0) goto L_0x02a5
            org.apache.commons.logging.Log r3 = r1.log     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            java.lang.String r4 = r2.getMessage()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.debug(r4)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02a5:
            org.apache.http.HttpResponse r11 = r2.getResponse()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x02b3
        L_0x02aa:
            r0 = move-exception
            r2 = r0
            goto L_0x02e0
        L_0x02ad:
            r0 = move-exception
            r2 = r0
            goto L_0x02e4
        L_0x02b0:
            r0 = move-exception
            r2 = r0
            goto L_0x02e8
        L_0x02b3:
            if (r11 == 0) goto L_0x02d5
            org.apache.http.HttpEntity r2 = r11.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 == 0) goto L_0x02d5
            org.apache.http.HttpEntity r2 = r11.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            boolean r2 = r2.isStreaming()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            if (r2 != 0) goto L_0x02c6
            goto L_0x02d5
        L_0x02c6:
            org.apache.http.HttpEntity r2 = r11.getEntity()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.BasicManagedEntity r3 = new org.apache.http.conn.BasicManagedEntity     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            org.apache.http.conn.ManagedClientConnection r4 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r3.<init>(r2, r4, r10)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r11.setEntity(r3)     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            goto L_0x02df
        L_0x02d5:
            if (r10 == 0) goto L_0x02dc
            org.apache.http.conn.ManagedClientConnection r2 = r1.managedConn     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
            r2.markReusable()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02dc:
            r20.releaseConnection()     // Catch:{ HttpException -> 0x02b0, IOException -> 0x02ad, RuntimeException -> 0x02aa }
        L_0x02df:
            return r11
        L_0x02e0:
            r20.abortConnection()
            throw r2
        L_0x02e4:
            r20.abortConnection()
            throw r2
        L_0x02e8:
            r20.abortConnection()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.DefaultRequestDirector.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    private void processChallenges(Map<String, Header> map, AuthState authState, AuthenticationHandler authenticationHandler, HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException, AuthenticationException {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = authenticationHandler.selectScheme(map, httpResponse, httpContext);
            authState.setAuthScheme(authScheme);
        }
        String schemeName = authScheme.getSchemeName();
        Header header = (Header) map.get(schemeName.toLowerCase(Locale.ENGLISH));
        if (header != null) {
            authScheme.processChallenge(header);
            this.log.debug("Authorization challenge processed");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(schemeName);
        sb.append(" authorization challenge expected, but not found");
        throw new AuthenticationException(sb.toString());
    }

    DefaultRequestDirector(Log log2, HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor2, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler2, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler2, HttpParams httpParams) {
        if (log2 == null) {
            throw new IllegalArgumentException("Log may not be null.");
        } else if (httpRequestExecutor == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (clientConnectionManager == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (connectionReuseStrategy == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (connectionKeepAliveStrategy == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (httpRoutePlanner == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (httpProcessor2 == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (httpRequestRetryHandler == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (redirectHandler2 == null) {
            throw new IllegalArgumentException("Redirect handler may not be null.");
        } else if (authenticationHandler == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (authenticationHandler2 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (userTokenHandler2 == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (httpParams != null) {
            this.log = log2;
            this.requestExec = httpRequestExecutor;
            this.connManager = clientConnectionManager;
            this.reuseStrategy = connectionReuseStrategy;
            this.keepAliveStrategy = connectionKeepAliveStrategy;
            this.routePlanner = httpRoutePlanner;
            this.httpProcessor = httpProcessor2;
            this.retryHandler = httpRequestRetryHandler;
            this.redirectHandler = redirectHandler2;
            this.targetAuthHandler = authenticationHandler;
            this.proxyAuthHandler = authenticationHandler2;
            this.userTokenHandler = userTokenHandler2;
            this.params = httpParams;
            this.managedConn = null;
            this.redirectCount = 0;
            this.maxRedirects = this.params.getIntParameter("http.protocol.max-redirects", 100);
            this.targetAuthState = new AuthState();
            this.proxyAuthState = new AuthState();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }
}
