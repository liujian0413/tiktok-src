package com.p280ss.ttm.player;

import android.content.Context;
import android.os.Environment;
import android.util.SparseArray;
import java.io.File;

/* renamed from: com.ss.ttm.player.TTPlayerConfiger */
public final class TTPlayerConfiger {
    private static String APP_PATH = null;
    private static String CRASH_FILE_NAME = "ttplayer_crash.log";
    private static String CRASH_FILE_PATH = null;
    private static boolean IS_PRINT_INFO = false;
    private static final SparseArray<Value> KEYS = new SparseArray<>();
    private static String LIBRARY_DIR = null;
    private static String PLAYER_LIBRARY_NAME = "libttmplayer.so";
    private static String TTPLAYER_FILE_CACHE_DIR = null;
    private static final String VERSION_NAME = "999.999.999.9";

    /* renamed from: com.ss.ttm.player.TTPlayerConfiger$IntValue */
    static final class IntValue extends Value {
        private int mValue;

        public final int getValue() {
            return this.mValue;
        }

        public final void setValue(int i) {
            this.mValue = i;
        }

        public IntValue(int i, int i2) {
            super(i);
            this.mValue = i2;
        }
    }

    /* renamed from: com.ss.ttm.player.TTPlayerConfiger$LongValue */
    static class LongValue extends Value {
        private long mValue;

        public long getValue() {
            return this.mValue;
        }

        public void setValue(long j) {
            this.mValue = j;
        }

        public LongValue(int i, long j) {
            super(i);
            this.mValue = j;
        }
    }

    /* renamed from: com.ss.ttm.player.TTPlayerConfiger$StringValue */
    static class StringValue extends Value {
        private String mValue;

        public String getValue() {
            return this.mValue;
        }

        public void setValue(String str) {
            this.mValue = str;
        }

        public StringValue(int i, String str) {
            super(i);
            this.mValue = str;
        }
    }

    /* renamed from: com.ss.ttm.player.TTPlayerConfiger$Value */
    static class Value {
        private int mKey = -1;

        public int getKey() {
            return this.mKey;
        }

        protected Value(int i) {
            this.mKey = i;
        }
    }

    public static final int getVersion() {
        return 1;
    }

    public static boolean isPrintInfo() {
        return IS_PRINT_INFO;
    }

    public static String getPlayerLibraryPath() {
        return getPlayerLibraryPath(null);
    }

    public static final String getExternalStorageDirectoryCrashFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separatorChar);
        sb.append(CRASH_FILE_NAME);
        return sb.toString();
    }

    public static final boolean isOnTTPlayer() {
        if (getValue(6, 0) == 1) {
            return true;
        }
        if (getValue(1, 0) == 0) {
            return false;
        }
        if (getValue(11, 0) == 1) {
            return true;
        }
        if (getValue(7, 0) == 1 || getValue(8, 0) == 1 || getValue(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    static {
        setValue(13, 1);
        setValue(14, VERSION_NAME);
        setValue(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        setValue(0, false);
        setValue(1, true);
        setValue(2, true);
        setValue(3, false);
        setValue(4, false);
        setValue(5, false);
        setValue(6, false);
        setValue(7, false);
        setValue(8, false);
        setValue(10, 0);
        setValue(11, false);
        setValue(18, 2);
        checkPlayerModel();
    }

    public static void checkDebugTTPlayerLib() {
        StringBuilder sb = new StringBuilder();
        sb.append(APP_PATH);
        sb.append(File.separatorChar);
        sb.append(PLAYER_LIBRARY_NAME);
        String sb2 = sb.toString();
        isPrintInfo();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Environment.getExternalStorageDirectory());
        sb3.append("/ttplayer/");
        sb3.append(PLAYER_LIBRARY_NAME);
        File file = new File(sb3.toString());
        if (file.exists()) {
            moveFile(sb2, file.getPath(), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c3, code lost:
        if (r4 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c9, code lost:
        if (r4 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00db, code lost:
        if (r4 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00de, code lost:
        if (r4 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b8 A[SYNTHETIC, Splitter:B:51:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0 A[SYNTHETIC, Splitter:B:70:0x00d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void checkPlayerModel() {
        /*
            r0 = 0
            int r1 = getValue(r0, r0)
            if (r1 != 0) goto L_0x00e1
            r1 = 1
            setValue(r0, r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            r4.<init>()     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            char r5 = java.io.File.separatorChar     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            r4.append(r5)     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.lang.String r5 = "ttplayer.debug"
            r4.append(r5)     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            if (r4 != 0) goto L_0x0036
            return
        L_0x0036:
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x00cd, all -> 0x00b3 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00ce, all -> 0x00b0 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00ce, all -> 0x00b0 }
            r2 = 0
        L_0x0041:
            java.lang.String r5 = r3.readLine()     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r5 == 0) goto L_0x009c
            java.lang.String r6 = "\r\n"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            java.lang.String r6 = ":on"
            boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r6 == 0) goto L_0x0059
            r6 = 1
            goto L_0x0060
        L_0x0059:
            java.lang.String r6 = ":off"
            boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            r6 = 0
        L_0x0060:
            java.lang.String r7 = "debug_player:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r7 == 0) goto L_0x006a
            r2 = r6
            goto L_0x0041
        L_0x006a:
            java.lang.String r7 = "ipc_player:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r7 == 0) goto L_0x0077
            r5 = 2
            setValue(r5, r6)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            goto L_0x0041
        L_0x0077:
            java.lang.String r7 = "print_info:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r7 == 0) goto L_0x0082
            IS_PRINT_INFO = r6     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            goto L_0x0041
        L_0x0082:
            java.lang.String r7 = "check_lib:"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r7 == 0) goto L_0x008f
            r5 = 3
            setValue(r5, r6)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            goto L_0x0041
        L_0x008f:
            java.lang.String r7 = "throw_crash:"
            boolean r5 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            if (r5 == 0) goto L_0x0041
            r5 = 4
            setValue(r5, r6)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            goto L_0x0041
        L_0x009c:
            r0 = 6
            setValue(r0, r2)     // Catch:{ Throwable -> 0x00ae, all -> 0x00ac }
            r3.close()     // Catch:{ Exception -> 0x00a3, all -> 0x00a7 }
        L_0x00a3:
            r4.close()     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e1
        L_0x00a7:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x00ab }
        L_0x00ab:
            throw r0
        L_0x00ac:
            r0 = move-exception
            goto L_0x00b6
        L_0x00ae:
            r2 = r3
            goto L_0x00ce
        L_0x00b0:
            r0 = move-exception
            r3 = r2
            goto L_0x00b6
        L_0x00b3:
            r0 = move-exception
            r3 = r2
            r4 = r3
        L_0x00b6:
            if (r3 == 0) goto L_0x00c9
            r3.close()     // Catch:{ Exception -> 0x00c3, all -> 0x00bc }
            goto L_0x00c9
        L_0x00bc:
            r0 = move-exception
            if (r4 == 0) goto L_0x00c2
            r4.close()     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            throw r0
        L_0x00c3:
            if (r4 == 0) goto L_0x00cc
        L_0x00c5:
            r4.close()     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cc
        L_0x00c9:
            if (r4 == 0) goto L_0x00cc
            goto L_0x00c5
        L_0x00cc:
            throw r0
        L_0x00cd:
            r4 = r2
        L_0x00ce:
            if (r2 == 0) goto L_0x00de
            r2.close()     // Catch:{ Exception -> 0x00db, all -> 0x00d4 }
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
            if (r4 == 0) goto L_0x00da
            r4.close()     // Catch:{ Exception -> 0x00da }
        L_0x00da:
            throw r0
        L_0x00db:
            if (r4 == 0) goto L_0x00e1
            goto L_0x00a3
        L_0x00de:
            if (r4 == 0) goto L_0x00e1
            goto L_0x00a3
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTPlayerConfiger.checkPlayerModel():void");
    }

    public static final void setCrashFileName(String str) {
        CRASH_FILE_NAME = str;
    }

    public static final void setCrashFilePath(String str) {
        CRASH_FILE_PATH = str;
    }

    public static final void setLibraryName(String str) {
        PLAYER_LIBRARY_NAME = str;
    }

    public static final void setLibrarysDir(String str) {
        LIBRARY_DIR = str;
    }

    public static final String getAppFilesPath(Context context) {
        if (APP_PATH != null) {
            return APP_PATH;
        }
        if (context == null) {
            return null;
        }
        try {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return APP_PATH;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getAppFileCachePath(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (TTPLAYER_FILE_CACHE_DIR != null) {
            return TTPLAYER_FILE_CACHE_DIR;
        }
        if (APP_PATH != null) {
            return APP_PATH;
        }
        if (context == null) {
            return null;
        }
        try {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return APP_PATH;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getAppCrashFilePath(Context context) {
        if (CRASH_FILE_PATH != null || new File(getAppCrashFileStorePath(context)).exists()) {
            isPrintInfo();
            return CRASH_FILE_PATH;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(APP_PATH);
        sb.append(File.separatorChar);
        sb.append("plugins");
        sb.append(File.separatorChar);
        sb.append("com.ss.ttm");
        sb.append(File.separatorChar);
        sb.append("data");
        sb.append(File.separatorChar);
        sb.append("files");
        sb.append(File.separatorChar);
        sb.append(CRASH_FILE_NAME);
        return sb.toString();
    }

    public static final String getAppCrashFilePath2(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            isPrintInfo();
            if (APP_PATH == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(APP_PATH);
            sb.append(File.separatorChar);
            sb.append(CRASH_FILE_NAME);
            return sb.toString();
        }
        isPrintInfo();
        return CRASH_FILE_PATH;
    }

    public static final String getAppCrashFileStorePath(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            isPrintInfo();
            if (APP_PATH == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(APP_PATH);
            sb.append(File.separatorChar);
            sb.append(CRASH_FILE_NAME);
            return sb.toString();
        }
        isPrintInfo();
        return CRASH_FILE_PATH;
    }

    public static String getPlayerLibraryPath(Context context) {
        if (APP_PATH == null || context != null) {
            APP_PATH = getAppFilesPath(context);
        }
        if (APP_PATH == null && LIBRARY_DIR == null) {
            return null;
        }
        if (LIBRARY_DIR == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(APP_PATH);
            sb.append(File.separatorChar);
            sb.append(PLAYER_LIBRARY_NAME);
            return sb.toString();
        } else if (LIBRARY_DIR.endsWith(String.valueOf(File.separatorChar))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(LIBRARY_DIR);
            sb2.append(PLAYER_LIBRARY_NAME);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(LIBRARY_DIR);
            sb3.append(File.separatorChar);
            sb3.append(PLAYER_LIBRARY_NAME);
            return sb3.toString();
        }
    }

    public static String getPlayerLibrarysDir(Context context) {
        if (LIBRARY_DIR == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getAppFilesPath(context));
            sb.append(File.separatorChar);
            String sb2 = sb.toString();
            LIBRARY_DIR = sb2;
            return sb2;
        } else if (LIBRARY_DIR.endsWith(String.valueOf(File.separatorChar))) {
            return LIBRARY_DIR;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(LIBRARY_DIR);
            sb3.append(File.separatorChar);
            return sb3.toString();
        }
    }

    public static final String getPlugerCrashFilePath(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(APP_PATH);
        sb.append(File.separatorChar);
        sb.append("plugins");
        sb.append(File.separatorChar);
        sb.append("com.ss.ttm");
        sb.append(File.separatorChar);
        sb.append("data");
        sb.append(File.separatorChar);
        sb.append("files");
        sb.append(File.separatorChar);
        sb.append(CRASH_FILE_NAME);
        return sb.toString();
    }

    public static final void setValue(int i, boolean z) {
        setValue(i, z ? 1 : 0);
    }

    public static final int getValue(int i, int i2) {
        Object obj = KEYS.get(i);
        if (obj == null || !(obj instanceof IntValue)) {
            return i2;
        }
        return ((IntValue) obj).getValue();
    }

    public static final long getValue(int i, long j) {
        Object obj = KEYS.get(i);
        if (obj == null || !(obj instanceof LongValue)) {
            return j;
        }
        return ((LongValue) obj).getValue();
    }

    public static final void setValue(int i, int i2) {
        Object obj = KEYS.get(i);
        if (obj != null) {
            if (!(obj instanceof IntValue)) {
                KEYS.remove(i);
            } else if (i != 2 || !getValue(6, false)) {
                ((IntValue) obj).setValue(i2);
                return;
            } else {
                return;
            }
        }
        KEYS.append(i, new IntValue(i, i2));
    }

    public static final String getValue(int i, String str) {
        if (i == 17) {
            return CRASH_FILE_NAME;
        }
        Value value = (Value) KEYS.get(i);
        if (value == null || !(value instanceof StringValue)) {
            return str;
        }
        return ((StringValue) value).getValue();
    }

    public static final void setValue(int i, long j) {
        Object obj = KEYS.get(i);
        if (obj != null) {
            if (obj instanceof LongValue) {
                ((LongValue) obj).setValue(j);
                return;
            }
            KEYS.remove(i);
        }
        KEYS.append(i, new LongValue(i, j));
    }

    public static final boolean getValue(int i, boolean z) {
        Object obj = KEYS.get(i);
        if (obj == null || !(obj instanceof IntValue)) {
            return z;
        }
        if (((IntValue) obj).getValue() == 1) {
            return true;
        }
        return false;
    }

    public static final void setValue(int i, String str) {
        Object obj = KEYS.get(i);
        if (obj != null) {
            if (obj instanceof StringValue) {
                ((StringValue) obj).setValue(str);
                return;
            }
            KEYS.remove(i);
        }
        KEYS.append(i, new StringValue(i, str));
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC, Splitter:B:45:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[Catch:{ IOException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0087 A[SYNTHETIC, Splitter:B:55:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008c A[Catch:{ IOException -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0093 A[SYNTHETIC, Splitter:B:65:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098 A[Catch:{ IOException -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            r1 = 0
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            boolean r5 = r0.isFile()
            if (r5 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L_0x002a
            if (r6 == 0) goto L_0x003f
            java.io.File r6 = new java.io.File
            r6.<init>(r4)
            r6.delete()
            goto L_0x003f
        L_0x002a:
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x003f
            java.io.File r4 = r5.getParentFile()
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L_0x003f
            return r1
        L_0x003f:
            r4 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0084, all -> 0x0075 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x0085, all -> 0x0072 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x004e:
            int r5 = r6.read(r4)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r3 = -1
            if (r5 == r3) goto L_0x0059
            r2.write(r4, r1, r5)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            goto L_0x004e
        L_0x0059:
            r2.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            r6.close()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
            if (r7 == 0) goto L_0x0064
            r0.delete()     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006c }
        L_0x0064:
            r2.close()     // Catch:{ IOException -> 0x006a }
            r6.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r4 = 1
            return r4
        L_0x006c:
            r4 = move-exception
            goto L_0x0079
        L_0x006e:
            r4 = r2
            goto L_0x0085
        L_0x0070:
            r4 = r2
            goto L_0x0091
        L_0x0072:
            r5 = move-exception
            r2 = r4
            goto L_0x0078
        L_0x0075:
            r5 = move-exception
            r6 = r4
            r2 = r6
        L_0x0078:
            r4 = r5
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ IOException -> 0x0083 }
        L_0x007e:
            if (r6 == 0) goto L_0x0083
            r6.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r4
        L_0x0084:
            r6 = r4
        L_0x0085:
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ IOException -> 0x008f }
        L_0x008a:
            if (r6 == 0) goto L_0x008f
            r6.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r1
        L_0x0090:
            r6 = r4
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            r4.close()     // Catch:{ IOException -> 0x009b }
        L_0x0096:
            if (r6 == 0) goto L_0x009b
            r6.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTPlayerConfiger.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
