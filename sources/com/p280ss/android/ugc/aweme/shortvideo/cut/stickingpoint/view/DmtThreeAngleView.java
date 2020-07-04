package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView */
public final class DmtThreeAngleView extends View {

    /* renamed from: a */
    public static final C39211a f101633a = new C39211a(null);

    /* renamed from: b */
    private int f101634b;

    /* renamed from: c */
    private int f101635c;

    /* renamed from: d */
    private int f101636d;

    /* renamed from: e */
    private final Paint f101637e;

    /* renamed from: f */
    private final Path f101638f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView$a */
    public static final class C39211a {
        private C39211a() {
        }

        public /* synthetic */ C39211a(C7571f fVar) {
            this();
        }
    }

    public DmtThreeAngleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOrientation(int i) {
        this.f101636d = i;
    }

    public final void setBgColor(int i) {
        this.f101637e.setColor(i);
    }

    public final void setRoundRadius(int i) {
        this.f101637e.setPathEffect(new CornerPathEffect((float) i));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f101636d == 1) {
            this.f101638f.moveTo(0.0f, (float) this.f101635c);
            this.f101638f.lineTo((float) (this.f101634b / 2), 0.0f);
            this.f101638f.lineTo((float) this.f101634b, (float) this.f101635c);
            this.f101638f.lineTo((float) this.f101634b, (float) this.f101635c);
            this.f101638f.lineTo(0.0f, (float) this.f101635c);
            this.f101638f.lineTo(0.0f, (float) this.f101635c);
        } else if (this.f101636d == 2) {
            this.f101638f.moveTo(0.0f, 0.0f);
            this.f101638f.lineTo((float) (this.f101634b / 2), (float) this.f101635c);
            this.f101638f.lineTo((float) this.f101634b, (float) this.f101635c);
            this.f101638f.lineTo(0.0f, 0.0f);
        } else if (this.f101636d == 3) {
            this.f101638f.moveTo((float) this.f101634b, 0.0f);
            this.f101638f.lineTo((float) this.f101634b, (float) this.f101635c);
            this.f101638f.lineTo(0.0f, (float) (this.f101635c / 2));
            this.f101638f.lineTo((float) this.f101634b, 0.0f);
        } else if (this.f101636d == 4) {
            this.f101638f.moveTo(0.0f, 0.0f);
            this.f101638f.lineTo((float) this.f101634b, (float) (this.f101635c / 2));
            this.f101638f.lineTo(0.0f, (float) this.f101635c);
            this.f101638f.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.f101638f, this.f101637e);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f101634b = MeasureSpec.getSize(i);
        this.f101635c = MeasureSpec.getSize(i2);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f101636d = 1;
        this.f101637e = new Paint();
        this.f101638f = new Path();
        this.f101637e.setAntiAlias(true);
    }

    public /* synthetic */ DmtThreeAngleView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
