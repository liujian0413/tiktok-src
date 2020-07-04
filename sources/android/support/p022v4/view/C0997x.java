package android.support.p022v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.x */
public final class C0997x {
    /* renamed from: a */
    public static boolean m4271a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m4265a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).mo1401b(view, i);
            return;
        }
        if (i == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C0981m) {
                ((C0981m) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4268a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
            }
        } else {
            if (viewParent instanceof C0981m) {
                return ((C0981m) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static void m4272b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).mo1402b(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C0981m) {
                ((C0981m) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4269a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
            }
        } else {
            if (viewParent instanceof C0981m) {
                return ((C0981m) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4270a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).mo1399a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C0981m) {
                return ((C0981m) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m4267a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).mo1397a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C0981m) {
                ((C0981m) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static void m4266a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).mo1396a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C0981m) {
                ((C0981m) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }
}
