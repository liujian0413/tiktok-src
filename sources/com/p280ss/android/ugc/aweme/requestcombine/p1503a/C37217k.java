package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37248h;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.k */
public final class C37217k extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97345a;

    /* renamed from: a */
    public final String mo93737a() {
        return "/aweme/v2/platform/share/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97345a;
    }

    /* renamed from: a */
    private void m119642a(BaseCombineMode baseCombineMode) {
        this.f97345a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37248h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r5 = r5.getData()
            if (r5 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel r5 = r5.getShareSettingCombineModel()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r0 = 0
            if (r5 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.setting.model.ShareSettings r1 = r5.getShareSetting()
            if (r1 == 0) goto L_0x003e
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            r1 = r5
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r4.m119642a(r1)
            int r1 = r5.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0035
            com.ss.android.ugc.aweme.setting.ay r1 = com.p280ss.android.ugc.aweme.setting.C37579ay.m120349a()
            com.ss.android.ugc.aweme.setting.model.ShareSettings r3 = r5.getShareSetting()
            r1.mo94875a(r3)
        L_0x0035:
            int r5 = r5.getHttpCode()
            if (r5 != r2) goto L_0x003d
            r5 = 1
            return r5
        L_0x003d:
            return r0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37217k.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
