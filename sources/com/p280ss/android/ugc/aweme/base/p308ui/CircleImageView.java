package com.p280ss.android.ugc.aweme.base.p308ui;

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

/* renamed from: com.ss.android.ugc.aweme.base.ui.CircleImageView */
public class CircleImageView extends AnimatedImageView {

    /* renamed from: e */
    public volatile boolean f61669e = true;

    /* renamed from: f */
    private Paint f61670f = new Paint();

    /* renamed from: g */
    private Bitmap f61671g;

    /* renamed from: h */
    private Drawable f61672h;

    /* renamed from: i */
    private BitmapShader f61673i;

    /* renamed from: j */
    private Canvas f61674j;

    /* renamed from: k */
    private int f61675k;

    /* renamed from: l */
    private boolean f61676l = false;

    /* renamed from: m */
    private C13401d<C13648f> f61677m = new C13400c<C13648f>() {
        public final void onFailure(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            CircleImageView.this.f61669e = true;
        }
    };

    public C13401d<C13648f> getControllerListener() {
        return this.f61677m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16940a() {
        super.mo16940a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32884a(true);
        ((C13438a) getHierarchy()).mo32897a(roundingParams);
        ((C13438a) getHierarchy()).mo32896a(C13423b.f35599g);
        m76806d();
    }

    /* renamed from: d */
    private void m76806d() {
        Config config;
        if (this.f61676l) {
            this.f61672h = getDrawable();
            if (this.f61672h != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f61672h.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f61672h.getIntrinsicWidth();
                int intrinsicHeight = this.f61672h.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f61671g != null) {
                    if (intrinsicWidth == this.f61671g.getWidth() && intrinsicHeight == this.f61671g.getHeight()) {
                        if (this.f61674j != null) {
                            this.f61674j.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f61671g.isRecycled()) {
                        this.f61671g.recycle();
                    }
                }
                this.f61675k = intrinsicWidth / 2;
                this.f61671g = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f61674j = new Canvas(this.f61671g);
                this.f61672h.setBounds(0, 0, this.f61674j.getWidth(), this.f61674j.getHeight());
                Bitmap bitmap = this.f61671g;
                TileMode tileMode = TileMode.CLAMP;
                this.f61673i = new BitmapShader(bitmap, tileMode, tileMode);
                this.f61670f.setAntiAlias(true);
                this.f61670f.setShader(this.f61673i);
            }
        }
    }

    public void setController(C13386a aVar) {
        if (this.f61676l) {
            this.f61669e = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    public CircleImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f61676l) {
            if (this.f61669e) {
                m76806d();
                this.f61669e = false;
            }
            if (!(this.f61672h == null || this.f61674j == null)) {
                this.f61672h.draw(this.f61674j);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f61675k, this.f61670f);
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public final void mo60914a(boolean z, boolean z2) {
        this.f61676l = z;
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleImageView(Context context, C13438a aVar) {
        super(context, aVar);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m76806d();
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
