package com.bytedance.android.livesdk.chatroom.p210c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.p280ss.android.common.util.C19290j;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.b */
public final class C4299b {
    /* renamed from: a */
    public static void m14478a(Context context, C9357a aVar) {
        switch (aVar.f25630h) {
            case 2:
                C9178j.m27302j().mo22374c().mo11535a(context, C3979c.m13952b(aVar.f25628f).mo11550a(aVar.f25624b));
                return;
            case 3:
                C19290j jVar = new C19290j(aVar.f25628f);
                jVar.mo51188a("is_first_consume", String.valueOf(C9281a.m27615a(TTLiveSDKContext.getHostService().mo22367h().mo22165a())));
                C9097a.m27146a().mo22267a((Object) new C4414af(jVar.mo51184a(), "banner"));
                return;
            default:
                C19290j jVar2 = new C19290j(aVar.f25628f);
                jVar2.mo51188a("title", aVar.f25624b);
                C9178j.m27302j().mo22380i().handle(context, Uri.parse(jVar2.mo51184a()));
                return;
        }
    }
}
