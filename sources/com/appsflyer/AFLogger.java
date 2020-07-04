package com.appsflyer;

import com.C1642a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {

    /* renamed from: ˏ */
    private static long f6685 = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ˊ */
        private int f6687;

        public final int getLevel() {
            return this.f6687;
        }

        private LogLevel(int i) {
            this.f6687 = i;
        }
    }

    public static void resetDeltaTime() {
        f6685 = System.currentTimeMillis();
    }

    public static void afWarnLog(String str) {
        m8648(str);
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    /* renamed from: ˏ */
    static void m8650(String str) {
        AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
        C1899s.m8812().mo7509("F", str);
    }

    public static void afDebugLog(String str) {
        LogLevel.DEBUG.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C1899s.m8812().mo7509("D", m8647(str, true));
    }

    public static void afRDLog(String str) {
        LogLevel.VERBOSE.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C1899s.m8812().mo7509("V", m8647(str, true));
    }

    /* renamed from: ˎ */
    static void m8648(String str) {
        LogLevel.WARNING.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C1899s.m8812().mo7509("W", m8647(str, true));
    }

    /* renamed from: ˋ */
    private static String m8646(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        return C1642a.m8035a(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds)))});
    }

    public static void afErrorLog(String str, Throwable th) {
        m8649(str, th, false);
    }

    public static void afInfoLog(String str, boolean z) {
        LogLevel.INFO.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        if (z) {
            C1899s.m8812().mo7509("I", m8647(str, true));
        }
    }

    /* renamed from: ˎ */
    private static String m8647(String str, boolean z) {
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(m8646(System.currentTimeMillis() - f6685));
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ˎ */
    private static void m8649(String str, Throwable th, boolean z) {
        LogLevel.ERROR.getLevel();
        AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
        C1899s.m8812().mo7514(th);
    }
}
