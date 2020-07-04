package com.p1843tt.miniapphost.appbase;

import android.content.Context;
import android.content.Intent;
import com.p1843tt.miniapphost.appbase.listener.MiniAppPreloadListCheckListener;
import com.p1843tt.miniapphost.entity.MiniAppPreloadConfigEntity;
import com.p1843tt.miniapphost.entity.PreLoadAppEntity;
import com.p1843tt.miniapphost.entity.PreloadExtSrcEntity;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tt.miniapphost.appbase.IAppbrandSupport */
public interface IAppbrandSupport {
    void cancelPreloadMiniApp(String str);

    String getTmaJssdkVersion();

    String getTmaJssdkVersion(Context context);

    boolean isSDKSupport();

    boolean isSDKSupport(Context context);

    void openAppbrand(String str);

    void openAppbrand(String str, String str2, boolean z);

    boolean openShortcut(Intent intent);

    void preloadEmptyProcess();

    void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2);

    void preloadMiniApp(List<PreLoadAppEntity> list, Map<String, String> map, MiniAppPreloadListCheckListener miniAppPreloadListCheckListener);

    void setMiniAppPreloadConfigEntity(MiniAppPreloadConfigEntity miniAppPreloadConfigEntity);

    void switchLang(Locale locale);
}
