package com.bytedance.android.livesdk.feed.p227b;

import android.content.Context;
import com.bytedance.android.live.base.model.proto.C2361a;
import com.bytedance.android.live.core.C3163b;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.live.core.utils.C3392l;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.feed.p226a.C5927b;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p458j.C9488a;
import com.bytedance.android.livesdkapi.p458j.C9488a.C9489a;
import com.bytedance.android.livesdkapi.service.C9514b;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.feed.b.b */
public class C5951b {

    /* renamed from: a */
    private static C5951b f17628a = new C5951b();

    /* renamed from: b */
    private static C9514b f17629b;

    /* renamed from: c */
    private static boolean f17630c;

    /* renamed from: d */
    private static Context f17631d;

    /* renamed from: e */
    private static C3392l<Locale> f17632e;

    private C5951b() {
    }

    /* renamed from: b */
    public static C9514b m18637b() {
        return f17629b;
    }

    /* renamed from: a */
    public static Context m18633a() {
        if (f17631d != null) {
            return f17631d;
        }
        Context context = m18637b().mo14561a().context();
        f17631d = context;
        return context;
    }

    /* renamed from: a */
    public static void m18634a(Context context) {
        f17631d = context;
    }

    /* renamed from: a */
    public static void m18635a(C3392l<Locale> lVar) {
        f17632e = lVar;
    }

    /* renamed from: a */
    public static void m18636a(C9514b bVar) {
        if (!f17630c) {
            synchronized (C5951b.class) {
                if (!f17630c) {
                    f17630c = true;
                    f17629b = new C5950a(bVar);
                    f17631d = bVar.mo14561a().context();
                    m18638b(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m18638b(C9514b bVar) {
        try {
            C9488a.m28005a(Class.forName("com.bytedance.android.live.network.NetWorkService"), new C9489a(IHostNetwork.class, bVar.mo14568h()));
        } catch (ClassNotFoundException unused) {
        }
        ((INetworkService) C3596c.m13172a(INetworkService.class)).injectProtoDecoders(C2361a.m9964a());
        C3163b.m11944a(new C5927b());
        if ("local_test".equals(f17629b.mo14561a().getChannel())) {
            C3339m.m12448a(true);
        }
    }
}
