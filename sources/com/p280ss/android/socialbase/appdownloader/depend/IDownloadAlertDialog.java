package com.p280ss.android.socialbase.appdownloader.depend;

import android.widget.Button;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog */
public interface IDownloadAlertDialog {
    void dismiss();

    Button getButton(int i);

    boolean isShowing();

    void show();
}
