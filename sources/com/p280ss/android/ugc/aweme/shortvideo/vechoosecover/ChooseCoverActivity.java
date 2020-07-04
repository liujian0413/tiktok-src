package com.p280ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEChooseVideoCoverFragment.C38629a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39508b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.utils.C43021cp;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47419ae;
import dmt.p1861av.video.C47458g;
import dmt.p1861av.video.C47462j;
import dmt.p1861av.video.C47466l;
import dmt.p1861av.video.C47514t;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47520y;
import dmt.p1861av.video.VEEditorAutoStartStopArbiter.C47383a;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import dmt.p1861av.video.p1862a.C47398a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity */
public class ChooseCoverActivity extends AmeSSActivity implements C38629a, C47383a {

    /* renamed from: a */
    public VideoPublishEditModel f108050a;

    /* renamed from: b */
    public C47419ae f108051b;

    /* renamed from: c */
    public VEChooseVideoCoverFragment f108052c;

    /* renamed from: d */
    public SurfaceView f108053d;

    /* renamed from: e */
    public ImageView f108054e;

    /* renamed from: f */
    private C0044j f108055f = new C0044j(this);

    /* renamed from: g */
    private C0052o<Bitmap> f108056g = new C0052o<>();

    /* renamed from: h */
    private C0052o<Boolean> f108057h = new C0052o<>();

    /* renamed from: i */
    private int f108058i;

    /* renamed from: j */
    private int f108059j;

    /* renamed from: k */
    private HashMap<Integer, StickerItemModel> f108060k;

    /* renamed from: l */
    private C0052o<C47516v> f108061l = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity$a */
    class C41583a extends C0609a {
        /* renamed from: a */
        private void m132432a() {
            Intent intent = new Intent();
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", ChooseCoverActivity.this.f108050a);
            ChooseCoverActivity.this.setResult(-1, intent);
            ChooseCoverActivity.this.finish();
        }

        C41583a() {
        }

        public final void onFragmentDetached(C0608j jVar, Fragment fragment) {
            super.onFragmentDetached(jVar, fragment);
            if (fragment instanceof VEChooseVideoCoverFragment) {
                m132432a();
            }
        }

        public final void onFragmentActivityCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
            super.onFragmentActivityCreated(jVar, fragment, bundle);
            if (fragment instanceof VEChooseVideoCoverFragment) {
                final VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) fragment;
                if (ChooseCoverActivity.this.f108051b.f121777s != null) {
                    ChooseCoverActivity.this.f108051b.f121777s.mo119465a(true);
                }
                vEChooseVideoCoverFragment.getView().postDelayed(new Runnable() {
                    public final void run() {
                        FragmentActivity activity = vEChooseVideoCoverFragment.getActivity();
                        if (!vEChooseVideoCoverFragment.mDetached && activity != null && !activity.isFinishing()) {
                            C41583a.this.mo102213a(vEChooseVideoCoverFragment, ChooseCoverActivity.this.getResources().getColor(R.color.a47), vEChooseVideoCoverFragment.mo96634b(), vEChooseVideoCoverFragment.mo96636d(), vEChooseVideoCoverFragment.mo96635c(), 0, C39805en.m127451d(activity));
                        }
                    }
                }, 300);
            }
        }

        /* renamed from: a */
        public final void mo102212a(int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) ChooseCoverActivity.this.f108054e.getLayoutParams();
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            ChooseCoverActivity.this.f108054e.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public final void mo102213a(VEChooseVideoCoverFragment vEChooseVideoCoverFragment, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i;
            ChooseCoverActivity.this.f108051b.f121778t.mo38823b(i);
            final int e = C39805en.m127452e(vEChooseVideoCoverFragment.getActivity());
            final int width = ChooseCoverActivity.this.f108053d.getWidth();
            VESize c = ChooseCoverActivity.this.f108051b.f121778t.mo38828c();
            float f = (float) c.f116386b;
            final float f2 = ((float) c.f116385a) / f;
            float f3 = (float) width;
            float f4 = (float) i4;
            if (f2 > f3 / f4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, (float) ((int) (f3 / f2))});
                ofFloat.setDuration(0);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                final float f5 = f2;
                final int i8 = i3;
                final int i9 = i2;
                final int i10 = i6;
                C415852 r0 = new AnimatorUpdateListener(0) {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int i = (int) (((((((float) e) - (((float) (i8 - i9)) * animatedFraction)) - floatValue) / 2.0f) + ((float) 0)) - ((float) i10));
                        int i2 = (int) (f5 * floatValue);
                        int i3 = (int) floatValue;
                        ChooseCoverActivity.this.f108051b.f121778t.mo38798a(0, i, i2, i3);
                        C41583a.this.mo102212a(0, i, i2, i3);
                        ChooseCoverActivity.this.mo102207a(0, i, i2, i3);
                    }
                };
                ofFloat.addUpdateListener(r0);
                ofFloat.start();
            } else {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{f, f4});
                ofFloat2.setDuration(0);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                final int i11 = i2;
                ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f = f2 * floatValue;
                        int i = (int) ((((float) width) - f) / 2.0f);
                        int i2 = (int) (((float) i11) * animatedFraction);
                        int i3 = (int) f;
                        int i4 = (int) floatValue;
                        ChooseCoverActivity.this.f108051b.f121778t.mo38798a(i, i2, i3, i4);
                        C41583a.this.mo102212a(i, i2, i3, i4);
                        ChooseCoverActivity.this.mo102207a(i, i2, i3, i4);
                    }
                });
                ofFloat2.start();
            }
            ChooseCoverActivity.this.f108051b.f121778t.mo38832c(true);
            if (!ChooseCoverActivity.this.f108050a.isMvThemeVideoType()) {
                ChooseCoverActivity.this.f108052c.mo88413c(0.0f);
            }
        }
    }

    /* renamed from: b */
    public final C0052o<C47516v> mo96643b() {
        return this.f108061l;
    }

    /* renamed from: c */
    public final VideoPublishEditModel mo96644c() {
        return this.f108050a;
    }

    public Lifecycle getLifecycle() {
        return this.f108055f;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final C15389d mo96642a() {
        return this.f108051b.f121778t;
    }

    /* renamed from: d */
    public final void mo102210d() {
        if (this.f108052c != null) {
            this.f108052c.mo96637e();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.s, R.anim.t);
    }

    public void onBackPressed() {
        if (this.f108052c != null && !this.f108052c.mo96632a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: e */
    private void m132421e() {
        this.f108054e = (ImageView) findViewById(R.id.ebd);
        this.f108053d = (SurfaceView) findViewById(R.id.cj6);
    }

    public void onDestroy() {
        this.f108055f.mo117a(State.DESTROYED);
        mo96642a().mo38883z();
        this.f108051b.mo119572b();
        super.onDestroy();
    }

    /* renamed from: f */
    private void m132422f() {
        boolean z;
        C47520y yVar;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        this.f108050a = (VideoPublishEditModel) getIntent().getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        this.f108051b = new C47419ae(this.f108050a.videoEditorType);
        this.f108051b.mo119560a(C47398a.f121687p);
        if (this.f108050a.mVideoCanvasWidth <= 0 || this.f108050a.mVideoCanvasHeight <= 0) {
            this.f108058i = this.f108050a.videoWidth();
            this.f108059j = this.f108050a.videoHeight();
            if (this.f108059j == 0 || this.f108058i == 0) {
                if (this.f108050a.getOriginal() == 0) {
                    iVideoConfigService = C35563c.f93255r;
                } else {
                    iVideoConfigService = C35563c.f93254q;
                }
                this.f108058i = iVideoConfigService.getVideoWidth();
                if (this.f108050a.getOriginal() == 0) {
                    iVideoConfigService2 = C35563c.f93255r;
                } else {
                    iVideoConfigService2 = C35563c.f93254q;
                }
                this.f108059j = iVideoConfigService2.getVideoHeight();
            }
        } else {
            this.f108058i = this.f108050a.mVideoCanvasWidth;
            this.f108059j = this.f108050a.mVideoCanvasHeight;
        }
        char c = 65535;
        VEPreviewParams a = C39526e.m126247a(this.f108050a, -1, 30);
        C0052o oVar = new C0052o();
        oVar.setValue(a);
        C0052o oVar2 = new C0052o();
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f121606a = this.f108050a.mMusicPath;
        vEPreviewMusicParams.f121607b = this.f108050a.mMusicStart;
        vEPreviewMusicParams.f121608c = C43021cp.m136536a(this.f108050a.mMusicPath, C43021cp.m136538a(this.f108050a));
        if (!C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) || C39360dw.m125725a().mo97931b() == null || C39360dw.m125725a().mo97931b().getShootDuration() <= 0 || Math.abs(vEPreviewMusicParams.f121608c - C39360dw.m125725a().mo97931b().getShootDuration()) < 1000) {
            vEPreviewMusicParams.f121609d = vEPreviewMusicParams.f121608c;
        } else {
            vEPreviewMusicParams.f121609d = C39360dw.m125725a().mo97931b().getShootDuration();
        }
        vEPreviewMusicParams.f121610e = this.f108050a.musicVolume;
        vEPreviewMusicParams.f121611f = this.f108050a.musicId;
        vEPreviewMusicParams.f121612g = this.f108050a.previewStartTime;
        oVar2.setValue(vEPreviewMusicParams);
        C47458g gVar = new C47458g();
        if (this.f108050a.mEffectList != null) {
            C47514t.m148293a(this.f108050a.mEffectList, gVar);
        }
        C0052o<InfoStickerModel> oVar3 = new C0052o<>();
        oVar3.setValue(this.f108050a.infoStickerModel);
        C47462j<C47520y> jVar = new C47462j<>();
        if (this.f108050a.mTimeEffect != null) {
            String key = this.f108050a.mTimeEffect.getKey();
            switch (key.hashCode()) {
                case 48:
                    if (key.equals("0")) {
                        c = 0;
                        break;
                    }
                    break;
                case 49:
                    if (key.equals("1")) {
                        c = 3;
                        break;
                    }
                    break;
                case 50:
                    if (key.equals("2")) {
                        c = 1;
                        break;
                    }
                    break;
                case 51:
                    if (key.equals("3")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    yVar = C47520y.m148314a();
                    break;
                case 1:
                    yVar = C47520y.m148315a((long) this.f108050a.mTimeEffect.getEndPoint());
                    break;
                case 2:
                    yVar = C47520y.m148317b((long) this.f108050a.mTimeEffect.getEndPoint());
                    break;
                case 3:
                    yVar = C47520y.m148316b();
                    break;
                default:
                    throw new AssertionError();
            }
            jVar.setValue(yVar);
        }
        this.f108051b.f121762d = oVar;
        this.f108051b.f121763e = oVar2;
        this.f108051b.f121766h = gVar;
        this.f108051b.f121764f = new C0052o();
        this.f108051b.f121765g = this.f108061l;
        this.f108051b.mo119568a(new ArrayList<>());
        this.f108051b.f121767i = jVar;
        C47462j<C47466l> jVar2 = new C47462j<>();
        C0052o<AudioRecorderParam> oVar4 = new C0052o<>();
        this.f108051b.f121769k = oVar4;
        this.f108051b.f121768j = jVar2;
        this.f108051b.f121770l = new C0052o();
        this.f108051b.f121771m = new C0052o();
        this.f108051b.mo119562a(new C0052o<>());
        this.f108051b.f121772n = oVar3;
        C0052o oVar5 = new C0052o();
        oVar5.setValue(new C39508b(this.f108050a.autoEnhanceOn, this.f108050a.autoEnhanceType, true));
        this.f108051b.f121775q = oVar5;
        this.f108051b.f121782x.observe(this, new C41587a(this));
        this.f108055f.mo117a(State.STARTED);
        this.f108051b.mo119563a(this, this, this.f108053d);
        if (this.f108050a.mTimeEffect == null || !this.f108050a.mTimeEffect.getKey().equals("1")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.f108050a.isFastImport) {
                this.f108051b.f121778t.mo38793a(this.f108050a.getPreviewInfo().getReverseVideoArray(), this.f108050a.getPreviewInfo().getReverseAudioArray());
                this.f108051b.f121778t.mo38802a(this.f108050a.getPreviewInfo().getTempVideoArray());
            } else {
                this.f108051b.f121778t.mo38821b(this.f108050a.getPreviewInfo().getReverseVideoArray());
            }
            this.f108051b.f121778t.mo38839e(true);
            if (this.f108050a.isFastImport) {
                this.f108051b.f121778t.mo38803a(this.f108051b.f121778t.mo38796a().f116803h, this.f108051b.f121778t.mo38796a().f116804i, a.mVolume);
            }
        }
        if (this.f108050a.veAudioRecorderParam != null) {
            oVar4.setValue(this.f108050a.veAudioRecorderParam);
        }
        if (this.f108050a.veAudioEffectParam != null) {
            this.f108050a.veAudioEffectParam.setShowErrorToast(false);
            this.f108050a.veAudioEffectParam.setPreprocessResult(null);
            jVar2.setValue(C47466l.m148179a(true, this.f108050a.isReviewVideo(), this.f108050a.veAudioEffectParam));
        }
        if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
            this.f108051b.f121778t.mo38817b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f108050a.mSelectedId).mo74978b(), this.f108050a.mSelectedFilterIntensity);
        } else {
            this.f108051b.f121778t.mo38779a(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f108050a.mSelectedId).mo74978b(), 1.0f);
        }
        C39804em.m127439b(this.f108053d, this.f108058i, this.f108059j);
    }

    /* renamed from: b */
    private boolean m132420b(Bundle bundle) {
        if (bundle != null && (getSupportFragmentManager().mo2644a("cover") instanceof VEChooseVideoCoverFragment)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102209a(Void voidR) {
        C6921a.m21555a("receive prepare done event in publish preview page");
        if (this.f108060k == null) {
            this.f108060k = new HashMap<>();
        } else {
            this.f108060k.clear();
        }
        this.f108051b.mo119569a(this.f108060k);
        SubtitleModule.m131121a(this.f108051b.f121778t, C35563c.f93238a, this.f108050a, this.f108060k);
    }

    /* renamed from: a */
    private void m132419a(Bundle bundle) {
        if (m132420b(bundle)) {
            this.f108052c = new VEChooseVideoCoverFragment();
            getSupportFragmentManager().mo2645a().mo2586a(R.id.bk9, this.f108052c, "cover").mo2606d();
        } else {
            this.f108052c = (VEChooseVideoCoverFragment) getSupportFragmentManager().mo2644a("cover");
        }
        this.f108057h.observe(this, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                int i;
                ImageView imageView = ChooseCoverActivity.this.f108054e;
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        });
        this.f108056g.observe(this, new C0053p<Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Bitmap bitmap) {
                ChooseCoverActivity.this.f108054e.setImageBitmap(bitmap);
            }
        });
        this.f108052c.f100346n = this.f108057h;
        this.f108052c.f100345m = this.f108056g;
        getSupportFragmentManager().mo2649a((C0609a) new C41583a(), false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        setContentView((int) R.layout.f9);
        if (!C22911a.m75401a(this)) {
            C23487o.m77136a((Activity) this);
        }
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        m132421e();
        m132422f();
        m132419a(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m132418a(Activity activity, VideoPublishEditModel videoPublishEditModel, int i) {
        Intent intent = new Intent(activity, ChooseCoverActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", videoPublishEditModel);
        activity.startActivityForResult(intent, 4);
        activity.overridePendingTransition(R.anim.s, R.anim.t);
    }

    /* renamed from: a */
    public final void mo102207a(int i, int i2, int i3, int i4) {
        if (!(this.f108050a == null || this.f108050a.getMainBusinessContext() == null)) {
            InteractStickerStruct a = C39604b.m126707a(this.f108050a.getMainBusinessContext(), 1, InteractTrackPage.TRACK_PAGE_EDIT);
            if (!(a == null || a.getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.cja);
                View findViewById = findViewById(R.id.ecr);
                if (C6399b.m19946v()) {
                    findViewById.setBackgroundColor(-1);
                }
                if (votingStickerView != null) {
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    int top = this.f108053d.getTop() + i2;
                    if (top > 0) {
                        layoutParams.height = top;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                    }
                    int i5 = this.f108051b.f121778t.mo38828c().f116385a;
                    int i6 = this.f108051b.f121778t.mo38828c().f116386b;
                    float min = Math.min(((float) i3) / ((float) i5), ((float) i4) / ((float) i6));
                    votingStickerView.mo98910a(a.getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.mo98912b();
                    votingStickerView.setEditEnable(false);
                    C41588b bVar = new C41588b(this, a, i5, min, i6, votingStickerView, i, i2);
                    votingStickerView.post(bVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102208a(InteractStickerStruct interactStickerStruct, int i, float f, int i2, VotingStickerView votingStickerView, int i3, int i4) {
        NormalTrackTimeStamp a = C39604b.m126708a(interactStickerStruct);
        if (a != null) {
            Point point = new Point((int) (a.getX() * ((float) i) * f), (int) (a.getY() * ((float) i2) * f));
            votingStickerView.setX((float) (((this.f108053d.getLeft() + i3) + point.x) - (votingStickerView.getWidth() / 2)));
            votingStickerView.setY((float) (((this.f108053d.getTop() + i4) + point.y) - (votingStickerView.getHeight() / 2)));
            votingStickerView.setRotation(a.getRotation());
            votingStickerView.setScaleX(a.getScale().floatValue() * f);
            votingStickerView.setScaleY(a.getScale().floatValue() * f);
            votingStickerView.setVisibility(0);
        }
    }
}
