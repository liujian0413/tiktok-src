package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;

public class SupportDatePickerDialogFragment extends DialogFragment {
    private OnDateSetListener mOnDateSetListener;
    private OnDismissListener mOnDismissListener;

    /* access modifiers changed from: 0000 */
    public void setOnDateSetListener(OnDateSetListener onDateSetListener) {
        this.mOnDateSetListener = onDateSetListener;
    }

    /* access modifiers changed from: 0000 */
    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return DatePickerDialogFragment.createDialog(getArguments(), getActivity(), this.mOnDateSetListener);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss(dialogInterface);
        }
    }
}
