package com.p280ss.android.ugc.aweme.newfollow.model;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.UpLoadRecoverFeedUserItem */
public class UpLoadRecoverFeedUserItem extends User {
    private boolean isServerException;
    private C27311c mDraft;

    public C27311c getDraft() {
        return this.mDraft;
    }

    public boolean isServerException() {
        return this.isServerException;
    }

    public void setDraft(C27311c cVar) {
        this.mDraft = cVar;
    }

    public void setServerException(boolean z) {
        this.isServerException = z;
    }
}
