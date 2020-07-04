package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.lighten.loader.C12176q;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.common.memory.C13317b;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.p717d.C13622l;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.net.C34069i;
import com.p280ss.android.ugc.aweme.video.C7276d;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FrescoTask */
public class FrescoTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C7276d.m22804a(context);
        try {
            C34069i.m109711a();
            C12176q.m35423a().mo29905a((C13317b) new C13317b() {
                /* renamed from: a */
                public final void mo32580a(MemoryTrimType memoryTrimType) {
                    try {
                        double suggestedTrimRatio = memoryTrimType.getSuggestedTrimRatio();
                        if (MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.getSuggestedTrimRatio() == suggestedTrimRatio || MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.getSuggestedTrimRatio() == suggestedTrimRatio) {
                            C13622l.m40095a().mo33208d().mo33175a();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "[Lighten][Fresco][Initializer][Throwable]");
            throw e;
        }
    }
}
