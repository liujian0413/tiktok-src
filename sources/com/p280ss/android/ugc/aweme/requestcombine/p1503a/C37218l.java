package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.p1504a.C37229c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.l */
public final class C37218l extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97346a;

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97346a;
    }

    /* renamed from: a */
    public final String mo93737a() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            return "/aweme/v1/user/settings/";
        }
        return null;
    }

    /* renamed from: a */
    private void m119647a(BaseCombineMode baseCombineMode) {
        this.f97346a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37229c(1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r6 = r6.getData()
            if (r6 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r6 = r6.getUserSettingCombineModel()
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            r0 = 0
            if (r6 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.setting.serverpush.model.b r1 = r6.getUserSetting()
            if (r1 == 0) goto L_0x003c
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            r1 = r6
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r5.m119647a(r1)
            int r1 = r6.getHttpCode()
            r2 = 1
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x0034
            com.ss.android.ugc.aweme.requestcombine.e$a r1 = com.p280ss.android.ugc.aweme.requestcombine.C37222e.f97349a
            com.ss.android.ugc.aweme.setting.serverpush.model.b r4 = r6.getUserSetting()
            r1.mo93744a(r2, r4)
        L_0x0034:
            int r6 = r6.getHttpCode()
            if (r6 != r3) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37218l.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
