package com.p280ss.android.ugc.aweme.notice.api.adapter;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter */
public interface NoticeLiveServiceAdapter {
    void enterLiveConverge(Context context, Bundle bundle);

    boolean hasLivePermission();

    void setLivePermission(boolean z);
}
