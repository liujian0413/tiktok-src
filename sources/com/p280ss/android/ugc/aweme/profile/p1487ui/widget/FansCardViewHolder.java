package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowingFollowerActivity.C29667a;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36718ah;
import com.p280ss.android.ugc.aweme.profile.util.C36718ah.C36721a;
import com.p280ss.android.ugc.aweme.profile.util.C36735h;
import com.p280ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder */
public class FansCardViewHolder extends C1293v {

    /* renamed from: a */
    public Context f96027a;

    /* renamed from: b */
    public FollowerDetail f96028b;

    /* renamed from: c */
    public boolean f96029c;

    /* renamed from: d */
    private int f96030d;

    /* renamed from: e */
    private View f96031e;

    /* renamed from: f */
    private C36718ah f96032f = new C36718ah();

    /* renamed from: g */
    private User f96033g;

    /* renamed from: h */
    private int f96034h;
    ImageView ivDetailFans;
    CircleImageView ivFansPlatform;
    TextView txtFansCount;
    TextView txtPlatform;

    /* renamed from: a */
    public final boolean mo92822a() {
        return TextUtils.equals(this.f96028b.getPackageName(), "com.ss.android.article.news");
    }

    /* renamed from: c */
    public final boolean mo92824c() {
        return TextUtils.equals(this.f96028b.getPackageName(), "com.ss.android.ugc.aweme");
    }

    /* renamed from: e */
    public final boolean mo92826e() {
        if (this.f96030d >= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo92823b() {
        this.f96032f.mo93046a(this.f96027a, this.f96028b, this.f96033g, new C36721a() {
            /* renamed from: a */
            public final void mo92828a() {
                String str;
                String str2;
                String openUrl = FansCardViewHolder.this.f96028b.getOpenUrl();
                if (!FansCardViewHolder.this.f96029c || !FansCardViewHolder.this.mo92822a()) {
                    if (!TextUtils.isEmpty(openUrl)) {
                        Uri parse = Uri.parse(openUrl);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(parse);
                        try {
                            if (C6776h.m20944a(FansCardViewHolder.this.f96027a, intent)) {
                                FansCardViewHolder.this.f96027a.startActivity(intent);
                                MobClick eventName = MobClick.obtain().setEventName("app_awake_from_fans_power");
                                if (!FansCardViewHolder.this.f96029c) {
                                    str = "personal_homepage";
                                } else if (FansCardViewHolder.this.mo92826e()) {
                                    str = "personal_fans_page";
                                } else {
                                    str = "others_fans_page";
                                }
                                C6907h.onEvent(eventName.setLabelName(str).setJsonObject(new C6869c().mo16887a("to_app", FansCardViewHolder.this.f96028b.getAppName()).mo16888b()));
                            }
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    return;
                }
                try {
                    AwemeSSOPlatformUtils.m136205a(FansCardViewHolder.this.f96027a, FansCardViewHolder.this.f96028b.getPackageName(), C21115b.m71197a().getCurUserId());
                    MobClick eventName2 = MobClick.obtain().setEventName("app_awake_from_fans_power");
                    if (FansCardViewHolder.this.mo92826e()) {
                        str2 = "others_fans_page";
                    } else {
                        str2 = "personal_homepage";
                    }
                    C6907h.onEvent(eventName2.setLabelName(str2).setJsonObject(new C6869c().mo16887a("to_app", FansCardViewHolder.this.f96028b.getAppName()).mo16888b()));
                } catch (Exception unused2) {
                }
            }
        });
    }

    /* renamed from: f */
    private void m118092f() {
        this.ivDetailFans.setAlpha(0.6f);
        this.ivFansPlatform.setAlpha(0.6f);
        this.txtPlatform.setTextColor(C0683b.m2912c(this.f96027a, R.color.a64));
        this.txtFansCount.setTextColor(C0683b.m2912c(this.f96027a, R.color.a64));
    }

    /* renamed from: d */
    public final void mo92825d() {
        User curUser = C21115b.m71197a().getCurUser();
        C29667a aVar = new C29667a(this.f96027a, null, C21115b.m71197a().getCurUserId(), true, PageType.follower, this.f96034h);
        aVar.mo75664a(curUser).mo75665a();
    }

    public FansCardViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f96027a = view.getContext();
        this.f96031e = view.findViewById(R.id.ahz);
    }

    /* renamed from: a */
    public final void mo92821a(final FollowerDetail followerDetail, int i, final boolean z, boolean z2, User user) {
        int i2;
        if (followerDetail != null) {
            this.f96028b = followerDetail;
            this.f96030d = i;
            this.f96029c = z;
            this.f96033g = user;
            this.f96034h = followerDetail.getFansCount();
            this.txtFansCount.setText(String.valueOf(C36735h.m118415a(followerDetail.getFansCount())));
            this.txtPlatform.setText(followerDetail.getName());
            C23323e.m76514a((RemoteImageView) this.ivFansPlatform, followerDetail.getIcon());
            if (!mo92824c()) {
                m118092f();
            }
            if (mo92826e() && this.f96031e != null) {
                View view = this.f96031e;
                if (z2) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view.setVisibility(i2);
            }
            if (mo92824c()) {
                this.ivDetailFans.setVisibility(4);
            }
            this.itemView.setOnClickListener(new OnClickListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
                    if (r3.f96037c.mo92824c() == false) goto L_0x0060;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r4) {
                    /*
                        r3 = this;
                        com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                        com.ss.android.ugc.aweme.common.MobClick r4 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r0 = "fans_click_from_fans_power"
                        com.ss.android.ugc.aweme.common.MobClick r4 = r4.setEventName(r0)
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        boolean r0 = r0.mo92826e()
                        if (r0 == 0) goto L_0x001f
                        boolean r0 = r3
                        if (r0 == 0) goto L_0x001c
                        java.lang.String r0 = "personal_fans_page"
                        goto L_0x0021
                    L_0x001c:
                        java.lang.String r0 = "others_fans_page"
                        goto L_0x0021
                    L_0x001f:
                        java.lang.String r0 = "personal_homepage"
                    L_0x0021:
                        com.ss.android.ugc.aweme.common.MobClick r4 = r4.setLabelName(r0)
                        com.ss.android.ugc.aweme.app.g.c r0 = new com.ss.android.ugc.aweme.app.g.c
                        r0.<init>()
                        java.lang.String r1 = "to_app"
                        com.ss.android.ugc.aweme.profile.model.FollowerDetail r2 = r1
                        java.lang.String r2 = r2.getAppName()
                        com.ss.android.ugc.aweme.app.g.c r0 = r0.mo16887a(r1, r2)
                        org.json.JSONObject r0 = r0.mo16888b()
                        com.ss.android.ugc.aweme.common.MobClick r4 = r4.setJsonObject(r0)
                        com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r4)
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        boolean r4 = r4.mo92826e()
                        if (r4 == 0) goto L_0x0052
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        boolean r4 = r4.mo92824c()
                        if (r4 != 0) goto L_0x0065
                        goto L_0x0060
                    L_0x0052:
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        boolean r4 = r4.mo92824c()
                        if (r4 == 0) goto L_0x0060
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        r4.mo92825d()
                        return
                    L_0x0060:
                        com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.this
                        r4.mo92823b()
                    L_0x0065:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder.C365971.onClick(android.view.View):void");
                }
            });
        }
    }
}
