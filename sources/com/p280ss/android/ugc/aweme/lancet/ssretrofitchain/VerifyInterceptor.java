package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor */
public class VerifyInterceptor implements C12469a {

    /* renamed from: a */
    private static final boolean f84351a = C7163a.m22363a();

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C32309k.m104851a(this, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.C12534t mo83493b(com.bytedance.retrofit2.p638c.C12469a.C12470a r7) throws java.lang.Exception {
        /*
            r6 = this;
            com.bytedance.retrofit2.a.c r0 = r7.mo30456a()
            r1 = 0
            com.bytedance.retrofit2.t r2 = r7.mo30457a(r0)     // Catch:{ ApiServerException -> 0x0019 }
            boolean r3 = m104821a(r0, r2)     // Catch:{ ApiServerException -> 0x0017 }
            if (r3 == 0) goto L_0x0010
            return r2
        L_0x0010:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g r3 = com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m104813a(r2)     // Catch:{ ApiServerException -> 0x0017 }
            if (r3 != 0) goto L_0x0021
            return r2
        L_0x0017:
            r1 = move-exception
            goto L_0x001d
        L_0x0019:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x001d:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.g r3 = com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m104815a(r1)
        L_0x0021:
            if (r3 != 0) goto L_0x0027
            if (r1 != 0) goto L_0x0026
            return r2
        L_0x0026:
            throw r1
        L_0x0027:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.c r4 = com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32295c.m104834a()
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.d$a r3 = r4.mo83501b(r3, r0, r2)
            boolean r4 = r3.f84369a
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r0.f33098b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0044
            com.bytedance.retrofit2.a.c r0 = r6.m104820a(r0, r3)
            com.bytedance.retrofit2.t r7 = r7.mo30457a(r0)
            return r7
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return r2
        L_0x0047:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor.mo83493b(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.t");
    }

    /* renamed from: a */
    private C12462c m104820a(C12462c cVar, C32297a aVar) throws Exception {
        if (aVar.f84371c == null) {
            return cVar.mo30443a().mo30447a(cVar.f33098b).mo30449a();
        }
        return m104822b(cVar, aVar);
    }

    /* renamed from: a */
    private static boolean m104821a(C12462c cVar, C12534t tVar) {
        if (cVar.f33102f) {
            return true;
        }
        C12461b a = tVar.f33301a.mo30450a("Content-Type");
        String b = cVar.mo30444b();
        if (a == null || (!TextUtils.isEmpty(b) && (b.contains("/effect/api") || b.contains("/model/api")))) {
            return true;
        }
        String str = a.f33096b;
        if (TextUtils.isEmpty(str) || str.contains("json")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static C12462c m104822b(C12462c cVar, C32297a aVar) {
        Builder buildUpon = Uri.parse(cVar.f33098b).buildUpon();
        for (Entry entry : aVar.f84371c.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return cVar.mo30443a().mo30447a(buildUpon.build().toString()).mo30449a();
    }
}
