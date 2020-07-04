package com.p280ss.android.ugc.aweme.net;

import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10134b;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10132f.C10135c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.p265b.C6482a;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.language.StoreIdcHelper;
import com.p280ss.android.ugc.aweme.utils.C43102em;
import com.taobao.android.dexposed.ClassUtils;
import com.ttnet.org.chromium.base.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.f */
public final class C7179f extends C6482a {

    /* renamed from: b */
    public static final C7179f f20106b = new C7179f();

    /* renamed from: c */
    private static int f20107c = 0;

    /* renamed from: a */
    public static void m22409a() {
        f20107c = 0;
    }

    public final String getAbClient() {
        return null;
    }

    public final String getAbFeature() {
        return null;
    }

    public final String getAbFlag() {
        return "0";
    }

    public final String getAppName() {
        return C6399b.m19929e();
    }

    public final String getCarrierRegion() {
        return C32326h.m104886h();
    }

    public final String getChannel() {
        return C6399b.m19941q();
    }

    public final String getDeviceId() {
        return AppLog.getServerDeviceId();
    }

    public final String getRegion() {
        return C32326h.m104885g();
    }

    public final String getUUID() {
        return C43102em.m136719a();
    }

    public final String getVersionName() {
        return C6399b.m19934j();
    }

    public final String getAbVersion() {
        if (C6399b.m19944t()) {
            return C6399b.m19934j();
        }
        return null;
    }

    public final String getAppId() {
        return String.valueOf(AppLog.getAppId());
    }

    public final String getGetDomainDefaultJSON() {
        if (C6399b.m19946v()) {
            return "{    \"data\": {         \"ttnet_http_dns_enabled\": 1,         \"ttnet_http_dns_google\": 1,         \"ttnet_http_dns_prefer\": 0,         \"ttnet_local_dns_time_out\": 2,         \"ttnet_prefer_address_family\": 1,         \"ttnet_http_dns_addr\": {             \"api.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-16.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-tt.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api.tiktokv.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-t2.tiktokv.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api2.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-t2.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-19.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-1.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"applog.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"ichannel.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api16.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"i.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"log.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"dns.google.com\":\"216.58.220.206\"         },         \"ttnet_min_dns_ttl\" : {           \"dns.google.com\": 6000,           \"p16.muscdn.com\":600,           \"v16.muscdn.com\":600       },       \"ttnet_preconnect_urls\": {           \"https://api2.musical.ly\": 4,           \"https://api2-19.musical.ly\": 4,           \"http://p16.muscdn.com\": 6,           \"http://v16.muscdn.com\": 1,           \"https://dns.google.com\": 1       },         \"ttnet_detect_config\":{             \"enable_feedback\": 0,             \"enable_except\": 0,             \"enable_polling\": 0,             \"actions\": 1,             \"timeout\": 30,             \"interval\": 0,             \"polling_interval\": 300,             \"polling_bg_interval\": 300,             \"polling_start_delay\": 15,             \"polling_bg_expire_interval\": 300,             \"req_err_cnt\": 3,             \"req_err_ip_cnt\": 0,             \"req_err_api_cnt\": 2,             \"req_err_host_cnt\": 2,             \"targets\": [],             \"req_host_list\":[]         },       \"ttnet_socket_pool_param\": {           \"max_sockets_per_group\": 20       }    },    \"message\":\"success\"}";
        }
        return "{    \"data\": {         \"ttnet_http_dns_enabled\": 1,         \"ttnet_http_dns_google\": 1,         \"ttnet_http_dns_prefer\": 0,         \"ttnet_local_dns_time_out\": 2,         \"ttnet_prefer_address_family\": 1,         \"ttnet_http_dns_addr\": {             \"api.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-16.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-tt.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api.tiktokv.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api-t2.tiktokv.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api2.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-t2.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-19.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api2-1.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"applog.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"ichannel.musical.ly\":\"47.252.50.157,47.252.50.101,47.252.50.100\",             \"api16.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"i.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"log.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"dns.google.com\":\"216.58.220.206\"         },         \"ttnet_min_dns_ttl\": {             \"dns.google.com\": 6000,             \"p16-tiktokcdn-com.akamaized.net\": 600,             \"v16-tiktokcdn-com.akamaized.net\": 600         },         \"ttnet_preconnect_urls\": {             \"https://api.tiktokv.com\": 4,             \"http://p16-tiktokcdn-com.akamaized.net\": 6,             \"http://v16-tiktokcdn-com.akamaized.net\": 1,             \"https://dns.google.com\": 1         },         \"ttnet_detect_config\":{             \"enable_feedback\": 0,             \"enable_except\": 0,             \"enable_polling\": 0,             \"actions\": 1,             \"timeout\": 30,             \"interval\": 0,             \"polling_interval\": 300,             \"polling_bg_interval\": 300,             \"polling_start_delay\": 15,             \"polling_bg_expire_interval\": 300,             \"req_err_cnt\": 3,             \"req_err_ip_cnt\": 0,             \"req_err_api_cnt\": 2,             \"req_err_host_cnt\": 2,             \"targets\": [],             \"req_host_list\":[]         },         \"ttnet_socket_pool_param\": {            \"max_sockets_per_group\": 20         }    },    \"message\":\"success\"}";
    }

    public final String getManifestVersionCode() {
        return String.valueOf(C6399b.m19939o());
    }

    public final String getStoreIdc() {
        return StoreIdcHelper.get().getStoreIdc();
    }

    public final String getUpdateVersionCode() {
        return String.valueOf(C6399b.m19932h());
    }

    public final String getVersionCode() {
        return String.valueOf(C6399b.m19933i());
    }

    public final String getOpenUdid() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (C6319n.m19593a(str)) {
            return "";
        }
        return str;
    }

    public final String getSysRegion() {
        return ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion();
    }

    public final boolean loggerDebug() {
        if (Logger.debug() || "local_test".equals(C6399b.m19941q())) {
            return true;
        }
        return false;
    }

    public final String getUserId() {
        String userId = AppLog.getUserId();
        if (!C6319n.m19593a(userId) && !userId.equals("0")) {
            return userId;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            return iUserService.getCurrentUserID();
        }
        return userId;
    }

    public final void onServerConfigUpdated(String str) {
        super.onServerConfigUpdated(str);
        try {
            String[] split = new JSONObject(str).getJSONObject("data").getString("share_cookie_host_list").split(",");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (str2.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                    str2 = str2.substring(1);
                }
                arrayList.add(str2);
            }
            C18897a.m61683a((Collection<String>) arrayList);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo15804a(int i) {
        super.mo15804a(i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("counter", f20107c);
            jSONObject.put("event", "tt_network_status");
            jSONObject.put("scene", "network");
        } catch (JSONException unused) {
        }
        AppLog.recordMiscLog(C6399b.m19921a(), "app_perf", jSONObject);
        f20107c++;
    }

    /* renamed from: a */
    public final void mo15805a(C10132f fVar) {
        int i;
        int i2;
        if (fVar.f27584a == 0) {
            Iterator it = fVar.f27590g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    i2 = 0;
                    break;
                }
                C10135c cVar = (C10135c) it.next();
                if (cVar != null) {
                    C10134b bVar = (C10134b) cVar;
                    if (bVar.f27608b == 200) {
                        i = 1;
                        i2 = bVar.f27615i;
                        break;
                    }
                }
            }
            C1592h.m7853a((Callable<TResult>) new C34067g<TResult>(i, i2));
            C34093n.m109757a(false);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m22408a(int i, int i2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("detect_source", 0);
        jSONObject.put("network_status", i);
        jSONObject.put("detect_cost", i2);
        jSONObject.put("detect_start", C34093n.m109755a());
        C6907h.m21528b("network_detect_result", jSONObject);
        return null;
    }

    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            if (Logger.debug()) {
                StringBuilder sb = new StringBuilder("Get monitor json = ");
                sb.append(str);
                sb.append(" logType = ");
                sb.append(str2);
                Logger.m146406d("CronetDependAdapter", sb.toString());
            }
            C6877n.m21447a(str2, new JSONObject(str));
        } catch (Throwable unused) {
        }
    }
}
