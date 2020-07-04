package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

class ValueAnimatedNode extends AnimatedNode {
    double mOffset;
    double mValue = Double.NaN;
    private AnimatedNodeValueListener mValueListener;

    public ValueAnimatedNode() {
    }

    public double getValue() {
        return this.mOffset + this.mValue;
    }

    public void extractOffset() {
        this.mOffset += this.mValue;
        this.mValue = 0.0d;
    }

    public void flattenOffset() {
        this.mValue += this.mOffset;
        this.mOffset = 0.0d;
    }

    public void onValueUpdate() {
        if (this.mValueListener != null) {
            this.mValueListener.onValueUpdate(getValue());
        }
    }

    public void setValueListener(AnimatedNodeValueListener animatedNodeValueListener) {
        this.mValueListener = animatedNodeValueListener;
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.mValue = readableMap.getDouble("value");
        this.mOffset = readableMap.getDouble("offset");
    }
}
