package com.p280ss.android.ugc.aweme.zhima;

import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.zhima.b */
public final class C43584b extends C34028a<CommonResponse> {
    /* renamed from: a */
    public final void mo105519a() {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return VerifyApi.m138108a();
            }
        }, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(CommonResponse commonResponse) {
        super.handleData(commonResponse);
        if (((CommonResponse) this.mData).statusCode == 0) {
            C10761a.m31404c(C6399b.m19921a(), "清除成功~ 可以去重新走认证流程了", 0).mo25750a();
        } else {
            C10761a.m31396b(C6399b.m19921a(), "清除失败@_@", 0).mo25750a();
        }
    }
}
