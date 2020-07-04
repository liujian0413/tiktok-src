package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.support.p029v7.view.menu.MenuBuilder.C1167b;
import android.support.p029v7.widget.ActionMenuView.C1212a;
import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.C1330aa;
import android.support.p029v7.widget.C1366aw;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements C1191a, C1212a, OnClickListener {

    /* renamed from: b */
    MenuItemImpl f4231b;

    /* renamed from: c */
    C1167b f4232c;

    /* renamed from: d */
    C1164b f4233d;

    /* renamed from: e */
    private CharSequence f4234e;

    /* renamed from: f */
    private Drawable f4235f;

    /* renamed from: g */
    private C1330aa f4236g;

    /* renamed from: h */
    private boolean f4237h;

    /* renamed from: i */
    private boolean f4238i;

    /* renamed from: j */
    private int f4239j;

    /* renamed from: k */
    private int f4240k;

    /* renamed from: l */
    private int f4241l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    class C1163a extends C1330aa {
        /* renamed from: a */
        public final C1194m mo4666a() {
            if (ActionMenuItemView.this.f4233d != null) {
                return ActionMenuItemView.this.f4233d.mo4668a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo4667b() {
            if (ActionMenuItemView.this.f4232c == null || !ActionMenuItemView.this.f4232c.mo4674a(ActionMenuItemView.this.f4231b)) {
                return false;
            }
            C1194m a = mo4666a();
            if (a == null || !a.mo4894e()) {
                return false;
            }
            return true;
        }

        public C1163a() {
            super(ActionMenuItemView.this);
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C1164b {
        /* renamed from: a */
        public abstract C1194m mo4668a();
    }

    /* renamed from: a */
    public final boolean mo1061a() {
        return true;
    }

    public MenuItemImpl getItemData() {
        return this.f4231b;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    /* renamed from: d */
    public final boolean mo4652d() {
        return mo4650b();
    }

    /* renamed from: b */
    public final boolean mo4650b() {
        if (!TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo4651c() {
        if (!mo4650b() || this.f4231b.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m5175e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m5176f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4234e);
        if (this.f4235f != null && (!this.f4231b.mo4790l() || (!this.f4237h && !this.f4238i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f4234e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f4231b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f4231b.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4231b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f4231b.getTitle();
            }
            C1366aw.m6763a(this, charSequence3);
            return;
        }
        C1366aw.m6763a(this, tooltipText);
    }

    public void setItemInvoker(C1167b bVar) {
        this.f4232c = bVar;
    }

    public void setPopupCallback(C1164b bVar) {
        this.f4233d = bVar;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4234e = charSequence;
        m5176f();
    }

    public void onClick(View view) {
        if (this.f4232c != null) {
            this.f4232c.mo4674a(this.f4231b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4237h = m5175e();
        m5176f();
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4238i != z) {
            this.f4238i = z;
            if (this.f4231b != null) {
                this.f4231b.mo4768g();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4231b.hasSubMenu() || this.f4236g == null || !this.f4236g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIcon(Drawable drawable) {
        this.f4235f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f4241l) {
                float f = ((float) this.f4241l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f4241l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f4241l) {
                float f2 = ((float) this.f4241l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f4241l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m5176f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1060a(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.f4231b = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.mo4756a((C1191a) this));
        setId(menuItemImpl.getItemId());
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f4236g == null) {
            this.f4236g = new C1163a();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean b = mo4650b();
        if (b && this.f4240k >= 0) {
            super.setPadding(this.f4240k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f4239j);
        } else {
            i3 = this.f4239j;
        }
        if (mode != 1073741824 && this.f4239j > 0 && measuredWidth < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!b && this.f4235f != null) {
            super.setPadding((getMeasuredWidth() - this.f4235f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f4237h = m5175e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, i, 0);
        this.f4239j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4241l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4240k = -1;
        setSaveEnabled(false);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f4240k = i;
        super.setPadding(i, i2, i3, i4);
    }
}
