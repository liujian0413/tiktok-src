package com.p280ss.android.downloadlib;

import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.downloadlib.addownload.p865c.C19471d;
import com.p280ss.android.downloadlib.p867b.C19499b;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.b */
public class C19497b implements IAppDownloadMonitorListener {

    /* renamed from: a */
    private static String f52789a = "b";

    /* renamed from: a */
    private static void m64256a(DownloadInfo downloadInfo) {
        if (downloadInfo != null && C19495l.m64243a(downloadInfo.getId()).mo51596a("exec_clear_space_switch", 0) != 0) {
            C19471d.m64054a().mo51542a(downloadInfo);
        }
    }

    /* renamed from: a */
    private static void m64257a(Long l, DownloadInfo downloadInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(downloadInfo.getSavePath());
        sb.append(File.separator);
        sb.append(downloadInfo.getName());
        String f = C19523h.m64336f(C19491j.m64206a(), sb.toString());
        if (TextUtils.isEmpty(f)) {
            f = "";
        }
        C19499b.m64258a().mo51608a(l, f);
    }

    public void onAppDownloadMonitorSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
        if (downloadInfo != null) {
            if (i == -1 && baseException != null) {
                try {
                    String extra = downloadInfo.getExtra();
                    if (!TextUtils.isEmpty(extra)) {
                        long a = C19523h.m64304a(new JSONObject(extra), "extra");
                        if (a > 0) {
                            C19444a.m63957a().mo51490a(a, baseException.getErrorCode(), C19523h.m64308a(baseException.getMessage(), C19491j.m64228i().optInt("exception_msg_length", 170)), downloadInfo.getDownloadTime(), downloadInfo);
                            if (C19523h.m64324a(baseException)) {
                                m64256a(downloadInfo);
                            }
                        }
                    }
                    C19529f.m64362a().mo51655a(downloadInfo, baseException, "");
                    StringBuilder sb = new StringBuilder("onAppDownloadMonitorSend, downloadUrl: ");
                    sb.append(downloadInfo.getUrl());
                    sb.append(" fail status:");
                    sb.append(baseException.getErrorCode());
                    sb.append(", fail message:");
                    sb.append(baseException.getErrorMessage());
                } catch (Exception e) {
                    new StringBuilder("onAppDownloadMonitorSend, exception: ").append(e.getMessage());
                }
            } else if (i == -3 && !downloadInfo.canShowNotification()) {
                String extra2 = downloadInfo.getExtra();
                if (!TextUtils.isEmpty(extra2)) {
                    long a2 = C19523h.m64304a(new JSONObject(extra2), "extra");
                    StringBuilder sb2 = new StringBuilder("onAppDownloadMonitorSend, download success step url: ");
                    sb2.append(downloadInfo.getUrl());
                    sb2.append(", adId: ");
                    sb2.append(a2);
                    if (a2 > 0) {
                        C19444a.m63964a(downloadInfo, a2);
                        C19444a.m63957a().mo51489a(a2);
                        m64257a(Long.valueOf(a2), downloadInfo);
                    }
                }
                C19529f.m64362a().mo51656a(downloadInfo, "");
                new StringBuilder("onAppDownloadMonitorSend, download success: ").append(downloadInfo.getUrl());
            }
        }
    }
}
