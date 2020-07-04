package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42144ak;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.el */
public final class C39802el implements C42161ba {

    /* renamed from: a */
    public C39382ed f103455a;

    public C39802el(C39382ed edVar) {
        this.f103455a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type == C42144ak.class) {
            return new C42159az<T>() {
                /* renamed from: a */
                public final void mo96096a(Object obj, T t) {
                    float f;
                    float f2;
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C39802el.this.f103455a.f33526d_;
                    C42144ak akVar = (C42144ak) t;
                    float f3 = akVar.f109668a + 100.0f;
                    videoRecordNewActivity.f107327m.f104643e = false;
                    if (f3 >= 0.0f) {
                        if (C6399b.m19946v()) {
                            f = akVar.f109669b - C9738o.m28708b((Context) videoRecordNewActivity, 225.0f);
                            f2 = (f3 - C9738o.m28708b((Context) videoRecordNewActivity, 35.0f)) / f;
                        } else {
                            f = akVar.f109669b - C9738o.m28708b((Context) videoRecordNewActivity, 210.0f);
                            f2 = (f3 - C9738o.m28708b((Context) videoRecordNewActivity, 20.0f)) / f;
                        }
                        if (((double) f2) > 0.98d) {
                            f2 = 1.0f;
                        }
                        videoRecordNewActivity.f107327m.mo100076a(f2, f);
                        akVar.mo103580a();
                    }
                }
            };
        }
        return null;
    }
}
