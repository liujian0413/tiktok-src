package com.p280ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import bolts.C1591g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel */
public class RecommendCommonUserModel extends C34028a<RecommendList> {
    private RecommendApi mRecommendApi = C30030b.m98492a();
    private HashSet<String> mShownUserIds = new HashSet<>();
    public int newUserCount;
    private List<String> userIdList;

    public void resetShownUserIds() {
        this.mShownUserIds.clear();
        this.newUserCount = 0;
    }

    public void removeFollowedUser() {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            int i = 0;
            while (i < size) {
                if (((User) userList.get(i)).getFollowStatus() != 0) {
                    userList.remove(i);
                    size--;
                    i--;
                }
                i++;
            }
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    public void setRecommendList(RecommendList recommendList) {
        this.mQueryType = 1;
        handleData(recommendList);
    }

    public int getUserImprOrder(String str) {
        if (this.userIdList != null) {
            return this.userIdList.indexOf(str);
        }
        return 0;
    }

    public void setData(List<User> list) {
        if (this.mData != null) {
            ((RecommendList) this.mData).setUserList(list);
        }
    }

    public void removeData(User user) {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(RecommendList recommendList) {
        if (recommendList != null) {
            if (recommendList.getUserList() != null) {
                for (User requestId : recommendList.getUserList()) {
                    requestId.setRequestId(recommendList.getRid());
                }
            }
            if (this.mQueryType == 1) {
                this.newUserCount = 0;
                super.handleData(recommendList);
                Iterator it = recommendList.getUserList().iterator();
                while (it.hasNext()) {
                    User user = (User) it.next();
                    if (this.mShownUserIds.contains(user.getUid())) {
                        it.remove();
                    } else {
                        this.mShownUserIds.add(user.getUid());
                    }
                }
            } else if (this.mQueryType == 4) {
                if (this.mData != null) {
                    List userList = ((RecommendList) this.mData).getUserList();
                    int size = userList.size();
                    for (User user2 : recommendList.getUserList()) {
                        if (!this.mShownUserIds.contains(user2.getUid())) {
                            userList.add(user2);
                            this.mShownUserIds.add(user2.getUid());
                        }
                    }
                    this.newUserCount = userList.size() - size;
                    this.mData = recommendList;
                    ((RecommendList) this.mData).setUserList(userList);
                } else {
                    this.mData = recommendList;
                }
            }
            if (this.userIdList == null) {
                this.userIdList = new ArrayList();
            } else {
                this.userIdList.clear();
            }
            if (recommendList.getUserList() != null) {
                for (User uid : recommendList.getUserList()) {
                    this.userIdList.add(uid.getUid());
                }
            }
            C28199ae.m92689a().mo71792a(recommendList.getRid(), recommendList.getLogPb());
        }
    }

    public void loadMore(int i, String str, int i2, int i3, int i4, int i5, String str2, String str3) {
        int i6;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            if (this.mData == null) {
                i6 = 0;
            } else {
                i6 = ((RecommendList) this.mData).getCursor();
            }
            fetchData(i, str, i6, i2, i3, i4, null, i5, str2, str3);
        }
    }

    public void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(0), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), C34202f.m110435a().mo86949b(), Integer.valueOf(i5), str2, i6).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }

    public void refreshRecommendUser(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i, str, 0, i2, i3, i4, str2, i5, str3, str4);
        }
    }

    private void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            if (!C6399b.m19944t()) {
                String str5 = str;
                int i7 = i3;
            } else if (i3 == 1) {
                this.mRecommendApi.recommendListMT(Integer.valueOf(i), Integer.valueOf(i2), C34202f.m110435a().mo86949b(), str).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
                return;
            } else {
                String str6 = str;
            }
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), C34202f.m110435a().mo86949b(), Integer.valueOf(i6), str3).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        int i8 = i3;
        this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(1), Integer.valueOf(i5), C34202f.m110435a().mo86949b(), str2, Integer.valueOf(i6), str3, str4).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
