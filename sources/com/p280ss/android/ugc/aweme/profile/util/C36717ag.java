package com.p280ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ag */
public final class C36717ag {
    /* renamed from: a */
    public static void m118376a(Activity activity, User user, List<Aweme> list) {
        m118374a(activity, user, (String) null, list);
    }

    /* renamed from: a */
    public static void m118374a(Activity activity, User user, String str, List<Aweme> list) {
        m118375a(activity, user, str, list, false);
    }

    /* renamed from: a */
    private static void m118378a(Handler handler, Activity activity, User user, List<Aweme> list) {
        m118379a(handler, activity, user, list, false);
    }

    /* renamed from: a */
    public static void m118375a(Activity activity, User user, String str, List<Aweme> list, boolean z) {
        UserSharePackage.m122120a(null, activity, user, list, z);
    }

    /* renamed from: a */
    private static void m118379a(Handler handler, Activity activity, User user, List<Aweme> list, boolean z) {
        UserSharePackage.m122120a(handler, activity, user, list, false);
    }

    /* renamed from: a */
    public static void m118380a(Handler handler, Activity activity, User user, List<Aweme> list, String[] strArr) {
        m118377a(handler, activity, user, null, list, strArr);
    }

    /* renamed from: a */
    private static void m118377a(Handler handler, Activity activity, User user, String str, List<Aweme> list, String[] strArr) {
        if (!C6399b.m19944t()) {
            m118378a(handler, activity, user, list);
        } else if (user != null && user.getShareInfo() != null) {
            UserSharePackage.m122120a(handler, activity, user, list, true);
        }
    }
}
