package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.p1696v.C43178b;
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

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout */
public final class CommentAtSearchLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f63991a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAtSearchLayout.class), "marginLayoutParams", "getMarginLayoutParams()Landroid/view/ViewGroup$MarginLayoutParams;"))};

    /* renamed from: e */
    public static final C24255a f63992e = new C24255a(null);

    /* renamed from: b */
    public boolean f63993b;

    /* renamed from: c */
    public boolean f63994c;

    /* renamed from: d */
    public boolean f63995d;

    /* renamed from: f */
    private ValueAnimator f63996f;

    /* renamed from: g */
    private final C7541d f63997g;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$a */
    public static final class C24255a {
        private C24255a() {
        }

        public /* synthetic */ C24255a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$b */
    static final class C24256b extends Lambda implements C7561a<MarginLayoutParams> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f63998a;

        C24256b(CommentAtSearchLayout commentAtSearchLayout) {
            this.f63998a = commentAtSearchLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MarginLayoutParams invoke() {
            LayoutParams layoutParams = this.f63998a.getLayoutParams();
            if (layoutParams != null) {
                return (MarginLayoutParams) layoutParams;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$c */
    public static final class C24257c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f63999a;

        /* renamed from: b */
        final /* synthetic */ boolean f64000b;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            if (!this.f64000b) {
                this.f63999a.setVisibility(8);
            }
            this.f63999a.setClosing(false);
            this.f63999a.setAnimating(false);
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f64000b) {
                this.f63999a.setVisibility(8);
            }
            this.f63999a.setClosing(false);
            this.f63999a.setAnimating(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f64000b) {
                this.f63999a.setVisibility(0);
            } else {
                this.f63999a.setClosing(true);
            }
            this.f63999a.setAnimating(true);
        }

        C24257c(CommentAtSearchLayout commentAtSearchLayout, boolean z) {
            this.f63999a = commentAtSearchLayout;
            this.f64000b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$d */
    static final class C24258d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f64001a;

        C24258d(CommentAtSearchLayout commentAtSearchLayout) {
            this.f64001a = commentAtSearchLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MarginLayoutParams marginLayoutParams = this.f64001a.getMarginLayoutParams();
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                this.f64001a.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public CommentAtSearchLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final MarginLayoutParams getMarginLayoutParams() {
        return (MarginLayoutParams) this.f63997g.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f63996f.cancel();
    }

    /* renamed from: a */
    public final void mo63048a() {
        if (!this.f63993b) {
            this.f63993b = true;
            m79649a(getMarginLayoutParams().bottomMargin, 0);
        }
    }

    public final void dismiss() {
        if (this.f63993b) {
            this.f63993b = false;
            m79649a(getMarginLayoutParams().bottomMargin, -getHeight());
        }
    }

    public final void setAnimating(boolean z) {
        this.f63994c = z;
    }

    public final void setClosing(boolean z) {
        this.f63995d = z;
    }

    public final void setInitValue(int i) {
        getMarginLayoutParams().bottomMargin = -i;
        requestLayout();
    }

    /* renamed from: a */
    private final void m79649a(int i, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f63996f.cancel();
        this.f63996f = new ValueAnimator();
        this.f63996f.setIntValues(new int[]{i, i2});
        this.f63996f.setInterpolator(new C43178b());
        this.f63996f.setDuration(350);
        this.f63996f.addListener(new C24257c(this, z));
        this.f63996f.addUpdateListener(new C24258d(this));
        this.f63996f.start();
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f63996f = new ValueAnimator();
        this.f63997g = C7546e.m23569a(new C24256b(this));
    }

    public /* synthetic */ CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
