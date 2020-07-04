package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.global.config.settings.C6925d;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask */
public final class PosterSRProcessorInitTask implements LegoTask {
    public static final C32380a Companion = new C32380a(null);
    public static volatile boolean NEED_POSTER_PROCESS;
    private final int posterSrType;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.PosterSRProcessorInitTask$a */
    public static final class C32380a {
        private C32380a() {
        }

        /* renamed from: a */
        public static String m104951a() {
            return "";
        }

        public /* synthetic */ C32380a(C7571f fVar) {
            this();
        }
    }

    public static final void destroy() {
    }

    public static final String getCpuModel() {
        return C32380a.m104951a();
    }

    public static final void hotStartInit() {
    }

    public static final void maybeInit() {
    }

    public static final C6925d watcher() {
        return null;
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public PosterSRProcessorInitTask(int i) {
        this.posterSrType = i;
    }
}
