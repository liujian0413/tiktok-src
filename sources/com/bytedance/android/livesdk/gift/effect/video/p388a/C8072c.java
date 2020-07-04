package com.bytedance.android.livesdk.gift.effect.video.p388a;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9322a;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9323b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.c */
public final class C8072c implements C9323b {

    /* renamed from: c */
    private static SparseArray<C9322a> f22012c = new SparseArray<>(2);

    /* renamed from: d */
    private static int f22013d;

    /* renamed from: e */
    private static C8072c f22014e;

    /* renamed from: a */
    private final IHostPlugin f22015a;

    /* renamed from: b */
    private Context f22016b;

    /* renamed from: a */
    public static C8072c m24766a() {
        if (f22014e == null) {
            f22014e = new C8072c(((IHostContext) C3596c.m13172a(IHostContext.class)).context(), (IHostPlugin) C3596c.m13172a(IHostPlugin.class));
        }
        return f22014e;
    }

    /* renamed from: a */
    public final C9322a mo21099a(int i) {
        return (C9322a) f22012c.get(i);
    }

    /* renamed from: b */
    public final void mo21101b(int i) {
        C9322a aVar = (C9322a) f22012c.get(i);
        if (aVar != null) {
            aVar.mo21092c();
            f22012c.remove(i);
        }
    }

    private C8072c(Context context, IHostPlugin iHostPlugin) {
        this.f22016b = context.getApplicationContext();
        this.f22015a = iHostPlugin;
    }

    /* renamed from: a */
    public final C9322a mo21100a(int i, C0043i iVar) {
        if (i == f22013d && mo21099a(f22013d) != null) {
            return mo21099a(f22013d);
        }
        f22013d = i;
        C8068b bVar = new C8068b(this.f22016b, this.f22015a);
        bVar.mo21085a(iVar);
        f22012c.put(i, bVar);
        return bVar;
    }
}
