package com.p280ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.app.C1107c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.bb */
public final class C7212bb {

    /* renamed from: a */
    public static final C7212bb f20153a = new C7212bb();

    /* renamed from: b */
    private static final String f20154b = f20154b;

    /* renamed from: c */
    private static final String f20155c = f20155c;

    /* renamed from: d */
    private static Boolean f20156d;

    private C7212bb() {
    }

    /* renamed from: a */
    public static final boolean m22494a(Activity activity) {
        return m22495a(activity, R.color.a3z);
    }

    /* renamed from: b */
    public static final void m22497b() {
        if (m22493a()) {
            C6394b a = C6394b.m19903a();
            C7573i.m23582a((Object) a, "ColorModeManager.getInstance()");
            a.f18686a = 0;
            return;
        }
        C6394b a2 = C6394b.m19903a();
        C7573i.m23582a((Object) a2, "ColorModeManager.getInstance()");
        a2.f18686a = 1;
    }

    /* renamed from: a */
    public static final boolean m22493a() {
        if (f20156d == null) {
            if (C6399b.m19945u()) {
                f20156d = Boolean.valueOf(false);
            } else if (C6399b.m19946v() || (!C6399b.m19928c() && !C6319n.m19594a(C6399b.m19941q(), "local_test"))) {
                f20156d = Boolean.valueOf(true);
            } else {
                f20156d = Boolean.valueOf(C7285c.m22838a(C6399b.m19921a(), f20154b, 0).getBoolean(f20155c, true));
            }
        }
        Boolean bool = f20156d;
        if (bool == null) {
            C7573i.m23580a();
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public static final void m22492a(Context context) {
        C7573i.m23587b(context, "context");
        if (m22493a()) {
            C1107c.m4900d(1);
        } else {
            C1107c.m4900d(2);
        }
        TiktokSkinHelper.m22464a(context);
    }

    /* renamed from: b */
    public static final void m22498b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (C6399b.m19946v() || m22493a()) {
            ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.a3z).init();
        } else {
            ImmersionBar.with(activity).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m22495a(Activity activity, int i) {
        C7573i.m23587b(activity, "activity");
        if (!C6399b.m19947w() || !m22493a()) {
            return false;
        }
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor(i).init();
        return true;
    }
}
