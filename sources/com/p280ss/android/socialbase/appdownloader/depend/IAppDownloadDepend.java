package com.p280ss.android.socialbase.appdownloader.depend;

import android.content.Context;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend */
public interface IAppDownloadDepend {
    boolean getAllowBootReceiver();

    boolean getAllowNetwork(Context context);

    IDownloadAlertDialogBuilder getThemedAlertDlgBuilder(Context context);
}
