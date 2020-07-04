package com.facebook.react.modules.dialog;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class AlertFragment extends DialogFragment implements OnClickListener {
    private final AlertFragmentListener mListener;

    public AlertFragment() {
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return createDialog(getActivity(), getArguments(), this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mListener != null) {
            this.mListener.onDismiss(dialogInterface);
        }
    }

    public AlertFragment(AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.mListener != null) {
            this.mListener.onClick(dialogInterface, i);
        }
    }

    public static Dialog createDialog(Context context, Bundle bundle, OnClickListener onClickListener) {
        Builder title = new Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }
}
