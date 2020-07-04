package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.t */
public final class C4367t extends C4343b<C8529bs> {
    /* renamed from: e */
    public final User mo12065e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        if (this.f12647a == null || TextUtils.isEmpty(((C8529bs) this.f12647a).f23447b)) {
            return C4374z.f12668a;
        }
        String str = ((C8529bs) this.f12647a).f23447b;
        C9178j.m27302j().mo22379h();
        return C4372y.m14743a(str, (int) R.color.alu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        if (this.f12647a == null || TextUtils.isEmpty(((C8529bs) this.f12647a).f23447b)) {
            return C4374z.f12668a;
        }
        return C4372y.m14743a(((C8529bs) this.f12647a).f23447b, (int) R.color.aei);
    }

    public C4367t(C8529bs bsVar) {
        super(bsVar);
    }
}
