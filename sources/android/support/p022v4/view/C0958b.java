package android.support.p022v4.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.b */
public abstract class C0958b {

    /* renamed from: a */
    public final Context f3347a;

    /* renamed from: b */
    public C0959a f3348b;

    /* renamed from: c */
    private C0960b f3349c;

    /* renamed from: android.support.v4.view.b$a */
    public interface C0959a {
        /* renamed from: b */
        void mo3739b(boolean z);
    }

    /* renamed from: android.support.v4.view.b$b */
    public interface C0960b {
        /* renamed from: a */
        void mo3740a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo3729a();

    /* renamed from: a */
    public void mo3732a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo3734b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo3735c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo3736d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo3737e() {
        return false;
    }

    /* renamed from: f */
    public final void mo3738f() {
        this.f3349c = null;
        this.f3348b = null;
    }

    public C0958b(Context context) {
        this.f3347a = context;
    }

    /* renamed from: a */
    public View mo3730a(MenuItem menuItem) {
        return mo3729a();
    }

    /* renamed from: a */
    public void mo3731a(C0960b bVar) {
        this.f3349c = bVar;
    }

    /* renamed from: a */
    public final void mo3733a(boolean z) {
        if (this.f3348b != null) {
            this.f3348b.mo3739b(z);
        }
    }
}
