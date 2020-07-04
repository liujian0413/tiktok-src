package com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a;

import android.animation.Animator;
import android.graphics.Point;
import android.view.View;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25012a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25030f;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c */
public final class C25017c extends C25014a {

    /* renamed from: d */
    public Animator f65988d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c$a */
    static final class C25018a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25017c f65989a;

        C25018a(C25017c cVar) {
            this.f65989a = cVar;
        }

        public final void run() {
            float f;
            AwemePlayFunModel awemePlayFunModel = this.f65989a.f66019b.f66022c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getShowDuration();
            } else {
                f = 0.0f;
            }
            this.f65989a.mo65462a(C25012a.m82348a(f * 1000.0f));
            Animator animator = this.f65989a.f65984c;
            if (animator != null) {
                animator.start();
            }
            View view = this.f65989a.f66019b.f66025f;
            View view2 = this.f65989a.f66019b.f66024e;
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            StringBuilder sb = new StringBuilder("eggTitleViewWidth: ");
            sb.append(measuredWidth);
            C25017c.m82393a(sb.toString());
            view.setTranslationX((view2.getTranslationX() + (((float) view2.getWidth()) / 2.0f)) - (((float) measuredWidth) / 2.0f));
            float translationY = view2.getTranslationY() + ((float) this.f65989a.f66019b.f66027h.f66014a);
            this.f65989a.f65988d = C25012a.m82350a(view, translationY);
            Animator animator2 = this.f65989a.f65988d;
            if (animator2 != null) {
                animator2.start();
            }
            this.f65989a.f66019b.mo65491a("show_in_center", new Point((int) view2.getTranslationX(), (int) view2.getTranslationY()), new Point((int) view.getTranslationX(), (int) translationY));
        }
    }

    /* renamed from: e */
    public final boolean mo65468e() {
        return true;
    }

    /* renamed from: d */
    public final void mo65465d() {
        super.mo65465d();
        Animator animator = this.f65988d;
        if (animator != null) {
            animator.cancel();
        }
        this.f65988d = null;
    }

    /* renamed from: a */
    public final void mo65461a() {
        m82393a("EggShowState---handle");
        super.mo65461a();
        mo65485a((Runnable) new C25018a(this));
    }

    public C25017c(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        super(fVar);
    }
}
