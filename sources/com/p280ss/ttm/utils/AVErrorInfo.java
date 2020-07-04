package com.p280ss.ttm.utils;

import android.content.Context;
import com.C1642a;

/* renamed from: com.ss.ttm.utils.AVErrorInfo */
public class AVErrorInfo {
    private static StringBuilder PHONE_INFO;

    public static final void setupPhoneInfo(Context context, StringBuilder sb) {
        String[] version = VersionInfo.getVersion();
        if (version != null) {
            sb.append(C1642a.m8034a("version:%s,%s,%s\r\n", new Object[]{version[0], version[1], version[2]}));
            sb.append("\r\n");
        }
        long[] romMemroy = MemoryInfo.getRomMemroy();
        if (romMemroy != null) {
            sb.append(C1642a.m8034a("rom memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(romMemroy[0]), Long.valueOf(romMemroy[1])}));
            sb.append("\r\n");
        }
        sb.append(C1642a.m8034a("ram memory totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(MemoryInfo.getTolalMemory()), Long.valueOf(MemoryInfo.getAvailMemory(context))}));
        sb.append("\r\n");
        long[] sDCardSize = HardWareInfo.getSDCardSize();
        if (sDCardSize != null) {
            sb.append(C1642a.m8034a("sdcard totle:%d,availe:%d\r\n", new Object[]{Long.valueOf(sDCardSize[0]), Long.valueOf(sDCardSize[1])}));
            sb.append("\r\n");
        }
    }

    public static void setupErrorInfo(Context context, StringBuilder sb, String str, String str2, String str3) {
        if (PHONE_INFO == null) {
            PHONE_INFO = new StringBuilder();
            setupPhoneInfo(context, PHONE_INFO);
        }
        sb.append(PHONE_INFO);
        sb.append("\r\n");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
    }
}
