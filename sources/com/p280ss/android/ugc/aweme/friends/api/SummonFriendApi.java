package com.p280ss.android.ugc.aweme.friends.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.p280ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p280ss.android.ugc.aweme.p313im.C30556d;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi */
public final class SummonFriendApi {

    /* renamed from: a */
    private static final SummonFriendService f78998a = ((SummonFriendService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(SummonFriendService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.SummonFriendApi$SummonFriendService */
    public interface SummonFriendService {
        @C6457h(mo15740a = "/aweme/v1/user/following/list/")
        C12466b<FollowUserListModel> queryFollowFriends(@C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "user_id") String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "min_time") long j2, @C6474y(mo15757a = "address_book_access") int i2, @C6474y(mo15757a = "gps_access") int i3);

        @C6457h(mo15740a = "/aweme/v1/at/default/list/")
        C7492s<RecentFriendModel> queryFollowFriends4At(@C6474y(mo15757a = "count") int i, @C6474y(mo15757a = "cursor") int i2);

        @C6457h(mo15740a = "/aweme/v1/user/recent/contact/")
        C12466b<RecentFriendModel> queryRecentFriends();

        @C6457h(mo15740a = "/aweme/v1/user/recent/contact/")
        C7492s<RecentFriendModel> queryRecentFriends4At();

        @C6457h(mo15740a = "/aweme/v1/discover/search/")
        C12466b<SummonFriendList> searchFriends(@C6474y(mo15757a = "keyword") String str, @C6474y(mo15757a = "count") long j, @C6474y(mo15757a = "cursor") long j2, @C6474y(mo15757a = "type") int i, @C6474y(mo15757a = "search_source") String str2, @C6474y(mo15757a = "filter_block") int i2);

        @C6457h(mo15740a = "/aweme/v1/discover/search/")
        C7492s<SummonFriendList> searchFriends4At(@C6474y(mo15757a = "keyword") String str, @C6474y(mo15757a = "count") long j, @C6474y(mo15757a = "cursor") long j2, @C6474y(mo15757a = "type") int i, @C6474y(mo15757a = "search_source") String str2, @C6474y(mo15757a = "filter_block") int i2);
    }

    /* renamed from: b */
    public static C7492s<RecentFriendModel> m98487b() {
        return f78998a.queryRecentFriends4At();
    }

    /* renamed from: a */
    public static RecentFriendModel m98483a() throws Exception {
        return (RecentFriendModel) f78998a.queryRecentFriends().execute().f33302b;
    }

    /* renamed from: a */
    static final /* synthetic */ RecentFriendModel m98484a(String str) throws Exception {
        List<IMUser> allFollowIMUsers = C30556d.m99810g().getAllFollowIMUsers();
        RecentFriendModel recentFriendModel = new RecentFriendModel();
        ArrayList arrayList = new ArrayList();
        Collections.sort(allFollowIMUsers, C30035e.f79009a);
        if (allFollowIMUsers != null) {
            for (IMUser user : allFollowIMUsers) {
                arrayList.add(IMUser.toUser(user));
            }
        }
        recentFriendModel.users = arrayList;
        recentFriendModel.cursor = 0;
        recentFriendModel.hasMore = false;
        return recentFriendModel;
    }

    /* renamed from: a */
    static final /* synthetic */ int m98481a(IMUser iMUser, IMUser iMUser2) {
        if (iMUser.getFollowStatus() == 2 && iMUser2.getFollowStatus() != 2) {
            return -1;
        }
        if (iMUser.getFollowStatus() == 2 || iMUser2.getFollowStatus() != 2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static C7492s<RecentFriendModel> m98486a(int i, int i2) {
        if (C6399b.m19944t()) {
            return f78998a.queryFollowFriends4At(i, i2);
        }
        return C7492s.m23301b("").mo19304b(C7333a.m23044b()).mo19317d(C30034d.f79008a);
    }

    /* renamed from: b */
    public static C7492s<SummonFriendList> m98488b(String str, long j, long j2, String str2) {
        return f78998a.searchFriends4At(str, j2, j, 1, str2, 1);
    }

    /* renamed from: a */
    public static SummonFriendList m98485a(String str, long j, long j2, String str2) throws Exception {
        return (SummonFriendList) f78998a.searchFriends(str, 20, j, 1, str2, 1).execute().f33302b;
    }

    /* renamed from: a */
    public static FollowUserListModel m98482a(int i, long j, long j2, String str, int i2, int i3) throws Exception {
        return (FollowUserListModel) f78998a.queryFollowFriends(10, str, j, 0, i2, i3).execute().f33302b;
    }
}
