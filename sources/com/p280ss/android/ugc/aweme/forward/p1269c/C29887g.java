package com.p280ss.android.ugc.aweme.forward.p1269c;

import android.support.p022v4.app.FragmentActivity;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29361b;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29874e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.c.g */
public class C29887g extends C29881c {
    /* renamed from: d */
    public final void mo75883d() {
        super.mo75883d();
        mo75930a(false);
    }

    /* renamed from: f */
    public final void mo75885f() {
        super.mo75885f();
        mo75928k();
    }

    /* renamed from: c */
    public final void mo75882c() {
        if (!m97822m()) {
            super.mo75882c();
        }
    }

    /* renamed from: e */
    public final void mo75884e() {
        super.mo75884e();
        this.f78495c.mo75120e();
    }

    /* renamed from: m */
    private boolean m97822m() {
        if (!(this.f78493a.mo75888b() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m96850a(this.f78496d, (FragmentActivity) this.f78493a.mo75888b()).f77626a;
    }

    /* renamed from: g */
    public final void mo75886g() {
        if (this.f78494b != null && this.f78494b.getForwardItem() != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.f77398c.mo104682a(256);
            }
            ((C29361b) ServiceManager.get().getService(C29361b.class)).mo75037a(this.f78493a.mo75888b(), this.f78494b, this.f78496d, C29370e.m96465a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid()), "");
        }
    }

    /* renamed from: l */
    public final void mo75931l() {
        mo75923a((long) C40413c.f105051b);
        C29370e j = mo75927j();
        if (j != null) {
            j.f77398c.mo104682a(16777216);
            int[] iArr = new int[2];
            ImageView f = ((C29874e) this.f78493a).mo75898f();
            f.getLocationOnScreen(iArr);
            IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], f.getHeight(), f.getWidth(), (float) this.f78493a.mo75888b().getResources().getDimensionPixelOffset(R.dimen.hf));
            C29363d.m96451a().mo75035a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, this.f78496d, j.f77403h);
        }
    }

    /* renamed from: a */
    public final void mo75111a(int i) {
        super.mo75111a(i);
        mo75923a((long) C40413c.f105051b);
    }

    /* renamed from: a */
    public final void mo75930a(boolean z) {
        if (this.f78493a.mo75888b() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m96850a(this.f78496d, (FragmentActivity) this.f78493a.mo75888b()).f77626a = z;
        }
    }

    public C29887g(C29874e eVar, C29376j jVar) {
        super(eVar, jVar);
    }
}
