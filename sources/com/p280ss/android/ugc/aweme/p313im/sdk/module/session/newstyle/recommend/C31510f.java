package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f */
public final class C31510f extends C25652b<C31506e, C31503b> {
    /* renamed from: g */
    private final boolean m102459g() {
        if (this.f67571b == null || this.f67572c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo82220e() {
        C31506e eVar = (C31506e) this.f67571b;
        if (eVar != null) {
            eVar.mo82214a();
        }
        mo57293S_();
    }

    /* renamed from: f */
    public final void mo82221f() {
        C31506e eVar = (C31506e) this.f67571b;
        if (eVar != null) {
            eVar.mo82217b();
        }
        mo57293S_();
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (m102459g()) {
            if (((C31506e) this.f67571b).f82504c) {
                ((C31503b) this.f67572c).mo82199b();
            } else {
                ((C31503b) this.f67572c).mo82194a();
            }
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (m102459g()) {
            if (((C31506e) this.f67571b).f82504c) {
                C31503b bVar = (C31503b) this.f67572c;
                C25640a aVar = this.f67571b;
                C7573i.m23582a((Object) aVar, "mModel");
                bVar.mo82200b((C31505d) ((C31506e) aVar).getData());
                return;
            }
            C31503b bVar2 = (C31503b) this.f67572c;
            C25640a aVar2 = this.f67571b;
            C7573i.m23582a((Object) aVar2, "mModel");
            bVar2.mo82196a((C31505d) ((C31506e) aVar2).getData());
        }
    }

    /* renamed from: a */
    public final void mo82219a(User user) {
        C7573i.m23587b(user, "user");
        C31506e eVar = (C31506e) this.f67571b;
        if (eVar != null) {
            eVar.mo82215a(user);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (m102459g()) {
            if (((C31506e) this.f67571b).f82504c) {
                ((C31503b) this.f67572c).mo82201b(exc);
            } else {
                ((C31503b) this.f67572c).mo82197a(exc);
            }
        }
    }
}
