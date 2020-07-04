package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.AVCutMusicView */
public class AVCutMusicView extends View {

    /* renamed from: a */
    public C39308b f102023a;

    /* renamed from: b */
    private Paint f102024b;

    /* renamed from: c */
    private float f102025c;

    /* renamed from: d */
    private int f102026d;

    /* renamed from: e */
    private int f102027e;

    /* renamed from: f */
    private int f102028f;

    /* renamed from: g */
    private AVMusicWaveBean f102029g;

    /* renamed from: h */
    private RectF f102030h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.AVCutMusicView$a */
    static final class C39295a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVCutMusicView f102031a;

        /* renamed from: b */
        final /* synthetic */ AVMusicWaveBean f102032b;

        C39295a(AVCutMusicView aVCutMusicView, AVMusicWaveBean aVMusicWaveBean) {
            this.f102031a = aVCutMusicView;
            this.f102032b = aVMusicWaveBean;
        }

        public final void run() {
            if (this.f102031a.f102023a != null) {
                this.f102031a.f102023a.mo97869a(this.f102032b.getMusicWavePointArray());
                this.f102031a.invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getMHeight() {
        return this.f102027e;
    }

    /* access modifiers changed from: protected */
    public final Paint getMPaint() {
        return this.f102024b;
    }

    /* access modifiers changed from: protected */
    public final AVMusicWaveBean getMusicWaveBean() {
        return this.f102029g;
    }

    public final int getViewWidth() {
        return this.f102026d;
    }

    /* access modifiers changed from: protected */
    public final void setMHeight(int i) {
        this.f102027e = i;
    }

    /* access modifiers changed from: protected */
    public final void setMusicWaveBean(AVMusicWaveBean aVMusicWaveBean) {
        this.f102029g = aVMusicWaveBean;
    }

    public final void setViewWidth(int i) {
        this.f102026d = i;
    }

    /* access modifiers changed from: protected */
    public final void setMPaint(Paint paint) {
        C7573i.m23587b(paint, "<set-?>");
        this.f102024b = paint;
    }

    public AVCutMusicView(Context context) {
        C7573i.m23587b(context, "ctx");
        this(context, null, 0, 4, null);
    }

    public void setAudioWaveViewData(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            this.f102029g = aVMusicWaveBean;
            post(new C39295a(this, aVMusicWaveBean));
        }
    }

    public final void setColor(int i) {
        this.f102024b.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        canvas.save();
        this.f102023a.mo97867a(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(m125562a(0.0f, 0.0f, ((float) this.f102028f) + (this.f102025c * ((float) getWidth())), (float) getHeight()));
        this.f102023a.mo97868a(canvas, this.f102024b);
    }

    /* renamed from: a */
    public final void mo97803a(int i, float f) {
        this.f102028f = i;
        this.f102025c = f;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        if (this.f102029g != null) {
            AVMusicWaveBean aVMusicWaveBean = this.f102029g;
            if (aVMusicWaveBean == null) {
                C7573i.m23580a();
            }
            if (C39314b.m125640a(aVMusicWaveBean.getMusicWavePointArray())) {
                int i3 = C39314b.m125637a().f102116a;
                C39312e a = C39314b.m125637a();
                if (a == null) {
                    C7573i.m23580a();
                }
                int i4 = a.f102117b;
                AVMusicWaveBean aVMusicWaveBean2 = this.f102029g;
                if (aVMusicWaveBean2 == null) {
                    C7573i.m23580a();
                }
                this.f102026d = ((aVMusicWaveBean2.getMusicWavePointArray().length - 1) * (i3 + i4)) + i4;
                C39312e a2 = C39314b.m125637a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                this.f102027e = a2.f102118c;
                setMeasuredDimension(this.f102026d, this.f102027e);
                this.f102023a.mo97865a(this.f102026d, this.f102027e);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public AVCutMusicView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f102030h = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f102024b = new Paint(1);
        this.f102024b.setStyle(Style.FILL);
        this.f102024b.setColor(color);
        this.f102023a = new C39308b();
        this.f102023a.mo97866a(context);
        this.f102023a.f102104c = false;
    }

    /* renamed from: a */
    private final RectF m125562a(float f, float f2, float f3, float f4) {
        this.f102030h.set(0.0f, 0.0f, f3, f4);
        return this.f102030h;
    }

    private /* synthetic */ AVCutMusicView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
