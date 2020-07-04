package com.p280ss.android.ugc.aweme.requestcombine.api;

import com.bytedance.retrofit2.C12534t;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7745u;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.api.SettingCombineApi */
public interface SettingCombineApi {

    /* renamed from: a */
    public static final C37219a f97347a = C37219a.f97348a;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.api.SettingCombineApi$a */
    public static final class C37219a {

        /* renamed from: a */
        static final /* synthetic */ C37219a f97348a = new C37219a();

        private C37219a() {
        }

        /* renamed from: a */
        public static SettingCombineApi m119652a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(SettingCombineApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…ngCombineApi::class.java)");
            return (SettingCombineApi) create;
        }
    }

    @C7730f(mo20420a = "tfe/api/request_combine/v1/")
    C7492s<C12534t<String>> request(@C7745u Map<String, String> map);
}
