package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import com.google.android.gms.common.internal.C15267r;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f38855a;

    /* renamed from: b */
    private OnCancelListener f38856b;

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f38855a == null) {
            this.mShowsDialog = false;
        }
        return this.f38855a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f38856b != null) {
            this.f38856b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static SupportErrorDialogFragment m43538a(Dialog dialog, OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C15267r.m44385a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f38855a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f38856b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void show(C0608j jVar, String str) {
        super.show(jVar, str);
    }
}
