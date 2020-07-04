package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract.View;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.m */
final /* synthetic */ class C4745m implements C7326g {

    /* renamed from: a */
    private final View f13477a;

    private C4745m(View view) {
        this.f13477a = view;
    }

    /* renamed from: a */
    static C7326g m15617a(View view) {
        return new C4745m(view);
    }

    public final void accept(Object obj) {
        this.f13477a.mo12277a((Throwable) obj);
    }
}
