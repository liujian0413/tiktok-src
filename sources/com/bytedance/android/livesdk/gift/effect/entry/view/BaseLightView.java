package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BaseLightView extends View {

    /* renamed from: a */
    private boolean f21804a;

    /* renamed from: b */
    private boolean f21805b;

    /* renamed from: c */
    private Matrix f21806c;

    /* renamed from: d */
    private float f21807d;

    /* renamed from: e */
    private Shader f21808e;

    /* renamed from: f */
    private Shader f21809f;

    /* renamed from: g */
    private ComposeShader f21810g;

    /* renamed from: h */
    private Matrix f21811h;

    /* renamed from: i */
    private Paint f21812i;

    /* renamed from: j */
    private Paint f21813j;

    /* renamed from: k */
    private Canvas f21814k;

    /* renamed from: l */
    private RectF f21815l;

    /* renamed from: m */
    private Bitmap f21816m;

    /* renamed from: n */
    private float f21817n;

    /* renamed from: o */
    private float f21818o;

    /* renamed from: a */
    public final void mo20949a() {
        this.f21805b = true;
        m24614c();
        invalidate();
    }

    /* renamed from: b */
    private void m24613b() {
        this.f21812i = new Paint();
        this.f21812i.setAntiAlias(true);
        this.f21813j = new Paint();
        this.f21813j.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f21806c = new Matrix();
        this.f21811h = new Matrix();
        this.f21811h.setTranslate(1.0f, 0.0f);
        this.f21817n = (float) getWidth();
        this.f21818o = (float) getHeight();
        this.f21815l = new RectF(0.0f, 0.0f, this.f21817n, this.f21818o);
    }

    /* renamed from: c */
    private void m24614c() {
        int color = getResources().getColor(R.color.arm);
        int color2 = getResources().getColor(R.color.aro);
        int color3 = getResources().getColor(R.color.arn);
        this.f21815l = new RectF(0.0f, 0.0f, this.f21817n, this.f21818o);
        this.f21806c = new Matrix();
        this.f21807d = this.f21817n;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f21817n, this.f21818o, color, color, TileMode.CLAMP);
        this.f21808e = linearGradient;
        int[] iArr = {color3, color2, color2, color3};
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 60.0f, 14.0f, iArr, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, TileMode.CLAMP);
        this.f21809f = linearGradient2;
        this.f21810g = new ComposeShader(this.f21808e, this.f21809f, Mode.DST_ATOP);
        this.f21816m = Bitmap.createBitmap((int) this.f21817n, (int) this.f21818o, Config.ARGB_8888);
        this.f21814k = new Canvas(this.f21816m);
        this.f21808e.setLocalMatrix(this.f21811h);
        this.f21809f.setLocalMatrix(this.f21811h);
        this.f21810g.setLocalMatrix(this.f21811h);
    }

    public BaseLightView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f21804a && this.f21805b) {
            m24612a(canvas);
        }
    }

    /* renamed from: a */
    private void m24612a(Canvas canvas) {
        this.f21814k.drawPaint(this.f21813j);
        this.f21807d -= 30.0f;
        this.f21806c.setTranslate(this.f21807d, 0.0f);
        this.f21809f.setLocalMatrix(this.f21806c);
        this.f21810g = new ComposeShader(this.f21808e, this.f21809f, Mode.DST_ATOP);
        this.f21810g.setLocalMatrix(this.f21811h);
        this.f21812i.setShader(this.f21810g);
        this.f21814k.drawRoundRect(this.f21815l, 10.0f, 10.0f, this.f21812i);
        this.f21812i.setAlpha(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        canvas.drawBitmap(this.f21816m, 0.0f, 0.0f, this.f21812i);
        if (this.f21807d <= (-this.f21817n) / 2.0f) {
            this.f21805b = false;
        }
        if (this.f21807d > (-this.f21817n) / 2.0f) {
            postInvalidateDelayed(20);
        }
    }

    public BaseLightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21817n = (float) MeasureSpec.getSize(i);
        this.f21818o = (float) MeasureSpec.getSize(i2);
    }

    public BaseLightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24613b();
    }
}
