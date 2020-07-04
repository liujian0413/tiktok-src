package com.p280ss.android.ugc.aweme.photomovie.edit.music;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.edit.C34870b;
import com.p280ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicAdapter.C34903c;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.C34918a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34850b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34858e;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34859f;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c.C42604a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule */
public class PhotoMovieMusicModule implements C0042h, OnClickListener, C34859f, C34903c {

    /* renamed from: a */
    public AmeActivity f91041a;

    /* renamed from: b */
    public C34918a f91042b;

    /* renamed from: c */
    public TextView f91043c;

    /* renamed from: d */
    public AVMusic f91044d;

    /* renamed from: e */
    public String f91045e;

    /* renamed from: f */
    private C34858e f91046f;

    /* renamed from: g */
    private C34870b f91047g;

    /* renamed from: h */
    private final C34906a f91048h;

    /* renamed from: i */
    private PhotoMovieMusicAdapter f91049i;

    /* renamed from: j */
    private String f91050j;

    /* renamed from: k */
    private String f91051k;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule$a */
    public interface C34906a {
        /* renamed from: a */
        void mo88336a(String str, AVMusic aVMusic, String str2);
    }

    /* renamed from: a */
    public final C34858e mo88388a() {
        return this.f91046f;
    }

    /* renamed from: b */
    private void m112507b() {
        C35563c.f93246i.mo103854a((Activity) this.f91041a, 1, C42604a.m135391a(this.f91041a.getString(R.string.zm), false, null, this.f91050j, this.f91051k), (C7562b<? super C42605d, C7581n>) new C34915i<Object,C7581n>(this), null);
    }

    /* renamed from: a */
    private void m112506a(AVMusic aVMusic) {
        if (this.f91049i != null && aVMusic != null) {
            this.f91049i.mo88443a(aVMusic);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo88452a(C42605d dVar) {
        if (this.f91048h != null) {
            this.f91048h.mo88336a(dVar.f110762b, dVar.f110763c, dVar.f110764d);
        }
        m112509c(dVar.f110763c, dVar.f110764d);
        return null;
    }

    /* renamed from: a */
    private void m112505a(View view) {
        String str;
        view.findViewById(R.id.azh).setOnClickListener(this);
        view.findViewById(R.id.azm).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.dzk)).setText(R.string.ea2);
        this.f91043c = (TextView) view.findViewById(R.id.dzj);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cqs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f91041a, 0, false));
        PhotoMovieContext a = this.f91042b.mo88460a();
        this.f91049i = new PhotoMovieMusicAdapter(a.mMusicList, a.mMusic);
        this.f91049i.f91028c = this;
        recyclerView.setAdapter(this.f91049i);
        TextView textView = this.f91043c;
        AmeActivity ameActivity = this.f91041a;
        Object[] objArr = new Object[1];
        if (a.mMusic == null) {
            str = "";
        } else {
            str = a.mMusic.getMusicName();
        }
        objArr[0] = str;
        textView.setText(ameActivity.getString(R.string.ea6, objArr));
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.azh) {
            AVMusic aVMusic = this.f91042b.mo88460a().mMusic;
            if (!(aVMusic == null || this.f91044d == null || (aVMusic.getMid() != null && TextUtils.equals(aVMusic.getMid(), this.f91044d.getMid())))) {
                m112508b(this.f91044d, this.f91045e);
                m112506a(this.f91044d);
            }
            this.f91047g.mo88399b(this);
            return;
        }
        if (id == R.id.azm) {
            this.f91047g.mo88399b(this);
        }
    }

    /* renamed from: c */
    private void m112509c(AVMusic aVMusic, String str) {
        m112508b(aVMusic, str);
        if (this.f91049i != null) {
            this.f91049i.mo88442a(0, aVMusic);
        }
    }

    /* renamed from: a */
    public final void mo88451a(AVMusic aVMusic, String str) {
        if (aVMusic == null && str == null) {
            m112507b();
        } else {
            m112508b(aVMusic, str);
        }
    }

    /* renamed from: b */
    private void m112508b(final AVMusic aVMusic, String str) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f91043c, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                PhotoMovieMusicModule.this.f91043c.setText(PhotoMovieMusicModule.this.f91041a.getString(R.string.ea6, new Object[]{aVMusic.getMusicName()}));
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f91043c, "alpha", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).after(ofFloat);
        animatorSet.start();
        this.f91042b.mo88466a(aVMusic, str);
    }

    public PhotoMovieMusicModule(AmeActivity ameActivity, FrameLayout frameLayout, C34918a aVar, C34870b bVar, C34906a aVar2, String str, String str2) {
        ameActivity.getLifecycle().mo55a(this);
        this.f91041a = ameActivity;
        this.f91050j = str;
        this.f91051k = str2;
        this.f91042b = aVar;
        this.f91047g = bVar;
        this.f91048h = aVar2;
        View inflate = LayoutInflater.from(this.f91041a).inflate(R.layout.al4, frameLayout, false);
        this.f91046f = new C34850b(frameLayout, inflate);
        this.f91046f.mo74846a((C34860g) new C34861a() {
            /* renamed from: a */
            public final void mo74767a() {
                super.mo74767a();
                PhotoMovieMusicModule.this.f91044d = PhotoMovieMusicModule.this.f91042b.mo88460a().mMusic;
                PhotoMovieMusicModule.this.f91045e = PhotoMovieMusicModule.this.f91042b.mo88460a().mMusicPath;
            }
        });
        m112505a(inflate);
    }
}
