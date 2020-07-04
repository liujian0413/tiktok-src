package com.p280ss.android.ugc.aweme.shortvideo.vechoosecover;

import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.b */
final /* synthetic */ class C41588b implements Runnable {

    /* renamed from: a */
    private final ChooseCoverActivity f108079a;

    /* renamed from: b */
    private final InteractStickerStruct f108080b;

    /* renamed from: c */
    private final int f108081c;

    /* renamed from: d */
    private final float f108082d;

    /* renamed from: e */
    private final int f108083e;

    /* renamed from: f */
    private final VotingStickerView f108084f;

    /* renamed from: g */
    private final int f108085g;

    /* renamed from: h */
    private final int f108086h;

    C41588b(ChooseCoverActivity chooseCoverActivity, InteractStickerStruct interactStickerStruct, int i, float f, int i2, VotingStickerView votingStickerView, int i3, int i4) {
        this.f108079a = chooseCoverActivity;
        this.f108080b = interactStickerStruct;
        this.f108081c = i;
        this.f108082d = f;
        this.f108083e = i2;
        this.f108084f = votingStickerView;
        this.f108085g = i3;
        this.f108086h = i4;
    }

    public final void run() {
        this.f108079a.mo102208a(this.f108080b, this.f108081c, this.f108082d, this.f108083e, this.f108084f, this.f108085g, this.f108086h);
    }
}
