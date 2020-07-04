package com.p280ss.avframework.utils;

/* renamed from: com.ss.avframework.utils.EarlyAVLog */
public class EarlyAVLog {
    private static IEarlyLogPrint sEarlyLogPrint;

    /* renamed from: com.ss.avframework.utils.EarlyAVLog$IEarlyLogPrint */
    public interface IEarlyLogPrint {
        void print(int i, String str, String str2, Throwable th);
    }

    public static IEarlyLogPrint getEarlyLogPrint() {
        return sEarlyLogPrint;
    }

    public static void setEarlyLogPrint(IEarlyLogPrint iEarlyLogPrint) {
        sEarlyLogPrint = iEarlyLogPrint;
    }

    public static void println(int i, String str, String str2, Throwable th) {
        IEarlyLogPrint iEarlyLogPrint = sEarlyLogPrint;
        if (iEarlyLogPrint != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-EarlyAVLog");
            iEarlyLogPrint.print(i, sb.toString(), str2, th);
        }
    }
}
