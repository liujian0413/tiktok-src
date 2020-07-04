package com.facebook.internal;

import android.app.Activity;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.internal.g */
public abstract class C13909g<CONTENT, RESULT> {

    /* renamed from: a */
    protected static final Object f36810a = new Object();

    /* renamed from: b */
    public int f36811b;

    /* renamed from: c */
    private final Activity f36812c;

    /* renamed from: d */
    private final C13945q f36813d = null;

    /* renamed from: e */
    private List<C13910a> f36814e;

    /* renamed from: com.facebook.internal.g$a */
    public abstract class C13910a {
        /* renamed from: a */
        public abstract C13861a mo33567a(CONTENT content);

        /* renamed from: a */
        public abstract boolean mo33569a(CONTENT content, boolean z);

        /* renamed from: a */
        public Object mo33568a() {
            return C13909g.f36810a;
        }

        protected C13910a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C13910a> mo33564b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C13861a mo33566c();

    /* renamed from: d */
    private List<C13910a> mo36845d() {
        if (this.f36814e == null) {
            this.f36814e = mo33564b();
        }
        return this.f36814e;
    }

    /* renamed from: a */
    public final Activity mo33562a() {
        if (this.f36812c != null) {
            return this.f36812c;
        }
        if (this.f36813d != null) {
            return this.f36813d.mo33598a();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo33563a(CONTENT content) {
        return m41060a(content, f36810a);
    }

    /* renamed from: b */
    public void mo33565b(CONTENT content) {
        m41061b(content, f36810a);
    }

    protected C13909g(Activity activity, int i) {
        C13876aa.m40978a((Object) activity, "activity");
        this.f36812c = activity;
        this.f36811b = i;
    }

    /* renamed from: a */
    private boolean m41060a(CONTENT content, Object obj) {
        boolean z;
        if (obj == f36810a) {
            z = true;
        } else {
            z = false;
        }
        for (C13910a aVar : mo36845d()) {
            if ((z || C13967z.m41248a(aVar.mo33568a(), obj)) && aVar.mo33569a(content, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m41061b(CONTENT content, Object obj) {
        C13861a c = m41062c(content, obj);
        if (c != null) {
            if (this.f36813d != null) {
                C13907f.m41052a(c, this.f36813d);
            } else {
                C13907f.m41049a(c, this.f36812c);
            }
        } else if (C13499h.m39717c()) {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
    }

    /* renamed from: c */
    private C13861a m41062c(CONTENT content, Object obj) {
        boolean z;
        if (obj == f36810a) {
            z = true;
        } else {
            z = false;
        }
        C13861a aVar = null;
        Iterator it = mo36845d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C13910a aVar2 = (C13910a) it.next();
            if ((z || C13967z.m41248a(aVar2.mo33568a(), obj)) && aVar2.mo33569a(content, true)) {
                try {
                    aVar = aVar2.mo33567a(content);
                    break;
                } catch (FacebookException e) {
                    aVar = mo33566c();
                    C13907f.m41050a(aVar, e);
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        C13861a c = mo33566c();
        C13907f.m41048a(c);
        return c;
    }
}
