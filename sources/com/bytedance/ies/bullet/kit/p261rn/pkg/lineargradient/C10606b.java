package com.bytedance.ies.bullet.kit.p261rn.pkg.lineargradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.lineargradient.b */
public final class C10606b extends View {

    /* renamed from: a */
    private final Paint f28425a = new Paint(1);

    /* renamed from: b */
    private Path f28426b;

    /* renamed from: c */
    private RectF f28427c;

    /* renamed from: d */
    private float[] f28428d;

    /* renamed from: e */
    private float[] f28429e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f28430f = {0.0f, 1.0f};

    /* renamed from: g */
    private int[] f28431g;

    /* renamed from: h */
    private int[] f28432h = {0, 0};

    /* renamed from: i */
    private float[] f28433i = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: b */
    private void m31023b() {
        if (this.f28426b == null) {
            this.f28426b = new Path();
            this.f28427c = new RectF();
        }
        this.f28426b.reset();
        this.f28427c.set(0.0f, 0.0f, (float) this.f28432h[0], (float) this.f28432h[1]);
        this.f28426b.addRoundRect(this.f28427c, this.f28433i, Direction.CW);
    }

    /* renamed from: a */
    private void m31022a() {
        if (this.f28431g != null && (this.f28428d == null || this.f28431g.length == this.f28428d.length)) {
            LinearGradient linearGradient = new LinearGradient(((float) this.f28432h[0]) * this.f28429e[0], this.f28429e[1] * ((float) this.f28432h[1]), this.f28430f[0] * ((float) this.f28432h[0]), this.f28430f[1] * ((float) this.f28432h[1]), this.f28431g, this.f28428d, TileMode.CLAMP);
            this.f28425a.setShader(linearGradient);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f28426b == null) {
            canvas.drawPaint(this.f28425a);
        } else {
            canvas.drawPath(this.f28426b, this.f28425a);
        }
    }

    public final void setColors(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f28431g = iArr;
        m31022a();
    }

    public final void setEndPosition(ReadableArray readableArray) {
        this.f28430f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m31022a();
    }

    public final void setLocations(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f28428d = fArr;
        m31022a();
    }

    public final void setStartPosition(ReadableArray readableArray) {
        this.f28429e = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m31022a();
    }

    public final void setBorderRadii(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i));
        }
        this.f28433i = fArr;
        m31023b();
        m31022a();
    }

    public C10606b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f28432h = new int[]{i, i2};
        m31023b();
        m31022a();
    }
}
