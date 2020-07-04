package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;

public class SupportTimePickerDialogFragment extends DialogFragment {
    private OnDismissListener mOnDismissListener;
    private OnTimeSetListener mOnTimeSetListener;

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnTimeSetListener(OnTimeSetListener onTimeSetListener) {
        this.mOnTimeSetListener = onTimeSetListener;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return TimePickerDialogFragment.createDialog(getArguments(), getActivity(), this.mOnTimeSetListener);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss(dialogInterface);
        }
    }
}
