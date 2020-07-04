package com.squareup.okhttp;

import com.p280ss.android.ugc.aweme.policy.Policy;
import com.squareup.okhttp.internal.http.HttpMethod;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.List;

public final class Request {
    public final RequestBody body;
    private volatile CacheControl cacheControl;
    public final Headers headers;
    private volatile URI javaNetUri;
    private volatile URL javaNetUrl;
    public final String method;
    public final Object tag;
    public final HttpUrl url;

    public static class Builder {
        public RequestBody body;
        public com.squareup.okhttp.Headers.Builder headers;
        public String method;
        public Object tag;
        public HttpUrl url;

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder() {
            this.method = "GET";
            this.headers = new com.squareup.okhttp.Headers.Builder();
        }

        public Builder delete() {
            return delete(RequestBody.create((MediaType) null, new byte[0]));
        }

        public Request build() {
            if (this.url != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method(Policy.ACTION_DELETE, requestBody);
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.url = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        private Builder(Request request) {
            this.url = request.url;
            this.method = request.method;
            this.body = request.body;
            this.tag = request.tag;
            this.headers = request.headers.newBuilder();
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.isEmpty()) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public Builder url(URL url2) {
            if (url2 != null) {
                HttpUrl httpUrl = HttpUrl.get(url2);
                if (httpUrl != null) {
                    return url(httpUrl);
                }
                StringBuilder sb = new StringBuilder("unexpected url: ");
                sb.append(url2);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("url == null");
        }

        public Builder url(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                HttpUrl parse = HttpUrl.parse(str);
                if (parse != null) {
                    return url(parse);
                }
                StringBuilder sb3 = new StringBuilder("unexpected url: ");
                sb3.append(str);
                throw new IllegalArgumentException(sb3.toString());
            }
            throw new IllegalArgumentException("url == null");
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (requestBody != null || !HttpMethod.requiresRequestBody(str)) {
                this.method = str;
                this.body = requestBody;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    public final RequestBody body() {
        return this.body;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final HttpUrl httpUrl() {
        return this.url;
    }

    public final String method() {
        return this.method;
    }

    public final Object tag() {
        return this.tag;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final Builder newBuilder() {
        return new Builder();
    }

    public final String urlString() {
        return this.url.toString();
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl2 = this.cacheControl;
        if (cacheControl2 != null) {
            return cacheControl2;
        }
        CacheControl parse = CacheControl.parse(this.headers);
        this.cacheControl = parse;
        return parse;
    }

    public final URL url() {
        URL url2 = this.javaNetUrl;
        if (url2 != null) {
            return url2;
        }
        URL url3 = this.url.url();
        this.javaNetUrl = url3;
        return url3;
    }

    public final URI uri() throws IOException {
        try {
            URI uri = this.javaNetUri;
            if (uri != null) {
                return uri;
            }
            URI uri2 = this.url.uri();
            this.javaNetUri = uri2;
            return uri2;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", tag=");
        if (this.tag != this) {
            obj = this.tag;
        } else {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public final String header(String str) {
        return this.headers.get(str);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    private Request(Builder builder) {
        Object obj;
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers.build();
        this.body = builder.body;
        if (builder.tag != null) {
            obj = builder.tag;
        } else {
            obj = this;
        }
        this.tag = obj;
    }
}
