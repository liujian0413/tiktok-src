package android.support.p022v4.view.p028a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.e */
public final class C0952e {

    /* renamed from: a */
    public final AccessibilityRecord f3338a;

    /* renamed from: a */
    public static C0952e m4053a() {
        return new C0952e(AccessibilityRecord.obtain());
    }

    public final int hashCode() {
        if (this.f3338a == null) {
            return 0;
        }
        return this.f3338a.hashCode();
    }

    private C0952e(Object obj) {
        this.f3338a = (AccessibilityRecord) obj;
    }

    /* renamed from: a */
    public final void mo3710a(int i) {
        this.f3338a.setItemCount(i);
    }

    /* renamed from: b */
    public final void mo3712b(int i) {
        this.f3338a.setFromIndex(i);
    }

    /* renamed from: c */
    public final void mo3713c(int i) {
        this.f3338a.setToIndex(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0952e eVar = (C0952e) obj;
        if (this.f3338a == null) {
            if (eVar.f3338a != null) {
                return false;
            }
        } else if (!this.f3338a.equals(eVar.f3338a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo3711a(boolean z) {
        this.f3338a.setScrollable(z);
    }

    /* renamed from: b */
    public static void m4056b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: a */
    public static void m4054a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: a */
    public static void m4055a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }
}
