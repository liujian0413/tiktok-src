package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.support.p029v7.widget.C1365av;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C1191a, SelectionBoundsAdjuster {

    /* renamed from: a */
    private MenuItemImpl f4256a;

    /* renamed from: b */
    private ImageView f4257b;

    /* renamed from: c */
    private RadioButton f4258c;

    /* renamed from: d */
    private TextView f4259d;

    /* renamed from: e */
    private CheckBox f4260e;

    /* renamed from: f */
    private TextView f4261f;

    /* renamed from: g */
    private ImageView f4262g;

    /* renamed from: h */
    private ImageView f4263h;

    /* renamed from: i */
    private LinearLayout f4264i;

    /* renamed from: j */
    private Drawable f4265j;

    /* renamed from: k */
    private int f4266k;

    /* renamed from: l */
    private Context f4267l;

    /* renamed from: m */
    private boolean f4268m;

    /* renamed from: n */
    private Drawable f4269n;

    /* renamed from: o */
    private boolean f4270o;

    /* renamed from: p */
    private int f4271p;

    /* renamed from: q */
    private LayoutInflater f4272q;

    /* renamed from: r */
    private boolean f4273r;

    /* renamed from: a */
    public final boolean mo1061a() {
        return false;
    }

    public MenuItemImpl getItemData() {
        return this.f4256a;
    }

    /* renamed from: b */
    private void m5206b() {
        this.f4257b = (ImageView) getInflater().inflate(R.layout.p, this, false);
        m5204a((View) this.f4257b, 0);
    }

    /* renamed from: c */
    private void m5207c() {
        this.f4258c = (RadioButton) getInflater().inflate(R.layout.r, this, false);
        m5203a(this.f4258c);
    }

    /* renamed from: d */
    private void m5208d() {
        this.f4260e = (CheckBox) getInflater().inflate(R.layout.o, this, false);
        m5203a(this.f4260e);
    }

    private LayoutInflater getInflater() {
        if (this.f4272q == null) {
            this.f4272q = LayoutInflater.from(getContext());
        }
        return this.f4272q;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0991u.m4185a((View) this, this.f4265j);
        this.f4259d = (TextView) findViewById(R.id.title);
        if (this.f4266k != -1) {
            this.f4259d.setTextAppearance(this.f4267l, this.f4266k);
        }
        this.f4261f = (TextView) findViewById(R.id.d6c);
        this.f4262g = (ImageView) findViewById(R.id.dd4);
        if (this.f4262g != null) {
            this.f4262g.setImageDrawable(this.f4269n);
        }
        this.f4263h = (ImageView) findViewById(R.id.asx);
        this.f4264i = (LinearLayout) findViewById(R.id.a1q);
    }

    /* renamed from: a */
    private void m5203a(View view) {
        m5204a(view, -1);
    }

    public void setForceShowIcon(boolean z) {
        this.f4273r = z;
        this.f4268m = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        if (this.f4262g != null) {
            ImageView imageView = this.f4262g;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f4256a.mo4767f()) {
            if (this.f4258c == null) {
                m5207c();
            }
            compoundButton = this.f4258c;
        } else {
            if (this.f4260e == null) {
                m5208d();
            }
            compoundButton = this.f4260e;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        if (this.f4263h != null) {
            ImageView imageView = this.f4263h;
            if (this.f4270o || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f4263h != null && this.f4263h.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f4263h.getLayoutParams();
            rect.top += this.f4263h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f4259d.setText(charSequence);
            if (this.f4259d.getVisibility() != 0) {
                this.f4259d.setVisibility(0);
            }
        } else if (this.f4259d.getVisibility() != 8) {
            this.f4259d.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f4258c != null || this.f4260e != null) {
            if (this.f4256a.mo4767f()) {
                if (this.f4258c == null) {
                    m5207c();
                }
                compoundButton2 = this.f4258c;
                compoundButton = this.f4260e;
            } else {
                if (this.f4260e == null) {
                    m5208d();
                }
                compoundButton2 = this.f4260e;
                compoundButton = this.f4258c;
            }
            if (z) {
                compoundButton2.setChecked(this.f4256a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f4260e != null) {
                    this.f4260e.setVisibility(8);
                }
                if (this.f4258c != null) {
                    this.f4258c.setVisibility(8);
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f4256a.mo4781h() || this.f4273r) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f4268m) {
            return;
        }
        if (this.f4257b != null || drawable != null || this.f4268m) {
            if (this.f4257b == null) {
                m5206b();
            }
            if (drawable != null || this.f4268m) {
                ImageView imageView = this.f4257b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f4257b.getVisibility() != 0) {
                    this.f4257b.setVisibility(0);
                }
            } else {
                this.f4257b.setVisibility(8);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.se);
    }

    /* renamed from: a */
    private void m5204a(View view, int i) {
        if (this.f4264i != null) {
            this.f4264i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    private void m5205a(boolean z, char c) {
        int i;
        if (!z || !this.f4256a.mo4766e()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f4261f.setText(this.f4256a.mo4763d());
        }
        if (this.f4261f.getVisibility() != i) {
            this.f4261f.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4257b != null && this.f4268m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f4257b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo1060a(MenuItemImpl menuItemImpl, int i) {
        this.f4256a = menuItemImpl;
        int i2 = 0;
        this.f4271p = 0;
        if (!menuItemImpl.isVisible()) {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(menuItemImpl.mo4756a((C1191a) this));
        setCheckable(menuItemImpl.isCheckable());
        m5205a(menuItemImpl.mo4766e(), menuItemImpl.mo4761c());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1365av a = C1365av.m6744a(getContext(), attributeSet, R$styleable.MenuView, i, 0);
        this.f4265j = a.mo6392a(5);
        this.f4266k = a.mo6405g(1, -1);
        this.f4268m = a.mo6394a(7, false);
        this.f4267l = context;
        this.f4269n = a.mo6392a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.jf, 0);
        this.f4270o = obtainStyledAttributes.hasValue(0);
        a.mo6393a();
        obtainStyledAttributes.recycle();
    }
}
