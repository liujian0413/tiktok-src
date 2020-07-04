package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.LinkProperties;
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
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.compat.ApiHelperForM;
import java.util.Arrays;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    public ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private DefaultNetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler = new Handler(this.mLooper);
    public boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper = Looper.myLooper();
    private MyNetworkCallback mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    public final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    public boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private WifiManagerDelegate mWifiManagerDelegate;

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
            Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
            if (allNetworks == null) {
                return new Network[0];
            }
            return allNetworks;
        }

        /* access modifiers changed from: 0000 */
        public Network getDefaultNetwork() {
            Network network;
            Network[] allNetworksFiltered;
            if (VERSION.SDK_INT >= 23) {
                network = ApiHelperForM.getActiveNetwork(this.mConnectivityManager);
                if (network != null) {
                    return network;
                }
            } else {
                network = null;
            }
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                NetworkInfo networkInfo = getNetworkInfo(network2);
                if (networkInfo != null && (networkInfo.getType() == activeNetworkInfo.getType() || networkInfo.getType() == 17)) {
                    network = network2;
                }
            }
            return network;
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

        /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return r1.mConnectivityManager.getNetworkInfo(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.NetworkInfo getNetworkInfo(android.net.Network r2) {
            /*
                r1 = this;
                android.net.ConnectivityManager r0 = r1.mConnectivityManager     // Catch:{ NullPointerException -> 0x0007 }
                android.net.NetworkInfo r0 = r0.getNetworkInfo(r2)     // Catch:{ NullPointerException -> 0x0007 }
                return r0
            L_0x0007:
                android.net.ConnectivityManager r0 = r1.mConnectivityManager     // Catch:{ NullPointerException -> 0x000e }
                android.net.NetworkInfo r2 = r0.getNetworkInfo(r2)     // Catch:{ NullPointerException -> 0x000e }
                return r2
            L_0x000e:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate.getNetworkInfo(android.net.Network):android.net.NetworkInfo");
        }

        private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (VERSION.SDK_INT >= 21 && networkInfo.getDetailedState() == DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1) {
                return networkInfo;
            }
            return null;
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

        /* access modifiers changed from: protected */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0031 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean vpnAccessible(android.net.Network r4) {
            /*
                r3 = this;
                java.net.Socket r0 = new java.net.Socket
                r0.<init>()
                com.ttnet.org.chromium.base.StrictModeContext r1 = com.ttnet.org.chromium.base.StrictModeContext.allowAllVmPolicies()     // Catch:{ IOException -> 0x0031, all -> 0x002c }
                r2 = 0
                r4.bindSocket(r0)     // Catch:{ Throwable -> 0x0019 }
                if (r1 == 0) goto L_0x0012
                r1.close()     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            L_0x0012:
                r0.close()     // Catch:{ IOException -> 0x0015 }
            L_0x0015:
                r4 = 1
                return r4
            L_0x0017:
                r4 = move-exception
                goto L_0x001b
            L_0x0019:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0017 }
            L_0x001b:
                if (r1 == 0) goto L_0x002b
                if (r2 == 0) goto L_0x0028
                r1.close()     // Catch:{ Throwable -> 0x0023 }
                goto L_0x002b
            L_0x0023:
                r1 = move-exception
                com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r2, r1)     // Catch:{ IOException -> 0x0031, all -> 0x002c }
                goto L_0x002b
            L_0x0028:
                r1.close()     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            L_0x002b:
                throw r4     // Catch:{ IOException -> 0x0031, all -> 0x002c }
            L_0x002c:
                r4 = move-exception
                r0.close()     // Catch:{ IOException -> 0x0030 }
            L_0x0030:
                throw r4
            L_0x0031:
                r0.close()     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate.vpnAccessible(android.net.Network):boolean");
        }

        /* access modifiers changed from: 0000 */
        public NetworkState getNetworkState(WifiManagerDelegate wifiManagerDelegate) {
            NetworkInfo networkInfo;
            Network network;
            boolean z;
            if (VERSION.SDK_INT >= 23) {
                network = getDefaultNetwork();
                networkInfo = ApiHelperForM.getNetworkInfo(this.mConnectivityManager, network);
            } else {
                networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
                network = null;
            }
            NetworkInfo processActiveNetworkInfo = processActiveNetworkInfo(networkInfo);
            if (processActiveNetworkInfo == null) {
                NetworkState networkState = new NetworkState(false, -1, -1, null, false);
                return networkState;
            } else if (network != null) {
                int type = processActiveNetworkInfo.getType();
                int subtype = processActiveNetworkInfo.getSubtype();
                String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                if (VERSION.SDK_INT < 28 || !AndroidNetworkLibrary.isPrivateDnsActive(this.mConnectivityManager.getLinkProperties(network))) {
                    z = false;
                } else {
                    z = true;
                }
                NetworkState networkState2 = new NetworkState(true, type, subtype, valueOf, z);
                return networkState2;
            } else if (processActiveNetworkInfo.getType() != 1) {
                NetworkState networkState3 = new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), null, false);
                return networkState3;
            } else if (processActiveNetworkInfo.getExtraInfo() == null || "".equals(processActiveNetworkInfo.getExtraInfo())) {
                NetworkState networkState4 = new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), wifiManagerDelegate.getWifiSsid(), false);
                return networkState4;
            } else {
                NetworkState networkState5 = new NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), processActiveNetworkInfo.getExtraInfo(), false);
                return networkState5;
            }
        }

        /* access modifiers changed from: 0000 */
        public void registerDefaultNetworkCallback(NetworkCallback networkCallback, Handler handler) {
            this.mConnectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
        }

        /* access modifiers changed from: 0000 */
        public void registerNetworkCallback(NetworkRequest networkRequest, NetworkCallback networkCallback, Handler handler) {
            if (VERSION.SDK_INT >= 26) {
                this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
            } else {
                this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
            }
        }
    }

    class DefaultNetworkCallback extends NetworkCallback {
        private DefaultNetworkCallback() {
        }

        public void onLost(Network network) {
            onAvailable(null);
        }

        public void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
            }
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
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
                final boolean hasTransport = networkCapabilities.hasTransport(4);
                if (hasTransport) {
                    this.mVpnInPlace = network;
                }
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = NetworkChangeNotifierAutoDetect.this;
                C466621 r2 = new Runnable() {
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        if (hasTransport) {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                            NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                        }
                    }
                };
                networkChangeNotifierAutoDetect.runOnThread(r2);
            }
        }

        public void onLost(final Network network) {
            if (!ignoreNetworkDueToVpn(network)) {
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (Network onAvailable : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(onAvailable);
                    }
                    final int connectionType = NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState().getConnectionType();
                    NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                        public void run() {
                            NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
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
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType = NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                    }
                });
            }
        }

        public void onLosing(Network network, int i) {
            if (!ignoreConnectedNetwork(network, null)) {
                final long networkToNetId = NetworkChangeNotifierAutoDetect.networkToNetId(network);
                NetworkChangeNotifierAutoDetect.this.runOnThread(new Runnable() {
                    public void run() {
                        NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                    }
                });
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

    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final int mSubtype;
        private final int mType;

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }

        public int getConnectionType() {
            if (!isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            switch (getNetworkType()) {
                case 0:
                    switch (getNetworkSubType()) {
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

        public NetworkState(boolean z, int i, int i2, String str, boolean z2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            if (str == null) {
                str = "";
            }
            this.mNetworkIdentifier = str;
            this.mIsPrivateDnsActive = z2;
        }
    }

    public interface Observer {
        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

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
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Context mContext;
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private final Object mLock;
        private WifiManager mWifiManager;

        static {
            Class<NetworkChangeNotifierAutoDetect> cls = NetworkChangeNotifierAutoDetect.class;
        }

        WifiManagerDelegate() {
            this.mLock = new Object();
            this.mContext = null;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return r1.mWifiManager.getConnectionInfo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.wifi.WifiInfo getWifiInfoLocked() {
            /*
                r1 = this;
                android.net.wifi.WifiManager r0 = r1.mWifiManager     // Catch:{ NullPointerException -> 0x0007 }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ NullPointerException -> 0x0007 }
                return r0
            L_0x0007:
                android.net.wifi.WifiManager r0 = r1.mWifiManager     // Catch:{ NullPointerException -> 0x000e }
                android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ NullPointerException -> 0x000e }
                return r0
            L_0x000e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate.getWifiInfoLocked():android.net.wifi.WifiInfo");
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
                    return AndroidNetworkLibrary.getWifiSSID();
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

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
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

    private void assertOnThread() {
        if (BuildConfig.DCHECK_IS_ON && !onThread()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    public long getDefaultNetId() {
        if (VERSION.SDK_INT < 21) {
            return -1;
        }
        Network defaultNetwork = this.mConnectivityManagerDelegate.getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1;
        }
        return networkToNetId(defaultNetwork);
    }

    public long[] getNetworksAndTypes() {
        if (VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[(allNetworksFiltered.length * 2)];
        int i = 0;
        for (Network network : allNetworksFiltered) {
            int i2 = i + 1;
            jArr[i] = networkToNetId(network);
            i = i2 + 1;
            jArr[i2] = (long) this.mConnectivityManagerDelegate.getConnectionType(network);
        }
        return jArr;
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            if (this.mNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(this.mNetworkCallback);
            }
            if (this.mDefaultNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(this.mDefaultNetworkCallback);
            } else {
                ContextUtils.getApplicationContext().unregisterReceiver(this);
            }
        }
    }

    public void connectionTypeChanged() {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if (!(currentNetworkState.getConnectionType() == this.mNetworkState.getConnectionType() && currentNetworkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) && currentNetworkState.isPrivateDnsActive() == this.mNetworkState.isPrivateDnsActive())) {
            this.mObserver.onConnectionTypeChanged(currentNetworkState.getConnectionType());
        }
        if (!(currentNetworkState.getConnectionType() == this.mNetworkState.getConnectionType() && currentNetworkState.getConnectionSubtype() == this.mNetworkState.getConnectionSubtype())) {
            this.mObserver.onConnectionSubtypeChanged(currentNetworkState.getConnectionSubtype());
        }
        this.mNetworkState = currentNetworkState;
    }

    public void register() {
        boolean z;
        assertOnThread();
        if (!this.mRegistered) {
            if (this.mShouldSignalObserver) {
                connectionTypeChanged();
            }
            if (this.mDefaultNetworkCallback != null) {
                try {
                    this.mConnectivityManagerDelegate.registerDefaultNetworkCallback(this.mDefaultNetworkCallback, this.mHandler);
                } catch (RuntimeException unused) {
                    this.mDefaultNetworkCallback = null;
                }
            }
            if (this.mDefaultNetworkCallback == null) {
                if (ContextUtils.getApplicationContext().registerReceiver(this, this.mIntentFilter) != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.mIgnoreNextBroadcast = z;
            }
            this.mRegistered = true;
            if (this.mNetworkCallback != null) {
                this.mNetworkCallback.initializeVpnInPlace();
                try {
                    this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
                } catch (RuntimeException unused2) {
                    this.mRegisterNetworkCallbackFailed = true;
                    this.mNetworkCallback = null;
                }
                if (!this.mRegisterNetworkCallbackFailed && this.mShouldSignalObserver) {
                    Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
                    long[] jArr = new long[allNetworksFiltered.length];
                    for (int i = 0; i < allNetworksFiltered.length; i++) {
                        jArr[i] = networkToNetId(allNetworksFiltered[i]);
                    }
                    this.mObserver.purgeActiveNetworkList(jArr);
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

    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    static long networkToNetId(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return ApiHelperForM.getNetworkHandle(network);
        }
        return (long) Integer.parseInt(network.toString());
    }

    public void onReceive(Context context, Intent intent) {
        runOnThread(new Runnable() {
            public void run() {
                if (NetworkChangeNotifierAutoDetect.this.mRegistered) {
                    if (NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                        NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                    } else {
                        NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
                    }
                }
            }
        });
    }

    public static Network[] getAllNetworksFiltered(ConnectivityManagerDelegate connectivityManagerDelegate, Network network) {
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
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        DefaultNetworkCallback defaultNetworkCallback;
        this.mObserver = observer;
        this.mConnectivityManagerDelegate = new ConnectivityManagerDelegate(ContextUtils.getApplicationContext());
        if (VERSION.SDK_INT < 23) {
            this.mWifiManagerDelegate = new WifiManagerDelegate(ContextUtils.getApplicationContext());
        }
        if (VERSION.SDK_INT >= 21) {
            this.mNetworkCallback = new MyNetworkCallback();
            this.mNetworkRequest = new Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.mNetworkCallback = null;
            this.mNetworkRequest = null;
        }
        if (VERSION.SDK_INT >= 28) {
            defaultNetworkCallback = new DefaultNetworkCallback();
        } else {
            defaultNetworkCallback = null;
        }
        this.mDefaultNetworkCallback = defaultNetworkCallback;
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        this.mRegistrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }
}
