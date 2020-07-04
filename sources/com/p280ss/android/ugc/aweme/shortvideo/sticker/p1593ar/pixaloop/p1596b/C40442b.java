package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1596b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.views.C43373i;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b */
public final class C40442b extends Dialog {

    /* renamed from: b */
    public static final C40443a f105153b = new C40443a(null);

    /* renamed from: a */
    public AnimatedImageView f105154a;

    /* renamed from: c */
    private DmtLoadingLayout f105155c;

    /* renamed from: d */
    private KeepSurfaceTextureView f105156d;

    /* renamed from: e */
    private VideoViewComponent f105157e;

    /* renamed from: f */
    private DmtTextView f105158f;

    /* renamed from: g */
    private Video f105159g;

    /* renamed from: h */
    private C40449d f105160h;

    /* renamed from: i */
    private Handler f105161i;

    /* renamed from: j */
    private final FaceStickerBean f105162j;

    /* renamed from: k */
    private final C40441a f105163k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$a */
    public static final class C40443a {
        private C40443a() {
        }

        public /* synthetic */ C40443a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m129343a(FaceStickerBean faceStickerBean) {
            if (faceStickerBean == null || !C40426a.m129287f()) {
                return false;
            }
            String a = C23337e.m76561a(C35574k.m114861b(), C35574k.m114859a().mo70070D().mo83222a()).mo60623a("pixaloop_show", "");
            CharSequence charSequence = a;
            if (TextUtils.isEmpty(charSequence)) {
                return true;
            }
            C7573i.m23582a((Object) a, "showSwitch");
            if (!C7634n.m23776c(charSequence, (CharSequence) String.valueOf(faceStickerBean.getStickerId()), false)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$b */
    public static final class C40444b implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C40442b f105164a;

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        public final void aA_() {
            if (this.f105164a.f105154a != null) {
                AnimatedImageView animatedImageView = this.f105164a.f105154a;
                if (animatedImageView == null) {
                    C7573i.m23580a();
                }
                animatedImageView.setVisibility(0);
            }
        }

        C40444b(C40442b bVar) {
            this.f105164a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$c */
    public static final class C40445c extends C40449d {

        /* renamed from: a */
        final /* synthetic */ C40442b f105165a;

        C40445c(C40442b bVar) {
            this.f105165a = bVar;
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            C7573i.m23587b(cVar, "error");
            this.f105165a.mo100481a(false);
            if (this.f105165a.f105154a != null) {
                AnimatedImageView animatedImageView = this.f105165a.f105154a;
                if (animatedImageView == null) {
                    C7573i.m23580a();
                }
                animatedImageView.setVisibility(0);
            }
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            C7573i.m23587b(eVar, "sourceId");
            this.f105165a.mo100481a(false);
            if (this.f105165a.f105154a != null) {
                AnimatedImageView animatedImageView = this.f105165a.f105154a;
                if (animatedImageView == null) {
                    C7573i.m23580a();
                }
                animatedImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$d */
    static final class C40446d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40442b f105166a;

        C40446d(C40442b bVar) {
            this.f105166a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105166a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b.b$e */
    static final class C40447e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40442b f105167a;

        C40447e(C40442b bVar) {
            this.f105167a = bVar;
        }

        public final void run() {
            this.f105167a.mo100481a(false);
        }
    }

    public final void dismiss() {
        m129340f();
        C40448c.m129348a(this);
    }

    /* renamed from: d */
    private final void m129338d() {
        this.f105160h = new C40445c(this);
    }

    /* renamed from: a */
    private final boolean m129335a() {
        if (this.f105163k == null || TextUtils.isEmpty(this.f105163k.mo100475a())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m129337c() {
        KeepSurfaceTextureView keepSurfaceTextureView = this.f105156d;
        if (keepSurfaceTextureView == null) {
            C7573i.m23580a();
        }
        C44962h a = C44962h.m141885a(keepSurfaceTextureView);
        this.f105157e = new VideoViewComponent();
        VideoViewComponent videoViewComponent = this.f105157e;
        if (videoViewComponent == null) {
            C7573i.m23580a();
        }
        KeepSurfaceTextureView keepSurfaceTextureView2 = this.f105156d;
        if (keepSurfaceTextureView2 == null) {
            C7573i.m23580a();
        }
        videoViewComponent.mo107433a(keepSurfaceTextureView2);
        VideoViewComponent videoViewComponent2 = this.f105157e;
        if (videoViewComponent2 == null) {
            C7573i.m23580a();
        }
        videoViewComponent2.mo71663a((C34976f) this.f105160h);
        a.mo107455a((C44963i) new C40444b(this));
        m129339e();
    }

    /* renamed from: f */
    private final void m129340f() {
        if (this.f105157e != null) {
            if (this.f105160h != null) {
                VideoViewComponent videoViewComponent = this.f105157e;
                if (videoViewComponent == null) {
                    C7573i.m23580a();
                }
                videoViewComponent.mo71692b((C34976f) this.f105160h);
            }
            VideoViewComponent videoViewComponent2 = this.f105157e;
            if (videoViewComponent2 == null) {
                C7573i.m23580a();
            }
            videoViewComponent2.mo107435b();
        }
    }

    public final void show() {
        if (this.f105162j != null) {
            C23339g a = C23337e.m76561a(C35574k.m114861b(), C35574k.m114859a().mo70070D().mo83222a());
            String a2 = a.mo60623a("pixaloop_show", "");
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append(String.valueOf(this.f105162j.getStickerId()));
            sb.append(",");
            a.mo60632b("pixaloop_show", sb.toString());
        }
        super.show();
    }

    /* renamed from: e */
    private final void m129339e() {
        if (this.f105157e != null && m129335a()) {
            if (this.f105159g == null) {
                this.f105159g = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setH265(false);
                ArrayList arrayList = new ArrayList();
                C40441a aVar = this.f105163k;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                String a = aVar.mo100475a();
                if (a == null) {
                    C7573i.m23580a();
                }
                arrayList.add(a);
                videoUrlModel.setUrlList(arrayList);
                videoUrlModel.setUrlKey(this.f105163k.f105149a);
                videoUrlModel.setUri(this.f105163k.f105149a);
                Video video = this.f105159g;
                if (video == null) {
                    C7573i.m23580a();
                }
                video.setPlayAddr(videoUrlModel);
                Video video2 = this.f105159g;
                if (video2 == null) {
                    C7573i.m23580a();
                }
                video2.setSourceId(this.f105163k.f105149a);
            }
            mo100481a(true);
            VideoViewComponent videoViewComponent = this.f105157e;
            if (videoViewComponent == null) {
                C7573i.m23580a();
            }
            Video video3 = this.f105159g;
            if (video3 == null) {
                C7573i.m23580a();
            }
            videoViewComponent.mo71660a(video3);
            if (this.f105161i != null) {
                Handler handler = this.f105161i;
                if (handler == null) {
                    C7573i.m23580a();
                }
                handler.postDelayed(new C40447e(this), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            }
        }
    }

    /* renamed from: b */
    private final void m129336b() {
        if (this.f105163k != null && this.f105163k.mo100478b()) {
            this.f105156d = (KeepSurfaceTextureView) findViewById(R.id.ebx);
            this.f105154a = (AnimatedImageView) findViewById(R.id.b_c);
            this.f105155c = (DmtLoadingLayout) findViewById(R.id.bu9);
            this.f105158f = (DmtTextView) findViewById(R.id.a2f);
            View findViewById = findViewById(R.id.eat);
            if (VERSION.SDK_INT >= 21) {
                C7573i.m23582a((Object) findViewById, "videoLayout");
                AnimatedImageView animatedImageView = this.f105154a;
                if (animatedImageView == null) {
                    C7573i.m23580a();
                }
                findViewById.setOutlineProvider(new C43373i((int) C9738o.m28708b(animatedImageView.getContext(), 4.0f)));
                findViewById.setClipToOutline(true);
            }
            View findViewById2 = findViewById(R.id.bwm);
            Drawable a = C38501ax.m123066a(-1, -1, 0, (int) C9738o.m28708b(getContext(), 4.0f));
            C7573i.m23582a((Object) findViewById2, "rootLayout");
            findViewById2.setBackground(a);
            Drawable a2 = C38501ax.m123066a(303437859, 303437859, 0, 0);
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            C13438a a3 = new C13439b(context.getResources()).mo32908a();
            a3.mo32900b(a2);
            a3.mo32904c(a2);
            AnimatedImageView animatedImageView2 = this.f105154a;
            if (animatedImageView2 == null) {
                C7573i.m23580a();
            }
            animatedImageView2.setHierarchy(a3);
            if (this.f105163k != null) {
                if (!TextUtils.isEmpty(this.f105163k.mo100479c())) {
                    C23323e.m76514a((RemoteImageView) this.f105154a, this.f105163k.mo100479c());
                }
                if (TextUtils.isEmpty(this.f105163k.f105150b)) {
                    DmtTextView dmtTextView = this.f105158f;
                    if (dmtTextView == null) {
                        C7573i.m23580a();
                    }
                    dmtTextView.setVisibility(8);
                } else {
                    DmtTextView dmtTextView2 = this.f105158f;
                    if (dmtTextView2 == null) {
                        C7573i.m23580a();
                    }
                    dmtTextView2.setVisibility(0);
                    DmtTextView dmtTextView3 = this.f105158f;
                    if (dmtTextView3 == null) {
                        C7573i.m23580a();
                    }
                    dmtTextView3.setText(this.f105163k.f105150b);
                }
            }
            m129338d();
            m129337c();
        }
    }

    /* renamed from: a */
    public final void mo100480a(Handler handler) {
        C7573i.m23587b(handler, "mainHandler");
        this.f105161i = handler;
    }

    /* renamed from: a */
    public final void mo100481a(boolean z) {
        int i;
        if (this.f105155c != null) {
            DmtLoadingLayout dmtLoadingLayout = this.f105155c;
            if (dmtLoadingLayout == null) {
                C7573i.m23580a();
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            dmtLoadingLayout.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aau);
        Window window = getWindow();
        if (window == null) {
            C7573i.m23580a();
        }
        LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        Window window2 = getWindow();
        if (window2 == null) {
            C7573i.m23580a();
        }
        window2.setAttributes(attributes);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(null, null, null));
        Paint paint = shapeDrawable.getPaint();
        C7573i.m23582a((Object) paint, "drawable.paint");
        paint.setColor(0);
        Window window3 = getWindow();
        if (window3 == null) {
            C7573i.m23580a();
        }
        window3.setBackgroundDrawable(shapeDrawable);
        setCanceledOnTouchOutside(true);
        findViewById(R.id.cws).setOnClickListener(new C40446d(this));
        m129336b();
    }

    public C40442b(Context context, FaceStickerBean faceStickerBean, C40441a aVar) {
        C7573i.m23587b(context, "context");
        super(context, R.style.hi);
        this.f105162j = faceStickerBean;
        this.f105163k = aVar;
    }
}
