package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.i.a */
public final class C28442a extends C25640a {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 5 && objArr.length != 6 && objArr.length != 8)) {
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
                int i;
                int i2;
                String str;
                if (objArr.length == 5) {
                    i = -1;
                } else {
                    i = ((Integer) objArr[5]).intValue();
                }
                if (objArr.length == 8) {
                    i2 = ((Integer) objArr[6]).intValue();
                } else {
                    i2 = 0;
                }
                if (objArr.length == 8) {
                    str = objArr[7].toString();
                } else {
                    str = null;
                }
                AwemeStatsApi.m92730a((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Integer) objArr[4]).intValue(), i, i2, str);
                return null;
            }
        }, 0);
        return true;
    }
}
