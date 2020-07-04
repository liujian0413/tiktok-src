package com.p280ss.android.common.applog;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.android.common.applog.EagleEye */
public class EagleEye {
    private static final String TAG = "EagleEye";
    private static boolean isInited;
    private static IEagleEyeInterface mIEagleEyeInterface;
    private static List<ScanResult> mScanResults;
    private static boolean sApkAllUploaded;
    private static WifiManager wifi;

    /* renamed from: com.ss.android.common.applog.EagleEye$IEagleEyeInterface */
    public interface IEagleEyeInterface {
        String appVersion();

        String channel();

        String deviceId();

        String huoshanId();

        Pair<Double, Double> location();

        String networkType();

        String nickName();

        String userId();
    }

    public static String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = charArray[b >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    public static int bytesToInt(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = bArr[i];
        }
        return new BigInteger(bArr2).intValue();
    }

    public static byte[] compress(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    private static String decryptAES(String str) {
        String s = UserInfo.getS();
        byte[] hexStringToByteArray = hexStringToByteArray(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(s.getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(UserInfo.getT());
        Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return new String(instance.doFinal(hexStringToByteArray), "UTF-8");
    }

    private static String decryptAES2(String str) {
        String s = UserInfo.getS();
        byte[] hexStringToByteArray = hexStringToByteArray(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(s.getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(UserInfo.getT());
        Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding ");
        instance.init(2, secretKeySpec, ivParameterSpec);
        return new String(instance.doFinal(hexStringToByteArray), "UTF-8");
    }

    public static byte[] encryptAES(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(UserInfo.getS().getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(UserInfo.getT());
        Cipher instance = Cipher.getInstance("AES/CFB/NoPadding ");
        instance.init(1, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr);
    }

    public static byte[] encryptAES2(byte[] bArr) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(UserInfo.getS().getBytes(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(UserInfo.getT());
        Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding ");
        instance.init(1, secretKeySpec, ivParameterSpec);
        return instance.doFinal(bArr);
    }

    public static String getCRC32(String str) {
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        StringBuilder sb = new StringBuilder();
        sb.append(crc32.getValue());
        return sb.toString();
    }

    public static String getCRC32(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(crc32.getValue());
        return sb.toString();
    }

    public static String getDexCRC(Context context, int i) {
        String sb;
        String packageCodePath = context.getPackageCodePath();
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            try {
                ZipFile zipFile = new ZipFile(packageCodePath);
                if (i2 == 0) {
                    sb = "classes.dex";
                } else {
                    StringBuilder sb2 = new StringBuilder("classes");
                    sb2.append(i2);
                    sb2.append(".dex");
                    sb = sb2.toString();
                }
                long crc = zipFile.getEntry(sb).getCrc();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(",");
                sb3.append(crc);
                str = sb3.toString();
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(str) ? str.substring(1) : "";
    }

    public static String getIpAddressJava() {
        return "";
    }

    public static String getPrivacyString(String str) {
        try {
            return decryptAES2(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static List<ScanResult> getScanResults() {
        return mScanResults;
    }

    public static String getVericationString(String str) {
        try {
            return decryptAES(str);
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String getWifiBSSID(Context context) {
        return "";
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static synchronized void init(Context context) {
        synchronized (EagleEye.class) {
            if (!isInited) {
                isInited = true;
            }
        }
    }

    public static String sendVerification(String str) {
        try {
            return byteArrayToHexStr(encryptAES(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    public static void setIEagleEyeInterface(IEagleEyeInterface iEagleEyeInterface) {
        mIEagleEyeInterface = iEagleEyeInterface;
    }

    public static String tanscode(String str) {
        try {
            String byteArrayToHexStr = byteArrayToHexStr(encryptAES(str.getBytes()));
            StringBuilder sb = new StringBuilder();
            sb.append(byteArrayToHexStr);
            sb.append(",");
            sb.append(getCRC32(byteArrayToHexStr));
            return byteArrayToHexStr(compress(sb.toString()));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String tanscode2(String str) {
        try {
            return byteArrayToHexStr(encryptAES2(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized void uninit(Context context) {
        synchronized (EagleEye.class) {
        }
    }

    public static boolean useVpn(Context context) {
        return false;
    }
}
