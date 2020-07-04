package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.m */
public final class C37254m implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableDelayTokenBeatRequest = a.getDisableDelayTokenBeatRequest();
            C7573i.m23582a((Object) disableDelayTokenBeatRequest, "SettingsReader.get().disableDelayTokenBeatRequest");
            if (disableDelayTokenBeatRequest.booleanValue()) {
                return RequestType.NORMAL;
            }
        } catch (Exception unused) {
        }
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        try {
            C18897a.m61681a();
        } catch (Exception unused) {
        }
    }
}
