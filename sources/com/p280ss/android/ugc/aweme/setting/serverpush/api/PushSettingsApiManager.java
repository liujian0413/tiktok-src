package com.p280ss.android.ugc.aweme.setting.serverpush.api;

import android.content.Context;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager */
public final class PushSettingsApiManager {

    /* renamed from: a */
    private static PushUserSettingsApi f98240a = ((PushUserSettingsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(PushUserSettingsApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager$PushUserSettingsApi */
    interface PushUserSettingsApi {
        @C7730f(mo20420a = "/maya/user/registered/")
        C18253l<Object> getRegisterDuoshanStatus();

        @C7730f(mo20420a = "/aweme/v1/user/settings/")
        C18253l<C37723b> getUserSettings(@C7744t(mo20436a = "last_settings_version") String str);

        @C7730f(mo20420a = "/aweme/v1/user/set/settings/")
        C18253l<BaseResponse> setItem(@C7744t(mo20436a = "field") String str, @C7744t(mo20436a = "value") int i);

        @C7730f(mo20420a = "/aweme/v1/user/set/settings/")
        C18253l<BaseResponse> setPrivateItem(@C7744t(mo20436a = "field") String str, @C7744t(mo20436a = "private_setting") int i);

        @C7730f(mo20420a = "/aweme/v1/user/set/settings/")
        C18253l<BaseResponse> setPrivateItem(@C7744t(mo20436a = "field") String str, @C7744t(mo20436a = "private_setting") int i, @C7744t(mo20436a = "aweme_id") String str2);

        @C7739o(mo20429a = "/aweme/v1/user/set/settings/")
        C18253l<BaseResponse> setResidenceItem(@C7744t(mo20436a = "field") String str, @C7744t(mo20436a = "user_residence") String str2);
    }

    /* renamed from: a */
    public static C37723b m120591a() throws Exception {
        try {
            return (C37723b) f98240a.getUserSettings(C6887b.m21436b().mo16905b((Context) AwemeApplication.m21341a(), "last_user_setting_version", "")).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120588a(String str, int i) throws Exception {
        try {
            return (BaseResponse) f98240a.setItem(str, i).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: b */
    public static BaseResponse m120592b(String str, int i) throws Exception {
        try {
            return (BaseResponse) f98240a.setPrivateItem(str, i).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120590a(String str, String str2) throws Exception {
        try {
            return (BaseResponse) f98240a.setResidenceItem(str, str2).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m120589a(String str, int i, String str2) throws Exception {
        try {
            return (BaseResponse) f98240a.setPrivateItem(str, i, str2).get();
        } catch (ExecutionException e) {
            throw C22838j.m75277a(e);
        }
    }
}
