package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: com.bytedance.android.livesdk.h */
final /* synthetic */ class C6129h implements OnKeyListener {

    /* renamed from: a */
    private final LiveDialogFragment f18078a;

    C6129h(LiveDialogFragment liveDialogFragment) {
        this.f18078a = liveDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return this.f18078a.mo11344a(dialogInterface, i, keyEvent);
    }
}
