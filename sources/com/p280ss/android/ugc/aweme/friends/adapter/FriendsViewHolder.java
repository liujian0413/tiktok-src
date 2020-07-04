package com.p280ss.android.ugc.aweme.friends.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowAndInviteUserBtn;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsAdapter.C30014a;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.p1281a.C29999a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.FriendsViewHolder */
public class FriendsViewHolder<T extends User> extends C1293v {

    /* renamed from: a */
    AvatarImageWithVerify f78921a;

    /* renamed from: b */
    TextView f78922b;

    /* renamed from: c */
    TextView f78923c;

    /* renamed from: d */
    FollowAndInviteUserBtn f78924d;

    /* renamed from: e */
    ViewGroup f78925e;

    /* renamed from: f */
    TextView f78926f;

    /* renamed from: g */
    private final boolean f78927g;

    /* renamed from: h */
    private Context f78928h;

    /* renamed from: i */
    private T f78929i;

    /* renamed from: j */
    private int f78930j;

    /* renamed from: k */
    private C29999a f78931k;

    /* renamed from: a */
    public final void mo76218a() {
        if (this.f78929i != null) {
            this.f78924d.mo75747a(this.f78929i.getFollowStatus(), this.f78929i.getFollowerStatus());
        }
    }

    /* renamed from: b */
    public final void mo76221b() {
        if (m98412a(this.f78929i) != null) {
            if (!m98412a(this.f78929i).isInvited()) {
                this.f78924d.mo75745a();
            } else {
                this.f78924d.mo75746b();
            }
        }
    }

    /* renamed from: c */
    private void m98415c() {
        String str;
        if (this.f78929i != null) {
            if (C30027f.m98480a(this.f78928h) || !this.f78927g) {
                if (!TextUtils.isEmpty(this.f78929i.getUid())) {
                    int i = 1;
                    if (this.f78929i.getFollowStatus() == 0) {
                        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName(m98413a(this.f78930j)).setValue(this.f78929i.getUid()).setJsonObject(new C6909j().mo16966a("nt", "4").mo16967a()));
                        C6907h.m21524a("follow", (Map) C22984d.m75611a().mo59973a("enter_from", m98413a(this.f78930j)).mo59973a("to_user_id", this.f78929i.getUid()).mo59973a("group_id", "").mo59975b().f60753a);
                    } else if (this.f78929i.getFollowStatus() == 1 || this.f78929i.getFollowStatus() == 4) {
                        C6907h.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(m98413a(this.f78930j)).setValue(this.f78929i.getUid()));
                        if (C6399b.m19944t()) {
                            str = "follow_cancel";
                        } else {
                            str = "unfollow";
                        }
                        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("enter_from", m98413a(this.f78930j)).mo59973a("to_user_id", this.f78929i.getUid()).mo59973a("group_id", "").f60753a);
                    }
                    if (this.f78931k != null) {
                        C29999a aVar = this.f78931k;
                        String uid = this.f78929i.getUid();
                        String secUid = this.f78929i.getSecUid();
                        int followerStatus = this.f78929i.getFollowerStatus();
                        if (this.f78929i.getFollowStatus() != 0) {
                            i = 0;
                        }
                        aVar.mo76197a(uid, secUid, followerStatus, i);
                        return;
                    }
                } else if (this.f78930j == 0 && C6399b.m19944t()) {
                    Friend a = m98412a(this.f78929i);
                    if (a != null && !a.isInvited()) {
                        C6907h.m21524a("invite_friend", (Map) C22984d.m75611a().mo59973a("enter_from", m98413a(this.f78930j)).f60753a);
                        this.f78931k.mo76196a(a);
                    }
                }
                return;
            }
            C10761a.m31399c(this.f78928h, (int) R.string.cjs).mo25750a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo76224d(View view) {
        m98415c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76219a(View view) {
        m98414a("click_card");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo76222b(View view) {
        m98414a("click_name");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo76223c(View view) {
        m98414a("click_head");
    }

    /* renamed from: a */
    private static Friend m98412a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* renamed from: a */
    private static String m98413a(int i) {
        switch (i) {
            case 0:
                if (C6399b.m19944t()) {
                    return "contact_friend";
                }
                return "phone_number";
            case 1:
                return "weibo";
            case 2:
                return "twitter";
            case 3:
                return "facebook";
            case 4:
                return "vk";
            default:
                return "";
        }
    }

    /* renamed from: a */
    private void m98414a(String str) {
        if (this.f78929i != null && !TextUtils.isEmpty(this.f78929i.getUid())) {
            C6907h.m21518a(this.f78928h, str, m98413a(this.f78930j), this.f78929i.getUid(), 0);
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", m98413a(this.f78930j)).mo59973a("enter_method", str).mo59973a("to_user_id", this.f78929i.getUid()).mo59973a("author_id", "").mo59973a("group_id", "").mo59973a("request_id", "").f60753a);
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) this.f78928h;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(this.f78929i.getUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f78929i.getSecUid()).mo18694a("from_discover", m98413a(this.f78930j)).mo18695a());
        }
    }

    public FriendsViewHolder(View view, C29999a aVar, boolean z) {
        super(view);
        this.f78927g = z;
        this.f78928h = view.getContext();
        this.f78921a = (AvatarImageWithVerify) view.findViewById(R.id.b64);
        this.f78922b = (TextView) view.findViewById(R.id.e7f);
        this.f78923c = (TextView) view.findViewById(R.id.e6q);
        this.f78924d = (FollowAndInviteUserBtn) view.findViewById(R.id.e6o);
        this.f78925e = (ViewGroup) view.findViewById(R.id.apj);
        this.f78931k = aVar;
        this.f78924d.setOnClickListener(new C30023b(this));
        this.f78921a.setOnClickListener(new C30024c(this));
        this.f78922b.setOnClickListener(new C30025d(this));
        this.f78925e.setOnClickListener(new C30026e(this));
        if (C6399b.m19944t()) {
            ((C13438a) this.f78921a.getAvatarImageView().getHierarchy()).mo32898b((int) R.drawable.a0r);
            this.f78926f = (TextView) view.findViewById(R.id.b0n);
            return;
        }
        ((C13438a) this.f78921a.getAvatarImageView().getHierarchy()).mo32898b((int) R.drawable.a_j);
    }

    /* renamed from: a */
    public final void mo76220a(T t, int i, int i2, FriendsAdapter<T> friendsAdapter) {
        if (t != null) {
            this.f78923c.setVisibility(0);
            this.f78929i = t;
            this.f78930j = i;
            UserVerify userVerify = new UserVerify(t.getAvatarThumb(), t.getCustomVerify(), t.getEnterpriseVerifyReason(), Integer.valueOf(t.getVerificationType()), t.getWeiboVerify());
            this.f78921a.setUserData(userVerify);
            if (t.getAvatarThumb() == null) {
                this.f78921a.getAvatarImageView().setController(null);
            }
            if (C6399b.m19944t()) {
                this.f78922b.setText(t.getNickname());
                if (m98412a(t) != null) {
                    if (TextUtils.isEmpty(m98412a(t).getSocialName())) {
                        this.f78923c.setText(C43122ff.m136777h(t));
                    } else {
                        this.f78923c.setText(m98412a(t).getSocialName());
                    }
                }
            } else if (this.f78930j == 0) {
                this.f78922b.setText(t.getThirdName());
                this.f78923c.setText(this.f78928h.getString(R.string.b_s, new Object[]{t.getNickname()}));
            } else {
                this.f78922b.setText(t.getNickname());
                this.f78923c.setText(this.f78928h.getString(R.string.b_s, new Object[]{t.getThirdName()}));
            }
            this.f78924d.mo75747a(t.getFollowStatus(), this.f78929i.getFollowerStatus());
            if (C6399b.m19944t() && this.f78930j == 0 && TextUtils.isEmpty(t.getUid()) && m98412a(t) != null) {
                if (m98412a(t).isInvited()) {
                    this.f78924d.mo75746b();
                } else {
                    this.f78924d.mo75745a();
                }
                C30014a b = friendsAdapter.mo76213b(i2);
                if (!TextUtils.isEmpty(b.f78920d)) {
                    this.f78926f.setVisibility(0);
                    this.f78926f.setText(b.f78920d);
                    return;
                }
                this.f78926f.setVisibility(8);
            }
        }
    }
}
