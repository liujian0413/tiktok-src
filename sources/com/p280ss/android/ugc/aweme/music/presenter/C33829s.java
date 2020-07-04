package com.p280ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43655e;
import com.p280ss.android.ugc.p1716b.p1718b.C43658b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.s */
public final class C33829s implements C43655e {

    /* renamed from: a */
    private C33804f f88220a;

    /* renamed from: b */
    private C33799a f88221b = new C33799a();

    /* renamed from: c */
    private List<MusicModel> f88222c = new ArrayList();

    /* renamed from: d */
    private String f88223d;

    /* renamed from: e */
    private C43656b f88224e = new C43656b();

    /* renamed from: f */
    private boolean f88225f;

    /* renamed from: b */
    public final void mo86443b() {
        this.f88220a = null;
        this.f88224e.mo105598a();
    }

    /* renamed from: a */
    public final boolean mo86442a() {
        return this.f88221b.f88178a;
    }

    /* renamed from: a */
    public final void mo86437a(String str) {
        mo86440a(str, false);
    }

    /* renamed from: a */
    public final void mo86436a(int i) {
        this.f88225f = false;
        if (this.f88220a != null) {
            this.f88220a.mo62011a(null, false);
        }
    }

    public C33829s(C33804f fVar) {
        this.f88220a = fVar;
        this.f88224e.mo105603a((C43655e) this);
        this.f88225f = false;
    }

    /* renamed from: a */
    private static List<MusicModel> m109007a(List<MusicModel> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (MusicModel musicModel : list) {
            if (!(musicModel == null || musicModel.getMusic() == null || !hashSet.add(musicModel.getMusic().getMid()))) {
                arrayList.add(musicModel);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo86438a(String str, String str2) {
        mo86439a(str, str2, false);
    }

    /* renamed from: a */
    public final void mo86440a(String str, boolean z) {
        if (!this.f88225f && this.f88221b.f88178a) {
            this.f88225f = true;
            this.f88224e.mo105607a(this.f88223d, this.f88221b.mo86416a(this.f88223d, true, str, z), true);
        }
    }

    /* renamed from: a */
    public final void mo86439a(String str, String str2, boolean z) {
        this.f88225f = true;
        this.f88224e.mo105607a(str, this.f88221b.mo86416a(str, false, str2, z), false);
        this.f88223d = str;
    }

    /* renamed from: a */
    public final synchronized void mo86441a(ArrayList<C43658b> arrayList, String str, int i, boolean z) {
        this.f88225f = false;
        ArrayList a = this.f88221b.mo86417a(str);
        if (!C6307b.m19566a((Collection<T>) a)) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                if (musicModel != null) {
                    musicModel.setSearchKeyWords(this.f88223d);
                }
            }
        }
        if (!z) {
            this.f88222c.clear();
        }
        if (a != null) {
            this.f88222c.addAll(a);
        }
        if (this.f88220a != null) {
            this.f88220a.mo62011a(m109007a(this.f88222c), z);
        }
    }
}
