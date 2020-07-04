package com.aweme.storage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.aweme.storage.f */
public final class C1922f {
    /* renamed from: a */
    public static List<Entry<String, Long>> m8897a(Context context, List<String> list) {
        File file;
        File file2;
        if (context == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (context.getCacheDir() == null) {
            file = null;
        } else {
            file = context.getCacheDir().getParentFile();
        }
        m8898a(file, hashMap, list, C1920b.p.name());
        File cacheDir = context.getCacheDir();
        StringBuilder sb = new StringBuilder();
        sb.append(C1920b.p.name());
        sb.append("/cache");
        m8898a(cacheDir, hashMap, list, sb.toString());
        File filesDir = context.getFilesDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C1920b.p.name());
        sb2.append("/cache");
        m8898a(filesDir, hashMap, list, sb2.toString());
        try {
            if (context.getExternalCacheDir() == null) {
                file2 = null;
            } else {
                file2 = context.getExternalCacheDir().getParentFile();
            }
            m8898a(file2, hashMap, list, C1920b.e.name());
            File externalCacheDir = context.getExternalCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C1920b.e.name());
            sb3.append("/files");
            m8898a(externalCacheDir, hashMap, list, sb3.toString());
            File externalFilesDir = context.getExternalFilesDir(null);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C1920b.e.name());
            sb4.append("/files");
            m8898a(externalFilesDir, hashMap, list, sb4.toString());
        } catch (Exception unused) {
        }
        List<Entry<String, Long>> arrayList = new ArrayList<>(hashMap.entrySet());
        if (arrayList.size() >= 100) {
            Collections.sort(arrayList, new Comparator<Entry<String, Long>>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m8899a((Entry) obj, (Entry) obj2);
                }

                /* renamed from: a */
                private static int m8899a(Entry<String, Long> entry, Entry<String, Long> entry2) {
                    return ((Long) entry2.getValue()).compareTo((Long) entry.getValue());
                }
            });
            arrayList = arrayList.subList(0, 100);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m8898a(File file, Map<String, Long> map, List<String> list, String str) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isDirectory() && file2.getAbsolutePath() != null && (list == null || !list.contains(file2.getName()))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(File.separator);
                        sb.append(file2.getName());
                        String sb2 = sb.toString();
                        long a = (C1921e.m8888a(file2.getAbsolutePath()) / 1024) / 1024;
                        if (a >= 1024) {
                            map.put(sb2, Long.valueOf(a));
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(sb2);
                            sb3.append(" ");
                            sb3.append(a);
                        }
                    }
                }
            }
        }
    }
}
