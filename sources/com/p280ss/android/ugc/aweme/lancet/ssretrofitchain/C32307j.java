package com.p280ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lancet.ssretrofitchain.C32296d.C32297a;
import com.p280ss.android.ugc.aweme.sec.C37412f;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.j */
public final class C32307j extends C32296d {

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.j$a */
    public static final class C32308a extends C37412f<Boolean> {

        /* renamed from: g */
        private C12462c f84385g;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public Boolean mo83513b() throws Exception {
            if (this.f84385g.f33098b.contains("/passport/user/check_email_registered") || this.f84385g.f33098b.contains("/passport/email/register/v2/")) {
                C6907h.m21524a("slide_verification_response", (Map) new C22984d().mo59973a("enter_method", C6861a.m21333b().getLoginMobEnterMethod()).mo59973a("status", "1").f60753a);
            }
            return Boolean.valueOf(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public Boolean mo83512a() {
            if (this.f84385g.f33098b.contains("/passport/user/check_email_registered") || this.f84385g.f33098b.contains("/passport/email/register/v2/")) {
                C6907h.m21524a("slide_verification_response", (Map) new C22984d().mo59973a("enter_method", C6861a.m21333b().getLoginMobEnterMethod()).mo59973a("status", "2").f60753a);
            }
            return Boolean.valueOf(false);
        }

        public C32308a(C12462c cVar) {
            this.f84385g = cVar;
        }
    }

    public C32307j(C32296d dVar) {
        super(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C32297a mo83494a(C32303g gVar, C12462c cVar, C12534t tVar) {
        C32308a aVar = new C32308a(cVar);
        try {
            if (aVar.mo94177a(gVar.f84380a.f84382a) && ((Boolean) aVar.mo94175c()).booleanValue()) {
                return new C32297a(true, true);
            }
        } catch (Throwable unused) {
        }
        return C32295c.f84366a;
    }
}
