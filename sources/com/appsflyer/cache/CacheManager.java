package com.appsflyer.cache;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CacheManager {

    /* renamed from: ˎ */
    private static CacheManager f6778 = new CacheManager();

    private CacheManager() {
    }

    public static CacheManager getInstance() {
        return f6778;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC, Splitter:B:21:0x002c] */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.appsflyer.cache.RequestCacheData m8747(java.io.File r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0029, all -> 0x0021 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0021 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            int r2 = (int) r2     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            char[] r2 = new char[r2]     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.read(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            com.appsflyer.cache.RequestCacheData r3 = new com.appsflyer.cache.RequestCacheData     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.f6779 = r4     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r3
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            r4 = move-exception
            r1 = r0
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r4
        L_0x0029:
            r1 = r0
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.cache.CacheManager.m8747(java.io.File):com.appsflyer.cache.RequestCacheData");
    }

    public List<RequestCacheData> getCachedRequests(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File r3 : file.listFiles()) {
                    arrayList.add(m8747(r3));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public void init(Context context) {
        try {
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                new File(context.getFilesDir(), "AFRequestCache").mkdir();
            }
        } catch (Exception unused) {
        }
    }

    public void deleteRequest(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083 A[SYNTHETIC, Splitter:B:24:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cacheRequest(com.appsflyer.cache.RequestCacheData r6, android.content.Context r7) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.io.File r2 = r7.getFilesDir()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.lang.String r3 = "AFRequestCache"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            if (r2 != 0) goto L_0x0016
            r1.mkdir()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            return
        L_0x0016:
            java.io.File[] r1 = r1.listFiles()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            r2 = 40
            if (r1 <= r2) goto L_0x0022
            return
        L_0x0022:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.io.File r7 = r7.getFilesDir()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.lang.String r3 = "AFRequestCache"
            r2.<init>(r7, r3)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.lang.String r7 = java.lang.Long.toString(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            r1.<init>(r2, r7)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            r1.createNewFile()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            r3 = 1
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0080 }
            java.lang.String r0 = "version="
            r7.write(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            java.lang.String r0 = r6.f6782     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.write(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r0 = 10
            r7.write(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            java.lang.String r1 = "url="
            r7.write(r1)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            java.lang.String r1 = r6.f6781     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.write(r1)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.write(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            java.lang.String r1 = "data="
            r7.write(r1)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            java.lang.String r6 = r6.f6780     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.write(r6)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.write(r0)     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.flush()     // Catch:{ Exception -> 0x0088, all -> 0x007d }
            r7.close()     // Catch:{ IOException -> 0x007c }
            return
        L_0x007c:
            return
        L_0x007d:
            r6 = move-exception
            r0 = r7
            goto L_0x0081
        L_0x0080:
            r6 = move-exception
        L_0x0081:
            if (r0 == 0) goto L_0x0086
            r0.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            throw r6
        L_0x0087:
            r7 = r0
        L_0x0088:
            if (r7 == 0) goto L_0x008f
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x008f
        L_0x008e:
            return
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.cache.CacheManager.cacheRequest(com.appsflyer.cache.RequestCacheData, android.content.Context):void");
    }
}
