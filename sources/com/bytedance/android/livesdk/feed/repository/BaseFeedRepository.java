package com.bytedance.android.livesdk.feed.repository;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.livesdk.feed.ApiCallBack;
import com.bytedance.android.livesdk.feed.ApiCallBack.ApiType;
import com.bytedance.android.livesdk.feed.C5980f;
import com.bytedance.android.livesdk.feed.C6038k;
import com.bytedance.android.livesdk.feed.C6085q;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdkapi.C9469i;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p354j.C7486b;

public abstract class BaseFeedRepository implements ApiCallBack, ItemRepository<FeedItem> {

    /* renamed from: a */
    protected C6038k f17978a;

    /* renamed from: b */
    protected final C3145b<FeedDataKey, FeedItem> f17979b;

    /* renamed from: c */
    public C7486b<ApiDataStatus> f17980c = C7486b.m23223a();

    /* renamed from: d */
    public C7486b<ApiDataStatus> f17981d = C7486b.m23223a();

    /* renamed from: e */
    protected C3197b<FeedItem> f17982e;

    /* renamed from: f */
    private C5980f f17983f;

    /* renamed from: g */
    private final C47562b f17984g = new C47562b();

    /* renamed from: h */
    private C6085q f17985h;

    public enum ApiDataStatus {
        START,
        SUCCESS,
        FAIL
    }

    /* renamed from: h */
    public abstract FeedDataKey mo14747h();

    /* renamed from: i */
    public C3197b<FeedItem> mo14748i() {
        return this.f17982e;
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void registerFeedRepository() {
        if (mo14747h() != null) {
            this.f17983f.mo14611a(mo14747h(), (ItemRepository) this);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void unRegisterFeedRepository() {
        if (this.f17983f.mo14617b(mo14747h(), this)) {
            mo14509g();
            this.f17984g.mo119660a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14746a(C7321c cVar) {
        this.f17984g.mo119661a(cVar);
    }

    /* renamed from: a */
    public final void mo14745a(C0043i iVar) {
        if (iVar != null) {
            iVar.getLifecycle().mo55a(this);
        }
    }

    /* renamed from: a */
    public final void mo14442a(ApiType apiType, String str) {
        this.f17985h = new C6085q();
        this.f17985h.mo14738a();
        if (apiType == ApiType.REFRESH) {
            this.f17980c.onNext(ApiDataStatus.START);
            if (this.f17978a != null) {
                mo14747h();
                TextUtils.equals(str, "enter_auto");
            }
        } else if (apiType == ApiType.LOAD_MORE) {
            this.f17981d.onNext(ApiDataStatus.START);
            if (this.f17985h != null) {
                this.f17985h.mo14738a();
            }
            if (this.f17978a != null) {
                mo14747h();
            }
        }
    }

    public BaseFeedRepository(C5980f fVar, C6038k kVar, C3145b<FeedDataKey, FeedItem> bVar) {
        this.f17983f = fVar;
        this.f17978a = kVar;
        this.f17979b = bVar;
    }

    /* renamed from: a */
    public final void mo14443a(ApiType apiType, String str, C2344a aVar) {
        if (apiType == ApiType.REFRESH) {
            this.f17980c.onNext(ApiDataStatus.SUCCESS);
            if (this.f17978a != null) {
                mo14747h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f17985h != null) {
                this.f17985h.mo14739a("refresh");
            }
        } else if (apiType == ApiType.LOAD_MORE) {
            this.f17981d.onNext(ApiDataStatus.SUCCESS);
            if (this.f17978a != null) {
                mo14747h();
            }
            if (this.f17985h != null) {
                this.f17985h.mo14739a("load_more");
            }
        }
    }

    /* renamed from: a */
    public final void mo14444a(ApiType apiType, String str, Throwable th) {
        if (apiType == ApiType.REFRESH) {
            this.f17980c.onNext(ApiDataStatus.FAIL);
            if (this.f17978a != null) {
                mo14747h();
                TextUtils.equals(str, "enter_auto");
            }
            if (this.f17985h != null && C6089a.m19026a(C9469i.m27991c())) {
                this.f17985h.mo14740a("refresh", th);
            }
        } else if (apiType == ApiType.LOAD_MORE) {
            this.f17981d.onNext(ApiDataStatus.FAIL);
            if (this.f17978a != null) {
                mo14747h();
            }
            if (this.f17985h != null && C6089a.m19026a(C9469i.m27991c())) {
                this.f17985h.mo14740a("load_more", th);
            }
        }
    }
}
