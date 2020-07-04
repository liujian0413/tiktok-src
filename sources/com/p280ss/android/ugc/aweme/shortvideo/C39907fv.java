package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42154au;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fv */
public final class C39907fv implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f103677a;

    /* renamed from: b */
    private String f103678b = "WideCamera";

    public C39907fv(VideoRecordNewActivity videoRecordNewActivity) {
        this.f103677a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (C42154au.class != type) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C39907fv.this.f103677a.f107337w.mo103594a((Object) C39907fv.this.f103677a, (C42155av) t);
                C42154au auVar = (C42154au) t;
                C39907fv.this.f103677a.f107327m.mo100082b(0);
                C39907fv.this.f103677a.f107327m.mo100088g();
                if (C39907fv.this.f103677a.f107327m.mo100084c() && auVar.f109685a) {
                    C10761a.m31392b((Context) C39907fv.this.f103677a, (int) R.string.app, 1).mo25750a();
                }
            }
        };
    }
}
