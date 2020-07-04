package com.p280ss.android.ugc.aweme.p984ad.common.legacy.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p698c.C13386a;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.e */
public class C22444e extends C22439a {

    /* renamed from: c */
    public volatile boolean f59851c;

    /* renamed from: d */
    private Paint f59852d;

    /* renamed from: e */
    private Bitmap f59853e;

    /* renamed from: f */
    private Drawable f59854f;

    /* renamed from: g */
    private BitmapShader f59855g;

    /* renamed from: h */
    private Canvas f59856h;

    /* renamed from: i */
    private int f59857i;

    /* renamed from: j */
    private boolean f59858j;

    /* renamed from: a */
    private void m74295a() {
        Config config;
        if (this.f59858j) {
            this.f59854f = getDrawable();
            if (this.f59854f != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f59854f.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f59854f.getIntrinsicWidth();
                int intrinsicHeight = this.f59854f.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f59853e != null) {
                    if (intrinsicWidth == this.f59853e.getWidth() && intrinsicHeight == this.f59853e.getHeight()) {
                        if (this.f59856h != null) {
                            this.f59856h.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f59853e.isRecycled()) {
                        this.f59853e.recycle();
                    }
                }
                this.f59857i = intrinsicWidth / 2;
                this.f59853e = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f59856h = new Canvas(this.f59853e);
                this.f59854f.setBounds(0, 0, this.f59856h.getWidth(), this.f59856h.getHeight());
                Bitmap bitmap = this.f59853e;
                TileMode tileMode = TileMode.CLAMP;
                this.f59855g = new BitmapShader(bitmap, tileMode, tileMode);
                this.f59852d.setAntiAlias(true);
                this.f59852d.setShader(this.f59855g);
            }
        }
    }

    public void setController(C13386a aVar) {
        if (this.f59858j) {
            this.f59851c = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f59858j) {
            if (this.f59851c) {
                m74295a();
                this.f59851c = false;
            }
            if (!(this.f59854f == null || this.f59856h == null)) {
                this.f59854f.draw(this.f59856h);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f59857i, this.f59852d);
            return;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m74295a();
    }
}
