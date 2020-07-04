package android.support.p022v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.ab */
public final class C0954ab {

    /* renamed from: a */
    private final Object f3339a;

    public final int hashCode() {
        if (this.f3339a == null) {
            return 0;
        }
        return this.f3339a.hashCode();
    }

    /* renamed from: a */
    public final int mo3717a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3339a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo3719b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3339a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo3720c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3339a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo3721d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3339a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo3722e() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3339a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo3724f() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f3339a).isConsumed();
        }
        return false;
    }

    /* renamed from: g */
    public final C0954ab mo3725g() {
        if (VERSION.SDK_INT >= 20) {
            return new C0954ab((Object) ((WindowInsets) this.f3339a).consumeSystemWindowInsets());
        }
        return null;
    }

    private C0954ab(Object obj) {
        this.f3339a = obj;
    }

    /* renamed from: a */
    static Object m4063a(C0954ab abVar) {
        if (abVar == null) {
            return null;
        }
        return abVar.f3339a;
    }

    /* renamed from: a */
    static C0954ab m4062a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0954ab(obj);
    }

    public C0954ab(C0954ab abVar) {
        WindowInsets windowInsets = null;
        if (VERSION.SDK_INT >= 20) {
            if (abVar != null) {
                windowInsets = new WindowInsets((WindowInsets) abVar.f3339a);
            }
            this.f3339a = windowInsets;
            return;
        }
        this.f3339a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0954ab abVar = (C0954ab) obj;
        if (this.f3339a != null) {
            return this.f3339a.equals(abVar.f3339a);
        }
        if (abVar.f3339a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C0954ab mo3718a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C0954ab((Object) ((WindowInsets) this.f3339a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }
}
