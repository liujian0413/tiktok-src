package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0066a;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.C0071z;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.c */
public final class C23087c {
    /* renamed from: a */
    public static C0065w m75886a(Fragment fragment) {
        return C0069x.m157a(fragment);
    }

    /* renamed from: a */
    private static Application m75885a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: b */
    private static Activity m75889b(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    public static C0065w m75888a(FragmentActivity fragmentActivity) {
        return C0069x.m159a(fragmentActivity);
    }

    /* renamed from: a */
    public static C0065w m75887a(Fragment fragment, C0071z zVar) {
        return new C0065w(C23088d.m75890a(zVar), C0066a.m152a(m75885a(m75889b(fragment))));
    }
}
