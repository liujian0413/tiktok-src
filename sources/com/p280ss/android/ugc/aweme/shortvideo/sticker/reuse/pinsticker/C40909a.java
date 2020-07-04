package com.p280ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.a */
public final class C40909a {

    /* renamed from: a */
    public static final C40909a f106390a = new C40909a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.reuse.pinsticker.a$a */
    public static final class C40910a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((C40912c) t2).f106395c), Integer.valueOf(((C40912c) t).f106395c));
        }
    }

    private C40909a() {
    }

    /* renamed from: a */
    public static int m130717a(PinType pinType) {
        C7573i.m23587b(pinType, "type");
        if (C35574k.m114859a().mo70072F().mo83153b()) {
            switch (C40911b.f106391a[pinType.ordinal()]) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            switch (C40911b.f106392b[pinType.ordinal()]) {
                case 1:
                    return -1;
                case 2:
                    return 1;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m130725a(Collection<? extends Effect> collection) {
        C7573i.m23587b(collection, "effects");
        if (!C35574k.m114859a().mo70072F().mo83153b()) {
            return true;
        }
        C30221c c = C35574k.m114859a().mo70072F().mo83154c();
        if (c == null) {
            return true;
        }
        C7573i.m23582a((Object) c, "CameraClient.getAPI().br…ivalEntity ?: return true");
        List<String> list = c.f79520j;
        if (list == null) {
            return true;
        }
        C7573i.m23582a((Object) list, "festivalEntity.stickerList ?: return true");
        for (Effect effectId : collection) {
            if (!list.contains(effectId.getEffectId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final Collection<Effect> m130720a(List<C40912c> list, int i) {
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (f106390a.m130724a(((C40912c) next).f106394b, i)) {
                    arrayList.add(next);
                }
            }
            List a = C7525m.m23494a((Iterable<? extends T>) (List) arrayList, (Comparator<? super T>) new C40910a<Object>());
            if (a != null) {
                Iterable<C40912c> iterable2 = a;
                Collection arrayList2 = new ArrayList();
                for (C40912c cVar : iterable2) {
                    C7525m.m23478a(arrayList2, (Iterable<? extends T>) cVar.f106393a);
                }
                Iterable iterable3 = (List) arrayList2;
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : iterable3) {
                    if (hashSet.add(((Effect) next2).getEffectId())) {
                        arrayList3.add(next2);
                    }
                }
                return arrayList3;
            }
        }
        return C7525m.m23461a();
    }

    /* renamed from: a */
    private final boolean m130724a(PinType pinType, int i) {
        if (m130717a(pinType) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m130718a(Effect effect, FragmentActivity fragmentActivity, String str) {
        C7573i.m23587b(fragmentActivity, "host");
        C7573i.m23587b(str, "panel");
        PinType pinType = PinType.CHRISTMAS;
        m130721a(effect, fragmentActivity, str, pinType, Integer.MAX_VALUE);
        return m130717a(pinType);
    }

    /* renamed from: a */
    public static final int m130719a(List<? extends Effect> list, FragmentActivity fragmentActivity, boolean z, String str) {
        PinType pinType;
        C7573i.m23587b(fragmentActivity, "host");
        C7573i.m23587b(str, "panel");
        if (list == null) {
            return -1;
        }
        if (m130725a((Collection<? extends Effect>) list)) {
            pinType = PinType.TRENDING;
        } else {
            pinType = PinType.CHRISTMAS;
        }
        m130722a(list, fragmentActivity, str, pinType, 0);
        if (!z) {
            return 1;
        }
        return m130717a(pinType);
    }

    /* renamed from: a */
    private static final void m130721a(Effect effect, FragmentActivity fragmentActivity, String str, PinType pinType, int i) {
        if (effect != null) {
            m130722a(C7525m.m23457a(effect), fragmentActivity, str, pinType, Integer.MAX_VALUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m130722a(List<? extends Effect> list, FragmentActivity fragmentActivity, String str, PinType pinType, int i) {
        if (list != null && fragmentActivity != null) {
            C0052o a = ((PinStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(PinStickerViewModel.class)).mo101189a(str);
            C40912c cVar = new C40912c(list, pinType, i);
            List arrayList = new ArrayList();
            arrayList.add(cVar);
            List list2 = (List) a.getValue();
            if (list2 == null) {
                list2 = C7525m.m23461a();
            }
            arrayList.addAll(list2);
            if (C9653q.m28546a()) {
                a.setValue(arrayList);
            } else {
                a.postValue(arrayList);
            }
        }
    }
}
