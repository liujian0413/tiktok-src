package com.p280ss.android.ugc.aweme.music.p1410ui.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.SimilarMusicListAdapter.C33924a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1414d.C33952a.C33953a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView */
public final class SimilarMusicVideoView extends RelativeLayout {

    /* renamed from: d */
    public static final C34002a f88678d = new C34002a(null);

    /* renamed from: a */
    public boolean f88679a;

    /* renamed from: b */
    public boolean f88680b;

    /* renamed from: c */
    public int f88681c;

    /* renamed from: e */
    private final View f88682e;

    /* renamed from: f */
    private final View f88683f;

    /* renamed from: g */
    private final SmartImageView f88684g;

    /* renamed from: h */
    private final KeepSurfaceTextureView f88685h;

    /* renamed from: i */
    private final LottieAnimationView f88686i;

    /* renamed from: j */
    private final FrameLayout f88687j;

    /* renamed from: k */
    private VideoViewComponent f88688k;

    /* renamed from: l */
    private final C28228a f88689l;

    /* renamed from: m */
    private long f88690m;

    /* renamed from: n */
    private Aweme f88691n;

    /* renamed from: o */
    private C33924a f88692o;

    /* renamed from: p */
    private C43200c f88693p;

    /* renamed from: q */
    private int f88694q;

    /* renamed from: r */
    private HashMap<Integer, Integer> f88695r;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView$a */
    public static final class C34002a {
        private C34002a() {
        }

        public /* synthetic */ C34002a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView$b */
    public static final class C34003b implements C44963i {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicVideoView f88696a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C34003b(SimilarMusicVideoView similarMusicVideoView) {
            this.f88696a = similarMusicVideoView;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f88696a.f88679a) {
                this.f88696a.f88679a = false;
                this.f88696a.mo86649c();
            }
        }
    }

    public SimilarMusicVideoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SimilarMusicVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: f */
    public final void mo86652f() {
        SmartImageView smartImageView = this.f88684g;
        C7573i.m23582a((Object) smartImageView, "mIvCover");
        smartImageView.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo86653g() {
        SmartImageView smartImageView = this.f88684g;
        C7573i.m23582a((Object) smartImageView, "mIvCover");
        smartImageView.setVisibility(8);
    }

    public final VideoViewComponent getVideoView() {
        VideoViewComponent videoViewComponent = this.f88688k;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        return videoViewComponent;
    }

    /* renamed from: h */
    private boolean m109519h() {
        VideoViewComponent videoViewComponent = this.f88688k;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        if (!videoViewComponent.mo107438d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo86645a() {
        Video video;
        Aweme aweme = this.f88691n;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            float width = (float) video.getWidth();
            float height = (float) video.getHeight();
            if (width / height > 0.75f) {
                KeepSurfaceTextureView keepSurfaceTextureView = this.f88685h;
                C7573i.m23582a((Object) keepSurfaceTextureView, "mSurfaceView");
                int width2 = keepSurfaceTextureView.getWidth();
                KeepSurfaceTextureView keepSurfaceTextureView2 = this.f88685h;
                C7573i.m23582a((Object) keepSurfaceTextureView2, "mSurfaceView");
                int i = (int) width;
                int i2 = (int) height;
                C34204g.m110446a(width2, keepSurfaceTextureView2.getHeight(), (View) this.f88685h, i, i2);
                KeepSurfaceTextureView keepSurfaceTextureView3 = this.f88685h;
                C7573i.m23582a((Object) keepSurfaceTextureView3, "mSurfaceView");
                int width3 = keepSurfaceTextureView3.getWidth();
                KeepSurfaceTextureView keepSurfaceTextureView4 = this.f88685h;
                C7573i.m23582a((Object) keepSurfaceTextureView4, "mSurfaceView");
                C34204g.m110446a(width3, keepSurfaceTextureView4.getHeight(), (View) this.f88684g, i, i2);
                return;
            }
            KeepSurfaceTextureView keepSurfaceTextureView5 = this.f88685h;
            C7573i.m23582a((Object) keepSurfaceTextureView5, "mSurfaceView");
            int width4 = keepSurfaceTextureView5.getWidth();
            KeepSurfaceTextureView keepSurfaceTextureView6 = this.f88685h;
            C7573i.m23582a((Object) keepSurfaceTextureView6, "mSurfaceView");
            C34204g.m110444a(width4, keepSurfaceTextureView6.getHeight(), this.f88685h, height / width);
        }
    }

    /* renamed from: b */
    public final void mo86648b() {
        Video video;
        C33924a aVar = this.f88692o;
        if (aVar != null) {
            aVar.mo86566a(false);
        }
        this.f88679a = false;
        HashMap<Integer, Integer> hashMap = this.f88695r;
        if (hashMap == null) {
            C7573i.m23583a("mLastplayingPosMap");
        }
        hashMap.put(Integer.valueOf(this.f88681c), Integer.valueOf(this.f88694q));
        C33924a aVar2 = this.f88692o;
        if (aVar2 != null) {
            aVar2.mo86564a(this.f88691n, this.f88681c, this.f88694q);
        }
        int i = this.f88689l.f74354a;
        if (i == 0) {
            mo86649c();
        } else if (i == 3) {
            VideoViewComponent videoViewComponent = this.f88688k;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            Aweme aweme = this.f88691n;
            String str = null;
            if (aweme != null) {
                video = aweme.getVideo();
            } else {
                video = null;
            }
            videoViewComponent.mo71660a(video);
            this.f88689l.f74354a = 4;
            LottieAnimationView lottieAnimationView = this.f88686i;
            C7573i.m23582a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            this.f88690m = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("resumeVideo resume : ");
            Aweme aweme2 = this.f88691n;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            sb.append(str);
        }
    }

    /* renamed from: d */
    public final void mo86650d() {
        String str;
        LottieAnimationView lottieAnimationView = this.f88686i;
        C7573i.m23582a((Object) lottieAnimationView, "mIvPlaying");
        lottieAnimationView.setVisibility(8);
        VideoViewComponent videoViewComponent = this.f88688k;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        if (videoViewComponent.mo107438d()) {
            VideoViewComponent videoViewComponent2 = this.f88688k;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo71672ad();
            if (this.f88690m > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f88690m;
                this.f88690m = -1;
                Aweme aweme = this.f88691n;
                String str2 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                Aweme aweme2 = this.f88691n;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                C33953a.m109413a(str, str2, Long.valueOf(currentTimeMillis));
            }
            this.f88689l.f74354a = 3;
        }
    }

    /* renamed from: e */
    public final void mo86651e() {
        String str;
        this.f88679a = false;
        LottieAnimationView lottieAnimationView = this.f88686i;
        C7573i.m23582a((Object) lottieAnimationView, "mIvPlaying");
        lottieAnimationView.setVisibility(8);
        if (this.f88689l.f74354a != 0) {
            VideoViewComponent videoViewComponent = this.f88688k;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent.mo71673ae();
            VideoViewComponent videoViewComponent2 = this.f88688k;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107435b();
            VideoViewComponent videoViewComponent3 = this.f88688k;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent3.mo71692b((C34976f) this.f88693p);
            this.f88689l.f74354a = 0;
            if (this.f88690m > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f88690m;
                this.f88690m = -1;
                Aweme aweme = this.f88691n;
                String str2 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                Aweme aweme2 = this.f88691n;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                C33953a.m109413a(str, str2, Long.valueOf(currentTimeMillis));
            }
            mo86652f();
        }
    }

    /* renamed from: c */
    public final void mo86649c() {
        Boolean bool;
        Boolean bool2;
        if (m109519h()) {
            C33924a aVar = this.f88692o;
            if (aVar != null) {
                aVar.mo86566a(false);
            }
            KeepSurfaceTextureView keepSurfaceTextureView = this.f88685h;
            C7573i.m23582a((Object) keepSurfaceTextureView, "mSurfaceView");
            keepSurfaceTextureView.setVisibility(0);
            LottieAnimationView lottieAnimationView = this.f88686i;
            C7573i.m23582a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            VideoViewComponent videoViewComponent = this.f88688k;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            C44962h hVar = videoViewComponent.f115582b;
            Video video = null;
            if (hVar != null) {
                bool = Boolean.valueOf(hVar.mo107459c());
            } else {
                bool = null;
            }
            if (bool != null) {
                VideoViewComponent videoViewComponent2 = this.f88688k;
                if (videoViewComponent2 == null) {
                    C7573i.m23583a("mVideoView");
                }
                C44962h hVar2 = videoViewComponent2.f115582b;
                if (hVar2 != null) {
                    bool2 = Boolean.valueOf(hVar2.mo107459c());
                } else {
                    bool2 = null;
                }
                if (bool2 == null) {
                    C7573i.m23580a();
                }
                if (!bool2.booleanValue()) {
                    this.f88679a = true;
                    return;
                }
            }
            C33924a aVar2 = this.f88692o;
            if (aVar2 != null) {
                aVar2.mo86564a(this.f88691n, this.f88681c, this.f88694q);
            }
            HashMap<Integer, Integer> hashMap = this.f88695r;
            if (hashMap == null) {
                C7573i.m23583a("mLastplayingPosMap");
            }
            hashMap.put(Integer.valueOf(this.f88681c), Integer.valueOf(this.f88694q));
            int i = this.f88689l.f74354a;
            if (i == 0) {
                VideoViewComponent videoViewComponent3 = this.f88688k;
                if (videoViewComponent3 == null) {
                    C7573i.m23583a("mVideoView");
                }
                videoViewComponent3.mo71663a((C34976f) this.f88693p);
                VideoViewComponent videoViewComponent4 = this.f88688k;
                if (videoViewComponent4 == null) {
                    C7573i.m23583a("mVideoView");
                }
                Aweme aweme = this.f88691n;
                if (aweme != null) {
                    video = aweme.getVideo();
                }
                videoViewComponent4.mo71661a(video, true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
                this.f88679a = false;
                this.f88689l.f74354a = 2;
                this.f88690m = System.currentTimeMillis();
            } else if (i == 3) {
                mo86648b();
                return;
            }
            return;
        }
        KeepSurfaceTextureView keepSurfaceTextureView2 = this.f88685h;
        C7573i.m23582a((Object) keepSurfaceTextureView2, "mSurfaceView");
        keepSurfaceTextureView2.setVisibility(8);
    }

    public final void setIsNeedPlay(boolean z) {
        this.f88680b = z;
    }

    public final void setStartPlayTime(long j) {
        this.f88690m = j;
    }

    public final void setIvPlayingVisibility(boolean z) {
        if (z) {
            LottieAnimationView lottieAnimationView = this.f88686i;
            C7573i.m23582a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            return;
        }
        LottieAnimationView lottieAnimationView2 = this.f88686i;
        C7573i.m23582a((Object) lottieAnimationView2, "mIvPlaying");
        lottieAnimationView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo86646a(int i) {
        SmartImageView smartImageView = this.f88684g;
        C7573i.m23582a((Object) smartImageView, "mIvCover");
        smartImageView.getLayoutParams().height = i;
        KeepSurfaceTextureView keepSurfaceTextureView = this.f88685h;
        C7573i.m23582a((Object) keepSurfaceTextureView, "mSurfaceView");
        keepSurfaceTextureView.getLayoutParams().height = i;
        FrameLayout frameLayout = this.f88687j;
        C7573i.m23582a((Object) frameLayout, "mFrameLayout");
        frameLayout.getLayoutParams().height = i;
        View view = this.f88683f;
        C7573i.m23582a((Object) view, "mIvBlackBg");
        view.getLayoutParams().height = i;
        this.f88688k = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f88688k;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent.mo107433a(this.f88685h);
        VideoViewComponent videoViewComponent2 = this.f88688k;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent2.mo107434a((C44963i) new C34003b(this));
    }

    public SimilarMusicVideoView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f88682e = LayoutInflater.from(context).inflate(R.layout.a38, this, true);
        this.f88683f = this.f88682e.findViewById(R.id.lf);
        this.f88684g = (SmartImageView) this.f88682e.findViewById(R.id.b7x);
        this.f88685h = (KeepSurfaceTextureView) this.f88682e.findViewById(R.id.dij);
        this.f88686i = (LottieAnimationView) this.f88682e.findViewById(R.id.bb7);
        this.f88687j = (FrameLayout) this.f88682e.findViewById(R.id.am3);
        this.f88689l = new C28228a();
        this.f88680b = true;
        this.f88690m = -1;
    }

    public /* synthetic */ SimilarMusicVideoView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo86647a(Aweme aweme, int i, C43200c cVar, C33924a aVar, HashMap<Integer, Integer> hashMap, int i2) {
        UrlModel urlModel;
        C7573i.m23587b(hashMap, "posMap");
        this.f88691n = aweme;
        this.f88681c = i;
        this.f88693p = cVar;
        this.f88692o = aVar;
        this.f88695r = hashMap;
        this.f88694q = i2;
        Aweme aweme2 = this.f88691n;
        if (aweme2 != null) {
            Video video = aweme2.getVideo();
            if (video != null) {
                urlModel = video.getOriginCover();
                C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("SimilarMusicVideoView").mo29844a((C12128i) this.f88684g).mo29848a();
            }
        }
        urlModel = null;
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("SimilarMusicVideoView").mo29844a((C12128i) this.f88684g).mo29848a();
    }
}
