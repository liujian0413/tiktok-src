package com.zhihu.matisse.internal.p1856ui.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.IncapableDialog */
public class IncapableDialog extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        C1081a aVar = new C1081a(getActivity());
        if (!TextUtils.isEmpty(string)) {
            aVar.mo4233a((CharSequence) string);
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.mo4240b((CharSequence) string2);
        }
        aVar.mo4226a((int) R.string.c86, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return aVar.mo4242b();
    }

    /* renamed from: a */
    public static IncapableDialog m147907a(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }
}
