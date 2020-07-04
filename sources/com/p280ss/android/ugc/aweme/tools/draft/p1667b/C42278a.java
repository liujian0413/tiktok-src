package com.p280ss.android.ugc.aweme.tools.draft.p1667b;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a */
public final class C42278a {

    /* renamed from: a */
    public AVMusic f110029a;

    /* renamed from: b */
    public List<C27311c> f110030b;

    /* renamed from: a */
    public final List<C27311c> mo103759a() {
        if (this.f110030b == null) {
            this.f110030b = new ArrayList();
        }
        return this.f110030b;
    }

    /* renamed from: a */
    public final void mo103760a(C27311c cVar) {
        if (cVar != null) {
            if (this.f110030b == null) {
                this.f110030b = new ArrayList();
                this.f110030b.add(cVar);
                return;
            }
            int size = this.f110030b.size();
            for (int i = 0; i < size; i++) {
                if (cVar.f72018F > ((C27311c) this.f110030b.get(i)).f72018F) {
                    this.f110030b.add(i, cVar);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo103761a(C42278a aVar) {
        if (this.f110030b == null || this.f110030b.isEmpty() || this.f110030b.get(0) == null || ((C27311c) this.f110030b.get(0)).f72018F == 0) {
            return false;
        }
        if (aVar == null || aVar.f110030b == null || aVar.f110030b.isEmpty() || aVar.f110030b.get(0) == null || ((C27311c) aVar.f110030b.get(0)).f72018F == 0 || ((C27311c) this.f110030b.get(0)).f72018F > ((C27311c) aVar.mo103759a().get(0)).f72018F) {
            return true;
        }
        return false;
    }
}
