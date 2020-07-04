package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.C7541d;
import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$getAdUserAgent$1 */
public final class RawURLGetter$getAdUserAgent$1 implements LegoTask {
    final /* synthetic */ C7541d $newUa;
    final /* synthetic */ C7595j $newUa$metadata;
    final /* synthetic */ SharedPreferences $sp;

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.IDLE;
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        C6921a.m21555a("AD_USER_AGENT_KEY");
        this.$sp.edit().putString("ad_user_agent_sp", (String) this.$newUa.getValue()).apply();
    }

    RawURLGetter$getAdUserAgent$1(SharedPreferences sharedPreferences, C7541d dVar, C7595j jVar) {
        this.$sp = sharedPreferences;
        this.$newUa = dVar;
        this.$newUa$metadata = jVar;
    }
}
