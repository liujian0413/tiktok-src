package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.al */
final /* synthetic */ class C41257al implements Runnable {

    /* renamed from: a */
    private final VEVideoPublishPreviewActivity f107499a;

    /* renamed from: b */
    private final InteractStickerStruct f107500b;

    /* renamed from: c */
    private final VotingStickerView f107501c;

    /* renamed from: d */
    private final View f107502d;

    C41257al(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity, InteractStickerStruct interactStickerStruct, VotingStickerView votingStickerView, View view) {
        this.f107499a = vEVideoPublishPreviewActivity;
        this.f107500b = interactStickerStruct;
        this.f107501c = votingStickerView;
        this.f107502d = view;
    }

    public final void run() {
        this.f107499a.mo101722a(this.f107500b, this.f107501c, this.f107502d);
    }
}
