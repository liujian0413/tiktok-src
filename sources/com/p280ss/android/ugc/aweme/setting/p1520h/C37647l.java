package com.p280ss.android.ugc.aweme.setting.p1520h;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.model.C22202f;
import com.p280ss.android.ugc.aweme.account.p943f.C21174a;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.net.HttpType;

/* renamed from: com.ss.android.ugc.aweme.setting.h.l */
public final class C37647l {

    /* renamed from: a */
    public C21174a f98116a;

    /* renamed from: b */
    public final void mo94943b() {
        this.f98116a = null;
    }

    /* renamed from: a */
    public final void mo94941a() {
        C34037b bVar = new C34037b("https://api2.musical.ly/2/user/info/", HttpType.GET, "data", C22202f.class);
        bVar.mo86728a((C34065d) new C34065d() {
            /* renamed from: a */
            public final void mo58715a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo58716a(String str, Object obj) {
                if (C37647l.this.f98116a != null) {
                    C37647l.this.f98116a.mo57100a((C22202f) obj);
                }
            }
        });
        bVar.mo86727a();
    }

    /* renamed from: a */
    private static String m120463a(String str) {
        StringBuilder sb = new StringBuilder(C21578r.f57913a);
        sb.append("?platform=");
        sb.append(Uri.encode(str));
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo94942a(String str, C34065d dVar) {
        C34037b bVar = new C34037b(m120463a(str), HttpType.GET, "data", String.class);
        bVar.mo86728a(dVar);
        bVar.mo86727a();
    }
}
