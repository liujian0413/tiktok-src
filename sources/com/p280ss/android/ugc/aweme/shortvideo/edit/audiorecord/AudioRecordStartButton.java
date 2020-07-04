package com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton */
public final class AudioRecordStartButton extends FrameLayout {

    /* renamed from: a */
    public ImageView f102440a;

    /* renamed from: b */
    private C39466a f102441b;

    /* renamed from: c */
    private ValueAnimator f102442c = ValueAnimator.ofFloat(new float[]{1.0f, 0.72f});

    /* renamed from: d */
    private ValueAnimator f102443d = ValueAnimator.ofFloat(new float[]{0.72f, 1.0f});

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$a */
    public static final class C39466a extends View {

        /* renamed from: a */
        public float f102444a = this.f102447d;

        /* renamed from: b */
        private final Paint f102445b = new Paint();

        /* renamed from: c */
        private final float f102446c = C9738o.m28708b(getContext(), 3.5f);

        /* renamed from: d */
        private final float f102447d = C9738o.m28708b(getContext(), 13.0f);

        /* renamed from: e */
        private ValueAnimator f102448e = ValueAnimator.ofFloat(new float[]{this.f102446c, this.f102447d});

        /* renamed from: f */
        private ValueAnimator f102449f = ValueAnimator.ofFloat(new float[]{this.f102447d, this.f102446c});

        /* renamed from: a */
        public final void mo98291a() {
            this.f102449f.end();
            this.f102448e.start();
        }

        /* renamed from: b */
        public final void mo98292b() {
            this.f102448e.end();
            this.f102449f.start();
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f102448e;
            C7573i.m23582a((Object) valueAnimator, "rToC");
            if (valueAnimator.isRunning()) {
                this.f102448e.end();
            }
            ValueAnimator valueAnimator2 = this.f102449f;
            C7573i.m23582a((Object) valueAnimator2, "cToR");
            if (valueAnimator2.isRunning()) {
                this.f102449f.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (canvas != null) {
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f102444a, this.f102444a, this.f102445b);
            }
        }

        public C39466a(Context context) {
            C7573i.m23587b(context, "context");
            super(context);
            this.f102445b.setAntiAlias(true);
            this.f102445b.setColor(Color.parseColor("#fe2c55"));
            this.f102448e.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C39466a f102450a;

                {
                    this.f102450a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C39466a aVar = this.f102450a;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        aVar.f102444a = ((Float) animatedValue).floatValue();
                        this.f102450a.invalidate();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ValueAnimator valueAnimator = this.f102448e;
            C7573i.m23582a((Object) valueAnimator, "rToC");
            valueAnimator.setDuration(250);
            this.f102449f.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C39466a f102451a;

                {
                    this.f102451a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C39466a aVar = this.f102451a;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        aVar.f102444a = ((Float) animatedValue).floatValue();
                        this.f102451a.invalidate();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ValueAnimator valueAnimator2 = this.f102449f;
            C7573i.m23582a((Object) valueAnimator2, "cToR");
            valueAnimator2.setDuration(250);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$b */
    static final class C39469b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f102452a;

        C39469b(AudioRecordStartButton audioRecordStartButton) {
            this.f102452a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AudioRecordStartButton.m126044a(this.f102452a).setScaleX(floatValue);
                AudioRecordStartButton.m126044a(this.f102452a).setScaleY(floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$c */
    static final class C39470c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f102453a;

        C39470c(AudioRecordStartButton audioRecordStartButton) {
            this.f102453a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AudioRecordStartButton.m126044a(this.f102453a).setScaleX(floatValue);
                AudioRecordStartButton.m126044a(this.f102453a).setScaleY(floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: b */
    public final void mo98285b() {
        this.f102442c.end();
        this.f102443d.start();
    }

    /* renamed from: c */
    public final void mo98286c() {
        C39466a aVar = this.f102441b;
        if (aVar == null) {
            C7573i.m23583a("centerView");
        }
        aVar.mo98292b();
    }

    /* renamed from: d */
    public final void mo98287d() {
        C39466a aVar = this.f102441b;
        if (aVar == null) {
            C7573i.m23583a("centerView");
        }
        aVar.mo98291a();
    }

    /* renamed from: e */
    public final void mo98288e() {
        setAlpha(0.5f);
        setEnabled(false);
    }

    /* renamed from: f */
    public final void mo98289f() {
        setAlpha(1.0f);
        setEnabled(true);
    }

    /* renamed from: a */
    public final void mo98284a() {
        this.f102443d.end();
        this.f102442c.start();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f102442c;
        C7573i.m23582a((Object) valueAnimator, "bToS");
        if (valueAnimator.isRunning()) {
            this.f102442c.end();
        }
        ValueAnimator valueAnimator2 = this.f102443d;
        C7573i.m23582a((Object) valueAnimator2, "sToB");
        if (valueAnimator2.isRunning()) {
            this.f102443d.end();
        }
    }

    /* renamed from: g */
    private final void m126045g() {
        this.f102440a = new ImageView(getContext());
        ImageView imageView = this.f102440a;
        if (imageView == null) {
            C7573i.m23583a("bgView");
        }
        imageView.setBackground(C38501ax.m123065a(-16776961, -1, 0));
        ImageView imageView2 = this.f102440a;
        if (imageView2 == null) {
            C7573i.m23583a("bgView");
        }
        addView(imageView2, new LayoutParams(-1, -1));
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        this.f102441b = new C39466a(context);
        LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 20.0f), (int) C9738o.m28708b(getContext(), 20.0f));
        layoutParams.topMargin = (int) C9738o.m28708b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) C9738o.m28708b(getContext(), 26.0f);
        layoutParams.setMarginStart((int) C9738o.m28708b(getContext(), 26.0f));
        C39466a aVar = this.f102441b;
        if (aVar == null) {
            C7573i.m23583a("centerView");
        }
        addView(aVar, layoutParams);
        this.f102442c.addUpdateListener(new C39469b(this));
        this.f102443d.addUpdateListener(new C39470c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m126044a(AudioRecordStartButton audioRecordStartButton) {
        ImageView imageView = audioRecordStartButton.f102440a;
        if (imageView == null) {
            C7573i.m23583a("bgView");
        }
        return imageView;
    }

    public AudioRecordStartButton(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m126045g();
    }

    public AudioRecordStartButton(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        m126045g();
    }

    public AudioRecordStartButton(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m126045g();
    }
}
