package com.squareup.okhttp;

public enum TlsVersion {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    public final String javaName() {
        return this.javaName;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.okhttp.TlsVersion forJavaName(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -503070503: goto L_0x0026;
                case -503070502: goto L_0x001c;
                case 79201641: goto L_0x0012;
                case 79923350: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0030
        L_0x0008:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 2
            goto L_0x0031
        L_0x0012:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 3
            goto L_0x0031
        L_0x001c:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            goto L_0x0031
        L_0x0026:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            switch(r0) {
                case 0: goto L_0x0051;
                case 1: goto L_0x004e;
                case 2: goto L_0x004b;
                case 3: goto L_0x0048;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected TLS version: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0048:
            com.squareup.okhttp.TlsVersion r3 = SSL_3_0
            return r3
        L_0x004b:
            com.squareup.okhttp.TlsVersion r3 = TLS_1_0
            return r3
        L_0x004e:
            com.squareup.okhttp.TlsVersion r3 = TLS_1_1
            return r3
        L_0x0051:
            com.squareup.okhttp.TlsVersion r3 = TLS_1_2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.TlsVersion.forJavaName(java.lang.String):com.squareup.okhttp.TlsVersion");
    }

    private TlsVersion(String str) {
        this.javaName = str;
    }
}
