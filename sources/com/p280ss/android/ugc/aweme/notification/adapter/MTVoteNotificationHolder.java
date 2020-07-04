package com.p280ss.android.ugc.aweme.notification.adapter;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34367o;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.C34586c;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder */
public final class MTVoteNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f89762d;

    /* renamed from: e */
    private final View f89763e;

    /* renamed from: f */
    private final AvatarImageWithVerify f89764f;

    /* renamed from: g */
    private final AvatarImageView f89765g;

    /* renamed from: k */
    private final AvatarImageView f89766k;

    /* renamed from: l */
    private final TextView f89767l;

    /* renamed from: m */
    private final TextView f89768m;

    /* renamed from: n */
    private final RemoteImageView f89769n;

    /* renamed from: o */
    private C34367o f89770o;

    /* renamed from: p */
    private boolean f89771p = true;

    /* renamed from: q */
    private BaseNotice f89772q;

    /* renamed from: b */
    private void m111212b(String str) {
        m111206a("pollsticker", getLayoutPosition());
        C7195s.m22438a().mo18682a(C7203u.m22460a(str).mo18694a("refer", "message").mo18695a());
    }

    public MTVoteNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f89762d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f89763e = findViewById2;
        View findViewById3 = view.findViewById(R.id.c6w);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.…notification_head_single)");
        this.f89764f = (AvatarImageWithVerify) findViewById3;
        View findViewById4 = view.findViewById(R.id.c6x);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        this.f89765g = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c6y);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        this.f89766k = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.notification_name)");
        this.f89767l = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.notification_content)");
        this.f89768m = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.c61);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.notification_cover)");
        this.f89769n = (RemoteImageView) findViewById8;
        C34538e.m111690b(this.f89762d);
        C34626j.m111876a(this.f89763e);
        C34626j.m111876a(this.f89769n);
        OnClickListener onClickListener = this;
        this.f89762d.setOnClickListener(onClickListener);
        this.f89763e.setOnClickListener(onClickListener);
        this.f89764f.setOnClickListener(onClickListener);
        this.f89769n.setOnClickListener(onClickListener);
        ((C13438a) this.f89769n.getHierarchy()).mo32898b((int) R.color.ee);
        C34538e.m111689a((View) this.f89769n);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34397e.m111248a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        C34367o oVar = this.f89770o;
        if (oVar != null) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == R.id.c61) || ((num != null && num.intValue() == R.id.c6v) || (num != null && num.intValue() == R.id.c7r))) {
                m111212b(oVar.f89574g);
            } else {
                if (num != null && num.intValue() == R.id.c6w) {
                    List<? extends User> list = oVar.f89568a;
                    if (list != null) {
                        User user = (User) C7525m.m23513g(list);
                        if (user != null) {
                            String uid = user.getUid();
                            if (uid != null) {
                                List<? extends User> list2 = oVar.f89568a;
                                if (list2 != null) {
                                    User user2 = (User) C7525m.m23513g(list2);
                                    if (user2 != null) {
                                        String secUid = user2.getSecUid();
                                        if (secUid != null) {
                                            MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, this.f89772q, false, (String) null, 24, (Object) null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87670a(BaseNotice baseNotice, boolean z, boolean z2, String str, String str2) {
        String str3;
        BaseNotice baseNotice2 = baseNotice;
        C7573i.m23587b(baseNotice2, "notice");
        C7573i.m23587b(str2, "enterFrom");
        if (baseNotice.getVoteNotice() != null) {
            this.f89772q = baseNotice2;
            this.f89771p = z2;
            this.f89770o = baseNotice.getVoteNotice();
            C34367o oVar = this.f89770o;
            if (oVar != null) {
                List<? extends User> list = oVar.f89568a;
                if (list != null) {
                    int size = list.size();
                    if (size > 0) {
                        mo87868a(this.f89767l, list, 3, oVar.f89571d, this.f89772q, z2, str, str2);
                        if (size == 1) {
                            this.f89764f.setVisibility(0);
                            this.f89765g.setVisibility(8);
                            this.f89766k.setVisibility(8);
                            UserVerify userVerify = new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType()), ((User) list.get(0)).getWeiboVerify());
                            this.f89764f.setUserData(userVerify);
                            this.f89763e.setVisibility(8);
                            this.f89764f.mo60896b();
                        } else {
                            this.f89763e.setVisibility(0);
                            this.f89764f.setVisibility(8);
                            this.f89765g.setVisibility(0);
                            this.f89766k.setVisibility(0);
                            C23323e.m76524b(this.f89765g, ((User) list.get(0)).getAvatarThumb());
                            C23323e.m76524b(this.f89766k, ((User) list.get(1)).getAvatarThumb());
                        }
                        if (size == 1) {
                            str3 = this.f89761c.getString(R.string.fq8, new Object[]{oVar.f89570c});
                        } else {
                            str3 = this.f89761c.getString(R.string.fq6);
                        }
                        C34586c.m111818a(this.f89768m, new SpannableStringBuilder(str3), baseNotice2, 7, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 148.0f)));
                        C23323e.m76524b(this.f89769n, oVar.f89569b);
                    }
                }
            }
        }
    }
}
