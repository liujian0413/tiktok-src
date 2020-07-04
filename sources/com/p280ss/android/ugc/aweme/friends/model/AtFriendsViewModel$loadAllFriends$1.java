package com.p280ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p280ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$loadAllFriends$1 */
final class AtFriendsViewModel$loadAllFriends$1<V> implements Callable<TResult> {
    public static final AtFriendsViewModel$loadAllFriends$1 INSTANCE = new AtFriendsViewModel$loadAllFriends$1();

    AtFriendsViewModel$loadAllFriends$1() {
    }

    public final AllFriends call() {
        Object obj;
        IIMService g = C30553b.m99810g();
        C7573i.m23582a((Object) g, "IM.get()");
        List allFollowIMUsers = g.getAllFollowIMUsers();
        if (allFollowIMUsers == null) {
            allFollowIMUsers = C7525m.m23461a();
        }
        Iterable iterable = allFollowIMUsers;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            IMUser iMUser = (IMUser) next;
            C7573i.m23582a((Object) iMUser, "it");
            String uid = iMUser.getUid();
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (true ^ C7573i.m23585a((Object) uid, (Object) a.getCurUserId())) {
                arrayList.add(next);
            }
        }
        List<IMUser> list = (List) arrayList;
        List arrayList2 = new ArrayList();
        try {
            List<User> list2 = SummonFriendApi.m98483a().users;
            if (list2 != null && (!list2.isEmpty())) {
                for (User user : list2) {
                    if (arrayList2.size() < 10) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            IMUser iMUser2 = (IMUser) obj;
                            C7573i.m23582a((Object) iMUser2, "it");
                            String uid2 = iMUser2.getUid();
                            C7573i.m23582a((Object) user, "user");
                            if (C7573i.m23585a((Object) uid2, (Object) user.getUid())) {
                                break;
                            }
                        }
                        IMUser iMUser3 = (IMUser) obj;
                        if (iMUser3 == null) {
                            iMUser3 = C30553b.m99780a(user);
                            C7573i.m23582a((Object) iMUser3, "IM.convert(user)");
                        }
                        arrayList2.add(iMUser3);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList2.size() < 10) {
            IIMService g2 = C30553b.m99810g();
            C7573i.m23582a((Object) g2, "IM.get()");
            List<IMUser> recentIMUsers = g2.getRecentIMUsers();
            if (recentIMUsers != null) {
                for (IMUser iMUser4 : recentIMUsers) {
                    if (arrayList2.size() < 10 && !arrayList2.contains(iMUser4)) {
                        C7573i.m23582a((Object) iMUser4, "imUser");
                        String uid3 = iMUser4.getUid();
                        IAccountUserService a2 = C21115b.m71197a();
                        C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                        if (!C7573i.m23585a((Object) uid3, (Object) a2.getCurUserId())) {
                            arrayList2.add(iMUser4);
                        }
                    }
                }
            }
        }
        List arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        List arrayList5 = new ArrayList();
        for (IMUser iMUser5 : list) {
            C7573i.m23582a((Object) iMUser5, "it");
            if (iMUser5.getFollowStatus() == 2 && list.size() >= 10) {
                arrayList3.add(iMUser5);
            }
            if (arrayList4.isEmpty() || !TextUtils.equals((CharSequence) arrayList4.get(arrayList4.size() - 1), iMUser5.getInitialLetter())) {
                String initialLetter = iMUser5.getInitialLetter();
                C7573i.m23582a((Object) initialLetter, "it.initialLetter");
                arrayList4.add(initialLetter);
                arrayList5.add(Integer.valueOf(1));
            } else {
                int size = arrayList5.size() - 1;
                arrayList5.set(size, Integer.valueOf(((Number) arrayList5.get(size)).intValue() + 1));
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList4.add(0, "Friend");
            arrayList5.add(0, Integer.valueOf(arrayList3.size()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList4.add(0, "Recent");
            arrayList5.add(0, Integer.valueOf(arrayList2.size()));
        }
        AllFriends allFriends = new AllFriends(arrayList2, arrayList3, list, arrayList4, arrayList5);
        return allFriends;
    }
}
