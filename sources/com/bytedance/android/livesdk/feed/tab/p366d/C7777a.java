package com.bytedance.android.livesdk.feed.tab.p366d;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.C6039l;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;

/* renamed from: com.bytedance.android.livesdk.feed.tab.d.a */
public final class C7777a implements C0067b {

    /* renamed from: a */
    private C6037j f21006a;

    /* renamed from: b */
    private C6039l<C5989f> f21007b;

    /* renamed from: c */
    private C5971a f21008c;

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        if (cls.isAssignableFrom(FeedTabViewModel.class)) {
            return new FeedTabViewModel(this.f21006a, this.f21007b, this.f21008c);
        }
        StringBuilder sb = new StringBuilder("unknown model ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public C7777a(C6037j jVar, C6039l<C5989f> lVar, C5971a aVar) {
        this.f21006a = jVar;
        this.f21007b = lVar;
        this.f21008c = aVar;
    }
}
