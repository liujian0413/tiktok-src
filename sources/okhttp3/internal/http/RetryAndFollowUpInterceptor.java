package okhttp3.internal.http;

import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;

public final class RetryAndFollowUpInterceptor implements Interceptor {
    public Object callStackTrace;
    public volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    public volatile StreamAllocation streamAllocation;

    public final void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation2 = this.streamAllocation;
        if (streamAllocation2 != null) {
            streamAllocation2.cancel();
        }
    }

    private Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        HttpUrl httpUrl2 = httpUrl;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sSLSocketFactory2 = this.client.sslSocketFactory;
            hostnameVerifier = this.client.hostnameVerifier;
            sSLSocketFactory = sSLSocketFactory2;
            certificatePinner = this.client.certificatePinner;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        Address address = new Address(httpUrl2.host, httpUrl2.port, this.client.dns, this.client.socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator, this.client.proxy, this.client.protocols, this.client.connectionSpecs, this.client.proxySelector);
        return address;
    }

    public final Response intercept(Chain chain) throws IOException {
        boolean z;
        Response response;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener;
        StreamAllocation streamAllocation2 = new StreamAllocation(this.client.connectionPool, createAddress(request.url), call, eventListener, this.callStackTrace);
        this.streamAllocation = streamAllocation2;
        Response response2 = null;
        int i = 0;
        while (!this.canceled) {
            try {
                Response proceed = realInterceptorChain.proceed(request, streamAllocation2, null, null);
                if (response2 != null) {
                    response = proceed.newBuilder().priorResponse(response2.newBuilder().body(null).build()).build();
                } else {
                    response = proceed;
                }
                Request followUpRequest = followUpRequest(response, streamAllocation2.route);
                if (followUpRequest == null) {
                    if (!this.forWebSocket) {
                        streamAllocation2.release();
                    }
                    return response;
                }
                Util.closeQuietly((Closeable) response.body);
                int i2 = i + 1;
                if (i2 > 20) {
                    streamAllocation2.release();
                    StringBuilder sb = new StringBuilder("Too many follow-up requests: ");
                    sb.append(i2);
                    throw new ProtocolException(sb.toString());
                } else if (!(followUpRequest.body instanceof UnrepeatableRequestBody)) {
                    if (!sameConnection(response, followUpRequest.url)) {
                        streamAllocation2.release();
                        streamAllocation2 = new StreamAllocation(this.client.connectionPool, createAddress(followUpRequest.url), call, eventListener, this.callStackTrace);
                        this.streamAllocation = streamAllocation2;
                    } else if (streamAllocation2.codec() != null) {
                        StringBuilder sb2 = new StringBuilder("Closing the body of ");
                        sb2.append(response);
                        sb2.append(" didn't close its backing stream. Bad interceptor?");
                        throw new IllegalStateException(sb2.toString());
                    }
                    response2 = response;
                    request = followUpRequest;
                    i = i2;
                } else {
                    streamAllocation2.release();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", response.code);
                }
            } catch (RouteException e) {
                if (!recover(e.getLastConnectException(), streamAllocation2, false, request)) {
                    throw e.getLastConnectException();
                }
            } catch (IOException e2) {
                if (!(e2 instanceof ConnectionShutdownException)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!recover(e2, streamAllocation2, z, request)) {
                    throw e2;
                }
            } catch (Throwable th) {
                streamAllocation2.streamFailed(null);
                streamAllocation2.release();
                throw th;
            }
        }
        streamAllocation2.release();
        throw new IOException("Canceled");
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z) {
        this.client = okHttpClient;
        this.forWebSocket = z;
    }

    private int retryAfter(Response response, int i) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean sameConnection(Response response, HttpUrl httpUrl) {
        HttpUrl httpUrl2 = response.request.url;
        if (!httpUrl2.host.equals(httpUrl.host) || httpUrl2.port != httpUrl.port || !httpUrl2.scheme.equals(httpUrl.scheme)) {
            return false;
        }
        return true;
    }

    private Request followUpRequest(Response response, Route route) throws IOException {
        Proxy proxy;
        if (response != null) {
            int i = response.code;
            String str = response.request.method;
            RequestBody requestBody = null;
            switch (i) {
                case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
                case 301:
                case 302:
                case 303:
                    break;
                case 307:
                case 308:
                    if (!str.equals("GET") && !str.equals("HEAD")) {
                        return null;
                    }
                case 401:
                    return this.client.authenticator.authenticate(route, response);
                case 407:
                    if (route != null) {
                        proxy = route.proxy;
                    } else {
                        proxy = this.client.proxy;
                    }
                    if (proxy.type() == Type.HTTP) {
                        return this.client.proxyAuthenticator.authenticate(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                case 408:
                    if (!this.client.retryOnConnectionFailure || (response.request.body instanceof UnrepeatableRequestBody)) {
                        return null;
                    }
                    if ((response.priorResponse == null || response.priorResponse.code != 408) && retryAfter(response, 0) <= 0) {
                        return response.request;
                    }
                    return null;
                case 503:
                    if ((response.priorResponse == null || response.priorResponse.code != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                        return response.request;
                    }
                    return null;
                default:
                    return null;
            }
            if (!this.client.followRedirects) {
                return null;
            }
            String header = response.header("Location");
            if (header == null) {
                return null;
            }
            HttpUrl resolve = response.request.url.resolve(header);
            if (resolve == null) {
                return null;
            }
            if (!resolve.scheme.equals(response.request.url.scheme) && !this.client.followSslRedirects) {
                return null;
            }
            Builder newBuilder = response.request.newBuilder();
            if (HttpMethod.permitsRequestBody(str)) {
                boolean redirectsWithBody = HttpMethod.redirectsWithBody(str);
                if (HttpMethod.redirectsToGet(str)) {
                    newBuilder.method("GET", null);
                } else {
                    if (redirectsWithBody) {
                        requestBody = response.request.body;
                    }
                    newBuilder.method(str, requestBody);
                }
                if (!redirectsWithBody) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!sameConnection(response, resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    private boolean recover(IOException iOException, StreamAllocation streamAllocation2, boolean z, Request request) {
        streamAllocation2.streamFailed(iOException);
        if (!this.client.retryOnConnectionFailure) {
            return false;
        }
        if ((!z || !(request.body instanceof UnrepeatableRequestBody)) && isRecoverable(iOException, z) && streamAllocation2.hasMoreRoutes()) {
            return true;
        }
        return false;
    }
}
