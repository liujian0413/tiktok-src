package com.bytedance.router.route;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.ActivityCompat;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.util.Logger;

public class ActivityRoute extends SysComponentRoute {
    public void openComponent(Context context, Intent intent) {
        RouteIntent routeIntent = getRouteIntent();
        if (!(context instanceof Activity)) {
            applicationStart(context, routeIntent, intent);
        } else if (getRouteIntent().getAnimationBundle() == null) {
            normalStart(context, routeIntent, intent);
        } else {
            activityCompatStart(context, routeIntent, intent);
        }
    }

    private void activityCompatStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        ActivityCompat.m2905a((Context) (Activity) context, intent, getRouteIntent().getAnimationBundle());
    }

    private void applicationStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
        if (routeIntent.hasRequestCode()) {
            Logger.m36454e("SmartRoute.open(int requestCode):the context must be Activity !!!");
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            Logger.m36454e("SmartRoute.withAnimation(int enterAnim, int exitAnim):the context must be Activity !!!");
        }
    }

    private void normalStart(Context context, RouteIntent routeIntent, Intent intent) {
        if (routeIntent.getData() != null) {
            intent.setData(routeIntent.getData());
        }
        if (routeIntent.hasRequestCode()) {
            ((Activity) context).startActivityForResult(intent, routeIntent.getRequestCode());
        } else {
            context.startActivity(intent);
        }
        if (routeIntent.getEnterAnim() != -1 || routeIntent.getExitAnim() != -1) {
            ((Activity) context).overridePendingTransition(getRouteIntent().getEnterAnim(), getRouteIntent().getExitAnim());
        }
    }
}
