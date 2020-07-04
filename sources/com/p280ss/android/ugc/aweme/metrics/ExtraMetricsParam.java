package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.metrics.ExtraMetricsParam */
public abstract class ExtraMetricsParam implements Serializable {
    protected final HashMap<String, String> params = new HashMap<>();

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(C33259d dVar) {
        HashMap buildParams = buildParams();
        if (dVar != null) {
            dVar.mo85246a((Map<String, String>) buildParams);
        }
    }

    public final void appendParam(String str, String str2, C33260a aVar) {
        this.params.put(str, aVar.mo85256a(str2));
    }
}
