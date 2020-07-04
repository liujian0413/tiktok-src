package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.g */
final /* synthetic */ class C4809g implements Runnable {

    /* renamed from: a */
    private final LinkDialog f13707a;

    /* renamed from: b */
    private final View f13708b;

    C4809g(LinkDialog linkDialog, View view) {
        this.f13707a = linkDialog;
        this.f13708b = view;
    }

    public final void run() {
        this.f13707a.mo12150b(this.f13708b);
    }
}
