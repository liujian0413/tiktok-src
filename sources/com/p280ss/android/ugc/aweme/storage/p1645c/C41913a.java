package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.C1642a;
import com.bytedance.storage.C12918a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.a */
public abstract class C41913a implements C12918a {

    /* renamed from: a */
    public static final C41914a f108993a = new C41914a(null);

    /* renamed from: b */
    private AtomicBoolean f108994b = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.a$a */
    public static final class C41914a {
        private C41914a() {
        }

        public /* synthetic */ C41914a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo102948e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract StorageType mo102949f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo102951h();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract long mo102953j();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo102950g() {
        this.f108994b.set(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo102952i() {
        this.f108994b.set(false);
    }

    /* renamed from: a */
    public final String mo31399a() {
        return mo102949f().toString();
    }

    /* renamed from: b */
    public final boolean mo31400b() {
        boolean z = false;
        if (this.f108994b.get()) {
            return false;
        }
        try {
            mo102950g();
            long currentTimeMillis = System.currentTimeMillis();
            mo102951h();
            C35574k.m114859a().mo70094i().mo102929a().mo102964b(mo102948e(), System.currentTimeMillis() - currentTimeMillis);
            z = true;
        } catch (Exception e) {
            C35574k.m114859a().mo70094i().mo102929a().mo102960a(mo102948e(), e);
        } catch (Throwable th) {
            mo102952i();
            throw th;
        }
        mo102952i();
        return z;
    }

    /* renamed from: d */
    public final long mo31402d() {
        long j;
        Exception e;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            j = mo102953j();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(mo102948e());
                sb.append(", size: ");
                String str = "%.1fMB";
                Object[] objArr = new Object[1];
                double d = (double) j;
                Double.isNaN(d);
                objArr[0] = Double.valueOf(d / 1048576.0d);
                C7573i.m23582a((Object) C1642a.m8034a(str, Arrays.copyOf(objArr, 1)), "java.lang.String.format(format, *args)");
                C35574k.m114859a().mo70094i().mo102929a().mo102959a(mo102948e(), System.currentTimeMillis() - currentTimeMillis);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            j = 0;
            e = e3;
            C35574k.m114859a().mo70094i().mo102929a().mo102960a(mo102948e(), e);
            return j;
        }
        return j;
    }
}
