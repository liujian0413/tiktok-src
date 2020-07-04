package org.webrtc;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.NetworkMonitorAutoDetect.ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect.NetworkInformation;
import org.webrtc.NetworkMonitorAutoDetect.Observer;

public class NetworkMonitor {
    private NetworkMonitorAutoDetect autoDetect;
    private final Object autoDetectLock;
    private volatile ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    static class InstanceHolder {
        static final NetworkMonitor instance = new NetworkMonitor();

        private InstanceHolder() {
        }
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(ConnectionType connectionType);
    }

    private static int androidSdkInt() {
        return VERSION.SDK_INT;
    }

    private ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static void init(Context context) {
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext());
    }

    private List<Long> getNativeNetworkObserversSync() {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != ConnectionType.CONNECTION_NONE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public NetworkMonitorAutoDetect getNetworkMonitorAutoDetect() {
        NetworkMonitorAutoDetect networkMonitorAutoDetect;
        synchronized (this.autoDetectLock) {
            networkMonitorAutoDetect = this.autoDetect;
        }
        return networkMonitorAutoDetect;
    }

    /* access modifiers changed from: 0000 */
    public int getNumObservers() {
        int i;
        synchronized (this.autoDetectLock) {
            i = this.numObservers;
        }
        return i;
    }

    private NetworkMonitor() {
        this.autoDetectLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = ConnectionType.CONNECTION_UNKNOWN;
    }

    private long getCurrentDefaultNetId() {
        long j;
        synchronized (this.autoDetectLock) {
            if (this.autoDetect == null) {
                j = -1;
            } else {
                j = this.autoDetect.getDefaultNetId();
            }
        }
        return j;
    }

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.autoDetectLock) {
            if (this.autoDetect == null || !this.autoDetect.supportNetworkCallback()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void stopMonitoring() {
        synchronized (this.autoDetectLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.autoDetect.destroy();
                this.autoDetect = null;
            }
        }
    }

    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    public void updateCurrentConnectionType(ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private static void assertIsTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected to be true");
        }
    }

    static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context) {
        NetworkMonitor instance = getInstance();
        NetworkMonitorAutoDetect createAutoDetect = instance.createAutoDetect(context);
        instance.autoDetect = createAutoDetect;
        return createAutoDetect;
    }

    private NetworkMonitorAutoDetect createAutoDetect(Context context) {
        return new NetworkMonitorAutoDetect(new Observer() {
            public void onConnectionTypeChanged(ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            public void onNetworkConnect(NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            public void onNetworkDisconnect(long j) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
            }
        }, context);
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void notifyObserversOfNetworkConnect(NetworkInformation networkInformation) {
        for (Long longValue : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkConnect(longValue.longValue(), networkInformation);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j) {
        for (Long longValue : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkDisconnect(longValue.longValue(), j);
        }
    }

    private void notifyObserversOfConnectionTypeChange(ConnectionType connectionType) {
        ArrayList<NetworkObserver> arrayList;
        for (Long longValue : getNativeNetworkObserversSync()) {
            nativeNotifyConnectionTypeChanged(longValue.longValue());
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList<>(this.networkObservers);
        }
        for (NetworkObserver onConnectionTypeChanged : arrayList) {
            onConnectionTypeChanged.onConnectionTypeChanged(connectionType);
        }
    }

    private void stopMonitoring(long j) {
        StringBuilder sb = new StringBuilder("Stop monitoring with native observer ");
        sb.append(j);
        Logging.m150047d("NetworkMonitor", sb.toString());
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    private void updateObserverActiveNetworkList(long j) {
        List list;
        synchronized (this.autoDetectLock) {
            if (this.autoDetect == null) {
                list = null;
            } else {
                list = this.autoDetect.getActiveNetworkList();
            }
        }
        if (list != null && list.size() != 0) {
            nativeNotifyOfActiveNetworkList(j, (NetworkInformation[]) list.toArray(new NetworkInformation[list.size()]));
        }
    }

    public void startMonitoring(Context context) {
        synchronized (this.autoDetectLock) {
            this.numObservers++;
            if (this.autoDetect == null) {
                this.autoDetect = createAutoDetect(context);
            }
            this.currentConnectionType = NetworkMonitorAutoDetect.getConnectionType(this.autoDetect.getCurrentNetworkState());
        }
    }

    private void startMonitoring(Context context, long j) {
        StringBuilder sb = new StringBuilder("Start monitoring with native observer ");
        sb.append(j);
        Logging.m150047d("NetworkMonitor", sb.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j));
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }
}
