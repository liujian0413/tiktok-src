package org.webrtc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.os.Build.VERSION;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NetworkMonitorAutoDetect extends BroadcastReceiver {
    private final NetworkCallback allNetworkCallback;
    private ConnectionType connectionType;
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    private final Context context;
    private final IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private boolean isRegistered;
    private final NetworkCallback mobileNetworkCallback;
    public final Observer observer;
    private WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private WifiManagerDelegate wifiManagerDelegate;
    private String wifiSSID;

    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    static class ConnectivityManagerDelegate {
        private final ConnectivityManager connectivityManager;

        ConnectivityManagerDelegate() {
        }

        /* access modifiers changed from: 0000 */
        public Network[] getAllNetworks() {
            if (this.connectivityManager == null) {
                return new Network[0];
            }
            return this.connectivityManager.getAllNetworks();
        }

        public boolean supportNetworkCallback() {
            if (VERSION.SDK_INT < 21 || this.connectivityManager == null) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public NetworkState getNetworkState() {
            if (this.connectivityManager != null) {
                return getNetworkState(this.connectivityManager.getActiveNetworkInfo());
            }
            NetworkState networkState = new NetworkState(false, -1, -1, -1, -1);
            return networkState;
        }

        /* access modifiers changed from: 0000 */
        public List<NetworkInformation> getActiveNetworkList() {
            if (!supportNetworkCallback()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Network networkToInfo : getAllNetworks()) {
                NetworkInformation networkToInfo2 = networkToInfo(networkToInfo);
                if (networkToInfo2 != null) {
                    arrayList.add(networkToInfo2);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        public long getDefaultNetId() {
            Network[] allNetworks;
            if (!supportNetworkCallback()) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            long j = -1;
            for (Network network : getAllNetworks()) {
                if (hasInternetCapability(network)) {
                    NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network);
                    if (networkInfo != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                        if (j == -1) {
                            j = NetworkMonitorAutoDetect.networkToNetId(network);
                        } else {
                            throw new RuntimeException("Multiple connected networks of same type are not supported.");
                        }
                    }
                }
            }
            return j;
        }

        ConnectivityManagerDelegate(Context context) {
            this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        /* access modifiers changed from: 0000 */
        public boolean hasInternetCapability(Network network) {
            if (this.connectivityManager == null) {
                return false;
            }
            NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
                return false;
            }
            return true;
        }

        public void registerNetworkCallback(NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(new Builder().addCapability(12).build(), networkCallback);
        }

        public void releaseCallback(NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                Logging.m150047d("NetworkMonitorAutoDetect", "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(NetworkCallback networkCallback) {
            Builder builder = new Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo == null || !networkInfo.isConnected()) {
                NetworkState networkState = new NetworkState(false, -1, -1, -1, -1);
                return networkState;
            }
            NetworkState networkState2 = new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
            return networkState2;
        }

        /* access modifiers changed from: 0000 */
        public IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            IPAddress[] iPAddressArr = new IPAddress[linkProperties.getLinkAddresses().size()];
            int i = 0;
            for (LinkAddress address : linkProperties.getLinkAddresses()) {
                iPAddressArr[i] = new IPAddress(address.getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        /* access modifiers changed from: 0000 */
        public NetworkState getNetworkState(Network network) {
            Network network2 = network;
            if (network2 == null || this.connectivityManager == null) {
                NetworkState networkState = new NetworkState(false, -1, -1, -1, -1);
                return networkState;
            }
            NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network2);
            if (networkInfo == null) {
                StringBuilder sb = new StringBuilder("Couldn't retrieve information from network ");
                sb.append(network.toString());
                Logging.m150051w("NetworkMonitorAutoDetect", sb.toString());
                NetworkState networkState2 = new NetworkState(false, -1, -1, -1, -1);
                return networkState2;
            } else if (networkInfo.getType() != 17) {
                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network2);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    return getNetworkState(networkInfo);
                }
                NetworkState networkState3 = new NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                return networkState3;
            } else if (networkInfo.getType() != 17) {
                return getNetworkState(networkInfo);
            } else {
                if (VERSION.SDK_INT >= 23 && network2.equals(this.connectivityManager.getActiveNetwork())) {
                    NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
                    if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 17)) {
                        NetworkState networkState4 = new NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                        return networkState4;
                    }
                }
                NetworkState networkState5 = new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                return networkState5;
            }
        }

        public NetworkInformation networkToInfo(Network network) {
            if (network == null || this.connectivityManager == null) {
                return null;
            }
            LinkProperties linkProperties = this.connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                StringBuilder sb = new StringBuilder("Detected unknown network: ");
                sb.append(network.toString());
                Logging.m150051w("NetworkMonitorAutoDetect", sb.toString());
                return null;
            } else if (linkProperties.getInterfaceName() == null) {
                StringBuilder sb2 = new StringBuilder("Null interface name for network ");
                sb2.append(network.toString());
                Logging.m150051w("NetworkMonitorAutoDetect", sb2.toString());
                return null;
            } else {
                NetworkState networkState = getNetworkState(network);
                ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
                if (connectionType == ConnectionType.CONNECTION_NONE) {
                    StringBuilder sb3 = new StringBuilder("Network ");
                    sb3.append(network.toString());
                    sb3.append(" is disconnected");
                    Logging.m150047d("NetworkMonitorAutoDetect", sb3.toString());
                    return null;
                }
                if (connectionType == ConnectionType.CONNECTION_UNKNOWN || connectionType == ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    StringBuilder sb4 = new StringBuilder("Network ");
                    sb4.append(network.toString());
                    sb4.append(" connection type is ");
                    sb4.append(connectionType);
                    sb4.append(" because it has type ");
                    sb4.append(networkState.getNetworkType());
                    sb4.append(" and subtype ");
                    sb4.append(networkState.getNetworkSubType());
                    Logging.m150047d("NetworkMonitorAutoDetect", sb4.toString());
                }
                NetworkInformation networkInformation = new NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), NetworkMonitorAutoDetect.networkToNetId(network), getIPAddresses(linkProperties));
                return networkInformation;
            }
        }
    }

    public static class IPAddress {
        public final byte[] address;

        private byte[] getAddress() {
            return this.address;
        }

        public IPAddress(byte[] bArr) {
            this.address = bArr;
        }
    }

    public static class NetworkInformation {
        public final long handle;
        public final IPAddress[] ipAddresses;
        public final String name;
        public final ConnectionType type;
        public final ConnectionType underlyingTypeForVpn;

        private ConnectionType getConnectionType() {
            return this.type;
        }

        private long getHandle() {
            return this.handle;
        }

        private IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private String getName() {
            return this.name;
        }

        private ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }

        public NetworkInformation(String str, ConnectionType connectionType, ConnectionType connectionType2, long j, IPAddress[] iPAddressArr) {
            this.name = str;
            this.type = connectionType;
            this.underlyingTypeForVpn = connectionType2;
            this.handle = j;
            this.ipAddresses = iPAddressArr;
        }
    }

    static class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }
    }

    public interface Observer {
        void onConnectionTypeChanged(ConnectionType connectionType);

        void onNetworkConnect(NetworkInformation networkInformation);

        void onNetworkDisconnect(long j);
    }

    class SimpleNetworkCallback extends NetworkCallback {
        private SimpleNetworkCallback() {
        }

        private void onNetworkChanged(Network network) {
            NetworkInformation networkToInfo = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }

        public void onAvailable(Network network) {
            StringBuilder sb = new StringBuilder("Network becomes available: ");
            sb.append(network.toString());
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
            onNetworkChanged(network);
        }

        public void onLost(Network network) {
            StringBuilder sb = new StringBuilder("Network ");
            sb.append(network.toString());
            sb.append(" is disconnected");
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(NetworkMonitorAutoDetect.networkToNetId(network));
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            StringBuilder sb = new StringBuilder("capabilities changed: ");
            sb.append(networkCapabilities.toString());
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
            onNetworkChanged(network);
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            StringBuilder sb = new StringBuilder("link properties changed: ");
            sb.append(linkProperties.toString());
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
            onNetworkChanged(network);
        }

        public void onLosing(Network network, int i) {
            StringBuilder sb = new StringBuilder("Network ");
            sb.append(network.toString());
            sb.append(" is about to lose in ");
            sb.append(i);
            sb.append("ms");
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
        }
    }

    static class WifiDirectManagerDelegate extends BroadcastReceiver {
        private final Context context;
        private final Observer observer;
        private NetworkInformation wifiP2pNetworkInfo;

        public void release() {
            this.context.unregisterReceiver(this);
        }

        public List<NetworkInformation> getActiveNetworkList() {
            if (this.wifiP2pNetworkInfo != null) {
                return Collections.singletonList(this.wifiP2pNetworkInfo);
            }
            return Collections.emptyList();
        }

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0);
            }
        }

        private void onWifiP2pGroupChange(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
                try {
                    ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                    IPAddress[] iPAddressArr = new IPAddress[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iPAddressArr[i] = new IPAddress(((InetAddress) list.get(i)).getAddress());
                    }
                    NetworkInformation networkInformation = new NetworkInformation(wifiP2pGroup.getInterface(), ConnectionType.CONNECTION_WIFI, ConnectionType.CONNECTION_NONE, 0, iPAddressArr);
                    this.wifiP2pNetworkInfo = networkInformation;
                    this.observer.onNetworkConnect(this.wifiP2pNetworkInfo);
                } catch (SocketException e) {
                    Logging.m150049e("NetworkMonitorAutoDetect", "Unable to get WifiP2p network interface", e);
                }
            }
        }

        WifiDirectManagerDelegate(Observer observer2, Context context2) {
            this.context = context2;
            this.observer = observer2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context2.registerReceiver(this, intentFilter);
        }

        public void onReceive(Context context2, Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                onWifiP2pGroupChange((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
                return;
            }
            if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }
    }

    static class WifiManagerDelegate {
        private final Context context;

        WifiManagerDelegate() {
        }

        /* access modifiers changed from: 0000 */
        public String getWifiSSID() {
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
                if (wifiInfo != null) {
                    String ssid = wifiInfo.getSSID();
                    if (ssid != null) {
                        return ssid;
                    }
                }
            }
            return "";
        }

        WifiManagerDelegate(Context context2) {
            this.context = context2;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    private void registerReceiver() {
        if (!this.isRegistered) {
            this.isRegistered = true;
            this.context.registerReceiver(this, this.intentFilter);
        }
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public List<NetworkInformation> getActiveNetworkList() {
        List activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(activeNetworkList);
        if (this.wifiDirectManagerDelegate != null) {
            arrayList.addAll(this.wifiDirectManagerDelegate.getActiveNetworkList());
        }
        return arrayList;
    }

    public void destroy() {
        if (this.allNetworkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(this.allNetworkCallback);
        }
        if (this.mobileNetworkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(this.mobileNetworkCallback);
        }
        if (this.wifiDirectManagerDelegate != null) {
            this.wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    /* access modifiers changed from: 0000 */
    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate2) {
        this.connectivityManagerDelegate = connectivityManagerDelegate2;
    }

    /* access modifiers changed from: 0000 */
    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate2) {
        this.wifiManagerDelegate = wifiManagerDelegate2;
    }

    public static ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }

    public static ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.getNetworkType() != 17) {
            return ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private String getWifiSSID(NetworkState networkState) {
        if (getConnectionType(networkState) != ConnectionType.CONNECTION_WIFI) {
            return "";
        }
        return this.wifiManagerDelegate.getWifiSSID();
    }

    public static long networkToNetId(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    private void connectionTypeChanged(NetworkState networkState) {
        ConnectionType connectionType2 = getConnectionType(networkState);
        String wifiSSID2 = getWifiSSID(networkState);
        if (connectionType2 != this.connectionType || !wifiSSID2.equals(this.wifiSSID)) {
            this.connectionType = connectionType2;
            this.wifiSSID = wifiSSID2;
            StringBuilder sb = new StringBuilder("Network connectivity changed, type is: ");
            sb.append(this.connectionType);
            Logging.m150047d("NetworkMonitorAutoDetect", sb.toString());
            this.observer.onConnectionTypeChanged(connectionType2);
        }
    }

    public void onReceive(Context context2, Intent intent) {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
    }

    public NetworkMonitorAutoDetect(Observer observer2, Context context2) {
        this.observer = observer2;
        this.context = context2;
        this.connectivityManagerDelegate = new ConnectivityManagerDelegate(context2);
        this.wifiManagerDelegate = new WifiManagerDelegate(context2);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        if (PeerConnectionFactory.fieldTrialsFindFullName("IncludeWifiDirect").equals("Enabled")) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer2, context2);
        }
        registerReceiver();
        if (this.connectivityManagerDelegate.supportNetworkCallback()) {
            NetworkCallback networkCallback = new NetworkCallback();
            try {
                this.connectivityManagerDelegate.requestMobileNetwork(networkCallback);
            } catch (SecurityException unused) {
                Logging.m150051w("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
                networkCallback = null;
            }
            this.mobileNetworkCallback = networkCallback;
            this.allNetworkCallback = new SimpleNetworkCallback();
            this.connectivityManagerDelegate.registerNetworkCallback(this.allNetworkCallback);
            return;
        }
        this.mobileNetworkCallback = null;
        this.allNetworkCallback = null;
    }

    private static ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return ConnectionType.CONNECTION_NONE;
        }
        switch (i) {
            case 0:
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return ConnectionType.CONNECTION_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return ConnectionType.CONNECTION_3G;
                    case 13:
                        return ConnectionType.CONNECTION_4G;
                    default:
                        return ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                }
            case 1:
                return ConnectionType.CONNECTION_WIFI;
            case 6:
                return ConnectionType.CONNECTION_4G;
            case 7:
                return ConnectionType.CONNECTION_BLUETOOTH;
            case 9:
                return ConnectionType.CONNECTION_ETHERNET;
            case 17:
                return ConnectionType.CONNECTION_VPN;
            default:
                return ConnectionType.CONNECTION_UNKNOWN;
        }
    }
}
