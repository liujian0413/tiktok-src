package com.bytedance.awemelobby;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.C12203b.C12205a;
import com.bytedance.lobby.C12203b.C12206b;
import com.bytedance.lobby.C12203b.C12207c;
import com.bytedance.lobby.C12203b.C12208d;
import com.bytedance.lobby.C12203b.C12209e;
import com.bytedance.lobby.C12203b.C12210f;
import com.bytedance.lobby.C12203b.C12211g;
import com.bytedance.lobby.C12203b.C12212h;
import com.bytedance.lobby.internal.C12222c;
import com.bytedance.lobby.internal.C12222c.C12224a.C12225a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.awemelobby.a */
public final class C9657a {

    /* renamed from: a */
    public static final C9657a f26372a = new C9657a();

    /* renamed from: b */
    private static final boolean f26373b = C7163a.m22363a();

    private C9657a() {
    }

    /* renamed from: a */
    public static void m28556a(Context context) {
        C7573i.m23587b(context, "context");
        C12203b a = new C12207c("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com").mo29941a(2).mo29943a();
        C7573i.m23582a((Object) a, "LobbyProviderConfig.Goog…                 .build()");
        C12203b a2 = new C12206b("597615686992125").mo29941a(2).mo29943a();
        C7573i.m23582a((Object) a2, "LobbyProviderConfig.Face…                 .build()");
        C12203b a3 = new C12210f("1511960329").mo29941a(2).mo29943a();
        C7573i.m23582a((Object) a3, "LobbyProviderConfig.Line…                 .build()");
        C12205a a4 = new C12208d("cc81bf08f7424bed825d666ce4a2a9fe").mo29941a(2);
        Bundle bundle = new Bundle();
        bundle.putString("ig_redirect_url", "https://api2.musical.ly/passport/auth/wap_login_success/");
        C12203b a5 = a4.mo29942a(bundle).mo29943a();
        C7573i.m23582a((Object) a5, "LobbyProviderConfig.Inst…                 .build()");
        C12205a a6 = new C12211g("YYWjeT5eJGnfiErKfxYxYAXHq").mo29941a(2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("twitter_consumer_secret", "w981H5bEdxghiDenDVAu2dTutdsQsh71LU0w4sLmVO8UMdbe6Q");
        C12203b a7 = a6.mo29942a(bundle2).mo29943a();
        C7573i.m23582a((Object) a7, "LobbyProviderConfig.Twit…                 .build()");
        C12203b a8 = new C12209e(context.getString(R.string.bx4)).mo29941a(2).mo29943a();
        C7573i.m23582a((Object) a8, "LobbyProviderConfig.Kaka…                 .build()");
        C12203b a9 = new C12212h(String.valueOf(context.getResources().getInteger(R.integer.com_vk_sdk_AppId))).mo29941a(2).mo29943a();
        C7573i.m23582a((Object) a9, "LobbyProviderConfig.VkBu…                 .build()");
        C12222c.m35540a(new C12225a().mo29962a(context).mo29964a(f26373b).mo29963a(C7525m.m23464b((T[]) new C12203b[]{a, a2, a3, a5, a7, a8, a9})).mo29965a());
    }
}
