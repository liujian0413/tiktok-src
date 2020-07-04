package com.p280ss.android.ugc.aweme.comment.repo;

import com.bytedance.jedi.model.p599a.C11757e;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;

/* renamed from: com.ss.android.ugc.aweme.comment.repo.c */
public final class C24214c extends C11994b {

    /* renamed from: a */
    private final C24213b f63927a = new C24213b();

    /* renamed from: b */
    private final C24212a f63928b = new C24212a();

    public C24214c() {
        mo29605a((C11790b<K, V, ?, ?>) this.f63927a, (C11757e<K1, V1>) this.f63928b, (C7562b<? super C11808c<K, V, K1, List<V1>>, C7581n>) new GifEmojiListRepository$$special$$inlined$syncAppendedListTo$1<Object,C7581n>());
    }

    /* renamed from: a */
    public final C7492s<GifEmojiResponse> mo62927a(String str, int i) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        C7492s<GifEmojiResponse> a = this.f63927a.mo29357c(new C24215d(str, i)).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "mFetcher.request(GifEmoj…dSchedulers.mainThread())");
        return a;
    }
}
