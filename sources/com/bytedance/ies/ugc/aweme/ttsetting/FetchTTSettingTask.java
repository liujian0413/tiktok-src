package com.bytedance.ies.ugc.aweme.ttsetting;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class FetchTTSettingTask implements LegoTask {
    public static final C10968a Companion = new C10968a(null);
    private final String mHost;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask$a */
    public static final class C10968a {
        private C10968a() {
        }

        public /* synthetic */ C10968a(C7571f fVar) {
            this();
        }
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public FetchTTSettingTask(String str) {
        C7573i.m23587b(str, "host");
        this.mHost = str;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0) > TimeUnit.HOURS.toMillis(6)) {
            C10969a.f29672a.mo26462a(this.mHost);
        } else {
            C10969a.f29672a.mo26460a();
        }
    }
}
