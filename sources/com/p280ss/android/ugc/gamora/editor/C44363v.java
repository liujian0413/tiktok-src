package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
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
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.C29197ac.C29198a;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.C29324o;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.tools.C42160b;
import com.p280ss.android.ugc.gamora.editor.C44358t.C44361a;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.Triple;
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

/* renamed from: com.ss.android.ugc.gamora.editor.v */
public final class C44363v extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114606i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44363v.class), "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44363v.class), "filterIntensityStore", "getFilterIntensityStore()Lcom/ss/android/ugc/aweme/filter/FilterIntensityStore;"))};

    /* renamed from: p */
    public static final C44364a f114607p = new C44364a(null);

    /* renamed from: j */
    public VideoRecordGestureLayout f114608j;

    /* renamed from: k */
    public C44358t f114609k;

    /* renamed from: l */
    public EditFilterViewModel f114610l;

    /* renamed from: m */
    public VEVideoPublishEditViewModel f114611m;

    /* renamed from: n */
    public EditViewModel f114612n;

    /* renamed from: o */
    public C44362u f114613o;

    /* renamed from: q */
    private EditGestureViewModel f114614q;

    /* renamed from: r */
    private EditFilterIndicatorViewModel f114615r;

    /* renamed from: s */
    private final C7541d f114616s = C7546e.m23569a(new C44374h(this));

    /* renamed from: t */
    private final C7541d f114617t = C7546e.m23569a(C44365b.f114619a);

    /* renamed from: u */
    private final C44361a f114618u = new C44366c(this);

    /* renamed from: com.ss.android.ugc.gamora.editor.v$a */
    public static final class C44364a {
        private C44364a() {
        }

        public /* synthetic */ C44364a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$b */
    static final class C44365b extends Lambda implements C7561a<C29197ac> {

        /* renamed from: a */
        public static final C44365b f114619a = new C44365b();

        C44365b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m140391a();
        }

        /* renamed from: a */
        private static C29197ac m140391a() {
            String str = VEVideoPublishEditActivity.f102286a;
            C7573i.m23582a((Object) str, "VEVideoPublishEditActivi…ILTER_INTENSITY_STORE_TAG");
            return C29198a.m95831a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$c */
    public static final class C44366c implements C44361a {

        /* renamed from: a */
        final /* synthetic */ C44363v f114620a;

        /* renamed from: com.ss.android.ugc.gamora.editor.v$c$a */
        public static final class C44367a implements C29238ba {

            /* renamed from: a */
            final /* synthetic */ C15389d f114621a;

            C44367a(C15389d dVar) {
                this.f114621a = dVar;
            }

            /* renamed from: a */
            public final float mo74856a(String str) {
                C7573i.m23587b(str, "filterPath");
                return this.f114621a.mo38809b(str);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$c$b */
        public static final class C44368b implements C29238ba {

            /* renamed from: a */
            final /* synthetic */ C15389d f114622a;

            C44368b(C15389d dVar) {
                this.f114622a = dVar;
            }

            /* renamed from: a */
            public final float mo74856a(String str) {
                C7573i.m23587b(str, "filterPath");
                return this.f114622a.mo38809b(str);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$c$c */
        public static final class C44369c implements C29238ba {

            /* renamed from: a */
            final /* synthetic */ C15389d f114623a;

            C44369c(C15389d dVar) {
                this.f114623a = dVar;
            }

            /* renamed from: a */
            public final float mo74856a(String str) {
                C7573i.m23587b(str, "filterPath");
                return this.f114623a.mo38809b(str);
            }
        }

        C44366c(C44363v vVar) {
            this.f114620a = vVar;
        }

        /* renamed from: a */
        public final void mo106799a(C29296g gVar) {
            C44363v.m140369d(this.f114620a).mo119509a(gVar, false);
            C44363v.m140370e(this.f114620a).mo106215g().setValue(gVar);
            if (gVar != null) {
                this.f114620a.mo30920G().mSelectedId = gVar.f77270e;
                this.f114620a.mo30920G().mCurFilterLabels = gVar.f77268c;
                this.f114620a.mo30920G().mCurFilterIds = String.valueOf(gVar.f77266a);
                C15389d dVar = (C15389d) C44363v.m140368c(this.f114620a).mo106448i().getValue();
                if (dVar != null) {
                    this.f114620a.mo30920G().mSelectedFilterIntensity = C29297h.m96116a(gVar, (C29230az) this.f114620a.mo30922I(), (C29238ba) new C44367a(dVar));
                }
                C39500av.m126141a(this.f114620a.mo30920G(), C44363v.m140365a(gVar), gVar.f77268c, gVar.f77266a);
                C35563c.f93240c.mo83132a(this.f114620a.mo30920G().getAvetParameter().getContentType(), "mid_page", gVar.f77268c);
            }
            C39500av.m126156l(this.f114620a.mo30920G());
        }

        /* renamed from: a */
        public final void mo106800a(C29296g gVar, C29296g gVar2, float f) {
            if (gVar != null && gVar2 != null) {
                C15389d dVar = (C15389d) C44363v.m140368c(this.f114620a).mo106448i().getValue();
                if (dVar != null) {
                    if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
                        String b = gVar.mo74978b();
                        C7573i.m23582a((Object) b, "leftFilter.filterFolder");
                        String b2 = gVar2.mo74978b();
                        C7573i.m23582a((Object) b2, "rightFilter.filterFolder");
                        dVar.mo38786a(b, b2, f, C29297h.m96116a(gVar, (C29230az) this.f114620a.mo30922I(), (C29238ba) new C44368b(dVar)), C29297h.m96116a(gVar2, (C29230az) this.f114620a.mo30922I(), (C29238ba) new C44369c(dVar)));
                    } else {
                        dVar.mo38785a(gVar.mo74978b(), gVar2.mo74978b(), f);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$d */
    static final class C44370d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44363v f114624a;

        C44370d(C44363v vVar) {
            this.f114624a = vVar;
            super(2);
        }

        /* renamed from: a */
        private void m140397a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44363v.m140364a(this.f114624a).f114593e = z;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140397a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$e */
    static final class C44371e<T> implements C0053p<C29296g> {

        /* renamed from: a */
        final /* synthetic */ C44363v f114625a;

        C44371e(C44363v vVar) {
            this.f114625a = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C29296g gVar) {
            C44363v.m140364a(this.f114625a).mo106794a(false, gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$f */
    static final class C44372f extends Lambda implements C7563m<C44396a, Pair<? extends Float, ? extends Long>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44363v f114626a;

        C44372f(C44363v vVar) {
            this.f114626a = vVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140399a((C44396a) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140399a(C44396a aVar, Pair<Float, Long> pair) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(pair, "it");
            C44065ar.m139484a(C44363v.m140367b(this.f114626a), ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$g */
    static final class C44373g extends Lambda implements C7563m<C44396a, Triple<? extends Float, ? extends Float, ? extends Float>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44363v f114627a;

        C44373g(C44363v vVar) {
            this.f114627a = vVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140400a((C44396a) obj, (Triple) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140400a(C44396a aVar, Triple<Float, Float, Float> triple) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(triple, "it");
            C44065ar.m139483a(C44363v.m140367b(this.f114627a), ((Number) triple.getFirst()).floatValue(), ((Number) triple.getSecond()).floatValue(), ((Number) triple.getThird()).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$h */
    static final class C44374h extends Lambda implements C7561a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C44363v f114628a;

        C44374h(C44363v vVar) {
            this.f114628a = vVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VideoPublishEditModel invoke() {
            return C44363v.m140368c(this.f114628a).mo29069f();
        }
    }

    /* renamed from: G */
    public final VideoPublishEditModel mo30920G() {
        return (VideoPublishEditModel) this.f114616s.getValue();
    }

    /* renamed from: I */
    public final C29197ac mo30922I() {
        return (C29197ac) this.f114617t.getValue();
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
    public final void mo106806a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f114613o = uVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
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

    /* renamed from: H */
    public final C44362u mo30921H() {
        C44362u uVar = this.f114613o;
        if (uVar == null) {
            C7573i.m23583a("editGestureListenerManager");
        }
        return uVar;
    }

    /* renamed from: J */
    private final void m140362J() {
        EditGestureViewModel editGestureViewModel = this.f114614q;
        if (editGestureViewModel == null) {
            C7573i.m23583a("gestureViewModel");
        }
        mo91868b(editGestureViewModel, C44375w.f114629a, new C11672v(), new C44370d(this));
        EditGestureViewModel editGestureViewModel2 = this.f114614q;
        if (editGestureViewModel2 == null) {
            C7573i.m23583a("gestureViewModel");
        }
        editGestureViewModel2.mo29069f().observe(this, new C44371e(this));
        EditGestureViewModel editGestureViewModel3 = this.f114614q;
        if (editGestureViewModel3 == null) {
            C7573i.m23583a("gestureViewModel");
        }
        mo91869c(editGestureViewModel3, C44376x.f114630a, new C11672v(), new C44372f(this));
        EditGestureViewModel editGestureViewModel4 = this.f114614q;
        if (editGestureViewModel4 == null) {
            C7573i.m23583a("gestureViewModel");
        }
        mo91869c(editGestureViewModel4, C44377y.f114631a, new C11672v(), new C44373g(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ C44358t m140364a(C44363v vVar) {
        C44358t tVar = vVar.f114609k;
        if (tVar == null) {
            C7573i.m23583a("editGestureHelper");
        }
        return tVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoRecordGestureLayout m140367b(C44363v vVar) {
        VideoRecordGestureLayout videoRecordGestureLayout = vVar.f114608j;
        if (videoRecordGestureLayout == null) {
            C7573i.m23583a("editGestureLayout");
        }
        return videoRecordGestureLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditViewModel m140368c(C44363v vVar) {
        EditViewModel editViewModel = vVar.f114612n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VEVideoPublishEditViewModel m140369d(C44363v vVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = vVar.f114611m;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditFilterViewModel m140370e(C44363v vVar) {
        EditFilterViewModel editFilterViewModel = vVar.f114610l;
        if (editFilterViewModel == null) {
            C7573i.m23583a("editFilterViewModel");
        }
        return editFilterViewModel;
    }

    /* renamed from: a */
    public static String m140365a(C29296g gVar) {
        if (gVar instanceof C29324o) {
            return "filter_box";
        }
        return "slide";
    }

    /* renamed from: a */
    private final void m140366a(VideoRecordGestureLayout videoRecordGestureLayout) {
        int i;
        LayoutParams layoutParams = videoRecordGestureLayout.getLayoutParams();
        int b = C39805en.m127447b(this.f33526d_);
        if (C42160b.m134123a(this.f33526d_)) {
            i = 0;
        } else {
            i = (int) C9738o.m28708b((Context) this.f33526d_, 50.0f);
        }
        int i2 = b + i;
        int e = C39805en.m127452e(this.f33526d_) + ((int) C9738o.m28708b((Context) this.f33526d_, 50.0f));
        if (layoutParams == null) {
            layoutParams = new LayoutParams(i2, e);
        } else {
            layoutParams.width = i2;
            layoutParams.height = e;
        }
        videoRecordGestureLayout.setLayoutParams(layoutParams);
        videoRecordGestureLayout.setSloppyExtra(C23486n.m77122a(150.0d));
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        C29296g gVar;
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f114611m = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditFilterIndicatorViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…torViewModel::class.java]");
                this.f114615r = (EditFilterIndicatorViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditGestureViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…ureViewModel::class.java)");
                    this.f114614q = (EditGestureViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditFilterViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…terViewModel::class.java)");
                        this.f114610l = (EditFilterViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…ditViewModel::class.java)");
                            this.f114612n = (EditViewModel) a5;
                            C0043i iVar = this;
                            VideoRecordGestureLayout videoRecordGestureLayout = this.f114608j;
                            if (videoRecordGestureLayout == null) {
                                C7573i.m23583a("editGestureLayout");
                            }
                            EditFilterIndicatorViewModel editFilterIndicatorViewModel = this.f114615r;
                            if (editFilterIndicatorViewModel == null) {
                                C7573i.m23583a("filterIndicatorViewModel");
                            }
                            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114611m;
                            if (vEVideoPublishEditViewModel == null) {
                                C7573i.m23583a("publishEditViewModel");
                            }
                            LiveData i = vEVideoPublishEditViewModel.mo119517i();
                            C7573i.m23582a((Object) i, "publishEditViewModel.selectedFilter");
                            C29321a aVar = (C29321a) i.getValue();
                            if (aVar != null) {
                                gVar = aVar.f77314b;
                            } else {
                                gVar = null;
                            }
                            C29296g gVar2 = gVar;
                            EditGestureViewModel editGestureViewModel = this.f114614q;
                            if (editGestureViewModel == null) {
                                C7573i.m23583a("gestureViewModel");
                            }
                            C44358t tVar = new C44358t(iVar, videoRecordGestureLayout, editFilterIndicatorViewModel, gVar2, editGestureViewModel);
                            this.f114609k = tVar;
                            C44358t tVar2 = this.f114609k;
                            if (tVar2 == null) {
                                C7573i.m23583a("editGestureHelper");
                            }
                            tVar2.f114590b = this.f114618u;
                            C44358t tVar3 = this.f114609k;
                            if (tVar3 == null) {
                                C7573i.m23583a("editGestureHelper");
                            }
                            C44362u uVar = this.f114613o;
                            if (uVar == null) {
                                C7573i.m23583a("editGestureListenerManager");
                            }
                            tVar3.mo106793a((C39944a) uVar);
                            VideoRecordGestureLayout videoRecordGestureLayout2 = this.f114608j;
                            if (videoRecordGestureLayout2 == null) {
                                C7573i.m23583a("editGestureLayout");
                            }
                            m140366a(videoRecordGestureLayout2);
                            m140362J();
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

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ail, viewGroup, false);
        if (inflate != null) {
            this.f114608j = (VideoRecordGestureLayout) inflate;
            VideoRecordGestureLayout videoRecordGestureLayout = this.f114608j;
            if (videoRecordGestureLayout == null) {
                C7573i.m23583a("editGestureLayout");
            }
            return videoRecordGestureLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout");
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
}
