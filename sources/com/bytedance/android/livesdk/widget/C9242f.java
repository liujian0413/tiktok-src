package com.bytedance.android.livesdk.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.android.live.core.widget.HSImageView;

/* renamed from: com.bytedance.android.livesdk.widget.f */
public final class C9242f extends HSImageView {

    /* renamed from: a */
    private int f25344a;

    /* renamed from: b */
    private int f25345b;

    /* renamed from: c */
    private Bitmap f25346c;

    /* renamed from: d */
    private Boolean f25347d;

    /* renamed from: e */
    private int f25348e;

    /* renamed from: f */
    private Bitmap f25349f;

    /* renamed from: g */
    private boolean f25350g;

    /* renamed from: h */
    private Paint f25351h;

    public final void setAuthor(boolean z) {
        if (this.f25350g != z) {
            this.f25350g = z;
            invalidate();
        }
    }

    public final void setVResId(int i) {
        if (this.f25345b != i) {
            this.f25345b = i;
            this.f25346c = null;
            invalidate();
        }
    }

    public final void setVAble(boolean z) {
        if (this.f25347d.booleanValue() != z) {
            this.f25347d = Boolean.valueOf(z);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f25347d.booleanValue() || this.f25350g) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f25347d.booleanValue()) {
                if (this.f25346c == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f25345b);
                    if (decodeResource != null) {
                        this.f25346c = decodeResource;
                    }
                }
                if (this.f25346c != null) {
                    int width2 = (min - this.f25346c.getWidth()) - this.f25344a;
                    int height2 = min - this.f25346c.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f25346c, (float) width2, (float) height2, this.f25351h);
                }
            }
            if (this.f25350g) {
                if (this.f25349f == null) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f25348e);
                    if (decodeResource2 != null) {
                        this.f25349f = decodeResource2;
                    }
                }
                if (this.f25349f != null) {
                    Bitmap bitmap = this.f25349f;
                    canvas.drawBitmap(bitmap, (float) ((min - bitmap.getWidth()) / 2), (float) (min - this.f25349f.getHeight()), this.f25351h);
                }
            }
        }
    }
}
