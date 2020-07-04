package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.plugin.PluginType;

public interface IHostPlugin extends C2324b {
    public static final int LOAD_TYPE_HOST = 1;
    public static final int LOAD_TYPE_OTHER = 2;
    public static final int LOAD_TYPE_PLUGIN = 0;

    /* renamed from: com.bytedance.android.livesdkapi.host.IHostPlugin$a */
    public interface C9430a {
        /* renamed from: a */
        void mo8840a(String str);
    }

    void check(Context context, PluginType pluginType, String str, C9430a aVar);

    boolean checkPluginInstalled(String str);

    String getHostModeFilePath();

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
