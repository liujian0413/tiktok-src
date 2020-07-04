package com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1443b;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1442a.C34543a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.followrequest.b.a */
public final class C34546a extends C25652b<C34543a, C34547b> {
    /* renamed from: j */
    private final boolean m111706j() {
        if (this.f67571b == null || this.f67572c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo87849e() {
        C34543a aVar = (C34543a) this.f67571b;
        if (aVar != null) {
            aVar.mo87845a();
        }
    }

    /* renamed from: f */
    public final void mo87850f() {
        C34543a aVar = (C34543a) this.f67571b;
        if (aVar != null) {
            aVar.mo87846b();
        }
        mo57293S_();
    }

    /* renamed from: g */
    public final void mo87851g() {
        C34543a aVar = (C34543a) this.f67571b;
        if (aVar != null) {
            aVar.mo87847c();
        }
        mo57293S_();
    }

    /* renamed from: k */
    private boolean m111707k() {
        C34543a aVar = (C34543a) this.f67571b;
        if (aVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) aVar.getData();
            if (followRequestResponse != null) {
                return followRequestResponse.hasMore;
            }
        }
        return false;
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (m111706j()) {
            if (((C34543a) this.f67571b).f90120a) {
                ((C34547b) this.f67572c).mo87785a(true);
            } else {
                ((C34547b) this.f67572c).mo87785a(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        boolean z;
        if (m111706j()) {
            C25640a aVar = this.f67571b;
            C7573i.m23582a((Object) aVar, "mModel");
            List<User> list = ((FollowRequestResponse) ((C34543a) aVar).getData()).userRequestList;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((C34543a) this.f67571b).f90120a) {
                C34547b bVar = (C34547b) this.f67572c;
                C7573i.m23582a((Object) list, "list");
                if (m111707k() && !z) {
                    z2 = true;
                }
                bVar.mo87784a(list, true, z2);
            } else if (z) {
                ((C34547b) this.f67572c).mo87781a();
            } else if (((C34543a) this.f67571b).f90121b) {
                C34547b bVar2 = (C34547b) this.f67572c;
                C7573i.m23582a((Object) list, "list");
                C25640a aVar2 = this.f67571b;
                C7573i.m23582a((Object) aVar2, "mModel");
                bVar2.mo87783a(list, ((FollowRequestResponse) ((C34543a) aVar2).getData()).total);
            } else {
                C34547b bVar3 = (C34547b) this.f67572c;
                C7573i.m23582a((Object) list, "list");
                bVar3.mo87784a(list, false, m111707k());
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (m111706j()) {
            if (((C34543a) this.f67571b).f90120a) {
                ((C34547b) this.f67572c).mo87782a(exc, true);
            } else {
                ((C34547b) this.f67572c).mo87782a(exc, false);
            }
        }
    }
}
