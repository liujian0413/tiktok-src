package okhttp3;

import com.p280ss.android.ugc.aweme.policy.Policy;
import java.net.URL;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

public final class Request {
    public final RequestBody body;
    private volatile CacheControl cacheControl;
    public final Headers headers;
    public String ipAddrStr;
    public final String method;
    public final Object tag;
    public final HttpUrl url;

    public static class Builder {
        RequestBody body;
        okhttp3.Headers.Builder headers;
        String method;
        Object tag;
        HttpUrl url;

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public Builder get() {
            return method("GET", null);
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder() {
            this.method = "GET";
            this.headers = new okhttp3.Headers.Builder();
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

        public Builder delete(RequestBody requestBody) {
            return method(Policy.ACTION_DELETE, requestBody);
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.url = httpUrl;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        Builder(Request request) {
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
            throw new NullPointerException("url == null");
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
            throw new NullPointerException("url == null");
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
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
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

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final Builder newBuilder() {
        return new Builder(this);
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

    Request(Builder builder) {
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
