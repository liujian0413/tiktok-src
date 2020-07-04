package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1608a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b.C41843a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a */
public final class C40711a implements C41842b {

    /* renamed from: a */
    private final Context f105839a;

    /* renamed from: b */
    private final Video f105840b;

    /* renamed from: c */
    private final C28412a f105841c;

    /* renamed from: a */
    public final C41843a mo100886a() {
        if (this.f105840b == null) {
            return new C41843a(0, 0);
        }
        C41843a a = this.f105841c.mo72144a(this.f105839a, this.f105840b);
        C7573i.m23582a((Object) a, "feedAllScreenHelper.doVi…oAdaption(context, video)");
        return a;
    }

    public C40711a(Context context, Video video, C28412a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "feedAllScreenHelper");
        this.f105839a = context;
        this.f105840b = video;
        this.f105841c = aVar;
    }
}
