package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.transition.am */
final class C0473am implements C0474an {

    /* renamed from: a */
    private final WindowId f1947a;

    public final int hashCode() {
        return this.f1947a.hashCode();
    }

    C0473am(View view) {
        this.f1947a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0473am) || !((C0473am) obj).f1947a.equals(this.f1947a)) {
            return false;
        }
        return true;
    }
}
