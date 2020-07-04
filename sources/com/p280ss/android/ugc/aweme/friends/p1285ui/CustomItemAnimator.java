package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendItemViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.CustomItemAnimator */
public class CustomItemAnimator extends DefaultItemAnimator {

    /* renamed from: n */
    private final List<C1293v> f79112n = new ArrayList();

    /* renamed from: o */
    private final List<C1293v> f79113o = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m98599f() {
        if (!mo5331b()) {
            mo5735e();
        }
    }

    /* renamed from: b */
    public final boolean mo5331b() {
        if (!this.f79112n.isEmpty() || !this.f79113o.isEmpty() || super.mo5331b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo5335d() {
        for (int size = this.f79112n.size() - 1; size >= 0; size--) {
            C1293v vVar = (C1293v) this.f79112n.get(size);
            m98597a(vVar.itemView);
            mo6005j(vVar);
            this.f79112n.remove(size);
        }
        for (int size2 = this.f79113o.size() - 1; size2 >= 0; size2--) {
            C1293v vVar2 = (C1293v) this.f79113o.get(size2);
            m98597a(vVar2.itemView);
            mo6005j(vVar2);
            this.f79113o.remove(size2);
        }
        super.mo5335d();
    }

    /* renamed from: a */
    public final void mo5324a() {
        super.mo5324a();
        if (!this.f79112n.isEmpty()) {
            for (int size = this.f79112n.size() - 1; size >= 0; size--) {
                final C1293v vVar = (C1293v) this.f79112n.get(size);
                vVar.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.f4940i).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        CustomItemAnimator.m98597a(vVar.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        CustomItemAnimator.m98597a(vVar.itemView);
                        CustomItemAnimator.this.mo6005j(vVar);
                        CustomItemAnimator.this.m98599f();
                    }
                }).setInterpolator(new LinearOutSlowInInterpolator());
                this.f79112n.remove(size);
            }
        }
        if (!this.f79113o.isEmpty()) {
            for (int size2 = this.f79113o.size() - 1; size2 >= 0; size2--) {
                final C1293v vVar2 = (C1293v) this.f79113o.get(size2);
                vVar2.itemView.animate().alpha(0.0f).translationX((float) (-vVar2.itemView.getWidth())).setDuration(this.f4941j).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        CustomItemAnimator.m98597a(vVar2.itemView);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animator.getListeners().remove(this);
                        CustomItemAnimator.m98597a(vVar2.itemView);
                        CustomItemAnimator.this.mo6003h(vVar2);
                        CustomItemAnimator.this.m98599f();
                    }
                }).setInterpolator(new LinearOutSlowInInterpolator());
                this.f79113o.remove(size2);
            }
        }
    }

    /* renamed from: a */
    public static void m98597a(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* renamed from: a */
    public final boolean mo5326a(C1293v vVar) {
        if (!(vVar instanceof RecommendFriendItemViewV2Holder) && !(vVar instanceof MultiTypeViewHolder) && !(vVar instanceof RecommendItemViewHolder)) {
            return super.mo5326a(vVar);
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        this.f79113o.add(vVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5332b(C1293v vVar) {
        if (!(vVar instanceof RecommendFriendItemViewV2Holder)) {
            return super.mo5332b(vVar);
        }
        vVar.itemView.setAlpha(0.0f);
        vVar.itemView.setTranslationY((float) vVar.itemView.getHeight());
        vVar.itemView.setScaleX(0.5f);
        vVar.itemView.setScaleY(0.5f);
        this.f79112n.add(vVar);
        return true;
    }

    /* renamed from: d */
    public final void mo5336d(C1293v vVar) {
        vVar.itemView.animate().cancel();
        if (this.f79112n.remove(vVar)) {
            mo6005j(vVar);
            m98597a(vVar.itemView);
        }
        if (this.f79113o.remove(vVar)) {
            mo6003h(vVar);
            m98597a(vVar.itemView);
        }
        super.mo5336d(vVar);
    }
}
