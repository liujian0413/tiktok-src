package com.p1848vk.sdk.p1849a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.C1642a;
import com.p1848vk.sdk.api.VKParameters;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.a.c */
public class C47109c {

    /* renamed from: a */
    static final /* synthetic */ boolean f120891a = (!C47109c.class.desiredAssertionStatus());

    /* renamed from: a */
    public static VKParameters m147303a(Object... objArr) {
        return new VKParameters(m147309b(objArr));
    }

    /* renamed from: a */
    public static String m147304a(Context context) {
        Object obj;
        try {
            Context applicationContext = context.getApplicationContext();
            if (!f120891a) {
                if (applicationContext == null) {
                    throw new AssertionError();
                }
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            if (!f120891a) {
                if (packageManager == null) {
                    throw new AssertionError();
                }
            }
            ApplicationInfo a = C47110d.m147313a(packageManager, context.getPackageName(), 0);
            if (a != null) {
                obj = packageManager.getApplicationLabel(a);
            } else {
                obj = "(unknown)";
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Map<String, Object> m147309b(Object... objArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(objArr.length / 2);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= objArr.length) {
                return linkedHashMap;
            }
            if (!(objArr[i] == null || objArr[i2] == null || !(objArr[i] instanceof String))) {
                linkedHashMap.put(objArr[i], objArr[i2]);
            }
            i += 2;
        }
    }

    /* renamed from: c */
    public static String m147311c(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return "";
        }
        int indexOf = str.indexOf("//");
        if (indexOf == -1) {
            i = 0;
        } else {
            i = indexOf + 2;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        int indexOf3 = str.indexOf(58, i);
        if (indexOf3 > 0 && indexOf3 < indexOf2) {
            indexOf2 = indexOf3;
        }
        return str.substring(i, indexOf2);
    }

    /* renamed from: a */
    private static String m147305a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        StringBuilder sb = new StringBuilder("%0");
        sb.append(bArr.length << 1);
        sb.append("X");
        return C1642a.m8034a(sb.toString(), new Object[]{bigInteger});
    }

    /* renamed from: b */
    public static String m147308b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    StringBuilder sb2 = new StringBuilder("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, String> m147306a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("&");
        HashMap hashMap = new HashMap(split.length);
        for (String split2 : split) {
            String[] split3 = split2.split("=");
            hashMap.put(split3[0], split3[1]);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static boolean m147310b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!f120891a) {
                if (packageManager == null) {
                    throw new AssertionError();
                }
            }
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m147312c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        if (!f120891a && packageManager == null) {
            throw new AssertionError();
        } else if (packageManager.queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static String[] m147307a(Context context, String str) {
        if (context != null) {
            try {
                if (context.getPackageManager() != null) {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                    if (!f120891a) {
                        if (packageInfo.signatures == null) {
                            throw new AssertionError();
                        }
                    }
                    String[] strArr = new String[packageInfo.signatures.length];
                    Signature[] signatureArr = packageInfo.signatures;
                    int length = signatureArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        Signature signature = signatureArr[i];
                        MessageDigest instance = MessageDigest.getInstance("SHA");
                        instance.update(signature.toByteArray());
                        int i3 = i2 + 1;
                        strArr[i2] = m147305a(instance.digest());
                        i++;
                        i2 = i3;
                    }
                    return strArr;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
