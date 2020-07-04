package com.bytedance.android.live.broadcast;

import android.content.Context;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.p280ss.avframework.utils.EarlyAVLog;
import com.p280ss.avframework.utils.LibraryLoader;
import com.p280ss.avframework.utils.LibraryLoader.Loader;
import java.util.Arrays;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.broadcast.a */
public class C2404a {

    /* renamed from: b */
    public static final String[] f7939b = {"lens", "ttquic", "avframework", "ies_render", "agora-rtc-sdk-jni", "zegoliveroom", "bytertc"};

    /* renamed from: c */
    private static C2404a f7940c;

    /* renamed from: e */
    private static final String[] f7941e = {"c++_shared", "yuv", "ttffmpeg", "audioeffect", "effect"};

    /* renamed from: a */
    public Context f7942a = C3358ac.m12528e();

    /* renamed from: d */
    private boolean f7943d;

    private C2404a() {
    }

    /* renamed from: c */
    public static C7492s<Integer> m10122c() {
        return C7492s.m23301b(Integer.valueOf(1));
    }

    /* renamed from: a */
    public static C2404a m10120a() {
        if (f7940c == null) {
            synchronized (C2404a.class) {
                if (f7940c == null) {
                    f7940c = new C2404a();
                }
            }
        }
        return f7940c;
    }

    /* renamed from: b */
    public final void mo8841b() {
        try {
            C3166a.m11966e("LiveBroadcastContext", "LibraryLoader.setupLibraryLoader");
            LibraryLoader.setupLibraryLoader(new Loader() {
                public final void loadLibraryFromPath(String str) throws Exception {
                }

                public final void loadLibrary(String str) throws Exception {
                    StringBuilder sb = new StringBuilder("start sdk load library name:");
                    sb.append(str);
                    C3166a.m11966e("LiveBroadcastContext", sb.toString());
                    if (Arrays.asList(C2404a.f7939b).contains(str)) {
                        ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).loadLibrary(0, C2404a.this.f7942a, PluginType.LiveResource.getPackageName(), str, null);
                    } else {
                        ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).loadLibrary(2, C2404a.this.f7942a, "", str, null);
                    }
                }
            });
            C3166a.m11966e("LiveBroadcastContext", "EarlyAVLog.setEarlyLogPrint");
            EarlyAVLog.setEarlyLogPrint(C2441b.f7975a);
        } catch (Throwable th) {
            C3166a.m11963b("LiveBroadcastContext", th);
        }
        if (!this.f7943d) {
            PluginType.LiveResource.preload();
            m10123d();
            m10122c();
            try {
                PluginType.LiveResource.load(this.f7942a, false);
            } catch (Throwable unused) {
            }
            this.f7943d = true;
        }
    }

    /* renamed from: d */
    private void m10123d() {
        LiveCameraResManager.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "avframework", "ies_render", "zegoliveroom", "agora-rtc-sdk-jni"};
        IHostPlugin iHostPlugin = (IHostPlugin) C3596c.m13172a(IHostPlugin.class);
        for (int i = 0; i < 10; i++) {
            String str = "LiveBroadcastContext";
            try {
                StringBuilder sb = new StringBuilder("start load library:");
                sb.append(strArr[i]);
                C3166a.m11966e(str, sb.toString());
                String hostPackageName = iHostPlugin.getHostPackageName();
                iHostPlugin.loadLibrary(2, this.f7942a, hostPackageName, strArr[i], getClass().getClassLoader());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10121a(int i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("code:");
        sb.append(i);
        sb.append(" var2:");
        sb.append(str);
        sb.append(" var3:");
        sb.append(str2);
        C3166a.m11962b("LiveBroadcastContext", sb.toString(), th);
    }
}
