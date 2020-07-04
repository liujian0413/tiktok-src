package com.facebook.net;

import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.common.util.C13337d;
import com.p280ss.p1783b.p1784a.C45771a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RetryInterceptManager {

    /* renamed from: d */
    private static volatile RetryInterceptManager f37311d;

    /* renamed from: a */
    public volatile ArrayList<Integer> f37312a;

    /* renamed from: b */
    public volatile ArrayList<Integer> f37313b;

    /* renamed from: c */
    public volatile int f37314c;

    /* renamed from: e */
    private final int f37315e = 1;

    /* renamed from: f */
    private final int f37316f = 2;

    /* renamed from: g */
    private volatile boolean f37317g;

    /* renamed from: h */
    private volatile HashMap<String, C12516p> f37318h;

    /* renamed from: i */
    private volatile List<C12469a> f37319i;

    /* renamed from: com.facebook.net.RetryInterceptManager$1 */
    class C141221 implements C12469a {

        /* renamed from: a */
        final /* synthetic */ RetryInterceptManager f37320a;

        /* renamed from: a */
        public final C12534t mo10436a(C12470a aVar) throws Exception {
            return C14140h.m41743a(this, aVar);
        }

        /* renamed from: b */
        public final C12534t mo33883b(C12470a aVar) throws Exception {
            C12960e eVar;
            int i = 0;
            while (true) {
                try {
                    C12462c a = RetryInterceptManager.m41703a(aVar, i);
                    if (this.f37320a.mo33882b()) {
                        Object obj = a.f33105i;
                        if (obj instanceof C12960e) {
                            eVar = (C12960e) obj;
                        } else {
                            eVar = new C12960e();
                        }
                        eVar.f27554c = (long) ((Integer) this.f37320a.f37312a.get(i)).intValue();
                        eVar.f27555d = (long) ((Integer) this.f37320a.f37313b.get(i)).intValue();
                        a.f33105i = eVar;
                    }
                    C12534t a2 = aVar.mo30457a(a);
                    try {
                        if (a2 instanceof C12534t) {
                            Object obj2 = a2.f33301a.f33123f;
                            if (obj2 instanceof C12955b) {
                                ((C12955b) obj2).f27522y.put("retryCount", i);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return a2;
                } catch (Exception e) {
                    if (!this.f37320a.mo33882b() || !RetryInterceptManager.m41705a(e)) {
                        throw e;
                    }
                    i++;
                    if (i < this.f37320a.f37314c) {
                        StringBuilder sb = new StringBuilder("[intercept] retryNum: ");
                        sb.append(i);
                        C45771a.m143711d("RetryInterceptManager", sb.toString());
                    } else {
                        throw new RetryWrapException(e, i);
                    }
                }
            }
            throw e;
        }
    }

    public static class RetryWrapException extends Exception {

        /* renamed from: e */
        public final Exception f37321e;
        public final int retryCount;

        public RetryWrapException(Exception exc, int i) {
            this.f37321e = exc;
            this.retryCount = i;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo33882b() {
        return this.f37317g;
    }

    private RetryInterceptManager() {
    }

    /* renamed from: a */
    public static RetryInterceptManager m41704a() {
        if (f37311d == null) {
            synchronized (RetryInterceptManager.class) {
                if (f37311d == null) {
                    f37311d = new RetryInterceptManager();
                }
            }
        }
        return f37311d;
    }

    /* renamed from: a */
    public static boolean m41705a(Exception exc) {
        String message = exc.getMessage();
        if ("request canceled".equals(message) || "Canceled".equals(message) || "network not available".equals(message)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C12462c m41703a(C12470a aVar, int i) {
        C12462c a = aVar.mo30456a();
        Object obj = a.f33105i;
        if (obj instanceof C14125b) {
            List<Uri> list = ((C14125b) obj).f37323s;
            if (list != null && list.size() - 1 >= i) {
                Uri uri = (Uri) list.get(i);
                if (C13337d.m39034b(uri)) {
                    C12462c cVar = new C12462c(a.f33097a, uri.toString(), a.f33099c, a.f33100d, a.f33101e, a.f33102f, a.f33103g, a.f33104h, a.f33105i);
                    return cVar;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final <S> S mo33881a(String str, Class<S> cls) {
        List list;
        if (!mo33882b()) {
            C45771a.m143711d("RetryInterceptManager", "[getRetrofitService] is closed");
            return null;
        } else if (C6319n.m19593a(str)) {
            return null;
        } else {
            C12516p pVar = (C12516p) this.f37318h.get(str);
            if (pVar == null) {
                if (mo33882b()) {
                    list = this.f37319i;
                } else {
                    list = null;
                }
                pVar = RetrofitUtils.m37895a(str, list, null, null);
            }
            return RetrofitUtils.m37897a(pVar, cls);
        }
    }
}
