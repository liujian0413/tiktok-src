package com.facebook.react.modules.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;

public class SupportAlertFragment extends DialogFragment implements OnClickListener {
    private final AlertFragmentListener mListener;

    public SupportAlertFragment() {
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return AlertFragment.createDialog(getActivity(), getArguments(), this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mListener != null) {
            this.mListener.onDismiss(dialogInterface);
        }
    }

    public SupportAlertFragment(AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.mListener != null) {
            this.mListener.onClick(dialogInterface, i);
        }
    }
}
