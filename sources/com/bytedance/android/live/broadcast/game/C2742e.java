package com.bytedance.android.live.broadcast.game;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.model.Game;

/* renamed from: com.bytedance.android.live.broadcast.game.e */
final /* synthetic */ class C2742e implements OnClickListener {

    /* renamed from: a */
    private final C2734b f8695a;

    /* renamed from: b */
    private final Game f8696b;

    C2742e(C2734b bVar, Game game) {
        this.f8695a = bVar;
        this.f8696b = game;
    }

    public final void onClick(View view) {
        this.f8695a.mo9435a(this.f8696b, view);
    }
}
