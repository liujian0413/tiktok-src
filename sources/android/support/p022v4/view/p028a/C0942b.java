package android.support.p022v4.view.p028a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

/* renamed from: android.support.v4.view.a.b */
public final class C0942b {

    /* renamed from: android.support.v4.view.a.b$a */
    public interface C0943a {
        /* renamed from: a */
        void mo1318a(boolean z);
    }

    /* renamed from: android.support.v4.view.a.b$b */
    static class C0944b implements TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C0943a f3297a;

        public final int hashCode() {
            return this.f3297a.hashCode();
        }

        C0944b(C0943a aVar) {
            this.f3297a = aVar;
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            this.f3297a.mo1318a(z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f3297a.equals(((C0944b) obj).f3297a);
        }
    }

    /* renamed from: a */
    public static boolean m3980a(AccessibilityManager accessibilityManager, C0943a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new C0944b(aVar));
    }

    /* renamed from: b */
    public static boolean m3981b(AccessibilityManager accessibilityManager, C0943a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C0944b(aVar));
    }
}
