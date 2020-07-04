package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.widget.MenuPopupWindow;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.menu.n */
final class C1195n extends C1185g implements C1188i, OnKeyListener, OnItemClickListener, OnDismissListener {

    /* renamed from: e */
    private static final int f4420e = 2131492883;

    /* renamed from: a */
    final MenuPopupWindow f4421a;

    /* renamed from: b */
    final OnGlobalLayoutListener f4422b = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C1195n.this.mo4894e() && !C1195n.this.f4421a.f4821u) {
                View view = C1195n.this.f4423c;
                if (view == null || !view.isShown()) {
                    C1195n.this.dismiss();
                    return;
                }
                C1195n.this.f4421a.mo4892d();
            }
        }
    };

    /* renamed from: c */
    View f4423c;

    /* renamed from: d */
    ViewTreeObserver f4424d;

    /* renamed from: f */
    private final Context f4425f;

    /* renamed from: h */
    private final MenuBuilder f4426h;

    /* renamed from: i */
    private final C1181d f4427i;

    /* renamed from: j */
    private final boolean f4428j;

    /* renamed from: k */
    private final int f4429k;

    /* renamed from: l */
    private final int f4430l;

    /* renamed from: m */
    private final int f4431m;

    /* renamed from: n */
    private final OnAttachStateChangeListener f4432n = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C1195n.this.f4424d != null) {
                if (!C1195n.this.f4424d.isAlive()) {
                    C1195n.this.f4424d = view.getViewTreeObserver();
                }
                C1195n.this.f4424d.removeGlobalOnLayoutListener(C1195n.this.f4422b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private OnDismissListener f4433o;

    /* renamed from: p */
    private View f4434p;

    /* renamed from: q */
    private C1189a f4435q;

    /* renamed from: r */
    private boolean f4436r;

    /* renamed from: s */
    private boolean f4437s;

    /* renamed from: t */
    private int f4438t;

    /* renamed from: u */
    private int f4439u = 0;

    /* renamed from: v */
    private boolean f4440v;

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final void mo4885a(MenuBuilder menuBuilder) {
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        return null;
    }

    /* renamed from: f */
    public final ListView mo4895f() {
        return this.f4421a.mo4895f();
    }

    /* renamed from: d */
    public final void mo4892d() {
        if (!m5422h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void dismiss() {
        if (mo4894e()) {
            this.f4421a.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo4894e() {
        if (this.f4436r || !this.f4421a.mo4894e()) {
            return false;
        }
        return true;
    }

    public final void onDismiss() {
        this.f4436r = true;
        this.f4426h.close();
        if (this.f4424d != null) {
            if (!this.f4424d.isAlive()) {
                this.f4424d = this.f4423c.getViewTreeObserver();
            }
            this.f4424d.removeGlobalOnLayoutListener(this.f4422b);
            this.f4424d = null;
        }
        this.f4423c.removeOnAttachStateChangeListener(this.f4432n);
        if (this.f4433o != null) {
            this.f4433o.onDismiss();
        }
    }

    /* renamed from: h */
    private boolean m5422h() {
        boolean z;
        if (mo4894e()) {
            return true;
        }
        if (this.f4436r || this.f4434p == null) {
            return false;
        }
        this.f4423c = this.f4434p;
        this.f4421a.mo5480a((OnDismissListener) this);
        this.f4421a.f4816p = this;
        this.f4421a.mo5481a(true);
        View view = this.f4423c;
        if (this.f4424d == null) {
            z = true;
        } else {
            z = false;
        }
        this.f4424d = view.getViewTreeObserver();
        if (z) {
            this.f4424d.addOnGlobalLayoutListener(this.f4422b);
        }
        view.addOnAttachStateChangeListener(this.f4432n);
        this.f4421a.f4814n = view;
        this.f4421a.f4809i = this.f4439u;
        if (!this.f4437s) {
            this.f4438t = m5374a(this.f4427i, null, this.f4425f, this.f4429k);
            this.f4437s = true;
        }
        this.f4421a.mo5487c(this.f4438t);
        this.f4421a.mo5489e(2);
        this.f4421a.f4820t = this.f4406g;
        this.f4421a.mo4892d();
        ListView f = this.f4421a.mo4895f();
        f.setOnKeyListener(this);
        if (this.f4440v && this.f4426h.f4291d != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4425f).inflate(R.layout.s, f, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f4426h.f4291d);
            }
            frameLayout.setEnabled(false);
            f.addHeaderView(frameLayout, null, false);
        }
        this.f4421a.mo5249a((ListAdapter) this.f4427i);
        this.f4421a.mo4892d();
        return true;
    }

    /* renamed from: a */
    public final void mo4884a(int i) {
        this.f4439u = i;
    }

    /* renamed from: b */
    public final void mo4888b(int i) {
        this.f4421a.f4807g = i;
    }

    /* renamed from: c */
    public final void mo4890c(int i) {
        this.f4421a.mo5484b(i);
    }

    /* renamed from: b */
    public final void mo4889b(boolean z) {
        this.f4427i.f4395b = z;
    }

    /* renamed from: c */
    public final void mo4891c(boolean z) {
        this.f4440v = z;
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
        this.f4435q = aVar;
    }

    /* renamed from: a */
    public final void mo4886a(View view) {
        this.f4434p = view;
    }

    /* renamed from: a */
    public final void mo4887a(OnDismissListener onDismissListener) {
        this.f4433o = onDismissListener;
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        this.f4437s = false;
        if (this.f4427i != null) {
            this.f4427i.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            C1186h hVar = new C1186h(this.f4425f, subMenuBuilder, this.f4423c, this.f4428j, this.f4430l, this.f4431m);
            hVar.mo4920a(this.f4435q);
            hVar.mo4921a(C1185g.m5376b((MenuBuilder) subMenuBuilder));
            hVar.f4409c = this.f4433o;
            this.f4433o = null;
            this.f4426h.mo4722b(false);
            int i = this.f4421a.f4807g;
            int c = this.f4421a.mo5486c();
            if ((Gravity.getAbsoluteGravity(this.f4439u, C0991u.m4220h(this.f4434p)) & 7) == 5) {
                i += this.f4434p.getWidth();
            }
            if (hVar.mo4922a(i, c)) {
                if (this.f4435q != null) {
                    this.f4435q.mo4339a(subMenuBuilder);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder == this.f4426h) {
            dismiss();
            if (this.f4435q != null) {
                this.f4435q.mo4338a(menuBuilder, z);
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public C1195n(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f4425f = context;
        this.f4426h = menuBuilder;
        this.f4428j = z;
        this.f4427i = new C1181d(menuBuilder, LayoutInflater.from(context), this.f4428j, f4420e);
        this.f4430l = i;
        this.f4431m = i2;
        Resources resources = context.getResources();
        this.f4429k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f4434p = view;
        this.f4421a = new MenuPopupWindow(this.f4425f, null, this.f4430l, this.f4431m);
        menuBuilder.mo4705a((C1188i) this, context);
    }
}
