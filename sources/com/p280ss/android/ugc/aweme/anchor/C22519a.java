package com.p280ss.android.ugc.aweme.anchor;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25677e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.anchor.a */
public final class C22519a extends C25652b<C22540c, C25675c> implements C25677e {

    /* renamed from: a */
    public C25676d f59994a;

    /* renamed from: U_ */
    public final void mo59134U_() {
        super.mo59134U_();
        this.f59994a = null;
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C22540c) this.f67571b).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C25675c) this.f67572c).mo59098S_();
                        return;
                    case 2:
                        ((C25675c) this.f67572c).aE_();
                        return;
                }
            } else {
                ((C25675c) this.f67572c).aD_();
            }
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C22540c) this.f67571b).mListQueryType;
            boolean z = true;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C22540c) this.f67571b).mo59149a()) {
                            ((C25675c) this.f67572c).ae_();
                            return;
                        } else {
                            ((C25675c) this.f67572c).mo59099a(((C22540c) this.f67571b).getItems(), ((C22540c) this.f67571b).isHasMore());
                            return;
                        }
                    case 2:
                        ((C25675c) this.f67572c).mo59110c(((C22540c) this.f67571b).getItems(), true ^ ((C22540c) this.f67571b).isNewDataEmpty());
                        break;
                }
                return;
            }
            C25675c cVar = (C25675c) this.f67572c;
            List items = ((C22540c) this.f67571b).getItems();
            if (!((C22540c) this.f67571b).isHasMore() || ((C22540c) this.f67571b).isNewDataEmpty()) {
                z = false;
            }
            cVar.mo59108b(items, z);
        }
    }

    /* renamed from: a */
    public final void mo59135a(int i) {
        if (this.f59994a != null) {
            this.f59994a.mo61747c_(i);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C22540c) this.f67571b).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        ((C25675c) this.f67572c).mo59105a_(exc);
                        return;
                    case 2:
                        ((C25675c) this.f67572c).mo59109c(exc);
                        break;
                }
                return;
            }
            ((C25675c) this.f67572c).mo59107b(exc);
        }
    }

    /* renamed from: a */
    public final void mo59136a(List list, int i) {
        if (this.f59994a != null) {
            this.f59994a.mo61742a(list, i);
        }
    }
}
