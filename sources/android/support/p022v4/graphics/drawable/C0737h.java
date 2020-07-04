package android.support.p022v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.h */
final class C0737h extends C0734g {

    /* renamed from: d */
    private static Method f2769d;

    /* renamed from: android.support.v4.graphics.drawable.h$a */
    static class C0738a extends C0735a {
        public final Drawable newDrawable(Resources resources) {
            return new C0737h(this, resources);
        }

        C0738a(C0735a aVar, Resources resources) {
            super(aVar, null);
        }
    }

    public final Rect getDirtyBounds() {
        return this.f2760c.getDirtyBounds();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0735a mo2906b() {
        return new C0738a(this.f2759b, null);
    }

    /* renamed from: d */
    private static void m3137d() {
        if (f2769d == null) {
            try {
                f2769d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo2907c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2760c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    C0737h(Drawable drawable) {
        super(drawable);
        m3137d();
    }

    public final void getOutline(Outline outline) {
        this.f2760c.getOutline(outline);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo2907c()) {
            super.setTint(i);
        } else {
            this.f2760c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo2907c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2760c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo2907c()) {
            super.setTintMode(mode);
        } else {
            this.f2760c.setTintMode(mode);
        }
    }

    public final void setHotspot(float f, float f2) {
        this.f2760c.setHotspot(f, f2);
    }

    C0737h(C0735a aVar, Resources resources) {
        super(aVar, resources);
        m3137d();
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2760c.setHotspotBounds(i, i2, i3, i4);
    }
}
