package com.p280ss.android.ugc.aweme.live.p1363c;

import android.content.Context;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.p255e.C6326a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.c.j */
public final class C32487j implements IHostPlugin {
    public final void check(Context context, PluginType pluginType, String str, C9430a aVar) {
    }

    public final boolean checkPluginInstalled(String str) {
        return true;
    }

    public final String getHostModeFilePath() {
        return null;
    }

    public final String getHostPackageName() {
        return null;
    }

    public final int getPluginAttributeMinVersion(String str) {
        return 0;
    }

    public final boolean isFull() {
        return false;
    }

    public final void preload(String str) {
    }

    public C32487j() {
        C3596c.m13174a(IHostPlugin.class, this);
    }

    public final boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader) {
        JSONObject jSONObject;
        try {
            C6326a.m19641a(str2);
            return true;
        } catch (Throwable unused) {
        }
        C6379c.m19823a("plugin_bug_track", 1, jSONObject);
        return false;
    }
}
