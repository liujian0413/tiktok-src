package com.p280ss.android.ugc.aweme.shortvideo.widget.animation;

import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.animation.TranslateFadeInOutAnimator */
public final class TranslateFadeInOutAnimator extends BaseItemAnimator {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo102447c(C1293v vVar) {
        if (vVar != null) {
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            View view2 = vVar.itemView;
            C7573i.m23582a((Object) view2, "holder.itemView");
            view.setTranslationY(-((float) view2.getTop()));
            View view3 = vVar.itemView;
            C7573i.m23582a((Object) view3, "holder.itemView");
            view3.setAlpha(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo102449l(C1293v vVar) {
        if (vVar != null) {
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            C0998y q = C0991u.m4238q(view);
            C7573i.m23582a((Object) q, "animate(view)");
            this.f108449d.add(vVar);
            q.mo3805c(0.0f).mo3797a(1.0f).mo3798a(this.f4940i).mo3801a(this.f108453n).mo3800a((C1002z) new TranslateFadeInOutAnimator$animateAddImpl$$inlined$let$lambda$1(q, this, vVar)).mo3806c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo102448k(C1293v vVar) {
        if (vVar != null) {
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            C0998y q = C0991u.m4238q(view);
            C7573i.m23582a((Object) q, "animate(view)");
            this.f108451f.add(vVar);
            q.mo3805c(-((float) view.getTop())).mo3797a(0.0f).mo3798a(this.f4941j).mo3801a(this.f108453n).mo3800a((C1002z) new C41683x195939fd(q, this, vVar)).mo3806c();
        }
    }
}
