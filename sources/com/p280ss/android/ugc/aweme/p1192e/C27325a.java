package com.p280ss.android.ugc.aweme.p1192e;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.friends.C29998a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.e.a */
public final class C27325a {
    /* renamed from: a */
    public static <T> void m89575a(List<T> list, List<T> list2) {
        if (!C6307b.m19566a((Collection<T>) list2)) {
            for (Object next : list2) {
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public static <T extends User> void m89576b(List<User> list, List<T> list2) {
        if (!C6307b.m19566a((Collection<T>) list2)) {
            for (T t : list2) {
                if (!C29998a.m98354a((Collection<User>) list, (User) t)) {
                    list.add(t);
                }
            }
        }
    }
}
