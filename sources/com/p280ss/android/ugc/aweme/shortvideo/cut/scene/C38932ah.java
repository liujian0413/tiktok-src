package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
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
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39575f;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah */
public final class C38932ah extends C12629j implements C44396a {

    /* renamed from: w */
    public static final C38933a f101116w = new C38933a(null);

    /* renamed from: i */
    public C39053bm f101117i;

    /* renamed from: j */
    public C38916af f101118j;

    /* renamed from: k */
    public SurfaceView f101119k;

    /* renamed from: l */
    public ImageView f101120l;

    /* renamed from: m */
    public FrameLayout f101121m;

    /* renamed from: n */
    public FrameLayout f101122n;

    /* renamed from: o */
    public VEVideoCutterViewModel f101123o;

    /* renamed from: p */
    public CutMultiVideoViewModel f101124p;

    /* renamed from: q */
    public VideoEditViewModel f101125q;

    /* renamed from: r */
    public float f101126r;

    /* renamed from: s */
    public float f101127s;

    /* renamed from: t */
    public int f101128t;

    /* renamed from: u */
    public final Handler f101129u = new Handler();

    /* renamed from: v */
    public final C38945l f101130v = new C38945l(this);

    /* renamed from: x */
    private CutVideoViewModel f101131x;

    /* renamed from: y */
    private CutVideoPreviewViewModel f101132y;

    /* renamed from: z */
    private CutVideoMultiBottomViewModel f101133z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$a */
    public static final class C38933a {
        private C38933a() {
        }

        public /* synthetic */ C38933a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$b */
    static final class C38934b<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101134a;

        C38934b(C38932ah ahVar) {
            this.f101134a = ahVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C39293a aVar) {
            Integer num;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f102021c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f101134a.mo30920G().mo97219c()) {
                    C38932ah.m124323b(this.f101134a).setVisibility(8);
                    this.f101134a.f101129u.post(this.f101134a.f101130v);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f102022d) {
                    C38932ah.m124323b(this.f101134a).setVisibility(0);
                }
                this.f101134a.f101129u.removeCallbacks(this.f101134a.f101130v);
            } else if (num != null && num.intValue() == 3) {
                this.f101134a.f101129u.removeCallbacks(this.f101134a.f101130v);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$c */
    static final class C38935c<T> implements C0053p<Pair<? extends Boolean, ? extends Float>> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101135a;

        C38935c(C38932ah ahVar) {
            this.f101135a = ahVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Pair<Boolean, Float> pair) {
            if (pair != null) {
                float dimension = this.f101135a.mo31017x().getDimension(R.dimen.kg) - this.f101135a.mo31017x().getDimension(R.dimen.mm);
                LayoutParams layoutParams = C38932ah.m124324c(this.f101135a).getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (((Boolean) pair.getFirst()).booleanValue()) {
                        layoutParams2.bottomMargin = this.f101135a.f101128t + ((int) (dimension - ((Number) pair.getSecond()).floatValue()));
                        C38932ah.m124324c(this.f101135a).setLayoutParams(layoutParams2);
                    } else {
                        layoutParams2.bottomMargin = this.f101135a.f101128t - ((int) ((Number) pair.getSecond()).floatValue());
                        C38932ah.m124324c(this.f101135a).setLayoutParams(layoutParams2);
                    }
                    float floatValue = this.f101135a.f101127s - ((float) ((int) (dimension - ((Number) pair.getSecond()).floatValue())));
                    C39053bm bmVar = this.f101135a.f101117i;
                    if (bmVar != null) {
                        bmVar.mo97256a(this.f101135a.f101126r, this.f101135a.f101127s, floatValue);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$d */
    static final class C38936d extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101136a;

        C38936d(C38932ah ahVar) {
            this.f101136a = ahVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124355a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124355a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C38932ah.m124324c(this.f101136a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin += i;
                C38932ah.m124324c(this.f101136a).setLayoutParams(layoutParams2);
                LayoutParams layoutParams3 = C38932ah.m124325d(this.f101136a).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin += i;
                    C38932ah.m124325d(this.f101136a).setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$e */
    static final class C38937e extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101137a;

        C38937e(C38932ah ahVar) {
            this.f101137a = ahVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124356a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124356a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C38932ah.m124324c(this.f101137a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C38937e f101138a;

                {
                    this.f101138a = r1;
                }

                public final void run() {
                    float width = (float) C38932ah.m124325d(this.f101138a.f101137a).getWidth();
                    float height = (float) C38932ah.m124325d(this.f101138a.f101137a).getHeight();
                    float height2 = (float) C38932ah.m124324c(this.f101138a.f101137a).getHeight();
                    C39053bm bmVar = this.f101138a.f101137a.f101117i;
                    if (bmVar != null) {
                        bmVar.mo97256a(width, height, height2);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$f */
    static final class C38939f extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101139a;

        C38939f(C38932ah ahVar) {
            this.f101139a = ahVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124357a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124357a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f101139a.f101129u.removeCallbacks(this.f101139a.f101130v);
            this.f101139a.f101129u.post(this.f101139a.f101130v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$g */
    static final class C38940g extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101140a;

        C38940g(C38932ah ahVar) {
            this.f101140a = ahVar;
            super(2);
        }

        /* renamed from: a */
        private void m124358a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101140a.mo30921H().setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124358a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$h */
    static final class C38941h extends Lambda implements C7563m<C44396a, Pair<? extends Integer, ? extends Integer>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101141a;

        C38941h(C38932ah ahVar) {
            this.f101141a = ahVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124359a((C44396a) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124359a(C44396a aVar, Pair<Integer, Integer> pair) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(pair, "it");
            C39804em.m127430a((View) this.f101141a.mo30921H(), (Context) this.f101141a.f33526d_, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$i */
    static final class C38942i<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101142a;

        C38942i(C38932ah ahVar) {
            this.f101142a = ahVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                this.f101142a.f101126r = (float) C38932ah.m124324c(this.f101142a).getWidth();
                this.f101142a.f101127s = (float) C38932ah.m124324c(this.f101142a).getHeight();
                LayoutParams layoutParams = C38932ah.m124324c(this.f101142a).getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    this.f101142a.f101128t = marginLayoutParams.bottomMargin;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$j */
    static final class C38943j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101143a;

        C38943j(C38932ah ahVar) {
            this.f101143a = ahVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C38932ah ahVar = this.f101143a;
                C7573i.m23582a((Object) bool, "it");
                ahVar.mo97232a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$k */
    static final class C38944k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101144a;

        C38944k(C38932ah ahVar) {
            this.f101144a = ahVar;
        }

        public final void onClick(View view) {
            C39293a aVar;
            ClickInstrumentation.onClick(view);
            VEVideoCutterViewModel a = C38932ah.m124322a(this.f101144a);
            if (this.f101144a.mo30920G().mo97219c()) {
                aVar = new C39293a(2, false, 2, null);
            } else {
                aVar = new C39293a(1, false, 2, null);
            }
            a.mo97802a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ah$l */
    public static final class C38945l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38932ah f101145a;

        public final void run() {
            long b = this.f101145a.mo30920G().mo97218b();
            if (b > 0) {
                C38932ah.m124326e(this.f101145a).mo96666a(b, C38932ah.m124327f(this.f101145a).mo97720m(), C38932ah.m124327f(this.f101145a).mo97722o());
            }
            this.f101145a.f101129u.postDelayed(this, 30);
        }

        C38945l(C38932ah ahVar) {
            this.f101145a = ahVar;
        }
    }

    /* renamed from: a */
    public final void mo97231a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f101118j = afVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.ea6);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.videoSurface)");
        this.f101119k = (SurfaceView) h_;
        View h_2 = mo31004h_(R.id.b5k);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.ivPlay)");
        this.f101120l = (ImageView) h_2;
        View h_3 = mo31004h_(R.id.eat);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.video_layout)");
        this.f101121m = (FrameLayout) h_3;
        View h_4 = mo31004h_(R.id.ead);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.video_control_layout)");
        this.f101122n = (FrameLayout) h_4;
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java]");
            this.f101131x = (CutVideoViewModel) a;
            CutVideoViewModel cutVideoViewModel = this.f101131x;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97157i()) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    Activity v = mo31015v();
                    C7573i.m23582a((Object) v, "requireActivity()");
                    marginLayoutParams.topMargin = (int) C39575f.m126467a(v, 56.0f);
                    CutVideoViewModel cutVideoViewModel2 = this.f101131x;
                    if (cutVideoViewModel2 == null) {
                        C7573i.m23583a("cutVideoViewModel");
                    }
                    if (!cutVideoViewModel2.mo97162o()) {
                        if (C39805en.m127445a()) {
                            marginLayoutParams.topMargin += C39805en.m127450c(this.f33526d_);
                        }
                        Activity v2 = mo31015v();
                        C7573i.m23582a((Object) v2, "requireActivity()");
                        marginLayoutParams.bottomMargin = (int) C39575f.m126467a(v2, 270.0f);
                    } else if (C39182e.m125105i()) {
                        marginLayoutParams.bottomMargin = mo31017x().getDimensionPixelSize(R.dimen.mm);
                    } else {
                        marginLayoutParams.bottomMargin = mo31017x().getDimensionPixelSize(R.dimen.kg);
                    }
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo97232a(boolean z) {
        float f;
        FrameLayout frameLayout = this.f101122n;
        if (frameLayout == null) {
            C7573i.m23583a("videoControlLayout");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            FrameLayout frameLayout2 = this.f101121m;
            if (frameLayout2 == null) {
                C7573i.m23583a("videoLayout");
            }
            LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                float dimension = mo31017x().getDimension(R.dimen.kg) - mo31017x().getDimension(R.dimen.mm);
                if (!z) {
                    f = this.f101127s;
                    if (!C39182e.m125105i()) {
                        layoutParams4.bottomMargin = layoutParams2.bottomMargin;
                        FrameLayout frameLayout3 = this.f101121m;
                        if (frameLayout3 == null) {
                            C7573i.m23583a("videoLayout");
                        }
                        frameLayout3.setLayoutParams(layoutParams4);
                    } else {
                        f = this.f101127s + dimension;
                    }
                } else if (C39182e.m125105i()) {
                    f = this.f101127s - dimension;
                } else {
                    f = this.f101127s;
                    layoutParams4.bottomMargin = layoutParams2.bottomMargin;
                    FrameLayout frameLayout4 = this.f101121m;
                    if (frameLayout4 == null) {
                        C7573i.m23583a("videoLayout");
                    }
                    frameLayout4.setLayoutParams(layoutParams4);
                }
                C39053bm bmVar = this.f101117i;
                if (bmVar != null) {
                    bmVar.mo97256a(this.f101126r, this.f101127s, f);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: G */
    public final C38916af mo30920G() {
        C38916af afVar = this.f101118j;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        return afVar;
    }

    /* renamed from: H */
    public final SurfaceView mo30921H() {
        SurfaceView surfaceView = this.f101119k;
        if (surfaceView == null) {
            C7573i.m23583a("videoSurface");
        }
        return surfaceView;
    }

    /* renamed from: I */
    public final int mo30922I() {
        SurfaceView surfaceView = this.f101119k;
        if (surfaceView == null) {
            C7573i.m23583a("videoSurface");
        }
        return surfaceView.getMeasuredWidth();
    }

    /* renamed from: J */
    public final int mo97230J() {
        SurfaceView surfaceView = this.f101119k;
        if (surfaceView == null) {
            C7573i.m23583a("videoSurface");
        }
        return surfaceView.getMeasuredHeight();
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        this.f101129u.removeCallbacks(this.f101130v);
    }

    /* renamed from: K */
    public final int mo96987K() {
        FrameLayout frameLayout = this.f101121m;
        if (frameLayout == null) {
            C7573i.m23583a("videoLayout");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            return ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: N */
    private final void m124319N() {
        VideoEditViewModel videoEditViewModel = this.f101125q;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        if (videoEditViewModel.mo97724q()) {
            VideoEditViewModel videoEditViewModel2 = this.f101125q;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            VideoSegment videoSegment = (VideoSegment) videoEditViewModel2.mo97721n().get(0);
            int min = Math.min(videoSegment.f100765g, videoSegment.f100766h);
            int max = Math.max(videoSegment.f100765g, videoSegment.f100766h);
            if (C39805en.m127445a()) {
                SurfaceView surfaceView = this.f101119k;
                if (surfaceView == null) {
                    C7573i.m23583a("videoSurface");
                }
                C39804em.m127430a((View) surfaceView, (Context) this.f33526d_, min, max);
            } else if ((((float) min) * 1.0f) / ((float) max) < 0.85f) {
                SurfaceView surfaceView2 = this.f101119k;
                if (surfaceView2 == null) {
                    C7573i.m23583a("videoSurface");
                }
                C39804em.m127439b(surfaceView2, min, max);
            }
        }
    }

    /* renamed from: O */
    private final void m124320O() {
        CutVideoViewModel cutVideoViewModel = this.f101131x;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo97162o() && C39805en.m127445a()) {
            FrameLayout frameLayout = this.f101122n;
            if (frameLayout == null) {
                C7573i.m23583a("videoControlLayout");
            }
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += C39805en.m127450c(this.f33526d_);
                FrameLayout frameLayout2 = this.f101122n;
                if (frameLayout2 == null) {
                    C7573i.m23583a("videoControlLayout");
                }
                frameLayout2.setLayoutParams(layoutParams2);
                FrameLayout frameLayout3 = this.f101121m;
                if (frameLayout3 == null) {
                    C7573i.m23583a("videoLayout");
                }
                LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin += C39805en.m127450c(this.f33526d_);
                    FrameLayout frameLayout4 = this.f101121m;
                    if (frameLayout4 == null) {
                        C7573i.m23583a("videoLayout");
                    }
                    frameLayout4.setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: L */
    private final void m124317L() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(CutMultiVideoViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f101124p = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VideoEditViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java]");
                this.f101125q = (VideoEditViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    C0063u a3 = C0069x.m159a((FragmentActivity) activity3).mo147a(VEVideoCutterViewModel.class);
                    C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…terViewModel::class.java]");
                    this.f101123o = (VEVideoCutterViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoPreviewViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…iewViewModel::class.java)");
                        this.f101132y = (CutVideoPreviewViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(CutVideoMultiBottomViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…tomViewModel::class.java)");
                            this.f101133z = (CutVideoMultiBottomViewModel) a5;
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

    /* renamed from: M */
    private final void m124318M() {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f101123o;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        C0043i iVar = this;
        vEVideoCutterViewModel.mo97801a().observe(iVar, new C38934b(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel = this.f101132y;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(cutVideoPreviewViewModel, C38948ak.f101148a, new C11672v(), new C38939f(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel2 = this.f101132y;
        if (cutVideoPreviewViewModel2 == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91868b(cutVideoPreviewViewModel2, C38949al.f101149a, new C11672v(), new C38940g(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel3 = this.f101132y;
        if (cutVideoPreviewViewModel3 == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(cutVideoPreviewViewModel3, C38950am.f101150a, new C11672v(), new C38941h(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel4 = this.f101132y;
        if (cutVideoPreviewViewModel4 == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel4.mo97093h().observe(iVar, new C38942i(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel5 = this.f101132y;
        if (cutVideoPreviewViewModel5 == null) {
            C7573i.m23583a("previewViewModel");
        }
        cutVideoPreviewViewModel5.mo97094i().observe(iVar, new C38943j(this));
        CutVideoMultiBottomViewModel cutVideoMultiBottomViewModel = this.f101133z;
        if (cutVideoMultiBottomViewModel == null) {
            C7573i.m23583a("multiBottomViewModel");
        }
        cutVideoMultiBottomViewModel.mo29069f().observe(iVar, new C38935c(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel6 = this.f101132y;
        if (cutVideoPreviewViewModel6 == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(cutVideoPreviewViewModel6, C38946ai.f101146a, new C11672v(), new C38936d(this));
        CutVideoPreviewViewModel cutVideoPreviewViewModel7 = this.f101132y;
        if (cutVideoPreviewViewModel7 == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(cutVideoPreviewViewModel7, C38947aj.f101147a, new C11672v(), new C38937e(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m124322a(C38932ah ahVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = ahVar.f101123o;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m124323b(C38932ah ahVar) {
        ImageView imageView = ahVar.f101120l;
        if (imageView == null) {
            C7573i.m23583a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m124324c(C38932ah ahVar) {
        FrameLayout frameLayout = ahVar.f101122n;
        if (frameLayout == null) {
            C7573i.m23583a("videoControlLayout");
        }
        return frameLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ FrameLayout m124325d(C38932ah ahVar) {
        FrameLayout frameLayout = ahVar.f101121m;
        if (frameLayout == null) {
            C7573i.m23583a("videoLayout");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutMultiVideoViewModel m124326e(C38932ah ahVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = ahVar.f101124p;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ VideoEditViewModel m124327f(C38932ah ahVar) {
        VideoEditViewModel videoEditViewModel = ahVar.f101125q;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124317L();
        m124318M();
        CutVideoViewModel cutVideoViewModel = this.f101131x;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo97157i()) {
            m124319N();
        } else {
            m124320O();
        }
        SurfaceView surfaceView = this.f101119k;
        if (surfaceView == null) {
            C7573i.m23583a("videoSurface");
        }
        surfaceView.setOnClickListener(new C38944k(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ai7, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…review, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
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
}
