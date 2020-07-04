package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.framework.services.IFollowService;
import com.p280ss.android.ugc.aweme.framework.services.IFollowService.IFollowCallback;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;

/* renamed from: com.ss.android.ugc.aweme.services.FollowService */
public class FollowService implements IFollowService {
    public void sendRequest(String str, int i, IFollowCallback iFollowCallback) {
        sendRequest(str, i, 0, iFollowCallback);
    }

    public void sendRequest(String str, int i, int i2, final IFollowCallback iFollowCallback) {
        C36031j jVar = new C36031j();
        jVar.mo91679a(new C36034a().mo91684a(str).mo91682a(i).mo91685b(i2).mo91681a());
        jVar.mo66537a(new C36040n() {
            public void onFollowFail(Exception exc) {
                if (iFollowCallback != null) {
                    iFollowCallback.onFollowFailed(exc);
                }
            }

            public void onFollowSuccess(FollowStatus followStatus) {
                if (iFollowCallback != null) {
                    iFollowCallback.onFollowSuccess();
                }
            }
        });
    }
}
