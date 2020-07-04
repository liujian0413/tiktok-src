package com.p280ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p022v4.content.C0683b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.de */
public final class C32962de extends C32857a {

    /* renamed from: a */
    public ViewGroup f85907a;

    /* renamed from: b */
    public final Activity f85908b;

    /* renamed from: c */
    private final int f85909c = 5;

    /* renamed from: d */
    private int[] f85910d = {0, 0, 0, 0, 0};

    /* renamed from: e */
    private int[] f85911e = {3, 2, 6, 7, 99};

    /* renamed from: f */
    private Integer[] f85912f = {Integer.valueOf(R.id.c13), Integer.valueOf(R.id.c11), Integer.valueOf(R.id.c10), Integer.valueOf(R.id.c12), Integer.valueOf(R.id.c14)};

    /* renamed from: g */
    private TextView[] f85913g = new TextView[this.f85909c];

    /* renamed from: h */
    private ImageView f85914h;

    /* renamed from: i */
    private AnimatorSet f85915i;

    /* renamed from: com.ss.android.ugc.aweme.main.de$a */
    static final class C32963a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85916a;

        C32963a(C32962de deVar) {
            this.f85916a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85916a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setScaleX(((Float) animatedValue).floatValue());
                ViewGroup a2 = C32962de.m106580a(this.f85916a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    a2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$b */
    public static final class C32964b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C32962de f85917a;

        C32964b(C32962de deVar) {
            this.f85917a = deVar;
        }

        public final void onAnimationStart(Animator animator) {
            C7573i.m23587b(animator, "animation");
            C32962de.m106580a(this.f85917a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$c */
    static final class C32965c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85918a;

        C32965c(C32962de deVar) {
            this.f85918a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85918a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$d */
    static final class C32966d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85919a;

        C32966d(C32962de deVar) {
            this.f85919a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85919a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$e */
    static final class C32967e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85920a;

        C32967e(C32962de deVar) {
            this.f85920a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85920a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$f */
    static final class C32968f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85921a;

        C32968f(C32962de deVar) {
            this.f85921a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85921a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setTranslationY(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$g */
    static final class C32969g implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C32962de f85922a;

        C32969g(C32962de deVar) {
            this.f85922a = deVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C32962de.m106580a(this.f85922a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setScaleX(((Float) animatedValue).floatValue());
                ViewGroup a2 = C32962de.m106580a(this.f85922a);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    a2.setScaleY(((Float) animatedValue2).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.de$h */
    public static final class C32970h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C32962de f85923a;

        C32970h(C32962de deVar) {
            this.f85923a = deVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            this.f85923a.mo84587a();
        }
    }

    /* renamed from: c */
    private final boolean m106587c() {
        for (int i : this.f85910d) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m106584b() {
        int[] iArr = this.f85911e;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            this.f85910d[i] = C34315c.m110974a(i2);
            if (this.f85910d[i] > 0) {
                m106583a(this.f85913g[i], this.f85910d[i]);
            }
        }
    }

    /* renamed from: e */
    private static void m106589e() {
        C6907h.m21524a("message_pop_notice_show", (Map) new C22984d().mo59970a("like_cnt", C34315c.m110974a(3)).mo59970a("comment_cnt", C34315c.m110974a(2)).mo59970a("mention_cnt", C34315c.m110974a(6)).mo59970a("follower_cnt", C34315c.m110974a(7)).mo59970a("message_cnt", C34315c.m110974a(99)).f60753a);
    }

    /* renamed from: a */
    public final void mo84587a() {
        if (this.f85915i != null && this.f85908b != null && !this.f85908b.isFinishing() && isShowing()) {
            ViewGroup viewGroup = this.f85907a;
            if (viewGroup == null) {
                C7573i.m23583a("mRootView");
            }
            viewGroup.clearAnimation();
            AnimatorSet animatorSet = this.f85915i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            try {
                dismiss();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: d */
    private final void m106588d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "fadeIn");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new C10744c());
        ofFloat.addUpdateListener(new C32963a(this));
        ofFloat.addListener(new C32964b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
        C7573i.m23582a((Object) ofFloat2, "upL");
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new C32965c(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat3, "downL");
        ofFloat3.setDuration(500);
        ofFloat3.addUpdateListener(new C32966d(this));
        ofFloat3.setStartDelay(200);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
        C7573i.m23582a((Object) ofFloat4, "upS");
        ofFloat4.setDuration(150);
        ofFloat4.setStartDelay(5700);
        ofFloat4.addUpdateListener(new C32967e(this));
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat5, "downS");
        ofFloat5.setDuration(300);
        ofFloat5.setStartDelay(5850);
        ofFloat5.addUpdateListener(new C32968f(this));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat6, "fadeOut");
        ofFloat6.setDuration(300);
        ofFloat6.setStartDelay(5850);
        ofFloat6.setInterpolator(new C10743b());
        ofFloat6.addUpdateListener(new C32969g(this));
        ofFloat6.addListener(new C32970h(this));
        this.f85915i = new AnimatorSet();
        AnimatorSet animatorSet = this.f85915i;
        if (animatorSet != null) {
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
        }
        AnimatorSet animatorSet2 = this.f85915i;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m106580a(C32962de deVar) {
        ViewGroup viewGroup = deVar.f85907a;
        if (viewGroup == null) {
            C7573i.m23583a("mRootView");
        }
        return viewGroup;
    }

    /* renamed from: a */
    private final void m106581a(int i) {
        ImageView imageView = this.f85914h;
        if (imageView == null) {
            C7573i.m23583a("mIvArrow");
        }
        LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            ImageView imageView2 = this.f85914h;
            if (imageView2 == null) {
                C7573i.m23583a("mIvArrow");
            }
            imageView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: c */
    private final void m106586c(View view) {
        Integer[] numArr = this.f85912f;
        int length = numArr.length;
        for (int i = 0; i < length; i++) {
            this.f85913g[i] = (TextView) view.findViewById(numArr[i].intValue());
        }
        View findViewById = view.findViewById(R.id.c0z);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById…opview_notification_root)");
        this.f85907a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.c0y);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById…ew_notification_iv_arrow)");
        this.f85914h = (ImageView) findViewById2;
    }

    /* renamed from: b */
    private final void m106585b(View view) {
        setContentView(view);
        setBackgroundDrawable(new ColorDrawable(C0683b.m2912c(this.f85908b, R.color.ayd)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
    }

    public C32962de(Activity activity) {
        C7573i.m23587b(activity, "context");
        super(activity);
        this.f85908b = activity;
        View inflate = LayoutInflater.from(this.f85908b).inflate(R.layout.af9, null, false);
        C7573i.m23582a((Object) inflate, "contentView");
        m106585b(inflate);
        m106586c(inflate);
    }

    /* renamed from: a */
    public final boolean mo84588a(View view) {
        C7573i.m23587b(view, "anchorView");
        m106584b();
        if (!m106587c()) {
            dismiss();
            return false;
        }
        if (this.f85908b != null && !isShowing() && !this.f85908b.isFinishing()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 51, iArr[0], iArr[1] - view.getHeight());
            ViewGroup viewGroup = this.f85907a;
            if (viewGroup == null) {
                C7573i.m23583a("mRootView");
            }
            viewGroup.measure(0, 0);
            m106582a(view, 8.0f);
            m106589e();
        }
        m106588d();
        return true;
    }

    /* renamed from: a */
    private static void m106583a(TextView textView, int i) {
        if (i <= 0) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(C30537o.m99738a((long) i));
        }
    }

    /* renamed from: a */
    private final void m106582a(View view, float f) {
        boolean a = C43127fh.m136806a(this.f85908b);
        ViewGroup viewGroup = this.f85907a;
        if (viewGroup == null) {
            C7573i.m23583a("mRootView");
        }
        int measuredWidth = viewGroup.getMeasuredWidth();
        ViewGroup viewGroup2 = this.f85907a;
        if (viewGroup2 == null) {
            C7573i.m23583a("mRootView");
        }
        int measuredHeight = viewGroup2.getMeasuredHeight();
        int a2 = C9738o.m28691a((Context) this.f85908b);
        ImageView imageView = this.f85914h;
        if (imageView == null) {
            C7573i.m23583a("mIvArrow");
        }
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredWidth3 = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f2 = (float) measuredWidth;
        float f3 = f2 / 2.0f;
        float f4 = (((float) measuredWidth3) / 2.0f) + ((float) iArr[0]);
        if (!a) {
            float f5 = (float) a2;
            if (((float) (measuredWidth / 2)) + f4 >= f5) {
                f3 = f2 - (f5 - f4);
            }
        } else if (f4 - ((float) (measuredWidth / 2)) <= 0.0f) {
            f3 = f4;
        }
        m106581a((int) (f3 - (((float) measuredWidth2) / 2.0f)));
        update((int) (f4 - f3), (int) ((((float) iArr[1]) - ((float) view.getHeight())) - C9738o.m28708b((Context) this.f85908b, 8.0f)), measuredWidth, measuredHeight);
        ViewGroup viewGroup3 = this.f85907a;
        if (viewGroup3 == null) {
            C7573i.m23583a("mRootView");
        }
        viewGroup3.setPivotX(f3);
        ViewGroup viewGroup4 = this.f85907a;
        if (viewGroup4 == null) {
            C7573i.m23583a("mRootView");
        }
        viewGroup4.setPivotY((float) measuredHeight);
    }
}
