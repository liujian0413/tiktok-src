package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssistantTask */
public final class AssistantTask implements LegoTask {
    public static final C32361a Companion = new C32361a(null);

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.AssistantTask$a */
    public static final class C32361a {
        private C32361a() {
        }

        /* renamed from: a */
        public static void m104925a(Context context) {
            C7573i.m23587b(context, "context");
        }

        public /* synthetic */ C32361a(C7571f fVar) {
            this();
        }
    }

    public static final void openDebugPage(Context context) {
        C32361a.m104925a(context);
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BACKGROUND;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C7573i.m23582a((Object) C6903bc.m21465F(), "LegacyServiceUtils.getInitService()");
    }
}
