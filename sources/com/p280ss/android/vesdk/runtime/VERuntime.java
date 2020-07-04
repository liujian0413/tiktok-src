package com.p280ss.android.vesdk.runtime;

import android.content.Context;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.ttve.editorInfo.C20455a;
import com.p280ss.android.ttve.monitor.C20469a;
import com.p280ss.android.ttve.monitor.C20469a.C20470a;
import com.p280ss.android.ttve.monitor.C20471b;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttve.monitor.IMonitor;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.vesdk.C45276c;
import com.p280ss.android.vesdk.C45320h;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.VEListener.C45206b;
import com.p280ss.android.vesdk.VEListener.C45222r;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.p1776d.C45306a;
import com.p280ss.android.vesdk.runtime.cloudconfig.C45358d;
import com.p280ss.android.vesdk.runtime.p1778a.C45342a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.runtime.VERuntime */
public class VERuntime {

    /* renamed from: a */
    public Context f116762a;

    /* renamed from: b */
    public boolean f116763b;

    /* renamed from: c */
    public boolean f116764c;

    /* renamed from: d */
    public C45363e f116765d;

    /* renamed from: e */
    public C45346c f116766e;

    /* renamed from: f */
    public boolean f116767f;

    /* renamed from: g */
    public VESize f116768g;

    /* renamed from: h */
    public C45320h f116769h;

    /* renamed from: i */
    public boolean f116770i;

    /* renamed from: j */
    public WeakReference<C45222r> f116771j;

    /* renamed from: k */
    public WeakReference<C45206b> f116772k;

    /* renamed from: l */
    private boolean f116773l;

    /* renamed from: m */
    private boolean f116774m;

    /* renamed from: n */
    private IMonitor f116775n;

    /* renamed from: o */
    private C20470a f116776o;

    /* renamed from: p */
    private C45342a f116777p;

    /* renamed from: com.ss.android.vesdk.runtime.VERuntime$a */
    enum C45340a {
        INSTANCE;
        

        /* renamed from: b */
        private VERuntime f116783b;

        /* renamed from: a */
        public final VERuntime mo108555a() {
            return this.f116783b;
        }
    }

    private static native void nativeEnableAudioSDKApiV2(boolean z);

    private native void nativeEnableHDH264HWDecoder(boolean z, int i);

    private native void nativeEnableTT265Decoder(boolean z);

    private native void nativeSetVideoEncodeSetting(VEVideoEncodeSettings vEVideoEncodeSettings);

    /* renamed from: a */
    public static VERuntime m143285a() {
        return C45340a.INSTANCE.mo108555a();
    }

    /* renamed from: b */
    private void m143288b() {
        if (this.f116763b) {
            try {
                C45358d.m143365a();
            } catch (Exception unused) {
            }
        }
        new Thread() {
            public final void run() {
                System.currentTimeMillis();
                if (VERuntime.this.f116763b) {
                    C45358d.m143368b();
                }
                try {
                    C20471b.m67909a(VERuntime.this.f116762a);
                    if (!((Boolean) C45342a.m143305a().mo108560b("sensor_reported", Boolean.valueOf(false))).booleanValue()) {
                        C20477e.m67933a(VERuntime.this.f116762a);
                        C45342a.m143305a().mo108558a("sensor_reported", Boolean.valueOf(true));
                    }
                } catch (Exception unused) {
                }
                C45306a aVar = new C45306a();
                aVar.mo108381a("iesve_vesdk_init_finish_result", "success");
                aVar.mo108381a("iesve_vesdk_init_finish_reason", TEVideoRecorder.FACE_BEAUTY_NULL);
                C20477e.m67936a("iesve_vesdk_init_finish", 1, aVar);
            }
        }.start();
    }

    private VERuntime() {
        this.f116768g = new VESize(0, 0);
        this.f116774m = false;
        this.f116775n = new IMonitor() {
            public final void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.f116771j != null && VERuntime.this.f116771j.get() != null) {
                    ((C45222r) VERuntime.this.f116771j.get()).mo56362a(str, jSONObject);
                }
            }
        };
        this.f116776o = new C20470a() {
            /* renamed from: a */
            public final void mo55138a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
                if (VERuntime.this.f116772k != null && VERuntime.this.f116772k.get() != null) {
                    ((C45206b) VERuntime.this.f116772k.get()).mo56363a(str, jSONObject, str2, str3, str4);
                }
            }
        };
    }

    /* renamed from: d */
    public static void m143290d(boolean z) {
        VEEffectConfig.setUseNewEffectAlgorithmApi(z);
    }

    /* renamed from: a */
    public final void mo108550a(VEVideoEncodeSettings vEVideoEncodeSettings) {
        nativeSetVideoEncodeSetting(vEVideoEncodeSettings);
    }

    /* renamed from: b */
    public static boolean m143289b(String str) {
        C45276c.m142929b(str);
        VEEffectConfig.setEffectJsonConfig(str);
        return true;
    }

    /* renamed from: a */
    public static boolean m143286a(String str) {
        C45276c.m142927a(str);
        VEEffectConfig.setShareDir(str);
        return true;
    }

    /* renamed from: a */
    public static boolean m143287a(boolean z) {
        C45276c.m142928a(z);
        VEEffectConfig.setABbUseBuildinAmazing(z);
        return true;
    }

    /* renamed from: b */
    public final int mo108552b(boolean z) {
        if (this.f116766e == null) {
            return -108;
        }
        VEEffectConfig.setEffectAsynAPI(z);
        return 0;
    }

    /* renamed from: c */
    public final int mo108553c(boolean z) {
        if (!this.f116774m) {
            C45372t.m143409d("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTT265Decoder(z);
        return 0;
    }

    /* renamed from: a */
    public final void mo108548a(C45206b bVar) {
        this.f116772k = new WeakReference<>(bVar);
        C20469a.m67904a(this.f116776o);
    }

    /* renamed from: a */
    public final void mo108549a(C45222r rVar) {
        this.f116771j = new WeakReference<>(rVar);
        C20479f.m67951a(this.f116775n);
    }

    /* renamed from: a */
    public final boolean mo108551a(C1942b bVar) {
        C45276c.m142926a(bVar);
        VEEffectConfig.setResourceFinder(bVar);
        this.f116764c = false;
        this.f116773l = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }

    /* renamed from: a */
    public final int mo108546a(boolean z, int i) {
        if (!this.f116774m) {
            C45372t.m143409d("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 720) {
            i = 730;
        }
        nativeEnableHDH264HWDecoder(z, i);
        return 0;
    }

    /* renamed from: a */
    public final void mo108547a(Context context, String str) {
        if (!this.f116774m) {
            this.f116774m = true;
            this.f116762a = context;
            TENativeLibsLoader.m67980a(context);
            this.f116766e = new C45346c();
            this.f116766e.f116805a = str;
            this.f116769h = new C45320h();
            this.f116765d = new C45363e();
            this.f116777p = C45342a.m143305a();
            this.f116777p.mo108557a(context);
            C20479f.m67950a(this.f116762a, (String) this.f116777p.mo108560b("KEY_DEVICEID", ""));
            C20469a.m67903a();
            C20455a.m67869a();
            C45276c.m142925a(context);
            m143288b();
        }
    }
}
