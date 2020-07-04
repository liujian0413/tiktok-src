package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.setting.C37579ay;
import com.p280ss.android.ugc.aweme.setting.C37583az;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h */
public final class C37248h implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        if (!C37583az.m120357b()) {
            return RequestType.NORMAL;
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableDelayFetchShareSettingRequest = a.getDisableDelayFetchShareSettingRequest();
            C7573i.m23582a((Object) disableDelayFetchShareSettingRequest, "SettingsReader.get().dis…yFetchShareSettingRequest");
            if (disableDelayFetchShareSettingRequest.booleanValue()) {
                return RequestType.NORMAL;
            }
        } catch (Exception unused) {
        }
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        C37579ay.m120349a().mo94876b();
    }
}
