package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.R$styleable;
import android.support.p029v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f1134a;

    /* renamed from: b */
    boolean f1135b;

    /* renamed from: c */
    private Drawable f1136c;

    /* renamed from: d */
    private final Rect f1137d;

    /* renamed from: g */
    private final Rect f1138g;

    /* renamed from: h */
    private int f1139h;

    public Drawable getForeground() {
        return this.f1136c;
    }

    public int getForegroundGravity() {
        return this.f1139h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1136c != null) {
            this.f1136c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1136c != null && this.f1136c.isStateful()) {
            this.f1136c.setState(getDrawableState());
        }
    }

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f1136c) {
            return true;
        }
        return false;
    }

    public void setForegroundGravity(int i) {
        if (this.f1139h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1139h = i;
            if (this.f1139h == 119 && this.f1136c != null) {
                this.f1136c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1136c != null) {
            Drawable drawable = this.f1136c;
            if (this.f1135b) {
                this.f1135b = false;
                Rect rect = this.f1137d;
                Rect rect2 = this.f1138g;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f1134a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f1139h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f1136c != drawable) {
            if (this.f1136c != null) {
                this.f1136c.setCallback(null);
                unscheduleDrawable(this.f1136c);
            }
            this.f1136c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1139h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f1136c != null) {
            this.f1136c.setHotspot(f, f2);
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1137d = new Rect();
        this.f1138g = new Rect();
        this.f1139h = 119;
        this.f1134a = true;
        this.f1135b = false;
        TypedArray a = C0296b.m1168a(context, attributeSet, R$styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.f1139h = a.getInt(1, this.f1139h);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1134a = a.getBoolean(2, true);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1135b = true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1135b = z | this.f1135b;
    }
}
