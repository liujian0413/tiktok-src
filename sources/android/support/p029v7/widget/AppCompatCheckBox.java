package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.widget.C1058o;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
public class AppCompatCheckBox extends CheckBox implements C1058o {

    /* renamed from: a */
    private final C1392f f4595a;

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f4595a != null) {
            return this.f4595a.mo6482a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f4595a != null) {
            return this.f4595a.f5427a;
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        if (this.f4595a != null) {
            return this.f4595a.f5428b;
        }
        return null;
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1065a.m4641b(getContext(), i));
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f4595a != null) {
            this.f4595a.mo6484a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f4595a != null) {
            this.f4595a.mo6485a(mode);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f4595a != null) {
            this.f4595a.mo6483a();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.el);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4595a = new C1392f(this);
        this.f4595a.mo6486a(attributeSet, i);
    }
}
