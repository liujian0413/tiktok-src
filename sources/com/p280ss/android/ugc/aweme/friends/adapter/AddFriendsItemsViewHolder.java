package com.p280ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.invite.C30053b;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.friends.p1285ui.InviteFriendsActivity;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AddFriendsItemsViewHolder */
public class AddFriendsItemsViewHolder extends C1293v {

    /* renamed from: a */
    C30053b f78824a;

    /* renamed from: b */
    private AbsActivity f78825b;

    /* renamed from: c */
    private String f78826c;
    TextView mRedPointView;

    /* renamed from: a */
    private void m98358a() {
        int i;
        if (this.itemView != null) {
            View findViewById = this.itemView.findViewById(R.id.b2v);
            if (findViewById != null) {
                if (((Boolean) SharePrefCache.inst().isShowInviteContactsFriends().mo59877d()).booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                C9738o.m28712b(findViewById, i);
            }
        }
    }

    /* renamed from: b */
    private void m98359b() {
        C6907h.m21524a("invite_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").f60753a);
        this.f78825b.startActivity(InviteFriendsActivity.m98656a((Context) this.f78825b, this.f78826c));
    }

    /* renamed from: c */
    private void m98360c() {
        C6907h.m21524a("find_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("platform", "twitter").f60753a);
        this.f78825b.startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getInviteUserListActivityIntent(this.f78825b, 2));
    }

    /* renamed from: d */
    private void m98361d() {
        C6907h.m21524a("find_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("platform", "facebook").f60753a);
        this.f78825b.startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getInviteUserListActivityIntent(this.f78825b, 3));
    }

    /* renamed from: e */
    private void m98362e() {
        C6907h.m21524a("find_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("platform", "vk").f60753a);
        this.f78825b.startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getInviteUserListActivityIntent(this.f78825b, 4));
    }

    /* renamed from: f */
    private void m98363f() {
        C6907h.m21524a("find_friends", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("platform", "contact").f60753a);
        C19282c.m63182a(this.f78825b, "add_profile", "phone_number");
        this.f78825b.startActivity(ContactsActivity.m98571a(this.f78825b, this.f78826c, false));
    }

    /* renamed from: g */
    private void m98364g() {
        if (this.f78825b.isViewValid()) {
            if (this.mRedPointView.getVisibility() == 8) {
                this.mRedPointView.setVisibility(0);
            }
            this.mRedPointView.setText(String.valueOf(C34315c.m110974a(4)));
        }
    }

    /* renamed from: h */
    private void m98365h() {
        if (this.f78825b.isViewValid()) {
            if (this.mRedPointView.getVisibility() == 0) {
                this.mRedPointView.setVisibility(8);
                this.mRedPointView.setText("0");
            }
            if (C34315c.m110982b(4)) {
                C34315c.m110984c(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo76198a(boolean z) {
        if (z) {
            m98364g();
        } else {
            m98365h();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.e4) {
            m98361d();
        } else if (id == R.id.eb) {
            m98360c();
        } else if (id == R.id.ed) {
            m98362e();
        } else if (id == R.id.e1) {
            m98363f();
        } else {
            if (id == R.id.b2v) {
                m98359b();
            }
        }
    }

    public AddFriendsItemsViewHolder(View view, AbsActivity absActivity, String str) {
        String str2;
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f78825b = absActivity;
        this.f78826c = str;
        this.f78824a = new C30053b(view.getContext());
        C30053b bVar = this.f78824a;
        User curUser = C21115b.m71197a().getCurUser();
        String string = this.f78825b.getString(R.string.bva, new Object[]{this.f78825b.getString(R.string.jj)});
        if (C6399b.m19946v()) {
            str2 = this.f78825b.getString(R.string.cdm);
        } else {
            str2 = this.f78825b.getString(R.string.bv9, new Object[]{this.f78825b.getString(R.string.jj)});
        }
        bVar.mo76327a(curUser, string, str2);
        view.findViewById(R.id.eb).setVisibility(8);
        view.findViewById(R.id.ed).setVisibility(8);
        if (C32326h.m104879c()) {
            if (C6399b.m19946v()) {
                view.findViewById(R.id.ed).setVisibility(0);
            }
        } else if (C32326h.m104887i() && C6399b.m19947w()) {
            view.findViewById(R.id.eb).setVisibility(0);
        }
        m98358a();
    }
}
