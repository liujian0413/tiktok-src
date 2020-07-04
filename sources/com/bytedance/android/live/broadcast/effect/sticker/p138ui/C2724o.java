package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdkapi.depend.model.C9355c;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.o */
final /* synthetic */ class C2724o implements OnClickListener {

    /* renamed from: a */
    private final LiveStickerComposerListAdapter f8653a;

    /* renamed from: b */
    private final int f8654b;

    /* renamed from: c */
    private final C2683b f8655c;

    /* renamed from: d */
    private final C9355c f8656d;

    C2724o(LiveStickerComposerListAdapter liveStickerComposerListAdapter, int i, C2683b bVar, C9355c cVar) {
        this.f8653a = liveStickerComposerListAdapter;
        this.f8654b = i;
        this.f8655c = bVar;
        this.f8656d = cVar;
    }

    public final void onClick(View view) {
        this.f8653a.mo9358a(this.f8654b, this.f8655c, this.f8656d, view);
    }
}
