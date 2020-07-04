package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37245e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.g */
public final class C37213g extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97340a;

    /* renamed from: a */
    public final String mo93737a() {
        return "/aweme/v1/commerce/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97340a;
    }

    /* renamed from: a */
    private void m119620a(BaseCombineMode baseCombineMode) {
        this.f97340a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37245e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r4 = r4.getData()
            if (r4 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r4 = r4.getCommerceSettingCombineModel()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            r0 = 0
            if (r4 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.commercialize.model.i r1 = r4.getCombineModel()
            if (r1 == 0) goto L_0x003a
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            r1 = r4
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r3.m119620a(r1)
            int r1 = r4.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.model.i r1 = r4.getCombineModel()
            com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.m80552a(r1)
        L_0x0031:
            int r4 = r4.getHttpCode()
            if (r4 != r2) goto L_0x0039
            r4 = 1
            return r4
        L_0x0039:
            return r0
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37213g.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
