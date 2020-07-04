package com.bytedance.boost_multidex;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

abstract class DexHolder {
    File mFile;

    static class ApkBuffer extends DexHolder {
        private byte[] mBytes;
        private int mIndex;
        private File mOptFile;

        ApkBuffer(int i, byte[] bArr, File file, File file2) {
            this.mIndex = i;
            this.mBytes = bArr;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return null;
        }

        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(null, this.mBytes);
            } catch (Exception e) {
                Monitor monitor = Monitor.get();
                StringBuilder sb = new StringBuilder("Fail to create DexFile: ");
                sb.append(toString());
                monitor.logError(sb.toString(), e);
                Result.get().unFatalThrowable.add(e);
                return null;
            }
        }

        public Object toDexListElement(ElementConstructor elementConstructor) {
            Object dexFile = toDexFile();
            if (dexFile == null) {
                return null;
            }
            return elementConstructor.newInstance(null, dexFile);
        }

        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            if (Utility.storeBytesToFile(this.mBytes, this.mFile)) {
                try {
                    return DexHolder.obtainValidDexBuffer(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
                } catch (IOException e) {
                    Monitor.get().logError("fail to get dex buffer", e);
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("], bytes len: ");
            sb.append(this.mBytes == null ? null : Integer.valueOf(this.mBytes.length));
            return sb.toString();
        }
    }

    static class DexBuffer extends DexHolder {
        private int mIndex;
        private File mOptFile;

        DexBuffer(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return new StoreInfo(1, this.mIndex, this.mFile);
        }

        public Object toDexFile() {
            try {
                return BoostNative.loadDirectDex(this.mFile.getPath(), null);
            } catch (Exception e) {
                Monitor monitor = Monitor.get();
                StringBuilder sb = new StringBuilder("Fail to create DexFile: ");
                sb.append(toString());
                monitor.logError(sb.toString(), e);
                Result.get().unFatalThrowable.add(e);
                return null;
            }
        }

        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            try {
                if (!BoostNative.isSupportFastLoad() || !BoostNative.makeOptDexFile(this.mFile.getPath(), this.mOptFile.getPath())) {
                    Monitor.get().logWarning("Opt dex in origin way");
                    DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0).close();
                }
                return obtainValidDexOpt(sharedPreferences, this.mIndex, this.mFile, this.mOptFile);
            } catch (IOException e) {
                Monitor.get().logError("Fail to opt dex finally", e);
                return null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("]");
            return sb.toString();
        }
    }

    static class DexOpt extends DexHolder {
        private boolean mForceOpt;
        private int mIndex;
        private File mOptFile;

        DexOpt(int i, File file, File file2, boolean z) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
            this.mForceOpt = z;
        }

        public StoreInfo getInfo() {
            return new StoreInfo(2, this.mIndex, this.mOptFile);
        }

        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e) {
                Monitor.get().logError("Fail to load dex file first time", e);
                try {
                    return this.mForceOpt ? DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0) : BoostNative.loadDirectDex(this.mFile.getPath(), null);
                } catch (IOException e2) {
                    Monitor.get().logError("Fail to load dex file", e2);
                    throw new RuntimeException(e2);
                }
            }
        }

        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("], force: ");
            sb.append(this.mForceOpt);
            return sb.toString();
        }
    }

    class StoreInfo {
        File file;
        int index;
        int type;

        StoreInfo(int i, int i2, File file2) {
            this.type = i;
            this.index = i2;
            this.file = file2;
        }
    }

    static class ZipOpt extends DexHolder {
        private int mIndex;
        private File mOptFile;

        ZipOpt(int i, File file, File file2) {
            this.mIndex = i;
            this.mFile = file;
            this.mOptFile = file2;
        }

        public StoreInfo getInfo() {
            return null;
        }

        public Object toDexFile() {
            try {
                return DexFile.loadDex(this.mFile.getPath(), this.mOptFile.getPath(), 0);
            } catch (IOException e) {
                Monitor.get().logError("Fail to load dex file");
                throw new RuntimeException(e);
            }
        }

        public DexHolder toFasterHolder(SharedPreferences sharedPreferences) {
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(", index: ");
            sb.append(this.mIndex);
            sb.append(", [file: ");
            sb.append(this.mFile.getPath());
            sb.append(", size: ");
            sb.append(this.mFile.length());
            sb.append("], [opt file: ");
            sb.append(this.mOptFile);
            sb.append(", size: ");
            sb.append(this.mOptFile.length());
            sb.append("]");
            return sb.toString();
        }
    }

    DexHolder() {
    }

    static DexHolder obtainValidDexBuffer(SharedPreferences sharedPreferences, int i, File file, File file2) {
        Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 1);
        putDexFileInfo(edit, i, file);
        edit.commit();
        return new DexBuffer(i, file, file2);
    }

    static DexHolder obtainValidDexOpt(SharedPreferences sharedPreferences, int i, File file, File file2) {
        Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 2);
        putDexOptInfo(edit, i, file2);
        edit.commit();
        return new DexOpt(i, file, file2, false);
    }

    static DexHolder obtainValidForceDexOpt(SharedPreferences sharedPreferences, int i, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        File obtainEntryFileInZip = Utility.obtainEntryFileInZip(zipFile, zipEntry, file);
        Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 2);
        putDexFileInfo(edit, i, obtainEntryFileInZip);
        edit.commit();
        return new DexOpt(i, obtainEntryFileInZip, file2, true);
    }

    static ZipOpt obtainValidZipDex(SharedPreferences sharedPreferences, int i, File file, File file2, ZipFile zipFile, ZipEntry zipEntry) {
        Utility.obtainZipForEntryFileInZip(zipFile, zipEntry, file);
        Editor edit = sharedPreferences.edit();
        putTypeInfo(edit, i, 3);
        putZipOptInfo(edit, i, file);
        edit.commit();
        return new ZipOpt(i, file, file2);
    }

    private static void putDexFileInfo(Editor editor, int i, File file) {
        String str = "dex.checksum.";
        long doFileCheckSum = Utility.doFileCheckSum(file);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        editor.putLong(sb.toString(), doFileCheckSum);
        String str2 = "dex.time.";
        long lastModified = file.lastModified();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        editor.putLong(sb2.toString(), lastModified);
        Monitor monitor = Monitor.get();
        StringBuilder sb3 = new StringBuilder("Put f key ");
        sb3.append(str);
        sb3.append(str2);
        sb3.append(i);
        sb3.append(" checksum=");
        sb3.append(doFileCheckSum);
        sb3.append(", time=");
        sb3.append(lastModified);
        monitor.logInfo(sb3.toString());
    }

    private static void putDexOptInfo(Editor editor, int i, File file) {
        String str = "odex.checksum.";
        long length = file.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        editor.putLong(sb.toString(), length);
        String str2 = "odex.time.";
        long lastModified = file.lastModified();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        editor.putLong(sb2.toString(), lastModified);
        Monitor monitor = Monitor.get();
        StringBuilder sb3 = new StringBuilder("Put o key ");
        sb3.append(str);
        sb3.append(str2);
        sb3.append(i);
        sb3.append(" checksum=");
        sb3.append(length);
        sb3.append(", time=");
        sb3.append(lastModified);
        monitor.logInfo(sb3.toString());
    }

    private static void putTypeInfo(Editor editor, int i, int i2) {
        StringBuilder sb = new StringBuilder("dex.obj.type");
        sb.append(i);
        editor.putInt(sb.toString(), i2);
    }

    private static void putZipOptInfo(Editor editor, int i, File file) {
        String str = "dex.checksum.";
        long doZipCheckSum = Utility.doZipCheckSum(file);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        editor.putLong(sb.toString(), doZipCheckSum);
        String str2 = "dex.time.";
        long lastModified = file.lastModified();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(i);
        editor.putLong(sb2.toString(), lastModified);
        Monitor monitor = Monitor.get();
        StringBuilder sb3 = new StringBuilder("Put z key ");
        sb3.append(str);
        sb3.append(str2);
        sb3.append(i);
        sb3.append(" checksum=");
        sb3.append(doZipCheckSum);
        sb3.append(", time=");
        sb3.append(lastModified);
        monitor.logInfo(sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    public abstract StoreInfo getInfo();

    /* access modifiers changed from: 0000 */
    public abstract Object toDexFile();

    /* access modifiers changed from: protected */
    public Object toDexListElement(ElementConstructor elementConstructor) {
        Object dexFile = toDexFile();
        if (dexFile == null) {
            return null;
        }
        return elementConstructor.newInstance(this.mFile, dexFile);
    }

    /* access modifiers changed from: 0000 */
    public abstract DexHolder toFasterHolder(SharedPreferences sharedPreferences);
}
