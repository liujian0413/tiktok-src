package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.ShareExtService;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.k */
public final class C28954k extends C28955l {

    /* renamed from: a */
    private final SharePackage f76295a;

    public C28954k(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
        this.f76295a = aVar.f76273d;
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
        ShareExtService b = C37984ap.m121302b();
        Aweme aweme = this.f76297e;
        if (aweme == null) {
            C7573i.m23580a();
        }
        C38389f dislikeAction = b.getDislikeAction(aweme, this.f76298f, "long_press");
        if (dislikeAction.mo95718e()) {
            dislikeAction.mo95712a(C6399b.m19921a(), this.f76295a);
        }
    }
}
