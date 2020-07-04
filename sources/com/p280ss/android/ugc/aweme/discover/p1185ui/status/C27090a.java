package com.p280ss.android.ugc.aweme.discover.p1185ui.status;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10808d;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.status.a */
public final class C27090a {

    /* renamed from: a */
    public static final C27091a f71468a = new C27091a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.status.a$a */
    public static final class C27091a {
        private C27091a() {
        }

        public /* synthetic */ C27091a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m88892a(C10805b bVar) {
            C7573i.m23587b(bVar, "status");
            if (bVar.f29134r == SearchStatusName.EMPTY.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo69879a(DmtStatusView dmtStatusView, C10805b bVar) {
            C7573i.m23587b(dmtStatusView, "statusView");
            C7573i.m23587b(bVar, "status");
            if (m88892a(bVar) || (C6399b.m19944t() && !bVar.f29131o)) {
                View b = dmtStatusView.mo25935b(1);
                if (b instanceof C10808d) {
                    ((C10808d) b).setStatus(bVar);
                }
                dmtStatusView.mo25943g();
                return;
            }
            View b2 = dmtStatusView.mo25935b(2);
            if (b2 != null) {
                ((C10808d) b2).setStatus(bVar);
                dmtStatusView.mo25944h();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.IDmtDefaultView");
        }
    }
}
