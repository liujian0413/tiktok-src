package com.facebook.react.views.slider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class ReactSlider extends SeekBar {
    private static int DEFAULT_TOTAL_STEPS = 128;
    private double mMaxValue;
    private double mMinValue;
    private double mStep;
    private double mStepCalculated;
    private double mValue;

    private double getStepValue() {
        if (this.mStep > 0.0d) {
            return this.mStep;
        }
        return this.mStepCalculated;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.mMaxValue - this.mMinValue) / getStepValue());
    }

    private void updateValue() {
        double d = (this.mValue - this.mMinValue) / (this.mMaxValue - this.mMinValue);
        double totalSteps = (double) getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(d * totalSteps));
    }

    private void updateAll() {
        if (this.mStep == 0.0d) {
            double d = this.mMaxValue - this.mMinValue;
            double d2 = (double) DEFAULT_TOTAL_STEPS;
            Double.isNaN(d2);
            this.mStepCalculated = d / d2;
        }
        setMax(getTotalSteps());
        updateValue();
    }

    /* access modifiers changed from: 0000 */
    public void setMaxValue(double d) {
        this.mMaxValue = d;
        updateAll();
    }

    /* access modifiers changed from: 0000 */
    public void setMinValue(double d) {
        this.mMinValue = d;
        updateAll();
    }

    /* access modifiers changed from: 0000 */
    public void setStep(double d) {
        this.mStep = d;
        updateAll();
    }

    /* access modifiers changed from: 0000 */
    public void setValue(double d) {
        this.mValue = d;
        updateValue();
    }

    public double toRealProgress(int i) {
        if (i == getMax()) {
            return this.mMaxValue;
        }
        double d = (double) i;
        double stepValue = getStepValue();
        Double.isNaN(d);
        return (d * stepValue) + this.mMinValue;
    }

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
