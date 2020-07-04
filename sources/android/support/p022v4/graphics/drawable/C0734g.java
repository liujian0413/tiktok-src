package android.support.p022v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.graphics.drawable.g */
class C0734g extends Drawable implements Callback, C0732e, C0733f {

    /* renamed from: a */
    static final Mode f2758a = Mode.SRC_IN;

    /* renamed from: b */
    C0735a f2759b;

    /* renamed from: c */
    Drawable f2760c;

    /* renamed from: d */
    private int f2761d;

    /* renamed from: e */
    private Mode f2762e;

    /* renamed from: f */
    private boolean f2763f;

    /* renamed from: g */
    private boolean f2764g;

    /* renamed from: android.support.v4.graphics.drawable.g$a */
    protected static abstract class C0735a extends ConstantState {

        /* renamed from: a */
        int f2765a;

        /* renamed from: b */
        ConstantState f2766b;

        /* renamed from: c */
        ColorStateList f2767c;

        /* renamed from: d */
        Mode f2768d = C0734g.f2758a;

        public abstract Drawable newDrawable(Resources resources);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo2937a() {
            if (this.f2766b != null) {
                return true;
            }
            return false;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            int i;
            int i2 = this.f2765a;
            if (this.f2766b != null) {
                i = this.f2766b.getChangingConfigurations();
            } else {
                i = 0;
            }
            return i2 | i;
        }

        C0735a(C0735a aVar, Resources resources) {
            if (aVar != null) {
                this.f2765a = aVar.f2765a;
                this.f2766b = aVar.f2766b;
                this.f2767c = aVar.f2767c;
                this.f2768d = aVar.f2768d;
            }
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.g$b */
    static class C0736b extends C0735a {
        public final Drawable newDrawable(Resources resources) {
            return new C0734g(this, resources);
        }

        C0736b(C0735a aVar, Resources resources) {
            super(aVar, null);
        }
    }

    /* renamed from: a */
    public final Drawable mo2904a() {
        return this.f2760c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2907c() {
        return true;
    }

    public Drawable getCurrent() {
        return this.f2760c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2760c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2760c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2760c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2760c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2760c.getOpacity();
    }

    public int[] getState() {
        return this.f2760c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2760c.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.f2760c.isAutoMirrored();
    }

    public void jumpToCurrentState() {
        this.f2760c.jumpToCurrentState();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0735a mo2906b() {
        return new C0736b(this.f2759b, null);
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        if (this.f2759b != null) {
            i = this.f2759b.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f2760c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        if (this.f2759b == null || !this.f2759b.mo2937a()) {
            return null;
        }
        this.f2759b.f2765a = getChangingConfigurations();
        return this.f2759b;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!mo2907c() || this.f2759b == null) {
            colorStateList = null;
        } else {
            colorStateList = this.f2759b.f2767c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f2760c.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        ConstantState constantState;
        if (!this.f2764g && super.mutate() == this) {
            this.f2759b = mo2906b();
            if (this.f2760c != null) {
                this.f2760c.mutate();
            }
            if (this.f2759b != null) {
                C0735a aVar = this.f2759b;
                if (this.f2760c != null) {
                    constantState = this.f2760c.getConstantState();
                } else {
                    constantState = null;
                }
                aVar.f2766b = constantState;
            }
            this.f2764g = true;
        }
        return this;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f2760c.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f2760c.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2760c.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f2760c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2760c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2760c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2760c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2760c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2760c.setFilterBitmap(z);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    C0734g(Drawable drawable) {
        this.f2759b = mo2906b();
        mo2905a(drawable);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f2760c != null) {
            this.f2760c.setBounds(rect);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2759b.f2767c = colorStateList;
        m3131a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f2759b.f2768d = mode;
        m3131a(getState());
    }

    /* renamed from: a */
    private void m3130a(Resources resources) {
        if (this.f2759b != null && this.f2759b.f2766b != null) {
            mo2905a(this.f2759b.f2766b.newDrawable(resources));
        }
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f2760c.setState(iArr);
        if (m3131a(iArr) || state) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3131a(int[] iArr) {
        if (!mo2907c()) {
            return false;
        }
        ColorStateList colorStateList = this.f2759b.f2767c;
        Mode mode = this.f2759b.f2768d;
        if (colorStateList == null || mode == null) {
            this.f2763f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2763f && colorForState == this.f2761d && mode == this.f2762e)) {
                setColorFilter(colorForState, mode);
                this.f2761d = colorForState;
                this.f2762e = mode;
                this.f2763f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2905a(Drawable drawable) {
        if (this.f2760c != null) {
            this.f2760c.setCallback(null);
        }
        this.f2760c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f2759b != null) {
                this.f2759b.f2766b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0734g(C0735a aVar, Resources resources) {
        this.f2759b = aVar;
        m3130a(resources);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f2760c.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
