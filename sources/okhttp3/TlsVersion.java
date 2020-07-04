package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    public final String javaName() {
        return this.javaName;
    }

    static List<TlsVersion> forJavaNames(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(forJavaName(forJavaName));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.TlsVersion forJavaName(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            if (r0 == r1) goto L_0x003a
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L_0x0030
            switch(r0) {
                case -503070503: goto L_0x0026;
                case -503070502: goto L_0x001c;
                case -503070501: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0044
        L_0x0012:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x001c:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0026:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 3
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 4
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0065;
                case 2: goto L_0x0062;
                case 3: goto L_0x005f;
                case 4: goto L_0x005c;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected TLS version: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x005c:
            okhttp3.TlsVersion r3 = SSL_3_0
            return r3
        L_0x005f:
            okhttp3.TlsVersion r3 = TLS_1_0
            return r3
        L_0x0062:
            okhttp3.TlsVersion r3 = TLS_1_1
            return r3
        L_0x0065:
            okhttp3.TlsVersion r3 = TLS_1_2
            return r3
        L_0x0068:
            okhttp3.TlsVersion r3 = TLS_1_3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.TlsVersion.forJavaName(java.lang.String):okhttp3.TlsVersion");
    }

    private TlsVersion(String str) {
        this.javaName = str;
    }
}
