package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import com.bytedance.storage.C12918a;
import com.bytedance.storage.C12920c;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.RegisterStorageTask */
public final class RegisterStorageTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.IDLE;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C12920c.m37606a((C12918a) new C37542ac());
        C12920c.m37606a((C12918a) new C37553af());
        C12920c.m37606a((C12918a) new C37944z());
    }
}
