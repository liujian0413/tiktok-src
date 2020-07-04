package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel */
public abstract class BaseMemberListViewModel<T> extends ListViewModel<T> {

    /* renamed from: j */
    public int f83142j;

    /* renamed from: k */
    public final C0052o<List<IMContact>> f83143k = new C0052o<>();

    /* renamed from: l */
    public final C0052o<List<IMContact>> f83144l = new C0052o<>();

    /* renamed from: m */
    public final C0052o<Pair<List<String>, List<Integer>>> f83145m = new C0052o<>();

    /* renamed from: n */
    public final C0052o<Integer> f83146n = new C0052o<>();

    /* renamed from: o */
    public final C0052o<Integer> f83147o = new C0052o<>();

    /* renamed from: p */
    public final C0052o<List<IMContact>> f83148p = new C0052o<>();

    /* renamed from: q */
    public final C0052o<String> f83149q = new C0052o<>();

    /* renamed from: a */
    public abstract void mo81882a();

    /* renamed from: a */
    public abstract void mo81883a(String str);

    public void onCleared() {
        super.onCleared();
    }

    /* renamed from: o */
    public final List<IMContact> mo82590o() {
        List<IMContact> list = (List) this.f83148p.getValue();
        if (list == null) {
            return C7525m.m23461a();
        }
        return list;
    }

    /* renamed from: q */
    public final String mo82592q() {
        String str = (String) this.f83149q.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: s */
    public final void mo82594s() {
        this.f83148p.postValue(C7525m.m23461a());
    }

    /* renamed from: m */
    public final boolean mo82588m() {
        Integer num = (Integer) this.f83146n.getValue();
        if (num != null && num.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo82589n() {
        Integer num = (Integer) this.f83147o.getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final int mo82591p() {
        List list = (List) this.f83148p.getValue();
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: r */
    public final void mo82593r() {
        int p = mo82591p();
        C0052o<List<IMContact>> oVar = this.f83148p;
        Iterable o = mo82590o();
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object next : o) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            boolean z = true;
            if (i >= p - 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
            i = i2;
        }
        oVar.postValue((List) arrayList);
    }

    /* renamed from: a */
    public final void mo82585a(int i) {
        this.f83146n.postValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo82587b(int i) {
        this.f83147o.postValue(Integer.valueOf(i));
        if (i == 0) {
            this.f83149q.postValue("");
        }
    }

    /* renamed from: a */
    public final void mo82586a(IMContact iMContact) {
        List list;
        C7573i.m23587b(iMContact, "contact");
        List list2 = (List) this.f83148p.getValue();
        if (list2 != null) {
            list = C7525m.m23509d((Collection<? extends T>) list2);
            if (list.contains(iMContact)) {
                list.remove(iMContact);
            } else {
                list.add(iMContact);
            }
        } else {
            list = Collections.singletonList(iMContact);
        }
        this.f83148p.postValue(list);
    }
}
