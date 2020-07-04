package com.bytedance.android.livesdkapi.plugin;

import android.content.Context;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import org.json.JSONException;
import org.json.JSONObject;

public enum PluginType {
    LiveResource("live_engine", true, "com.ss.android.ies.live.liveresource") {
        public final void load(Context context, boolean z) {
            try {
                IHostPlugin iHostPlugin = (IHostPlugin) C3596c.m13172a(IHostPlugin.class);
                if (z) {
                    try {
                        iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "lens", getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "ttquic", getClass().getClassLoader());
                    } catch (Throwable unused2) {
                    }
                    iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "avframework", getClass().getClassLoader());
                    iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "ies_render", getClass().getClassLoader());
                    try {
                        iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "agora-rtc-sdk-jni", getClass().getClassLoader());
                    } catch (Throwable unused3) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "zegoliveroom", getClass().getClassLoader());
                    } catch (Throwable unused4) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, PluginType.LiveResource.getPackageName(), "bytertc", getClass().getClassLoader());
                    } catch (Throwable unused5) {
                    }
                }
            } catch (Throwable unused6) {
            }
        }
    },
    Camera("camera", true, "com.ss.android.ugc.live.liveshortvideo_so"),
    LiveSDK("live_sdk", true, "com.ss.android.ies.live.sdk"),
    Player("player", false, "com.ss.android.ugc.live.player"),
    XGPlayer("player", false, "com.ss.ttm"),
    LITE_PLAYER_CONTAINER("player", false, "com.bytedance.common.plugin.lite"),
    Live("liveplugin", false, "com.bytedance.android.liveplugin");
    
    private final boolean mNeedPreload;
    private final String mPackageName;
    private final String mType;

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isNeedPreload() {
        return this.mNeedPreload;
    }

    public void load(Context context, boolean z) {
    }

    public void preload() {
        ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).preload(getPackageName());
    }

    public boolean isInstalled() {
        IHostPlugin iHostPlugin = (IHostPlugin) C3596c.m13172a(IHostPlugin.class);
        if (iHostPlugin.isFull() || iHostPlugin.checkPluginInstalled(getPackageName())) {
            return true;
        }
        return false;
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "1380");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void checkInstall(Context context, C9430a aVar) {
        checkInstall(context, "", aVar);
    }

    public void checkInstall(Context context, String str, C9430a aVar) {
        if (isInstalled()) {
            if (aVar != null) {
                aVar.mo8840a(getPackageName());
            }
            return;
        }
        ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).check(context, this, str, aVar);
    }

    private PluginType(String str, boolean z, String str2) {
        this.mType = str;
        this.mNeedPreload = z;
        this.mPackageName = str2;
    }
}
