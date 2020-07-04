package com.p280ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p1843tt.miniapphost.AppbrandSupport;
import com.p280ss.android.ugc.aweme.miniapp_api.C33420a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33433h;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.C7166a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.b */
public class C7167b implements IMiniAppService {

    /* renamed from: a */
    public static final String f20091a = "b";

    /* renamed from: c */
    private static Application f20092c;

    /* renamed from: d */
    private static C7166a f20093d;

    /* renamed from: b */
    private IMiniAppService f20094b;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.b$a */
    static class C7169a {

        /* renamed from: a */
        public static final C7167b f20095a = new C7167b();
    }

    private C7167b() {
    }

    /* renamed from: b */
    public static C7167b m22380b() {
        return C7169a.f20095a;
    }

    public String addScene(String str, String str2) {
        return null;
    }

    public boolean checkMiniAppEnable(Context context) {
        return false;
    }

    public String getJsSdkVersion(Application application) {
        return null;
    }

    public void getShareInfo(String str, C33433h hVar) {
    }

    public void handleActivityImageResult(int i, int i2, Intent intent) {
    }

    public void initMiniApp() {
    }

    public void initialize(Application application, C7166a aVar) {
    }

    public boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    public void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public void logExcitingVideoAd(Context context, String str, long j, String str2) {
    }

    public void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    public void openMircoAppList(Activity activity) {
    }

    public void preloadMiniApp(String str) {
    }

    public void preloadMiniApp(String str, int i) {
    }

    public void remoteMobV3(String str, JSONObject jSONObject) {
    }

    public String setLaunchModeHostTask(String str) {
        return null;
    }

    /* renamed from: a */
    public final IMiniAppService mo18647a() {
        IMiniAppService c = m22381c();
        if (c == null) {
            return this;
        }
        if (!AppbrandSupport.inst().isInit()) {
            c.initialize(f20092c, f20093d);
        }
        return c;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0052 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService m22381c() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0056 }
            r1 = 21
            r2 = 0
            if (r0 >= r1) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0026
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ all -> 0x0056 }
            java.lang.Class<com.bytedance.ies.ugc.aweme.plugin.service.IPluginService> r1 = com.bytedance.ies.ugc.aweme.plugin.service.IPluginService.class
            java.lang.Object r0 = r0.getService(r1)     // Catch:{ all -> 0x0056 }
            com.bytedance.ies.ugc.aweme.plugin.service.IPluginService r0 = (com.bytedance.ies.ugc.aweme.plugin.service.IPluginService) r0     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "com.ss.android.ugc.aweme.miniapp"
            boolean r0 = r0.mo26457a(r1)     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0026
            monitor-exit(r5)
            return r2
        L_0x0026:
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = r5.f20094b     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "com.ss.android.ugc.aweme.miniapp.MiniAppService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0052 }
            java.lang.String r1 = "inst"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = (com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r0     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            r5.f20094b = r0     // Catch:{ IllegalAccessException -> 0x004e, NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0044 }
            goto L_0x0052
        L_0x0044:
            r0 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)     // Catch:{ Throwable -> 0x0052 }
            goto L_0x0052
        L_0x0049:
            r0 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)     // Catch:{ Throwable -> 0x0052 }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r0)     // Catch:{ Throwable -> 0x0052 }
        L_0x0052:
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = r5.f20094b     // Catch:{ all -> 0x0056 }
            monitor-exit(r5)
            return r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b.m22381c():com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService");
    }

    /* renamed from: a */
    public static void m22379a(Application application, C7166a aVar) {
        f20092c = application;
        f20093d = aVar;
    }

    public boolean openShortcut(Context context, Intent intent) {
        return C33420a.m108081a(context);
    }

    public boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C33471b bVar) {
        return C33420a.m108081a(context);
    }

    public boolean openMiniApp(Context context, String str, C33471b bVar) {
        return C33420a.m108081a(context);
    }
}
