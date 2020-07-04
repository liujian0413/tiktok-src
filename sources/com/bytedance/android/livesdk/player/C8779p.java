package com.bytedance.android.livesdk.player;

import com.bytedance.android.livesdk.player.ITTLivePlayer.PlayerEvent;

/* renamed from: com.bytedance.android.livesdk.player.p */
final /* synthetic */ class C8779p implements Runnable {

    /* renamed from: a */
    private final C87781 f23840a;

    /* renamed from: b */
    private final PlayerEvent f23841b;

    /* renamed from: c */
    private final int f23842c;

    /* renamed from: d */
    private final String f23843d;

    C8779p(C87781 r1, PlayerEvent playerEvent, int i, String str) {
        this.f23840a = r1;
        this.f23841b = playerEvent;
        this.f23842c = i;
        this.f23843d = str;
    }

    public final void run() {
        this.f23840a.mo21825b(this.f23841b, this.f23842c, this.f23843d);
    }
}
