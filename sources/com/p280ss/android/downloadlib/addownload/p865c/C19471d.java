package com.p280ss.android.downloadlib.addownload.p865c;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.downloadlib.p868c.C19513b;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.ss.android.downloadlib.addownload.c.d */
public class C19471d {

    /* renamed from: b */
    private static volatile C19471d f52717b;

    /* renamed from: a */
    public long f52718a;

    /* renamed from: c */
    private HashMap<String, Integer> f52719c = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo51545b() {
        this.f52718a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static C19471d m64054a() {
        if (f52717b == null) {
            synchronized (C19471d.class) {
                if (f52717b == null) {
                    f52717b = new C19471d();
                }
            }
        }
        return f52717b;
    }

    /* renamed from: a */
    public final void mo51543a(String str) {
        this.f52719c.put(str, Integer.valueOf(mo51544b(str) + 1));
    }

    /* renamed from: b */
    public final int mo51544b(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (this.f52719c == null) {
            this.f52719c = new HashMap<>();
        }
        if (this.f52719c.containsKey(str)) {
            i = ((Integer) this.f52719c.get(str)).intValue();
        }
        return i;
    }

    /* renamed from: c */
    public final boolean mo51546c(String str) {
        int i;
        if (this.f52719c == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f52719c.containsKey(str)) {
            i = ((Integer) this.f52719c.get(str)).intValue();
        } else {
            i = 0;
        }
        if (i > 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m64056b(DownloadInfo downloadInfo) {
        if (downloadInfo != null && C19495l.m64243a(downloadInfo.getId()).mo51596a("delete_file_after_install", 0) != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(downloadInfo.getSavePath());
                sb.append(File.separator);
                sb.append(downloadInfo.getName());
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    File file = new File(sb2);
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo51542a(DownloadInfo downloadInfo) {
        if (downloadInfo != null && System.currentTimeMillis() - this.f52718a >= 600000) {
            this.f52718a = System.currentTimeMillis();
            C19513b.m64281a(new C19470c(), downloadInfo);
        }
    }

    /* renamed from: a */
    public static void m64055a(C19236a aVar, Context context) {
        if (context != null && aVar != null && aVar.f52022a > 0) {
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo((int) aVar.f52032k);
            if (downloadInfo != null) {
                m64056b(downloadInfo);
            }
        }
    }
}
