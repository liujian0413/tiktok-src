package com.p280ss.android.ugc.aweme.music.p1405a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.detail.C26094j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7586e;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.music.a.c */
public final class C33681c implements C26094j {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f87922a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33681c.class), "vgSizeAnimationState", "getVgSizeAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33681c.class), "vgMarginAnimationState", "getVgMarginAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33681c.class), "imgSizeAnimationState", "getImgSizeAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;"))};

    /* renamed from: h */
    public static final C7562b<View, C7563m<C33691g, C33691g, C7581n>> f87923h = C33687e.f87944a;

    /* renamed from: i */
    public static final C7562b<View, C7563m<Integer, Integer, C7581n>> f87924i = C33685d.f87942a;

    /* renamed from: j */
    public static final C33684c f87925j = new C33684c(null);

    /* renamed from: b */
    public final ImageView f87926b;

    /* renamed from: c */
    public final TextView f87927c;

    /* renamed from: d */
    public final C33683b f87928d = new C33683b(0.0f, 1, null);

    /* renamed from: e */
    public final C7586e<Integer> f87929e = new C33696k(this.f87930f.getResources());

    /* renamed from: f */
    public final Context f87930f;

    /* renamed from: g */
    public final ViewGroup f87931g;

    /* renamed from: k */
    private ValueAnimator f87932k;

    /* renamed from: l */
    private final C7541d f87933l = C7546e.m23569a(new C33699n(this));

    /* renamed from: m */
    private final C7541d f87934m = C7546e.m23569a(new C33698m(this));

    /* renamed from: n */
    private final C7541d f87935n = C7546e.m23569a(new C33697l(this));

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$a */
    static class C33682a<T> {

        /* renamed from: a */
        public T f87936a;

        /* renamed from: b */
        public final T f87937b;

        /* renamed from: c */
        public final T f87938c;

        /* renamed from: d */
        public C7563m<? super T, ? super T, C7581n> f87939d;

        /* renamed from: a */
        public final void mo86092a(T t) {
            this.f87939d.invoke(this.f87936a, t);
            this.f87936a = t;
        }

        public C33682a(T t, T t2, C7563m<? super T, ? super T, C7581n> mVar, T t3) {
            C7573i.m23587b(mVar, "onCurrentChanged");
            this.f87937b = t;
            this.f87938c = t2;
            this.f87939d = mVar;
            this.f87936a = t3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$b */
    static final class C33683b {

        /* renamed from: a */
        public final List<C7563m<Float, Float, C7581n>> f87940a;

        /* renamed from: b */
        public float f87941b;

        public C33683b() {
            this(0.0f, 1, null);
        }

        private C33683b(float f) {
            this.f87940a = new ArrayList();
            this.f87941b = f;
        }

        /* renamed from: a */
        public final void mo86093a(float f) {
            for (C7563m invoke : this.f87940a) {
                invoke.invoke(Float.valueOf(this.f87941b), Float.valueOf(f));
            }
            this.f87941b = f;
        }

        public /* synthetic */ C33683b(float f, int i, C7571f fVar) {
            this(0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$c */
    static final class C33684c {
        private C33684c() {
        }

        /* renamed from: a */
        public static C7562b<View, C7563m<C33691g, C33691g, C7581n>> m108698a() {
            return C33681c.f87923h;
        }

        /* renamed from: b */
        public static C7562b<View, C7563m<Integer, Integer, C7581n>> m108699b() {
            return C33681c.f87924i;
        }

        public /* synthetic */ C33684c(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$d */
    static final class C33685d extends Lambda implements C7562b<View, C7563m<? super Integer, ? super Integer, ? extends C7581n>> {

        /* renamed from: a */
        public static final C33685d f87942a = new C33685d();

        C33685d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m108700a((View) obj);
        }

        /* renamed from: a */
        private static C7563m<Integer, Integer, C7581n> m108700a(final View view) {
            C7573i.m23587b(view, "view");
            return new C7563m<Integer, Integer, C7581n>() {
                /* renamed from: a */
                private void m108701a(int i, int i2) {
                    View view = view;
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = i2;
                        view.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m108701a(((Number) obj).intValue(), ((Number) obj2).intValue());
                    return C7581n.f20898a;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$e */
    static final class C33687e extends Lambda implements C7562b<View, C7563m<? super C33691g, ? super C33691g, ? extends C7581n>> {

        /* renamed from: a */
        public static final C33687e f87944a = new C33687e();

        C33687e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m108702a((View) obj);
        }

        /* renamed from: a */
        private static C7563m<C33691g, C33691g, C7581n> m108702a(final View view) {
            C7573i.m23587b(view, "view");
            return new C7563m<C33691g, C33691g, C7581n>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m108703a((C33691g) obj, (C33691g) obj2);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108703a(C33691g gVar, C33691g gVar2) {
                    C7573i.m23587b(gVar, "before");
                    C7573i.m23587b(gVar2, "after");
                    View view = view;
                    LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = gVar2.f87947a;
                    layoutParams.height = gVar2.f87948b;
                    view.setLayoutParams(layoutParams);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$f */
    static final class C33689f extends C33682a<Integer> {
        public C33689f(int i, int i2, C7563m<? super Integer, ? super Integer, C7581n> mVar, C33683b bVar) {
            C7573i.m23587b(mVar, "onCurrentChanged");
            C7573i.m23587b(bVar, "tracker");
            super(Integer.valueOf(i), Integer.valueOf(i2), mVar, Integer.valueOf(i));
            bVar.f87940a.add(new C7563m<Float, Float, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33689f f87946a;

                {
                    this.f87946a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m108704a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108704a(float f, float f2) {
                    this.f87946a.mo86092a(Integer.valueOf(((int) (((float) (((Number) this.f87946a.f87938c).intValue() - ((Number) this.f87946a.f87937b).intValue())) * f2)) + ((Number) this.f87946a.f87937b).intValue()));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$g */
    static final class C33691g {

        /* renamed from: a */
        public final int f87947a;

        /* renamed from: b */
        public final int f87948b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C33691g) {
                    C33691g gVar = (C33691g) obj;
                    if (this.f87947a == gVar.f87947a) {
                        if (this.f87948b == gVar.f87948b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f87947a * 31) + this.f87948b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Size(width=");
            sb.append(this.f87947a);
            sb.append(", height=");
            sb.append(this.f87948b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final C33691g mo86094a(float f) {
            return new C33691g((int) (((float) this.f87947a) * f), (int) (((float) this.f87948b) * f));
        }

        /* renamed from: b */
        public final C33691g mo86096b(C33691g gVar) {
            C7573i.m23587b(gVar, "decrement");
            return new C33691g(this.f87947a - gVar.f87947a, this.f87948b - gVar.f87948b);
        }

        /* renamed from: a */
        public final C33691g mo86095a(C33691g gVar) {
            C7573i.m23587b(gVar, "increment");
            return new C33691g(this.f87947a + gVar.f87947a, this.f87948b + gVar.f87948b);
        }

        public C33691g(int i, int i2) {
            this.f87947a = i;
            this.f87948b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$h */
    static final class C33692h extends C33682a<C33691g> {
        public C33692h(C33691g gVar, C33691g gVar2, C7563m<? super C33691g, ? super C33691g, C7581n> mVar, C33683b bVar) {
            C7573i.m23587b(gVar, "begin");
            C7573i.m23587b(gVar2, "end");
            C7573i.m23587b(mVar, "onCurrentChanged");
            C7573i.m23587b(bVar, "tracker");
            super(gVar, gVar2, mVar, gVar);
            bVar.f87940a.add(new C7563m<Float, Float, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33692h f87949a;

                {
                    this.f87949a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m108708a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108708a(float f, float f2) {
                    this.f87949a.mo86092a(((C33691g) this.f87949a.f87938c).mo86096b((C33691g) this.f87949a.f87937b).mo86094a(f2).mo86095a((C33691g) this.f87949a.f87937b));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$i */
    static final class C33694i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C33681c f87950a;

        /* renamed from: b */
        final /* synthetic */ C7561a f87951b;

        /* renamed from: c */
        final /* synthetic */ float f87952c;

        C33694i(C33681c cVar, C7561a aVar, float f) {
            this.f87950a = cVar;
            this.f87951b = aVar;
            this.f87952c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C33683b bVar = this.f87950a.f87928d;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                bVar.mo86093a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$j */
    public static final class C33695j implements AnimatorListener {

        /* renamed from: a */
        public TruncateAt f87953a = TruncateAt.END;

        /* renamed from: b */
        final /* synthetic */ ValueAnimator f87954b;

        /* renamed from: c */
        final /* synthetic */ C33681c f87955c;

        /* renamed from: d */
        final /* synthetic */ C7561a f87956d;

        /* renamed from: e */
        final /* synthetic */ float f87957e;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f87955c.f87927c.setEllipsize(this.f87953a);
            this.f87954b.removeAllUpdateListeners();
            this.f87954b.removeListener(this);
            this.f87956d.invoke();
        }

        public final void onAnimationStart(Animator animator) {
            TruncateAt ellipsize = this.f87955c.f87927c.getEllipsize();
            C7573i.m23582a((Object) ellipsize, "recordTitleView.ellipsize");
            this.f87953a = ellipsize;
            this.f87955c.f87927c.setEllipsize(TruncateAt.MARQUEE);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f87955c.f87927c.setEllipsize(this.f87953a);
            this.f87954b.removeAllUpdateListeners();
            this.f87954b.removeListener(this);
            this.f87955c.f87928d.mo86093a(this.f87957e);
            this.f87956d.invoke();
        }

        C33695j(ValueAnimator valueAnimator, C33681c cVar, C7561a aVar, float f) {
            this.f87954b = valueAnimator;
            this.f87955c = cVar;
            this.f87956d = aVar;
            this.f87957e = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$k */
    static final /* synthetic */ class C33696k extends FunctionReference implements C7562b<Integer, Integer> {
        C33696k(Resources resources) {
            super(1, resources);
        }

        public final String getName() {
            return "getDimensionPixelSize";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(Resources.class);
        }

        public final String getSignature() {
            return "getDimensionPixelSize(I)I";
        }

        /* renamed from: a */
        private int m108709a(int i) {
            return ((Resources) this.receiver).getDimensionPixelSize(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m108709a(((Number) obj).intValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$l */
    static final class C33697l extends Lambda implements C7561a<C33692h> {

        /* renamed from: a */
        final /* synthetic */ C33681c f87958a;

        C33697l(C33681c cVar) {
            this.f87958a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33692h invoke() {
            return new C33692h(new C33691g(this.f87958a.f87926b.getMeasuredWidth(), this.f87958a.f87926b.getMeasuredHeight()), new C33691g(((Number) ((C7562b) this.f87958a.f87929e).invoke(Integer.valueOf(R.dimen.k6))).intValue(), ((Number) ((C7562b) this.f87958a.f87929e).invoke(Integer.valueOf(R.dimen.k6))).intValue()), (C7563m) C33684c.m108698a().invoke(this.f87958a.f87926b), this.f87958a.f87928d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$m */
    static final class C33698m extends Lambda implements C7561a<C33689f> {

        /* renamed from: a */
        final /* synthetic */ C33681c f87959a;

        C33698m(C33681c cVar) {
            this.f87959a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33689f invoke() {
            LayoutParams layoutParams = this.f87959a.f87931g.getLayoutParams();
            if (layoutParams != null) {
                return new C33689f(((MarginLayoutParams) layoutParams).bottomMargin, ((Number) ((C7562b) this.f87959a.f87929e).invoke(Integer.valueOf(R.dimen.k9))).intValue(), (C7563m) C33684c.m108699b().invoke(this.f87959a.f87931g), this.f87959a.f87928d);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$n */
    static final class C33699n extends Lambda implements C7561a<C33692h> {

        /* renamed from: a */
        final /* synthetic */ C33681c f87960a;

        C33699n(C33681c cVar) {
            this.f87960a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33692h invoke() {
            return new C33692h(new C33691g(this.f87960a.f87931g.getMeasuredWidth(), this.f87960a.f87931g.getMeasuredHeight()), new C33691g(((Number) ((C7562b) this.f87960a.f87929e).invoke(Integer.valueOf(R.dimen.k_))).intValue(), ((Number) ((C7562b) this.f87960a.f87929e).invoke(Integer.valueOf(R.dimen.k8))).intValue()), (C7563m) C33684c.m108698a().invoke(this.f87960a.f87931g), this.f87960a.f87928d);
        }
    }

    /* renamed from: a */
    private final C33692h m108689a() {
        return (C33692h) this.f87933l.getValue();
    }

    /* renamed from: b */
    private final C33689f m108691b() {
        return (C33689f) this.f87934m.getValue();
    }

    /* renamed from: c */
    private final C33692h m108692c() {
        return (C33692h) this.f87935n.getValue();
    }

    /* renamed from: a */
    public final void mo67577a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        m108690a(1.0f, aVar);
    }

    /* renamed from: b */
    public final void mo67579b(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        ValueAnimator valueAnimator = this.f87932k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        aVar.invoke();
    }

    /* renamed from: c */
    public final void mo67673c(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "callback");
        m108690a(0.0f, aVar);
    }

    public C33681c(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f87930f = context;
        this.f87931g = viewGroup;
        View findViewById = this.f87931g.findViewById(R.id.da_);
        C7573i.m23582a((Object) findViewById, "this.viewGroup.findViewB…d.start_record_video_img)");
        this.f87926b = (ImageView) findViewById;
        View findViewById2 = this.f87931g.findViewById(R.id.da9);
        C7573i.m23582a((Object) findViewById2, "this.viewGroup.findViewB…(R.id.start_record_title)");
        this.f87927c = (TextView) findViewById2;
    }

    /* renamed from: a */
    private final void m108690a(float f, C7561a<C7581n> aVar) {
        float f2 = this.f87928d.f87941b;
        if (f2 != f) {
            ValueAnimator valueAnimator = this.f87932k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m108689a();
                m108692c();
                m108691b();
                this.f87932k = ValueAnimator.ofFloat(new float[]{f2, f});
                ValueAnimator valueAnimator2 = this.f87932k;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatCount(0);
                    valueAnimator2.setDuration(300);
                    valueAnimator2.setStartDelay(300);
                    valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimator2.addUpdateListener(new C33694i(this, aVar, f));
                    valueAnimator2.addListener(new C33695j(valueAnimator2, this, aVar, f));
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }
}
