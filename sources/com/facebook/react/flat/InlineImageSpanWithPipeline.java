package com.facebook.react.flat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.p728a.C13854a;

final class InlineImageSpanWithPipeline extends ReplacementSpan implements AttachDetachListener, BitmapUpdateListener {
    private static final RectF TMP_RECT = new RectF();
    private InvalidateCallback mCallback;
    private boolean mFrozen;
    private float mHeight;
    private PipelineRequestHelper mRequestHelper;
    private float mWidth;

    /* access modifiers changed from: 0000 */
    public final void freeze() {
        this.mFrozen = true;
    }

    /* access modifiers changed from: 0000 */
    public final float getHeight() {
        return this.mHeight;
    }

    /* access modifiers changed from: 0000 */
    public final float getWidth() {
        return this.mWidth;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isFrozen() {
        return this.mFrozen;
    }

    public final void onImageLoadEvent(int i) {
    }

    InlineImageSpanWithPipeline() {
        this(null, Float.NaN, Float.NaN);
    }

    /* access modifiers changed from: 0000 */
    public final boolean hasImageRequest() {
        if (this.mRequestHelper != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final InlineImageSpanWithPipeline mutableCopy() {
        return new InlineImageSpanWithPipeline(this.mRequestHelper, this.mWidth, this.mHeight);
    }

    public final void onDetached() {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.detach();
            if (this.mRequestHelper.isDetached()) {
                this.mCallback = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void setHeight(float f) {
        this.mHeight = f;
    }

    /* access modifiers changed from: 0000 */
    public final void setWidth(float f) {
        this.mWidth = f;
    }

    public final void onAttached(InvalidateCallback invalidateCallback) {
        this.mCallback = invalidateCallback;
        if (this.mRequestHelper != null) {
            this.mRequestHelper.attach(this);
        }
    }

    public final void onBitmapReady(Bitmap bitmap) {
        ((InvalidateCallback) C13854a.m40912a(this.mCallback)).invalidate();
    }

    public final void onSecondaryAttach(Bitmap bitmap) {
        ((InvalidateCallback) C13854a.m40912a(this.mCallback)).invalidate();
    }

    /* access modifiers changed from: 0000 */
    public final void setImageRequest(ImageRequest imageRequest) {
        if (imageRequest == null) {
            this.mRequestHelper = null;
        } else {
            this.mRequestHelper = new PipelineRequestHelper(imageRequest);
        }
    }

    private InlineImageSpanWithPipeline(PipelineRequestHelper pipelineRequestHelper, float f, float f2) {
        this.mRequestHelper = pipelineRequestHelper;
        this.mWidth = f;
        this.mHeight = f2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -Math.round(this.mHeight);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return Math.round(this.mWidth);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.mRequestHelper != null) {
            Bitmap bitmap = this.mRequestHelper.getBitmap();
            if (bitmap != null) {
                float f2 = ((float) i5) - ((float) paint.getFontMetricsInt().descent);
                TMP_RECT.set(f, f2 - this.mHeight, this.mWidth + f, f2);
                canvas.drawBitmap(bitmap, null, TMP_RECT, paint);
            }
        }
    }
}
