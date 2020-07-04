package com.p280ss.android.ugc.gamora.recorder.progress;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
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
import com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.a */
public final class C44705a extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115079i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44705a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: k */
    public static final C44706a f115080k = new C44706a(null);

    /* renamed from: j */
    public ProgressSegmentView f115081j;

    /* renamed from: l */
    private final C7541d f115082l;

    /* renamed from: m */
    private RecordModeViewModel f115083m;

    /* renamed from: n */
    private RecordProgressViewModel f115084n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$a */
    public static final class C44706a {
        private C44706a() {
        }

        public /* synthetic */ C44706a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$b */
    static final class C44707b extends Lambda implements C7563m<C11585f, Pair<? extends List<? extends TimeSpeedModelExtension>, ? extends Long>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115085a;

        C44707b(C44705a aVar) {
            this.f115085a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141162a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141162a(C11585f fVar, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
            C7573i.m23587b(fVar, "$receiver");
            if (pair != null) {
                C44705a.m141145a(this.f115085a).mo102350b((List) pair.getFirst(), ((Number) pair.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$c */
    static final class C44708c extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115086a;

        C44708c(C44705a aVar) {
            this.f115086a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141163a((C11585f) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141163a(C11585f fVar, int i) {
            boolean z;
            C7573i.m23587b(fVar, "$receiver");
            if (i == 2) {
                C44705a.m141145a(this.f115086a).mo102344a();
                return;
            }
            ProgressSegmentView a = C44705a.m141145a(this.f115086a);
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            a.mo102348a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$d */
    static final class C44709d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115087a;

        C44709d(C44705a aVar) {
            this.f115087a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141164a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141164a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = C44705a.m141145a(this.f115087a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f115087a.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                marginLayoutParams.topMargin = C39805en.m127450c(activity) + this.f115087a.mo31017x().getDimensionPixelSize(R.dimen.m2);
                C44705a.m141145a(this.f115087a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$e */
    static final class C44710e extends Lambda implements C7563m<C11585f, Pair<? extends List<? extends TimeSpeedModelExtension>, ? extends Long>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115088a;

        C44710e(C44705a aVar) {
            this.f115088a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141165a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141165a(C11585f fVar, Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
            C7573i.m23587b(fVar, "$receiver");
            if (pair != null) {
                C44705a.m141145a(this.f115088a).mo102347a((List) pair.getFirst(), ((Number) pair.getSecond()).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$f */
    static final class C44711f extends Lambda implements C7563m<C11585f, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115089a;

        C44711f(C44705a aVar) {
            this.f115089a = aVar;
            super(2);
        }

        /* renamed from: a */
        private void m141166a(C11585f fVar, long j) {
            C7573i.m23587b(fVar, "$receiver");
            C44705a.m141145a(this.f115089a).setMaxDuration(j);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141166a((C11585f) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.a$g */
    static final class C44712g extends Lambda implements C7563m<C11585f, RetakeVideoContext, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44705a f115090a;

        C44712g(C44705a aVar) {
            this.f115090a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141167a((C11585f) obj, (RetakeVideoContext) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141167a(C11585f fVar, RetakeVideoContext retakeVideoContext) {
            C7573i.m23587b(fVar, "$receiver");
            if (retakeVideoContext != null) {
                C44705a.m141145a(this.f115090a).mo102346a(retakeVideoContext);
            }
        }
    }

    /* renamed from: G */
    private final RecordViewModel m141142G() {
        return (RecordViewModel) this.f115082l.getValue();
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

    public C44705a() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115082l = C7546e.m23569a(new RecordProgressScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: H */
    private final void m141143H() {
        mo91870d(m141142G(), C44713b.f115091a, new C11672v(), new C44709d(this));
        RecordProgressViewModel recordProgressViewModel = this.f115084n;
        if (recordProgressViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordProgressViewModel, C44715d.f115093a, C11673w.m34161b(true), new C44710e(this));
        RecordProgressViewModel recordProgressViewModel2 = this.f115084n;
        if (recordProgressViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordProgressViewModel2, C44716e.f115094a, C11673w.m34161b(true), new C44711f(this));
        RecordModeViewModel recordModeViewModel = this.f115083m;
        if (recordModeViewModel == null) {
            C7573i.m23583a("recordModeViewModel");
        }
        mo29062a(recordModeViewModel, C44717f.f115095a, C11640h.m34110a(), new C44712g(this));
        RecordModeViewModel recordModeViewModel2 = this.f115083m;
        if (recordModeViewModel2 == null) {
            C7573i.m23583a("recordModeViewModel");
        }
        mo29062a(recordModeViewModel2, C44718g.f115096a, C11640h.m34110a(), new C44707b(this));
        RecordModeViewModel recordModeViewModel3 = this.f115083m;
        if (recordModeViewModel3 == null) {
            C7573i.m23583a("recordModeViewModel");
        }
        mo29062a(recordModeViewModel3, C44714c.f115092a, C11640h.m34110a(), new C44708c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ProgressSegmentView m141145a(C44705a aVar) {
        ProgressSegmentView progressSegmentView = aVar.f115081j;
        if (progressSegmentView == null) {
            C7573i.m23583a("progressSegmentView");
        }
        return progressSegmentView;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(RecordProgressViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…essViewModel::class.java)");
            this.f115084n = (RecordProgressViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(RecordModeViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…odeViewModel::class.java)");
                this.f115083m = (RecordModeViewModel) a2;
                View h_ = mo31004h_(R.id.cl9);
                C7573i.m23582a((Object) h_, "requireViewById(R.id.progress_segment_view)");
                this.f115081j = (ProgressSegmentView) h_;
                m141143H();
                return;
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
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aj2, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ogress, container, false)");
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
