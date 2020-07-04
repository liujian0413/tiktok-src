package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.C21656ap;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a */
final class C32286a extends C32296d {

    /* renamed from: a */
    private static final boolean f84352a = C7163a.m22363a();

    C32286a(C32296d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    private static int m104825a(C32303g gVar) {
        if (gVar == null || gVar.f84380a == null) {
            return 0;
        }
        return gVar.f84380a.f84382a;
    }

    /* renamed from: a */
    private static String m104826a(C12534t tVar) {
        String[] split;
        String str;
        String str2 = "";
        List b = tVar.f33301a.mo30452b("d-ticket");
        if (b != null && b.size() > 0) {
            str2 = ((C12461b) b.get(0)).f33096b;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        List<C12461b> b2 = tVar.f33301a.mo30452b("set-cookie");
        if (b2 == null) {
            return str2;
        }
        for (C12461b bVar : b2) {
            String str3 = bVar.f33096b;
            if (str3 != null && str3.contains("d_ticket")) {
                for (String str4 : str3.split(";")) {
                    if (str4.contains("d_ticket")) {
                        String[] split2 = str4.split("=");
                        if (split2.length >= 2) {
                            str = split2[1];
                        } else {
                            str = "";
                        }
                        return str;
                    }
                }
                return str2;
            }
        }
        return str2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t tVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.f33098b) || tVar == null) {
            return C32295c.f84366a;
        }
        C21656ap interceptorService = C6861a.m21332a().interceptorService();
        int a = m104825a(gVar);
        Map interceptAndGetNewParams = interceptorService.interceptAndGetNewParams(a, cVar.f33098b, tVar.f33302b.toString());
        if (cVar.f33098b.contains("/passport/") && a == 0 && tVar.f33301a != null) {
            String a2 = m104826a(tVar);
            if (!TextUtils.isEmpty(a2)) {
                C6861a.m21333b().saveDTicket(a2);
            }
        }
        if (interceptAndGetNewParams == null || interceptAndGetNewParams.isEmpty()) {
            return C32295c.f84366a;
        }
        return new C32297a(true, true, null);
    }
}
