package com.p280ss.android.ugc.aweme.main.story;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1063g.C23345c;
import com.p280ss.android.ugc.aweme.commercialize.p1122e.C24623b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.story.live.C33104d;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.main.story.b */
public final class C33069b {

    /* renamed from: a */
    public static boolean f86042a = true;

    /* renamed from: d */
    public static HorizontalFeedApi f86043d = ((HorizontalFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(HorizontalFeedApi.class));

    /* renamed from: b */
    public int f86044b = 2;

    /* renamed from: c */
    public long f86045c;

    /* renamed from: a */
    private static long m106782a() {
        return C23338f.m76565c().mo60621a("last_update_time", -1);
    }

    public C33069b(int i) {
        this.f86044b = i;
    }

    /* renamed from: a */
    public final void mo84761a(long j) {
        if (j != m106782a()) {
            C23338f.m76565c().mo60630b("last_update_time", j);
        }
    }

    /* renamed from: a */
    public final void mo84762a(final C23345c<StoryResponse> cVar) {
        final String str;
        if (f86042a) {
            str = "1";
        } else {
            str = "0";
        }
        final String str2 = "0";
        C1592h.m7853a((Callable<TResult>) new Callable<StoryResponse>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public StoryResponse call() throws Exception {
                StoryResponse storyResponse = (StoryResponse) C33069b.f86043d.getStory(C33069b.this.f86045c, 20, C33069b.this.f86044b, str, str2).get();
                C33069b.this.mo84761a((long) storyResponse.getLatestTime());
                C33069b.this.f86045c = storyResponse.getCursor();
                C24623b.m80725a(storyResponse.getCommerceStoryFeed());
                return storyResponse;
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<StoryResponse, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<StoryResponse> hVar) throws Exception {
                if (cVar == null) {
                    return null;
                }
                if (hVar.mo6889d() || hVar.mo6887c()) {
                    cVar.mo60642a(hVar.mo6891f());
                } else {
                    cVar.mo60643a(hVar.mo6890e());
                }
                return null;
            }
        }, C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C33104d mo84760a(String str, String str2) throws Exception {
        return (C33104d) f86043d.fetchRecommendAvatars(this.f86044b, str, str2).get();
    }

    /* renamed from: a */
    static final /* synthetic */ Object m106783a(C23345c cVar, C1592h hVar) throws Exception {
        if (cVar == null) {
            return null;
        }
        if (hVar.mo6889d() || hVar.mo6887c()) {
            cVar.mo60642a(hVar.mo6891f());
        } else {
            cVar.mo60643a(hVar.mo6890e());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo84763a(boolean z, C23345c<C33067a> cVar) {
        String str;
        String str2;
        if (f86042a) {
            str = "1";
        } else {
            str = "0";
        }
        if (f86042a || !z) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        C1592h.m7855a((Callable<TResult>) new C33072c<TResult>(this, str, str2), (Executor) C7258h.m22730c()).mo6875a((C1591g<TResult, TContinuationResult>) new C33073d<TResult,TContinuationResult>(this, str, str2)).mo6876a((C1591g<TResult, TContinuationResult>) new C33074e<TResult,TContinuationResult>(cVar), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C33067a mo84759a(String str, String str2, C1592h hVar) throws Exception {
        C33067a aVar = new C33067a();
        if (hVar.mo6882b() && C41983b.m133444a()) {
            aVar.f86039b = (C33104d) hVar.mo6890e();
        }
        this.f86045c = 0;
        try {
            aVar.f86038a = (StoryResponse) f86043d.getStory(0, 20, this.f86044b, str, str2).get();
            mo84761a((long) aVar.f86038a.getLatestTime());
            this.f86045c = aVar.f86038a.getCursor();
            C24623b.m80725a(aVar.f86038a.getCommerceStoryFeed());
        } catch (Exception e) {
            if (!aVar.mo84757b()) {
                throw e;
            }
        }
        f86042a = false;
        return aVar;
    }
}
