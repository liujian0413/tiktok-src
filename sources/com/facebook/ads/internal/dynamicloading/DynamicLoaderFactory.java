package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.AudienceNetworkAds.InitResult;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.Preconditions;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import dalvik.system.DexClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    private static final String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = true;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static boolean sFallbackMode;
    public static final AtomicBoolean sInitializing = new AtomicBoolean();
    private static boolean sUseLegacyClassLoader = true;

    public static DynamicLoader getDynamicLoader() {
        return (DynamicLoader) sDynamicLoader.get();
    }

    public static synchronized boolean isFallbackMode() {
        boolean z;
        synchronized (DynamicLoaderFactory.class) {
            z = sFallbackMode;
        }
        return z;
    }

    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized DynamicLoader makeLoaderUnsafe() {
        synchronized (DynamicLoaderFactory.class) {
            if (sDynamicLoader.get() == null) {
                Context applicationContextViaReflection = getApplicationContextViaReflection();
                if (applicationContextViaReflection != null) {
                    DynamicLoader makeLoader = makeLoader(applicationContextViaReflection);
                    return makeLoader;
                }
                throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
            }
            DynamicLoader dynamicLoader = (DynamicLoader) sDynamicLoader.get();
            return dynamicLoader;
        }
    }

    public static void setUseLegacyClassLoader(boolean z) {
        sUseLegacyClassLoader = z;
    }

    public static InitResult createErrorInitResult(final Throwable th) {
        return new InitResult() {
            public final boolean isSuccess() {
                return false;
            }

            public final String getMessage() {
                return DynamicLoaderFactory.createErrorMessage(th);
            }
        };
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, AUDIENCE_NETWORK_CODE_PATH);
        mkdirChecked(file2);
        return file2;
    }

    public static String createErrorMessage(Throwable th) {
        StringBuilder sb = new StringBuilder("Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n");
        sb.append(stackTraceToString(th));
        return sb.toString();
    }

    private static String stackTraceToString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()), DynamicLoaderFactory.class.getClassLoader());
            }
        }
    }

    public static DynamicLoader doMakeLoader(Context context) throws Exception {
        DynamicLoader dynamicLoader;
        DynamicLoader dynamicLoader2 = (DynamicLoader) sDynamicLoader.get();
        if (dynamicLoader2 != null) {
            return dynamicLoader2;
        }
        if (!LOAD_FROM_ASSETS) {
            dynamicLoader = (DynamicLoader) Class.forName(DynamicLoaderImpl.class.getName()).newInstance();
        } else {
            System.currentTimeMillis();
            dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            System.currentTimeMillis();
        }
        sDynamicLoader.set(dynamicLoader);
        return dynamicLoader;
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        DynamicLoader doMakeLoader;
        synchronized (DynamicLoaderFactory.class) {
            Preconditions.checkNotNull(context, "Context can not be null.");
            try {
                doMakeLoader = doMakeLoader(context);
            } catch (Exception e) {
                DexLoadErrorReporter.reportDexLoadingIssue(context, createErrorMessage(e), 0.1d);
                DynamicLoader makeFallbackLoader = DynamicLoaderFallback.makeFallbackLoader();
                sDynamicLoader.set(makeFallbackLoader);
                sFallbackMode = true;
                return makeFallbackLoader;
            }
        }
        return doMakeLoader;
    }

    public static synchronized void setFallbackMode(boolean z) {
        synchronized (DynamicLoaderFactory.class) {
            if (z) {
                sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                sFallbackMode = true;
                return;
            }
            sDynamicLoader.set(null);
            sFallbackMode = false;
        }
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append(File.separator);
        sb.append(AUDIENCE_NETWORK_DEX);
        String sb2 = sb.toString();
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(sb2);
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return new DexClassLoader(sb2, context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
            }
        }
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        if (sUseLegacyClassLoader) {
            return makeLegacyAdsSdkClassLoader(context);
        }
        if (VERSION.SDK_INT >= 26) {
            return createInMemoryClassLoader(context);
        }
        File secondaryDir = getSecondaryDir(getCodeCacheDir(context, new File(context.getApplicationInfo().dataDir)));
        StringBuilder sb = new StringBuilder();
        sb.append(secondaryDir.getPath());
        sb.append(File.separator);
        sb.append(AUDIENCE_NETWORK_DEX);
        String sb2 = sb.toString();
        InputStream open = context.getAssets().open(AUDIENCE_NETWORK_DEX);
        FileOutputStream fileOutputStream = new FileOutputStream(sb2);
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(secondaryDir.getPath());
                sb3.append(File.separator);
                sb3.append(OPTIMIZED_DEX_PATH);
                File file = new File(sb3.toString());
                mkdirChecked(file);
                return new DexClassLoader(sb2, file.getPath(), null, context.getClassLoader());
            }
        }
    }

    private static void mkdirChecked(File file) throws IOException {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder("Failed to create directory ");
            sb3.append(file.getPath());
            sb3.append(", detailed message: ");
            sb3.append(str);
            throw new IOException(sb3.toString());
        }
    }

    private static File getCodeCacheDir(Context context, File file) throws IOException {
        if (VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return getCacheCodeDirLegacy(context, file);
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    public static void initialize(final Context context, final MultithreadedBundleWrapper multithreadedBundleWrapper, final InitListener initListener) {
        if (!sInitializing.getAndSet(true)) {
            new Thread(new Runnable() {
                public final void run() {
                    synchronized (DynamicLoaderFactory.class) {
                        int i = 0;
                        while (i < 3) {
                            try {
                                DynamicLoaderFactory.doMakeLoader(context).createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
                                break;
                            } catch (Throwable th) {
                                if (i == 2) {
                                    if (initListener != null) {
                                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                            public final void run() {
                                                initListener.onInitialized(DynamicLoaderFactory.createErrorInitResult(th));
                                            }
                                        }, 100);
                                    }
                                    DexLoadErrorReporter.reportDexLoadingIssue(context, DynamicLoaderFactory.createErrorMessage(th), 0.1d);
                                    DynamicLoaderFactory.setFallbackMode(true);
                                } else {
                                    SystemClock.sleep(200);
                                }
                                i++;
                            }
                        }
                        DynamicLoaderFactory.sInitializing.set(false);
                    }
                }
            }).start();
        }
    }
}
