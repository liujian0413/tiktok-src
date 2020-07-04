package com.p280ss.android.ugc.aweme.followrequest.p1266a;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36035k;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.followrequest.a.a */
public final class C29858a extends C25652b<C36035k, C29859b> {
    /* renamed from: g */
    private final boolean m97644g() {
        if (this.f67571b == null || this.f67572c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo75842e() {
        C36035k kVar = (C36035k) this.f67571b;
        if (kVar != null) {
            kVar.mo91692a();
        }
        mo57293S_();
    }

    /* renamed from: f */
    public final void mo75843f() {
        C36035k kVar = (C36035k) this.f67571b;
        if (kVar != null) {
            kVar.mo91693b();
        }
        mo57293S_();
    }

    /* renamed from: j */
    private boolean m97645j() {
        C36035k kVar = (C36035k) this.f67571b;
        if (kVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) kVar.getData();
            if (followRequestResponse != null) {
                return followRequestResponse.hasMore;
            }
        }
        return false;
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (m97644g()) {
            if (((C36035k) this.f67571b).f94279a) {
                ((C29859b) this.f67572c).mo75838a(true);
            } else {
                ((C29859b) this.f67572c).mo75838a(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        boolean z;
        if (m97644g()) {
            C25640a aVar = this.f67571b;
            C7573i.m23582a((Object) aVar, "mModel");
            List<User> list = ((FollowRequestResponse) ((C36035k) aVar).getData()).userRequestList;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((C36035k) this.f67571b).f94279a) {
                C29859b bVar = (C29859b) this.f67572c;
                C7573i.m23582a((Object) list, "list");
                if (m97645j() && !z) {
                    z2 = true;
                }
                bVar.mo75837a(list, true, z2);
            } else if (z) {
                ((C29859b) this.f67572c).mo58711c();
            } else if (((C36035k) this.f67571b).f94280b) {
                C7573i.m23582a((Object) list, "list");
                C25640a aVar2 = this.f67571b;
                C7573i.m23582a((Object) aVar2, "mModel");
                ((C36035k) aVar2).getData();
            } else {
                C29859b bVar2 = (C29859b) this.f67572c;
                C7573i.m23582a((Object) list, "list");
                bVar2.mo75837a(list, false, m97645j());
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (m97644g()) {
            if (((C36035k) this.f67571b).f94279a) {
                ((C29859b) this.f67572c).mo75836a(exc, true);
            } else {
                ((C29859b) this.f67572c).mo75836a(exc, false);
            }
        }
    }
}
