package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28447b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.t */
public final class C28695t {

    /* renamed from: a */
    public int f75575a;

    /* renamed from: b */
    private C25674b<C28447b> f75576b;

    /* renamed from: a */
    public final boolean mo73758a() {
        if (C28344a.m93114e()) {
            int i = this.f75575a;
            C25673a aVar = (C25673a) this.f75576b.mo66539h();
            C7573i.m23582a((Object) aVar, "mPresenter.model");
            if (i < ((C28447b) aVar).getItems().size() - 1 && !C6903bc.m21478S().mo57886d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo73757a(int i) {
        if (C28344a.m93114e()) {
            int i2 = i + 1;
            if (i2 > this.f75575a) {
                this.f75575a = i2;
            }
        }
    }

    public C28695t(C25674b<C28447b> bVar) {
        C7573i.m23587b(bVar, "mPresenter");
        this.f75576b = bVar;
    }
}
