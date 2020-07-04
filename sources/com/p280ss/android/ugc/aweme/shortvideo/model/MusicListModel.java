package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicListModel */
public class MusicListModel extends C25640a<MusicList> {
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean sendRequest(Object... objArr) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                return MusicChoicesApi.m122937a();
            }
        }, 0);
        return true;
    }
}
