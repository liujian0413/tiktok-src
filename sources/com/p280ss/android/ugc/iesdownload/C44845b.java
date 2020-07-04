package com.p280ss.android.ugc.iesdownload;

import android.content.Context;
import com.p280ss.android.ugc.aweme.net.C34098r;

/* renamed from: com.ss.android.ugc.iesdownload.b */
final class C44845b {
    /* renamed from: a */
    static Context m141517a(IesDownLoadConfigProvider iesDownLoadConfigProvider) {
        IesDownLoadConfigProvider.getInstance().setOkHttpClient(C34098r.m109769a().mo86752c());
        return iesDownLoadConfigProvider.mContext;
    }
}
