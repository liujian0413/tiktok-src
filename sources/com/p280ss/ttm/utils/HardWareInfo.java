package com.p280ss.ttm.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.StatFs;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* renamed from: com.ss.ttm.utils.HardWareInfo */
public class HardWareInfo {
    private static int[] mArmArchitecture = new int[3];
    private static int mCpuType;
    private BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            intent.getIntExtra("level", 0);
        }
    };

    public static int getCpuFamily() {
        if (mCpuType == 0) {
            getCpuInfo();
            mCpuType = mArmArchitecture[0];
        }
        return mCpuType;
    }

    public static long[] getSDCardSize() {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = (long) statFs.getBlockSize();
            long availableBlocks = (long) statFs.getAvailableBlocks();
            jArr[0] = ((long) statFs.getBlockCount()) * blockSize;
            jArr[1] = blockSize * availableBlocks;
        }
        return jArr;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getProcessCpuInfo() {
        /*
            r0 = 0
            r2 = 0
            int r3 = android.os.Process.myPid()     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r7.append(r3)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.String r3 = "/stat"
            r7.append(r3)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x006d, all -> 0x0068 }
            java.lang.String r2 = r4.readLine()     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
            r4.close()     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ IOException -> 0x0066, all -> 0x0063 }
            r4.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            r3 = 13
            r3 = r2[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            r5 = 14
            r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            r7 = 0
            long r3 = r3 + r5
            r5 = 15
            r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            r7 = 0
            long r3 = r3 + r5
            r5 = 16
            r2 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
            r0 = 0
            long r3 = r3 + r5
            return r3
        L_0x0062:
            return r0
        L_0x0063:
            r0 = move-exception
            r2 = r4
            goto L_0x0069
        L_0x0066:
            r2 = r4
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
        L_0x0069:
            r2.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r0
        L_0x006d:
            r2.close()     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.HardWareInfo.getProcessCpuInfo():long");
    }

    public static int[] getCpuArchitecture() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        try {
            fileInputStream = new FileInputStream("/proc/cpuinfo");
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String str = "Processor";
            String str2 = "Features";
            String str3 = "model name";
            String str4 = "cpu family";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.replace("\t", "").split(":");
                if (split.length == 2) {
                    String trim = split[0].trim();
                    String trim2 = split[1].trim();
                    if (trim.compareTo(str) == 0) {
                        String str5 = "";
                        for (int indexOf = trim2.indexOf("ARMv") + 4; indexOf < trim2.length(); indexOf++) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(trim2.charAt(indexOf));
                            String sb2 = sb.toString();
                            if (!sb2.matches("\\d")) {
                                break;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str5);
                            sb3.append(sb2);
                            str5 = sb3.toString();
                        }
                        mArmArchitecture[0] = 1;
                        mArmArchitecture[1] = Integer.parseInt(str5);
                    } else if (trim.compareToIgnoreCase(str2) == 0) {
                        if (trim2.contains("neon")) {
                            mArmArchitecture[2] = 0;
                        }
                    } else if (trim.compareToIgnoreCase(str3) == 0) {
                        if (trim2.contains("Intel")) {
                            mArmArchitecture[0] = 2;
                            mArmArchitecture[2] = 1;
                        }
                    } else if (trim.compareToIgnoreCase(str4) == 0) {
                        mArmArchitecture[1] = Integer.parseInt(trim2);
                    }
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception unused) {
        } catch (Throwable th) {
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            throw th;
        }
        return mArmArchitecture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        mArmArchitecture[0] = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getCpuInfo() {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = "/proc/cpuinfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d6 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00d6 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d6 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r3 = "processor"
            java.lang.String r4 = "features"
            java.lang.String r5 = "model name"
        L_0x0017:
            java.lang.String r6 = r2.readLine()     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00c1
            java.lang.String r7 = "\t"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replaceAll(r7, r8)     // Catch:{ all -> 0x00cb }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00cb }
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{ all -> 0x00cb }
            int r7 = r6.length     // Catch:{ all -> 0x00cb }
            r8 = 2
            if (r7 != r8) goto L_0x0017
            r7 = 0
            r9 = r6[r7]     // Catch:{ all -> 0x00cb }
            java.lang.String r9 = r9.trim()     // Catch:{ all -> 0x00cb }
            r10 = 1
            r6 = r6[r10]     // Catch:{ all -> 0x00cb }
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x0017
            if (r9 == 0) goto L_0x0017
            int r11 = r9.compareTo(r3)     // Catch:{ all -> 0x00cb }
            if (r11 != 0) goto L_0x006e
            java.lang.String r9 = "armv"
            boolean r9 = r6.contains(r9)     // Catch:{ all -> 0x00cb }
            if (r9 != 0) goto L_0x0069
            java.lang.String r9 = "aarch64"
            boolean r9 = r6.contains(r9)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x005c
            goto L_0x0069
        L_0x005c:
            java.lang.String r9 = "intel"
            boolean r6 = r6.contains(r9)     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x0017
            int[] r3 = mArmArchitecture     // Catch:{ all -> 0x00cb }
            r3[r7] = r8     // Catch:{ all -> 0x00cb }
            goto L_0x00c1
        L_0x0069:
            int[] r3 = mArmArchitecture     // Catch:{ all -> 0x00cb }
            r3[r7] = r10     // Catch:{ all -> 0x00cb }
            goto L_0x00c1
        L_0x006e:
            int r11 = r9.compareToIgnoreCase(r4)     // Catch:{ all -> 0x00cb }
            if (r11 != 0) goto L_0x00a2
            java.lang.String r8 = "neon"
            boolean r8 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = "thumb"
            boolean r8 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = "vfpv"
            boolean r8 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = "asimd"
            boolean r8 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r8 != 0) goto L_0x009c
            java.lang.String r8 = "simd"
            boolean r6 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x0017
        L_0x009c:
            int[] r6 = mArmArchitecture     // Catch:{ all -> 0x00cb }
            r6[r7] = r10     // Catch:{ all -> 0x00cb }
            goto L_0x0017
        L_0x00a2:
            int r9 = r9.compareToIgnoreCase(r5)     // Catch:{ all -> 0x00cb }
            if (r9 != 0) goto L_0x0017
            java.lang.String r9 = "intel"
            boolean r9 = r6.contains(r9)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00b5
            int[] r3 = mArmArchitecture     // Catch:{ all -> 0x00cb }
            r3[r7] = r8     // Catch:{ all -> 0x00cb }
            goto L_0x00c1
        L_0x00b5:
            java.lang.String r8 = "arm"
            boolean r6 = r6.contains(r8)     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x0017
            int[] r3 = mArmArchitecture     // Catch:{ all -> 0x00cb }
            r3[r7] = r10     // Catch:{ all -> 0x00cb }
        L_0x00c1:
            r2.close()     // Catch:{ Exception -> 0x00d6 }
            r1.close()     // Catch:{ Exception -> 0x00d6 }
            r0.close()     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00d6
        L_0x00cb:
            r3 = move-exception
            r2.close()     // Catch:{ Exception -> 0x00d6 }
            r1.close()     // Catch:{ Exception -> 0x00d6 }
            r0.close()     // Catch:{ Exception -> 0x00d6 }
            throw r3     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            int[] r0 = mArmArchitecture
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.utils.HardWareInfo.getCpuInfo():int[]");
    }

    public String[] getOtherInfo(Context context) {
        String[] strArr = {TEVideoRecorder.FACE_BEAUTY_NULL, TEVideoRecorder.FACE_BEAUTY_NULL};
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo.getMacAddress() != null) {
            strArr[0] = connectionInfo.getMacAddress();
        } else {
            strArr[0] = "Fail";
        }
        return strArr;
    }
}
