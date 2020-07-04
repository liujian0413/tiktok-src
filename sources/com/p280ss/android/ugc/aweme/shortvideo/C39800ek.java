package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42143aj;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ek */
public final class C39800ek implements C42161ba {

    /* renamed from: a */
    public C39382ed f103453a;

    public C39800ek(C39382ed edVar) {
        this.f103453a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42143aj.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C39800ek.this.f103453a.f33526d_;
                C6869c a = C6869c.m21381a();
                a.mo16887a("enter_from", "long_press, zoom_method:long_press");
                C6907h.onEvent(MobClick.obtain().setEventName("zoom").setLabelName("shoot_page").setJsonObject(a.mo16888b()));
                videoRecordNewActivity.f107327m.mo100075a(0.0f);
            }
        };
    }
}
