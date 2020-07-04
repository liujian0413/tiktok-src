package com.p280ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.d */
public final class C26144d extends C26117a<C23671a, C25674b<C23671a>> {

    /* renamed from: c */
    private String f68972c;

    /* renamed from: h */
    private void m85946h() {
        if (TextUtils.equals("from_discovery_challenge", this.f68972c) && this.f68941a != null) {
            ((C23671a) this.f68941a).mo61600a("discovery_challenge_video");
        }
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        if (TextUtils.equals("from_discovery_challenge", this.f68972c)) {
            return 9000;
        }
        return i + 3000;
    }

    /* renamed from: a */
    private boolean m85945a(boolean z) {
        if (!mo67688b() || C6399b.m19944t() || !z) {
            return false;
        }
        return true;
    }

    public C26144d(C25673a aVar, String str) {
        C23671a aVar2;
        if (aVar instanceof C23671a) {
            aVar2 = (C23671a) aVar;
        } else {
            aVar2 = new C23671a();
        }
        this.f68941a = aVar2;
        this.f68942b = new C25674b();
        this.f68972c = str;
        m85946h();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getChallengeId(), Integer.valueOf(feedParam.getVideoType()), Boolean.valueOf(m85945a(z)));
    }
}
