package com.bytedance.router;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.router.RouteMapper.IConfigUpdateListener;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.net.SmartRouterApi;
import com.bytedance.router.plugin.Plugin;
import com.bytedance.router.plugin.SupportPluginCallback;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.IRoute;
import com.bytedance.router.route.RouteFactory;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class RouteManager {
    public Context mContext;
    private InterceptManager mInterceptManager;
    private List<Plugin> mPluginsList;
    public RouteMapper mRouteMapper;
    private RoutesConfig mRoutesConfig;
    private SupportPluginCallback mSupportPluginCallback;

    static class SingleBuilder {
        public static RouteManager sInstance = new RouteManager();

        private SingleBuilder() {
        }
    }

    public static final RouteManager getInstance() {
        return SingleBuilder.sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public RoutesConfig getRoutesConfig() {
        return this.mRoutesConfig;
    }

    public Map<String, String> getRouteMap() {
        return this.mRouteMapper.getRouteMap();
    }

    public List<String> getTestUrlList() {
        return this.mRouteMapper.getTestUrlList();
    }

    /* access modifiers changed from: 0000 */
    public void requestRouteConfig() {
        this.mRouteMapper.requestRouteConfig();
    }

    private RouteManager() {
        this.mRoutesConfig = RoutesConfig.defaultConfig();
        this.mRouteMapper = new RouteMapper();
        this.mInterceptManager = new InterceptManager();
    }

    public void setConfig(RoutesConfig routesConfig) {
        this.mRoutesConfig = routesConfig;
    }

    public void setSupportPluginCallback(SupportPluginCallback supportPluginCallback) {
        this.mSupportPluginCallback = supportPluginCallback;
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        this.mInterceptManager.addInterceptor(iInterceptor);
    }

    public void addInterceptroProvider(IInterceptorProvider iInterceptorProvider) {
        this.mInterceptManager.addInterceptorProvider(iInterceptorProvider);
    }

    /* access modifiers changed from: 0000 */
    public boolean canOpen(String str) {
        return canOpen(str, null);
    }

    public void init(Context context) {
        init(context, null);
    }

    public void setCustomInitializer(IMappingInitializer iMappingInitializer) {
        this.mRouteMapper.setCustomInitializer(iMappingInitializer);
    }

    public void setRewriteMap(Map<String, String> map) {
        this.mInterceptManager.getRewriteManager().setRewriteMap(map);
    }

    private boolean checkLegality(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (Util.isLegalUrl(url, this.mRoutesConfig)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("RouteManager#checkLegality originUrl is illegal: ");
        sb.append(url);
        sb.append(". \n");
        sb.append(this.mRoutesConfig.toString());
        Logger.m36454e(sb.toString());
        return false;
    }

    private synchronized boolean loadPluginsSchemas(String str) {
        boolean z = false;
        if (this.mSupportPluginCallback == null) {
            Logger.m36460w("if you use urls in plugins, you must set SupportPluginCallback to support plugins.");
            return false;
        }
        if (this.mPluginsList == null) {
            this.mPluginsList = this.mSupportPluginCallback.initPlugins();
        }
        if (this.mPluginsList == null && this.mPluginsList.size() == 0) {
            return false;
        }
        Iterator it = this.mPluginsList.iterator();
        while (it.hasNext()) {
            Plugin plugin = (Plugin) it.next();
            if (plugin.containsUrl(str)) {
                this.mSupportPluginCallback.loadPlugin(plugin, str);
                if (this.mRouteMapper.loadModuleMapping(plugin.getName())) {
                    z = true;
                }
                it.remove();
            }
        }
        return z;
    }

    private RouteIntent processRouteIntent(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (!Util.isLegalUrl(url)) {
            StringBuilder sb = new StringBuilder("RouteManager#RouteIntent-outputUrl is illegal and url is : ");
            sb.append(url);
            Logger.m36454e(sb.toString());
            return null;
        }
        routeIntent.setUrl(Util.completeUrl(this.mRoutesConfig.getScheme(), url));
        StringBuilder sb2 = new StringBuilder("RouteManager#processRouteIntent originUlr: ");
        sb2.append(routeIntent.getOriginUrl());
        Logger.m36452d(sb2.toString());
        StringBuilder sb3 = new StringBuilder("RouteManager#processRouteIntent outputUlr: ");
        sb3.append(routeIntent.getUrl());
        Logger.m36452d(sb3.toString());
        return routeIntent;
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent) {
        return buildIntent(context, routeIntent, (String) null);
    }

    public void open(Context context, RouteIntent routeIntent) {
        open(context, routeIntent, null);
    }

    public void init(Context context, ServerParam serverParam) {
        this.mContext = context;
        this.mRouteMapper.init(context, serverParam, new IConfigUpdateListener() {
            public void onConfigChanged(RouterConfig routerConfig) {
                if (routerConfig != null) {
                    RouteManager.this.mRouteMapper.updateMapping(routerConfig.getIncMapping());
                    RouteManager.this.setRewriteMap(routerConfig.getRewriteMapping());
                    SmartRouterApi.reportRouterConfig(RouteManager.this.mContext, RouteManager.this.mRouteMapper.getServerParam(), routerConfig);
                }
            }
        });
    }

    public void putRewriteValue(String str, String str2) {
        this.mInterceptManager.getRewriteManager().addRewriteValue(str, str2);
    }

    private IRoute getRoute(RouteIntent routeIntent, String str) {
        BaseRoute createRoute = RouteFactory.createRoute(routeIntent.getUrl(), str, this.mRoutesConfig);
        if (createRoute != null) {
            createRoute.init(routeIntent, this.mRouteMapper);
        }
        return createRoute;
    }

    /* access modifiers changed from: 0000 */
    public boolean canOpen(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Logger.m36460w("SmartRoute#url is null!!!");
            return false;
        } else if (!Util.isLegalUrl(str)) {
            StringBuilder sb = new StringBuilder("SmartRoute#url is illegal and url is ");
            sb.append(str);
            Logger.m36460w(sb.toString());
            return false;
        } else {
            String realRouteUrl = Util.getRealRouteUrl(str);
            String rewriteUrl = this.mInterceptManager.getRewriteManager().getRewriteUrl(realRouteUrl);
            if (!TextUtils.isEmpty(rewriteUrl)) {
                realRouteUrl = rewriteUrl;
            }
            String scheme = Uri.parse(realRouteUrl).getScheme();
            if (TextUtils.isEmpty(scheme)) {
                scheme = Uri.parse(str).getScheme();
            }
            if (!this.mRoutesConfig.supportScheme(scheme)) {
                StringBuilder sb2 = new StringBuilder("SmartRouter not supports this scheme: ");
                sb2.append(scheme);
                Logger.m36460w(sb2.toString());
                return false;
            } else if (!this.mRoutesConfig.supportScheme(scheme)) {
                StringBuilder sb3 = new StringBuilder("SmartRouter not supports this scheme: ");
                sb3.append(scheme);
                Logger.m36460w(sb3.toString());
                return false;
            } else {
                String targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, str2);
                if (TextUtils.isEmpty(targetClass) && loadPluginsSchemas(realRouteUrl)) {
                    targetClass = this.mRouteMapper.getTargetClass(realRouteUrl, str2);
                }
                if (!TextUtils.isEmpty(targetClass) || this.mInterceptManager.whetherIntercept(str)) {
                    return true;
                }
                return false;
            }
        }
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent, boolean z) {
        return buildIntent(context, routeIntent);
    }

    public Intent buildIntent(Context context, RouteIntent routeIntent, String str) {
        if (!checkLegality(routeIntent)) {
            if (routeIntent.getCallback() != null) {
                routeIntent.getCallback().onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            }
            return null;
        } else if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            if (routeIntent.getCallback() != null) {
                routeIntent.getCallback().onSuccess();
            }
            return null;
        } else {
            RouteIntent processRouteIntent = processRouteIntent(routeIntent);
            if (processRouteIntent == null) {
                if (processRouteIntent.getCallback() != null) {
                    processRouteIntent.getCallback().onFail(processRouteIntent.getOriginUrl(), "RouteIntent-outputUrl is illegal");
                }
                return null;
            }
            String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), str);
            if (TextUtils.isEmpty(targetClass)) {
                if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                    StringBuilder sb = new StringBuilder("RouteManager#buildIntent cannot find the routeUri with ");
                    sb.append(processRouteIntent.getUrl());
                    Logger.m36460w(sb.toString());
                    return null;
                }
                targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), str);
            }
            if (TextUtils.isEmpty(targetClass)) {
                if (processRouteIntent.getCallback() != null) {
                    processRouteIntent.getCallback().onFail(processRouteIntent.getOriginUrl(), "TargetClass is null");
                }
                return null;
            }
            processRouteIntent.getExtra().setComponent(new ComponentName(context.getPackageName(), targetClass));
            if (processRouteIntent.getCallback() != null) {
                processRouteIntent.getCallback().onSuccess();
            }
            return processRouteIntent.getExtra();
        }
    }

    public void open(Context context, RouteIntent routeIntent, String str) {
        if (!checkLegality(routeIntent)) {
            if (routeIntent.getCallback() != null) {
                routeIntent.getCallback().onFail(routeIntent.getOriginUrl(), "OriginUrl is illegal");
            }
        } else if (this.mInterceptManager.processRouteIntent(context, routeIntent)) {
            if (routeIntent.getCallback() != null) {
                routeIntent.getCallback().onSuccess();
            }
        } else {
            RouteIntent processRouteIntent = processRouteIntent(routeIntent);
            if (processRouteIntent == null) {
                if (processRouteIntent.getCallback() != null) {
                    processRouteIntent.getCallback().onFail(processRouteIntent.getOriginUrl(), "RouteIntent-outputUrl is illegal");
                }
                return;
            }
            String targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), str);
            if (TextUtils.isEmpty(targetClass)) {
                if (!loadPluginsSchemas(processRouteIntent.getUrl())) {
                    StringBuilder sb = new StringBuilder("RouteManager#open cannot find the routeUri with ");
                    sb.append(processRouteIntent.getUrl());
                    Logger.m36460w(sb.toString());
                    return;
                }
                targetClass = this.mRouteMapper.getTargetClass(processRouteIntent.getUrl(), str);
            }
            IRoute route = getRoute(processRouteIntent, targetClass);
            if (route == null) {
                StringBuilder sb2 = new StringBuilder("RouteManager#Not support the route with url：");
                sb2.append(processRouteIntent.getUrl());
                Logger.m36454e(sb2.toString());
                if (processRouteIntent.getCallback() != null) {
                    processRouteIntent.getCallback().onFail(processRouteIntent.getOriginUrl(), "Not support the route");
                }
                return;
            }
            try {
                route.open(context);
            } catch (Exception unused) {
                Logger.m36454e("Please check the scheme and its mapping class!!!");
                if (processRouteIntent.getCallback() != null) {
                    processRouteIntent.getCallback().onFail(processRouteIntent.getOriginUrl(), "Please check the scheme and its mapping class!");
                }
            }
        }
    }
}
