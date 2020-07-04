package com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25012a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25029e;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25030f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.g */
public final class C25023g extends C25029e {

    /* renamed from: c */
    private Animator f65992c;

    /* renamed from: d */
    private Animator f65993d;

    /* renamed from: e */
    public final boolean mo65468e() {
        return true;
    }

    /* renamed from: d */
    public final void mo65465d() {
        super.mo65465d();
        Animator animator = this.f65992c;
        if (animator != null) {
            animator.cancel();
        }
        this.f65992c = null;
        Animator animator2 = this.f65993d;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f65993d = null;
    }

    /* renamed from: h */
    public final void mo65473h() {
        this.f65992c = C25012a.m82353b(this.f66019b.f66024e, this.f66019b.mo65497g().y);
        Animator animator = this.f65992c;
        if (animator != null) {
            animator.start();
        }
    }

    /* renamed from: i */
    private final void m82373i() {
        PointF g = this.f66019b.mo65497g();
        if (this.f66019b.f66024e.getTranslationY() != g.y) {
            this.f65993d = C25012a.m82353b(this.f66019b.f66024e, g.y);
            Animator animator = this.f65993d;
            if (animator != null) {
                animator.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo65461a() {
        m82393a("WidgetShowState---handle");
        this.f66019b.mo65490a("hanging");
        this.f66019b.f66025f.setVisibility(8);
        m82373i();
        this.f66019b.mo65491a("become_widget", new Point((int) this.f66019b.f66024e.getTranslationX(), (int) this.f66019b.f66024e.getTranslationY()), null);
    }

    public C25023g(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        super(fVar);
    }
}
