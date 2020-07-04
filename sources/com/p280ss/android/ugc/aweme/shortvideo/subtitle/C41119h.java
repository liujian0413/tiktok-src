package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.h */
public final class C41119h {
    @C6593c(mo15949a = "start_time")

    /* renamed from: a */
    public int f106990a;
    @C6593c(mo15949a = "end_time")

    /* renamed from: b */
    public int f106991b;
    @C6593c(mo15949a = "text")

    /* renamed from: c */
    public String f106992c = "";

    public C41119h(StickerItemModel stickerItemModel) {
        C7573i.m23587b(stickerItemModel, "item");
        this.f106990a = stickerItemModel.startTime;
        this.f106991b = stickerItemModel.endTime;
        String text = stickerItemModel.getText();
        C7573i.m23582a((Object) text, "item.text");
        this.f106992c = text;
    }
}
