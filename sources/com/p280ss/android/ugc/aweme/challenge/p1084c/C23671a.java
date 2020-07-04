package com.p280ss.android.ugc.aweme.challenge.p1084c;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.a */
public final class C23671a extends C25673a<Aweme, ChallengeAwemeList> {

    /* renamed from: a */
    public String f62423a = "challenge_video";

    /* renamed from: b */
    private int f62424b;

    /* renamed from: c */
    private List<Aweme> f62425c;

    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) this.f62425c)) {
            arrayList.addAll(this.f62425c);
        }
        List a = mo61599a();
        if (!C6307b.m19566a((Collection<T>) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    public final boolean isDataEmpty() {
        if ((this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) && C6307b.m19566a((Collection<T>) getItems())) {
            return true;
        }
        return false;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<Aweme> mo61599a() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeAwemeList) this.mData).items;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo61602b(List<Aweme> list) {
        setItems(new ArrayList(list));
        ((ChallengeAwemeList) this.mData).cursor = (long) list.size();
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new ChallengeAwemeList();
        }
        ((ChallengeAwemeList) this.mData).hasMore = 1;
        ((ChallengeAwemeList) this.mData).items = list;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        m77614a(str, j, 20, objArr[2].intValue(), objArr[3].booleanValue());
    }

    public final void refreshList(Object... objArr) {
        m77614a((String) objArr[1], 0, 20, objArr[2].intValue(), objArr[3].booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(ChallengeAwemeList challengeAwemeList) {
        boolean z;
        C28199ae.m92689a().mo71792a(challengeAwemeList.getRequestId(), challengeAwemeList.logPb);
        if (challengeAwemeList == null || (C6307b.m19566a((Collection<T>) challengeAwemeList.items) && !challengeAwemeList.isHasMore())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (challengeAwemeList.items != null) {
                int size = challengeAwemeList.items.size();
                for (int i = 0; i < size; i++) {
                    Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) challengeAwemeList.items.get(i));
                    updateAweme.setIsTop(((Aweme) challengeAwemeList.items.get(i)).getIsTop());
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(this.f62424b + 3000);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), challengeAwemeList.getRequestId(), i);
                    challengeAwemeList.items.set(i, updateAweme);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = challengeAwemeList;
            } else if (i2 == 4) {
                if (challengeAwemeList.items != null) {
                    if (C6307b.m19566a((Collection<T>) ((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = challengeAwemeList.items;
                    } else {
                        C23682i.m77629a(((ChallengeAwemeList) this.mData).items, challengeAwemeList.items, C23673b.f62432a);
                    }
                }
                ((ChallengeAwemeList) this.mData).cursor = challengeAwemeList.cursor;
                ((ChallengeAwemeList) this.mData).hasMore = challengeAwemeList.hasMore & ((ChallengeAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeAwemeList) this.mData).hasMore = 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo61600a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f62423a = str;
        }
    }

    /* renamed from: a */
    public final void mo61601a(List<Aweme> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (this.f62425c == null) {
                this.f62425c = new ArrayList();
            }
            this.f62425c.clear();
            this.f62425c.addAll(list);
        }
    }

    /* renamed from: a */
    private void m77614a(String str, long j, int i, int i2, boolean z) {
        final int i3 = i2;
        this.f62424b = i3;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str2 = str;
        final long j2 = j;
        final boolean z2 = z;
        C236721 r0 = new Callable(20) {
            public final Object call() throws Exception {
                return ChallengeApi.m77598a(str2, j2, 20, i3, z2, C23671a.this.f62423a);
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
