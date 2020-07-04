package android.support.p029v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C1153b {

    /* renamed from: b */
    public Object f4151b;

    /* renamed from: c */
    public boolean f4152c;

    /* renamed from: android.support.v7.view.b$a */
    public interface C1154a {
        /* renamed from: a */
        void mo4340a(C1153b bVar);

        /* renamed from: a */
        boolean mo4341a(C1153b bVar, Menu menu);

        /* renamed from: a */
        boolean mo4342a(C1153b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo4343b(C1153b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo4394a();

    /* renamed from: a */
    public abstract void mo4395a(int i);

    /* renamed from: a */
    public abstract void mo4396a(View view);

    /* renamed from: a */
    public abstract void mo4397a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo4399b();

    /* renamed from: b */
    public abstract void mo4400b(int i);

    /* renamed from: b */
    public abstract void mo4401b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo4402c();

    /* renamed from: d */
    public abstract void mo4403d();

    /* renamed from: f */
    public abstract CharSequence mo4405f();

    /* renamed from: g */
    public abstract CharSequence mo4406g();

    /* renamed from: h */
    public boolean mo4407h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo4408i();

    /* renamed from: a */
    public void mo4398a(boolean z) {
        this.f4152c = z;
    }
}
