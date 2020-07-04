package com.bytedance.ies.geckoclient;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.wschannel.app.C9752a;
import com.bytedance.common.wschannel.event.C9818a;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.geckoclient.debug.C10860c;
import com.bytedance.ies.geckoclient.model.C10902c;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10904e;
import com.bytedance.ies.geckoclient.model.C10905f;
import com.bytedance.ies.geckoclient.model.C10906g;
import com.bytedance.ies.geckoclient.model.C10909j;
import com.bytedance.ies.geckoclient.model.C10913l;
import com.bytedance.ies.geckoclient.p567a.C10836a;
import com.bytedance.ies.geckoclient.p567a.C10839b;
import com.bytedance.ies.geckoclient.p568b.C10848b;
import com.bytedance.ies.geckoclient.p569c.C10850a;
import com.bytedance.ies.geckoclient.p570d.C10852a;
import com.bytedance.ies.geckoclient.p570d.C10853b;
import com.bytedance.ies.geckoclient.p570d.C10854c;
import com.bytedance.ies.geckoclient.p571e.C10862a;
import com.bytedance.ies.geckoclient.p571e.C10867d;
import com.bytedance.ies.geckoclient.p571e.C10871g;
import com.bytedance.ies.geckoclient.p572f.C10884a;
import com.bytedance.p505d.p506a.C10032b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.f */
public final class C10873f implements C9752a, C10886h, C10888j, C10889k {

    /* renamed from: i */
    public static Context f29407i;

    /* renamed from: a */
    public String f29408a;

    /* renamed from: b */
    public String f29409b;

    /* renamed from: c */
    public String f29410c;

    /* renamed from: d */
    public Map<String, C10903d> f29411d;

    /* renamed from: e */
    public List<C10887i> f29412e;

    /* renamed from: f */
    public Handler f29413f;

    /* renamed from: g */
    public C10890l f29414g;

    /* renamed from: h */
    public C10836a f29415h;

    /* renamed from: j */
    public C10852a f29416j;

    /* renamed from: k */
    public C10853b f29417k;

    /* renamed from: l */
    public C10884a f29418l;

    /* renamed from: m */
    public Map<String, String> f29419m;

    /* renamed from: n */
    private C10902c f29420n;

    /* renamed from: o */
    private Map<String, C10887i> f29421o;

    /* renamed from: p */
    private Executor f29422p;

    /* renamed from: q */
    private Map<String, C10850a> f29423q;

    /* renamed from: r */
    private boolean f29424r;

    /* renamed from: s */
    private Queue<C10844b> f29425s;

    /* renamed from: t */
    private Queue<String> f29426t;

    /* renamed from: u */
    private final int f29427u;

    /* renamed from: v */
    private final int f29428v;

    /* renamed from: w */
    private final int f29429w;

    /* renamed from: x */
    private final int f29430x;

    /* renamed from: y */
    private ConnectionState f29431y;

    /* renamed from: com.bytedance.ies.geckoclient.f$a */
    public static class C10883a {

        /* renamed from: a */
        private C10873f f29454a;

        /* renamed from: b */
        private String f29455b;

        /* renamed from: a */
        public final C10873f mo26257a() {
            C10914n.m32000a(C10873f.f29407i, "bspatch");
            this.f29454a.mo26232i();
            this.f29454a.mo26229f();
            this.f29454a.mo26230g();
            return this.f29454a;
        }

        /* renamed from: a */
        public final C10883a mo26251a(C10853b bVar) {
            this.f29454a.f29417k = bVar;
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26252a(C10884a aVar) {
            this.f29454a.f29418l = aVar;
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26250a(C10836a aVar) {
            this.f29454a.f29415h = aVar;
            if (aVar != null) {
                C10839b bVar = aVar.f29341b;
                Context context = C10873f.f29407i;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f29455b);
                sb.append("_");
                sb.append(this.f29454a.mo26222b());
                bVar.mo26170a(context, aVar, sb.toString(), this.f29454a.f29408a, this.f29454a.f29409b);
            }
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26253a(C10887i iVar) {
            this.f29454a.mo26207a(iVar);
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26254a(C10903d dVar) {
            this.f29454a.mo26208a(dVar);
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26255a(String str) {
            this.f29454a.f29416j.mo26178a(str);
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26256a(Map<String, String> map) {
            this.f29454a.f29419m = map;
            return this;
        }

        /* renamed from: a */
        public final C10883a mo26249a(long j, TimeUnit timeUnit) {
            C10852a.m31829a(60, timeUnit);
            return this;
        }

        /* renamed from: b */
        public final C10883a mo26258b(long j, TimeUnit timeUnit) {
            C10852a.m31830b(60, timeUnit);
            return this;
        }

        public C10883a(String str, Context context, String str2, String str3, String str4, String str5, int i) {
            this.f29455b = str2;
            C10873f fVar = new C10873f(str, str2, context, new C10902c(str3, str4, str5, i));
            this.f29454a = fVar;
        }
    }

    /* renamed from: a */
    public static void m31901a() {
        C10861e.m31868a();
    }

    /* renamed from: e */
    public static Context m31911e() {
        return f29407i;
    }

    /* renamed from: a */
    public final boolean mo26221a(String str, C10850a aVar) {
        return mo26220a(str, 5000, aVar);
    }

    /* renamed from: a */
    public final boolean mo26220a(String str, int i, C10850a aVar) {
        return m31907a(str, i, aVar, null);
    }

    /* renamed from: a */
    public final void mo26214a(String str, C10887i iVar) {
        this.f29421o.remove(str);
        this.f29423q.remove(str);
        this.f29412e.remove(iVar);
    }

    /* renamed from: a */
    public final void mo26219a(String... strArr) {
        m31904a(null, strArr);
    }

    /* renamed from: a */
    public final C10903d mo26209a(String str) {
        return (C10903d) this.f29411d.get(str);
    }

    /* renamed from: a */
    public final C10873f mo26208a(C10903d dVar) {
        return m31900a(dVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10873f mo26207a(C10887i iVar) {
        this.f29412e.add(iVar);
        return this;
    }

    /* renamed from: a */
    public final void mo26213a(final String str, C10862a<Boolean> aVar) {
        this.f29422p.execute(new Runnable(null) {
            public final void run() {
                final boolean a = C10873f.this.f29414g.mo26268a(C10873f.this.f29409b, str);
                if (a && C10873f.this.f29411d != null && C10873f.this.f29411d.containsKey(str)) {
                    ((C10903d) C10873f.this.f29411d.get(str)).f29506a = 0;
                }
                C10873f.this.f29413f.post(new Runnable() {
                    public final void run() {
                        if (null != null) {
                            Boolean.valueOf(a);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void mo26215a(final List<C10903d> list, final List<C10909j> list2, boolean z) {
        new StringBuilder("on check update done:").append(list2.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                String str = ((C10903d) it.next()).f29508c;
                if (list2.size() == 0) {
                    if (this.f29423q.containsKey(str)) {
                        ((C10850a) this.f29423q.get(str)).mo26174a();
                        mo26214a(str, (C10887i) this.f29421o.get(str));
                    }
                    return;
                }
                for (C10909j jVar : list2) {
                    if (TextUtils.equals(str, jVar.f29541b)) {
                        i = 1;
                    }
                }
                if (i == 0 && this.f29423q.containsKey(str)) {
                    ((C10850a) this.f29423q.get(str)).mo26174a();
                    mo26214a(str, (C10887i) this.f29421o.get(str));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                while (i < list2.size()) {
                    C10909j jVar2 = (C10909j) list2.get(i);
                    C10903d dVar = (C10903d) this.f29411d.get(jVar2.f29541b);
                    if (dVar != null) {
                        dVar.mo26307a(jVar2);
                    }
                    if (jVar2.mo26309a() != null) {
                        if (jVar2.mo26311c().f29538b) {
                            this.f29414g.mo26268a(this.f29409b, jVar2.f29541b);
                        }
                        C10917q qVar = new C10917q(this.f29416j, dVar, this.f29409b, z, this);
                        arrayList.add(qVar);
                    }
                    i++;
                }
                this.f29422p.execute(new C10918r(this.f29416j, arrayList, this));
                this.f29413f.post(new Runnable() {
                    public final void run() {
                        if (!C10873f.m31908a(C10873f.this.f29412e)) {
                            for (C10887i a : C10873f.this.f29412e) {
                                a.mo26238a(list, list2);
                            }
                        }
                    }
                });
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo26212a(final Exception exc) {
        this.f29413f.post(new Runnable() {
            public final void run() {
                if (!C10873f.m31908a(C10873f.this.f29412e)) {
                    ArrayList arrayList = new ArrayList(C10873f.this.f29411d.values());
                    for (C10887i a : C10873f.this.f29412e) {
                        a.mo26237a((List<C10903d>) arrayList, exc);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo26216a(boolean z, int i, C10903d dVar) {
        this.f29414g.mo26263a(i, dVar);
        if (i == 1 && !m31908a(this.f29412e)) {
            for (C10887i a : this.f29412e) {
                a.mo26236a(dVar, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo26217a(boolean z, int i, C10903d dVar, C10909j jVar) {
        Message obtain = Message.obtain();
        dVar.f29516k = null;
        obtain.obj = dVar;
        if (z) {
            obtain.arg2 = jVar.mo26310b().f29549a;
        } else {
            obtain.arg2 = jVar.mo26309a().f29549a;
        }
        if (i != 5) {
            switch (i) {
                case 1:
                    obtain.what = 2;
                    if (z) {
                        obtain.arg1 = 100;
                    } else {
                        obtain.arg1 = 0;
                    }
                    this.f29413f.sendMessage(obtain);
                    return;
                case 2:
                    break;
            }
        }
        if (z) {
            obtain.arg1 = 102;
        } else {
            obtain.arg1 = 2;
        }
        obtain.what = 3;
        this.f29413f.sendMessage(obtain);
    }

    /* renamed from: a */
    public final void mo26218a(boolean z, int i, C10903d dVar, C10909j jVar, Exception exc, int i2) {
        Message obtain = Message.obtain();
        if (z) {
            obtain.arg2 = jVar.mo26310b().f29549a;
        } else {
            if (jVar.mo26311c().f29537a) {
                this.f29414g.mo26268a(this.f29409b, jVar.f29541b);
            }
            obtain.arg2 = jVar.mo26309a().f29549a;
        }
        switch (i) {
            case 1:
                obtain.what = 2;
                if (z) {
                    obtain.arg1 = BaseNotice.HASHTAG;
                } else {
                    obtain.arg1 = 1;
                }
                dVar.f29516k = exc;
                dVar.f29517l = i2;
                obtain.obj = dVar;
                this.f29413f.sendMessage(obtain);
                return;
            case 2:
                obtain.what = 3;
                if (z) {
                    obtain.arg1 = 103;
                } else {
                    obtain.arg1 = 3;
                }
                dVar.f29516k = exc;
                dVar.f29517l = i2;
                obtain.obj = dVar;
                this.f29413f.sendMessage(obtain);
                break;
        }
    }

    /* renamed from: a */
    public final void mo26210a(Message message) {
        int i = message.what;
        if (i != 0) {
            switch (i) {
                case 2:
                    C10903d dVar = (C10903d) message.obj;
                    Exception exc = dVar.f29516k;
                    dVar.f29516k = null;
                    if (!m31908a(this.f29412e) && !m31908a(this.f29412e)) {
                        for (C10887i iVar : this.f29412e) {
                            if (message.obj instanceof C10903d) {
                                if (exc != null) {
                                    iVar.mo26235a(message.arg2, dVar, exc);
                                } else {
                                    iVar.mo26234a(message.arg2, dVar);
                                }
                            }
                        }
                        return;
                    }
                case 3:
                    C10903d dVar2 = (C10903d) message.obj;
                    Exception exc2 = dVar2.f29516k;
                    dVar2.f29516k = null;
                    if (!m31908a(this.f29412e) && (message.obj instanceof C10903d)) {
                        C10903d dVar3 = (C10903d) message.obj;
                        for (C10887i iVar2 : this.f29412e) {
                            if (exc2 != null) {
                                iVar2.mo26240b(message.arg2, dVar3, exc2);
                            } else {
                                iVar2.mo26239b(message.arg2, dVar3);
                            }
                        }
                        break;
                    }
            }
        } else {
            if (!this.f29425s.isEmpty()) {
                while (this.f29425s.peek() != null) {
                    this.f29422p.execute((Runnable) this.f29425s.poll());
                }
            }
            if (!m31908a(this.f29412e)) {
                Iterator it = this.f29412e.iterator();
                while (it.hasNext()) {
                    it.next();
                    m31913k();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26211a(C10913l lVar) {
        if (C10871g.m31896b(lVar.f29557a)) {
            final C10905f b = m31909b(lVar);
            this.f29422p.execute(new Runnable() {
                public final void run() {
                    try {
                        C10873f.this.f29416j.mo26177a(b);
                    } catch (Exception unused) {
                    }
                }
            });
            m31902a(C10848b.m31813a().f29368a.mo15979b((Object) b), 1000);
        }
    }

    /* renamed from: a */
    public final void mo24156a(C9818a aVar, JSONObject jSONObject) {
        if (this.f29431y != aVar.f26734b && aVar.f26734b == ConnectionState.CONNECTED) {
            mo26233j();
        }
    }

    /* renamed from: a */
    public final void mo24157a(WsChannelMsg wsChannelMsg) {
        int b = this.f29418l.mo26262b();
        if (wsChannelMsg != null && wsChannelMsg.f26776k == b && C10871g.m31895a(wsChannelMsg.f26769d)) {
            mo26211a(new C10913l(wsChannelMsg.f26770e, new String(wsChannelMsg.mo24357a())));
        }
    }

    /* renamed from: b */
    public final String mo26222b() {
        return this.f29420n.f29502a;
    }

    /* renamed from: c */
    public final String mo26225c() {
        return this.f29420n.f29503b;
    }

    /* renamed from: d */
    public final String mo26227d() {
        return this.f29420n.f29504c;
    }

    /* renamed from: k */
    private List<C10903d> m31913k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f29411d.values());
        return arrayList;
    }

    /* renamed from: h */
    public final void mo26231h() {
        this.f29424r = true;
        Message obtain = Message.obtain();
        obtain.what = 0;
        this.f29413f.sendMessage(obtain);
    }

    /* renamed from: i */
    public final void mo26232i() {
        if (this.f29417k == null) {
            C10854c.m31838a();
        } else {
            C10854c.m31839a(this.f29417k);
        }
    }

    /* renamed from: f */
    public final void mo26229f() {
        if (!this.f29411d.isEmpty()) {
            this.f29422p.execute(new C10891m(this.f29414g, this.f29411d, this));
            return;
        }
        mo26231h();
    }

    /* renamed from: g */
    public final void mo26230g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo26222b());
        m31902a(C10848b.m31813a().f29368a.mo15979b((Object) new C10906g(arrayList, 0, 1)), 100);
    }

    /* renamed from: j */
    public final void mo26233j() {
        while (this.f29426t.size() > 0 && this.f29418l != null && this.f29418l.mo26260a()) {
            m31902a((String) this.f29426t.poll(), 1000);
        }
    }

    /* renamed from: c */
    public final boolean mo26226c(String str) {
        return this.f29414g.mo26268a(this.f29409b, str);
    }

    /* renamed from: e */
    public final boolean mo26228e(String str) {
        if (this.f29418l == null || this.f29418l.mo26261a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m31910d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("gecko_activate_done");
        return new File(sb2.toString()).exists();
    }

    /* renamed from: b */
    public final void mo26223b(C10903d dVar) {
        if (dVar != null) {
            new StringBuilder("update done:").append(dVar.f29508c);
            if (dVar.f29514i) {
                this.f29414g.mo26269b(dVar);
            } else {
                this.f29414g.mo26264a(dVar);
            }
            if (this.f29415h != null) {
                this.f29415h.f29341b.mo26171a(dVar.f29508c);
            }
        }
    }

    /* renamed from: f */
    private static void m31912f(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("invalid gecko dir:");
            sb.append(str);
            sb.append(", can't create directory at this path");
            throw new IllegalArgumentException(sb.toString());
        } else if (!file.isDirectory()) {
            StringBuilder sb2 = new StringBuilder("invalid gecko dir:");
            sb2.append(str);
            sb2.append(" is not a directory");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final boolean mo26224b(String str) {
        C10903d dVar = (C10903d) this.f29411d.get(str);
        if (dVar == null) {
            return false;
        }
        String str2 = dVar.f29509d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29409b);
        sb.append(str2);
        return new File(sb.toString()).exists();
    }

    /* renamed from: b */
    private C10905f m31909b(C10913l lVar) {
        C10905f fVar = new C10905f(null);
        fVar.f29526d = 1000;
        try {
            C10904e eVar = (C10904e) C10848b.m31813a().f29368a.mo15974a(lVar.f29558b, C10904e.class);
            if (eVar == null) {
                return fVar;
            }
            fVar.f29523a = eVar.f29522e;
            fVar.f29531i = 2;
            fVar.f29524b = this.f29420n.f29504c;
            fVar.f29525c = 0;
            fVar.f29527e = this.f29420n.f29503b;
            fVar.f29529g = String.valueOf(C10867d.m31885c(f29407i));
            fVar.f29530h = C10867d.m31880a();
            List<String> list = eVar.f29519b;
            if (list == null || list.size() == 0) {
                return fVar;
            }
            switch (lVar.f29557a) {
                case 1:
                    if (list.size() != 1 || !"*".equals(list.get(0))) {
                        m31906a(true, (String[]) list.toArray(new String[0]));
                    } else {
                        m31906a(true, new String[0]);
                    }
                    fVar.f29526d = 1000;
                    break;
                case 2:
                    for (final String str : eVar.f29519b) {
                        this.f29422p.execute(new Runnable() {
                            public final void run() {
                                C10873f.this.mo26226c(str);
                            }
                        });
                    }
                    fVar.f29526d = 1000;
                    break;
            }
            return fVar;
        } catch (Exception unused) {
            return fVar;
        }
    }

    /* renamed from: a */
    public static boolean m31908a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m31904a(Map<String, Object> map, String... strArr) {
        m31905a(false, map, strArr);
    }

    /* renamed from: a */
    private void m31906a(boolean z, String... strArr) {
        m31905a(true, null, strArr);
    }

    /* renamed from: a */
    private C10873f m31900a(C10903d dVar, boolean z) {
        if (dVar != null && !this.f29411d.containsKey(dVar.f29508c)) {
            this.f29411d.put(dVar.f29508c, dVar);
        }
        return this;
    }

    /* renamed from: a */
    private void m31902a(String str, int i) {
        if (this.f29418l == null || !this.f29418l.mo26260a()) {
            if (this.f29426t.size() < 10) {
                this.f29426t.add(str);
            }
            return;
        }
        this.f29418l.mo26259a(str, i);
    }

    /* renamed from: a */
    private void m31903a(String str, String str2) {
        this.f29408a = str;
        if (this.f29408a.charAt(this.f29408a.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29408a);
            sb.append('/');
            this.f29408a = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29408a);
        sb2.append(str2);
        sb2.append('/');
        this.f29409b = sb2.toString();
        m31912f(this.f29409b);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29409b);
        sb3.append(".inactive/");
        this.f29410c = sb3.toString();
        m31912f(this.f29410c);
    }

    /* renamed from: a */
    private void m31905a(boolean z, Map<String, Object> map, String... strArr) {
        String[] strArr2 = strArr;
        ArrayList arrayList = new ArrayList();
        if (strArr2 == null || strArr2.length == 0) {
            for (Entry entry : this.f29411d.entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(entry.getValue());
                }
            }
        } else {
            for (int i = 0; i < strArr2.length; i++) {
                if (this.f29411d.get(strArr2[i]) != null) {
                    arrayList.add(this.f29411d.get(strArr2[i]));
                }
            }
        }
        if (arrayList.size() != 0) {
            C10844b bVar = new C10844b(f29407i, this, this.f29416j, arrayList, this.f29414g, this.f29420n, z, this, this.f29410c, this.f29409b, this.f29419m, map);
            if (!this.f29424r) {
                this.f29425s.add(bVar);
            } else {
                this.f29422p.execute(bVar);
            }
        }
    }

    private C10873f(String str, String str2, Context context, C10902c cVar) {
        this.f29411d = new ConcurrentHashMap();
        this.f29412e = new CopyOnWriteArrayList();
        this.f29421o = new HashMap();
        this.f29422p = C10885g.m31964a(3);
        this.f29423q = new HashMap();
        this.f29425s = new LinkedBlockingQueue();
        this.f29426t = new LinkedBlockingQueue();
        this.f29427u = 0;
        this.f29428v = 2;
        this.f29429w = 3;
        this.f29430x = 4;
        this.f29431y = null;
        this.f29420n = cVar;
        if (!TextUtils.isEmpty(str)) {
            m31903a(str, cVar.f29502a);
            this.f29413f = new Handler(Looper.getMainLooper()) {
                public final void handleMessage(Message message) {
                    C10873f.this.mo26210a(message);
                }
            };
            this.f29416j = new C10852a(cVar);
            f29407i = context;
            C10032b a = C10032b.m29806a(context);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_");
            sb.append(mo26222b());
            a.mo24663a(sb.toString(), this.f29408a, this.f29409b);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("_");
            sb2.append(mo26222b());
            this.f29414g = new C10890l(context, sb2.toString(), this.f29408a, this.f29409b);
            C10860c.m31867a(this);
            return;
        }
        StringBuilder sb3 = new StringBuilder("invalid gecko dir:");
        sb3.append(str);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private boolean m31907a(final String str, int i, final C10850a aVar, Map<String, Object> map) {
        if (this.f29421o.containsKey(str)) {
            aVar.mo26175a("", null);
            return false;
        }
        if (!this.f29411d.containsKey(str)) {
            mo26208a(new C10903d(str));
        }
        final C108741 r8 = new C10887i() {
            /* renamed from: a */
            public final void mo26234a(int i, C10903d dVar) {
            }

            /* renamed from: a */
            public final void mo26236a(C10903d dVar, boolean z) {
            }

            /* renamed from: a */
            public final void mo26238a(List<C10903d> list, List<C10909j> list2) {
            }

            /* renamed from: b */
            public final void mo26239b(int i, C10903d dVar) {
                aVar.mo26174a();
                C10873f.this.mo26214a(str, (C10887i) this);
            }

            /* renamed from: a */
            public final void mo26237a(List<C10903d> list, Exception exc) {
                aVar.mo26175a("onCheckServerVersionFail", exc);
                C10873f.this.mo26214a(str, (C10887i) this);
            }

            /* renamed from: a */
            public final void mo26235a(int i, C10903d dVar, Exception exc) {
                aVar.mo26175a("onDownloadPackageFail", exc);
                C10873f.this.mo26214a(str, (C10887i) this);
            }

            /* renamed from: b */
            public final void mo26240b(int i, C10903d dVar, Exception exc) {
                aVar.mo26175a("onActivatePackageFail", exc);
                C10873f.this.mo26214a(str, (C10887i) this);
            }
        };
        this.f29412e.add(r8);
        this.f29421o.put(str, r8);
        this.f29423q.put(str, aVar);
        m31904a(null, str);
        if (i > 0 && i <= 10000) {
            this.f29413f.postDelayed(new Runnable() {
                public final void run() {
                    if (C10873f.this.f29412e.contains(r8)) {
                        aVar.mo26175a("timeout", null);
                        C10873f.this.mo26214a(str, r8);
                    }
                }
            }, (long) i);
        }
        return true;
    }

    /* renamed from: a */
    public static C10883a m31899a(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("empty access key or app version");
        }
        C10883a aVar = new C10883a(str4, context, str5, str, str2, str3, 1233);
        return aVar;
    }
}
