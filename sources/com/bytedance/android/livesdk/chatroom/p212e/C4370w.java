package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.w */
public final class C4370w extends C4343b<C8548cj> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8548cj) this.f12647a).f23544c;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8548cj) this.f12647a).f23544c, "：", ((C8548cj) this.f12647a).f23543b, R.color.alu, R.color.alv, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        String str = ((C8548cj) this.f12647a).f23543b;
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8548cj) this.f12647a).f23544c, "：", str, R.color.alu, R.color.alv, false);
    }

    public C4370w(C8548cj cjVar) {
        super(cjVar);
    }
}
