package com.p280ss.android.ugc.aweme.poi.p1472rn;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21753d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34200e;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.p1472rn.C35223b.C35224a;
import com.p280ss.android.ugc.aweme.poi.p1472rn.VideoViewManager.C35217a;
import com.p280ss.android.ugc.aweme.poi.p1472rn.VideoViewManager.C35219c;
import com.p280ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewBox */
public class VideoViewBox extends KeepSurfaceTextureView implements C34976f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f92204a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VideoViewBox.class), "surfaceListener", "getSurfaceListener()Lcom/ss/android/ugc/aweme/poi/rn/VideoViewBox$surfaceListener$2$1;"))};

    /* renamed from: j */
    public static final C35213a f92205j = new C35213a(null);

    /* renamed from: b */
    public Aweme f92206b;

    /* renamed from: c */
    public boolean f92207c;

    /* renamed from: d */
    public boolean f92208d;

    /* renamed from: e */
    public String f92209e;

    /* renamed from: f */
    public boolean f92210f;

    /* renamed from: g */
    public boolean f92211g;

    /* renamed from: h */
    public boolean f92212h;

    /* renamed from: i */
    public boolean f92213i;

    /* renamed from: o */
    private C34199d f92214o;

    /* renamed from: p */
    private final C28228a f92215p;

    /* renamed from: q */
    private C43222g f92216q;

    /* renamed from: r */
    private boolean f92217r;

    /* renamed from: s */
    private boolean f92218s;

    /* renamed from: t */
    private boolean f92219t;

    /* renamed from: u */
    private Map<String, String> f92220u;

    /* renamed from: v */
    private boolean f92221v;

    /* renamed from: w */
    private long f92222w;

    /* renamed from: x */
    private C35219c f92223x;

    /* renamed from: y */
    private C35223b f92224y;

    /* renamed from: z */
    private final C7541d f92225z;

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewBox$a */
    public static final class C35213a {
        private C35213a() {
        }

        public /* synthetic */ C35213a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m113623a(int r2, int r3, android.view.TextureView r4, float r5, boolean r6) {
            /*
                if (r3 <= 0) goto L_0x0037
                if (r2 <= 0) goto L_0x0037
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 > 0) goto L_0x000a
                goto L_0x0037
            L_0x000a:
                float r0 = (float) r3
                float r1 = (float) r2
                float r0 = r0 / r1
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r6 == 0) goto L_0x0018
                int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r6 > 0) goto L_0x001f
                float r5 = r0 / r5
                goto L_0x0023
            L_0x0018:
                int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r6 <= 0) goto L_0x001f
                float r5 = r0 / r5
                goto L_0x0023
            L_0x001f:
                float r5 = r5 / r0
                r1 = r5
                r5 = 1065353216(0x3f800000, float:1.0)
            L_0x0023:
                if (r4 == 0) goto L_0x0036
                android.graphics.Matrix r6 = new android.graphics.Matrix
                r6.<init>()
                int r2 = r2 >> 1
                float r2 = (float) r2
                int r3 = r3 >> 1
                float r3 = (float) r3
                r6.setScale(r5, r1, r2, r3)
                r4.setTransform(r6)
            L_0x0036:
                return
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p1472rn.VideoViewBox.C35213a.m113623a(int, int, android.view.TextureView, float, boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewBox$b */
    static final class C35214b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewBox f92226a;

        C35214b(VideoViewBox videoViewBox) {
            this.f92226a = videoViewBox;
        }

        public final void run() {
            this.f92226a.mo89631b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewBox$c */
    static final class C35215c extends Lambda implements C7561a<C352161> {

        /* renamed from: a */
        final /* synthetic */ VideoViewBox f92227a;

        C35215c(VideoViewBox videoViewBox) {
            this.f92227a = videoViewBox;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C352161 invoke() {
            return new SurfaceTextureListener(this) {

                /* renamed from: a */
                final /* synthetic */ C35215c f92228a;

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    C7573i.m23587b(surfaceTexture, "surface");
                }

                {
                    this.f92228a = r1;
                }

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    C7573i.m23587b(surfaceTexture, "surface");
                    this.f92228a.f92227a.mo89630a();
                    return false;
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    C7573i.m23587b(surfaceTexture, "surface");
                    this.f92228a.f92227a.f92207c = false;
                    this.f92228a.f92227a.f92208d = false;
                    if (this.f92228a.f92227a.f92206b != null) {
                        Aweme aweme = this.f92228a.f92227a.f92206b;
                        if (aweme == null) {
                            C7573i.m23580a();
                        }
                        if (aweme.getVideo() != null) {
                            TextureView textureView = this.f92228a.f92227a;
                            Aweme aweme2 = this.f92228a.f92227a.f92206b;
                            if (aweme2 == null) {
                                C7573i.m23580a();
                            }
                            Video video = aweme2.getVideo();
                            C7573i.m23582a((Object) video, "mAweme!!.video");
                            float height = (float) video.getHeight();
                            Aweme aweme3 = this.f92228a.f92227a.f92206b;
                            if (aweme3 == null) {
                                C7573i.m23580a();
                            }
                            Video video2 = aweme3.getVideo();
                            C7573i.m23582a((Object) video2, "mAweme!!.video");
                            C35213a.m113623a(i, i2, textureView, height / ((float) video2.getWidth()), TextUtils.equals(this.f92228a.f92227a.f92209e, "fit"));
                        }
                    }
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    C7573i.m23587b(surfaceTexture, "surface");
                    if (this.f92228a.f92227a.f92206b != null) {
                        Aweme aweme = this.f92228a.f92227a.f92206b;
                        if (aweme == null) {
                            C7573i.m23580a();
                        }
                        if (aweme.getVideo() != null) {
                            TextureView textureView = this.f92228a.f92227a;
                            Aweme aweme2 = this.f92228a.f92227a.f92206b;
                            if (aweme2 == null) {
                                C7573i.m23580a();
                            }
                            Video video = aweme2.getVideo();
                            C7573i.m23582a((Object) video, "mAweme!!.video");
                            float height = (float) video.getHeight();
                            Aweme aweme3 = this.f92228a.f92227a.f92206b;
                            if (aweme3 == null) {
                                C7573i.m23580a();
                            }
                            Video video2 = aweme3.getVideo();
                            C7573i.m23582a((Object) video2, "mAweme!!.video");
                            C35213a.m113623a(i, i2, textureView, height / ((float) video2.getWidth()), TextUtils.equals(this.f92228a.f92227a.f92209e, "fit"));
                        }
                    }
                }
            };
        }
    }

    private final C352161 getSurfaceListener() {
        return (C352161) this.f92225z.getValue();
    }

    /* renamed from: j */
    private final void m113597j() {
        mo89631b();
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: d */
    public final void mo89634d() {
        m113594h();
    }

    /* renamed from: l */
    private final void m113599l() {
        setAlpha(1.0f);
    }

    /* renamed from: c */
    public final void mo89632c() {
        mo89635d(false);
    }

    /* renamed from: k */
    private final void m113598k() {
        setSurfaceTextureListener(getSurfaceListener());
    }

    /* renamed from: m */
    private final void m113600m() {
        C35223b shareInfo = getShareInfo();
        if (shareInfo != null && this.f92210f) {
            shareInfo.mo89662b(this.f92220u);
        }
    }

    /* renamed from: n */
    private final void m113601n() {
        C35223b shareInfo = getShareInfo();
        if (shareInfo != null) {
            shareInfo.mo89660a();
        }
    }

    /* renamed from: o */
    private final void m113602o() {
        C35223b shareInfo = getShareInfo();
        if (shareInfo != null && this.f92210f) {
            shareInfo.mo89661a(this.f92220u);
        }
    }

    private final C43222g getPlayer() {
        C43222g gVar;
        if (this.f92216q == null) {
            if (this.f92211g) {
                gVar = C35217a.m113625a();
            } else {
                gVar = C34200e.m110432a().mo86947b();
            }
            this.f92216q = gVar;
        }
        return this.f92216q;
    }

    private final C35223b getShareInfo() {
        if (this.f92206b != null && this.f92224y == null) {
            Aweme aweme = this.f92206b;
            if (aweme == null) {
                C7573i.m23580a();
            }
            this.f92224y = new C35223b(aweme);
        }
        return this.f92224y;
    }

    /* renamed from: h */
    private final void m113594h() {
        if (!this.f92218s) {
            m113596i();
            this.f92218s = true;
        }
        C34199d dVar = this.f92214o;
        if (dVar != null) {
            dVar.mo86934a(this.f92206b);
        }
    }

    /* renamed from: i */
    private final void m113596i() {
        this.f92214o = new C34199d(this, this, null);
        C34199d dVar = this.f92214o;
        if (dVar != null) {
            dVar.f89179a = getPlayer();
        }
        this.f92215p.f74354a = 4;
        m113598k();
    }

    /* renamed from: b */
    public final void mo89631b() {
        C34199d dVar = this.f92214o;
        if (dVar == null) {
            C7573i.m23580a();
        }
        if (dVar.mo86935a(this.f92221v, (int) this.f92222w) || this.f92217r) {
            this.f92221v = false;
            if (this.f92219t) {
                C43222g player = getPlayer();
                if (player != null) {
                    player.mo104950z();
                } else {
                    return;
                }
            } else {
                C43222g player2 = getPlayer();
                if (player2 != null) {
                    player2.mo104921A();
                    return;
                }
            }
            return;
        }
        postDelayed(new C35214b(this), 100);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92217r = true;
        mo89635d(false);
        if (!(this.f92216q == null || this.f92206b == null)) {
            C43305j.m137386g().mo105087b(this.f92206b);
        }
        if (this.f92216q != null && this.f92214o != null) {
            if (this.f92213i) {
                C43222g gVar = this.f92216q;
                if (gVar != null) {
                    gVar.mo104924D();
                }
            }
            C34199d dVar = this.f92214o;
            if (dVar != null) {
                dVar.mo86931a();
            }
            C34199d dVar2 = this.f92214o;
            if (dVar2 != null) {
                dVar2.f89179a = null;
            }
            this.f92216q = null;
        }
    }

    /* renamed from: a */
    public final boolean mo89630a() {
        C43222g a = C35217a.m113625a();
        C7573i.m23582a((Object) a, "VideoViewManager.PLAYER");
        if (!a.mo104918q() || !this.f92208d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo89629a(int i) {
        this.f92222w = (long) i;
    }

    public final void setIsMuted(boolean z) {
        this.f92219t = z;
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        m113593g("onBuffering");
    }

    public final void setLogParams(Map<String, String> map) {
        C7573i.m23587b(map, "params");
        this.f92220u = map;
    }

    public final void setStateChangeCallback(C35219c cVar) {
        C7573i.m23587b(cVar, "callback");
        this.f92223x = cVar;
    }

    /* renamed from: g */
    private final void m113593g(String str) {
        if (this.f92223x != null) {
            C35219c cVar = this.f92223x;
            if (cVar == null) {
                C7573i.m23580a();
            }
            cVar.mo89659a(str, this);
        }
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
        C7573i.m23587b(cVar, "obj");
        m113593g("onRetryOnError");
    }

    public final void setFitMode(String str) {
        C7573i.m23587b(str, "fitMode");
        this.f92209e = str;
        m113598k();
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        C7573i.m23587b(cVar, "error");
        String str = cVar.f115522a;
        C7573i.m23582a((Object) str, "error.sourceId");
        if (!m113595h(str)) {
            m113593g("onPlayFailed");
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        C7573i.m23587b(str, "sourceId");
        if (!m113595h(str)) {
            m113593g("onPlayCompleted");
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        C7573i.m23587b(str, "sourceId");
        if (!m113595h(str)) {
            m113593g("onPreparePlay");
            this.f92215p.f74354a = 1;
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        C7573i.m23587b(str, "sourceId");
        if (!m113595h(str)) {
            m113593g("onPausePlay");
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        C7573i.m23587b(str, "sourceId");
        if (!m113595h(str)) {
            m113593g("onPlayCompletedFirstTime");
            if (this.f92210f) {
                C35223b.f92232b.mo89663a(this.f92206b, this.f92220u);
            }
        }
    }

    /* renamed from: h */
    private final boolean m113595h(String str) {
        if (this.f92206b != null) {
            CharSequence charSequence = str;
            Aweme aweme = this.f92206b;
            if (aweme == null) {
                C7573i.m23580a();
            }
            if (TextUtils.equals(charSequence, aweme.getAid())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        C7573i.m23587b(dVar, "playerEvent");
        if (!this.f92207c) {
            String str = dVar.f115529a;
            C7573i.m23582a((Object) str, "playerEvent.id");
            if (!m113595h(str)) {
                this.f92215p.f74354a = 2;
                m113593g("onRenderReady");
                C42961az.m136380a(new C21753d(this.f92206b));
            }
        }
    }

    /* renamed from: d */
    public final void mo89635d(boolean z) {
        if (this.f92206b != null && this.f92214o != null && this.f92216q != null) {
            C34199d dVar = this.f92214o;
            if (dVar != null) {
                dVar.mo86939e();
            }
            if (this.f92213i) {
                C43222g gVar = this.f92216q;
                if (gVar != null) {
                    gVar.mo104924D();
                }
            }
            m113602o();
            if (z && this.f92210f) {
                Aweme aweme = this.f92206b;
                if (aweme == null) {
                    C7573i.m23580a();
                }
                C35224a.m113637b(aweme);
            }
        }
    }

    /* renamed from: f */
    public final void mo89636f(String str) {
        if (str != null) {
            float parseFloat = Float.parseFloat(str);
            float f = parseFloat / 100.0f;
            C43222g gVar = this.f92216q;
            if (gVar == null) {
                C7573i.m23580a();
            }
            this.f92222w = (long) (f * ((float) gVar.mo104910i()));
            StringBuilder sb = new StringBuilder("onPlayProgressChange_");
            sb.append(str);
            m113593g(sb.toString());
            C43222g gVar2 = this.f92216q;
            if (gVar2 != null) {
                gVar2.mo104928a(parseFloat);
            }
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        C7573i.m23587b(eVar, "event");
        String str = eVar.f115532a;
        C7573i.m23582a((Object) str, "sourceId");
        if (!m113595h(str)) {
            m113599l();
            m113593g("onRenderFirstFrame");
            CurPlayVideoRecord.INSTANCE.setVideoId(str);
            m113600m();
            m113601n();
        }
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
        C43222g player = getPlayer();
        if (player == null) {
            C7573i.m23580a();
        }
        this.f92222w = player.mo104915n();
        StringBuilder sb = new StringBuilder("onPlayProgressChange_");
        sb.append(f);
        m113593g(sb.toString());
        StringBuilder sb2 = new StringBuilder("special-trace ");
        sb2.append(f);
        System.out.println(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo89633c(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ all -> 0x0045 }
            boolean r2 = com.p280ss.android.ugc.aweme.poi.p1472rn.C35225c.m113639a(r2)     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x001b
            android.content.Context r2 = r1.getContext()     // Catch:{ all -> 0x0045 }
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r2 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r2, r0)     // Catch:{ all -> 0x0045 }
            r2.mo25750a()     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            return
        L_0x001b:
            boolean r2 = r1.f92207c     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r1)
            return
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.f92206b     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0027
            monitor-exit(r1)
            return
        L_0x0027:
            r1.m113594h()     // Catch:{ all -> 0x0045 }
            r1.m113597j()     // Catch:{ all -> 0x0045 }
            boolean r2 = r1.f92213i     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.video.g r2 = r1.f92216q     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x003a
            r0 = 166(0xa6, float:2.33E-43)
            r2.mo104929a(r0)     // Catch:{ all -> 0x0045 }
        L_0x003a:
            boolean r2 = r1.f92210f     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.f92206b     // Catch:{ all -> 0x0045 }
            com.p280ss.android.ugc.aweme.poi.p1472rn.C35223b.C35224a.m113636a(r2)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r1)
            return
        L_0x0045:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p1472rn.VideoViewBox.mo89633c(boolean):void");
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        C7573i.m23587b(str, "sourceId");
        if (!m113595h(str)) {
            this.f92208d = false;
            m113593g("onResumePlay");
            this.f92215p.f74354a = 2;
            m113600m();
            m113601n();
        }
    }

    public VideoViewBox(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f92215p = new C28228a();
        this.f92209e = "center_crop";
        this.f92221v = true;
        this.f92225z = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C35215c(this));
        setAlpha(0.0f);
    }

    public /* synthetic */ VideoViewBox(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
