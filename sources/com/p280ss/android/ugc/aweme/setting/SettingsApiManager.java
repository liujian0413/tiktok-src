package com.p280ss.android.ugc.aweme.setting;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.concurrent.Callable;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.SettingsApiManager */
public final class SettingsApiManager {

    /* renamed from: com.ss.android.ugc.aweme.setting.SettingsApiManager$UserSettingsApi */
    interface UserSettingsApi {
        @C7730f(mo20420a = "/aweme/v1/user/set/settings/")
        C18253l<BaseResponse> setItem(@C7744t(mo20436a = "field") String str, @C7744t(mo20436a = "value") int i);
    }

    /* renamed from: a */
    public static void m120238a(String str, int i) {
        C1592h.m7853a((Callable<TResult>) new C37576av<TResult>(str, 0));
    }
}
