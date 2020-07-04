package com.p280ss.android.ugc.aweme.services.publish;

import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnGetRecoverDraftCallback;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PublishServiceImpl$$Lambda$0 */
final /* synthetic */ class PublishServiceImpl$$Lambda$0 implements Runnable {
    private final String arg$1;
    private final OnGetRecoverDraftCallback arg$2;

    PublishServiceImpl$$Lambda$0(String str, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        this.arg$1 = str;
        this.arg$2 = onGetRecoverDraftCallback;
    }

    public final void run() {
        C6726a.m20844b(new PublishServiceImpl$$Lambda$2(((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryDraft(this.arg$1), this.arg$2));
    }
}
