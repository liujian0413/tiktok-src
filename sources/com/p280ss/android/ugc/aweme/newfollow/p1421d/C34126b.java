package com.p280ss.android.ugc.aweme.newfollow.p1421d;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29351a;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21752c;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a;
import com.p280ss.android.ugc.aweme.newfollow.p1418a.C34110a.C34113a;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34122b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FollowFeedFragment;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34271f;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39327e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.d.b */
public class C34126b extends C29351a<C29452a, C34271f> implements C34122b {

    /* renamed from: o */
    public FollowFeedFragment f88921o;

    /* renamed from: p */
    private boolean f88922p;

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ Fragment mo75080r() {
        return this.f88921o;
    }

    /* renamed from: l */
    public final String mo63006l() {
        return this.f88921o.mo73843v();
    }

    /* renamed from: u */
    public final C29452a mo66539h() {
        return (C29452a) this.f67571b;
    }

    /* renamed from: a */
    public final void mo86788a() {
        C34110a.m109790a((Fragment) this.f88921o, (C34113a) null);
    }

    /* renamed from: t */
    public final void mo86797t() {
        if (this.f88922p) {
            this.f88922p = false;
            ((C29452a) this.f67571b).f77663d = false;
            C42961az.m136380a(new C28309ae("DISCOVER"));
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        if (this.f67571b != null && this.f67572c != null && ((C34271f) this.f67572c).isViewValid()) {
            mo86797t();
            boolean z = false;
            ((C34271f) this.f67572c).mo75153a(false);
            int i = ((C29452a) this.f67571b).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    C34271f fVar = (C34271f) this.f67572c;
                    List items = ((C29452a) this.f67571b).getItems();
                    if (((C29452a) this.f67571b).isHasMore() && !((C29452a) this.f67571b).isNewDataEmpty()) {
                        z = true;
                    }
                    fVar.mo75161b(items, z);
                }
                return;
            }
            C42961az.m136380a(new C21752c(0));
            if (((C29452a) this.f67571b).isDataEmpty()) {
                ((C34271f) this.f67572c).mo75133a(3);
                ((C34271f) this.f67572c).mo87041d(false);
                return;
            }
            ((C34271f) this.f67572c).f89405o = ((C29452a) this.f67571b).f77667h;
            ((C34271f) this.f67572c).mo75152a(((C29452a) this.f67571b).getItems(), ((C29452a) this.f67571b).isHasMore());
            ((C34271f) this.f67572c).mo87041d(((C29452a) this.f67571b).mo75451d());
            ((C34271f) this.f67572c).f89408v = ((C29452a) this.f67571b).mo75453f();
        }
    }

    public C34126b(FollowFeedFragment followFeedFragment) {
        this.f88921o = followFeedFragment;
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f88921o.mo73843v();
    }

    @C7709l
    public void onHideUploadRecoverEvent(C39327e eVar) {
        m109901c(eVar.f102146a);
    }

    /* renamed from: b */
    public final void mo86794b(boolean z) {
        ((C29452a) this.f67571b).f77663d = z;
        this.f88922p = z;
    }

    /* renamed from: b */
    public final void mo58088b(Aweme aweme) {
        boolean z;
        String str;
        if (aweme.getAuthor().getFollowStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        C34138b.m109989a(str, mo64928a(true), aweme);
    }

    /* renamed from: c */
    public final C25673a mo58090c(Aweme aweme) {
        C29452a u = mo66539h();
        if (u != null && u.mo75448b()) {
            u.mo75447a(new FollowFeed(aweme));
        }
        return u;
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (this.f67572c != null && ((C34271f) this.f67572c).isViewValid() && !TextUtils.isEmpty(followStatus.userId)) {
            ((C34271f) this.f67572c).mo87035a(followStatus);
        }
    }

    /* renamed from: c */
    private void m109901c(boolean z) {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.getPublishService().setUploadRecoverPath(null);
        }
        if (this.f67572c != null && ((C34271f) this.f67572c).isViewValid()) {
            ((C34271f) this.f67572c).mo87042e(z);
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        mo86797t();
        Throwable a = C22814a.m75241a((Throwable) exc);
        if (a instanceof ApiServerException) {
            C6907h.m21524a("homepage_follow_monitor", (Map) C22984d.m75611a().mo59973a("error_type", "follow_feed_error").mo59970a("error_code", ((ApiServerException) a).getErrorCode()).f60753a);
        } else {
            C6907h.m21524a("homepage_follow_monitor", (Map) C22984d.m75611a().mo59973a("error_type", "follow_feed_error").mo59970a("error_code", 4).f60753a);
        }
    }
}
