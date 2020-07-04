package com.p280ss.android.ugc.aweme.global.config.settings;

import com.bytedance.ies.C10287a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.squareup.wire.Message;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.b */
final /* synthetic */ class C30194b implements Callable {

    /* renamed from: a */
    private final IESSettingsProxy f79448a;

    C30194b(IESSettingsProxy iESSettingsProxy) {
        this.f79448a = iESSettingsProxy;
    }

    public final Object call() {
        return C10287a.m30471a(C6399b.m19921a(), (Message) this.f79448a.getSettings());
    }
}
