package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25836e;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.concurrent.Callable;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.RnPrepareTask */
public final class RnPrepareTask implements LegoTask {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.RnPrepareTask$a */
    static final class C37238a<V> implements Callable<C7581n> {

        /* renamed from: a */
        public static final C37238a f97359a = new C37238a();

        C37238a() {
        }

        public final /* synthetic */ Object call() {
            m119680a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m119680a() {
            if (C26654b.m87576d()) {
                C25836e.m84972a().mo67156b();
                ReactInstance.invokePreparedReactContext();
            }
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.SPARSE;
    }

    public final void run(Context context) {
        C1592h.m7855a((Callable<TResult>) C37238a.f97359a, C1592h.f5958b);
    }
}
