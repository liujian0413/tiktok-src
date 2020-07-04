package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.PieceType;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.c */
public final class C4346c extends C4343b<C8472a> {
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
        if (!(this.f12647a == null || ((C8472a) this.f12647a).baseMessage == null || ((C8472a) this.f12647a).baseMessage.f26000j == null)) {
            for (C9507h hVar : ((C8472a) this.f12647a).baseMessage.f26000j.f26016d) {
                if (hVar.f26020a == PieceType.USER.getPieceType() && hVar.f26023d != null) {
                    return hVar.f26023d.f26032a;
                }
            }
        }
        return null;
    }

    public C4346c(C8472a aVar) {
        super(aVar);
    }
}
