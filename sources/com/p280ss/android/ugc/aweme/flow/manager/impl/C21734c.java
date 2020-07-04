package com.p280ss.android.ugc.aweme.flow.manager.impl;

import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.flow.manager.impl.c */
public final class C21734c {

    /* renamed from: a */
    private static C21733b f58217a = new C21733b();

    /* renamed from: b */
    private static String f58218b = "MIIBSgIBADCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6y\nOcy5ISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9\nYX58x5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9\nleOCeB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0d\nMwYJD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC\n6iKOzNv3VoF13qYjXbZfk5SzrEkxIgCreAQWAhQXGH99Ax5L3UnAW0sIZD2mwhP7Xw==";

    /* renamed from: c */
    private static String f58219c = "MIIBtzCCASsGByqGSM44BAEwggEeAoGBAP1KfX3E3GfvdRXFQY6axz8ET49su6XAmMxQnE6yOcy5\nISHrtk3LY4TDrP69/YZVXr5n7TPqVvwimh3+Ps2T1O6Vyum2lzzTGsS+oJjDmt9bleQSIMc9YX58\nx5P/7yMEXUYW+9CiiudAe2Kf1xX9+172VYqyRJnV/Rs4poWnqcNDAhUA5OkDUsOYJPi1T9e9leOC\neB0mlj8CgYB+4ZY6ZHOCVC+rNaW/JrYoZpiKiH/fxkEKE/DwbBbjBflsU27kOfeROlsPiT0dMwYJ\nD1VbXmU2EvfGm3wJcf4Z9kuSQZmVrL8lLqf51cX9bt6c3PdeAA0r/2VTrLcPECJnWx9rIlwC6iKO\nzNv3VoF13qYjXbZfk5SzrEkxIgCreAOBhQACgYEA1saTuDLhAHbcycTbuP4ybR3hInvNYCDWIBdm\naZyRIuc6fUldCFJL1Ci61AWu/Z9P2P50n9FuPzkpfTdXs3OOe8tHbZKO1FTJ5YbMt8jpFYwhVPPF\nROA1tPE32Tp7cmVch9kBZ6DGwRDQinAlk7JEO72McRl0BjA9zZFECahrYIU=";

    /* renamed from: d */
    private static TreeMap<String, String> f58220d;

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f58220d = treeMap;
        treeMap.put("channelId", "C10000001072");
        f58220d.put("openType", "1");
        f58220d.put("userId", "");
        f58220d.put("message", "");
    }

    /* renamed from: a */
    private static String m72668a(Map<String, String> map) {
        String str = "msgId";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append("__xxx__");
            sb.append(AppLog.getServerDeviceId());
            map.put(str, sb.toString());
            return f58217a.mo58025a(f58218b, map);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m72669b(String str, Map<String, String> map) {
        try {
            return f58217a.mo58026a(str, f58219c, map);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m72667a(String str, Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        String str2 = "expandParams";
        if (map != null) {
            treeMap.putAll(map);
        }
        if (!treeMap.containsKey(str2)) {
            treeMap.put(str2, "");
        }
        treeMap.putAll(f58220d);
        String a = m72668a(treeMap);
        m72669b(a, treeMap);
        if (!TextUtils.isEmpty(a)) {
            treeMap.put("sign", URLEncoder.encode(a));
        }
        if (map != null && map.containsKey(str2)) {
            treeMap.put(str2, URLEncoder.encode((String) map.get(str2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C21733b.m72662a((Map<String, String>) treeMap));
        return sb.toString();
    }
}
