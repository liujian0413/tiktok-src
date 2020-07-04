package android.support.p029v7.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.ResourcesFlusher */
public class ResourcesFlusher {
    private static Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static Class sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    private ResourcesFlusher() {
    }

    static void flush(Resources resources) {
        if (VERSION.SDK_INT < 28) {
            if (VERSION.SDK_INT >= 24) {
                flushNougats(resources);
            } else if (VERSION.SDK_INT >= 23) {
                flushMarshmallows(resources);
            } else {
                if (VERSION.SDK_INT >= 21) {
                    flushLollipops(resources);
                }
            }
        }
    }

    private static void flushLollipops(Resources resources) {
        Map map;
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sDrawableCacheFieldFetched = true;
        }
        if (sDrawableCacheField != null) {
            try {
                map = (Map) sDrawableCacheField.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void flushMarshmallows(android.content.res.Resources r3) {
        /*
            boolean r0 = sDrawableCacheFieldFetched
            if (r0 != 0) goto L_0x0014
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0012 }
            sDrawableCacheField = r1     // Catch:{ NoSuchFieldException -> 0x0012 }
            r1.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x0012 }
        L_0x0012:
            sDrawableCacheFieldFetched = r0
        L_0x0014:
            r0 = 0
            java.lang.reflect.Field r1 = sDrawableCacheField
            if (r1 == 0) goto L_0x0020
            java.lang.reflect.Field r1 = sDrawableCacheField     // Catch:{ IllegalAccessException -> 0x0020 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ IllegalAccessException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r3 = r0
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            flushThemedResourcesCache(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.app.ResourcesFlusher.flushMarshmallows(android.content.res.Resources):void");
    }

    private static void flushThemedResourcesCache(Object obj) {
        LongSparseArray longSparseArray;
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            sThemedResourceCacheClazzFetched = true;
        }
        if (sThemedResourceCacheClazz != null) {
            if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
                try {
                    Field declaredField = sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries");
                    sThemedResourceCache_mUnthemedEntriesField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
            }
            if (sThemedResourceCache_mUnthemedEntriesField != null) {
                try {
                    longSparseArray = (LongSparseArray) sThemedResourceCache_mUnthemedEntriesField.get(obj);
                } catch (IllegalAccessException unused3) {
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void flushNougats(android.content.res.Resources r4) {
        /*
            boolean r0 = sResourcesImplFieldFetched
            r1 = 1
            if (r0 != 0) goto L_0x0014
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0012 }
            sResourcesImplField = r0     // Catch:{ NoSuchFieldException -> 0x0012 }
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0012 }
        L_0x0012:
            sResourcesImplFieldFetched = r1
        L_0x0014:
            java.lang.reflect.Field r0 = sResourcesImplField
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            r0 = 0
            java.lang.reflect.Field r2 = sResourcesImplField     // Catch:{ IllegalAccessException -> 0x0021 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IllegalAccessException -> 0x0021 }
            goto L_0x0022
        L_0x0021:
            r4 = r0
        L_0x0022:
            if (r4 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r2 = sDrawableCacheFieldFetched
            if (r2 != 0) goto L_0x003a
            java.lang.Class r2 = r4.getClass()     // Catch:{ NoSuchFieldException -> 0x0038 }
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0038 }
            sDrawableCacheField = r2     // Catch:{ NoSuchFieldException -> 0x0038 }
            r2.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x0038 }
        L_0x0038:
            sDrawableCacheFieldFetched = r1
        L_0x003a:
            java.lang.reflect.Field r1 = sDrawableCacheField
            if (r1 == 0) goto L_0x0045
            java.lang.reflect.Field r1 = sDrawableCacheField     // Catch:{ IllegalAccessException -> 0x0045 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r4 = r0
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            flushThemedResourcesCache(r4)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.app.ResourcesFlusher.flushNougats(android.content.res.Resources):void");
    }
}
