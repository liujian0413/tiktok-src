package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.p022v4.content.res.C0700e;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.widget.C1366aw;
import android.support.p029v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C1191a {

    /* renamed from: d */
    private static final int[] f1140d = {16842912};

    /* renamed from: c */
    boolean f1141c;

    /* renamed from: g */
    private final int f1142g;

    /* renamed from: h */
    private boolean f1143h;

    /* renamed from: i */
    private final CheckedTextView f1144i;

    /* renamed from: j */
    private FrameLayout f1145j;

    /* renamed from: k */
    private MenuItemImpl f1146k;

    /* renamed from: l */
    private ColorStateList f1147l;

    /* renamed from: m */
    private boolean f1148m;

    /* renamed from: n */
    private Drawable f1149n;

    /* renamed from: o */
    private final C0939a f1150o;

    /* renamed from: a */
    public final boolean mo1061a() {
        return false;
    }

    public MenuItemImpl getItemData() {
        return this.f1146k;
    }

    /* renamed from: b */
    public final void mo1136b() {
        if (this.f1145j != null) {
            this.f1145j.removeAllViews();
        }
        this.f1144i.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: c */
    private boolean m1116c() {
        if (this.f1146k.getTitle() == null && this.f1146k.getIcon() == null && this.f1146k.getActionView() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m1117d() {
        if (m1116c()) {
            this.f1144i.setVisibility(8);
            if (this.f1145j != null) {
                LayoutParams layoutParams = (LayoutParams) this.f1145j.getLayoutParams();
                layoutParams.width = -1;
                this.f1145j.setLayoutParams(layoutParams);
            }
        } else {
            this.f1144i.setVisibility(0);
            if (this.f1145j != null) {
                LayoutParams layoutParams2 = (LayoutParams) this.f1145j.getLayoutParams();
                layoutParams2.width = -2;
                this.f1145j.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: e */
    private StateListDrawable m1118e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.g5, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f1140d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1143h = z;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f1144i.setCompoundDrawablePadding(i);
    }

    public void setTextAppearance(int i) {
        C1056n.m4567a((TextView) this.f1144i, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1144i.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1144i.setText(charSequence);
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f1144i.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f1146k != null && this.f1146k.isCheckable() && this.f1146k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1140d);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1141c != z) {
            this.f1141c = z;
            C0939a.m3969a((View) this.f1144i, 2048);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f1147l = colorStateList;
        if (this.f1147l != null) {
            z = true;
        } else {
            z = false;
        }
        this.f1148m = z;
        if (this.f1146k != null) {
            setIcon(this.f1146k.getIcon());
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1145j == null) {
                this.f1145j = (FrameLayout) ((ViewStub) findViewById(R.id.a7t)).inflate();
            }
            this.f1145j.removeAllViews();
            this.f1145j.addView(view);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1148m) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0727a.m3116g(drawable).mutate();
                C0727a.m3105a(drawable, this.f1147l);
            }
            drawable.setBounds(0, 0, this.f1142g, this.f1142g);
        } else if (this.f1143h) {
            if (this.f1149n == null) {
                this.f1149n = C0700e.m2981a(getResources(), R.drawable.bbp, getContext().getTheme());
                if (this.f1149n != null) {
                    this.f1149n.setBounds(0, 0, this.f1142g, this.f1142g);
                }
            }
            drawable = this.f1149n;
        }
        C1056n.m4569a((TextView) this.f1144i, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1060a(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.f1146k = menuItemImpl;
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            C0991u.m4185a((View) this, (Drawable) m1118e());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        C1366aw.m6763a(this, menuItemImpl.getTooltipText());
        m1117d();
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1150o = new C0939a() {
            /* renamed from: a */
            public final void mo1148a(View view, C0945c cVar) {
                super.mo1148a(view, cVar);
                cVar.mo3650a(NavigationMenuItemView.this.f1141c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.jl, this, true);
        this.f1142g = context.getResources().getDimensionPixelSize(R.dimen.fg);
        this.f1144i = (CheckedTextView) findViewById(R.id.a7u);
        this.f1144i.setDuplicateParentStateEnabled(true);
        C0991u.m4187a((View) this.f1144i, this.f1150o);
    }
}
