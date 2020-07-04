package dmt.p1861av.video.superentrance;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.SafeHandler;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.superentrance.p1864a.C47495a;
import dmt.p1861av.video.superentrance.p1864a.C47496b;
import dmt.p1861av.video.superentrance.player.SuperEntranceVideoPlayer;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: dmt.av.video.superentrance.SuperEntranceActivity */
public final class SuperEntranceActivity extends AmeActivity {

    /* renamed from: c */
    public static final C47482c f121921c = new C47482c(null);

    /* renamed from: a */
    public final SafeHandler f121922a = new SafeHandler(this);

    /* renamed from: b */
    public SuperEntranceVideoPlayer f121923b;

    /* renamed from: d */
    private KeepSurfaceTextureView f121924d;

    /* renamed from: e */
    private boolean f121925e;

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$a */
    public static final class C47480a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ImageView f121926a;

        /* renamed from: b */
        final /* synthetic */ ImageView f121927b;

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f121926a;
            C7573i.m23582a((Object) imageView, "imgJump");
            imageView.setImageAlpha(0);
            ImageView imageView2 = this.f121927b;
            C7573i.m23582a((Object) imageView2, "imgGo");
            imageView2.setImageAlpha(0);
            ImageView imageView3 = this.f121927b;
            C7573i.m23582a((Object) imageView3, "imgGo");
            imageView3.setTranslationY(60.0f);
        }

        C47480a(ImageView imageView, ImageView imageView2) {
            this.f121926a = imageView;
            this.f121927b = imageView2;
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$b */
    static final class C47481b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f121928a;

        /* renamed from: b */
        final /* synthetic */ ImageView f121929b;

        C47481b(ImageView imageView, ImageView imageView2) {
            this.f121928a = imageView;
            this.f121929b = imageView2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int floatValue = (int) (((Float) animatedValue).floatValue() * 255.0f);
                ImageView imageView = this.f121928a;
                C7573i.m23582a((Object) imageView, "imgJump");
                imageView.setImageAlpha(floatValue);
                ImageView imageView2 = this.f121929b;
                C7573i.m23582a((Object) imageView2, "imgGo");
                imageView2.setImageAlpha(floatValue);
                ImageView imageView3 = this.f121929b;
                C7573i.m23582a((Object) imageView3, "imgGo");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    imageView3.setTranslationY(60.0f - (((Float) animatedValue2).floatValue() * 60.0f));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$c */
    public static final class C47482c {
        private C47482c() {
        }

        public /* synthetic */ C47482c(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m148217a(Context context) {
            C7573i.m23587b(context, "context");
            context.startActivity(new Intent(context, SuperEntranceActivity.class));
        }

        /* renamed from: a */
        public static void m148218a(Context context, Intent intent) {
            C7573i.m23587b(context, "context");
            Object service = ServiceManager.get().getService(IAVServiceProxy.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
            C35578o applicationService = ((IAVServiceProxy) service).getApplicationService();
            C7573i.m23582a((Object) applicationService, "ServiceManager.get().get…      .applicationService");
            Intent intent2 = new Intent(context, applicationService.mo83137d());
            intent2.setFlags(335544320);
            C47495a.m148231a(intent, intent2);
            C47495a.m148232b(intent, intent2);
            if (!(intent == null || intent.getExtras() == null)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C7573i.m23580a();
                }
                intent2.putExtras(extras);
            }
            context.startActivity(intent2);
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$d */
    static final class C47483d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f121930a;

        C47483d(SuperEntranceActivity superEntranceActivity) {
            this.f121930a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m148219a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m148219a() {
            C41530am.m132280a("onFirstParagraphPlayCompleted showEnterRecordLayout()");
            this.f121930a.mo119602a();
            this.f121930a.f121922a.postDelayed(C474841.f121931a, 200);
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$e */
    static final class C47485e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f121932a;

        C47485e(SuperEntranceActivity superEntranceActivity) {
            this.f121932a = superEntranceActivity;
        }

        public final void run() {
            C41530am.m132280a("handler post showEnterRecordLayout()");
            this.f121932a.mo119602a();
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$f */
    static final class C47486f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f121933a;

        C47486f(SuperEntranceActivity superEntranceActivity) {
            this.f121933a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m148220a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m148220a() {
            SuperEntranceActivity.m148211a(this.f121933a).stop();
            this.f121933a.mo119603b();
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$g */
    static final class C47487g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f121934a;

        C47487g(SuperEntranceActivity superEntranceActivity) {
            this.f121934a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo119608a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo119608a() {
            new C47498b().mo119613a(true);
            String str = "";
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                SuperEntranceConfig superEntranceConfig = a.getSuperEntranceConfig();
                C7573i.m23582a((Object) superEntranceConfig, "SettingsReader.get().superEntranceConfig");
                String effectTip = superEntranceConfig.getEffectTip();
                C7573i.m23582a((Object) effectTip, "SettingsReader.get().superEntranceConfig.effectTip");
                str = effectTip;
            } catch (Exception unused) {
            }
            String uuid = UUID.randomUUID().toString();
            C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
            Activity activity = this.f121934a;
            Intent intent = new Intent();
            intent.putExtra("extra_enter_record_form_super_entrance", true);
            intent.putExtra("shoot_way", "super_entrance_splash");
            intent.putExtra("extra_camera_facing", 1);
            intent.putExtra("extra_super_entrance_pop", str);
            intent.putExtra("creation_id", uuid);
            C41548c.m132317a(activity, intent);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new LinearInterpolator());
            final FrameLayout frameLayout = (FrameLayout) this.f121934a.findViewById(R.id.cwi);
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7573i.m23582a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = 1.0f - (((Float) animatedValue).floatValue() * 0.1f);
                        FrameLayout frameLayout = frameLayout;
                        C7573i.m23582a((Object) frameLayout, "root");
                        frameLayout.setScaleX(floatValue);
                        FrameLayout frameLayout2 = frameLayout;
                        C7573i.m23582a((Object) frameLayout2, "root");
                        frameLayout2.setScaleY(floatValue);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ofFloat.start();
            this.f121934a.finish();
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "super_entrance_splash").f60753a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$h */
    static final class C47489h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C47487g f121936a;

        /* renamed from: b */
        final /* synthetic */ SuperEntranceActivity f121937b;

        C47489h(C47487g gVar, SuperEntranceActivity superEntranceActivity) {
            this.f121936a = gVar;
            this.f121937b = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo119610a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo119610a() {
            final C47500c cVar = new C47500c(this.f121937b);
            cVar.mo119620a((C7562b<? super Boolean, C7581n>) new C7562b<Boolean, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C47489h f121938a;

                {
                    this.f121938a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m148223a(((Boolean) obj).booleanValue());
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m148223a(boolean z) {
                    if (z) {
                        this.f121938a.f121936a.mo119608a();
                    } else {
                        cVar.mo119621b(new C7562b<Boolean, C7581n>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C474901 f121940a;

                            {
                                this.f121940a = r1;
                            }

                            /* renamed from: a */
                            private void m148224a(boolean z) {
                                if (z) {
                                    this.f121940a.f121938a.f121936a.mo119608a();
                                }
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                m148224a(((Boolean) obj).booleanValue());
                                return C7581n.f20898a;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$i */
    static final class C47492i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C47489h f121941a;

        /* renamed from: b */
        final /* synthetic */ SuperEntranceActivity f121942b;

        C47492i(C47489h hVar, SuperEntranceActivity superEntranceActivity) {
            this.f121941a = hVar;
            this.f121942b = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m148225a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m148225a() {
            SuperEntranceActivity.m148211a(this.f121942b).stop();
            if (!C35563c.f93260w.mo57090c()) {
                C21164d dVar = C35563c.f93260w;
                SuperEntranceActivity superEntranceActivity = this.f121942b;
                if (superEntranceActivity != null) {
                    dVar.mo57085a((Activity) superEntranceActivity, "", "schema_record", (Bundle) null, (C21165a) new C21165a(this) {

                        /* renamed from: a */
                        final /* synthetic */ C47492i f121943a;

                        /* renamed from: a */
                        public final void mo57093a() {
                            this.f121943a.f121941a.mo119610a();
                        }

                        /* renamed from: b */
                        public final void mo57094b() {
                            this.f121943a.f121942b.mo119603b();
                        }

                        {
                            this.f121943a = r1;
                        }
                    });
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            this.f121941a.mo119610a();
        }
    }

    /* renamed from: a */
    public static final void m148212a(Context context, Intent intent) {
        C47482c.m148218a(context, intent);
    }

    public final void onBackPressed() {
    }

    /* renamed from: b */
    public final void mo119603b() {
        C47482c.m148218a(this, getIntent());
        finish();
        overridePendingTransition(0, R.anim.q);
    }

    /* renamed from: c */
    private final void m148213c() {
        RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.eby);
        Context context = this;
        ImageRequest b = ImageRequestBuilder.m40865a(Uri.fromFile(new File(C47507e.m148257a()))).mo33468a(new C13596d(C23482j.m77098b(context), C23482j.m77095a(context))).mo33476b();
        C13382e a = C13380c.m39166a();
        C7573i.m23582a((Object) remoteImageView, "videoBackImage");
        remoteImageView.setController(((C13382e) ((C13382e) a.mo32729b(remoteImageView.getController())).mo32748b(b)).mo32730f());
    }

    /* renamed from: d */
    private final void m148214d() {
        float f;
        Context context = this;
        float b = ((float) C23482j.m77098b(context)) * 1.0f;
        float a = ((float) C23482j.m77095a(context)) * 1.0f;
        float f2 = (b / 9.0f) * 16.0f;
        if (f2 >= a) {
            f = b;
        } else {
            f = 9.0f * (a / 16.0f);
            f2 = a;
        }
        KeepSurfaceTextureView keepSurfaceTextureView = this.f121924d;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("videoView");
        }
        LayoutParams layoutParams = keepSurfaceTextureView.getLayoutParams();
        layoutParams.width = (int) f;
        layoutParams.height = (int) f2;
        KeepSurfaceTextureView keepSurfaceTextureView2 = this.f121924d;
        if (keepSurfaceTextureView2 == null) {
            C7573i.m23583a("videoView");
        }
        keepSurfaceTextureView2.setLayoutParams(layoutParams);
        KeepSurfaceTextureView keepSurfaceTextureView3 = this.f121924d;
        if (keepSurfaceTextureView3 == null) {
            C7573i.m23583a("videoView");
        }
        keepSurfaceTextureView3.setTranslationX((-(f - b)) / 2.0f);
        KeepSurfaceTextureView keepSurfaceTextureView4 = this.f121924d;
        if (keepSurfaceTextureView4 == null) {
            C7573i.m23583a("videoView");
        }
        keepSurfaceTextureView4.setTranslationY((-(f2 - a)) / 2.0f);
    }

    /* renamed from: a */
    public final void mo119602a() {
        StringBuilder sb = new StringBuilder("called showEnterRecordLayout() -> ");
        sb.append(this.f121925e);
        C41530am.m132280a(sb.toString());
        if (!this.f121925e) {
            this.f121925e = true;
            View inflate = ((ViewStub) findViewById(R.id.edg)).inflate();
            ImageView imageView = (ImageView) inflate.findViewById(R.id.azv);
            C47496b.m148233a(imageView, new C47486f(this));
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.azu);
            C47496b.m148233a(imageView2, new C47492i(new C47489h(new C47487g(this), this), this));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new C47480a(imageView, imageView2));
            ofFloat.addUpdateListener(new C47481b(imageView, imageView2));
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SuperEntranceVideoPlayer m148211a(SuperEntranceActivity superEntranceActivity) {
        SuperEntranceVideoPlayer superEntranceVideoPlayer = superEntranceActivity.f121923b;
        if (superEntranceVideoPlayer == null) {
            C7573i.m23583a("videoPlayer");
        }
        return superEntranceVideoPlayer;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        getWindow().setBackgroundDrawableResource(R.drawable.splash_bg_normal);
        if (!C22911a.m75401a(this)) {
            C23487o.m77136a((Activity) this);
        }
        setContentView((int) R.layout.ex);
        View findViewById = findViewById(R.id.ebx);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.video_view)");
        this.f121924d = (KeepSurfaceTextureView) findViewById;
        m148214d();
        C0043i iVar = this;
        KeepSurfaceTextureView keepSurfaceTextureView = this.f121924d;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("videoView");
        }
        this.f121923b = new SuperEntranceVideoPlayer(iVar, keepSurfaceTextureView, new C47483d(this));
        m148213c();
        this.f121922a.postDelayed(new C47485e(this), 6000);
    }
}
