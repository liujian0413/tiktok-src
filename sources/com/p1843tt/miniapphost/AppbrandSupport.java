package com.p1843tt.miniapphost;

import android.content.Context;
import android.content.Intent;
import com.p1843tt.miniapphost.appbase.IAppbrandSupport;
import com.p1843tt.miniapphost.appbase.listener.AppbrandInitCallback;
import com.p1843tt.miniapphost.appbase.listener.MiniAppPreloadListCheckListener;
import com.p1843tt.miniapphost.entity.MiniAppPreloadConfigEntity;
import com.p1843tt.miniapphost.entity.PreLoadAppEntity;
import com.p1843tt.miniapphost.entity.PreloadExtSrcEntity;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tt.miniapphost.AppbrandSupport */
public class AppbrandSupport implements IAppbrandSupport {
    private static volatile AppbrandSupport instance;
    private IAppbrandSupport impl;
    private volatile boolean isInit;

    private AppbrandSupport() {
    }

    public String getTmaJssdkVersion() {
        if (isAppbrandInit()) {
            return this.impl.getTmaJssdkVersion();
        }
        return "1480100";
    }

    public boolean isAppbrandInit() {
        if (!this.isInit || getImpl() == null) {
            return false;
        }
        return true;
    }

    public boolean isSDKSupport() {
        if (isAppbrandInit()) {
            return this.impl.isSDKSupport();
        }
        return false;
    }

    public void preloadEmptyProcess() {
        if (isAppbrandInit()) {
            this.impl.preloadEmptyProcess();
        }
    }

    private IAppbrandSupport getImpl() {
        if (this.impl == null) {
            try {
                Object newInstance = Class.forName("com.tt.miniapp.AppbrandOpenImpl").newInstance();
                if (newInstance instanceof IAppbrandSupport) {
                    this.impl = (IAppbrandSupport) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
        return this.impl;
    }

    public static AppbrandSupport inst() {
        if (instance == null) {
            synchronized (AppbrandSupport.class) {
                if (instance == null) {
                    instance = new AppbrandSupport();
                }
            }
        }
        return instance;
    }

    public boolean isInit() {
        StringBuilder sb = new StringBuilder("isinit  ");
        sb.append(this.isInit);
        AppBrandLogger.m146384i("AppbrandSupport", sb.toString());
        return this.isInit;
    }

    public void setIsInit() {
        StringBuilder sb = new StringBuilder("setInit ");
        sb.append(this.isInit);
        AppBrandLogger.m146384i("AppbrandSupport", sb.toString());
        this.isInit = true;
    }

    public String getTmaJssdkVersion(Context context) {
        return getTmaJssdkVersion();
    }

    public boolean isSDKSupport(Context context) {
        return isSDKSupport();
    }

    public void cancelPreloadMiniApp(String str) {
        if (isAppbrandInit()) {
            this.impl.cancelPreloadMiniApp(str);
        }
    }

    public void openAppbrand(String str) {
        if (isAppbrandInit()) {
            this.impl.openAppbrand(str);
        }
    }

    public void setMiniAppPreloadConfigEntity(MiniAppPreloadConfigEntity miniAppPreloadConfigEntity) {
        if (isAppbrandInit()) {
            this.impl.setMiniAppPreloadConfigEntity(miniAppPreloadConfigEntity);
        }
    }

    public void switchLang(Locale locale) {
        if (isAppbrandInit()) {
            this.impl.switchLang(locale);
        }
    }

    public boolean openShortcut(Intent intent) {
        AppbrandInit.getInstance().init();
        if (isAppbrandInit()) {
            return this.impl.openShortcut(intent);
        }
        return false;
    }

    public void preloadEmptyProcess(AppbrandInitCallback appbrandInitCallback) {
        if (!this.isInit) {
            AppBrandLogger.m146384i("AppbrandSupport", "preloadEmptyProcess before init");
            if (appbrandInitCallback != null && appbrandInitCallback.allowAppbrandInit()) {
                AppBrandLogger.m146384i("AppbrandSupport", "allow appbrand init ");
                if (AppbrandInit.getInstance().init() && appbrandInitCallback.allowDoNext()) {
                    AppBrandLogger.m146384i("AppbrandSupport", "allow do next preloadEmptyProcess");
                    preloadEmptyProcess();
                }
            }
        } else {
            preloadEmptyProcess();
        }
    }

    public void openAppbrand(String str, AppbrandInitCallback appbrandInitCallback) {
        openAppbrand(str, null, true, appbrandInitCallback);
    }

    public void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2) {
        if (isAppbrandInit()) {
            this.impl.preloadMiniApp(list, list2);
        }
    }

    public void openAppbrand(String str, String str2, boolean z) {
        if (isAppbrandInit()) {
            this.impl.openAppbrand(str, str2, z);
        }
    }

    public void preloadMiniApp(List<PreLoadAppEntity> list, Map<String, String> map, MiniAppPreloadListCheckListener miniAppPreloadListCheckListener) {
        if (isAppbrandInit()) {
            this.impl.preloadMiniApp(list, map, miniAppPreloadListCheckListener);
        }
    }

    public void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2, AppbrandInitCallback appbrandInitCallback) {
        if (!this.isInit) {
            AppBrandLogger.m146384i("AppbrandSupport", "preloadMiniApp before init");
            if (appbrandInitCallback != null && appbrandInitCallback.allowAppbrandInit()) {
                AppBrandLogger.m146384i("AppbrandSupport", "allow appbrand init ");
                if (AppbrandInit.getInstance().init() && appbrandInitCallback.allowDoNext()) {
                    AppBrandLogger.m146384i("AppbrandSupport", "allow do next preloadMiniApp");
                    preloadMiniApp(list, list2);
                }
            }
        } else {
            preloadMiniApp(list, list2);
        }
    }

    public void openAppbrand(String str, String str2, boolean z, AppbrandInitCallback appbrandInitCallback) {
        if (!this.isInit) {
            AppBrandLogger.m146384i("AppbrandSupport", "open appbrand before init");
            if (appbrandInitCallback != null && appbrandInitCallback.allowAppbrandInit()) {
                AppBrandLogger.m146384i("AppbrandSupport", "allow appbrand init ");
                if (AppbrandInit.getInstance().init() && appbrandInitCallback.allowDoNext()) {
                    AppBrandLogger.m146384i("AppbrandSupport", "allow do next open appbrand");
                    openAppbrand(str, str2, z);
                }
            }
        } else {
            openAppbrand(str, str2, z);
        }
    }

    public void preloadMiniApp(List<PreLoadAppEntity> list, Map<String, String> map, MiniAppPreloadListCheckListener miniAppPreloadListCheckListener, AppbrandInitCallback appbrandInitCallback) {
        if (!this.isInit) {
            AppBrandLogger.m146384i("AppbrandSupport", "preloadMiniApp before init");
            if (appbrandInitCallback != null && appbrandInitCallback.allowAppbrandInit()) {
                AppBrandLogger.m146384i("AppbrandSupport", "allow appbrand init ");
                if (AppbrandInit.getInstance().init() && appbrandInitCallback.allowDoNext()) {
                    AppBrandLogger.m146384i("AppbrandSupport", "allow do next preloadMiniApp");
                    preloadMiniApp(list, map, miniAppPreloadListCheckListener);
                }
            }
        } else {
            preloadMiniApp(list, map, miniAppPreloadListCheckListener);
        }
    }
}
