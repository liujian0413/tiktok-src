package com.bytedance.router.route;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteMapper;

public abstract class BaseRoute implements IRoute {
    private RouteIntent mRouteIntent;
    private RouteMapper mRouteMapper;
    private Uri mUri;
    private String mUrl;

    /* access modifiers changed from: protected */
    public RouteIntent getRouteIntent() {
        return this.mRouteIntent;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getHost() {
        return this.mUri.getHost();
    }

    public String getPath() {
        return this.mUri.getPath();
    }

    public String getScheme() {
        return this.mUri.getScheme();
    }

    /* access modifiers changed from: protected */
    public String getTargetClass() {
        return this.mRouteMapper.getTargetClass(this.mUrl);
    }

    public Bundle getParams() {
        if (this.mRouteIntent.getExtra() != null) {
            return this.mRouteIntent.getExtra().getExtras();
        }
        return new Bundle();
    }

    public void init(RouteIntent routeIntent, RouteMapper routeMapper) {
        this.mRouteIntent = routeIntent;
        this.mUrl = routeIntent.getUrl();
        this.mUri = Uri.parse(this.mUrl);
        this.mRouteMapper = routeMapper;
    }
}
