package com.p280ss.android.ugc.aweme.commercialize.playfun.p1132a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25029e;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25030f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a */
public class C25014a extends C25029e {

    /* renamed from: c */
    public Animator f65984c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a$a */
    public static final class C25015a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C25014a f65985a;

        C25015a(C25014a aVar) {
            this.f65985a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f65985a.mo65487g();
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65985a.mo65486f();
        }
    }

    /* renamed from: a */
    public void mo65461a() {
    }

    /* renamed from: b */
    public final void mo65463b() {
        Animator animator = this.f65984c;
        if (animator != null) {
            animator.pause();
        }
    }

    /* renamed from: c */
    public final void mo65464c() {
        Animator animator = this.f65984c;
        if (animator != null) {
            animator.resume();
        }
    }

    /* renamed from: d */
    public void mo65465d() {
        Animator animator = this.f65984c;
        if (animator != null) {
            animator.cancel();
        }
        mo65462a(null);
    }

    public C25014a(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65462a(Animator animator) {
        this.f65984c = animator;
        Animator animator2 = this.f65984c;
        if (animator2 != null) {
            animator2.addListener(new C25015a(this));
        }
    }
}
