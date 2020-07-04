package com.p280ss.android.downloadlib.addownload.p865c;

import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.downloadlib.addownload.c.b */
public final class C19469b {
    /* renamed from: a */
    public static void m64048a() {
        List unCompletedDownloadAppInfos = AppDownloader.getInstance().getUnCompletedDownloadAppInfos(C19491j.m64206a());
        if (unCompletedDownloadAppInfos != null && unCompletedDownloadAppInfos.size() > 0) {
            for (int i = 0; i < unCompletedDownloadAppInfos.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) unCompletedDownloadAppInfos.get(i);
                File file = new File(downloadInfo.getTempPath(), downloadInfo.getTempName());
                long lastModified = file.lastModified();
                long a = ((long) C19495l.m64243a(downloadInfo.getId()).mo51596a("download_file_expire_hours", 0)) * 3600000;
                if (a <= 0) {
                    a = 604800000;
                }
                if (file.isFile() && file.exists() && System.currentTimeMillis() - lastModified >= a) {
                    m64049a(file);
                    Downloader.getInstance(C19491j.m64206a()).clearDownloadData(downloadInfo.getId());
                }
            }
        }
    }

    /* renamed from: b */
    public static void m64050b() {
        List successedDownloadInfosWithMimeType = Downloader.getInstance(C19491j.m64206a()).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
        if (successedDownloadInfosWithMimeType != null && !successedDownloadInfosWithMimeType.isEmpty()) {
            for (int i = 0; i < successedDownloadInfosWithMimeType.size(); i++) {
                DownloadInfo downloadInfo = (DownloadInfo) successedDownloadInfosWithMimeType.get(i);
                if (downloadInfo != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(downloadInfo.getSavePath());
                    sb.append(File.separator);
                    sb.append(downloadInfo.getName());
                    String sb2 = sb.toString();
                    File file = new File(sb2);
                    if (file.exists()) {
                        long currentTimeMillis = System.currentTimeMillis() - file.lastModified();
                        long a = ((long) C19495l.m64243a(downloadInfo.getId()).mo51596a("download_complete_file_expire_hours", 0)) * 3600000;
                        if (a <= 0) {
                            a = 604800000;
                        }
                        boolean z = true;
                        if (currentTimeMillis < a && !C19523h.m64329b(C19491j.m64206a(), sb2)) {
                            z = false;
                        }
                        if (z) {
                            m64049a(file);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m64049a(java.io.File r2) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001f, all -> 0x0017 }
            java.lang.String r0 = "1"
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            r1.write(r0)     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            r1.close()     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            goto L_0x0024
        L_0x0013:
            r2 = move-exception
            goto L_0x0019
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r2 = move-exception
            r1 = r0
        L_0x0019:
            if (r1 == 0) goto L_0x001e
            r1.close()     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            throw r2
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r2.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.addownload.p865c.C19469b.m64049a(java.io.File):void");
    }
}
