package com.p1848vk.sdk.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import com.p1848vk.sdk.dialogs.VKShareDialogDelegate.C47227a;

/* renamed from: com.vk.sdk.dialogs.VKShareDialog */
public class VKShareDialog extends DialogFragment implements C47227a {

    /* renamed from: a */
    private VKShareDialogDelegate f121356a = new VKShareDialogDelegate(this);

    /* renamed from: a */
    public final /* synthetic */ Activity mo118685a() {
        return super.getActivity();
    }

    public void onStart() {
        super.onStart();
        this.f121356a.mo118687a();
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return this.f121356a.mo118686a(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f121356a.mo118693b(bundle);
    }
}
