package com.p280ss.android.ugc.aweme.mediachoose.p1390a;

import android.content.Context;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.mediachoose.C33176h;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.d */
public final class C33153d implements C6310a {

    /* renamed from: b */
    private static C33153d f86291b;

    /* renamed from: a */
    public final HashMap<String, MediaModel> f86292a = new HashMap<>();

    /* renamed from: c */
    private Context f86293c;

    /* renamed from: d */
    private final HashMap<Integer, List<MediaModel>> f86294d = new HashMap<>();

    /* renamed from: e */
    private final List<MediaModel> f86295e = new ArrayList();

    /* renamed from: f */
    private final Set<C33156c> f86296f = new HashSet();

    /* renamed from: g */
    private final Set<C33154a> f86297g = new HashSet();

    /* renamed from: h */
    private final Set<C33155b> f86298h = new HashSet();

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.d$a */
    public interface C33154a {
        /* renamed from: a */
        void mo84854a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.d$b */
    public interface C33155b {
        /* renamed from: a */
        void mo84890a(boolean z, int i, List<MediaModel> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.d$c */
    public interface C33156c {
        /* renamed from: a */
        void mo84870a();
    }

    /* renamed from: a */
    public static C33153d m106972a() {
        return f86291b;
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo84904a(C33156c cVar) {
        this.f86296f.add(cVar);
    }

    /* renamed from: a */
    public final void mo84903a(C33155b bVar) {
        this.f86298h.add(bVar);
    }

    /* renamed from: a */
    public final void mo84905a(MediaModel mediaModel) {
        if (mediaModel != null) {
            if (!this.f86295e.contains(mediaModel)) {
                this.f86295e.add(mediaModel);
            }
            m106978d();
        }
    }

    /* renamed from: c */
    public final List<MediaModel> mo84910c() {
        return new ArrayList(this.f86295e);
    }

    /* renamed from: b */
    public final void mo84906b() {
        this.f86295e.clear();
        m106978d();
    }

    /* renamed from: d */
    private void m106978d() {
        for (C33156c a : this.f86296f) {
            a.mo84870a();
        }
    }

    /* renamed from: a */
    public final void mo84902a(C33154a aVar) {
        this.f86297g.add(aVar);
    }

    /* renamed from: b */
    public final void mo84907b(C33154a aVar) {
        this.f86297g.remove(aVar);
    }

    /* renamed from: b */
    private void m106976b(int i) {
        for (C33154a a : this.f86297g) {
            a.mo84854a(i);
        }
    }

    private C33153d(Context context) {
        this.f86293c = context;
    }

    /* renamed from: a */
    public static synchronized void m106975a(Context context) {
        synchronized (C33153d.class) {
            if (f86291b == null) {
                f86291b = new C33153d(context);
            }
        }
    }

    /* renamed from: b */
    private void m106977b(MediaModel mediaModel) {
        if (mediaModel != null) {
            String str = mediaModel.f88156b;
            if (!this.f86292a.containsKey(str)) {
                this.f86292a.put(str, mediaModel);
            }
        }
    }

    /* renamed from: b */
    public final void mo84908b(C33155b bVar) {
        this.f86298h.remove(bVar);
    }

    /* renamed from: b */
    public final void mo84909b(C33156c cVar) {
        this.f86296f.remove(cVar);
    }

    /* renamed from: a */
    public final List<MediaModel> mo84898a(int i) {
        List list = (List) this.f86294d.get(Integer.valueOf(i));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo84901a(int i, boolean z) {
        m106973a(4, 0, -1, -1, null);
    }

    /* renamed from: a */
    private void m106974a(int i, int i2, Collection<? extends MediaModel> collection) {
        if (collection != null) {
            List<MediaModel> list = (List) this.f86294d.get(Integer.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                this.f86294d.put(Integer.valueOf(i), list);
            }
            for (MediaModel mediaModel : list) {
                this.f86292a.remove(mediaModel.f88156b);
            }
            list.clear();
            for (MediaModel b : collection) {
                m106977b(b);
            }
            list.addAll(collection);
            if (i2 == 1) {
                m106976b(i);
            }
            Iterator it = this.f86295e.iterator();
            while (it.hasNext()) {
                if (!this.f86292a.containsKey(((MediaModel) it.next()).f88156b)) {
                    it.remove();
                }
            }
            m106978d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ List mo84899a(int i, int i2, int i3) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (1 == i) {
            arrayList.addAll(C33152c.m106970a(this.f86293c, true, i2, i3));
        } else if (4 == i) {
            arrayList.addAll(C33152c.m106971b(this.f86293c, i2, i3));
        } else if (3 == i) {
            arrayList.addAll(C33152c.m106970a(this.f86293c, false, i2, i3));
        } else if (2 == i) {
            arrayList.addAll(C33152c.m106969a(this.f86293c, i2, i3));
        } else if (i == 0) {
            arrayList.addAll(C33152c.m106971b(this.f86293c, i2, i3));
            arrayList.addAll(C33152c.m106970a(this.f86293c, true, i2, i3));
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo84900a(int i, int i2, int i3, C33176h hVar) {
        m106973a(i, 2, i2, i3, hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo84897a(int i, int i2, C33176h hVar, C1592h hVar2) throws Exception {
        if (hVar2.mo6887c() || hVar2.mo6889d()) {
            if (i == 0) {
                for (C33155b a : this.f86298h) {
                    a.mo84890a(false, i2, null);
                }
            } else if (i == 2 && hVar != null) {
                hVar.mo84918a(false, i2, null);
            }
            return null;
        }
        if (i != 2) {
            m106974a(i2, i, (Collection) hVar2.mo6890e());
            if (i == 0) {
                for (C33155b a2 : this.f86298h) {
                    a2.mo84890a(true, i2, (List) hVar2.mo6890e());
                }
            }
        } else if (hVar != null) {
            hVar.mo84918a(true, i2, (List) hVar2.mo6890e());
        }
        return null;
    }

    /* renamed from: a */
    private void m106973a(int i, int i2, int i3, int i4, C33176h hVar) {
        C1592h.m7853a((Callable<TResult>) new C33157e<TResult>(this, i, i3, i4)).mo6876a((C1591g<TResult, TContinuationResult>) new C33158f<TResult,TContinuationResult>(this, i2, i, hVar), C1592h.f5958b);
    }
}
