package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
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
import com.bytedance.jedi.arch.internal.C11640h;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40042f;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import dmt.p1861av.video.C47515u;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.C7581n;
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

/* renamed from: com.ss.android.ugc.gamora.editor.ae */
public final class C44005ae extends C40042f implements C44396a {

    /* renamed from: E */
    public static final C44006a f113865E = new C44006a(null);

    /* renamed from: A */
    public C47515u f113866A;

    /* renamed from: B */
    public int f113867B;

    /* renamed from: C */
    public int f113868C;

    /* renamed from: D */
    public int f113869D;

    /* renamed from: v */
    public VEVideoPublishEditViewModel f113870v;

    /* renamed from: w */
    public EditInfoStickerViewModel f113871w;

    /* renamed from: x */
    public EditLyricStickerViewModel f113872x;

    /* renamed from: y */
    public C39558aj f113873y;

    /* renamed from: z */
    public VEPreviewMusicParams f113874z;

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$a */
    public static final class C44006a {
        private C44006a() {
        }

        public /* synthetic */ C44006a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$b */
    static final class C44007b<T> implements C0053p<VEPreviewMusicParams> {

        /* renamed from: a */
        final /* synthetic */ C44005ae f113875a;

        C44007b(C44005ae aeVar) {
            this.f113875a = aeVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(VEPreviewMusicParams vEPreviewMusicParams) {
            if (vEPreviewMusicParams != null) {
                this.f113875a.f113874z = vEPreviewMusicParams;
                this.f113875a.f113866A = null;
                this.f113875a.mo106509M();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$c */
    static final class C44008c<T> implements C0053p<C47515u> {

        /* renamed from: a */
        final /* synthetic */ C44005ae f113876a;

        C44008c(C44005ae aeVar) {
            this.f113876a = aeVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47515u uVar) {
            if (uVar != null) {
                this.f113876a.f113866A = uVar;
                this.f113876a.mo106509M();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$d */
    static final class C44009d extends Lambda implements C7563m<C11585f, C44403b<? extends StickerItemModel>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44005ae f113877a;

        /* renamed from: com.ss.android.ugc.gamora.editor.ae$d$a */
        static final class C44010a extends Lambda implements C7562b<StickerItemModel, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C44009d f113878a;

            C44010a(C44009d dVar) {
                this.f113878a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m139292a((StickerItemModel) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m139292a(StickerItemModel stickerItemModel) {
                C7573i.m23587b(stickerItemModel, "it");
                if (stickerItemModel.isLyric()) {
                    C0052o r = this.f113878a.f113877a.mo106507J().mo119526r();
                    C7573i.m23582a((Object) r, "publishEditViewModel.inTimeEditView");
                    if (!C7573i.m23585a((Object) (Boolean) r.getValue(), (Object) Boolean.valueOf(true))) {
                        C0052o s = this.f113878a.f113877a.mo106507J().mo119527s();
                        C7573i.m23582a((Object) s, "publishEditViewModel.inPinEditView");
                        if (!C7573i.m23585a((Object) (Boolean) s.getValue(), (Object) Boolean.valueOf(true))) {
                            this.f113878a.f113877a.mo30920G();
                        }
                    }
                }
            }
        }

        C44009d(C44005ae aeVar) {
            this.f113877a = aeVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139291a((C11585f) obj, (C44403b) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139291a(C11585f fVar, C44403b<? extends StickerItemModel> bVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (bVar != null) {
                bVar.mo106827a(new C44010a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$e */
    static final class C44011e extends Lambda implements C7563m<C11585f, C39558aj, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44005ae f113879a;

        C44011e(C44005ae aeVar) {
            this.f113879a = aeVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139293a((C11585f) obj, (C39558aj) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139293a(C11585f fVar, C39558aj ajVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (ajVar != null) {
                StickerItemModel stickerItemModel = ajVar.f102708c;
                C7573i.m23582a((Object) stickerItemModel, "it.stickerItem");
                if (stickerItemModel.isLyric()) {
                    this.f113879a.f113873y = ajVar;
                    StickerItemModel stickerItemModel2 = ajVar.f102708c;
                    this.f113879a.mo99484a(stickerItemModel2.stickerId);
                    this.f113879a.mo99483a((Effect) null, (String) null);
                    C0052o u = this.f113879a.mo106507J().mo119529u();
                    C7573i.m23582a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
                    C40026b bVar = new C40026b(this.f113879a.mo106508L(), stickerItemModel2.mLyricInPoint, stickerItemModel2.mLyricStartTime, stickerItemModel2.mLyricOutPoint, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
                    u.setValue(bVar);
                    this.f113879a.mo96987K().mo106276h();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ae$f */
    static final class C44012f extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44005ae f113880a;

        C44012f(C44005ae aeVar) {
            this.f113880a = aeVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139294a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139294a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                this.f113880a.mo99485d(num.intValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
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

    /* renamed from: J */
    public final VEVideoPublishEditViewModel mo106507J() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113870v;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: K */
    public final EditLyricStickerViewModel mo96987K() {
        EditLyricStickerViewModel editLyricStickerViewModel = this.f113872x;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("lyricStickerEditViewMode");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: L */
    public final int mo106508L() {
        if (this.f113873y == null) {
            return -1;
        }
        C39558aj ajVar = this.f113873y;
        if (ajVar == null) {
            C7573i.m23580a();
        }
        StickerItemModel stickerItemModel = ajVar.f102708c;
        if (stickerItemModel == null) {
            C7573i.m23580a();
        }
        return stickerItemModel.f83875id;
    }

    /* renamed from: N */
    private final void m139268N() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113870v;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C0043i iVar = this;
        vEVideoPublishEditViewModel.mo119513e().observe(iVar, new C44007b(this));
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f113870v;
        if (vEVideoPublishEditViewModel2 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        vEVideoPublishEditViewModel2.mo119522n().observe(iVar, new C44008c(this));
        EditInfoStickerViewModel editInfoStickerViewModel = this.f113871w;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("infoStickerEditViewModel");
        }
        mo29062a(editInfoStickerViewModel, C44013af.f113881a, C11640h.m34110a(), new C44009d(this));
        EditLyricStickerViewModel editLyricStickerViewModel = this.f113872x;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("lyricStickerEditViewMode");
        }
        mo29062a(editLyricStickerViewModel, C44014ag.f113882a, C11640h.m34110a(), new C44011e(this));
        EditLyricStickerViewModel editLyricStickerViewModel2 = this.f113872x;
        if (editLyricStickerViewModel2 == null) {
            C7573i.m23583a("lyricStickerEditViewMode");
        }
        mo29062a(editLyricStickerViewModel2, C44015ah.f113883a, C11640h.m34110a(), new C44012f(this));
    }

    /* renamed from: M */
    public final void mo106509M() {
        int i;
        Integer num;
        VEPreviewMusicParams vEPreviewMusicParams = this.f113874z;
        int i2 = 0;
        if (vEPreviewMusicParams != null) {
            i = vEPreviewMusicParams.f121607b;
        } else {
            i = 0;
        }
        this.f113867B = i;
        C47515u uVar = this.f113866A;
        Integer num2 = null;
        if (uVar != null) {
            num = Integer.valueOf(uVar.f121977a);
        } else {
            num = null;
        }
        if (num == null) {
            VEPreviewMusicParams vEPreviewMusicParams2 = this.f113874z;
            if (vEPreviewMusicParams2 != null) {
                i2 = (int) (vEPreviewMusicParams2.f121612g * 1000.0f);
            }
        } else {
            C47515u uVar2 = this.f113866A;
            if (uVar2 != null) {
                num2 = Integer.valueOf(uVar2.f121977a);
            }
            if (num2 == null) {
                C7573i.m23580a();
            }
            int intValue = num2.intValue();
            VEPreviewMusicParams vEPreviewMusicParams3 = this.f113874z;
            if (vEPreviewMusicParams3 != null) {
                i2 = (int) (vEPreviewMusicParams3.f121612g * 1000.0f);
            }
            i2 += intValue;
        }
        this.f113868C = i2;
        int i3 = this.f113868C;
        VEPreviewMusicParams vEPreviewMusicParams4 = this.f113874z;
        if (vEPreviewMusicParams4 == null) {
            C7573i.m23580a();
        }
        this.f113869D = i3 + vEPreviewMusicParams4.f121609d;
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113870v;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C0052o u = vEVideoPublishEditViewModel.mo119529u();
        C7573i.m23582a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
        C40026b bVar = new C40026b(mo106508L(), this.f113867B, this.f113868C, this.f113869D, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        u.setValue(bVar);
        EditLyricStickerViewModel editLyricStickerViewModel = this.f113872x;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("lyricStickerEditViewMode");
        }
        editLyricStickerViewModel.mo106276h();
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f113870v = (VEVideoPublishEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditInfoStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f113871w = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditLyricStickerViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java)");
                    this.f113872x = (EditLyricStickerViewModel) a3;
                    m139268N();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
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
