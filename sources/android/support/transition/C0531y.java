package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: android.support.transition.y */
final class C0531y {
    /* renamed from: a */
    static C0530x m2228a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new C0529w(viewGroup);
        }
        return C0528v.m2219a(viewGroup);
    }

    /* renamed from: a */
    static void m2229a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            C0455aa.m1989a(viewGroup, z);
        } else {
            C0532z.m2231a(viewGroup, z);
        }
    }
}
