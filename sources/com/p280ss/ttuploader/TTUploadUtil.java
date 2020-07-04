package com.p280ss.ttuploader;

import android.os.SystemClock;
import com.bytedance.common.utility.C6319n;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.TTUploadUtil */
public class TTUploadUtil {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static synchronized void updateDNSServerIP() {
        synchronized (TTUploadUtil.class) {
            if (SystemClock.elapsedRealtime() - mServerIPTime >= 300000) {
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                            if (byName != null) {
                                TTUploadUtil.mServerIP = byName.getHostAddress();
                                TTUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                            }
                        } catch (UnknownHostException unused) {
                        }
                    }
                }).start();
            }
        }
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C6319n.m19593a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!C6319n.m19593a(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
