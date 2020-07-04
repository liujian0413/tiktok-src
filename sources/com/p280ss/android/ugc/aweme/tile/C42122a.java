package com.p280ss.android.ugc.aweme.tile;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

/* renamed from: com.ss.android.ugc.aweme.tile.a */
public final class C42122a {
    /* renamed from: a */
    public static void m134087a() {
        if (VERSION.SDK_INT >= 24) {
            Context a = C6399b.m19921a();
            ComponentName componentName = new ComponentName(a, HotVideoTileService.class);
            ComponentName componentName2 = new ComponentName(a, PublishTileService.class);
            PackageManager packageManager = a.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (C6384b.m19835a().mo15292a(TileShortcutExperiment.class, true, "enable_tile_shortcut", C6384b.m19835a().mo15295d().enable_tile_shortcut, false)) {
                if (componentEnabledSetting != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
                int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
                if (C43122ff.m136767b()) {
                    if (componentEnabledSetting2 == 1) {
                        packageManager.setComponentEnabledSetting(componentName2, 2, 1);
                    }
                } else if (componentEnabledSetting2 != 1) {
                    packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                }
            } else if (componentEnabledSetting == 1) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                packageManager.setComponentEnabledSetting(componentName2, 2, 1);
            }
        }
    }
}
