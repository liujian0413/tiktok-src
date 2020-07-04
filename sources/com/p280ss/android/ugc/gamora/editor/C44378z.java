package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.graphics.PointF;
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
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39544a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h.C39596a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h.C39598c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerEditView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39545a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42015a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.gamora.editor.z */
public final class C44378z extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114632i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44378z.class), "stickerHelper", "getStickerHelper()Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/InfoStickerHelper;"))};

    /* renamed from: q */
    public static final C44379a f114633q = new C44379a(null);

    /* renamed from: j */
    public C44362u f114634j;

    /* renamed from: k */
    public VEVideoPublishEditViewModel f114635k;

    /* renamed from: l */
    public EditViewModel f114636l;

    /* renamed from: m */
    public FrameLayout f114637m;

    /* renamed from: n */
    public EditPoiStickerViewModel f114638n;

    /* renamed from: o */
    public EditVoteStickerViewModel f114639o;

    /* renamed from: p */
    public EditTextStickerViewModel f114640p;

    /* renamed from: r */
    private EditPreviewViewModel f114641r;

    /* renamed from: s */
    private EditInfoStickerViewModel f114642s;

    /* renamed from: t */
    private final C7541d f114643t = C7546e.m23569a(C44388j.f114652a);

    /* renamed from: com.ss.android.ugc.gamora.editor.z$a */
    public static final class C44379a {
        private C44379a() {
        }

        public /* synthetic */ C44379a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$b */
    public static final class C44380b implements C39544a {

        /* renamed from: a */
        final /* synthetic */ C44378z f114644a;

        C44380b(C44378z zVar) {
            this.f114644a = zVar;
        }

        /* renamed from: b */
        public final void mo98467b(StickerItemModel stickerItemModel) {
            C7573i.m23587b(stickerItemModel, "item");
            this.f114644a.mo30920G().f102863j.infoStickerModel.removeSticker(stickerItemModel);
            C44378z.m140407a(this.f114644a).mo106447h().mo100869a(stickerItemModel.stickerId);
        }

        /* renamed from: a */
        public final void mo98466a(StickerItemModel stickerItemModel) {
            C7573i.m23587b(stickerItemModel, "item");
            if (this.f114644a.mo30920G().f102863j.infoStickerModel == null) {
                this.f114644a.mo30920G().f102863j.infoStickerModel = new InfoStickerModel(this.f114644a.mo30920G().f102863j.draftDir());
            }
            StringBuilder sb = new StringBuilder("add infoSticker ");
            sb.append(stickerItemModel.f83875id);
            C41530am.m132285d(sb.toString());
            this.f114644a.mo30920G().f102863j.infoStickerModel.addSticker(stickerItemModel);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$c */
    public static final class C44381c implements C39598c {

        /* renamed from: a */
        final /* synthetic */ C44378z f114645a;

        /* renamed from: a */
        public final int mo98683a(C39558aj ajVar, boolean z, boolean z2) {
            C7573i.m23587b(ajVar, "item");
            return 0;
        }

        C44381c(C44378z zVar) {
            this.f114645a = zVar;
        }

        /* renamed from: a */
        public final Float mo98685a(float f) {
            return Float.valueOf(f);
        }

        /* renamed from: a */
        public final PointF mo98684a(C39558aj ajVar, float f, float f2) {
            C7573i.m23587b(ajVar, "item");
            return new PointF();
        }

        /* renamed from: a */
        public final void mo98686a(C39558aj ajVar, int i, int i2, boolean z, boolean z2) {
            C7573i.m23587b(ajVar, "item");
            C0052o r = C44378z.m140408b(this.f114645a).mo119526r();
            C7573i.m23582a((Object) r, "mPublishEditViewModel.inTimeEditView");
            if (!C7573i.m23585a((Object) (Boolean) r.getValue(), (Object) Boolean.valueOf(true))) {
                C0052o s = C44378z.m140408b(this.f114645a).mo119527s();
                C7573i.m23582a((Object) s, "mPublishEditViewModel.inPinEditView");
                if (!C7573i.m23585a((Object) (Boolean) s.getValue(), (Object) Boolean.valueOf(true))) {
                    if (z) {
                        C44378z.m140407a(this.f114645a).mo106443a(true, true);
                        return;
                    }
                    C44378z.m140407a(this.f114645a).mo106443a(false, true);
                    this.f114645a.mo30920G().mo98666d();
                    C44378z.m140409c(this.f114645a).mo29069f();
                    C44378z.m140410d(this.f114645a).mo29069f();
                    C44378z.m140411e(this.f114645a).mo29069f();
                    return;
                }
            }
            if (this.f114645a.mo30920G().f102876w != null) {
                this.f114645a.mo30922I();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$d */
    public static final class C44382d implements C39596a {

        /* renamed from: a */
        final /* synthetic */ C44378z f114646a;

        C44382d(C44378z zVar) {
            this.f114646a = zVar;
        }

        /* renamed from: a */
        public final void mo98692a(boolean z) {
            C44378z.m140409c(this.f114646a).mo106308a(C44378z.m140406a(!z));
            C44378z.m140410d(this.f114646a).mo106486a(C44378z.m140406a(!z));
            C44378z.m140410d(this.f114646a).mo106487a(!z);
            C44378z.m140411e(this.f114646a).mo106372a(C44378z.m140406a(!z), false);
            if (z) {
                C39545a aVar = this.f114646a.mo30920G().f102876w;
                if (!(aVar instanceof C42088k)) {
                    aVar = null;
                }
                C42088k kVar = (C42088k) aVar;
                if (kVar != null) {
                    kVar.mo103414b(C44378z.m140406a(true), false);
                }
            }
        }

        /* renamed from: b */
        public final void mo98693b(boolean z) {
            C44378z.m140409c(this.f114646a).mo106308a(C44378z.m140406a(z));
            C44378z.m140410d(this.f114646a).mo106486a(C44378z.m140406a(z));
            C44378z.m140411e(this.f114646a).mo106372a(C44378z.m140406a(z), false);
            if (!z) {
                C39545a aVar = this.f114646a.mo30920G().f102876w;
                if (!(aVar instanceof C42088k)) {
                    aVar = null;
                }
                C42088k kVar = (C42088k) aVar;
                if (kVar != null) {
                    kVar.mo103414b(C44378z.m140406a(true), false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$e */
    static final class C44383e implements C42015a {

        /* renamed from: a */
        final /* synthetic */ C44378z f114647a;

        C44383e(C44378z zVar) {
            this.f114647a = zVar;
        }

        /* renamed from: a */
        public final void mo103186a(boolean z) {
            C44378z.m140409c(this.f114647a).mo29069f();
            C44378z.m140410d(this.f114647a).mo29069f();
            C44378z.m140411e(this.f114647a).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$f */
    static final class C44384f extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44378z f114648a;

        C44384f(C44378z zVar) {
            this.f114648a = zVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140460a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140460a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f114648a.mo30920G().mo98666d();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$g */
    static final class C44385g extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44378z f114649a;

        C44385g(C44378z zVar) {
            this.f114649a = zVar;
            super(2);
        }

        /* renamed from: a */
        private void m140461a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            this.f114649a.mo30920G().mo98676g(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140461a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$h */
    static final class C44386h extends Lambda implements C7563m<C44396a, Pair<? extends Float, ? extends Long>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44378z f114650a;

        C44386h(C44378z zVar) {
            this.f114650a = zVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140462a((C44396a) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140462a(C44396a aVar, Pair<Float, Long> pair) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(pair, "it");
            InfoStickerEditView infoStickerEditView = this.f114650a.mo30920G().f102857d;
            C7573i.m23582a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
            C44065ar.m139484a(infoStickerEditView, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$i */
    static final class C44387i extends Lambda implements C7563m<C44396a, Triple<? extends Float, ? extends Float, ? extends Float>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44378z f114651a;

        C44387i(C44378z zVar) {
            this.f114651a = zVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140463a((C44396a) obj, (Triple) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140463a(C44396a aVar, Triple<Float, Float, Float> triple) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(triple, "it");
            InfoStickerEditView infoStickerEditView = this.f114651a.mo30920G().f102857d;
            C7573i.m23582a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
            C44065ar.m139483a(infoStickerEditView, ((Number) triple.getFirst()).floatValue(), ((Number) triple.getSecond()).floatValue(), ((Number) triple.getThird()).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.z$j */
    static final class C44388j extends Lambda implements C7561a<C39591h> {

        /* renamed from: a */
        public static final C44388j f114652a = new C44388j();

        C44388j() {
            super(0);
        }

        /* renamed from: a */
        private static C39591h m140464a() {
            return new C39591h();
        }

        public final /* synthetic */ Object invoke() {
            return m140464a();
        }
    }

    /* renamed from: a */
    public static float m140406a(boolean z) {
        return z ? 1.0f : 0.3137255f;
    }

    /* renamed from: G */
    public final C39591h mo30920G() {
        return (C39591h) this.f114643t.getValue();
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
    public final void mo106816a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f114634j = uVar;
    }

    /* renamed from: a */
    public final void mo106812a(FrameLayout frameLayout) {
        C7573i.m23587b(frameLayout, "<set-?>");
        this.f114637m = frameLayout;
    }

    /* renamed from: a */
    public final void mo106815a(C44295cr crVar) {
        mo30920G().f102867n = crVar;
    }

    /* renamed from: a */
    public final void mo106814a(C39548d<?> dVar) {
        mo30920G().mo98650b((C39548d) dVar);
    }

    /* renamed from: a */
    public final void mo106813a(C39545a aVar, boolean z) {
        mo30920G().mo98629a(aVar, z);
    }

    /* renamed from: a */
    public final void mo106811a(int i, int i2, int[] iArr) {
        C7573i.m23587b(iArr, "margins");
        mo30920G().mo98623a(i, i2, iArr);
    }

    /* renamed from: a */
    public final boolean mo106818a(boolean z, boolean z2) {
        return mo30920G().mo98645a(z, z2);
    }

    /* renamed from: a */
    public final void mo106817a(String str, String str2, String str3, int i) {
        mo30920G().mo98638a(str, str2, str3, i);
    }

    /* renamed from: a */
    public final void mo106810a(int i, int i2) {
        mo30920G().mo98621a(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: H */
    public final Object mo30921H() {
        return mo30920G().f102876w;
    }

    /* renamed from: I */
    public final void mo30922I() {
        mo30920G().mo98655c();
    }

    /* renamed from: K */
    public final C39774n mo96987K() {
        return mo30920G();
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

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        mo30920G().mo98678h();
    }

    /* renamed from: J */
    public final boolean mo106807J() {
        return mo30920G().mo98675f();
    }

    /* renamed from: L */
    public final boolean mo106808L() {
        return mo30920G().mo98677g();
    }

    /* renamed from: O */
    private final void m140404O() {
        mo30920G().mo98631a((C39544a) new C44380b(this));
        mo30920G().f102874u = new C44381c(this);
        mo30920G().f102875v = new C44382d(this);
        mo30920G().mo98635a((C42015a) new C44383e(this));
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: M */
    private final void m140402M() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ditViewModel::class.java)");
            this.f114635k = (VEVideoPublishEditViewModel) a;
            JediViewModel a2 = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f114636l = (EditViewModel) a2;
            JediViewModel a3 = C36113b.m116288a(fragmentActivity).mo91871a(EditPreviewViewModel.class);
            C7573i.m23582a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
            this.f114641r = (EditPreviewViewModel) a3;
            JediViewModel a4 = C36113b.m116288a(fragmentActivity).mo91871a(EditInfoStickerViewModel.class);
            C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java)");
            this.f114642s = (EditInfoStickerViewModel) a4;
            JediViewModel a5 = C36113b.m116288a(fragmentActivity).mo91871a(EditPoiStickerViewModel.class);
            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f114638n = (EditPoiStickerViewModel) a5;
            JediViewModel a6 = C36113b.m116288a(fragmentActivity).mo91871a(EditVoteStickerViewModel.class);
            C7573i.m23582a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f114639o = (EditVoteStickerViewModel) a6;
            JediViewModel a7 = C36113b.m116288a(fragmentActivity).mo91871a(EditTextStickerViewModel.class);
            C7573i.m23582a((Object) a7, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f114640p = (EditTextStickerViewModel) a7;
            C39591h G = mo30920G();
            EditViewModel editViewModel = this.f114636l;
            if (editViewModel == null) {
                C7573i.m23583a("mEditViewModel");
            }
            Object value = editViewModel.mo106448i().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            C15389d dVar = (C15389d) value;
            EditViewModel editViewModel2 = this.f114636l;
            if (editViewModel2 == null) {
                C7573i.m23583a("mEditViewModel");
            }
            G.mo98627a(dVar, editViewModel2.mo29069f());
            C39591h G2 = mo30920G();
            C35544ak akVar = C35563c.f93252o;
            C7573i.m23582a((Object) akVar, "AVEnv.SP_SERIVCE");
            Object a8 = akVar.mo83229e().mo83238a();
            C7573i.m23582a(a8, "AVEnv.SP_SERIVCE.storyInfoStickerMaxCount.get()");
            G2.mo98620a(((Number) a8).intValue());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: N */
    private final void m140403N() {
        C39591h G = mo30920G();
        EditPreviewViewModel editPreviewViewModel = this.f114641r;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("mPreviewViewModel");
        }
        G.f102869p = editPreviewViewModel.mo106323h();
        C39591h G2 = mo30920G();
        EditPreviewViewModel editPreviewViewModel2 = this.f114641r;
        if (editPreviewViewModel2 == null) {
            C7573i.m23583a("mPreviewViewModel");
        }
        G2.f102868o = editPreviewViewModel2.mo106324i();
        InfoStickerViewModel infoStickerViewModel = mo30920G().f102862i;
        C7573i.m23582a((Object) infoStickerViewModel, "stickerHelper.viewModel");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114635k;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mPublishEditViewModel");
        }
        infoStickerViewModel.f102671c = vEVideoPublishEditViewModel.mo119526r();
        InfoStickerViewModel infoStickerViewModel2 = mo30920G().f102862i;
        C7573i.m23582a((Object) infoStickerViewModel2, "stickerHelper.viewModel");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f114635k;
        if (vEVideoPublishEditViewModel2 == null) {
            C7573i.m23583a("mPublishEditViewModel");
        }
        infoStickerViewModel2.f102672d = vEVideoPublishEditViewModel2.mo119527s();
        InfoStickerViewModel infoStickerViewModel3 = mo30920G().f102862i;
        C7573i.m23582a((Object) infoStickerViewModel3, "stickerHelper.viewModel");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.f114635k;
        if (vEVideoPublishEditViewModel3 == null) {
            C7573i.m23583a("mPublishEditViewModel");
        }
        infoStickerViewModel3.f102669a = vEVideoPublishEditViewModel3.mo119519k();
        InfoStickerViewModel infoStickerViewModel4 = mo30920G().f102862i;
        C7573i.m23582a((Object) infoStickerViewModel4, "stickerHelper.viewModel");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = this.f114635k;
        if (vEVideoPublishEditViewModel4 == null) {
            C7573i.m23583a("mPublishEditViewModel");
        }
        infoStickerViewModel4.f102670b = vEVideoPublishEditViewModel4.mo119515g();
        EditInfoStickerViewModel editInfoStickerViewModel = this.f114642s;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("mEditInfoStickerViewModel");
        }
        mo91869c(editInfoStickerViewModel, C44001aa.f113861a, new C11672v(), new C44384f(this));
        EditInfoStickerViewModel editInfoStickerViewModel2 = this.f114642s;
        if (editInfoStickerViewModel2 == null) {
            C7573i.m23583a("mEditInfoStickerViewModel");
        }
        mo91869c(editInfoStickerViewModel2, C44002ab.f113862a, new C11672v(), new C44385g(this));
        EditInfoStickerViewModel editInfoStickerViewModel3 = this.f114642s;
        if (editInfoStickerViewModel3 == null) {
            C7573i.m23583a("mEditInfoStickerViewModel");
        }
        mo91869c(editInfoStickerViewModel3, C44003ac.f113863a, new C11672v(), new C44386h(this));
        EditInfoStickerViewModel editInfoStickerViewModel4 = this.f114642s;
        if (editInfoStickerViewModel4 == null) {
            C7573i.m23583a("mEditInfoStickerViewModel");
        }
        mo91869c(editInfoStickerViewModel4, C44004ad.f113864a, new C11672v(), new C44387i(this));
    }

    /* renamed from: c */
    public final void mo106821c(boolean z) {
        mo30920G().mo98665d(z);
    }

    /* renamed from: f */
    public final void mo106824f(int i) {
        mo30920G().mo98668e(i);
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoPublishEditViewModel m140408b(C44378z zVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = zVar.f114635k;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mPublishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditPoiStickerViewModel m140409c(C44378z zVar) {
        EditPoiStickerViewModel editPoiStickerViewModel = zVar.f114638n;
        if (editPoiStickerViewModel == null) {
            C7573i.m23583a("poiStickerViewModel");
        }
        return editPoiStickerViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditVoteStickerViewModel m140410d(C44378z zVar) {
        EditVoteStickerViewModel editVoteStickerViewModel = zVar.f114639o;
        if (editVoteStickerViewModel == null) {
            C7573i.m23583a("voteStickerViewModel");
        }
        return editVoteStickerViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditTextStickerViewModel m140411e(C44378z zVar) {
        EditTextStickerViewModel editTextStickerViewModel = zVar.f114640p;
        if (editTextStickerViewModel == null) {
            C7573i.m23583a("textStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m140407a(C44378z zVar) {
        EditViewModel editViewModel = zVar.f114636l;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: d */
    public final void mo106822d(int i) {
        mo30920G().mo98656c(i);
    }

    /* renamed from: e */
    public final void mo106823e(int i) {
        mo30920G().mo98662d(i);
    }

    /* renamed from: b */
    public final void mo106819b(C39548d<?> dVar) {
        mo30920G().mo98630a((C39548d) dVar);
    }

    /* renamed from: b */
    public final void mo106820b(boolean z) {
        mo30920G().mo98641a(z);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m140402M();
        C39591h G = mo30920G();
        Activity activity = this.f33526d_;
        if (activity != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            View view = this.f33523b;
            VideoPublishEditModel videoPublishEditModel = mo30920G().f102863j;
            C7573i.m23582a((Object) videoPublishEditModel, "stickerHelper.model");
            List mediaModelList = videoPublishEditModel.getMediaModelList();
            EditViewModel editViewModel = this.f114636l;
            if (editViewModel == null) {
                C7573i.m23583a("mEditViewModel");
            }
            G.mo98624a(fragmentActivity, view, mediaModelList, editViewModel.mo106459t());
            C39591h G2 = mo30920G();
            FrameLayout frameLayout = this.f114637m;
            if (frameLayout == null) {
                C7573i.m23583a("borderLineLayout");
            }
            G2.mo98626a(frameLayout);
            m140403N();
            m140404O();
            C44362u uVar = this.f114634j;
            if (uVar == null) {
                C7573i.m23583a("gestureListenerManager");
            }
            InfoStickerEditView infoStickerEditView = mo30920G().f102857d;
            C7573i.m23582a((Object) infoStickerEditView, "stickerHelper.mInfoStickerEditView");
            uVar.mo106803c((C42060b) infoStickerEditView.getGestureListener());
            if (mo30920G().f102863j.mIsFromDraft && mo30920G().f102863j.hasInfoStickers()) {
                C41530am.m132285d("restore info stickers");
                mo30920G().mo98628a(mo30920G().f102863j.infoStickerModel);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.a7g, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ticker, container, false)");
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
    public final C39558aj mo106809a(String str, String str2, String str3, String str4, int i, String str5) {
        C39558aj a = mo30920G().mo98619a(str, str2, str3, str4, i, str5);
        C7573i.m23582a((Object) a, "stickerHelper.addLyricSt…, audioStartTime, lyrics)");
        return a;
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
