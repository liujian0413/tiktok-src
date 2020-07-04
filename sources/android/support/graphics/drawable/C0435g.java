package android.support.graphics.drawable;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.graphics.drawable.C0732e;

/* renamed from: android.support.graphics.drawable.g */
abstract class C0435g extends Drawable implements C0732e {

    /* renamed from: b */
    Drawable f1872b;

    C0435g() {
    }

    public void clearColorFilter() {
        if (this.f1872b != null) {
            this.f1872b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f1872b != null) {
            return C0727a.m3114e(this.f1872b);
        }
        return null;
    }

    public Drawable getCurrent() {
        if (this.f1872b != null) {
            return this.f1872b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        if (this.f1872b != null) {
            return this.f1872b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        if (this.f1872b != null) {
            return this.f1872b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int[] getState() {
        if (this.f1872b != null) {
            return this.f1872b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f1872b != null) {
            return this.f1872b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f1872b != null) {
            C0727a.m3101a(this.f1872b);
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f1872b != null) {
            C0727a.m3106a(this.f1872b, theme);
        }
    }

    public boolean getPadding(Rect rect) {
        if (this.f1872b != null) {
            return this.f1872b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1872b != null) {
            this.f1872b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f1872b != null) {
            return this.f1872b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f1872b != null) {
            this.f1872b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f1872b != null) {
            this.f1872b.setFilterBitmap(z);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f1872b != null) {
            return this.f1872b.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f1872b != null) {
            this.f1872b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f1872b != null) {
            C0727a.m3102a(this.f1872b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1872b != null) {
            C0727a.m3104a(this.f1872b, i, i2, i3, i4);
        }
    }
}
