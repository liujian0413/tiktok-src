package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.l */
public final class C37253l implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableDelaySecReport = a.getDisableDelaySecReport();
            C7573i.m23582a((Object) disableDelaySecReport, "SettingsReader.get().disableDelaySecReport");
            disableDelaySecReport.booleanValue();
        } catch (Exception unused) {
        }
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).setParams();
    }
}
