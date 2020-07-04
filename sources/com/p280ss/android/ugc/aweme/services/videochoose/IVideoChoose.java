package com.p280ss.android.ugc.aweme.services.videochoose;

import android.support.p022v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.services.videochoose.IVideoChoose */
public interface IVideoChoose {

    /* renamed from: com.ss.android.ugc.aweme.services.videochoose.IVideoChoose$Callback */
    public interface Callback {
        void onData(String str);
    }

    Fragment fragment();

    void loadData();
}
