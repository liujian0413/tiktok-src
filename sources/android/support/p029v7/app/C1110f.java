package android.support.p029v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.C1162g;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.C1432v;
import android.support.p029v7.widget.Toolbar;
import android.support.p029v7.widget.Toolbar.C1325b;
import android.support.p029v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.f */
final class C1110f extends ActionBar {

    /* renamed from: a */
    C1432v f3974a;

    /* renamed from: b */
    boolean f3975b;

    /* renamed from: c */
    public Callback f3976c;

    /* renamed from: d */
    private boolean f3977d;

    /* renamed from: e */
    private boolean f3978e;

    /* renamed from: f */
    private ArrayList<Object> f3979f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f3980g = new Runnable() {
        public final void run() {
            C1110f.this.mo4409h();
        }
    };

    /* renamed from: h */
    private final C1325b f3981h = new C1325b() {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return C1110f.this.f3976c.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: android.support.v7.app.f$a */
    final class C1113a implements C1189a {

        /* renamed from: b */
        private boolean f3985b;

        C1113a() {
        }

        /* renamed from: a */
        public final boolean mo4339a(MenuBuilder menuBuilder) {
            if (C1110f.this.f3976c == null) {
                return false;
            }
            C1110f.this.f3976c.onMenuOpened(108, menuBuilder);
            return true;
        }

        /* renamed from: a */
        public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
            if (!this.f3985b) {
                this.f3985b = true;
                C1110f.this.f3974a.mo6219l();
                if (C1110f.this.f3976c != null) {
                    C1110f.this.f3976c.onPanelClosed(108, menuBuilder);
                }
                this.f3985b = false;
            }
        }
    }

    /* renamed from: android.support.v7.app.f$b */
    final class C1114b implements C1166a {
        /* renamed from: a */
        public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        C1114b() {
        }

        /* renamed from: a */
        public final void mo1345a(MenuBuilder menuBuilder) {
            if (C1110f.this.f3976c != null) {
                if (C1110f.this.f3974a.mo6214g()) {
                    C1110f.this.f3976c.onPanelClosed(108, menuBuilder);
                } else if (C1110f.this.f3976c.onPreparePanel(0, null, menuBuilder)) {
                    C1110f.this.f3976c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }

    /* renamed from: android.support.v7.app.f$c */
    class C1115c extends C1162g {
        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C1110f.this.f3974a.mo6205b());
            }
            return super.onCreatePanelView(i);
        }

        public C1115c(Callback callback) {
            super(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C1110f.this.f3975b) {
                C1110f.this.f3974a.mo6218k();
                C1110f.this.f3975b = true;
            }
            return onPreparePanel;
        }
    }

    /* renamed from: d */
    public final void mo4178d(boolean z) {
    }

    /* renamed from: e */
    public final void mo4180e(boolean z) {
    }

    /* renamed from: a */
    public final int mo4165a() {
        return this.f3974a.mo6220m();
    }

    /* renamed from: b */
    public final Context mo4174b() {
        return this.f3974a.mo6205b();
    }

    /* renamed from: c */
    public final boolean mo4177c() {
        return this.f3974a.mo6216i();
    }

    /* renamed from: d */
    public final boolean mo4179d() {
        return this.f3974a.mo6217j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo4184g() {
        this.f3974a.mo6196a().removeCallbacks(this.f3980g);
    }

    /* renamed from: i */
    private Menu m4928i() {
        if (!this.f3977d) {
            this.f3974a.mo6199a((C1189a) new C1113a(), (C1166a) new C1114b());
            this.f3977d = true;
        }
        return this.f3974a.mo6222o();
    }

    /* renamed from: e */
    public final boolean mo4181e() {
        this.f3974a.mo6196a().removeCallbacks(this.f3980g);
        C0991u.m4190a((View) this.f3974a.mo6196a(), this.f3980g);
        return true;
    }

    /* renamed from: f */
    public final boolean mo4183f() {
        if (!this.f3974a.mo6208c()) {
            return false;
        }
        this.f3974a.mo6209d();
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo4409h() {
        MenuBuilder menuBuilder;
        Menu i = m4928i();
        if (i instanceof MenuBuilder) {
            menuBuilder = (MenuBuilder) i;
        } else {
            menuBuilder = null;
        }
        if (menuBuilder != null) {
            menuBuilder.mo4735f();
        }
        try {
            i.clear();
            if (!this.f3976c.onCreatePanelMenu(0, i) || !this.f3976c.onPreparePanel(0, null, i)) {
                i.clear();
            }
            if (menuBuilder != null) {
                menuBuilder.mo4737g();
            }
        } catch (Throwable th) {
            if (menuBuilder != null) {
                menuBuilder.mo4737g();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo4169a(Configuration configuration) {
        super.mo4169a(configuration);
    }

    /* renamed from: a */
    public final void mo4167a(float f) {
        C0991u.m4230k((View) this.f3974a.mo6196a(), f);
    }

    /* renamed from: b */
    public final void mo4175b(boolean z) {
        m4927a(0, 8);
    }

    /* renamed from: f */
    public final void mo4182f(boolean z) {
        if (z != this.f3978e) {
            this.f3978e = z;
            int size = this.f3979f.size();
            for (int i = 0; i < size; i++) {
                this.f3979f.get(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo4168a(int i) {
        this.f3974a.mo6210d(i);
    }

    /* renamed from: a */
    public final void mo4170a(CharSequence charSequence) {
        this.f3974a.mo6203a(charSequence);
    }

    /* renamed from: a */
    public final void mo4171a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m4927a(i, 4);
    }

    /* renamed from: a */
    public final boolean mo4173a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo4177c();
        }
        return true;
    }

    /* renamed from: a */
    private void m4927a(int i, int i2) {
        this.f3974a.mo6207c((i & i2) | ((i2 ^ -1) & this.f3974a.mo6220m()));
    }

    /* renamed from: a */
    public final boolean mo4172a(int i, KeyEvent keyEvent) {
        int i2;
        Menu i3 = m4928i();
        if (i3 == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        i3.setQwertyMode(z);
        return i3.performShortcut(i, keyEvent, 0);
    }

    C1110f(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f3974a = new ToolbarWidgetWrapper(toolbar, false);
        this.f3976c = new C1115c(callback);
        this.f3974a.mo6202a(this.f3976c);
        toolbar.setOnMenuItemClickListener(this.f3981h);
        this.f3974a.mo6203a(charSequence);
    }
}
