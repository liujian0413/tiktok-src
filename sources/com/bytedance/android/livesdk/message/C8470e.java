package com.bytedance.android.livesdk.message;

import android.os.Message;
import com.bytedance.android.livesdk.message.model.C8488an;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.e */
public class C8470e implements C9302a {

    /* renamed from: a */
    private static C8470e f23174a;

    /* renamed from: b */
    private final List<LinkedList<C8455b>> f23175b = new ArrayList();

    /* renamed from: c */
    private List<Long> f23176c;

    /* renamed from: d */
    private int f23177d = -1;

    /* renamed from: e */
    private final LinkedList<C8455b> f23178e = new LinkedList<>();

    /* renamed from: f */
    private final List<C8468c> f23179f = new ArrayList();

    /* renamed from: g */
    private boolean f23180g;

    /* renamed from: h */
    private C9301a f23181h = new C9301a(this);

    /* renamed from: a */
    public static C8470e m25735a() {
        if (f23174a == null) {
            synchronized (C8470e.class) {
                if (f23174a == null) {
                    f23174a = new C8470e();
                }
            }
        }
        return f23174a;
    }

    /* renamed from: c */
    public final void mo21646c() {
        for (LinkedList linkedList : this.f23175b) {
            if (!C6311g.m19573a(linkedList)) {
                linkedList.clear();
            }
        }
        this.f23180g = false;
    }

    private C8470e() {
    }

    /* renamed from: b */
    public final void mo21644b() {
        do {
            this.f23181h.removeMessages(0);
            C8455b bVar = null;
            this.f23180g = false;
            if (this.f23178e.isEmpty()) {
                Iterator it = this.f23175b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LinkedList linkedList = (LinkedList) it.next();
                    if (!linkedList.isEmpty()) {
                        bVar = (C8455b) linkedList.poll();
                        break;
                    }
                }
            } else {
                bVar = (C8455b) this.f23178e.poll();
            }
            if (bVar != null) {
                Iterator it2 = this.f23179f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C8468c) it2.next()).mo14038a(bVar)) {
                            this.f23180g = true;
                            this.f23181h.sendEmptyMessageDelayed(0, 30000);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!this.f23180g);
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 0) {
            mo21644b();
        }
    }

    /* renamed from: a */
    public final void mo21643a(C8468c cVar) {
        if (!this.f23179f.contains(cVar)) {
            this.f23179f.add(cVar);
        }
    }

    /* renamed from: b */
    public final void mo21645b(C8468c cVar) {
        this.f23179f.remove(cVar);
        if (this.f23179f.isEmpty()) {
            this.f23176c = null;
            this.f23175b.clear();
            this.f23177d = -1;
            this.f23178e.clear();
            this.f23180g = false;
        }
    }

    /* renamed from: a */
    private void m25736a(List<Long> list) {
        if (C6311g.m19573a(this.f23175b) && !C6311g.m19573a(list)) {
            this.f23176c = list;
            for (int i = 0; i < this.f23176c.size(); i++) {
                if (i >= this.f23175b.size()) {
                    this.f23175b.add(new LinkedList());
                } else {
                    LinkedList linkedList = (LinkedList) this.f23175b.get(i);
                    int longValue = (int) ((Long) this.f23176c.get(i)).longValue();
                    if (longValue != -1) {
                        if (longValue < -1) {
                            longValue = C34943c.f91127w;
                        }
                        if (linkedList.size() >= longValue) {
                            for (int size = (linkedList.size() - longValue) + 1; size > 0; size--) {
                                linkedList.remove();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21642a(C8455b bVar) {
        if (bVar != null) {
            C8488an a = bVar.mo21628a();
            if (bVar.mo21629b()) {
                if (this.f23177d < 0 || this.f23177d >= this.f23175b.size()) {
                    this.f23178e.add(bVar);
                } else {
                    ((LinkedList) this.f23175b.get(this.f23177d)).add(bVar);
                }
            } else if (a != null) {
                m25736a(a.f23249a);
                int i = a.f23251c;
                this.f23177d = (int) a.f23250b;
                if (i >= this.f23175b.size() || i < 0) {
                    this.f23178e.add(bVar);
                } else {
                    LinkedList linkedList = (LinkedList) this.f23175b.get(i);
                    linkedList.add(bVar);
                    long longValue = ((Long) this.f23176c.get(i)).longValue();
                    if ((((long) linkedList.size()) > longValue && longValue >= 0) || (longValue < -1 && linkedList.size() > 200)) {
                        linkedList.remove();
                    }
                }
            } else {
                this.f23178e.add(bVar);
            }
            if (!this.f23180g) {
                mo21644b();
            }
        }
    }
}
