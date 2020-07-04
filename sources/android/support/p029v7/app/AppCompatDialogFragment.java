package android.support.p029v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;

/* renamed from: android.support.v7.app.AppCompatDialogFragment */
public class AppCompatDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new AppCompatDialog(getContext(), this.mTheme);
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof AppCompatDialog) {
            AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
            }
            appCompatDialog.mo4365b(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
