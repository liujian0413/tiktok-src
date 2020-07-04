package com.p280ss.android.ugc.trill.language.api;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.trill.language.model.ConfigListResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.trill.language.api.LanguageApi */
public interface LanguageApi {
    @C7730f(mo20420a = "/aweme/v1/config/list/")
    C7492s<ConfigListResponse> getUnloginContentLanguage(@C7744t(mo20436a = "type") String str, @C7744t(mo20436a = "content_language") String str2);

    @C7730f(mo20420a = "/aweme/v1/config/list/")
    C7492s<ConfigListResponse> getUserConfig(@C7744t(mo20436a = "type") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/set/settings/")
    C7492s<BaseResponse> setContentLanguage(@C7727c(mo20417a = "field") String str, @C7727c(mo20417a = "content_language") String str2, @C7727c(mo20417a = "action_type") int i);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/set/settings/")
    C7492s<BaseResponse> setContentLanguageDialogShown(@C7727c(mo20417a = "field") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/set/settings/")
    C7492s<BaseResponse> setUnloginContentPreference(@C7727c(mo20417a = "field") String str, @C7727c(mo20417a = "settings_not_login") String str2);
}
