package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.common.b */
public final class C15165b extends DialogFragment {

    /* renamed from: a */
    private Dialog f39240a;

    /* renamed from: b */
    private OnCancelListener f39241b;

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f39240a == null) {
            setShowsDialog(false);
        }
        return this.f39240a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f39241b != null) {
            this.f39241b.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C15165b m44140a(Dialog dialog, OnCancelListener onCancelListener) {
        C15165b bVar = new C15165b();
        Dialog dialog2 = (Dialog) C15267r.m44385a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f39240a = dialog2;
        if (onCancelListener != null) {
            bVar.f39241b = onCancelListener;
        }
        return bVar;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
