package com.p280ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.downloadlib.C19529f;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* renamed from: com.ss.android.downloadlib.addownload.c */
public class C19466c {

    /* renamed from: a */
    private static volatile C19466c f52712a;

    /* renamed from: b */
    private Handler f52713b;

    /* renamed from: b */
    public static boolean m64040b() {
        if (C19491j.m64228i().optInt("forbid_invalidte_download_file_install", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C19466c m64039a() {
        if (f52712a == null) {
            synchronized (C19466c.class) {
                if (f52712a == null) {
                    f52712a = new C19466c();
                }
            }
        }
        return f52712a;
    }

    /* renamed from: a */
    public final void mo51537a(Context context, final DownloadInfo downloadInfo) {
        if (m64040b()) {
            try {
                File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                if (file.isFile() && file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            if (this.f52713b == null) {
                this.f52713b = new Handler(Looper.getMainLooper());
            }
            Downloader.getInstance(context).clearDownloadData(downloadInfo.getId());
            this.f52713b.post(new Runnable() {
                public final void run() {
                    C19491j.m64223d().mo51365a(C19491j.m64206a(), "下载失败，请重试！", null, 0);
                    if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getUrl())) {
                        C19480f c = C19529f.m64362a().mo51658c(downloadInfo.getUrl());
                        if (c != null) {
                            c.mo51565f();
                        }
                    }
                }
            });
        }
    }
}
