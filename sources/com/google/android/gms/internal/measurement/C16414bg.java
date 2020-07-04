package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.bg */
public final class C16414bg extends C16506eo implements C16413bf {
    C16414bg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: a */
    public final void mo42536a(Map map, long j, String str, List<zzbr> list) throws RemoteException {
        Parcel a = mo42696a();
        a.writeMap(map);
        a.writeLong(j);
        a.writeString(str);
        a.writeTypedList(list);
        mo42699b(1, a);
    }
}
