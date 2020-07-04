package com.p280ss.android.ugc.aweme.photomovie.edit.music;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.p1716b.C43650a;
import com.p280ss.android.ugc.p1716b.C43659c;
import java.io.File;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.b */
public final class C34908b {

    /* renamed from: a */
    public String f91055a;

    /* renamed from: b */
    public String f91056b;

    /* renamed from: c */
    public AVMusic f91057c;

    /* renamed from: d */
    public int f91058d;

    /* renamed from: e */
    public boolean f91059e;

    C34908b(AVMusic aVMusic) {
        this.f91057c = aVMusic;
        this.f91055a = m112517a(aVMusic);
        if (C7276d.m22812b(this.f91055a)) {
            this.f91058d = 1;
        } else {
            this.f91058d = 2;
        }
    }

    /* renamed from: a */
    private String m112517a(AVMusic aVMusic) {
        if (aVMusic.getPlayUrl() != null && !C6307b.m19566a((Collection<T>) aVMusic.getPlayUrl().getUrlList())) {
            this.f91056b = (String) aVMusic.getPlayUrl().getUrlList().get(0);
        }
        String b = C43659c.m138324a().mo105614b();
        if (b.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(C43650a.m138300b(this.f91056b));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(File.separator);
        sb2.append(C43650a.m138300b(this.f91056b));
        return sb2.toString();
    }
}
