package com.bytedance.router;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.mapping.SmartRouter$$Mapping;
import com.bytedance.router.net.SmartRouterApi;
import com.bytedance.router.net.SmartRouterApi.ApiResult;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class RouteMapper {
    private IConfigUpdateListener mConfigUpdateListener;
    private Context mContext;
    private IMappingInitializer mIMappingInitializer;
    private AtomicBoolean mIsInited = new AtomicBoolean(false);
    private Map<String, String> mOriginMap;
    private Map<String, String> mRouteMap = new HashMap(this.mSmartRouter$$Mapping.getMapSize());
    private final Object mRouteMapLock = new Object();
    private Map<String, Map<String, String>> mRoutePermissionMap = new HashMap();
    private ServerParam mServerParam;
    private SmartRouter$$Mapping mSmartRouter$$Mapping = new SmartRouter$$Mapping();
    private List<String> mTestUrlList = new ArrayList();

    public interface IConfigUpdateListener {
        void onConfigChanged(RouterConfig routerConfig);
    }

    public Map<String, String> getRouteMap() {
        return this.mRouteMap;
    }

    public ServerParam getServerParam() {
        return this.mServerParam;
    }

    public List<String> getTestUrlList() {
        return this.mTestUrlList;
    }

    /* access modifiers changed from: 0000 */
    public void requestRouteConfig() {
        if (this.mServerParam == null || !this.mServerParam.isAvailable()) {
            Logger.m36454e("RouteMapper#requestRouteConfig serverParam is null or unavailable,You must use SmartRouter#init(Context, ServerParam) before !!!");
        } else {
            AsyncTask.execute(new Runnable() {
                public void run() {
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    private void initRouteMap() {
        synchronized (this.mRouteMapLock) {
            if (!this.mIsInited.get()) {
                this.mSmartRouter$$Mapping.init(this.mRouteMap);
                this.mSmartRouter$$Mapping.initPermissionMap(this.mRoutePermissionMap);
                this.mSmartRouter$$Mapping.initTestUrlList(this.mTestUrlList);
                if (this.mIMappingInitializer != null) {
                    this.mIMappingInitializer.init(this.mRouteMap);
                    this.mIMappingInitializer.initPermissionMap(this.mRoutePermissionMap);
                    this.mIMappingInitializer.initTestUrlList(this.mTestUrlList);
                }
                this.mIsInited.set(true);
            }
        }
    }

    public void loadLocalRouteConfig() {
        String string = C7285c.m22838a(this.mContext, "smartrouter_conf", 0).getString("smartrouter_config", "");
        if (!TextUtils.isEmpty(string)) {
            RouterConfig load = RouterConfig.load(string);
            if (this.mConfigUpdateListener != null && load != null && !RouterConfig.isExpired(this.mContext, load)) {
                this.mConfigUpdateListener.onConfigChanged(load);
                if (Logger.isDebug()) {
                    StringBuilder sb = new StringBuilder("Load local routerConfig: ");
                    sb.append(string);
                    Logger.m36452d(sb.toString());
                }
            }
        }
    }

    public void updateNetRouteConfig() {
        ApiResult requestConfig = SmartRouterApi.requestConfig(this.mContext, this.mServerParam);
        if (requestConfig.errorCode != 0) {
            StringBuilder sb = new StringBuilder("RouteMapper#requestServer error: ");
            sb.append(requestConfig.errorCode);
            Logger.m36454e(sb.toString());
        } else if (!(requestConfig.result == null || this.mConfigUpdateListener == null)) {
            this.mConfigUpdateListener.onConfigChanged((RouterConfig) requestConfig.result);
            C7285c.m22838a(this.mContext, "smartrouter_conf", 0).edit().putString("smartrouter_config", ((RouterConfig) requestConfig.result).toString()).commit();
        }
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mIMappingInitializer = iMappingInitializer;
    }

    public void init(Context context) {
        init(context, null, null);
    }

    private void initDynamicRoutes(ServerParam serverParam) {
        this.mServerParam = serverParam;
        if (serverParam == null || !serverParam.isAvailable()) {
            Logger.m36454e("RouteMapper#initDynamicRoutes serverParam is null or unavailable!!!");
        } else {
            AsyncTask.execute(new Runnable() {
                public void run() {
                    RouteMapper.this.loadLocalRouteConfig();
                    RouteMapper.this.updateNetRouteConfig();
                }
            });
        }
    }

    public String getTargetClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String targetClassFromUri = getTargetClassFromUri(str);
        if (TextUtils.isEmpty(targetClassFromUri) && !this.mIsInited.get()) {
            initRouteMap();
            targetClassFromUri = getTargetClassFromUri(str);
        }
        StringBuilder sb = new StringBuilder("RouteMapper#getTargetClass url: ");
        sb.append(str);
        sb.append("  |  targetClass: ");
        sb.append(targetClassFromUri);
        Logger.m36452d(sb.toString());
        return targetClassFromUri;
    }

    public boolean loadModuleMapping(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Object newInstance = Class.forName(C1642a.m8034a("com.bytedance.router.generator.mapping.SmartrouterMapping$$%s", new Object[]{str})).newInstance();
            if (newInstance instanceof IMappingInitializer) {
                synchronized (this.mRouteMapLock) {
                    ((IMappingInitializer) newInstance).init(this.mRouteMap);
                    ((IMappingInitializer) newInstance).initPermissionMap(this.mRoutePermissionMap);
                    ((IMappingInitializer) newInstance).initTestUrlList(this.mTestUrlList);
                }
                return true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        return false;
    }

    public void updateMapping(Map<String, String> map) {
        synchronized (this.mRouteMapLock) {
            if (this.mOriginMap == null) {
                this.mOriginMap = new HashMap();
                this.mOriginMap.putAll(this.mRouteMap);
                this.mRouteMap.putAll(map);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.putAll(this.mOriginMap);
                hashMap.putAll(map);
                this.mRouteMap = hashMap;
            }
        }
    }

    private String getTargetClassFromUri(String str) {
        String realRouteUrl = Util.getRealRouteUrl(str);
        String str2 = (String) this.mRouteMap.get(realRouteUrl);
        if (TextUtils.isEmpty(str2) && realRouteUrl.endsWith("/") && realRouteUrl.length() > 1) {
            realRouteUrl = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            str2 = (String) this.mRouteMap.get(realRouteUrl);
        }
        if (TextUtils.isEmpty(str2)) {
            realRouteUrl = Util.getRouteUrl(str);
            str2 = (String) this.mRouteMap.get(realRouteUrl);
        }
        if (!TextUtils.isEmpty(str2) || !realRouteUrl.endsWith("/") || realRouteUrl.length() <= 1) {
            return str2;
        }
        return (String) this.mRouteMap.get(realRouteUrl.substring(0, realRouteUrl.length() - 1));
    }

    public String getTargetClass(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            return getTargetClass(str);
        }
        Map map = (Map) this.mRoutePermissionMap.get(str2);
        if (map == null || map.isEmpty()) {
            return "";
        }
        String targetClassFromUri = getTargetClassFromUri(str);
        if (TextUtils.isEmpty(targetClassFromUri) && !this.mIsInited.get()) {
            initRouteMap();
            targetClassFromUri = getTargetClassFromUri(str);
        }
        StringBuilder sb = new StringBuilder("RouteMapper#getTargetClass url: ");
        sb.append(str);
        sb.append("  |  targetClass: ");
        sb.append(targetClassFromUri);
        Logger.m36452d(sb.toString());
        return targetClassFromUri;
    }

    public void init(Context context, ServerParam serverParam, IConfigUpdateListener iConfigUpdateListener) {
        Logger.m36452d("RouteMapper#init RouteMapper");
        this.mContext = context;
        this.mConfigUpdateListener = iConfigUpdateListener;
        if (!this.mIsInited.get()) {
            initRouteMap();
        }
        Logger.m36452d(C1642a.m8034a("RouteMapper#loadMappingByRouter routes: %d .", new Object[]{Integer.valueOf(this.mRouteMap.size())}));
        if (serverParam != null) {
            initDynamicRoutes(serverParam);
        }
    }
}
