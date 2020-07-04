package com.p280ss.android.ugc.aweme.photomovie.edit.cover;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p029v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34870b;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.C34882a.C34883a;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34850b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34859f;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.Adapter;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C41661a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule */
public class PhotoMovieCoverModule implements C0042h, OnClickListener, C34859f, C41661a {

    /* renamed from: a */
    public PhotoMoviePlayerModule f90970a;

    /* renamed from: b */
    public ChooseVideoCoverView f90971b;

    /* renamed from: c */
    public Adapter f90972c;

    /* renamed from: d */
    public boolean f90973d;

    /* renamed from: e */
    private Context f90974e;

    /* renamed from: f */
    private C34858e f90975f;

    /* renamed from: g */
    private C34870b f90976g;

    /* renamed from: h */
    private C34881a f90977h;

    /* renamed from: i */
    private float f90978i;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.PhotoMovieCoverModule$a */
    public interface C34881a {
        /* renamed from: a */
        void mo88314a();

        /* renamed from: b */
        void mo88315b();
    }

    /* renamed from: a */
    public final C34858e mo88388a() {
        return this.f90975f;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void destroy() {
        if (this.f90972c != null) {
            this.f90972c.mo102330a();
        }
    }

    /* renamed from: a */
    public final void mo88410a(float f) {
        this.f90973d = true;
    }

    /* renamed from: a */
    public final void mo88411a(Bitmap bitmap) {
        if (this.f90971b != null) {
            this.f90971b.setVideoCoverFrameView(bitmap);
        }
    }

    /* renamed from: b */
    public final void mo88412b(float f) {
        this.f90970a.mo88463a((long) (((float) this.f90970a.mo88471d()) * f));
        this.f90970a.mo88470b(1);
    }

    /* renamed from: c */
    public final void mo88413c(float f) {
        C6907h.onEvent(MobClick.obtain().setEventName("choose_cover").setLabelName("cover_page").setJsonObject(C38510bb.m123095a().mo96481a("media_type", "pic_movie").mo96482b()));
        mo88414d(f);
    }

    /* renamed from: d */
    public final void mo88414d(float f) {
        long d = (long) (((float) this.f90970a.mo88471d()) * f);
        this.f90978i = ((float) (d / 100)) / 10.0f;
        this.f90970a.mo88463a(d);
        this.f90970a.mo88470b(2);
        this.f90970a.mo88462a(100, 7);
    }

    /* renamed from: a */
    private void m112441a(View view) {
        view.findViewById(R.id.azh).setOnClickListener(this);
        view.findViewById(R.id.azm).setOnClickListener(this);
        this.f90971b = (ChooseVideoCoverView) view.findViewById(R.id.vx);
        this.f90971b.setLayoutManager(new LinearLayoutManager(this.f90974e, 0, false));
        this.f90971b.setOnScrollListener(this);
        ((TextView) view.findViewById(R.id.dzk)).setText(R.string.ea1);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.azh) {
            if (this.f90976g != null) {
                this.f90976g.mo88399b(this);
            }
            this.f90973d = false;
            C6907h.onEvent(MobClick.obtain().setEventName("cancel_choose_cover").setLabelName("cover_page").setJsonObject(C38510bb.m123095a().mo96481a("media_type", "pic_movie").mo96482b()));
            this.f90977h.mo88315b();
            return;
        }
        if (id == R.id.azm) {
            this.f90970a.mo88460a().mCoverStartTm = this.f90978i;
            if (this.f90976g != null) {
                this.f90976g.mo88399b(this);
            }
            this.f90973d = false;
            C6907h.onEvent(MobClick.obtain().setEventName("confirm_choose_cover").setLabelName("cover_page").setJsonObject(C38510bb.m123095a().mo96481a("media_type", "pic_movie").mo96482b()));
            this.f90977h.mo88314a();
        }
    }

    public PhotoMovieCoverModule(C0043i iVar, Context context, FrameLayout frameLayout, PhotoMoviePlayerModule photoMoviePlayerModule, C34870b bVar, C34881a aVar) {
        this.f90974e = context;
        this.f90977h = aVar;
        this.f90970a = photoMoviePlayerModule;
        this.f90976g = bVar;
        iVar.getLifecycle().mo55a(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.al3, frameLayout, false);
        this.f90975f = new C34850b(frameLayout, inflate);
        m112441a(inflate);
        this.f90975f.mo74846a((C34860g) new C34861a() {
            /* renamed from: b */
            public final void mo74847b() {
                PhotoMovieCoverModule.this.f90970a.mo88470b(2);
            }

            /* renamed from: c */
            public final void mo74769c() {
                PhotoMovieCoverModule.this.f90970a.mo88470b(0);
            }

            /* renamed from: a */
            public final void mo74767a() {
                if (PhotoMovieCoverModule.this.f90972c == null) {
                    PhotoMovieCoverModule.this.f90972c = new Adapter((C38632c) new C34884b(PhotoMovieCoverModule.this.f90970a.mo88460a().mImageList, new C34883a()), (int) PhotoMovieCoverModule.this.f90971b.getOneThumbWidth(), PhotoMovieCoverModule.this.f90971b.getMeasuredHeight());
                    PhotoMovieCoverModule.this.f90971b.setAdapter(PhotoMovieCoverModule.this.f90972c);
                }
                PhotoMovieCoverModule.this.f90971b.mo102315a(0.0f);
                PhotoMovieCoverModule.this.mo88414d(0.0f);
                PhotoMovieCoverModule.this.f90971b.mo102314a();
            }
        });
    }
}
