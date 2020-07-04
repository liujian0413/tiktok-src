package com.p280ss.android.ugc.aweme.forward.model;

import android.text.TextUtils;
import bolts.C1591g;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.C34089j;

/* renamed from: com.ss.android.ugc.aweme.forward.model.b */
public final class C29906b extends C25640a<ForwardDetail> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String) || TextUtils.isEmpty(objArr[0])) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        ForwardApi.m97744b(objArr[0]).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(ForwardDetail forwardDetail) {
        super.handleData(forwardDetail);
        if (forwardDetail != null && forwardDetail.getAweme() != null) {
            Aweme aweme = forwardDetail.getAweme();
            if (aweme.getAwemeType() == 13) {
                forwardDetail.setAweme(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme));
                Aweme forwardItem = aweme.getForwardItem();
                if (forwardItem != null) {
                    forwardItem.setRepostFromGroupId(aweme.getAid());
                    forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(forwardItem);
                }
            }
        }
    }
}
