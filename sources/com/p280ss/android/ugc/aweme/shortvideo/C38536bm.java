package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bm */
public final class C38536bm implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f100154a;

    public C38536bm(VideoRecordNewActivity videoRecordNewActivity) {
        this.f100154a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (C42586v.class != type) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C38536bm.this.f100154a.f107327m.mo100089h();
                C38536bm.this.f100154a.f107337w.mo103594a((Object) C38536bm.this.f100154a, (C42155av) t);
            }
        };
    }
}
