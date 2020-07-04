package com.facebook.react.flat;

import android.content.Context;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.react.bridge.ReadableArray;

interface DrawImage extends AttachDetachListener {
    int getBorderColor();

    float getBorderRadius();

    float getBorderWidth();

    C13423b getScaleType();

    boolean hasImageRequest();

    void setBorderColor(int i);

    void setBorderRadius(float f);

    void setBorderWidth(float f);

    void setFadeDuration(int i);

    void setProgressiveRenderingEnabled(boolean z);

    void setReactTag(int i);

    void setScaleType(C13423b bVar);

    void setSource(Context context, ReadableArray readableArray);

    void setTintColor(int i);
}
