package com.bytedance.crash.p503k;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.p504l.C9972a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.k.d */
public final class C9971d {

    /* renamed from: a */
    private List<C9968a> f27207a = new ArrayList(3);

    /* renamed from: a */
    public final void mo24604a() {
        new StringBuilder("[ScheduleTaskManager] execute, task size=").append(this.f27207a.size());
        for (C9968a a : this.f27207a) {
            try {
                a.mo24600a();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static C9971d m29496a(Handler handler, Context context) {
        return new C9971d(handler, context);
    }

    private C9971d(Handler handler, Context context) {
        if (C9972a.m29506b(context)) {
            List<C9968a> list = this.f27207a;
            C9970c cVar = new C9970c(handler, 0, C40413c.f105051b);
            list.add(cVar);
        }
        List<C9968a> list2 = this.f27207a;
        C9969b bVar = new C9969b(handler, 0, C40413c.f105051b, context);
        list2.add(bVar);
    }
}
