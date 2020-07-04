package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.AutoFillFeedRecommendUserItemAnimator */
public final class AutoFillFeedRecommendUserItemAnimator extends DefaultItemAnimator {

    /* renamed from: n */
    public static final C37139a f97180n = new C37139a(null);

    /* renamed from: o */
    private final List<C1293v> f97181o = new ArrayList();

    /* renamed from: p */
    private final List<C1293v> f97182p = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.AutoFillFeedRecommendUserItemAnimator$a */
    public static final class C37139a {
        private C37139a() {
        }

        public /* synthetic */ C37139a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.AutoFillFeedRecommendUserItemAnimator$b */
    public static final class C37140b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AutoFillFeedRecommendUserItemAnimator f97183a;

        /* renamed from: b */
        final /* synthetic */ C1293v f97184b;

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animation");
            View view = this.f97184b.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            AutoFillFeedRecommendUserItemAnimator.m119387a(view);
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            animator.getListeners().remove(this);
            View view = this.f97184b.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            AutoFillFeedRecommendUserItemAnimator.m119387a(view);
            this.f97183a.mo6005j(this.f97184b);
            this.f97183a.m119389f();
        }

        C37140b(AutoFillFeedRecommendUserItemAnimator autoFillFeedRecommendUserItemAnimator, C1293v vVar) {
            this.f97183a = autoFillFeedRecommendUserItemAnimator;
            this.f97184b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.AutoFillFeedRecommendUserItemAnimator$c */
    public static final class C37141c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AutoFillFeedRecommendUserItemAnimator f97185a;

        /* renamed from: b */
        final /* synthetic */ C1293v f97186b;

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
        }

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animation");
            View view = this.f97186b.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            AutoFillFeedRecommendUserItemAnimator.m119387a(view);
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            animator.getListeners().remove(this);
            View view = this.f97186b.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            AutoFillFeedRecommendUserItemAnimator.m119387a(view);
            this.f97185a.mo6003h(this.f97186b);
            this.f97185a.m119389f();
        }

        C37141c(AutoFillFeedRecommendUserItemAnimator autoFillFeedRecommendUserItemAnimator, C1293v vVar) {
            this.f97185a = autoFillFeedRecommendUserItemAnimator;
            this.f97186b = vVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m119389f() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public final boolean mo5331b() {
        if ((!this.f97181o.isEmpty()) || (!this.f97182p.isEmpty()) || super.mo5331b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo5335d() {
        for (int size = this.f97181o.size() - 1; size >= 0; size--) {
            C1293v vVar = (C1293v) this.f97181o.get(size);
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            m119387a(view);
            mo6005j(vVar);
            this.f97181o.remove(size);
        }
        for (int size2 = this.f97182p.size() - 1; size2 >= 0; size2--) {
            C1293v vVar2 = (C1293v) this.f97181o.get(size2);
            View view2 = vVar2.itemView;
            C7573i.m23582a((Object) view2, "holder.itemView");
            m119387a(view2);
            mo6005j(vVar2);
            this.f97181o.remove(size2);
        }
        super.mo5335d();
    }

    /* renamed from: a */
    public final void mo5324a() {
        super.mo5324a();
        for (int size = this.f97181o.size() - 1; size >= 0; size--) {
            C1293v vVar = (C1293v) this.f97181o.get(size);
            vVar.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(200).setDuration(this.f4940i).setListener(new C37140b(this, vVar)).setInterpolator(new LinearOutSlowInInterpolator());
            this.f97181o.remove(size);
        }
        for (int size2 = this.f97182p.size() - 1; size2 >= 0; size2--) {
            C1293v vVar2 = (C1293v) this.f97182p.get(size2);
            vVar2.itemView.animate().alpha(0.0f).setDuration(this.f4941j).setListener(new C37141c(this, vVar2)).setInterpolator(new LinearOutSlowInInterpolator());
            this.f97182p.remove(size2);
        }
    }

    /* renamed from: a */
    public static void m119387a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        View view = vVar.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        view.setAlpha(1.0f);
        this.f97182p.add(vVar);
        return true;
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        vVar.itemView.animate().cancel();
        if (this.f97181o.remove(vVar)) {
            mo6005j(vVar);
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            m119387a(view);
        }
        if (this.f97182p.remove(vVar)) {
            mo6003h(vVar);
            View view2 = vVar.itemView;
            C7573i.m23582a((Object) view2, "holder.itemView");
            m119387a(view2);
        }
        super.mo5336d(vVar);
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        View view = vVar.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        view.setAlpha(0.0f);
        View view2 = vVar.itemView;
        C7573i.m23582a((Object) view2, "holder.itemView");
        view2.setScaleX(0.5f);
        View view3 = vVar.itemView;
        C7573i.m23582a((Object) view3, "holder.itemView");
        view3.setScaleY(0.5f);
        this.f97181o.add(vVar);
        return true;
    }
}
