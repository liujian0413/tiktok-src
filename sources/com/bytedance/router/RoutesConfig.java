package com.bytedance.router;

import android.text.TextUtils;
import com.C1642a;
import com.bytedance.router.route.BaseRoute;
import com.bytedance.router.route.BroadcastRoute;
import com.bytedance.router.route.ServiceRoute;
import com.bytedance.router.util.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RoutesConfig {
    private Set<String> mOtherSchemeSet;
    private String[] mOtherSchemes;
    private Map<String, Class<? extends BaseRoute>> mRouteMap = new HashMap();
    private String mScheme;

    public String[] getOtherSchemes() {
        return this.mOtherSchemes;
    }

    public String getScheme() {
        return this.mScheme;
    }

    static RoutesConfig defaultConfig() {
        return new RoutesConfig("snssdk143").withOtherSchemes(RouterConstant.DEFAULT_HISTORY_SCHEME).withSupportRoute("bt.service", ServiceRoute.class).withSupportRoute("bt.broadcast", BroadcastRoute.class);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder("scheme:");
        sb.append(this.mScheme);
        sb.append("\n");
        sb.append("other schemes: ");
        if (this.mOtherSchemes != null && this.mOtherSchemes.length > 0) {
            for (String append : this.mOtherSchemes) {
                sb.append(append);
                sb.append(',');
            }
            sb.append("\n");
        }
        if (this.mRouteMap != null) {
            i = this.mRouteMap.size();
        } else {
            i = 0;
        }
        sb.append(C1642a.m8034a("other supported routes: %s routes\n", new Object[]{Integer.valueOf(i)}));
        if (i > 0) {
            for (Entry entry : this.mRouteMap.entrySet()) {
                sb.append("\t");
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(((Class) entry.getValue()).getName());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    RoutesConfig(String str) {
        this.mScheme = str;
        this.mRouteMap.put("bt.service", ServiceRoute.class);
        this.mRouteMap.put("bt.broadcast", BroadcastRoute.class);
    }

    public Class<? extends BaseRoute> getRouteClass(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Class) this.mRouteMap.get(str);
    }

    public boolean supportScheme(String str) {
        if (str == null || str.length() == 0 || str.equals(this.mScheme)) {
            return true;
        }
        if (this.mOtherSchemeSet == null || !this.mOtherSchemeSet.contains(str)) {
            return false;
        }
        return true;
    }

    public RoutesConfig withOtherSchemes(String[] strArr) {
        this.mOtherSchemes = strArr;
        if (strArr == null || strArr.length == 0) {
            this.mOtherSchemeSet = null;
        } else {
            if (this.mOtherSchemeSet != null) {
                this.mOtherSchemeSet.clear();
            } else {
                this.mOtherSchemeSet = new HashSet();
            }
            this.mOtherSchemeSet.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public RoutesConfig withSupportRoute(String str, Class<? extends BaseRoute> cls) {
        if (TextUtils.isEmpty(str) || cls == null) {
            Logger.m36460w("RoutesConfig#withHostRoute() host or routeClass is null!!!");
            return this;
        }
        if (this.mRouteMap == null) {
            this.mRouteMap = new HashMap();
        }
        this.mRouteMap.put(str, cls);
        return this;
    }
}
