package com.p280ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.C12737f;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12711f;
import com.bytedance.sdk.account.p645a.p647b.C12722f;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12844e;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12856q;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12857r;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.base.C21117a;
import com.p280ss.android.ugc.aweme.account.login.bean.C21350a;
import com.p280ss.android.ugc.aweme.account.login.bean.EmailExistBean;
import com.p280ss.android.ugc.aweme.account.login.bean.UserSettingBean;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21320aa;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.net.ResetPwsResult;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager */
public final class MusLoginManager {

    /* renamed from: a */
    private MusLoginApi f57140a = ((MusLoginApi) ((IRetrofitService) C21671bd.m72521a(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(MusLoginApi.class));

    /* renamed from: b */
    private C12728d f57141b = C12798d.m37186a(C21671bd.m72532b());

    /* renamed from: c */
    private C12737f f57142c = C12798d.m37188c(C21671bd.m72532b());

    /* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginManager$MusLoginApi */
    public interface MusLoginApi {
        @C7730f(mo20420a = "/aweme/v1/passport/email-registered/")
        C18253l<EmailExistBean> emailExist(@C7744t(mo20436a = "mix_mode") String str, @C7744t(mo20436a = "email") String str2);

        @C7730f(mo20420a = "/aweme/v1/user/settings/")
        C18253l<UserSettingBean> getSettings();

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/passport/reset-password-via-phone/")
        C18253l<ResetPwsResult> resetPassword(@C7727c(mo20417a = "bind_token") String str, @C7727c(mo20417a = "uid") String str2, @C7727c(mo20417a = "new_pwd") String str3);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/user/info/sync/")
        C1592h<C21350a> syncUserInfo(@C7728d Map<String, String> map);

        @C7730f(mo20420a = "/aweme/v1/ftc/user/mode/")
        C1592h<C21350a> uploadUserMode(@C7744t(mo20436a = "user_mode") int i);

        @C7730f(mo20420a = "/aweme/v1/register/check/login/name/")
        C18253l<String> usernameVerify(@C7744t(mo20436a = "login_name") String str);
    }

    /* renamed from: a */
    public final void mo57215a(String str, String str2, String str3, C12857r rVar) {
        this.f57141b.mo31202a(str, str2, str3, rVar);
    }

    /* renamed from: a */
    public final void mo57216a(String str, String str2, String str3, String str4, C12857r rVar) {
        this.f57141b.mo31209a(str, str2, str3, str4, rVar);
    }

    /* renamed from: a */
    public final void mo57214a(String str, String str2, String str3, C12722f fVar) {
        this.f57141b.mo31191a(str, str2, fVar);
    }

    /* renamed from: a */
    public final void mo57217a(String str, String str2, String str3, String str4, String str5, String str6, C12706a<C12711f> aVar) {
        this.f57142c.mo31221a(str6, str5, str3, str, str2, 0, null, aVar);
    }

    /* renamed from: a */
    public final C1592h<C21350a> mo57206a(int i) {
        return this.f57140a.uploadUserMode(i);
    }

    /* renamed from: a */
    public final C1592h<C21350a> mo57207a(HashMap<String, String> hashMap) {
        return this.f57140a.syncUserInfo(hashMap);
    }

    /* renamed from: a */
    private static String m71575a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C6306c.m19563a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public final void mo57210a(C18245g<UserSettingBean> gVar) {
        C18246h.m60214a(this.f57140a.getSettings(), gVar, (Executor) C21117a.f56693a);
    }

    /* renamed from: a */
    public final void mo57208a(int i, C12852m mVar) {
        this.f57141b.mo31177a(i, mVar);
    }

    /* renamed from: b */
    public final void mo57218b(String str, C18245g<EmailExistBean> gVar) {
        C18246h.m60214a(this.f57140a.emailExist("1", m71575a(str)), gVar, (Executor) C21117a.f56693a);
    }

    /* renamed from: a */
    public final void mo57211a(String str, C12844e eVar) {
        this.f57141b.mo31213a(str, (Map) null, (String) null, eVar);
    }

    /* renamed from: a */
    public final void mo57212a(String str, C18245g<String> gVar) {
        C18246h.m60214a(this.f57140a.usernameVerify(str), gVar, (Executor) C21117a.f56693a);
    }

    /* renamed from: a */
    public final void mo57213a(String str, C21320aa aaVar) {
        this.f57141b.mo31193a(str, (String) null, (C12856q) aaVar);
    }

    /* renamed from: b */
    public final void mo57219b(String str, String str2, String str3, C12857r rVar) {
        this.f57141b.mo31215b(str, str2, str3, rVar);
    }

    /* renamed from: c */
    public final void mo57221c(String str, String str2, String str3, C12857r rVar) {
        this.f57141b.mo31217c(str, str2, str3, rVar);
    }

    /* renamed from: a */
    public final void mo57209a(int i, String str, boolean z, C21348y yVar) {
        String str2 = str;
        C21348y yVar2 = yVar;
        this.f57141b.mo31185a("", "", i, 0, "", -1, z ? 1 : 0, str2, "", yVar2);
    }

    /* renamed from: b */
    public final void mo57220b(String str, String str2, String str3, String str4, C12857r rVar) {
        this.f57141b.mo31216b(str, str2, str3, str4, rVar);
    }
}
