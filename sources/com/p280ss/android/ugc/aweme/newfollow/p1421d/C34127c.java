package com.p280ss.android.ugc.aweme.newfollow.p1421d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34271f;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnGetRecoverDraftCallback;
import com.p280ss.android.ugc.aweme.services.publish.IPublishService.OnPublishCallback;
import com.p280ss.android.ugc.aweme.shortvideo.C40023l;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.VideoPublishException;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40232d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.newfollow.d.c */
public final class C34127c implements C40023l<CreateAwemeResponse> {

    /* renamed from: a */
    public String f88923a;

    /* renamed from: b */
    public OnPublishCallback f88924b;

    /* renamed from: c */
    public C34271f f88925c;

    /* renamed from: d */
    public Bitmap f88926d;

    /* renamed from: e */
    private Context f88927e;

    /* renamed from: f */
    private C40232d f88928f;

    /* renamed from: g */
    private int f88929g;

    /* renamed from: h */
    private boolean f88930h;

    /* renamed from: i */
    private boolean f88931i;

    /* renamed from: j */
    private volatile boolean f88932j;

    /* renamed from: k */
    private Handler f88933k = new Handler(Looper.getMainLooper());

    public final void onSynthetiseSuccess(String str) {
    }

    /* renamed from: d */
    private void m109917d() {
        if (this.f88927e != null) {
            this.f88933k.post(new C34133f(this));
        }
    }

    /* renamed from: a */
    public final void mo86800a() {
        if (this.f88928f != null) {
            m109915a(this.f88929g, this.f88930h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Bitmap mo86805c() throws Exception {
        if (this.f88928f != null) {
            return this.f88928f.mo96194c();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86804b() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showPoiRateUploadVideoSuccessDialog(this.f88927e);
    }

    /* renamed from: a */
    public final void mo86801a(C34271f fVar) {
        this.f88925c = fVar;
        if (this.f88925c != null) {
            this.f88925c.mo87044l();
        }
    }

    public final void onError(VideoPublishException videoPublishException) {
        this.f88931i = false;
        if (this.f88924b != null) {
            this.f88924b.onStopPublish();
        }
        if (this.f88925c != null) {
            this.f88925c.mo87033a((FollowFeed) null, false);
        }
        if (videoPublishException.isRecover()) {
            mo86803a(videoPublishException.isCauseByApiServerException());
        }
        if (this.f88928f != null) {
            this.f88928f.mo96193b(this);
        }
        this.f88933k.post(new Runnable() {
            public final void run() {
                if (C34127c.this.f88926d != null) {
                    C34127c.this.f88926d.recycle();
                    C34127c.this.f88926d = null;
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo86799a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            this.f88926d = (Bitmap) hVar.mo6890e();
            if (!(this.f88925c == null || this.f88926d == null)) {
                this.f88925c.mo87031a(this.f88926d);
            }
            this.f88932j = false;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo86802a(C40232d dVar) {
        this.f88928f = dVar;
        if (this.f88928f != null) {
            this.f88928f.mo96191a(this);
        }
        if (this.f88925c != null) {
            this.f88925c.mo87044l();
        }
    }

    /* renamed from: a */
    public final void mo86803a(final boolean z) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getRecoverDraftIfHave(AwemeApplication.m21341a(), new OnGetRecoverDraftCallback() {
            public final void onFail() {
            }

            public final void onSuccess(C27311c cVar) {
                if (C34127c.this.f88925c != null) {
                    C34127c.this.f88925c.mo87032a(cVar, z);
                }
            }
        });
    }

    public C34127c(Context context, String str) {
        this.f88927e = context;
        this.f88923a = str;
    }

    public final void onProgressUpdate(int i, boolean z) {
        m109915a(i, z);
        if (z && !this.f88931i && TextUtils.equals(this.f88923a, "homepage_friends")) {
            this.f88931i = true;
            m109917d();
        }
    }

    /* renamed from: a */
    private void m109915a(int i, boolean z) {
        this.f88929g = i;
        this.f88930h = z;
        if ((this.f88926d == null || this.f88926d.isRecycled()) && !this.f88932j && this.f88928f != null) {
            this.f88932j = true;
            C1592h.m7853a((Callable<TResult>) new C34131d<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C34132e<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
        if (this.f88925c != null) {
            this.f88925c.mo87030a(i, this.f88926d, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(CreateAwemeResponse createAwemeResponse, boolean z) {
        boolean z2 = false;
        this.f88931i = false;
        if (this.f88924b != null) {
            this.f88924b.onStopPublish();
        }
        if (this.f88928f != null) {
            this.f88928f.mo96193b(this);
        }
        FollowFeed followFeed = null;
        if (createAwemeResponse != null) {
            Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null) {
                aweme.setRequestId(createAwemeResponse.getRequestId());
                followFeed = new FollowFeed(aweme);
                C28199ae.m92689a().mo71792a(createAwemeResponse.getRequestId(), createAwemeResponse.getLogPbBean());
            }
        }
        if (this.f88925c != null) {
            if (!(followFeed == null || followFeed.getAweme() == null || C43168s.m136912d(followFeed.getAweme()))) {
                z2 = true;
            }
            this.f88925c.mo87033a(followFeed, z2);
            C41530am.m132280a("PublishDurationMonitor MANUAL_END hideUploadItem");
        }
        this.f88933k.post(new Runnable() {
            public final void run() {
                if (C34127c.this.f88926d != null) {
                    C34127c.this.f88926d.recycle();
                    C34127c.this.f88926d = null;
                }
            }
        });
    }
}
