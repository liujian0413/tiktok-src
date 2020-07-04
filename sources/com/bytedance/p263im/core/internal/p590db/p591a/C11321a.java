package com.bytedance.p263im.core.internal.p590db.p591a;

import android.content.Context;
import com.bytedance.p263im.core.internal.p590db.C11366j;
import com.bytedance.p263im.core.internal.p590db.C11367k;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.p590db.C11370n;
import com.bytedance.p263im.core.internal.p590db.C11373o;
import com.bytedance.p263im.core.internal.p590db.C11374p;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.p590db.C11376r;
import com.bytedance.p263im.core.internal.p590db.fts.C11359a;
import com.bytedance.p263im.core.internal.p590db.fts.C11362b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11327a;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.p593a.C11330a;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.C11198c;

/* renamed from: com.bytedance.im.core.internal.db.a.a */
public class C11321a extends C11327a {
    /* renamed from: a */
    public C11330a mo27327a() {
        return this;
    }

    /* renamed from: a */
    public void mo27328a(C11351d dVar) {
        C11404d.m33582a("IMDBHelper onCreate");
        dVar.mo27365a(C11368l.m33386c());
        dVar.mo27365a(C11375q.m33439b());
        dVar.mo27365a(C11366j.m33366b());
        dVar.mo27365a(C11369m.m33399b());
        dVar.mo27365a(C11367k.m33373b());
        dVar.mo27365a(C11373o.m33419b());
        dVar.mo27365a(C11362b.m33354a(C11359a.m33342b()));
        dVar.mo27365a(C11374p.m33425b());
        dVar.mo27365a(C11376r.m33463b());
        dVar.mo27365a(C11370n.m33410b());
        String[] c = C11375q.m33446c();
        for (int i = 0; i < 3; i++) {
            dVar.mo27365a(c[i]);
        }
    }

    public C11321a(Context context, String str) {
        super(context, str, null, 16);
    }

    public C11321a(Context context, String str, String str2) {
        super(context, str, str2, null, 16);
    }

    /* renamed from: b */
    public final void mo27330b(C11351d dVar, int i, int i2) {
        StringBuilder sb = new StringBuilder("IMDBHelper onDowngrade oldVersion=");
        sb.append(i);
        sb.append(",newVersion=");
        sb.append(i2);
        C11404d.m33582a(sb.toString());
        C11198c.m32777a().mo27253f();
        this.f30694a.deleteDatabase(this.f30695b);
    }

    /* renamed from: a */
    public void mo27329a(C11351d dVar, int i, int i2) {
        C11404d.m33582a("IMDBHelper onUpgrade");
        StringBuilder sb = new StringBuilder("db onUpgrade...oldVersion=");
        sb.append(i);
        sb.append(",newVersion=");
        sb.append(i2);
        C11404d.m33587b(sb.toString());
        if (i == 1) {
            dVar.mo27365a("alter table conversation_list add column member_count integer");
        }
        if (i <= 2) {
            dVar.mo27365a("alter table msg add column read_status integer");
        }
        if (i <= 3) {
            dVar.mo27365a("alter table conversation_list add column min_index bigint");
        }
        if (i <= 4) {
            dVar.mo27365a(C11367k.m33373b());
            dVar.mo27365a(C11373o.m33419b());
        } else if (i == 5) {
            dVar.mo27365a("alter table conversation_setting add column favor integer");
        }
        if (i <= 6) {
            dVar.mo27365a("alter table attchment add column display_type text");
            dVar.mo27365a("alter table attchment add column mime_type text");
        }
        if (i <= 7) {
            dVar.mo27365a(C11362b.m33354a(C11359a.m33342b()));
        }
        if (i < 9) {
            dVar.mo27365a(C11374p.m33425b());
        }
        if (i < 10) {
            dVar.mo27365a("alter table participant add column sec_uid text");
        }
        if (i < 11) {
            dVar.mo27365a("alter table conversation_list add column status integer");
            dVar.mo27365a("alter table conversation_list add column participant text");
            if (i > 4) {
                dVar.mo27365a("alter table conversation_core add column owner_id integer default -1");
                dVar.mo27365a("alter table conversation_core add column sec_owner text");
            }
        }
        if (i < 12) {
            dVar.mo27365a(C11376r.m33463b());
        }
        if (i < 13) {
            dVar.mo27365a("alter table msg add column sec_sender text");
        }
        if (i < 14) {
            dVar.mo27365a("alter table msg add column property_list text");
        }
        if (i < 15) {
            dVar.mo27365a(C11370n.m33410b());
        }
        if (i < 16) {
            dVar.mo27365a("alter table conversation_list add column last_msg_order_index bigint");
        }
    }
}
