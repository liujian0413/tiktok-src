package com.bytedance.android.livesdk.chatroom.p210c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.gift.model.p390a.C8136c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.a */
public final class C4298a {
    /* renamed from: a */
    public static void m14476a(Context context, C8136c cVar) {
        m14477a(context, (C9357a) cVar.f22206d, null);
    }

    /* renamed from: a */
    public static void m14477a(Context context, C9357a aVar, Map<String, Object> map) {
        switch (aVar.f25630h) {
            case 2:
                ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(context, C3979c.m13952b(aVar.f25628f).mo11550a(aVar.f25624b));
                return;
            case 3:
                C9494e eVar = new C9494e(aVar.f25628f);
                eVar.mo23525a("is_first_consume", String.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).isFirstConsume(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a())));
                if (map != null && map.size() > 0) {
                    for (Entry entry : map.entrySet()) {
                        eVar.mo23525a((String) entry.getKey(), entry.getValue().toString());
                    }
                }
                int i = aVar.f25627e;
                int i2 = aVar.f25626d;
                C9097a a = C9097a.m27146a();
                C4414af afVar = new C4414af(eVar.mo23522a(), "banner", 17, i, i2, 2);
                a.mo22267a((Object) afVar);
                return;
            default:
                C9494e eVar2 = new C9494e(aVar.f25628f);
                eVar2.mo23525a("title", aVar.f25624b);
                ((C8931a) C3596c.m13172a(C8931a.class)).handle(context, Uri.parse(eVar2.mo23522a()));
                return;
        }
    }
}
