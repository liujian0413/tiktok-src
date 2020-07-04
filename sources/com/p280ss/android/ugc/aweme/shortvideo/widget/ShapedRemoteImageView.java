package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView */
public class ShapedRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private int f108376a;

    /* renamed from: b */
    private float f108377b;

    /* renamed from: c */
    private int f108378c = 637534208;

    /* renamed from: d */
    private float f108379d;

    /* renamed from: e */
    private boolean f108380e;

    /* renamed from: f */
    private Path f108381f;

    /* renamed from: g */
    private Shape f108382g;

    /* renamed from: h */
    private Shape f108383h;

    /* renamed from: i */
    private Paint f108384i;

    /* renamed from: j */
    private Paint f108385j;

    /* renamed from: k */
    private Paint f108386k;

    /* renamed from: l */
    private Bitmap f108387l;

    /* renamed from: m */
    private C41667a f108388m;

    /* renamed from: n */
    private PorterDuffXfermode f108389n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView$a */
    public interface C41667a {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m132683c();
    }

    /* renamed from: c */
    private void m132683c() {
        if (this.f108387l != null) {
            this.f108387l.recycle();
            this.f108387l = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f108387l == null) {
            m132681b();
        }
    }

    /* renamed from: b */
    private Bitmap m132681b() {
        if (this.f108379d <= 0.0f) {
            return null;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return null;
        }
        m132683c();
        this.f108387l = Bitmap.createBitmap(measuredWidth, measuredHeight, Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f108387l);
        Paint paint = new Paint(1);
        paint.setColor(this.f108378c);
        canvas.drawRect(new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight), paint);
        return this.f108387l;
    }

    public void setExtension(C41667a aVar) {
        this.f108388m = aVar;
        requestLayout();
    }

    public void setShapeMode(int i) {
        m132682b(i, this.f108377b);
    }

    public void setShapeRadius(float f) {
        m132682b(this.f108376a, f);
    }

    public void setStrokeColor(int i) {
        m132679a(i, this.f108379d);
    }

    public void setStrokeWidth(float f) {
        m132679a(this.f108378c, f);
    }

    public ShapedRemoteImageView(Context context) {
        super(context);
        m132680a(null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!(this.f108379d <= 0.0f || this.f108383h == null || this.f108387l == null)) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
            this.f108385j.setXfermode(null);
            canvas.drawBitmap(this.f108387l, 0.0f, 0.0f, this.f108385j);
            canvas.translate(this.f108379d, this.f108379d);
            if (this.f108389n == null) {
                this.f108389n = new PorterDuffXfermode(Mode.DST_OUT);
            }
            this.f108385j.setXfermode(this.f108389n);
            this.f108383h.draw(canvas, this.f108385j);
            canvas.restoreToCount(saveLayer);
        }
        if (this.f108388m != null) {
            canvas.drawPath(this.f108381f, this.f108386k);
        }
        switch (this.f108376a) {
            case 1:
            case 2:
                if (this.f108382g != null) {
                    this.f108382g.draw(canvas, this.f108384i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m132680a(AttributeSet attributeSet) {
        if (VERSION.SDK_INT >= 11) {
            setLayerType(2, null);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ShapedRemoteImageView);
            this.f108376a = obtainStyledAttributes.getInt(1, 0);
            this.f108377b = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f108379d = obtainStyledAttributes.getDimension(3, 0.0f);
            this.f108378c = obtainStyledAttributes.getColor(2, this.f108378c);
            obtainStyledAttributes.recycle();
        }
        this.f108384i = new Paint(1);
        this.f108384i.setFilterBitmap(true);
        this.f108384i.setColor(-16777216);
        this.f108384i.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f108385j = new Paint(1);
        this.f108385j.setFilterBitmap(true);
        this.f108385j.setColor(-16777216);
        this.f108386k = new Paint(1);
        this.f108386k.setFilterBitmap(true);
        this.f108386k.setColor(-16777216);
        this.f108386k.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f108381f = new Path();
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m132680a(attributeSet);
    }

    /* renamed from: a */
    private void m132679a(int i, float f) {
        if (this.f108379d > 0.0f) {
            if (this.f108379d != f) {
                this.f108379d = f;
                this.f108383h.resize(((float) getMeasuredWidth()) - (this.f108379d * 2.0f), ((float) getMeasuredHeight()) - (this.f108379d * 2.0f));
                postInvalidate();
            }
            if (this.f108378c != i) {
                this.f108378c = i;
                m132681b();
                postInvalidate();
            }
        }
    }

    /* renamed from: b */
    private void m132682b(int i, float f) {
        boolean z;
        if (this.f108376a == i && this.f108377b == f) {
            z = false;
        } else {
            z = true;
        }
        this.f108380e = z;
        if (this.f108380e) {
            this.f108376a = i;
            this.f108377b = f;
            this.f108382g = null;
            this.f108383h = null;
            requestLayout();
        }
    }

    public ShapedRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m132680a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.f108380e) {
            this.f108380e = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            switch (this.f108376a) {
                case 2:
                    this.f108377b = ((float) Math.min(measuredWidth, measuredHeight)) / 2.0f;
                    break;
            }
            if (this.f108382g == null || this.f108377b != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.f108377b);
                this.f108382g = new RoundRectShape(fArr, null, null);
                this.f108383h = new RoundRectShape(fArr, null, null);
            }
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            this.f108382g.resize(f, f2);
            this.f108383h.resize(f - (this.f108379d * 2.0f), f2 - (this.f108379d * 2.0f));
            m132681b();
        }
    }
}
