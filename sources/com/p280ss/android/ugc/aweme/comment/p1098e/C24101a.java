package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;

/* renamed from: com.ss.android.ugc.aweme.comment.e.a */
public abstract class C24101a<Item, Response> extends C25673a<Item, Response> {

    /* renamed from: a */
    public final C24132c f63732a = new C24132c();

    /* renamed from: a */
    public abstract void mo62510a(Response response);

    public boolean sendRequest(Object... objArr) {
        this.f63732a.mo62545a();
        return super.sendRequest(objArr);
    }

    public void handleData(Response response) {
        super.handleData(response);
        if (response instanceof BaseResponse) {
            this.f63732a.mo62548a((BaseResponse) response);
        }
        mo62510a(response);
    }
}
