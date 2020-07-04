package com.ttnet.org.chromium.base.process_launcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.memory.MemoryPressureCallback;
import com.ttnet.org.chromium.base.process_launcher.IParentProcess.Stub;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class ChildProcessConnection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int[] sAllBindingStateCounts = new int[4];
    public static final Object sBindingStateLock = new Object();
    private int[] mAllBindingStateCountsWhenDied;
    private final boolean mBindToCaller;
    private int mBindingState;
    private int mBindingStateCurrentOrWhenDied;
    public boolean mCleanExit;
    private ConnectionCallback mConnectionCallback;
    private ConnectionParams mConnectionParams;
    private boolean mDidOnServiceConnected;
    private int mGroup;
    private int mImportanceInGroup;
    private boolean mKilledByUs;
    public final Executor mLauncherExecutor;
    public final Handler mLauncherHandler;
    private MemoryPressureCallback mMemoryPressureCallback;
    private final ChildServiceConnection mModerateBinding;
    private int mModerateBindingCount;
    private int mPid;
    private IChildProcessService mService;
    private final Bundle mServiceBundle;
    private ServiceCallback mServiceCallback;
    private boolean mServiceConnectComplete;
    private boolean mServiceDisconnected;
    private final ComponentName mServiceName;
    private final ChildServiceConnection mStrongBinding;
    private int mStrongBindingCount;
    private boolean mUnbound;
    private final ChildServiceConnection mWaivedBinding;

    protected interface ChildServiceConnection {
        boolean bind();

        boolean isBound();

        void unbind();

        void updateGroupImportance(int i, int i2);
    }

    protected interface ChildServiceConnectionDelegate {
        void onServiceConnected(IBinder iBinder);

        void onServiceDisconnected();
    }

    protected interface ChildServiceConnectionFactory {
        ChildServiceConnection createConnection(Intent intent, int i, ChildServiceConnectionDelegate childServiceConnectionDelegate, String str);
    }

    static class ChildServiceConnectionImpl implements ServiceConnection, ChildServiceConnection {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int mBindFlags;
        private final Intent mBindIntent;
        private boolean mBound;
        private final Context mContext;
        private final ChildServiceConnectionDelegate mDelegate;
        private final Executor mExecutor;
        private final Handler mHandler;
        private final String mInstanceName;

        static {
            Class<ChildProcessConnection> cls = ChildProcessConnection.class;
        }

        public boolean isBound() {
            return this.mBound;
        }

        public void unbind() {
            if (this.mBound) {
                this.mContext.unbindService(this);
                this.mBound = false;
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean bind() {
            try {
                TraceEvent.begin("ChildProcessConnection.ChildServiceConnectionImpl.bind");
                this.mBound = BindService.doBindService(this.mContext, this.mBindIntent, this, this.mBindFlags, this.mHandler, this.mExecutor, this.mInstanceName);
                TraceEvent.end("ChildProcessConnection.ChildServiceConnectionImpl.bind");
                return this.mBound;
            } catch (Throwable th) {
                TraceEvent.end("ChildProcessConnection.ChildServiceConnectionImpl.bind");
                throw th;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.mDelegate.onServiceDisconnected();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mDelegate.onServiceConnected(iBinder);
        }

        public void updateGroupImportance(int i, int i2) {
            if (BindService.supportVariableConnections()) {
                BindService.updateServiceGroup(this.mContext, this, i, i2);
                BindService.doBindService(this.mContext, this.mBindIntent, this, this.mBindFlags, this.mHandler, this.mExecutor, this.mInstanceName);
            }
        }

        private ChildServiceConnectionImpl(Context context, Intent intent, int i, Handler handler, Executor executor, ChildServiceConnectionDelegate childServiceConnectionDelegate, String str) {
            this.mContext = context;
            this.mBindIntent = intent;
            this.mBindFlags = i;
            this.mHandler = handler;
            this.mExecutor = executor;
            this.mDelegate = childServiceConnectionDelegate;
            this.mInstanceName = str;
        }
    }

    public interface ConnectionCallback {
        void onConnected(ChildProcessConnection childProcessConnection);
    }

    static class ConnectionParams {
        final List<IBinder> mClientInterfaces;
        final Bundle mConnectionBundle;

        ConnectionParams(Bundle bundle, List<IBinder> list) {
            this.mConnectionBundle = bundle;
            this.mClientInterfaces = list;
        }
    }

    public interface ServiceCallback {
        void onChildProcessDied(ChildProcessConnection childProcessConnection);

        void onChildStartFailed(ChildProcessConnection childProcessConnection);

        void onChildStarted();
    }

    public boolean didOnServiceConnectedForTesting() {
        return this.mDidOnServiceConnected;
    }

    public int getGroup() {
        return this.mGroup;
    }

    public int getImportanceInGroup() {
        return this.mImportanceInGroup;
    }

    /* access modifiers changed from: protected */
    public Handler getLauncherHandler() {
        return this.mLauncherHandler;
    }

    public int getPid() {
        return this.mPid;
    }

    public final IChildProcessService getService() {
        return this.mService;
    }

    public final ComponentName getServiceName() {
        return this.mServiceName;
    }

    public static boolean supportVariableConnections() {
        return BindService.supportVariableConnections();
    }

    public void crashServiceForTesting() {
        try {
            this.mService.forceKill();
        } catch (RemoteException unused) {
        }
    }

    public boolean isConnected() {
        if (this.mService != null) {
            return true;
        }
        return false;
    }

    public boolean isModerateBindingBound() {
        return this.mModerateBinding.isBound();
    }

    public boolean isStrongBindingBound() {
        return this.mStrongBinding.isBound();
    }

    public void rebind() {
        this.mWaivedBinding.bind();
    }

    public void stop() {
        unbind();
        notifyChildProcessDied();
    }

    private boolean isRunningOnLauncherThread() {
        if (this.mLauncherHandler.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private void notifyChildProcessDied() {
        if (this.mServiceCallback != null) {
            ServiceCallback serviceCallback = this.mServiceCallback;
            this.mServiceCallback = null;
            serviceCallback.onChildProcessDied(this);
        }
    }

    public int bindingStateCurrentOrWhenDied() {
        int i;
        synchronized (sBindingStateLock) {
            i = this.mBindingStateCurrentOrWhenDied;
        }
        return i;
    }

    public boolean hasCleanExit() {
        boolean z;
        synchronized (sBindingStateLock) {
            z = this.mCleanExit;
        }
        return z;
    }

    public boolean isKilledByUs() {
        boolean z;
        synchronized (sBindingStateLock) {
            z = this.mKilledByUs;
        }
        return z;
    }

    static void resetBindingStateCountsForTesting() {
        synchronized (sBindingStateLock) {
            int i = 0;
            while (i < 4) {
                try {
                    sAllBindingStateCounts[i] = 0;
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void dumpProcessStack() {
        IChildProcessService iChildProcessService = this.mService;
        if (iChildProcessService != null) {
            try {
                iChildProcessService.dumpProcessStack();
            } catch (RemoteException e) {
                Log.m146394e("ChildProcessConn", "Failed to dump process stack.", e);
            }
        }
    }

    public void kill() {
        IChildProcessService iChildProcessService = this.mService;
        unbind();
        if (iChildProcessService != null) {
            try {
                iChildProcessService.forceKill();
            } catch (RemoteException unused) {
            }
        }
        synchronized (sBindingStateLock) {
            this.mKilledByUs = true;
        }
        notifyChildProcessDied();
    }

    private void doConnectionSetup() {
        try {
            TraceEvent.begin("ChildProcessConnection.doConnectionSetup");
            this.mService.setupConnection(this.mConnectionParams.mConnectionBundle, new Stub() {
                public void reportCleanExit() {
                    synchronized (ChildProcessConnection.sBindingStateLock) {
                        ChildProcessConnection.this.mCleanExit = true;
                    }
                    ChildProcessConnection.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            ChildProcessConnection.this.unbind();
                        }
                    });
                }

                public void sendPid(final int i) {
                    ChildProcessConnection.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            ChildProcessConnection.this.onSetupConnectionResult(i);
                        }
                    });
                }
            }, this.mConnectionParams.mClientInterfaces);
        } catch (RemoteException e) {
            Log.m146394e("ChildProcessConn", "Failed to setup connection.", e);
        } catch (Throwable th) {
            TraceEvent.end("ChildProcessConnection.doConnectionSetup");
            throw th;
        }
        this.mConnectionParams = null;
        TraceEvent.end("ChildProcessConnection.doConnectionSetup");
    }

    public void addModerateBinding() {
        if (!isConnected()) {
            Log.m146404w("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(getPid()));
            return;
        }
        if (this.mModerateBindingCount == 0) {
            this.mModerateBinding.bind();
            updateBindingState();
        }
        this.mModerateBindingCount++;
    }

    public void addStrongBinding() {
        if (!isConnected()) {
            Log.m146404w("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(getPid()));
            return;
        }
        if (this.mStrongBindingCount == 0) {
            this.mStrongBinding.bind();
            updateBindingState();
        }
        this.mStrongBindingCount++;
    }

    /* access modifiers changed from: protected */
    public void onServiceDisconnectedOnLauncherThread() {
        if (!this.mServiceDisconnected) {
            this.mServiceDisconnected = true;
            Log.m146404w("ChildProcessConn", "onServiceDisconnected (crash or killed by oom): pid=%d", Integer.valueOf(this.mPid));
            stop();
            if (this.mConnectionCallback != null) {
                this.mConnectionCallback.onConnected(null);
                this.mConnectionCallback = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] remainingBindingStateCountsCurrentOrWhenDied() {
        /*
            r4 = this;
            java.lang.Object r0 = sBindingStateLock
            monitor-enter(r0)
            int[] r1 = r4.mAllBindingStateCountsWhenDied     // Catch:{ all -> 0x0024 }
            r2 = 4
            if (r1 == 0) goto L_0x0010
            int[] r1 = r4.mAllBindingStateCountsWhenDied     // Catch:{ all -> 0x0024 }
            int[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x0010:
            int[] r1 = sAllBindingStateCounts     // Catch:{ all -> 0x0024 }
            int[] r1 = java.util.Arrays.copyOf(r1, r2)     // Catch:{ all -> 0x0024 }
            int r2 = r4.mBindingState     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0022
            int r2 = r4.mBindingState     // Catch:{ all -> 0x0024 }
            r3 = r1[r2]     // Catch:{ all -> 0x0024 }
            int r3 = r3 + -1
            r1[r2] = r3     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.process_launcher.ChildProcessConnection.remainingBindingStateCountsCurrentOrWhenDied():int[]");
    }

    public void removeModerateBinding() {
        if (!isConnected()) {
            Log.m146404w("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(getPid()));
            return;
        }
        this.mModerateBindingCount--;
        if (this.mModerateBindingCount == 0) {
            this.mModerateBinding.unbind();
            updateBindingState();
        }
    }

    public void removeStrongBinding() {
        if (!isConnected()) {
            Log.m146404w("ChildProcessConn", "The connection is not bound for %d", Integer.valueOf(getPid()));
            return;
        }
        this.mStrongBindingCount--;
        if (this.mStrongBindingCount == 0) {
            this.mStrongBinding.unbind();
            updateBindingState();
        }
    }

    /* access modifiers changed from: protected */
    public void unbind() {
        this.mService = null;
        this.mConnectionParams = null;
        this.mUnbound = true;
        this.mStrongBinding.unbind();
        this.mWaivedBinding.unbind();
        this.mModerateBinding.unbind();
        updateBindingState();
        synchronized (sBindingStateLock) {
            this.mAllBindingStateCountsWhenDied = Arrays.copyOf(sAllBindingStateCounts, 4);
        }
        if (this.mMemoryPressureCallback != null) {
            ThreadUtils.postOnUiThread((Runnable) new ChildProcessConnection$$Lambda$3(this.mMemoryPressureCallback));
            this.mMemoryPressureCallback = null;
        }
    }

    private void updateBindingState() {
        int i;
        if (this.mUnbound) {
            i = 0;
        } else if (this.mStrongBinding.isBound()) {
            i = 3;
        } else if (this.mModerateBinding.isBound()) {
            i = 2;
        } else {
            i = 1;
        }
        synchronized (sBindingStateLock) {
            if (i != this.mBindingState) {
                if (this.mBindingState != 0) {
                    int[] iArr = sAllBindingStateCounts;
                    int i2 = this.mBindingState;
                    iArr[i2] = iArr[i2] - 1;
                }
                if (i != 0) {
                    int[] iArr2 = sAllBindingStateCounts;
                    iArr2[i] = iArr2[i] + 1;
                }
            }
            this.mBindingState = i;
            if (!this.mUnbound) {
                this.mBindingStateCurrentOrWhenDied = this.mBindingState;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$ChildProcessConnection(Runnable runnable) {
        this.mLauncherHandler.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: onMemoryPressure */
    public void bridge$lambda$0$ChildProcessConnection(int i) {
        this.mLauncherHandler.post(new ChildProcessConnection$$Lambda$4(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onMemoryPressureOnLauncherThread */
    public void lambda$onMemoryPressure$3$ChildProcessConnection(int i) {
        if (this.mService != null) {
            try {
                this.mService.onMemoryPressure(i);
            } catch (RemoteException unused) {
            }
        }
    }

    private boolean bind(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mStrongBinding.bind();
        } else {
            this.mModerateBindingCount++;
            z2 = this.mModerateBinding.bind();
        }
        if (!z2) {
            return false;
        }
        this.mWaivedBinding.bind();
        updateBindingState();
        return true;
    }

    public void onSetupConnectionResult(int i) {
        if (this.mPid != 0) {
            Log.m146394e("ChildProcessConn", "sendPid was called more than once: pid=%d", Integer.valueOf(this.mPid));
            return;
        }
        this.mPid = i;
        if (this.mConnectionCallback != null) {
            this.mConnectionCallback.onConnected(this);
        }
        this.mConnectionCallback = null;
    }

    /* access modifiers changed from: protected */
    public void onServiceConnectedOnLauncherThread(IBinder iBinder) {
        if (!this.mDidOnServiceConnected) {
            try {
                TraceEvent.begin("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
                this.mDidOnServiceConnected = true;
                this.mService = IChildProcessService.Stub.asInterface(iBinder);
                if (this.mBindToCaller) {
                    if (!this.mService.bindToCaller()) {
                        if (this.mServiceCallback != null) {
                            this.mServiceCallback.onChildStartFailed(this);
                        }
                        unbind();
                        return;
                    }
                }
                if (this.mServiceCallback != null) {
                    this.mServiceCallback.onChildStarted();
                }
                this.mServiceConnectComplete = true;
                if (this.mMemoryPressureCallback == null) {
                    ChildProcessConnection$$Lambda$1 childProcessConnection$$Lambda$1 = new ChildProcessConnection$$Lambda$1(this);
                    ThreadUtils.postOnUiThread((Runnable) new ChildProcessConnection$$Lambda$2(childProcessConnection$$Lambda$1));
                    this.mMemoryPressureCallback = childProcessConnection$$Lambda$1;
                }
                if (this.mConnectionParams != null) {
                    doConnectionSetup();
                }
            } catch (RemoteException e) {
                Log.m146394e("ChildProcessConn", "Failed to bind service to connection.", e);
            } finally {
                TraceEvent.end("ChildProcessConnection.ChildServiceConnection.onServiceConnected");
            }
        }
    }

    public void updateGroupImportance(int i, int i2) {
        if (this.mGroup != i || this.mImportanceInGroup != i2) {
            this.mGroup = i;
            this.mImportanceInGroup = i2;
            this.mWaivedBinding.updateGroupImportance(i, i2);
        }
    }

    public void start(boolean z, ServiceCallback serviceCallback) {
        try {
            TraceEvent.begin("ChildProcessConnection.start");
            this.mServiceCallback = serviceCallback;
            if (!bind(z)) {
                Log.m146394e("ChildProcessConn", "Failed to establish the service connection.", new Object[0]);
                notifyChildProcessDied();
            }
        } finally {
            TraceEvent.end("ChildProcessConnection.start");
        }
    }

    public void setupConnection(Bundle bundle, List<IBinder> list, ConnectionCallback connectionCallback) {
        if (this.mServiceDisconnected) {
            Log.m146404w("ChildProcessConn", "Tried to setup a connection that already disconnected.", new Object[0]);
            connectionCallback.onConnected(null);
            return;
        }
        try {
            TraceEvent.begin("ChildProcessConnection.setupConnection");
            this.mConnectionCallback = connectionCallback;
            this.mConnectionParams = new ConnectionParams(bundle, list);
            if (this.mServiceConnectComplete) {
                doConnectionSetup();
            }
        } finally {
            TraceEvent.end("ChildProcessConnection.setupConnection");
        }
    }

    public ChildProcessConnection(Context context, ComponentName componentName, boolean z, boolean z2, Bundle bundle, String str) {
        this(context, componentName, z, z2, bundle, null, str);
    }

    public ChildProcessConnection(final Context context, ComponentName componentName, boolean z, boolean z2, Bundle bundle, ChildServiceConnectionFactory childServiceConnectionFactory, String str) {
        Bundle bundle2;
        int i;
        this.mLauncherHandler = new Handler();
        this.mLauncherExecutor = new ChildProcessConnection$$Lambda$0(this);
        this.mServiceName = componentName;
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle();
        }
        this.mServiceBundle = bundle2;
        this.mServiceBundle.putBoolean("org.chromium.base.process_launcher.extra.bind_to_caller", z);
        this.mBindToCaller = z;
        if (childServiceConnectionFactory == null) {
            childServiceConnectionFactory = new ChildServiceConnectionFactory() {
                public ChildServiceConnection createConnection(Intent intent, int i, ChildServiceConnectionDelegate childServiceConnectionDelegate, String str) {
                    ChildServiceConnectionImpl childServiceConnectionImpl = new ChildServiceConnectionImpl(context, intent, i, ChildProcessConnection.this.mLauncherHandler, ChildProcessConnection.this.mLauncherExecutor, childServiceConnectionDelegate, str);
                    return childServiceConnectionImpl;
                }
            };
        }
        C466172 r3 = new ChildServiceConnectionDelegate() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void lambda$onServiceDisconnected$1$ChildProcessConnection$2() {
                ChildProcessConnection.this.onServiceDisconnectedOnLauncherThread();
            }

            public void onServiceDisconnected() {
                if (ChildProcessConnection.this.mLauncherHandler.getLooper() == Looper.myLooper()) {
                    ChildProcessConnection.this.onServiceDisconnectedOnLauncherThread();
                } else {
                    ChildProcessConnection.this.mLauncherHandler.post(new ChildProcessConnection$2$$Lambda$1(this));
                }
            }

            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void lambda$onServiceConnected$0$ChildProcessConnection$2(IBinder iBinder) {
                ChildProcessConnection.this.onServiceConnectedOnLauncherThread(iBinder);
            }

            public void onServiceConnected(IBinder iBinder) {
                if (ChildProcessConnection.this.mLauncherHandler.getLooper() == Looper.myLooper()) {
                    ChildProcessConnection.this.onServiceConnectedOnLauncherThread(iBinder);
                } else {
                    ChildProcessConnection.this.mLauncherHandler.post(new ChildProcessConnection$2$$Lambda$0(this, iBinder));
                }
            }
        };
        Intent intent = new Intent();
        intent.setComponent(componentName);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (z2) {
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        int i2 = i | 1;
        this.mModerateBinding = childServiceConnectionFactory.createConnection(intent, i2, r3, str);
        this.mStrongBinding = childServiceConnectionFactory.createConnection(intent, i2 | 64, r3, str);
        this.mWaivedBinding = childServiceConnectionFactory.createConnection(intent, i2 | 32, r3, str);
    }
}
