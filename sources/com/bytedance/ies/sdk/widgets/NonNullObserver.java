package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0053p;

public interface NonNullObserver<T> extends C0053p<T> {
    void onChanged(T t);
}
