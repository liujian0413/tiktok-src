package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.widget.C1058o;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatRadioButton */
public class AppCompatRadioButton extends RadioButton implements C1058o {

    /* renamed from: a */
    private final C1392f f4607a;

    /* renamed from: b */
    private final C1418m f4608b;

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f4607a != null) {
            return this.f4607a.mo6482a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f4607a != null) {
            return this.f4607a.f5427a;
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        if (this.f4607a != null) {
            return this.f4607a.f5428b;
        }
        return null;
    }

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1065a.m4641b(getContext(), i));
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f4607a != null) {
            this.f4607a.mo6484a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f4607a != null) {
            this.f4607a.mo6485a(mode);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f4607a != null) {
            this.f4607a.mo6483a();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xe);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4607a = new C1392f(this);
        this.f4607a.mo6486a(attributeSet, i);
        this.f4608b = new C1418m(this);
        this.f4608b.mo6557a(attributeSet, i);
    }
}
