package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.imagehelper.ImageSource;

class RCTTextInlineImage extends FlatTextShadowNode {
    private InlineImageSpanWithPipeline mInlineImageSpan = new InlineImageSpanWithPipeline();

    RCTTextInlineImage() {
    }

    private InlineImageSpanWithPipeline getMutableSpan() {
        if (this.mInlineImageSpan.isFrozen()) {
            this.mInlineImageSpan = this.mInlineImageSpan.mutableCopy();
        }
        return this.mInlineImageSpan;
    }

    /* access modifiers changed from: protected */
    public void performCollectAttachDetachListeners(StateBuilder stateBuilder) {
        stateBuilder.addAttachDetachListener(this.mInlineImageSpan);
    }

    /* access modifiers changed from: protected */
    public void performCollectText(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("I");
    }

    public void setStyleHeight(float f) {
        super.setStyleHeight(f);
        if (this.mInlineImageSpan.getHeight() != f) {
            getMutableSpan().setHeight(f);
            notifyChanged(true);
        }
    }

    public void setStyleWidth(float f) {
        super.setStyleWidth(f);
        if (this.mInlineImageSpan.getWidth() != f) {
            getMutableSpan().setWidth(f);
            notifyChanged(true);
        }
    }

    @ReactProp(name = "src")
    public void setSource(ReadableArray readableArray) {
        String str;
        ImageSource imageSource;
        ImageRequest imageRequest = null;
        if (readableArray == null || readableArray.size() == 0) {
            str = null;
        } else {
            str = readableArray.getMap(0).getString("uri");
        }
        if (str == null) {
            imageSource = null;
        } else {
            imageSource = new ImageSource(getThemedContext(), str);
        }
        InlineImageSpanWithPipeline mutableSpan = getMutableSpan();
        if (imageSource != null) {
            imageRequest = ImageRequestBuilder.m40865a(imageSource.getUri()).mo33476b();
        }
        mutableSpan.setImageRequest(imageRequest);
    }

    /* access modifiers changed from: protected */
    public void performApplySpans(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        this.mInlineImageSpan.freeze();
        spannableStringBuilder.setSpan(this.mInlineImageSpan, i, i2, 17);
    }
}
