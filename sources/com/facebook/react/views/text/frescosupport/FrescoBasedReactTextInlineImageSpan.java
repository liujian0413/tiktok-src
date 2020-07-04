package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.text.TextInlineImageSpan;

public class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {
    private final Object mCallerContext;
    private Drawable mDrawable;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private final C13445b<C13438a> mDraweeHolder;
    private ReadableMap mHeaders;
    private int mHeight;
    private TextView mTextView;
    private Uri mUri;
    private int mWidth;

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void onAttachedToWindow() {
        this.mDraweeHolder.mo32934b();
    }

    public void onDetachedFromWindow() {
        this.mDraweeHolder.mo32935c();
    }

    public void onFinishTemporaryDetach() {
        this.mDraweeHolder.mo32934b();
    }

    public void onStartTemporaryDetach() {
        this.mDraweeHolder.mo32935c();
    }

    public void setTextView(TextView textView) {
        this.mTextView = textView;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.mHeight;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.mWidth;
    }

    public FrescoBasedReactTextInlineImageSpan(Resources resources, int i, int i2, Uri uri, ReadableMap readableMap, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeHolder = new C13445b<>(C13439b.m39448a(resources).mo32908a());
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
        this.mHeight = i;
        this.mWidth = i2;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        this.mUri = uri;
        this.mHeaders = readableMap;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.mDrawable == null) {
            this.mDraweeHolder.mo32931a((C13386a) this.mDraweeControllerBuilder.mo32747b().mo32729b(this.mDraweeHolder.f35652b).mo32744a(this.mCallerContext).mo32748b(ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.m40865a(this.mUri), this.mHeaders)).mo32730f());
            this.mDraweeControllerBuilder.mo32747b();
            this.mDrawable = this.mDraweeHolder.mo32938f();
            this.mDrawable.setBounds(0, 0, this.mWidth, this.mHeight);
            this.mDrawable.setCallback(this.mTextView);
        }
        canvas.save();
        canvas.translate(f, (float) (i4 - this.mDrawable.getBounds().bottom));
        this.mDrawable.draw(canvas);
        canvas.restore();
    }
}
