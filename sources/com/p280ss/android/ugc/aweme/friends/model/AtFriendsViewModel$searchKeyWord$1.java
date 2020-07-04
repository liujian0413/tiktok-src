package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.C7513am;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchKeyWord$1 */
final class AtFriendsViewModel$searchKeyWord$1<V> implements Callable<TResult> {
    final /* synthetic */ List $data;
    final /* synthetic */ String $keyWord;
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$1(AtFriendsViewModel atFriendsViewModel, List list, String str) {
        this.this$0 = atFriendsViewModel;
        this.$data = list;
        this.$keyWord = str;
    }

    public final List<IMUser> call() {
        boolean z;
        Set a = C7513am.m23408a();
        Iterable searchFollowIMUser = this.this$0.searchFollowIMUser(this.$data, this.$keyWord);
        Collection arrayList = new ArrayList();
        for (Object next : searchFollowIMUser) {
            IMUser iMUser = (IMUser) next;
            if (a.contains(iMUser.getUid())) {
                z = false;
            } else {
                a = C7513am.m23413a(a, iMUser.getUid());
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
