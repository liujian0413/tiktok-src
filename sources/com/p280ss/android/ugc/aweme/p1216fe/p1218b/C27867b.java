package com.p280ss.android.ugc.aweme.p1216fe.p1218b;

import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.fe.b.b */
public final class C27867b {
    /* renamed from: a */
    public static Map<String, String> m91291a() {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, String> m91292b() {
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", C6399b.m19934j());
        hashMap.put("device_id", TeaAgent.getServerDeviceId());
        hashMap.put("netType", NetworkUtils.getNetworkAccessType(C6399b.m19921a()));
        hashMap.put("appName", C6399b.m19929e());
        hashMap.put("aid", String.valueOf(C6399b.m19935k()));
        hashMap.put("user_id", C6861a.m21337f().getCurUserId());
        hashMap.put("versionCode", String.valueOf(C6399b.m19933i()));
        hashMap.put("channel", C6399b.m19941q());
        hashMap.put("os_version", VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("ironManSupported", String.valueOf(C7167b.m22380b().mo18647a().checkMiniAppEnable(C6399b.m19921a())));
        hashMap.put("prefetch_enable", "1");
        hashMap.put("device_type", Build.MODEL);
        return hashMap;
    }
}
