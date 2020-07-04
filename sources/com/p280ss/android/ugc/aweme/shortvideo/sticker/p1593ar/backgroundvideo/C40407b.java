package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38580ci;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoSegments;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.BackgroundVideoStickerPresenter.C40404a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1598d.C40454a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.vesdk.VEUtils;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.b */
public final class C40407b implements C40832n {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f105031a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40407b.class), "loadingDialog", "getLoadingDialog()Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/ui/PixaloopLoadingDialog;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40407b.class), "safeHandler", "getSafeHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;"))};

    /* renamed from: b */
    public boolean f105032b;

    /* renamed from: c */
    public String f105033c = "";

    /* renamed from: d */
    public String f105034d = "";

    /* renamed from: e */
    public String f105035e;

    /* renamed from: f */
    public final AppCompatActivity f105036f;

    /* renamed from: g */
    private boolean f105037g;

    /* renamed from: h */
    private final C7541d f105038h = C7546e.m23569a(new C40408a(this));

    /* renamed from: i */
    private final C7541d f105039i = C7546e.m23569a(new C40409b(this));

    /* renamed from: j */
    private C20749b f105040j;

    /* renamed from: k */
    private final C40994w f105041k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.b$a */
    static final class C40408a extends Lambda implements C7561a<C40454a> {

        /* renamed from: a */
        final /* synthetic */ C40407b f105042a;

        C40408a(C40407b bVar) {
            this.f105042a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C40454a invoke() {
            return new C40454a(this.f105042a.f105036f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.b$b */
    static final class C40409b extends Lambda implements C7561a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C40407b f105043a;

        C40409b(C40407b bVar) {
            this.f105043a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SafeHandler invoke() {
            return new SafeHandler(this.f105043a.f105036f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.b$c */
    static final class C40410c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40407b f105044a;

        C40410c(C40407b bVar) {
            this.f105044a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m129220a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129220a() {
            this.f105044a.mo100425f().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.b$d */
    static final class C40411d extends Lambda implements C48006q<Boolean, String, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40407b f105045a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f105046b;

        C40411d(C40407b bVar, FaceStickerBean faceStickerBean) {
            this.f105045a = bVar;
            this.f105046b = faceStickerBean;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m129221a(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129221a(boolean z, final String str, final String str2) {
            C7573i.m23587b(str, "defaultVideoPath");
            C7573i.m23587b(str2, "defaultAudioPath");
            this.f105045a.mo100425f().dismiss();
            if (z) {
                this.f105045a.f105035e = C40404a.m129197a(this.f105046b);
                this.f105045a.mo100426g().post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40411d f105047a;

                    {
                        this.f105047a = r1;
                    }

                    public final void run() {
                        this.f105047a.f105045a.mo100421b(str, str2);
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C40413c.f105052c);
            sb.append(" default video parse fail");
            C41530am.m132283b(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo100416a() {
        this.f105032b = true;
    }

    /* renamed from: f */
    public final C40454a mo100425f() {
        return (C40454a) this.f105038h.getValue();
    }

    /* renamed from: g */
    public final SafeHandler mo100426g() {
        return (SafeHandler) this.f105039i.getValue();
    }

    /* renamed from: b */
    public final void mo100420b() {
        this.f105032b = this.f105037g;
    }

    /* renamed from: d */
    public final void mo100423d() {
        if (this.f105037g) {
            m129202a(this.f105036f, null, null, null);
        }
    }

    /* renamed from: h */
    private final ShortVideoContext m129205h() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
        return shortVideoContext;
    }

    /* renamed from: i */
    private final double m129206i() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        return ((ShortVideoContextViewModel) a).mo96176g();
    }

    /* renamed from: e */
    public final void mo100424e() {
        if (this.f105037g) {
            m129202a(this.f105036f, this.f105035e, this.f105033c, this.f105034d);
        }
    }

    /* renamed from: c */
    public final void mo100422c() {
        if (this.f105037g) {
            C40426a.m129278a(false);
            C0063u a = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            m129203a(shortVideoContext);
            shortVideoContext.f99782r = null;
            this.f105033c = "";
            this.f105034d = "";
            m129202a(this.f105036f, null, null, null);
            StringBuilder sb = new StringBuilder();
            sb.append(C40413c.f105052c);
            sb.append(" remove BGV");
            C41530am.m132280a(sb.toString());
            this.f105037g = false;
            m129201a(0);
        }
    }

    /* renamed from: a */
    private static void m129203a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext != null) {
            ShortVideoSegments shortVideoSegments = shortVideoContext.f99776l;
            C7573i.m23582a((Object) shortVideoSegments, "it.mDurings");
            C40414d.m129226b(shortVideoSegments, shortVideoContext.f99782r);
        }
    }

    /* renamed from: a */
    private final void m129201a(long j) {
        long j2;
        long j3;
        ShortVideoContext h = m129205h();
        if (h.f99745af) {
            j2 = C40413c.f105050a;
        } else {
            j2 = C40413c.f105051b;
        }
        AVMusic b = C39360dw.m125725a().mo97931b();
        String str = h.f99769e;
        if (b == null || TextUtils.isEmpty(str)) {
            j3 = j2 - h.f99777m;
        } else {
            C7573i.m23582a((Object) str, "musicLocalPath");
            j3 = Math.min(j2, C38580ci.m123273a(b, str)) - h.f99777m;
        }
        if (j > 0) {
            j3 = Math.min(j3, j);
        }
        long j4 = h.f99777m + j3;
        h.f99767c = j4;
        C42135ab abVar = new C42135ab(j4);
        AppCompatActivity appCompatActivity = this.f105036f;
        if (appCompatActivity != null) {
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) appCompatActivity;
            C42155av avVar = abVar;
            videoRecordNewActivity.mo97896J().mo103594a((Object) this, avVar);
            C39382ed edVar = videoRecordNewActivity.f107267H;
            C7573i.m23582a((Object) edVar, "videoRecordActivity.plan");
            C42156aw J = edVar.mo97896J();
            if (J == null) {
                C7573i.m23580a();
            }
            J.mo103594a((Object) this, avVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
    }

    /* renamed from: a */
    public final void mo100417a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceStickerBean");
        if (this.f105032b) {
            mo100421b(this.f105033c, this.f105034d);
            this.f105032b = false;
            return;
        }
        new C40416e(this.f105036f, faceStickerBean).mo100429a(new C40410c(this), new C40411d(this, faceStickerBean));
    }

    /* renamed from: a */
    public final void mo100418a(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (this.f105037g) {
                StringBuilder sb = new StringBuilder();
                sb.append(C40413c.f105052c);
                sb.append(" set speed：");
                sb.append(doubleValue);
                C41530am.m132280a(sb.toString());
                this.f105040j.mo56041a(d.doubleValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo100419a(String str, String str2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(str2, "audioPath");
        this.f105033c = str;
        this.f105034d = str2;
    }

    /* renamed from: c */
    private static int m129204c(String str, String str2) {
        if (C13015c.m37973a(str) || C13015c.m37973a(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C40413c.f105052c);
            sb.append(" path invalid, videoPath: ");
            sb.append(str);
            sb.append(" audioPath: ");
            sb.append(str2);
            C41530am.m132283b(sb.toString());
            return -1;
        }
        int[] iArr = new int[11];
        if (str == null) {
            C7573i.m23580a();
        }
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return iArr[3];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40413c.f105052c);
        sb2.append(" getVideoInfo fail, videoPath: ");
        sb2.append(str);
        sb2.append(" audioPath: ");
        sb2.append(str2);
        C41530am.m132283b(sb2.toString());
        return -1;
    }

    /* renamed from: b */
    public final void mo100421b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C0063u a = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
        C0052o i = ((ShortVideoContextViewModel) a).mo96180i();
        C7573i.m23582a((Object) i, "ViewModelProviders.of(ac…             .isRecording");
        Boolean bool = (Boolean) i.getValue();
        if (bool == null) {
            bool = Boolean.valueOf(true);
        }
        C7573i.m23582a((Object) bool, "ViewModelProviders.of(ac…isRecording.value ?: true");
        if (!bool.booleanValue()) {
            this.f105041k.mo100315g();
            return;
        }
        int c = m129204c(str, str2);
        if (c > 0) {
            C40426a.m129278a(true);
            this.f105033c = str3;
            this.f105034d = str4;
            C0063u a2 = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java]");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f99791a;
            long j = (long) c;
            long j2 = j;
            BackgroundVideo backgroundVideo = new BackgroundVideo(str, str2, j, 0, null, 24, null);
            shortVideoContext.f99782r = backgroundVideo;
            m129201a(j2);
            StringBuilder sb = new StringBuilder();
            sb.append(C40413c.f105052c);
            sb.append(" set BGV, videoPath: ");
            sb.append(str3);
            sb.append(" audioPath: ");
            sb.append(str4);
            C41530am.m132280a(sb.toString());
            m129202a(this.f105036f, this.f105035e, str3, str4);
            mo100418a(Double.valueOf(m129206i()));
            this.f105037g = true;
        }
    }

    public C40407b(AppCompatActivity appCompatActivity, C20749b bVar, C40994w wVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(bVar, "effectController");
        C7573i.m23587b(wVar, "stickerModule");
        this.f105036f = appCompatActivity;
        this.f105040j = bVar;
        this.f105041k = wVar;
    }

    /* renamed from: a */
    private final void m129202a(Context context, String str, String str2, String str3) {
        C0063u a = C0069x.m159a((FragmentActivity) this.f105036f).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
        C0052o i = ((ShortVideoContextViewModel) a).mo96180i();
        C7573i.m23582a((Object) i, "ViewModelProviders.of(ac…             .isRecording");
        Boolean bool = (Boolean) i.getValue();
        if (bool == null) {
            bool = Boolean.valueOf(true);
        }
        C7573i.m23582a((Object) bool, "ViewModelProviders.of(ac…isRecording.value ?: true");
        if (bool.booleanValue()) {
            C20749b bVar = this.f105040j;
            if (bVar != null) {
                bVar.mo56052a(context, str, str2, str3);
            }
        }
    }
}
