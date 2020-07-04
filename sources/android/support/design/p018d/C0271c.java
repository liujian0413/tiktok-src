package android.support.design.p018d;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.design.d.c */
public final class C0271c {

    /* renamed from: a */
    public boolean f1056a;

    /* renamed from: b */
    public int f1057b;

    /* renamed from: c */
    private final View f1058c;

    /* renamed from: b */
    private void m1071b() {
        ViewParent parent = this.f1058c.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo1393a(this.f1058c);
        }
    }

    /* renamed from: a */
    public final Bundle mo1047a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f1056a);
        bundle.putInt("expandedComponentIdHint", this.f1057b);
        return bundle;
    }

    /* renamed from: a */
    public final void mo1048a(Bundle bundle) {
        this.f1056a = bundle.getBoolean("expanded", false);
        this.f1057b = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f1056a) {
            m1071b();
        }
    }
}
