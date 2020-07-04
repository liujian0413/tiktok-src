package com.p280ss.android.ugc.aweme.profile.guide;

import android.os.Looper;
import android.support.p022v4.app.C0608j;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval;
import com.p280ss.android.ugc.aweme.profile.guide.C35814d.C35815a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.guide.b */
public final class C35811b {

    /* renamed from: a */
    public static final C35811b f93862a = new C35811b();

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.b$a */
    static final class C35812a<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ String f93863a;

        /* renamed from: b */
        final /* synthetic */ int f93864b;

        C35812a(String str, int i) {
            this.f93863a = str;
            this.f93864b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            C35811b.m115626a(this.f93863a, this.f93864b);
        }
    }

    private C35811b() {
    }

    /* renamed from: b */
    private static void m115629b() {
        C35815a.m115636a().mo90717c();
    }

    /* renamed from: a */
    public static final boolean m115628a() {
        if (!ProfileGuideTestMode.isTestMode() && !ProfileGuideTimeInterval.isEnabled()) {
            return false;
        }
        if (C35815a.m115636a().mo90715a()) {
            if (ProfileGuideTestMode.isTestMode()) {
                m115626a("头像用户名引导 - 已经展示超过 5 次了，因为测试模式才展示", 0);
            } else {
                m115626a("头像用户名引导 - 已经展示过 5 次了", 1);
                return false;
            }
        }
        if (!C35815a.m115636a().mo90716b()) {
            return true;
        }
        m115626a("头像用户名引导 - 频控时间内不再展示", 1);
        return false;
    }

    /* renamed from: a */
    public static final void m115625a(C0608j jVar) {
        if (jVar != null && m115628a()) {
            m115630b(jVar);
        }
    }

    /* renamed from: b */
    private static void m115630b(C0608j jVar) {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        if (curUser != null) {
            if (curUser.avatarUpdateReminder()) {
                ProfileGuideFillAvatarDialogFragment.f93829f.mo90698a(jVar);
                m115629b();
                return;
            }
            if (curUser.nicknameUpdateReminder()) {
                ProfileGuideFillNicknameDialogFragment.f93844e.mo90709a(jVar);
                m115629b();
            }
        }
    }

    /* renamed from: a */
    public static final void m115626a(String str, int i) {
        C7573i.m23587b(str, "msg");
        if (ProfileGuideTestMode.isTestMode() || ProfileGuideTimeInterval.isEnabled()) {
            if (C6399b.m19928c() || TextUtils.equals(C6399b.m19941q(), "local_test")) {
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
                if (C7573i.m23585a((Object) currentThread, (Object) mainLooper.getThread())) {
                    C35813c.m115632a(Toast.makeText(C6399b.m19921a(), str, i));
                    return;
                }
                C7492s.m23301b("").mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C35812a<Object>(str, i));
            }
        }
    }
}
