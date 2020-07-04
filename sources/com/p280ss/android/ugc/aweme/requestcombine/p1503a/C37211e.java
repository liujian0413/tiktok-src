package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37232b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.e */
public final class C37211e extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97338a;

    /* renamed from: a */
    public final String mo93737a() {
        return "/aweme/v1/abtest/param/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97338a;
    }

    /* renamed from: a */
    private void m119609a(BaseCombineMode baseCombineMode) {
        this.f97338a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37232b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r6 = r6.getData()
            if (r6 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r6 = r6.getAbTestCombineModel()
            goto L_0x000f
        L_0x000e:
            r6 = r0
        L_0x000f:
            r1 = 1
            if (r6 == 0) goto L_0x0039
            com.google.gson.k r2 = r6.getAbTestResponse()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r2.mo16133j()
            if (r2 != r1) goto L_0x0039
            com.google.gson.k r2 = r6.getAbTestResponse()
            if (r2 == 0) goto L_0x003e
            com.google.gson.m r2 = r2.mo16136m()
            java.lang.String r3 = "status_code"
            com.google.gson.k r2 = r2.mo16149b(r3)
            if (r2 == 0) goto L_0x003e
            int r0 = r2.mo16003g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003e
        L_0x0039:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003e:
            r2 = 0
            if (r0 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            return r2
        L_0x0049:
            r0 = r6
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r0 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r0
            r5.m119609a(r0)
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == 0) goto L_0x007f
            int r3 = r6.getHttpCode()
            if (r3 != r0) goto L_0x007f
            java.lang.String r3 = com.p280ss.android.deviceregister.C6789d.m21080d()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0077
            java.lang.String r3 = com.p280ss.android.deviceregister.C6789d.m21080d()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "0"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            com.google.gson.k r4 = r6.getAbTestResponse()
            com.p280ss.android.ugc.aweme.setting.api.AbTestApi.m22477a(r3, r4)
        L_0x007f:
            if (r6 == 0) goto L_0x0088
            int r6 = r6.getHttpCode()
            if (r6 != r0) goto L_0x0088
            return r1
        L_0x0088:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37211e.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
