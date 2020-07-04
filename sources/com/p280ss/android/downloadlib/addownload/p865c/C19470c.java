package com.p280ss.android.downloadlib.addownload.p865c;

import android.os.AsyncTask;
import android.os.Environment;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.io.File;

/* renamed from: com.ss.android.downloadlib.addownload.c.c */
public final class C19470c extends AsyncTask<DownloadInfo, Void, String> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String doInBackground(DownloadInfo... downloadInfoArr) {
        long j;
        long j2;
        boolean z;
        DownloadInfo[] downloadInfoArr2 = downloadInfoArr;
        if (downloadInfoArr2 == null || downloadInfoArr2.length <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        try {
            j = C20359e.m67586c(externalStorageDirectory.toString());
        } catch (Exception unused) {
            j = 0;
        }
        DownloadInfo downloadInfo = downloadInfoArr2[0];
        C19469b.m64048a();
        C19469b.m64050b();
        try {
            j2 = C20359e.m67586c(externalStorageDirectory.toString());
        } catch (Exception unused2) {
            j2 = 0;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (j2 <= downloadInfo.getTotalBytes() || !C19471d.m64054a().mo51546c(downloadInfo.getUrl())) {
            z = false;
        } else {
            Downloader.getInstance(C19491j.m64206a()).restart(downloadInfo.getId());
            C19471d.m64054a().mo51543a(downloadInfo.getUrl());
            z = true;
        }
        m64052a(downloadInfo, j, j2, downloadInfo.getTotalBytes(), currentTimeMillis2, 0, z);
        return null;
    }

    /* renamed from: a */
    private static void m64052a(DownloadInfo downloadInfo, long j, long j2, long j3, long j4, long j5, boolean z) {
        if (downloadInfo != null) {
            long a = C19490i.m64191a(downloadInfo);
            if (a > 0) {
                C19444a.m63957a().mo51491a(a, downloadInfo, j, j2, j3, j4, 0, z);
            }
        }
    }
}
