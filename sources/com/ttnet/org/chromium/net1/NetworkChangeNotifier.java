package com.ttnet.org.chromium.net1;

import android.content.Context;
import com.ttnet.org.chromium.base1.ObserverList;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import com.ttnet.org.chromium.base1.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net1.NetworkChangeNotifierAutoDetect.Observer;
import com.ttnet.org.chromium.net1.NetworkChangeNotifierAutoDetect.RegistrationPolicy;
import java.util.ArrayList;
import java.util.Iterator;

@JNINamespace("net")
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private final ObserverList<ConnectionTypeObserver> mConnectionTypeObservers;
    private final Context mContext;
    private int mCurrentConnectionType;
    private double mCurrentMaxBandwidth = Double.POSITIVE_INFINITY;
    private int mMaxBandwidthConnectionType = this.mCurrentConnectionType;
    private final ArrayList<Long> mNativeChangeNotifiers;

    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    private static native double nativeGetMaxBandwidthForConnectionSubtype(int i);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    @NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
    private native void nativeNotifyMaxBandwidthChanged(long j, double d);

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

    public double getCurrentMaxBandwidthInMbps() {
        return this.mCurrentMaxBandwidth;
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

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != 6) {
            return true;
        }
        return false;
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

    public int getCurrentConnectionSubtype() {
        if (this.mAutoDetector == null) {
            return 0;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionSubtype(this.mAutoDetector.getCurrentNetworkState());
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

    public static double getMaxBandwidthForConnectionSubtype(int i) {
        return nativeGetMaxBandwidthForConnectionSubtype(i);
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

    public static void fakeMaxBandwidthChanged(double d) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfMaxBandwidthChange(d);
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

    public static NetworkChangeNotifier init(Context context) {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier(context);
        }
        return sInstance;
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

    protected NetworkChangeNotifier(Context context) {
        this.mContext = context.getApplicationContext();
        this.mNativeChangeNotifiers = new ArrayList<>();
        this.mConnectionTypeObservers = new ObserverList<>();
    }

    private void forceConnectivityStateInternal(boolean z) {
        boolean z2;
        double d;
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
            if (z) {
                d = Double.POSITIVE_INFINITY;
            } else {
                d = 0.0d;
            }
            updateCurrentMaxBandwidth(d);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    /* access modifiers changed from: 0000 */
    public void notifyObserversOfMaxBandwidthChange(double d) {
        Iterator it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            nativeNotifyMaxBandwidthChanged(((Long) it.next()).longValue(), d);
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

    public void updateCurrentMaxBandwidth(double d) {
        if (d != this.mCurrentMaxBandwidth || this.mCurrentConnectionType != this.mMaxBandwidthConnectionType) {
            this.mCurrentMaxBandwidth = d;
            this.mMaxBandwidthConnectionType = this.mCurrentConnectionType;
            notifyObserversOfMaxBandwidthChange(d);
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
                public void onConnectionTypeChanged(int i) {
                    NetworkChangeNotifier.this.updateCurrentConnectionType(i);
                }

                public void onMaxBandwidthChanged(double d) {
                    NetworkChangeNotifier.this.updateCurrentMaxBandwidth(d);
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
            }, this.mContext, registrationPolicy);
            NetworkState currentNetworkState = this.mAutoDetector.getCurrentNetworkState();
            updateCurrentConnectionType(NetworkChangeNotifierAutoDetect.convertToConnectionType(currentNetworkState));
            updateCurrentMaxBandwidth(this.mAutoDetector.getCurrentMaxBandwidthInMbps(currentNetworkState));
        }
    }
}
