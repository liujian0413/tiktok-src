package com.p280ss.android.ugc.aweme.main;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.video.C43238k;
import com.p280ss.android.ugc.aweme.video.C43316v;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.main.bb */
public final class C32897bb extends TiktokBaseMainHelper {

    /* renamed from: a */
    public boolean f85835a;

    /* renamed from: g */
    private boolean m106480g() {
        return m106481h();
    }

    /* renamed from: a */
    public final boolean mo84580a() {
        if (m106480g()) {
            return false;
        }
        return mo84583e();
    }

    /* renamed from: h */
    private boolean m106481h() {
        boolean isCommentListShowing = C24217a.m79549a().isCommentListShowing(this.f85784b);
        this.f85835a = isCommentListShowing;
        if (!isCommentListShowing) {
            return false;
        }
        C24217a.m79549a().hideCommentList(this.f85784b);
        return true;
    }

    /* renamed from: b */
    public final void mo84581b() {
        super.mo84581b();
        C43316v.m137450K().mo104949y();
        C43238k.m137170a().mo104978b();
        BusinessComponentServiceUtils.getMainHelperService().mo84623b();
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).clearCache();
    }

    protected C32897bb(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public static void m106479a(String str) {
        C6907h.m21524a("press_back", (Map) C22984d.m75611a().mo59973a("enter_from", str).f60753a);
    }
}
