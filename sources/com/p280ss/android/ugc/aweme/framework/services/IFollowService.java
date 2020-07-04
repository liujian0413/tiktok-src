package com.p280ss.android.ugc.aweme.framework.services;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IFollowService */
public interface IFollowService {

    /* renamed from: com.ss.android.ugc.aweme.framework.services.IFollowService$IFollowCallback */
    public interface IFollowCallback {
        void onFollowFailed(Exception exc);

        void onFollowSuccess();
    }

    void sendRequest(String str, int i, IFollowCallback iFollowCallback);
}
