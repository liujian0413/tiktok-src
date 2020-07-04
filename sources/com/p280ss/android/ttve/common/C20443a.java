package com.p280ss.android.ttve.common;

import android.os.Build;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.common.a */
public final class C20443a {

    /* renamed from: a */
    private static Map<String, Integer> f55205a;

    static {
        HashMap hashMap = new HashMap();
        f55205a = hashMap;
        hashMap.put("sdm660", Integer.valueOf(120));
        f55205a.put("msm8994", Integer.valueOf(120));
        f55205a.put("sdm845", Integer.valueOf(240));
        f55205a.put("sm8150", Integer.valueOf(480));
    }

    /* renamed from: a */
    public static String m67835a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException | IOException unused) {
        }
        return Build.HARDWARE;
    }

    /* renamed from: a */
    public static int m67834a(String str) {
        if (f55205a.containsKey(str)) {
            return ((Integer) f55205a.get(str)).intValue();
        }
        return 0;
    }
}
