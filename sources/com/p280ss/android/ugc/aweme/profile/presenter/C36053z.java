package com.p280ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.z */
public final class C36053z extends C25674b<C25673a> {

    /* renamed from: a */
    public String f94289a;

    /* renamed from: d */
    private Object[] f94290d;

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67571b != null && this.f67572c != null) {
            int i = ((C25673a) this.f67571b).mListQueryType;
            boolean z = true;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (TextUtils.equals(this.f94289a, ((C36018b) this.f67571b).f94230e)) {
                            if (((C25673a) this.f67571b).isDataEmpty()) {
                                ((C25675c) this.f67572c).ae_();
                                return;
                            } else {
                                ((C25675c) this.f67572c).mo59099a(((C25673a) this.f67571b).getItems(), ((C25673a) this.f67571b).isHasMore());
                                return;
                            }
                        } else if (this.f94290d != null && this.f94290d.length > 2 && (this.f94290d[2] instanceof String) && TextUtils.equals((String) this.f94290d[2], this.f94289a)) {
                            super.mo56976a(this.f94290d);
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
    public final boolean mo56976a(Object... objArr) {
        this.f94290d = objArr;
        return super.mo56976a(objArr);
    }
}
