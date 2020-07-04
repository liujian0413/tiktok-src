package com.p280ss.android.common.applog;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p482io.C9734a;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.LogReaper */
class LogReaper extends Thread {
    public static Context sContext;
    public static final UncaughtExceptionHandler sCrashHandler = new UncaughtExceptionHandler() {
        public final void uncaughtException(Thread thread, Throwable th) {
            if (!(th == null || LogReaper.sContext == null)) {
                FileOutputStream fileOutputStream = null;
                try {
                    JSONObject crashInfo = CrashUtil.getCrashInfo(LogReaper.sContext, thread, th);
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder("ss_crash-");
                    sb.append(currentTimeMillis);
                    sb.append(".log");
                    String sb2 = sb.toString();
                    File file = new File(LogReaper.sContext.getCacheDir().getPath(), "ss_crash_logs");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, sb2));
                    try {
                        fileOutputStream2.write(crashInfo.toString().getBytes());
                        fileOutputStream2.close();
                        File[] listFiles = file.listFiles(LogReaper.sLogFilter);
                        if (listFiles != null) {
                            if (listFiles.length > 5) {
                                Arrays.sort(listFiles, Collections.reverseOrder());
                                for (int i = 5; i < listFiles.length; i++) {
                                    listFiles[i].delete();
                                }
                            }
                        }
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        C9734a.m28682a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    C9734a.m28682a((Closeable) fileOutputStream);
                    throw th;
                }
                C9734a.m28682a((Closeable) fileOutputStream);
            }
            if (!(LogReaper.sOriginHandler == null || LogReaper.sOriginHandler == LogReaper.sCrashHandler)) {
                LogReaper.sOriginHandler.uncaughtException(thread, th);
            }
            if (!C6776h.m20947b(LogReaper.sContext)) {
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable unused3) {
                }
            }
        }
    };
    public static final FilenameFilter sLogFilter = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            if (str == null || !str.startsWith("ss_crash-")) {
                return false;
            }
            return true;
        }
    };
    private static final FilenameFilter sNativeLogFilter = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            if (str == null || !str.startsWith("ss_native_crash-")) {
                return false;
            }
            return true;
        }
    };
    public static UncaughtExceptionHandler sOriginHandler;
    private AtomicLong mBatchEventInterval = new AtomicLong();
    private final ConcurrentHashMap<String, String> mBlackV1;
    private final ConcurrentHashMap<String, String> mBlackV3;
    private final Context mContext;
    private final DisasterRecovery mDisasterRecovery;
    private final JSONObject mHeader;
    private long mLastBatchEventTime;
    private String mLastCrashLogName = null;
    private String mLastNativeCrashLogName = null;
    private long mMinLog;
    private final LinkedList<LogQueueItem> mQueue;
    private volatile long mScanInterval = 120000;
    private long mScanTime;
    private int mSendLaunchTimely = 1;
    private LogSession mSession;
    private final List<ILogSessionHook> mSessionHookList;
    private final AtomicBoolean mStopFlag;
    private volatile JSONObject mTimeSync = null;

    /* renamed from: com.ss.android.common.applog.LogReaper$_lancet */
    class _lancet {
        private _lancet() {
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(Context context) {
            try {
                return C6900g.m21454b().mo16943d();
            } catch (Exception unused) {
                return false;
            }
        }

        static int com_ss_android_ugc_aweme_lancet_I18nLancet_sendLog(LogReaper logReaper, String str, String str2, boolean z) throws Throwable {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            try {
                String language = C30476b.m99547a().getLanguage();
                if ("zh".equals(language)) {
                    language = "zh-Hant";
                }
                I18nLancet.m104794a(jSONObject2, "app_language", language);
                I18nLancet.m104794a(jSONObject2, "region", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLogRegion());
                I18nLancet.m104794a(jSONObject2, "sys_region", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion());
                I18nLancet.m104794a(jSONObject2, "carrier_region", C32326h.m104886h());
                I18nLancet.m104794a(jSONObject2, "timezone_name", TimeZone.getDefault().getDisplayName());
                I18nLancet.m104794a(jSONObject2, "timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
            } catch (Exception unused) {
            }
            jSONObject.put("header", jSONObject2);
            return logReaper.sendLog$___twin___(str, jSONObject.toString(), z);
        }
    }

    private int sendLog(String str, String str2, boolean z) throws Throwable {
        return _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_sendLog(this, str, str2, z);
    }

    private void cleanLog() {
        DBHelper.getInstance(this.mContext).cleanExpireLog();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void filterHeader() {
        C6781d.m20975a(this.mHeader);
    }

    private boolean existDid() {
        boolean z = false;
        try {
            if (!C6319n.m19593a(this.mHeader.optString("device_id", ""))) {
                z = true;
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.utility.io.a.a(java.io.Closeable):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        r1 = r0;
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0089, code lost:
        com.bytedance.common.utility.p482io.C9734a.m28682a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r5 
      PHI: (r5v2 java.io.BufferedReader) = (r5v1 java.io.BufferedReader), (r5v3 java.io.BufferedReader), (r5v3 java.io.BufferedReader), (r5v1 java.io.BufferedReader), (r5v1 java.io.BufferedReader) binds: [B:10:0x0032, B:33:0x0070, B:34:?, B:21:0x0050, B:22:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void collectCrashLog() {
        /*
            r13 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            android.content.Context r2 = r13.mContext     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r2 = com.p280ss.android.common.util.C6776h.m20956f(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r3 = "ss_crash_logs"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.io.FilenameFilter r2 = sLogFilter     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            if (r1 == 0) goto L_0x0080
            int r2 = r1.length     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            if (r2 > 0) goto L_0x001b
            goto L_0x0080
        L_0x001b:
            java.util.Comparator r2 = java.util.Collections.reverseOrder()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.util.Arrays.sort(r1, r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r2 = r13.mLastCrashLogName     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r3 = 0
            r4 = r1[r3]     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r13.mLastCrashLogName = r4     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            int r4 = r1.length     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r5 = r0
            r6 = 0
        L_0x0030:
            if (r3 >= r4) goto L_0x007c
            r7 = r1[r3]     // Catch:{ Exception -> 0x007a, all -> 0x0076 }
            r8 = 5
            if (r3 >= r8) goto L_0x0043
            if (r2 == 0) goto L_0x0044
            java.lang.String r8 = r7.getName()     // Catch:{ Exception -> 0x007a, all -> 0x0076 }
            boolean r8 = r2.equals(r8)     // Catch:{ Exception -> 0x007a, all -> 0x0076 }
            if (r8 == 0) goto L_0x0044
        L_0x0043:
            r6 = 1
        L_0x0044:
            if (r6 != 0) goto L_0x0070
            long r8 = r7.length()     // Catch:{ Exception -> 0x007a, all -> 0x0076 }
            r10 = 16384(0x4000, double:8.0948E-320)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0070
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.io.FileReader r9 = new java.io.FileReader     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x0070, all -> 0x0076 }
            java.lang.String r5 = r8.readLine()     // Catch:{ Exception -> 0x006f, all -> 0x006b }
            r8.close()     // Catch:{ Exception -> 0x006f, all -> 0x006b }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0069, all -> 0x0084 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0069, all -> 0x0084 }
            r13.insertCrashLog(r8)     // Catch:{ Exception -> 0x0069, all -> 0x0084 }
        L_0x0069:
            r5 = r0
            goto L_0x0070
        L_0x006b:
            r0 = move-exception
            r1 = r0
            r0 = r8
            goto L_0x0085
        L_0x006f:
            r5 = r8
        L_0x0070:
            r7.delete()     // Catch:{ Exception -> 0x0073, all -> 0x0076 }
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0076:
            r0 = move-exception
            r1 = r0
            r0 = r5
            goto L_0x0085
        L_0x007a:
            r0 = r5
            goto L_0x0089
        L_0x007c:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r5)
            return
        L_0x0080:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r0)
            return
        L_0x0084:
            r1 = move-exception
        L_0x0085:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r0)
            throw r1
        L_0x0089:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.collectCrashLog():void");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean scanLog() {
        /*
            r9 = this;
            r9.collectCrashLog()
            r9.collectNativeCrashLog()
            android.content.Context r0 = r9.mContext
            boolean r0 = com.p280ss.android.common.applog.LogReaper._lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            long r2 = r9.mMinLog
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r9.mScanTime
            long r2 = r2 - r6
            long r6 = r9.mScanInterval
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
            r9.mMinLog = r4
            r9.cleanLog()
            long r2 = java.lang.System.currentTimeMillis()
            r9.mScanTime = r2
        L_0x0030:
            long r2 = r9.mMinLog
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0037
            return r1
        L_0x0037:
            android.content.Context r0 = r9.mContext
            com.ss.android.common.applog.DBHelper r0 = com.p280ss.android.common.applog.DBHelper.getInstance(r0)
            long r2 = r9.mMinLog
            com.ss.android.common.applog.LogItem r2 = r0.getLog(r2)
            if (r2 != 0) goto L_0x004a
            r2 = -1
            r9.mMinLog = r2
            return r1
        L_0x004a:
            long r3 = r9.mMinLog
            long r5 = r2.f52158id
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0057
            long r3 = r2.f52158id
            r9.mMinLog = r3
            goto L_0x005e
        L_0x0057:
            long r3 = r9.mMinLog
            r5 = 1
            long r3 = r3 + r5
            r9.mMinLog = r3
        L_0x005e:
            java.lang.String r3 = r2.value
            r4 = 1
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.value
            int r3 = r3.length()
            if (r3 != 0) goto L_0x006d
            goto L_0x00e0
        L_0x006d:
            int r3 = r2.type     // Catch:{ Throwable -> 0x00a6 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != 0) goto L_0x007e
            java.lang.String r3 = com.p280ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ Throwable -> 0x00a6 }
            java.lang.String r6 = r2.value     // Catch:{ Throwable -> 0x00a6 }
            int r3 = r9.sendLog(r3, r6, r4)     // Catch:{ Throwable -> 0x00a6 }
            goto L_0x009f
        L_0x007e:
            int r3 = r2.type     // Catch:{ Throwable -> 0x00a6 }
            if (r3 != r4) goto L_0x008d
            java.lang.String r3 = com.p280ss.android.common.applog.AppLog.CRASH_URL()     // Catch:{ Throwable -> 0x00a6 }
            java.lang.String r6 = r2.value     // Catch:{ Throwable -> 0x00a6 }
            int r3 = r9.sendLog(r3, r6, r1)     // Catch:{ Throwable -> 0x00a6 }
            goto L_0x009f
        L_0x008d:
            int r3 = r2.type     // Catch:{ Throwable -> 0x00a6 }
            r6 = 2
            if (r3 != r6) goto L_0x009d
            java.lang.String r3 = com.p280ss.android.common.applog.AppLog.MON_URL()     // Catch:{ Throwable -> 0x00a6 }
            java.lang.String r6 = r2.value     // Catch:{ Throwable -> 0x00a6 }
            int r3 = r9.sendLog(r3, r6, r1)     // Catch:{ Throwable -> 0x00a6 }
            goto L_0x009f
        L_0x009d:
            r3 = 200(0xc8, float:2.8E-43)
        L_0x009f:
            if (r3 != r5) goto L_0x00a2
            r1 = 1
        L_0x00a2:
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            r5 = -1
            if (r1 != r5) goto L_0x00ab
            return r4
        L_0x00ab:
            r1 = 0
            int r5 = r2.type
            if (r5 != 0) goto L_0x00be
            java.lang.String r1 = r2.value
            java.util.List r1 = getTeaEventIndexFromData(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            com.p280ss.android.common.applog.AppLog.tryReportLogRequest(r3, r5)
        L_0x00be:
            java.lang.String r5 = r2.value
            long r6 = r2.f52158id
            boolean r0 = r0.onLogSent(r6, r3)
            if (r3 != 0) goto L_0x00df
            if (r0 == 0) goto L_0x00df
            int r0 = r2.type
            if (r0 != 0) goto L_0x00df
            if (r1 == 0) goto L_0x00d8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            com.p280ss.android.common.applog.AppLog.tryReportLogExpired(r0)
        L_0x00d8:
            java.util.List r0 = getTerminateSessionIdFromData(r5)
            com.p280ss.android.common.applog.AppLog.tryReportTerminateLost(r0)
        L_0x00df:
            return r4
        L_0x00e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.scanLog():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:57|(6:59|60|(1:62)(4:63|(2:65|(1:68))(1:69)|70|(1:72))|67|70|(0))(1:73)|74|75|(3:87|77|78)(1:79)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00e4 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9 A[Catch:{ InterruptedException -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00a8 A[EDGE_INSN: B:89:0x00a8->B:52:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r8 = r16
            r16.cleanLog()
            long r0 = java.lang.System.currentTimeMillis()
            r8.mScanTime = r0
            long r0 = java.lang.System.currentTimeMillis()
            r8.mLastBatchEventTime = r0
            r0 = 0
            r9 = 0
            r1 = r9
        L_0x0014:
            r10 = 0
        L_0x0015:
            if (r1 != 0) goto L_0x0039
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r2 = r8.mQueue
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.mStopFlag     // Catch:{ all -> 0x0036 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0036 }
            if (r3 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return
        L_0x0024:
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r3 = r8.mQueue     // Catch:{ all -> 0x0036 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r3 != 0) goto L_0x0034
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r1 = r8.mQueue     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0036 }
            com.ss.android.common.applog.LogQueueItem r1 = (com.p280ss.android.common.applog.LogQueueItem) r1     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r11 = r1
            if (r11 == 0) goto L_0x0041
            r8.processItem(r11)
            r1 = r9
            goto L_0x0015
        L_0x0041:
            java.util.concurrent.atomic.AtomicLong r1 = r8.mBatchEventInterval
            long r1 = r1.get()
            r3 = 10000(0x2710, double:4.9407E-320)
            r12 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0057
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x0055
            r14 = r12
            goto L_0x0058
        L_0x0055:
            r14 = r3
            goto L_0x0058
        L_0x0057:
            r14 = r1
        L_0x0058:
            com.ss.android.common.applog.LogSession r2 = r8.mSession
            if (r2 == 0) goto L_0x0063
            boolean r1 = r2.non_page
            if (r1 != 0) goto L_0x0063
            long r3 = r2.f19228id
            goto L_0x0064
        L_0x0063:
            r3 = r12
        L_0x0064:
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x008e
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0071
            goto L_0x008e
        L_0x0071:
            long r3 = r8.mLastBatchEventTime
            long r3 = r5 - r3
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x008f
            android.content.Context r1 = r8.mContext
            boolean r1 = com.p280ss.android.common.applog.LogReaper._lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(r1)
            if (r1 == 0) goto L_0x008e
            r8.mLastBatchEventTime = r5
            r3 = 0
            r4 = 1
            r5 = 0
            r7 = 0
            r1 = r16
            r1.switchSession(r2, r3, r4, r5, r7)
            goto L_0x008f
        L_0x008e:
            r14 = r12
        L_0x008f:
            boolean r1 = r16.scanLog()
            if (r1 == 0) goto L_0x00a8
            boolean r1 = com.p280ss.android.common.applog.AppLog.getLogRecoverySwitch()
            if (r1 == 0) goto L_0x00a5
            int r10 = r10 + 1
            r1 = 4
            if (r10 <= r1) goto L_0x00a5
            r1 = -1
            r8.mMinLog = r1
            goto L_0x00a8
        L_0x00a5:
            r1 = r11
            goto L_0x0015
        L_0x00a8:
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r1 = r8.mQueue
            monitor-enter(r1)
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r2 = r8.mQueue     // Catch:{ all -> 0x00fc }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x00f0
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00df
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x00e4 }
            long r4 = r8.mLastBatchEventTime     // Catch:{ InterruptedException -> 0x00e4 }
            r6 = 0
            long r2 = r2 - r4
            long r4 = r8.mLastBatchEventTime     // Catch:{ InterruptedException -> 0x00e4 }
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00c6
            goto L_0x00ce
        L_0x00c6:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d4
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
        L_0x00ce:
            r2 = r14
            goto L_0x00d5
        L_0x00d0:
            r4 = 0
            long r2 = r14 - r2
            goto L_0x00d5
        L_0x00d4:
            r2 = r12
        L_0x00d5:
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00e4
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r4 = r8.mQueue     // Catch:{ InterruptedException -> 0x00e4 }
            r4.wait(r2)     // Catch:{ InterruptedException -> 0x00e4 }
            goto L_0x00e4
        L_0x00df:
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r2 = r8.mQueue     // Catch:{ InterruptedException -> 0x00e4 }
            r2.wait()     // Catch:{ InterruptedException -> 0x00e4 }
        L_0x00e4:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.mStopFlag     // Catch:{ all -> 0x00fc }
            boolean r2 = r2.get()     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x00ee
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            return
        L_0x00ee:
            r2 = r11
            goto L_0x00f8
        L_0x00f0:
            java.util.LinkedList<com.ss.android.common.applog.LogQueueItem> r2 = r8.mQueue     // Catch:{ all -> 0x00fc }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00fc }
            com.ss.android.common.applog.LogQueueItem r2 = (com.p280ss.android.common.applog.LogQueueItem) r2     // Catch:{ all -> 0x00fc }
        L_0x00f8:
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            r1 = r2
            goto L_0x0014
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fe, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ff, code lost:
        r17 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0002] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void collectNativeCrashLog() {
        /*
            r19 = this;
            r1 = r19
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            android.content.Context r3 = r1.mContext     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            java.lang.String r3 = com.p280ss.android.common.util.C6776h.m20956f(r3)     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            java.lang.String r4 = "ss_native_crash_logs"
            r0.<init>(r3, r4)     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            java.io.FilenameFilter r3 = sNativeLogFilter     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            java.io.File[] r0 = r0.listFiles(r3)     // Catch:{ Throwable -> 0x00de, all -> 0x0107 }
            if (r0 == 0) goto L_0x0102
            int r3 = r0.length     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            if (r3 > 0) goto L_0x001c
            goto L_0x0102
        L_0x001c:
            java.util.Comparator r3 = java.util.Collections.reverseOrder()     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            java.util.Arrays.sort(r0, r3)     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            java.lang.String r3 = r1.mLastNativeCrashLogName     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            r4 = 0
            r5 = r0[r4]     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            java.lang.String r5 = r5.getName()     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            r1.mLastNativeCrashLogName = r5     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            int r5 = r0.length     // Catch:{ Throwable -> 0x00de, all -> 0x00fe }
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0032:
            if (r6 >= r5) goto L_0x00fa
            r9 = r0[r6]     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            r10 = 5
            r11 = 1
            if (r6 >= r10) goto L_0x0046
            if (r3 == 0) goto L_0x0047
            java.lang.String r10 = r9.getName()     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            boolean r10 = r3.equals(r10)     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            if (r10 == 0) goto L_0x0047
        L_0x0046:
            r8 = 1
        L_0x0047:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            r10.<init>()     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            if (r8 != 0) goto L_0x00eb
            long r12 = r9.length()     // Catch:{ Throwable -> 0x010f, all -> 0x00f8 }
            r14 = 16384(0x4000, double:8.0948E-320)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00eb
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00eb }
            java.io.FileReader r13 = new java.io.FileReader     // Catch:{ Exception -> 0x00eb }
            r13.<init>(r9)     // Catch:{ Exception -> 0x00eb }
            r12.<init>(r13)     // Catch:{ Exception -> 0x00eb }
            r18 = r3
            r2 = 0
            r7 = 0
            r15 = 0
        L_0x0068:
            java.lang.String r4 = r12.readLine()     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            if (r4 == 0) goto L_0x0090
            if (r7 != 0) goto L_0x0075
            long r2 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            goto L_0x008d
        L_0x0075:
            if (r7 != r11) goto L_0x0079
            r15 = r4
            goto L_0x008d
        L_0x0079:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            r13.<init>()     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            r13.append(r4)     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            java.lang.String r4 = "\n"
            r13.append(r4)     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            java.lang.String r4 = r13.toString()     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            r10.append(r4)     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
        L_0x008d:
            int r7 = r7 + 1
            goto L_0x0068
        L_0x0090:
            r12.close()     // Catch:{ Exception -> 0x00e8, Throwable -> 0x00e6, all -> 0x00e2 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e0 }
            r4.<init>()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r7 = "data"
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r10 = r10.trim()     // Catch:{ Exception -> 0x00e0 }
            r4.put(r7, r10)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r7 = "is_native_crash"
            r4.put(r7, r11)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r7 = "no_process_name"
            boolean r7 = r15.startsWith(r7)     // Catch:{ Exception -> 0x00e0 }
            if (r7 != 0) goto L_0x00b7
            java.lang.String r7 = "process_name"
            r4.put(r7, r15)     // Catch:{ Exception -> 0x00e0 }
        L_0x00b7:
            r12 = 0
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c2
            java.lang.String r7 = "crash_time"
            r4.put(r7, r2)     // Catch:{ Exception -> 0x00e0 }
        L_0x00c2:
            if (r15 == 0) goto L_0x00d3
            java.lang.String r2 = ":"
            boolean r2 = r15.contains(r2)     // Catch:{ Exception -> 0x00e0 }
            if (r2 == 0) goto L_0x00d3
            java.lang.String r2 = "remote_process"
            r4.put(r2, r11)     // Catch:{ Exception -> 0x00e0 }
            r3 = 0
            goto L_0x00d9
        L_0x00d3:
            java.lang.String r2 = "remote_process"
            r3 = 0
            r4.put(r2, r3)     // Catch:{ Exception -> 0x00dc }
        L_0x00d9:
            r1.insertCrashLog(r4)     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            r7 = 0
            goto L_0x00ee
        L_0x00de:
            r7 = 0
            goto L_0x010f
        L_0x00e0:
            r3 = 0
            goto L_0x00dc
        L_0x00e2:
            r0 = move-exception
            r17 = r12
            goto L_0x010b
        L_0x00e6:
            r7 = r12
            goto L_0x010f
        L_0x00e8:
            r3 = 0
            r7 = r12
            goto L_0x00ee
        L_0x00eb:
            r18 = r3
            r3 = 0
        L_0x00ee:
            r9.delete()     // Catch:{ Exception -> 0x00f1 }
        L_0x00f1:
            int r6 = r6 + 1
            r3 = r18
            r4 = 0
            goto L_0x0032
        L_0x00f8:
            r0 = move-exception
            goto L_0x0109
        L_0x00fa:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r7)
            return
        L_0x00fe:
            r0 = move-exception
            r17 = 0
            goto L_0x010b
        L_0x0102:
            r7 = 0
            com.bytedance.common.utility.p482io.C9734a.m28682a(r7)
            return
        L_0x0107:
            r0 = move-exception
            r7 = 0
        L_0x0109:
            r17 = r7
        L_0x010b:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r17)
            throw r0
        L_0x010f:
            com.bytedance.common.utility.p482io.C9734a.m28682a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.collectNativeCrashLog():void");
    }

    /* access modifiers changed from: 0000 */
    public void setSendLaunchTimely(int i) {
        this.mSendLaunchTimely = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTimeSync(JSONObject jSONObject) {
        this.mTimeSync = jSONObject;
    }

    /* access modifiers changed from: 0000 */
    public void setBatchEventInterval(long j) {
        this.mBatchEventInterval.set(j);
    }

    private String processLogParams(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("header") != null) {
                return jSONObject.toString();
            }
            return str;
        } catch (JSONException unused) {
            return str;
        }
    }

    static void registerCrashHandler(Context context) {
        if (context != null) {
            sContext = context.getApplicationContext();
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            sOriginHandler = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == sCrashHandler) {
                sOriginHandler = null;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(sCrashHandler);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void insertCrashLog(String str) {
        if (str != null) {
            if (str.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", str);
                    insertCrashLog(jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void updateHeader(JSONObject jSONObject) {
        String[] strArr;
        try {
            for (String str : AppLog.HEADER_KEYS) {
                this.mHeader.put(str, jSONObject.opt(str));
            }
        } catch (Exception unused) {
        }
    }

    private void batchSession(long j) {
        if (j > 0) {
            LogSession session = DBHelper.getInstance(this.mContext).getSession(j);
            if (session != null) {
                switchSession(session, null, false, 0);
                LogQueueCleanSession logQueueCleanSession = new LogQueueCleanSession();
                logQueueCleanSession.max_session = session.f19228id;
                synchronized (this.mQueue) {
                    this.mQueue.add(logQueueCleanSession);
                }
            }
        }
    }

    static List<String> getTerminateSessionIdFromData(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("terminate");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.getJSONObject(i).optString("session_id", "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    static List<Long> getTeaEventIndexFromData(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("event_v3");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Long.valueOf(optJSONArray.getJSONObject(i).getJSONObject("params").getLong("tea_event_index")));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("event");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList.add(Long.valueOf(optJSONArray2.getJSONObject(i2).getLong("tea_event_index")));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void processItem(com.p280ss.android.common.applog.LogQueueItem r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 != 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            boolean r0 = r7 instanceof com.p280ss.android.common.applog.LogQueueSwitchSession     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0023
            com.ss.android.common.applog.LogQueueSwitchSession r7 = (com.p280ss.android.common.applog.LogQueueSwitchSession) r7     // Catch:{ all -> 0x005f }
            com.ss.android.common.applog.LogSession r1 = r7.old     // Catch:{ all -> 0x005f }
            com.ss.android.common.applog.LogSession r2 = r7.launch_session     // Catch:{ all -> 0x005f }
            boolean r3 = r7.event_only     // Catch:{ all -> 0x005f }
            long r4 = r7.min_event     // Catch:{ all -> 0x005f }
            r0 = r6
            r0.switchSession(r1, r2, r3, r4)     // Catch:{ all -> 0x005f }
            com.ss.android.common.applog.LogSession r7 = r7.launch_session     // Catch:{ all -> 0x005f }
            r6.mSession = r7     // Catch:{ all -> 0x005f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            r6.mLastBatchEventTime = r0     // Catch:{ all -> 0x005f }
            monitor-exit(r6)
            return
        L_0x0023:
            boolean r0 = r7 instanceof com.p280ss.android.common.applog.LogQueueCleanSession     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0030
            com.ss.android.common.applog.LogQueueCleanSession r7 = (com.p280ss.android.common.applog.LogQueueCleanSession) r7     // Catch:{ all -> 0x005f }
            long r0 = r7.max_session     // Catch:{ all -> 0x005f }
            r6.batchSession(r0)     // Catch:{ all -> 0x005f }
            monitor-exit(r6)
            return
        L_0x0030:
            boolean r0 = r7 instanceof com.p280ss.android.common.applog.LogQueueSaveAndSendTaskSession     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005d
            com.ss.android.common.applog.LogQueueSaveAndSendTaskSession r7 = (com.p280ss.android.common.applog.LogQueueSaveAndSendTaskSession) r7     // Catch:{ all -> 0x005f }
            com.ss.android.common.applog.a.d r7 = r7.taskSession     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x005d
            android.content.Context r0 = r6.mContext     // Catch:{ all -> 0x005f }
            com.ss.android.common.applog.TaskSessionDao r0 = com.p280ss.android.common.applog.TaskSessionDao.inst(r0)     // Catch:{ all -> 0x005f }
            org.json.JSONObject r1 = r6.mHeader     // Catch:{ all -> 0x005f }
            android.util.Pair r7 = r0.saveTaskSession(r7, r1)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x005d
            java.lang.Object r0 = r7.first     // Catch:{ all -> 0x005f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x005f }
            long r0 = r0.longValue()     // Catch:{ all -> 0x005f }
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x005f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x005f }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            r6.trySendLog(r7, r0)     // Catch:{ all -> 0x005f }
        L_0x005d:
            monitor-exit(r6)
            return
        L_0x005f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.processItem(com.ss.android.common.applog.LogQueueItem):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void insertCrashLog(org.json.JSONObject r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0043
            int r0 = r4.length()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0043
        L_0x000a:
            android.content.Context r0 = r3.mContext     // Catch:{ Exception -> 0x003e }
            com.ss.android.common.applog.DBHelper r0 = com.p280ss.android.common.applog.DBHelper.getInstance(r0)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "magic_tag"
            java.lang.String r2 = "ss_app_log"
            r4.put(r1, r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = "header"
            org.json.JSONObject r2 = r3.mHeader     // Catch:{ Exception -> 0x003e }
            r4.put(r1, r2)     // Catch:{ Exception -> 0x003e }
            com.ss.android.common.applog.LogSession r1 = r3.mSession     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0035
            com.ss.android.common.applog.LogSession r1 = r3.mSession     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = r1.value     // Catch:{ Exception -> 0x003e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "session_id"
            com.ss.android.common.applog.LogSession r2 = r3.mSession     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r2.value     // Catch:{ Exception -> 0x003e }
            r4.put(r1, r2)     // Catch:{ Exception -> 0x003e }
        L_0x0035:
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x003e }
            r0.insertCrashLog(r4)     // Catch:{ Exception -> 0x003e }
            monitor-exit(r3)
            return
        L_0x003e:
            monitor-exit(r3)
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0043:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.insertCrashLog(org.json.JSONObject):void");
    }

    private void trySendLog(String str, long j) {
        DBHelper instance = DBHelper.getInstance(this.mContext);
        if (_lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(this.mContext)) {
            boolean z = false;
            try {
                int sendLog = sendLog(AppLog.APPLOG_URL(), str, true);
                if (sendLog != -1) {
                    if (sendLog == 200) {
                        z = true;
                    }
                    instance.onLogSent(j, z);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:27|(1:31)|(4:33|34|35|(1:37))|38|39|(2:41|(4:43|(3:47|(3:49|(2:51|88)(1:89)|52)|87)|53|(2:57|(3:59|(2:61|90)(1:91)|62)))(4:63|(1:65)|66|(1:68)))|69|70|(1:74)|(2:76|77)(1:78)) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0133 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3 A[Catch:{ Throwable -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0147 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int sendLog$___twin___(java.lang.String r9, java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r10 = r8.processLogParams(r10)     // Catch:{ Throwable -> 0x0149 }
            boolean r0 = com.p280ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0149 }
            if (r0 == 0) goto L_0x0023
            com.ss.android.common.applog.DisasterRecovery r0 = r8.mDisasterRecovery     // Catch:{ Throwable -> 0x0149 }
            if (r0 == 0) goto L_0x0023
            com.ss.android.common.applog.DisasterRecovery r0 = r8.mDisasterRecovery     // Catch:{ Throwable -> 0x0149 }
            boolean r0 = r0.isCanSend(r9)     // Catch:{ Throwable -> 0x0149 }
            if (r0 != 0) goto L_0x0023
            com.ss.android.common.applog.AppLog$ICustomInfo r10 = com.p280ss.android.common.applog.AppLog.sCustomInfo     // Catch:{ Throwable -> 0x0149 }
            if (r10 == 0) goto L_0x0021
            java.lang.String r10 = com.p280ss.android.common.applog.AppLog.CRASH_URL()     // Catch:{ Throwable -> 0x0149 }
            r9.equalsIgnoreCase(r10)     // Catch:{ Throwable -> 0x0149 }
        L_0x0021:
            r9 = -1
            return r9
        L_0x0023:
            r0 = 1
            java.lang.String r2 = com.p280ss.android.common.applog.NetUtil.addCommonParams(r9, r0)     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r10.getBytes(r1)     // Catch:{ Throwable -> 0x0149 }
            java.lang.Object r10 = r3.clone()     // Catch:{ Throwable -> 0x0149 }
            byte[] r10 = (byte[]) r10     // Catch:{ Throwable -> 0x0149 }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x0149 }
            r7 = 0
            if (r1 != 0) goto L_0x004e
            if (r11 == 0) goto L_0x004e
            android.content.Context r11 = r8.mContext     // Catch:{ Throwable -> 0x0149 }
            if (r11 == 0) goto L_0x004e
            boolean r11 = com.p280ss.android.common.applog.AppLog.getLogEncryptSwitch()     // Catch:{ Throwable -> 0x0149 }
            if (r11 == 0) goto L_0x004e
            android.content.Context r11 = r8.mContext     // Catch:{ RuntimeException -> 0x004e }
            java.lang.String r10 = com.p280ss.android.common.applog.NetUtil.sendEncryptLog(r2, r10, r11, r7)     // Catch:{ RuntimeException -> 0x004e }
            goto L_0x005a
        L_0x004e:
            com.bytedance.common.utility.k r1 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x0149 }
            r4 = 1
            java.lang.String r5 = "application/json; charset=utf-8"
            r6 = 0
            java.lang.String r10 = r1.mo15155a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0149 }
        L_0x005a:
            if (r10 == 0) goto L_0x0148
            int r11 = r10.length()     // Catch:{ Throwable -> 0x0149 }
            if (r11 != 0) goto L_0x0064
            goto L_0x0148
        L_0x0064:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0149 }
            r11.<init>(r10)     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r10 = "ss_app_log"
            java.lang.String r1 = "magic_tag"
            java.lang.String r1 = r11.optString(r1)     // Catch:{ Throwable -> 0x0149 }
            boolean r10 = r10.equals(r1)     // Catch:{ Throwable -> 0x0149 }
            if (r10 == 0) goto L_0x0086
            java.lang.String r10 = "success"
            java.lang.String r1 = "message"
            java.lang.String r1 = r11.optString(r1)     // Catch:{ Throwable -> 0x0149 }
            boolean r10 = r10.equals(r1)     // Catch:{ Throwable -> 0x0149 }
            if (r10 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = 0
        L_0x0087:
            if (r0 == 0) goto L_0x00ad
            java.lang.String r10 = "server_time"
            long r1 = r11.optLong(r10)     // Catch:{ Exception -> 0x00ad }
            r3 = 0
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ad
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
            r10.<init>()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r3 = "server_time"
            r10.put(r3, r1)     // Catch:{ Exception -> 0x00ad }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ad }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r3 = "local_time"
            r10.put(r3, r1)     // Catch:{ Exception -> 0x00ad }
            r8.mTimeSync = r10     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            boolean r10 = com.p280ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0133 }
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = "blacklist"
            org.json.JSONObject r10 = r11.optJSONObject(r10)     // Catch:{ Throwable -> 0x0133 }
            if (r10 == 0) goto L_0x0119
            java.lang.String r10 = "blacklist"
            org.json.JSONObject r10 = r11.optJSONObject(r10)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r1 = "v1"
            org.json.JSONArray r10 = r10.optJSONArray(r1)     // Catch:{ Throwable -> 0x0133 }
            if (r10 == 0) goto L_0x00ea
            int r1 = r10.length()     // Catch:{ Throwable -> 0x0133 }
            if (r1 <= 0) goto L_0x00ea
            int r1 = r10.length()     // Catch:{ Throwable -> 0x0133 }
            r2 = 0
        L_0x00d4:
            if (r2 >= r1) goto L_0x00ea
            java.lang.String r3 = r10.getString(r2)     // Catch:{ Throwable -> 0x0133 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Throwable -> 0x0133 }
            if (r4 != 0) goto L_0x00e7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r4 = r8.mBlackV1     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r5 = "black"
            r4.put(r3, r5)     // Catch:{ Throwable -> 0x0133 }
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00d4
        L_0x00ea:
            java.lang.String r10 = "blacklist"
            org.json.JSONObject r10 = r11.optJSONObject(r10)     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r11 = "v3"
            org.json.JSONArray r10 = r10.optJSONArray(r11)     // Catch:{ Throwable -> 0x0133 }
            if (r10 == 0) goto L_0x0133
            int r11 = r10.length()     // Catch:{ Throwable -> 0x0133 }
            if (r11 <= 0) goto L_0x0133
            int r11 = r10.length()     // Catch:{ Throwable -> 0x0133 }
            r1 = 0
        L_0x0103:
            if (r1 >= r11) goto L_0x0133
            java.lang.String r2 = r10.getString(r1)     // Catch:{ Throwable -> 0x0133 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x0133 }
            if (r3 != 0) goto L_0x0116
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r8.mBlackV3     // Catch:{ Throwable -> 0x0133 }
            java.lang.String r4 = "black"
            r3.put(r2, r4)     // Catch:{ Throwable -> 0x0133 }
        L_0x0116:
            int r1 = r1 + 1
            goto L_0x0103
        L_0x0119:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r8.mBlackV1     // Catch:{ Throwable -> 0x0133 }
            boolean r10 = r10.isEmpty()     // Catch:{ Throwable -> 0x0133 }
            if (r10 != 0) goto L_0x0126
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r8.mBlackV1     // Catch:{ Throwable -> 0x0133 }
            r10.clear()     // Catch:{ Throwable -> 0x0133 }
        L_0x0126:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r8.mBlackV3     // Catch:{ Throwable -> 0x0133 }
            boolean r10 = r10.isEmpty()     // Catch:{ Throwable -> 0x0133 }
            if (r10 != 0) goto L_0x0133
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r8.mBlackV3     // Catch:{ Throwable -> 0x0133 }
            r10.clear()     // Catch:{ Throwable -> 0x0133 }
        L_0x0133:
            boolean r10 = com.p280ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0149 }
            if (r10 == 0) goto L_0x0142
            com.ss.android.common.applog.DisasterRecovery r10 = r8.mDisasterRecovery     // Catch:{ Throwable -> 0x0149 }
            if (r10 == 0) goto L_0x0142
            com.ss.android.common.applog.DisasterRecovery r10 = r8.mDisasterRecovery     // Catch:{ Throwable -> 0x0149 }
            r10.handleSuccess(r9)     // Catch:{ Throwable -> 0x0149 }
        L_0x0142:
            if (r0 == 0) goto L_0x0147
            r9 = 200(0xc8, float:2.8E-43)
            return r9
        L_0x0147:
            return r7
        L_0x0148:
            return r7
        L_0x0149:
            r10 = move-exception
            boolean r11 = com.p280ss.android.common.applog.AppLog.getLogRecoverySwitch()
            if (r11 == 0) goto L_0x0159
            com.ss.android.common.applog.DisasterRecovery r11 = r8.mDisasterRecovery
            if (r11 == 0) goto L_0x0159
            com.ss.android.common.applog.DisasterRecovery r11 = r8.mDisasterRecovery
            r11.handleException(r9, r10)
        L_0x0159:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.applog.LogReaper.sendLog$___twin___(java.lang.String, java.lang.String, boolean):int");
    }

    private void switchSession(LogSession logSession, LogSession logSession2, boolean z, long j) {
        switchSession(logSession, logSession2, z, j, true);
    }

    private void switchSession(LogSession logSession, LogSession logSession2, boolean z, long j, boolean z2) {
        DBHelper dBHelper;
        LogSession logSession3 = logSession;
        LogSession logSession4 = logSession2;
        DBHelper instance = DBHelper.getInstance(this.mContext);
        try {
            instance.packMonLog(this.mHeader, this.mTimeSync);
        } catch (Throwable unused) {
        }
        if (logSession3 != null || logSession4 != null) {
            if (logSession3 != null) {
                long[] jArr = new long[1];
                boolean z3 = false;
                if (z) {
                    jArr[0] = j;
                } else {
                    jArr[0] = 0;
                }
                List<ILogSessionHook> list = this.mSessionHookList;
                String[] strArr = new String[1];
                String[] strArr2 = strArr;
                long[] jArr2 = jArr;
                DBHelper dBHelper2 = instance;
                long batchSession = instance.batchSession(logSession, logSession2, this.mHeader, z, jArr, strArr, list, z2, this.mTimeSync);
                if (batchSession > 0) {
                    String str = strArr2[0];
                    if (jArr2[0] > j && z2) {
                        LogQueueSwitchSession logQueueSwitchSession = new LogQueueSwitchSession();
                        logQueueSwitchSession.old = logSession3;
                        logQueueSwitchSession.event_only = true;
                        logQueueSwitchSession.min_event = jArr2[0];
                        synchronized (this.mQueue) {
                            this.mQueue.add(logQueueSwitchSession);
                        }
                    }
                    if (_lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(this.mContext)) {
                        try {
                            int sendLog = sendLog(AppLog.APPLOG_URL(), str, true);
                            if (sendLog != -1) {
                                if (sendLog == 200) {
                                    z3 = true;
                                }
                                if (z3 && logSession4 != null && existDid()) {
                                    logSession4.launch_sent = true;
                                    dBHelper = dBHelper2;
                                    try {
                                        dBHelper.setSessionLaunchSent(logSession4.f19228id);
                                    } catch (Throwable unused2) {
                                    }
                                    boolean z4 = z3;
                                    List teaEventIndexFromData = getTeaEventIndexFromData(str);
                                    AppLog.tryReportLogRequest(z4, new ArrayList(teaEventIndexFromData));
                                    boolean onLogSent = dBHelper.onLogSent(batchSession, z4);
                                    if (!z4 && onLogSent) {
                                        AppLog.tryReportLogExpired(new ArrayList(teaEventIndexFromData));
                                        AppLog.tryReportTerminateLost(getTerminateSessionIdFromData(str));
                                    }
                                    if (!z4 && this.mMinLog < 0) {
                                        this.mMinLog = batchSession;
                                    }
                                }
                                dBHelper = dBHelper2;
                                boolean z42 = z3;
                                List teaEventIndexFromData2 = getTeaEventIndexFromData(str);
                                AppLog.tryReportLogRequest(z42, new ArrayList(teaEventIndexFromData2));
                                boolean onLogSent2 = dBHelper.onLogSent(batchSession, z42);
                                AppLog.tryReportLogExpired(new ArrayList(teaEventIndexFromData2));
                                AppLog.tryReportTerminateLost(getTerminateSessionIdFromData(str));
                                this.mMinLog = batchSession;
                            } else {
                                return;
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
                return;
            }
            if (logSession4 != null && _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(this.mContext) && this.mSendLaunchTimely > 0 && !logSession4.non_page) {
                try {
                    if (existDid()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("magic_tag", "ss_app_log");
                        jSONObject.put("header", this.mHeader);
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("datetime", AppLog.formatDate(logSession4.timestamp));
                        jSONObject2.put("session_id", logSession4.value);
                        jSONObject2.put("local_time_ms", logSession4.timestamp);
                        jSONObject2.put("tea_event_index", logSession4.eventIndex);
                        if (logSession4.non_page) {
                            jSONObject2.put("is_background", true);
                        }
                        jSONArray.put(jSONObject2);
                        jSONObject.put("launch", jSONArray);
                        sendLog(AppLog.APPLOG_URL(), jSONObject.toString(), true);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }

    LogReaper(Context context, JSONObject jSONObject, LinkedList<LogQueueItem> linkedList, AtomicBoolean atomicBoolean, List<ILogSessionHook> list, LogSession logSession, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        super("LogReaper");
        this.mContext = context;
        this.mHeader = jSONObject;
        this.mQueue = linkedList;
        this.mStopFlag = atomicBoolean;
        this.mSessionHookList = list;
        this.mSession = logSession;
        this.mBlackV1 = concurrentHashMap;
        this.mBlackV3 = concurrentHashMap2;
        this.mDisasterRecovery = new DisasterRecovery();
        this.mDisasterRecovery.registerUrl(AppLog.APPLOG_URL());
        this.mDisasterRecovery.registerUrl(AppLog.CRASH_URL());
    }
}
