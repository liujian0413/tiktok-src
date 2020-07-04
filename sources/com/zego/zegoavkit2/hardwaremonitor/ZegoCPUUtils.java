package com.zego.zegoavkit2.hardwaremonitor;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;

public class ZegoCPUUtils {
    private static double mLastAllCpu;
    private static double mLastAllCpuForSystem;
    private static double mLastIdleCpu;
    private static double mLastProcessCpu;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: FileNotFoundException | IOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:7:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double[] getCpuAction() {
        /*
            java.lang.String r0 = "/proc/stat"
            r1 = 9
            double[] r2 = new double[r1]
            r2 = {0, 0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r3.canRead()
            if (r0 != 0) goto L_0x001b
            goto L_0x004c
        L_0x001b:
            r0 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ FileNotFoundException | IOException -> 0x0047 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException | IOException -> 0x0047 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ FileNotFoundException | IOException -> 0x0047 }
            r5 = 8192(0x2000, float:1.14794E-41)
            r3.<init>(r4, r5)     // Catch:{ FileNotFoundException | IOException -> 0x0047 }
            java.lang.String r0 = r3.readLine()     // Catch:{ FileNotFoundException | IOException -> 0x0048 }
            if (r0 == 0) goto L_0x0048
            java.lang.String r4 = " "
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ FileNotFoundException | IOException -> 0x0048 }
            r4 = 2
        L_0x0035:
            int r5 = r0.length     // Catch:{ FileNotFoundException | IOException -> 0x0048 }
            if (r4 >= r5) goto L_0x0048
            int r5 = r4 + -2
            if (r5 >= r1) goto L_0x0048
            r6 = r0[r4]     // Catch:{ NullPointerException | NumberFormatException -> 0x0044, FileNotFoundException | IOException -> 0x0048 }
            double r6 = java.lang.Double.parseDouble(r6)     // Catch:{ NullPointerException | NumberFormatException -> 0x0044, FileNotFoundException | IOException -> 0x0048 }
            r2[r5] = r6     // Catch:{ NullPointerException | NumberFormatException -> 0x0044, FileNotFoundException | IOException -> 0x0048 }
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0035
        L_0x0047:
            r3 = r0
        L_0x0048:
            closeReader(r3)
            return r2
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoavkit2.hardwaremonitor.ZegoCPUUtils.getCpuAction():double[]");
    }

    public static double getSystemCPUUsage() {
        double d;
        double d2;
        double[] cpuAction = getCpuAction();
        double d3 = 0.0d;
        if (cpuAction != null) {
            d2 = 0.0d;
            for (double d4 : cpuAction) {
                d2 += d4;
            }
            if (cpuAction.length > 3) {
                d = cpuAction[3];
            } else {
                d = 0.0d;
            }
        } else {
            d2 = 0.0d;
            d = 0.0d;
        }
        if (mLastAllCpuForSystem == 0.0d && mLastIdleCpu == 0.0d) {
            mLastAllCpuForSystem = d2;
            mLastIdleCpu = d;
            return 0.0d;
        }
        double d5 = d2 - mLastAllCpuForSystem;
        double d6 = d - mLastIdleCpu;
        if (d5 > 0.0d && d6 > 0.0d) {
            double div = div((d5 - d6) * 100.0d, d5, 2);
            if (div >= 0.0d) {
                d3 = div;
            }
        }
        mLastAllCpuForSystem = d2;
        mLastIdleCpu = d;
        return d3;
    }

    private static void closeReader(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static double getProcessCPUUsage(int i) {
        double d;
        double d2;
        double d3 = 0.0d;
        if (i <= 0) {
            return 0.0d;
        }
        double[] processCpuAction = getProcessCpuAction(i);
        if (processCpuAction != null) {
            d = processCpuAction[1] + processCpuAction[2];
        } else {
            d = 0.0d;
        }
        double[] cpuAction = getCpuAction();
        if (cpuAction != null) {
            d2 = 0.0d;
            for (double d4 : cpuAction) {
                d2 += d4;
            }
        } else {
            d2 = 0.0d;
        }
        if (mLastAllCpu == 0.0d && mLastProcessCpu == 0.0d) {
            mLastAllCpu = d2;
            mLastProcessCpu = d;
            return 0.0d;
        }
        if (d2 - mLastAllCpu > 0.0d) {
            double div = div((d - mLastProcessCpu) * 100.0d, d2 - mLastAllCpu, 2);
            if (div >= 0.0d) {
                d3 = div;
            }
        }
        mLastAllCpu = d2;
        mLastProcessCpu = d;
        return d3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:10|11|(3:13|14|15)|16|17|18|(2:20|21)|22|23|24|(2:26|27)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005f */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[SYNTHETIC, Splitter:B:20:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC, Splitter:B:26:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:26:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double[] getProcessCpuAction(int r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/proc/"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "/stat"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 3
            double[] r0 = new double[r0]
            r0 = {0, 0, 0} // fill-array
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L_0x0072
            boolean r7 = r1.canRead()
            if (r7 != 0) goto L_0x002b
            goto L_0x0072
        L_0x002b:
            r7 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x006d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x006d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006d }
            r3 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x006d }
            java.lang.String r7 = r1.readLine()     // Catch:{  }
            if (r7 == 0) goto L_0x006e
            java.lang.String r2 = " "
            java.lang.String[] r7 = r7.split(r2)     // Catch:{  }
            int r2 = r7.length     // Catch:{  }
            r3 = 1
            r4 = 2
            if (r2 <= r4) goto L_0x0052
            r2 = 0
            r5 = r7[r3]     // Catch:{ NullPointerException | NumberFormatException -> 0x0052 }
            double r5 = java.lang.Double.parseDouble(r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x0052 }
            r0[r2] = r5     // Catch:{ NullPointerException | NumberFormatException -> 0x0052 }
        L_0x0052:
            int r2 = r7.length     // Catch:{  }
            r5 = 13
            if (r2 <= r5) goto L_0x005f
            r2 = r7[r5]     // Catch:{ NullPointerException | NumberFormatException -> 0x005f }
            double r5 = java.lang.Double.parseDouble(r2)     // Catch:{ NullPointerException | NumberFormatException -> 0x005f }
            r0[r3] = r5     // Catch:{ NullPointerException | NumberFormatException -> 0x005f }
        L_0x005f:
            int r2 = r7.length     // Catch:{  }
            r3 = 14
            if (r2 <= r3) goto L_0x006e
            r7 = r7[r3]     // Catch:{ IOException -> 0x006e, IOException -> 0x006e }
            double r2 = java.lang.Double.parseDouble(r7)     // Catch:{ IOException -> 0x006e, IOException -> 0x006e }
            r0[r4] = r2     // Catch:{ IOException -> 0x006e, IOException -> 0x006e }
            goto L_0x006e
        L_0x006d:
            r1 = r7
        L_0x006e:
            closeReader(r1)
            return r0
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.zegoavkit2.hardwaremonitor.ZegoCPUUtils.getProcessCpuAction(int):double[]");
    }

    public static double div(double d, double d2, int i) {
        try {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 1).doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }
}
