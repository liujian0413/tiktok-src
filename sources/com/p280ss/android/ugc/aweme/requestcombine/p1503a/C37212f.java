package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask.C32380a;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37233c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.f */
public final class C37212f extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97339a;

    /* renamed from: a */
    public final String mo93737a() {
        return "/aweme/v1/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97339a;
    }

    /* renamed from: a */
    private void m119614a(BaseCombineMode baseCombineMode) {
        this.f97339a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37233c());
    }

    /* renamed from: a */
    public final Map<String, String> mo93738a(Context context) {
        C7573i.m23587b(context, "context");
        HashMap hashMap = new HashMap();
        if (!C6399b.m19944t()) {
            hashMap.put("oid", String.valueOf(C23484l.m77111a(context)));
            hashMap.put("cpu_model", C32380a.m104951a());
        }
        return hashMap;
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
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r6 = r6.getAwemeSetting()
            goto L_0x000f
        L_0x000e:
            r6 = r0
        L_0x000f:
            r1 = 1
            if (r6 == 0) goto L_0x0039
            com.google.gson.k r2 = r6.getAwemeSetting()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r2.mo16133j()
            if (r2 != r1) goto L_0x0039
            com.google.gson.k r2 = r6.getAwemeSetting()
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
            r5.m119614a(r0)
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == 0) goto L_0x0064
            int r3 = r6.getHttpCode()
            if (r3 != r0) goto L_0x0064
            com.ss.android.ugc.aweme.setting.ao r3 = com.p280ss.android.ugc.aweme.setting.C37562ao.m120324a()
            com.google.gson.k r4 = r6.getAwemeSetting()
            r3.mo94855b(r4)
        L_0x0064:
            if (r6 == 0) goto L_0x006d
            int r6 = r6.getHttpCode()
            if (r6 != r0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37212f.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
