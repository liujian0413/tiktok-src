package com.bytedance.lighten.loader;

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
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12138q;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.p698c.C13386a;

public class SmartCircleImageView extends SmartImageView {

    /* renamed from: a */
    public volatile boolean f32341a = true;

    /* renamed from: b */
    private Paint f32342b = new Paint();

    /* renamed from: c */
    private Bitmap f32343c;

    /* renamed from: d */
    private Drawable f32344d;

    /* renamed from: e */
    private Canvas f32345e;

    /* renamed from: f */
    private int f32346f;

    /* renamed from: g */
    private boolean f32347g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29857a() {
        super.mo29857a();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32884a(true);
        ((C13438a) getHierarchy()).mo32897a(roundingParams);
        ((C13438a) getHierarchy()).mo32896a(C13423b.f35599g);
        m35352d();
    }

    /* renamed from: d */
    private void m35352d() {
        Config config;
        if (this.f32347g) {
            this.f32344d = getDrawable();
            if (this.f32344d != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f32344d.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f32344d.getIntrinsicWidth();
                int intrinsicHeight = this.f32344d.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f32343c != null) {
                    if (intrinsicWidth == this.f32343c.getWidth() && intrinsicHeight == this.f32343c.getHeight()) {
                        if (this.f32345e != null) {
                            this.f32345e.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f32343c.isRecycled()) {
                        this.f32343c.recycle();
                    }
                }
                this.f32346f = intrinsicWidth / 2;
                this.f32343c = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f32345e = new Canvas(this.f32343c);
                this.f32344d.setBounds(0, 0, this.f32345e.getWidth(), this.f32345e.getHeight());
                Bitmap bitmap = this.f32343c;
                TileMode tileMode = TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f32342b.setAntiAlias(true);
                this.f32342b.setShader(bitmapShader);
            }
        }
    }

    public SmartCircleImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo29858a(C12138q qVar) {
        this.f32347g = qVar.f32268J;
        m35351b(qVar);
        super.mo29858a(qVar);
    }

    public void setController(C13386a aVar) {
        if (this.f32347g) {
            this.f32341a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    /* renamed from: b */
    private void m35351b(C12138q qVar) {
        if (this.f32347g) {
            final C12112j jVar = qVar.f32264F;
            if (jVar == null) {
                qVar.f32264F = new C12105c() {
                    /* renamed from: a */
                    public final void mo29812a(Uri uri, View view, Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                        SmartCircleImageView.this.f32341a = true;
                    }
                };
                return;
            }
            qVar.f32264F = new C12112j() {
                /* renamed from: a */
                public final void mo29801a(Uri uri) {
                    jVar.mo29801a(uri);
                }

                /* renamed from: a */
                public final void mo29802a(Uri uri, View view) {
                    jVar.mo29802a(uri, view);
                }

                /* renamed from: a */
                public final void mo29812a(Uri uri, View view, Throwable th) {
                    jVar.mo29812a(uri, view, th);
                }

                /* renamed from: a */
                public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                    SmartCircleImageView.this.f32341a = true;
                    jVar.mo29811a(uri, view, lVar, animatable);
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f32347g) {
            if (this.f32341a) {
                m35352d();
                this.f32341a = false;
            }
            if (!(this.f32344d == null || this.f32345e == null)) {
                this.f32344d.draw(this.f32345e);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f32346f, this.f32342b);
            return;
        }
        super.onDraw(canvas);
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m35352d();
    }
}
