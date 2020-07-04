package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.net.Uri.Builder;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.IReportService.IReportCallback;
import com.p280ss.android.ugc.aweme.report.C37196b;

/* renamed from: com.ss.android.ugc.aweme.services.ReportService */
public class ReportService implements IReportService {
    public void showReportDialog(Activity activity, String str, Builder builder, IReportCallback iReportCallback) {
        C37196b.m119561a(activity, str, builder);
    }

    public void showReportDialog(Activity activity, String str, String str2, String str3, IReportCallback iReportCallback) {
        C37196b.m119562a(activity, str, str2, str3);
    }

    public void showReportDialog(Activity activity, String str, String str2, String str3, String str4, IReportCallback iReportCallback) {
        C37196b.m119563a(activity, str, str2, str3, str4, false, null);
    }
}
