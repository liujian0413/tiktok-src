package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.appsflyer.t */
final class C1900t {

    /* renamed from: ˋ */
    private static String f6887;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r4 = r1;
        r1 = r5;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        com.appsflyer.AFLogger.afErrorLog("Exception while trying to close the InstallationFile", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        com.appsflyer.AFLogger.afErrorLog("Exception while trying to close the InstallationFile", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038 A[SYNTHETIC, Splitter:B:25:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0051 A[SYNTHETIC, Splitter:B:36:0x0051] */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8825(java.io.File r5) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002f }
            java.lang.String r2 = "r"
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x002f }
            long r2 = r1.length()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            int r5 = (int) r2     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r1.readFully(r5)     // Catch:{ IOException -> 0x0020, all -> 0x0025 }
            r1.close()     // Catch:{ IOException -> 0x0020, all -> 0x0025 }
            r1.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x0043
        L_0x0019:
            r0 = move-exception
            java.lang.String r1 = "Exception while trying to close the InstallationFile"
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
            goto L_0x0043
        L_0x0020:
            r0 = move-exception
            r4 = r1
            r1 = r5
            r5 = r0
            goto L_0x002b
        L_0x0025:
            r5 = move-exception
            r0 = r1
            goto L_0x004f
        L_0x0028:
            r5 = move-exception
            r4 = r1
            r1 = r0
        L_0x002b:
            r0 = r4
            goto L_0x0031
        L_0x002d:
            r5 = move-exception
            goto L_0x004f
        L_0x002f:
            r5 = move-exception
            r1 = r0
        L_0x0031:
            java.lang.String r2 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r2, r5)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0042
        L_0x003c:
            r5 = move-exception
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0042:
            r5 = r1
        L_0x0043:
            java.lang.String r0 = new java.lang.String
            if (r5 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r5 = 0
            byte[] r5 = new byte[r5]
        L_0x004b:
            r0.<init>(r5)
            return r0
        L_0x004f:
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = "Exception while trying to close the InstallationFile"
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        L_0x005b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C1900t.m8825(java.io.File):java.lang.String");
    }

    /* renamed from: ˊ */
    public static synchronized String m8826(WeakReference<Context> weakReference) {
        String str;
        synchronized (C1900t.class) {
            if (weakReference.get() == null) {
                String str2 = f6887;
                return str2;
            }
            if (f6887 == null) {
                String str3 = null;
                if (weakReference.get() != null) {
                    str3 = C7285c.m22838a((Context) weakReference.get(), "appsflyer-data", 0).getString("AF_INSTALLATION", null);
                }
                if (str3 != null) {
                    f6887 = str3;
                } else {
                    try {
                        File file = new File(((Context) weakReference.get()).getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            if (VERSION.SDK_INT >= 9) {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder sb = new StringBuilder();
                                sb.append(currentTimeMillis);
                                sb.append("-");
                                sb.append(Math.abs(new SecureRandom().nextLong()));
                                str = sb.toString();
                            } else {
                                str = UUID.randomUUID().toString();
                            }
                            f6887 = str;
                        } else {
                            f6887 = m8825(file);
                            file.delete();
                        }
                        String str4 = f6887;
                        Editor edit = C7285c.m22838a((Context) weakReference.get(), "appsflyer-data", 0).edit();
                        edit.putString("AF_INSTALLATION", str4);
                        if (VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (f6887 != null) {
                    AppsFlyerProperties.getInstance().set("uid", f6887);
                }
            }
            String str5 = f6887;
            return str5;
        }
    }
}
