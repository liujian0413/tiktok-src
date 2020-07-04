package com.p280ss.android.ugc.gamora.recorder.exit;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11673w;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.exit.c */
public final class C44631c extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114971i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44631c.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: l */
    public static final C44632a f114972l = new C44632a(null);

    /* renamed from: j */
    public RecordExitViewModel f114973j;

    /* renamed from: k */
    public AutoRTLImageView f114974k;

    /* renamed from: m */
    private final C7541d f114975m;

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.c$a */
    public static final class C44632a {
        private C44632a() {
        }

        public /* synthetic */ C44632a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.c$b */
    static final class C44633b extends Lambda implements C7563m<C11585f, Drawable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44631c f114976a;

        C44633b(C44631c cVar) {
            this.f114976a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140982a((C11585f) obj, (Drawable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140982a(C11585f fVar, Drawable drawable) {
            C7573i.m23587b(fVar, "$receiver");
            if (drawable != null) {
                C44631c.m140964a(this.f114976a).setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.c$c */
    static final class C44634c extends Lambda implements C7563m<C11585f, Pair<? extends Float, ? extends Float>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44631c f114977a;

        C44634c(C44631c cVar) {
            this.f114977a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140983a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140983a(C11585f fVar, Pair<Float, Float> pair) {
            C7573i.m23587b(fVar, "$receiver");
            if (pair != null) {
                C9738o.m28713b((View) C44631c.m140964a(this.f114977a));
                AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
                alphaAnimation.setDuration(150);
                C44631c.m140964a(this.f114977a).startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.c$d */
    static final class C44635d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44631c f114978a;

        C44635d(C44631c cVar) {
            this.f114978a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140984a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140984a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44631c.m140964a(this.f114978a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f114978a.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                marginLayoutParams.topMargin = C39805en.m127450c(activity) + this.f114978a.mo31017x().getDimensionPixelSize(R.dimen.m1);
                C44631c.m140964a(this.f114978a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.c$e */
    static final class C44636e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44631c f114979a;

        C44636e(C44631c cVar) {
            this.f114979a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            RecordExitViewModel b = C44631c.m140965b(this.f114979a);
            Activity v = this.f114979a.mo31015v();
            C7573i.m23582a((Object) v, "requireActivity()");
            b.mo107064a(v);
        }
    }

    /* renamed from: G */
    private final RecordViewModel m140962G() {
        return (RecordViewModel) this.f114975m.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
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

    public C44631c() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f114975m = C7546e.m23569a(new RecordExitScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: a */
    public static final /* synthetic */ AutoRTLImageView m140964a(C44631c cVar) {
        AutoRTLImageView autoRTLImageView = cVar.f114974k;
        if (autoRTLImageView == null) {
            C7573i.m23583a("closeRecordView");
        }
        return autoRTLImageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordExitViewModel m140965b(C44631c cVar) {
        RecordExitViewModel recordExitViewModel = cVar.f114973j;
        if (recordExitViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        return recordExitViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(RecordExitViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…xitViewModel::class.java)");
            this.f114973j = (RecordExitViewModel) a;
            View h_ = mo31004h_(R.id.ayy);
            C7573i.m23582a((Object) h_, "requireViewById(R.id.img_close_record)");
            this.f114974k = (AutoRTLImageView) h_;
            RecordExitViewModel recordExitViewModel = this.f114973j;
            if (recordExitViewModel == null) {
                C7573i.m23583a("viewModel");
            }
            mo29062a(recordExitViewModel, C44637d.f114980a, C11673w.m34161b(true), new C44633b(this));
            RecordExitViewModel recordExitViewModel2 = this.f114973j;
            if (recordExitViewModel2 == null) {
                C7573i.m23583a("viewModel");
            }
            mo29062a(recordExitViewModel2, C44638e.f114981a, C11640h.m34110a(), new C44634c(this));
            mo91870d(m140962G(), C44639f.f114982a, C11673w.m34161b(true), new C44635d(this));
            AutoRTLImageView autoRTLImageView = this.f114974k;
            if (autoRTLImageView == null) {
                C7573i.m23583a("closeRecordView");
            }
            autoRTLImageView.setOnClickListener(new C44636e(this));
            return;
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
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aj1, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…d_exit, container, false)");
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
