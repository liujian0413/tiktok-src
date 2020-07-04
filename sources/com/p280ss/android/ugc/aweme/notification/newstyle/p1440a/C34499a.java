package com.p280ss.android.ugc.aweme.notification.newstyle.p1440a;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34555b;
import com.p280ss.android.ugc.aweme.notification.p1432a.C34381a;
import com.p280ss.android.ugc.aweme.notification.p1432a.C34382b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.a */
public final class C34499a extends C25652b<C34555b, C25675c<User>> {
    /* renamed from: j */
    private final boolean m111539j() {
        if (this.f67571b == null || this.f67572c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo87805f() {
        C34555b bVar = (C34555b) this.f67571b;
        if (bVar != null) {
            bVar.mo87857a();
        }
        mo57293S_();
    }

    /* renamed from: g */
    public final void mo87806g() {
        C34555b bVar = (C34555b) this.f67571b;
        if (bVar != null) {
            bVar.mo87859b();
        }
        mo57293S_();
    }

    /* renamed from: k */
    private boolean m111540k() {
        C34555b bVar = (C34555b) this.f67571b;
        if (bVar != null) {
            C34382b bVar2 = (C34382b) bVar.getData();
            if (bVar2 != null && bVar2.f89643a == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        if (m111539j()) {
            if (((C34555b) this.f67571b).f90145a) {
                ((C25675c) this.f67572c).aD_();
            } else {
                ((C25675c) this.f67572c).mo59098S_();
            }
        }
    }

    /* renamed from: e */
    public final int mo87804e() {
        C34555b bVar = (C34555b) this.f67571b;
        if (bVar != null) {
            C34382b bVar2 = (C34382b) bVar.getData();
            if (bVar2 != null) {
                return bVar2.f89647e;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo56977b() {
        List list;
        List list2;
        boolean z;
        if (m111539j()) {
            boolean z2 = false;
            if (((C34555b) this.f67571b).f90145a) {
                C25675c cVar = (C25675c) this.f67572c;
                C25640a aVar = this.f67571b;
                C7573i.m23582a((Object) aVar, "mModel");
                List<C34381a> list3 = ((C34382b) ((C34555b) aVar).getData()).f89648f;
                if (list3 != null) {
                    Iterable<C34381a> iterable = list3;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (C34381a aVar2 : iterable) {
                        arrayList.add(aVar2.f89641a);
                    }
                    list2 = (List) arrayList;
                } else {
                    list2 = C7525m.m23461a();
                }
                if (m111540k()) {
                    C25640a aVar3 = this.f67571b;
                    C7573i.m23582a((Object) aVar3, "mModel");
                    Collection collection = ((C34382b) ((C34555b) aVar3).getData()).f89648f;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = true;
                    }
                }
                cVar.mo59108b(list2, z2);
                return;
            }
            C25640a aVar4 = this.f67571b;
            C7573i.m23582a((Object) aVar4, "mModel");
            Collection collection2 = ((C34382b) ((C34555b) aVar4).getData()).f89648f;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            }
            if (z2) {
                ((C25675c) this.f67572c).ae_();
                return;
            }
            C25675c cVar2 = (C25675c) this.f67572c;
            C25640a aVar5 = this.f67571b;
            C7573i.m23582a((Object) aVar5, "mModel");
            List<C34381a> list4 = ((C34382b) ((C34555b) aVar5).getData()).f89648f;
            if (list4 != null) {
                Iterable<C34381a> iterable2 = list4;
                Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
                for (C34381a aVar6 : iterable2) {
                    arrayList2.add(aVar6.f89641a);
                }
                list = (List) arrayList2;
            } else {
                list = C7525m.m23461a();
            }
            cVar2.mo59099a(list, m111540k());
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (m111539j()) {
            if (((C34555b) this.f67571b).f90145a) {
                ((C25675c) this.f67572c).mo59107b(exc);
            } else {
                ((C25675c) this.f67572c).mo59105a_(exc);
            }
        }
    }
}
