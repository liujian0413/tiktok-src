package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28967f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28970i;
import com.p280ss.android.ugc.aweme.shortvideo.C38457aq;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a */
public final class C28935a extends C28955l {

    /* renamed from: d */
    public static final C28936a f76274d = new C28936a(null);

    /* renamed from: i */
    private static final int f76275i = ((int) C20505c.m68010a(C6399b.m19921a(), 8.0f));

    /* renamed from: j */
    private static final C38457aq f76276j = new C38457aq(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a */
    public ViewGroup f76277a;

    /* renamed from: b */
    public ViewGroup f76278b;

    /* renamed from: c */
    public final C28933a f76279c;

    /* renamed from: g */
    private C28970i f76280g;

    /* renamed from: h */
    private AnimatorSet f76281h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$a */
    public static final class C28936a {
        private C28936a() {
        }

        public /* synthetic */ C28936a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$b */
    static final class C28937b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28935a f76282a;

        C28937b(C28935a aVar) {
            this.f76282a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f76282a.f76277a;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue > 0.0f) {
                    ViewGroup viewGroup2 = this.f76282a.f76277a;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$c */
    static final class C28938c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28935a f76283a;

        C28938c(C28935a aVar) {
            this.f76283a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f76283a.f76278b;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue <= 0.0f) {
                    ViewGroup viewGroup2 = this.f76283a.f76278b;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(4);
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$d */
    static final class C28939d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28935a f76284a;

        C28939d(C28935a aVar) {
            this.f76284a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76284a.f76277a;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$e */
    static final class C28940e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28935a f76285a;

        C28940e(C28935a aVar) {
            this.f76285a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76285a.f76278b;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$f */
    static final class C28941f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C28935a f76286a;

        C28941f(C28935a aVar) {
            this.f76286a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f76286a.f76278b;
                if (viewGroup != null) {
                    LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                    }
                }
                ViewGroup viewGroup2 = this.f76286a.f76278b;
                if (viewGroup2 != null) {
                    viewGroup2.requestLayout();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m95164a() {
        C6907h.m21524a("block_videos_click_back", (Map) C22984d.m75611a().mo59973a("click_method", "button").mo59973a("enter_from", this.f76279c.f76272c).mo59973a("enter_method", "long_press").f60753a);
    }

    /* renamed from: b */
    private final void m95165b() {
        AnimatorSet animatorSet = this.f76281h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "ValueAnimator.ofFloat(0f, 1f)");
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C28937b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat2, "ValueAnimator.ofFloat(1f, 0f)");
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new C28938c(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{f76275i, 0});
        C7573i.m23582a((Object) ofInt, "ValueAnimator.ofInt(XOFFSET, 0)");
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C28939d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, -f76275i});
        C7573i.m23582a((Object) ofInt2, "ValueAnimator.ofInt(0, -XOFFSET)");
        ofInt2.setDuration(300);
        ofInt2.addUpdateListener(new C28940e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f76278b;
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        iArr[0] = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f76277a;
        if (viewGroup2 == null) {
            C7573i.m23580a();
        }
        iArr[1] = viewGroup2.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        C7573i.m23582a((Object) ofInt3, "ValueAnimator.ofInt(mSec…onsView!!.measuredHeight)");
        ofInt3.setDuration(300);
        ofInt3.addUpdateListener(new C28941f(this));
        this.f76281h = new AnimatorSet();
        AnimatorSet animatorSet2 = this.f76281h;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(f76276j);
            animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt, ofInt2, ofInt3});
            animatorSet2.start();
        }
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
        m95165b();
        m95164a();
    }

    /* renamed from: b */
    public final void mo74232b(View view) {
        C7573i.m23587b(view, "v");
        mo74231a(view);
    }

    public C28935a(C28933a aVar) {
        ViewGroup viewGroup;
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
        this.f76279c = aVar;
        C28967f fVar = this.f76279c.f76270a;
        if (fVar != null) {
            this.f76280g = (C28970i) fVar;
            C28970i iVar = this.f76280g;
            ViewGroup viewGroup2 = null;
            if (iVar != null) {
                viewGroup = iVar.mo71376b();
            } else {
                viewGroup = null;
            }
            this.f76277a = viewGroup;
            C28970i iVar2 = this.f76280g;
            if (iVar2 != null) {
                viewGroup2 = iVar2.mo71375a();
            }
            this.f76278b = viewGroup2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsDialog");
    }
}
