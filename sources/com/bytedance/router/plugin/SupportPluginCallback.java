package com.bytedance.router.plugin;

import java.util.List;

public interface SupportPluginCallback {
    List<Plugin> initPlugins();

    void loadPlugin(Plugin plugin, String str);
}
