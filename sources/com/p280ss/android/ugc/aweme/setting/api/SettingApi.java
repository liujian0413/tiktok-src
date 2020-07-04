package com.p280ss.android.ugc.aweme.setting.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.SettingApi */
public interface SettingApi {
    @C7730f(mo20420a = "/aweme/v1/settings/")
    C18253l<C6709k> queryRawSetting(@C7744t(mo20436a = "cpu_model") String str, @C7744t(mo20436a = "oid") int i, @C7744t(mo20436a = "last_settings_version") String str2);

    @C7730f(mo20420a = "/aweme/v1/settings/")
    C18253l<IESSettings> querySetting(@C7744t(mo20436a = "cpu_model") String str, @C7744t(mo20436a = "oid") int i, @C7744t(mo20436a = "last_settings_version") String str2);

    @C7730f(mo20420a = "/passport/password/has_set/")
    C1592h<SettingUserHasSetPwd> queryUserHasSetPwd();
}
