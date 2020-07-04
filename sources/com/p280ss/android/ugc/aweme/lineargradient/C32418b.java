package com.p280ss.android.ugc.aweme.lineargradient;

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

/* renamed from: com.ss.android.ugc.aweme.lineargradient.b */
public final class C32418b extends View {

    /* renamed from: a */
    private final Paint f84535a = new Paint(1);

    /* renamed from: b */
    private Path f84536b;

    /* renamed from: c */
    private RectF f84537c;

    /* renamed from: d */
    private float[] f84538d;

    /* renamed from: e */
    private float[] f84539e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f84540f = {0.0f, 1.0f};

    /* renamed from: g */
    private int[] f84541g;

    /* renamed from: h */
    private int[] f84542h = {0, 0};

    /* renamed from: i */
    private float[] f84543i = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: b */
    private void m105003b() {
        if (this.f84536b == null) {
            this.f84536b = new Path();
            this.f84537c = new RectF();
        }
        this.f84536b.reset();
        this.f84537c.set(0.0f, 0.0f, (float) this.f84542h[0], (float) this.f84542h[1]);
        this.f84536b.addRoundRect(this.f84537c, this.f84543i, Direction.CW);
    }

    /* renamed from: a */
    private void m105002a() {
        if (this.f84541g != null && (this.f84538d == null || this.f84541g.length == this.f84538d.length)) {
            LinearGradient linearGradient = new LinearGradient(((float) this.f84542h[0]) * this.f84539e[0], this.f84539e[1] * ((float) this.f84542h[1]), this.f84540f[0] * ((float) this.f84542h[0]), this.f84540f[1] * ((float) this.f84542h[1]), this.f84541g, this.f84538d, TileMode.CLAMP);
            this.f84535a.setShader(linearGradient);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f84536b == null) {
            canvas.drawPaint(this.f84535a);
        } else {
            canvas.drawPath(this.f84536b, this.f84535a);
        }
    }

    public final void setColors(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f84541g = iArr;
        m105002a();
    }

    public final void setEndPosition(ReadableArray readableArray) {
        this.f84540f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m105002a();
    }

    public final void setLocations(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f84538d = fArr;
        m105002a();
    }

    public final void setStartPosition(ReadableArray readableArray) {
        this.f84539e = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m105002a();
    }

    public final void setBorderRadii(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i));
        }
        this.f84543i = fArr;
        m105003b();
        m105002a();
    }

    public C32418b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f84542h = new int[]{i, i2};
        m105003b();
        m105002a();
    }
}
