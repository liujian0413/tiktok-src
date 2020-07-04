package com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EncryptedVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30735c;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c.C31946b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.p1349a.C31940a;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.p1349a.C31941b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.C31973a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity */
public final class VideoFilePlayerActivity extends AmeActivity implements SurfaceTextureListener, OnClickListener {

    /* renamed from: g */
    public static final C31933a f83411g = new C31933a(null);

    /* renamed from: a */
    public FrameLayout f83412a;

    /* renamed from: b */
    public ImageView f83413b;

    /* renamed from: c */
    public DmtStatusView f83414c;

    /* renamed from: d */
    public RemoteImageView f83415d;

    /* renamed from: e */
    public C31944c f83416e;

    /* renamed from: f */
    public int f83417f = -1;

    /* renamed from: h */
    private DragView f83418h;

    /* renamed from: i */
    private View f83419i;

    /* renamed from: j */
    private KeepSurfaceTextureView f83420j;

    /* renamed from: k */
    private FrameLayout f83421k;

    /* renamed from: l */
    private IViewInfo f83422l;

    /* renamed from: m */
    private EncryptedVideoContent f83423m;

    /* renamed from: n */
    private String f83424n;

    /* renamed from: o */
    private String f83425o;

    /* renamed from: p */
    private UrlModel f83426p;

    /* renamed from: q */
    private int f83427q;

    /* renamed from: r */
    private int f83428r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$a */
    public static final class C31933a {
        private C31933a() {
        }

        public /* synthetic */ C31933a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$b */
    static final class C31934b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f83429a;

        C31934b(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f83429a = videoFilePlayerActivity;
        }

        public final void run() {
            VideoFilePlayerActivity.m103723e(this.f83429a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$c */
    public static final class C31935c implements C31973a {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f83430a;

        /* renamed from: d */
        public final void mo80764d() {
        }

        /* renamed from: g */
        public final boolean mo80767g() {
            return false;
        }

        /* renamed from: h */
        public final boolean mo80768h() {
            return false;
        }

        /* renamed from: b */
        public final void mo80762b() {
            VideoFilePlayerActivity.m103713a(this.f83430a).setVisibility(8);
        }

        /* renamed from: f */
        public final void mo80766f() {
            this.f83430a.f83417f = 0;
            this.f83430a.finish();
        }

        /* renamed from: a */
        public final void mo80760a() {
            VideoFilePlayerActivity.m103713a(this.f83430a).setVisibility(8);
            this.f83430a.f83417f = -1;
        }

        /* renamed from: e */
        public final void mo80765e() {
            VideoFilePlayerActivity.m103723e(this.f83430a).setVisibility(8);
            VideoFilePlayerActivity.m103713a(this.f83430a).setVisibility(8);
            this.f83430a.f83417f = 1;
        }

        /* renamed from: c */
        public final void mo80763c() {
            if (VideoFilePlayerActivity.m103719c(this.f83430a).getVisibility() != 0 && !VideoFilePlayerActivity.m103721d(this.f83430a).mo82791e()) {
                VideoFilePlayerActivity.m103723e(this.f83430a).setVisibility(0);
                VideoFilePlayerActivity.m103723e(this.f83430a).setAlpha(1.0f);
            }
            VideoFilePlayerActivity.m103713a(this.f83430a).setVisibility(0);
            this.f83430a.f83417f = 0;
        }

        C31935c(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f83430a = videoFilePlayerActivity;
        }

        /* renamed from: a */
        public final void mo80761a(ValueAnimator valueAnimator) {
            Object obj;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                VideoFilePlayerActivity.m103716b(this.f83430a).setAlpha(1.0f - ((Float) obj).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$d */
    public static final class C31936d implements C31946b {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f83431a;

        /* renamed from: l */
        public final void mo82084l() {
            VideoFilePlayerActivity.m103719c(this.f83431a).setVisibility(8);
        }

        C31936d(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f83431a = videoFilePlayerActivity;
        }

        /* renamed from: a */
        public final void mo82079a(boolean z) {
            if (z) {
                this.f83431a.mo82754b();
                VideoFilePlayerActivity.m103716b(this.f83431a).setAlpha(0.0f);
                return;
            }
            this.f83431a.mo82751a();
        }

        /* renamed from: b */
        public final void mo82080b(String str) {
            VideoFilePlayerActivity videoFilePlayerActivity = this.f83431a;
            String string = this.f83431a.getString(R.string.brk);
            C7573i.m23582a((Object) string, "getString(R.string.im_video_file_play_error)");
            videoFilePlayerActivity.mo82753a(string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$e */
    public static final class C31937e implements C1591g<C31941b, Void> {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f83432a;

        /* renamed from: b */
        final /* synthetic */ String f83433b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C31941b> hVar) {
            if (hVar == null || (hVar.mo6889d() && hVar.mo6890e() == null)) {
                VideoFilePlayerActivity videoFilePlayerActivity = this.f83432a;
                String string = this.f83432a.getString(R.string.bna);
                C7573i.m23582a((Object) string, "getString(R.string.im_network_error)");
                videoFilePlayerActivity.mo82753a(string);
            } else {
                VideoFilePlayerActivity videoFilePlayerActivity2 = this.f83432a;
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "task.result");
                videoFilePlayerActivity2.mo82752a((C31941b) e, this.f83433b);
            }
            return null;
        }

        C31937e(VideoFilePlayerActivity videoFilePlayerActivity, String str) {
            this.f83432a = videoFilePlayerActivity;
            this.f83433b = str;
        }
    }

    public final void onBackPressed() {
        m103728i();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", false);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: i */
    private final void m103728i() {
        DragView dragView = this.f83418h;
        if (dragView == null) {
            C7573i.m23583a("mDragView");
        }
        dragView.mo82816a();
    }

    public final void onDestroy() {
        super.onDestroy();
        C31944c cVar = this.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar.mo82789d();
    }

    public final void onPause() {
        super.onPause();
        C31944c cVar = this.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar.mo82785b();
    }

    /* renamed from: c */
    private final void m103720c() {
        if (VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(67108864);
            }
        }
    }

    /* renamed from: g */
    private final void m103726g() {
        DragView dragView = this.f83418h;
        if (dragView == null) {
            C7573i.m23583a("mDragView");
        }
        dragView.setDragStateListener(new C31935c(this));
    }

    /* renamed from: h */
    private final void m103727h() {
        C31944c cVar = this.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar.mo82784a((C31946b) new C31936d(this));
    }

    /* renamed from: f */
    private final void m103725f() {
        KeepSurfaceTextureView keepSurfaceTextureView = this.f83420j;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("mVideoTextureView");
        }
        keepSurfaceTextureView.setSurfaceTextureListener(this);
        View view = this.f83419i;
        if (view == null) {
            C7573i.m23583a("mDragContentView");
        }
        OnClickListener onClickListener = this;
        view.setOnClickListener(onClickListener);
        FrameLayout frameLayout = this.f83421k;
        if (frameLayout == null) {
            C7573i.m23583a("mPlayVideoLayout");
        }
        frameLayout.setOnClickListener(onClickListener);
        FrameLayout frameLayout2 = this.f83412a;
        if (frameLayout2 == null) {
            C7573i.m23583a("mBackBtn");
        }
        frameLayout2.setOnClickListener(onClickListener);
        m103727h();
        m103726g();
    }

    /* renamed from: d */
    private final void m103722d() {
        Serializable serializable;
        IViewInfo iViewInfo;
        String str;
        String str2;
        UrlModel urlModel;
        int i;
        int i2 = 0;
        EncryptedVideoContent encryptedVideoContent = null;
        this.f83416e = new C31944c(this, false, 2, null);
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("videoContent");
        } else {
            serializable = null;
        }
        StoryVideoContent storyVideoContent = (StoryVideoContent) serializable;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            iViewInfo = (IViewInfo) intent2.getParcelableExtra("dragViewInfo");
        } else {
            iViewInfo = null;
        }
        this.f83422l = iViewInfo;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            str = intent3.getStringExtra("localPoster");
        } else {
            str = null;
        }
        this.f83424n = str;
        Intent intent4 = getIntent();
        if (intent4 != null) {
            str2 = intent4.getStringExtra("localVideo");
        } else {
            str2 = null;
        }
        this.f83425o = str2;
        if (storyVideoContent != null) {
            urlModel = storyVideoContent.getDisplayPoster();
        } else {
            urlModel = null;
        }
        this.f83426p = urlModel;
        if (storyVideoContent != null) {
            i = storyVideoContent.getHeight();
        } else {
            i = 0;
        }
        this.f83427q = i;
        if (storyVideoContent != null) {
            i2 = storyVideoContent.getWidth();
        }
        this.f83428r = i2;
        if (storyVideoContent != null) {
            encryptedVideoContent = storyVideoContent.getVideo();
        }
        this.f83423m = encryptedVideoContent;
    }

    /* renamed from: b */
    public final void mo82754b() {
        ImageView imageView = this.f83413b;
        if (imageView == null) {
            C7573i.m23583a("mCenterPlayBtn");
        }
        if (imageView.getVisibility() == 0) {
            ImageView imageView2 = this.f83413b;
            if (imageView2 == null) {
                C7573i.m23583a("mCenterPlayBtn");
            }
            imageView2.animate().alpha(0.0f).setDuration(100).withEndAction(new C31934b(this)).start();
        }
    }

    /* renamed from: a */
    public final void mo82751a() {
        if (!(this.f83417f == -1 || this.f83417f == 1)) {
            C31944c cVar = this.f83416e;
            if (cVar == null) {
                C7573i.m23583a("mTTVideoPlayer");
            }
            if (!cVar.mo82791e()) {
                DmtStatusView dmtStatusView = this.f83414c;
                if (dmtStatusView == null) {
                    C7573i.m23583a("mLoadingStatusView");
                }
                if (dmtStatusView.getVisibility() != 0) {
                    ImageView imageView = this.f83413b;
                    if (imageView == null) {
                        C7573i.m23583a("mCenterPlayBtn");
                    }
                    imageView.setScaleX(2.5f);
                    ImageView imageView2 = this.f83413b;
                    if (imageView2 == null) {
                        C7573i.m23583a("mCenterPlayBtn");
                    }
                    imageView2.setScaleY(2.5f);
                    ImageView imageView3 = this.f83413b;
                    if (imageView3 == null) {
                        C7573i.m23583a("mCenterPlayBtn");
                    }
                    imageView3.setVisibility(0);
                    ImageView imageView4 = this.f83413b;
                    if (imageView4 == null) {
                        C7573i.m23583a("mCenterPlayBtn");
                    }
                    imageView4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                }
            }
        }
    }

    /* renamed from: e */
    private final void m103724e() {
        View findViewById = findViewById(R.id.bkn);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.layout_video_drag_container)");
        this.f83418h = (DragView) findViewById;
        if (VERSION.SDK_INT >= 19) {
            DragView dragView = this.f83418h;
            if (dragView == null) {
                C7573i.m23583a("mDragView");
            }
            dragView.setFullScreenWindow(true);
        }
        View findViewById2 = findViewById(R.id.bj2);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.layout_play_video)");
        this.f83421k = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.bj0);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.layout_play_back)");
        this.f83412a = (FrameLayout) findViewById3;
        FrameLayout frameLayout = this.f83412a;
        if (frameLayout == null) {
            C7573i.m23583a("mBackBtn");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            Context context = this;
            ((FrameLayout.LayoutParams) layoutParams).topMargin = C10994a.m32204a(context);
            LayoutInflater from = LayoutInflater.from(context);
            DragView dragView2 = this.f83418h;
            if (dragView2 == null) {
                C7573i.m23583a("mDragView");
            }
            View inflate = from.inflate(R.layout.wp, dragView2, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(this…detail, mDragView, false)");
            this.f83419i = inflate;
            View view = this.f83419i;
            if (view == null) {
                C7573i.m23583a("mDragContentView");
            }
            View findViewById4 = view.findViewById(R.id.abm);
            C7573i.m23582a((Object) findViewById4, "mDragContentView.findVie…Id(R.id.dsv_play_loading)");
            this.f83414c = (DmtStatusView) findViewById4;
            View view2 = this.f83419i;
            if (view2 == null) {
                C7573i.m23583a("mDragContentView");
            }
            View findViewById5 = view2.findViewById(R.id.dcw);
            C7573i.m23582a((Object) findViewById5, "mDragContentView.findViewById(R.id.stv_play_video)");
            this.f83420j = (KeepSurfaceTextureView) findViewById5;
            View view3 = this.f83419i;
            if (view3 == null) {
                C7573i.m23583a("mDragContentView");
            }
            View findViewById6 = view3.findViewById(R.id.ctt);
            C7573i.m23582a((Object) findViewById6, "mDragContentView.findVie…yId(R.id.riv_video_cover)");
            this.f83415d = (RemoteImageView) findViewById6;
            View view4 = this.f83419i;
            if (view4 == null) {
                C7573i.m23583a("mDragContentView");
            }
            View findViewById7 = view4.findViewById(R.id.bb5);
            C7573i.m23582a((Object) findViewById7, "mDragContentView.findViewById(R.id.iv_play_center)");
            this.f83413b = (ImageView) findViewById7;
            if (this.f83422l != null) {
                View view5 = this.f83419i;
                if (view5 == null) {
                    C7573i.m23583a("mDragContentView");
                }
                View findViewById8 = view5.findViewById(R.id.bj2);
                C7573i.m23582a((Object) findViewById8, "mDragContentView.findVie…d(R.id.layout_play_video)");
                DragView dragView3 = this.f83418h;
                if (dragView3 == null) {
                    C7573i.m23583a("mDragView");
                }
                View view6 = this.f83419i;
                if (view6 == null) {
                    C7573i.m23583a("mDragContentView");
                }
                dragView3.mo82821a(view6, findViewById8, this.f83422l);
            }
            UrlModel a = C30735c.m100130a(this.f83426p, this.f83424n);
            RemoteImageView remoteImageView = this.f83415d;
            if (remoteImageView == null) {
                C7573i.m23583a("mVideoCoverImage");
            }
            C23323e.m76524b(remoteImageView, a);
            DmtStatusView dmtStatusView = this.f83414c;
            if (dmtStatusView == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView.setBuilder(C10803a.m31631a(context));
            DmtStatusView dmtStatusView2 = this.f83414c;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView2.mo25942f();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m103713a(VideoFilePlayerActivity videoFilePlayerActivity) {
        FrameLayout frameLayout = videoFilePlayerActivity.f83412a;
        if (frameLayout == null) {
            C7573i.m23583a("mBackBtn");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ RemoteImageView m103716b(VideoFilePlayerActivity videoFilePlayerActivity) {
        RemoteImageView remoteImageView = videoFilePlayerActivity.f83415d;
        if (remoteImageView == null) {
            C7573i.m23583a("mVideoCoverImage");
        }
        return remoteImageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ DmtStatusView m103719c(VideoFilePlayerActivity videoFilePlayerActivity) {
        DmtStatusView dmtStatusView = videoFilePlayerActivity.f83414c;
        if (dmtStatusView == null) {
            C7573i.m23583a("mLoadingStatusView");
        }
        return dmtStatusView;
    }

    /* renamed from: d */
    public static final /* synthetic */ C31944c m103721d(VideoFilePlayerActivity videoFilePlayerActivity) {
        C31944c cVar = videoFilePlayerActivity.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        return cVar;
    }

    /* renamed from: e */
    public static final /* synthetic */ ImageView m103723e(VideoFilePlayerActivity videoFilePlayerActivity) {
        ImageView imageView = videoFilePlayerActivity.f83413b;
        if (imageView == null) {
            C7573i.m23583a("mCenterPlayBtn");
        }
        return imageView;
    }

    /* renamed from: b */
    private final void m103717b(String str) {
        C31944c cVar = this.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar.mo82790d(str);
        C31944c cVar2 = this.f83416e;
        if (cVar2 == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar2.mo82782a();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", true);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        m103720c();
        setContentView((int) R.layout.ca);
        m103722d();
        m103724e();
        m103725f();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m103714a(EncryptedVideoContent encryptedVideoContent) {
        String str;
        if (encryptedVideoContent != null) {
            str = encryptedVideoContent.getTosKey();
        } else {
            str = null;
        }
        if (str != null && encryptedVideoContent.getSecretKey() != null) {
            String tosKey = encryptedVideoContent.getTosKey();
            if (tosKey == null) {
                C7573i.m23580a();
            }
            String secretKey = encryptedVideoContent.getSecretKey();
            if (secretKey == null) {
                C7573i.m23580a();
            }
            m103715a(tosKey, secretKey);
        } else if (!TextUtils.isEmpty(this.f83425o)) {
            String str2 = this.f83425o;
            if (str2 == null) {
                C7573i.m23580a();
            }
            m103717b(str2);
        } else {
            String string = getString(R.string.brk);
            C7573i.m23582a((Object) string, "getString(R.string.im_video_file_play_error)");
            mo82753a(string);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == null || view.getId() != R.id.bj0) {
            DmtStatusView dmtStatusView = this.f83414c;
            if (dmtStatusView == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            if (dmtStatusView.getVisibility() == 8) {
                C31944c cVar = this.f83416e;
                if (cVar == null) {
                    C7573i.m23583a("mTTVideoPlayer");
                }
                if (cVar.mo82791e()) {
                    C31944c cVar2 = this.f83416e;
                    if (cVar2 == null) {
                        C7573i.m23583a("mTTVideoPlayer");
                    }
                    cVar2.mo82785b();
                    return;
                } else if (this.f83425o != null) {
                    C31944c cVar3 = this.f83416e;
                    if (cVar3 == null) {
                        C7573i.m23583a("mTTVideoPlayer");
                    }
                    cVar3.mo82782a();
                    return;
                } else {
                    mo82754b();
                    DmtStatusView dmtStatusView2 = this.f83414c;
                    if (dmtStatusView2 == null) {
                        C7573i.m23583a("mLoadingStatusView");
                    }
                    dmtStatusView2.setVisibility(0);
                    m103714a(this.f83423m);
                }
            }
            return;
        }
        m103728i();
    }

    /* renamed from: a */
    public final void mo82753a(String str) {
        C10761a.m31396b((Context) this, str, 0).mo25750a();
        DmtStatusView dmtStatusView = this.f83414c;
        if (dmtStatusView == null) {
            C7573i.m23583a("mLoadingStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo82751a();
    }

    /* renamed from: a */
    private final void m103715a(String str, String str2) {
        C31938a.m103746a(str).mo6876a((C1591g<TResult, TContinuationResult>) new C31937e<TResult,TContinuationResult>(this, str2), C1592h.f5958b);
    }

    /* renamed from: b */
    private final void m103718b(String str, String str2) {
        C31944c cVar = this.f83416e;
        if (cVar == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar.mo82786b(str2);
        C31944c cVar2 = this.f83416e;
        if (cVar2 == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar2.mo82788c(str);
        C31944c cVar3 = this.f83416e;
        if (cVar3 == null) {
            C7573i.m23583a("mTTVideoPlayer");
        }
        cVar3.mo82782a();
    }

    /* renamed from: a */
    public final void mo82752a(C31941b bVar, String str) {
        String str2;
        C31940a aVar = bVar.f83442d;
        String str3 = null;
        if (aVar != null) {
            str2 = aVar.f83437a;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            this.f83425o = aVar.f83437a;
            m103718b(aVar.f83437a, str);
            return;
        }
        if (aVar != null) {
            str3 = aVar.f83438b;
        }
        if (str3 != null) {
            this.f83425o = aVar.f83438b;
            m103718b(aVar.f83438b, str);
            return;
        }
        String string = getString(R.string.brk);
        C7573i.m23582a((Object) string, "getString(R.string.im_video_file_play_error)");
        mo82753a(string);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        KeepSurfaceTextureView keepSurfaceTextureView = this.f83420j;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("mVideoTextureView");
        }
        if (keepSurfaceTextureView.f83483c) {
            C31944c cVar = this.f83416e;
            if (cVar == null) {
                C7573i.m23583a("mTTVideoPlayer");
            }
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f83420j;
            if (keepSurfaceTextureView2 == null) {
                C7573i.m23583a("mVideoTextureView");
            }
            cVar.mo82783a(keepSurfaceTextureView2.getSurface());
            m103714a(this.f83423m);
            return;
        }
        String string = getString(R.string.brk);
        C7573i.m23582a((Object) string, "getString(R.string.im_video_file_play_error)");
        mo82753a(string);
    }
}
