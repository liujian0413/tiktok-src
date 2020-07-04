package com.ttnet.org.chromium.base.process_launcher;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ttnet.org.chromium.base.CommandLine;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.memory.MemoryPressureMonitor;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import com.ttnet.org.chromium.base.process_launcher.IChildProcessService.Stub;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@JNINamespace("base::android")
public abstract class ChildProcessService extends Service {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sCreateCalled;
    public static int sSplitApkWorkaroundResult;
    public boolean mBindToCallerCheck;
    private final Stub mBinder = new Stub() {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<ChildProcessService> cls = ChildProcessService.class;
        }

        public void forceKill() {
            Process.killProcess(Process.myPid());
        }

        public void dumpProcessStack() {
            synchronized (ChildProcessService.this.mLibraryInitializedLock) {
                if (!ChildProcessService.this.mLibraryInitialized) {
                    Log.m146394e("ChildProcessService", "Cannot dump process stack before native is loaded", new Object[0]);
                } else {
                    ChildProcessService.nativeDumpProcessStack();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean bindToCaller() {
            /*
                r8 = this;
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r0 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this
                java.lang.Object r0 = r0.mBinderLock
                monitor-enter(r0)
                int r1 = android.os.Binder.getCallingPid()     // Catch:{ all -> 0x003a }
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r2 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x003a }
                int r2 = r2.mBoundCallingPid     // Catch:{ all -> 0x003a }
                r3 = 1
                if (r2 != 0) goto L_0x0015
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r2 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x003a }
                r2.mBoundCallingPid = r1     // Catch:{ all -> 0x003a }
                goto L_0x0038
            L_0x0015:
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r2 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x003a }
                int r2 = r2.mBoundCallingPid     // Catch:{ all -> 0x003a }
                if (r2 == r1) goto L_0x0038
                java.lang.String r2 = "ChildProcessService"
                java.lang.String r4 = "Service is already bound by pid %d, cannot bind for pid %d"
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x003a }
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r6 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x003a }
                int r6 = r6.mBoundCallingPid     // Catch:{ all -> 0x003a }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003a }
                r7 = 0
                r5[r7] = r6     // Catch:{ all -> 0x003a }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003a }
                r5[r3] = r1     // Catch:{ all -> 0x003a }
                com.ttnet.org.chromium.base.Log.m146394e(r2, r4, r5)     // Catch:{ all -> 0x003a }
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                return r7
            L_0x0038:
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                return r3
            L_0x003a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.process_launcher.ChildProcessService.C466241.bindToCaller():boolean");
        }

        static final /* synthetic */ void lambda$onMemoryPressure$0$ChildProcessService$1(int i) {
            if (i >= MemoryPressureMonitor.INSTANCE.getLastReportedPressure()) {
                MemoryPressureMonitor.INSTANCE.notifyPressure(i);
            }
        }

        public void onMemoryPressure(int i) {
            ThreadUtils.postOnUiThread((Runnable) new ChildProcessService$1$$Lambda$0(i));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            r4.sendPid(android.os.Process.myPid());
            r2.this$0.mParentProcess = r4;
            r2.this$0.processConnectionBundle(r3, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setupConnection(android.os.Bundle r3, com.ttnet.org.chromium.base.process_launcher.IParentProcess r4, java.util.List<android.os.IBinder> r5) throws android.os.RemoteException {
            /*
                r2 = this;
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r0 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this
                java.lang.Object r0 = r0.mBinderLock
                monitor-enter(r0)
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r1 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x0033 }
                boolean r1 = r1.mBindToCallerCheck     // Catch:{ all -> 0x0033 }
                if (r1 == 0) goto L_0x0021
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r1 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this     // Catch:{ all -> 0x0033 }
                int r1 = r1.mBoundCallingPid     // Catch:{ all -> 0x0033 }
                if (r1 != 0) goto L_0x0021
                java.lang.String r3 = "ChildProcessService"
                java.lang.String r5 = "Service has not been bound with bindToCaller()"
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0033 }
                com.ttnet.org.chromium.base.Log.m146394e(r3, r5, r1)     // Catch:{ all -> 0x0033 }
                r3 = -1
                r4.sendPid(r3)     // Catch:{ all -> 0x0033 }
                monitor-exit(r0)     // Catch:{ all -> 0x0033 }
                return
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0033 }
                int r0 = android.os.Process.myPid()
                r4.sendPid(r0)
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r0 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this
                r0.mParentProcess = r4
                com.ttnet.org.chromium.base.process_launcher.ChildProcessService r4 = com.ttnet.org.chromium.base.process_launcher.ChildProcessService.this
                r4.processConnectionBundle(r3, r5)
                return
            L_0x0033:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0033 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.process_launcher.ChildProcessService.C466241.setupConnection(android.os.Bundle, com.ttnet.org.chromium.base.process_launcher.IParentProcess, java.util.List):void");
        }
    };
    public final Object mBinderLock = new Object();
    public int mBoundCallingPid;
    public String[] mCommandLineParams;
    public final ChildProcessServiceDelegate mDelegate;
    public FileDescriptorInfo[] mFdInfos;
    public boolean mLibraryInitialized;
    public final Object mLibraryInitializedLock = new Object();
    public Thread mMainThread;
    public IParentProcess mParentProcess;
    public boolean mServiceBound;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SplitApkWorkaroundResult {
    }

    public static native void nativeDumpProcessStack();

    public static native void nativeExitChildProcess();

    public static native void nativeRegisterFileDescriptors(String[] strArr, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2);

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onBind$0$ChildProcessService() {
        this.mDelegate.preloadNativeLibrary(getApplicationContext());
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m146395i("ChildProcessService", "Destroying ChildProcessService pid=%d", Integer.valueOf(Process.myPid()));
        System.exit(0);
    }

    public void onCreate() {
        super.onCreate();
        Log.m146395i("ChildProcessService", "Creating new ChildProcessService pid=%d", Integer.valueOf(Process.myPid()));
        if (!sCreateCalled) {
            sCreateCalled = true;
            ContextUtils.initApplicationContext(getApplicationContext());
            this.mDelegate.onServiceCreated();
            this.mMainThread = new Thread(new Runnable() {
                static final /* synthetic */ boolean $assertionsDisabled = false;

                static {
                    Class<ChildProcessService> cls = ChildProcessService.class;
                }

                public void run() {
                    boolean z;
                    String str;
                    try {
                        synchronized (ChildProcessService.this.mMainThread) {
                            while (ChildProcessService.this.mCommandLineParams == null) {
                                ChildProcessService.this.mMainThread.wait();
                            }
                        }
                        CommandLine.init(ChildProcessService.this.mCommandLineParams);
                        if (CommandLine.getInstance().hasSwitch("renderer-wait-for-java-debugger")) {
                            Debug.waitForDebugger();
                        }
                        try {
                            z = ChildProcessService.this.mDelegate.loadNativeLibrary(ChildProcessService.this.getApplicationContext());
                        } catch (Exception e) {
                            Log.m146394e("ChildProcessService", "Failed to load native library.", e);
                            z = false;
                        }
                        if (!z) {
                            System.exit(-1);
                        }
                        synchronized (ChildProcessService.this.mLibraryInitializedLock) {
                            ChildProcessService.this.mLibraryInitialized = true;
                            ChildProcessService.this.mLibraryInitializedLock.notifyAll();
                        }
                        synchronized (ChildProcessService.this.mMainThread) {
                            ChildProcessService.this.mMainThread.notifyAll();
                            while (ChildProcessService.this.mFdInfos == null) {
                                ChildProcessService.this.mMainThread.wait();
                            }
                        }
                        SparseArray fileDescriptorsIdsToKeys = ChildProcessService.this.mDelegate.getFileDescriptorsIdsToKeys();
                        int[] iArr = new int[ChildProcessService.this.mFdInfos.length];
                        String[] strArr = new String[ChildProcessService.this.mFdInfos.length];
                        int[] iArr2 = new int[ChildProcessService.this.mFdInfos.length];
                        long[] jArr = new long[ChildProcessService.this.mFdInfos.length];
                        long[] jArr2 = new long[ChildProcessService.this.mFdInfos.length];
                        for (int i = 0; i < ChildProcessService.this.mFdInfos.length; i++) {
                            FileDescriptorInfo fileDescriptorInfo = ChildProcessService.this.mFdInfos[i];
                            if (fileDescriptorsIdsToKeys != null) {
                                str = (String) fileDescriptorsIdsToKeys.get(fileDescriptorInfo.f120074id);
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                strArr[i] = str;
                            } else {
                                iArr[i] = fileDescriptorInfo.f120074id;
                            }
                            iArr2[i] = fileDescriptorInfo.f120073fd.detachFd();
                            jArr[i] = fileDescriptorInfo.offset;
                            jArr2[i] = fileDescriptorInfo.size;
                        }
                        ChildProcessService.nativeRegisterFileDescriptors(strArr, iArr, iArr2, jArr, jArr2);
                        ChildProcessService.this.mDelegate.onBeforeMain();
                        if (ContextUtils.isIsolatedProcess()) {
                            RecordHistogram.recordEnumeratedHistogram("Android.WebView.SplitApkWorkaroundResult", ChildProcessService.sSplitApkWorkaroundResult, 6);
                        }
                        ChildProcessService.this.mDelegate.runMain();
                        try {
                            ChildProcessService.this.mParentProcess.reportCleanExit();
                        } catch (RemoteException e2) {
                            Log.m146394e("ChildProcessService", "Failed to call clean exit callback.", e2);
                        }
                        ChildProcessService.nativeExitChildProcess();
                    } catch (InterruptedException e3) {
                        Log.m146404w("ChildProcessService", "%s startup failed: %s", "ChildProcessMain", e3);
                    }
                }
            }, "ChildProcessMain");
            this.mMainThread.start();
            return;
        }
        throw new RuntimeException("Illegal child process reuse.");
    }

    public static void setSplitApkWorkaroundResult(int i) {
        sSplitApkWorkaroundResult = i;
    }

    public ChildProcessService(ChildProcessServiceDelegate childProcessServiceDelegate) {
        this.mDelegate = childProcessServiceDelegate;
    }

    public IBinder onBind(Intent intent) {
        if (this.mServiceBound) {
            return this.mBinder;
        }
        stopSelf();
        this.mBindToCallerCheck = intent.getBooleanExtra("org.chromium.base.process_launcher.extra.bind_to_caller", false);
        this.mServiceBound = true;
        this.mDelegate.onServiceBound(intent);
        new Handler(Looper.getMainLooper()).post(new ChildProcessService$$Lambda$0(this));
        return this.mBinder;
    }

    public void processConnectionBundle(Bundle bundle, List<IBinder> list) {
        bundle.setClassLoader(getApplicationContext().getClassLoader());
        synchronized (this.mMainThread) {
            if (this.mCommandLineParams == null) {
                this.mCommandLineParams = bundle.getStringArray("org.chromium.base.process_launcher.extra.command_line");
                this.mMainThread.notifyAll();
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("org.chromium.base.process_launcher.extra.extraFiles");
            if (parcelableArray != null) {
                this.mFdInfos = new FileDescriptorInfo[parcelableArray.length];
                System.arraycopy(parcelableArray, 0, this.mFdInfos, 0, parcelableArray.length);
            }
            this.mDelegate.onConnectionSetup(bundle, list);
            this.mMainThread.notifyAll();
        }
    }
}
