package com.facebook.devicerequests.p690a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.C1642a;
import com.facebook.C13499h;
import com.facebook.internal.C13926o;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.devicerequests.a.a */
public class C13358a {

    /* renamed from: a */
    private static final String f35291a = C13358a.class.getCanonicalName();

    /* renamed from: b */
    private static HashMap<String, RegistrationListener> f35292b = new HashMap<>();

    /* renamed from: a */
    public static String m39116a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static boolean m39119b() {
        if (VERSION.SDK_INT < 16 || !C13926o.m41097a(C13499h.m39725k()).f36841e.contains(SmartLoginOption.Enabled)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m39120c(String str) {
        m39122e(str);
    }

    /* renamed from: a */
    public static boolean m39117a(String str) {
        if (m39119b()) {
            return m39121d(str);
        }
        return false;
    }

    /* renamed from: e */
    private static void m39122e(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f35292b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) C13499h.m39721g().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException unused) {
            }
            f35292b.remove(str);
        }
    }

    /* renamed from: b */
    public static Bitmap m39118b(String str) {
        int i;
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, C34943c.f91127w, C34943c.f91127w, enumMap);
            int height = encode.getHeight();
            int width = encode.getWidth();
            int[] iArr = new int[(height * width)];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    int i5 = i3 + i4;
                    if (encode.get(i4, i2)) {
                        i = -16777216;
                    } else {
                        i = -1;
                    }
                    iArr[i5] = i;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    private static boolean m39121d(final String str) {
        if (f35292b.containsKey(str)) {
            return true;
        }
        final String a = C1642a.m8034a("%s_%s_%s", new Object[]{"fbsdk", C1642a.m8034a("%s-%s", new Object[]{"android", C13499h.m39723i().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(a);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) C13499h.m39721g().getSystemService("servicediscovery");
        C133591 r4 = new RegistrationListener() {
            public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }

            public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!a.equals(nsdServiceInfo.getServiceName())) {
                    C13358a.m39120c(str);
                }
            }

            public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                C13358a.m39120c(str);
            }
        };
        f35292b.put(str, r4);
        nsdManager.registerService(nsdServiceInfo, 1, r4);
        return true;
    }
}
