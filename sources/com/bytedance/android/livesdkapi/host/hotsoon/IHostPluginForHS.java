package com.bytedance.android.livesdkapi.host.hotsoon;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.plugin.PluginType;

public interface IHostPluginForHS extends C2324b {
    void check(Context context, PluginType pluginType, String str, C9430a aVar);

    boolean checkPluginInstalled(String str);

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
