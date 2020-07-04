package com.bytedance.boost_multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Environment;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class DexInstallProcessor {
    private boolean mDoCheckSum;
    private SharedPreferences mPreferences;

    DexInstallProcessor() {
        this.mDoCheckSum = new Random().nextInt(3) == 0;
        Monitor monitor = Monitor.get();
        StringBuilder sb = new StringBuilder("Do checksum ");
        sb.append(this.mDoCheckSum);
        monitor.logInfo(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkFileValid(int r10, java.lang.String r11, java.lang.String r12, java.io.File r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r13.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0021
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "File does not exist! "
            r11.<init>(r12)
            java.lang.String r12 = r13.getPath()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.logWarning(r11)
            return r1
        L_0x0021:
            android.content.SharedPreferences r0 = r9.mPreferences
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = r13.lastModified()
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x006c
            com.bytedance.boost_multidex.Monitor r13 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid file:  (key \""
            r14.<init>(r0)
            r14.append(r11)
            r14.append(r12)
            r14.append(r10)
            java.lang.String r10 = "\"), expected modification time: "
            r14.append(r10)
            r14.append(r5)
            java.lang.String r10 = ", modification time: "
            r14.append(r10)
            r14.append(r7)
            java.lang.String r10 = r14.toString()
            r13.logWarning(r10)
            return r1
        L_0x006c:
            r5 = 0
            java.lang.String r0 = "dex.checksum."
            boolean r0 = r0.equals(r11)
            r2 = 1
            if (r0 == 0) goto L_0x008a
            if (r14 == 0) goto L_0x007e
            long r5 = com.bytedance.boost_multidex.Utility.doZipCheckSum(r13)     // Catch:{ IOException -> 0x0089 }
            goto L_0x0096
        L_0x007e:
            boolean r14 = r9.mDoCheckSum     // Catch:{ IOException -> 0x0089 }
            if (r14 == 0) goto L_0x0087
            long r5 = com.bytedance.boost_multidex.Utility.doFileCheckSum(r13)     // Catch:{ IOException -> 0x0089 }
            goto L_0x0096
        L_0x0087:
            r13 = 0
            goto L_0x0097
        L_0x0089:
            return r1
        L_0x008a:
            java.lang.String r14 = "odex.checksum."
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x00df
            long r5 = r13.length()
        L_0x0096:
            r13 = 1
        L_0x0097:
            if (r13 == 0) goto L_0x00de
            android.content.SharedPreferences r13 = r9.mPreferences
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r11)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            long r13 = r13.getLong(r14, r3)
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            com.bytedance.boost_multidex.Monitor r0 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid file:  (key \""
            r2.<init>(r3)
            r2.append(r11)
            r2.append(r12)
            r2.append(r10)
            java.lang.String r10 = "\"), expected checksum: "
            r2.append(r10)
            r2.append(r13)
            java.lang.String r10 = ", file checksum: "
            r2.append(r10)
            r2.append(r5)
            java.lang.String r10 = r2.toString()
            r0.logWarning(r10)
            return r1
        L_0x00de:
            return r2
        L_0x00df:
            com.bytedance.boost_multidex.Monitor r10 = com.bytedance.boost_multidex.Monitor.get()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "unsupported checksum key: "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.logWarning(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.DexInstallProcessor.checkFileValid(int, java.lang.String, java.lang.String, java.io.File, boolean):boolean");
    }

    private File getValidDexFile(File file, int i) {
        if (!checkFileValid(i, "dex.checksum.", "dex.time.", file, false)) {
            return null;
        }
        return file;
    }

    private File getValidOptDexFile(File file, int i) {
        if (!file.exists()) {
            Monitor monitor = Monitor.get();
            StringBuilder sb = new StringBuilder("opt file does not exist: ");
            sb.append(file.getPath());
            monitor.logInfo(sb.toString());
            return null;
        }
        if (!checkFileValid(i, "odex.checksum.", "odex.time.", file, false)) {
            return null;
        }
        return file;
    }

    private void installSecondaryDexes(ClassLoader classLoader, List<DexHolder> list) {
        DexLoader.create(VERSION.SDK_INT).install(classLoader, list, this.mPreferences);
        try {
            BoostNative.recoverAction();
        } catch (UnsatisfiedLinkError unused) {
        }
        Monitor monitor = Monitor.get();
        StringBuilder sb = new StringBuilder("After install all, sp value is ");
        sb.append(this.mPreferences.getAll());
        monitor.logDebug(sb.toString());
    }

    private boolean isZipFileValid(File file, int i) {
        return checkFileValid(i, "dex.checksum.", "dex.time.", file, true);
    }

    private DexHolder obtainDexHolder(int i, File file, File file2, File file3, File file4) {
        SharedPreferences sharedPreferences = this.mPreferences;
        StringBuilder sb = new StringBuilder("dex.obj.type");
        sb.append(i);
        int i2 = sharedPreferences.getInt(sb.toString(), 9);
        if (i2 == 9) {
            i2 = BoostNative.isSupportFastLoad() ? !Utility.isBetterUseApkBuf() : 3;
        }
        if (i2 == 3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(".zip");
            File file5 = new File(file4, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append(".odex");
            File file6 = new File(file4, sb3.toString());
            if (isZipFileValid(file5, i)) {
                return new ZipOpt(i, file5, file6);
            }
            ZipFile zipFile = new ZipFile(file);
            StringBuilder sb4 = new StringBuilder("classes");
            sb4.append(i);
            sb4.append(".dex");
            ZipOpt obtainValidZipDex = DexHolder.obtainValidZipDex(this.mPreferences, i, file5, file6, zipFile, zipFile.getEntry(sb4.toString()));
            zipFile.close();
            return obtainValidZipDex;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(i);
        sb5.append(".dex");
        File file7 = new File(file2, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i);
        sb6.append(".odex");
        File file8 = new File(file3, sb6.toString());
        int i3 = 0;
        if (i2 == 2) {
            File validDexFile = getValidDexFile(file7, i);
            if (validDexFile != null) {
                File validOptDexFile = getValidOptDexFile(file8, i);
                if (validOptDexFile != null) {
                    return new DexOpt(i, validDexFile, validOptDexFile, false);
                }
                if (!BoostNative.isSupportFastLoad()) {
                    return new DexOpt(i, validDexFile, file8, true);
                }
                i2 = 1;
            } else if (BoostNative.isSupportFastLoad()) {
                i2 = 0;
            } else {
                ZipFile zipFile2 = new ZipFile(file);
                StringBuilder sb7 = new StringBuilder("classes");
                sb7.append(i);
                sb7.append(".dex");
                return DexHolder.obtainValidForceDexOpt(this.mPreferences, i, file7, file8, zipFile2, zipFile2.getEntry(sb7.toString()));
            }
        }
        if (i2 == 1) {
            File validDexFile2 = getValidDexFile(file7, i);
            if (BoostNative.isSupportFastLoad()) {
                if (validDexFile2 != null) {
                    return new DexBuffer(i, validDexFile2, file8);
                }
            } else if (validDexFile2 != null) {
                return new DexOpt(i, validDexFile2, file8, true);
            } else {
                ZipFile zipFile3 = new ZipFile(file);
                StringBuilder sb8 = new StringBuilder("classes");
                sb8.append(i);
                sb8.append(".dex");
                return DexHolder.obtainValidForceDexOpt(this.mPreferences, i, file7, file8, zipFile3, zipFile3.getEntry(sb8.toString()));
            }
        } else {
            i3 = i2;
        }
        if (i3 != 0) {
            return null;
        }
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Do not support apk buf!");
        }
        ZipFile zipFile4 = new ZipFile(file);
        StringBuilder sb9 = new StringBuilder("classes");
        sb9.append(i);
        sb9.append(".dex");
        ApkBuffer apkBuffer = new ApkBuffer(i, obtainEntryBytesInApk(zipFile4, zipFile4.getEntry(sb9.toString())), file7, file8);
        zipFile4.close();
        return apkBuffer;
    }

    private List<DexHolder> obtainDexObjectList(File file, File file2, File file3, File file4, File file5, Result result) {
        boolean z;
        Result result2;
        Object obtainValidZipDex;
        File file6 = file5;
        long doZipCheckSum = Utility.doZipCheckSum(file);
        long lastModified = file.lastModified();
        String str = "timestamp";
        String str2 = "crc";
        String str3 = "dex.number";
        if (this.mPreferences.getLong(str, -1) == lastModified && this.mPreferences.getLong(str2, -1) == doZipCheckSum) {
            result2 = result;
            z = false;
        } else {
            result2 = result;
            z = true;
        }
        result2.modified = z;
        ArrayList arrayList = new ArrayList();
        int i = 2;
        if (z) {
            Utility.clearDirFiles(file3);
            Utility.clearDirFiles(file4);
            Utility.clearDirFiles(file5);
            Editor edit = this.mPreferences.edit();
            edit.clear();
            edit.commit();
            ZipFile zipFile = new ZipFile(file);
            while (true) {
                StringBuilder sb = new StringBuilder("classes");
                sb.append(i);
                sb.append(".dex");
                ZipEntry entry = zipFile.getEntry(sb.toString());
                if (entry == null) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                long j = doZipCheckSum;
                sb2.append(".dex");
                File file7 = new File(file3, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                sb3.append(".odex");
                File file8 = new File(file4, sb3.toString());
                if (BoostNative.isSupportFastLoad()) {
                    if (Utility.isBetterUseApkBuf()) {
                        arrayList.add(new ApkBuffer(i, obtainEntryBytesInApk(zipFile, entry), file7, file8));
                        i++;
                        doZipCheckSum = j;
                    } else {
                        obtainValidZipDex = DexHolder.obtainValidDexBuffer(this.mPreferences, i, obtainEntryFileInApk(zipFile, entry, file7), file8);
                    }
                } else if (Environment.getDataDirectory().getFreeSpace() > 150000000) {
                    obtainValidZipDex = DexHolder.obtainValidForceDexOpt(this.mPreferences, i, file7, file8, zipFile, entry);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i);
                    sb4.append(".zip");
                    File file9 = new File(file6, sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i);
                    sb5.append(".odex");
                    obtainValidZipDex = DexHolder.obtainValidZipDex(this.mPreferences, i, file9, new File(file6, sb5.toString()), zipFile, entry);
                }
                arrayList.add(obtainValidZipDex);
                i++;
                doZipCheckSum = j;
            }
            long j2 = doZipCheckSum;
            zipFile.close();
            edit.putInt(str3, i - 1);
            edit.putLong(str, lastModified);
            edit.putLong(str2, j2);
            edit.commit();
        } else {
            File file10 = file;
            int i2 = this.mPreferences.getInt(str3, 0);
            while (i <= i2) {
                arrayList.add(obtainDexHolder(i, file, file3, file4, file5));
                i++;
            }
        }
        return arrayList;
    }

    private byte[] obtainEntryBytesInApk(ZipFile zipFile, ZipEntry zipEntry) {
        return Utility.obtainEntryBytesInZip(zipFile, zipEntry);
    }

    private File obtainEntryFileInApk(ZipFile zipFile, ZipEntry zipEntry, File file) {
        return Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
    }

    /* access modifiers changed from: 0000 */
    public void doInstallation(final Context context, File file, Result result) {
        File filesDir = context.getFilesDir();
        if (!filesDir.exists()) {
            Utility.mkdirChecked(filesDir);
        }
        Utility.clearDirFiles(new File(filesDir.getParent(), "code_cache/secondary-dexes"));
        File ensureDirCreated = Utility.ensureDirCreated(filesDir, "boost_multidex");
        File ensureDirCreated2 = Utility.ensureDirCreated(ensureDirCreated, "dex_cache");
        File ensureDirCreated3 = Utility.ensureDirCreated(ensureDirCreated, "odex_cache");
        File ensureDirCreated4 = Utility.ensureDirCreated(ensureDirCreated, "zip_cache");
        result.setDirs(filesDir, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4);
        Locker locker = new Locker(new File(ensureDirCreated, "boost_multidex.prepare.lock"));
        locker.lock();
        Locker locker2 = new Locker(new File(ensureDirCreated, "boost_multidex.install.lock"));
        locker2.lock();
        locker.close();
        try {
            this.mPreferences = C7285c.m22838a(context, "boost_multidex.records", 0);
            result.freeSpaceBefore = Environment.getDataDirectory().getFreeSpace();
            List obtainDexObjectList = obtainDexObjectList(file, ensureDirCreated, ensureDirCreated2, ensureDirCreated3, ensureDirCreated4, result);
            installSecondaryDexes(context.getClassLoader(), obtainDexObjectList);
            locker2.close();
            long freeSpace = Environment.getDataDirectory().getFreeSpace();
            result.freeSpaceAfter = freeSpace;
            if (freeSpace < 20000000) {
                Monitor monitor = Monitor.get();
                StringBuilder sb = new StringBuilder("Free space is too small: ");
                sb.append(freeSpace);
                sb.append(", compare to 20000000");
                monitor.logWarning(sb.toString());
                return;
            }
            Iterator it = obtainDexObjectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DexHolder dexHolder = (DexHolder) it.next();
                if (!(dexHolder instanceof ZipOpt) && !(dexHolder instanceof DexOpt)) {
                    Monitor.get().doAfterInstall(new Runnable() {
                        public void run() {
                            OptimizeService.startOptimizeService(context);
                        }
                    });
                    break;
                }
            }
        } catch (Throwable th) {
            locker2.close();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public void doInstallationInOptProcess(Context context, File file) {
        if (!BoostNative.isSupportFastLoad()) {
            Monitor.get().logError("Fast load is not supported!");
            return;
        }
        int i = 2;
        ZipFile zipFile = new ZipFile(file);
        ArrayList arrayList = new ArrayList();
        while (true) {
            StringBuilder sb = new StringBuilder("classes");
            sb.append(i);
            sb.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb.toString());
            if (entry == null) {
                break;
            }
            arrayList.add(new ApkBuffer(i, obtainEntryBytesInApk(zipFile, entry), null, null));
            i++;
        }
        DexLoader.create(VERSION.SDK_INT).install(context.getClassLoader(), arrayList);
        zipFile.close();
        try {
            BoostNative.recoverAction();
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
