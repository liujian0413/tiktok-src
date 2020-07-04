package com.p280ss.android.ugc.aweme.newfollow.p1421d;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21750a;
import com.p280ss.android.ugc.aweme.newfollow.model.C34147d;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34168b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.d.a */
public class C34125a extends C25652b<C34147d, C34168b> {
    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
    }

    /* renamed from: e */
    public final void mo86791e() {
        C42961az.m136382c(this);
    }

    /* renamed from: f */
    public final void mo86792f() {
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
    }

    @C7709l
    public void onDeleteItemEvent(C21750a aVar) {
        if (this.f67572c != null && ((C34168b) this.f67572c).isViewValid() && aVar.f58255a == 3) {
            mo56976a(aVar.f58257c);
        }
    }
}
