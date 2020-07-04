package com.p280ss.android.ugc.aweme.tools.draft;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a */
final /* synthetic */ class C42274a implements Runnable {

    /* renamed from: a */
    private final IAVService f110024a;

    /* renamed from: b */
    private final C27311c f110025b;

    C42274a(IAVService iAVService, C27311c cVar) {
        this.f110024a = iAVService;
        this.f110025b = cVar;
    }

    public final void run() {
        this.f110024a.draftService().notifyDraftDelete(this.f110025b);
    }
}
