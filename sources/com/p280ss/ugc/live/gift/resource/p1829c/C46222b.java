package com.p280ss.ugc.live.gift.resource.p1829c;

import com.C1642a;
import com.p280ss.ugc.live.gift.resource.C46209a;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.exception.Md5InvalidException;
import com.p280ss.ugc.live.gift.resource.p1830d.C46229a;
import java.io.File;

/* renamed from: com.ss.ugc.live.gift.resource.c.b */
public final class C46222b implements C46209a<String>, C46225d<String> {

    /* renamed from: a */
    private C46225d<String> f118819a;

    /* renamed from: b */
    private C46209a<String> f118820b;

    public C46222b(C46225d dVar) {
        this.f118819a = dVar;
    }

    /* renamed from: a */
    public final void mo20821a(C46220c cVar, C46209a<String> aVar) {
        this.f118820b = aVar;
        this.f118819a.mo20821a(cVar, this);
    }

    /* renamed from: a */
    public final void mo114160a(C46220c cVar, int i) {
        if (this.f118820b != null) {
            this.f118820b.mo114160a(cVar, i);
        }
    }

    /* renamed from: a */
    public final void mo114161a(C46220c cVar, BaseGetResourceException baseGetResourceException) {
        if (this.f118820b != null) {
            this.f118820b.mo114161a(cVar, baseGetResourceException);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo114162a(C46220c cVar, String str) {
        try {
            File file = new File(str);
            String a = C46229a.m145161a(file);
            if (!cVar.f118815d.equals(a)) {
                mo114161a(cVar, (BaseGetResourceException) new Md5InvalidException(C1642a.m8034a("File %1$s md5 is not equals", new Object[]{str}), cVar, a));
                file.delete();
                return;
            }
            if (this.f118820b != null) {
                this.f118820b.mo114162a(cVar, str);
            }
        } catch (Exception e) {
            mo114161a(cVar, (BaseGetResourceException) new Md5InvalidException(C1642a.m8034a("File %1$s md5 error", new Object[]{str}), e, cVar, ""));
        }
    }
}
