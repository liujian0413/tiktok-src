package com.p280ss.android.ugc.aweme.video.preload;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.p280ss.android.ugc.aweme.video.experiment.VideoCachePluginEnableExperiment;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.g */
public final class C43283g {

    /* renamed from: a */
    public static final C43283g f112050a = new C43283g();

    /* renamed from: b */
    private static boolean f112051b;

    /* renamed from: c */
    private static IPluginService f112052c = ((IPluginService) ServiceManager.get().getService(IPluginService.class));

    private C43283g() {
    }

    /* renamed from: a */
    public static boolean m137315a() {
        return f112051b;
    }

    /* renamed from: d */
    private static boolean m137319d() {
        IPluginService iPluginService = f112052c;
        if (iPluginService != null) {
            return iPluginService.mo26457a("com.ss.android.ugc.aweme.videocache_v2");
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m137318c() {
        return C6384b.m19835a().mo15292a(VideoCachePluginEnableExperiment.class, true, "enable_videocache_plugin", C6384b.m19835a().mo15295d().enable_videocache_plugin, true);
    }

    /* renamed from: b */
    public static final void m137317b() {
        boolean z;
        if (!m137318c() || !m137319d()) {
            z = false;
        } else {
            z = true;
        }
        f112051b = z;
        if (z) {
            JSONObject b = C42967ba.m136396a().mo104679a("errorCode", Integer.valueOf(0)).mo104679a("isFirst", Integer.valueOf(0)).mo104680a("packageName", "com.ss.android.ugc.aweme.videocache_v2").mo104681b();
            C6877n.m21407a("videocache_pluginv2", "videocache_pluginv2", b);
            C6907h.m21525a("videocache_plugin_status", b);
        }
    }

    /* renamed from: a */
    public static final boolean m137316a(String str) {
        C7573i.m23587b(str, "pluginName");
        IPluginService iPluginService = f112052c;
        if (iPluginService != null) {
            return iPluginService.mo26458a("com.ss.android.ugc.aweme.videocache_v2", str);
        }
        return false;
    }
}
