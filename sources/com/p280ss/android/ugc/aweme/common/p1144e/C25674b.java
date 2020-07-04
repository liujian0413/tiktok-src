package com.p280ss.android.ugc.aweme.common.p1144e;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.e.b */
public class C25674b<T extends C25673a> extends C25652b<T, C25675c> implements C25677e {

    /* renamed from: a */
    private C25676d f67611a;

    /* renamed from: U_ */
    public void mo59134U_() {
        super.mo59134U_();
        this.f67611a = null;
    }

    /* renamed from: S_ */
    public void mo57293S_() {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C25673a) this.f67571b).mListQueryType;
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
    public void mo56977b() {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C25673a) this.f67571b).mListQueryType;
            boolean z = true;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((C25673a) this.f67571b).isDataEmpty()) {
                            ((C25675c) this.f67572c).ae_();
                            return;
                        } else {
                            ((C25675c) this.f67572c).mo59099a(((C25673a) this.f67571b).getItems(), ((C25673a) this.f67571b).isHasMore());
                            return;
                        }
                    case 2:
                        ((C25675c) this.f67572c).mo59110c(((C25673a) this.f67571b).getItems(), true ^ ((C25673a) this.f67571b).isNewDataEmpty());
                        break;
                }
                return;
            }
            C25675c cVar = (C25675c) this.f67572c;
            List items = ((C25673a) this.f67571b).getItems();
            if (!((C25673a) this.f67571b).isHasMore() || ((C25673a) this.f67571b).isNewDataEmpty()) {
                z = false;
            }
            cVar.mo59108b(items, z);
        }
    }

    /* renamed from: a */
    public void mo66568a(C25676d dVar) {
        this.f67611a = dVar;
    }

    /* renamed from: a */
    public void mo59135a(int i) {
        if (this.f67611a != null) {
            this.f67611a.mo61747c_(i);
        }
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C25673a) this.f67571b).mListQueryType;
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
    public boolean mo66569a(Object obj) {
        if (this.f67571b == null || !((C25673a) this.f67571b).deleteItem(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo59136a(List list, int i) {
        if (this.f67611a != null) {
            this.f67611a.mo61742a(list, i);
        }
    }

    /* renamed from: a */
    public boolean mo66570a(Object obj, int i) {
        if (this.f67571b == null || !((C25673a) this.f67571b).insertItem(obj, i)) {
            return false;
        }
        return true;
    }
}
