package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.transition.ac */
final class C0458ac implements C0459ad {

    /* renamed from: a */
    private final ViewOverlay f1912a;

    /* renamed from: a */
    public final void mo2048a(Drawable drawable) {
        this.f1912a.add(drawable);
    }

    /* renamed from: b */
    public final void mo2049b(Drawable drawable) {
        this.f1912a.remove(drawable);
    }

    C0458ac(View view) {
        this.f1912a = view.getOverlay();
    }
}
