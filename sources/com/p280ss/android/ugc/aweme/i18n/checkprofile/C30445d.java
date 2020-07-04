package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager.Response;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.d */
public final class C30445d extends C25652b<C25640a<Response>, C30446e> {

    /* renamed from: a */
    private int f79987a;

    /* renamed from: d */
    private boolean f79988d = true;

    /* renamed from: e */
    private boolean f79989e;

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        ((C30446e) this.f67572c).mo80110a();
    }

    /* renamed from: e */
    public final void mo80122e() {
        if (this.f79988d && !this.f79989e) {
            mo56976a(Integer.valueOf(this.f79987a), Integer.valueOf(20));
            this.f79989e = true;
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        String str;
        super.mo56977b();
        this.f79989e = false;
        Response response = (Response) this.f67571b.getData();
        if (response == null || response.users == null || response.status_code != 0) {
            C30446e eVar = (C30446e) this.f67572c;
            if (response == null) {
                str = "response is null";
            } else {
                StringBuilder sb = new StringBuilder("status_code: ");
                sb.append(response.status_code);
                str = sb.toString();
            }
            eVar.mo80113a(str);
            return;
        }
        this.f79988d = response.has_more;
        this.f79987a = response.cursor;
        ((C30446e) this.f67572c).mo80114a(response.users, this.f79988d);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        this.f79989e = false;
        super.mo57296a(exc);
        ((C30446e) this.f67572c).mo80113a(exc.getMessage());
    }
}
