package com.p280ss.android.ugc.aweme.sticker.prop.p1636a;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.a.b */
public final class C41856b extends C25673a<Aweme, C41855a> {

    /* renamed from: a */
    public StickerPropApi f108875a = ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(StickerPropApi.class));

    /* renamed from: b */
    private int f108876b;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C41855a) this.mData).f108869a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C41855a) this.mData).mo102888a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m133126a((String) objArr[1], 0, 20, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C41855a();
        }
        ((C41855a) this.mData).f108871c = 1;
        ((C41855a) this.mData).f108869a = list;
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((C41855a) this.mData).f108870b;
        }
        m133126a(str, j, 20, objArr[2].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C41855a aVar) {
        boolean z;
        if (aVar == null || C6307b.m19566a((Collection<T>) aVar.f108869a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int size = aVar.f108869a.size();
            for (int i = 0; i < size; i++) {
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) aVar.f108869a.get(i));
                updateAweme.setIsTop(((Aweme) aVar.f108869a.get(i)).getIsTop());
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(this.f108876b + VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), aVar.f108872d, i);
                aVar.f108869a.set(i, updateAweme);
                if (aVar.f108873e != null) {
                    C28199ae.m92689a().mo71792a(aVar.f108872d, aVar.f108873e);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = aVar;
            } else if (i2 == 4) {
                ((C41855a) this.mData).f108869a.addAll(aVar.f108869a);
                ((C41855a) this.mData).f108870b = aVar.f108870b;
                ((C41855a) this.mData).f108871c = aVar.f108871c & ((C41855a) this.mData).f108871c;
            }
        } else {
            if (this.mData != null) {
                ((C41855a) this.mData).f108871c = 0;
            }
        }
    }

    /* renamed from: a */
    private void m133126a(String str, long j, int i, int i2) {
        this.f108876b = i2;
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str2 = str;
        final long j2 = j;
        C418571 r0 = new Callable(20) {
            public final Object call() throws Exception {
                return C41856b.this.f108875a.queryStickerAwemeList(str2, j2, 20).get();
            }
        };
        a.mo60807a(fVar, r0, 0);
    }
}
