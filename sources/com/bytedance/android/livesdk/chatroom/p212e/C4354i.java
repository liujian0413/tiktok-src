package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.i */
public final class C4354i extends C4343b<C8696z> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8696z) this.f12647a).f23700a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        return C4372y.m14745b(((C8696z) this.f12647a).f23700a, "：", ((C8696z) this.f12647a).baseMessage.f25996f, R.color.aei, R.color.as5, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        String str = ((C8696z) this.f12647a).baseMessage.f25996f;
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8696z) this.f12647a).f23700a, "：", str, R.color.alu, R.color.alx, false);
    }

    public C4354i(C8696z zVar) {
        super(zVar);
    }
}
