package com.p280ss.android.ugc.aweme.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.component.C23304f;
import com.p280ss.android.ugc.aweme.base.component.C23305g;

/* renamed from: com.ss.android.ugc.aweme.login.f */
public final class C32656f {

    /* renamed from: a */
    public static C23304f f85119a;

    /* renamed from: a */
    public static C23304f m105741a() {
        return f85119a;
    }

    /* renamed from: a */
    public static void m105750a(C23304f fVar) {
        f85119a = fVar;
    }

    /* renamed from: a */
    public static void m105742a(Activity activity, String str, String str2) {
        m105744a(activity, str, str2, (Bundle) null, (C23305g) null);
    }

    /* renamed from: a */
    public static void m105746a(Fragment fragment, String str, String str2) {
        m105748a(fragment, str, str2, (Bundle) null, (C23305g) null);
    }

    /* renamed from: a */
    public static void m105743a(Activity activity, String str, String str2, Bundle bundle) {
        m105744a(activity, str, str2, bundle, (C23305g) null);
    }

    /* renamed from: a */
    public static void m105745a(Activity activity, String str, String str2, C23305g gVar) {
        m105744a(activity, str, str2, (Bundle) null, gVar);
    }

    /* renamed from: a */
    public static void m105747a(Fragment fragment, String str, String str2, Bundle bundle) {
        m105748a(fragment, str, str2, bundle, (C23305g) null);
    }

    /* renamed from: a */
    public static void m105749a(Fragment fragment, String str, String str2, C23305g gVar) {
        m105748a(fragment, str, str2, (Bundle) null, gVar);
    }

    /* renamed from: a */
    public static void m105744a(Activity activity, String str, String str2, Bundle bundle, C23305g gVar) {
        if (f85119a == null && AmeActivity.getLoginComponentFactory() != null && activity != null && !activity.isFinishing()) {
            m105750a(AmeActivity.getLoginComponentFactory().mo16930a((AbsActivity) activity));
        }
        if (f85119a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (activity != null && !activity.isFinishing()) {
            f85119a.mo60579a(activity, str, str2, bundle, gVar);
        }
    }

    /* renamed from: a */
    public static void m105748a(Fragment fragment, String str, String str2, Bundle bundle, C23305g gVar) {
        if (!(f85119a != null || AmeActivity.getLoginComponentFactory() == null || fragment == null || fragment.getActivity() == null || fragment.getActivity().isFinishing())) {
            m105750a(AmeActivity.getLoginComponentFactory().mo16930a((AbsActivity) fragment.getActivity()));
        }
        if (f85119a == null) {
            throw new RuntimeException("ILoginActivityComponent stub can't be null");
        } else if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            f85119a.mo60580a(fragment, str, str2, bundle, gVar);
        }
    }
}
