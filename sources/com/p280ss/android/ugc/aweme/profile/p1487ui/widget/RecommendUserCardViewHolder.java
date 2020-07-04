package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36748p;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder */
public class RecommendUserCardViewHolder extends C1293v implements OnClickListener, C36040n {

    /* renamed from: a */
    public User f96181a;

    /* renamed from: b */
    private View f96182b;

    /* renamed from: c */
    private AvatarImageWithVerify f96183c;

    /* renamed from: d */
    private TextView f96184d;

    /* renamed from: e */
    private TextView f96185e;

    /* renamed from: f */
    private TextView f96186f;

    /* renamed from: g */
    private int f96187g;

    /* renamed from: h */
    private C36633a f96188h;

    /* renamed from: i */
    private C36634b f96189i;

    /* renamed from: j */
    private Context f96190j;

    /* renamed from: k */
    private C36031j f96191k;

    /* renamed from: l */
    private C36630b f96192l;

    /* renamed from: m */
    private final View f96193m;

    /* renamed from: n */
    private String f96194n;

    /* renamed from: o */
    private int f96195o;

    /* renamed from: p */
    private View f96196p;

    /* renamed from: q */
    private ImageView f96197q;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$a */
    public interface C36633a {
        /* renamed from: a */
        void mo92946a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$b */
    public interface C36634b {
        /* renamed from: a */
        void mo92926a(int i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92952a() {
        m118210a(this.f96181a);
    }

    /* renamed from: c */
    private void m118213c() {
        boolean z;
        IIMService g = C30553b.m99810g();
        Context context = this.f96190j;
        if (this.f96181a.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        g.wrapperSyncXAlert(context, 2, z, new C36669d(this));
    }

    /* renamed from: e */
    private String m118216e() {
        if (this.f96195o == 1) {
            return "homepage_follow";
        }
        if (this.f96195o == 2) {
            return "homepage_friends";
        }
        return "others_homepage";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1 != null) goto L_0x0075;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo92954b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x001c
            android.app.Activity r0 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.profile.ui.widget.e r4 = new com.ss.android.ugc.aweme.profile.ui.widget.e
            r4.<init>(r5)
            com.p280ss.android.ugc.aweme.login.C32656f.m105744a(r0, r2, r3, r1, r4)
            return
        L_0x001c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.f96181a
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L_0x002f
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$b r0 = r5.f96189i
            if (r0 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder$b r0 = r5.f96189i
            int r2 = r5.f96187g
            r0.mo92926a(r2)
        L_0x002f:
            android.content.Context r0 = r5.f96190j
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r5.f96190j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r5.f96190j
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x003e:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.f96181a
            int r0 = r0.getFollowStatus()
            r2 = 1
            r3 = 0
            r4 = 4
            if (r0 == r4) goto L_0x0063
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0063;
                case 2: goto L_0x0063;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0063
        L_0x004d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.f96181a
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0057
            r3 = 4
            goto L_0x0063
        L_0x0057:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.f96181a
            int r0 = r0.getFollowerStatus()
            if (r0 != r2) goto L_0x0062
            r2 = 2
            r3 = 2
            goto L_0x0063
        L_0x0062:
            r3 = 1
        L_0x0063:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.f96181a
            int r0 = r0.getFollowStatus()
            if (r0 != r4) goto L_0x006e
            if (r1 == 0) goto L_0x0078
            goto L_0x0075
        L_0x006e:
            if (r3 != r4) goto L_0x0075
            if (r1 == 0) goto L_0x0078
            m118209a(r1)
        L_0x0075:
            r5.m118208a(r3)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder.mo92954b():void");
    }

    public void onFollowFail(Exception exc) {
        if (!C23645b.m77551a(exc)) {
            C22814a.m75245a(this.f96190j, exc, R.string.b82);
        }
        m118212b(this.f96181a.getFollowStatus());
    }

    /* renamed from: c */
    private void m118214c(int i) {
        this.f96186f.setPadding(0, 0, 0, 0);
        this.f96186f.setGravity(17);
        this.f96186f.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    private void m118208a(int i) {
        int i2;
        String str;
        m118212b(i);
        if (this.f96181a.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C36031j jVar = this.f96191k;
        C36034a a = new C36034a().mo91684a(this.f96181a.getUid()).mo91686b(this.f96181a.getSecUid()).mo91682a(i2);
        if (this.f96195o == 1) {
            str = "homepage_follow";
        } else {
            str = "others_homepage";
        }
        jVar.mo91679a(a.mo91688c(str).mo91685b(12).mo91689d(this.f96181a.getFollowerStatus()).mo91681a());
    }

    /* renamed from: b */
    private void m118212b(int i) {
        this.f96186f.setVisibility(0);
        Resources resources = this.f96190j.getResources();
        if (i == 0) {
            this.f96186f.setText(resources.getText(R.string.b7r));
            this.f96186f.setBackgroundResource(R.drawable.lv);
            this.f96186f.setTextColor(resources.getColor(R.color.lt));
        } else if (i == 1 || i == 2) {
            m118214c(-1);
            int i2 = R.string.b92;
            if (i == 2) {
                i2 = R.string.aua;
            }
            this.f96186f.setText(i2);
            this.f96186f.setTextColor(resources.getColor(R.color.a50));
            this.f96186f.setBackgroundResource(R.drawable.m8);
        } else {
            if (i == 4) {
                this.f96186f.setTextColor(resources.getColor(R.color.a50));
                this.f96186f.setBackgroundResource(R.drawable.m8);
                this.f96186f.setText(this.f96190j.getString(R.string.b8v));
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f96181a.getUid())) {
            this.f96181a.setFollowStatus(followStatus.followStatus);
            C42961az.m136380a(new C23661d(followStatus.followStatus, this.f96181a));
            m118212b(followStatus.followStatus);
            m118211a(this.f96181a, followStatus.followStatus);
            if (C36748p.m118458a(this.f96190j, this.f96181a, followStatus)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(this.f96190j);
                remarkEditDialog.f96236f = this.f96181a;
                remarkEditDialog.f96237g = followStatus.contactName;
                remarkEditDialog.f96238h = 1;
                remarkEditDialog.f96235e = new C36671f(this);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(this.f96181a.getRemarkName())) {
                this.f96181a.setRemarkName("");
                m118210a(this.f96181a);
            }
        }
    }

    /* renamed from: a */
    private static void m118209a(Activity activity) {
        C22903bl privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.mo59877d()).intValue();
        if (intValue == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        } else if (intValue > 0 && intValue < 4) {
            C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(intValue + 1));
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.x_) {
            if (C7213d.m22500a().mo18809i()) {
                C10761a.m31409e(view.getContext(), (int) R.string.fh_).mo25750a();
            }
            if (this.f96188h != null) {
                this.f96188h.mo92946a(this.f96181a, this.f96187g);
            }
        } else if (id == R.id.ic) {
            if (this.f96192l != null) {
                this.f96192l.mo72053d(this.f96181a, this.f96187g);
            }
            if (this.f96181a != null) {
                UserProfileActivity.m117386a(this.f96190j, C42914ab.m136242a().mo104633a("uid", this.f96181a.getUid()).mo104630a("from_recommend_card", 1).mo104633a("sec_user_id", this.f96181a.getSecUid()).mo104633a("enter_from", m118216e()).mo104633a("enter_from_request_id", this.f96194n).mo104633a("extra_previous_page_position", "card_head").mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", this.f96181a.getRecommendReason()).mo104633a("recommend_from_type", "card").f111445a);
            }
        } else if (id == R.id.anj) {
            if (this.f96192l != null) {
                this.f96192l.mo72052c(this.f96181a, this.f96187g);
            }
            m118213c();
        }
    }

    /* renamed from: a */
    private void m118210a(User user) {
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f96184d.setText(this.f96181a.getNickname());
            this.f96182b.setContentDescription(this.f96181a.getNickname());
            this.f96183c.setContentDescription(this.f96181a.getNickname());
            return;
        }
        this.f96184d.setText(this.f96181a.getRemarkName());
        this.f96182b.setContentDescription(this.f96181a.getRemarkName());
        this.f96183c.setContentDescription(this.f96181a.getNickname());
    }

    /* renamed from: a */
    private void m118211a(User user, int i) {
        String str;
        if (C7213d.m22500a().mo18785ax() == 1 || C7213d.m22500a().mo18785ax() == 3) {
            TextView textView = this.f96184d;
            View view = this.f96196p;
            if (this.f96195o == 1) {
                str = "homepage_follow_rec_cards";
            } else {
                str = "others_homepage_rec_cards";
            }
            C36694aa.m118343a(user, i, textView, view, str, true);
        }
    }

    public RecommendUserCardViewHolder(View view, int i) {
        super(view);
        this.f96190j = view.getContext();
        this.f96182b = view.findViewById(R.id.e9b);
        C0991u.m4206c(this.f96182b, 1);
        this.f96183c = (AvatarImageWithVerify) view.findViewById(R.id.ic);
        this.f96183c.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f96193m = view.findViewById(R.id.cwi);
        this.f96184d = (TextView) view.findViewById(R.id.e9m);
        this.f96185e = (TextView) view.findViewById(R.id.cpb);
        this.f96186f = (TextView) view.findViewById(R.id.anj);
        this.f96196p = view.findViewById(R.id.b8s);
        this.f96197q = (ImageView) view.findViewById(R.id.x_);
        this.f96197q.setOnClickListener(this);
        if (C7213d.m22500a().mo18809i()) {
            this.f96197q.setImageResource(R.drawable.a1e);
            LayoutParams layoutParams = this.f96197q.getLayoutParams();
            layoutParams.width = (int) C9738o.m28708b(this.f96190j, -2.0f);
            layoutParams.height = (int) C9738o.m28708b(this.f96190j, -2.0f);
            this.f96197q.setLayoutParams(layoutParams);
        }
        this.f96182b.setOnClickListener(this);
        this.f96183c.setOnClickListener(this);
        this.f96186f.setOnClickListener(this);
        if (this.f96191k == null) {
            this.f96191k = new C36031j();
            this.f96191k.mo66537a(this);
        }
        this.f96195o = i;
    }

    /* renamed from: a */
    public final void mo92953a(User user, int i, C36633a aVar, C36634b bVar, C36630b bVar2, int i2, String str) {
        if (user != null) {
            this.f96192l = bVar2;
            this.f96181a = user;
            this.f96188h = aVar;
            this.f96189i = bVar;
            this.f96187g = i;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f96183c.setUserData(userVerify);
            if (C6399b.m19944t()) {
                this.f96183c.mo60896b();
            }
            m118210a(this.f96181a);
            if (!C6399b.m19944t() || this.f96195o != 0) {
                this.f96185e.setText(this.f96181a.getRecommendReason());
            } else {
                StringBuilder sb = new StringBuilder("@");
                sb.append(this.f96181a.getUniqueId());
                this.f96185e.setText(sb.toString());
                this.f96185e.setMaxLines(1);
            }
            m118212b(this.f96181a.getFollowStatus());
            m118211a(this.f96181a, this.f96181a.getFollowStatus());
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f96193m.getLayoutParams();
            if (i != 0) {
                i2 = 0;
            }
            layoutParams.leftMargin = i2;
            this.f96193m.setLayoutParams(layoutParams);
            this.f96194n = str;
            if (C7213d.m22500a().mo18809i()) {
                this.f96197q.setImageResource(R.drawable.a1e);
                LayoutParams layoutParams2 = this.f96197q.getLayoutParams();
                layoutParams2.width = (int) C9738o.m28708b(this.f96190j, -2.0f);
                layoutParams2.height = (int) C9738o.m28708b(this.f96190j, -2.0f);
                this.f96197q.setLayoutParams(layoutParams2);
            }
            C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f96184d);
        }
    }
}
