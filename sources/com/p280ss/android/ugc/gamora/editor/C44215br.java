package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bolts.C1592h;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23318a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p280ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42015a;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42016b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42046i;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42046i.C42049a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1663b.C42077a;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.br */
public final class C44215br extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114324i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44215br.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/story/shootvideo/textfont/TextStickerController;"))};

    /* renamed from: q */
    public static final C44216a f114325q = new C44216a(null);

    /* renamed from: j */
    public C44362u f114326j;

    /* renamed from: k */
    public TextStickerInputLayout f114327k;

    /* renamed from: l */
    public EditViewModel f114328l;

    /* renamed from: m */
    public EditPoiStickerViewModel f114329m;

    /* renamed from: n */
    public EditInfoStickerViewModel f114330n;

    /* renamed from: o */
    public ToolSafeHandler f114331o;

    /* renamed from: p */
    public FrameLayout f114332p;

    /* renamed from: r */
    private VEVideoPublishEditViewModel f114333r;

    /* renamed from: s */
    private VideoPublishEditModel f114334s;

    /* renamed from: t */
    private EditVoteStickerViewModel f114335t;

    /* renamed from: u */
    private EditTextStickerViewModel f114336u;

    /* renamed from: v */
    private Runnable f114337v;

    /* renamed from: w */
    private View f114338w;

    /* renamed from: x */
    private final C7541d f114339x = C7546e.m23569a(C44227j.f114352a);

    /* renamed from: com.ss.android.ugc.gamora.editor.br$a */
    public static final class C44216a {
        private C44216a() {
        }

        public /* synthetic */ C44216a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$b */
    public static final class C44217b implements C42016b {

        /* renamed from: a */
        final /* synthetic */ C44215br f114340a;

        /* renamed from: a */
        public final void mo103187a() {
            C44215br.m139917a(this.f114340a).mo106443a(false, false);
            this.f114340a.mo106733a(false);
        }

        public final void dismiss() {
            C44215br.m139917a(this.f114340a).mo106443a(true, false);
            this.f114340a.mo106713J();
        }

        C44217b(C44215br brVar) {
            this.f114340a = brVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$c */
    static final class C44218c implements C42015a {

        /* renamed from: a */
        final /* synthetic */ C44215br f114341a;

        C44218c(C44215br brVar) {
            this.f114341a = brVar;
        }

        /* renamed from: a */
        public final void mo103186a(boolean z) {
            C44215br.m139919b(this.f114341a).mo29069f();
            C44215br.m139920c(this.f114341a).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$d */
    public static final class C44219d implements C42077a {

        /* renamed from: a */
        final /* synthetic */ C44215br f114342a;

        /* renamed from: a */
        public final void mo101456a() {
            C6907h.m21524a("text_complete", (Map) this.f114342a.mo96987K().f60753a);
        }

        C44219d(C44215br brVar) {
            this.f114342a = brVar;
        }

        /* renamed from: a */
        public final void mo101459a(String str) {
            C7573i.m23587b(str, "alignStr");
            C6907h.m21524a("select_text_paragraph", (Map) this.f114342a.mo96987K().mo59973a("paragraph_style", str).f60753a);
        }

        /* renamed from: a */
        public final void mo101457a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(i));
            C6907h.m21524a("select_text_color", (Map) this.f114342a.mo96987K().mo59973a("color", sb.toString()).mo59970a("is_subtitle", 0).f60753a);
        }

        /* renamed from: b */
        public final void mo101460b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            C6907h.m21524a("select_text_style", (Map) this.f114342a.mo96987K().mo59973a("text_style", sb.toString()).mo59970a("is_subtitle", 0).f60753a);
        }

        /* renamed from: a */
        public final void mo101458a(C42038c cVar) {
            C7573i.m23587b(cVar, "type");
            C6907h.m21524a("select_text_font", (Map) this.f114342a.mo96987K().mo59973a("font", cVar.f109186d).mo59970a("is_subtitle", 0).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$e */
    static final class C44220e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44215br f114343a;

        C44220e(C44215br brVar) {
            this.f114343a = brVar;
        }

        public final void run() {
            this.f114343a.mo30920G().mo106805e((C42060b) this.f114343a.mo30921H().f109227k);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$f */
    static final class C44221f extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44215br f114344a;

        C44221f(C44215br brVar) {
            this.f114344a = brVar;
            super(2);
        }

        /* renamed from: a */
        private void m139975a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f114344a.mo106715M();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139975a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$g */
    static final class C44222g<T> implements C0053p<Pair<? extends Float, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C44215br f114345a;

        C44222g(C44215br brVar) {
            this.f114345a = brVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Pair<Float, Boolean> pair) {
            if (pair != null) {
                this.f114345a.mo30921H().mo103245a(((Number) pair.getFirst()).floatValue(), ((Boolean) pair.getSecond()).booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$h */
    public static final class C44223h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44215br f114346a;

        /* renamed from: b */
        private int f114347b = -1;

        /* renamed from: c */
        private Runnable f114348c = new C44224a(this);

        /* renamed from: com.ss.android.ugc.gamora.editor.br$h$a */
        static final class C44224a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44223h f114349a;

            C44224a(C44223h hVar) {
                this.f114349a = hVar;
            }

            public final void run() {
                if (VERSION.SDK_INT < 19) {
                    C44215br.m139921d(this.f114349a.f114346a).postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44224a f114350a;

                        {
                            this.f114350a = r1;
                        }

                        public final void run() {
                            C44215br.m139922e(this.f114350a.f114349a.f114346a).requestLayout();
                        }
                    }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                }
            }
        }

        public final void run() {
            if (this.f114348c != null) {
                Runnable runnable = this.f114348c;
                if (runnable != null) {
                    runnable.run();
                }
                this.f114348c = null;
            }
            C44215br.m139921d(this.f114346a).postDelayed(this, 16);
            C15389d dVar = (C15389d) C44215br.m139917a(this.f114346a).mo106448i().getValue();
            if (dVar != null && this.f114346a.mo106714L()) {
                int m = dVar.mo38862m();
                if (m != this.f114347b) {
                    this.f114347b = m;
                    this.f114346a.mo30921H().mo103246a((long) m);
                }
            }
        }

        C44223h(C44215br brVar) {
            this.f114346a = brVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$i */
    static final class C44226i<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44215br f114351a;

        C44226i(C44215br brVar) {
            this.f114351a = brVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            TextStickerViewModel j = this.f114351a.mo30921H().mo103270j();
            if (bool == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) bool, "it!!");
            j.mo103210a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.br$j */
    static final class C44227j extends Lambda implements C7561a<C42046i> {

        /* renamed from: a */
        public static final C44227j f114352a = new C44227j();

        C44227j() {
            super(0);
        }

        /* renamed from: a */
        private static C42046i m139978a() {
            return new C42046i();
        }

        public final /* synthetic */ Object invoke() {
            return m139978a();
        }
    }

    /* renamed from: H */
    public final C42046i mo30921H() {
        return (C42046i) this.f114339x.getValue();
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo106732a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f114326j = uVar;
    }

    /* renamed from: a */
    public final void mo106729a(TextStickerInputLayout textStickerInputLayout) {
        C7573i.m23587b(textStickerInputLayout, "<set-?>");
        this.f114327k = textStickerInputLayout;
    }

    /* renamed from: a */
    public final void mo106724a(OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "listener");
        LayoutInflater from = LayoutInflater.from(this.f33526d_);
        FrameLayout frameLayout = this.f114332p;
        if (frameLayout == null) {
            C7573i.m23583a("parentLayout");
        }
        from.inflate(R.layout.fw, frameLayout, true);
        FrameLayout frameLayout2 = this.f114332p;
        if (frameLayout2 == null) {
            C7573i.m23583a("parentLayout");
        }
        this.f114338w = frameLayout2.findViewById(R.id.dvg);
        View view = this.f114338w;
        if (view == null) {
            C7573i.m23580a();
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo106733a(boolean z) {
        View view = this.f114338w;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.f114338w;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo106730a(C42088k kVar) {
        mo30921H().mo103256b((C42088k) null);
    }

    /* renamed from: a */
    public final void mo106725a(C15389d dVar, boolean z) {
        mo30921H().mo103247a(dVar, z);
    }

    /* renamed from: a */
    public final void mo106726a(C23318a<C42088k, C42088k> aVar) {
        C7573i.m23587b(aVar, "onChangeIndexToTopListener");
        mo30921H().f109238v = aVar;
    }

    /* renamed from: a */
    public final void mo106727a(C23319b<C42088k> bVar) {
        C7573i.m23587b(bVar, "onTimeClickListener");
        mo30921H().f109232p = bVar;
    }

    /* renamed from: a */
    public final void mo106728a(C42049a aVar) {
        C7573i.m23587b(aVar, "listener");
        mo30921H().f109221e = aVar;
    }

    /* renamed from: a */
    public final void mo106731a(C44295cr crVar) {
        C7573i.m23587b(crVar, "deleteComponent");
        mo30921H().f109222f = crVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: N */
    public final boolean mo106716N() {
        return mo30921H().f109233q;
    }

    /* renamed from: P */
    public final void mo106718P() {
        mo30921H().mo103267g();
    }

    /* renamed from: Q */
    public final C39774n mo106719Q() {
        return mo30921H();
    }

    /* renamed from: S */
    public final boolean mo106721S() {
        return mo30921H().f109234r;
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: W */
    private final void m139915W() {
        this.f114337v = new C44223h(this);
    }

    /* renamed from: G */
    public final C44362u mo30920G() {
        C44362u uVar = this.f114326j;
        if (uVar == null) {
            C7573i.m23583a("gestureListenerManager");
        }
        return uVar;
    }

    /* renamed from: L */
    public final boolean mo106714L() {
        return mo30921H().mo103269i();
    }

    /* renamed from: M */
    public final boolean mo106715M() {
        return mo30921H().mo103265e();
    }

    /* renamed from: O */
    public final boolean mo106717O() {
        return mo30921H().mo103262d();
    }

    /* renamed from: R */
    public final List<C42088k> mo106720R() {
        List<C42088k> k = mo30921H().mo103271k();
        C7573i.m23582a((Object) k, "stickerController.textStickerList");
        return k;
    }

    /* renamed from: U */
    private final void m139913U() {
        EditTextStickerViewModel editTextStickerViewModel = this.f114336u;
        if (editTextStickerViewModel == null) {
            C7573i.m23583a("textStickerViewModel");
        }
        mo91869c(editTextStickerViewModel, C44228bs.f114353a, new C11672v(), new C44221f(this));
        EditTextStickerViewModel editTextStickerViewModel2 = this.f114336u;
        if (editTextStickerViewModel2 == null) {
            C7573i.m23583a("textStickerViewModel");
        }
        editTextStickerViewModel2.mo106373g().observe(this, new C44222g(this));
    }

    /* renamed from: V */
    private final void m139914V() {
        mo30921H().mo103248a((C42016b) new C44217b(this));
        mo30921H().f109224h = new C44218c(this);
        mo30921H().mo103251a((C42077a) new C44219d(this));
        mo30921H().f109237u = new C44220e(this);
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        mo30921H().mo103268h();
        if (this.f114328l == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139166u()) {
            ToolSafeHandler toolSafeHandler = this.f114331o;
            if (toolSafeHandler == null) {
                C7573i.m23583a("safeHandler");
            }
            Runnable runnable = this.f114337v;
            if (runnable == null) {
                C7573i.m23583a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.post(runnable);
        }
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        if (this.f114328l == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139166u()) {
            ToolSafeHandler toolSafeHandler = this.f114331o;
            if (toolSafeHandler == null) {
                C7573i.m23583a("safeHandler");
            }
            Runnable runnable = this.f114337v;
            if (runnable == null) {
                C7573i.m23583a("mNonInfoStickerPlayingRefreshTask");
            }
            toolSafeHandler.removeCallbacks(runnable);
        }
    }

    /* renamed from: J */
    public final void mo106713J() {
        if (!mo30921H().mo103269i()) {
            View view = this.f114338w;
            if (view != null && view.getVisibility() == 8) {
                View view2 = this.f114338w;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                return;
            }
        }
        View view3 = this.f114338w;
        if (view3 != null && view3.getVisibility() == 0) {
            View view4 = this.f114338w;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: K */
    public final C22984d mo96987K() {
        C22984d a = C22984d.m75611a();
        String str = "creation_id";
        VideoPublishEditModel videoPublishEditModel = this.f114334s;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a2 = a.mo59973a(str, videoPublishEditModel.creationId);
        String str2 = "shoot_way";
        VideoPublishEditModel videoPublishEditModel2 = this.f114334s;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a3 = a2.mo59973a(str2, videoPublishEditModel2.mShootWay);
        String str3 = "content_type";
        VideoPublishEditModel videoPublishEditModel3 = this.f114334s;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a4 = a3.mo59973a(str3, C39500av.m126133a(videoPublishEditModel3));
        String str4 = "content_source";
        VideoPublishEditModel videoPublishEditModel4 = this.f114334s;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a5 = a4.mo59973a(str4, C39500av.m126142b(videoPublishEditModel4)).mo59973a("enter_from", "video_edit_page");
        C7573i.m23582a((Object) a5, "EventMapBuilder.newBuild…ob.Label.VIDEO_EDIT_PAGE)");
        return a5;
    }

    /* renamed from: T */
    public final String mo106722T() {
        StringBuilder sb = new StringBuilder();
        List R = mo106720R();
        int size = R.size();
        for (int i = 0; i < size; i++) {
            ((C42088k) R.get(i)).mo103428g();
            TextStickerData data = ((C42088k) R.get(i)).getData();
            if (data != null) {
                String[] strArr = data.mTextStrAry;
                C7573i.m23582a((Object) strArr, "mTextStrAry");
                for (String append : strArr) {
                    sb.append(append);
                }
            }
            if (i != R.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: I */
    public final void mo30922I() {
        boolean z = !mo106714L();
        boolean z2 = false;
        VideoPublishEditModel videoPublishEditModel = this.f114334s;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                    if (stickerItemModel.type == 2) {
                        if (z) {
                            if (!z2) {
                                EditViewModel editViewModel = this.f114328l;
                                if (editViewModel == null) {
                                    C7573i.m23583a("editViewModel");
                                }
                                Object value = editViewModel.mo106448i().getValue();
                                if (value == null) {
                                    C7573i.m23580a();
                                }
                                C15389d dVar = (C15389d) value;
                                EditViewModel editViewModel2 = this.f114328l;
                                if (editViewModel2 == null) {
                                    C7573i.m23583a("editViewModel");
                                }
                                mo106725a(dVar, editViewModel2.mo106459t());
                                z2 = true;
                            }
                            TextStickerData textStickerData = (TextStickerData) C42046i.m133660b().mo15974a(stickerItemModel.extra, TextStickerData.class);
                            if (textStickerData != null) {
                                mo30921H().mo103249a(textStickerData, true);
                            }
                        }
                        it.remove();
                    }
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f114334s;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (!videoPublishEditModel2.mIsFromDraft) {
            VideoPublishEditModel videoPublishEditModel3 = this.f114334s;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("publishEditModel");
            }
            StatusCreateVideoData statusCreateVideoData = videoPublishEditModel3.statusCreateVideoData;
            if (statusCreateVideoData != null) {
                statusCreateVideoData.setTemplateText(mo106722T());
            }
        }
    }

    /* renamed from: c */
    public final void mo106735c(boolean z) {
        mo30921H().mo103260c(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m139917a(C44215br brVar) {
        EditViewModel editViewModel = brVar.f114328l;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditInfoStickerViewModel m139919b(C44215br brVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = brVar.f114330n;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("infoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditPoiStickerViewModel m139920c(C44215br brVar) {
        EditPoiStickerViewModel editPoiStickerViewModel = brVar.f114329m;
        if (editPoiStickerViewModel == null) {
            C7573i.m23583a("poiStickerViewModel");
        }
        return editPoiStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ ToolSafeHandler m139921d(C44215br brVar) {
        ToolSafeHandler toolSafeHandler = brVar.f114331o;
        if (toolSafeHandler == null) {
            C7573i.m23583a("safeHandler");
        }
        return toolSafeHandler;
    }

    /* renamed from: e */
    public static final /* synthetic */ FrameLayout m139922e(C44215br brVar) {
        FrameLayout frameLayout = brVar.f114332p;
        if (frameLayout == null) {
            C7573i.m23583a("parentLayout");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public final void mo106734b(boolean z) {
        mo30921H().mo103257b(z);
    }

    /* renamed from: a */
    private final void m139918a(FrameLayout frameLayout) {
        C42046i H = mo30921H();
        Activity activity = this.f33526d_;
        if (activity != null) {
            H.f109217a = (AppCompatActivity) activity;
            mo30921H().f109233q = true;
            mo30921H().f109219c = frameLayout;
            C42046i H2 = mo30921H();
            ViewParent parent = frameLayout.getParent();
            if (parent != null) {
                H2.f109220d = (View) parent;
                mo30921H().mo103244a();
                C44362u uVar = this.f114326j;
                if (uVar == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                uVar.mo106802b((C42060b) mo30921H().f109227k);
                C42046i H3 = mo30921H();
                TextStickerInputLayout textStickerInputLayout = this.f114327k;
                if (textStickerInputLayout == null) {
                    C7573i.m23583a("textStickerInputLayout");
                }
                H3.mo103250a(textStickerInputLayout);
                mo30921H().mo103266f();
                C42046i H4 = mo30921H();
                VideoPublishEditModel videoPublishEditModel = this.f114334s;
                if (videoPublishEditModel == null) {
                    C7573i.m23583a("publishEditModel");
                }
                String str = videoPublishEditModel.mShootWay;
                VideoPublishEditModel videoPublishEditModel2 = this.f114334s;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("publishEditModel");
                }
                String str2 = videoPublishEditModel2.creationId;
                EditViewModel editViewModel = this.f114328l;
                if (editViewModel == null) {
                    C7573i.m23583a("editViewModel");
                }
                boolean v = editViewModel.mo106460v();
                EditViewModel editViewModel2 = this.f114328l;
                if (editViewModel2 == null) {
                    C7573i.m23583a("editViewModel");
                }
                H4.mo103254a(str, str2, v, editViewModel2.mo106459t());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f114333r = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditTextStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f114336u = (EditTextStickerViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditPoiStickerViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f114329m = (EditPoiStickerViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditVoteStickerViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f114335t = (EditVoteStickerViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditInfoStickerViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f114330n = (EditInfoStickerViewModel) a5;
                            mo30922I();
                            m139913U();
                            m139914V();
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114333r;
                            if (vEVideoPublishEditViewModel == null) {
                                C7573i.m23583a("publishEditViewModel");
                            }
                            vEVideoPublishEditViewModel.mo119526r().observe(this, new C44226i(this));
                            TextStickerViewModel j = mo30921H().mo103270j();
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f114333r;
                            if (vEVideoPublishEditViewModel2 == null) {
                                C7573i.m23583a("publishEditViewModel");
                            }
                            C0052o r = vEVideoPublishEditViewModel2.mo119526r();
                            C7573i.m23582a((Object) r, "publishEditViewModel.inTimeEditView");
                            j.mo103209a(r);
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                this.f114331o = new ToolSafeHandler((FragmentActivity) activity6);
                                m139915W();
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f114328l = (EditViewModel) a;
            EditViewModel editViewModel = this.f114328l;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114334s = editViewModel.mo29069f();
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            this.f114332p = frameLayout;
            FrameLayout frameLayout2 = this.f114332p;
            if (frameLayout2 == null) {
                C7573i.m23583a("parentLayout");
            }
            m139918a(frameLayout2);
            return new View(frameLayout.getContext());
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final C1592h<List<TextStickerCompileResult>> mo106723a(String str, int i, int i2, int i3, int i4) {
        C7573i.m23587b(str, "draftDir");
        C1592h<List<TextStickerCompileResult>> a = mo30921H().mo103243a(str, i, i2, i3, i4);
        C7573i.m23582a((Object) a, "stickerController.compil…idth, disVideoInitHeight)");
        return a;
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
