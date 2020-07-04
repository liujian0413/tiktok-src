package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment.C2735c;

/* renamed from: com.bytedance.android.live.broadcast.widget.ac */
final /* synthetic */ class C3084ac implements C2735c {

    /* renamed from: a */
    private final C3135v f9555a;

    /* renamed from: b */
    private final SelectGameDialogFragment f9556b;

    C3084ac(C3135v vVar, SelectGameDialogFragment selectGameDialogFragment) {
        this.f9555a = vVar;
        this.f9556b = selectGameDialogFragment;
    }

    /* renamed from: a */
    public final void mo9437a(Game game) {
        this.f9555a.mo9963a(this.f9556b, game);
    }
}
