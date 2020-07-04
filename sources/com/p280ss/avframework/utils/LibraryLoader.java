package com.p280ss.avframework.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import java.io.File;

/* renamed from: com.ss.avframework.utils.LibraryLoader */
public class LibraryLoader {
    private static Loader sLoader;

    /* renamed from: com.ss.avframework.utils.LibraryLoader$Loader */
    public interface Loader {
        void loadLibrary(String str) throws Exception;

        void loadLibraryFromPath(String str) throws Exception;
    }

    /* renamed from: com.ss.avframework.utils.LibraryLoader$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.load(str);
            C7110b.m22204a(uptimeMillis, str);
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    public static void setupLibraryLoader(Loader loader) {
        sLoader = loader;
    }

    public static void loadLibrary(String str) throws Exception {
        Loader loader = sLoader;
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Invalid library name.");
        } else if (loader != null) {
            StringBuilder sb = new StringBuilder("Loading [");
            sb.append(str);
            sb.append("] with external loader ");
            sb.append(loader);
            EarlyAVLog.println(5, "LibraryLoader", sb.toString(), null);
            loader.loadLibrary(str);
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
        }
    }

    public static void loadLibraryFromPath(String str) throws Exception {
        Loader loader = sLoader;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                StringBuilder sb = new StringBuilder("Not found library '");
                sb.append(str);
                sb.append("' file.");
                throw new Exception(sb.toString());
            } else if (loader != null) {
                StringBuilder sb2 = new StringBuilder("Loading [");
                sb2.append(file.getAbsolutePath());
                sb2.append("] with external loader ");
                sb2.append(loader);
                EarlyAVLog.println(5, "LibraryLoader", sb2.toString(), null);
                loader.loadLibraryFromPath(file.getAbsolutePath());
            } else {
                _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_load(file.getAbsolutePath());
            }
        } else {
            throw new Exception("Invalid library name.");
        }
    }
}
