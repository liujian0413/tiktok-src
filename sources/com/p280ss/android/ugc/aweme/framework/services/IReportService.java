package com.p280ss.android.ugc.aweme.framework.services;

import android.app.Activity;
import android.net.Uri.Builder;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IReportService */
public interface IReportService {

    /* renamed from: com.ss.android.ugc.aweme.framework.services.IReportService$IReportCallback */
    public interface IReportCallback {
        void onReportEnd();

        void onReportStart();
    }

    void showReportDialog(Activity activity, String str, Builder builder, IReportCallback iReportCallback);

    void showReportDialog(Activity activity, String str, String str2, String str3, IReportCallback iReportCallback);

    void showReportDialog(Activity activity, String str, String str2, String str3, String str4, IReportCallback iReportCallback);
}
