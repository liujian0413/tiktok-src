package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.p511a.C10076d;
import com.bytedance.frameworks.baselib.p511a.C10076d.C10078b;
import com.bytedance.framwork.core.p517a.C10207b;
import com.bytedance.framwork.core.p517a.C10218d;
import com.bytedance.framwork.core.p517a.p518a.C10205b;
import com.bytedance.framwork.core.p517a.p518a.C10206c;
import com.bytedance.framwork.core.p517a.p520c.C10215c;
import com.bytedance.framwork.core.p517a.p520c.C10216d;
import com.bytedance.framwork.core.p517a.p521d.C10219a;
import com.bytedance.framwork.core.p517a.p521d.C10219a.C10222b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKMonitor implements C10205b, C10215c, C10222b {
    private static ConcurrentHashMap<String, List<String>> sAidToConfigUrl = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, List<String>> sAidToDefaultReportUrl = new ConcurrentHashMap<>();
    private String mAid;
    private volatile JSONObject mAllowLogType;
    private volatile JSONObject mAllowService;
    public C10241a mCacheData;
    private HashMap<String, String> mCommonParams;
    public volatile boolean mConfigExit;
    public List<String> mConfigUrls = new ArrayList(Arrays.asList(new String[]{"https://mon.snssdk.com/monitor/appmonitor/v2/settings", "https://monsetting.toutiao.com/monitor/appmonitor/v2/settings"}));
    private Context mContext;
    private volatile long mFetchSettingInterval;
    public IGetCommonParams mGetCommonParams;
    private volatile boolean mHasInit;
    private JSONObject mHeaderInfo;
    public volatile boolean mIsEncrypt = true;
    private volatile long mLastFetchSettingTime;
    private volatile boolean mLogRemoveNet;
    private volatile boolean mLogRemoveSwitch;
    private C10207b mLogReportManager;
    private volatile int mLogSendSwitch = 1;
    private C10218d mMonitorManager;
    private volatile long mMonitorMaxRowCount;
    private volatile int mReportCount;
    private volatile int mReportFailBaseTime;
    private volatile int mReportFailRepeatCount;
    private volatile int mReportInterval;
    private List<String> mReportUrlList = new ArrayList(Arrays.asList(new String[]{"https://mon.snssdk.com/monitor/collect/", "https://mon.toutiao.com/monitor/collect/", "https://mon.toutiaocloud.com/monitor/collect/", "https://mon.toutiaocloud.net/monitor/collect/"}));
    private volatile long mStopCollectInterval = 0;
    private volatile long mStopCollectLogTime = 0;
    private volatile int mStopIntervalTimes = 0;
    private volatile long mStopMoreChannelInterval;

    public interface IGetCommonParams {
        String getSessionId();
    }

    private void handleResponseResult(JSONObject jSONObject) {
    }

    public long getMonitorLogMaxSaveCount() {
        return this.mMonitorMaxRowCount;
    }

    public JSONObject reportJsonHeaderInfo() {
        return this.mHeaderInfo;
    }

    /* access modifiers changed from: 0000 */
    public boolean getLogSendSwitch() {
        if (this.mLogSendSwitch == 1) {
            return true;
        }
        return false;
    }

    public boolean isLogSendSwitch() {
        if (this.mLogSendSwitch == 1) {
            return true;
        }
        return false;
    }

    private String getSessionId() {
        if (this.mGetCommonParams != null) {
            return this.mGetCommonParams.getSessionId();
        }
        return null;
    }

    private void initLogLib() {
        C10076d.m29937a((C10078b) new C10078b() {
            /* renamed from: a */
            public final boolean mo15063a(Context context) {
                return MonitorNetUtil.m30357a(context);
            }
        });
    }

    public int getNetWorkType() {
        return NetworkUtils.m19549c(this.mContext).getValue();
    }

    public boolean getRemoveSwitch() {
        if (this.mLogRemoveNet) {
            return this.mLogRemoveNet;
        }
        return this.mLogRemoveSwitch;
    }

    public int reportCount() {
        if (this.mReportCount <= 0) {
            return 100;
        }
        return this.mReportCount;
    }

    public int reportFailRepeatBaseTime() {
        if (this.mReportFailBaseTime <= 0) {
            return 15;
        }
        return this.mReportFailBaseTime;
    }

    public int reportFailRepeatCount() {
        if (this.mReportFailRepeatCount <= 0) {
            return 4;
        }
        return this.mReportFailRepeatCount;
    }

    public int reportInterval() {
        if (this.mReportInterval <= 0) {
            return 120;
        }
        return this.mReportInterval;
    }

    private boolean needUpdateConfigFromNet() {
        if ((System.currentTimeMillis() - this.mLastFetchSettingTime) / 1000 > this.mFetchSettingInterval) {
            return true;
        }
        return false;
    }

    public long stopMoreChannelInterval() {
        if (this.mStopMoreChannelInterval == 0) {
            return 1800000;
        }
        return this.mStopMoreChannelInterval * 1000;
    }

    private SharedPreferences getSp() {
        String a = C10246e.m30371a(this.mContext);
        Context context = this.mContext;
        StringBuilder sb = new StringBuilder("monitor_config");
        sb.append(this.mAid);
        sb.append(a);
        return C7285c.m22838a(context, sb.toString(), 0);
    }

    private void initConfig() {
        SharedPreferences sp = getSp();
        String string = sp.getString("monitor_net_config", null);
        this.mLastFetchSettingTime = sp.getLong("monitor_configure_refresh_time", 0);
        if (string != null && !TextUtils.isEmpty(string)) {
            try {
                this.mConfigExit = true;
                updateConfig(new JSONObject(string));
            } catch (Exception unused) {
            }
        }
        updateConfigFromNet(false);
    }

    public List<String> reportUrl(String str) {
        return this.mReportUrlList;
    }

    public boolean getLogTypeSwitch(String str) {
        if (this.mAllowLogType == null || TextUtils.isEmpty(str) || this.mAllowLogType.opt(str) == null) {
            return false;
        }
        return true;
    }

    public boolean getServiceSwitch(String str) {
        if (this.mAllowService == null || TextUtils.isEmpty(str) || this.mAllowService.opt(str) == null) {
            return false;
        }
        return true;
    }

    public void onTimeEvent(long j) {
        if (System.currentTimeMillis() - this.mStopCollectLogTime > this.mStopCollectInterval) {
            this.mLogRemoveNet = false;
            if (this.mMonitorManager != null) {
                this.mMonitorManager.f27795a = getLogSendSwitch();
            }
        }
        if (this.mFetchSettingInterval > 0) {
            updateConfigFromNet(false);
        }
    }

    /* access modifiers changed from: 0000 */
    public void updateConfigFromNet(boolean z) {
        if (this.mFetchSettingInterval < 600) {
            this.mFetchSettingInterval = 600;
        }
        if ((z || needUpdateConfigFromNet()) && MonitorNetUtil.m30357a(this.mContext)) {
            synchronized (SDKMonitor.class) {
                this.mLastFetchSettingTime = System.currentTimeMillis();
            }
            try {
                C10219a.m30335a().mo24932a((Runnable) new Runnable() {
                    public final void run() {
                        try {
                            if (SDKMonitor.this.mGetCommonParams != null) {
                                for (String addParamsToURL : SDKMonitor.this.mConfigUrls) {
                                    String addParamsToURL2 = SDKMonitor.this.addParamsToURL(addParamsToURL);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(addParamsToURL2);
                                    sb.append("&encrypt=close");
                                    try {
                                        byte[] a = MonitorNetUtil.m30360a(sb.toString(), null, SDKMonitor.this.mIsEncrypt);
                                        if (a != null) {
                                            SDKMonitor.this.updateToSP(new JSONObject(new String(a)));
                                        }
                                        return;
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                            if (!SDKMonitor.this.mConfigExit) {
                                SDKMonitor.this.mConfigExit = true;
                                SDKMonitor.this.mCacheData.mo24971a(SDKMonitor.this);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    protected SDKMonitor(String str) {
        this.mAid = str;
        this.mConfigExit = false;
        this.mCacheData = new C10241a();
    }

    public void updateToSP(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                updateConfig(jSONObject.getJSONObject("data"));
                Editor edit = getSp().edit();
                edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                edit.putString("monitor_net_config", jSONObject.getJSONObject("data").toString());
                edit.apply();
                if (!this.mConfigExit) {
                    this.mConfigExit = true;
                    this.mCacheData.mo24971a(this);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:6|7|8|9|(2:13|(3:15|(2:19|36)|20))|21|22|(1:24)|25|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updateConfig(org.json.JSONObject r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x00bd
            int r0 = r8.length()     // Catch:{ all -> 0x00bb }
            if (r0 > 0) goto L_0x000b
            goto L_0x00bd
        L_0x000b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00bb }
            r0.<init>()     // Catch:{ all -> 0x00bb }
            r1 = 0
            java.lang.String r2 = "report_host_new"
            org.json.JSONArray r2 = r8.optJSONArray(r2)     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x003e
            int r3 = r2.length()     // Catch:{ Exception -> 0x003e }
            if (r3 <= 0) goto L_0x003e
            int r3 = r2.length()     // Catch:{ Exception -> 0x003e }
            r4 = 0
        L_0x0024:
            if (r4 >= r3) goto L_0x003e
            java.lang.String r5 = r2.getString(r4)     // Catch:{ Exception -> 0x003e }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x003e }
            if (r6 != 0) goto L_0x003b
            r6 = 46
            int r6 = r5.indexOf(r6)     // Catch:{ Exception -> 0x003e }
            if (r6 <= 0) goto L_0x003b
            r0.add(r5)     // Catch:{ Exception -> 0x003e }
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x003e:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0046
            r7.mReportUrlList = r0     // Catch:{ all -> 0x00bb }
        L_0x0046:
            java.lang.String r0 = "fetch_setting_interval"
            r2 = 1200(0x4b0, double:5.93E-321)
            long r2 = r8.optLong(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mFetchSettingInterval = r2     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "polling_interval"
            r2 = 120(0x78, float:1.68E-43)
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mReportInterval = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "once_max_count"
            r2 = 100
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mReportCount = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "max_retry_count"
            r2 = 4
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mReportFailRepeatCount = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "report_fail_base_time"
            r2 = 15
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mReportFailBaseTime = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "log_send_switch"
            r2 = 1
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mLogSendSwitch = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "more_channel_stop_interval"
            r3 = 1800(0x708, double:8.893E-321)
            long r3 = r8.optLong(r0, r3)     // Catch:{ all -> 0x00bb }
            r7.mStopMoreChannelInterval = r3     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "log_remvove_switch"
            boolean r0 = r8.optBoolean(r0, r1)     // Catch:{ all -> 0x00bb }
            r7.mLogRemoveSwitch = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "allow_service_name"
            org.json.JSONObject r0 = r8.optJSONObject(r0)     // Catch:{ all -> 0x00bb }
            r7.mAllowService = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "allow_log_type"
            org.json.JSONObject r0 = r8.optJSONObject(r0)     // Catch:{ all -> 0x00bb }
            r7.mAllowLogType = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "monitor_encrypt_switch"
            boolean r0 = r8.optBoolean(r0, r2)     // Catch:{ all -> 0x00bb }
            r7.mIsEncrypt = r0     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "monitor_log_max_save_count"
            r1 = 2000(0x7d0, double:9.88E-321)
            long r0 = r8.optLong(r0, r1)     // Catch:{ all -> 0x00bb }
            r7.mMonitorMaxRowCount = r0     // Catch:{ all -> 0x00bb }
            com.bytedance.framwork.core.a.b r8 = r7.mLogReportManager     // Catch:{ all -> 0x00bb }
            r8.mo24919b()     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)
            return
        L_0x00bb:
            r8 = move-exception
            goto L_0x00c2
        L_0x00bd:
            r8 = 0
            r7.mReportUrlList = r8     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)
            return
        L_0x00c2:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitor.updateConfig(org.json.JSONObject):void");
    }

    public String addParamsToURL(String str) {
        String str2;
        if (TextUtils.isDigitsOnly(str) || this.mCommonParams == null) {
            return str;
        }
        if (str.indexOf("?") < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            str = sb.toString();
        }
        if (str.endsWith("?")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(encode("sdk_version", "UTF-8"));
            sb2.append("=");
            sb2.append(encode("400", "UTF-8"));
            str2 = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("&");
            sb3.append(encode("sdk_version", "UTF-8"));
            sb3.append("=");
            sb3.append(encode("400", "UTF-8"));
            str2 = sb3.toString();
        }
        HashMap<String, String> hashMap = this.mCommonParams;
        if (hashMap != null && hashMap.size() > 0) {
            for (Entry entry : hashMap.entrySet()) {
                if (hashMap.get(entry.getKey()) != null) {
                    if (str2.endsWith("?")) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append(encode(entry.getKey().toString(), "UTF-8"));
                        sb4.append("=");
                        sb4.append(encode(((String) hashMap.get(entry.getKey())).toString(), "UTF-8"));
                        str2 = sb4.toString();
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append("&");
                        sb5.append(encode(entry.getKey().toString(), "UTF-8"));
                        sb5.append("=");
                        sb5.append(encode(((String) hashMap.get(entry.getKey())).toString(), "UTF-8"));
                        str2 = sb5.toString();
                    }
                }
            }
        }
        return str2;
    }

    protected static void setConfigUrl(String str, List<String> list) {
        sAidToConfigUrl.put(str, list);
    }

    protected static void setDeafultReportUrl(String str, List<String> list) {
        sAidToDefaultReportUrl.put(str, list);
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void monitorCommonLog(String str, JSONObject jSONObject) {
        try {
            if (!this.mConfigExit) {
                this.mCacheData.mo24972a(new C10243b(str, jSONObject, System.currentTimeMillis()));
            } else {
                monitorCommonLogAsync(str, jSONObject, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        monitorStatusAndDuration(str, 0, jSONObject, jSONObject2);
    }

    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        monitorStatusAndDuration(str, i, null, jSONObject);
    }

    public boolean init(final Context context, final JSONObject jSONObject, final IGetCommonParams iGetCommonParams) {
        C10219a.m30335a().mo24932a((Runnable) new Runnable() {
            public final void run() {
                SDKMonitor.this.initMonitor(context, jSONObject, iGetCommonParams);
                if (SDKMonitor.this.mConfigExit) {
                    SDKMonitor.this.mCacheData.mo24971a(SDKMonitor.this);
                }
            }
        });
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void monitorCommonLogAsync(String str, JSONObject jSONObject, long j) {
        C10219a a = C10219a.m30335a();
        final String str2 = str;
        final JSONObject jSONObject2 = jSONObject;
        final long j2 = j;
        C102406 r1 = new Runnable() {
            public final void run() {
                SDKMonitor.this.monitorCommonLogInternal(str2, jSONObject2, j2);
            }
        };
        a.mo24932a((Runnable) r1);
    }

    /* access modifiers changed from: 0000 */
    public void monitorCommonLogInternal(String str, JSONObject jSONObject, long j) {
        try {
            jSONObject.put("log_type", str);
            jSONObject.put("network_type", getNetWorkType());
            if (!TextUtils.isEmpty(getSessionId())) {
                jSONObject.put("session_id", getSessionId());
            }
            if (jSONObject.isNull("timestamp")) {
                jSONObject.put("timestamp", j);
            }
            if (this.mMonitorManager != null && getLogTypeSwitch(str)) {
                this.mMonitorManager.mo24930a("common_log", "common_log", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public void initMonitor(Context context, JSONObject jSONObject, IGetCommonParams iGetCommonParams) {
        try {
            this.mHasInit = true;
            this.mContext = context.getApplicationContext();
            this.mHeaderInfo = jSONObject;
            this.mHeaderInfo.put("aid", this.mAid);
            this.mHeaderInfo.put("os", "Android");
            this.mHeaderInfo.put("device_platform", "android");
            this.mHeaderInfo.put("os_version", VERSION.RELEASE);
            this.mHeaderInfo.put("os_api", VERSION.SDK_INT);
            this.mHeaderInfo.put("device_model", Build.MODEL);
            this.mHeaderInfo.put("device_brand", Build.BRAND);
            this.mHeaderInfo.put("device_manufacturer", Build.MANUFACTURER);
            this.mHeaderInfo.put("d_p", C10246e.m30372b(this.mContext));
            if (TextUtils.isEmpty(this.mHeaderInfo.optString("package_name"))) {
                this.mHeaderInfo.put("package_name", context.getPackageName());
            }
            PackageInfo packageInfo = null;
            if (TextUtils.isEmpty(this.mHeaderInfo.optString("version_name"))) {
                packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
                this.mHeaderInfo.put("version_name", packageInfo.versionName);
            }
            if (TextUtils.isEmpty(this.mHeaderInfo.optString("version_code"))) {
                if (packageInfo == null) {
                    packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0);
                }
                this.mHeaderInfo.put("version_code", packageInfo.versionCode);
            }
            this.mGetCommonParams = iGetCommonParams;
            if (this.mGetCommonParams == null) {
                this.mGetCommonParams = new IGetCommonParams() {
                    public final String getSessionId() {
                        return null;
                    }
                };
            }
            if (this.mCommonParams == null) {
                this.mCommonParams = new HashMap<>();
            }
            this.mCommonParams.put("aid", this.mAid);
            this.mCommonParams.put("device_id", this.mHeaderInfo.optString("device_id"));
            this.mCommonParams.put("device_platform", "android");
            this.mCommonParams.put("package_name", this.mHeaderInfo.optString("package_name"));
            this.mCommonParams.put("channel", this.mHeaderInfo.optString("channel"));
            this.mCommonParams.put("app_version", this.mHeaderInfo.optString("app_version"));
            C10206c.m30286a(this.mAid, (C10205b) this);
            C10216d.m30329a(this.mAid, (C10215c) this);
            initLogLib();
            this.mMonitorManager = new C10218d(this.mContext, this.mAid);
            this.mMonitorManager.mo24929a();
            this.mLogReportManager = new C10207b(this.mContext, this.mAid);
            this.mLogReportManager.mo24918a();
            List list = (List) sAidToConfigUrl.get(this.mAid);
            if (!C10245d.m30370a(list)) {
                this.mConfigUrls.clear();
                this.mConfigUrls.addAll(list);
            }
            List list2 = (List) sAidToDefaultReportUrl.get(this.mAid);
            if (!C10245d.m30370a(list2)) {
                this.mReportUrlList.clear();
                this.mReportUrlList.addAll(list2);
            }
            sAidToConfigUrl.clear();
            sAidToDefaultReportUrl.clear();
            initConfig();
        } catch (Exception unused) {
        }
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.mConfigExit) {
                C10241a aVar = this.mCacheData;
                C10248g gVar = new C10248g(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
                aVar.mo24973a(gVar);
                return;
            }
            monitorServiceAsync(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.mConfigExit) {
                C10241a aVar = this.mCacheData;
                C10248g gVar = new C10248g(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
                aVar.mo24973a(gVar);
                return;
            }
            monitorServiceAsync(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:1|2|(1:4)(1:5)|6|7|8|9|(1:11)|12|13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.framwork.core.p517a.p520c.C10217e sendLog(long r13, java.lang.String r15, byte[] r16, int r17, java.lang.String r18) {
        /*
            r12 = this;
            r1 = r12
            com.bytedance.framwork.core.a.c.e r2 = new com.bytedance.framwork.core.a.c.e
            r2.<init>()
            r3 = 0
            r4 = 1
            r0 = r15
            java.lang.String r7 = r12.addParamsToURL(r15)     // Catch:{ Throwable -> 0x0065 }
            r0 = r17
            if (r0 != r4) goto L_0x001f
            com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil$CompressType r9 = com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil.CompressType.GZIP     // Catch:{ Throwable -> 0x0065 }
            boolean r11 = r1.mIsEncrypt     // Catch:{ Throwable -> 0x0065 }
            r5 = r13
            r8 = r16
            r10 = r18
            byte[] r0 = com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil.m30358a(r5, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x0065 }
            goto L_0x002c
        L_0x001f:
            com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil$CompressType r9 = com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil.CompressType.NONE     // Catch:{ Throwable -> 0x0065 }
            boolean r11 = r1.mIsEncrypt     // Catch:{ Throwable -> 0x0065 }
            r5 = r13
            r8 = r16
            r10 = r18
            byte[] r0 = com.bytedance.framwork.core.sdkmonitor.MonitorNetUtil.m30358a(r5, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x0065 }
        L_0x002c:
            r1.mStopIntervalTimes = r3     // Catch:{ Throwable -> 0x0065 }
            r5 = 0
            r1.mStopCollectInterval = r5     // Catch:{ Throwable -> 0x0065 }
            r5 = 200(0xc8, float:2.8E-43)
            r2.f27793a = r5     // Catch:{ Throwable -> 0x0065 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Throwable -> 0x0065 }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x0065 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r0 = "data"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Throwable -> 0x005f }
            boolean r6 = r0.isEmpty()     // Catch:{ Throwable -> 0x005f }
            if (r6 != 0) goto L_0x005a
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x005f }
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x005f }
            java.lang.String r0 = com.bytedance.framwork.core.p517a.p522e.C10229a.m30351a(r0)     // Catch:{ Throwable -> 0x005f }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x005f }
            r5 = r6
        L_0x005a:
            r12.handleResponseResult(r5)     // Catch:{ Throwable -> 0x005f }
            r2.f27794b = r5     // Catch:{ Throwable -> 0x005f }
        L_0x005f:
            r12.handleResponseResult(r5)     // Catch:{ Throwable -> 0x0062 }
        L_0x0062:
            r2.f27794b = r5     // Catch:{ Throwable -> 0x0065 }
            return r2
        L_0x0065:
            r0 = move-exception
            boolean r5 = r0 instanceof com.bytedance.framwork.core.sdkmonitor.HttpResponseException
            if (r5 == 0) goto L_0x0073
            com.bytedance.framwork.core.sdkmonitor.HttpResponseException r0 = (com.bytedance.framwork.core.sdkmonitor.HttpResponseException) r0
            int r0 = r0.getStatusCode()
            r2.f27793a = r0
            goto L_0x0076
        L_0x0073:
            r0 = -1
            r2.f27793a = r0
        L_0x0076:
            int r0 = r2.f27793a
            r5 = 503(0x1f7, float:7.05E-43)
            if (r0 == r5) goto L_0x0082
            int r0 = r2.f27793a
            r5 = 509(0x1fd, float:7.13E-43)
            if (r0 != r5) goto L_0x00b0
        L_0x0082:
            r1.mLogRemoveNet = r4
            long r5 = java.lang.System.currentTimeMillis()
            r1.mStopCollectLogTime = r5
            com.bytedance.framwork.core.a.d r0 = r1.mMonitorManager
            r0.f27795a = r3
            com.bytedance.framwork.core.a.b r0 = r1.mLogReportManager
            r0.f27754a = r3
            int r0 = r1.mStopIntervalTimes
            if (r0 != 0) goto L_0x009c
            r5 = 300000(0x493e0, double:1.482197E-318)
            r1.mStopCollectInterval = r5
            goto L_0x00ab
        L_0x009c:
            int r0 = r1.mStopIntervalTimes
            if (r0 != r4) goto L_0x00a6
            r5 = 900000(0xdbba0, double:4.44659E-318)
            r1.mStopCollectInterval = r5
            goto L_0x00ab
        L_0x00a6:
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            r1.mStopCollectInterval = r5
        L_0x00ab:
            int r0 = r1.mStopIntervalTimes
            int r0 = r0 + r4
            r1.mStopIntervalTimes = r0
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.SDKMonitor.sendLog(long, java.lang.String, byte[], int, java.lang.String):com.bytedance.framwork.core.a.c.e");
    }

    /* access modifiers changed from: 0000 */
    public void monitorServiceAsync(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        C10219a a = C10219a.m30335a();
        final String str2 = str;
        final int i2 = i;
        final JSONObject jSONObject5 = jSONObject;
        final JSONObject jSONObject6 = jSONObject2;
        final JSONObject jSONObject7 = jSONObject3;
        final JSONObject jSONObject8 = jSONObject4;
        final long j2 = j;
        C102395 r1 = new Runnable() {
            public final void run() {
                SDKMonitor.this.monitorService(str2, i2, jSONObject5, jSONObject6, jSONObject7, jSONObject8, j2);
            }
        };
        a.mo24932a((Runnable) r1);
    }

    /* access modifiers changed from: 0000 */
    public void monitorService(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i);
        jSONObject4.put("network_type", getNetWorkType());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j);
        }
        if (!TextUtils.isEmpty(getSessionId())) {
            jSONObject4.put("session_id", getSessionId());
        }
        if (this.mMonitorManager != null && getServiceSwitch(str)) {
            this.mMonitorManager.mo24930a("service_monitor", "service_monitor", jSONObject4);
        }
    }
}
