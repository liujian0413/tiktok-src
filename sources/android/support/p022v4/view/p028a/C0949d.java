package android.support.p022v4.view.p028a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.d */
public class C0949d {

    /* renamed from: a */
    public final Object f3336a;

    /* renamed from: android.support.v4.view.a.d$a */
    static class C0950a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0949d f3337a;

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return null;
        }

        C0950a(C0949d dVar) {
            this.f3337a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0945c a = this.f3337a.mo3703a(i);
            if (a == null) {
                return null;
            }
            return a.f3298a;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3337a.mo3704a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.view.a.d$b */
    static class C0951b extends C0950a {
        C0951b(C0949d dVar) {
            super(dVar);
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            C0945c b = this.f3337a.mo3705b(i);
            if (b == null) {
                return null;
            }
            return b.f3298a;
        }
    }

    /* renamed from: a */
    public C0945c mo3703a(int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo3704a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0945c mo3705b(int i) {
        return null;
    }

    public C0949d() {
        if (VERSION.SDK_INT >= 19) {
            this.f3336a = new C0951b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f3336a = new C0950a(this);
        } else {
            this.f3336a = null;
        }
    }

    public C0949d(Object obj) {
        this.f3336a = obj;
    }
}
