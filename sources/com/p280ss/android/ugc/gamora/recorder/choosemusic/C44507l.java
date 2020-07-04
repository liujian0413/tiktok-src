package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
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
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.l */
public final class C44507l extends C44480d implements C44396a {

    /* renamed from: q */
    static final /* synthetic */ C7595j[] f114790q = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44507l.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: r */
    private final C7541d f114791r;

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.l$a */
    static final class C44508a extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44507l f114792a;

        C44508a(C44507l lVar) {
            this.f114792a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140720a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140720a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            LayoutParams layoutParams = this.f114792a.mo30921H().getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity activity = this.f114792a.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                marginLayoutParams.topMargin = C39805en.m127450c(activity) + this.f114792a.mo31017x().getDimensionPixelSize(R.dimen.m1);
                this.f114792a.mo30921H().setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.l$b */
    static final class C44509b extends Lambda implements C7563m<C11585f, Pair<? extends Float, ? extends Float>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44507l f114793a;

        C44509b(C44507l lVar) {
            this.f114793a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140721a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140721a(C11585f fVar, Pair<Float, Float> pair) {
            C7573i.m23587b(fVar, "$receiver");
            if (pair != null) {
                C9738o.m28713b((View) this.f114793a.mo30921H());
                AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
                alphaAnimation.setDuration(150);
                this.f114793a.mo30921H().startAnimation(alphaAnimation);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.l$c */
    static final class C44510c extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44507l f114794a;

        C44510c(C44507l lVar) {
            this.f114794a = lVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140722a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140722a(C11585f fVar, boolean z) {
            int i;
            C7573i.m23587b(fVar, "$receiver");
            RelativeLayout H = this.f114794a.mo30921H();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            H.setVisibility(i);
        }
    }

    /* renamed from: R */
    private final RecordViewModel m140712R() {
        return (RecordViewModel) this.f114791r.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo96987K() {
        return R.layout.b1z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo106937M() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final View mo106936L() {
        return mo30920G();
    }

    public C44507l() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f114791r = C7546e.m23569a(new RecordChooseMusicSceneExpA$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo106939O() {
        super.mo106939O();
        mo91870d(m140712R(), C44511m.f114795a, new C11672v(), new C44508a(this));
        mo29062a(mo30922I(), C44512n.f114796a, C11640h.m34110a(), new C44509b(this));
        mo29062a(mo30922I(), C44513o.f114797a, C11640h.m34110a(), new C44510c(this));
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
}
