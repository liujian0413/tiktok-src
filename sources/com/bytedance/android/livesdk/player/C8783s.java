package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.base.model.NameValuePair;
import com.p280ss.videoarch.liveplayer.C46300c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.player.s */
public final class C8783s implements C46300c {
    /* renamed from: a */
    private static String m26312a(List<NameValuePair> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            sb.append(nameValuePair.getName());
            sb.append(": ");
            sb.append(nameValuePair.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX INFO: used method not loaded: com.ss.videoarch.liveplayer.c.a.a.a(java.lang.Exception):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r4 = r0;
        r0 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        return com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a().mo115051a(r6).mo115054a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r0 = null;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        return com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a().mo115051a((java.lang.Exception) r6).mo115054a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[ExcHandler: Exception (r6v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[ExcHandler: IOException (r6v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0018] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.videoarch.liveplayer.C46300c.C46302a mo21841a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.live.network.api.INetworkService> r0 = com.bytedance.android.live.network.api.INetworkService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.livesdkapi.host.IHostNetwork r0 = (com.bytedance.android.livesdkapi.host.IHostNetwork) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.bytedance.android.live.base.model.NameValuePair r2 = new com.bytedance.android.live.base.model.NameValuePair
            java.lang.String r3 = "host"
            r2.<init>(r3, r7)
            r1.add(r2)
            r7 = 0
            com.bytedance.android.livesdkapi.i.g r6 = r0.get(r6, r1)     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            java.lang.Object r6 = r6.mo23512a()     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            com.bytedance.android.livesdkapi.i.e r6 = (com.bytedance.android.livesdkapi.p457i.C9477e) r6     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            if (r6 == 0) goto L_0x0045
            byte[] r0 = r6.f25947e     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            byte[] r1 = r6.f25947e     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x007c, JSONException -> 0x0065, Exception -> 0x0057 }
            java.util.List<com.bytedance.android.live.base.model.NameValuePair> r6 = r6.f25945c     // Catch:{ IOException -> 0x007c, JSONException -> 0x0040, Exception -> 0x0057 }
            java.lang.String r6 = m26312a(r6)     // Catch:{ IOException -> 0x007c, JSONException -> 0x0040, Exception -> 0x0057 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IOException -> 0x007c, JSONException -> 0x003b, Exception -> 0x0057 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x007c, JSONException -> 0x003b, Exception -> 0x0057 }
            goto L_0x0046
        L_0x003b:
            r7 = move-exception
            r4 = r0
            r0 = r6
            r6 = r7
            goto L_0x0043
        L_0x0040:
            r6 = move-exception
            r4 = r0
            r0 = r7
        L_0x0043:
            r7 = r4
            goto L_0x0067
        L_0x0045:
            r0 = r7
        L_0x0046:
            com.ss.videoarch.liveplayer.c$a$a r6 = com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a()
            com.ss.videoarch.liveplayer.c$a$a r6 = r6.mo115053a(r7)
            com.ss.videoarch.liveplayer.c$a$a r6 = r6.mo115052a(r0)
            com.ss.videoarch.liveplayer.c$a r6 = r6.mo115054a()
            return r6
        L_0x0057:
            r6 = move-exception
            com.ss.videoarch.liveplayer.c$a$a r7 = com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a()
            com.ss.videoarch.liveplayer.c$a$a r6 = r7.mo115051a(r6)
            com.ss.videoarch.liveplayer.c$a r6 = r6.mo115054a()
            return r6
        L_0x0065:
            r6 = move-exception
            r0 = r7
        L_0x0067:
            com.ss.videoarch.liveplayer.c$a$a r1 = com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a()
            com.ss.videoarch.liveplayer.c$a$a r7 = r1.mo115052a(r7)
            com.ss.videoarch.liveplayer.c$a$a r7 = r7.mo115055b(r0)
            com.ss.videoarch.liveplayer.c$a$a r6 = r7.mo115051a(r6)
            com.ss.videoarch.liveplayer.c$a r6 = r6.mo115054a()
            return r6
        L_0x007c:
            r6 = move-exception
            com.ss.videoarch.liveplayer.c$a$a r7 = com.p280ss.videoarch.liveplayer.C46300c.C46302a.m145343a()
            com.ss.videoarch.liveplayer.c$a$a r6 = r7.mo115051a(r6)
            com.ss.videoarch.liveplayer.c$a r6 = r6.mo115054a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.player.C8783s.mo21841a(java.lang.String, java.lang.String):com.ss.videoarch.liveplayer.c$a");
    }
}
