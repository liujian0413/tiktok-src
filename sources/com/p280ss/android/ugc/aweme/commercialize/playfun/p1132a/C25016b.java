package com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a;

import android.animation.Animator;
import android.graphics.PointF;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25012a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25024b.C25025a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25030f;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b */
public final class C25016b extends C25014a {

    /* renamed from: d */
    private Animator f65986d;

    /* renamed from: e */
    private Animator f65987e;

    /* renamed from: d */
    public final void mo65465d() {
        super.mo65465d();
        Animator animator = this.f65986d;
        if (animator != null) {
            animator.cancel();
        }
        this.f65986d = null;
        Animator animator2 = this.f65987e;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f65987e = null;
    }

    /* renamed from: a */
    public final void mo65461a() {
        float f;
        m82393a("CollapseState---handle");
        super.mo65461a();
        AwemePlayFunModel awemePlayFunModel = this.f66019b.f66022c;
        if (awemePlayFunModel != null) {
            f = awemePlayFunModel.getEndDuration();
        } else {
            f = 0.0f;
        }
        float f2 = f * 1000.0f;
        PointF g = this.f66019b.mo65497g();
        mo65462a(C25012a.f65980a.mo65459b(this.f66019b.f66024e, this.f66019b.f66027h, new C25025a().mo65474a(f2).mo65476a(new PointF(this.f66019b.f66024e.getTranslationX(), this.f66019b.f66024e.getTranslationY())).mo65479b(new PointF(g.x, g.y)).mo65477a()));
        Animator animator = this.f65984c;
        if (animator != null) {
            animator.start();
        }
        this.f65986d = C25012a.m82354b(this.f66019b.f66023d, ((long) f2) / 2);
        Animator animator2 = this.f65986d;
        if (animator2 != null) {
            animator2.start();
        }
        this.f65987e = C25012a.m82349a(this.f66019b.f66025f);
        Animator animator3 = this.f65987e;
        if (animator3 != null) {
            animator3.start();
        }
    }

    public C25016b(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        super(fVar);
    }
}
