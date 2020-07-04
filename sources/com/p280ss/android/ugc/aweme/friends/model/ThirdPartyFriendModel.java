package com.p280ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.api.FriendApi;
import com.p280ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30039a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel */
public class ThirdPartyFriendModel extends C30039a<Friend> {
    private static Set<String> invitedContacts;
    private final String accessToken;
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    private boolean isSensitiveRegion;
    private final String platform;
    private final String secretAccessToken;

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private C1592h<FriendList<Friend>> uploadContacts() {
        return C1592h.m7853a((Callable<TResult>) new ThirdPartyFriendModel$$Lambda$3<TResult>(this)).mo6885c((C1591g<TResult, TContinuationResult>) new ThirdPartyFriendModel$$Lambda$4<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$4$ThirdPartyFriendModel() throws Exception {
        List<DouyinContactModel> a = C42925am.m136270a(C6399b.m19921a());
        if (C6307b.m19566a((Collection<T>) a)) {
            return new UploadContactsResult();
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (DouyinContactModel douyinContactModel : a) {
            for (String str : douyinContactModel.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = douyinContactModel.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6306c.m19562a(instance.digest(douyinContactModel.nationalNumber(str).getBytes("UTF-8"))));
                    sb.append(C6306c.m19562a(instance.digest(str2.getBytes("UTF-8"))));
                    hashMap.put(sb.toString(), contactModel);
                }
            }
        }
        return UploadContactsApi.m98489a(a, 1);
    }

    public void addInvitedContact(String str) {
        SystemSmsInvitedCacheHelper.addInvitedContact(str);
    }

    public ThirdPartyFriendModel(String str) {
        this(str, null, null);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$fetchList$3$ThirdPartyFriendModel(C1592h hVar) throws Exception {
        ((FriendList) hVar.mo6890e()).friends = sortByFollowStatus(((FriendList) hVar.mo6890e()).friends);
        return hVar.mo6890e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C1592h lambda$fetchList$1$ThirdPartyFriendModel(C1592h hVar) throws Exception {
        if (!this.isSensitiveRegion) {
            return this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).mo6885c((C1591g<TResult, TContinuationResult>) new ThirdPartyFriendModel$$Lambda$6<TResult,TContinuationResult>(this, hVar));
        }
        if (!hVar.mo6889d()) {
            hVar.getClass();
            return C1592h.m7853a(ThirdPartyFriendModel$$Lambda$5.get$Lambda(hVar));
        }
        throw hVar.mo6891f();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$fetchList$2$ThirdPartyFriendModel(C1592h hVar) throws Exception {
        FriendList friendList = (FriendList) ((List) hVar.mo6890e()).get(0);
        FriendList friendList2 = (FriendList) ((List) hVar.mo6890e()).get(1);
        if (this.isSensitiveRegion) {
            return friendList2;
        }
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus(friendList.friends), friendList2.friends);
        return friendList;
    }

    private <T extends User> List<Friend> sortByFollowStatus(List<T> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (T t : list) {
            if (t.getFollowStatus() == 0) {
                arrayList.add(i, Friend.copyFrom(t));
                i++;
                i2++;
                i3++;
            } else if (t.getFollowStatus() == 4) {
                arrayList.add(i2, Friend.copyFrom(t));
                i2++;
                i3++;
            } else if (t.getFollowStatus() == 1) {
                arrayList.add(i3, Friend.copyFrom(t));
                i3++;
            } else {
                arrayList.add(Friend.copyFrom(t));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$uploadContacts$5$ThirdPartyFriendModel(C1592h hVar) throws Exception {
        ArrayList arrayList;
        UploadContactsResult uploadContactsResult = (UploadContactsResult) hVar.mo6890e();
        List<ContactModel> list = uploadContactsResult.contacts;
        boolean z = false;
        if (!C6307b.m19566a((Collection<T>) list)) {
            arrayList = new ArrayList(list.size());
            int i = 0;
            for (ContactModel contactModel : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                StringBuilder sb = new StringBuilder();
                sb.append(contactModel.phoneNumber);
                sb.append(contactModel.name);
                ContactModel contactModel2 = (ContactModel) hashMap.get(sb.toString());
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                }
                Friend friend = new Friend(contactModel.phoneNumber);
                friend.setNickname(contactModel.name);
                if (SystemSmsInvitedCacheHelper.contains(contactModel.phoneNumber)) {
                    friend.setInvited(true);
                    arrayList.add(friend);
                } else {
                    arrayList.add(i, friend);
                    i++;
                }
            }
        } else {
            arrayList = null;
        }
        List sortByFollowStatus = sortByFollowStatus(uploadContactsResult.users);
        FriendList friendList = new FriendList();
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus, arrayList);
        if (sortByFollowStatus != null) {
            z = true;
        }
        this.isSensitiveRegion = z;
        SharePrefCache.inst().getIsContactsUploaded().mo59871a(Boolean.valueOf(true));
        return friendList;
    }

    private List<Friend> insertUnRegisteredContacts(List<Friend> list, List<Friend> list2) {
        if (C6307b.m19566a((Collection<T>) list2)) {
            return list;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return list2;
        }
        int i = 0;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (((Friend) list.get(size)).getFollowStatus() == 0) {
                i = size + 1;
                break;
            } else {
                size--;
            }
        }
        list.addAll(i, list2);
        return list;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$null$0$ThirdPartyFriendModel(C1592h hVar, C1592h hVar2) throws Exception {
        ((FriendList) hVar2.mo6890e()).friends = insertUnRegisteredContacts(sortByFollowStatus(((FriendList) hVar2.mo6890e()).friends), ((FriendList) hVar.mo6890e()).friends);
        return (FriendList) hVar2.mo6890e();
    }

    public ThirdPartyFriendModel(String str, String str2, String str3) {
        this.hashContactsMap = new HashMap<>();
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.friendApi = (FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FriendApi.class);
    }

    public void fetchList(int i, int i2, int i3) {
        if (!this.platform.equals("contact")) {
            this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).mo6885c((C1591g<TResult, TContinuationResult>) new ThirdPartyFriendModel$$Lambda$2<TResult,TContinuationResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        } else if (!((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue()) {
            uploadContacts().mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new ThirdPartyFriendModel$$Lambda$0<TResult,C1592h<TContinuationResult>>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            C1592h.m7858b((Collection<? extends C1592h<TResult>>) Arrays.asList(new C1592h[]{this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken), uploadContacts()})).mo6885c((C1591g<TResult, TContinuationResult>) new ThirdPartyFriendModel$$Lambda$1<TResult,TContinuationResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
