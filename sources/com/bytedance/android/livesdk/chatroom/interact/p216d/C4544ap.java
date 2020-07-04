package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract.View;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.ap */
final /* synthetic */ class C4544ap implements C7326g {

    /* renamed from: a */
    private final View f13154a;

    private C4544ap(View view) {
        this.f13154a = view;
    }

    /* renamed from: a */
    static C7326g m15180a(View view) {
        return new C4544ap(view);
    }

    public final void accept(Object obj) {
        this.f13154a.mo12314b((Throwable) obj);
    }
}
