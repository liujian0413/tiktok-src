package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah.C35539a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39613e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p1566a.C39602a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.C39621a;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42061c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VESize;
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
import kotlin.text.C7634n;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.ap */
public final class C44054ap extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f113966i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44054ap.class), "stickerController", "getStickerController()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/poi/PoiStickerController;"))};

    /* renamed from: p */
    public static final C44055a f113967p = new C44055a(null);

    /* renamed from: j */
    public C44362u f113968j;

    /* renamed from: k */
    public EditViewModel f113969k;

    /* renamed from: l */
    public EditInfoStickerViewModel f113970l;

    /* renamed from: m */
    public EditTextStickerViewModel f113971m;

    /* renamed from: n */
    public EditStickerPanelViewModel f113972n;

    /* renamed from: o */
    public EditVoteStickerViewModel f113973o;

    /* renamed from: q */
    private EditPoiStickerViewModel f113974q;

    /* renamed from: r */
    private EditPreviewViewModel f113975r;

    /* renamed from: s */
    private final C7541d f113976s = C7546e.m23569a(C44063h.f113985a);

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$a */
    public static final class C44055a {
        private C44055a() {
        }

        public /* synthetic */ C44055a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$b */
    public static final class C44056b implements C35539a {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113977a;

        /* renamed from: b */
        final /* synthetic */ Effect f113978b;

        /* renamed from: a */
        public final void mo90363a() {
            this.f113977a.mo106554R();
        }

        /* renamed from: b */
        public final void mo90365b() {
            this.f113977a.mo106555S();
        }

        C44056b(C44054ap apVar, Effect effect) {
            this.f113977a = apVar;
            this.f113978b = effect;
        }

        /* renamed from: a */
        public final void mo90364a(PoiStruct poiStruct, String str) {
            C7573i.m23587b(str, "searchRegionType");
            C44054ap.m139429d(this.f113977a).mo106349a(false);
            String str2 = POIService.INVALID_ID;
            if (poiStruct == null) {
                C7573i.m23580a();
            }
            if (C7634n.m23717a(str2, poiStruct.getPoiId(), true)) {
                poiStruct = null;
            }
            this.f113977a.mo30921H().mo98732a((C15389d) C44054ap.m139425a(this.f113977a).mo106448i().getValue(), C44054ap.m139425a(this.f113977a).mo106459t());
            this.f113977a.mo30921H().mo98756a(poiStruct);
            this.f113977a.mo30921H().mo98735a(this.f113978b.getUnzipPath());
            this.f113977a.mo30921H().f102933t = this.f113978b.getEffectId();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$c */
    public static final class C44057c implements C39602a {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113979a;

        /* renamed from: com.ss.android.ugc.gamora.editor.ap$c$a */
        public static final class C44058a implements C35539a {

            /* renamed from: a */
            final /* synthetic */ C44057c f113980a;

            /* renamed from: a */
            public final void mo90363a() {
                this.f113980a.f113979a.mo106554R();
            }

            /* renamed from: b */
            public final void mo90365b() {
                this.f113980a.f113979a.mo106555S();
            }

            C44058a(C44057c cVar) {
                this.f113980a = cVar;
            }

            /* renamed from: a */
            public final void mo90364a(PoiStruct poiStruct, String str) {
                C7573i.m23587b(str, "searchRegionType");
                C44054ap.m139429d(this.f113980a.f113979a).mo106349a(false);
                String str2 = POIService.INVALID_ID;
                if (poiStruct == null) {
                    C7573i.m23580a();
                }
                if (C7634n.m23717a(str2, poiStruct.getPoiId(), true)) {
                    poiStruct = null;
                }
                this.f113980a.f113979a.mo30921H().mo98732a((C15389d) C44054ap.m139425a(this.f113980a.f113979a).mo106448i().getValue(), C44054ap.m139425a(this.f113980a.f113979a).mo106459t());
                this.f113980a.f113979a.mo30921H().mo98756a(poiStruct);
            }
        }

        /* renamed from: a */
        public final void mo98710a() {
            C35538ah ahVar = C35563c.f93250m;
            C35539a aVar = new C44058a(this);
            Activity activity = this.f113979a.f33526d_;
            if (activity != null) {
                ahVar.mo83216a(aVar, (FragmentActivity) activity, false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: b */
        public final void mo98712b() {
            if (this.f113979a.mo30921H().mo98744f()) {
                C44054ap.m139425a(this.f113979a).mo106447h().mo100869a(this.f113979a.mo30921H().f102933t);
            }
        }

        C44057c(C44054ap apVar) {
            this.f113979a = apVar;
        }

        /* renamed from: b */
        public final void mo98713b(boolean z) {
            if (z) {
                C44054ap.m139427b(this.f113979a).mo29069f();
                C44054ap.m139430e(this.f113979a).mo29069f();
                C44054ap.m139428c(this.f113979a).mo29069f();
            }
        }

        /* renamed from: a */
        public final void mo98711a(boolean z) {
            C44054ap.m139427b(this.f113979a).mo29069f();
            C44054ap.m139428c(this.f113979a).mo29069f();
            if (z) {
                C44054ap.m139425a(this.f113979a).mo106443a(true, true);
            } else {
                C44054ap.m139425a(this.f113979a).mo106443a(false, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$d */
    static final class C44059d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113981a;

        C44059d(C44054ap apVar) {
            this.f113981a = apVar;
        }

        public final void run() {
            this.f113981a.mo30920G().mo106805e((C42060b) this.f113981a.mo30921H().f102899n);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$e */
    static final class C44060e extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113982a;

        C44060e(C44054ap apVar) {
            this.f113982a = apVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139479a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139479a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f113982a.mo30921H().mo98743e();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$f */
    static final class C44061f<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113983a;

        C44061f(C44054ap apVar) {
            this.f113983a = apVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                C39621a H = this.f113983a.mo30921H();
                C7573i.m23582a((Object) f, "it");
                H.mo98730a(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$g */
    static final class C44062g<T> implements C0053p<C15389d> {

        /* renamed from: a */
        final /* synthetic */ C44054ap f113984a;

        C44062g(C44054ap apVar) {
            this.f113984a = apVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C15389d dVar) {
            if (dVar != null) {
                this.f113984a.mo30921H().mo98732a(dVar, C44054ap.m139425a(this.f113984a).mo106459t());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ap$h */
    static final class C44063h extends Lambda implements C7561a<C39621a> {

        /* renamed from: a */
        public static final C44063h f113985a = new C44063h();

        C44063h() {
            super(0);
        }

        /* renamed from: a */
        private static C39621a m139482a() {
            return new C39621a();
        }

        public final /* synthetic */ Object invoke() {
            return m139482a();
        }
    }

    /* renamed from: H */
    public final C39621a mo30921H() {
        return (C39621a) this.f113976s.getValue();
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
    public final void mo106559a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f113968j = uVar;
    }

    /* renamed from: a */
    public final void mo106557a(Effect effect) {
        C7573i.m23587b(effect, "effect");
        C35538ah ahVar = C35563c.f93250m;
        C35539a bVar = new C44056b(this, effect);
        Activity activity = this.f33526d_;
        if (activity != null) {
            ahVar.mo83216a(bVar, (FragmentActivity) activity, false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo106558a(C44295cr crVar) {
        C7573i.m23587b(crVar, "deleteComponent");
        mo30921H().f102889d = crVar;
    }

    /* renamed from: a */
    public final void mo106561a(String str) {
        C7573i.m23587b(str, "stickerPath");
        mo30921H().mo98735a(str);
    }

    /* renamed from: a */
    public final void mo106560a(VESize vESize) {
        C7573i.m23587b(vESize, "size");
        mo30921H().f102898m = vESize;
    }

    /* renamed from: a */
    public final void mo106562a(boolean z) {
        mo30921H().f102888c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: K */
    public final void mo96987K() {
        mo30921H().mo98746h();
    }

    /* renamed from: M */
    public final void mo106549M() {
        mo30921H().mo98743e();
    }

    /* renamed from: O */
    public final C39774n mo106551O() {
        return mo30921H();
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
    public final C44362u mo30920G() {
        C44362u uVar = this.f113968j;
        if (uVar == null) {
            C7573i.m23583a("gestureListenerManager");
        }
        return uVar;
    }

    /* renamed from: J */
    public final boolean mo106547J() {
        return mo30921H().mo98742d();
    }

    /* renamed from: L */
    public final InteractStickerStruct mo106548L() {
        return mo30921H().mo98758j();
    }

    /* renamed from: N */
    public final boolean mo106550N() {
        return mo30921H().mo98744f();
    }

    /* renamed from: P */
    public final String mo106552P() {
        String g = mo30921H().mo98745g();
        C7573i.m23582a((Object) g, "stickerController.stickerPath");
        return g;
    }

    /* renamed from: Q */
    public final String mo106553Q() {
        String str = mo30921H().f102933t;
        C7573i.m23582a((Object) str, "stickerController.stickerId");
        return str;
    }

    /* renamed from: U */
    private final void m139423U() {
        mo30921H().f102896k = new C44057c(this);
        mo30921H().f102904s = new C44059d(this);
    }

    /* renamed from: R */
    public final void mo106554R() {
        EditPreviewViewModel editPreviewViewModel = this.f113975r;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("editPreviewViewModel");
        }
        editPreviewViewModel.mo106321a(true);
        EditViewModel editViewModel = this.f113969k;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
        if (dVar != null) {
            dVar.mo38880w();
        }
    }

    /* renamed from: S */
    public final void mo106555S() {
        EditPreviewViewModel editPreviewViewModel = this.f113975r;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("editPreviewViewModel");
        }
        editPreviewViewModel.mo106321a(false);
        EditViewModel editViewModel = this.f113969k;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
        if (dVar != null) {
            dVar.mo38879v();
        }
    }

    /* renamed from: T */
    private final void m139422T() {
        EditPoiStickerViewModel editPoiStickerViewModel = this.f113974q;
        if (editPoiStickerViewModel == null) {
            C7573i.m23583a("editPoiStickerViewModel");
        }
        mo91869c(editPoiStickerViewModel, C44064aq.f113986a, new C11672v(), new C44060e(this));
        EditPoiStickerViewModel editPoiStickerViewModel2 = this.f113974q;
        if (editPoiStickerViewModel2 == null) {
            C7573i.m23583a("editPoiStickerViewModel");
        }
        C0043i iVar = this;
        editPoiStickerViewModel2.mo106309g().observe(iVar, new C44061f(this));
        EditViewModel editViewModel = this.f113969k;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106448i().observe(iVar, new C44062g(this));
    }

    /* renamed from: I */
    public final void mo30922I() {
        C39621a H = mo30921H();
        EditViewModel editViewModel = this.f113969k;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
        EditViewModel editViewModel2 = this.f113969k;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        H.mo98732a(dVar, editViewModel2.mo106459t());
        EditViewModel editViewModel3 = this.f113969k;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        InteractStickerStruct a = C39604b.m126707a(editViewModel3.mo29069f().getMainBusinessContext(), 0, InteractTrackPage.TRACK_PAGE_EDIT);
        if (a != null && a.getPoiStruct() != null) {
            mo30921H().mo98734a(a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m139425a(C44054ap apVar) {
        EditViewModel editViewModel = apVar.f113969k;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditInfoStickerViewModel m139427b(C44054ap apVar) {
        EditInfoStickerViewModel editInfoStickerViewModel = apVar.f113970l;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("editInfoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditTextStickerViewModel m139428c(C44054ap apVar) {
        EditTextStickerViewModel editTextStickerViewModel = apVar.f113971m;
        if (editTextStickerViewModel == null) {
            C7573i.m23583a("editTextStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditStickerPanelViewModel m139429d(C44054ap apVar) {
        EditStickerPanelViewModel editStickerPanelViewModel = apVar.f113972n;
        if (editStickerPanelViewModel == null) {
            C7573i.m23583a("editStickerPanelViewModel");
        }
        return editStickerPanelViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditVoteStickerViewModel m139430e(C44054ap apVar) {
        EditVoteStickerViewModel editVoteStickerViewModel = apVar.f113973o;
        if (editVoteStickerViewModel == null) {
            C7573i.m23583a("editVoteStickerViewModel");
        }
        return editVoteStickerViewModel;
    }

    /* renamed from: b */
    public final void mo106563b(String str) {
        C7573i.m23587b(str, "stickerId");
        mo30921H().f102933t = str;
    }

    /* renamed from: a */
    private final void m139426a(FrameLayout frameLayout) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f113969k = (EditViewModel) a;
            mo30921H().f102900o = false;
            EditViewModel editViewModel = this.f113969k;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
            if (dVar != null) {
                mo30921H().f102898m = dVar.mo38828c();
                mo30921H().mo98731a((Context) this.f33526d_, (C42061c) null, frameLayout);
                C44362u uVar = this.f113968j;
                if (uVar == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                uVar.mo106802b((C42060b) mo30921H().f102899n);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    public final void mo106564b(boolean z) {
        mo30921H().mo98736a(z);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditPoiStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f113974q = (EditPoiStickerViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditInfoStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f113970l = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditTextStickerViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f113971m = (EditTextStickerViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditStickerPanelViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…nelViewModel::class.java]");
                        this.f113972n = (EditStickerPanelViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditVoteStickerViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f113973o = (EditVoteStickerViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(EditPreviewViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…iewViewModel::class.java]");
                                this.f113975r = (EditPreviewViewModel) a6;
                                m139422T();
                                m139423U();
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
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        m139426a(frameLayout);
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
    public final C1592h<C39613e> mo106556a(String str, int i, int i2, int i3, int i4) {
        C7573i.m23587b(str, "draftDir");
        C1592h<C39613e> a = mo30921H().mo98726a(str, i, i2, i3, i4);
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
