package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39581l;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c.C40367a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a */
public final class C40362a implements C40366c {

    /* renamed from: a */
    public final C39581l f104921a;

    /* renamed from: b */
    private AnimatorSet f104922b;

    /* renamed from: c */
    private ObjectAnimator f104923c;

    /* renamed from: d */
    private ObjectAnimator f104924d;

    /* renamed from: e */
    private float f104925e;

    /* renamed from: f */
    private final Context f104926f;

    /* renamed from: g */
    private final long f104927g = 200;

    /* renamed from: h */
    private final long f104928h = 200;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$a */
    public static final class C40363a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40362a f104929a;

        /* renamed from: b */
        final /* synthetic */ boolean f104930b;

        /* renamed from: c */
        final /* synthetic */ View f104931c;

        /* renamed from: d */
        final /* synthetic */ C40367a f104932d;

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f104930b) {
                this.f104931c.setVisibility(0);
            }
            C40367a aVar = this.f104932d;
            if (aVar != null) {
                aVar.mo98567a();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            if (!this.f104930b) {
                this.f104931c.setVisibility(8);
                C39581l lVar = this.f104929a.f104921a;
                if (lVar != null) {
                    lVar.dismiss();
                }
            }
            C40367a aVar = this.f104932d;
            if (aVar != null) {
                aVar.mo98568b();
            }
        }

        C40363a(C40362a aVar, boolean z, View view, C40367a aVar2) {
            this.f104929a = aVar;
            this.f104930b = z;
            this.f104931c = view;
            this.f104932d = aVar2;
        }
    }

    /* renamed from: b */
    private final void m129088b() {
        m129089c();
    }

    /* renamed from: c */
    private final void m129089c() {
        if (this.f104922b == null) {
            this.f104922b = new AnimatorSet();
            return;
        }
        AnimatorSet animatorSet = this.f104922b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f104922b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: a */
    public final void mo100360a() {
        AnimatorSet animatorSet = this.f104922b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f104922b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f104922b = null;
    }

    /* renamed from: a */
    public final void mo100361a(View view, int i, C40367a aVar) {
        C7573i.m23587b(view, "view");
        m129088b();
        m129087a(view, i, true, aVar);
    }

    /* renamed from: b */
    public final void mo100362b(View view, int i, C40367a aVar) {
        C7573i.m23587b(view, "view");
        m129088b();
        m129087a(view, i, false, aVar);
    }

    public C40362a(Context context, long j, long j2, C39581l lVar) {
        C7573i.m23587b(context, "context");
        this.f104926f = context;
        this.f104921a = lVar;
        this.f104925e = C9738o.m28708b(this.f104926f, 15.0f);
    }

    /* renamed from: a */
    private final void m129087a(View view, int i, boolean z, C40367a aVar) {
        float f;
        float f2;
        float f3;
        long j;
        String str = "alpha";
        float[] fArr = new float[2];
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f4 = 0.0f;
        }
        fArr[1] = f4;
        this.f104923c = ObjectAnimator.ofFloat(view, str, fArr);
        if (i != 80) {
            f2 = C9738o.m28708b(this.f104926f, 15.0f);
        } else {
            f2 = -C9738o.m28708b(this.f104926f, 15.0f);
        }
        this.f104925e = f2;
        String str2 = "translationY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = this.f104925e;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f5 = this.f104925e;
        }
        fArr2[1] = f5;
        this.f104924d = ObjectAnimator.ofFloat(view, str2, fArr2);
        AnimatorSet animatorSet = this.f104922b;
        if (animatorSet != null) {
            Builder play = animatorSet.play(this.f104923c);
            if (play != null) {
                play.with(this.f104924d);
            }
        }
        AnimatorSet animatorSet2 = this.f104922b;
        if (animatorSet2 != null) {
            if (z) {
                j = this.f104927g;
            } else {
                j = this.f104928h;
            }
            animatorSet2.setDuration(j);
        }
        AnimatorSet animatorSet3 = this.f104922b;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new C40363a(this, z, view, aVar));
        }
        AnimatorSet animatorSet4 = this.f104922b;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }
}
