package com.p280ss.android.p294e;

import com.p280ss.android.p294e.p295d.C19545b;
import com.p280ss.android.p294e.p295d.C19545b.C6808a;
import com.p280ss.android.p294e.p869a.C19537a;
import com.p280ss.android.p294e.p870b.C19538a;
import com.p280ss.android.p294e.p870b.C19539b;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.e.a */
final class C6805a implements C6808a {

    /* renamed from: a */
    private Pattern f19394a = Pattern.compile(".*(?=://)");

    /* renamed from: b */
    private Pattern f19395b = Pattern.compile("(?<=://)([^/]*)");

    /* renamed from: c */
    private List<C19539b> f19396c = new ArrayList();

    /* renamed from: d */
    private List<C19539b> f19397d = new ArrayList();

    /* renamed from: e */
    private C19545b f19398e;

    /* renamed from: f */
    private C19537a f19399f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16619a() {
        if (this.f19396c.size() != 1) {
            this.f19398e.mo51688a(this.f19396c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo16618a(String str) {
        C19539b c = m21139c(str);
        if (c == null) {
            return str;
        }
        return this.f19395b.matcher(this.f19394a.matcher(str).replaceFirst(c.f52852e)).replaceFirst(c.f52851d);
    }

    C6805a(List<C19539b> list) {
        this.f19396c.clear();
        this.f19396c.addAll(list);
        this.f19398e = new C19545b(this);
        this.f19399f = new C19537a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16621b(String str) {
        URI create = URI.create(str);
        C19539b bVar = new C19539b(create.getHost(), create.getScheme());
        for (int i = 0; i < this.f19397d.size(); i++) {
            if (bVar.mo51684a((C19539b) this.f19397d.get(i))) {
                this.f19399f.mo51675b((C19538a) this.f19397d.get(i));
                return;
            }
        }
    }

    /* renamed from: c */
    private C19539b m21139c(String str) {
        C19539b bVar;
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f19397d.size()) {
                bVar = null;
                i = 0;
                break;
            }
            bVar = (C19539b) this.f19397d.get(i3);
            if (this.f19399f.mo51674a((C19538a) bVar)) {
                i = this.f19397d.size() - i3;
                break;
            }
            i3++;
        }
        if (bVar != null || this.f19396c.size() <= 0) {
            i2 = i;
        } else {
            bVar = (C19539b) this.f19396c.get(0);
        }
        if (i2 <= 1) {
            mo16619a();
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo16620a(List<C19539b> list) {
        StringBuilder sb = new StringBuilder("on sort done = ");
        sb.append(list.size());
        sb.append(" selector:");
        sb.append(this);
        sb.append(" thread:");
        sb.append(Thread.currentThread());
        this.f19397d.clear();
        this.f19397d.addAll(list);
    }
}
