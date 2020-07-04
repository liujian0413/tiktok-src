package com.p280ss.android.ugc.aweme.commercialize.p1115ad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.AdRatingView */
public final class AdRatingView extends View {

    /* renamed from: a */
    private Drawable f64683a;

    /* renamed from: b */
    private Drawable f64684b;

    /* renamed from: c */
    private float f64685c;

    /* renamed from: d */
    private int f64686d;

    /* renamed from: e */
    private int f64687e;

    public AdRatingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getRatingDivide() {
        return this.f64687e;
    }

    public final Drawable getRatingImage() {
        return this.f64684b;
    }

    public final float getRatingProgress() {
        return this.f64685c;
    }

    public final int getRatingStarNumber() {
        return this.f64686d;
    }

    public final Drawable getRatingUnImage() {
        return this.f64683a;
    }

    public final void setRatingDivide(int i) {
        this.f64687e = i;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.f64685c = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.f64686d = i;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        C7573i.m23587b(drawable, "value");
        this.f64684b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        C7573i.m23587b(drawable, "value");
        this.f64683a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float intrinsicHeight = ((float) ((((int) this.f64685c) * this.f64683a.getIntrinsicHeight()) + (((int) this.f64685c) * this.f64687e))) + ((this.f64685c - ((float) ((int) this.f64685c))) * ((float) this.f64683a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f64684b.getIntrinsicHeight());
            int i = this.f64686d;
            for (int i2 = 0; i2 < i; i2++) {
                int intrinsicWidth = (this.f64684b.getIntrinsicWidth() * i2) + (this.f64687e * i2);
                this.f64684b.setBounds(intrinsicWidth, 0, this.f64684b.getIntrinsicWidth() + intrinsicWidth, this.f64684b.getIntrinsicHeight());
                this.f64684b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f64683a.getIntrinsicHeight());
            int i3 = this.f64686d;
            for (int i4 = 0; i4 < i3; i4++) {
                int intrinsicWidth2 = (this.f64683a.getIntrinsicWidth() * i4) + (this.f64687e * i4);
                this.f64683a.setBounds(intrinsicWidth2, 0, this.f64683a.getIntrinsicWidth() + intrinsicWidth2, this.f64683a.getIntrinsicHeight());
                this.f64683a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            i3 = (this.f64683a.getIntrinsicWidth() * this.f64686d) + ((this.f64686d - 1) * this.f64687e);
        } else if (mode == 0) {
            i3 = MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = MeasureSpec.getSize(i);
        }
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = this.f64683a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i4 = MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    public AdRatingView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        if (VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.bk8, null);
            C7573i.m23582a((Object) drawable, "context.resources.getDra…le.star_un_shining, null)");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.bk8);
            C7573i.m23582a((Object) drawable, "context.resources.getDra…drawable.star_un_shining)");
        }
        this.f64683a = drawable;
        if (VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(R.drawable.bk7, null);
            C7573i.m23582a((Object) drawable2, "context.resources.getDra…wable.star_shining, null)");
        } else {
            drawable2 = context.getResources().getDrawable(R.drawable.bk7);
            C7573i.m23582a((Object) drawable2, "context.resources.getDra…(R.drawable.star_shining)");
        }
        this.f64684b = drawable2;
        this.f64686d = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AdRatingView);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f64685c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f64686d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f64687e));
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
