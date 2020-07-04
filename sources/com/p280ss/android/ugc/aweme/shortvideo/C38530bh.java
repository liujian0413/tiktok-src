package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bh */
public final class C38530bh implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f100146a;

    public C38530bh(VideoRecordNewActivity videoRecordNewActivity) {
        this.f100146a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42585u.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C38530bh.this.f100146a.f107327m.mo100082b(((C42585u) t).f110737a);
                C6906g.m21513a(C38530bh.this.f100146a, "light", "click", 0, 0, C38530bh.this.f100146a.mo101854n());
            }
        };
    }
}
