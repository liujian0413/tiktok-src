package com.p280ss.android.ugc.aweme.profile.presenter;

import android.os.Handler;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.p280ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.k */
public final class C36035k extends C25640a<FollowRequestResponse> {

    /* renamed from: c */
    public static final C36036a f94278c = new C36036a(null);

    /* renamed from: a */
    public boolean f94279a;

    /* renamed from: b */
    public boolean f94280b;

    /* renamed from: d */
    private long f94281d;

    /* renamed from: e */
    private long f94282e;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.k$a */
    public static final class C36036a {
        private C36036a() {
        }

        public /* synthetic */ C36036a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.k$b */
    static final class C36037b<V> implements Callable<FollowRequestResponse> {

        /* renamed from: a */
        final /* synthetic */ long f94283a;

        /* renamed from: b */
        final /* synthetic */ long f94284b;

        /* renamed from: c */
        final /* synthetic */ int f94285c;

        C36037b(long j, long j2, int i) {
            this.f94283a = j;
            this.f94284b = j2;
            this.f94285c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            try {
                return FollowRequestApiManager.m97662a(this.f94283a, this.f94284b, this.f94285c);
            } catch (ExecutionException e) {
                RuntimeException a = C22838j.m75277a(e);
                C7573i.m23582a((Object) a, "RetrofitFactory.getCompatibleException(e)");
                throw a;
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    /* renamed from: a */
    public final void mo91692a() {
        this.f94281d = System.currentTimeMillis() / 1000;
        this.f94282e = 1;
        this.f94280b = false;
        this.f94279a = false;
        m116083a(this.f94281d, this.f94282e, 20);
    }

    /* renamed from: b */
    public final void mo91693b() {
        long j;
        FollowRequestResponse followRequestResponse = (FollowRequestResponse) getData();
        if (followRequestResponse != null) {
            j = followRequestResponse.minTime;
        } else {
            j = System.currentTimeMillis() / 1000;
        }
        this.f94281d = j;
        this.f94282e = 1;
        this.f94280b = false;
        this.f94279a = true;
        m116083a(this.f94281d, this.f94282e, 20);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(FollowRequestResponse followRequestResponse) {
        boolean z;
        if (followRequestResponse == null) {
            this.mData = null;
            return;
        }
        Collection collection = followRequestResponse.userRequestList;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            followRequestResponse.hasMore = false;
        }
        if (!this.f94279a || this.mData == null) {
            this.mData = followRequestResponse;
            return;
        }
        ((FollowRequestResponse) this.mData).maxTime = followRequestResponse.maxTime;
        ((FollowRequestResponse) this.mData).minTime = followRequestResponse.minTime;
        ((FollowRequestResponse) this.mData).hasMore = followRequestResponse.hasMore;
        List<User> list = ((FollowRequestResponse) this.mData).userRequestList;
        List<User> list2 = followRequestResponse.userRequestList;
        C7573i.m23582a((Object) list2, "data.userRequestList");
        list.addAll(list2);
    }

    /* renamed from: a */
    private final void m116083a(long j, long j2, int i) {
        C23397p a = C23397p.m76735a();
        Handler handler = this.mHandler;
        C36037b bVar = new C36037b(j, j2, 20);
        a.mo60807a(handler, bVar, 0);
    }
}
