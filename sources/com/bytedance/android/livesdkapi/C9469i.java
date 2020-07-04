package com.bytedance.android.livesdkapi;

import android.content.Context;
import com.bytedance.android.live.base.C2322a;
import com.bytedance.android.live.base.p118b.C2325a;
import com.bytedance.android.live.base.p118b.C2327b;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostWallet;
import com.bytedance.android.livesdkapi.p458j.C9488a;
import com.bytedance.android.livesdkapi.p458j.C9488a.C9489a;
import com.bytedance.android.livesdkapi.service.C9513a;
import com.bytedance.android.livesdkapi.service.C9514b;
import com.bytedance.android.livesdkapi.service.C9515c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.i */
public final class C9469i {

    /* renamed from: a */
    public static volatile C9408g f25917a;

    /* renamed from: b */
    private static volatile Context f25918b;

    /* renamed from: c */
    private static volatile C9514b f25919c;

    /* renamed from: d */
    private static volatile boolean f25920d;

    /* renamed from: e */
    private static volatile boolean f25921e;

    /* renamed from: f */
    private static List<String> f25922f = Arrays.asList(new String[]{"livesdk", "livegiftimpl"});

    /* renamed from: c */
    public static Context m27991c() {
        return f25918b;
    }

    /* renamed from: e */
    public static C9514b m27993e() {
        return f25919c;
    }

    /* renamed from: d */
    public static C9515c m27992d() {
        if (f25917a == null) {
            return null;
        }
        return f25917a.mo11446a();
    }

    /* renamed from: b */
    public static synchronized void m27989b() {
        synchronized (C9469i.class) {
            if (!f25921e) {
                C9488a.m28007a("com.bytedance.android.livesdk.TTLiveSDKContext", "initGiftResource", new Object[0]);
                f25921e = true;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m27987a() {
        boolean z;
        synchronized (C9469i.class) {
            if (!f25920d) {
                C9488a.m28007a("com.bytedance.android.livesdk.TTLiveSDKContext", "delayInit", new Object[0]);
                f25920d = true;
            }
            z = f25920d;
        }
        return z;
    }

    /* renamed from: a */
    public static void m27985a(C9408g gVar) {
        f25917a = gVar;
    }

    /* renamed from: a */
    public static <T> T m27984a(Class<T> cls) {
        if (f25917a == null) {
            return null;
        }
        return f25917a.mo11447a(cls);
    }

    /* renamed from: a */
    private static void m27986a(C9514b bVar) {
        m27990b(bVar);
        C9488a.m28007a("com.bytedance.android.livesdk.TTLiveSDKContext", "initialize", bVar);
    }

    /* renamed from: b */
    private static void m27990b(C9514b bVar) {
        try {
            for (String str : f25922f) {
                StringBuilder sb = new StringBuilder("com.bytedance.android.live.misc.LiveService$$");
                sb.append(str);
                C9488a.m28007a(sb.toString(), "registerService", new Object[0]);
            }
            C9488a.m28005a(Class.forName("com.bytedance.android.live.network.NetWorkService"), new C9489a(IHostNetwork.class, bVar.mo14568h()));
            C9488a.m28005a(Class.forName("com.bytedance.android.live.wallet.WalletService"), new C9489a(IHostWallet.class, bVar.mo14566f()));
            C9488a.m28003a(Class.forName("com.bytedance.android.livesdk.fans.FansService"));
            C9488a.m28003a(Class.forName("com.bytedance.android.livesdk.schema.LiveActionHandlerImpl"));
            C9488a.m28003a(Class.forName("com.bytedance.android.livesdk.module.MessageService"));
            C9488a.m28003a(Class.forName("com.bytedance.android.live.livepullstream.PullStreamService"));
            C9488a.m28003a(Class.forName("com.bytedance.android.livesdk.module.LiveSDKService"));
            try {
                C9488a.m28003a(Class.forName("com.bytedance.android.live.broadcast.BroadcastService"));
            } catch (Exception unused) {
                C9488a.m28003a(Class.forName("com.bytedance.android.live.broadcast.api.dummy.BroadcastServiceDummy"));
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static boolean m27988a(final C9513a aVar, boolean z) {
        C9411h hVar = new C9411h(aVar);
        f25919c = hVar;
        f25918b = hVar.mo14561a().context();
        C2322a.m9939a((C2327b) new C2327b() {
            /* renamed from: a */
            public final <T> T mo8146a(Class<T> cls) {
                if (cls == C2325a.class) {
                    return aVar.mo14557D();
                }
                return C9469i.f25917a.mo11447a(cls);
            }
        });
        m27986a(f25919c);
        return true;
    }
}
