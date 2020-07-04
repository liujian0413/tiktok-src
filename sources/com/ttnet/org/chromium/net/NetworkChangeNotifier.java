package com.ttnet.org.chromium.net;

import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.ObserverList;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.base.compat.ApiHelperForM;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.Observer;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy;
import java.util.ArrayList;
import java.util.Iterator;

@JNINamespace("net")
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private final ObserverList<ConnectionTypeObserver> mConnectionTypeObservers = new ObserverList<>();
    private final ConnectivityManager mConnectivityManager = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity"));
    private int mCurrentConnectionType;
    private final ArrayList<Long> mNativeChangeNotifiers = new ArrayList<>();

    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static boolean isInitialized() {
        if (sInstance != null) {
            return true;
        }
        return false;
    }

    private void destroyAutoDetector() {
        if (this.mAutoDetector != null) {
            this.mAutoDetector.destroy();
            this.mAutoDetector = null;
        }
    }

    public static NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != 6) {
            return true;
        }
        return false;
    }

    public static boolean isProcessBoundToNetwork() {
        return getInstance().isProcessBoundToNetworkInternal();
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public long getCurrentDefaultNetId() {
        if (this.mAutoDetector == null) {
            return -1;
        }
        return this.mAutoDetector.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        if (this.mAutoDetector == null) {
            return new long[0];
        }
        return this.mAutoDetector.getNetworksAndTypes();
    }

    public boolean registerNetworkCallbackFailed() {
        if (this.mAutoDetector == null) {
            return false;
        }
        return this.mAutoDetector.registerNetworkCallbackFailed();
    }

    protected NetworkChangeNotifier() {
    }

    public int getCurrentConnectionSubtype() {
        if (this.mAutoDetector == null) {
            return 0;
        }
        return this.mAutoDetector.getCurrentNetworkState().getConnectionSubtype();
    }

    private boolean isProcessBoundToNetworkInternal() {
        boolean z = false;
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        if (VERSION.SDK_INT < 23) {
            if (ConnectivityManager.getProcessDefaultNetwork() != null) {
                z = true;
            }
            return z;
        } else if (ApiHelperForM.getBoundNetworkForProcess(this.mConnectivityManager) != null) {
            return true;
        } else {
            return false;
        }
    }

    static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.addObserver(connectionTypeObserver);
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.removeObserver(connectionTypeObserver);
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }

    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i);
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    public static void setAutoDetectConnectivityState(RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }

    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    private void forceConnectivityStateInternal(boolean z) {
        boolean z2;
        int i = 0;
        if (this.mCurrentConnectionType != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 6;
            }
            updateCurrentConnectionType(i);
            notifyObserversOfConnectionSubtypeChange(z ^ true ? 1 : 0);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfConnectionSubtypeChange(int i) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyMaxBandwidthChanged(((Long) it.next()).longValue(), i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfNetworkDisconnect(long j) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(((Long) it.next()).longValue(), j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfNetworkSoonToDisconnect(long j) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkSoonToDisconnect(((Long) it.next()).longValue(), j);
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyPurgeActiveNetworkList(((Long) it.next()).longValue(), jArr);
        }
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfNetworkConnect(long j, int i) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(((Long) it.next()).longValue(), j, i);
        }
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(((Long) it.next()).longValue(), i, j);
        }
        Iterator it2 = this.mConnectionTypeObservers.iterator();
        while (it2.hasNext()) {
            ((ConnectionTypeObserver) it2.next()).onConnectionTypeChanged(i);
        }
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, RegistrationPolicy registrationPolicy) {
        if (!z) {
            destroyAutoDetector();
        } else if (this.mAutoDetector == null) {
            this.mAutoDetector = new NetworkChangeNotifierAutoDetect(new Observer() {
                public void onConnectionSubtypeChanged(int i) {
                    NetworkChangeNotifier.this.notifyObserversOfConnectionSubtypeChange(i);
                }

                public void onConnectionTypeChanged(int i) {
                    NetworkChangeNotifier.this.updateCurrentConnectionType(i);
                }

                public void onNetworkDisconnect(long j) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkDisconnect(j);
                }

                public void onNetworkSoonToDisconnect(long j) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkSoonToDisconnect(j);
                }

                public void purgeActiveNetworkList(long[] jArr) {
                    NetworkChangeNotifier.this.notifyObserversToPurgeActiveNetworkList(jArr);
                }

                public void onNetworkConnect(long j, int i) {
                    NetworkChangeNotifier.this.notifyObserversOfNetworkConnect(j, i);
                }
            }, registrationPolicy);
            NetworkState currentNetworkState = this.mAutoDetector.getCurrentNetworkState();
            updateCurrentConnectionType(currentNetworkState.getConnectionType());
            notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
        }
    }
}
