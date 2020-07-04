package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment.C2735c;

/* renamed from: com.bytedance.android.live.broadcast.preview.av */
final /* synthetic */ class C2877av implements C2735c {

    /* renamed from: a */
    private final StartLiveFragmentDefault f9102a;

    /* renamed from: b */
    private final SelectGameDialogFragment f9103b;

    C2877av(StartLiveFragmentDefault startLiveFragmentDefault, SelectGameDialogFragment selectGameDialogFragment) {
        this.f9102a = startLiveFragmentDefault;
        this.f9103b = selectGameDialogFragment;
    }

    /* renamed from: a */
    public final void mo9437a(Game game) {
        this.f9102a.mo9532a(this.f9103b, game);
    }
}
