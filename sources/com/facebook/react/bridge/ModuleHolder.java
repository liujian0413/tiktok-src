package com.facebook.react.bridge;

import com.facebook.infer.p728a.C13854a;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.p1876a.C47883a;

public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private final boolean mCanOverrideExistingModule;
    private final boolean mHasConstants;
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private C47883a<? extends NativeModule> mProvider;

    public boolean getCanOverrideExistingModule() {
        return this.mCanOverrideExistingModule;
    }

    public boolean getHasConstants() {
        return this.mHasConstants;
    }

    public String getName() {
        return this.mName;
    }

    public synchronized void destroy() {
        if (this.mModule != null) {
            this.mModule.onCatalystInstanceDestroy();
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized boolean hasInstance() {
        boolean z;
        if (this.mModule != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            if (this.mModule != null) {
                C13854a.m40914a(!this.mIsInitializing);
                nativeModule = this.mModule;
            } else {
                z = false;
                nativeModule = null;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    private NativeModule create() {
        boolean z;
        boolean z2 = false;
        if (this.mModule == null) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        new Object[1][0] = this.mName;
        try {
            NativeModule nativeModule = (NativeModule) ((C47883a) C13854a.m40916b(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (this.mInitializable && !this.mIsInitializing) {
                    z2 = true;
                }
            }
            if (z2) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mInstanceKey);
            return nativeModule;
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mInstanceKey);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r1 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        r0 = create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.mIsCreating = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0028, code lost:
        if (r3.mModule == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r0 = (com.facebook.react.bridge.NativeModule) com.facebook.infer.p728a.C13854a.m40916b(r3.mModule);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x003b, code lost:
        return r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.NativeModule getModule() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.react.bridge.NativeModule r0 = r3.mModule     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0009
            com.facebook.react.bridge.NativeModule r0 = r3.mModule     // Catch:{ all -> 0x003f }
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            return r0
        L_0x0009:
            boolean r0 = r3.mIsCreating     // Catch:{ all -> 0x003f }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0012
            r3.mIsCreating = r1     // Catch:{ all -> 0x003f }
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0025
            com.facebook.react.bridge.NativeModule r0 = r3.create()
            monitor-enter(r3)
            r3.mIsCreating = r2     // Catch:{ all -> 0x0022 }
            r3.notifyAll()     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0022:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r0
        L_0x0025:
            monitor-enter(r3)
        L_0x0026:
            com.facebook.react.bridge.NativeModule r0 = r3.mModule     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0032
            boolean r0 = r3.mIsCreating     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0032
            r3.wait()     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x0026
        L_0x0032:
            com.facebook.react.bridge.NativeModule r0 = r3.mModule     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = com.facebook.infer.p728a.C13854a.m40916b(r0)     // Catch:{ all -> 0x003c }
            com.facebook.react.bridge.NativeModule r0 = (com.facebook.react.bridge.NativeModule) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            return r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ModuleHolder.getModule():com.facebook.react.bridge.NativeModule");
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        this.mCanOverrideExistingModule = nativeModule.canOverrideExistingModule();
        this.mHasConstants = true;
        this.mModule = nativeModule;
        new Object[1][0] = this.mName;
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                z = true;
                if (!this.mInitializable || this.mIsInitializing) {
                    z = false;
                } else {
                    this.mIsInitializing = true;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mInstanceKey);
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mInstanceKey);
            throw th;
        }
    }

    public ModuleHolder(ReactModuleInfo reactModuleInfo, C47883a<? extends NativeModule> aVar) {
        this.mName = reactModuleInfo.name();
        this.mCanOverrideExistingModule = reactModuleInfo.canOverrideExistingModule();
        this.mHasConstants = reactModuleInfo.hasConstants();
        this.mProvider = aVar;
        if (reactModuleInfo.needsEagerInit()) {
            this.mModule = create();
        }
    }
}
