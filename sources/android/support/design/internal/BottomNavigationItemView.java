package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0987q;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.widget.C1366aw;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BottomNavigationItemView extends FrameLayout implements C1191a {

    /* renamed from: a */
    private static final int[] f1089a = {16842912};

    /* renamed from: b */
    private final int f1090b;

    /* renamed from: c */
    private float f1091c;

    /* renamed from: d */
    private float f1092d;

    /* renamed from: e */
    private float f1093e;

    /* renamed from: f */
    private int f1094f;

    /* renamed from: g */
    private boolean f1095g;

    /* renamed from: h */
    private ImageView f1096h;

    /* renamed from: i */
    private final TextView f1097i;

    /* renamed from: j */
    private final TextView f1098j;

    /* renamed from: k */
    private int f1099k;

    /* renamed from: l */
    private MenuItemImpl f1100l;

    /* renamed from: m */
    private ColorStateList f1101m;

    /* renamed from: a */
    public final boolean mo1061a() {
        return false;
    }

    public MenuItemImpl getItemData() {
        return this.f1100l;
    }

    public int getItemPosition() {
        return this.f1099k;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemBackground(Drawable drawable) {
        C0991u.m4185a((View) this, drawable);
    }

    public void setItemPosition(int i) {
        this.f1099k = i;
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1101m = colorStateList;
        if (this.f1100l != null) {
            setIcon(this.f1100l.getIcon());
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C0683b.m2903a(getContext(), i);
        }
        setItemBackground(drawable);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1097i.setTextColor(colorStateList);
            this.f1098j.setTextColor(colorStateList);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f1100l != null && this.f1100l.isCheckable() && this.f1100l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1089a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0727a.m3116g(drawable).mutate();
            C0727a.m3105a(drawable, this.f1101m);
        }
        this.f1096h.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f1096h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f1096h.setLayoutParams(layoutParams);
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.f1094f != i) {
            this.f1094f = i;
            if (this.f1100l != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setChecked(this.f1100l.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        boolean z2;
        if (this.f1095g != z) {
            this.f1095g = z;
            if (this.f1100l != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setChecked(this.f1100l.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C1056n.m4567a(this.f1098j, i);
        m1091a(this.f1097i.getTextSize(), this.f1098j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C1056n.m4567a(this.f1097i, i);
        m1091a(this.f1097i.getTextSize(), this.f1098j.getTextSize());
    }

    public void setTitle(CharSequence charSequence) {
        this.f1097i.setText(charSequence);
        this.f1098j.setText(charSequence);
        if (this.f1100l == null || TextUtils.isEmpty(this.f1100l.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f1097i.setEnabled(z);
        this.f1098j.setEnabled(z);
        this.f1096h.setEnabled(z);
        if (z) {
            C0991u.m4189a((View) this, C0987q.m4161a(getContext(), 1002));
        } else {
            C0991u.m4189a((View) this, (C0987q) null);
        }
    }

    public void setChecked(boolean z) {
        this.f1098j.setPivotX((float) (this.f1098j.getWidth() / 2));
        this.f1098j.setPivotY((float) this.f1098j.getBaseline());
        this.f1097i.setPivotX((float) (this.f1097i.getWidth() / 2));
        this.f1097i.setPivotY((float) this.f1097i.getBaseline());
        switch (this.f1094f) {
            case -1:
                if (!this.f1095g) {
                    if (!z) {
                        m1093a(this.f1096h, this.f1090b, 49);
                        m1092a(this.f1098j, this.f1093e, this.f1093e, 4);
                        m1092a(this.f1097i, 1.0f, 1.0f, 0);
                        break;
                    } else {
                        m1093a(this.f1096h, (int) (((float) this.f1090b) + this.f1091c), 49);
                        m1092a(this.f1098j, 1.0f, 1.0f, 0);
                        m1092a(this.f1097i, this.f1092d, this.f1092d, 4);
                        break;
                    }
                } else {
                    if (z) {
                        m1093a(this.f1096h, this.f1090b, 49);
                        m1092a(this.f1098j, 1.0f, 1.0f, 0);
                    } else {
                        m1093a(this.f1096h, this.f1090b, 17);
                        m1092a(this.f1098j, 0.5f, 0.5f, 4);
                    }
                    this.f1097i.setVisibility(4);
                    break;
                }
            case 0:
                if (z) {
                    m1093a(this.f1096h, this.f1090b, 49);
                    m1092a(this.f1098j, 1.0f, 1.0f, 0);
                } else {
                    m1093a(this.f1096h, this.f1090b, 17);
                    m1092a(this.f1098j, 0.5f, 0.5f, 4);
                }
                this.f1097i.setVisibility(4);
                break;
            case 1:
                if (!z) {
                    m1093a(this.f1096h, this.f1090b, 49);
                    m1092a(this.f1098j, this.f1093e, this.f1093e, 4);
                    m1092a(this.f1097i, 1.0f, 1.0f, 0);
                    break;
                } else {
                    m1093a(this.f1096h, (int) (((float) this.f1090b) + this.f1091c), 49);
                    m1092a(this.f1098j, 1.0f, 1.0f, 0);
                    m1092a(this.f1097i, this.f1092d, this.f1092d, 4);
                    break;
                }
            case 2:
                m1093a(this.f1096h, this.f1090b, 17);
                this.f1098j.setVisibility(8);
                this.f1097i.setVisibility(8);
                break;
        }
        refreshDrawableState();
        setSelected(z);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m1091a(float f, float f2) {
        this.f1091c = f - f2;
        this.f1092d = (f2 * 1.0f) / f;
        this.f1093e = (f * 1.0f) / f2;
    }

    /* renamed from: a */
    public final void mo1060a(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.f1100l = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        C1366aw.m6763a(this, menuItemImpl.getTooltipText());
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    /* renamed from: a */
    private static void m1093a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1099k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.j_, this, true);
        setBackgroundResource(R.drawable.z3);
        this.f1090b = resources.getDimensionPixelSize(R.dimen.f3);
        this.f1096h = (ImageView) findViewById(R.id.ax9);
        this.f1097i = (TextView) findViewById(R.id.d7y);
        this.f1098j = (TextView) findViewById(R.id.bg2);
        C0991u.m4206c((View) this.f1097i, 2);
        C0991u.m4206c((View) this.f1098j, 2);
        setFocusable(true);
        m1091a(this.f1097i.getTextSize(), this.f1098j.getTextSize());
    }

    /* renamed from: a */
    private static void m1092a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }
}
