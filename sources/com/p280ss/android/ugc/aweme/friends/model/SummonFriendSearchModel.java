package com.p280ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.friends.api.SummonFriendApi;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModel */
public class SummonFriendSearchModel extends C25640a<SummonFriendList> {
    public boolean mIsRefresh;
    public String mKeyword;

    public SummonFriendList getData() {
        return (SummonFriendList) super.getData();
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        return true;
    }

    public boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final boolean booleanValue = objArr[0].booleanValue();
        this.mIsRefresh = objArr[0].booleanValue();
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                if (booleanValue) {
                    SummonFriendSearchModel.this.mIsLoading = false;
                    return SummonFriendApi.m98485a((String) objArr[1], 0, 20, (String) objArr[2]);
                } else if (objArr.length != 3) {
                    return null;
                } else {
                    SummonFriendSearchModel.this.mKeyword = (String) objArr[1];
                    String str = (String) objArr[2];
                    if (SummonFriendSearchModel.this.mData == null || ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor <= 0) {
                        SummonFriendSearchModel.this.mIsRefresh = true;
                        return SummonFriendApi.m98485a(SummonFriendSearchModel.this.mKeyword, 0, 20, str);
                    }
                    SummonFriendSearchModel.this.mIsRefresh = false;
                    return SummonFriendApi.m98485a(SummonFriendSearchModel.this.mKeyword, ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor, 20, str);
                }
            }
        }, 0);
        return true;
    }

    /* access modifiers changed from: protected */
    public void handleData(SummonFriendList summonFriendList) {
        String str;
        if (summonFriendList != null) {
            if (this.mData == null) {
                this.mData = summonFriendList;
            } else {
                ((SummonFriendList) this.mData).cursor = summonFriendList.cursor;
                ((SummonFriendList) this.mData).hasMore = summonFriendList.hasMore;
                ((SummonFriendList) this.mData).keyword = summonFriendList.keyword;
                ((SummonFriendList) this.mData).requestId = summonFriendList.requestId;
            }
            if (this.mIsRefresh) {
                ((SummonFriendList) this.mData).items = summonFriendList.items;
            } else if (((SummonFriendList) this.mData).items == null) {
                ((SummonFriendList) this.mData).items = summonFriendList.items;
            } else {
                List<SummonFriendItem> list = summonFriendList.items;
                if (!C6307b.m19566a((Collection<T>) list)) {
                    ((SummonFriendList) this.mData).items.addAll(list);
                    return;
                }
                String str2 = "summon_friend_user_list_empty";
                String str3 = "";
                C6869c a = C6869c.m21381a();
                String str4 = "request_id";
                if (summonFriendList.logPbBean != null) {
                    str = summonFriendList.logPbBean.getImprId();
                } else {
                    str = "";
                }
                C6877n.m21407a(str2, str3, a.mo16887a(str4, str).mo16887a("key_word", this.mKeyword).mo16888b());
            }
        }
    }
}
