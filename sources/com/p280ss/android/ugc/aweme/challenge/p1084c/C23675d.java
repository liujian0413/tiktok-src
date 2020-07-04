package com.p280ss.android.ugc.aweme.challenge.p1084c;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.d */
public final class C23675d extends C25652b<C23674c, C23683j> {
    public C23675d() {
        mo66536a(new C23674c());
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            ((C23683j) this.f67572c).mo61610a((Challenge) ((C23674c) this.f67571b).getData());
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C23683j) this.f67572c).mo61611a(exc);
        }
    }
}
