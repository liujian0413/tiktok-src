package com.google.api.client.googleapis.json;

import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C17230a;
import com.google.api.client.json.C17291c;
import com.google.api.client.util.C17384w;
import java.io.IOException;

public class GoogleJsonResponseException extends HttpResponseException {
    private static final long serialVersionUID = 409811126989994864L;
    private final transient C17223a details;

    public final C17223a getDetails() {
        return this.details;
    }

    public GoogleJsonResponseException(C17230a aVar, C17223a aVar2) {
        super(aVar);
        this.details = aVar2;
    }

    public static C17269r execute(C17291c cVar, C17266o oVar) throws GoogleJsonResponseException, IOException {
        C17384w.m57847a(cVar);
        boolean z = oVar.f48116u;
        if (z) {
            oVar.mo44651a(false);
        }
        C17269r a = oVar.mo44652a();
        oVar.mo44651a(z);
        if (!z || a.mo44658b()) {
            return a;
        }
        throw from(cVar, a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[SYNTHETIC, Splitter:B:26:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ IOException -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c A[Catch:{ IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0088 A[SYNTHETIC, Splitter:B:49:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c A[Catch:{ IOException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.googleapis.json.GoogleJsonResponseException from(com.google.api.client.json.C17291c r5, com.google.api.client.http.C17269r r6) {
        /*
            com.google.api.client.http.HttpResponseException$a r0 = new com.google.api.client.http.HttpResponseException$a
            int r1 = r6.f48126e
            java.lang.String r2 = r6.f48127f
            com.google.api.client.http.l r3 = r6.mo44656a()
            r0.<init>(r1, r2, r3)
            com.google.api.client.util.C17384w.m57847a(r5)
            r1 = 0
            boolean r2 = r6.mo44658b()     // Catch:{ IOException -> 0x009a }
            if (r2 != 0) goto L_0x0094
            java.lang.String r2 = "application/json; charset=UTF-8"
            java.lang.String r3 = r6.f48123b     // Catch:{ IOException -> 0x009a }
            boolean r2 = com.google.api.client.http.C17265n.m57422b(r2, r3)     // Catch:{ IOException -> 0x009a }
            if (r2 == 0) goto L_0x0094
            java.io.InputStream r2 = r6.mo44659c()     // Catch:{ IOException -> 0x009a }
            if (r2 == 0) goto L_0x0094
            java.io.InputStream r2 = r6.mo44659c()     // Catch:{ IOException -> 0x0084, all -> 0x0071 }
            com.google.api.client.json.f r5 = r5.mo44672a(r2)     // Catch:{ IOException -> 0x0084, all -> 0x0071 }
            com.google.api.client.json.JsonToken r2 = r5.mo44694d()     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            if (r2 != 0) goto L_0x0039
            com.google.api.client.json.JsonToken r2 = r5.mo44693c()     // Catch:{ IOException -> 0x006f, all -> 0x006c }
        L_0x0039:
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = "error"
            r5.mo44730a(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            com.google.api.client.json.JsonToken r2 = r5.mo44694d()     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            com.google.api.client.json.JsonToken r3 = com.google.api.client.json.JsonToken.END_OBJECT     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            if (r2 == r3) goto L_0x005d
            java.lang.Class<com.google.api.client.googleapis.json.a> r2 = com.google.api.client.googleapis.json.C17223a.class
            java.lang.Object r2 = r5.mo44727a(r2)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            com.google.api.client.googleapis.json.a r2 = (com.google.api.client.googleapis.json.C17223a) r2     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            java.lang.String r3 = r2.mo44706d()     // Catch:{ IOException -> 0x005b, all -> 0x0056 }
            r1 = r2
            goto L_0x005e
        L_0x0056:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0074
        L_0x005b:
            goto L_0x0086
        L_0x005d:
            r3 = r1
        L_0x005e:
            if (r5 != 0) goto L_0x0066
            r6.mo44660d()     // Catch:{ IOException -> 0x0064 }
            goto L_0x009b
        L_0x0064:
            goto L_0x009b
        L_0x0066:
            if (r1 != 0) goto L_0x009b
            r5.mo44692b()     // Catch:{ IOException -> 0x0064 }
            goto L_0x009b
        L_0x006c:
            r2 = move-exception
            r3 = r1
            goto L_0x0074
        L_0x006f:
            r2 = r1
            goto L_0x0086
        L_0x0071:
            r2 = move-exception
            r5 = r1
            r3 = r5
        L_0x0074:
            if (r5 == 0) goto L_0x007c
            if (r3 != 0) goto L_0x007f
            r5.mo44692b()     // Catch:{ IOException -> 0x0080 }
            goto L_0x007f
        L_0x007c:
            r6.mo44660d()     // Catch:{ IOException -> 0x0080 }
        L_0x007f:
            throw r2     // Catch:{ IOException -> 0x0080 }
        L_0x0080:
            r4 = r3
            r3 = r1
            r1 = r4
            goto L_0x009b
        L_0x0084:
            r5 = r1
            r2 = r5
        L_0x0086:
            if (r5 != 0) goto L_0x008c
            r6.mo44660d()     // Catch:{ IOException -> 0x0091 }
            goto L_0x0091
        L_0x008c:
            if (r2 != 0) goto L_0x0091
            r5.mo44692b()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r3 = r1
            r1 = r2
            goto L_0x009b
        L_0x0094:
            java.lang.String r5 = r6.mo44662f()     // Catch:{ IOException -> 0x009a }
            r3 = r5
            goto L_0x009b
        L_0x009a:
            r3 = r1
        L_0x009b:
            java.lang.StringBuilder r5 = com.google.api.client.http.HttpResponseException.computeMessageBuffer(r6)
            boolean r6 = com.google.api.client.util.C17348ac.m57772a(r3)
            if (r6 != 0) goto L_0x00b0
            java.lang.String r6 = com.google.api.client.util.C17347ab.f48262a
            r5.append(r6)
            r5.append(r3)
            r0.mo44563b(r3)
        L_0x00b0:
            java.lang.String r5 = r5.toString()
            r0.mo44562a(r5)
            com.google.api.client.googleapis.json.GoogleJsonResponseException r5 = new com.google.api.client.googleapis.json.GoogleJsonResponseException
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.json.GoogleJsonResponseException.from(com.google.api.client.json.c, com.google.api.client.http.r):com.google.api.client.googleapis.json.GoogleJsonResponseException");
    }
}
