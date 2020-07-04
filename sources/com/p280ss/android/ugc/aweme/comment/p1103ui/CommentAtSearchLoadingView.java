package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView */
public final class CommentAtSearchLoadingView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f64002a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAtSearchLoadingView.class), "view", "getView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentAtSearchLoadingView.class), "loadingAnimator", "getLoadingAnimator()Landroid/animation/ObjectAnimator;"))};

    /* renamed from: b */
    public static final C24259a f64003b = new C24259a(null);

    /* renamed from: c */
    private final C7541d f64004c;

    /* renamed from: d */
    private final C7541d f64005d;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$a */
    public static final class C24259a {
        private C24259a() {
        }

        public /* synthetic */ C24259a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$b */
    static final class C24260b extends Lambda implements C7561a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f64006a;

        C24260b(CommentAtSearchLoadingView commentAtSearchLoadingView) {
            this.f64006a = commentAtSearchLoadingView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ObjectAnimator invoke() {
            View view = this.f64006a.getView();
            C7573i.m23582a((Object) view, "view");
            return ObjectAnimator.ofFloat((ImageView) view.findViewById(R.id.b_r), "rotation", new float[]{360.0f});
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$c */
    static final class C24261c extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f64007a;

        /* renamed from: b */
        final /* synthetic */ Context f64008b;

        C24261c(CommentAtSearchLoadingView commentAtSearchLoadingView, Context context) {
            this.f64007a = commentAtSearchLoadingView;
            this.f64008b = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return View.inflate(this.f64008b, R.layout.b2r, this.f64007a);
        }
    }

    public CommentAtSearchLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ObjectAnimator getLoadingAnimator() {
        return (ObjectAnimator) this.f64005d.getValue();
    }

    public final View getView() {
        return (View) this.f64004c.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
    }

    /* renamed from: a */
    private final void m79652a() {
        getLoadingAnimator().setDuration(1000);
        getLoadingAnimator().setRepeatCount(-1);
        getLoadingAnimator().setInterpolator(new LinearInterpolator());
        getLoadingAnimator().start();
    }

    /* renamed from: a */
    public final void mo63060a(boolean z) {
        if (z != getLoadingAnimator().isRunning()) {
            if (z) {
                m79652a();
                return;
            }
            getLoadingAnimator().cancel();
        }
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f64004c = C7546e.m23569a(new C24261c(this, context));
        this.f64005d = C7546e.m23569a(new C24260b(this));
    }

    public /* synthetic */ CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
