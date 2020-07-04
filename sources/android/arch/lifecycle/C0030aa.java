package android.arch.lifecycle;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.aa */
public final class C0030aa {
    /* renamed from: a */
    public static C0070y m79a(Fragment fragment) {
        if (fragment instanceof C0071z) {
            return fragment.getViewModelStore();
        }
        return HolderFragment.m44a(fragment).getViewModelStore();
    }

    /* renamed from: a */
    public static C0070y m80a(FragmentActivity fragmentActivity) {
        if (fragmentActivity instanceof C0071z) {
            return fragmentActivity.getViewModelStore();
        }
        return HolderFragment.m45a(fragmentActivity).getViewModelStore();
    }
}
