package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.e */
public final class C29480e implements Cloneable {
    @C6593c(mo15949a = "user_id")

    /* renamed from: a */
    public final String f77738a;
    @C6593c(mo15949a = "recommend_item_list")

    /* renamed from: b */
    public final List<Aweme> f77739b;

    /* renamed from: c */
    public User f77740c;

    /* renamed from: d */
    public int f77741d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowStruct(uid=");
        sb.append(this.f77738a);
        sb.append(", awemeList=");
        sb.append(this.f77739b);
        sb.append(", user=");
        sb.append(this.f77740c);
        sb.append(", index=");
        sb.append(this.f77741d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.f77738a.hashCode();
    }

    /* renamed from: a */
    public final C29480e clone() {
        String str = this.f77738a;
        List a = m96971a(this.f77739b);
        User clone = this.f77740c.clone();
        C7573i.m23582a((Object) clone, "user.clone()");
        return new C29480e(str, a, clone, this.f77741d);
    }

    /* renamed from: a */
    public final void mo75490a(User user) {
        C7573i.m23587b(user, "<set-?>");
        this.f77740c = user;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29480e)) {
            return false;
        }
        return TextUtils.equals(((C29480e) obj).f77738a, this.f77738a);
    }

    /* renamed from: a */
    private static List<Aweme> m96971a(List<Aweme> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        Iterable<Aweme> iterable = list;
        Collection arrayList = new ArrayList();
        for (Aweme clone : iterable) {
            Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(clone.clone());
            C7573i.m23582a((Object) updateAweme, "ServiceManager.get().get…).updateAweme(it.clone())");
            arrayList.add(updateAweme);
        }
        return (List) arrayList;
    }

    private C29480e(String str, List<Aweme> list, User user, int i) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(list, "awemeList");
        C7573i.m23587b(user, "user");
        this.f77738a = str;
        this.f77739b = list;
        this.f77740c = user;
        this.f77741d = i;
    }
}
