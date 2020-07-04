package android.support.p029v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p022v4.graphics.drawable.C0727a;

/* renamed from: android.support.v7.graphics.drawable.b */
public class C1131b extends Drawable implements Callback {

    /* renamed from: k */
    public Drawable f4068k;

    public int getChangingConfigurations() {
        return this.f4068k.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f4068k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4068k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4068k.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4068k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4068k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4068k.getOpacity();
    }

    public int[] getState() {
        return this.f4068k.getState();
    }

    public Region getTransparentRegion() {
        return this.f4068k.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return C0727a.m3110b(this.f4068k);
    }

    public boolean isStateful() {
        return this.f4068k.isStateful();
    }

    public void jumpToCurrentState() {
        C0727a.m3101a(this.f4068k);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public C1131b(Drawable drawable) {
        m5024a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f4068k.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f4068k.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4068k.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4068k.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f4068k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0727a.m3109a(this.f4068k, z);
    }

    public void setChangingConfigurations(int i) {
        this.f4068k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4068k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4068k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4068k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return this.f4068k.setState(iArr);
    }

    public void setTint(int i) {
        C0727a.m3103a(this.f4068k, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0727a.m3105a(this.f4068k, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0727a.m3108a(this.f4068k, mode);
    }

    /* renamed from: a */
    private void m5024a(Drawable drawable) {
        if (this.f4068k != null) {
            this.f4068k.setCallback(null);
        }
        this.f4068k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        C0727a.m3102a(this.f4068k, f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f4068k.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0727a.m3104a(this.f4068k, i, i2, i3, i4);
    }
}
