package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35667e;
import com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36703b;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.d */
public final class C37209d extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97337a;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a.d$a */
    public static final class C37210a implements C36703b {
        C37210a() {
        }

        /* renamed from: a */
        public final void mo93037a() {
            C42961az.m136380a(new C35667e());
        }
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97337a;
    }

    /* renamed from: a */
    public final String mo93737a() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin() || C6399b.m19944t()) {
            return null;
        }
        return "/aweme/v1/user/yellow_point/";
    }

    /* renamed from: a */
    private void m119603a(BaseCombineMode baseCombineMode) {
        this.f97337a = baseCombineMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r5 = r5.getData()
            if (r5 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel r5 = r5.getYellowPointModel()
            goto L_0x000f
        L_0x000e:
            r5 = r0
        L_0x000f:
            r1 = 0
            if (r5 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r2 = r5.getYellowPoint()
            if (r2 == 0) goto L_0x0041
            int r2 = r2.status_code
            if (r2 == 0) goto L_0x001d
            goto L_0x0041
        L_0x001d:
            r2 = r5
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r2
            r4.m119603a(r2)
            int r2 = r5.getHttpCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x002c
            r1 = 1
        L_0x002c:
            if (r1 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r5 = r5.getYellowPoint()
            if (r5 == 0) goto L_0x0036
            java.util.List<com.ss.android.ugc.aweme.profile.model.NeedPointStruct> r0 = r5.needPoints
        L_0x0036:
            com.ss.android.ugc.aweme.requestcombine.a.d$a r5 = new com.ss.android.ugc.aweme.requestcombine.a.d$a
            r5.<init>()
            com.ss.android.ugc.aweme.profile.util.ad$b r5 = (com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36703b) r5
            com.p280ss.android.ugc.aweme.profile.util.C36701ad.m118358a(r0, r5)
        L_0x0040:
            return r1
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37209d.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
