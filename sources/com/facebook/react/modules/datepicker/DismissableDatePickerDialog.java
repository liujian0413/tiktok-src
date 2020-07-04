package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Build.VERSION;

public class DismissableDatePickerDialog extends DatePickerDialog {
    /* access modifiers changed from: protected */
    public void onStop() {
        if (VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }

    public DismissableDatePickerDialog(Context context, OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
    }

    public DismissableDatePickerDialog(Context context, int i, OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
    }
}
