package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.ContactFriend;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$4 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$4 implements Comparator {
    static final Comparator $instance = new InviteContactFriendsModel$$Lambda$4();

    private InviteContactFriendsModel$$Lambda$4() {
    }

    public final int compare(Object obj, Object obj2) {
        return InviteContactFriendsModel.lambda$sortWithContactIndex$4$InviteContactFriendsModel((ContactFriend) obj, (ContactFriend) obj2);
    }
}
