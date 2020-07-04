package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.p720g.C13648f;

/* renamed from: com.ss.android.ugc.aweme.views.CircleDraweeView */
public class CircleDraweeView extends AnimateDraweeView {

    /* renamed from: a */
    public volatile boolean f112216a = true;

    /* renamed from: b */
    private Paint f112217b = new Paint();

    /* renamed from: c */
    private Bitmap f112218c;

    /* renamed from: d */
    private Drawable f112219d;

    /* renamed from: e */
    private BitmapShader f112220e;

    /* renamed from: f */
    private Canvas f112221f;

    /* renamed from: g */
    private int f112222g;

    /* renamed from: h */
    private boolean f112223h = false;

    /* renamed from: i */
    private C13401d<C13648f> f112224i = new C13400c<C13648f>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            CircleDraweeView.this.f112216a = true;
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo105163b() {
        invalidate();
    }

    /* renamed from: a */
    public final void mo16940a() {
        super.mo16940a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32884a(true);
        ((C13438a) getHierarchy()).mo32897a(roundingParams);
        ((C13438a) getHierarchy()).mo32896a(C13423b.f35599g);
        m137561c();
    }

    /* renamed from: c */
    private void m137561c() {
        Config config;
        if (this.f112223h) {
            this.f112219d = getDrawable();
            if (this.f112219d != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f112219d.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f112219d.getIntrinsicWidth();
                int intrinsicHeight = this.f112219d.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f112218c != null) {
                    if (intrinsicWidth == this.f112218c.getWidth() && intrinsicHeight == this.f112218c.getHeight()) {
                        if (this.f112221f != null) {
                            this.f112221f.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f112218c.isRecycled()) {
                        this.f112218c.recycle();
                    }
                }
                this.f112222g = intrinsicWidth / 2;
                this.f112218c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f112221f = new Canvas(this.f112218c);
                this.f112219d.setBounds(0, 0, this.f112221f.getWidth(), this.f112221f.getHeight());
                Bitmap bitmap = this.f112218c;
                TileMode tileMode = TileMode.CLAMP;
                this.f112220e = new BitmapShader(bitmap, tileMode, tileMode);
                this.f112217b.setAntiAlias(true);
                this.f112217b.setShader(this.f112220e);
            }
        }
    }

    public void setController(C13386a aVar) {
        if (this.f112223h) {
            this.f112216a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleDraweeView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f112223h) {
            if (this.f112216a) {
                m137561c();
                this.f112216a = false;
            }
            if (!(this.f112219d == null || this.f112221f == null)) {
                this.f112219d.draw(this.f112221f);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f112222g, this.f112217b);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public final void mo105162a(boolean z, boolean z2) {
        this.f112223h = z;
        if (z2) {
            post(new C43360a(this));
        }
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleDraweeView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public CircleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m137561c();
    }
}
