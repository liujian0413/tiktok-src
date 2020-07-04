package com.p280ss.android.ugc.aweme.notification.followrequest.p1439a;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.a.b */
public final class C34447b extends C25652b<C34445a, C34448c> {
    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        if (this.f67572c != null && ((C34448c) this.f67572c).isViewValid() && this.f67571b != null && ((C34445a) this.f67571b).getData() != null) {
            ((C34448c) this.f67572c).mo87621a(((FollowRequestResponse) ((C34445a) this.f67571b).getData()).total);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        ((C34448c) this.f67572c).mo87623a(exc);
    }
}
