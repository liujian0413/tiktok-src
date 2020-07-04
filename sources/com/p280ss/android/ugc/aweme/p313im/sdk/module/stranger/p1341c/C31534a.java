package com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.p1341c;

import android.app.Activity;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6432c;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C31529a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.StrangerListActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31080b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c.a */
public final class C31534a implements C25675c<C7102a> {

    /* renamed from: a */
    public final SessionListAdapter f82542a;

    /* renamed from: b */
    public DmtStatusView f82543b;

    /* renamed from: c */
    public Activity f82544c;

    /* renamed from: d */
    private C31080b f82545d = new C31080b() {
        /* renamed from: b */
        public final void mo15540b(final Conversation conversation) {
            if (C31534a.this.f82544c != null && !C31534a.this.f82544c.isFinishing()) {
                C31534a.this.f82544c.runOnUiThread(new Runnable() {
                    public final void run() {
                        C31534a.this.mo82239a(conversation.getConversationId());
                        C31534a.this.f82542a.notifyDataSetChanged();
                        if (C31534a.this.f82542a.mo62312a() == null || C31534a.this.f82542a.mo62312a().isEmpty()) {
                            C31534a.this.f82543b.mo25943g();
                        }
                    }
                });
            }
        }
    };

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<C7102a> list, boolean z) {
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f82543b.mo25942f();
    }

    public final void aD_() {
        this.f82542a.ag_();
    }

    /* renamed from: e */
    public final void mo82240e() {
        if (C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20393c((Object) this);
        }
        C6417a.m20015a().mo15541b((C6432c) this.f82545d);
    }

    public final void ae_() {
        if (this.f82542a.f67566v) {
            this.f82542a.mo66516d(false);
            this.f82542a.mo66502g();
            this.f82542a.ah_();
        }
        if (this.f82542a.getItemCount() == 0) {
            mo82241f();
            this.f82543b.mo25943g();
        }
    }

    /* renamed from: f */
    public final void mo82241f() {
        if (!C31915n.m103671a() && (this.f82544c instanceof StrangerListActivity)) {
            DmtTextView rightTexView = ((StrangerListActivity) this.f82544c).f82525c.getRightTexView();
            if (rightTexView != null) {
                rightTexView.setTextColor(this.f82544c.getResources().getColor(R.color.vo));
                rightTexView.setEnabled(false);
                rightTexView.setClickable(false);
            }
            ((StrangerListActivity) this.f82544c).f82525c.getRightView().setEnabled(false);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f82542a.mo66507h();
    }

    /* renamed from: a */
    public final void mo82239a(String str) {
        List a = this.f82542a.mo62312a();
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (str.equals(((C7102a) it.next()).bf_())) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (this.f82542a.f67566v) {
            this.f82542a.mo66516d(false);
            this.f82542a.notifyDataSetChanged();
        }
        if (this.f82542a.getItemCount() == 0) {
            mo82241f();
            this.f82543b.mo25944h();
        }
    }

    @C7709l
    public final void onEvent(C31529a aVar) {
        if (aVar.f82535a == 0) {
            mo82239a(aVar.f82536b);
            this.f82542a.notifyDataSetChanged();
            if (this.f82542a.mo62312a().isEmpty()) {
                this.f82543b.mo25943g();
                mo82241f();
                C6978j.m21717a().mo18046a("stranger_1");
            }
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<C7102a> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f82542a.ah_();
        } else {
            this.f82542a.ai_();
        }
        this.f82542a.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<C7102a> list, boolean z) {
        this.f82542a.mo66516d(C6956a.m21633b().needSessionListShowMore());
        if (!z) {
            this.f82542a.ah_();
        } else {
            this.f82542a.ai_();
        }
        this.f82542a.mo58045a(list);
        if (list.isEmpty()) {
            mo82241f();
            this.f82543b.mo25943g();
            return;
        }
        this.f82543b.mo25939d();
    }

    public C31534a(Activity activity, SessionListAdapter sessionListAdapter, DmtStatusView dmtStatusView) {
        this.f82544c = activity;
        this.f82542a = sessionListAdapter;
        this.f82543b = dmtStatusView;
        this.f82543b.mo25942f();
        this.f82542a.mo66516d(true);
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        C6417a.m20015a().mo15535a((C6432c) this.f82545d);
    }
}
