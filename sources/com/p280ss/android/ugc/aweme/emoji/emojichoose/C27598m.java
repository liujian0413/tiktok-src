package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27503a;
import com.p280ss.android.ugc.aweme.emoji.p1202b.C27515h;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27553p;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27554a;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27563g;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.C27611c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.m */
public final class C27598m {

    /* renamed from: a */
    public C27522f f72741a;

    /* renamed from: b */
    public List<C27522f> f72742b = new ArrayList();

    /* renamed from: c */
    public int f72743c;

    /* renamed from: d */
    private C27515h f72744d;

    /* renamed from: e */
    private C27553p f72745e;

    /* renamed from: f */
    private C27611c f72746f;

    /* renamed from: g */
    private C27586e f72747g;

    /* renamed from: f */
    public final int mo70856f() {
        return this.f72742b.size();
    }

    /* renamed from: c */
    public final int mo70849c() {
        if (this.f72741a == null) {
            return 0;
        }
        return this.f72741a.mo70719f();
    }

    /* renamed from: d */
    public final int mo70852d() {
        if (this.f72741a == null) {
            return 0;
        }
        return this.f72741a.mo70732e();
    }

    /* renamed from: g */
    private void m90443g() {
        if (this.f72747g.f72688a) {
            if (this.f72746f == null) {
                this.f72746f = new C27611c(C6399b.m19921a());
            }
            m90442a((C27522f) this.f72746f);
        }
    }

    /* renamed from: h */
    private void m90444h() {
        if (C27536b.m90257b() && this.f72747g.f72689b) {
            if (this.f72745e == null) {
                this.f72745e = new C27553p();
            }
            m90442a((C27522f) this.f72745e);
        }
    }

    /* renamed from: i */
    private void m90445i() {
        if (C27503a.m90147b() && this.f72747g.f72690c) {
            if (this.f72744d == null) {
                this.f72744d = new C27515h();
            }
            m90442a((C27522f) this.f72744d);
        }
    }

    /* renamed from: e */
    public final int mo70854e() {
        int i = 0;
        for (C27522f f : this.f72742b) {
            i += f.mo70719f();
        }
        return i;
    }

    /* renamed from: a */
    public final void mo70843a() {
        this.f72742b.clear();
        m90443g();
        m90444h();
        m90445i();
        m90446j();
        if (this.f72743c >= mo70856f()) {
            mo70844a(0);
        }
    }

    /* renamed from: b */
    public final int mo70846b() {
        int i = 0;
        for (C27522f fVar : this.f72742b) {
            if (fVar == this.f72741a) {
                return this.f72741a.mo70732e() + i;
            }
            i += fVar.mo70719f();
        }
        return 0;
    }

    /* renamed from: j */
    private void m90446j() {
        if (this.f72747g.f72691d) {
            LinkedHashMap<Resources, List<Emoji>> linkedHashMap = C27554a.m90296a().f72622a;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                for (Entry entry : linkedHashMap.entrySet()) {
                    C27563g gVar = new C27563g();
                    gVar.f72641d = (Resources) entry.getKey();
                    gVar.f72640c = (List) entry.getValue();
                    m90442a((C27522f) gVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70845a(List<Emoji> list) {
        if (this.f72745e != null) {
            this.f72745e.f72640c = list;
        }
    }

    /* renamed from: b */
    public final void mo70848b(List<Emoji> list) {
        if (this.f72744d != null) {
            this.f72744d.f72640c = list;
        }
    }

    /* renamed from: f */
    public final C27522f mo70857f(int i) {
        return (C27522f) this.f72742b.get(i);
    }

    public C27598m(C27586e eVar) {
        this.f72747g = eVar;
        m90443g();
        m90444h();
        m90445i();
        mo70844a(0);
    }

    /* renamed from: a */
    private void m90442a(C27522f fVar) {
        if (this.f72742b == null) {
            this.f72742b = new ArrayList();
        }
        this.f72742b.add(fVar);
    }

    /* renamed from: c */
    public final C27522f mo70850c(int i) {
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (C27522f fVar : this.f72742b) {
            i2 += fVar.mo70719f();
            if (i < i2) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo70851c(List<Emoji> list) {
        if (this.f72744d != null) {
            this.f72744d.f72555b = list;
        }
    }

    /* renamed from: d */
    public final List<C27517a> mo70853d(int i) {
        if (i < 0) {
            return new ArrayList();
        }
        int i2 = 0;
        for (C27522f fVar : this.f72742b) {
            if (i < fVar.mo70719f() + i2) {
                return fVar.mo70716b(i - i2);
            }
            i2 += fVar.mo70719f();
        }
        return new ArrayList();
    }

    /* renamed from: e */
    public final int mo70855e(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = 0;
        for (C27522f fVar : this.f72742b) {
            if (i < fVar.mo70719f() + i2) {
                return i - i2;
            }
            i2 += fVar.mo70719f();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo70844a(int i) {
        if (i >= 0 && i < mo70856f()) {
            this.f72743c = i;
            this.f72741a = (C27522f) this.f72742b.get(this.f72743c);
        }
    }

    /* renamed from: b */
    public final void mo70847b(int i) {
        if (i >= 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f72742b.size(); i3++) {
                C27522f fVar = (C27522f) this.f72742b.get(i3);
                if (i < fVar.mo70719f() + i2) {
                    this.f72743c = i3;
                    this.f72741a = fVar;
                    this.f72741a.mo70729a(i - i2);
                    return;
                }
                i2 += fVar.mo70719f();
            }
        }
    }
}
