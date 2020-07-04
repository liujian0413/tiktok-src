package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6308d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.feed.C28067ad;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.helper.C28416d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21088b;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.p1701e.C43216b;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44960f;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOld */
public class FeedLiveViewHolderOld implements C21088b, C28128aa, C28130ac {

    /* renamed from: d */
    public static WeakHashMap<Context, C6308d<SurfaceView>> f73972d = new WeakHashMap<>();

    /* renamed from: a */
    public Context f73973a;

    /* renamed from: b */
    View f73974b;

    /* renamed from: c */
    public C28169bn f73975c = C28169bn.m92466a(this.mRootView);

    /* renamed from: e */
    public boolean f73976e;

    /* renamed from: f */
    private final C28343z<C28318an> f73977f;

    /* renamed from: g */
    private C28067ad f73978g = new C28135ah();

    /* renamed from: h */
    private Aweme f73979h;
    RemoteImageView mCoverView;
    ViewStub mLiveStub;
    FrameLayout mRootView;

    /* renamed from: A */
    public final Aweme mo71542A() {
        return C28131ad.m92388a(this);
    }

    /* renamed from: B */
    public final boolean mo71517B() {
        return false;
    }

    /* renamed from: C */
    public final void mo71543C() {
    }

    /* renamed from: D */
    public final void mo71544D() {
    }

    /* renamed from: E */
    public final void mo71545E() {
    }

    /* renamed from: F */
    public final C28201af mo71518F() {
        return null;
    }

    /* renamed from: G */
    public final C28416d mo71546G() {
        return null;
    }

    /* renamed from: a */
    public final void mo71521a() {
    }

    /* renamed from: a */
    public final void mo65707a(int i) {
    }

    /* renamed from: a */
    public final void mo71547a(long j) {
    }

    /* renamed from: a */
    public final void mo71525a(C28308ad adVar) {
    }

    /* renamed from: a */
    public final void mo71548a(Aweme aweme, int i) {
        C28131ad.m92389a(this, aweme, i);
    }

    /* renamed from: a */
    public final void mo71549a(ShareCompleteEvent shareCompleteEvent) {
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
    }

    /* renamed from: a */
    public final void mo71550a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo71551a(Map map, int i) {
    }

    public final void au_() {
    }

    /* renamed from: b */
    public final C44960f mo71553b() {
        return null;
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo71528b(int i) {
    }

    /* renamed from: b */
    public final void mo71554b(Aweme aweme) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: c */
    public final void mo71555c() {
    }

    /* renamed from: c */
    public final void mo71530c(int i) {
    }

    /* renamed from: c */
    public final void mo71531c(Aweme aweme) {
    }

    /* renamed from: c */
    public final void mo67769c(boolean z) {
    }

    /* renamed from: d */
    public final void mo56928d() {
    }

    /* renamed from: d */
    public final void mo71556d(int i) {
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
    }

    /* renamed from: d */
    public final void mo71533d(boolean z) {
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
    }

    /* renamed from: e */
    public final void mo71535e(boolean z) {
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
    }

    /* renamed from: f */
    public final int mo65709f() {
        return BaseNotice.HASHTAG;
    }

    /* renamed from: f */
    public final void mo71558f(String str) {
    }

    /* renamed from: f */
    public final void mo71536f(boolean z) {
    }

    /* renamed from: g */
    public final int mo65710g() {
        return 2;
    }

    /* renamed from: g */
    public final void mo71559g(boolean z) {
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f73979h;
    }

    /* renamed from: h */
    public final void mo71560h(boolean z) {
    }

    /* renamed from: i */
    public final void mo65712i() {
    }

    /* renamed from: i */
    public final void mo71561i(boolean z) {
    }

    /* renamed from: j */
    public final void mo65713j() {
    }

    /* renamed from: j */
    public final void mo71562j(boolean z) {
    }

    /* renamed from: k */
    public final void mo65714k() {
    }

    /* renamed from: l */
    public final void mo65715l() {
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return this;
    }

    /* renamed from: n */
    public final int mo71563n() {
        return 2;
    }

    /* renamed from: o */
    public final C24716aj mo71564o() {
        return null;
    }

    /* renamed from: p */
    public final void mo71565p() {
    }

    /* renamed from: q */
    public final C28129ab mo71566q() {
        return null;
    }

    /* renamed from: r */
    public final boolean mo71567r() {
        return false;
    }

    /* renamed from: v */
    public final void mo71571v() {
    }

    /* renamed from: w */
    public final void mo71572w() {
    }

    /* renamed from: x */
    public final void mo71573x() {
    }

    /* renamed from: y */
    public final void mo71574y() {
    }

    /* renamed from: z */
    public final C43216b mo71575z() {
        return null;
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        m91790J();
    }

    /* renamed from: J */
    private void m91790J() {
        this.mCoverView.setVisibility(8);
    }

    /* renamed from: K */
    private void m91791K() {
        this.mCoverView.setVisibility(0);
    }

    /* renamed from: s */
    public final boolean mo71568s() {
        return this.f73975c.mo71769c();
    }

    /* renamed from: t */
    public final Surface mo71569t() {
        return this.f73975c.mo71768b();
    }

    /* renamed from: u */
    public final View mo71570u() {
        return this.f73975c.mo71767a();
    }

    /* renamed from: H */
    private void m91788H() {
        if (this.f73978g != null) {
            this.f73978g.mo71512a(this);
        }
    }

    /* renamed from: I */
    private void m91789I() {
        if (this.f73978g != null) {
            this.f73978g.mo71513b(this);
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        m91791K();
    }

    /* renamed from: e */
    public final void mo71557e(int i) {
        if (this.f73977f != null && this.f73979h != null) {
            this.f73977f.mo64929a(new C28318an(0, this.f73979h));
        }
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        this.f73979h = aweme;
        if (this.f73978g != null) {
            this.f73978g.mo71511a(this.f73973a, aweme);
        }
        m91788H();
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        C43238k.m137170a();
        if (C43238k.m137172a(mo65711h(), cVar.f115525d)) {
            m91789I();
        }
    }

    public FeedLiveViewHolderOld(View view, C28343z<C28318an> zVar) {
        ButterKnife.bind((Object) this, view);
        this.f73973a = view.getContext();
        this.f73977f = zVar;
        if (this.f73975c.f74270a != null) {
            this.f73975c.f74270a.setSurfaceTextureListener(new SurfaceTextureListener() {
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    if (!FeedLiveViewHolderOld.this.f73976e) {
                        return true;
                    }
                    return false;
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    FeedLiveViewHolderOld.this.f73976e = false;
                    FeedLiveViewHolderOld.this.mo71557e(0);
                }
            });
            return;
        }
        if (this.f73975c.f74271b != null) {
            this.f73975c.f74271b.getHolder().addCallback(new Callback() {
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    FeedLiveViewHolderOld.this.f73975c.f74272c = false;
                    if (FeedLiveViewHolderOld.f73972d.get(FeedLiveViewHolderOld.this.f73973a) != null) {
                        ((C6308d) FeedLiveViewHolderOld.f73972d.get(FeedLiveViewHolderOld.this.f73973a)).mo15144b(FeedLiveViewHolderOld.this.f73975c.f74271b);
                    }
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    FeedLiveViewHolderOld.this.f73975c.f74272c = true;
                    FeedLiveViewHolderOld.this.f73976e = false;
                    FeedLiveViewHolderOld.this.mo71557e(0);
                    if (FeedLiveViewHolderOld.f73972d.get(FeedLiveViewHolderOld.this.f73973a) == null) {
                        FeedLiveViewHolderOld.f73972d.put(FeedLiveViewHolderOld.this.f73973a, new C6308d());
                    }
                    ((C6308d) FeedLiveViewHolderOld.f73972d.get(FeedLiveViewHolderOld.this.f73973a)).mo15143a(FeedLiveViewHolderOld.this.f73975c.f74271b);
                }
            });
        }
    }
}
