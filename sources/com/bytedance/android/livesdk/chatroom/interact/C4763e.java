package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e */
final /* synthetic */ class C4763e implements Runnable {

    /* renamed from: a */
    private final LinkDialog f13509a;

    /* renamed from: b */
    private final View f13510b;

    C4763e(LinkDialog linkDialog, View view) {
        this.f13509a = linkDialog;
        this.f13510b = view;
    }

    public final void run() {
        this.f13509a.mo12152c(this.f13510b);
    }
}
