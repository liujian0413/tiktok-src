package com.ttnet.org.chromium.base.process_launcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.process_launcher.ChildProcessConnection.ServiceCallback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public abstract class ChildConnectionAllocator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final boolean mBindAsExternalService;
    final boolean mBindToCaller;
    ConnectionFactory mConnectionFactory;
    public final Handler mLauncherHandler;
    final String mPackageName;
    final String mServiceClassName;
    private final boolean mUseStrongBinding;

    public interface ConnectionFactory {
        ChildProcessConnection createConnection(Context context, ComponentName componentName, boolean z, boolean z2, Bundle bundle, String str);
    }

    static class ConnectionFactoryImpl implements ConnectionFactory {
        private ConnectionFactoryImpl() {
        }

        public ChildProcessConnection createConnection(Context context, ComponentName componentName, boolean z, boolean z2, Bundle bundle, String str) {
            ChildProcessConnection childProcessConnection = new ChildProcessConnection(context, componentName, z, z2, bundle, str);
            return childProcessConnection;
        }
    }

    public static class FixedSizeAllocatorImpl extends ChildConnectionAllocator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final ChildProcessConnection[] mChildProcessConnections;
        private final ArrayList<Integer> mFreeConnectionIndices;
        private final Runnable mFreeSlotCallback;
        private final Queue<Runnable> mPendingAllocations;

        static {
            Class<ChildConnectionAllocator> cls = ChildConnectionAllocator.class;
        }

        public int getNumberOfServices() {
            return this.mChildProcessConnections.length;
        }

        public int allocatedConnectionsCountForTesting() {
            return this.mChildProcessConnections.length - this.mFreeConnectionIndices.size();
        }

        public boolean anyConnectionAllocated() {
            if (this.mFreeConnectionIndices.size() < this.mChildProcessConnections.length) {
                return true;
            }
            return false;
        }

        public boolean isFreeConnectionAvailable() {
            if (!this.mFreeConnectionIndices.isEmpty()) {
                return true;
            }
            return false;
        }

        public ChildProcessConnection getChildProcessConnectionAtSlotForTesting(int i) {
            return this.mChildProcessConnections[i];
        }

        /* access modifiers changed from: 0000 */
        public void doQueueAllocation(Runnable runnable) {
            boolean isEmpty = this.mPendingAllocations.isEmpty();
            this.mPendingAllocations.add(runnable);
            if (isEmpty && this.mFreeSlotCallback != null) {
                this.mFreeSlotCallback.run();
            }
        }

        /* access modifiers changed from: 0000 */
        public void doFree(ChildProcessConnection childProcessConnection) {
            int indexOf = Arrays.asList(this.mChildProcessConnections).indexOf(childProcessConnection);
            if (indexOf == -1) {
                Log.m146394e("ChildConnAllocator", "Unable to find connection to free.", new Object[0]);
            } else {
                this.mChildProcessConnections[indexOf] = null;
                this.mFreeConnectionIndices.add(Integer.valueOf(indexOf));
                Log.m146388d("ChildConnAllocator", "Allocator freed a connection, name: %s, slot: %d", this.mServiceClassName, Integer.valueOf(indexOf));
            }
            if (!this.mPendingAllocations.isEmpty()) {
                ((Runnable) this.mPendingAllocations.remove()).run();
                if (!this.mPendingAllocations.isEmpty() && this.mFreeSlotCallback != null) {
                    this.mFreeSlotCallback.run();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public ChildProcessConnection doAllocate(Context context, Bundle bundle) {
            if (this.mFreeConnectionIndices.isEmpty()) {
                Log.m146386d("ChildConnAllocator", "Ran out of services to allocate.");
                return null;
            }
            int intValue = ((Integer) this.mFreeConnectionIndices.remove(0)).intValue();
            String str = this.mPackageName;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mServiceClassName);
            sb.append(intValue);
            ComponentName componentName = new ComponentName(str, sb.toString());
            ChildProcessConnection createConnection = this.mConnectionFactory.createConnection(context, componentName, this.mBindToCaller, this.mBindAsExternalService, bundle, null);
            this.mChildProcessConnections[intValue] = createConnection;
            Log.m146388d("ChildConnAllocator", "Allocator allocated and bound a connection, name: %s, slot: %d", this.mServiceClassName, Integer.valueOf(intValue));
            return createConnection;
        }

        private FixedSizeAllocatorImpl(Handler handler, Runnable runnable, String str, String str2, boolean z, boolean z2, boolean z3, int i) {
            int i2 = i;
            super(handler, str, str2, z, z2, z3);
            this.mPendingAllocations = new ArrayDeque();
            this.mFreeSlotCallback = runnable;
            this.mChildProcessConnections = new ChildProcessConnection[i2];
            this.mFreeConnectionIndices = new ArrayList<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.mFreeConnectionIndices.add(Integer.valueOf(i3));
            }
        }
    }

    static class VariableSizeAllocatorImpl extends ChildConnectionAllocator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final C0888a<ChildProcessConnection> mAllocatedConnections;
        private int mNextInstance;

        static {
            Class<ChildConnectionAllocator> cls = ChildConnectionAllocator.class;
        }

        /* access modifiers changed from: 0000 */
        public void doQueueAllocation(Runnable runnable) {
        }

        public int getNumberOfServices() {
            return -1;
        }

        public int allocatedConnectionsCountForTesting() {
            return this.mAllocatedConnections.size();
        }

        public boolean anyConnectionAllocated() {
            if (this.mAllocatedConnections.size() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void doFree(ChildProcessConnection childProcessConnection) {
            this.mAllocatedConnections.remove(childProcessConnection);
        }

        /* access modifiers changed from: 0000 */
        public ChildProcessConnection doAllocate(Context context, Bundle bundle) {
            ComponentName componentName = new ComponentName(this.mPackageName, this.mServiceClassName);
            String num = Integer.toString(this.mNextInstance);
            this.mNextInstance++;
            ChildProcessConnection createConnection = this.mConnectionFactory.createConnection(context, componentName, this.mBindToCaller, this.mBindAsExternalService, bundle, num);
            this.mAllocatedConnections.add(createConnection);
            return createConnection;
        }

        private VariableSizeAllocatorImpl(Handler handler, String str, String str2, boolean z, boolean z2, boolean z3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("0");
            super(handler, str, sb.toString(), z, z2, z3);
            this.mAllocatedConnections = new C0888a<>();
        }
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m146427x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public abstract int allocatedConnectionsCountForTesting();

    public abstract boolean anyConnectionAllocated();

    /* access modifiers changed from: 0000 */
    public abstract ChildProcessConnection doAllocate(Context context, Bundle bundle);

    /* access modifiers changed from: 0000 */
    public abstract void doFree(ChildProcessConnection childProcessConnection);

    /* access modifiers changed from: 0000 */
    public abstract void doQueueAllocation(Runnable runnable);

    public abstract int getNumberOfServices();

    public boolean isRunningOnLauncherThread() {
        if (this.mLauncherHandler.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void free(ChildProcessConnection childProcessConnection) {
        doFree(childProcessConnection);
    }

    public void queueAllocation(Runnable runnable) {
        doQueueAllocation(runnable);
    }

    public void setConnectionFactoryForTesting(ConnectionFactory connectionFactory) {
        this.mConnectionFactory = connectionFactory;
    }

    public ChildProcessConnection allocate(Context context, Bundle bundle, final ServiceCallback serviceCallback) {
        ChildProcessConnection doAllocate = doAllocate(context, bundle);
        if (doAllocate == null) {
            return null;
        }
        doAllocate.start(this.mUseStrongBinding, new ServiceCallback() {
            static final /* synthetic */ boolean $assertionsDisabled = false;

            static {
                Class<ChildConnectionAllocator> cls = ChildConnectionAllocator.class;
            }

            public void onChildStarted() {
                if (serviceCallback != null) {
                    ChildConnectionAllocator.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            serviceCallback.onChildStarted();
                        }
                    });
                }
            }

            private void freeConnectionWithDelay(final ChildProcessConnection childProcessConnection) {
                ChildConnectionAllocator.this.mLauncherHandler.postDelayed(new Runnable() {
                    public void run() {
                        ChildConnectionAllocator.this.free(childProcessConnection);
                    }
                }, 1);
            }

            public void onChildProcessDied(final ChildProcessConnection childProcessConnection) {
                if (serviceCallback != null) {
                    ChildConnectionAllocator.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            serviceCallback.onChildProcessDied(childProcessConnection);
                        }
                    });
                }
                freeConnectionWithDelay(childProcessConnection);
            }

            public void onChildStartFailed(final ChildProcessConnection childProcessConnection) {
                if (serviceCallback != null) {
                    ChildConnectionAllocator.this.mLauncherHandler.post(new Runnable() {
                        public void run() {
                            serviceCallback.onChildStartFailed(childProcessConnection);
                        }
                    });
                }
                freeConnectionWithDelay(childProcessConnection);
            }
        });
        return doAllocate;
    }

    private static void checkServiceExists(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("0");
            packageManager.getServiceInfo(new ComponentName(str, sb.toString()), 0);
        } catch (NameNotFoundException unused) {
            throw new RuntimeException("Illegal meta data value: the child service doesn't exist");
        }
    }

    private ChildConnectionAllocator(Handler handler, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.mConnectionFactory = new ConnectionFactoryImpl();
        this.mLauncherHandler = handler;
        this.mPackageName = str;
        this.mServiceClassName = str2;
        this.mBindToCaller = z;
        this.mBindAsExternalService = z2;
        this.mUseStrongBinding = z3;
    }

    public static VariableSizeAllocatorImpl createVariableSizeForTesting(Handler handler, String str, String str2, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("0");
        VariableSizeAllocatorImpl variableSizeAllocatorImpl = new VariableSizeAllocatorImpl(handler, str, sb.toString(), z, z2, z3);
        return variableSizeAllocatorImpl;
    }

    public static FixedSizeAllocatorImpl createFixedForTesting(Runnable runnable, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        FixedSizeAllocatorImpl fixedSizeAllocatorImpl = new FixedSizeAllocatorImpl(new Handler(), runnable, str, str2, z, z2, z3, i);
        return fixedSizeAllocatorImpl;
    }

    public static ChildConnectionAllocator createVariableSize(Context context, Handler handler, String str, String str2, boolean z, boolean z2, boolean z3) {
        checkServiceExists(context, str, str2);
        VariableSizeAllocatorImpl variableSizeAllocatorImpl = new VariableSizeAllocatorImpl(handler, str, str2, z, z2, z3);
        return variableSizeAllocatorImpl;
    }

    public static ChildConnectionAllocator create(Context context, Handler handler, Runnable runnable, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        int i;
        String str4 = str;
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m146427x89c42dc8(context.getPackageManager(), str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData != null) {
                i = com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData.getInt(str3, -1);
            } else {
                i = -1;
            }
            if (i >= 0) {
                Context context2 = context;
                String str5 = str2;
                checkServiceExists(context, str, str2);
                FixedSizeAllocatorImpl fixedSizeAllocatorImpl = new FixedSizeAllocatorImpl(handler, runnable, str, str5, z, z2, z3, i);
                return fixedSizeAllocatorImpl;
            }
            throw new RuntimeException("Illegal meta data value for number of child services");
        } catch (NameNotFoundException unused) {
            throw new RuntimeException("Could not get application info.");
        }
    }
}
