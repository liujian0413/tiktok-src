package com.zhihu.matisse.internal.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.p022v4.app.C0650v;
import android.support.p022v4.app.C0650v.C0651a;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0685d;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.loader.AlbumMediaLoader;
import java.lang.ref.WeakReference;

public class AlbumMediaCollection implements C0651a<Cursor> {

    /* renamed from: a */
    private WeakReference<Context> f121480a;

    /* renamed from: b */
    private C0650v f121481b;

    /* renamed from: c */
    private C47342a f121482c;

    /* renamed from: com.zhihu.matisse.internal.model.AlbumMediaCollection$a */
    public interface C47342a {
        /* renamed from: a */
        void mo119378a();

        /* renamed from: a */
        void mo119379a(Cursor cursor);
    }

    /* renamed from: a */
    public final void mo119374a() {
        if (this.f121481b != null) {
            this.f121481b.mo2482a(2);
        }
        this.f121482c = null;
    }

    /* renamed from: a */
    public final void mo2759a(C0685d<Cursor> dVar) {
        if (((Context) this.f121480a.get()) != null) {
            this.f121482c.mo119378a();
        }
    }

    /* renamed from: a */
    public final void mo119376a(Album album) {
        mo119377a(album, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo2760a(C0685d<Cursor> dVar, Cursor cursor) {
        if (((Context) this.f121480a.get()) != null) {
            this.f121482c.mo119379a(cursor);
        }
    }

    /* renamed from: a */
    public final C0685d<Cursor> mo2758a(int i, Bundle bundle) {
        Context context = (Context) this.f121480a.get();
        if (context == null) {
            return null;
        }
        Album album = (Album) bundle.getParcelable("args_album");
        if (album == null) {
            return null;
        }
        boolean z = false;
        if (album.mo119347b() && bundle.getBoolean("args_enable_capture", false)) {
            z = true;
        }
        return AlbumMediaLoader.m147815a(context, album, z);
    }

    /* renamed from: a */
    public final void mo119375a(FragmentActivity fragmentActivity, C47342a aVar) {
        this.f121480a = new WeakReference<>(fragmentActivity);
        this.f121481b = fragmentActivity.getSupportLoaderManager();
        this.f121482c = aVar;
    }

    /* renamed from: a */
    public final void mo119377a(Album album, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", z);
        this.f121481b.mo2480a(2, bundle, this);
    }
}
