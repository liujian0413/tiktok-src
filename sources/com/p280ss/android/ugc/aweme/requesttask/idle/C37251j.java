package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22989h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.j */
public final class C37251j implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableDelayFetchUserRequest = a.getDisableDelayFetchUserRequest();
            C7573i.m23582a((Object) disableDelayFetchUserRequest, "SettingsReader.get().disableDelayFetchUserRequest");
            if (disableDelayFetchUserRequest.booleanValue()) {
                return RequestType.NORMAL;
            }
        } catch (Exception unused) {
        }
        if (C6399b.m19944t()) {
            return RequestType.NORMAL;
        }
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            C21115b.m71197a().queryUser();
            C21115b.m71197a().refreshPassportUserInfo();
            C22989h.m75626a();
        }
    }
}
