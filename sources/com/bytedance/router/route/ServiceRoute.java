package com.bytedance.router.route;

import android.content.Context;
import android.content.Intent;

public class ServiceRoute extends SysComponentRoute {
    public void openComponent(Context context, Intent intent) {
        context.startService(intent);
    }
}
