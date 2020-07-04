package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.j */
public final class C37216j extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97344a;

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97344a;
    }

    /* renamed from: a */
    public final String mo93737a() {
        if (!C6399b.m19944t()) {
            return "/aweme/v1/poi/samecity/active/";
        }
        return null;
    }

    /* renamed from: a */
    private void m119637a(BaseCombineMode baseCombineMode) {
        this.f97344a = baseCombineMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r3 = r3.getData()
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r3 = r3.getSameCityModel()
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            r0 = 0
            if (r3 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.poi.bean.d r1 = r3.getSameCityModel()
            if (r1 == 0) goto L_0x002d
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x002d
        L_0x001c:
            r1 = r3
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r2.m119637a(r1)
            int r3 = r3.getHttpCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 != r1) goto L_0x002c
            r3 = 1
            return r3
        L_0x002c:
            return r0
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37216j.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
