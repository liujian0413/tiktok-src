package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.storage.C41912c;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.music.ui.f */
public final class C33961f implements C41912c {

    /* renamed from: a */
    public final ArrayMap<String, C0902i<Long, byte[]>> f88594a = new ArrayMap<>();

    /* renamed from: b */
    private final C41912c f88595b;

    public final void close() throws IOException {
        this.f88594a.clear();
        this.f88595b.close();
    }

    public C33961f(C41912c cVar) {
        this.f88595b = cVar;
    }
}
