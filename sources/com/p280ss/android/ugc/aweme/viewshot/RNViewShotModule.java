package com.p280ss.android.ugc.aweme.viewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.viewshot.RNViewShotModule */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* renamed from: com.ss.android.ugc.aweme.viewshot.RNViewShotModule$a */
    static class C43387a extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* renamed from: a */
        private final File f112374a;

        /* renamed from: b */
        private final File f112375b;

        private C43387a(ReactContext reactContext) {
            super(reactContext);
            this.f112374a = reactContext.getCacheDir();
            this.f112375b = reactContext.getExternalCacheDir();
        }

        /* renamed from: a */
        private void m137684a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (this.f112374a != null) {
                m137684a(this.f112374a);
            }
            if (this.f112375b != null) {
                m137684a(this.f112375b);
            }
        }

        public final boolean accept(File file, String str) {
            return str.startsWith("ReactNative-snapshot-image");
        }
    }

    public String getName() {
        return "RNViewShot";
    }

    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new C43387a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                    file.delete();
                }
            }
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    private File createTempFile(Context context, String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir != null && (cacheDir == null || externalCacheDir.getFreeSpace() > cacheDir.getFreeSpace())) {
            cacheDir = externalCacheDir;
        }
        StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(str);
        return File.createTempFile("ReactNative-snapshot-image", sb.toString(), cacheDir);
    }

    @ReactMethod
    public void captureRef(int i, ReadableMap readableMap, Promise promise) {
        int i2;
        Integer num;
        Integer num2;
        File file;
        ReadableMap readableMap2 = readableMap;
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap2.getString("format");
        if ("jpg".equals(string)) {
            i2 = 0;
        } else if ("webm".equals(string)) {
            i2 = 2;
        } else if ("raw".equals(string)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        double d = readableMap2.getDouble("quality");
        if (readableMap2.hasKey("width")) {
            double d2 = (double) displayMetrics.density;
            double d3 = readableMap2.getDouble("width");
            Double.isNaN(d2);
            num = Integer.valueOf((int) (d2 * d3));
        } else {
            num = null;
        }
        if (readableMap2.hasKey("height")) {
            double d4 = (double) displayMetrics.density;
            double d5 = readableMap2.getDouble("height");
            Double.isNaN(d4);
            num2 = Integer.valueOf((int) (d4 * d5));
        } else {
            num2 = null;
        }
        String string2 = readableMap2.getString("result");
        Boolean valueOf = Boolean.valueOf(readableMap2.getBoolean("snapshotContentContainer"));
        try {
            if ("tmpfile".equals(string2)) {
                file = createTempFile(getReactApplicationContext(), string);
            } else {
                file = null;
            }
            UIManagerModule uIManagerModule = (UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class);
            int i3 = i;
            C43390c cVar = new C43390c(i3, string, i2, d, num, num2, file, string2, valueOf, this.reactContext, getCurrentActivity(), promise);
            uIManagerModule.addUIBlock(cVar);
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder("Failed to snapshot view tag ");
            sb.append(i);
            promise.reject("E_UNABLE_TO_SNAPSHOT", sb.toString());
        }
    }
}
