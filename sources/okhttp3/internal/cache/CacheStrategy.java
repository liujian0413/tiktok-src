package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.internal.Internal;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

public final class CacheStrategy {
    public final Response cacheResponse;
    public final Request networkRequest;

    public static class Factory {
        private int ageSeconds = -1;
        final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        final long nowMillis;
        private long receivedResponseMillis;
        final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        private boolean isFreshnessLifetimeHeuristic() {
            if (this.cacheResponse.cacheControl().maxAgeSeconds == -1 && this.expires == null) {
                return true;
            }
            return false;
        }

        public CacheStrategy get() {
            CacheStrategy candidate = getCandidate();
            if (candidate.networkRequest == null || !this.request.cacheControl().onlyIfCached) {
                return candidate;
            }
            return new CacheStrategy(null, null);
        }

        private long cacheResponseAge() {
            long j = 0;
            if (this.servedDate != null) {
                j = Math.max(0, this.receivedResponseMillis - this.servedDate.getTime());
            }
            if (this.ageSeconds != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) this.ageSeconds));
            }
            return j + (this.receivedResponseMillis - this.sentRequestMillis) + (this.nowMillis - this.receivedResponseMillis);
        }

        private long computeFreshnessLifetime() {
            long j;
            long j2;
            CacheControl cacheControl = this.cacheResponse.cacheControl();
            if (cacheControl.maxAgeSeconds != -1) {
                return TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds);
            }
            if (this.expires != null) {
                if (this.servedDate != null) {
                    j2 = this.servedDate.getTime();
                } else {
                    j2 = this.receivedResponseMillis;
                }
                long time = this.expires.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.lastModified == null || this.cacheResponse.request.url.query() != null) {
                return 0;
            } else {
                if (this.servedDate != null) {
                    j = this.servedDate.getTime();
                } else {
                    j = this.sentRequestMillis;
                }
                long time2 = j - this.lastModified.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private CacheStrategy getCandidate() {
            long j;
            String str;
            String str2;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (cacheControl.noCache || hasConditions(this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl2 = this.cacheResponse.cacheControl();
            if (cacheControl2.immutable) {
                return new CacheStrategy(null, this.cacheResponse);
            }
            long cacheResponseAge = cacheResponseAge();
            long computeFreshnessLifetime = computeFreshnessLifetime();
            if (cacheControl.maxAgeSeconds != -1) {
                computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds));
            }
            long j2 = 0;
            if (cacheControl.minFreshSeconds != -1) {
                j = TimeUnit.SECONDS.toMillis((long) cacheControl.minFreshSeconds);
            } else {
                j = 0;
            }
            if (!cacheControl2.mustRevalidate && cacheControl.maxStaleSeconds != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) cacheControl.maxStaleSeconds);
            }
            if (!cacheControl2.noCache) {
                long j3 = j + cacheResponseAge;
                if (j3 < j2 + computeFreshnessLifetime) {
                    Builder newBuilder = this.cacheResponse.newBuilder();
                    if (j3 >= computeFreshnessLifetime) {
                        newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (cacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                        newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy(null, newBuilder.build());
                }
            }
            if (this.etag != null) {
                str2 = "If-None-Match";
                str = this.etag;
            } else if (this.lastModified != null) {
                str2 = "If-Modified-Since";
                str = this.lastModifiedString;
            } else if (this.servedDate == null) {
                return new CacheStrategy(this.request, null);
            } else {
                str2 = "If-Modified-Since";
                str = this.servedDateString;
            }
            Headers.Builder newBuilder2 = this.request.headers.newBuilder();
            Internal.instance.addLenient(newBuilder2, str2, str);
            return new CacheStrategy(this.request.newBuilder().headers(newBuilder2.build()).build(), this.cacheResponse);
        }

        private static boolean hasConditions(Request request2) {
            if (request2.header("If-Modified-Since") == null && request2.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        public Factory(long j, Request request2, Response response) {
            this.nowMillis = j;
            this.request = request2;
            this.cacheResponse = response;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis;
                this.receivedResponseMillis = response.receivedResponseAtMillis;
                Headers headers = response.headers;
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if ("Date".equalsIgnoreCase(name)) {
                        this.servedDate = HttpDate.parse(value);
                        this.servedDateString = value;
                    } else if ("Expires".equalsIgnoreCase(name)) {
                        this.expires = HttpDate.parse(value);
                    } else if ("Last-Modified".equalsIgnoreCase(name)) {
                        this.lastModified = HttpDate.parse(value);
                        this.lastModifiedString = value;
                    } else if ("ETag".equalsIgnoreCase(name)) {
                        this.etag = value;
                    } else if ("Age".equalsIgnoreCase(name)) {
                        this.ageSeconds = HttpHeaders.parseSeconds(value, -1);
                    }
                }
            }
        }
    }

    CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r3.cacheControl().noStore != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4.cacheControl().noStore != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.cacheControl().isPrivate == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCacheable(okhttp3.Response r3, okhttp3.Request r4) {
        /*
            int r0 = r3.code
            r1 = 0
            switch(r0) {
                case 200: goto L_0x0029;
                case 203: goto L_0x0029;
                case 204: goto L_0x0029;
                case 300: goto L_0x0029;
                case 301: goto L_0x0029;
                case 302: goto L_0x0007;
                case 307: goto L_0x0007;
                case 308: goto L_0x0029;
                case 404: goto L_0x0029;
                case 405: goto L_0x0029;
                case 410: goto L_0x0029;
                case 414: goto L_0x0029;
                case 501: goto L_0x0029;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x003c
        L_0x0007:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L_0x0029
            okhttp3.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds
            r2 = -1
            if (r0 != r2) goto L_0x0029
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic
            if (r0 != 0) goto L_0x0029
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate
            if (r0 != 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            okhttp3.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore
            if (r3 != 0) goto L_0x003b
            okhttp3.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore
            if (r3 != 0) goto L_0x003b
            r3 = 1
            return r3
        L_0x003b:
            return r1
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.isCacheable(okhttp3.Response, okhttp3.Request):boolean");
    }
}
