package com.p280ss.android.ugc.aweme.photomovie.edit.player;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34857d;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule */
public class PhotoMoviePlayerModule implements C0042h, C34857d, C34918a {

    /* renamed from: a */
    private TextureView f91070a;

    /* renamed from: b */
    private PhotoMoviePlayerPresenter f91071b;

    /* renamed from: c */
    private C34856c f91072c;

    /* renamed from: c */
    public final C34856c mo88387c() {
        return this.f91072c;
    }

    /* renamed from: a */
    public final PhotoMovieContext mo88460a() {
        return this.f91071b.mo88460a();
    }

    /* renamed from: b */
    public final void mo88469b() {
        this.f91071b.f91075c = true;
    }

    /* renamed from: d */
    public final long mo88471d() {
        return this.f91071b.mo88476b();
    }

    /* renamed from: a */
    public final void mo88461a(int i) {
        this.f91071b.mo88461a(i);
    }

    /* renamed from: b */
    public final void mo88470b(int i) {
        this.f91071b.mo88477b(i);
    }

    /* renamed from: a */
    public final void mo88463a(long j) {
        this.f91071b.mo88473a(j);
    }

    /* renamed from: a */
    public final void mo88464a(C29296g gVar) {
        this.f91071b.mo88474a(gVar);
    }

    /* renamed from: a */
    public final void mo88465a(C34860g gVar) {
        ((C34919b) this.f91072c).f91083a = gVar;
    }

    /* renamed from: a */
    public final void mo88467a(String str) {
        this.f91071b.mo88467a(str);
    }

    /* renamed from: a */
    public final void mo88462a(int i, int i2) {
        this.f91071b.mo88472a(100, 7);
    }

    /* renamed from: a */
    public final void mo88466a(AVMusic aVMusic, String str) {
        this.f91071b.mo88466a(aVMusic, str);
    }

    public PhotoMoviePlayerModule(C0043i iVar, FrameLayout frameLayout, PhotoMovieContext photoMovieContext) {
        iVar.getLifecycle().mo55a(this);
        this.f91070a = (TextureView) frameLayout.findViewById(R.id.cbd);
        this.f91072c = new C34919b(frameLayout, this.f91070a);
        this.f91071b = new PhotoMoviePlayerPresenter(iVar, this.f91070a, photoMovieContext);
    }

    /* renamed from: a */
    public final void mo88468a(String str, String str2, float f) {
        this.f91071b.mo88475a(str, str2, f);
    }
}
