package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import android.content.Context;
import com.bytedance.android.livesdk.feed.network.C6080a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.live.C32507e;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37247g;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.c */
public final class C37208c extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97336a;

    /* renamed from: a */
    public final String mo93737a() {
        return "/webcast/setting/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97336a;
    }

    /* renamed from: a */
    private void m119597a(BaseCombineMode baseCombineMode) {
        this.f97336a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37247g());
    }

    /* renamed from: a */
    public final Map<String, String> mo93738a(Context context) {
        C7573i.m23587b(context, "context");
        Map<String, String> hashMap = new HashMap<>();
        C32507e.m105298a(context);
        C6080a.m18966a().mo14737a(hashMap);
        return hashMap;
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
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r4 = r4.getLiveSetting()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            r0 = 0
            if (r4 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.live.settings.c r1 = r4.getLiveSetting()
            if (r1 == 0) goto L_0x004e
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x004e
        L_0x001c:
            r1 = r4
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r3.m119597a(r1)
            int r1 = r4.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0031
            com.ss.android.ugc.aweme.live.settings.c r1 = r4.getLiveSetting()
            com.p280ss.android.ugc.aweme.live.C32507e.m105300a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = r3.mo93741b()
            if (r1 == 0) goto L_0x004d
            int r1 = r1.getHttpCode()
            if (r1 != r2) goto L_0x004d
            com.ss.android.ugc.aweme.live.settings.c r1 = r4.getLiveSetting()
            if (r1 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.live.settings.c r4 = r4.getLiveSetting()
            int r4 = r4.status_code
            if (r4 != 0) goto L_0x004d
            r4 = 1
            return r4
        L_0x004d:
            return r0
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37208c.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
