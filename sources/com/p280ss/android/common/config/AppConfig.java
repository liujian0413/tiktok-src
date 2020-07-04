package com.p280ss.android.common.config;

import android.content.Context;
import android.location.Address;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.common.util.C6774e;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.C6764c;
import com.p280ss.android.http.legacy.C6811c;
import com.p280ss.android.http.legacy.client.p297a.C6812a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.p294e.p870b.C19539b;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* renamed from: com.ss.android.common.config.AppConfig */
public class AppConfig implements C6310a, C6764c {
    private static String[] CONFIG_SERVERS = {"dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};
    private static String DOMAIN_CONFIG_URL = "";
    private static AppConfig mInstance;
    private static int sShuffleDns = -1;
    private Address address = null;
    private boolean isDebug = false;
    private boolean isEnableLinkSelector = false;
    private boolean isFirstActivityCreate;
    private boolean isTryInitFailed;
    private final Context mContext;
    private List<String> mCookieShareHostList = new ArrayList();
    private HashMap<String, InetAddress[]> mDnsMap;
    private boolean mEnableLocation = true;
    private boolean mForceChanged = true;
    final C6309f mHandler = new C6309f(Looper.getMainLooper(), this);
    private HashMap<String, List<ConnectHost>> mHostMap = new HashMap<>();
    private final boolean mIsMainProcess;
    private long mLastRefreshTime;
    private long mLastTryRefreshTime;
    private HashMap<String, List<C19539b>> mLinkHostMap = new HashMap<>();
    private long mLinkOptInterval = 300;
    private HashMap<Pattern, String> mLinkPathMap = new LinkedHashMap();
    private boolean mLoading;
    private volatile boolean mLocalLoaded;
    private HashMap<Pattern, String> mPathHostGroupMap = new LinkedHashMap();
    private HashMap<String, List<ConnectHost>> mUIHostMap = new HashMap<>();
    private HashMap<Pattern, String> mUiPathHostGroupMap = new LinkedHashMap();
    private boolean mUseHttps = true;
    private boolean mUseLinkSelector = true;

    /* renamed from: com.ss.android.common.config.AppConfig$_lancet */
    class _lancet {
        private _lancet() {
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(Context context) {
            try {
                return C6900g.m21454b().mo16943d();
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r6v0, types: [java.util.List, java.util.List<java.lang.String>] */
        /* renamed from: com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_inCookieHostList */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static boolean m20906xa5c485d2(com.p280ss.android.common.config.AppConfig r4, java.lang.String r5, java.util.List<java.lang.String> r6) {
            /*
                r4 = 0
                boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x0062 }
                if (r0 != 0) goto L_0x0062
                boolean r0 = com.bytedance.common.utility.C6311g.m19573a(r6)     // Catch:{ Throwable -> 0x0062 }
                if (r0 == 0) goto L_0x000e
                goto L_0x0062
            L_0x000e:
                com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()     // Catch:{ Throwable -> 0x0062 }
                boolean r0 = r0.mo18814n()     // Catch:{ Throwable -> 0x0062 }
                r1 = 1
                if (r0 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.app.AwemeApplication r0 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()     // Catch:{ Throwable -> 0x0062 }
                com.ss.android.common.config.AppConfig r0 = com.p280ss.android.common.config.AppConfig.getInstance(r0)     // Catch:{ Throwable -> 0x0062 }
                monitor-enter(r0)     // Catch:{ Throwable -> 0x0062 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0042 }
            L_0x0026:
                boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0042 }
                if (r2 == 0) goto L_0x0040
                java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0042 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0042 }
                boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ all -> 0x0042 }
                if (r3 != 0) goto L_0x0026
                boolean r2 = r5.endsWith(r2)     // Catch:{ all -> 0x0042 }
                if (r2 == 0) goto L_0x0026
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return r1
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                return r4
            L_0x0042:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                throw r5     // Catch:{ Throwable -> 0x0062 }
            L_0x0045:
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0062 }
            L_0x0049:
                boolean r0 = r6.hasNext()     // Catch:{ Throwable -> 0x0062 }
                if (r0 == 0) goto L_0x0062
                java.lang.Object r0 = r6.next()     // Catch:{ Throwable -> 0x0062 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0062 }
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x0062 }
                if (r2 != 0) goto L_0x0049
                boolean r0 = r5.endsWith(r0)     // Catch:{ Throwable -> 0x0062 }
                if (r0 == 0) goto L_0x0049
                return r1
            L_0x0062:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig._lancet.m20906xa5c485d2(com.ss.android.common.config.AppConfig, java.lang.String, java.util.List):boolean");
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_tryRefreshConfig */
        static void m20907x6dfbc865(AppConfig appConfig, boolean z) {
            if (C6384b.m19835a().mo15287a(LinkSelectorTypeExperiment.class, true, "link_selector_type", C6384b.m19835a().mo15295d().link_selector_type, 0) != 1) {
                appConfig.tryRefreshConfig$___twin___(z);
            }
        }
    }

    private boolean inCookieHostList(String str, List list) {
        return _lancet.m20906xa5c485d2(this, str, list);
    }

    public String filterUrlOnUIThread(String str) {
        return str;
    }

    public boolean isEnableLinkSelector() {
        return this.isEnableLinkSelector;
    }

    public void tryRefreshConfig(boolean z) {
        _lancet.m20907x6dfbc865(this, z);
    }

    public void tryRefreshConfig() {
        tryRefreshConfig(false);
    }

    public void setFirstActivityCreate() {
        if (!this.isFirstActivityCreate) {
            this.isFirstActivityCreate = true;
            if (this.isTryInitFailed) {
                initLinkSelector();
            }
        }
    }

    private void initLinkSelector() {
        if (!this.isFirstActivityCreate) {
            this.isTryInitFailed = true;
            return;
        }
        this.isTryInitFailed = false;
        C6806b.m21145a(this.mContext).mo16626a(this.isEnableLinkSelector).mo16623a(this.mLinkOptInterval * 1000).mo16625a((Map<String, List<C19539b>>) this.mLinkHostMap, (Map<Pattern, String>) this.mLinkPathMap).mo16633c().mo16622a((int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT).mo16628a((C6805a) null);
    }

    /* access modifiers changed from: 0000 */
    public synchronized void tryLoadDomainConfig4OtherProcess() {
        if (System.currentTimeMillis() - this.mLastRefreshTime > 3600000) {
            this.mLastRefreshTime = System.currentTimeMillis();
            try {
                extractPathHostMapping(C6774e.m20938a(this.mContext, 2));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void tryLoadLocalConfig() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.mLocalLoaded     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r10)
            return
        L_0x0007:
            r0 = 1
            r10.mLocalLoaded = r0     // Catch:{ all -> 0x008c }
            android.content.Context r0 = r10.mContext     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "smart_network_select"
            r2 = 0
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r0, r1, r2)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "config_mapping"
            r3 = 0
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "domain_cookie_share_mapping"
            java.lang.String r4 = r0.getString(r4, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "domain_group_host_list"
            java.lang.String r5 = r0.getString(r5, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r6 = "is_enable_selector"
            boolean r2 = r0.getBoolean(r6, r2)     // Catch:{ all -> 0x008c }
            r10.isEnableLinkSelector = r2     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "link_opt_interval"
            r6 = 300(0x12c, double:1.48E-321)
            long r6 = r0.getLong(r2, r6)     // Catch:{ all -> 0x008c }
            r10.mLinkOptInterval = r6     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "last_refresh_time"
            r6 = 0
            long r6 = r0.getLong(r2, r6)     // Catch:{ all -> 0x008c }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008c }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0049
            r6 = r8
        L_0x0049:
            r10.mLastRefreshTime = r6     // Catch:{ all -> 0x008c }
            r10.extractPathHostMapping(r1)     // Catch:{ all -> 0x008c }
            r10.extractDomainList(r4)     // Catch:{ all -> 0x008c }
            r10.extractHostMap(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "static_dns_mapping"
            java.lang.String r1 = r0.getString(r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "shuffle_dns"
            r3 = -1
            int r2 = r0.getInt(r2, r3)     // Catch:{ all -> 0x008c }
            sShuffleDns = r2     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "use_dns_mapping"
            int r0 = r0.getInt(r2, r3)     // Catch:{ all -> 0x008c }
            com.p280ss.android.common.util.NetworkUtils.setUseDnsMapping(r0)     // Catch:{ all -> 0x008c }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x008c }
            r0.<init>()     // Catch:{ all -> 0x008c }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x0087
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0087 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0087 }
            com.p280ss.android.common.config.AppConfigParser.parseDnsMap(r0, r2)     // Catch:{ Exception -> 0x0087 }
            monitor-enter(r10)     // Catch:{ Exception -> 0x0087 }
            r10.mDnsMap = r0     // Catch:{ all -> 0x0084 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            r10.initLinkSelector()     // Catch:{ all -> 0x008c }
            monitor-exit(r10)
            return
        L_0x008c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig.tryLoadLocalConfig():void");
    }

    public static void setConfigServers(String[] strArr) {
        CONFIG_SERVERS = strArr;
    }

    public static void setDomainConfigUrl(String str) {
        DOMAIN_CONFIG_URL = str;
    }

    public void setAddress(Address address2) {
        this.address = address2;
    }

    public void setDebug(boolean z) {
        this.isDebug = z;
    }

    public void setEnableLocation(boolean z) {
        this.mEnableLocation = z;
    }

    public void setUseHttps(boolean z) {
        this.mUseHttps = z;
    }

    public void setUseLinkSelector(boolean z) {
        this.mUseLinkSelector = z;
    }

    public static void onActivityResume(Context context) {
        AppConfig appConfig = mInstance;
        if (appConfig != null) {
            appConfig.tryRefreshConfig(true);
        }
    }

    private void doRefresh(final boolean z) {
        this.mLoading = true;
        if (z) {
            this.mLastTryRefreshTime = System.currentTimeMillis();
        }
        new Thread("AppConfigThread") {
            public void run() {
                AppConfig.this.updateConfig(z);
            }
        }.start();
    }

    private void extractDomainList(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                if (AppConfigParser.parseCookieShareDomain(arrayList, jSONArray)) {
                    this.mCookieShareHostList = arrayList;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static AppConfig getInstance(Context context) {
        AppConfig appConfig;
        synchronized (AppConfig.class) {
            if (mInstance == null) {
                AppConfig appConfig2 = new AppConfig(context.getApplicationContext(), C6776h.m20947b(context));
                mInstance = appConfig2;
                NetworkUtils.setApiRequestInterceptor(appConfig2);
            }
            appConfig = mInstance;
        }
        return appConfig;
    }

    public List<String> getShareCookieHostList(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            List<String> list = this.mCookieShareHostList;
            if (inCookieHostList(str, list)) {
                return list;
            }
            return null;
        }
    }

    private void extractHostMap(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HashMap<String, List<ConnectHost>> hashMap = new HashMap<>();
                HashMap<String, List<C19539b>> hashMap2 = new HashMap<>();
                if (AppConfigParser.parseHostMap(hashMap, jSONArray, hashMap2)) {
                    this.mHostMap = hashMap;
                    this.mLinkHostMap = hashMap2;
                    HashMap<String, List<ConnectHost>> hashMap3 = new HashMap<>();
                    hashMap3.putAll(hashMap);
                    this.mUIHostMap = hashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private void extractPathHostMapping(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (AppConfigParser.parsePathHostMap(linkedHashMap, jSONArray, linkedHashMap2)) {
                    this.mPathHostGroupMap = linkedHashMap;
                    this.mLinkPathMap = linkedHashMap2;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.putAll(linkedHashMap);
                    this.mUiPathHostGroupMap = linkedHashMap3;
                }
            } catch (Exception unused) {
            }
        }
    }

    private String filterUrlForDebug(String str) {
        String str2;
        URI create = URI.create(str);
        if (!this.isDebug) {
            return str;
        }
        if (this.mUseHttps) {
            str2 = WebKitApi.SCHEME_HTTPS;
        } else {
            str2 = WebKitApi.SCHEME_HTTP;
        }
        try {
            return C6812a.m21175a(create, new C6811c(create.getHost(), create.getPort(), str2)).toString();
        } catch (URISyntaxException unused) {
            return str;
        }
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                this.mLoading = false;
                this.mLastRefreshTime = System.currentTimeMillis();
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    return;
                }
                break;
            case 102:
                this.mLoading = false;
                if (this.mForceChanged) {
                    tryRefreshConfig();
                    break;
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.net.InetAddress> resolveInetAddresses(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r3)
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.mIsMainProcess
            if (r0 != 0) goto L_0x000c
            goto L_0x003e
        L_0x000c:
            r2.tryLoadLocalConfig()
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.mDnsMap     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.mDnsMap     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x003b }
            java.net.InetAddress[] r3 = (java.net.InetAddress[]) r3     // Catch:{ all -> 0x003b }
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            if (r3 == 0) goto L_0x0039
            int r0 = r3.length     // Catch:{ all -> 0x003b }
            if (r0 > 0) goto L_0x0024
            goto L_0x0039
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x003b }
            r0.addAll(r3)     // Catch:{ all -> 0x003b }
            int r3 = sShuffleDns     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0037
            java.util.Collections.shuffle(r0)     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return r0
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return r1
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig.resolveInetAddresses(java.lang.String):java.util.List");
    }

    public void tryRefreshConfig$___twin___(boolean z) {
        if (TextUtils.isEmpty(DOMAIN_CONFIG_URL)) {
            throw new RuntimeException("must called setDomainConfigUrl method before tryRefreshConfig!");
        } else if (this.mIsMainProcess) {
            tryRefreshDomainConfig(z);
        } else {
            if (this.mLastRefreshTime <= 0) {
                try {
                    new C6304f("LoadDomainConfig4Other-Thread") {
                        public void run() {
                            AppConfig.this.tryLoadDomainConfig4OtherProcess();
                        }
                    }.start();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void tryRefreshDomainConfig(boolean z) {
        long j;
        if (!this.mLoading) {
            if (this.mForceChanged) {
                this.mForceChanged = false;
                this.mLastRefreshTime = 0;
                this.mLastTryRefreshTime = 0;
            }
            if (z) {
                j = 10800000;
            } else {
                j = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastRefreshTime > j && currentTimeMillis - this.mLastTryRefreshTime > 120000) {
                boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(this.mContext);
                if (!this.mLocalLoaded || com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo) {
                    doRefresh(com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo);
                }
            }
        }
    }

    public String filterUrl(String str) {
        if (C6319n.m19593a(str) || !this.mUseLinkSelector) {
            return str;
        }
        if (C6806b.m21144a().mo16632b()) {
            return filterUrlForDebug(C6806b.m21144a().mo16627a(str));
        }
        try {
            String filterUrlForDebug = filterUrlForDebug(str);
            try {
                URI create = URI.create(filterUrlForDebug);
                String host = create.getHost();
                int port = create.getPort();
                String scheme = create.getScheme();
                for (String equals : CONFIG_SERVERS) {
                    if (equals.equals(host)) {
                        return filterUrlForDebug;
                    }
                }
                if (this.mIsMainProcess) {
                    tryLoadLocalConfig();
                } else {
                    tryLoadDomainConfig4OtherProcess();
                }
                String str2 = "";
                synchronized (this) {
                    ConnectHost findBestConnectHost = findBestConnectHost(filterUrlForDebug, this.mHostMap);
                    if (findBestConnectHost != null) {
                        str2 = findBestConnectHost.getHost();
                        scheme = findBestConnectHost.getSchema();
                    }
                }
                if (!C6319n.m19593a(str2)) {
                    str = C6812a.m21175a(create, new C6811c(str2, port, scheme)).toString();
                    return str;
                }
            } catch (Throwable unused) {
            }
            str = filterUrlForDebug;
        } catch (Throwable unused2) {
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x0198 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateConfig(boolean r18) {
        /*
            r17 = this;
            r1 = r17
            r17.tryLoadLocalConfig()
            r2 = 102(0x66, float:1.43E-43)
            if (r18 != 0) goto L_0x000f
            com.bytedance.common.utility.collection.f r0 = r1.mHandler
            r0.sendEmptyMessage(r2)
            return
        L_0x000f:
            java.lang.String[] r3 = CONFIG_SERVERS
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x0014:
            if (r6 >= r4) goto L_0x01fb
            r0 = r3[r6]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01f7 }
            r7.<init>()     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r8 = "https://"
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            r7.append(r0)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r0 = DOMAIN_CONFIG_URL     // Catch:{ Throwable -> 0x01f7 }
            r7.append(r0)     // Catch:{ Throwable -> 0x01f7 }
            boolean r0 = r1.mEnableLocation     // Catch:{ Throwable -> 0x01f7 }
            if (r0 == 0) goto L_0x0070
            android.location.Address r0 = r1.address     // Catch:{ Throwable -> 0x01f7 }
            if (r0 == 0) goto L_0x0070
            android.location.Address r0 = r1.address     // Catch:{ Throwable -> 0x01f7 }
            if (r0 == 0) goto L_0x0070
            boolean r8 = r0.hasLatitude()     // Catch:{ Throwable -> 0x01f7 }
            if (r8 == 0) goto L_0x0070
            boolean r8 = r0.hasLongitude()     // Catch:{ Throwable -> 0x01f7 }
            if (r8 == 0) goto L_0x0070
            java.lang.String r8 = "?latitude="
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            double r8 = r0.getLatitude()     // Catch:{ Throwable -> 0x01f7 }
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r8 = "&longitude="
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            double r8 = r0.getLongitude()     // Catch:{ Throwable -> 0x01f7 }
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r0 = r0.getLocality()     // Catch:{ Throwable -> 0x01f7 }
            boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x01f7 }
            if (r8 != 0) goto L_0x0070
            java.lang.String r8 = "&city="
            r7.append(r8)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r0 = android.net.Uri.encode(r0)     // Catch:{ Throwable -> 0x01f7 }
            r7.append(r0)     // Catch:{ Throwable -> 0x01f7 }
        L_0x0070:
            com.ss.android.http.legacy.a.f r0 = new com.ss.android.http.legacy.a.f     // Catch:{ Throwable -> 0x01f7 }
            r0.<init>()     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01f7 }
            r8 = 8192(0x2000, float:1.14794E-41)
            r10 = 0
            r11 = 1
            r12 = 0
            r14 = 1
            r9 = r7
            r13 = r0
            java.lang.String r8 = com.p280ss.android.common.util.NetworkUtils.executeGet(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Throwable -> 0x01f7 }
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r8)     // Catch:{ Throwable -> 0x01f7 }
            if (r9 == 0) goto L_0x008d
            goto L_0x01f7
        L_0x008d:
            java.lang.String r9 = "X-SS-SIGN"
            com.ss.android.http.legacy.a r0 = r0.mo16641b(r9)     // Catch:{ Throwable -> 0x01f7 }
            if (r0 == 0) goto L_0x01f7
            java.lang.String r9 = r0.mo16636b()     // Catch:{ Throwable -> 0x01f7 }
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r9)     // Catch:{ Throwable -> 0x01f7 }
            if (r9 == 0) goto L_0x00a1
            goto L_0x01f7
        L_0x00a1:
            java.lang.String r0 = r0.mo16636b()     // Catch:{ Throwable -> 0x01f7 }
            boolean r0 = com.p280ss.android.common.config.RequestValidator.checkSSSign(r7, r0, r8)     // Catch:{ Throwable -> 0x01f7 }
            if (r0 != 0) goto L_0x00ad
            goto L_0x01f7
        L_0x00ad:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01f7 }
            r0.<init>(r8)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r7 = "status_code"
            int r7 = r0.optInt(r7)     // Catch:{ Throwable -> 0x01f7 }
            if (r7 == 0) goto L_0x00bc
            goto L_0x01f7
        L_0x00bc:
            java.lang.String r7 = "data"
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r7 = "enable_link_select"
            boolean r7 = r0.optBoolean(r7)     // Catch:{ Throwable -> 0x01f7 }
            r1.isEnableLinkSelector = r7     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r7 = "speed_interval"
            long r7 = r0.optLong(r7)     // Catch:{ Throwable -> 0x01f7 }
            r1.mLinkOptInterval = r7     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r7 = "path_control"
            org.json.JSONArray r7 = r0.optJSONArray(r7)     // Catch:{ Throwable -> 0x01f7 }
            if (r7 != 0) goto L_0x00df
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01f7 }
            r7.<init>()     // Catch:{ Throwable -> 0x01f7 }
        L_0x00df:
            java.lang.String r8 = "all_hosts"
            org.json.JSONArray r8 = r0.optJSONArray(r8)     // Catch:{ Throwable -> 0x01f7 }
            if (r8 != 0) goto L_0x00ec
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01f7 }
            r8.<init>()     // Catch:{ Throwable -> 0x01f7 }
        L_0x00ec:
            java.lang.String r9 = "union_domain"
            org.json.JSONArray r9 = r0.optJSONArray(r9)     // Catch:{ Throwable -> 0x01f7 }
            if (r9 != 0) goto L_0x00f9
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01f7 }
            r9.<init>()     // Catch:{ Throwable -> 0x01f7 }
        L_0x00f9:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01f7 }
            r10.<init>()     // Catch:{ Throwable -> 0x01f7 }
            boolean r11 = com.p280ss.android.common.config.AppConfigParser.parseCookieShareDomain(r10, r9)     // Catch:{ Throwable -> 0x01f7 }
            r12 = 1
            if (r11 == 0) goto L_0x010e
            monitor-enter(r17)     // Catch:{ Throwable -> 0x01f7 }
            r1.mCookieShareHostList = r10     // Catch:{ all -> 0x010b }
            monitor-exit(r17)     // Catch:{ all -> 0x010b }
            r10 = 1
            goto L_0x010f
        L_0x010b:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ Throwable -> 0x01f7 }
        L_0x010e:
            r10 = 0
        L_0x010f:
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Throwable -> 0x01f7 }
            r11.<init>()     // Catch:{ Throwable -> 0x01f7 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ Throwable -> 0x01f7 }
            r13.<init>()     // Catch:{ Throwable -> 0x01f7 }
            boolean r14 = com.p280ss.android.common.config.AppConfigParser.parseHostMap(r11, r8, r13)     // Catch:{ Throwable -> 0x01f7 }
            if (r14 == 0) goto L_0x0134
            monitor-enter(r17)     // Catch:{ Throwable -> 0x01f7 }
            r1.mHostMap = r11     // Catch:{ all -> 0x0131 }
            r1.mLinkHostMap = r13     // Catch:{ all -> 0x0131 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x0131 }
            r13.<init>()     // Catch:{ all -> 0x0131 }
            r13.putAll(r11)     // Catch:{ all -> 0x0131 }
            r1.mUIHostMap = r13     // Catch:{ all -> 0x0131 }
            monitor-exit(r17)     // Catch:{ all -> 0x0131 }
            r11 = 1
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ Throwable -> 0x01f7 }
        L_0x0134:
            r11 = 0
        L_0x0135:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x01f7 }
            r13.<init>()     // Catch:{ Throwable -> 0x01f7 }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x01f7 }
            r14.<init>()     // Catch:{ Throwable -> 0x01f7 }
            boolean r15 = com.p280ss.android.common.config.AppConfigParser.parsePathHostMap(r13, r7, r14)     // Catch:{ Throwable -> 0x01f7 }
            if (r15 == 0) goto L_0x0159
            monitor-enter(r17)     // Catch:{ Throwable -> 0x01f7 }
            r1.mPathHostGroupMap = r13     // Catch:{ all -> 0x0156 }
            r1.mLinkPathMap = r14     // Catch:{ all -> 0x0156 }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0156 }
            r14.<init>()     // Catch:{ all -> 0x0156 }
            r14.putAll(r13)     // Catch:{ all -> 0x0156 }
            r1.mUiPathHostGroupMap = r14     // Catch:{ all -> 0x0156 }
            monitor-exit(r17)     // Catch:{ all -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0156 }
            throw r0     // Catch:{ Throwable -> 0x01f7 }
        L_0x0159:
            r12 = 0
        L_0x015a:
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r13 = "dns_mapping"
            org.json.JSONArray r13 = r0.optJSONArray(r13)     // Catch:{ Throwable -> 0x01f7 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Throwable -> 0x01f7 }
            r14.<init>()     // Catch:{ Throwable -> 0x01f7 }
            com.p280ss.android.common.config.AppConfigParser.parseDnsMap(r14, r13)     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r15 = ""
            if (r13 == 0) goto L_0x0182
            int r16 = r14.size()     // Catch:{ Throwable -> 0x01f7 }
            if (r16 <= 0) goto L_0x0182
            java.lang.String r15 = r13.toString()     // Catch:{ Throwable -> 0x01f7 }
        L_0x0182:
            java.lang.String r13 = "shuffle_dns"
            int r13 = r0.optInt(r13)     // Catch:{ Throwable -> 0x01f7 }
            sShuffleDns = r13     // Catch:{ Throwable -> 0x01f7 }
            java.lang.String r13 = "use_dns_mapping"
            int r0 = r0.optInt(r13)     // Catch:{ Throwable -> 0x01f7 }
            com.p280ss.android.common.util.NetworkUtils.setUseDnsMapping(r0)     // Catch:{ Throwable -> 0x01f7 }
            monitor-enter(r17)     // Catch:{ Throwable -> 0x01f7 }
            r1.mDnsMap = r14     // Catch:{ all -> 0x01f4 }
            monitor-exit(r17)     // Catch:{ all -> 0x01f4 }
            monitor-enter(r17)     // Catch:{ Throwable -> 0x01f7 }
            android.content.Context r0 = r1.mContext     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = "smart_network_select"
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r0, r13, r5)     // Catch:{ all -> 0x01f1 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x01f1 }
            if (r12 == 0) goto L_0x01ab
            java.lang.String r12 = "config_mapping"
            r0.putString(r12, r7)     // Catch:{ all -> 0x01f1 }
        L_0x01ab:
            if (r10 == 0) goto L_0x01b2
            java.lang.String r10 = "domain_cookie_share_mapping"
            r0.putString(r10, r9)     // Catch:{ all -> 0x01f1 }
        L_0x01b2:
            if (r11 == 0) goto L_0x01b9
            java.lang.String r9 = "domain_group_host_list"
            r0.putString(r9, r8)     // Catch:{ all -> 0x01f1 }
        L_0x01b9:
            java.lang.String r8 = "is_enable_selector"
            boolean r9 = r1.isEnableLinkSelector     // Catch:{ all -> 0x01f1 }
            r0.putBoolean(r8, r9)     // Catch:{ all -> 0x01f1 }
            java.lang.String r8 = "link_opt_interval"
            long r9 = r1.mLinkOptInterval     // Catch:{ all -> 0x01f1 }
            r0.putLong(r8, r9)     // Catch:{ all -> 0x01f1 }
            java.lang.String r8 = "static_dns_mapping"
            r0.putString(r8, r15)     // Catch:{ all -> 0x01f1 }
            java.lang.String r8 = "shuffle_dns"
            int r9 = sShuffleDns     // Catch:{ all -> 0x01f1 }
            r0.putInt(r8, r9)     // Catch:{ all -> 0x01f1 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01f1 }
            java.lang.String r10 = "last_refresh_time"
            r0.putLong(r10, r8)     // Catch:{ all -> 0x01f1 }
            r0.commit()     // Catch:{ all -> 0x01f1 }
            monitor-exit(r17)     // Catch:{ all -> 0x01f1 }
            com.bytedance.common.utility.collection.f r0 = r1.mHandler     // Catch:{ Throwable -> 0x01f7 }
            r8 = 101(0x65, float:1.42E-43)
            r0.sendEmptyMessage(r8)     // Catch:{ Throwable -> 0x01f7 }
            r17.initLinkSelector()     // Catch:{ Throwable -> 0x01f7 }
            android.content.Context r0 = r1.mContext     // Catch:{ Throwable -> 0x01f7 }
            r8 = 2
            com.p280ss.android.common.util.C6774e.m20939a(r0, r8, r7)     // Catch:{ Throwable -> 0x01f7 }
            return
        L_0x01f1:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01f1 }
            throw r0     // Catch:{ Throwable -> 0x01f7 }
        L_0x01f4:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ Throwable -> 0x01f7 }
        L_0x01f7:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x01fb:
            com.bytedance.common.utility.collection.f r0 = r1.mHandler
            r0.sendEmptyMessage(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig.updateConfig(boolean):void");
    }

    private ConnectHost findBestConnectHost(String str, HashMap<String, List<ConnectHost>> hashMap) {
        URI create = URI.create(str);
        HashMap<Pattern, String> hashMap2 = this.mPathHostGroupMap;
        StringBuilder sb = new StringBuilder();
        sb.append(create.getHost());
        sb.append(create.getPath());
        List list = (List) hashMap.get(findMatchHostName(hashMap2, sb.toString()));
        if (C6311g.m19573a(list)) {
            return null;
        }
        return (ConnectHost) list.get(0);
    }

    private String findMatchHostName(HashMap<Pattern, String> hashMap, String str) {
        if (C6319n.m19593a(str) || hashMap == null || hashMap.isEmpty()) {
            return "";
        }
        try {
            for (Entry entry : hashMap.entrySet()) {
                if (((Pattern) entry.getKey()).matcher(str).matches()) {
                    return (String) entry.getValue();
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public boolean inCookieHostList$___twin___(String str, List<String> list) {
        if (C6319n.m19593a(str) || C6311g.m19573a(list)) {
            return false;
        }
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    private AppConfig(Context context, boolean z) {
        this.mContext = context;
        this.mIsMainProcess = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getShareCookie(android.webkit.CookieManager r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0041
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r5)
            if (r1 == 0) goto L_0x000a
            goto L_0x0041
        L_0x000a:
            monitor-enter(r3)
            java.util.List<java.lang.String> r1 = r3.mCookieShareHostList     // Catch:{ all -> 0x003e }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0016 }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x0016 }
            goto L_0x0017
        L_0x0016:
            r5 = r0
        L_0x0017:
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c
            boolean r5 = r3.inCookieHostList(r5, r1)     // Catch:{ all -> 0x003e }
            if (r5 != 0) goto L_0x0024
            goto L_0x003c
        L_0x0024:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            r5.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r0 = com.p280ss.android.common.util.NetworkUtils.getShareCookieHost()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = r4.getCookie(r0)     // Catch:{ all -> 0x003e }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003a
            r5.add(r4)     // Catch:{ all -> 0x003e }
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return r5
        L_0x003c:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r4
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig.getShareCookie(android.webkit.CookieManager, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String tryDnsMapping(java.lang.String r7, java.lang.String[] r8) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r7)
            if (r0 != 0) goto L_0x0086
            boolean r0 = r6.mIsMainProcess
            if (r0 == 0) goto L_0x0086
            if (r8 == 0) goto L_0x0086
            int r0 = r8.length
            if (r0 > 0) goto L_0x0011
            goto L_0x0086
        L_0x0011:
            r0 = 0
            r1 = 0
            r8[r1] = r0
            r6.tryLoadLocalConfig()
            monitor-enter(r6)
            java.net.URI r2 = java.net.URI.create(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = r2.getHost()     // Catch:{ Exception -> 0x0082 }
            if (r3 == 0) goto L_0x007e
            int r4 = r3.length()     // Catch:{ Exception -> 0x0082 }
            if (r4 != 0) goto L_0x002a
            goto L_0x007e
        L_0x002a:
            int r4 = r2.getPort()     // Catch:{ Exception -> 0x0082 }
            if (r4 <= 0) goto L_0x0036
            r5 = 80
            if (r4 == r5) goto L_0x0036
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0036:
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r4 = r6.mDnsMap     // Catch:{ Exception -> 0x0082 }
            if (r4 == 0) goto L_0x0042
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r6.mDnsMap     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress[] r0 = (java.net.InetAddress[]) r0     // Catch:{ Exception -> 0x0082 }
        L_0x0042:
            if (r0 == 0) goto L_0x007c
            int r4 = r0.length     // Catch:{ Exception -> 0x0082 }
            if (r4 > 0) goto L_0x0048
            goto L_0x007c
        L_0x0048:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0082 }
            r4.<init>()     // Catch:{ Exception -> 0x0082 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x0082 }
            r4.addAll(r0)     // Catch:{ Exception -> 0x0082 }
            java.util.Collections.shuffle(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r4.get(r1)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r0 instanceof java.net.Inet4Address     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r4.get(r1)     // Catch:{ Exception -> 0x0082 }
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x0082 }
            com.ss.android.http.legacy.c r4 = new com.ss.android.http.legacy.c     // Catch:{ Exception -> 0x0082 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0082 }
            java.net.URI r0 = com.p280ss.android.http.legacy.client.p297a.C6812a.m21175a(r2, r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
            r8[r1] = r3     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r7 = r0
            goto L_0x0082
        L_0x007c:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x007e:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0080:
            r7 = move-exception
            goto L_0x0084
        L_0x0082:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            return r7
        L_0x0084:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            throw r7
        L_0x0086:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.config.AppConfig.tryDnsMapping(java.lang.String, java.lang.String[]):java.lang.String");
    }
}
