package com.zhihu.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p022v4.app.C0650v;
import android.support.p022v4.app.C0650v.C0651a;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0685d;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.lang.ref.WeakReference;

public class AlbumCollection implements C0651a<Cursor> {

    /* renamed from: a */
    public int f121475a;

    /* renamed from: b */
    private WeakReference<Context> f121476b;

    /* renamed from: c */
    private C0650v f121477c;

    /* renamed from: d */
    private C47341a f121478d;

    /* renamed from: e */
    private boolean f121479e;

    /* renamed from: com.zhihu.matisse.internal.model.AlbumCollection$a */
    public interface C47341a {
        /* renamed from: a */
        void mo119372a();

        /* renamed from: a */
        void mo119373a(Cursor cursor);
    }

    /* renamed from: b */
    public final void mo119370b() {
        this.f121477c.mo2480a(1, null, this);
    }

    /* renamed from: a */
    public final void mo119367a() {
        if (this.f121477c != null) {
            this.f121477c.mo2482a(1);
        }
        this.f121478d = null;
    }

    /* renamed from: b */
    public final void mo119371b(Bundle bundle) {
        bundle.putInt("state_current_selection", this.f121475a);
    }

    /* renamed from: a */
    public final void mo119368a(Bundle bundle) {
        if (bundle != null) {
            this.f121475a = bundle.getInt("state_current_selection");
        }
    }

    /* renamed from: a */
    public final void mo2759a(C0685d<Cursor> dVar) {
        if (((Context) this.f121476b.get()) != null) {
            this.f121478d.mo119372a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo2760a(C0685d<Cursor> dVar, Cursor cursor) {
        if (((Context) this.f121476b.get()) != null && !this.f121479e) {
            this.f121479e = true;
            this.f121478d.mo119373a(cursor);
        }
    }

    /* renamed from: a */
    public final C0685d<Cursor> mo2758a(int i, Bundle bundle) {
        Context context = (Context) this.f121476b.get();
        if (context == null) {
            return null;
        }
        this.f121479e = false;
        return AlbumLoader.m147810a(context);
    }

    /* renamed from: a */
    public final void mo119369a(FragmentActivity fragmentActivity, C47341a aVar) {
        this.f121476b = new WeakReference<>(fragmentActivity);
        this.f121477c = fragmentActivity.getSupportLoaderManager();
        this.f121478d = aVar;
    }
}
