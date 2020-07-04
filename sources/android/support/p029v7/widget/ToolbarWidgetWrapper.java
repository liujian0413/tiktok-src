package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p022v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.view.menu.ActionMenuItem;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.Toolbar.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window.Callback;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ToolbarWidgetWrapper */
public class ToolbarWidgetWrapper implements C1432v {

    /* renamed from: a */
    Toolbar f5184a;

    /* renamed from: b */
    CharSequence f5185b;

    /* renamed from: c */
    Callback f5186c;

    /* renamed from: d */
    boolean f5187d;

    /* renamed from: e */
    private int f5188e;

    /* renamed from: f */
    private View f5189f;

    /* renamed from: g */
    private View f5190g;

    /* renamed from: h */
    private Drawable f5191h;

    /* renamed from: i */
    private Drawable f5192i;

    /* renamed from: j */
    private Drawable f5193j;

    /* renamed from: k */
    private boolean f5194k;

    /* renamed from: l */
    private CharSequence f5195l;

    /* renamed from: m */
    private CharSequence f5196m;

    /* renamed from: n */
    private ActionMenuPresenter f5197n;

    /* renamed from: o */
    private int f5198o;

    /* renamed from: p */
    private int f5199p;

    /* renamed from: q */
    private Drawable f5200q;

    /* renamed from: a */
    public final ViewGroup mo6196a() {
        return this.f5184a;
    }

    /* renamed from: k */
    public final void mo6218k() {
        this.f5187d = true;
    }

    /* renamed from: m */
    public final int mo6220m() {
        return this.f5188e;
    }

    /* renamed from: n */
    public final int mo6221n() {
        return this.f5198o;
    }

    /* renamed from: a */
    public final void mo6204a(boolean z) {
        this.f5184a.setCollapsible(z);
    }

    /* renamed from: d */
    public final void mo6209d() {
        this.f5184a.collapseActionView();
    }

    /* renamed from: f */
    public final boolean mo6213f() {
        return this.f5184a.canShowOverflowMenu();
    }

    /* renamed from: g */
    public final boolean mo6214g() {
        return this.f5184a.isOverflowMenuShowing();
    }

    /* renamed from: h */
    public final boolean mo6215h() {
        return this.f5184a.isOverflowMenuShowPending();
    }

    /* renamed from: i */
    public final boolean mo6216i() {
        return this.f5184a.showOverflowMenu();
    }

    /* renamed from: j */
    public final boolean mo6217j() {
        return this.f5184a.hideOverflowMenu();
    }

    /* renamed from: l */
    public final void mo6219l() {
        this.f5184a.dismissPopupMenus();
    }

    /* renamed from: o */
    public final Menu mo6222o() {
        return this.f5184a.getMenu();
    }

    /* renamed from: e */
    public final CharSequence mo6211e() {
        return this.f5184a.getTitle();
    }

    /* renamed from: p */
    private int m6546p() {
        if (this.f5184a.getNavigationIcon() == null) {
            return 11;
        }
        this.f5200q = this.f5184a.getNavigationIcon();
        return 15;
    }

    /* renamed from: q */
    private void m6547q() {
        Drawable drawable;
        if ((this.f5188e & 2) == 0) {
            drawable = null;
        } else if ((this.f5188e & 1) == 0) {
            drawable = this.f5191h;
        } else if (this.f5192i != null) {
            drawable = this.f5192i;
        } else {
            drawable = this.f5191h;
        }
        this.f5184a.setLogo(drawable);
    }

    /* renamed from: r */
    private void m6548r() {
        Drawable drawable;
        if ((this.f5188e & 4) != 0) {
            Toolbar toolbar = this.f5184a;
            if (this.f5193j != null) {
                drawable = this.f5193j;
            } else {
                drawable = this.f5200q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f5184a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: s */
    private void m6549s() {
        if ((this.f5188e & 4) != 0) {
            if (TextUtils.isEmpty(this.f5196m)) {
                this.f5184a.setNavigationContentDescription(this.f5199p);
                return;
            }
            this.f5184a.setNavigationContentDescription(this.f5196m);
        }
    }

    /* renamed from: b */
    public final Context mo6205b() {
        return this.f5184a.getContext();
    }

    /* renamed from: c */
    public final boolean mo6208c() {
        return this.f5184a.hasExpandedActionView();
    }

    /* renamed from: b */
    private void m6539b(Drawable drawable) {
        this.f5192i = drawable;
        m6547q();
    }

    /* renamed from: c */
    private void m6541c(Drawable drawable) {
        this.f5193j = drawable;
        m6548r();
    }

    /* renamed from: e */
    private void m6544e(CharSequence charSequence) {
        this.f5196m = charSequence;
        m6549s();
    }

    /* renamed from: a */
    public final void mo6198a(Drawable drawable) {
        this.f5191h = drawable;
        m6547q();
    }

    /* renamed from: b */
    private void m6540b(CharSequence charSequence) {
        this.f5194k = true;
        m6542c(charSequence);
    }

    /* renamed from: c */
    private void m6542c(CharSequence charSequence) {
        this.f5185b = charSequence;
        if ((this.f5188e & 8) != 0) {
            this.f5184a.setTitle(charSequence);
        }
    }

    /* renamed from: d */
    private void m6543d(CharSequence charSequence) {
        this.f5195l = charSequence;
        if ((this.f5188e & 8) != 0) {
            this.f5184a.setSubtitle(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo6197a(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1065a.m4641b(mo6205b(), i);
        } else {
            drawable = null;
        }
        mo6198a(drawable);
    }

    /* renamed from: f */
    private void m6545f(int i) {
        if (i != this.f5199p) {
            this.f5199p = i;
            if (TextUtils.isEmpty(this.f5184a.getNavigationContentDescription())) {
                mo6210d(this.f5199p);
            }
        }
    }

    /* renamed from: d */
    public final void mo6210d(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = mo6205b().getString(i);
        }
        m6544e((CharSequence) str);
    }

    /* renamed from: e */
    public final void mo6212e(int i) {
        this.f5184a.setVisibility(i);
    }

    /* renamed from: a */
    private void m6538a(View view) {
        if (!(this.f5190g == null || (this.f5188e & 16) == 0)) {
            this.f5184a.removeView(this.f5190g);
        }
        this.f5190g = view;
        if (view != null && (this.f5188e & 16) != 0) {
            this.f5184a.addView(this.f5190g);
        }
    }

    /* renamed from: b */
    public final void mo6206b(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1065a.m4641b(mo6205b(), i);
        } else {
            drawable = null;
        }
        m6539b(drawable);
    }

    /* renamed from: c */
    public final void mo6207c(int i) {
        int i2 = this.f5188e ^ i;
        this.f5188e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m6549s();
                }
                m6548r();
            }
            if ((i2 & 3) != 0) {
                m6547q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f5184a.setTitle(this.f5185b);
                    this.f5184a.setSubtitle(this.f5195l);
                } else {
                    this.f5184a.setTitle((CharSequence) null);
                    this.f5184a.setSubtitle((CharSequence) null);
                }
            }
            if (!((i2 & 16) == 0 || this.f5190g == null)) {
                if ((i & 16) != 0) {
                    this.f5184a.addView(this.f5190g);
                    return;
                }
                this.f5184a.removeView(this.f5190g);
            }
        }
    }

    /* renamed from: a */
    public final void mo6200a(C1355ap apVar) {
        if (this.f5189f != null && this.f5189f.getParent() == this.f5184a) {
            this.f5184a.removeView(this.f5189f);
        }
        this.f5189f = apVar;
        if (apVar != null && this.f5198o == 2) {
            this.f5184a.addView(this.f5189f, 0);
            LayoutParams layoutParams = (LayoutParams) this.f5189f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f3703a = 8388691;
            apVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public final void mo6202a(Callback callback) {
        this.f5186c = callback;
    }

    /* renamed from: a */
    public final void mo6203a(CharSequence charSequence) {
        if (!this.f5194k) {
            m6542c(charSequence);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.b1, R.drawable.a0);
    }

    /* renamed from: a */
    public final C0998y mo6195a(final int i, long j) {
        float f;
        C0998y q = C0991u.m4238q(this.f5184a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return q.mo3797a(f).mo3798a(j).mo3800a((C1002z) new ViewPropertyAnimatorListenerAdapter() {

            /* renamed from: c */
            private boolean f5205c;

            /* renamed from: c */
            public final void mo3628c(View view) {
                this.f5205c = true;
            }

            /* renamed from: a */
            public final void mo3626a(View view) {
                ToolbarWidgetWrapper.this.f5184a.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo3627b(View view) {
                if (!this.f5205c) {
                    ToolbarWidgetWrapper.this.f5184a.setVisibility(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo6199a(C1189a aVar, C1166a aVar2) {
        this.f5184a.setMenuCallbacks(aVar, aVar2);
    }

    /* renamed from: a */
    public final void mo6201a(Menu menu, C1189a aVar) {
        if (this.f5197n == null) {
            this.f5197n = new ActionMenuPresenter(this.f5184a.getContext());
            this.f5197n.f4250h = R.id.ai;
        }
        this.f5197n.mo1113a(aVar);
        this.f5184a.setMenu((MenuBuilder) menu, this.f5197n);
    }

    private ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        boolean z2;
        this.f5184a = toolbar;
        this.f5185b = toolbar.getTitle();
        this.f5195l = toolbar.getSubtitle();
        if (this.f5185b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f5194k = z2;
        this.f5193j = toolbar.getNavigationIcon();
        C1365av a = C1365av.m6744a(toolbar.getContext(), null, R$styleable.ActionBar, R.attr.h, 0);
        this.f5200q = a.mo6392a(15);
        if (z) {
            CharSequence c = a.mo6398c(27);
            if (!TextUtils.isEmpty(c)) {
                m6540b(c);
            }
            CharSequence c2 = a.mo6398c(25);
            if (!TextUtils.isEmpty(c2)) {
                m6543d(c2);
            }
            Drawable a2 = a.mo6392a(20);
            if (a2 != null) {
                m6539b(a2);
            }
            Drawable a3 = a.mo6392a(17);
            if (a3 != null) {
                mo6198a(a3);
            }
            if (this.f5193j == null && this.f5200q != null) {
                m6541c(this.f5200q);
            }
            mo6207c(a.mo6390a(10, 0));
            int g = a.mo6405g(9, 0);
            if (g != 0) {
                m6538a(LayoutInflater.from(this.f5184a.getContext()).inflate(g, this.f5184a, false));
                mo6207c(this.f5188e | 16);
            }
            int f = a.mo6403f(13, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f5184a.getLayoutParams();
                layoutParams.height = f;
                this.f5184a.setLayoutParams(layoutParams);
            }
            int d = a.mo6399d(7, -1);
            int d2 = a.mo6399d(3, -1);
            if (d >= 0 || d2 >= 0) {
                this.f5184a.setContentInsetsRelative(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo6405g(28, 0);
            if (g2 != 0) {
                this.f5184a.setTitleTextAppearance(this.f5184a.getContext(), g2);
            }
            int g3 = a.mo6405g(26, 0);
            if (g3 != 0) {
                this.f5184a.setSubtitleTextAppearance(this.f5184a.getContext(), g3);
            }
            int g4 = a.mo6405g(22, 0);
            if (g4 != 0) {
                this.f5184a.setPopupTheme(g4);
            }
        } else {
            this.f5188e = m6546p();
        }
        a.mo6393a();
        m6545f(R.string.b1);
        this.f5196m = this.f5184a.getNavigationContentDescription();
        this.f5184a.setNavigationOnClickListener(new OnClickListener() {

            /* renamed from: a */
            final ActionMenuItem f5201a;

            {
                ActionMenuItem actionMenuItem = new ActionMenuItem(ToolbarWidgetWrapper.this.f5184a.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.f5185b);
                this.f5201a = actionMenuItem;
            }

            public final void onClick(View view) {
                if (ToolbarWidgetWrapper.this.f5186c != null && ToolbarWidgetWrapper.this.f5187d) {
                    ToolbarWidgetWrapper.this.f5186c.onMenuItemSelected(0, this.f5201a);
                }
            }
        });
    }
}
