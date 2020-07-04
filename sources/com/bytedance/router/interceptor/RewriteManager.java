package com.bytedance.router.interceptor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteIntent.Builder;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RewriteManager implements IInterceptor {
    private Object mLockObject = new Object();
    private Map<String, String> mRewriteMap;

    public String getRewriteUrl(String str) {
        if (this.mRewriteMap == null) {
            return null;
        }
        return (String) this.mRewriteMap.get(str);
    }

    public void setRewriteMap(Map<String, String> map) {
        synchronized (this.mLockObject) {
            if (map == null) {
                try {
                    this.mRewriteMap = Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.mRewriteMap = map;
            }
        }
    }

    public boolean matchInterceptRules(RouteIntent routeIntent) {
        String originUrl = routeIntent.getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return false;
        }
        String routeUrl = Util.getRouteUrl(originUrl);
        if (TextUtils.isEmpty(routeUrl) || this.mRewriteMap == null || this.mRewriteMap.size() == 0) {
            return false;
        }
        String str = (String) this.mRewriteMap.get(routeUrl);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        routeIntent.setUrl(str);
        return true;
    }

    public void addRewriteValue(String str, String str2) {
        synchronized (this.mLockObject) {
            if (this.mRewriteMap == null) {
                this.mRewriteMap = new HashMap();
            }
            this.mRewriteMap.put(str, str2);
        }
    }

    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        StringBuilder sb = new StringBuilder("RewriteManager#RouteIntent-originUrl: ");
        sb.append(routeIntent.getOriginUrl());
        Logger.m36452d(sb.toString());
        StringBuilder sb2 = new StringBuilder("RewriteManager#RouteIntent-outputUrl: ");
        sb2.append(routeIntent.getUrl());
        Logger.m36452d(sb2.toString());
        new Builder(routeIntent.getUrl()).build();
        return false;
    }
}
