package com.p280ss.android.ugc.aweme.detail.p1166j;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;

/* renamed from: com.ss.android.ugc.aweme.detail.j.b */
public final class C26097b extends C25652b<C26095a, C26113q> {
    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null && ((C26095a) this.f67571b).getData() != null) {
            ((C26113q) this.f67572c).mo67614a(((C26066a) ((C26095a) this.f67571b).getData()).f68878a);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C26113q) this.f67572c).mo67612a(exc);
        }
    }

    /* renamed from: a */
    public final boolean mo67675a(Object obj) {
        if (this.f67571b == null || ((C26095a) this.f67571b).getData() == null || ((C26066a) ((C26095a) this.f67571b).getData()).f68878a == null || !((C26066a) ((C26095a) this.f67571b).getData()).f68878a.remove(obj)) {
            return false;
        }
        return true;
    }
}
