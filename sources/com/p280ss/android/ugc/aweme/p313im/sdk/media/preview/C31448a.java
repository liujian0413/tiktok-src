package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview;

import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1333a.C31449a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a */
public final class C31448a implements C31449a {

    /* renamed from: a */
    private final List<MediaModel> f82345a;

    /* renamed from: b */
    private final MediaModel f82346b;

    /* renamed from: c */
    private final List<MediaModel> f82347c;

    /* renamed from: a */
    public final MediaModel mo82050a() {
        return this.f82346b;
    }

    /* renamed from: b */
    public final Pair<List<MediaModel>, Boolean> mo82051b() {
        List list;
        List<MediaModel> list2 = this.f82345a;
        if (list2 != null) {
            list = C7525m.m23509d((Collection<? extends T>) list2);
        } else {
            list = new ArrayList();
        }
        return C7579l.m23633a(list, Boolean.valueOf(false));
    }

    /* renamed from: c */
    public final List<MediaModel> mo82052c() {
        List<MediaModel> list = this.f82347c;
        if (list != null) {
            return C7525m.m23509d((Collection<? extends T>) list);
        }
        return new ArrayList<>();
    }

    public C31448a(List<MediaModel> list, MediaModel mediaModel, List<MediaModel> list2) {
        this.f82345a = list;
        this.f82346b = mediaModel;
        this.f82347c = list2;
    }
}
