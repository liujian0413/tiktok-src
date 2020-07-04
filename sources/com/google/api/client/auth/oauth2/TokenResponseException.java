package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C17230a;

public class TokenResponseException extends HttpResponseException {
    private static final long serialVersionUID = 4020689092957439244L;
    private final transient C17200f details;

    public final C17200f getDetails() {
        return this.details;
    }

    TokenResponseException(C17230a aVar, C17200f fVar) {
        super(aVar);
        this.details = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.auth.oauth2.TokenResponseException from(com.google.api.client.json.C17291c r6, com.google.api.client.http.C17269r r7) {
        /*
            com.google.api.client.http.HttpResponseException$a r0 = new com.google.api.client.http.HttpResponseException$a
            int r1 = r7.f48126e
            java.lang.String r2 = r7.f48127f
            com.google.api.client.http.l r3 = r7.mo44656a()
            r0.<init>(r1, r2, r3)
            com.google.api.client.util.C17384w.m57847a(r6)
            java.lang.String r1 = r7.f48123b
            r2 = 0
            boolean r3 = r7.mo44658b()     // Catch:{ IOException -> 0x004a }
            if (r3 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            java.io.InputStream r3 = r7.mo44659c()     // Catch:{ IOException -> 0x004a }
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "application/json; charset=UTF-8"
            boolean r1 = com.google.api.client.http.C17265n.m57422b(r3, r1)     // Catch:{ IOException -> 0x004a }
            if (r1 == 0) goto L_0x0045
            com.google.api.client.json.e r1 = new com.google.api.client.json.e     // Catch:{ IOException -> 0x004a }
            r1.<init>(r6)     // Catch:{ IOException -> 0x004a }
            java.io.InputStream r6 = r7.mo44659c()     // Catch:{ IOException -> 0x004a }
            java.nio.charset.Charset r3 = r7.mo44663g()     // Catch:{ IOException -> 0x004a }
            java.lang.Class<com.google.api.client.auth.oauth2.f> r4 = com.google.api.client.auth.oauth2.C17200f.class
            java.lang.Object r6 = r1.mo44592a(r6, r3, r4)     // Catch:{ IOException -> 0x004a }
            com.google.api.client.auth.oauth2.f r6 = (com.google.api.client.auth.oauth2.C17200f) r6     // Catch:{ IOException -> 0x004a }
            java.lang.String r1 = r6.mo44706d()     // Catch:{ IOException -> 0x004b }
            r2 = r6
            r6 = r1
            goto L_0x004e
        L_0x0045:
            java.lang.String r6 = r7.mo44662f()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = r2
        L_0x004b:
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x004e:
            java.lang.StringBuilder r7 = com.google.api.client.http.HttpResponseException.computeMessageBuffer(r7)
            boolean r1 = com.google.api.client.util.C17348ac.m57772a(r6)
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = com.google.api.client.util.C17347ab.f48262a
            r7.append(r1)
            r7.append(r6)
            r0.mo44563b(r6)
        L_0x0063:
            java.lang.String r6 = r7.toString()
            r0.mo44562a(r6)
            com.google.api.client.auth.oauth2.TokenResponseException r6 = new com.google.api.client.auth.oauth2.TokenResponseException
            r6.<init>(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.auth.oauth2.TokenResponseException.from(com.google.api.client.json.c, com.google.api.client.http.r):com.google.api.client.auth.oauth2.TokenResponseException");
    }
}
