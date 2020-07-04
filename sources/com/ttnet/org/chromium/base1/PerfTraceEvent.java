package com.ttnet.org.chromium.base1;

import android.os.Debug;
import android.os.Debug.MemoryInfo;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PerfTraceEvent {
    private static long sBeginNanoTime = 0;
    private static boolean sEnabled = false;
    private static List<String> sFilter = null;
    private static File sOutputFile = null;
    private static JSONArray sPerfTraceStrings = null;
    private static boolean sTrackMemory = false;
    private static boolean sTrackTiming = true;

    enum EventType {
        START("S"),
        FINISH("F"),
        INSTANT("I");
        
        private final String mTypeStr;

        public final String toString() {
            return this.mTypeStr;
        }

        private EventType(String str) {
            this.mTypeStr = str;
        }
    }

    public static synchronized boolean enabled() {
        boolean z;
        synchronized (PerfTraceEvent.class) {
            z = sEnabled;
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void dumpPerf() {
        /*
            org.json.JSONArray r0 = sPerfTraceStrings
            java.lang.String r0 = r0.toString()
            java.io.File r1 = sOutputFile
            if (r1 != 0) goto L_0x0010
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
        L_0x0010:
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{  }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{  }
            java.io.File r3 = sOutputFile     // Catch:{  }
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            r1.print(r0)     // Catch:{ all -> 0x0024 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0029 }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            throw r0     // Catch:{  }
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.PerfTraceEvent.dumpPerf():void");
    }

    public static String makeMemoryTraceNameFromTimingName(String str) {
        return makeSafeTraceName(str, "_BZR_PSS");
    }

    private static boolean matchesFilter(String str) {
        if (sFilter != null) {
            return sFilter.contains(str);
        }
        return false;
    }

    public static synchronized void setFilter(List<String> list) {
        synchronized (PerfTraceEvent.class) {
            sFilter = new LinkedList(list);
        }
    }

    public static synchronized void setMemoryTrackingEnabled(boolean z) {
        synchronized (PerfTraceEvent.class) {
            sTrackMemory = z;
        }
    }

    public static synchronized void setOutputFile(File file) {
        synchronized (PerfTraceEvent.class) {
            sOutputFile = file;
        }
    }

    public static synchronized void setTimingTrackingEnabled(boolean z) {
        synchronized (PerfTraceEvent.class) {
            sTrackTiming = z;
        }
    }

    public static synchronized void instant(String str) {
        synchronized (PerfTraceEvent.class) {
            long hashCode = (long) str.hashCode();
            TraceEvent.instant(str);
            if (sEnabled && matchesFilter(str)) {
                savePerfString(str, hashCode, EventType.INSTANT, false);
            }
        }
    }

    public static synchronized void begin(String str) {
        synchronized (PerfTraceEvent.class) {
            long hashCode = (long) str.hashCode();
            TraceEvent.startAsync(str, hashCode);
            if (sEnabled && matchesFilter(str)) {
                if (sTrackMemory) {
                    savePerfString(makeMemoryTraceNameFromTimingName(str), hashCode, EventType.START, true);
                }
                if (sTrackTiming) {
                    savePerfString(str, hashCode, EventType.START, false);
                }
            }
        }
    }

    public static synchronized void end(String str) {
        synchronized (PerfTraceEvent.class) {
            long hashCode = (long) str.hashCode();
            TraceEvent.finishAsync(str, hashCode);
            if (sEnabled && matchesFilter(str)) {
                if (sTrackTiming) {
                    savePerfString(str, hashCode, EventType.FINISH, false);
                }
                if (sTrackMemory) {
                    savePerfString(makeMemoryTraceNameFromTimingName(str), hashCode, EventType.FINISH, true);
                }
            }
        }
    }

    public static synchronized void setEnabled(boolean z) {
        synchronized (PerfTraceEvent.class) {
            if (sEnabled != z) {
                if (z) {
                    sBeginNanoTime = System.nanoTime();
                    sPerfTraceStrings = new JSONArray();
                } else {
                    dumpPerf();
                    sPerfTraceStrings = null;
                    sFilter = null;
                }
                sEnabled = z;
            }
        }
    }

    public static String makeSafeTraceName(String str, String str2) {
        int length = str2.length();
        if (str.length() + length > 40) {
            str = str.substring(0, 40 - length);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static synchronized void begin(String str, MemoryInfo memoryInfo) {
        synchronized (PerfTraceEvent.class) {
            long hashCode = (long) str.hashCode();
            TraceEvent.startAsync(str, hashCode);
            if (sEnabled && matchesFilter(str)) {
                long j = hashCode;
                savePerfString(makeMemoryTraceNameFromTimingName(str), j, EventType.START, (System.nanoTime() - sBeginNanoTime) / 1000, memoryInfo);
                if (sTrackTiming) {
                    savePerfString(str, hashCode, EventType.START, false);
                }
            }
        }
    }

    public static synchronized void end(String str, MemoryInfo memoryInfo) {
        synchronized (PerfTraceEvent.class) {
            long hashCode = (long) str.hashCode();
            TraceEvent.finishAsync(str, hashCode);
            if (sEnabled && matchesFilter(str)) {
                if (sTrackTiming) {
                    savePerfString(str, hashCode, EventType.FINISH, false);
                }
                savePerfString(makeMemoryTraceNameFromTimingName(str), hashCode, EventType.FINISH, (System.nanoTime() - sBeginNanoTime) / 1000, memoryInfo);
            }
        }
    }

    private static void savePerfString(String str, long j, EventType eventType, boolean z) {
        MemoryInfo memoryInfo;
        long nanoTime = (System.nanoTime() - sBeginNanoTime) / 1000;
        if (z) {
            memoryInfo = new MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        } else {
            memoryInfo = null;
        }
        savePerfString(str, j, eventType, nanoTime, memoryInfo);
    }

    private static void savePerfString(String str, long j, EventType eventType, long j2, MemoryInfo memoryInfo) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cat", "Java");
            jSONObject.put("ts", j2);
            jSONObject.put("ph", eventType);
            jSONObject.put("name", str);
            jSONObject.put("id", j);
            if (memoryInfo != null) {
                jSONObject.put("mem", memoryInfo.nativePss + memoryInfo.dalvikPss + memoryInfo.otherPss);
            }
            sPerfTraceStrings.put(jSONObject);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
