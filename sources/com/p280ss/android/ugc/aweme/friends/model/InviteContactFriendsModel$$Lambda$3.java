package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.ContactFriend;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$3 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$3 implements Comparator {
    static final Comparator $instance = new InviteContactFriendsModel$$Lambda$3();

    private InviteContactFriendsModel$$Lambda$3() {
    }

    public final int compare(Object obj, Object obj2) {
        return InviteContactFriendsModel.lambda$sortWithContactIndex$3$InviteContactFriendsModel((ContactFriend) obj, (ContactFriend) obj2);
    }
}
