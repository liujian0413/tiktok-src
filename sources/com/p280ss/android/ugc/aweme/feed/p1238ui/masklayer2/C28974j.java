package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2;

import android.app.Activity;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.j */
public final class C28974j extends C28955l {
    public C28974j(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
        if (this.f76297e != null && C6405d.m19984g() != null) {
            ShareDependService a = C37950a.m121238a();
            Aweme aweme = this.f76297e;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String str = this.f76298f;
            Activity g = C6405d.m19984g();
            if (g == null) {
                C7573i.m23580a();
            }
            a.showReportDialog(aweme, str, g, "long_press");
        }
    }
}
