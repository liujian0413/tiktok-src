package org.webrtc;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

class NativeLibrary {
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static NativeLibraryLoadListener loadListener;
    private static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {

        class _lancet {
            private _lancet() {
            }

            static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
                long uptimeMillis = SystemClock.uptimeMillis();
                System.loadLibrary(str);
                C7110b.m22204a(uptimeMillis, str);
            }
        }

        DefaultLoader() {
        }

        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            StringBuilder sb = new StringBuilder("Loading library: ");
            sb.append(str);
            Logging.m150047d(str2, sb.toString());
            try {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                String str3 = NativeLibrary.TAG;
                StringBuilder sb2 = new StringBuilder("Failed to load native library: ");
                sb2.append(str);
                Logging.m150049e(str3, sb2.toString(), e);
                return false;
            }
        }
    }

    NativeLibrary() {
    }

    static void disposeListener() {
        if (loadListener != null) {
            loadListener = null;
        }
    }

    static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void initialize(org.webrtc.NativeLibraryLoader r4, java.lang.String r5) {
        /*
            java.lang.Object r0 = lock
            monitor-enter(r0)
            boolean r1 = libraryLoaded     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "Native library has already been loaded."
            org.webrtc.Logging.m150047d(r4, r1)     // Catch:{ all -> 0x0047 }
            org.webrtc.NativeLibraryLoadListener r4 = loadListener     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0017
            org.webrtc.NativeLibraryLoadListener r4 = loadListener     // Catch:{ all -> 0x0047 }
            r4.onLoadAlready(r5)     // Catch:{ all -> 0x0047 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0019:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "Loading native library: "
            r2.<init>(r3)     // Catch:{ all -> 0x0047 }
            r2.append(r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0047 }
            org.webrtc.Logging.m150047d(r1, r2)     // Catch:{ all -> 0x0047 }
            boolean r4 = r4.load(r5)     // Catch:{ all -> 0x0047 }
            libraryLoaded = r4     // Catch:{ all -> 0x0047 }
            org.webrtc.NativeLibraryLoadListener r4 = loadListener     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0045
            boolean r4 = libraryLoaded     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0040
            org.webrtc.NativeLibraryLoadListener r4 = loadListener     // Catch:{ all -> 0x0047 }
            r4.onLoadSuccess(r5)     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0040:
            org.webrtc.NativeLibraryLoadListener r4 = loadListener     // Catch:{ all -> 0x0047 }
            r4.onLoadError(r5)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NativeLibrary.initialize(org.webrtc.NativeLibraryLoader, java.lang.String):void");
    }
}
