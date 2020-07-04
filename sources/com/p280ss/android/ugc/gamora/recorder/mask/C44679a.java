package com.p280ss.android.ugc.gamora.recorder.mask;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
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
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.mask.a */
public final class C44679a extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115043i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44679a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44679a.class), "maskViewModel", "getMaskViewModel()Lcom/ss/android/ugc/gamora/recorder/mask/RecordMaskViewModel;"))};

    /* renamed from: n */
    public static final C44680a f115044n = new C44680a(null);

    /* renamed from: j */
    public RelativeLayout f115045j;

    /* renamed from: k */
    public RelativeLayout f115046k;

    /* renamed from: l */
    public View f115047l;

    /* renamed from: m */
    public View f115048m;

    /* renamed from: o */
    private final C7541d f115049o;

    /* renamed from: p */
    private final C7541d f115050p;

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.a$a */
    public static final class C44680a {
        private C44680a() {
        }

        public /* synthetic */ C44680a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.a$b */
    static final class C44681b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44679a f115051a;

        C44681b(C44679a aVar) {
            this.f115051a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141091a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141091a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44679a.m141071a(this.f115051a).getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int i2 = 0;
                if (z) {
                    i = C39805en.m127450c(this.f115051a.mo31015v());
                } else {
                    i = 0;
                }
                layoutParams2.topMargin = i;
                C44679a.m141071a(this.f115051a).setLayoutParams(layoutParams2);
                LayoutParams layoutParams3 = C44679a.m141072b(this.f115051a).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    if (z) {
                        i2 = C39805en.m127450c(this.f115051a.mo31015v());
                    }
                    layoutParams4.topMargin = i2;
                    C44679a.m141072b(this.f115051a).setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.a$c */
    static final class C44682c extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44679a f115052a;

        C44682c(C44679a aVar) {
            this.f115052a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141092a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141092a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            int dimensionPixelSize = this.f115052a.mo31017x().getDimensionPixelSize(R.dimen.cp);
            LayoutParams layoutParams = C44679a.m141073c(this.f115052a).getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (!z) {
                    dimensionPixelSize = 0;
                }
                layoutParams2.bottomMargin = dimensionPixelSize;
                C44679a.m141073c(this.f115052a).setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.a$d */
    static final class C44683d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44679a f115053a;

        C44683d(C44679a aVar) {
            this.f115053a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141093a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141093a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C44679a.m141072b(this.f115053a).setVisibility(i);
            C44679a.m141074d(this.f115053a).setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.a$e */
    static final class C44684e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44679a f115054a;

        C44684e(C44679a aVar) {
            this.f115054a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141094a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141094a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            RelativeLayout a = C44679a.m141071a(this.f115054a);
            int i2 = 4;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
            RelativeLayout c = C44679a.m141073c(this.f115054a);
            if (z) {
                i2 = 0;
            }
            c.setVisibility(i2);
        }
    }

    /* renamed from: G */
    private final RecordViewModel m141068G() {
        return (RecordViewModel) this.f115049o.getValue();
    }

    /* renamed from: H */
    private final RecordMaskViewModel m141069H() {
        return (RecordMaskViewModel) this.f115050p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
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

    public C44679a() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115049o = C7546e.m23569a(new RecordMaskScene$$special$$inlined$activityViewModel$1(this, a, a));
        C7584c a2 = C7575l.m23595a(RecordMaskViewModel.class);
        this.f115050p = C7546e.m23569a(new RecordMaskScene$$special$$inlined$activityViewModel$2(this, a2, a2));
    }

    /* renamed from: a */
    public static final /* synthetic */ RelativeLayout m141071a(C44679a aVar) {
        RelativeLayout relativeLayout = aVar.f115046k;
        if (relativeLayout == null) {
            C7573i.m23583a("cornersTop");
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m141072b(C44679a aVar) {
        View view = aVar.f115047l;
        if (view == null) {
            C7573i.m23583a("coverTop");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ RelativeLayout m141073c(C44679a aVar) {
        RelativeLayout relativeLayout = aVar.f115045j;
        if (relativeLayout == null) {
            C7573i.m23583a("cornersBottom");
        }
        return relativeLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m141074d(C44679a aVar) {
        View view = aVar.f115048m;
        if (view == null) {
            C7573i.m23583a("coverBottom");
        }
        return view;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        View h_ = mo31004h_(R.id.m2);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.bg_record_top)");
        this.f115047l = h_;
        View h_2 = mo31004h_(R.id.m1);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.bg_record_bottom)");
        this.f115048m = h_2;
        View h_3 = mo31004h_(R.id.a3b);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.corners_top)");
        this.f115046k = (RelativeLayout) h_3;
        View h_4 = mo31004h_(R.id.a3a);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.corners_bottom)");
        this.f115045j = (RelativeLayout) h_4;
        RelativeLayout relativeLayout = this.f115046k;
        if (relativeLayout == null) {
            C7573i.m23583a("cornersTop");
        }
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f115045j;
        if (relativeLayout2 == null) {
            C7573i.m23583a("cornersBottom");
        }
        relativeLayout2.setVisibility(0);
        mo91870d(m141068G(), C44685b.f115055a, new C11672v(), new C44681b(this));
        mo91870d(m141068G(), C44686c.f115056a, new C11672v(), new C44682c(this));
        mo91868b(m141069H(), C44687d.f115057a, new C11672v(), new C44683d(this));
        mo91868b(m141069H(), C44688e.f115058a, new C11672v(), new C44684e(this));
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
        View inflate = layoutInflater.inflate(R.layout.b27, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
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
