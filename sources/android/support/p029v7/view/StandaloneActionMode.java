package android.support.p029v7.view;

import android.content.Context;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.StandaloneActionMode */
public class StandaloneActionMode extends C1153b implements C1166a {

    /* renamed from: a */
    private Context f4137a;

    /* renamed from: d */
    private ActionBarContextView f4138d;

    /* renamed from: e */
    private C1154a f4139e;

    /* renamed from: f */
    private WeakReference<View> f4140f;

    /* renamed from: g */
    private boolean f4141g;

    /* renamed from: h */
    private boolean f4142h;

    /* renamed from: i */
    private MenuBuilder f4143i;

    /* renamed from: b */
    public final Menu mo4399b() {
        return this.f4143i;
    }

    /* renamed from: d */
    public final void mo4403d() {
        this.f4139e.mo4343b(this, this.f4143i);
    }

    /* renamed from: f */
    public final CharSequence mo4405f() {
        return this.f4138d.getTitle();
    }

    /* renamed from: g */
    public final CharSequence mo4406g() {
        return this.f4138d.getSubtitle();
    }

    /* renamed from: h */
    public final boolean mo4407h() {
        return this.f4138d.f4464g;
    }

    /* renamed from: a */
    public final MenuInflater mo4394a() {
        return new C1157e(this.f4138d.getContext());
    }

    /* renamed from: i */
    public final View mo4408i() {
        if (this.f4140f != null) {
            return (View) this.f4140f.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo4402c() {
        if (!this.f4141g) {
            this.f4141g = true;
            this.f4138d.sendAccessibilityEvent(32);
            this.f4139e.mo4340a(this);
        }
    }

    /* renamed from: a */
    public final void mo4397a(CharSequence charSequence) {
        this.f4138d.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public final void mo4401b(CharSequence charSequence) {
        this.f4138d.setTitle(charSequence);
    }

    /* renamed from: b */
    public final void mo4400b(int i) {
        mo4397a((CharSequence) this.f4137a.getString(i));
    }

    /* renamed from: a */
    public final void mo4395a(int i) {
        mo4401b((CharSequence) this.f4137a.getString(i));
    }

    /* renamed from: a */
    public final void mo1345a(MenuBuilder menuBuilder) {
        mo4403d();
        this.f4138d.mo4968a();
    }

    /* renamed from: a */
    public final void mo4396a(View view) {
        WeakReference<View> weakReference;
        this.f4138d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f4140f = weakReference;
    }

    /* renamed from: a */
    public final void mo4398a(boolean z) {
        super.mo4398a(z);
        this.f4138d.setTitleOptional(z);
    }

    /* renamed from: a */
    public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f4139e.mo4342a((C1153b) this, menuItem);
    }

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, C1154a aVar, boolean z) {
        this.f4137a = context;
        this.f4138d = actionBarContextView;
        this.f4139e = aVar;
        this.f4143i = new MenuBuilder(actionBarContextView.getContext()).mo4696a(1);
        this.f4143i.mo4702a((C1166a) this);
        this.f4142h = z;
    }
}
