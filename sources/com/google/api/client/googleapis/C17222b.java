package com.google.api.client.googleapis;

import com.google.api.client.http.C17239ab;
import com.google.api.client.http.C17253e;
import com.google.api.client.http.C17257h;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17268q;
import java.io.IOException;

/* renamed from: com.google.api.client.googleapis.b */
public final class C17222b implements C17260k, C17268q {

    /* renamed from: a */
    private final boolean f47982a;

    public C17222b() {
        this(false);
    }

    /* renamed from: a */
    public final void mo44480a(C17266o oVar) {
        oVar.mo44645a((C17260k) this);
    }

    private C17222b(boolean z) {
        this.f47982a = false;
    }

    /* renamed from: c */
    private boolean m57196c(C17266o oVar) throws IOException {
        String str = oVar.f48105j;
        if (str.equals("POST")) {
            return false;
        }
        if (!str.equals("GET") ? this.f47982a : oVar.f48106k.mo44609c().length() > 2048) {
            return true;
        }
        if (!oVar.f48104i.mo44582a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo44481b(C17266o oVar) throws IOException {
        if (m57196c(oVar)) {
            String str = oVar.f48105j;
            oVar.mo44650a("POST");
            oVar.f48097b.mo44448c("X-HTTP-Method-Override", (Object) str);
            if (str.equals("GET")) {
                oVar.mo44643a((C17257h) new C17239ab(oVar.f48106k.clone()));
                oVar.f48106k.clear();
            } else if (oVar.f48103h == null) {
                oVar.mo44643a((C17257h) new C17253e());
            }
        }
    }
}
