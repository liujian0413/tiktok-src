package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton */
public final class AdTextProgressButton extends View implements C19388d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66976a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdTextProgressButton.class), "idleColor", "getIdleColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdTextProgressButton.class), "loadingColor", "getLoadingColor()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdTextProgressButton.class), "rectPaint", "getRectPaint()Landroid/graphics/Paint;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdTextProgressButton.class), "textPaint", "getTextPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public final float f66977b;

    /* renamed from: c */
    private final float f66978c;

    /* renamed from: d */
    private ValueAnimator f66979d;

    /* renamed from: e */
    private final C7541d f66980e;

    /* renamed from: f */
    private final C7541d f66981f;

    /* renamed from: g */
    private int f66982g;

    /* renamed from: h */
    private int f66983h;

    /* renamed from: i */
    private String f66984i;

    /* renamed from: j */
    private final C7541d f66985j;

    /* renamed from: k */
    private final C7541d f66986k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton$a */
    static final class C25449a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AdTextProgressButton f66987a;

        /* renamed from: b */
        final /* synthetic */ long f66988b;

        C25449a(AdTextProgressButton adTextProgressButton, long j) {
            this.f66987a = adTextProgressButton;
            this.f66988b = j;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdTextProgressButton adTextProgressButton = this.f66987a;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                adTextProgressButton.setBgColor(((Integer) animatedValue).intValue());
                this.f66987a.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton$b */
    static final class C25450b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f66989a;

        C25450b(Context context) {
            this.f66989a = context;
            super(0);
        }

        /* renamed from: a */
        private int m83695a() {
            return this.f66989a.getResources().getColor(R.color.a79);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m83695a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton$c */
    static final class C25451c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f66990a;

        C25451c(Context context) {
            this.f66990a = context;
            super(0);
        }

        /* renamed from: a */
        private int m83696a() {
            return this.f66990a.getResources().getColor(R.color.a5o);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m83696a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton$d */
    static final class C25452d extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        public static final C25452d f66991a = new C25452d();

        C25452d() {
            super(0);
        }

        /* renamed from: a */
        private static Paint m83697a() {
            return new Paint();
        }

        public final /* synthetic */ Object invoke() {
            return m83697a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdTextProgressButton$e */
    static final class C25453e extends Lambda implements C7561a<Paint> {

        /* renamed from: a */
        final /* synthetic */ AdTextProgressButton f66992a;

        C25453e(AdTextProgressButton adTextProgressButton) {
            this.f66992a = adTextProgressButton;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(this.f66992a.f66977b * 13.0f);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.DEFAULT_BOLD);
            return paint;
        }
    }

    public AdTextProgressButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdTextProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final int getIdleColor() {
        return ((Number) this.f66980e.getValue()).intValue();
    }

    private final int getLoadingColor() {
        return ((Number) this.f66981f.getValue()).intValue();
    }

    private final Paint getRectPaint() {
        return (Paint) this.f66985j.getValue();
    }

    private final Paint getTextPaint() {
        return (Paint) this.f66986k.getValue();
    }

    public final int getBgColor() {
        return this.f66982g;
    }

    public final int getPercent() {
        return this.f66983h;
    }

    public final String getText() {
        return this.f66984i;
    }

    /* renamed from: b */
    private final boolean m83687b() {
        ValueAnimator valueAnimator = this.f66979d;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f66979d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    public final void mo51373a() {
        int idleColor = getIdleColor();
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        String string = context.getResources().getString(R.string.bt0);
        C7573i.m23582a((Object) string, "context.resources.getStr…ing.immediately_download)");
        m83686a(idleColor, string);
    }

    public final void setBgColor(int i) {
        this.f66982g = i;
    }

    public final void setPercent(int i) {
        this.f66983h = i;
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f66984i = str;
    }

    /* renamed from: b */
    public final void mo51377b(C19400e eVar) {
        int idleColor = getIdleColor();
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        String string = context.getResources().getString(R.string.bt2);
        C7573i.m23582a((Object) string, "context.resources.getStr…ing.immediately_open_app)");
        m83686a(idleColor, string);
    }

    /* renamed from: c */
    public final void mo51379c(C19400e eVar) {
        int idleColor = getIdleColor();
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        String string = context.getResources().getString(R.string.a5i);
        C7573i.m23582a((Object) string, "context.resources.getStr….string.click_to_install)");
        m83686a(idleColor, string);
    }

    /* renamed from: a */
    public final void mo51375a(C19400e eVar) {
        int loadingColor = getLoadingColor();
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        String string = context.getResources().getString(R.string.db6);
        C7573i.m23582a((Object) string, "context.resources.getString(R.string.re_download)");
        m83686a(loadingColor, string);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            getRectPaint().setColor(this.f66982g);
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(rectF, this.f66978c, this.f66978c, getRectPaint());
            if (this.f66983h > 0) {
                canvas.save();
                canvas.clipRect(new RectF(0.0f, 0.0f, (((float) this.f66983h) / 100.0f) * ((float) getWidth()), (float) getHeight()));
                canvas.drawRoundRect(rectF, this.f66978c, this.f66978c, getRectPaint());
                canvas.restore();
            }
            canvas.drawText(this.f66984i, ((float) getWidth()) / 2.0f, ((((float) getHeight()) - getTextPaint().getFontMetrics().top) - getTextPaint().getFontMetrics().bottom) / 2.0f, getTextPaint());
        }
    }

    /* renamed from: a */
    private void m83686a(int i, String str) {
        C7573i.m23587b(str, "text");
        this.f66982g = i;
        this.f66984i = str;
        invalidate();
    }

    /* renamed from: a */
    public final void mo51374a(C19387c cVar, C19384a aVar) {
        C7573i.m23587b(cVar, "downloadModel");
        m83685a(getIdleColor(), getLoadingColor(), 250);
    }

    /* renamed from: b */
    public final void mo51378b(C19400e eVar, int i) {
        int loadingColor = getLoadingColor();
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        String string = context.getResources().getString(R.string.agw);
        C7573i.m23582a((Object) string, "context.resources.getStr…string.continue_download)");
        m83686a(loadingColor, string);
    }

    /* renamed from: a */
    public final void mo51376a(C19400e eVar, int i) {
        if (m83687b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            this.f66984i = sb.toString();
            this.f66983h = i;
            invalidate();
            return;
        }
        this.f66982g = getLoadingColor();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append('%');
        this.f66984i = sb2.toString();
        this.f66983h = i;
        invalidate();
    }

    /* renamed from: a */
    private final void m83685a(int i, int i2, long j) {
        ValueAnimator valueAnimator = this.f66979d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f66979d = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ValueAnimator valueAnimator2 = this.f66979d;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(250);
            valueAnimator2.addUpdateListener(new C25449a(this, 250));
            valueAnimator2.start();
        }
    }

    public AdTextProgressButton(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "context.resources");
        this.f66977b = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f66978c = this.f66977b * 2.0f;
        this.f66980e = C7546e.m23569a(new C25450b(context));
        this.f66981f = C7546e.m23569a(new C25451c(context));
        this.f66982g = getLoadingColor();
        this.f66984i = "";
        this.f66985j = C7546e.m23569a(C25452d.f66991a);
        this.f66986k = C7546e.m23569a(new C25453e(this));
    }

    public /* synthetic */ AdTextProgressButton(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
