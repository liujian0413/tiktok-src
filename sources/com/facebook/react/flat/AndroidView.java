package com.facebook.react.flat;

interface AndroidView {
    float getPadding(int i);

    boolean isPaddingChanged();

    boolean needsCustomLayoutForChildren();

    void resetPaddingChanged();
}
