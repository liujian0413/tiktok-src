package com.squareup.okhttp;

import java.util.concurrent.TimeUnit;

public final class CacheControl {
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    String headerValue;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    public static final class Builder {
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final CacheControl build() {
            return new CacheControl(this);
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.maxAgeSeconds = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("maxAge < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.maxStaleSeconds = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.minFreshSeconds = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("minFresh < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        String headerValue2 = headerValue();
        this.headerValue = headerValue2;
        return headerValue2;
    }

    private String headerValue() {
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    private CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.okhttp.CacheControl parse(com.squareup.okhttp.Headers r22) {
        /*
            r0 = r22
            int r1 = r22.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = -1
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
            r19 = 0
            r20 = 0
        L_0x0019:
            if (r6 >= r1) goto L_0x0139
            java.lang.String r9 = r0.name(r6)
            java.lang.String r2 = r0.value(r6)
            java.lang.String r4 = "Cache-Control"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
        L_0x002d:
            r7 = 0
            goto L_0x003a
        L_0x002f:
            r8 = r2
            goto L_0x003a
        L_0x0031:
            java.lang.String r4 = "Pragma"
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0132
            goto L_0x002d
        L_0x003a:
            r4 = 0
        L_0x003b:
            int r9 = r2.length()
            if (r4 >= r9) goto L_0x0132
            java.lang.String r9 = "=,;"
            int r9 = com.squareup.okhttp.internal.http.HeaderParser.skipUntil(r2, r4, r9)
            java.lang.String r4 = r2.substring(r4, r9)
            java.lang.String r4 = r4.trim()
            int r3 = r2.length()
            if (r9 == r3) goto L_0x009c
            char r3 = r2.charAt(r9)
            r5 = 44
            if (r3 == r5) goto L_0x009c
            char r3 = r2.charAt(r9)
            r5 = 59
            if (r3 != r5) goto L_0x0066
            goto L_0x009c
        L_0x0066:
            int r9 = r9 + 1
            int r3 = com.squareup.okhttp.internal.http.HeaderParser.skipWhitespace(r2, r9)
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x008b
            char r5 = r2.charAt(r3)
            r9 = 34
            if (r5 != r9) goto L_0x008b
            int r3 = r3 + 1
            java.lang.String r5 = "\""
            int r5 = com.squareup.okhttp.internal.http.HeaderParser.skipUntil(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            r21 = 1
            int r5 = r5 + 1
            goto L_0x00a2
        L_0x008b:
            r21 = 1
            java.lang.String r5 = ",;"
            int r5 = com.squareup.okhttp.internal.http.HeaderParser.skipUntil(r2, r3, r5)
            java.lang.String r3 = r2.substring(r3, r5)
            java.lang.String r3 = r3.trim()
            goto L_0x00a2
        L_0x009c:
            r21 = 1
            int r9 = r9 + 1
            r5 = r9
            r3 = 0
        L_0x00a2:
            java.lang.String r9 = "no-cache"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00ad
            r4 = r5
            r10 = 1
            goto L_0x003b
        L_0x00ad:
            java.lang.String r9 = "no-store"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00b8
            r4 = r5
            r11 = 1
            goto L_0x003b
        L_0x00b8:
            java.lang.String r9 = "max-age"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00c8
            r9 = -1
            int r12 = com.squareup.okhttp.internal.http.HeaderParser.parseSeconds(r3, r9)
        L_0x00c5:
            r4 = r5
            goto L_0x003b
        L_0x00c8:
            java.lang.String r9 = "s-maxage"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00d6
            r9 = -1
            int r13 = com.squareup.okhttp.internal.http.HeaderParser.parseSeconds(r3, r9)
            goto L_0x00c5
        L_0x00d6:
            java.lang.String r9 = "private"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00e2
            r4 = r5
            r14 = 1
            goto L_0x003b
        L_0x00e2:
            java.lang.String r9 = "public"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00ee
            r4 = r5
            r15 = 1
            goto L_0x003b
        L_0x00ee:
            java.lang.String r9 = "must-revalidate"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x00fb
            r4 = r5
            r16 = 1
            goto L_0x003b
        L_0x00fb:
            java.lang.String r9 = "max-stale"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x010b
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r17 = com.squareup.okhttp.internal.http.HeaderParser.parseSeconds(r3, r4)
            goto L_0x00c5
        L_0x010b:
            java.lang.String r9 = "min-fresh"
            boolean r9 = r9.equalsIgnoreCase(r4)
            if (r9 == 0) goto L_0x0119
            r9 = -1
            int r18 = com.squareup.okhttp.internal.http.HeaderParser.parseSeconds(r3, r9)
            goto L_0x00c5
        L_0x0119:
            r9 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0127
            r4 = r5
            r19 = 1
            goto L_0x003b
        L_0x0127:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00c5
            r20 = 1
            goto L_0x00c5
        L_0x0132:
            r9 = -1
            r21 = 1
            int r6 = r6 + 1
            goto L_0x0019
        L_0x0139:
            if (r7 != 0) goto L_0x013e
            r21 = 0
            goto L_0x0140
        L_0x013e:
            r21 = r8
        L_0x0140:
            com.squareup.okhttp.CacheControl r0 = new com.squareup.okhttp.CacheControl
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.CacheControl.parse(com.squareup.okhttp.Headers):com.squareup.okhttp.CacheControl");
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.headerValue = str;
    }
}
