package android.support.p029v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0953aa;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p022v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.p029v7.app.ActionBar.C1067a;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.C1152a;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.view.C1157e;
import android.support.p029v7.view.C1160f;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.ActionBarContainer;
import android.support.p029v7.widget.ActionBarContextView;
import android.support.p029v7.widget.ActionBarOverlayLayout;
import android.support.p029v7.widget.ActionBarOverlayLayout.C1203a;
import android.support.p029v7.widget.C1355ap;
import android.support.p029v7.widget.C1432v;
import android.support.p029v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.WindowDecorActionBar */
public class WindowDecorActionBar extends ActionBar implements C1203a {

    /* renamed from: s */
    static final /* synthetic */ boolean f3924s = (!WindowDecorActionBar.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f3925t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f3926u = new DecelerateInterpolator();

    /* renamed from: A */
    private int f3927A = -1;

    /* renamed from: B */
    private boolean f3928B;

    /* renamed from: C */
    private boolean f3929C;

    /* renamed from: D */
    private ArrayList<Object> f3930D = new ArrayList<>();

    /* renamed from: E */
    private boolean f3931E;

    /* renamed from: F */
    private int f3932F = 0;

    /* renamed from: G */
    private boolean f3933G;

    /* renamed from: H */
    private boolean f3934H = true;

    /* renamed from: I */
    private boolean f3935I;

    /* renamed from: a */
    Context f3936a;

    /* renamed from: b */
    ActionBarOverlayLayout f3937b;

    /* renamed from: c */
    ActionBarContainer f3938c;

    /* renamed from: d */
    C1432v f3939d;

    /* renamed from: e */
    ActionBarContextView f3940e;

    /* renamed from: f */
    View f3941f;

    /* renamed from: g */
    C1355ap f3942g;

    /* renamed from: h */
    ActionModeImpl f3943h;

    /* renamed from: i */
    C1153b f3944i;

    /* renamed from: j */
    C1154a f3945j;

    /* renamed from: k */
    boolean f3946k = true;

    /* renamed from: l */
    boolean f3947l;

    /* renamed from: m */
    boolean f3948m;

    /* renamed from: n */
    C1160f f3949n;

    /* renamed from: o */
    boolean f3950o;

    /* renamed from: p */
    final C1002z f3951p = new ViewPropertyAnimatorListenerAdapter() {
        /* renamed from: b */
        public final void mo3627b(View view) {
            if (WindowDecorActionBar.this.f3946k && WindowDecorActionBar.this.f3941f != null) {
                WindowDecorActionBar.this.f3941f.setTranslationY(0.0f);
                WindowDecorActionBar.this.f3938c.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.f3938c.setVisibility(8);
            WindowDecorActionBar.this.f3938c.setTransitioning(false);
            WindowDecorActionBar.this.f3949n = null;
            WindowDecorActionBar.this.mo4389h();
            if (WindowDecorActionBar.this.f3937b != null) {
                C0991u.m4243v(WindowDecorActionBar.this.f3937b);
            }
        }
    };

    /* renamed from: q */
    final C1002z f3952q = new ViewPropertyAnimatorListenerAdapter() {
        /* renamed from: b */
        public final void mo3627b(View view) {
            WindowDecorActionBar.this.f3949n = null;
            WindowDecorActionBar.this.f3938c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0953aa f3953r = new C0953aa() {
        /* renamed from: a */
        public final void mo3716a(View view) {
            ((View) WindowDecorActionBar.this.f3938c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f3954v;

    /* renamed from: w */
    private Activity f3955w;

    /* renamed from: x */
    private Dialog f3956x;

    /* renamed from: y */
    private ArrayList<TabImpl> f3957y = new ArrayList<>();

    /* renamed from: z */
    private TabImpl f3958z;

    /* renamed from: android.support.v7.app.WindowDecorActionBar$ActionModeImpl */
    public class ActionModeImpl extends C1153b implements C1166a {

        /* renamed from: d */
        private final Context f3963d;

        /* renamed from: e */
        private final MenuBuilder f3964e;

        /* renamed from: f */
        private C1154a f3965f;

        /* renamed from: g */
        private WeakReference<View> f3966g;

        /* renamed from: b */
        public final Menu mo4399b() {
            return this.f3964e;
        }

        /* renamed from: a */
        public final MenuInflater mo4394a() {
            return new C1157e(this.f3963d);
        }

        /* renamed from: h */
        public final boolean mo4407h() {
            return WindowDecorActionBar.this.f3940e.f4464g;
        }

        /* renamed from: f */
        public final CharSequence mo4405f() {
            return WindowDecorActionBar.this.f3940e.getTitle();
        }

        /* renamed from: g */
        public final CharSequence mo4406g() {
            return WindowDecorActionBar.this.f3940e.getSubtitle();
        }

        /* renamed from: i */
        public final View mo4408i() {
            if (this.f3966g != null) {
                return (View) this.f3966g.get();
            }
            return null;
        }

        /* renamed from: d */
        public final void mo4403d() {
            if (WindowDecorActionBar.this.f3943h == this) {
                this.f3964e.mo4735f();
                try {
                    this.f3965f.mo4343b(this, this.f3964e);
                } finally {
                    this.f3964e.mo4737g();
                }
            }
        }

        /* renamed from: e */
        public final boolean mo4404e() {
            this.f3964e.mo4735f();
            try {
                return this.f3965f.mo4341a((C1153b) this, (Menu) this.f3964e);
            } finally {
                this.f3964e.mo4737g();
            }
        }

        /* renamed from: c */
        public final void mo4402c() {
            if (WindowDecorActionBar.this.f3943h == this) {
                if (!WindowDecorActionBar.m4837a(WindowDecorActionBar.this.f3947l, WindowDecorActionBar.this.f3948m, false)) {
                    WindowDecorActionBar.this.f3944i = this;
                    WindowDecorActionBar.this.f3945j = this.f3965f;
                } else {
                    this.f3965f.mo4340a(this);
                }
                this.f3965f = null;
                WindowDecorActionBar.this.mo4390h(false);
                WindowDecorActionBar.this.f3940e.mo4996b();
                WindowDecorActionBar.this.f3939d.mo6196a().sendAccessibilityEvent(32);
                WindowDecorActionBar.this.f3937b.setHideOnContentScrollEnabled(WindowDecorActionBar.this.f3950o);
                WindowDecorActionBar.this.f3943h = null;
            }
        }

        /* renamed from: b */
        public final void mo4401b(CharSequence charSequence) {
            WindowDecorActionBar.this.f3940e.setTitle(charSequence);
        }

        /* renamed from: a */
        public final void mo4395a(int i) {
            mo4401b((CharSequence) WindowDecorActionBar.this.f3936a.getResources().getString(i));
        }

        /* renamed from: b */
        public final void mo4400b(int i) {
            mo4397a((CharSequence) WindowDecorActionBar.this.f3936a.getResources().getString(i));
        }

        /* renamed from: a */
        public final void mo1345a(MenuBuilder menuBuilder) {
            if (this.f3965f != null) {
                mo4403d();
                WindowDecorActionBar.this.f3940e.mo4968a();
            }
        }

        /* renamed from: a */
        public final void mo4396a(View view) {
            WindowDecorActionBar.this.f3940e.setCustomView(view);
            this.f3966g = new WeakReference<>(view);
        }

        /* renamed from: a */
        public final void mo4397a(CharSequence charSequence) {
            WindowDecorActionBar.this.f3940e.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public final void mo4398a(boolean z) {
            super.mo4398a(z);
            WindowDecorActionBar.this.f3940e.setTitleOptional(z);
        }

        /* renamed from: a */
        public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
            if (this.f3965f != null) {
                return this.f3965f.mo4342a((C1153b) this, menuItem);
            }
            return false;
        }

        public ActionModeImpl(Context context, C1154a aVar) {
            this.f3963d = context;
            this.f3965f = aVar;
            this.f3964e = new MenuBuilder(context).mo4696a(1);
            this.f3964e.mo4702a((C1166a) this);
        }
    }

    /* renamed from: android.support.v7.app.WindowDecorActionBar$TabImpl */
    public class TabImpl extends C1067a {

        /* renamed from: a */
        public int f3967a;

        /* renamed from: b */
        final /* synthetic */ WindowDecorActionBar f3968b;

        /* renamed from: c */
        private Drawable f3969c;

        /* renamed from: d */
        private CharSequence f3970d;

        /* renamed from: e */
        private CharSequence f3971e;

        /* renamed from: f */
        private View f3972f;

        /* renamed from: a */
        public final int mo4185a() {
            return this.f3967a;
        }

        /* renamed from: b */
        public final Drawable mo4186b() {
            return this.f3969c;
        }

        /* renamed from: c */
        public final CharSequence mo4187c() {
            return this.f3970d;
        }

        /* renamed from: d */
        public final View mo4188d() {
            return this.f3972f;
        }

        /* renamed from: f */
        public final CharSequence mo4190f() {
            return this.f3971e;
        }

        /* renamed from: e */
        public final void mo4189e() {
            this.f3968b.mo4386a((C1067a) this);
        }
    }

    /* renamed from: a */
    static boolean m4837a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: a */
    public final void mo4171a(boolean z) {
        m4835a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public final void mo4170a(CharSequence charSequence) {
        this.f3939d.mo6203a(charSequence);
    }

    /* renamed from: a */
    public final boolean mo4172a(int i, KeyEvent keyEvent) {
        if (this.f3943h == null) {
            return false;
        }
        Menu b = this.f3943h.mo4399b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: l */
    private int m4842l() {
        return this.f3939d.mo6221n();
    }

    /* renamed from: o */
    private boolean m4846o() {
        return C0991u.m4167D(this.f3938c);
    }

    /* renamed from: a */
    public final int mo4165a() {
        return this.f3939d.mo6220m();
    }

    /* renamed from: i */
    public final void mo4391i() {
        if (this.f3948m) {
            this.f3948m = false;
            m4840j(true);
        }
    }

    /* renamed from: j */
    public final void mo4392j() {
        if (!this.f3948m) {
            this.f3948m = true;
            m4840j(true);
        }
    }

    /* renamed from: k */
    public final void mo4393k() {
        if (this.f3949n != null) {
            this.f3949n.mo4600c();
            this.f3949n = null;
        }
    }

    /* renamed from: m */
    private void m4844m() {
        if (!this.f3933G) {
            this.f3933G = true;
            if (this.f3937b != null) {
                this.f3937b.setShowingForActionMode(true);
            }
            m4840j(false);
        }
    }

    /* renamed from: n */
    private void m4845n() {
        if (this.f3933G) {
            this.f3933G = false;
            if (this.f3937b != null) {
                this.f3937b.setShowingForActionMode(false);
            }
            m4840j(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo4389h() {
        if (this.f3945j != null) {
            this.f3945j.mo4340a(this.f3944i);
            this.f3944i = null;
            this.f3945j = null;
        }
    }

    /* renamed from: f */
    public final boolean mo4183f() {
        if (this.f3939d == null || !this.f3939d.mo6208c()) {
            return false;
        }
        this.f3939d.mo6209d();
        return true;
    }

    /* renamed from: b */
    public final Context mo4174b() {
        if (this.f3954v == null) {
            TypedValue typedValue = new TypedValue();
            this.f3936a.getTheme().resolveAttribute(R.attr.m, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3954v = new ContextThemeWrapper(this.f3936a, i);
            } else {
                this.f3954v = this.f3936a;
            }
        }
        return this.f3954v;
    }

    /* renamed from: b */
    public final void mo4387b(int i) {
        this.f3932F = i;
    }

    /* renamed from: g */
    public final void mo4388g(boolean z) {
        this.f3946k = z;
    }

    /* renamed from: b */
    public final void mo4175b(boolean z) {
        m4835a(0, 8);
    }

    /* renamed from: d */
    public final void mo4178d(boolean z) {
        if (!this.f3928B) {
            mo4171a(z);
        }
    }

    /* renamed from: e */
    public final void mo4180e(boolean z) {
        this.f3935I = z;
        if (!z && this.f3949n != null) {
            this.f3949n.mo4600c();
        }
    }

    /* renamed from: c */
    public final void mo4176c(boolean z) {
        if (this.f3937b.f4481b) {
            this.f3950o = true;
            this.f3937b.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: f */
    public final void mo4182f(boolean z) {
        if (z != this.f3929C) {
            this.f3929C = z;
            int size = this.f3930D.size();
            for (int i = 0; i < size; i++) {
                this.f3930D.get(i);
            }
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        this.f3956x = dialog;
        m4836a(dialog.getWindow().getDecorView());
    }

    /* renamed from: b */
    private static C1432v m4838b(View view) {
        String str;
        if (view instanceof C1432v) {
            return (C1432v) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    private void m4840j(boolean z) {
        if (m4837a(this.f3947l, this.f3948m, this.f3933G)) {
            if (!this.f3934H) {
                this.f3934H = true;
                m4841k(z);
            }
        } else if (this.f3934H) {
            this.f3934H = false;
            m4843l(z);
        }
    }

    /* renamed from: a */
    public final C1153b mo4166a(C1154a aVar) {
        if (this.f3943h != null) {
            this.f3943h.mo4402c();
        }
        this.f3937b.setHideOnContentScrollEnabled(false);
        this.f3940e.mo4997c();
        ActionModeImpl actionModeImpl = new ActionModeImpl(this.f3940e.getContext(), aVar);
        if (!actionModeImpl.mo4404e()) {
            return null;
        }
        this.f3943h = actionModeImpl;
        actionModeImpl.mo4403d();
        this.f3940e.mo4995a(actionModeImpl);
        mo4390h(true);
        this.f3940e.sendAccessibilityEvent(32);
        return actionModeImpl;
    }

    /* renamed from: i */
    private void m4839i(boolean z) {
        boolean z2;
        boolean z3;
        this.f3931E = z;
        if (!this.f3931E) {
            this.f3939d.mo6200a((C1355ap) null);
            this.f3938c.setTabContainer(this.f3942g);
        } else {
            this.f3938c.setTabContainer(null);
            this.f3939d.mo6200a(this.f3942g);
        }
        boolean z4 = true;
        if (m4842l() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3942g != null) {
            if (z2) {
                this.f3942g.setVisibility(0);
                if (this.f3937b != null) {
                    C0991u.m4243v(this.f3937b);
                }
            } else {
                this.f3942g.setVisibility(8);
            }
        }
        C1432v vVar = this.f3939d;
        if (this.f3931E || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        vVar.mo6204a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3937b;
        if (this.f3931E || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: a */
    public final void mo4167a(float f) {
        C0991u.m4230k((View) this.f3938c, f);
    }

    /* renamed from: h */
    public final void mo4390h(boolean z) {
        C0998y yVar;
        C0998y yVar2;
        if (z) {
            m4844m();
        } else {
            m4845n();
        }
        if (m4846o()) {
            if (z) {
                yVar = this.f3939d.mo6195a(4, 100);
                yVar2 = this.f3940e.mo4967a(0, 200);
            } else {
                yVar2 = this.f3939d.mo6195a(0, 200);
                yVar = this.f3940e.mo4967a(8, 100);
            }
            C1160f fVar = new C1160f();
            fVar.mo4595a(yVar, yVar2);
            fVar.mo4598a();
        } else if (z) {
            this.f3939d.mo6212e(4);
            this.f3940e.setVisibility(0);
        } else {
            this.f3939d.mo6212e(0);
            this.f3940e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m4836a(View view) {
        boolean z;
        this.f3937b = (ActionBarOverlayLayout) view.findViewById(R.id.a6k);
        if (this.f3937b != null) {
            this.f3937b.setActionBarVisibilityCallback(this);
        }
        this.f3939d = m4838b(view.findViewById(R.id.a4));
        this.f3940e = (ActionBarContextView) view.findViewById(R.id.ad);
        this.f3938c = (ActionBarContainer) view.findViewById(R.id.a6);
        if (this.f3939d == null || this.f3940e == null || this.f3938c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f3936a = this.f3939d.mo6205b();
        if ((this.f3939d.mo6220m() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3928B = true;
        }
        C1152a a = C1152a.m5114a(this.f3936a);
        a.mo4575f();
        m4839i(a.mo4573d());
        TypedArray obtainStyledAttributes = this.f3936a.obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.h, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            mo4176c(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            mo4167a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m4841k(boolean z) {
        if (this.f3949n != null) {
            this.f3949n.mo4600c();
        }
        this.f3938c.setVisibility(0);
        if (this.f3932F != 0 || (!this.f3935I && !z)) {
            this.f3938c.setAlpha(1.0f);
            this.f3938c.setTranslationY(0.0f);
            if (this.f3946k && this.f3941f != null) {
                this.f3941f.setTranslationY(0.0f);
            }
            this.f3952q.mo3627b(null);
        } else {
            this.f3938c.setTranslationY(0.0f);
            float f = (float) (-this.f3938c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f3938c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f3938c.setTranslationY(f);
            C1160f fVar = new C1160f();
            C0998y c = C0991u.m4238q(this.f3938c).mo3805c(0.0f);
            c.mo3799a(this.f3953r);
            fVar.mo4594a(c);
            if (this.f3946k && this.f3941f != null) {
                this.f3941f.setTranslationY(f);
                fVar.mo4594a(C0991u.m4238q(this.f3941f).mo3805c(0.0f));
            }
            fVar.mo4597a(f3926u);
            fVar.mo4593a(250);
            fVar.mo4596a(this.f3952q);
            this.f3949n = fVar;
            fVar.mo4598a();
        }
        if (this.f3937b != null) {
            C0991u.m4243v(this.f3937b);
        }
    }

    /* renamed from: l */
    private void m4843l(boolean z) {
        if (this.f3949n != null) {
            this.f3949n.mo4600c();
        }
        if (this.f3932F != 0 || (!this.f3935I && !z)) {
            this.f3951p.mo3627b(null);
            return;
        }
        this.f3938c.setAlpha(1.0f);
        this.f3938c.setTransitioning(true);
        C1160f fVar = new C1160f();
        float f = (float) (-this.f3938c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f3938c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0998y c = C0991u.m4238q(this.f3938c).mo3805c(f);
        c.mo3799a(this.f3953r);
        fVar.mo4594a(c);
        if (this.f3946k && this.f3941f != null) {
            fVar.mo4594a(C0991u.m4238q(this.f3941f).mo3805c(f));
        }
        fVar.mo4597a(f3925t);
        fVar.mo4593a(250);
        fVar.mo4596a(this.f3951p);
        this.f3949n = fVar;
        fVar.mo4598a();
    }

    /* renamed from: a */
    public final void mo4168a(int i) {
        this.f3939d.mo6210d(i);
    }

    /* renamed from: a */
    public final void mo4169a(Configuration configuration) {
        m4839i(C1152a.m5114a(this.f3936a).mo4573d());
    }

    /* renamed from: a */
    public final void mo4386a(C1067a aVar) {
        C0633q qVar;
        if (m4842l() != 2) {
            this.f3927A = aVar.mo4185a();
            return;
        }
        if (!(this.f3955w instanceof FragmentActivity) || this.f3939d.mo6196a().isInEditMode()) {
            qVar = null;
        } else {
            qVar = ((FragmentActivity) this.f3955w).getSupportFragmentManager().mo2645a().mo2582a();
        }
        if (this.f3958z != aVar) {
            this.f3942g.setTabSelected(aVar.mo4185a());
            this.f3958z = (TabImpl) aVar;
        } else if (this.f3958z != null) {
            this.f3942g.mo6360a(aVar.mo4185a());
        }
        if (qVar != null && !qVar.mo2614j()) {
            qVar.mo2604c();
        }
    }

    /* renamed from: a */
    private void m4835a(int i, int i2) {
        int m = this.f3939d.mo6220m();
        if ((i2 & 4) != 0) {
            this.f3928B = true;
        }
        this.f3939d.mo6207c((i & i2) | ((i2 ^ -1) & m));
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        this.f3955w = activity;
        View decorView = activity.getWindow().getDecorView();
        m4836a(decorView);
        if (!z) {
            this.f3941f = decorView.findViewById(16908290);
        }
    }
}
