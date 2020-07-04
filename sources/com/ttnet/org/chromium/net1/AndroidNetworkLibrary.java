package com.ttnet.org.chromium.net1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.security.KeyChain;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.List;

class AndroidNetworkLibrary {
    AndroidNetworkLibrary() {
    }

    public static void clearTestRootCertificates() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        X509Util.clearTestRootCertificates();
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

    public static void addTestRootCertificate(byte[] bArr) throws CertificateException, KeyStoreException, NoSuchAlgorithmException {
        X509Util.addTestRootCertificate(bArr);
    }

    private static String getApnName(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "";
        }
        String extraInfo = activeNetworkInfo.getExtraInfo();
        if (TextUtils.isEmpty(extraInfo)) {
            return "";
        }
        return extraInfo;
    }

    private static boolean getIsRoaming(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder sb = new StringBuilder("foo.");
        sb.append(str);
        return URLConnection.guessContentTypeFromName(sb.toString());
    }

    private static String getNetworkCountryIso(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    private static String getNetworkOperator(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    private static String getSimOperator(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    private static boolean isCleartextPermitted(String str) {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        if (VERSION.SDK_INT >= 24) {
            return instance.isCleartextTrafficPermitted(str);
        }
        return instance.isCleartextTrafficPermitted();
    }

    private static boolean getIsCaptivePortal(Context context) {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    private static int getTelephonyNetworkCid(Context context) {
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return -1;
        }
        try {
            if (telephonyManager.getPhoneType() == 2) {
                i = ((CdmaCellLocation) telephonyManager.getCellLocation()).getBaseStationId();
            } else {
                i = ((GsmCellLocation) telephonyManager.getCellLocation()).getCid();
            }
        } catch (Throwable unused) {
            i = -1;
        }
        return i;
    }

    private static int getTelephonyNetworkLac(Context context) {
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return -1;
        }
        try {
            if (telephonyManager.getPhoneType() == 2) {
                i = ((CdmaCellLocation) telephonyManager.getCellLocation()).getNetworkId();
            } else {
                i = ((GsmCellLocation) telephonyManager.getCellLocation()).getLac();
            }
        } catch (Throwable unused) {
            i = -1;
        }
        return i;
    }

    public static int getWifiFrequency(Context context) {
        if (VERSION.SDK_INT < 21 || context == null) {
            return -1;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                return wifiInfo.getFrequency();
            }
        }
        return -1;
    }

    public static String getWifiSSID(Context context) {
        if (context == null) {
            return "";
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
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

    private static byte[][] getDnsServers(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(byte.class, new int[]{0, 0});
        }
        List dnsServers = linkProperties.getDnsServers();
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i = 0; i < dnsServers.size(); i++) {
            bArr[i] = ((InetAddress) dnsServers.get(i)).getAddress();
        }
        return bArr;
    }

    public static boolean storeKeyPair(Context context, byte[] bArr, byte[] bArr2) {
        try {
            Intent createInstallIntent = KeyChain.createInstallIntent();
            createInstallIntent.putExtra("PKEY", bArr2);
            createInstallIntent.putExtra("KEY", bArr);
            createInstallIntent.addFlags(268435456);
            context.startActivity(createInstallIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
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
}
