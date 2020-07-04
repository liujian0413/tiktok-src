package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.dataplatform.C6324d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.a */
public final class C37239a implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableDelayAbSdkRequest = a.getDisableDelayAbSdkRequest();
            C7573i.m23582a((Object) disableDelayAbSdkRequest, "SettingsReader.get().disableDelayAbSdkRequest");
            if (disableDelayAbSdkRequest.booleanValue()) {
                if (C6324d.m19636a()) {
                    return RequestType.IDLE;
                }
                return RequestType.NORMAL;
            }
        } catch (Exception unused) {
        }
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        C6324d.m19638b();
    }
}
