package com.p280ss.android.chooser;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Message;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.chooser.e */
public final class C19256e implements C6310a {

    /* renamed from: d */
    private static C19256e f52134d;

    /* renamed from: a */
    public Context f52135a;

    /* renamed from: b */
    public C6309f f52136b = new C6309f(this);

    /* renamed from: c */
    public final HashMap<String, C19262f> f52137c = new HashMap<>();

    /* renamed from: e */
    private C19250c f52138e = new C19250c(this.f52136b);

    /* renamed from: f */
    private boolean f52139f = false;

    /* renamed from: g */
    private final HashMap<Integer, List<C19262f>> f52140g = new HashMap<>();

    /* renamed from: h */
    private final List<C19262f> f52141h = new ArrayList();

    /* renamed from: i */
    private final Set<C19261d> f52142i = new HashSet();

    /* renamed from: j */
    private final Set<C19259b> f52143j = new HashSet();

    /* renamed from: k */
    private final Set<C19260c> f52144k = new HashSet();

    /* renamed from: com.ss.android.chooser.e$a */
    public interface C19258a {
        /* renamed from: a */
        ArrayList<C19262f> mo51088a(List<C19262f> list);
    }

    /* renamed from: com.ss.android.chooser.e$b */
    public interface C19259b {
        /* renamed from: a */
        void mo51060a(int i);
    }

    /* renamed from: com.ss.android.chooser.e$c */
    public interface C19260c {
        /* renamed from: a */
        void mo51049a(boolean z, List<C19262f> list);
    }

    /* renamed from: com.ss.android.chooser.e$d */
    public interface C19261d {
        /* renamed from: a */
        void mo51048a();
    }

    /* renamed from: a */
    public static C19256e m63104a() {
        return f52134d;
    }

    /* renamed from: a */
    public final void mo51078a(List<String> list) {
        if (!C6311g.m19573a(list)) {
            for (String str : list) {
                if (this.f52137c.containsKey(str)) {
                    C19262f fVar = (C19262f) this.f52137c.get(str);
                    if (!this.f52141h.contains(fVar)) {
                        this.f52141h.add(fVar);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final List<C19262f> mo51086e() {
        return new ArrayList(this.f52141h);
    }

    /* renamed from: f */
    public final int mo51087f() {
        return this.f52141h.size();
    }

    /* renamed from: c */
    public final void mo51084c() {
        this.f52139f = false;
        this.f52135a.getContentResolver().unregisterContentObserver(this.f52138e);
    }

    /* renamed from: d */
    public final void mo51085d() {
        this.f52141h.clear();
        m63109g();
    }

    /* renamed from: g */
    private void m63109g() {
        for (C19261d a : this.f52142i) {
            a.mo51048a();
        }
    }

    /* renamed from: h */
    private boolean m63110h() {
        int[] iArr = {1, 4, 3, 2};
        for (int i = 0; i < 4; i++) {
            if (!C6311g.m19573a(mo51071a(iArr[i]))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo51079b() {
        if (m63110h() && !this.f52139f) {
            this.f52139f = true;
            ContentResolver contentResolver = this.f52135a.getContentResolver();
            contentResolver.registerContentObserver(Media.EXTERNAL_CONTENT_URI, false, this.f52138e);
            contentResolver.registerContentObserver(Video.Media.EXTERNAL_CONTENT_URI, false, this.f52138e);
        }
    }

    /* renamed from: a */
    public final void mo51074a(C19259b bVar) {
        this.f52143j.add(bVar);
    }

    /* renamed from: b */
    public final void mo51080b(C19259b bVar) {
        this.f52143j.remove(bVar);
    }

    /* renamed from: b */
    public final void mo51081b(C19260c cVar) {
        this.f52144k.remove(cVar);
    }

    /* renamed from: a */
    public static synchronized void m63106a(Context context) {
        synchronized (C19256e.class) {
            if (f52134d == null) {
                f52134d = new C19256e(context);
            }
        }
    }

    /* renamed from: b */
    private void m63107b(int i) {
        for (C19259b a : this.f52143j) {
            a.mo51060a(i);
        }
    }

    /* renamed from: c */
    private void m63108c(C19262f fVar) {
        if (fVar != null) {
            String str = fVar.f52149b;
            if (!this.f52137c.containsKey(str)) {
                this.f52137c.put(str, fVar);
            }
        }
    }

    /* renamed from: a */
    public final List<C19262f> mo51071a(int i) {
        List list = (List) this.f52140g.get(Integer.valueOf(i));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    public final void handleMsg(Message message) {
        boolean z;
        if (10 == message.what) {
            z = true;
        } else {
            z = false;
        }
        List list = null;
        if (z) {
            list = (List) message.obj;
            m63105a(message.arg1, (Collection<? extends C19262f>) list);
            mo51079b();
        }
        for (C19260c a : this.f52144k) {
            a.mo51049a(z, list);
        }
    }

    private C19256e(Context context) {
        this.f52135a = context;
    }

    /* renamed from: b */
    public final void mo51082b(C19261d dVar) {
        this.f52142i.remove(dVar);
    }

    /* renamed from: b */
    public final void mo51083b(C19262f fVar) {
        if (fVar != null) {
            if (!this.f52141h.contains(fVar)) {
                this.f52141h.add(fVar);
            }
            m63109g();
        }
    }

    /* renamed from: a */
    public final void mo51075a(C19260c cVar) {
        this.f52144k.add(cVar);
    }

    /* renamed from: a */
    public final void mo51076a(C19261d dVar) {
        this.f52142i.add(dVar);
    }

    /* renamed from: a */
    public final void mo51077a(C19262f fVar) {
        if (fVar != null) {
            if (this.f52141h.contains(fVar)) {
                this.f52141h.remove(fVar);
            }
            m63109g();
        }
    }

    /* renamed from: a */
    public final void mo51073a(final int i, boolean z) {
        final int i2 = z ? 1 : 0;
        new C6304f("get image thread") {
            public final void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (1 == i) {
                        arrayList.addAll(C19255d.m63102a(C19256e.this.f52135a, true));
                    } else if (4 == i) {
                        arrayList.addAll(C19255d.m63103b(C19256e.this.f52135a));
                    } else if (3 == i) {
                        arrayList.addAll(C19255d.m63102a(C19256e.this.f52135a, false));
                    } else if (2 == i) {
                        arrayList.addAll(C19255d.m63101a(C19256e.this.f52135a));
                    } else if (i == 0) {
                        arrayList.addAll(C19255d.m63103b(C19256e.this.f52135a));
                        arrayList.addAll(C19255d.m63102a(C19256e.this.f52135a, true));
                        Collections.sort(arrayList);
                    }
                    Message obtainMessage = C19256e.this.f52136b.obtainMessage(10);
                    obtainMessage.arg1 = i;
                    obtainMessage.arg2 = i2;
                    obtainMessage.obj = arrayList;
                    obtainMessage.sendToTarget();
                } catch (Exception e) {
                    Message obtainMessage2 = C19256e.this.f52136b.obtainMessage(11);
                    obtainMessage2.arg2 = i2;
                    obtainMessage2.obj = e;
                    obtainMessage2.sendToTarget();
                }
            }
        }.start();
    }

    /* renamed from: a */
    private void m63105a(int i, Collection<? extends C19262f> collection) {
        if (collection != null) {
            List<C19262f> list = (List) this.f52140g.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.f52140g.put(Integer.valueOf(i), list);
            }
            for (C19262f fVar : list) {
                this.f52137c.remove(fVar.f52149b);
            }
            list.clear();
            for (C19262f c : collection) {
                m63108c(c);
            }
            list.addAll(collection);
            m63107b(i);
            Iterator it = this.f52141h.iterator();
            while (it.hasNext()) {
                if (!this.f52137c.containsKey(((C19262f) it.next()).f52149b)) {
                    it.remove();
                }
            }
            m63109g();
        }
    }

    /* renamed from: a */
    public final void mo51072a(int i, int i2, C19262f fVar) {
        List list = (List) this.f52140g.get(Integer.valueOf(i2));
        if (list == null) {
            list = new ArrayList();
            this.f52140g.put(Integer.valueOf(i2), list);
        }
        if (list.size() >= 0) {
            list.add(0, fVar);
        } else {
            list.add(fVar);
        }
        m63108c(fVar);
        m63107b(i2);
    }
}
