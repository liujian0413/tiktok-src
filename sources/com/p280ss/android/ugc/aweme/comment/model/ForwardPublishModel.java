package com.p280ss.android.ugc.aweme.comment.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24151g;
import com.p280ss.android.ugc.aweme.comment.param.C24203c;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.net.C34089j;

/* renamed from: com.ss.android.ugc.aweme.comment.model.ForwardPublishModel */
public class ForwardPublishModel extends C25640a<ForwardDetail> {
    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C24203c cVar = objArr[0];
        ForwardApi.m97741a(cVar, C24151g.m79362a() ? 1 : 0).mo6875a((C1591g<TResult, TContinuationResult>) new ForwardPublishModel$$Lambda$0<TResult,TContinuationResult>(cVar)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        return true;
    }

    static final /* synthetic */ Object lambda$sendRequest$0$ForwardPublishModel(C24203c cVar, C1592h hVar) throws Exception {
        if (hVar.mo6891f() != null) {
            return hVar.mo6891f();
        }
        ForwardDetail forwardDetail = (ForwardDetail) hVar.mo6890e();
        forwardDetail.getComment().setFakeId(cVar.f63872i);
        forwardDetail.getComment().setEmoji(cVar.f63869f);
        return forwardDetail;
    }
}
