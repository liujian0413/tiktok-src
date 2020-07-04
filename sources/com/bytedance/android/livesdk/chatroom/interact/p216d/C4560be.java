package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.View;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.be */
final /* synthetic */ class C4560be implements C7326g {

    /* renamed from: a */
    private final View f13179a;

    private C4560be(View view) {
        this.f13179a = view;
    }

    /* renamed from: a */
    static C7326g m15197a(View view) {
        return new C4560be(view);
    }

    public final void accept(Object obj) {
        this.f13179a.mo12332a((Throwable) obj);
    }
}
