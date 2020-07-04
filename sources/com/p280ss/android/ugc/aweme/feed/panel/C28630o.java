package com.p280ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.guide.C28393i;
import com.p280ss.android.ugc.aweme.feed.listener.C28521f;
import com.p280ss.android.ugc.aweme.feed.listener.C28533o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28507v;
import com.p280ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.p280ss.android.ugc.aweme.follow.p1259b.C29443a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.main.p1379b.C32893b;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.o */
public final class C28630o extends C28633q {

    /* renamed from: a */
    public C28393i f75442a;

    /* renamed from: b */
    public C28521f f75443b;

    /* renamed from: c */
    public C28533o f75444c;

    /* renamed from: m */
    private boolean f75445m = true;

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final void mo73374ay() {
    }

    /* renamed from: g */
    public final void mo67628g() {
        this.f75326U.mo71833b();
    }

    /* renamed from: D */
    private boolean m94157D() {
        Activity activity = this.f113033ay;
        if (activity instanceof C33054j) {
            return ((C33054j) activity).isUnderSecondTab();
        }
        return false;
    }

    /* renamed from: z */
    private static void m94158z() {
        if (C34315c.m110982b(50)) {
            C34315c.m110984c(50);
            C42961az.m136380a(new C34314g(50, -1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo62993e() {
        if (C6399b.m19944t()) {
            return super.mo62993e();
        }
        if (C32904bi.m106497b()) {
            return m94157D();
        }
        return super.mo62993e();
    }

    public final void ae_() {
        super.ae_();
        if (C32904bi.m106497b()) {
            m94158z();
        }
        if (!(ay_() == null || ay_().getActivity() == null)) {
            FollowFeedTriggerViewModel.m96852a(ay_().getActivity()).mo75342a(true, true);
        }
        if (C6399b.m19944t() && mo73488bw()) {
            ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79716a(false);
        }
        if (this.f75394y != null && this.f75394y.getCount() > 0) {
            if (mo73488bw()) {
                mo73340aB();
            }
            this.f75394y.mo71589a(Collections.emptyList());
            this.f75394y.f73985a = false;
            View an = mo71911an();
            if (an != null) {
                an.setAlpha(0.0f);
            }
        }
        mo67647q();
        C28393i iVar = this.f75442a;
        if (iVar != null) {
            iVar.mo72034a(this.f75324S);
        }
        if (this.f75444c != null) {
            this.f75444c.mo68436j();
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        super.onFollowSuccess(followStatus);
        if (followStatus != null && followStatus.followStatus == 0) {
            mo73495h(followStatus.userId);
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        FollowFeedTriggerViewModel.m96852a(ay_().getActivity()).mo75342a(false, true);
        super.mo59105a_(exc);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        super.mo59107b(exc);
        C10761a.m31399c(mo105655bv(), (int) R.string.dxl).mo25750a();
    }

    @C7709l
    public final void onFollowCleanModeChangedEvent(C32893b bVar) {
        boolean z = C32891b.m106468a().f85832b;
        for (int i = 0; i < this.f75389t.getChildCount(); i++) {
            C28130ac f = mo73404f(i);
            if (f != null) {
                f.mo71533d(z);
            }
        }
    }

    @C7709l
    public final void onMaskLayerCancelFollowEvent(C29443a aVar) {
        if (aVar.f77645a != null) {
            mo73378b(aVar.f77645a, aVar.f77646b);
            C28507v.m93709a(aVar.f77645a, "long_press");
        }
    }

    public C28630o(String str, int i) {
        super(str, 1);
    }

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
        if (this.f75394y.getCount() == 0) {
            this.f75394y.mo71589a(list);
        } else {
            this.f75394y.mo71590a(list, i);
        }
        if (i >= 0 && i < this.f75394y.getCount()) {
            this.f75389t.setCurrentItem(i);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Aweme> list, boolean z) {
        if (this.f75442a != null) {
            this.f75442a.mo72040b();
        }
        if (this.f113033ay instanceof FragmentActivity) {
            FollowPageFirstFrameViewModel.m136066a((FragmentActivity) this.f113033ay).mo104572b();
        }
        super.mo59099a(list, z);
        FollowFeedTriggerViewModel.m96852a(ay_().getActivity()).mo75342a(true, false);
        if (!this.f75445m) {
            if (!C6307b.m19566a((Collection<T>) list)) {
                mo73413i((Aweme) list.get(0));
            }
            this.f75445m = false;
        }
        if (C6399b.m19944t() && mo73488bw()) {
            ScrollSwitchStateManager.m98918a((FragmentActivity) this.f113033ay).mo79716a(!C6307b.m19566a((Collection<T>) this.f75394y.mo71593b()));
        }
        if (C32904bi.m106497b()) {
            m94158z();
        }
        if (this.f75443b == null || !this.f75443b.mo72228f()) {
            C10761a.m31409e((Context) this.f113033ay, (int) R.string.am0).mo25750a();
            if (this.f75444c != null) {
                this.f75444c.mo68436j();
            }
            return;
        }
        final int currentItem = this.f75389t.getCurrentItem();
        final Aweme b = this.f75394y.mo67568b(currentItem);
        this.f75389t.post(new Runnable() {
            public final void run() {
                if (C28630o.this.f75389t != null) {
                    C28630o.this.f75395z = 0;
                    if (currentItem == 0) {
                        C28630o.this.mo73402e(b);
                        C28630o.this.f75307B = false;
                    } else {
                        C28630o.this.f75307B = true;
                        C28630o.this.f75389t.mo66753a(C28630o.this.f75395z, true);
                    }
                    if (C28630o.this.f75444c != null) {
                        C28630o.this.f75444c.mo68436j();
                    }
                }
            }
        });
    }
}
