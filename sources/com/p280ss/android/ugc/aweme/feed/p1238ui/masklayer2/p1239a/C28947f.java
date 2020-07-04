package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.discover.api.p1175b.C26571a;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f */
public final class C28947f extends C28955l {
    public C28947f(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
        Aweme aweme = this.f76297e;
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            C7573i.m23582a((Object) authorUid, "authorUid");
            C26571a.m87328a(authorUid);
            C42961az.m136380a(new C28325h(aweme.getAuthor()));
            C10761a.m31409e(view.getContext(), (int) R.string.fh_).mo25750a();
        }
    }
}
