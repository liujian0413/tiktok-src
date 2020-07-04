package com.p280ss.android.ugc.aweme.comment.share;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.comment.share.C24252f.C24253a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.share.e */
public final class C24245e {

    /* renamed from: g */
    public static final C24246a f63975g = new C24246a(null);

    /* renamed from: a */
    public VideoViewComponent f63976a;

    /* renamed from: b */
    public boolean f63977b;

    /* renamed from: c */
    public Aweme f63978c;

    /* renamed from: d */
    public float f63979d = 1.7777778f;

    /* renamed from: e */
    public View f63980e;

    /* renamed from: f */
    public C24247b f63981f;

    /* renamed from: h */
    private C24244d f63982h;

    /* renamed from: i */
    private final C28228a f63983i = new C28228a();

    /* renamed from: j */
    private C24251f f63984j = new C24251f(this);

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$a */
    public static final class C24246a {
        private C24246a() {
        }

        public /* synthetic */ C24246a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$b */
    public interface C24247b {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$c */
    public static final class C24248c implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C24245e f63985a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C24248c(C24245e eVar) {
            this.f63985a = eVar;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            C44962h hVar = C24245e.m79632a(this.f63985a).f115582b;
            C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
            C34204g.m110444a(i, i2, (TextureView) hVar.mo107454a(), this.f63985a.f63979d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$d */
    public static final class C24249d implements Callback {

        /* renamed from: a */
        final /* synthetic */ C24245e f63986a;

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        C24249d(C24245e eVar) {
            this.f63986a = eVar;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C44962h hVar = C24245e.m79632a(this.f63986a).f115582b;
            C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
            C24253a.m79648a(i2, i3, (SurfaceView) hVar.mo107454a(), this.f63986a.f63979d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$e */
    public static final class C24250e implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C24245e f63987a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C24250e(C24245e eVar) {
            this.f63987a = eVar;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f63987a.f63977b) {
                this.f63987a.f63977b = false;
                this.f63987a.mo63032a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.e$f */
    public static final class C24251f extends C43200c {

        /* renamed from: a */
        final /* synthetic */ C24245e f63988a;

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
        }

        /* renamed from: b */
        public final void mo63047b(String str) {
            super.mo63047b(str);
        }

        C24251f(C24245e eVar) {
            this.f63988a = eVar;
        }

        /* renamed from: a */
        public final void mo63044a(C44920d dVar) {
            super.mo63044a(dVar);
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            super.mo63045a(eVar);
        }

        /* renamed from: a */
        public final void mo63046a(String str) {
            super.mo63046a(str);
        }
    }

    /* renamed from: a */
    public final void mo63032a() {
        VideoViewComponent videoViewComponent = this.f63976a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        C44962h hVar = videoViewComponent.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
        if (!hVar.mo107459c()) {
            this.f63977b = true;
            return;
        }
        int i = this.f63983i.f74354a;
        if (i == 0) {
            C24244d dVar = this.f63982h;
            if (dVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            dVar.mo63027a();
            this.f63977b = false;
            this.f63983i.f74354a = 2;
        } else if (i == 3) {
            mo63034b();
        }
    }

    /* renamed from: b */
    public final void mo63034b() {
        this.f63977b = false;
        int i = this.f63983i.f74354a;
        if (i == 0) {
            mo63032a();
        } else if (i == 3) {
            C24244d dVar = this.f63982h;
            if (dVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            dVar.mo63030c();
            this.f63983i.f74354a = 4;
        }
    }

    /* renamed from: c */
    public final void mo63035c() {
        this.f63977b = false;
        int i = this.f63983i.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C24244d dVar = this.f63982h;
        if (dVar == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        dVar.mo63029b();
        this.f63983i.f74354a = 3;
    }

    /* renamed from: d */
    public final void mo63036d() {
        this.f63977b = false;
        switch (this.f63983i.f74354a) {
            case 1:
            case 2:
            case 3:
            case 4:
                C24244d dVar = this.f63982h;
                if (dVar == null) {
                    C7573i.m23583a("mPlayVideoHelper");
                }
                dVar.mo63031d();
                this.f63983i.f74354a = 0;
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    private final void m79633e() {
        this.f63976a = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f63976a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        View view = this.f63980e;
        if (view != null) {
            videoViewComponent.mo107432a((ViewGroup) view);
            VideoViewComponent videoViewComponent2 = this.f63976a;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107434a((C44963i) new C24250e(this));
            VideoViewComponent videoViewComponent3 = this.f63976a;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            this.f63982h = new C24244d(videoViewComponent3, this.f63984j);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoViewComponent m79632a(C24245e eVar) {
        VideoViewComponent videoViewComponent = eVar.f63976a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        return videoViewComponent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63033a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            r3.f63978c = r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f63978c
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x001b
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 != 0) goto L_0x0021
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0021:
            int r0 = r0.intValue()
            float r0 = (float) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f63978c
            if (r2 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            if (r2 == 0) goto L_0x0039
            int r2 = r2.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            if (r2 != 0) goto L_0x003f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003f:
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r0 = r0 / r2
            r3.f63979d = r0
            com.ss.android.ugc.aweme.feed.b.a r0 = r3.f63983i
            int r0 = r0.f74354a
            r2 = 2
            if (r0 != r2) goto L_0x005a
            com.ss.android.ugc.aweme.comment.share.d r0 = r3.f63982h
            if (r0 != 0) goto L_0x0057
            java.lang.String r2 = "mPlayVideoHelper"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0057:
            r0.mo63029b()
        L_0x005a:
            com.ss.android.ugc.aweme.feed.b.a r0 = r3.f63983i
            r2 = 0
            r0.f74354a = r2
            com.ss.android.ugc.aweme.comment.share.d r0 = r3.f63982h
            if (r0 != 0) goto L_0x0068
            java.lang.String r2 = "mPlayVideoHelper"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0068:
            r0.mo63028a(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3.f63978c
            if (r4 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.feed.model.Video r1 = r4.getVideo()
        L_0x0073:
            if (r1 == 0) goto L_0x00e9
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4 = r3.f63976a
            if (r4 != 0) goto L_0x007e
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x007e:
            com.ss.android.ugc.playerkit.videoview.h r4 = r4.f115582b
            java.lang.String r0 = "mVideoView.surfaceHolder"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            android.view.View r4 = r4.mo107454a()
            boolean r4 = r4 instanceof android.view.TextureView
            if (r4 == 0) goto L_0x00a2
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4 = r3.f63976a
            if (r4 != 0) goto L_0x0096
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0096:
            com.ss.android.ugc.playerkit.videoview.h r4 = r4.f115582b
            com.ss.android.ugc.aweme.comment.share.e$c r0 = new com.ss.android.ugc.aweme.comment.share.e$c
            r0.<init>(r3)
            com.ss.android.ugc.playerkit.videoview.i r0 = (com.p280ss.android.ugc.playerkit.videoview.C44963i) r0
            r4.mo107455a(r0)
        L_0x00a2:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4 = r3.f63976a
            if (r4 != 0) goto L_0x00ab
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00ab:
            com.ss.android.ugc.playerkit.videoview.h r4 = r4.f115582b
            java.lang.String r0 = "mVideoView.surfaceHolder"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            android.view.View r4 = r4.mo107454a()
            boolean r4 = r4 instanceof android.view.SurfaceView
            if (r4 == 0) goto L_0x00e9
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r4 = r3.f63976a
            if (r4 != 0) goto L_0x00c3
            java.lang.String r0 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00c3:
            com.ss.android.ugc.playerkit.videoview.h r4 = r4.f115582b
            java.lang.String r0 = "mVideoView.surfaceHolder"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            android.view.View r4 = r4.mo107454a()
            if (r4 == 0) goto L_0x00e1
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4
            android.view.SurfaceHolder r4 = r4.getHolder()
            com.ss.android.ugc.aweme.comment.share.e$d r0 = new com.ss.android.ugc.aweme.comment.share.e$d
            r0.<init>(r3)
            android.view.SurfaceHolder$Callback r0 = (android.view.SurfaceHolder.Callback) r0
            r4.addCallback(r0)
            goto L_0x00e9
        L_0x00e1:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.SurfaceView"
            r4.<init>(r0)
            throw r4
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.share.C24245e.mo63033a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C24245e(View view, C24247b bVar) {
        C7573i.m23587b(view, "mRootView");
        C7573i.m23587b(bVar, "mPlayCompleteListener");
        this.f63980e = view;
        this.f63981f = bVar;
        m79633e();
        this.f63980e.setTag(this);
    }
}
