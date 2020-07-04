package org.greenrobot.eventbus.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;

public final class ErrorDialogFragments {

    /* renamed from: a */
    public static int f123445a;

    /* renamed from: b */
    public static Class<?> f123446b;

    public static class Support extends DialogFragment implements OnClickListener {
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.m149939a(getActivity(), getArguments(), this);
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ErrorDialogFragments.m149940a(dialogInterface, i, getActivity(), getArguments());
        }
    }

    /* renamed from: a */
    public static Dialog m149939a(Context context, Bundle bundle, OnClickListener onClickListener) {
        Builder builder = new Builder(context);
        builder.setTitle(bundle.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(bundle.getString("de.greenrobot.eventbus.errordialog.message"));
        if (f123445a != 0) {
            builder.setIcon(f123445a);
        }
        builder.setPositiveButton(17039370, onClickListener);
        return builder.create();
    }

    /* renamed from: a */
    public static void m149940a(DialogInterface dialogInterface, int i, Activity activity, Bundle bundle) {
        if (f123446b != null) {
            try {
                ErrorDialogManager.f123447a.f123460a.mo121792a().mo20394d(f123446b.newInstance());
            } catch (Exception e) {
                throw new RuntimeException("Event cannot be constructed", e);
            }
        }
        if (bundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && activity != null) {
            activity.finish();
        }
    }
}
