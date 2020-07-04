package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.location.C32616a.C32617a;
import java.util.Map;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LocationStatusReportTask */
public final class LocationStatusReportTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.SPARSE;
    }

    public final void run(Context context) {
        boolean z;
        Object obj;
        int i = 1;
        if (VERSION.SDK_INT >= 23) {
            z = C32617a.m105668a();
        } else {
            z = true;
        }
        C22984d a = C22984d.m75611a();
        String str = "is_open";
        if (!z) {
            i = 0;
        }
        a.mo59970a(str, i);
        if (context != null) {
            try {
                obj = context.getSystemService("location");
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            LocationManager locationManager = (LocationManager) obj;
            if (locationManager != null) {
                a.mo59970a("device_gps_open", locationManager.isProviderEnabled("gps") ? 1 : 0);
            }
            C6907h.m21524a("location_status", (Map) a.f60753a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
    }
}
