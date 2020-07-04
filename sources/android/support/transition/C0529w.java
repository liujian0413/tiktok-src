package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.transition.w */
final class C0529w implements C0530x {

    /* renamed from: a */
    private final ViewGroupOverlay f2088a;

    /* renamed from: a */
    public final void mo2048a(Drawable drawable) {
        this.f2088a.add(drawable);
    }

    /* renamed from: b */
    public final void mo2049b(Drawable drawable) {
        this.f2088a.remove(drawable);
    }

    C0529w(ViewGroup viewGroup) {
        this.f2088a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public final void mo2164a(View view) {
        this.f2088a.add(view);
    }

    /* renamed from: b */
    public final void mo2165b(View view) {
        this.f2088a.remove(view);
    }
}
