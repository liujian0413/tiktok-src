package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.View;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.bg */
final /* synthetic */ class C4562bg implements C7326g {

    /* renamed from: a */
    private final View f13181a;

    private C4562bg(View view) {
        this.f13181a = view;
    }

    /* renamed from: a */
    static C7326g m15198a(View view) {
        return new C4562bg(view);
    }

    public final void accept(Object obj) {
        this.f13181a.mo12333b((Throwable) obj);
    }
}
