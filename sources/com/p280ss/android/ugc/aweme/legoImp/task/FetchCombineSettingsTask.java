package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.net.cronet.C10933d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.requestcombine.C37199a;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37246f;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37247g;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37248h;
import com.p280ss.android.ugc.aweme.requesttask.p1504a.C37226b;
import com.p280ss.android.ugc.aweme.requesttask.p1504a.C37229c;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37232b;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37233c;
import com.p280ss.android.ugc.aweme.requesttask.p1505b.C37234d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FetchCombineSettingsTask */
public final class FetchCombineSettingsTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        if (C6399b.m19944t()) {
            return WorkType.BOOT_FINISH;
        }
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        if (C10933d.m32091a(context)) {
            C6921a.m21555a("FetchCombineSettingsTask");
            if (C37199a.f97322a.mo93733b()) {
                C7121a.m22254e().mo18551a(new C37234d()).mo18552a();
                return;
            }
            C7121a.m22254e().mo18551a(new C37233c()).mo18551a(new C37232b()).mo18551a(new C37248h()).mo18551a(new C37229c(1)).mo18551a(new C37226b()).mo18551a(new C37247g()).mo18551a(new C37246f()).mo18552a();
        }
    }
}
