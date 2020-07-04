package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22708e;
import com.p280ss.android.ugc.aweme.friends.p1285ui.InviteUserListActivity;
import com.p280ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.aq */
public final class C22872aq extends C22689a {

    /* renamed from: c */
    public static final C22874b f60594c = new C22874b(null);

    /* renamed from: com.ss.android.ugc.aweme.app.aq$a */
    public static final class C22873a extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C43122ff.m136767b() || !C6399b.m19946v()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            C22887b.f60603b.mo59852a("homepage_hot", uri, z);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aq$b */
    public static final class C22874b {
        private C22874b() {
        }

        /* renamed from: a */
        public static List<C22708e> m75338a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22873a());
            arrayList.add(new C22876d());
            arrayList.add(new C22875c());
            arrayList.add(new C22877e());
            return arrayList;
        }

        public /* synthetic */ C22874b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aq$c */
    public static final class C22875c extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7573i.m23585a((Object) sb.toString(), (Object) "friend/find");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() && TextUtils.equals(uri.getQueryParameter("platform"), "facebook")) {
                IAccountUserService a2 = C21115b.m71197a();
                C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountUserProxyService.get().curUser");
                if (curUser.getUserMode() != 2) {
                    C7213d a3 = C7213d.m22500a();
                    C7573i.m23582a((Object) a3, "AbTestManager.getInstance()");
                    if (a3.mo18724R() && !C6861a.m21335d().isPlatformBound("facebook")) {
                        Intent intent = new Intent(activity, InviteUserListActivity.class);
                        intent.putExtra("type", 3);
                        intent.putExtra("enter_from", "guide_to_invite_third_friends");
                        return intent;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aq$d */
    public static final class C22876d extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "helper_center");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, AgreementActivity.class);
            intent.putExtra("URL_FIELD", "https://support.tiktok.com");
            intent.putExtra("FIELD_TITLE", activity.getString(R.string.b65));
            intent.putExtra("FIELD_SHOW_AGREE_BUTTON", false);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aq$e */
    public static final class C22877e extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (!C7573i.m23585a((Object) str, (Object) "link_account") || !C6399b.m19946v()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", true);
            C22887b.f60603b.mo59852a("message", uri, z);
            return intent;
        }
    }
}
