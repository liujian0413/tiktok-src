package com.facebook.react.views.text;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;

public class CustomLineHeightSpan implements LineHeightSpan {
    private final int mHeight;

    CustomLineHeightSpan(float f) {
        this.mHeight = (int) Math.ceil((double) f);
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent > this.mHeight) {
            int min = Math.min(this.mHeight, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.mHeight) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i5 = (-this.mHeight) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.mHeight) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.mHeight;
        } else if ((-fontMetricsInt.top) + fontMetricsInt.bottom > this.mHeight) {
            fontMetricsInt.top = fontMetricsInt.bottom - this.mHeight;
        } else {
            double d = (double) fontMetricsInt.top;
            double d2 = (double) (((float) (this.mHeight - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            double ceil = Math.ceil(d2);
            Double.isNaN(d);
            fontMetricsInt.top = (int) (d - ceil);
            double d3 = (double) fontMetricsInt.bottom;
            double floor = Math.floor(d2);
            Double.isNaN(d3);
            fontMetricsInt.bottom = (int) (d3 + floor);
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
