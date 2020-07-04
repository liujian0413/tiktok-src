package com.p280ss.android.downloadlib.addownload.p865c;

import android.os.Environment;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.downloader.depend.C20239m;
import com.p280ss.android.socialbase.downloader.depend.C20240n;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.c.a */
public final class C19468a implements C20240n {

    /* renamed from: a */
    public int f52716a;

    /* renamed from: a */
    private static void m64043a() {
        C19469b.m64048a();
        C19469b.m64050b();
    }

    /* renamed from: a */
    private static long m64042a(String str) {
        try {
            return C20359e.m67586c(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m64045a(C19495l lVar) {
        if (lVar.mo51596a("exec_clear_space_switch", 0) != 1) {
            return false;
        }
        if (System.currentTimeMillis() - C19471d.m64054a().f52718a < lVar.mo51597a("clear_space_min_time_interval", 600000)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static long m64046b(C19495l lVar) {
        long a = lVar.mo51597a("clear_space_sleep_time", 0);
        if (a <= 0) {
            return 0;
        }
        long j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        if (a <= DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            j = a;
        }
        new StringBuilder("waiting for space clear, sleepTime = ").append(j);
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        return j;
    }

    /* renamed from: a */
    public final boolean mo51539a(long j, long j2, C20239m mVar) {
        long j3;
        long j4 = j2;
        C19495l a = C19495l.m64243a(this.f52716a);
        if (!m64045a(a)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C19471d.m64054a().mo51545b();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        long a2 = m64042a(externalStorageDirectory.toString());
        m64043a();
        long a3 = m64042a(externalStorageDirectory.toString());
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (a3 < j4) {
            j3 = m64046b(a);
            if (j3 > 0) {
                a3 = m64042a(externalStorageDirectory.toString());
            }
        } else {
            j3 = 0;
        }
        StringBuilder sb = new StringBuilder("cleanUpDisk, byteRequired = ");
        sb.append(j4);
        sb.append(", byteAvailableAfter = ");
        sb.append(a3);
        sb.append(", cleaned = ");
        sb.append(a3 - a2);
        long j5 = a3;
        m64044a(a2, a3, j2, currentTimeMillis2, j3);
        if (j5 < j4) {
            return false;
        }
        if (mVar != null) {
            mVar.mo54111a();
        }
        return true;
    }

    /* renamed from: a */
    private void m64044a(long j, long j2, long j3, long j4, long j5) {
        boolean z;
        DownloadInfo downloadInfo = Downloader.getInstance(C19491j.m64206a()).getDownloadInfo(this.f52716a);
        if (downloadInfo != null) {
            try {
                long a = C19523h.m64304a(new JSONObject(downloadInfo.getExtra()), "extra");
                if (a > 0) {
                    if (j2 > j3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C19444a.m63957a().mo51491a(a, downloadInfo, j, j2, j3, j4, j5, z);
                }
            } catch (Exception unused) {
            }
        }
    }
}
