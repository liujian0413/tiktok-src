package dagger.android.support;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.C1642a;
import dagger.android.C7313b;
import dagger.p1859a.C47375f;

/* renamed from: dagger.android.support.a */
public final class C47378a {
    /* renamed from: a */
    public static void m147946a(Fragment fragment) {
        C47375f.m147940a(fragment, "fragment");
        C7317b b = m147947b(fragment);
        C7313b bX_ = b.bX_();
        C47375f.m147941a(bX_, "%s.supportFragmentInjector() returned null", b.getClass());
        bX_.mo19116a(fragment);
    }

    /* renamed from: b */
    private static C7317b m147947b(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.mParentFragment;
            if (fragment2 == null) {
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof C7317b) {
                    return (C7317b) activity;
                }
                if (activity.getApplication() instanceof C7317b) {
                    return (C7317b) activity.getApplication();
                }
                throw new IllegalArgumentException(C1642a.m8034a("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof C7317b));
        return (C7317b) fragment2;
    }
}
