package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p1566a.C39602a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C39642b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
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

/* renamed from: com.ss.android.ugc.gamora.editor.cn */
public final class C44284cn extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114449i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44284cn.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VoteStickerController;"))};

    /* renamed from: p */
    public static final C44285a f114450p = new C44285a(null);

    /* renamed from: j */
    public C44362u f114451j;

    /* renamed from: k */
    public VotingStickerLayout f114452k;

    /* renamed from: l */
    public EditViewModel f114453l;

    /* renamed from: m */
    public EditPoiStickerViewModel f114454m;

    /* renamed from: n */
    public EditTextStickerViewModel f114455n;

    /* renamed from: o */
    public EditInfoStickerViewModel f114456o;

    /* renamed from: q */
    private VideoPublishEditModel f114457q;

    /* renamed from: r */
    private EditVoteStickerViewModel f114458r;

    /* renamed from: s */
    private final C7541d f114459s = C7546e.m23569a(C44291g.f114465a);

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$a */
    public static final class C44285a {
        private C44285a() {
        }

        public /* synthetic */ C44285a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$b */
    public static final class C44286b implements C39602a {

        /* renamed from: a */
        final /* synthetic */ C44284cn f114460a;

        /* renamed from: a */
        public final void mo98710a() {
            this.f114460a.mo30920G().mo98934n();
            this.f114460a.mo30922I();
        }

        /* renamed from: b */
        public final void mo98712b() {
            if (this.f114460a.mo106764O()) {
                C44284cn.m140103a(this.f114460a).mo106447h().mo100869a(this.f114460a.mo106766Q());
            }
        }

        C44286b(C44284cn cnVar) {
            this.f114460a = cnVar;
        }

        /* renamed from: a */
        public final void mo98711a(boolean z) {
            C44284cn.m140105b(this.f114460a).mo29069f();
            if (z) {
                C44284cn.m140103a(this.f114460a).mo106443a(true, true);
            } else {
                C44284cn.m140103a(this.f114460a).mo106443a(false, true);
            }
        }

        /* renamed from: b */
        public final void mo98713b(boolean z) {
            if (z) {
                C44284cn.m140105b(this.f114460a).mo29069f();
                C44284cn.m140106c(this.f114460a).mo29069f();
                C44284cn.m140107d(this.f114460a).mo29069f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$c */
    static final class C44287c extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44284cn f114461a;

        C44287c(C44284cn cnVar) {
            this.f114461a = cnVar;
            super(2);
        }

        /* renamed from: a */
        private void m140148a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f114461a.mo106763N();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140148a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$d */
    static final class C44288d<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C44284cn f114462a;

        C44288d(C44284cn cnVar) {
            this.f114462a = cnVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                C39642b G = this.f114462a.mo30920G();
                C7573i.m23582a((Object) f, "it");
                G.mo98730a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$e */
    static final class C44289e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44284cn f114463a;

        C44289e(C44284cn cnVar) {
            this.f114463a = cnVar;
            super(2);
        }

        /* renamed from: a */
        private void m140150a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f114463a.mo106773a(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140150a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$f */
    static final class C44290f<T> implements C0053p<C15389d> {

        /* renamed from: a */
        final /* synthetic */ C44284cn f114464a;

        C44290f(C44284cn cnVar) {
            this.f114464a = cnVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C15389d dVar) {
            if (dVar != null) {
                this.f114464a.mo30920G().mo98732a(dVar, C44284cn.m140103a(this.f114464a).mo106459t());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cn$g */
    static final class C44291g extends Lambda implements C7561a<C39642b> {

        /* renamed from: a */
        public static final C44291g f114465a = new C44291g();

        C44291g() {
            super(0);
        }

        /* renamed from: a */
        private static C39642b m140152a() {
            return new C39642b();
        }

        public final /* synthetic */ Object invoke() {
            return m140152a();
        }
    }

    /* renamed from: G */
    public final C39642b mo30920G() {
        return (C39642b) this.f114459s.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo106770a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f114451j = uVar;
    }

    /* renamed from: a */
    public final void mo106768a(VotingStickerLayout votingStickerLayout) {
        C7573i.m23587b(votingStickerLayout, "<set-?>");
        this.f114452k = votingStickerLayout;
    }

    /* renamed from: a */
    public final void mo106769a(C44295cr crVar) {
        C7573i.m23587b(crVar, "deleteComponent");
        mo30920G().f102889d = crVar;
    }

    /* renamed from: a */
    public final void mo106771a(VESize vESize) {
        C7573i.m23587b(vESize, "size");
        mo30920G().f102898m = vESize;
    }

    /* renamed from: a */
    public final void mo106773a(boolean z) {
        mo30920G().f102888c = z;
    }

    /* renamed from: a */
    public final void mo106772a(String str) {
        mo30920G().f103093t = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: J */
    public final C39774n mo106760J() {
        return mo30920G();
    }

    /* renamed from: K */
    public final void mo96987K() {
        mo30920G().mo98746h();
    }

    /* renamed from: N */
    public final void mo106763N() {
        mo30920G().mo98743e();
    }

    /* renamed from: P */
    public final void mo106765P() {
        mo30920G().mo98932l();
    }

    /* renamed from: Q */
    public final String mo106766Q() {
        return mo30920G().f103093t;
    }

    /* renamed from: R */
    public final boolean mo106767R() {
        return mo30920G().f103095v;
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

    /* renamed from: T */
    private final void m140101T() {
        mo30920G().f102896k = new C44286b(this);
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        mo30920G().mo98931k();
    }

    /* renamed from: L */
    public final InteractStickerStruct mo106761L() {
        return mo30920G().mo98758j();
    }

    /* renamed from: M */
    public final boolean mo106762M() {
        return mo30920G().mo98742d();
    }

    /* renamed from: O */
    public final boolean mo106764O() {
        return mo30920G().mo98744f();
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        mo30920G().mo98935o();
    }

    /* renamed from: S */
    private final void m140100S() {
        EditVoteStickerViewModel editVoteStickerViewModel = this.f114458r;
        if (editVoteStickerViewModel == null) {
            C7573i.m23583a("voteStickerViewModel");
        }
        mo91869c(editVoteStickerViewModel, C44292co.f114466a, new C11672v(), new C44287c(this));
        EditVoteStickerViewModel editVoteStickerViewModel2 = this.f114458r;
        if (editVoteStickerViewModel2 == null) {
            C7573i.m23583a("voteStickerViewModel");
        }
        C0043i iVar = this;
        editVoteStickerViewModel2.mo106488g().observe(iVar, new C44288d(this));
        EditVoteStickerViewModel editVoteStickerViewModel3 = this.f114458r;
        if (editVoteStickerViewModel3 == null) {
            C7573i.m23583a("voteStickerViewModel");
        }
        mo91868b(editVoteStickerViewModel3, C44293cp.f114467a, new C11672v(), new C44289e(this));
        EditViewModel editViewModel = this.f114453l;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106448i().observe(iVar, new C44290f(this));
    }

    /* renamed from: H */
    public final void mo30921H() {
        EditViewModel editViewModel = this.f114453l;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        InteractStickerStruct a = C39604b.m126707a(editViewModel.mo29069f().getMainBusinessContext(), 1, InteractTrackPage.TRACK_PAGE_EDIT);
        C39642b G = mo30920G();
        EditViewModel editViewModel2 = this.f114453l;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        C15389d dVar = (C15389d) editViewModel2.mo106448i().getValue();
        EditViewModel editViewModel3 = this.f114453l;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        G.mo98732a(dVar, editViewModel3.mo106459t());
        if (a != null && a.getVoteStruct() != null) {
            mo30920G().mo98734a(a);
        }
    }

    /* renamed from: I */
    public final void mo30922I() {
        String str = "poll_edit";
        C22984d a = C22984d.m75611a();
        String str2 = "creation_id";
        VideoPublishEditModel videoPublishEditModel = this.f114457q;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a2 = a.mo59973a(str2, videoPublishEditModel.creationId);
        String str3 = "shoot_way";
        VideoPublishEditModel videoPublishEditModel2 = this.f114457q;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a3 = a2.mo59973a(str3, videoPublishEditModel2.mShootWay);
        String str4 = "content_type";
        VideoPublishEditModel videoPublishEditModel3 = this.f114457q;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C22984d a4 = a3.mo59973a(str4, C39500av.m126133a(videoPublishEditModel3));
        String str5 = "content_source";
        VideoPublishEditModel videoPublishEditModel4 = this.f114457q;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("publishEditModel");
        }
        C6907h.m21524a(str, (Map) a4.mo59973a(str5, C39500av.m126142b(videoPublishEditModel4)).mo59973a("enter_from", "video_edit_page").mo59973a("prop_id", mo106766Q()).f60753a);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m140103a(C44284cn cnVar) {
        EditViewModel editViewModel = cnVar.f114453l;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditInfoStickerViewModel m140105b(C44284cn cnVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = cnVar.f114456o;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("infoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditPoiStickerViewModel m140106c(C44284cn cnVar) {
        EditPoiStickerViewModel editPoiStickerViewModel = cnVar.f114454m;
        if (editPoiStickerViewModel == null) {
            C7573i.m23583a("poiStickerViewModel");
        }
        return editPoiStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditTextStickerViewModel m140107d(C44284cn cnVar) {
        EditTextStickerViewModel editTextStickerViewModel = cnVar.f114455n;
        if (editTextStickerViewModel == null) {
            C7573i.m23583a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: a */
    private final void m140104a(FrameLayout frameLayout) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f114453l = (EditViewModel) a;
            EditViewModel editViewModel = this.f114453l;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            this.f114457q = editViewModel.mo29069f();
            EditViewModel editViewModel2 = this.f114453l;
            if (editViewModel2 == null) {
                C7573i.m23583a("editViewModel");
            }
            C15389d dVar = (C15389d) editViewModel2.mo106448i().getValue();
            if (dVar != null) {
                mo106771a(dVar.mo38828c());
                mo30920G().mo98739b(this.f33526d_, null, frameLayout);
                C44362u uVar = this.f114451j;
                if (uVar == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                uVar.mo106801a((C42060b) mo30920G().f102899n);
            }
            C39642b G = mo30920G();
            Activity activity2 = this.f33526d_;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "activity!!");
            VotingStickerLayout votingStickerLayout = this.f114452k;
            if (votingStickerLayout == null) {
                C7573i.m23583a("votingStickerLayout");
            }
            G.mo98929a(activity2, votingStickerLayout);
            C39642b G2 = mo30920G();
            EditViewModel editViewModel3 = this.f114453l;
            if (editViewModel3 == null) {
                C7573i.m23583a("editViewModel");
            }
            C15389d dVar2 = (C15389d) editViewModel3.mo106448i().getValue();
            EditViewModel editViewModel4 = this.f114453l;
            if (editViewModel4 == null) {
                C7573i.m23583a("editViewModel");
            }
            G2.mo98732a(dVar2, editViewModel4.mo106459t());
            mo30920G().f102900o = false;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditVoteStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f114458r = (EditVoteStickerViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditTextStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f114455n = (EditTextStickerViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditPoiStickerViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f114454m = (EditPoiStickerViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditInfoStickerViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f114456o = (EditInfoStickerViewModel) a4;
                        m140100S();
                        m140101T();
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

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        m140104a(frameLayout);
        return new View(frameLayout.getContext());
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
