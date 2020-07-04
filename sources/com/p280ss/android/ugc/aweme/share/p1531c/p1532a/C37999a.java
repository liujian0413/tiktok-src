package com.p280ss.android.ugc.aweme.share.p1531c.p1532a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.c.a.a */
public final class C37999a extends C25640a<String> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C37950a.m121238a().dislikeAweme((Aweme) objArr[0]);
            }
        }, 0);
        return true;
    }
}
