package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39581l;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.FixBubbleLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c.C40367a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b */
public final class C40364b implements C40366c {

    /* renamed from: a */
    public final C39581l f104933a;

    /* renamed from: b */
    private AnimatorSet f104934b;

    /* renamed from: c */
    private int f104935c;

    /* renamed from: d */
    private int f104936d;

    /* renamed from: e */
    private ObjectAnimator f104937e;

    /* renamed from: f */
    private ObjectAnimator f104938f;

    /* renamed from: g */
    private final boolean f104939g;

    /* renamed from: h */
    private final long f104940h;

    /* renamed from: i */
    private final long f104941i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b$a */
    public static final class C40365a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40364b f104942a;

        /* renamed from: b */
        final /* synthetic */ boolean f104943b;

        /* renamed from: c */
        final /* synthetic */ View f104944c;

        /* renamed from: d */
        final /* synthetic */ C40367a f104945d;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            if (!this.f104943b) {
                this.f104944c.setVisibility(8);
                this.f104942a.f104933a.dismiss();
            }
            C40367a aVar = this.f104945d;
            if (aVar != null) {
                aVar.mo98568b();
            }
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f104943b) {
                this.f104944c.setVisibility(0);
            }
            C40367a aVar = this.f104945d;
            if (aVar != null) {
                aVar.mo98567a();
            }
        }

        C40365a(C40364b bVar, boolean z, View view, C40367a aVar) {
            this.f104942a = bVar;
            this.f104943b = z;
            this.f104944c = view;
            this.f104945d = aVar;
        }
    }

    /* renamed from: b */
    private final void m129095b() {
        if (this.f104934b == null) {
            this.f104934b = new AnimatorSet();
            return;
        }
        AnimatorSet animatorSet = this.f104934b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f104934b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: a */
    public final void mo100360a() {
        AnimatorSet animatorSet = this.f104934b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f104934b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f104934b = null;
    }

    /* renamed from: a */
    private final void m129093a(View view, int i) {
        m129095b();
        m129096b(view, i);
    }

    /* renamed from: b */
    private final void m129096b(View view, int i) {
        if (view instanceof FixBubbleLayout) {
            if (i == 3) {
                FixBubbleLayout fixBubbleLayout = (FixBubbleLayout) view;
                this.f104935c = (int) (fixBubbleLayout.getX() + ((float) fixBubbleLayout.getMeasuredWidth()));
                this.f104936d = (int) (fixBubbleLayout.getY() + fixBubbleLayout.getBubbleOffset());
            } else if (i == 5) {
                FixBubbleLayout fixBubbleLayout2 = (FixBubbleLayout) view;
                this.f104935c = (int) fixBubbleLayout2.getX();
                this.f104936d = (int) (fixBubbleLayout2.getY() + fixBubbleLayout2.getBubbleOffset());
            } else if (i == 48) {
                FixBubbleLayout fixBubbleLayout3 = (FixBubbleLayout) view;
                this.f104935c = (int) (fixBubbleLayout3.getX() + fixBubbleLayout3.getBubbleOffset());
                this.f104936d = (int) (fixBubbleLayout3.getY() + ((float) fixBubbleLayout3.getMeasuredHeight()));
            } else if (i == 80) {
                FixBubbleLayout fixBubbleLayout4 = (FixBubbleLayout) view;
                this.f104935c = (int) (fixBubbleLayout4.getX() + fixBubbleLayout4.getBubbleOffset());
                this.f104936d = (int) fixBubbleLayout4.getY();
            }
            FixBubbleLayout fixBubbleLayout5 = (FixBubbleLayout) view;
            fixBubbleLayout5.setPivotY((float) this.f104936d);
            fixBubbleLayout5.setPivotX((float) this.f104935c);
        }
    }

    /* renamed from: a */
    public final void mo100361a(View view, int i, C40367a aVar) {
        C7573i.m23587b(view, "view");
        m129093a(view, i);
        m129094a(view, true, aVar);
    }

    /* renamed from: b */
    public final void mo100362b(View view, int i, C40367a aVar) {
        C7573i.m23587b(view, "view");
        m129093a(view, i);
        m129094a(view, false, aVar);
    }

    /* renamed from: a */
    private final void m129094a(View view, boolean z, C40367a aVar) {
        float f;
        float f2;
        float f3;
        long j;
        String str = "scaleX";
        float[] fArr = new float[2];
        float f4 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        this.f104937e = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        this.f104938f = ObjectAnimator.ofFloat(view, str2, fArr2);
        AnimatorSet animatorSet = this.f104934b;
        if (animatorSet != null) {
            Builder play = animatorSet.play(this.f104937e);
            if (play != null) {
                play.with(this.f104938f);
            }
        }
        AnimatorSet animatorSet2 = this.f104934b;
        if (animatorSet2 != null) {
            if (z) {
                j = this.f104940h;
            } else {
                j = this.f104941i;
            }
            animatorSet2.setDuration(j);
        }
        if (this.f104939g) {
            AnimatorSet animatorSet3 = this.f104934b;
            if (animatorSet3 != null) {
                animatorSet3.setInterpolator(new OvershootInterpolator(1.0f));
            }
        }
        AnimatorSet animatorSet4 = this.f104934b;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new C40365a(this, z, view, aVar));
        }
        AnimatorSet animatorSet5 = this.f104934b;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public C40364b(boolean z, long j, long j2, C39581l lVar) {
        C7573i.m23587b(lVar, "popupWindow");
        this.f104939g = z;
        this.f104940h = j;
        this.f104941i = j2;
        this.f104933a = lVar;
    }
}
