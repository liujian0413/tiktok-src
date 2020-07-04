package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15017a.C15028f;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.af */
final class C15055af extends C15059aj {

    /* renamed from: a */
    private final ArrayList<C15028f> f38944a;

    /* renamed from: b */
    private final /* synthetic */ C15159z f38945b;

    public C15055af(C15159z zVar, ArrayList<C15028f> arrayList) {
        this.f38945b = zVar;
        super(zVar, null);
        this.f38944a = arrayList;
    }

    /* renamed from: a */
    public final void mo38287a() {
        this.f38945b.f39213a.f38992d.f38954c = this.f38945b.m44120i();
        ArrayList arrayList = this.f38944a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C15028f) obj).mo38213a(this.f38945b.f39227o, this.f38945b.f39213a.f38992d.f38954c);
        }
    }
}
