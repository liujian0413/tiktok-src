package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.C2322a;
import com.bytedance.android.live.base.p118b.C2325a;
import com.bytedance.android.live.base.p118b.C2327b;
import com.bytedance.android.live.base.p118b.C2328c;
import com.bytedance.android.live.core.C3143a;
import com.bytedance.android.live.core.C3163b;
import com.bytedance.android.live.core.p148d.C3169b;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.livesdk.C3872ad;
import com.bytedance.android.livesdk.C3906af;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p394i.C8306a;
import com.bytedance.android.livesdk.p422s.C8913b;
import com.bytedance.android.livesdkapi.C9408g;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.p450f.C9407c;
import com.bytedance.android.livesdkapi.service.C9514b;
import com.bytedance.android.livesdkapi.service.C9515c;
import p346io.reactivex.p350f.C7332a;

public class SDKServiceInitTask extends C8306a {
    C9514b mHostService;

    public int getTaskId() {
        return 0;
    }

    public void run() {
        C3169b.m11986a();
        if (C7332a.m23031b() == null && !isDebug(this.mHostService)) {
            C7332a.m23027a(C8342b.f22887a);
        }
        TTLiveSDKContext.registerService(C9515c.class, new C8913b());
        TTLiveSDKContext.registerService(C9514b.class, this.mHostService);
        C2322a.m9939a((C2327b) new C2327b() {
            /* renamed from: a */
            public final <T> T mo8146a(Class<T> cls) {
                if (cls == C2328c.class) {
                    return C8343c.f22888a;
                }
                if (cls == C2325a.class) {
                    return SDKServiceInitTask.this.mHostService.mo14564d();
                }
                return C9469i.m27984a(cls);
            }
        });
        C9469i.m27985a((C9408g) new C3906af());
        if ("local_test".equals(this.mHostService.mo14561a().getChannel())) {
            C3339m.m12448a(true);
        }
        C3163b.m11944a(new C3143a() {
        });
        C3872ad.m13728a();
        TTLiveSDKContext.getHostService().mo22368i().mo23273a(C9407c.m27867a());
    }

    public SDKServiceInitTask(C9514b bVar) {
        this.mHostService = bVar;
    }

    private static boolean isDebug(C9514b bVar) {
        if (bVar == null || !bVar.mo14561a().isLocalTest()) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ void lambda$run$0$SDKServiceInitTask(Throwable th) throws Exception {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        if (th.getStackTrace() != null) {
            th.getStackTrace();
        }
    }
}
