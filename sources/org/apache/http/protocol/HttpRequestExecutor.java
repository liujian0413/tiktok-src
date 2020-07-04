package org.apache.http.protocol;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.ProtocolException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

public class HttpRequestExecutor {
    /* access modifiers changed from: protected */
    public boolean canResponseHaveBody(HttpRequest httpRequest, HttpResponse httpResponse) {
        if ("HEAD".equalsIgnoreCase(httpRequest.getRequestLine().getMethod())) {
            return false;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode < 200 || statusCode == 204 || statusCode == 304 || statusCode == 205) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public HttpResponse doReceiveResponse(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (httpContext != null) {
            HttpResponse httpResponse = null;
            int i = 0;
            while (true) {
                if (httpResponse != null && i >= 200) {
                    return httpResponse;
                }
                httpResponse = httpClientConnection.receiveResponseHeader();
                if (canResponseHaveBody(httpRequest, httpResponse)) {
                    httpClientConnection.receiveResponseEntity(httpResponse);
                }
                i = httpResponse.getStatusLine().getStatusCode();
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public HttpResponse execute(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws IOException, HttpException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        } else if (httpContext != null) {
            try {
                HttpResponse doSendRequest = doSendRequest(httpRequest, httpClientConnection, httpContext);
                if (doSendRequest == null) {
                    return doReceiveResponse(httpRequest, httpClientConnection, httpContext);
                }
                return doSendRequest;
            } catch (IOException e) {
                httpClientConnection.close();
                throw e;
            } catch (HttpException e2) {
                httpClientConnection.close();
                throw e2;
            } catch (RuntimeException e3) {
                httpClientConnection.close();
                throw e3;
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public void postProcess(HttpResponse httpResponse, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (httpContext != null) {
            httpContext.setAttribute("http.response", httpResponse);
            httpProcessor.process(httpResponse, httpContext);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    public void preProcess(HttpRequest httpRequest, HttpProcessor httpProcessor, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpProcessor == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (httpContext != null) {
            httpContext.setAttribute("http.request", httpRequest);
            httpProcessor.process(httpRequest, httpContext);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* access modifiers changed from: protected */
    public HttpResponse doSendRequest(HttpRequest httpRequest, HttpClientConnection httpClientConnection, HttpContext httpContext) throws IOException, HttpException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpClientConnection == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (httpContext != null) {
            httpContext.setAttribute("http.connection", httpClientConnection);
            httpContext.setAttribute("http.request_sent", Boolean.FALSE);
            httpClientConnection.sendRequestHeader(httpRequest);
            HttpResponse httpResponse = null;
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                boolean z = true;
                ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
                if (httpEntityEnclosingRequest.expectContinue() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    httpClientConnection.flush();
                    if (httpClientConnection.isResponseAvailable(httpRequest.getParams().getIntParameter("http.protocol.wait-for-continue", AdError.SERVER_ERROR_CODE))) {
                        HttpResponse receiveResponseHeader = httpClientConnection.receiveResponseHeader();
                        if (canResponseHaveBody(httpRequest, receiveResponseHeader)) {
                            httpClientConnection.receiveResponseEntity(receiveResponseHeader);
                        }
                        int statusCode = receiveResponseHeader.getStatusLine().getStatusCode();
                        if (statusCode >= 200) {
                            z = false;
                            httpResponse = receiveResponseHeader;
                        } else if (statusCode != 100) {
                            StringBuffer stringBuffer = new StringBuffer("Unexpected response: ");
                            stringBuffer.append(receiveResponseHeader.getStatusLine());
                            throw new ProtocolException(stringBuffer.toString());
                        }
                    }
                }
                if (z) {
                    httpClientConnection.sendRequestEntity(httpEntityEnclosingRequest);
                }
            }
            httpClientConnection.flush();
            httpContext.setAttribute("http.request_sent", Boolean.TRUE);
            return httpResponse;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
