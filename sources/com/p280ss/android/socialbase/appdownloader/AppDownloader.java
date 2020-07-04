package com.p280ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadFileUriProvider;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadLaunchResumeListener;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.p280ss.android.socialbase.appdownloader.depend.IDownloadNotificationBuilder;
import com.p280ss.android.socialbase.appdownloader.p902a.C20161b;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20287l;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.AppDownloader */
public class AppDownloader {
    public static final String TAG = "AppDownloader";

    /* renamed from: a */
    private static volatile AppDownloader f54534a;

    /* renamed from: c */
    private static boolean f54535c;

    /* renamed from: d */
    private static boolean f54536d;
    public IAppDownloadDepend appDownloadDepend;
    public IAppDownloadEventHandler appDownloadEventHandler;
    public IAppDownloadLaunchResumeListener appDownloadLaunchResumeListener;
    public IAppDownloadMonitorListener appDownloadMonitorListener;
    public IDownloadNotificationBuilder appDownloadNotificationBuilder;
    public IAppDownloadFileUriProvider appFileUriProvider;

    /* renamed from: b */
    private DownloadReceiver f54537b;
    public String fileProviderAuthority;
    public int maxFailedNotificationShowCount;
    public int maxUnInstallNotificationShowCount;
    public long minResumeFailedIntervalTime = 43200000;
    public long minResumeUnInstallIntervalTime = 43200000;
    public String notificationChannelId;
    public boolean usePackageFlagConfiguration = true;
    public boolean useReflectParseRes;

    private AppDownloader() {
    }

    public static AppDownloader getInstance() {
        if (f54534a == null) {
            synchronized (AppDownloader.class) {
                if (f54534a == null) {
                    f54534a = new AppDownloader();
                }
            }
        }
        return f54534a;
    }

    public void unRegisterDownloadReceiver() {
        try {
            if (f54536d && this.f54537b != null) {
                C20269b.m66765x().unregisterReceiver(this.f54537b);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m66407a() {
        if (!f54536d) {
            if (this.f54537b == null) {
                this.f54537b = new DownloadReceiver();
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.intent.action.BOOT_COMPLETED");
                intentFilter.addAction("android.ss.intent.action.DOWNLOAD_COMPLETE");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter2.addDataScheme("package");
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter3.addDataScheme("file");
                C20269b.m66765x().registerReceiver(this.f54537b, intentFilter);
                C20269b.m66765x().registerReceiver(this.f54537b, intentFilter2);
                C20269b.m66765x().registerReceiver(this.f54537b, intentFilter3);
                f54536d = true;
            } catch (Exception unused) {
            }
        }
    }

    public void setAppDownloadDepend(IAppDownloadDepend iAppDownloadDepend) {
        if (iAppDownloadDepend != null) {
            this.appDownloadDepend = iAppDownloadDepend;
        }
    }

    public void setMaxResumeFailedNotificationShowCount(int i) {
        if (i >= 0) {
            this.maxFailedNotificationShowCount = i;
        }
    }

    public void setMaxResumeUnInstallNotificationShowCount(int i) {
        if (i >= 0) {
            this.maxUnInstallNotificationShowCount = i;
        }
    }

    /* renamed from: a */
    private C20254v m66406a(final IAppDownloadEventListener iAppDownloadEventListener) {
        if (iAppDownloadEventListener == null) {
            return null;
        }
        return new C20254v() {
            /* renamed from: a */
            public final String mo53942a() {
                return iAppDownloadEventListener.getNotifyProcessName();
            }

            /* renamed from: a */
            public final boolean mo53944a(boolean z) {
                return iAppDownloadEventListener.installIntercept(z);
            }

            /* renamed from: a */
            public final void mo53943a(int i, DownloadInfo downloadInfo, String str, String str2) {
                if (!(i == 1 || i == 3)) {
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 8:
                            iAppDownloadEventListener.onAppInstallError(i, downloadInfo.getPackageName(), str, str2);
                            return;
                        case 9:
                            iAppDownloadEventListener.onAppInstalled(C20269b.m66765x(), str);
                            return;
                        case 10:
                            iAppDownloadEventListener.onAppDownloadCancel(downloadInfo);
                            return;
                    }
                }
                iAppDownloadEventListener.onAppDownloadEvent(i, str, downloadInfo.getStatus(), downloadInfo.getDownloadTime());
            }
        };
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(Context context) {
        return Downloader.getInstance(context).getDownloadingDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public List<DownloadInfo> getUnCompletedDownloadAppInfos(Context context) {
        return Downloader.getInstance(context).getUnCompletedDownloadInfosWithMimeType("application/vnd.android.package-archive");
    }

    public void setFileProviderAuthority(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.fileProviderAuthority = str;
        }
    }

    /* JADX WARNING: type inference failed for: r9v10, types: [com.ss.android.socialbase.downloader.depend.IDownloadListener] */
    /* JADX WARNING: type inference failed for: r9v11, types: [com.ss.android.socialbase.downloader.depend.IDownloadListener] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v14, types: [com.ss.android.socialbase.appdownloader.DownloadNotificationListener] */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16, types: [com.ss.android.socialbase.appdownloader.DownloadNotificationListener] */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:50|(1:57)(1:56)|58|(2:64|(1:66)(16:68|69|(1:71)|72|73|74|(1:76)(1:77)|78|79|80|81|(2:83|(1:85)(4:86|88|(5:90|(3:92|93|(1:101))|104|105|106)|109))|87|88|(0)|109))|67|69|(0)|72|73|74|(0)(0)|78|79|80|81|(0)|87|88|(0)|109) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x014c */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v12
      assigns: []
      uses: []
      mth insns count: 265
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0121 A[Catch:{ Throwable -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012e A[Catch:{ Throwable -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0134 A[Catch:{ Throwable -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150 A[Catch:{ Throwable -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244 A[Catch:{ Throwable -> 0x0288 }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addDownloadTask(com.p280ss.android.socialbase.appdownloader.AppTaskBuilder r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = 0
            if (r2 == 0) goto L_0x02ac
            android.content.Context r0 = r2.context
            if (r0 != 0) goto L_0x000d
            goto L_0x02ac
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0288 }
            r0.<init>()     // Catch:{ Throwable -> 0x0288 }
            java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader> r6 = r2.headers     // Catch:{ Throwable -> 0x0288 }
            if (r6 == 0) goto L_0x0057
            int r7 = r6.size()     // Catch:{ Throwable -> 0x0288 }
            if (r7 <= 0) goto L_0x0057
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0288 }
            r7 = 0
        L_0x0021:
            boolean r8 = r6.hasNext()     // Catch:{ Throwable -> 0x0288 }
            if (r8 == 0) goto L_0x0058
            java.lang.Object r8 = r6.next()     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.HttpHeader r8 = (com.p280ss.android.socialbase.downloader.model.HttpHeader) r8     // Catch:{ Throwable -> 0x0288 }
            if (r8 == 0) goto L_0x0021
            java.lang.String r9 = r8.f54980a     // Catch:{ Throwable -> 0x0288 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0288 }
            if (r9 != 0) goto L_0x0021
            java.lang.String r9 = r8.f54981b     // Catch:{ Throwable -> 0x0288 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0288 }
            if (r9 != 0) goto L_0x0021
            java.lang.String r9 = r8.f54980a     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r10 = "User-Agent"
            boolean r9 = r9.equals(r10)     // Catch:{ Throwable -> 0x0288 }
            if (r9 == 0) goto L_0x004a
            r7 = 1
        L_0x004a:
            com.ss.android.socialbase.downloader.model.HttpHeader r9 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r10 = r8.f54980a     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r8 = r8.f54981b     // Catch:{ Throwable -> 0x0288 }
            r9.<init>(r10, r8)     // Catch:{ Throwable -> 0x0288 }
            r0.add(r9)     // Catch:{ Throwable -> 0x0288 }
            goto L_0x0021
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 != 0) goto L_0x0066
            com.ss.android.socialbase.downloader.model.HttpHeader r6 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = com.p280ss.android.socialbase.appdownloader.constants.Constants.DEFAULT_USER_AGENT     // Catch:{ Throwable -> 0x0288 }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x0288 }
            r0.add(r6)     // Catch:{ Throwable -> 0x0288 }
        L_0x0066:
            java.lang.String r6 = r2.url     // Catch:{ Throwable -> 0x0288 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0288 }
            if (r7 == 0) goto L_0x006f
            return r3
        L_0x006f:
            java.lang.String r7 = r2.saveName     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r8 = r2.name     // Catch:{ Throwable -> 0x0288 }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0288 }
            if (r9 == 0) goto L_0x007f
            java.lang.String r7 = r2.mimeType     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r7 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.getValidName(r6, r8, r7)     // Catch:{ Throwable -> 0x0288 }
        L_0x007f:
            int r9 = r7.length()     // Catch:{ Throwable -> 0x0288 }
            r10 = 255(0xff, float:3.57E-43)
            if (r9 <= r10) goto L_0x0090
            int r9 = r7.length()     // Catch:{ Throwable -> 0x0288 }
            int r9 = r9 - r10
            java.lang.String r7 = r7.substring(r9)     // Catch:{ Throwable -> 0x0288 }
        L_0x0090:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0288 }
            if (r9 == 0) goto L_0x0097
            r8 = r7
        L_0x0097:
            java.lang.String r9 = r2.mimeType     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r10 = ".apk"
            boolean r10 = r7.endsWith(r10)     // Catch:{ Throwable -> 0x0288 }
            if (r10 == 0) goto L_0x00ab
            java.lang.String r10 = r2.mimeType     // Catch:{ Throwable -> 0x0288 }
            boolean r10 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isApkMineType(r10)     // Catch:{ Throwable -> 0x0288 }
            if (r10 != 0) goto L_0x00ab
            java.lang.String r9 = "application/vnd.android.package-archive"
        L_0x00ab:
            r15 = r9
            java.lang.String r9 = r2.savePath     // Catch:{ Throwable -> 0x0288 }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0288 }
            if (r10 == 0) goto L_0x00ba
            android.content.Context r9 = r2.context     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r9 = com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.getAppDownloadPath(r9)     // Catch:{ Throwable -> 0x0288 }
        L_0x00ba:
            r14 = r9
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x0288 }
            if (r9 != 0) goto L_0x0286
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0288 }
            if (r9 == 0) goto L_0x00c9
            goto L_0x0286
        L_0x00c9:
            int r13 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66720a(r6, r14)     // Catch:{ Throwable -> 0x0288 }
            boolean r9 = r2.force     // Catch:{ Throwable -> 0x0288 }
            if (r9 != 0) goto L_0x00e5
            boolean r10 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67594d(r14, r7)     // Catch:{ Throwable -> 0x0288 }
            if (r10 == 0) goto L_0x00e5
            android.content.Context r10 = r2.context     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.downloader.Downloader r10 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r10)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r10.getDownloadInfo(r13)     // Catch:{ Throwable -> 0x0288 }
            if (r10 != 0) goto L_0x00e5
            r12 = 1
            goto L_0x00e6
        L_0x00e5:
            r12 = r9
        L_0x00e6:
            com.ss.android.socialbase.downloader.depend.IDownloadListener r9 = r2.notificationListener     // Catch:{ Throwable -> 0x0288 }
            if (r9 != 0) goto L_0x00fd
            boolean r10 = r2.showNotification     // Catch:{ Throwable -> 0x0288 }
            if (r10 != 0) goto L_0x00f2
            boolean r10 = r2.autoInstallWithoutNotification     // Catch:{ Throwable -> 0x0288 }
            if (r10 == 0) goto L_0x00fd
        L_0x00f2:
            com.ss.android.socialbase.downloader.notification.a r9 = r2.notificationItem     // Catch:{ Throwable -> 0x0288 }
            if (r9 == 0) goto L_0x0103
            com.ss.android.socialbase.appdownloader.DownloadNotificationListener r9 = new com.ss.android.socialbase.appdownloader.DownloadNotificationListener     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.notification.a r10 = r2.notificationItem     // Catch:{ Throwable -> 0x0288 }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x0288 }
        L_0x00fd:
            r4 = r12
            r18 = r13
            r5 = r14
            r3 = r15
            goto L_0x011d
        L_0x0103:
            com.ss.android.socialbase.appdownloader.DownloadNotificationListener r16 = new com.ss.android.socialbase.appdownloader.DownloadNotificationListener     // Catch:{ Throwable -> 0x0288 }
            android.content.Context r10 = r2.context     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r11 = r2.extra     // Catch:{ Throwable -> 0x0288 }
            r9 = r16
            r17 = r11
            r11 = r13
            r4 = r12
            r12 = r8
            r18 = r13
            r13 = r14
            r5 = r14
            r14 = r7
            r3 = r15
            r15 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Throwable -> 0x0288 }
            r9 = r16
        L_0x011d:
            com.ss.android.socialbase.downloader.depend.IDownloadDepend r10 = r2.depend     // Catch:{ Throwable -> 0x0288 }
            if (r10 != 0) goto L_0x0126
            com.ss.android.socialbase.appdownloader.AppDownloader$1 r10 = new com.ss.android.socialbase.appdownloader.AppDownloader$1     // Catch:{ Throwable -> 0x0288 }
            r10.<init>()     // Catch:{ Throwable -> 0x0288 }
        L_0x0126:
            java.lang.String r11 = r2.extra     // Catch:{ Throwable -> 0x0288 }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x014c }
            if (r12 != 0) goto L_0x0134
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x014c }
            r12.<init>(r11)     // Catch:{ Throwable -> 0x014c }
            goto L_0x0139
        L_0x0134:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Throwable -> 0x014c }
            r12.<init>()     // Catch:{ Throwable -> 0x014c }
        L_0x0139:
            java.lang.String r13 = "auto_install_with_notification"
            boolean r14 = r2.autoInstallWithNotification     // Catch:{ Throwable -> 0x014c }
            r12.put(r13, r14)     // Catch:{ Throwable -> 0x014c }
            java.lang.String r13 = "auto_install_without_notification"
            boolean r14 = r2.autoInstallWithoutNotification     // Catch:{ Throwable -> 0x014c }
            r12.put(r13, r14)     // Catch:{ Throwable -> 0x014c }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x014c }
            r11 = r12
        L_0x014c:
            boolean r12 = r2.showNotification     // Catch:{ Throwable -> 0x0288 }
            if (r12 != 0) goto L_0x0157
            boolean r12 = r2.autoInstallWithoutNotification     // Catch:{ Throwable -> 0x0288 }
            if (r12 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r12 = 0
            goto L_0x0158
        L_0x0157:
            r12 = 1
        L_0x0158:
            android.content.Context r13 = r2.context     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r13 = com.p280ss.android.socialbase.downloader.downloader.Downloader.with(r13)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r13.url(r6)     // Catch:{ Throwable -> 0x0288 }
            java.util.List<java.lang.String> r13 = r2.backUpUrls     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r6.backUpUrls(r13)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r6.name(r7)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r6 = r6.title(r8)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r6.savePath(r5)     // Catch:{ Throwable -> 0x0288 }
            boolean r6 = r2.needWifi     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r5.onlyWifi(r6)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r5.extraHeaders(r0)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.depend(r10)     // Catch:{ Throwable -> 0x0288 }
            int r5 = r2.retryCount     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryCount(r5)     // Catch:{ Throwable -> 0x0288 }
            int r5 = r2.backUpUrlRetryCount     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.backUpUrlRetryCount(r5)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.showNotification(r12)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.extra(r11)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.mimeType(r3)     // Catch:{ Throwable -> 0x0288 }
            int r3 = r2.minProgressTimeMsInterval     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.minProgressTimeMsInterval(r3)     // Catch:{ Throwable -> 0x0288 }
            int r3 = r2.maxProgressCount     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.maxProgressCount(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.IDownloadListener r3 = r2.mainThreadListener     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.mainThreadListener(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationListener(r9)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener r3 = r2.appDownloadEventListener     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.v r3 = r1.m66406a(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationEventListener(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.force(r4)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.autoResumed     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.autoResumed(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.showNotificationForAutoResumed     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.showNotificationForAutoResumed(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.downloader.h r3 = r2.chunkStrategy     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.chunkStategy(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.downloader.g r3 = r2.adjustCalculator     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.chunkAdjustCalculator(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needHttpsToHttpRetry     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needHttpsToHttpRetry(r3)     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r3 = r2.packageName     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.packageName(r3)     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r3 = r2.md5     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.md5(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needRetryDelay     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needRetryDelay(r3)     // Catch:{ Throwable -> 0x0288 }
            java.lang.String r3 = r2.retryDelayTimeArray     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryDelayTimeArray(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needDefaultHttpServiceBackUp     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needDefaultHttpServiceBackUp(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needReuseFirstConnection     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needReuseFirstConnection(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needReuseChunkRunnable     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needReuseChunkRunnable(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needIndependentProcess     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needIndependentProcess(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.constants.EnqueueType r3 = r2.enqueueType     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.enqueueType(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r3 = r2.monitorDepend     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.monitorDepend(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.downloader.q r3 = r2.retryDelayTimeCalculator     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryDelayTimeCalculator(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.headConnectionAvailable     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.headConnectionAvailable(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.o r3 = r2.fileUriProvider     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.fileUriProvider(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.n r3 = r2.diskSpaceHandler     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.diskSpaceHandler(r3)     // Catch:{ Throwable -> 0x0288 }
            boolean r3 = r2.needChunkDowngradeRetry     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.needChunkDowngradeRetry(r3)     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.depend.y r3 = r2.notificationClickCallback     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.notificationClickCallback(r3)     // Catch:{ Throwable -> 0x0288 }
            int r3 = r2.retryScheduleMinutes     // Catch:{ Throwable -> 0x0288 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r0.retryScheduleMinutes(r3)     // Catch:{ Throwable -> 0x0288 }
            if (r0 == 0) goto L_0x0285
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.getDownloadInfo()     // Catch:{ Throwable -> 0x0288 }
            if (r12 == 0) goto L_0x026d
            boolean r3 = r2.needNotificationPermission     // Catch:{ Throwable -> 0x026b }
            if (r3 == 0) goto L_0x026d
            android.app.Activity r3 = r2.activity     // Catch:{ Throwable -> 0x026b }
            if (r3 == 0) goto L_0x026d
            android.app.Activity r3 = r2.activity     // Catch:{ Throwable -> 0x026b }
            boolean r3 = r3.isFinishing()     // Catch:{ Throwable -> 0x026b }
            if (r3 != 0) goto L_0x026d
            boolean r3 = com.p280ss.android.socialbase.appdownloader.C20166c.m66428a()     // Catch:{ Throwable -> 0x026b }
            if (r3 != 0) goto L_0x026d
            android.app.Activity r3 = r2.activity     // Catch:{ Throwable -> 0x026b }
            com.ss.android.socialbase.appdownloader.AppDownloader$2 r5 = new com.ss.android.socialbase.appdownloader.AppDownloader$2     // Catch:{ Throwable -> 0x026b }
            r5.<init>(r8, r0, r2)     // Catch:{ Throwable -> 0x026b }
            com.p280ss.android.socialbase.appdownloader.C20166c.m66426a(r3, r5)     // Catch:{ Throwable -> 0x026b }
            goto L_0x0285
        L_0x026b:
            r0 = move-exception
            goto L_0x028a
        L_0x026d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x026b }
            java.lang.String r5 = "notification permission need not request, start download :"
            r3.<init>(r5)     // Catch:{ Throwable -> 0x026b }
            r3.append(r8)     // Catch:{ Throwable -> 0x026b }
            r0.download()     // Catch:{ Throwable -> 0x026b }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.getDownloadInfo()     // Catch:{ Throwable -> 0x026b }
            r1.generateDownloadInfoSpData(r3, r2)     // Catch:{ Throwable -> 0x0282 }
            goto L_0x0285
        L_0x0282:
            r0 = move-exception
            r4 = r3
            goto L_0x028a
        L_0x0285:
            return r18
        L_0x0286:
            r2 = 0
            return r2
        L_0x0288:
            r0 = move-exception
            r4 = 0
        L_0x028a:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r2 = r2.monitorDepend
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            r5 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r6 = "addDownloadTask"
            java.lang.String r6 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67575b(r0, r6)
            r3.<init>(r5, r6)
            r5 = 0
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r2, r4, r3, r5)
            java.lang.String r2 = "add download task error:%s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r5] = r0
            com.C1642a.m8034a(r2, r3)
            return r5
        L_0x02ac:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.AppDownloader.addDownloadTask(com.ss.android.socialbase.appdownloader.AppTaskBuilder):int");
    }

    public void init(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.fileProviderAuthority = str;
        }
        if (context != null && !f54535c) {
            C20269b.m66725a(context);
            C20269b.m66735a((C20287l) new C20161b());
            m66407a();
            f54535c = true;
        }
    }

    public void setAppDownloadEventListener(int i, IAppDownloadEventListener iAppDownloadEventListener) {
        if (iAppDownloadEventListener != null) {
            Downloader.getInstance(C20269b.m66765x()).setDownloadNotificationEventListener(i, m66406a(iAppDownloadEventListener));
        }
    }

    public void generateDownloadInfoSpData(DownloadInfo downloadInfo, AppTaskBuilder appTaskBuilder) {
        boolean z;
        if (appTaskBuilder.failedResumeMinInterval >= 0) {
            downloadInfo.setFailedResumeMinInterval(appTaskBuilder.failedResumeMinInterval);
            z = true;
        } else {
            z = false;
        }
        if (appTaskBuilder.failedResumeMaxCount >= 0) {
            downloadInfo.setFailedResumeMaxCount(appTaskBuilder.failedResumeMaxCount);
            downloadInfo.setFailedResumeNeedWifi(appTaskBuilder.failedResumeNeedWifi);
            downloadInfo.setFailedResumeNeedWaitWifi(appTaskBuilder.failedResumeNeedWaitWifi);
            z = true;
        }
        if (z) {
            downloadInfo.updateSpData();
        }
    }

    public DownloadInfo getAppDownloadInfo(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            String appDownloadPath = AppDownloadUtils.getAppDownloadPath(context);
            if (TextUtils.isEmpty(appDownloadPath)) {
                return null;
            }
            return Downloader.getInstance(context).getDownloadInfo(str, appDownloadPath);
        } catch (Throwable th) {
            C1642a.m8034a("getAppDownloadInfo error:%s", new Object[]{th.getMessage()});
            return null;
        }
    }

    public int getDownloadId(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return 0;
        }
        try {
            String appDownloadPath = AppDownloadUtils.getAppDownloadPath(context);
            if (TextUtils.isEmpty(appDownloadPath)) {
                return 0;
            }
            return Downloader.getInstance(context).getDownloadId(str, appDownloadPath);
        } catch (Throwable th) {
            C1642a.m8034a("getAppDownloadInfo error:%s", new Object[]{th.getMessage()});
            return 0;
        }
    }

    public static boolean startInstall(Context context, int i) {
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName()) || AppDownloadUtils.isApkInstalled(context, downloadInfo.getSavePath(), downloadInfo.getName())) {
            return false;
        }
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        Uri uriForFile = AppDownloadUtils.getUriForFile(i, Downloader.getInstance(context).getDownloadFileUriProvider(i), context, getInstance().fileProviderAuthority, file);
        if (uriForFile == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        int i2 = 268435456;
        if (VERSION.SDK_INT >= 24) {
            i2 = 268435457;
        }
        intent.addFlags(i2);
        context.startActivity(intent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleStatusClick(android.content.Context r1, int r2, int r3) {
        /*
            r0 = this;
            switch(r3) {
                case -4: goto L_0x0019;
                case -3: goto L_0x0014;
                case -2: goto L_0x000c;
                case -1: goto L_0x0019;
                case 0: goto L_0x0003;
                case 1: goto L_0x0004;
                case 2: goto L_0x0004;
                case 3: goto L_0x0004;
                case 4: goto L_0x0004;
                case 5: goto L_0x0004;
                case 6: goto L_0x0003;
                case 7: goto L_0x0004;
                case 8: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            goto L_0x0021
        L_0x0004:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.pause(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0020
        L_0x000c:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.resume(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0020
        L_0x0014:
            r3 = 1
            com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.startViewIntent(r1, r2, r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0019:
            com.ss.android.socialbase.downloader.downloader.Downloader r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r1)     // Catch:{ Exception -> 0x0020 }
            r1.restart(r2)     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            return
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.AppDownloader.handleStatusClick(android.content.Context, int, int):void");
    }

    public void init(Context context, String str, IAppDownloadDepend iAppDownloadDepend, IAppDownloadEventHandler iAppDownloadEventHandler, IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        if (iAppDownloadDepend != null) {
            this.appDownloadDepend = iAppDownloadDepend;
        }
        if (iAppDownloadEventHandler != null) {
            this.appDownloadEventHandler = iAppDownloadEventHandler;
        }
        if (iAppDownloadMonitorListener != null) {
            this.appDownloadMonitorListener = iAppDownloadMonitorListener;
        }
        if (context != null && !f54535c) {
            C20269b.m66725a(context);
            C20269b.m66735a((C20287l) new C20161b());
            m66407a();
            f54535c = true;
        }
    }
}
