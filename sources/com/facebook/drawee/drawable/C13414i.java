package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.drawee.drawable.i */
public final class C13414i extends C13412g {

    /* renamed from: a */
    final Matrix f35535a;

    /* renamed from: b */
    private int f35536b;

    /* renamed from: c */
    private int f35537c;

    /* renamed from: d */
    private final Matrix f35538d = new Matrix();

    /* renamed from: e */
    private final RectF f35539e = new RectF();

    public final int getIntrinsicHeight() {
        if (this.f35537c == 5 || this.f35537c == 7 || this.f35536b % NormalGiftView.ALPHA_180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f35537c == 5 || this.f35537c == 7 || this.f35536b % NormalGiftView.ALPHA_180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f35535a.isIdentity()) {
            matrix.preConcat(this.f35535a);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f35536b > 0 || !(this.f35537c == 0 || this.f35537c == 1)) {
            int save = canvas.save();
            canvas.concat(this.f35535a);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f35536b > 0 || !(this.f35537c == 0 || this.f35537c == 1)) {
            int i = this.f35537c;
            if (i == 2) {
                this.f35535a.setScale(-1.0f, 1.0f);
            } else if (i != 7) {
                switch (i) {
                    case 4:
                        this.f35535a.setScale(1.0f, -1.0f);
                        break;
                    case 5:
                        this.f35535a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                        this.f35535a.postScale(1.0f, -1.0f);
                        break;
                    default:
                        this.f35535a.setRotate((float) this.f35536b, (float) rect.centerX(), (float) rect.centerY());
                        break;
                }
            } else {
                this.f35535a.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f35535a.postScale(-1.0f, 1.0f);
            }
            this.f35538d.reset();
            this.f35535a.invert(this.f35538d);
            this.f35539e.set(rect);
            this.f35538d.mapRect(this.f35539e);
            current.setBounds((int) this.f35539e.left, (int) this.f35539e.top, (int) this.f35539e.right, (int) this.f35539e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public C13414i(Drawable drawable, int i, int i2) {
        boolean z;
        super(drawable);
        boolean z2 = false;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 >= 0 && i2 <= 8) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        this.f35535a = new Matrix();
        this.f35536b = i;
        this.f35537c = i2;
    }
}
