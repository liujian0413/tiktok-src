package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Build.VERSION;

public class DismissableTimePickerDialog extends TimePickerDialog {
    /* access modifiers changed from: protected */
    public void onStop() {
        if (VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    public DismissableTimePickerDialog(Context context, OnTimeSetListener onTimeSetListener, int i, int i2, boolean z) {
        super(context, onTimeSetListener, i, i2, z);
    }

    public DismissableTimePickerDialog(Context context, int i, OnTimeSetListener onTimeSetListener, int i2, int i3, boolean z) {
        super(context, i, onTimeSetListener, i2, i3, z);
    }
}
