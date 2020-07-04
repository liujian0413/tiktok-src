package com.ttnet.org.chromium.net1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.ttnet.org.chromium.base1.ApplicationStatus;
import com.ttnet.org.chromium.base1.metrics.RecordHistogram;
import java.io.IOException;
import java.util.Arrays;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private int mConnectionType;
    public ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private final Context mContext;
    private final Handler mHandler = new Handler(this.mLooper);
    public boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper = Looper.myLooper();
    private int mMaxBandwidthConnectionType;
    private double mMaxBandwidthMbps;
    private final MyNetworkCallback mNetworkCallback;
    private final NetworkRequest mNetworkRequest;
    public final Observer mObserver;
    public boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private WifiManagerDelegate mWifiManagerDelegate;
    private String mWifiSSID;

    static class ConnectivityManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final ConnectivityManager mConnectivityManager;

        static {
            Class<NetworkChangeNotifierAutoDetect> cls = NetworkChangeNotifierAutoDetect.class;
        }

        ConnectivityManagerDelegate() {
        }

        /* access modifiers changed from: protected */
        public Network[] getAllNetworksUnfiltered() {
            return this.mConnectivityManager.getAllNetworks();
        }

        /* access modifiers changed from: 0000 */
        public long getDefaultNetId() {
            Network[] allNetworksFiltered;
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            long j = -1;
            if (activeNetworkInfo == null) {
                return -1;
            }
            try {
                for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                    NetworkInfo networkInfo = getNetworkInfo(network);
                    if (networkInfo != null && (networkInfo.getType() == activeNetworkInfo.getType() || networkInfo.getType() == 17)) {
                        j = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    }
                }
            } catch (Throwable unused) {
            }
            return j;
        }

        private NetworkInfo getActiveNetworkInfo() {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                recordGetActiveNetworkInfoResult(0);
                return null;
            } else if (activeNetworkInfo.isConnected()) {
                recordGetActiveNetworkInfoResult(1);
                return activeNetworkInfo;
            } else if (VERSION.SDK_INT < 21) {
                recordGetActiveNetworkInfoResult(2);
                return null;
            } else if (activeNetworkInfo.getDetailedState() != DetailedState.BLOCKED) {
                recordGetActiveNetworkInfoResult(3);
                return null;
            } else if (ApplicationStatus.getStateForApplication() != 1) {
                recordGetActiveNetworkInfoResult(4);
                return null;
            } else {
                recordGetActiveNetworkInfoResult(5);
                return activeNetworkInfo;
            }
        }

        private static void recordGetActiveNetworkInfoResult(int i) {
            RecordHistogram.recordEnumeratedHistogram("NCN.GetActiveNetworkInfoResult", i, 6);
        }

        /* access modifiers changed from: protected */
        public NetworkCapabilities getNetworkCapabilities(Network network) {
            return this.mConnectivityManager.getNetworkCapabilities(network);
        }

        /* access modifiers changed from: 0000 */
        public void unregisterNetworkCallback(NetworkCallback networkCallback) {
            this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
        }

        ConnectivityManagerDelegate(Context context) {
            this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        /* access modifiers changed from: protected */
        public boolean vpnAccessible(Network network) {
            try {
                network.getSocketFactory().createSocket().close();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        private NetworkInfo getNetworkInfo(Network network) {
            try {
                NetworkInfo networkInfo = this.mConnectivityManager.getNetworkInfo(network);
                RecordHistogram.recordBooleanHistogram("NCN.getNetInfo1stSuccess", true);
                return networkInfo;
            } catch (NullPointerException unused) {
                RecordHistogram.recordBooleanHistogram("NCN.getNetInfo1stSuccess", false);
                try {
                    NetworkInfo networkInfo2 = this.mConnectivityManager.getNetworkInfo(network);
                    RecordHistogram.recordBooleanHistogram("NCN.getNetInfo2ndSuccess", true);
                    return networkInfo2;
                } catch (NullPointerException unused2) {
                    RecordHistogram.recordBooleanHistogram("NCN.getNetInfo2ndSuccess", false);
                    return null;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public int getConnectionType(Network network) {
            NetworkInfo networkInfo = getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 17) {
                networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
        }

        /* access modifiers changed from: 0000 */
        public NetworkState getNetworkState(WifiManagerDelegate wifiManagerDelegate) {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return new NetworkState(false, -1, -1, null);
            }
            if (activeNetworkInfo.getType() != 1) {
                return new NetworkState(true, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype(), null);
            }
            if (activeNetworkInfo.getExtraInfo() == null || "".equals(activeNetworkInfo.getExtraInfo())) {
                return new NetworkState(true, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype(), wifiManagerDelegate.getWifiSsid());
            }
            return new NetworkState(true, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype(), activeNetworkInfo.getExtraInfo());
        }

        /* access modifiers changed from: 0000 */
        public void registerNetworkCallback(NetworkRequest networkRequest, NetworkCallback networkCallback) {
            this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
        }
    }

    class MyNetworkCallback extends NetworkCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Network mVpnInPlace;

        static {
            Class<NetworkChangeNotifierAutoDetect> cls = NetworkChangeNotifierAutoDetect.class;
        }

        /* access modifiers changed from: 0000 */
        public void initializeVpnInPlace() {
            Network[] allNetworksFiltered = NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, null);
            this.mVpnInPlace = null;
            if (allNetworksFiltered.length == 1) {
                NetworkCapabilities networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(allNetworksFiltered[0]);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    this.mVpnInPlace = allNetworksFiltered[0];
                }
            }
        }

        private MyNetworkCallback() {
        }

        private boolean ignoreNetworkDueToVpn(Network network) {
            if (this.mVpnInPlace == null || this.mVpnInPlace.equals(network)) {
                return false;
            }
            return true;
        }

        public void onAvailable(Network network) {
            NetworkCapabilities networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
            if (!ignoreConnectedNetwork(network, networkCapabilities)) {
                try {
                    final boolean hasTransport = networkCapabilities.hasTransport(4);
                    if (hasTransport) {
                        this.mVpnInPlace = network;
                    }
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
                    C467381 r2 = new Runnable() {
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                            if (hasTransport) {
                                NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                                NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                            }
                        }
                    };
                    networkChangeNotifierAutoDetect.runOnThread(r2);
                } catch (Throwable unused) {
                }
            }
        }

        public void onLost(final Network network) {
            if (!ignoreNetworkDueToVpn(network)) {
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    public void run() {
                        try {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                        } catch (Throwable unused) {
                        }
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (Network onAvailable : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(onAvailable);
                    }
                    final int convertToConnectionType = NetworkChangeNotifierAutoDetect.convertToConnectionType(NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState());
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(convertToConnectionType);
                        }
                    });
                }
            }
        }

        private boolean ignoreConnectedNetwork(Network network, NetworkCapabilities networkCapabilities) {
            if (ignoreNetworkDueToVpn(network) || ignoreConnectedInaccessibleVpn(network, networkCapabilities)) {
                return true;
            }
            return false;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (!ignoreConnectedNetwork(network, networkCapabilities)) {
                try {
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }

        public void onLosing(Network network, int i) {
            if (!ignoreConnectedNetwork(network, null)) {
                try {
                    final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }

        private boolean ignoreConnectedInaccessibleVpn(Network network, NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                networkCapabilities = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
            }
            if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.vpnAccessible(network))) {
                return true;
            }
            return false;
        }
    }

    static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    static class NetworkState {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean mConnected;
        private final int mSubtype;
        private final int mType;
        private final String mWifiSsid;

        static {
            Class<NetworkChangeNotifierAutoDetect> cls = NetworkChangeNotifierAutoDetect.class;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getWifiSsid() {
            return this.mWifiSsid;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public NetworkState(boolean z, int i, int i2, String str) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            if (str == null) {
                str = "";
            }
            this.mWifiSsid = str;
        }
    }

    public interface Observer {
        void onConnectionTypeChanged(int i);

        void onMaxBandwidthChanged(double d);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        static {
            Class<NetworkChangeNotifierAutoDetect> cls = NetworkChangeNotifierAutoDetect.class;
        }

        /* access modifiers changed from: protected */
        public abstract void destroy();

        /* access modifiers changed from: protected */
        public final void register() {
            this.mNotifier.register();
        }

        /* access modifiers changed from: protected */
        public final void unregister() {
            this.mNotifier.unregister();
        }

        /* access modifiers changed from: protected */
        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }
    }

    static class WifiManagerDelegate {
        private final Context mContext;
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private final Object mLock;
        private WifiManager mWifiManager;

        WifiManagerDelegate() {
            this.mLock = new Object();
            this.mContext = null;
        }

        private WifiInfo getWifiInfoLocked() {
            try {
                WifiInfo connectionInfo = this.mWifiManager.getConnectionInfo();
                RecordHistogram.recordBooleanHistogram("NCN.getWifiInfo1stSuccess", true);
                return connectionInfo;
            } catch (NullPointerException unused) {
                RecordHistogram.recordBooleanHistogram("NCN.getWifiInfo1stSuccess", false);
                try {
                    WifiInfo connectionInfo2 = this.mWifiManager.getConnectionInfo();
                    RecordHistogram.recordBooleanHistogram("NCN.getWifiInfo2ndSuccess", true);
                    return connectionInfo2;
                } catch (NullPointerException unused2) {
                    RecordHistogram.recordBooleanHistogram("NCN.getWifiInfo2ndSuccess", false);
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            } catch (Throwable unused4) {
                return null;
            }
        }

        private boolean hasPermissionLocked() {
            boolean z;
            WifiManager wifiManager;
            if (this.mHasWifiPermissionComputed) {
                return this.mHasWifiPermission;
            }
            if (this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.mContext.getPackageName()) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.mHasWifiPermission = z;
            if (this.mHasWifiPermission) {
                wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
            } else {
                wifiManager = null;
            }
            this.mWifiManager = wifiManager;
            this.mHasWifiPermissionComputed = true;
            return this.mHasWifiPermission;
        }

        /* access modifiers changed from: 0000 */
        public String getWifiSsid() {
            synchronized (this.mLock) {
                if (!hasPermissionLocked()) {
                    return AndroidNetworkLibrary.getWifiSSID(this.mContext);
                }
                WifiInfo wifiInfoLocked = getWifiInfoLocked();
                if (wifiInfoLocked != null) {
                    String ssid = wifiInfoLocked.getSSID();
                    return ssid;
                }
                String str = "";
                return str;
            }
        }

        WifiManagerDelegate(Context context) {
            this.mLock = new Object();
            this.mContext = context;
        }
    }

    private void assertOnThread() {
    }

    public static int convertToConnectionType(int i, int i2) {
        switch (i) {
            case 0:
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 3;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 4;
                    case 13:
                        return 5;
                    default:
                        return 0;
                }
            case 1:
                return 2;
            case 6:
                return 5;
            case 7:
                return 7;
            case 9:
                return 1;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    /* access modifiers changed from: 0000 */
    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public NetworkState getCurrentNetworkState() {
        return this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate);
    }

    public long getDefaultNetId() {
        if (VERSION.SDK_INT < 21) {
            return -1;
        }
        return this.mConnectivityManagerDelegate.getDefaultNetId();
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mContext.unregisterReceiver(this);
            this.mRegistered = false;
            if (this.mNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(this.mNetworkCallback);
            }
        }
    }

    public long[] getNetworksAndTypes() {
        if (VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[(allNetworksFiltered.length * 2)];
        try {
            int i = 0;
            for (Network network : allNetworksFiltered) {
                int i2 = i + 1;
                jArr[i] = networkToNetId(network);
                i = i2 + 1;
                jArr[i2] = (long) this.mConnectivityManagerDelegate.getConnectionType(network);
            }
            return jArr;
        } catch (Throwable unused) {
            return new long[0];
        }
    }

    public void register() {
        boolean z;
        assertOnThread();
        if (!this.mRegistered) {
            if (this.mShouldSignalObserver) {
                NetworkState currentNetworkState = getCurrentNetworkState();
                connectionTypeChanged(currentNetworkState);
                maxBandwidthChanged(currentNetworkState);
            }
            if (this.mContext.registerReceiver(this, this.mIntentFilter) != null) {
                z = true;
            } else {
                z = false;
            }
            this.mIgnoreNextBroadcast = z;
            this.mRegistered = true;
            if (this.mNetworkCallback != null) {
                this.mNetworkCallback.initializeVpnInPlace();
                this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback);
                if (this.mShouldSignalObserver) {
                    try {
                        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
                        long[] jArr = new long[allNetworksFiltered.length];
                        for (int i = 0; i < allNetworksFiltered.length; i++) {
                            jArr[i] = networkToNetId(allNetworksFiltered[i]);
                        }
                        this.mObserver.purgeActiveNetworkList(jArr);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
    }

    /* access modifiers changed from: 0000 */
    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.mWifiManagerDelegate = wifiManagerDelegate;
    }

    public double getCurrentMaxBandwidthInMbps(NetworkState networkState) {
        return NetworkChangeNotifier.getMaxBandwidthForConnectionSubtype(convertToConnectionSubtype(networkState));
    }

    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static int convertToConnectionType(NetworkState networkState) {
        if (!networkState.isConnected()) {
            return 6;
        }
        return convertToConnectionType(networkState.getNetworkType(), networkState.getNetworkSubType());
    }

    static long networkToNetId(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    public void connectionTypeChanged(NetworkState networkState) {
        int convertToConnectionType = convertToConnectionType(networkState);
        String wifiSsid = networkState.getWifiSsid();
        if (convertToConnectionType != this.mConnectionType || !wifiSsid.equals(this.mWifiSSID)) {
            this.mConnectionType = convertToConnectionType;
            this.mWifiSSID = wifiSsid;
            this.mObserver.onConnectionTypeChanged(convertToConnectionType);
        }
    }

    public void maxBandwidthChanged(NetworkState networkState) {
        double currentMaxBandwidthInMbps = getCurrentMaxBandwidthInMbps(networkState);
        if (currentMaxBandwidthInMbps != this.mMaxBandwidthMbps || this.mConnectionType != this.mMaxBandwidthConnectionType) {
            this.mMaxBandwidthMbps = currentMaxBandwidthInMbps;
            this.mMaxBandwidthConnectionType = this.mConnectionType;
            this.mObserver.onMaxBandwidthChanged(currentMaxBandwidthInMbps);
        }
    }

    public static int convertToConnectionSubtype(NetworkState networkState) {
        if (!networkState.isConnected()) {
            return 1;
        }
        switch (networkState.getNetworkType()) {
            case 0:
                switch (networkState.getNetworkSubType()) {
                    case 1:
                        return 7;
                    case 2:
                        return 8;
                    case 3:
                        return 9;
                    case 4:
                        return 5;
                    case 5:
                        return 10;
                    case 6:
                        return 11;
                    case 7:
                        return 6;
                    case 8:
                        return 14;
                    case 9:
                        return 15;
                    case 10:
                        return 12;
                    case 11:
                        return 4;
                    case 12:
                        return 13;
                    case 13:
                        return 18;
                    case 14:
                        return 16;
                    case 15:
                        return 17;
                    default:
                        return 0;
                }
            case 1:
            case 6:
            case 7:
            case 9:
                return 0;
            default:
                return 0;
        }
    }

    public void onReceive(Context context, Intent intent) {
        runOnThread(new Runnable() {
            public void run() {
                if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                    if (NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                        NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                        return;
                    }
                    try {
                        NetworkState currentNetworkState = NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState();
                        NetworkChangeNotifierAutoDetect.this.connectionTypeChanged(currentNetworkState);
                        NetworkChangeNotifierAutoDetect.this.maxBandwidthChanged(currentNetworkState);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static Network[] getAllNetworksFiltered(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
        try {
            Network[] allNetworksUnfiltered = connectivityManagerDelegate.getAllNetworksUnfiltered();
            int i = 0;
            for (Network network2 : allNetworksUnfiltered) {
                if (!network2.equals(network)) {
                    NetworkCapabilities networkCapabilities = connectivityManagerDelegate.getNetworkCapabilities(network2);
                    if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                        if (!networkCapabilities.hasTransport(4)) {
                            int i2 = i + 1;
                            allNetworksUnfiltered[i] = network2;
                            i = i2;
                        } else if (connectivityManagerDelegate.vpnAccessible(network2)) {
                            return new Network[]{network2};
                        }
                    }
                }
            }
            return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
        } catch (Throwable unused) {
            return new Network[0];
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context, RegistrationPolicy registrationPolicy) {
        this.mObserver = observer;
        this.mContext = context.getApplicationContext();
        this.mConnectivityManagerDelegate = new ConnectivityManagerDelegate(context);
        this.mWifiManagerDelegate = new WifiManagerDelegate(context);
        if (VERSION.SDK_INT >= 21) {
            this.mNetworkCallback = new MyNetworkCallback();
            this.mNetworkRequest = new Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.mNetworkCallback = null;
            this.mNetworkRequest = null;
        }
        NetworkState currentNetworkState = getCurrentNetworkState();
        this.mConnectionType = convertToConnectionType(currentNetworkState);
        this.mWifiSSID = currentNetworkState.getWifiSsid();
        this.mMaxBandwidthMbps = getCurrentMaxBandwidthInMbps(currentNetworkState);
        this.mMaxBandwidthConnectionType = this.mConnectionType;
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        this.mRegistrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }
}
