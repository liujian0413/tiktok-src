package com.p280ss.android.socialbase.downloader.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.C1642a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus;
import com.p280ss.android.socialbase.downloader.depend.C20207aa;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p280ss.android.socialbase.downloader.impls.C20315l;
import com.p280ss.android.socialbase.downloader.model.C20340b;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.network.C20344c;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: com.ss.android.socialbase.downloader.utils.e */
public class C20359e {

    /* renamed from: a */
    private static final String f55029a = "e";

    /* renamed from: b */
    private static final Pattern f55030b = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: c */
    private static String f55031c = null;

    /* renamed from: d */
    private static volatile SparseArray<Boolean> f55032d = new SparseArray<>();

    /* renamed from: e */
    private static volatile SparseArray<List<C20207aa>> f55033e = new SparseArray<>();

    /* renamed from: f */
    private static final char[] f55034f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g */
    private static Pattern f55035g = null;

    /* renamed from: h */
    private static Pattern f55036h = null;

    /* renamed from: a */
    public static boolean m67557a(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    /* renamed from: a */
    public static boolean m67558a(int i, String str) {
        return i == 206 || i == 1;
    }

    /* renamed from: a */
    public static boolean m67560a(long j) {
        return j == -1;
    }

    /* renamed from: a */
    public static boolean m67561a(long j, long j2) {
        return j > 65536 && j2 > 500;
    }

    /* renamed from: b */
    public static boolean m67578b(int i) {
        return i == 206 || i == 200;
    }

    /* renamed from: a */
    private static String m67545a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f55034f[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f55034f[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static List<DownloadChunk> m67546a(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.mo54545d()) {
                    sparseArray.put(downloadChunk.f54923e, downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.f54923e);
                    if (list2 != null) {
                        for (DownloadChunk a : list2) {
                            a.mo54540a(downloadChunk);
                        }
                        downloadChunk.f54925g = list2;
                    }
                } else {
                    DownloadChunk downloadChunk2 = (DownloadChunk) sparseArray.get(downloadChunk.mo54542b());
                    if (downloadChunk2 != null) {
                        List list3 = downloadChunk2.f54925g;
                        if (list3 == null) {
                            list3 = new ArrayList();
                            downloadChunk2.f54925g = list3;
                        }
                        downloadChunk.mo54540a(downloadChunk2);
                        list3.add(downloadChunk);
                    } else {
                        List list4 = (List) sparseArray2.get(downloadChunk.mo54542b());
                        if (list4 == null) {
                            list4 = new ArrayList();
                            sparseArray2.put(downloadChunk.mo54542b(), list4);
                        }
                        list4.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    /* renamed from: a */
    public static void m67550a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            m67598e(downloadInfo.getSavePath(), downloadInfo.getName());
            m67598e(downloadInfo.getTempPath(), downloadInfo.getTempName());
        }
    }

    /* renamed from: a */
    public static boolean m67563a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m67581b(DownloadInfo downloadInfo) {
        return m67566a(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    /* renamed from: a */
    public static boolean m67566a(DownloadInfo downloadInfo, boolean z, String str) {
        if (z || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        try {
            if (new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists() && m67572b(downloadInfo.getSavePath(), downloadInfo.getName(), str) == Md5CheckStatus.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m67569a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (new File(str, str2).exists() && m67572b(str, str2, (String) null) == Md5CheckStatus.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static void m67552a(DownloadInfo downloadInfo, C20207aa aaVar) {
        BaseException baseException;
        boolean z;
        new StringBuilder("saveFileAsTargetName targetName is ").append(downloadInfo.getTargetFilePath());
        try {
            File file = new File(downloadInfo.getTempPath(), downloadInfo.getTempName());
            File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            DownloadInfo downloadInfo2 = Downloader.getInstance(C20269b.m66765x()).getDownloadInfo(downloadInfo.getId());
            if (!file.exists()) {
                if (file2.exists()) {
                    if (downloadInfo.checkMd5Valid() == Md5CheckStatus.VALID) {
                        aaVar.mo54129a();
                        return;
                    } else if (downloadInfo2 != null && downloadInfo2.isSaveTempFile()) {
                        downloadInfo2.registerTempFileSaveCallback(aaVar);
                        return;
                    }
                } else if (downloadInfo2 != null && downloadInfo2.isSaveTempFile()) {
                    downloadInfo2.registerTempFileSaveCallback(aaVar);
                    return;
                }
            } else if (file2.exists()) {
                Md5CheckStatus checkMd5Valid = downloadInfo.checkMd5Valid();
                if (checkMd5Valid == Md5CheckStatus.VALID) {
                    aaVar.mo54129a();
                    return;
                } else if (downloadInfo2 == null || !downloadInfo2.isSaveTempFile()) {
                    if (downloadInfo2 != null) {
                        downloadInfo2.setIsSaveTempFile(true);
                    }
                    if (!file2.delete()) {
                        StringBuilder sb = new StringBuilder("delete targetPath file existed with md5 check invalid status:");
                        sb.append(checkMd5Valid.name());
                        sb.append(" failed!");
                        BaseException baseException2 = new BaseException(1037, sb.toString());
                        aaVar.mo54130a(baseException2);
                        if (downloadInfo2 != null) {
                            downloadInfo2.handleTempSaveCallback(false, baseException2);
                        }
                        return;
                    }
                } else {
                    downloadInfo2.registerTempFileSaveCallback(aaVar);
                    return;
                }
            }
            if (downloadInfo2 != null) {
                downloadInfo2.setIsSaveTempFile(true);
            }
            try {
                z = !m67583b(file, file2);
                baseException = null;
            } catch (BaseException e) {
                baseException = e;
                z = false;
            }
            if (z) {
                if (baseException == null) {
                    baseException = new BaseException(1038, C1642a.m8034a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s), temp file is exist: %d", new Object[]{downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName(), Boolean.valueOf(file.exists())}));
                }
                aaVar.mo54130a(baseException);
                if (downloadInfo2 != null) {
                    downloadInfo2.handleTempSaveCallback(false, baseException);
                }
            } else {
                aaVar.mo54129a();
                if (downloadInfo2 != null) {
                    downloadInfo2.handleTempSaveCallback(true, null);
                }
            }
        } catch (Throwable th) {
            new StringBuilder("saveFileAsTargetName throwable ").append(th.getMessage());
            aaVar.mo54130a(new BaseException(1038, m67575b(th, "saveFileAsTargetName")));
        }
    }

    /* JADX INFO: used method not loaded: com.ss.android.socialbase.downloader.c.a.a(com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend, com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.exception.BaseException, int):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = new java.io.File(r17.getTempPath(), r17.getTempName());
        r5 = new java.io.File(r17.getSavePath(), r17.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r5.exists() == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r6 = r17.checkMd5Valid();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        if (r6 != com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus.VALID) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r19.mo54129a();
        m67549a(r17.getId(), true, (com.p280ss.android.socialbase.downloader.exception.BaseException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (r4.exists() != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        r15 = new com.p280ss.android.socialbase.downloader.exception.BaseException(1005, com.C1642a.m8034a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", new java.lang.Object[]{r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName(), r6.name()}));
        r2.mo54130a(r15);
        m67549a(r17.getId(), false, r15);
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00df, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        if (r5.delete() != false) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e6, code lost:
        if (r3 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
        if (r0 == null) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
        com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r0, r1, new com.p280ss.android.socialbase.downloader.exception.BaseException(1038, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), r17.getStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        r11 = new java.lang.StringBuilder("delete targetPath file existed with md5 check invalid status:");
        r11.append(r6.name());
        r11.append(" failed!");
        r3 = new com.p280ss.android.socialbase.downloader.exception.BaseException(1037, r11.toString());
        r2.mo54130a(r3);
        m67549a(r17.getId(), false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0128, code lost:
        if (r4.exists() != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012a, code lost:
        r3 = new com.p280ss.android.socialbase.downloader.exception.BaseException(1005, com.C1642a.m8034a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", new java.lang.Object[]{r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName()}));
        r2.mo54130a(r3);
        m67549a(r17.getId(), false, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0159, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015c, code lost:
        if (r3 == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015e, code lost:
        r3 = m67540a(r4, r17.getMd5());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0168, code lost:
        if (r3 == com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus.VALID) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x016a, code lost:
        r5 = new com.p280ss.android.socialbase.downloader.exception.BaseException(1038, com.C1642a.m8034a("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile md5 is invalid : %s", new java.lang.Object[]{r17.getTempPath(), r17.getTempName(), r17.getSavePath(), r17.getName(), r3.name()}));
        r2.mo54130a(r5);
        m67549a(r17.getId(), false, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a5, code lost:
        if (r4.delete() != false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a7, code lost:
        if (r0 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a9, code lost:
        com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r0, r1, new com.p280ss.android.socialbase.downloader.exception.BaseException(1038, "tempFile md5 is invalid ,but delete failed"), r17.getStatus());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01be, code lost:
        r0 = !m67583b(r4, r5);
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c2, code lost:
        r3 = r0;
        r0 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m67551a(com.p280ss.android.socialbase.downloader.model.DownloadInfo r17, com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r18, com.p280ss.android.socialbase.downloader.depend.C20207aa r19) {
        /*
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "saveFileAsTargetName targetName is "
            r3.<init>(r4)
            java.lang.String r4 = r17.getTargetFilePath()
            r3.append(r4)
            android.util.SparseArray<java.lang.Boolean> r4 = f55032d     // Catch:{ Throwable -> 0x0209 }
            monitor-enter(r4)     // Catch:{ Throwable -> 0x0209 }
            android.util.SparseArray<java.lang.Boolean> r5 = f55032d     // Catch:{ all -> 0x0206 }
            int r6 = r17.getId()     // Catch:{ all -> 0x0206 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0206 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0206 }
            r7 = 1
            r8 = 0
            if (r5 != r6) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x004d
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.depend.aa>> r0 = f55033e     // Catch:{ all -> 0x0206 }
            int r5 = r17.getId()     // Catch:{ all -> 0x0206 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0206 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0206 }
            if (r0 != 0) goto L_0x0048
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0206 }
            r0.<init>()     // Catch:{ all -> 0x0206 }
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.depend.aa>> r5 = f55033e     // Catch:{ all -> 0x0206 }
            int r1 = r17.getId()     // Catch:{ all -> 0x0206 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0206 }
        L_0x0048:
            r0.add(r2)     // Catch:{ all -> 0x0206 }
            monitor-exit(r4)     // Catch:{ all -> 0x0206 }
            return
        L_0x004d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0206 }
            java.lang.String r6 = "saveTempFileStatusMap put id:"
            r5.<init>(r6)     // Catch:{ all -> 0x0206 }
            int r6 = r17.getId()     // Catch:{ all -> 0x0206 }
            r5.append(r6)     // Catch:{ all -> 0x0206 }
            android.util.SparseArray<java.lang.Boolean> r5 = f55032d     // Catch:{ all -> 0x0206 }
            int r6 = r17.getId()     // Catch:{ all -> 0x0206 }
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0206 }
            r5.put(r6, r9)     // Catch:{ all -> 0x0206 }
            monitor-exit(r4)     // Catch:{ all -> 0x0206 }
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r5 = r17.getTempPath()     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = r17.getTempName()     // Catch:{ Throwable -> 0x0209 }
            r4.<init>(r5, r6)     // Catch:{ Throwable -> 0x0209 }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = r17.getSavePath()     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r9 = r17.getName()     // Catch:{ Throwable -> 0x0209 }
            r5.<init>(r6, r9)     // Catch:{ Throwable -> 0x0209 }
            boolean r6 = r5.exists()     // Catch:{ Throwable -> 0x0209 }
            r9 = 5
            r10 = 1005(0x3ed, float:1.408E-42)
            r11 = 0
            r12 = 3
            r13 = 2
            r14 = 4
            if (r6 == 0) goto L_0x0124
            com.ss.android.socialbase.downloader.constants.Md5CheckStatus r6 = r17.checkMd5Valid()     // Catch:{ Throwable -> 0x0209 }
            com.ss.android.socialbase.downloader.constants.Md5CheckStatus r15 = com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus.VALID     // Catch:{ Throwable -> 0x0209 }
            if (r6 != r15) goto L_0x00a2
            r19.mo54129a()     // Catch:{ Throwable -> 0x0209 }
            int r6 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r6, r7, r11)     // Catch:{ Throwable -> 0x0209 }
            goto L_0x0159
        L_0x00a2:
            boolean r15 = r4.exists()     // Catch:{ Throwable -> 0x0209 }
            if (r15 != 0) goto L_0x00df
            com.ss.android.socialbase.downloader.exception.BaseException r15 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r11 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r16 = r17.getTempPath()     // Catch:{ Throwable -> 0x0209 }
            r3[r8] = r16     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r16 = r17.getTempName()     // Catch:{ Throwable -> 0x0209 }
            r3[r7] = r16     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r16 = r17.getSavePath()     // Catch:{ Throwable -> 0x0209 }
            r3[r13] = r16     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r16 = r17.getName()     // Catch:{ Throwable -> 0x0209 }
            r3[r12] = r16     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r16 = r6.name()     // Catch:{ Throwable -> 0x0209 }
            r3[r14] = r16     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r3 = com.C1642a.m8034a(r11, r3)     // Catch:{ Throwable -> 0x0209 }
            r15.<init>(r10, r3)     // Catch:{ Throwable -> 0x0209 }
            r2.mo54130a(r15)     // Catch:{ Throwable -> 0x0209 }
            int r3 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r3, r8, r15)     // Catch:{ Throwable -> 0x0209 }
            r3 = 0
            goto L_0x00e0
        L_0x00df:
            r3 = 1
        L_0x00e0:
            boolean r10 = r5.delete()     // Catch:{ Throwable -> 0x0209 }
            if (r10 != 0) goto L_0x015c
            if (r3 != 0) goto L_0x00fb
            if (r0 == 0) goto L_0x015c
            com.ss.android.socialbase.downloader.exception.BaseException r6 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r10 = "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"
            r11 = 1038(0x40e, float:1.455E-42)
            r6.<init>(r11, r10)     // Catch:{ Throwable -> 0x0209 }
            int r10 = r17.getStatus()     // Catch:{ Throwable -> 0x0209 }
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r0, r1, r6, r10)     // Catch:{ Throwable -> 0x0209 }
            goto L_0x015c
        L_0x00fb:
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            r10 = 1037(0x40d, float:1.453E-42)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r15 = "delete targetPath file existed with md5 check invalid status:"
            r11.<init>(r15)     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = r6.name()     // Catch:{ Throwable -> 0x0209 }
            r11.append(r6)     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = " failed!"
            r11.append(r6)     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = r11.toString()     // Catch:{ Throwable -> 0x0209 }
            r3.<init>(r10, r6)     // Catch:{ Throwable -> 0x0209 }
            r2.mo54130a(r3)     // Catch:{ Throwable -> 0x0209 }
            int r6 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r6, r8, r3)     // Catch:{ Throwable -> 0x0209 }
            goto L_0x0159
        L_0x0124:
            boolean r3 = r4.exists()     // Catch:{ Throwable -> 0x0209 }
            if (r3 != 0) goto L_0x015b
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist"
            java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r15 = r17.getTempPath()     // Catch:{ Throwable -> 0x0209 }
            r11[r8] = r15     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r15 = r17.getTempName()     // Catch:{ Throwable -> 0x0209 }
            r11[r7] = r15     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r15 = r17.getSavePath()     // Catch:{ Throwable -> 0x0209 }
            r11[r13] = r15     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r15 = r17.getName()     // Catch:{ Throwable -> 0x0209 }
            r11[r12] = r15     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = com.C1642a.m8034a(r6, r11)     // Catch:{ Throwable -> 0x0209 }
            r3.<init>(r10, r6)     // Catch:{ Throwable -> 0x0209 }
            r2.mo54130a(r3)     // Catch:{ Throwable -> 0x0209 }
            int r6 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r6, r8, r3)     // Catch:{ Throwable -> 0x0209 }
        L_0x0159:
            r3 = 0
            goto L_0x015c
        L_0x015b:
            r3 = 1
        L_0x015c:
            if (r3 == 0) goto L_0x0205
            java.lang.String r3 = r17.getMd5()     // Catch:{ Throwable -> 0x0209 }
            com.ss.android.socialbase.downloader.constants.Md5CheckStatus r3 = m67540a(r4, r3)     // Catch:{ Throwable -> 0x0209 }
            com.ss.android.socialbase.downloader.constants.Md5CheckStatus r6 = com.p280ss.android.socialbase.downloader.constants.Md5CheckStatus.VALID     // Catch:{ Throwable -> 0x0209 }
            if (r3 == r6) goto L_0x01ba
            com.ss.android.socialbase.downloader.exception.BaseException r5 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r6 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile md5 is invalid : %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r10 = r17.getTempPath()     // Catch:{ Throwable -> 0x0209 }
            r9[r8] = r10     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r10 = r17.getTempName()     // Catch:{ Throwable -> 0x0209 }
            r9[r7] = r10     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r7 = r17.getSavePath()     // Catch:{ Throwable -> 0x0209 }
            r9[r13] = r7     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r7 = r17.getName()     // Catch:{ Throwable -> 0x0209 }
            r9[r12] = r7     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r3 = r3.name()     // Catch:{ Throwable -> 0x0209 }
            r9[r14] = r3     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r3 = com.C1642a.m8034a(r6, r9)     // Catch:{ Throwable -> 0x0209 }
            r6 = 1038(0x40e, float:1.455E-42)
            r5.<init>(r6, r3)     // Catch:{ Throwable -> 0x0209 }
            r2.mo54130a(r5)     // Catch:{ Throwable -> 0x0209 }
            int r3 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r3, r8, r5)     // Catch:{ Throwable -> 0x0209 }
            boolean r3 = r4.delete()     // Catch:{ Throwable -> 0x0209 }
            if (r3 != 0) goto L_0x0228
            if (r0 == 0) goto L_0x0228
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r4 = "tempFile md5 is invalid ,but delete failed"
            r5 = 1038(0x40e, float:1.455E-42)
            r3.<init>(r5, r4)     // Catch:{ Throwable -> 0x0209 }
            int r4 = r17.getStatus()     // Catch:{ Throwable -> 0x0209 }
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r0, r1, r3, r4)     // Catch:{ Throwable -> 0x0209 }
            goto L_0x0228
        L_0x01ba:
            boolean r0 = m67583b(r4, r5)     // Catch:{ BaseException -> 0x01c1 }
            r0 = r0 ^ r7
            r3 = 0
            goto L_0x01c4
        L_0x01c1:
            r0 = move-exception
            r3 = r0
            r0 = 0
        L_0x01c4:
            if (r0 == 0) goto L_0x01fa
            if (r3 != 0) goto L_0x01ef
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r0 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r5 = r17.getTempPath()     // Catch:{ Throwable -> 0x0209 }
            r4[r8] = r5     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r5 = r17.getTempName()     // Catch:{ Throwable -> 0x0209 }
            r4[r7] = r5     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r5 = r17.getSavePath()     // Catch:{ Throwable -> 0x0209 }
            r4[r13] = r5     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r5 = r17.getName()     // Catch:{ Throwable -> 0x0209 }
            r4[r12] = r5     // Catch:{ Throwable -> 0x0209 }
            java.lang.String r0 = com.C1642a.m8034a(r0, r4)     // Catch:{ Throwable -> 0x0209 }
            r4 = 1038(0x40e, float:1.455E-42)
            r3.<init>(r4, r0)     // Catch:{ Throwable -> 0x0209 }
        L_0x01ef:
            r2.mo54130a(r3)     // Catch:{ Throwable -> 0x0209 }
            int r0 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            m67549a(r0, r8, r3)     // Catch:{ Throwable -> 0x0209 }
            goto L_0x0228
        L_0x01fa:
            r19.mo54129a()     // Catch:{ Throwable -> 0x0209 }
            int r0 = r17.getId()     // Catch:{ Throwable -> 0x0209 }
            r1 = 0
            m67549a(r0, r7, r1)     // Catch:{ Throwable -> 0x0209 }
        L_0x0205:
            return
        L_0x0206:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0206 }
            throw r0     // Catch:{ Throwable -> 0x0209 }
        L_0x0209:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "saveFileAsTargetName throwable "
            r1.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r1.append(r3)
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r3 = "saveFileAsTargetName"
            java.lang.String r0 = m67575b(r0, r3)
            r3 = 1038(0x40e, float:1.455E-42)
            r1.<init>(r3, r0)
            r2.mo54130a(r1)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.utils.C20359e.m67551a(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend, com.ss.android.socialbase.downloader.depend.aa):void");
    }

    /* renamed from: a */
    private static void m67549a(int i, boolean z, BaseException baseException) {
        synchronized (f55032d) {
            List<C20207aa> list = (List) f55033e.get(i);
            if (list != null) {
                for (C20207aa aaVar : list) {
                    if (aaVar != null) {
                        if (z) {
                            aaVar.mo54129a();
                        } else {
                            aaVar.mo54130a(baseException);
                        }
                    }
                }
            }
            new StringBuilder("handleTempSaveCallback id:").append(i);
            f55032d.remove(i);
        }
    }

    /* renamed from: a */
    public static void m67553a(DownloadInfo downloadInfo, String str) throws BaseException {
        if (downloadInfo != null && !TextUtils.isEmpty(str) && !str.equals(downloadInfo.getName())) {
            File file = new File(downloadInfo.getSavePath(), str);
            File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file2.exists() && !file2.delete()) {
                throw new BaseException(1037, "targetPath file exists but can't delete");
            } else if (!m67567a(file, file2)) {
                throw new BaseException(1001, C1642a.m8034a("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
    }

    /* renamed from: a */
    private static boolean m67568a(File file, File file2, boolean z) throws BaseException {
        if (!(file == null || file2 == null)) {
            try {
                if (file.exists() && !file.isDirectory()) {
                    if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.mkdirs()) {
                            if (!parentFile.isDirectory()) {
                                StringBuilder sb = new StringBuilder("Destination '");
                                sb.append(parentFile);
                                sb.append("' directory cannot be created");
                                throw new BaseException(1053, sb.toString());
                            }
                        }
                        if (file2.exists() && !file2.canWrite()) {
                            if (!file2.delete()) {
                                StringBuilder sb2 = new StringBuilder("Destination '");
                                sb2.append(file2);
                                sb2.append("' exists but is read-only and delete failed");
                                throw new IOException(sb2.toString());
                            }
                        }
                        m67576b(file, file2, true);
                        return true;
                    }
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                m67555a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m67583b(File file, File file2) throws BaseException {
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = m67567a(file, file2);
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
        return renameTo;
    }

    /* renamed from: b */
    public static boolean m67582b(C20344c cVar) {
        if (cVar == null) {
            return false;
        }
        return C20356b.m67535a(8) ? "chunked".equals(cVar.mo20817a("Transfer-Encoding")) || m67538a(cVar) == -1 : m67538a(cVar) == -1;
    }

    /* renamed from: a */
    public static List<HttpHeader> m67547a(List<HttpHeader> list, String str, long j, long j2) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        StringBuilder sb = new StringBuilder("range CurrentOffset:");
        sb.append(j);
        sb.append(" EndOffset:");
        sb.append(j2);
        if (j2 == 0) {
            str2 = C1642a.m8034a("bytes=%s-", new Object[]{String.valueOf(j)});
        } else {
            str2 = C1642a.m8034a("bytes=%s-%s", new Object[]{String.valueOf(j), String.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", str2));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m67559a(int i, String str, String str2) {
        return i == -3 && !m67594d(str, str2);
    }

    /* renamed from: a */
    public static boolean m67562a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m67579b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m67556a() {
        String c = m67588c(C20269b.m66765x());
        if ((c == null || !c.contains(":")) && c != null && c.equals(C20269b.m66765x().getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m67570a(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m67584b(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m67564a(BaseException baseException) {
        return baseException.getErrorCode() == 1051;
    }

    /* renamed from: b */
    public static boolean m67580b(BaseException baseException) {
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m67555a(Throwable th, String str) throws BaseException {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("-");
            sb.append(baseException.getErrorMessage());
            baseException.setErrorMsg(sb.toString());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, m67575b(th, str2));
        } else if (m67601f(th)) {
            throw new BaseException(1048, m67575b(th, str2));
        } else if (m67570a(th)) {
            throw new DownloadHttpException(LiveRoomStruct.ROOM_LONGTIME_NO_NET, 412, m67575b(th, str2));
        } else if (m67584b(th)) {
            throw new DownloadHttpException(LiveRoomStruct.ROOM_LONGTIME_NO_NET, 416, m67575b(th, str2));
        } else if (m67603g(th)) {
            throw new BaseException(1047, m67575b(th, str2));
        } else if (m67604h(th)) {
            throw new BaseException(1049, m67575b(th, str2));
        } else if (m67605i(th)) {
            throw new BaseException(1041, m67575b(th, str2));
        } else if (th instanceof IOException) {
            m67554a((IOException) th, str);
        } else {
            throw new BaseException(1000, m67575b(th, str2));
        }
    }

    /* renamed from: a */
    private static void m67554a(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String b = m67575b((Throwable) iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(1041, b);
        } else if (iOException instanceof UnknownHostException) {
            throw new BaseException(1055, b);
        } else if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(1056, b);
        } else if (iOException instanceof UnknownServiceException) {
            throw new BaseException(1057, b);
        } else if (iOException instanceof PortUnreachableException) {
            throw new BaseException(1058, b);
        } else if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(1048, b);
        } else if (iOException instanceof SocketException) {
            throw new BaseException(1059, b);
        } else if (iOException instanceof HttpRetryException) {
            throw new BaseException(1060, b);
        } else if (iOException instanceof ProtocolException) {
            throw new BaseException(1061, b);
        } else if (iOException instanceof MalformedURLException) {
            throw new BaseException(1062, b);
        } else if (iOException instanceof FileNotFoundException) {
            throw new BaseException(1063, b);
        } else if (iOException instanceof InterruptedIOException) {
            throw new BaseException(1064, b);
        } else if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(1065, b);
        } else if (iOException instanceof EOFException) {
            throw new BaseException(1066, b);
        } else if (iOException instanceof StreamResetException) {
            throw new BaseException(1067, b);
        } else if (iOException instanceof SSLException) {
            throw new BaseException(1011, b);
        } else if (m67591c((Throwable) iOException)) {
            throw new BaseException(1006, b);
        } else {
            throw new BaseException(1023, b);
        }
    }

    /* renamed from: a */
    public static boolean m67565a(BaseException baseException, DownloadInfo downloadInfo) {
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1000 || errorCode == 1032 || errorCode == 1033 || errorCode == 1034 || errorCode == 1008 || errorCode == 1026 || errorCode == 1027 || errorCode == 1044 || errorCode == 1020) {
            return true;
        }
        return (errorCode == 1049 || errorCode == 1055 || errorCode == 1006 || downloadInfo == null || downloadInfo.getCurBytes() >= 8388608) ? false : true;
    }

    /* renamed from: d */
    public static boolean m67593d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[SYNTHETIC, Splitter:B:20:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC, Splitter:B:28:0x0064] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m67596e() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.<init>()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            goto L_0x002e
        L_0x0039:
            boolean r3 = com.p280ss.android.socialbase.downloader.p904b.C20190a.m66501a()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 == 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = "get processName = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x004d:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r2
        L_0x0055:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x005b
        L_0x005a:
            r1 = move-exception
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r1
        L_0x0061:
            r1 = r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.utils.C20359e.m67596e():java.lang.String");
    }

    /* renamed from: c */
    public static boolean m67590c() {
        String c = m67588c(C20269b.m66765x());
        if (c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C20269b.m66765x().getPackageName());
            sb.append(":downloader");
            if (c.equals(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m67577b() {
        if (m67590c() || !C20269b.m66743c() || !C20315l.m67199a(true).mo54442g()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m67597e(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    /* renamed from: b */
    public static long m67571b(List<DownloadChunk> list) {
        long j = 0;
        for (DownloadChunk l : list) {
            j += l.mo54554l();
        }
        return j;
    }

    /* renamed from: c */
    public static ListenerType m67587c(int i) {
        ListenerType listenerType = ListenerType.MAIN;
        if (i == ListenerType.SUB.ordinal()) {
            return ListenerType.SUB;
        }
        if (i == ListenerType.NOTIFICATION.ordinal()) {
            return ListenerType.NOTIFICATION;
        }
        return listenerType;
    }

    /* renamed from: h */
    private static boolean m67604h(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if (TextUtils.isEmpty(e) || !e.contains("network not available")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m67605i(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m67538a(C20344c cVar) {
        long j;
        if (cVar == null) {
            return -1;
        }
        String a = cVar.mo20817a("Content-Length");
        if (!TextUtils.isEmpty(a) || !C20356b.m67535a(1)) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            j = m67585c(cVar);
        }
        return j;
    }

    /* renamed from: c */
    public static long m67586c(String str) throws BaseException {
        long j;
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                j = statFs.getAvailableBytes();
            } else {
                j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            if (j > 0) {
                return j;
            }
            throw new BaseException(1052, "availableSpace <= 0");
        } catch (IllegalArgumentException e) {
            throw new BaseException(1050, (Throwable) e);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    /* renamed from: d */
    public static String m67592d(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m67544a(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m67599e(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String c = m67588c(C20269b.m66765x());
        if (c == null || !c.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m67600f(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C1642a.m8034a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    private static String m67602g(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f55035g == null) {
                f55035g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f55035g.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f55036h == null) {
                f55036h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f55036h.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static long m67539a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                String str2 = f55029a;
                StringBuilder sb = new StringBuilder("parse instance length failed with ");
                sb.append(str);
                C20190a.m66502b(str2, sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static String m67573b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C1642a.m8034a("%s.temp", new Object[]{str});
    }

    /* renamed from: c */
    private static long m67585c(C20344c cVar) {
        if (cVar == null) {
            return -1;
        }
        String a = cVar.mo20817a("Content-Range");
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(a);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e) {
            String str = f55029a;
            StringBuilder sb = new StringBuilder("parse content-length from content-range failed ");
            sb.append(e);
            C20190a.m66502b(str, sb.toString());
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m67595d(Throwable th) {
        if (!(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m67601f(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if ((th instanceof SocketTimeoutException) || (!TextUtils.isEmpty(e) && (e.contains("time out") || e.contains("Time-out")))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m67603g(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m67597e(th);
        if (th instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) th;
            if ((downloadHttpException != null && downloadHttpException.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(e) && e.contains("403"))) {
                return true;
            }
        }
        if (TextUtils.isEmpty(e) || !e.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m67588c(Context context) {
        String str = f55031c;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (C20190a.m66501a()) {
                            new StringBuilder("processName = ").append(runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f55031c = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        String e = m67596e();
        f55031c = e;
        return e;
    }

    /* renamed from: a */
    private static String m67544a(byte[] bArr) {
        if (bArr != null) {
            return m67545a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: c */
    public static boolean m67591c(Throwable th) {
        boolean z;
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String message = baseException.getMessage();
                if (TextUtils.isEmpty(message) || !message.contains("ENOSPC")) {
                    return false;
                }
                return true;
            }
        } else if (th instanceof IOException) {
            String e = m67597e(th);
            if (TextUtils.isEmpty(e) || !e.contains("ENOSPC")) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m67567a(File file, File file2) throws BaseException {
        return m67568a(file, file2, true);
    }

    /* renamed from: a */
    public static String m67542a(C20344c cVar, String str) {
        String g = m67602g(cVar.mo20817a("Content-Disposition"));
        if (TextUtils.isEmpty(g)) {
            return m67592d(str);
        }
        return g;
    }

    /* renamed from: d */
    public static boolean m67594d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    /* renamed from: e */
    private static void m67598e(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private static Md5CheckStatus m67540a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return Md5CheckStatus.VALID;
        }
        String a = C20355a.m67532a(file);
        if (TextUtils.isEmpty(a)) {
            return Md5CheckStatus.INVALID_FILE_MD5_EMPTY;
        }
        if (!a.equals(str)) {
            return Md5CheckStatus.INVALID_MD5_NOT_EQUALS;
        }
        return Md5CheckStatus.VALID;
    }

    /* renamed from: b */
    public static String m67574b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C1642a.m8034a("%s%s%s", new Object[]{str, File.separator, str2});
    }

    /* renamed from: a */
    public static C20340b m67541a(String str, String str2) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, (Throwable) new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        if (!file.exists() || !file.isDirectory()) {
            if (!file.exists()) {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        if (file2.exists()) {
                            file2.delete();
                            throw new BaseException(1031, "download savePath is not directory");
                        } else if (!file2.mkdirs()) {
                            throw new BaseException((int) OnRunningErrorCallback.TYPE_SHOT_SCREEN, "download savePath directory can not created");
                        }
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    throw new BaseException(1036, (Throwable) e);
                }
            }
            return new C20340b(file);
        }
        throw new BaseException(1035, (Throwable) new IOException(C1642a.m8034a("path is :%s, path is directory:%B:", new Object[]{str, Boolean.valueOf(file.isDirectory())})));
    }

    /* renamed from: b */
    public static String m67575b(Throwable th, String str) {
        if (str == null) {
            return m67597e(th);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(m67597e(th));
        return sb.toString();
    }

    /* renamed from: c */
    public static String m67589c(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        return str;
    }

    /* renamed from: a */
    public static List<HttpHeader> m67548a(List<HttpHeader> list, String str, DownloadChunk downloadChunk) {
        return m67547a(list, str, downloadChunk.mo54552j(), downloadChunk.f54921c);
    }

    /* renamed from: b */
    public static Md5CheckStatus m67572b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return Md5CheckStatus.VALID;
        }
        File file = new File(str, str2);
        if (!file.exists()) {
            return Md5CheckStatus.INVALID_FILE_NO_EXIST;
        }
        String a = C20355a.m67532a(file);
        if (TextUtils.isEmpty(a)) {
            return Md5CheckStatus.INVALID_FILE_MD5_EMPTY;
        }
        if (!a.equals(str3)) {
            return Md5CheckStatus.INVALID_MD5_NOT_EQUALS;
        }
        return Md5CheckStatus.VALID;
    }

    /* renamed from: a */
    public static String m67543a(String str, String str2, String str3) {
        String str4;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            str4 = m67574b(str2, str3);
        } else {
            str4 = m67574b(str, str3);
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        return C1642a.m8034a("%s.temp", new Object[]{str4});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        r1 = r0;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ed, code lost:
        r1 = r0;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f1, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f4, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x0034] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m67576b(java.io.File r19, java.io.File r20, boolean r21) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            boolean r2 = r20.exists()
            if (r2 == 0) goto L_0x002a
            boolean r2 = r20.isDirectory()
            if (r2 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Destination '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x002a:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            r3 = 0
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ Throwable -> 0x010b }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            java.nio.channels.FileChannel r12 = r11.getChannel()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            long r13 = r10.size()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            r15 = 0
            r17 = r15
        L_0x0045:
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0064
            long r4 = r13 - r17
            r6 = 31457280(0x1e00000, double:1.55419614E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0054
            r8 = r6
            goto L_0x0055
        L_0x0054:
            r8 = r4
        L_0x0055:
            r4 = r12
            r5 = r10
            r6 = r17
            long r4 = r4.transferFrom(r5, r6, r8)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            long r17 = r17 + r4
            goto L_0x0045
        L_0x0064:
            if (r12 == 0) goto L_0x0069
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x0069:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            if (r10 == 0) goto L_0x0071
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0071:
            r2.close()
            long r2 = r19.length()
            long r4 = r20.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x008a
            if (r21 == 0) goto L_0x0089
            long r2 = r19.lastModified()
            r1.setLastModified(r2)
        L_0x0089:
            return
        L_0x008a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to copy full contents from '"
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' to '"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "' Expected length: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " Actual: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            throw r6
        L_0x00b6:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00c0:
            if (r12 == 0) goto L_0x00d1
            if (r4 == 0) goto L_0x00ce
            r12.close()     // Catch:{ Throwable -> 0x00c8, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00c8:
            r0 = move-exception
            r5 = r0
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r4, r5)     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00ce:
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00dc
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e8
            r11.close()     // Catch:{ Throwable -> 0x00e2, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e2:
            r0 = move-exception
            r5 = r0
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r4, r5)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e8:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00f6
        L_0x00f0:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00f6:
            if (r10 == 0) goto L_0x0107
            if (r4 == 0) goto L_0x0104
            r10.close()     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0107
        L_0x00fe:
            r0 = move-exception
            r5 = r0
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r4, r5)     // Catch:{ Throwable -> 0x010b }
            goto L_0x0107
        L_0x0104:
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0107:
            throw r1     // Catch:{ Throwable -> 0x010b }
        L_0x0108:
            r0 = move-exception
            r1 = r0
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0108 }
        L_0x010e:
            if (r3 == 0) goto L_0x011a
            r2.close()     // Catch:{ Throwable -> 0x0114 }
            goto L_0x011d
        L_0x0114:
            r0 = move-exception
            r2 = r0
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r2)
            goto L_0x011d
        L_0x011a:
            r2.close()
        L_0x011d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.utils.C20359e.m67576b(java.io.File, java.io.File, boolean):void");
    }
}
