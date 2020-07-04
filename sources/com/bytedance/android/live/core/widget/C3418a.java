package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: com.bytedance.android.live.core.widget.a */
final /* synthetic */ class C3418a implements OnKeyListener {

    /* renamed from: a */
    private final BaseDialogFragment f10237a;

    C3418a(BaseDialogFragment baseDialogFragment) {
        this.f10237a = baseDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return this.f10237a.mo10324a(dialogInterface, i, keyEvent);
    }
}
