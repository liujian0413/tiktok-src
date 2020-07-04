package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0052o;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.C2358d;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.IFeedRepository.C5920a;
import com.bytedance.android.livesdk.feed.feed.C5984a;
import com.bytedance.android.livesdk.feed.feed.C5985b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p229d.C5971a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;
import com.bytedance.common.utility.C6319n;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public class BaseFeedDataViewModel extends PagingViewModel<FeedItem> {

    /* renamed from: A */
    private long f21059A;

    /* renamed from: a */
    public IFeedRepository f21060a;

    /* renamed from: j */
    public C0052o<Integer> f21061j = new C0052o<>();

    /* renamed from: k */
    public C0052o<C2358d> f21062k = new C0052o<>();

    /* renamed from: l */
    public C0052o<Integer> f21063l = new C0052o<>();

    /* renamed from: m */
    public C0052o<Integer> f21064m = new C0052o<>();

    /* renamed from: n */
    public C0052o<List<ImageModel>> f21065n = new C0052o<>();

    /* renamed from: o */
    public C0052o<ApiDataStatus> f21066o = new C0052o<>();

    /* renamed from: p */
    public C0052o<ApiDataStatus> f21067p = new C0052o<>();

    /* renamed from: q */
    protected C3197b<FeedItem> f21068q;

    /* renamed from: r */
    protected String f21069r;

    /* renamed from: s */
    public int f21070s;

    /* renamed from: t */
    public int f21071t;

    /* renamed from: u */
    protected String f21072u;

    /* renamed from: v */
    public FeedDataKey f21073v;

    /* renamed from: w */
    public C0052o<Status> f21074w = new C0052o<>();

    /* renamed from: x */
    private C5984a<C3197b<FeedItem>, C5985b> f21075x;

    /* renamed from: y */
    private C5985b f21076y;

    /* renamed from: z */
    private C5971a f21077z;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo20491e() {
        return this.f21069r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo20492f() {
        return this.f21072u;
    }

    /* renamed from: i */
    public boolean mo20495i() {
        return false;
    }

    /* renamed from: j */
    private void m23948j() {
        this.f21060a.mo14497a((C5920a) new C5920a() {
            /* renamed from: a */
            public final FeedDataKey mo14503a() {
                return BaseFeedDataViewModel.this.mo20493g();
            }

            /* renamed from: b */
            public final int mo14504b() {
                return BaseFeedDataViewModel.this.f21070s;
            }

            /* renamed from: c */
            public final int mo14505c() {
                return BaseFeedDataViewModel.this.f21071t;
            }
        });
    }

    /* renamed from: k */
    private void m23949k() {
        this.f21067p.observeForever(new C7808c(this));
    }

    /* renamed from: g */
    public final FeedDataKey mo20493g() {
        if (this.f21073v == null) {
            this.f21073v = mo20494h();
        }
        return this.f21073v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public FeedDataKey mo20494h() {
        return FeedDataKey.m18724a(this.f21072u, mo20491e(), this.f21059A);
    }

    /* renamed from: b */
    public final boolean mo10115b() {
        boolean b = super.mo10115b();
        if (b) {
            this.f21061j.setValue(Integer.valueOf(0));
        }
        return b;
    }

    /* renamed from: d */
    public void mo20490d() {
        try {
            this.f21075x = this.f21060a.mo14494a(mo20491e());
            this.f21068q = (C3197b) this.f21075x.f17736a;
            this.f21076y = (C5985b) this.f21075x.f17737b;
            this.f21076y.f17738a.observeForever(new C7806a(this));
            this.f21076y.f17739b.observeForever(new C7807b(this));
            mo10109a(this.f21068q);
            m23949k();
            mo10158a(this.f21060a.mo14499b().mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7809d<Object>(this), C7810e.f21105a));
            mo10158a(this.f21060a.mo14500c().mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7811f<Object>(this), C7812g.f21107a));
            if (this.f21060a instanceof BaseFeedRepository) {
                mo10158a(((BaseFeedRepository) this.f21060a).f17980c.mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7813h<Object>(this), C7814i.f21109a));
                mo10158a(((BaseFeedRepository) this.f21060a).f17981d.mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7815j<Object>(this), C7816k.f21111a));
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20483a(List<ImageModel> list) {
        this.f21065n.setValue(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20480a(C2358d dVar) {
        this.f21062k.setValue(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo20489c(ApiDataStatus apiDataStatus) throws Exception {
        this.f21066o.setValue(apiDataStatus);
    }

    /* renamed from: a */
    public final boolean mo20484a(String str) {
        this.f21060a.mo14498a(str, null);
        mo20487b(str);
        return mo10115b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20485b(ApiDataStatus apiDataStatus) throws Exception {
        this.f21067p.setValue(apiDataStatus);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20486b(Integer num) {
        this.f21061j.setValue(num);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20481a(ApiDataStatus apiDataStatus) {
        if (apiDataStatus == ApiDataStatus.SUCCESS) {
            Integer num = (Integer) this.f21064m.getValue();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            this.f21064m.setValue(Integer.valueOf(num.intValue() + 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo20487b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "enter_auto") && !TextUtils.equals(str, "detail_loadmore") && this.f21077z.mo14619b()) {
            Integer num = (Integer) this.f21063l.getValue();
            if (num == null) {
                this.f21063l.setValue(Integer.valueOf(1));
            } else {
                this.f21063l.setValue(Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final void mo20482a(String str, String str2) {
        if (!C6319n.m19593a(str)) {
            this.f21069r = str;
        }
        if (!C6319n.m19593a(str2)) {
            this.f21072u = str2;
        }
    }

    /* renamed from: b */
    public final void mo20488b(String str, String str2) {
        if (this.f21060a != null) {
            this.f21060a.mo14498a(null, str2);
        }
    }

    public BaseFeedDataViewModel(IFeedRepository iFeedRepository, C6019g gVar, C5971a aVar) {
        this.f21060a = iFeedRepository;
        if (gVar != null) {
            this.f21069r = gVar.mo14650a();
            this.f21070s = 10;
            this.f21071t = gVar.mo14656d();
            this.f21072u = gVar.mo14653b();
            this.f21077z = aVar;
            this.f21059A = gVar.mo14655c();
            m23948j();
        }
    }
}
