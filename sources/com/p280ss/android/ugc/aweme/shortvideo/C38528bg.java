package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42584t;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bg */
public final class C38528bg implements C42161ba {

    /* renamed from: a */
    public C39382ed f100144a;

    public C38528bg(C39382ed edVar) {
        this.f100144a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42584t.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C42584t tVar = (C42584t) t;
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C38528bg.this.f100144a.f33526d_;
                if (tVar.f110736c == 2) {
                    ((C39377i) videoRecordNewActivity.f107326l.mo74909j()).mo74887a(tVar.f110735b);
                    return;
                }
                if (tVar.f110736c == 1) {
                    ((C39377i) videoRecordNewActivity.f107326l.mo74909j()).mo74888a(tVar.f110734a, tVar.f110735b);
                }
            }
        };
    }
}
