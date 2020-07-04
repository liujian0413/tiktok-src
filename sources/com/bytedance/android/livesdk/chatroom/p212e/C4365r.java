package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8522bp;
import com.bytedance.android.livesdk.message.model.C8522bp.C8525c;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.r */
public final class C4365r extends C4343b<C8522bp> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        return null;
    }

    /* renamed from: e */
    public final User mo12065e() {
        if (((C8522bp) this.f12647a).f23432g instanceof C8525c) {
            return ((C8525c) ((C8522bp) this.f12647a).f23432g).f23434a;
        }
        return null;
    }

    C4365r(C8522bp bpVar) {
        super(bpVar);
    }
}
