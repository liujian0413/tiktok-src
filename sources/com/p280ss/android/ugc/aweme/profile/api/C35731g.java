package com.p280ss.android.ugc.aweme.profile.api;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.keva.Keva;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.C35779f;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36010ah;
import com.p280ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;

/* renamed from: com.ss.android.ugc.aweme.profile.api.g */
public final class C35731g {

    /* renamed from: a */
    public static final String f93700a;

    /* renamed from: b */
    private static boolean f93701b = true;

    /* renamed from: b */
    private static Builder m115446b() {
        return Uri.parse(f93700a).buildUpon();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19223b.f51890e);
        sb.append("/aweme/v1/user/");
        f93700a = sb.toString();
    }

    /* renamed from: a */
    public static boolean m115445a() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!C36102u.f94392a.needShowCompleteProfileGuideBar() || repo.getBoolean(C35779f.m115540a("profile_page_complete_profile_guide_bar_has_click_close"), false) || repo.getInt(C35779f.m115540a("profile_page_complete_profile_guide_bar_show_times"), 0) >= 3 || System.currentTimeMillis() - repo.getLong(C35779f.m115540a("profile_page_complete_profile_guide_bar_last_show_time"), 0) <= 2592000000L) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C36010ah m115440a(String str) throws Exception {
        return (C36010ah) C36074j.f94315a.apiExecuteGetJSONObject(str, C36010ah.class, "", true, null);
    }

    /* renamed from: b */
    public static String m115448b(String str) {
        if (!m115445a() || !TextUtils.equals(str, C6861a.m21337f().getCurUserId())) {
            return m115446b().appendQueryParameter("user_id", str).toString();
        }
        return m115446b().appendQueryParameter("user_id", str).appendQueryParameter("need_pv", "true").toString();
    }

    /* renamed from: a */
    public static String m115444a(boolean z) {
        if (!C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            return "/aweme/v1/user/";
        }
        if (z) {
            return "/aweme/v1/user/profile/self/";
        }
        return "/aweme/v1/user/profile/other/";
    }

    /* renamed from: a */
    public static String m115441a(String str, int i) {
        return m115446b().appendQueryParameter("sec_user_id", str).appendQueryParameter("address_book_access", String.valueOf(C43161e.m136882a())).appendQueryParameter("from", String.valueOf(i)).toString();
    }

    /* renamed from: b */
    public static String m115449b(String str, String str2, int i) {
        return m115450b(str, str2, null, i);
    }

    /* renamed from: b */
    public static UserResponse m115447b(String str, boolean z, String str2) throws Exception {
        return (UserResponse) C36074j.f94315a.apiExecuteGetJSONObject(str, UserResponse.class, "", z, str2);
    }

    /* renamed from: a */
    public static User m115439a(String str, boolean z, String str2) throws Exception {
        String str3;
        C19290j jVar = new C19290j(str);
        String str4 = "is_cold_start";
        if (f93701b) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        jVar.mo51188a(str4, str3);
        f93701b = false;
        return (User) C36074j.f94315a.apiExecuteGetJSONObject(jVar.toString(), User.class, "user", z, null);
    }

    /* renamed from: a */
    public static String m115442a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            return m115448b(str);
        }
        Builder appendQueryParameter = m115446b().appendQueryParameter("user_id", str).appendQueryParameter("unique_id", str2).appendQueryParameter("from", String.valueOf(i));
        if (m115445a() && TextUtils.equals(str, C6861a.m21337f().getCurUserId())) {
            appendQueryParameter.appendQueryParameter("need_pv", "true");
        }
        return appendQueryParameter.toString();
    }

    /* renamed from: b */
    public static String m115450b(String str, String str2, String str3, int i) {
        Builder buildUpon = Uri.parse(C19223b.f51890e).buildUpon();
        User curUser = C6861a.m21337f().getCurUser();
        if ((!TextUtils.isEmpty(str) && TextUtils.equals(curUser.getSecUid(), str)) || ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUser.getUid(), str2)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(curUser.getUniqueId(), str3)))) {
            buildUpon.path(m115444a(true));
            if (m115445a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else if (!TextUtils.isEmpty(str)) {
            buildUpon.path(m115444a(false)).appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            buildUpon.path(m115444a(false)).appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            buildUpon.path(m115444a(false)).appendQueryParameter("unique_id", str3);
        } else if (C6861a.m21337f().isLogin()) {
            buildUpon.path(m115444a(true));
            if (m115445a()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else if (!C7163a.m22363a()) {
            buildUpon.path(m115444a(false));
        } else {
            StringBuilder sb = new StringBuilder("You are calling ");
            sb.append(m115444a(false));
            sb.append(" with sid, uid, unique id are all empty");
            throw new RuntimeException(sb.toString());
        }
        buildUpon.appendQueryParameter("address_book_access", String.valueOf(C43161e.m136882a()));
        buildUpon.appendQueryParameter("from", String.valueOf(i));
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static String m115443a(String str, String str2, String str3, int i) {
        return m115446b().appendQueryParameter("user_id", str).appendQueryParameter("sec_user_id", str2).appendQueryParameter("unique_id", str3).appendQueryParameter("from", String.valueOf(i)).toString();
    }
}
