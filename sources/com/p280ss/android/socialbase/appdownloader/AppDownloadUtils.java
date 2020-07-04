package com.p280ss.android.socialbase.appdownloader;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Looper;
import android.support.p022v4.content.FileProvider;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.depend.AbsAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadFileUriProvider;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.appdownloader.AppDownloadUtils */
public class AppDownloadUtils {
    private static NotificationChannel mNotificationChannel;

    public static int getPackageInfoFlag() {
        if (AppDownloader.getInstance().usePackageFlagConfiguration) {
            return 16384;
        }
        return 0;
    }

    public static boolean isMainThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean canNotAutoInstall(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("bind_app", false) || !jSONObject.optBoolean("auto_install_with_notification", true)) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
        }
    }

    public static int getNotificationType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == -2) {
            return 2;
        }
        if (i == 1) {
            return 4;
        }
        if (C20195c.m66506b(i)) {
            return 1;
        }
        if (C20195c.m66505a(i)) {
            return 3;
        }
        return 0;
    }

    public static boolean isApkMineType(String str) {
        if (TextUtils.isEmpty(str) || !str.equals("application/vnd.android.package-archive")) {
            return false;
        }
        return true;
    }

    public static boolean isAutoInstallWithoutNotification(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (new JSONObject(str).optBoolean("auto_install_without_notification", false)) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static boolean isBindApp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (new JSONObject(str).optBoolean("bind_app", false)) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public static String getNotificationChannelId(Context context) {
        try {
            if (mNotificationChannel == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111111", "channel_appdownloader", 3);
                mNotificationChannel = notificationChannel;
                notificationChannel.setSound(null, null);
                mNotificationChannel.setShowBadge(false);
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(mNotificationChannel);
            }
        } catch (Throwable unused) {
        }
        return "111111";
    }

    public static String bytesToHuman(long j) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        int i = 0;
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            StringBuilder sb = new StringBuilder("0 ");
            sb.append(strArr[4]);
            return sb.toString();
        }
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                str = format(j, j2, strArr[i]);
                break;
            }
            i++;
        }
        return str;
    }

    public static String getAppDownloadPath(Context context) {
        String str;
        File file;
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        } catch (IncompatibleClassChangeError unused2) {
            str = "";
        }
        if ("mounted".equals(str)) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        } else {
            file = applicationContext.getFilesDir();
        }
        if (file != null) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getAbsolutePath());
                    sb.append(" already exists and is not a directory");
                    throw new IllegalStateException(sb.toString());
                }
            } else if (!file.mkdirs()) {
                StringBuilder sb2 = new StringBuilder("Unable to create directory: ");
                sb2.append(file.getAbsolutePath());
                throw new IllegalStateException(sb2.toString());
            }
            return file.getAbsolutePath();
        }
        throw new IllegalStateException("Failed to get storage directory");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r8 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r8 != null) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[SYNTHETIC, Splitter:B:33:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMaterialNotification(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L_0x008b
            if (r8 != 0) goto L_0x000b
            goto L_0x008b
        L_0x000b:
            r0 = 0
            r2 = 2131099797(0x7f060095, float:1.7811957E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r3 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            boolean r3 = r3.useReflectParseRes     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            if (r3 == 0) goto L_0x001d
            java.lang.String r2 = "appdownloader_notification_title_color"
            int r2 = com.p280ss.android.socialbase.appdownloader.C20170d.m66436e(r8, r2)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
        L_0x001d:
            android.content.res.Resources r3 = r8.getResources()     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            int r2 = r3.getColor(r2)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            r3 = 16842904(0x1010098, float:2.3693984E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            boolean r4 = r4.useReflectParseRes     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            if (r4 == 0) goto L_0x0038
            java.lang.String r3 = "textColor"
            java.lang.String r4 = "android"
            int r3 = com.p280ss.android.socialbase.appdownloader.C20170d.m66433b(r8, r3, r4)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
        L_0x0038:
            r4 = 16842901(0x1010095, float:2.3693976E-38)
            com.ss.android.socialbase.appdownloader.AppDownloader r5 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            boolean r5 = r5.useReflectParseRes     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            if (r5 == 0) goto L_0x004b
            java.lang.String r4 = "textSize"
            java.lang.String r5 = "android"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66433b(r8, r4, r5)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
        L_0x004b:
            r5 = 2
            int[] r5 = new int[r5]     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            r5[r1] = r3     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            r3 = 1
            r5[r3] = r4     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            r4 = 2131886761(0x7f1202a9, float:1.940811E38)
            com.ss.android.socialbase.appdownloader.AppDownloader r6 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            boolean r6 = r6.useReflectParseRes     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            if (r6 == 0) goto L_0x0064
            java.lang.String r4 = "appdownloader_style_notification_title"
            int r4 = com.p280ss.android.socialbase.appdownloader.C20170d.m66434c(r8, r4)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
        L_0x0064:
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r4, r5)     // Catch:{ Throwable -> 0x0086, all -> 0x007f }
            int r0 = r8.getColor(r1, r1)     // Catch:{ Throwable -> 0x0087, all -> 0x007a }
            if (r2 != r0) goto L_0x0074
            if (r8 == 0) goto L_0x0073
            r8.recycle()     // Catch:{ Throwable -> 0x0073 }
        L_0x0073:
            return r3
        L_0x0074:
            if (r8 == 0) goto L_0x008a
        L_0x0076:
            r8.recycle()     // Catch:{ Throwable -> 0x008a }
            goto L_0x008a
        L_0x007a:
            r0 = move-exception
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x0080
        L_0x007f:
            r8 = move-exception
        L_0x0080:
            if (r0 == 0) goto L_0x0085
            r0.recycle()     // Catch:{ Throwable -> 0x0085 }
        L_0x0085:
            throw r8
        L_0x0086:
            r8 = r0
        L_0x0087:
            if (r8 == 0) goto L_0x008a
            goto L_0x0076
        L_0x008a:
            return r1
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.appdownloader.AppDownloadUtils.isMaterialNotification(android.content.Context):boolean");
    }

    public static boolean isPackageNameValid(DownloadInfo downloadInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(downloadInfo.getPackageName()) && str.equals(downloadInfo.getPackageName())) {
            return true;
        }
        if (TextUtils.isEmpty(downloadInfo.getName()) || !isPackageNameEqualsWithApk(C20269b.m66765x(), downloadInfo, str)) {
            return false;
        }
        return true;
    }

    private static String format(long j, long j2, String str) {
        double d;
        if (j2 > 1) {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        } else {
            d = (double) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DecimalFormat("#.##").format(d));
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public static int startViewIntent(Context context, int i, boolean z) {
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) {
            return 2;
        }
        int[] iArr = {0};
        Intent buildViewIntent = buildViewIntent(context, i, z, iArr);
        if (buildViewIntent != null) {
            buildViewIntent.addFlags(268435456);
            try {
                context.startActivity(buildViewIntent);
                return 1;
            } catch (Throwable unused) {
                return 0;
            }
        } else if (iArr[0] == 1) {
            return 2;
        } else {
            return 0;
        }
    }

    public static String getValidName(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment)) {
            str2 = lastPathSegment;
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "default.apk";
        }
        if (isApkMineType(str3) && !str2.endsWith(".apk")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".apk");
            str2 = sb.toString();
        }
        return str2;
    }

    public static boolean isApkInstalled(Context context, String str, String str2) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str, str2);
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
                if (packageArchiveInfo == null) {
                    return false;
                }
                String str3 = packageArchiveInfo.packageName;
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str3, getPackageInfoFlag());
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i <= packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return z;
    }

    public static boolean isPackageNameEqualsWithApk(Context context, DownloadInfo downloadInfo, String str) {
        PackageInfo packageInfo;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.exists()) {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
                if (packageArchiveInfo == null || !packageArchiveInfo.packageName.equals(str)) {
                    return false;
                }
                int i = packageArchiveInfo.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, getPackageInfoFlag());
                } catch (NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    if (i == packageInfo.versionCode) {
                        z = true;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    private static Intent buildViewIntent(Context context, int i, boolean z, int[] iArr) {
        Intent intent;
        boolean z2;
        boolean z3;
        Context context2 = context;
        int i2 = i;
        boolean z4 = z;
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i2);
        if (downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return null;
        }
        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        if (file.exists() && file.getPath().startsWith(context.getCacheDir().toString())) {
            try {
                StringBuilder sb = new StringBuilder("chmod 777 ");
                sb.append(file.getAbsolutePath());
                Process exec = Runtime.getRuntime().exec(sb.toString());
                if (exec != null) {
                    exec.destroy();
                }
            } catch (Throwable unused) {
            }
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), getPackageInfoFlag());
        int i3 = 1;
        if (isApkInstalled(context2, downloadInfo.getSavePath(), downloadInfo.getName())) {
            if (packageArchiveInfo != null) {
                intent = packageManager.getLaunchIntentForPackage(packageArchiveInfo.packageName);
            } else {
                intent = null;
            }
            z2 = false;
        } else {
            Uri uriForFile = getUriForFile(i2, Downloader.getInstance(context).getDownloadFileUriProvider(i2), context2, AppDownloader.getInstance().fileProviderAuthority, file);
            if (uriForFile == null || !file.exists()) {
                return null;
            }
            if (!TextUtils.isEmpty(downloadInfo.getPackageName()) && packageArchiveInfo != null && !packageArchiveInfo.packageName.equals(downloadInfo.getPackageName())) {
                IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                if (iAppDownloadEventHandler != null) {
                    iAppDownloadEventHandler.handleAppInstallError(i, 8, downloadInfo.getPackageName(), packageArchiveInfo.packageName, "");
                    if (iAppDownloadEventHandler.isForbidInvalidatePackageInstall()) {
                        return null;
                    }
                }
                C20254v downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(i2);
                if (downloadNotificationEventListener != null) {
                    downloadNotificationEventListener.mo53943a(8, downloadInfo, packageArchiveInfo.packageName, "");
                    IAppDownloadDepend iAppDownloadDepend = AppDownloader.getInstance().appDownloadDepend;
                    if ((iAppDownloadDepend instanceof AbsAppDownloadDepend) && ((AbsAppDownloadDepend) iAppDownloadDepend).isForbiddenInstallForInvalidatePackageName()) {
                        return null;
                    }
                }
            }
            String str = "application/vnd.android.package-archive";
            intent = new Intent("android.intent.action.VIEW");
            if (VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
            }
            intent.setDataAndType(uriForFile, str);
            IAppDownloadEventHandler iAppDownloadEventHandler2 = AppDownloader.getInstance().appDownloadEventHandler;
            if (iAppDownloadEventHandler2 != null) {
                z3 = iAppDownloadEventHandler2.installIntercept(i2, z4);
            } else {
                z3 = false;
            }
            C20254v downloadNotificationEventListener2 = Downloader.getInstance(context).getDownloadNotificationEventListener(i2);
            if (downloadNotificationEventListener2 != null) {
                z2 = downloadNotificationEventListener2.mo53944a(z4);
            } else {
                z2 = z3;
            }
        }
        if (!z2) {
            i3 = 0;
        }
        iArr[0] = i3;
        if (z2) {
            return null;
        }
        return intent;
    }

    public static Uri getUriForFile(int i, C20241o oVar, Context context, String str, File file) {
        Uri uri;
        if (oVar != null) {
            try {
                uri = oVar.mo54182a(str, file.getAbsolutePath());
            } catch (Throwable unused) {
            }
        } else {
            IAppDownloadFileUriProvider iAppDownloadFileUriProvider = AppDownloader.getInstance().appFileUriProvider;
            if (iAppDownloadFileUriProvider != null) {
                uri = iAppDownloadFileUriProvider.getUriForFile(i, str, file.getAbsolutePath());
            }
            uri = null;
        }
        if (uri == null) {
            try {
                if (VERSION.SDK_INT < 24 || TextUtils.isEmpty(str)) {
                    return Uri.fromFile(file);
                }
                return FileProvider.getUriForFile(context, str, file);
            } catch (Throwable unused2) {
            }
        }
        return uri;
    }
}
