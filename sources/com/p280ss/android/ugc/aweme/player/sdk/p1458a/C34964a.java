package com.p280ss.android.ugc.aweme.player.sdk.p1458a;

import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34978b;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34992e;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.a */
public final class C34964a {
    /* renamed from: a */
    public static IPlayer m112652a(PlayerConfig playerConfig) {
        if (playerConfig.f115497b == Type.Ijk) {
            C34992e eVar = new C34992e(playerConfig.f115496a, playerConfig.f115498c, playerConfig.f115501f, playerConfig.f115502g, playerConfig);
            return eVar;
        } else if (playerConfig.f115497b == Type.IjkHardware) {
            C34992e eVar2 = new C34992e(playerConfig.f115496a, playerConfig.f115498c, playerConfig.f115501f, playerConfig.f115502g, playerConfig);
            return eVar2;
        } else if (playerConfig.f115497b == Type.TT || playerConfig.f115497b == Type.TT_IJK_ENGINE) {
            C34992e eVar3 = new C34992e(playerConfig.f115496a, playerConfig.f115498c, playerConfig.f115501f, playerConfig.f115502g, playerConfig);
            return eVar3;
        } else if (playerConfig.f115497b == Type.TT_HARDWARE) {
            C34992e eVar4 = new C34992e(playerConfig.f115496a, true, playerConfig.f115501f, playerConfig.f115502g, playerConfig);
            return eVar4;
        } else if (playerConfig.f115497b == Type.LIVE) {
            return new C34978b(playerConfig.f115496a, playerConfig.f115501f, playerConfig.f115500e);
        } else {
            return new C34992e(playerConfig.f115496a);
        }
    }
}
