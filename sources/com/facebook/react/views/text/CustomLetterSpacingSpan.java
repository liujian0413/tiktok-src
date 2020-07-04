package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class CustomLetterSpacingSpan extends MetricAffectingSpan {
    private final float mLetterSpacing;

    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }

    public CustomLetterSpacingSpan(float f) {
        this.mLetterSpacing = f;
    }

    private void apply(TextPaint textPaint) {
        if (!Float.isNaN(this.mLetterSpacing)) {
            textPaint.setLetterSpacing(this.mLetterSpacing / textPaint.getTextSize());
        }
    }
}
