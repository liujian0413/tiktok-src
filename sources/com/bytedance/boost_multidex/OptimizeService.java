package com.bytedance.boost_multidex;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.IOException;

public class OptimizeService extends IntentService {
    static volatile boolean sAlreadyOpt;
    File mDexDir;
    File mOptDexDir;
    File mRootDir;
    File mZipDir;

    public OptimizeService() {
        super("OptimizeService");
        if (Monitor.get() == null) {
            Monitor.init(null);
        }
        Monitor.get().logDebug("Starting OptimizeService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x020d A[Catch:{ Throwable -> 0x024f, all -> 0x024d }, LOOP:1: B:22:0x011e->B:43:0x020d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0212 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleOptimize() {
        /*
            r22 = this;
            r1 = r22
            boolean r0 = sAlreadyOpt
            if (r0 == 0) goto L_0x0010
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r2 = "opt had already done, skip"
            r0.logInfo(r2)
            return
        L_0x0010:
            r2 = 1
            sAlreadyOpt = r2
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            r0.doBeforeHandleOpt()
            java.lang.String r0 = "dex.number"
            com.bytedance.boost_multidex.Locker r3 = new com.bytedance.boost_multidex.Locker
            java.io.File r4 = new java.io.File
            java.io.File r5 = r1.mRootDir
            java.lang.String r6 = "boost_multidex.install.lock"
            r4.<init>(r5, r6)
            r3.<init>(r4)
            r3.lock()
            r4 = 0
            android.content.pm.ApplicationInfo r5 = r22.getApplicationInfo()     // Catch:{ Throwable -> 0x024f }
            if (r5 == 0) goto L_0x0245
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.lang.String r5 = r5.sourceDir     // Catch:{ Throwable -> 0x024f }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r5 = "boost_multidex.records"
            android.content.SharedPreferences r5 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r1, r5, r4)     // Catch:{ Throwable -> 0x024f }
            int r7 = r5.getInt(r0, r4)     // Catch:{ Throwable -> 0x024f }
            r8 = 2
            r9 = 2
        L_0x0047:
            if (r9 > r7) goto L_0x0232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r10 = "dex.obj.type"
            r0.<init>(r10)     // Catch:{ Throwable -> 0x024f }
            r0.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x024f }
            int r0 = r5.getInt(r0, r4)     // Catch:{ Throwable -> 0x024f }
            java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.io.File r11 = r1.mDexDir     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            r12.<init>()     // Catch:{ Throwable -> 0x024f }
            r12.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r13 = ".dex"
            r12.append(r13)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x024f }
            r10.<init>(r11, r12)     // Catch:{ Throwable -> 0x024f }
            java.io.File r11 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.io.File r12 = r1.mOptDexDir     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            r13.<init>()     // Catch:{ Throwable -> 0x024f }
            r13.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = ".odex"
            r13.append(r14)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x024f }
            r11.<init>(r12, r13)     // Catch:{ Throwable -> 0x024f }
            if (r0 != 0) goto L_0x00b3
            java.util.zip.ZipFile r12 = new java.util.zip.ZipFile     // Catch:{ Throwable -> 0x024f }
            r12.<init>(r6)     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = "classes"
            r13.<init>(r14)     // Catch:{ Throwable -> 0x024f }
            r13.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = ".dex"
            r13.append(r14)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x024f }
            java.util.zip.ZipEntry r13 = r12.getEntry(r13)     // Catch:{ Throwable -> 0x024f }
            byte[] r12 = com.bytedance.boost_multidex.Utility.obtainEntryBytesInZip(r12, r13)     // Catch:{ Throwable -> 0x024f }
            com.bytedance.boost_multidex.DexHolder$ApkBuffer r13 = new com.bytedance.boost_multidex.DexHolder$ApkBuffer     // Catch:{ Throwable -> 0x024f }
            r13.<init>(r9, r12, r10, r11)     // Catch:{ Throwable -> 0x024f }
            goto L_0x00fd
        L_0x00b3:
            if (r0 != r2) goto L_0x00bb
            com.bytedance.boost_multidex.DexHolder$DexBuffer r13 = new com.bytedance.boost_multidex.DexHolder$DexBuffer     // Catch:{ Throwable -> 0x024f }
            r13.<init>(r9, r10, r11)     // Catch:{ Throwable -> 0x024f }
            goto L_0x00fd
        L_0x00bb:
            if (r0 != r8) goto L_0x00c3
            com.bytedance.boost_multidex.DexHolder$DexOpt r13 = new com.bytedance.boost_multidex.DexHolder$DexOpt     // Catch:{ Throwable -> 0x024f }
            r13.<init>(r9, r10, r11, r4)     // Catch:{ Throwable -> 0x024f }
            goto L_0x00fd
        L_0x00c3:
            r10 = 3
            if (r0 != r10) goto L_0x00fc
            java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.io.File r11 = r1.mZipDir     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            r12.<init>()     // Catch:{ Throwable -> 0x024f }
            r12.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r13 = ".zip"
            r12.append(r13)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x024f }
            r10.<init>(r11, r12)     // Catch:{ Throwable -> 0x024f }
            java.io.File r11 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.io.File r12 = r1.mZipDir     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            r13.<init>()     // Catch:{ Throwable -> 0x024f }
            r13.append(r9)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = ".odex"
            r13.append(r14)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x024f }
            r11.<init>(r12, r13)     // Catch:{ Throwable -> 0x024f }
            com.bytedance.boost_multidex.DexHolder$ZipOpt r13 = new com.bytedance.boost_multidex.DexHolder$ZipOpt     // Catch:{ Throwable -> 0x024f }
            r13.<init>(r9, r10, r11)     // Catch:{ Throwable -> 0x024f }
            goto L_0x00fd
        L_0x00fc:
            r13 = 0
        L_0x00fd:
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = "Process beginning holder "
            r11.<init>(r12)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = r13.toString()     // Catch:{ Throwable -> 0x024f }
            r11.append(r12)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = ", type: "
            r11.append(r12)     // Catch:{ Throwable -> 0x024f }
            r11.append(r0)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r0 = r11.toString()     // Catch:{ Throwable -> 0x024f }
            r10.logInfo(r0)     // Catch:{ Throwable -> 0x024f }
        L_0x011e:
            if (r13 == 0) goto L_0x022e
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Throwable -> 0x024f }
            long r10 = r0.getFreeSpace()     // Catch:{ Throwable -> 0x024f }
            r14 = 20000000(0x1312d00, double:9.881313E-317)
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x015c
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r5 = "Free space is too small: "
            r2.<init>(r5)     // Catch:{ Throwable -> 0x024f }
            r2.append(r10)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r5 = ", compare to 150000000"
            r2.append(r5)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x024f }
            r0.logWarning(r2)     // Catch:{ Throwable -> 0x024f }
            r3.close()
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r2 = "Exit quietly"
            r0.logInfo(r2)
            r22.stopSelf()
            java.lang.System.exit(r4)
            return
        L_0x015c:
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = "Free space is enough: "
            r12.<init>(r14)     // Catch:{ Throwable -> 0x024f }
            r12.append(r10)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = ", continue..."
            r12.append(r14)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x024f }
            r0.logInfo(r12)     // Catch:{ Throwable -> 0x024f }
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x024f }
            java.lang.String r14 = "Process holder, "
            r12.<init>(r14)     // Catch:{ Throwable -> 0x024f }
            r12.append(r13)     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x024f }
            r0.logDebug(r12)     // Catch:{ Throwable -> 0x024f }
            long r14 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x01e4 }
            com.bytedance.boost_multidex.DexHolder r12 = r13.toFasterHolder(r5)     // Catch:{ Throwable -> 0x01e4 }
            if (r12 == 0) goto L_0x01e2
            long r16 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x01e0 }
            r0 = 0
            long r16 = r16 - r14
            com.bytedance.boost_multidex.DexHolder$StoreInfo r0 = r12.getInfo()     // Catch:{ Throwable -> 0x01e0 }
            com.bytedance.boost_multidex.Monitor r13 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x01e0 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01e0 }
            java.lang.String r15 = "Put info, "
            r14.<init>(r15)     // Catch:{ Throwable -> 0x01e0 }
            int r15 = r0.index     // Catch:{ Throwable -> 0x01e0 }
            r14.append(r15)     // Catch:{ Throwable -> 0x01e0 }
            java.lang.String r15 = " file is "
            r14.append(r15)     // Catch:{ Throwable -> 0x01e0 }
            java.io.File r0 = r0.file     // Catch:{ Throwable -> 0x01e0 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Throwable -> 0x01e0 }
            r14.append(r0)     // Catch:{ Throwable -> 0x01e0 }
            java.lang.String r0 = r14.toString()     // Catch:{ Throwable -> 0x01e0 }
            r13.logDebug(r0)     // Catch:{ Throwable -> 0x01e0 }
            java.io.File r0 = android.os.Environment.getDataDirectory()     // Catch:{ Throwable -> 0x01e0 }
            long r13 = r0.getFreeSpace()     // Catch:{ Throwable -> 0x01e0 }
            r0 = 0
            long r19 = r13 - r10
            com.bytedance.boost_multidex.Monitor r14 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x01e0 }
            java.lang.String r21 = r12.toString()     // Catch:{ Throwable -> 0x01e0 }
            r15 = r16
            r17 = r10
            r14.reportAfterInstall(r15, r17, r19, r21)     // Catch:{ Throwable -> 0x01e0 }
            goto L_0x01e2
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e6
        L_0x01e2:
            r13 = r12
            goto L_0x01f9
        L_0x01e4:
            r0 = move-exception
            r12 = r13
        L_0x01e6:
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.String r11 = "Fail to be faster"
            r10.logErrorAfterInstall(r11, r0)     // Catch:{ Throwable -> 0x024f }
            com.bytedance.boost_multidex.Result r10 = com.bytedance.boost_multidex.Result.get()     // Catch:{ Throwable -> 0x024f }
            java.util.List<java.lang.Throwable> r10 = r10.unFatalThrowable     // Catch:{ Throwable -> 0x024f }
            r10.add(r0)     // Catch:{ Throwable -> 0x024f }
            goto L_0x01e2
        L_0x01f9:
            com.bytedance.boost_multidex.Locker r0 = new com.bytedance.boost_multidex.Locker     // Catch:{ Throwable -> 0x024f }
            java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x024f }
            java.io.File r11 = r1.mRootDir     // Catch:{ Throwable -> 0x024f }
            java.lang.String r12 = "boost_multidex.prepare.lock"
            r10.<init>(r11, r12)     // Catch:{ Throwable -> 0x024f }
            r0.<init>(r10)     // Catch:{ Throwable -> 0x024f }
            boolean r10 = r0.test()     // Catch:{ Throwable -> 0x024f }
            if (r10 == 0) goto L_0x0212
            r0.close()     // Catch:{ Throwable -> 0x024f }
            goto L_0x011e
        L_0x0212:
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ Throwable -> 0x024f }
            java.lang.String r2 = "Other process is waiting for installing"
            r0.logInfo(r2)     // Catch:{ Throwable -> 0x024f }
            r3.close()
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r2 = "Exit quietly"
            r0.logInfo(r2)
            r22.stopSelf()
            java.lang.System.exit(r4)
            return
        L_0x022e:
            int r9 = r9 + 1
            goto L_0x0047
        L_0x0232:
            r3.close()
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r2 = "Exit quietly"
            r0.logInfo(r2)
            r22.stopSelf()
            java.lang.System.exit(r4)
            return
        L_0x0245:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x024f }
            java.lang.String r2 = "No ApplicationInfo available, i.e. running on a test Context: BoostMultiDex support library is disabled."
            r0.<init>(r2)     // Catch:{ Throwable -> 0x024f }
            throw r0     // Catch:{ Throwable -> 0x024f }
        L_0x024d:
            r0 = move-exception
            goto L_0x026c
        L_0x024f:
            r0 = move-exception
            com.bytedance.boost_multidex.Monitor r2 = com.bytedance.boost_multidex.Monitor.get()     // Catch:{ all -> 0x024d }
            java.lang.String r5 = "Failed to install extracted secondary dex files"
            r2.logWarning(r5, r0)     // Catch:{ all -> 0x024d }
            r3.close()
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r2 = "Exit quietly"
            r0.logInfo(r2)
            r22.stopSelf()
            java.lang.System.exit(r4)
            return
        L_0x026c:
            r3.close()
            com.bytedance.boost_multidex.Monitor r2 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.String r3 = "Exit quietly"
            r2.logInfo(r3)
            r22.stopSelf()
            java.lang.System.exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.OptimizeService.handleOptimize():void");
    }

    public static void startOptimizeService(Context context) {
        context.startService(new Intent(context, OptimizeService.class));
    }

    public void onCreate() {
        super.onCreate();
        try {
            File filesDir = getFilesDir();
            if (!filesDir.exists()) {
                Utility.mkdirChecked(filesDir);
            }
            this.mRootDir = Utility.ensureDirCreated(filesDir, "boost_multidex");
            this.mDexDir = Utility.ensureDirCreated(this.mRootDir, "dex_cache");
            this.mOptDexDir = Utility.ensureDirCreated(this.mRootDir, "odex_cache");
            this.mZipDir = Utility.ensureDirCreated(this.mRootDir, "zip_cache");
        } catch (IOException e) {
            Monitor.get().logError("fail to create files", e);
            sAlreadyOpt = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                handleOptimize();
            } catch (IOException e) {
                Monitor.get().logError("fail to handle opt", e);
            }
        }
    }
}
