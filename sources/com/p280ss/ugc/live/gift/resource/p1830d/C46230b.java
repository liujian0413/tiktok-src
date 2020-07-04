package com.p280ss.ugc.live.gift.resource.p1830d;

import java.io.File;

/* renamed from: com.ss.ugc.live.gift.resource.d.b */
public final class C46230b {
    /* renamed from: a */
    public static String m145165a(String str) {
        if (C46232d.m145169a(str) || str.endsWith(File.separator)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: b */
    public static File m145167b(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".tmp");
            return new File(sb.toString());
        }
        throw new IllegalArgumentException("file is null");
    }

    /* renamed from: a */
    public static void m145166a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                file.delete();
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m145166a(file2);
                } else {
                    file2.delete();
                }
            }
            file.delete();
        }
    }
}
