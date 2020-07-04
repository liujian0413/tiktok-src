package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder;

import android.graphics.SurfaceTexture;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EncryptedVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30735c;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31583a;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31938a;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c.C31946b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.p1349a.C31940a;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.p1349a.C31941b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder */
public final class VideoViewHolder extends AbsMediaViewHolder implements SurfaceTextureListener, C31946b {

    /* renamed from: h */
    public static final C31568a f82621h = new C31568a(null);

    /* renamed from: g */
    public ImageView f82622g;

    /* renamed from: i */
    private FrameLayout f82623i;

    /* renamed from: j */
    private DmtStatusView f82624j;

    /* renamed from: k */
    private RemoteImageView f82625k;

    /* renamed from: l */
    private KeepSurfaceTextureView f82626l;

    /* renamed from: m */
    private ImageView f82627m;

    /* renamed from: n */
    private String f82628n;

    /* renamed from: o */
    private EncryptedVideoContent f82629o;

    /* renamed from: p */
    private C31944c f82630p;

    /* renamed from: q */
    private boolean f82631q = true;

    /* renamed from: r */
    private boolean f82632r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$a */
    public static final class C31568a {
        private C31568a() {
        }

        public /* synthetic */ C31568a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static VideoViewHolder m102631a(ViewGroup viewGroup, RecyclerView recyclerView) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(recyclerView, "recyclerView");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xm, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new VideoViewHolder(inflate, recyclerView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$b */
    static final class C31569b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f82633a;

        /* renamed from: b */
        final /* synthetic */ VideoViewHolder f82634b;

        C31569b(ImageView imageView, VideoViewHolder videoViewHolder) {
            this.f82633a = imageView;
            this.f82634b = videoViewHolder;
        }

        public final void run() {
            this.f82633a.setVisibility(8);
            VideoViewHolder.m102611a(this.f82634b).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$c */
    static final class C31570c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoViewHolder f82635a;

        C31570c(VideoViewHolder videoViewHolder) {
            this.f82635a = videoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82635a.mo82288j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$d */
    static final class C31571d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoViewHolder f82636a;

        C31571d(VideoViewHolder videoViewHolder) {
            this.f82636a = videoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82636a.mo82281c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$e */
    public static final class C31572e implements C1591g<C31941b, Void> {

        /* renamed from: a */
        final /* synthetic */ VideoViewHolder f82637a;

        /* renamed from: b */
        final /* synthetic */ String f82638b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C31941b> hVar) {
            if (hVar == null || (hVar.mo6889d() && hVar.mo6890e() == null)) {
                VideoViewHolder videoViewHolder = this.f82637a;
                String string = this.f82637a.mo82275a().getString(R.string.bna);
                C7573i.m23582a((Object) string, "context.getString(R.string.im_network_error)");
                videoViewHolder.mo82299a(string);
            } else {
                VideoViewHolder videoViewHolder2 = this.f82637a;
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "task.result");
                videoViewHolder2.mo82298a((C31941b) e, this.f82638b);
            }
            return null;
        }

        C31572e(VideoViewHolder videoViewHolder, String str) {
            this.f82637a = videoViewHolder;
            this.f82638b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.VideoViewHolder$f */
    static final class C31573f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewHolder f82639a;

        C31573f(VideoViewHolder videoViewHolder) {
            this.f82639a = videoViewHolder;
        }

        public final void run() {
            VideoViewHolder.m102611a(this.f82639a).setVisibility(0);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: a */
    public final void mo82299a(String str) {
        C10761a.m31396b(mo82275a(), str, 0).mo25750a();
        DmtStatusView dmtStatusView = this.f82624j;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingStatusView");
        }
        dmtStatusView.setVisibility(8);
        m102617k();
    }

    /* renamed from: a */
    public final void mo82079a(boolean z) {
        if (z) {
            DmtStatusView dmtStatusView = this.f82624j;
            if (dmtStatusView == null) {
                C7573i.m23583a("loadingStatusView");
            }
            dmtStatusView.mo25939d();
            RemoteImageView remoteImageView = this.f82625k;
            if (remoteImageView == null) {
                C7573i.m23583a("videoCoverIv");
            }
            remoteImageView.setAlpha(0.0f);
            this.f82632r = false;
            this.f82631q = false;
            m102618m();
            return;
        }
        DmtStatusView dmtStatusView2 = this.f82624j;
        if (dmtStatusView2 == null) {
            C7573i.m23583a("loadingStatusView");
        }
        dmtStatusView2.mo25939d();
        m102617k();
    }

    /* renamed from: g */
    public final void mo82285g() {
        super.mo82285g();
        C31944c cVar = this.f82630p;
        if (cVar != null) {
            cVar.mo82785b();
        }
    }

    /* renamed from: h */
    public final void mo82286h() {
        super.mo82286h();
        C31944c cVar = this.f82630p;
        if (cVar != null) {
            cVar.mo82785b();
        }
    }

    /* renamed from: i */
    public final void mo82287i() {
        super.mo82287i();
        C31944c cVar = this.f82630p;
        if (cVar != null) {
            cVar.mo82789d();
        }
    }

    /* renamed from: l */
    public final void mo82084l() {
        DmtStatusView dmtStatusView = this.f82624j;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingStatusView");
        }
        dmtStatusView.mo25939d();
    }

    /* renamed from: m */
    private final void m102618m() {
        boolean z;
        ImageView imageView = this.f82627m;
        if (imageView == null) {
            C7573i.m23583a("playControlButton");
        }
        ImageView imageView2 = this.f82627m;
        if (imageView2 == null) {
            C7573i.m23583a("playControlButton");
        }
        if (imageView2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            imageView = null;
        }
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setDuration(100).withEndAction(new C31569b(imageView, this)).start();
        }
    }

    /* renamed from: k */
    private final void m102617k() {
        ImageView imageView = this.f82627m;
        if (imageView == null) {
            C7573i.m23583a("playControlButton");
        }
        if (imageView.getVisibility() != 0) {
            if (this.f82630p != null) {
                C31944c cVar = this.f82630p;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (cVar.mo82791e()) {
                    return;
                }
            }
            ImageView imageView2 = this.f82627m;
            if (imageView2 == null) {
                C7573i.m23583a("playControlButton");
            }
            imageView2.setScaleX(2.5f);
            imageView2.setScaleY(2.5f);
            imageView2.setVisibility(0);
            imageView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new C31573f(this)).start();
        }
    }

    /* renamed from: j */
    public final void mo82288j() {
        ImageView imageView = this.f82627m;
        if (imageView == null) {
            C7573i.m23583a("playControlButton");
        }
        if (imageView.getVisibility() != 0) {
            C31944c cVar = this.f82630p;
            if (cVar != null) {
                cVar.mo82785b();
            }
            DmtStatusView dmtStatusView = this.f82624j;
            if (dmtStatusView == null) {
                C7573i.m23583a("loadingStatusView");
            }
            dmtStatusView.mo25939d();
            this.f82632r = false;
            m102617k();
        } else if (this.f82631q) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.f82626l;
            if (keepSurfaceTextureView == null) {
                C7573i.m23583a("videoTextureView");
            }
            if (keepSurfaceTextureView.f83483c) {
                m102613a(this.f82629o);
            }
            this.f82632r = true;
            DmtStatusView dmtStatusView2 = this.f82624j;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("loadingStatusView");
            }
            dmtStatusView2.mo25942f();
            m102618m();
        } else {
            C31944c cVar2 = this.f82630p;
            if (cVar2 != null) {
                cVar2.mo82782a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m102611a(VideoViewHolder videoViewHolder) {
        ImageView imageView = videoViewHolder.f82622g;
        if (imageView == null) {
            C7573i.m23583a("ivClose");
        }
        return imageView;
    }

    /* renamed from: c */
    private final void m102616c(String str) {
        C31944c cVar = this.f82630p;
        if (cVar != null) {
            cVar.mo82790d(str);
        }
        C31944c cVar2 = this.f82630p;
        if (cVar2 != null) {
            cVar2.mo82782a();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        RemoteImageView remoteImageView = this.f82625k;
        if (remoteImageView == null) {
            C7573i.m23583a("videoCoverIv");
        }
        remoteImageView.setAlpha(1.0f);
        return true;
    }

    /* renamed from: a */
    public final void mo82279a(C31583a aVar) {
        C7573i.m23587b(aVar, "dragState");
        super.mo82279a(aVar);
        if (aVar.mo82317a()) {
            ImageView imageView = this.f82622g;
            if (imageView == null) {
                C7573i.m23583a("ivClose");
            }
            ImageView imageView2 = this.f82627m;
            if (imageView2 == null) {
                C7573i.m23583a("playControlButton");
            }
            imageView.setVisibility(imageView2.getVisibility());
            return;
        }
        ImageView imageView3 = this.f82622g;
        if (imageView3 == null) {
            C7573i.m23583a("ivClose");
        }
        imageView3.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo82080b(String str) {
        String string = mo82275a().getString(R.string.brk);
        C7573i.m23582a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
        mo82299a(string);
    }

    /* renamed from: a */
    private final void m102613a(EncryptedVideoContent encryptedVideoContent) {
        String str;
        if (TextUtils.isEmpty(this.f82628n) || !C7276d.m22812b(this.f82628n)) {
            if (encryptedVideoContent != null) {
                str = encryptedVideoContent.getTosKey();
            } else {
                str = null;
            }
            if (str == null || encryptedVideoContent.getSecretKey() == null) {
                String string = mo82275a().getString(R.string.brk);
                C7573i.m23582a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
                mo82299a(string);
                return;
            }
            String tosKey = encryptedVideoContent.getTosKey();
            if (tosKey == null) {
                C7573i.m23580a();
            }
            String secretKey = encryptedVideoContent.getSecretKey();
            if (secretKey == null) {
                C7573i.m23580a();
            }
            m102614a(tosKey, secretKey);
            return;
        }
        String str2 = this.f82628n;
        if (str2 == null) {
            C7573i.m23580a();
        }
        m102616c(str2);
    }

    /* renamed from: a */
    public final void mo82277a(View view) {
        C7573i.m23587b(view, "itemView");
        super.mo82277a(view);
        this.f82623i = (FrameLayout) mo82276a((int) R.id.biz);
        this.f82624j = (DmtStatusView) mo82276a((int) R.id.abm);
        this.f82625k = (RemoteImageView) mo82276a((int) R.id.ctt);
        this.f82626l = (KeepSurfaceTextureView) mo82276a((int) R.id.dcw);
        this.f82627m = (ImageView) mo82276a((int) R.id.bb5);
        this.f82622g = (ImageView) mo82276a((int) R.id.b7g);
        ImageView imageView = this.f82627m;
        if (imageView == null) {
            C7573i.m23583a("playControlButton");
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.f82627m;
        if (imageView2 == null) {
            C7573i.m23583a("playControlButton");
        }
        imageView2.setAlpha(1.0f);
        KeepSurfaceTextureView keepSurfaceTextureView = this.f82626l;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("videoTextureView");
        }
        keepSurfaceTextureView.setSurfaceTextureListener(this);
        FrameLayout frameLayout = this.f82623i;
        if (frameLayout == null) {
            C7573i.m23583a("playVideoLayout");
        }
        frameLayout.setOnClickListener(new C31570c(this));
        ImageView imageView3 = this.f82622g;
        if (imageView3 == null) {
            C7573i.m23583a("ivClose");
        }
        imageView3.setOnClickListener(new C31571d(this));
        DmtStatusView dmtStatusView = this.f82624j;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingStatusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(mo82275a()));
        this.f82630p = new C31944c(mo82275a(), false, 2, null);
        C31944c cVar = this.f82630p;
        if (cVar == null) {
            C7573i.m23580a();
        }
        cVar.mo82784a((C31946b) this);
    }

    /* renamed from: a */
    public final void mo82278a(C31547a<BaseContent> aVar) {
        C7573i.m23587b(aVar, "data");
        if (this.f82600e != aVar) {
            super.mo82278a(aVar);
            T t = aVar.f82581a;
            if (!(t instanceof StoryVideoContent)) {
                t = null;
            }
            StoryVideoContent storyVideoContent = (StoryVideoContent) t;
            if (storyVideoContent != null) {
                StoryVideoContent.Companion.updateContentLocal(storyVideoContent, aVar.f82582b);
                m102612a(storyVideoContent.getWidth(), storyVideoContent.getHeight());
                this.f82631q = true;
                this.f82629o = storyVideoContent.getVideo();
                this.f82628n = storyVideoContent.getLocalVideo();
                RemoteImageView remoteImageView = this.f82625k;
                if (remoteImageView == null) {
                    C7573i.m23583a("videoCoverIv");
                }
                remoteImageView.setAlpha(1.0f);
                ImageView imageView = this.f82627m;
                if (imageView == null) {
                    C7573i.m23583a("playControlButton");
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this.f82622g;
                if (imageView2 == null) {
                    C7573i.m23583a("ivClose");
                }
                imageView2.setVisibility(0);
                UrlModel a = C30735c.m100130a(storyVideoContent.getDisplayPoster(), storyVideoContent.getLocalPoster());
                RemoteImageView remoteImageView2 = this.f82625k;
                if (remoteImageView2 == null) {
                    C7573i.m23583a("videoCoverIv");
                }
                C23323e.m76524b(remoteImageView2, a);
            }
        }
    }

    public VideoViewHolder(View view, RecyclerView recyclerView) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(recyclerView, "_recyclerView");
        super(view, recyclerView);
    }

    /* renamed from: a */
    private final void m102614a(String str, String str2) {
        C31938a.m103746a(str).mo6876a((C1591g<TResult, TContinuationResult>) new C31572e<TResult,TContinuationResult>(this, str2), C1592h.f5958b);
    }

    /* renamed from: b */
    private final void m102615b(String str, String str2) {
        C31944c cVar = this.f82630p;
        if (cVar != null) {
            cVar.mo82786b(str2);
        }
        C31944c cVar2 = this.f82630p;
        if (cVar2 != null) {
            cVar2.mo82788c(str);
        }
        C31944c cVar3 = this.f82630p;
        if (cVar3 != null) {
            cVar3.mo82782a();
        }
    }

    /* renamed from: a */
    private final void m102612a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            FragmentActivity b = mo82280b();
            if (b != null) {
                WindowManager windowManager = b.getWindowManager();
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    if (defaultDisplay != null) {
                        defaultDisplay.getMetrics(displayMetrics);
                        float f = ((float) i2) / ((float) i);
                        FrameLayout frameLayout = this.f82623i;
                        if (frameLayout == null) {
                            C7573i.m23583a("playVideoLayout");
                        }
                        LayoutParams layoutParams = frameLayout.getLayoutParams();
                        layoutParams.height = (int) (((float) displayMetrics.widthPixels) * f);
                        FrameLayout frameLayout2 = this.f82623i;
                        if (frameLayout2 == null) {
                            C7573i.m23583a("playVideoLayout");
                        }
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82298a(C31941b bVar, String str) {
        String str2;
        C31940a aVar = bVar.f83442d;
        String str3 = null;
        if (aVar != null) {
            str2 = aVar.f83437a;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            this.f82628n = aVar.f83437a;
            m102615b(aVar.f83437a, str);
            return;
        }
        if (aVar != null) {
            str3 = aVar.f83438b;
        }
        if (str3 != null) {
            this.f82628n = aVar.f83438b;
            m102615b(aVar.f83438b, str);
            return;
        }
        String string = mo82275a().getString(R.string.brk);
        C7573i.m23582a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
        mo82299a(string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r3 == r5.getIndex()) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r3, int r4, int r5) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r2.f82625k
            if (r3 != 0) goto L_0x0009
            java.lang.String r4 = "videoCoverIv"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0009:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
            com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView r3 = r2.f82626l
            if (r3 != 0) goto L_0x0017
            java.lang.String r4 = "videoTextureView"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0017:
            boolean r3 = r3.f83483c
            if (r3 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.im.sdk.videofileplay.c r3 = r2.f82630p
            if (r3 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView r4 = r2.f82626l
            if (r4 != 0) goto L_0x0028
            java.lang.String r5 = "videoTextureView"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0028:
            android.view.Surface r4 = r4.getSurface()
            r3.mo82783a(r4)
        L_0x002f:
            boolean r3 = r2.f82598c
            if (r3 == 0) goto L_0x0037
            boolean r3 = r2.f82632r
            if (r3 != 0) goto L_0x0056
        L_0x0037:
            android.support.v4.app.FragmentActivity r3 = r2.mo82280b()
            if (r3 != 0) goto L_0x0040
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0040:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C31574a.m102663a(r3)
            long r3 = r3.f82642c
            com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r5 = r2.f82600e
            if (r5 == 0) goto L_0x009b
            com.bytedance.im.core.model.Message r5 = r5.f82582b
            if (r5 == 0) goto L_0x009b
            long r0 = r5.getIndex()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00af
        L_0x0056:
            android.support.v4.app.FragmentActivity r3 = r2.mo82280b()
            if (r3 != 0) goto L_0x005f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005f:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C31574a.m102663a(r3)
            long r3 = r3.f82642c
            com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r5 = r2.f82600e
            if (r5 == 0) goto L_0x0095
            com.bytedance.im.core.model.Message r5 = r5.f82582b
            if (r5 == 0) goto L_0x0095
            long r0 = r5.getIndex()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            android.support.v4.app.FragmentActivity r3 = r2.mo82280b()
            if (r3 != 0) goto L_0x007e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007e:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C31574a.m102663a(r3)
            r4 = -1
            r3.f82642c = r4
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r3 = r2.f82624j
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = "loadingStatusView"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x008f:
            r3.mo25942f()
            r2.m102618m()
        L_0x0095:
            com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent r3 = r2.f82629o
            r2.m102613a(r3)
            return
        L_0x009b:
            return
        L_0x009c:
            android.content.Context r3 = r2.mo82275a()
            r4 = 2131823962(0x7f110d5a, float:1.9280738E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "context.getString(R.stri…im_video_file_play_error)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            r2.mo82299a(r3)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder.VideoViewHolder.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }
}
