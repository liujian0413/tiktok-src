package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.t */
final /* synthetic */ class C37733t implements Callable {

    /* renamed from: a */
    private final String f98320a;

    /* renamed from: b */
    private final AwemeSettings f98321b;

    C37733t(String str, AwemeSettings awemeSettings) {
        this.f98320a = str;
        this.f98321b = awemeSettings;
    }

    public final Object call() {
        return C37665p.m120488a(this.f98320a, this.f98321b);
    }
}
