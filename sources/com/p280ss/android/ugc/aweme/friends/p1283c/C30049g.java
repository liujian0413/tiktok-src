package com.p280ss.android.ugc.aweme.friends.p1283c;

import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendSearchModel;

/* renamed from: com.ss.android.ugc.aweme.friends.c.g */
public final class C30049g extends C25652b<SummonFriendSearchModel, C30040b> {

    /* renamed from: a */
    public String f79024a = "";

    public C30049g() {
        mo66536a(new SummonFriendSearchModel());
    }

    /* renamed from: S_ */
    public final void mo57293S_() {
        super.mo57293S_();
        if (this.f67572c != null && ((SummonFriendSearchModel) this.f67571b).mIsRefresh) {
            ((C30040b) this.f67572c).mo76291e();
        }
    }

    /* renamed from: e */
    public final boolean mo76310e() {
        SummonFriendList data = ((SummonFriendSearchModel) mo66539h()).getData();
        if (data == null) {
            return false;
        }
        return data.hasMore;
    }

    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        SummonFriendList data = ((SummonFriendSearchModel) mo66539h()).getData();
        if (data != null) {
            if (data.requestId == null) {
                this.f79024a = "";
            } else {
                this.f79024a = data.requestId;
            }
            C28199ae.m92689a().mo71792a(this.f79024a, data.logPbBean);
            if (this.f67572c != null) {
                ((C30040b) this.f67572c).mo76289a(data.items, data.keyword);
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C30040b) this.f67572c).mo76290d(exc);
        }
    }
}
