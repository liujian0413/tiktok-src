package com.ttnet.org.chromium.base1;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class ResourceExtractor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static ResourceExtractor sInstance;
    public final String[] mAssetsToExtract = detectFilesToExtract();
    private ExtractTask mExtractTask;

    class ExtractTask extends AsyncTask<Void, Void, Void> {
        public final List<Runnable> mCompletionCallbacks;

        private void onPostExecuteImpl() {
            for (int i = 0; i < this.mCompletionCallbacks.size(); i++) {
                ((Runnable) this.mCompletionCallbacks.get(i)).run();
            }
            this.mCompletionCallbacks.clear();
        }

        private long getApkVersion() {
            try {
                PackageInfo packageInfo = ContextUtils.getApplicationContext().getPackageManager().getPackageInfo(ContextUtils.getApplicationContext().getPackageName(), 0);
                return packageInfo.lastUpdateTime ^ (((long) packageInfo.versionCode) << 32);
            } catch (NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        private void doInBackgroundImpl() {
            boolean z;
            String[] strArr;
            File outputDir = ResourceExtractor.this.getOutputDir();
            if (outputDir.exists() || outputDir.mkdirs()) {
                TraceEvent.begin("checkPakTimeStamp");
                long apkVersion = getApkVersion();
                SharedPreferences appSharedPreferences = ContextUtils.getAppSharedPreferences();
                if (apkVersion != appSharedPreferences.getLong("org.chromium.base.ResourceExtractor.Version", 0)) {
                    z = true;
                } else {
                    z = false;
                }
                TraceEvent.end("checkPakTimeStamp");
                if (z) {
                    ResourceExtractor.this.deleteFiles();
                    appSharedPreferences.edit().putLong("org.chromium.base.ResourceExtractor.Version", apkVersion).apply();
                }
                TraceEvent.begin("WalkAssets");
                byte[] bArr = new byte[16384];
                try {
                    for (String str : ResourceExtractor.this.mAssetsToExtract) {
                        File file = new File(outputDir, str);
                        if (file.length() == 0) {
                            TraceEvent.begin("ExtractResource");
                            extractResourceHelper(ContextUtils.getApplicationContext().getAssets().open(str), file, bArr);
                            TraceEvent.end("ExtractResource");
                        }
                    }
                    TraceEvent.end("WalkAssets");
                } catch (IOException e) {
                    try {
                        Log.m22901w("cr.base", "Exception unpacking required pak asset: %s", e.getMessage());
                        ResourceExtractor.this.deleteFiles();
                    } finally {
                        TraceEvent.end("WalkAssets");
                    }
                } catch (Throwable th) {
                    TraceEvent.end("ExtractResource");
                    throw th;
                }
            } else {
                Log.m22891e("cr.base", "Unable to create pak resources directory!", new Object[0]);
            }
        }

        private ExtractTask() {
            this.mCompletionCallbacks = new ArrayList();
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            TraceEvent.begin("ResourceExtractor.ExtractTask.doInBackground");
            try {
                doInBackgroundImpl();
                TraceEvent.end("ResourceExtractor.ExtractTask.doInBackground");
                return null;
            } catch (Throwable th) {
                TraceEvent.end("ResourceExtractor.ExtractTask.doInBackground");
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            TraceEvent.begin("ResourceExtractor.ExtractTask.onPostExecute");
            try {
                onPostExecuteImpl();
            } finally {
                TraceEvent.end("ResourceExtractor.ExtractTask.onPostExecute");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[SYNTHETIC, Splitter:B:23:0x0037] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0044  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void extractResourceHelper(java.io.InputStream r6, java.io.File r7, byte[] r8) throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0033 }
                r1.<init>(r7)     // Catch:{ all -> 0x0033 }
                java.lang.String r0 = "cr.base"
                java.lang.String r2 = "Extracting resource %s"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0031 }
                r4 = 0
                r3[r4] = r7     // Catch:{ all -> 0x0031 }
                com.ttnet.org.chromium.base1.Log.m22892i(r0, r2, r3)     // Catch:{ all -> 0x0031 }
            L_0x0013:
                r7 = 16384(0x4000, float:2.2959E-41)
                int r7 = r6.read(r8, r4, r7)     // Catch:{ all -> 0x0031 }
                r0 = -1
                if (r7 == r0) goto L_0x0020
                r1.write(r8, r4, r7)     // Catch:{ all -> 0x0031 }
                goto L_0x0013
            L_0x0020:
                r1.close()     // Catch:{ all -> 0x002a }
                if (r6 == 0) goto L_0x0029
                r6.close()
                return
            L_0x0029:
                return
            L_0x002a:
                r7 = move-exception
                if (r6 == 0) goto L_0x0030
                r6.close()
            L_0x0030:
                throw r7
            L_0x0031:
                r7 = move-exception
                goto L_0x0035
            L_0x0033:
                r7 = move-exception
                r1 = r0
            L_0x0035:
                if (r1 == 0) goto L_0x0042
                r1.close()     // Catch:{ all -> 0x003b }
                goto L_0x0042
            L_0x003b:
                r7 = move-exception
                if (r6 == 0) goto L_0x0041
                r6.close()
            L_0x0041:
                throw r7
            L_0x0042:
                if (r6 == 0) goto L_0x0047
                r6.close()
            L_0x0047:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.ResourceExtractor.ExtractTask.extractResourceHelper(java.io.InputStream, java.io.File, byte[]):void");
        }
    }

    public static ResourceExtractor get() {
        if (sInstance == null) {
            sInstance = new ResourceExtractor();
        }
        return sInstance;
    }

    private File getAppDataDir() {
        return new File(PathUtils.getDataDirectory());
    }

    private static boolean shouldSkipPakExtraction() {
        if (get().mAssetsToExtract.length == 0) {
            return true;
        }
        return false;
    }

    public File getOutputDir() {
        return new File(getAppDataDir(), "paks");
    }

    public void startExtractingResources() {
        if (this.mExtractTask == null && !shouldSkipPakExtraction()) {
            this.mExtractTask = new ExtractTask();
            this.mExtractTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void waitForCompletion() {
        if (!shouldSkipPakExtraction()) {
            try {
                this.mExtractTask.get();
            } catch (CancellationException unused) {
                deleteFiles();
            } catch (ExecutionException unused2) {
                deleteFiles();
            } catch (InterruptedException unused3) {
                deleteFiles();
            }
        }
    }

    private static String[] detectFilesToExtract() {
        String[] strArr;
        String updatedLanguageForChromium = LocaleUtils.getUpdatedLanguageForChromium(Locale.getDefault().getLanguage());
        ArrayList arrayList = new ArrayList(6);
        for (String str : BuildConfig.COMPRESSED_LOCALES) {
            if (str.startsWith(updatedLanguageForChromium)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".pak");
                arrayList.add(sb.toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void deleteFiles() {
        File file = new File(getAppDataDir(), "icudtl.dat");
        if (file.exists() && !file.delete()) {
            Log.m22891e("cr.base", "Unable to remove the icudata %s", file.getName());
        }
        File file2 = new File(getAppDataDir(), "natives_blob.bin");
        if (file2.exists() && !file2.delete()) {
            Log.m22891e("cr.base", "Unable to remove the v8 data %s", file2.getName());
        }
        File file3 = new File(getAppDataDir(), "snapshot_blob.bin");
        if (file3.exists() && !file3.delete()) {
            Log.m22891e("cr.base", "Unable to remove the v8 data %s", file3.getName());
        }
        File outputDir = getOutputDir();
        if (outputDir.exists()) {
            File[] listFiles = outputDir.listFiles();
            if (listFiles != null) {
                for (File file4 : listFiles) {
                    if (!file4.delete()) {
                        Log.m22891e("cr.base", "Unable to remove existing resource %s", file4.getName());
                    }
                }
            }
        }
    }

    public void addCompletionCallback(Runnable runnable) {
        ThreadUtils.assertOnUiThread();
        Handler handler = new Handler(Looper.getMainLooper());
        if (shouldSkipPakExtraction()) {
            handler.post(runnable);
        } else if (this.mExtractTask.getStatus() == Status.FINISHED) {
            handler.post(runnable);
        } else {
            this.mExtractTask.mCompletionCallbacks.add(runnable);
        }
    }
}
