package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39169g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b */
public final class C39224b {

    /* renamed from: n */
    public static final C39225a f101678n = new C39225a(null);

    /* renamed from: a */
    public View f101679a;

    /* renamed from: b */
    public View f101680b;

    /* renamed from: c */
    public FrameLayout f101681c;

    /* renamed from: d */
    public FrameLayout f101682d;

    /* renamed from: e */
    public View f101683e;

    /* renamed from: f */
    public View f101684f;

    /* renamed from: g */
    public View f101685g;

    /* renamed from: h */
    public View f101686h;

    /* renamed from: i */
    public View f101687i;

    /* renamed from: j */
    public AbstractVideoEditView f101688j;

    /* renamed from: k */
    public View f101689k;

    /* renamed from: l */
    public View f101690l;

    /* renamed from: m */
    public C39169g f101691m;

    /* renamed from: o */
    private ObjectAnimator f101692o;

    /* renamed from: p */
    private final Context f101693p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$a */
    public static final class C39225a {
        private C39225a() {
        }

        public /* synthetic */ C39225a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$b */
    public interface C39226b {
        /* renamed from: a */
        void mo97404a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$c */
    public static final class C39227c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C39224b f101694a;

        /* renamed from: b */
        final /* synthetic */ boolean f101695b;

        /* renamed from: c */
        final /* synthetic */ float f101696c;

        /* renamed from: d */
        final /* synthetic */ float f101697d;

        /* renamed from: e */
        final /* synthetic */ LayoutParams f101698e;

        /* renamed from: f */
        final /* synthetic */ LayoutParams f101699f;

        /* renamed from: g */
        final /* synthetic */ float f101700g;

        /* renamed from: h */
        final /* synthetic */ C39226b f101701h;

        public final void onAnimationRepeat(Animator animator) {
            C7573i.m23587b(animator, "animator");
        }

        public final void onAnimationCancel(Animator animator) {
            C7573i.m23587b(animator, "animator");
            onAnimationEnd(animator);
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animator");
            View view = this.f101694a.f101684f;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f101694a.f101686h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.f101694a.f101689k;
            if (view3 != null) {
                view3.setVisibility(0);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            float f;
            C7573i.m23587b(animator, "animator");
            if (this.f101695b) {
                View view = this.f101694a.f101689k;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (C39182e.m125105i()) {
                    f = this.f101696c - this.f101697d;
                } else {
                    f = this.f101696c;
                    this.f101698e.bottomMargin = this.f101699f.bottomMargin;
                    FrameLayout frameLayout = this.f101694a.f101681c;
                    if (frameLayout == null) {
                        C7573i.m23580a();
                    }
                    frameLayout.setLayoutParams(this.f101698e);
                }
            } else {
                View view2 = this.f101694a.f101684f;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f101694a.f101686h;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view4 = this.f101694a.f101683e;
                if (view4 != null) {
                    view4.setTranslationY(0.0f);
                }
                f = this.f101696c;
                if (!C39182e.m125105i()) {
                    this.f101698e.bottomMargin = this.f101699f.bottomMargin;
                    FrameLayout frameLayout2 = this.f101694a.f101681c;
                    if (frameLayout2 == null) {
                        C7573i.m23580a();
                    }
                    frameLayout2.setLayoutParams(this.f101698e);
                } else {
                    f = this.f101696c + this.f101697d;
                }
            }
            this.f101694a.mo97556a(this.f101700g, this.f101696c, f);
            C39226b bVar = this.f101701h;
            if (bVar != null) {
                bVar.mo97404a();
            }
        }

        C39227c(C39224b bVar, boolean z, float f, float f2, LayoutParams layoutParams, LayoutParams layoutParams2, float f3, C39226b bVar2) {
            this.f101694a = bVar;
            this.f101695b = z;
            this.f101696c = f;
            this.f101697d = f2;
            this.f101698e = layoutParams;
            this.f101699f = layoutParams2;
            this.f101700g = f3;
            this.f101701h = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$d */
    static final class C39228d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39224b f101702a;

        /* renamed from: b */
        final /* synthetic */ boolean f101703b;

        /* renamed from: c */
        final /* synthetic */ float f101704c;

        /* renamed from: d */
        final /* synthetic */ LayoutParams f101705d;

        /* renamed from: e */
        final /* synthetic */ int f101706e;

        /* renamed from: f */
        final /* synthetic */ float f101707f;

        /* renamed from: g */
        final /* synthetic */ float f101708g;

        C39228d(C39224b bVar, boolean z, float f, LayoutParams layoutParams, int i, float f2, float f3) {
            this.f101702a = bVar;
            this.f101703b = z;
            this.f101704c = f;
            this.f101705d = layoutParams;
            this.f101706e = i;
            this.f101707f = f2;
            this.f101708g = f3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f101703b) {
                    float f = 1.0f - (floatValue / this.f101704c);
                    View view = this.f101702a.f101684f;
                    if (view != null) {
                        view.setAlpha(f);
                    }
                    View view2 = this.f101702a.f101686h;
                    if (view2 != null) {
                        view2.setAlpha(f);
                    }
                    View view3 = this.f101702a.f101689k;
                    if (view3 != null) {
                        view3.setAlpha(1.0f - f);
                    }
                    this.f101705d.bottomMargin = this.f101706e + ((int) (this.f101704c - floatValue));
                    FrameLayout frameLayout = this.f101702a.f101682d;
                    if (frameLayout != null) {
                        frameLayout.setLayoutParams(this.f101705d);
                    }
                } else {
                    float f2 = floatValue / this.f101704c;
                    View view4 = this.f101702a.f101684f;
                    if (view4 != null) {
                        view4.setAlpha(1.0f - f2);
                    }
                    View view5 = this.f101702a.f101686h;
                    if (view5 != null) {
                        view5.setAlpha(1.0f - f2);
                    }
                    View view6 = this.f101702a.f101689k;
                    if (view6 != null) {
                        view6.setAlpha(f2);
                    }
                    this.f101705d.bottomMargin = this.f101706e - ((int) floatValue);
                    FrameLayout frameLayout2 = this.f101702a.f101682d;
                    if (frameLayout2 != null) {
                        frameLayout2.setLayoutParams(this.f101705d);
                    }
                }
                this.f101702a.mo97556a(this.f101708g, this.f101707f, this.f101707f - ((float) ((int) (this.f101704c - floatValue))));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$e */
    static final class C39229e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39224b f101709a;

        /* renamed from: b */
        final /* synthetic */ boolean f101710b;

        /* renamed from: c */
        final /* synthetic */ float f101711c;

        C39229e(C39224b bVar, boolean z, float f) {
            this.f101709a = bVar;
            this.f101710b = z;
            this.f101711c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (this.f101710b) {
                    View view = this.f101709a.f101685g;
                    if (view != null) {
                        view.setAlpha(floatValue);
                    }
                    View view2 = this.f101709a.f101685g;
                    if (view2 != null) {
                        view2.setTranslationY(this.f101711c * (1.0f - floatValue));
                    }
                    return;
                }
                View view3 = this.f101709a.f101685g;
                if (view3 != null) {
                    view3.setAlpha(1.0f - floatValue);
                }
                View view4 = this.f101709a.f101685g;
                if (view4 != null) {
                    view4.setTranslationY(this.f101711c * floatValue);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$f */
    public static final class C39230f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39224b f101712a;

        C39230f(C39224b bVar) {
            this.f101712a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f101712a.f101685g;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f101712a.f101685g;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$g */
    static final class C39231g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39224b f101713a;

        C39231g(C39224b bVar) {
            this.f101713a = bVar;
        }

        public final void run() {
            FrameLayout frameLayout = this.f101713a.f101681c;
            if (frameLayout == null) {
                C7573i.m23580a();
            }
            float width = (float) frameLayout.getWidth();
            FrameLayout frameLayout2 = this.f101713a.f101681c;
            if (frameLayout2 == null) {
                C7573i.m23580a();
            }
            float height = (float) frameLayout2.getHeight();
            FrameLayout frameLayout3 = this.f101713a.f101682d;
            if (frameLayout3 == null) {
                C7573i.m23580a();
            }
            this.f101713a.mo97556a(width, height, (float) frameLayout3.getHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$h */
    public static final class C39232h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39224b f101714a;

        /* renamed from: b */
        final /* synthetic */ boolean f101715b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            if (this.f101715b) {
                View view = this.f101714a.f101680b;
                if (view != null) {
                    view.setVisibility(0);
                }
                return;
            }
            View view2 = this.f101714a.f101680b;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }

        C39232h(C39224b bVar, boolean z) {
            this.f101714a = bVar;
            this.f101715b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$i */
    static final class C39233i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39224b f101716a;

        /* renamed from: b */
        final /* synthetic */ int f101717b;

        /* renamed from: c */
        final /* synthetic */ float f101718c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout.LayoutParams f101719d;

        /* renamed from: e */
        final /* synthetic */ boolean f101720e;

        C39233i(C39224b bVar, int i, float f, LinearLayout.LayoutParams layoutParams, boolean z) {
            this.f101716a = bVar;
            this.f101717b = i;
            this.f101718c = f;
            this.f101719d = layoutParams;
            this.f101720e = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "valueAnimator1");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = (floatValue - ((float) this.f101717b)) / (this.f101718c - ((float) this.f101717b));
                this.f101719d.height = (int) floatValue;
                View view = this.f101716a.f101679a;
                if (view != null) {
                    view.setLayoutParams(this.f101719d);
                }
                if (this.f101720e) {
                    View view2 = this.f101716a.f101686h;
                    if (view2 != null) {
                        view2.setAlpha(f);
                    }
                    View view3 = this.f101716a.f101687i;
                    if (view3 != null) {
                        view3.setAlpha(f);
                    }
                    return;
                }
                View view4 = this.f101716a.f101686h;
                if (view4 != null) {
                    view4.setAlpha(1.0f - f);
                }
                View view5 = this.f101716a.f101687i;
                if (view5 != null) {
                    view5.setAlpha(1.0f - f);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.b$j */
    public static final class C39234j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C39224b f101721a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout.LayoutParams f101722b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            View view = this.f101721a.f101686h;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f101721a.f101687i;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            this.f101722b.height = -2;
            View view3 = this.f101721a.f101679a;
            if (view3 != null) {
                view3.setLayoutParams(this.f101722b);
            }
        }

        C39234j(C39224b bVar, LinearLayout.LayoutParams layoutParams) {
            this.f101721a = bVar;
            this.f101722b = layoutParams;
        }
    }

    /* renamed from: a */
    public final void mo97555a() {
        FrameLayout frameLayout = this.f101682d;
        if (frameLayout != null) {
            frameLayout.post(new C39231g(this));
        }
    }

    /* renamed from: b */
    public final void mo97561b() {
        AbstractVideoEditView abstractVideoEditView = this.f101688j;
        if (abstractVideoEditView != null) {
            abstractVideoEditView.mo97603e();
        }
    }

    public C39224b(Context context) {
        C7573i.m23587b(context, "context");
        this.f101693p = context;
    }

    /* renamed from: a */
    public final void mo97559a(boolean z) {
        int i;
        View view = this.f101685g;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.f101685g;
        if (view2 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo97563b(boolean z) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f101680b, "alpha", new float[]{f, f2});
        C7573i.m23582a((Object) ofFloat, "objectAnimator");
        ofFloat.setDuration(200);
        ofFloat.addListener(new C39232h(this, z));
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo97564c(boolean z) {
        View view = this.f101685g;
        if (view != null) {
            view.setVisibility(0);
        }
        float b = C9738o.m28708b(this.f101693p, 16.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C39229e(this, z, b));
        if (!z) {
            ofFloat.addListener(new C39230f(this));
        }
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: a */
    public final void mo97557a(View view) {
        View view2;
        View view3;
        View view4;
        View view5;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View view6;
        View view7;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            view2 = view.findViewById(R.id.c55);
        } else {
            view2 = null;
        }
        this.f101684f = view2;
        if (view != null) {
            view3 = view.findViewById(R.id.o5);
        } else {
            view3 = null;
        }
        this.f101685g = view3;
        if (view != null) {
            view4 = view.findViewById(R.id.dn1);
        } else {
            view4 = null;
        }
        this.f101686h = view4;
        if (view != null) {
            view5 = view.findViewById(R.id.d7p);
        } else {
            view5 = null;
        }
        this.f101687i = view5;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.ead);
        } else {
            frameLayout = null;
        }
        this.f101682d = frameLayout;
        if (view != null) {
            frameLayout2 = (FrameLayout) view.findViewById(R.id.eat);
        } else {
            frameLayout2 = null;
        }
        this.f101681c = frameLayout2;
        if (view != null) {
            view6 = view.findViewById(R.id.acb);
        } else {
            view6 = null;
        }
        this.f101679a = view6;
        if (view != null) {
            view7 = view.findViewById(R.id.dkg);
        } else {
            view7 = null;
        }
        this.f101680b = view7;
        if (C39805en.m127445a()) {
            FrameLayout frameLayout3 = this.f101682d;
            if (frameLayout3 != null) {
                layoutParams = frameLayout3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                LayoutParams layoutParams3 = (LayoutParams) layoutParams;
                layoutParams3.topMargin += C39805en.m127450c(this.f101693p);
                FrameLayout frameLayout4 = this.f101682d;
                if (frameLayout4 != null) {
                    frameLayout4.setLayoutParams(layoutParams3);
                }
                FrameLayout frameLayout5 = this.f101681c;
                if (frameLayout5 != null) {
                    layoutParams2 = frameLayout5.getLayoutParams();
                }
                if (layoutParams2 != null) {
                    LayoutParams layoutParams4 = (LayoutParams) layoutParams2;
                    layoutParams4.topMargin += C39805en.m127450c(this.f101693p);
                    FrameLayout frameLayout6 = this.f101681c;
                    if (frameLayout6 != null) {
                        frameLayout6.setLayoutParams(layoutParams4);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* renamed from: d */
    private final void m125231d(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        float f;
        View view = this.f101679a;
        Integer num = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View view2 = this.f101679a;
            if (view2 != null) {
                num = Integer.valueOf(view2.getHeight());
            }
            if (num == null) {
                C7573i.m23580a();
            }
            int intValue = num.intValue();
            if (z) {
                View view3 = this.f101686h;
                if (view3 != null) {
                    view3.setAlpha(0.0f);
                }
                View view4 = this.f101687i;
                if (view4 != null) {
                    view4.setAlpha(0.0f);
                }
                View view5 = this.f101686h;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                View view6 = this.f101687i;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
                f = this.f101693p.getResources().getDimension(R.dimen.kg);
            } else {
                f = this.f101693p.getResources().getDimension(R.dimen.mm);
            }
            float f2 = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) intValue, f2});
            C7573i.m23582a((Object) ofFloat, "ValueAnimator.ofFloat(in….toFloat(), targetHeight)");
            ofFloat.setDuration(200);
            C39233i iVar = new C39233i(this, intValue, f2, layoutParams2, z);
            ofFloat.addUpdateListener(iVar);
            if (!z) {
                ofFloat.addListener(new C39234j(this, layoutParams2));
            }
            ofFloat.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    private final void m125228a(View view, C39226b bVar) {
        m125230d(view, true, bVar);
    }

    /* renamed from: a */
    public final void mo97560a(boolean z, boolean z2) {
        int i;
        if (z) {
            m125231d(z2);
            return;
        }
        View view = this.f101687i;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f101684f;
        if (view2 != null) {
            if (z2) {
                i = 4;
            } else {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: c */
    private final void m125229c(View view, boolean z, C39226b bVar) {
        if (z) {
            m125230d(view, false, bVar);
            return;
        }
        View view2 = this.f101684f;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f101686h;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        this.f101689k = view;
        View view4 = this.f101689k;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        if (bVar != null) {
            bVar.mo97404a();
        }
    }

    /* renamed from: a */
    public final void mo97556a(float f, float f2, float f3) {
        Integer num;
        float[] fArr;
        C39169g gVar = this.f101691m;
        if (gVar != null) {
            VESize b = gVar.mo97294b();
            if (b != null) {
                int i = b.f116386b;
                int i2 = b.f116385a;
                C39169g gVar2 = this.f101691m;
                if (gVar2 != null) {
                    num = Integer.valueOf(gVar2.mo97292a());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                int intValue = num.intValue();
                if (i2 == 0 || i == 0) {
                    fArr = new float[]{1.0f, 1.0f};
                } else {
                    fArr = intValue % NormalGiftView.ALPHA_180 == 90 ? new float[]{f / ((float) i), f3 / ((float) i2)} : new float[]{f / ((float) i2), f3 / ((float) i)};
                }
                float min = Math.min(fArr[0], fArr[1]);
                float f4 = (f2 / 2.0f) - (f3 / 2.0f);
                C39169g gVar3 = this.f101691m;
                if (gVar3 != null) {
                    gVar3.mo97293a(min, min, (float) intValue, 0, (int) f4);
                }
            }
        }
    }

    /* renamed from: d */
    private final void m125230d(View view, boolean z, C39226b bVar) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Float f;
        ObjectAnimator objectAnimator = this.f101692o;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f101692o;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        this.f101689k = view;
        FrameLayout frameLayout = this.f101682d;
        Float f2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams;
            FrameLayout frameLayout2 = this.f101681c;
            if (frameLayout2 != null) {
                layoutParams2 = frameLayout2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null) {
                LayoutParams layoutParams4 = (LayoutParams) layoutParams2;
                int i = layoutParams3.bottomMargin;
                FrameLayout frameLayout3 = this.f101682d;
                if (frameLayout3 != null) {
                    f = Float.valueOf((float) frameLayout3.getWidth());
                } else {
                    f = null;
                }
                if (f == null) {
                    C7573i.m23580a();
                }
                float floatValue = f.floatValue();
                FrameLayout frameLayout4 = this.f101682d;
                if (frameLayout4 != null) {
                    f2 = Float.valueOf((float) frameLayout4.getHeight());
                }
                if (f2 == null) {
                    C7573i.m23580a();
                }
                float floatValue2 = f2.floatValue();
                float dimension = this.f101693p.getResources().getDimension(R.dimen.kg) - this.f101693p.getResources().getDimension(R.dimen.mm);
                if (z) {
                    this.f101692o = ObjectAnimator.ofFloat(this.f101683e, "translationY", new float[]{dimension, 0.0f});
                } else {
                    this.f101692o = ObjectAnimator.ofFloat(this.f101683e, "translationY", new float[]{0.0f, dimension});
                }
                ObjectAnimator objectAnimator3 = this.f101692o;
                if (objectAnimator3 != null) {
                    objectAnimator3.setDuration(200);
                }
                ObjectAnimator objectAnimator4 = this.f101692o;
                if (objectAnimator4 != null) {
                    ObjectAnimator objectAnimator5 = objectAnimator4;
                    C39227c cVar = new C39227c(this, z, floatValue2, dimension, layoutParams4, layoutParams3, floatValue, bVar);
                    objectAnimator5.addListener(cVar);
                }
                ObjectAnimator objectAnimator6 = this.f101692o;
                if (objectAnimator6 != null) {
                    C39228d dVar = new C39228d(this, z, dimension, layoutParams3, i, floatValue2, floatValue);
                    objectAnimator6.addUpdateListener(dVar);
                }
                ObjectAnimator objectAnimator7 = this.f101692o;
                if (objectAnimator7 != null) {
                    objectAnimator7.start();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: b */
    public final void mo97562b(View view, boolean z, C39226b bVar) {
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        ViewGroup.LayoutParams layoutParams2;
        AbstractVideoEditView abstractVideoEditView = this.f101688j;
        if (abstractVideoEditView != null) {
            abstractVideoEditView.mo97600a(false);
        }
        Integer num2 = null;
        m125228a(view, (C39226b) null);
        if (z) {
            View view2 = this.f101690l;
            if (view2 != null) {
                view2.measure(C39805en.m127447b(this.f101693p), C39805en.m127443a(this.f101693p));
            }
            FrameLayout frameLayout = this.f101682d;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                LayoutParams layoutParams3 = (LayoutParams) layoutParams;
                int i = layoutParams3.bottomMargin;
                View view3 = this.f101690l;
                if (view3 != null) {
                    num = Integer.valueOf(view3.getMeasuredHeight());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                layoutParams3.bottomMargin = i + num.intValue();
                FrameLayout frameLayout2 = this.f101682d;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams3);
                }
                FrameLayout frameLayout3 = this.f101681c;
                if (frameLayout3 != null) {
                    layoutParams2 = frameLayout3.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    LayoutParams layoutParams4 = (LayoutParams) layoutParams2;
                    int i2 = layoutParams4.bottomMargin;
                    View view4 = this.f101690l;
                    if (view4 != null) {
                        num2 = Integer.valueOf(view4.getMeasuredHeight());
                    }
                    if (num2 == null) {
                        C7573i.m23580a();
                    }
                    layoutParams4.bottomMargin = i2 + num2.intValue();
                    FrameLayout frameLayout4 = this.f101681c;
                    if (frameLayout4 != null) {
                        frameLayout4.setLayoutParams(layoutParams4);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        AbstractVideoEditView abstractVideoEditView2 = this.f101688j;
        if (abstractVideoEditView2 != null) {
            abstractVideoEditView2.mo97602d();
        }
    }

    /* renamed from: a */
    public final void mo97558a(View view, boolean z, C39226b bVar) {
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        ViewGroup.LayoutParams layoutParams2;
        AbstractVideoEditView abstractVideoEditView = this.f101688j;
        if (abstractVideoEditView != null) {
            abstractVideoEditView.mo97600a(true);
        }
        mo97559a(false);
        m125229c(view, !z, bVar);
        if (z) {
            View view2 = this.f101690l;
            if (view2 != null) {
                view2.measure(C39805en.m127447b(this.f101693p), C39805en.m127443a(this.f101693p));
            }
            FrameLayout frameLayout = this.f101682d;
            Integer num2 = null;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                LayoutParams layoutParams3 = (LayoutParams) layoutParams;
                int i = layoutParams3.bottomMargin;
                View view3 = this.f101690l;
                if (view3 != null) {
                    num = Integer.valueOf(view3.getMeasuredHeight());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                layoutParams3.bottomMargin = i + num.intValue();
                FrameLayout frameLayout2 = this.f101682d;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams3);
                }
                FrameLayout frameLayout3 = this.f101681c;
                if (frameLayout3 != null) {
                    layoutParams2 = frameLayout3.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    LayoutParams layoutParams4 = (LayoutParams) layoutParams2;
                    int i2 = layoutParams4.bottomMargin;
                    View view4 = this.f101690l;
                    if (view4 != null) {
                        num2 = Integer.valueOf(view4.getMeasuredHeight());
                    }
                    if (num2 == null) {
                        C7573i.m23580a();
                    }
                    layoutParams4.bottomMargin = i2 + num2.intValue();
                    FrameLayout frameLayout4 = this.f101681c;
                    if (frameLayout4 != null) {
                        frameLayout4.setLayoutParams(layoutParams4);
                    }
                    AbstractVideoEditView abstractVideoEditView2 = this.f101688j;
                    if (abstractVideoEditView2 != null) {
                        abstractVideoEditView2.mo97602d();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }
}
