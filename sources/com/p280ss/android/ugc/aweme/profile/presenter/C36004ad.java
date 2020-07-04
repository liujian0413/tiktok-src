package com.p280ss.android.ugc.aweme.profile.presenter;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ad */
public final class C36004ad extends C34029b<RecommendCommonUserModel, C36042p> implements C25678f {

    /* renamed from: d */
    public boolean f94194d;

    /* renamed from: a */
    public final void mo91632a(int i, String str, int i2, int i3, String str2, int i4, String str3) {
        mo91630a(i, str, i2, 0, i3, null, i4, str3, null);
    }

    /* renamed from: a */
    public final void mo91631a(int i, String str, int i2, int i3, String str2, int i4) {
        m115975a(30, str, i2, 0, i3, (String) null, i4);
    }

    /* renamed from: a */
    public final void mo91633a(User user) {
        if (this.f88765b != null) {
            ((RecommendCommonUserModel) this.f88765b).removeData(user);
        }
    }

    /* renamed from: a */
    public final void mo91634a(List<User> list) {
        if (this.f88765b != null) {
            ((RecommendCommonUserModel) this.f88765b).setData(list);
        }
    }

    /* renamed from: d */
    public final RecommendList mo91636d() {
        if (this.f88765b == null) {
            return null;
        }
        return (RecommendList) ((RecommendCommonUserModel) this.f88765b).mData;
    }

    /* renamed from: e */
    public final void mo91637e() {
        if (this.f88765b != null) {
            ((RecommendCommonUserModel) this.f88765b).resetShownUserIds();
        }
    }

    /* renamed from: f */
    public final int mo91638f() {
        if (this.f88765b != null) {
            return ((RecommendCommonUserModel) this.f88765b).newUserCount;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo56977b() {
        C34202f.m110435a().mo86950c();
        if (((RecommendCommonUserModel) this.f88765b).mQueryType == 1) {
            ((C36042p) this.f88766c).mo72036a((RecommendList) ((RecommendCommonUserModel) this.f88765b).mData);
            return;
        }
        if (((RecommendCommonUserModel) this.f88765b).mQueryType == 4) {
            ((C36042p) this.f88766c).mo72042b((RecommendList) ((RecommendCommonUserModel) this.f88765b).mData);
        }
    }

    /* renamed from: a */
    public final void mo91626a() {
        if (this.f88765b != null) {
            ((RecommendCommonUserModel) this.f88765b).removeFollowedUser();
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        ((C36042p) this.f88766c).mo72038a(exc);
    }

    /* renamed from: a */
    public final int mo91625a(String str) {
        if (this.f88765b != null) {
            return ((RecommendCommonUserModel) this.f88765b).getUserImprOrder(str);
        }
        return 0;
    }

    public C36004ad(RecommendCommonUserModel recommendCommonUserModel, C36042p pVar) {
        super(recommendCommonUserModel, pVar);
        ((RecommendCommonUserModel) this.f88765b).addNotifyListener(this);
    }

    /* renamed from: a */
    public final void mo91627a(int i, String str, int i2, int i3, int i4) {
        mo91635b(30, str, 2, 0, i3, i4);
    }

    /* renamed from: b */
    public final void mo91635b(int i, String str, int i2, int i3, int i4, int i5) {
        m115974a(i, str, i2, i3, i4, i5, (String) null);
    }

    /* renamed from: a */
    public final void mo91628a(int i, String str, int i2, int i3, int i4, int i5) {
        ((RecommendCommonUserModel) this.f88765b).fetchData(30, str, 2, 0, i3, i4, null, i5);
    }

    /* renamed from: a */
    public final void mo91629a(int i, String str, int i2, int i3, int i4, String str2) {
        m115974a(i, str, i2, 0, i3, i4, str2);
    }

    /* renamed from: a */
    private void m115975a(int i, String str, int i2, int i3, int i4, String str2, int i5) {
        mo91630a(i, str, i2, 0, i4, str2, i5, null, null);
    }

    /* renamed from: a */
    private void m115974a(int i, String str, int i2, int i3, int i4, int i5, String str2) {
        ((RecommendCommonUserModel) this.f88765b).loadMore(i, str, i2, i3, i4, i5, str2, null);
    }

    /* renamed from: a */
    public final void mo91630a(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4) {
        ((RecommendCommonUserModel) this.f88765b).refreshRecommendUser(i, str, i2, i3, i4, str2, i5, str3, str4);
    }
}
