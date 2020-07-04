package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p022v4.view.animation.C0957c;
import android.support.transition.C0475b;
import android.support.transition.C0516o;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a */
public abstract class C5559a<T extends Widget> implements C5594as {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f16602a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C5559a.class), "holderView", "getHolderView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C5564e f16603f = new C5564e(null);

    /* renamed from: b */
    public T f16604b;

    /* renamed from: c */
    public final View f16605c;

    /* renamed from: d */
    public boolean f16606d;

    /* renamed from: e */
    public final ViewGroup f16607e;

    /* renamed from: g */
    private final C7541d f16608g = C7546e.m23569a(new C5566g(this));

    /* renamed from: h */
    private WidgetManager f16609h;

    /* renamed from: i */
    private boolean f16610i;

    /* renamed from: j */
    private final ValueAnimator f16611j;

    /* renamed from: k */
    private final ValueAnimator f16612k;

    /* renamed from: l */
    private final ObjectAnimator f16613l;

    /* renamed from: m */
    private final int f16614m;

    /* renamed from: n */
    private final C5565f f16615n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$a */
    static final class C5560a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5559a f16616a;

        C5560a(C5559a aVar) {
            this.f16616a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f16616a.f16605c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                    this.f16616a.mo14056a().requestLayout();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$b */
    public static final class C5561b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5559a f16617a;

        C5561b(C5559a aVar) {
            this.f16617a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f16617a.f16605c.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$c */
    static final class C5562c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5559a f16618a;

        C5562c(C5559a aVar) {
            this.f16618a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f16618a.f16605c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                    this.f16618a.mo14056a().requestLayout();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$d */
    public static final class C5563d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5559a f16619a;

        C5563d(C5559a aVar) {
            this.f16619a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f16619a.f16605c.setVisibility(0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$e */
    public static final class C5564e {
        private C5564e() {
        }

        public /* synthetic */ C5564e(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$f */
    public interface C5565f {
        /* renamed from: a */
        void mo13679a(C5559a<? extends Widget> aVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$g */
    static final class C5566g extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C5559a f16620a;

        C5566g(C5559a aVar) {
            this.f16620a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f16620a.mo14057a(this.f16620a.f16607e);
        }
    }

    /* renamed from: a */
    public final View mo14056a() {
        return (View) this.f16608g.getValue();
    }

    /* renamed from: a */
    public abstract View mo14057a(ViewGroup viewGroup);

    /* renamed from: b */
    public abstract void mo14061b();

    /* renamed from: c */
    public abstract void mo14062c();

    /* renamed from: d */
    public abstract void mo14063d();

    /* renamed from: e */
    public abstract void mo14064e();

    /* renamed from: i */
    public final void mo14068i() {
        mo14065f();
    }

    /* renamed from: m */
    private final void m17969m() {
        this.f16611j.cancel();
        this.f16613l.cancel();
    }

    /* renamed from: l */
    public final void mo14071l() {
        if (this.f16606d) {
            mo14069j();
        } else {
            mo14070k();
        }
    }

    /* renamed from: g */
    public final void mo14066g() {
        if (!this.f16610i) {
            C0516o.m2171a(this.f16607e, new C0475b());
            this.f16607e.setVisibility(0);
            this.f16610i = true;
        }
    }

    /* renamed from: h */
    public final void mo14067h() {
        if (this.f16610i) {
            C0516o.m2171a(this.f16607e, new C0475b());
            this.f16607e.setVisibility(8);
            this.f16610i = false;
        }
    }

    /* renamed from: f */
    public final void mo14065f() {
        if (this.f16604b != null) {
            mo14064e();
            WidgetManager widgetManager = this.f16609h;
            if (widgetManager != null) {
                widgetManager.unload(this.f16604b);
            }
            this.f16604b = null;
            this.f16607e.removeView(mo14056a());
            mo14067h();
        }
    }

    /* renamed from: j */
    public final void mo14069j() {
        if (this.f16606d) {
            m17969m();
            mo14061b();
            m17968b(this.f16612k);
            this.f16612k.start();
            this.f16613l.start();
            this.f16606d = false;
            this.f16615n.mo13679a(this, this.f16606d);
        }
    }

    /* renamed from: k */
    public final void mo14070k() {
        if (!this.f16606d) {
            m17969m();
            mo14062c();
            mo14058a(this.f16611j);
            this.f16611j.start();
            this.f16613l.reverse();
            this.f16606d = true;
            this.f16615n.mo13679a(this, this.f16606d);
        }
    }

    /* renamed from: b */
    private void m17968b(ValueAnimator valueAnimator) {
        C7573i.m23587b(valueAnimator, "animator");
        int[] iArr = new int[2];
        LayoutParams layoutParams = this.f16605c.getLayoutParams();
        if (layoutParams != null) {
            iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
            iArr[1] = 0;
            valueAnimator.setIntValues(iArr);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public void mo14058a(ValueAnimator valueAnimator) {
        C7573i.m23587b(valueAnimator, "animator");
        int[] iArr = new int[2];
        LayoutParams layoutParams = this.f16605c.getLayoutParams();
        if (layoutParams != null) {
            iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
            iArr[1] = -this.f16605c.getHeight();
            valueAnimator.setIntValues(iArr);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public void mo14059a(C4900a aVar) {
        C7573i.m23587b(aVar, "info");
        if (aVar.f14017e > 0) {
            int a = C3358ac.m12510a((float) Math.min(aVar.f14017e, 120));
            View view = this.f16605c;
            view.getLayoutParams().height = a;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo14060a(T t, WidgetManager widgetManager) {
        C7573i.m23587b(t, "widget");
        C7573i.m23587b(widgetManager, "widgetManager");
        if (this.f16604b == null) {
            this.f16607e.addView(mo14056a());
            this.f16604b = t;
            widgetManager.load(this.f16614m, t);
            this.f16609h = widgetManager;
            mo14063d();
        }
    }

    public C5559a(ViewGroup viewGroup, int i, C5565f fVar) {
        C7573i.m23587b(viewGroup, "parentView");
        C7573i.m23587b(fVar, "stateChangeListener");
        this.f16607e = viewGroup;
        this.f16614m = i;
        this.f16615n = fVar;
        View findViewById = mo14056a().findViewById(this.f16614m);
        C7573i.m23582a((Object) findViewById, "holderView.findViewById<View>(widgetContainerId)");
        this.f16605c = findViewById;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new C5560a(this));
        valueAnimator.addListener(new C5561b(this));
        valueAnimator.setDuration(300);
        valueAnimator.setInterpolator(C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f16611j = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.addUpdateListener(new C5562c(this));
        valueAnimator2.addListener(new C5563d(this));
        valueAnimator2.setDuration(300);
        valueAnimator2.setInterpolator(C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f16612k = valueAnimator2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16605c, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f16613l = ofFloat;
    }
}
