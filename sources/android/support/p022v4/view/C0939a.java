package android.support.p022v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0949d;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.a */
public class C0939a {

    /* renamed from: a */
    private static final AccessibilityDelegate f3294a = new AccessibilityDelegate();

    /* renamed from: b */
    public final AccessibilityDelegate f3295b = new C0940a(this);

    /* renamed from: android.support.v4.view.a$a */
    static final class C0940a extends AccessibilityDelegate {

        /* renamed from: a */
        private final C0939a f3296a;

        C0940a(C0939a aVar) {
            this.f3296a = aVar;
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0949d a = this.f3296a.mo3629a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.f3336a;
            }
            return null;
        }

        public final void sendAccessibilityEvent(View view, int i) {
            C0939a.m3969a(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C0939a.m3970c(view, accessibilityEvent);
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3296a.mo3631d(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3296a.mo1390a(view, accessibilityEvent);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3296a.mo1766b(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f3296a.mo1148a(view, C0945c.m3986a(accessibilityNodeInfo));
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3296a.mo3630a(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3296a.mo1299a(view, i, bundle);
        }
    }

    /* renamed from: a */
    public C0949d mo3629a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = f3294a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0949d(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m3969a(View view, int i) {
        f3294a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: c */
    public static void m3970c(View view, AccessibilityEvent accessibilityEvent) {
        f3294a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1766b(View view, AccessibilityEvent accessibilityEvent) {
        f3294a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public boolean mo3631d(View view, AccessibilityEvent accessibilityEvent) {
        return f3294a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1148a(View view, C0945c cVar) {
        f3294a.onInitializeAccessibilityNodeInfo(view, cVar.f3298a);
    }

    /* renamed from: a */
    public void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
        f3294a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1299a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return f3294a.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3630a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f3294a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
