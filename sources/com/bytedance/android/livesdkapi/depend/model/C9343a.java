package com.bytedance.android.livesdkapi.depend.model;

import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.a */
public final class C9343a {
    @C6593c(mo15949a = "data")

    /* renamed from: a */
    public List<ChargeDeal> f25539a;
    @C6593c(mo15949a = "extra")

    /* renamed from: b */
    public C9344a f25540b;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$a */
    public static class C9344a {
        @C6593c(mo15949a = "default_packet_id")

        /* renamed from: a */
        public long f25541a;
        @C6593c(mo15949a = "first_charge_packet_id")

        /* renamed from: b */
        public long f25542b;
        @C6593c(mo15949a = "hotsoonHint")

        /* renamed from: c */
        public String f25543c;
        @C6593c(mo15949a = "recently_purchased_packet_id")

        /* renamed from: d */
        public int f25544d;
        @C6593c(mo15949a = "allow_diamond_exchange")

        /* renamed from: e */
        public boolean f25545e;
    }

    public C9343a() {
    }

    public C9343a(C9343a aVar) {
        ArrayList arrayList;
        String str;
        long j;
        if (aVar.f25539a == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(aVar.f25539a);
        }
        this.f25539a = arrayList;
        C9344a aVar2 = new C9344a();
        if (aVar.f25540b != null) {
            str = aVar.f25540b.f25543c;
        } else {
            str = "";
        }
        aVar2.f25543c = str;
        long j2 = 0;
        if (aVar.f25540b != null) {
            j = aVar.f25540b.f25541a;
        } else {
            j = 0;
        }
        aVar2.f25541a = j;
        if (aVar.f25540b != null) {
            j2 = aVar.f25540b.f25542b;
        }
        aVar2.f25542b = j2;
    }
}
