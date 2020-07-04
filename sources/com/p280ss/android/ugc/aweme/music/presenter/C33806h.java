package com.p280ss.android.ugc.aweme.music.presenter;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.h */
public final class C33806h extends C25640a {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
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
                return MusicApi.m108889a(((Integer) objArr[0]).intValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3]);
            }
        }, 0);
        return true;
    }
}
