package com.squareup.okhttp;

import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.squareup.okhttp.internal.http.OkHeaders;
import java.util.Collections;
import java.util.List;

public final class Response {
    public final ResponseBody body;
    private volatile CacheControl cacheControl;
    public Response cacheResponse;
    public final int code;
    public final Handshake handshake;
    public final Headers headers;
    public final String message;
    public Response networkResponse;
    public final Response priorResponse;
    public final Protocol protocol;
    public final Request request;

    public static class Builder {
        public ResponseBody body;
        public Response cacheResponse;
        public int code;
        public Handshake handshake;
        public com.squareup.okhttp.Headers.Builder headers;
        public String message;
        public Response networkResponse;
        public Response priorResponse;
        public Protocol protocol;
        public Request request;

        public Builder() {
            this.code = -1;
            this.headers = new com.squareup.okhttp.Headers.Builder();
        }

        public Response build() {
            if (this.request == null) {
                throw new IllegalStateException("request == null");
            } else if (this.protocol == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.code >= 0) {
                return new Response(this);
            } else {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.code);
                throw new IllegalStateException(sb.toString());
            }
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder handshake(Handshake handshake2) {
            this.handshake = handshake2;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder protocol(Protocol protocol2) {
            this.protocol = protocol2;
            return this;
        }

        public Builder request(Request request2) {
            this.request = request2;
            return this;
        }

        public Builder headers(Headers headers2) {
            this.headers = headers2.newBuilder();
            return this;
        }

        public Builder priorResponse(Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        private void checkPriorResponse(Response response) {
            if (response.body != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public Builder cacheResponse(Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder networkResponse(Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        private Builder(Response response) {
            this.code = -1;
            this.request = response.request;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.handshake = response.handshake;
            this.headers = response.headers.newBuilder();
            this.body = response.body;
            this.networkResponse = response.networkResponse;
            this.cacheResponse = response.cacheResponse;
            this.priorResponse = response.priorResponse;
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.body != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (response.networkResponse != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (response.cacheResponse != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (response.priorResponse != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final Request request() {
        return this.request;
    }

    public final Builder newBuilder() {
        return new Builder();
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

    public final boolean isSuccessful() {
        if (this.code < 200 || this.code >= 300) {
            return false;
        }
        return true;
    }

    public final List<Challenge> challenges() {
        String str;
        if (this.code == 401) {
            str = "WWW-Authenticate";
        } else if (this.code != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return OkHeaders.parseChallenges(headers(), str);
    }

    public final boolean isRedirect() {
        switch (this.code) {
            case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.protocol);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", url=");
        sb.append(this.request.urlString());
        sb.append('}');
        return sb.toString();
    }

    public final String header(String str) {
        return header(str, null);
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    private Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
    }

    public final String header(String str, String str2) {
        String str3 = this.headers.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }
}
