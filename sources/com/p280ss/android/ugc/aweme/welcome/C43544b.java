package com.p280ss.android.ugc.aweme.welcome;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.account.p947j.p948a.p949a.C21224a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.welcome.b */
public final class C43544b {

    /* renamed from: e */
    public static final C43545a f112751e = new C43545a(null);

    /* renamed from: a */
    public boolean f112752a;

    /* renamed from: b */
    public Aweme f112753b;

    /* renamed from: c */
    public View f112754c;

    /* renamed from: d */
    public C43546b f112755d;

    /* renamed from: f */
    private VideoViewComponent f112756f;

    /* renamed from: g */
    private RemoteImageView f112757g;

    /* renamed from: h */
    private C21224a f112758h;

    /* renamed from: i */
    private final C28228a f112759i = new C28228a();

    /* renamed from: j */
    private boolean f112760j;

    /* renamed from: k */
    private C43550f f112761k = new C43550f(this);

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$a */
    public static final class C43545a {
        private C43545a() {
        }

        public /* synthetic */ C43545a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$b */
    public interface C43546b {
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$c */
    public static final class C43547c implements C44963i {
        C43547c() {
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
        }

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$d */
    public static final class C43548d implements Callback {
        C43548d() {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$e */
    public static final class C43549e implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C43544b f112762a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C43549e(C43544b bVar) {
            this.f112762a = bVar;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f112762a.f112752a) {
                this.f112762a.f112752a = false;
                this.f112762a.mo105455c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.b$f */
    public static final class C43550f extends C43200c {

        /* renamed from: a */
        final /* synthetic */ C43544b f112763a;

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            super.mo63045a(eVar);
        }

        /* renamed from: b */
        public final void mo63047b(String str) {
            super.mo63047b(str);
        }

        C43550f(C43544b bVar) {
            this.f112763a = bVar;
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
            this.f112763a.mo105452a();
        }

        /* renamed from: a */
        public final void mo63044a(C44920d dVar) {
            super.mo63044a(dVar);
            this.f112763a.mo105454b();
        }

        /* renamed from: a */
        public final void mo63046a(String str) {
            super.mo63046a(str);
            this.f112763a.mo105454b();
        }
    }

    /* renamed from: a */
    public final void mo105452a() {
        RemoteImageView remoteImageView = this.f112757g;
        if (remoteImageView == null) {
            C7573i.m23583a("mCoverView");
        }
        remoteImageView.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo105454b() {
        RemoteImageView remoteImageView = this.f112757g;
        if (remoteImageView == null) {
            C7573i.m23583a("mCoverView");
        }
        remoteImageView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo105455c() {
        VideoViewComponent videoViewComponent = this.f112756f;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        C44962h hVar = videoViewComponent.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
        if (!hVar.mo107459c()) {
            this.f112752a = true;
            return;
        }
        int i = this.f112759i.f74354a;
        if (i == 0) {
            C21224a aVar = this.f112758h;
            if (aVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            aVar.mo57153a();
            this.f112752a = false;
            this.f112759i.f74354a = 2;
        } else if (i == 3) {
            mo105456d();
        }
    }

    /* renamed from: d */
    public final void mo105456d() {
        this.f112752a = false;
        int i = this.f112759i.f74354a;
        if (i == 0) {
            mo105455c();
        } else if (i == 3) {
            C21224a aVar = this.f112758h;
            if (aVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            aVar.mo57156c();
            this.f112759i.f74354a = 4;
        }
    }

    /* renamed from: e */
    public final void mo105457e() {
        this.f112752a = false;
        int i = this.f112759i.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C21224a aVar = this.f112758h;
        if (aVar == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        aVar.mo57155b();
        this.f112759i.f74354a = 3;
    }

    /* renamed from: f */
    public final void mo105458f() {
        this.f112752a = false;
        int i = this.f112759i.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C21224a aVar = this.f112758h;
        if (aVar == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        aVar.mo57157d();
        this.f112759i.f74354a = 0;
        mo105452a();
    }

    /* renamed from: g */
    private final void m138036g() {
        this.f112756f = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f112756f;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        View view = this.f112754c;
        if (view != null) {
            videoViewComponent.mo107432a((ViewGroup) view);
            VideoViewComponent videoViewComponent2 = this.f112756f;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107434a((C44963i) new C43549e(this));
            VideoViewComponent videoViewComponent3 = this.f112756f;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            this.f112758h = new C21224a(videoViewComponent3, this.f112761k);
            View findViewById = this.f112754c.findViewById(R.id.a4g);
            C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.cover)");
            this.f112757g = (RemoteImageView) findViewById;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C43544b(View view, C43546b bVar) {
        C7573i.m23587b(view, "mRootView");
        C7573i.m23587b(bVar, "mPlayCompleteListener");
        this.f112754c = view;
        this.f112755d = bVar;
        m138036g();
        this.f112754c.setTag(this);
    }

    /* renamed from: a */
    public final void mo105453a(Aweme aweme, boolean z) {
        Video video;
        C7573i.m23587b(aweme, "aweme");
        this.f112760j = true;
        this.f112753b = aweme;
        if (this.f112759i.f74354a == 2) {
            C21224a aVar = this.f112758h;
            if (aVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            aVar.mo57155b();
        }
        this.f112759i.f74354a = 0;
        C21224a aVar2 = this.f112758h;
        if (aVar2 == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        aVar2.mo57154a(aweme);
        Aweme aweme2 = this.f112753b;
        UrlModel urlModel = null;
        if (aweme2 != null) {
            video = aweme2.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            VideoViewComponent videoViewComponent = this.f112756f;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            C44962h hVar = videoViewComponent.f115582b;
            C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
            if (hVar.mo107454a() instanceof TextureView) {
                VideoViewComponent videoViewComponent2 = this.f112756f;
                if (videoViewComponent2 == null) {
                    C7573i.m23583a("mVideoView");
                }
                videoViewComponent2.f115582b.mo107455a((C44963i) new C43547c());
            }
            VideoViewComponent videoViewComponent3 = this.f112756f;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            C44962h hVar2 = videoViewComponent3.f115582b;
            C7573i.m23582a((Object) hVar2, "mVideoView.surfaceHolder");
            if (hVar2.mo107454a() instanceof SurfaceView) {
                VideoViewComponent videoViewComponent4 = this.f112756f;
                if (videoViewComponent4 == null) {
                    C7573i.m23583a("mVideoView");
                }
                C44962h hVar3 = videoViewComponent4.f115582b;
                C7573i.m23582a((Object) hVar3, "mVideoView.surfaceHolder");
                View a = hVar3.mo107454a();
                if (a != null) {
                    ((SurfaceView) a).getHolder().addCallback(new C43548d());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.SurfaceView");
                }
            }
        }
        if (this.f112760j) {
            RemoteImageView remoteImageView = this.f112757g;
            if (remoteImageView == null) {
                C7573i.m23583a("mCoverView");
            }
            C23323e.m76503a(remoteImageView, (int) R.drawable.f124312com);
        } else {
            RemoteImageView remoteImageView2 = this.f112757g;
            if (remoteImageView2 == null) {
                C7573i.m23583a("mCoverView");
            }
            Aweme aweme3 = this.f112753b;
            if (aweme3 != null) {
                Video video2 = aweme3.getVideo();
                if (video2 != null) {
                    urlModel = video2.getOriginCover();
                }
            }
            C23323e.m76524b(remoteImageView2, urlModel);
        }
        mo105452a();
    }
}
