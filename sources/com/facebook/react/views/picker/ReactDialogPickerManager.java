package com.facebook.react.views.picker;

import android.content.Context;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;

@ReactModule(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager {
    public String getName() {
        return "AndroidDialogPicker";
    }

    /* access modifiers changed from: protected */
    public ReactPicker createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactPicker((Context) themedReactContext, 0);
    }
}
