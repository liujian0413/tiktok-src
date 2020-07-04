package com.p280ss.android.ugc.aweme.account.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.api.p936a.C21107a;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21111a;
import com.p280ss.android.ugc.aweme.account.base.C21117a;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22174b;
import com.p280ss.android.ugc.aweme.account.util.C22329h;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.concurrent.Executor;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule */
public final class AccountApiInModule {

    /* renamed from: a */
    private static final boolean f56677a = C7163a.m22363a();

    /* renamed from: b */
    private static Api f56678b = ((Api) ((IRetrofitService) C21671bd.m72521a(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(Api.class));

    /* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule$Api */
    public interface Api {
        @C7730f(mo20420a = "/passport/mobile/can_check_unusable/")
        C18253l<Object> canCheckPhoneNumberUnusable(@C7744t(mo20436a = "mix_mode") String str, @C7744t(mo20436a = "mobile") String str2);

        @C7729e
        @C7739o(mo20429a = "/passport/mobile/change/v1/")
        C18253l<String> changeMobile(@C7727c(mo20417a = "mix_mode") String str, @C7727c(mo20417a = "mobile") String str2, @C7727c(mo20417a = "code") String str3, @C7727c(mo20417a = "captcha") String str4, @C7727c(mo20417a = "ticket") String str5, @C7727c(mo20417a = "unusable_mobile_ticket") String str6);

        @C7730f(mo20420a = "/passport/mobile/check_unusable/")
        C18253l<Object> checkPhoneNumberUnusable(@C7744t(mo20436a = "mix_mode") String str, @C7744t(mo20436a = "mobile") String str2);

        @C7730f(mo20420a = "/passport/mobile/can_send_voice_code/")
        C1592h<C22174b> checkVoiceCodeAvailability(@C7744t(mo20436a = "mobile") String str, @C7744t(mo20436a = "mix_mode") String str2);

        @C7730f(mo20420a = "https://rc.snssdk.com/verify/get_info")
        C18253l<C21107a> getVerifyInfo(@C7744t(mo20436a = "uid") String str, @C7744t(mo20436a = "verify_type") String str2, @C7744t(mo20436a = "shark_ticket") String str3);

        @C7729e
        @C7739o(mo20429a = "/passport/cancel/login/")
        C1592h<String> loginDuringAccountRemoval(@C7727c(mo20417a = "token") String str);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/user/proaccount/setting/")
        C18253l<BaseResponse> switchProAccount(@C7727c(mo20417a = "action_type") int i, @C7727c(mo20417a = "category_name") String str);

        @C7730f(mo20420a = "/passport/upsms/login/")
        C18253l<String> upSmsLogin(@C7744t(mo20436a = "verify_ticket") String str);

        @C7730f(mo20420a = "/passport/upsms/query_verify/")
        C18253l<Object> upSmsVerify(@C7744t(mo20436a = "verify_ticket") String str, @C7744t(mo20436a = "upstream_verify_type") int i);

        @C7729e
        @C7739o(mo20429a = "https://rc.snssdk.com/verify/verify_info")
        C18253l<String> verifyVerifyInfo(@C7727c(mo20417a = "uid") String str, @C7727c(mo20417a = "verify_type") String str2, @C7727c(mo20417a = "verify_data") String str3, @C7727c(mo20417a = "shark_ticket") String str4);
    }

    /* renamed from: a */
    public static C1592h<C22174b> m71175a(String str) {
        try {
            return f56678b.checkVoiceCodeAvailability(C22329h.m73928a(str), "1");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C1592h<String> m71179b(String str) {
        try {
            return f56678b.loginDuringAccountRemoval(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m71176a(int i, String str, C18245g<BaseResponse> gVar) {
        C18246h.m60214a(f56678b.switchProAccount(i, str), gVar, (Executor) C21117a.f56693a);
    }

    /* renamed from: a */
    public static void m71177a(String str, String str2, C18245g<C21107a> gVar) {
        C18246h.m60214a(f56678b.getVerifyInfo(str, "id_number", str2), gVar, (Executor) C21117a.f56693a);
    }

    /* renamed from: a */
    public static void m71178a(String str, String str2, String str3, C21111a aVar) {
        C18246h.m60214a(f56678b.verifyVerifyInfo(str, "id_number", str2, str3), (C18245g<? super V>) aVar, (Executor) C21117a.f56693a);
    }
}
