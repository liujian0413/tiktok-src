package com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25012a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25024b;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25024b.C25025a;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25030f;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25032g;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d */
public final class C25019d extends C25014a {

    /* renamed from: d */
    public Animator f65990d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d$a */
    static final class C25020a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25019d f65991a;

        C25020a(C25019d dVar) {
            this.f65991a = dVar;
        }

        public final void run() {
            float f;
            int i;
            float f2;
            AwemePlayFunModel awemePlayFunModel = this.f65991a.f66019b.f66022c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getStartDuration();
            } else {
                f = 0.0f;
            }
            float f3 = f * 1000.0f;
            C25025a b = new C25025a().mo65474a(f3).mo65476a(this.f65991a.mo65470a(awemePlayFunModel)).mo65479b(this.f65991a.mo65471h());
            if (awemePlayFunModel != null) {
                i = awemePlayFunModel.getAngle();
            } else {
                i = 0;
            }
            C25025a a = b.mo65475a(i);
            if (awemePlayFunModel != null) {
                f2 = awemePlayFunModel.getSize();
            } else {
                f2 = 0.0f;
            }
            C25024b a2 = a.mo65478b(f2).mo65477a();
            this.f65991a.mo65462a(C25012a.f65980a.mo65458a(this.f65991a.f66019b.f66024e, this.f65991a.f66019b.f66027h, a2));
            this.f65991a.f66019b.f66024e.setAlpha(1.0f);
            Animator animator = this.f65991a.f65984c;
            if (animator != null) {
                animator.start();
            }
            long j = ((long) f3) / 2;
            this.f65991a.f66019b.f66023d.setAlpha(0.0f);
            this.f65991a.f65990d = C25012a.m82351a(this.f65991a.f66019b.f66023d, j);
            Animator animator2 = this.f65991a.f65990d;
            if (animator2 != null) {
                animator2.setStartDelay(j);
            }
            Animator animator3 = this.f65991a.f65990d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f65991a.f66019b.mo65491a("start_expand", new Point((int) a2.f65995b, (int) a2.f65996c), null);
        }
    }

    /* renamed from: d */
    public final void mo65465d() {
        super.mo65465d();
        Animator animator = this.f65990d;
        if (animator != null) {
            animator.cancel();
        }
        this.f65990d = null;
    }

    /* renamed from: a */
    public final void mo65461a() {
        m82393a("ExpandState---handle");
        super.mo65461a();
        this.f66019b.mo65490a("egg");
        mo65485a((Runnable) new C25020a(this));
    }

    /* renamed from: h */
    public final PointF mo65471h() {
        return new PointF(this.f66019b.f66027h.f66016c, this.f66019b.f66027h.f66015b - ((float) C25032g.m82417a(this.f66019b.f66026g)));
    }

    public C25019d(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        super(fVar);
    }

    /* renamed from: a */
    public final PointF mo65470a(AwemePlayFunModel awemePlayFunModel) {
        int i;
        if (awemePlayFunModel == null) {
            return new PointF(0.0f, 0.0f);
        }
        ViewGroup i2 = this.f66019b.mo65499i();
        int i3 = 0;
        View childAt = i2.getChildAt(0);
        C7573i.m23582a((Object) childAt, "textureView");
        if (childAt.getWidth() > i2.getWidth()) {
            i = (childAt.getWidth() - i2.getWidth()) / 2;
        } else {
            i = 0;
        }
        if (childAt.getHeight() > i2.getHeight()) {
            i3 = (childAt.getHeight() - i2.getHeight()) / 2;
        }
        float f = (float) (this.f66019b.f66027h.f66014a / 2);
        return new PointF(((((float) childAt.getWidth()) * awemePlayFunModel.getPositionX()) - ((float) i)) - f, ((((float) childAt.getHeight()) * awemePlayFunModel.getPositionY()) - ((float) i3)) - f);
    }
}
