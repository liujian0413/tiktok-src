package com.p280ss.android.ugc.aweme.services.publish;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnGetRecoverDraftCallback;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PublishServiceImpl$$Lambda$2 */
final /* synthetic */ class PublishServiceImpl$$Lambda$2 implements Runnable {
    private final C27311c arg$1;
    private final OnGetRecoverDraftCallback arg$2;

    PublishServiceImpl$$Lambda$2(C27311c cVar, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.arg$1 = cVar;
        this.arg$2 = onGetRecoverDraftCallback;
    }

    public final void run() {
        PublishServiceImpl.lambda$null$0$PublishServiceImpl(this.arg$1, this.arg$2);
    }
}
