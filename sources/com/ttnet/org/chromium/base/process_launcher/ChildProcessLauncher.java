package com.ttnet.org.chromium.base.process_launcher;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.process_launcher.ChildProcessConnection.ConnectionCallback;
import com.ttnet.org.chromium.base.process_launcher.ChildProcessConnection.ServiceCallback;
import java.io.IOException;
import java.util.List;

public class ChildProcessLauncher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final List<IBinder> mClientInterfaces;
    private final String[] mCommandLine;
    public ChildProcessConnection mConnection;
    private final ChildConnectionAllocator mConnectionAllocator;
    private final Delegate mDelegate;
    private final FileDescriptorInfo[] mFilesToBeMapped;
    public final Handler mLauncherHandler;

    public static abstract class Delegate {
        public ChildProcessConnection getBoundConnection(ChildConnectionAllocator childConnectionAllocator, ServiceCallback serviceCallback) {
            return null;
        }

        public void onBeforeConnectionAllocated(Bundle bundle) {
        }

        public void onBeforeConnectionSetup(Bundle bundle) {
        }

        public void onConnectionEstablished(ChildProcessConnection childProcessConnection) {
        }

        public void onConnectionLost(ChildProcessConnection childProcessConnection) {
        }
    }

    public List<IBinder> getClientInterfaces() {
        return this.mClientInterfaces;
    }

    public ChildProcessConnection getConnection() {
        return this.mConnection;
    }

    public ChildConnectionAllocator getConnectionAllocator() {
        return this.mConnectionAllocator;
    }

    public int getPid() {
        if (this.mConnection == null) {
            return 0;
        }
        return this.mConnection.getPid();
    }

    public boolean isRunningOnLauncherThread() {
        if (this.mLauncherHandler.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void onChildProcessDied() {
        if (getPid() != 0) {
            this.mDelegate.onConnectionLost(this.mConnection);
        }
    }

    private Bundle createConnectionBundle() {
        Bundle bundle = new Bundle();
        bundle.putStringArray("org.chromium.base.process_launcher.extra.command_line", this.mCommandLine);
        bundle.putParcelableArray("org.chromium.base.process_launcher.extra.extraFiles", this.mFilesToBeMapped);
        return bundle;
    }

    private void setupConnection() {
        C466232 r0 = new ConnectionCallback() {
            public void onConnected(ChildProcessConnection childProcessConnection) {
                ChildProcessLauncher.this.onServiceConnected(childProcessConnection);
            }
        };
        Bundle createConnectionBundle = createConnectionBundle();
        this.mDelegate.onBeforeConnectionSetup(createConnectionBundle);
        this.mConnection.setupConnection(createConnectionBundle, getClientInterfaces(), r0);
    }

    public void stop() {
        Log.m146387d("ChildProcLauncher", "stopping child connection: pid=%d", Integer.valueOf(this.mConnection.getPid()));
        this.mConnection.stop();
    }

    public void onServiceConnected(ChildProcessConnection childProcessConnection) {
        Log.m146387d("ChildProcLauncher", "on connect callback, pid=%d", Integer.valueOf(this.mConnection.getPid()));
        this.mDelegate.onConnectionEstablished(this.mConnection);
        try {
            for (FileDescriptorInfo fileDescriptorInfo : this.mFilesToBeMapped) {
                fileDescriptorInfo.f120073fd.close();
            }
        } catch (IOException e) {
            Log.m146404w("ChildProcLauncher", "Failed to close FD.", e);
        }
    }

    public boolean start(final boolean z, final boolean z2) {
        try {
            TraceEvent.begin("ChildProcessLauncher.start");
            C466211 r0 = new ServiceCallback() {
                static final /* synthetic */ boolean $assertionsDisabled = false;

                static {
                    Class<ChildProcessLauncher> cls = ChildProcessLauncher.class;
                }

                public void onChildStarted() {
                }

                public void onChildProcessDied(ChildProcessConnection childProcessConnection) {
                    ChildProcessLauncher.this.onChildProcessDied();
                }

                public void onChildStartFailed(ChildProcessConnection childProcessConnection) {
                    Log.m146394e("ChildProcLauncher", "ChildProcessConnection.start failed, trying again", new Object[0]);
                    ChildProcessLauncher.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            ChildProcessLauncher.this.mConnection = null;
                            ChildProcessLauncher.this.start(z, z2);
                        }
                    });
                }
            };
            this.mConnection = this.mDelegate.getBoundConnection(this.mConnectionAllocator, r0);
            if (this.mConnection != null) {
                setupConnection();
                return true;
            } else if (lambda$allocateAndSetupConnection$0$ChildProcessLauncher(r0, z, z2) || z2) {
                TraceEvent.end("ChildProcessLauncher.start");
                return true;
            } else {
                TraceEvent.end("ChildProcessLauncher.start");
                return false;
            }
        } finally {
            TraceEvent.end("ChildProcessLauncher.start");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: allocateAndSetupConnection */
    public boolean lambda$allocateAndSetupConnection$0$ChildProcessLauncher(ServiceCallback serviceCallback, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        this.mDelegate.onBeforeConnectionAllocated(bundle);
        this.mConnection = this.mConnectionAllocator.allocate(ContextUtils.getApplicationContext(), bundle, serviceCallback);
        if (this.mConnection != null) {
            if (z) {
                setupConnection();
            }
            return true;
        } else if (!z2) {
            Log.m146386d("ChildProcLauncher", "Failed to allocate a child connection (no queuing).");
            return false;
        } else {
            this.mConnectionAllocator.queueAllocation(new ChildProcessLauncher$$Lambda$0(this, serviceCallback, z, z2));
            return false;
        }
    }

    public ChildProcessLauncher(Handler handler, Delegate delegate, String[] strArr, FileDescriptorInfo[] fileDescriptorInfoArr, ChildConnectionAllocator childConnectionAllocator, List<IBinder> list) {
        this.mLauncherHandler = handler;
        isRunningOnLauncherThread();
        this.mCommandLine = strArr;
        this.mConnectionAllocator = childConnectionAllocator;
        this.mDelegate = delegate;
        this.mFilesToBeMapped = fileDescriptorInfoArr;
        this.mClientInterfaces = list;
    }
}
