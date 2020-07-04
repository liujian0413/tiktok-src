package com.ttnet.org.chromium.net;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.ttnet.org.chromium.base.ApiCompatibilityUtils;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.compat.ApiHelperForM;
import com.ttnet.org.chromium.base.compat.ApiHelperForP;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

class AndroidNetworkLibrary {
    private static final Set<String> sAutoDohDotServers = new HashSet();
    private static final Set<InetAddress> sAutoDohServers = new HashSet();
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    public static class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public boolean isCleartextTrafficPermitted() {
            if (VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted(String str) {
            if (VERSION.SDK_INT < 24) {
                return isCleartextTrafficPermitted();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }

    static class SetFileDescriptor {
        private static final Method sFileDescriptorSetInt;

        private SetFileDescriptor() {
        }

        static {
            try {
                sFileDescriptorSetInt = FileDescriptor.class.getMethod("setInt$", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException | SecurityException e) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
            }
        }

        public static FileDescriptor createWithFd(int i) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                sFileDescriptorSetInt.invoke(fileDescriptor, new Object[]{Integer.valueOf(i)});
                return fileDescriptor;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            }
        }
    }

    static class SocketFd extends Socket {

        static class SocketImplFd extends SocketImpl {
            /* access modifiers changed from: protected */
            public void close() {
            }

            /* access modifiers changed from: protected */
            public void create(boolean z) {
            }

            /* access modifiers changed from: protected */
            public int available() {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            public InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            /* access modifiers changed from: protected */
            public OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            SocketImplFd(FileDescriptor fileDescriptor) {
                this.fd = fileDescriptor;
            }

            /* access modifiers changed from: protected */
            public void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            public Object getOption(int i) {
                throw new RuntimeException("getOption not implemented");
            }

            /* access modifiers changed from: protected */
            public void listen(int i) {
                throw new RuntimeException("listen not implemented");
            }

            /* access modifiers changed from: protected */
            public void sendUrgentData(int i) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            /* access modifiers changed from: protected */
            public void bind(InetAddress inetAddress, int i) {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            public void connect(String str, int i) {
                throw new RuntimeException("connect not implemented");
            }

            public void setOption(int i, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            /* access modifiers changed from: protected */
            public void connect(InetAddress inetAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }

            /* access modifiers changed from: protected */
            public void connect(SocketAddress socketAddress, int i) {
                throw new RuntimeException("connect not implemented");
            }
        }

        SocketFd(FileDescriptor fileDescriptor) throws IOException {
            super(new SocketImplFd(fileDescriptor));
        }
    }

    AndroidNetworkLibrary() {
    }

    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        X509Util.clearTestRootCertificates();
    }

    private static String getNetworkCountryIso() {
        return AndroidTelephonyManagerBridge.getInstance().getNetworkCountryIso();
    }

    private static String getNetworkOperator() {
        return AndroidTelephonyManagerBridge.getInstance().getNetworkOperator();
    }

    private static String getSimOperator() {
        return AndroidTelephonyManagerBridge.getInstance().getSimOperator();
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    private static String getApnName() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "";
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        if (TextUtils.isEmpty(extraInfo)) {
            return "";
        }
        return extraInfo;
    }

    private static boolean getIsCaptivePortal() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = ApiHelperForM.getActiveNetwork(connectivityManager);
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    private static int getTelephonyNetworkCid() {
        try {
            int phoneType = AndroidTelephonyManagerBridge.getInstance().getPhoneType();
            AndroidTelephonyManagerBridge.getInstance();
            if (phoneType == 2) {
                return ((CdmaCellLocation) AndroidTelephonyManagerBridge.getInstance().getCellLocation()).getBaseStationId();
            }
            return ((GsmCellLocation) AndroidTelephonyManagerBridge.getInstance().getCellLocation()).getCid();
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int getTelephonyNetworkLac() {
        try {
            int phoneType = AndroidTelephonyManagerBridge.getInstance().getPhoneType();
            AndroidTelephonyManagerBridge.getInstance();
            if (phoneType == 2) {
                return ((CdmaCellLocation) AndroidTelephonyManagerBridge.getInstance().getCellLocation()).getNetworkId();
            }
            return ((GsmCellLocation) AndroidTelephonyManagerBridge.getInstance().getCellLocation()).getLac();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int getWifiFrequency() {
        if (VERSION.SDK_INT >= 21) {
            Intent registerReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
                if (wifiInfo != null) {
                    return wifiInfo.getFrequency();
                }
            }
        }
        return -1;
    }

    private static boolean haveAccessNetworkState() {
        boolean z;
        if (sHaveAccessNetworkState == null) {
            if (ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                z = false;
            }
            sHaveAccessNetworkState = Boolean.valueOf(z);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        boolean z;
        if (sHaveAccessWifiState == null) {
            if (ApiCompatibilityUtils.checkPermission(ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                z = false;
            }
            sHaveAccessWifiState = Boolean.valueOf(z);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                try {
                    if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static String getWifiSSID() {
        WifiInfo wifiInfo = null;
        if (haveAccessWifiState()) {
            wifiInfo = ((WifiManager) ContextUtils.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        } else {
            Intent registerReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            }
        }
        if (wifiInfo != null) {
            String ssid = wifiInfo.getSSID();
            if (ssid != null && !ssid.equals("<unknown ssid>")) {
                return ssid;
            }
        }
        return "";
    }

    static {
        try {
            sAutoDohServers.add(InetAddress.getByName("8.8.8.8"));
            sAutoDohServers.add(InetAddress.getByName("8.8.4.4"));
            sAutoDohServers.add(InetAddress.getByName("2001:4860:4860::8888"));
            sAutoDohServers.add(InetAddress.getByName("2001:4860:4860::8844"));
            sAutoDohServers.add(InetAddress.getByName("1.1.1.1"));
            sAutoDohServers.add(InetAddress.getByName("1.0.0.1"));
            sAutoDohServers.add(InetAddress.getByName("2606:4700:4700::1111"));
            sAutoDohServers.add(InetAddress.getByName("2606:4700:4700::1001"));
            sAutoDohServers.add(InetAddress.getByName("9.9.9.9"));
            sAutoDohServers.add(InetAddress.getByName("149.112.112.112"));
            sAutoDohServers.add(InetAddress.getByName("2620:fe::fe"));
            sAutoDohServers.add(InetAddress.getByName("2620:fe::9"));
            sAutoDohDotServers.add("dns.google");
            sAutoDohDotServers.add("1dot1dot1dot1.cloudflare-dns.com");
            sAutoDohDotServers.add("cloudflare-dns.com");
            sAutoDohDotServers.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [int] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[][] getDnsServers() {
        /*
            boolean r0 = haveAccessNetworkState()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            int[] r0 = new int[]{r1, r1}
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            return r0
        L_0x0014:
            android.content.Context r0 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 != 0) goto L_0x002f
            int[] r0 = new int[]{r1, r1}
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            return r0
        L_0x002f:
            android.net.Network r2 = com.ttnet.org.chromium.base.compat.ApiHelperForM.getActiveNetwork(r0)
            if (r2 != 0) goto L_0x0042
            int[] r0 = new int[]{r1, r1}
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            return r0
        L_0x0042:
            android.net.LinkProperties r0 = r0.getLinkProperties(r2)
            if (r0 != 0) goto L_0x0055
            int[] r0 = new int[]{r1, r1}
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            return r0
        L_0x0055:
            java.util.List r2 = r0.getDnsServers()
            java.util.Iterator r3 = r2.iterator()
        L_0x005d:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            java.net.InetAddress r4 = (java.net.InetAddress) r4
            java.util.Set<java.net.InetAddress> r6 = sAutoDohServers
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L_0x005d
            r3 = 1
            goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            boolean r4 = isPrivateDnsActive(r0)
            if (r4 == 0) goto L_0x00a7
            java.lang.String r0 = getPrivateDnsServerName(r0)
            if (r0 == 0) goto L_0x008d
            java.util.Set<java.lang.String> r2 = sAutoDohDotServers
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r0.toLowerCase(r3)
            boolean r3 = r2.contains(r3)
        L_0x008d:
            java.lang.String r2 = "Net.DNS.Android.DotExplicit"
            if (r0 == 0) goto L_0x0092
            r1 = 1
        L_0x0092:
            com.ttnet.org.chromium.base.metrics.RecordHistogram.recordBooleanHistogram(r2, r1)
            java.lang.String r0 = "Net.DNS.Android.AutoDohPrivate"
            com.ttnet.org.chromium.base.metrics.RecordHistogram.recordBooleanHistogram(r0, r3)
            int[] r0 = new int[]{r5, r5}
            java.lang.Class<byte> r1 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            byte[][] r0 = (byte[][]) r0
            return r0
        L_0x00a7:
            java.lang.String r0 = "Net.DNS.Android.AutoDohPublic"
            com.ttnet.org.chromium.base.metrics.RecordHistogram.recordBooleanHistogram(r0, r3)
            int r0 = r2.size()
            byte[][] r0 = new byte[r0][]
        L_0x00b2:
            int r3 = r2.size()
            if (r1 >= r3) goto L_0x00c7
            java.lang.Object r3 = r2.get(r1)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            byte[] r3 = r3.getAddress()
            r0[r1] = r3
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00c7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AndroidNetworkLibrary.getDnsServers():byte[][]");
    }

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        X509Util.addTestRootCertificate(bArr);
    }

    private static String getPrivateDnsServerName(LinkProperties linkProperties) {
        if (VERSION.SDK_INT < 28 || linkProperties == null) {
            return null;
        }
        return ApiHelperForP.getPrivateDnsServerName(linkProperties);
    }

    static boolean isPrivateDnsActive(LinkProperties linkProperties) {
        if (VERSION.SDK_INT < 28 || linkProperties == null) {
            return false;
        }
        return ApiHelperForP.isPrivateDnsActive(linkProperties);
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder sb = new StringBuilder("foo.");
        sb.append(str);
        return URLConnection.guessContentTypeFromName(sb.toString());
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static int getWifiSignalLevel(int i) {
        Intent registerReceiver = ContextUtils.getApplicationContext().registerReceiver(null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        int intExtra = registerReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            return -1;
        }
        int calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i);
        if (calculateSignalLevel < 0 || calculateSignalLevel >= i) {
            return -1;
        }
        return calculateSignalLevel;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    private static void tagSocket(int i, int i2, int i3) throws IOException {
        FileDescriptor fileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        if (VERSION.SDK_INT < 23) {
            parcelFileDescriptor = null;
            fileDescriptor = SetFileDescriptor.createWithFd(i);
        } else {
            parcelFileDescriptor = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        }
        SocketFd socketFd = new SocketFd(fileDescriptor);
        TrafficStats.tagSocket(socketFd);
        socketFd.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }
}
