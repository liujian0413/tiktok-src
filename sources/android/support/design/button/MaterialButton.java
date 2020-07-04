package android.support.design.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.R$styleable;
import android.support.design.internal.C0296b;
import android.support.design.internal.C0297c;
import android.support.design.p019e.C0272a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class MaterialButton extends AppCompatButton {

    /* renamed from: b */
    private final C0253b f924b;

    /* renamed from: c */
    private int f925c;

    /* renamed from: d */
    private Mode f926d;

    /* renamed from: e */
    private ColorStateList f927e;

    /* renamed from: f */
    private Drawable f928f;

    /* renamed from: g */
    private int f929g;

    /* renamed from: h */
    private int f930h;

    /* renamed from: i */
    private int f931i;

    public Drawable getIcon() {
        return this.f928f;
    }

    public int getIconGravity() {
        return this.f931i;
    }

    public int getIconPadding() {
        return this.f925c;
    }

    public int getIconSize() {
        return this.f929g;
    }

    public ColorStateList getIconTint() {
        return this.f927e;
    }

    public Mode getIconTintMode() {
        return this.f926d;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    /* renamed from: b */
    private boolean m888b() {
        if (C0991u.m4220h(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m890d() {
        if (this.f924b == null || this.f924b.f939g) {
            return false;
        }
        return true;
    }

    public int getCornerRadius() {
        if (m890d()) {
            return this.f924b.f933a;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (m890d()) {
            return this.f924b.f938f;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m890d()) {
            return this.f924b.f937e;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m890d()) {
            return this.f924b.f934b;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m890d()) {
            return this.f924b.f936d;
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (m890d()) {
            return this.f924b.f935c;
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: c */
    private void m889c() {
        int i;
        int i2;
        if (this.f928f != null) {
            this.f928f = this.f928f.mutate();
            C0727a.m3105a(this.f928f, this.f927e);
            if (this.f926d != null) {
                C0727a.m3108a(this.f928f, this.f926d);
            }
            if (this.f929g != 0) {
                i = this.f929g;
            } else {
                i = this.f928f.getIntrinsicWidth();
            }
            if (this.f929g != 0) {
                i2 = this.f929g;
            } else {
                i2 = this.f928f.getIntrinsicHeight();
            }
            this.f928f.setBounds(this.f930h, 0, this.f930h + i, i2);
        }
        C1056n.m4569a((TextView) this, this.f928f, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setIconGravity(int i) {
        this.f931i = i;
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m890d()) {
            this.f924b.mo768a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1065a.m4641b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setCornerRadius(int i) {
        if (m890d()) {
            this.f924b.mo776c(i);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f928f != drawable) {
            this.f928f = drawable;
            m889c();
        }
    }

    public void setIconPadding(int i) {
        if (this.f925c != i) {
            this.f925c = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1065a.m4641b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f927e != colorStateList) {
            this.f927e = colorStateList;
            m889c();
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f926d != mode) {
            this.f926d = mode;
            m889c();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1065a.m4638a(getContext(), i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m890d()) {
            this.f924b.mo775b(colorStateList);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m890d()) {
            this.f924b.mo777c(colorStateList);
        }
    }

    public void setStrokeWidth(int i) {
        if (m890d()) {
            this.f924b.mo774b(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && m890d()) {
            this.f924b.mo772a(canvas);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m890d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f929g != i) {
            this.f929g = i;
            m889c();
        }
    }

    public void setRippleColorResource(int i) {
        if (m890d()) {
            setRippleColor(C1065a.m4638a(getContext(), i));
        }
    }

    public void setStrokeColorResource(int i) {
        if (m890d()) {
            setStrokeColor(C1065a.m4638a(getContext(), i));
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m890d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m890d()) {
            this.f924b.mo770a(colorStateList);
            return;
        }
        if (this.f924b != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (m890d()) {
            this.f924b.mo773a(mode);
            return;
        }
        if (this.f924b != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (m890d()) {
            if (drawable != getBackground()) {
                this.f924b.mo767a();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tc);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f928f != null && this.f931i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            if (this.f929g == 0) {
                i3 = this.f928f.getIntrinsicWidth();
            } else {
                i3 = this.f929g;
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C0991u.m4232l(this)) - i3) - this.f925c) - C0991u.m4229k(this)) / 2;
            if (m888b()) {
                measuredWidth = -measuredWidth;
            }
            if (this.f930h != measuredWidth) {
                this.f930h = measuredWidth;
                m889c();
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray a = C0296b.m1168a(context, attributeSet, R$styleable.MaterialButton, i, R.style.qn, new int[0]);
        this.f925c = a.getDimensionPixelSize(9, 0);
        this.f926d = C0297c.m1177a(a.getInt(12, -1), Mode.SRC_IN);
        this.f927e = C0272a.m1075a(getContext(), a, 11);
        this.f928f = C0272a.m1076b(getContext(), a, 7);
        this.f931i = a.getInteger(8, 1);
        this.f929g = a.getDimensionPixelSize(10, 0);
        this.f924b = new C0253b(this);
        this.f924b.mo771a(a);
        a.recycle();
        setCompoundDrawablePadding(this.f925c);
        m889c();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21 && this.f924b != null) {
            this.f924b.mo769a(i4 - i2, i3 - i);
        }
    }
}
