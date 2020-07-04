package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.ArrayList;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer */
public final class AdHalfWebPageContainer extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66852a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdHalfWebPageContainer.class), "decorView", "getDecorView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C25399a f66853f = new C25399a(null);

    /* renamed from: i */
    private static final String f66854i = AdHalfWebPageContainer.class.getSimpleName();

    /* renamed from: b */
    public boolean f66855b;

    /* renamed from: c */
    public boolean f66856c;

    /* renamed from: d */
    public boolean f66857d;

    /* renamed from: e */
    public boolean f66858e;

    /* renamed from: g */
    private boolean f66859g;

    /* renamed from: h */
    private final C7541d f66860h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$a */
    public static final class C25399a {
        private C25399a() {
        }

        public /* synthetic */ C25399a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$b */
    static final class C25400b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66861a;

        C25400b(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66861a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66861a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$c */
    static final class C25401c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66862a;

        /* renamed from: b */
        final /* synthetic */ Runnable f66863b;

        C25401c(AdHalfWebPageContainer adHalfWebPageContainer, Runnable runnable) {
            this.f66862a = adHalfWebPageContainer;
            this.f66863b = runnable;
        }

        public final void run() {
            this.f66862a.f66855b = false;
            Runnable runnable = this.f66863b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$d */
    static final class C25402d extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ Context f66864a;

        C25402d(Context context) {
            this.f66864a = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            Context context = this.f66864a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    return window.getDecorView();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$e */
    static final class C25403e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66865a;

        C25403e(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66865a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66865a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$f */
    static final class C25404f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66866a;

        C25404f(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66866a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66866a.f66855b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$g */
    public static final class C25405g implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66867a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C25405g(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66867a = adHalfWebPageContainer;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f66867a.f66855b = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f66867a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$h */
    static final class C25406h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66868a;

        C25406h(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66868a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66868a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$i */
    static final class C25407i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66869a;

        C25407i(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66869a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66869a.f66855b = false;
            this.f66869a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$j */
    static final class C25408j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66870a;

        C25408j(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66870a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66870a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$k */
    static final class C25409k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66871a;

        C25409k(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66871a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66871a.f66855b = false;
            this.f66871a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$l */
    static final class C25410l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66872a;

        C25410l(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66872a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66872a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$m */
    static final class C25411m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66873a;

        C25411m(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66873a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66873a.f66855b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$n */
    static final class C25412n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66874a;

        C25412n(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66874a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66874a.f66855b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$o */
    static final class C25413o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f66875a;

        C25413o(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f66875a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f66875a.f66855b = false;
        }
    }

    public AdHalfWebPageContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final View getDecorView() {
        return (View) this.f66860h.getValue();
    }

    /* renamed from: a */
    public final void mo65974a(int i, int i2) {
        m83573b(i, i2, 0);
    }

    /* renamed from: h */
    private void m83574h() {
        if (this.f66859g) {
            setZ(0.0f);
        } else {
            setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo65982d() {
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
    }

    /* renamed from: e */
    public final void mo65983e() {
        setAlpha(0.0f);
        setVisibility(8);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    /* renamed from: f */
    public final void mo65984f() {
        setAlpha(1.0f);
        m83574h();
    }

    public final boolean getCanCollapse() {
        if (!this.f66857d || this.f66858e) {
            return false;
        }
        return true;
    }

    public final boolean getCanExpand() {
        if (!this.f66857d || this.f66858e) {
            return true;
        }
        return false;
    }

    private final int getScreenHeight() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getHeight();
        }
        return C23482j.m77095a(getContext());
    }

    private final int getScreenWidth() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getWidth();
        }
        return C23482j.m77098b(getContext());
    }

    /* renamed from: a */
    public final boolean mo65978a() {
        return C23487o.m77156c((View) this);
    }

    /* renamed from: b */
    public final boolean mo65980b() {
        if (getVisibility() == 0 && getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo65981c() {
        if (this.f66859g) {
            setZ(-1.0f);
            setVisibility(0);
            return;
        }
        setVisibility(4);
    }

    /* renamed from: g */
    public final void mo65985g() {
        setTranslationX((((float) (getScreenWidth() - getWidth())) / 2.0f) - ((float) getLeft()));
    }

    private final float getToTransX() {
        int i;
        if (C43127fh.m136806a(getContext())) {
            int width = getWidth();
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                i = width + ((MarginLayoutParams) layoutParams).rightMargin;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            int width2 = getWidth();
            LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i = -(width2 + ((MarginLayoutParams) layoutParams2).leftMargin);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return (float) i;
    }

    public final void setCollapsed(boolean z) {
        this.f66858e = z;
    }

    public final void setExpanded(boolean z) {
        this.f66857d = z;
    }

    public final void setUseZOrder(boolean z) {
        this.f66859g = z;
    }

    public final void setInCleanMode(boolean z) {
        int i;
        this.f66856c = z;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: b */
    public final void mo65979b(boolean z) {
        if (z) {
            animate().alpha(0.0f).withStartAction(new C25406h(this)).setDuration(280).withEndAction(new C25407i(this)).start();
        } else {
            animate().alpha(0.0f).translationX(getToTransX()).withStartAction(new C25408j(this)).setDuration(200).withEndAction(new C25409k(this)).start();
        }
    }

    /* renamed from: a */
    public final void mo65977a(boolean z) {
        if (!this.f66856c) {
            m83574h();
        }
        if (z) {
            setTranslationX(0.0f);
            setTranslationY((float) C23486n.m77122a(17.0d));
            animate().alpha(1.0f).translationY(0.0f).withStartAction(new C25410l(this)).setInterpolator(new LinearInterpolator()).setDuration(280).withEndAction(new C25411m(this)).start();
            return;
        }
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
        animate().alpha(1.0f).translationX(0.0f).withStartAction(new C25412n(this)).setDuration(200).withEndAction(new C25413o(this)).start();
    }

    /* renamed from: a */
    public final void mo65976a(long j, Runnable runnable) {
        this.f66858e = true;
        animate().translationY((float) (getScreenHeight() - getTop())).withStartAction(new C25400b(this)).withEndAction(new C25401c(this, runnable)).setDuration(400).start();
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        setAlpha(0.0f);
        this.f66860h = C7546e.m23569a(new C25402d(context));
    }

    /* renamed from: a */
    public final void mo65975a(int i, int i2, long j) {
        this.f66857d = true;
        this.f66858e = false;
        m83573b(i, i2, 100);
        float screenWidth = (((((float) (getScreenWidth() - i)) / 2.0f) - ((float) getLeft())) + ((float) i)) - ((float) getWidth());
        animate().translationX(screenWidth).translationY((((((float) (getScreenHeight() - i2)) / 2.0f) - ((float) getTop())) + ((float) i2)) - ((float) getHeight())).withStartAction(new C25403e(this)).withEndAction(new C25404f(this)).setDuration(100).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m83573b(int i, int i2, long j) {
        ViewWrapper viewWrapper = new ViewWrapper(this);
        if (j == 0) {
            if (i > 0 && viewWrapper.getWidth() != i) {
                viewWrapper.setWidth(i);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                viewWrapper.setHeight(i2);
            }
        } else if (j > 0) {
            List arrayList = new ArrayList();
            if (i > 0 && viewWrapper.getWidth() != i) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{viewWrapper.getWidth(), i});
                C7573i.m23582a((Object) ofInt, "ObjectAnimator.ofInt(vw, \"width\", vw.width, width)");
                arrayList.add(ofInt);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{viewWrapper.getHeight(), i2});
                C7573i.m23582a((Object) ofInt2, "ObjectAnimator.ofInt(vw,…ight\", vw.height, height)");
                arrayList.add(ofInt2);
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(j);
                animatorSet.addListener(new C25405g(this));
                animatorSet.start();
            }
        }
    }

    public /* synthetic */ AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
