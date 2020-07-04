package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8550cl;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.x */
public final class C4371x extends C4343b<C8550cl> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8550cl) this.f12647a).f23552b;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        if (this.f12647a == null) {
            return super.mo12074k();
        }
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        return C4372y.m14742a(((C8550cl) this.f12647a).f23552b, "  ", ((C8550cl) this.f12647a).mo21675a(), R.color.aei, R.color.as5, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14742a(((C8550cl) this.f12647a).f23552b, "  ", ((C8550cl) this.f12647a).mo21675a(), R.color.alu, R.color.alu, false);
    }

    public C4371x(C8550cl clVar) {
        super(clVar);
    }
}
