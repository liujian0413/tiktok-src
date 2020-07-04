package com.p280ss.android.ugc.aweme.forward.p1269c;

import android.view.View;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29875f;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29902c;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29903d;
import com.p280ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.AbsFollowFeedDetailActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.c.k */
public class C29892k extends C29881c {

    /* renamed from: k */
    private View f78517k;

    /* renamed from: l */
    private boolean f78518l;

    /* renamed from: m */
    private Aweme f78519m;

    /* renamed from: g */
    public final void mo75886g() {
        if (this.f78494b != null && this.f78494b.getForwardItem() != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.f77398c.mo104682a(256);
            }
            String a = C29902c.m97929a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid());
            C29903d.m97930a().mo75966a(a, new C29902c(a, this.f78494b, null));
            OriginDetailActivity.m98170a(this.f78493a.mo75888b(), this.f78494b, this.f78496d, a, this.f78497e);
        }
    }

    /* renamed from: m */
    public final void mo75935m() {
        C29370e j = mo75927j();
        if (j != null) {
            j.f77398c.mo104682a(16777216);
            int[] iArr = new int[2];
            this.f78517k.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f78517k.getHeight(), this.f78517k.getWidth(), (float) this.f78493a.mo75888b().getResources().getDimensionPixelOffset(R.dimen.hf));
            AbsFollowFeedDetailActivity.m110065a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, this.f78496d, j.f77403h);
        }
    }

    /* renamed from: l */
    public final void mo75931l() {
        float f;
        if (this.f78494b != null) {
            this.f78518l = true;
            C29370e j = mo75927j();
            if (j != null) {
                j.f77398c.mo104682a(16777216);
                j.f77404i = true;
                int[] iArr = new int[2];
                this.f78517k.getLocationOnScreen(iArr);
                if (this.f78519m == null || this.f78519m.getVideo() == null) {
                    f = ((float) this.f78517k.getHeight()) / ((float) this.f78517k.getWidth());
                } else {
                    f = ((float) this.f78519m.getVideo().getHeight()) / ((float) this.f78519m.getVideo().getWidth());
                }
                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f78517k.getHeight(), this.f78517k.getWidth(), (float) this.f78493a.mo75888b().getResources().getDimensionPixelOffset(R.dimen.hf), f);
                AbsFollowFeedDetailActivity.m110062a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, 2, this.f78496d, j.f77403h);
            }
        }
    }

    public C29892k(C29875f fVar, C29376j jVar) {
        super(fVar, jVar);
        this.f78517k = fVar.mo75904o();
    }

    /* renamed from: a */
    public final void mo75881a(Aweme aweme, String str, String str2) {
        super.mo75881a(aweme, str, str2);
        this.f78519m = aweme.getForwardItem();
    }
}
