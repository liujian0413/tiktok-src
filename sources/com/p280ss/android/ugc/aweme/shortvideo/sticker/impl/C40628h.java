package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p022v4.app.FragmentActivity;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.h */
final /* synthetic */ class C40628h implements Callable {

    /* renamed from: a */
    private final CategoryStickerFragment f105617a;

    /* renamed from: b */
    private final FragmentActivity f105618b;

    /* renamed from: c */
    private final List f105619c;

    /* renamed from: d */
    private final Collection f105620d;

    C40628h(CategoryStickerFragment categoryStickerFragment, FragmentActivity fragmentActivity, List list, Collection collection) {
        this.f105617a = categoryStickerFragment;
        this.f105618b = fragmentActivity;
        this.f105619c = list;
        this.f105620d = collection;
    }

    public final Object call() {
        return this.f105617a.mo100649a(this.f105618b, this.f105619c, this.f105620d);
    }
}
