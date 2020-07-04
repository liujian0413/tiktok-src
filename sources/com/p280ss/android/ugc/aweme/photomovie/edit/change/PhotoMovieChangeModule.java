package com.p280ss.android.ugc.aweme.photomovie.edit.change;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34870b;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.C34890a;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.C34890a.C34892a;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.C34890a.C34893b;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView.C34889a;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.C34918a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34850b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34859f;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule */
public class PhotoMovieChangeModule implements C0042h, OnClickListener, C34859f {

    /* renamed from: a */
    public Handler f90940a = new Handler();

    /* renamed from: b */
    public C34918a f90941b;

    /* renamed from: c */
    public ImageFrameView f90942c;

    /* renamed from: d */
    public ImageFrameView f90943d;

    /* renamed from: e */
    public int f90944e;

    /* renamed from: f */
    public Drawable f90945f;

    /* renamed from: g */
    public Drawable f90946g;

    /* renamed from: h */
    public C34878a f90947h;

    /* renamed from: i */
    private Context f90948i;

    /* renamed from: j */
    private C34858e f90949j;

    /* renamed from: k */
    private C34870b f90950k;

    /* renamed from: l */
    private TextView f90951l;

    /* renamed from: m */
    private TextView f90952m;

    /* renamed from: n */
    private ImageView f90953n;

    /* renamed from: o */
    private ImageView f90954o;

    /* renamed from: p */
    private ImageView f90955p;

    /* renamed from: q */
    private ImageView f90956q;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule$a */
    public interface C34878a {
        /* renamed from: a */
        void mo88342a(int i, int i2);
    }

    /* renamed from: a */
    public final C34858e mo88388a() {
        return this.f90949j;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f90940a.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public final void mo88402c() {
        this.f90954o.setAlpha(0.0f);
        this.f90943d.setAlpha(0.6f);
        this.f90951l.setAlpha(0.6f);
        this.f90942c.setAlpha(1.0f);
        this.f90953n.setAlpha(1.0f);
        this.f90952m.setAlpha(1.0f);
        this.f90956q.setImageDrawable(this.f90945f);
        this.f90955p.setImageDrawable(this.f90946g);
        this.f90941b.mo88461a(1);
    }

    /* renamed from: b */
    public final void mo88401b() {
        this.f90952m.setAlpha(0.6f);
        this.f90953n.setAlpha(0.0f);
        this.f90942c.setAlpha(0.6f);
        this.f90943d.setAlpha(1.0f);
        this.f90954o.setAlpha(1.0f);
        this.f90951l.setAlpha(1.0f);
        this.f90955p.setImageDrawable(this.f90945f);
        this.f90956q.setImageDrawable(this.f90946g);
        this.f90941b.mo88461a(0);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.azh) {
            if (this.f90944e != this.f90941b.mo88460a().mPlayType) {
                this.f90941b.mo88461a(this.f90944e);
            }
            this.f90950k.mo88399b(this);
            return;
        }
        if (id == R.id.azm) {
            this.f90950k.mo88399b(this);
            if (!(this.f90944e == this.f90941b.mo88460a().mPlayType || this.f90947h == null)) {
                this.f90947h.mo88342a(this.f90941b.mo88460a().mPlayType, this.f90944e);
            }
        } else if (id == R.id.azl) {
            if (this.f90941b.mo88460a().mPlayType != 1) {
                m112430a(1, this.f90954o, this.f90953n, this.f90943d, this.f90942c, this.f90951l, this.f90952m, this.f90956q, this.f90955p);
                this.f90941b.mo88461a(1);
            }
        } else if (id == R.id.azk && this.f90941b.mo88460a().mPlayType != 0) {
            m112430a(0, this.f90953n, this.f90954o, this.f90942c, this.f90943d, this.f90952m, this.f90951l, this.f90955p, this.f90956q);
            this.f90941b.mo88461a(0);
        }
    }

    /* renamed from: a */
    private void m112431a(View view) {
        view.findViewById(R.id.azh).setOnClickListener(this);
        view.findViewById(R.id.azm).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.dzk)).setText(R.string.e_y);
        this.f90953n = (ImageView) view.findViewById(R.id.azl);
        this.f90953n.setOnClickListener(this);
        this.f90954o = (ImageView) view.findViewById(R.id.azk);
        this.f90954o.setOnClickListener(this);
        this.f90942c = (ImageFrameView) view.findViewById(R.id.azo);
        this.f90943d = (ImageFrameView) view.findViewById(R.id.azn);
        this.f90952m = (TextView) view.findViewById(R.id.di0);
        this.f90951l = (TextView) view.findViewById(R.id.dhz);
        this.f90955p = (ImageView) view.findViewById(R.id.azj);
        this.f90956q = (ImageView) view.findViewById(R.id.azi);
        if (this.f90941b.mo88460a().mPlayType == 0) {
            mo88401b();
        } else {
            mo88402c();
        }
    }

    /* renamed from: a */
    public final void mo88400a(final ImageFrameView imageFrameView, final int[] iArr) {
        imageFrameView.mo88424a(m112432b(imageFrameView, iArr));
        imageFrameView.setOnLoadFinishListener(new C34889a() {
            /* renamed from: a */
            public final void mo88408a() {
                PhotoMovieChangeModule.this.f90940a.postDelayed(new Runnable() {
                    public final void run() {
                        PhotoMovieChangeModule.this.mo88400a(imageFrameView, iArr);
                    }
                }, 1000);
            }
        });
    }

    /* renamed from: b */
    private C34890a m112432b(ImageFrameView imageFrameView, int[] iArr) {
        return new C34892a(this.f90948i, iArr).mo88434a(80).mo88433a(1.0f).mo88436a(false).mo88435a((C34893b) imageFrameView).mo88437a();
    }

    public PhotoMovieChangeModule(C0043i iVar, Context context, FrameLayout frameLayout, C34918a aVar, C34870b bVar) {
        iVar.getLifecycle().mo55a(this);
        this.f90948i = context;
        this.f90941b = aVar;
        this.f90950k = bVar;
        int b = (int) C9738o.m28708b(context, 9.0f);
        int g = C42111b.f109618a.mo103550g();
        int f = C42111b.f109618a.mo103549f();
        this.f90945f = C38501ax.m123066a(f, f, 0, b);
        this.f90946g = C38501ax.m123066a(g, g, 0, b);
        View inflate = LayoutInflater.from(context).inflate(R.layout.al2, frameLayout, false);
        this.f90949j = new C34850b(frameLayout, inflate);
        m112431a(inflate);
        this.f90949j.mo74846a((C34860g) new C34861a() {
            /* renamed from: d */
            public final void mo74768d() {
                super.mo74768d();
                PhotoMovieChangeModule.this.f90942c.mo88422a();
                PhotoMovieChangeModule.this.f90943d.mo88422a();
            }

            /* renamed from: a */
            public final void mo74767a() {
                super.mo74767a();
                PhotoMovieChangeModule.this.f90944e = PhotoMovieChangeModule.this.f90941b.mo88460a().mPlayType;
                if (PhotoMovieChangeModule.this.f90944e == 0) {
                    PhotoMovieChangeModule.this.mo88401b();
                } else {
                    PhotoMovieChangeModule.this.mo88402c();
                }
                PhotoMovieChangeModule.this.mo88400a(PhotoMovieChangeModule.this.f90942c, C34879a.f90968a);
                PhotoMovieChangeModule.this.mo88400a(PhotoMovieChangeModule.this.f90943d, C34879a.f90969b);
            }
        });
    }

    /* renamed from: a */
    private void m112430a(final int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, ImageView imageView6) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{1.0f, 0.6f});
        ofFloat2.setDuration(100);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, "alpha", new float[]{1.0f, 0.6f});
        ofFloat3.setDuration(100);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        final ImageView imageView7 = imageView5;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                imageView7.setImageDrawable(PhotoMovieChangeModule.this.f90945f);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "alpha", new float[]{0.0f, 1.0f});
        ofFloat4.setDuration(200);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{0.6f, 1.0f});
        ofFloat5.setDuration(200);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView4, "alpha", new float[]{0.6f, 1.0f});
        ofFloat6.setDuration(200);
        animatorSet2.playTogether(new Animator[]{ofFloat4, ofFloat5, ofFloat6});
        final ImageView imageView8 = imageView6;
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                imageView8.setImageDrawable(PhotoMovieChangeModule.this.f90946g);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet2).after(animatorSet);
        int i2 = i;
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (i == 1) {
                    PhotoMovieChangeModule.this.mo88402c();
                } else {
                    PhotoMovieChangeModule.this.mo88401b();
                }
            }
        });
        animatorSet3.start();
    }
}
