package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0065w.C0066a;
import android.arch.lifecycle.C0065w.C0067b;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.x */
public final class C0069x {
    /* renamed from: a */
    public static C0065w m157a(Fragment fragment) {
        return m158a(fragment, (C0067b) null);
    }

    /* renamed from: a */
    private static Application m156a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: b */
    private static Activity m161b(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    public static C0065w m159a(FragmentActivity fragmentActivity) {
        return m160a(fragmentActivity, (C0067b) null);
    }

    /* renamed from: a */
    public static C0065w m158a(Fragment fragment, C0067b bVar) {
        Application a = m156a(m161b(fragment));
        if (bVar == null) {
            bVar = C0066a.m152a(a);
        }
        return new C0065w(C0030aa.m79a(fragment), bVar);
    }

    /* renamed from: a */
    public static C0065w m160a(FragmentActivity fragmentActivity, C0067b bVar) {
        Application a = m156a((Activity) fragmentActivity);
        if (bVar == null) {
            bVar = C0066a.m152a(a);
        }
        return new C0065w(C0030aa.m80a(fragmentActivity), bVar);
    }
}
