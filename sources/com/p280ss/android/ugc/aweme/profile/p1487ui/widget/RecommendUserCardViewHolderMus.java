package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapterMus.C36631a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.util.C36748p;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus */
public final class RecommendUserCardViewHolderMus extends C1293v implements OnClickListener, C36040n {

    /* renamed from: a */
    public User f96198a;

    /* renamed from: b */
    private AvatarImageWithVerifyMus f96199b;

    /* renamed from: c */
    private TextView f96200c;

    /* renamed from: d */
    private TextView f96201d;

    /* renamed from: e */
    private TextView f96202e;

    /* renamed from: f */
    private int f96203f;

    /* renamed from: g */
    private C36635a f96204g;

    /* renamed from: h */
    private C36636b f96205h;

    /* renamed from: i */
    private Context f96206i;

    /* renamed from: j */
    private C36031j f96207j;

    /* renamed from: k */
    private C36631a f96208k;

    /* renamed from: l */
    private View f96209l;

    /* renamed from: m */
    private String f96210m;

    /* renamed from: n */
    private int f96211n;

    /* renamed from: o */
    private ImageView f96212o;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$a */
    public interface C36635a {
        /* renamed from: a */
        void mo92951a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$b */
    public interface C36636b {
        /* renamed from: a */
        void mo92939a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$c */
    static final /* synthetic */ class C36637c extends FunctionReference implements C7561a<C7581n> {
        C36637c(RecommendUserCardViewHolderMus recommendUserCardViewHolderMus) {
            super(0, recommendUserCardViewHolderMus);
        }

        public final String getName() {
            return "follow";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(RecommendUserCardViewHolderMus.class);
        }

        public final String getSignature() {
            return "follow()V";
        }

        /* renamed from: a */
        private void m118235a() {
            ((RecommendUserCardViewHolderMus) this.receiver).mo92956a();
        }

        public final /* synthetic */ Object invoke() {
            m118235a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$d */
    static final /* synthetic */ class C36638d extends FunctionReference implements C7561a<C7581n> {
        C36638d(RecommendUserCardViewHolderMus recommendUserCardViewHolderMus) {
            super(0, recommendUserCardViewHolderMus);
        }

        public final String getName() {
            return "follow";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(RecommendUserCardViewHolderMus.class);
        }

        public final String getSignature() {
            return "follow()V";
        }

        /* renamed from: a */
        private void m118236a() {
            ((RecommendUserCardViewHolderMus) this.receiver).mo92956a();
        }

        public final /* synthetic */ Object invoke() {
            m118236a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$e */
    static final class C36639e implements C36675j {

        /* renamed from: a */
        final /* synthetic */ RecommendUserCardViewHolderMus f96213a;

        C36639e(RecommendUserCardViewHolderMus recommendUserCardViewHolderMus) {
            this.f96213a = recommendUserCardViewHolderMus;
        }

        /* renamed from: a */
        public final void mo71634a() {
            this.f96213a.mo92957a(RecommendUserCardViewHolderMus.m118222a(this.f96213a));
        }
    }

    /* renamed from: b */
    public final User mo92959b() {
        User user = this.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        return user;
    }

    /* renamed from: d */
    private final String m118228d() {
        if (this.f96211n == 1) {
            return "homepage_follow";
        }
        if (this.f96211n == 2) {
            return "homepage_friends";
        }
        return "others_homepage";
    }

    /* renamed from: c */
    private final void m118226c() {
        boolean z;
        IIMService g = C30553b.m99810g();
        Context context = this.f96206i;
        User user = this.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        if (user.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        g.wrapperSyncXAlert(context, 2, z, new C36673h(new C36638d(this)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r1 != null) goto L_0x00b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92956a() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x002d
            android.app.Activity r0 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$c r4 = new com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$c
            r5 = r6
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus r5 = (com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus) r5
            r4.<init>(r5)
            kotlin.jvm.a.a r4 = (kotlin.jvm.p357a.C7561a) r4
            com.ss.android.ugc.aweme.profile.ui.widget.g r5 = new com.ss.android.ugc.aweme.profile.ui.widget.g
            r5.<init>(r4)
            com.ss.android.ugc.aweme.base.component.g r5 = (com.p280ss.android.ugc.aweme.base.component.C23305g) r5
            com.p280ss.android.ugc.aweme.login.C32656f.m105744a(r0, r2, r3, r1, r5)
            return
        L_0x002d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f96198a
            if (r0 != 0) goto L_0x0036
            java.lang.String r2 = "mUser"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0036:
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolderMus$b r0 = r6.f96205h
            if (r0 == 0) goto L_0x0045
            int r2 = r6.f96203f
            r0.mo92939a(r2)
        L_0x0045:
            android.content.Context r0 = r6.f96206i
            if (r0 == 0) goto L_0x005f
            android.content.Context r0 = r6.f96206i
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005f
            android.content.Context r0 = r6.f96206i
            if (r0 == 0) goto L_0x0057
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x005f
        L_0x0057:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x005f:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f96198a
            if (r0 != 0) goto L_0x0068
            java.lang.String r2 = "mUser"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0068:
            int r0 = r0.getFollowStatus()
            r2 = 1
            r3 = 0
            r4 = 4
            if (r0 == r4) goto L_0x0099
            switch(r0) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0099;
                case 2: goto L_0x0099;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x0099
        L_0x0075:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f96198a
            if (r0 != 0) goto L_0x007e
            java.lang.String r3 = "mUser"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x007e:
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0086
            r3 = 4
            goto L_0x0099
        L_0x0086:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f96198a
            if (r0 != 0) goto L_0x008f
            java.lang.String r3 = "mUser"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x008f:
            int r0 = r0.getFollowerStatus()
            if (r0 != r2) goto L_0x0098
            r2 = 2
            r3 = 2
            goto L_0x0099
        L_0x0098:
            r3 = 1
        L_0x0099:
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.f96198a
            if (r0 != 0) goto L_0x00a2
            java.lang.String r2 = "mUser"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00a2:
            int r0 = r0.getFollowStatus()
            if (r0 != r4) goto L_0x00ab
            if (r1 == 0) goto L_0x00b5
            goto L_0x00b2
        L_0x00ab:
            if (r3 != r4) goto L_0x00b2
            if (r1 == 0) goto L_0x00b5
            m118224a(r1)
        L_0x00b2:
            r6.m118223a(r3)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus.mo92956a():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ User m118222a(RecommendUserCardViewHolderMus recommendUserCardViewHolderMus) {
        User user = recommendUserCardViewHolderMus.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        return user;
    }

    /* renamed from: c */
    private final void m118227c(int i) {
        this.f96202e.setPadding(0, 0, 0, 0);
        this.f96202e.setGravity(17);
        this.f96202e.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public final void mo92957a(User user) {
        C7573i.m23587b(user, "user");
        if (TextUtils.isEmpty(user.getRemarkName())) {
            TextView textView = this.f96200c;
            User user2 = this.f96198a;
            if (user2 == null) {
                C7573i.m23583a("mUser");
            }
            textView.setText(user2.getNickname());
            return;
        }
        TextView textView2 = this.f96200c;
        User user3 = this.f96198a;
        if (user3 == null) {
            C7573i.m23583a("mUser");
        }
        textView2.setText(user3.getRemarkName());
    }

    public final void onFollowFail(Exception exc) {
        if (!C23645b.m77551a(exc)) {
            C22814a.m75245a(this.f96206i, exc, R.string.b82);
        }
        User user = this.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        m118225b(user.getFollowStatus());
    }

    /* renamed from: a */
    private final void m118223a(int i) {
        int i2;
        String str;
        m118225b(i);
        User user = this.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        if (user.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C36031j jVar = this.f96207j;
        if (jVar != null) {
            C36034a aVar = new C36034a();
            User user2 = this.f96198a;
            if (user2 == null) {
                C7573i.m23583a("mUser");
            }
            C36034a a = aVar.mo91684a(user2.getUid());
            User user3 = this.f96198a;
            if (user3 == null) {
                C7573i.m23583a("mUser");
            }
            C36034a a2 = a.mo91686b(user3.getSecUid()).mo91682a(i2);
            if (this.f96211n == 1) {
                str = "homepage_follow";
            } else {
                str = "others_homepage";
            }
            C36034a b = a2.mo91688c(str).mo91685b(12);
            User user4 = this.f96198a;
            if (user4 == null) {
                C7573i.m23583a("mUser");
            }
            jVar.mo91679a(b.mo91689d(user4.getFollowerStatus()).mo91681a());
        }
    }

    /* renamed from: b */
    private final void m118225b(int i) {
        this.f96202e.setVisibility(0);
        Resources resources = this.f96206i.getResources();
        if (i == 0) {
            this.f96202e.setText(resources.getText(R.string.b7r));
            this.f96202e.setBackgroundResource(R.drawable.lv);
            this.f96202e.setTextColor(resources.getColor(R.color.lt));
        } else if (i == 1 || i == 2) {
            m118227c(-1);
            int i2 = R.string.b92;
            if (i == 2) {
                i2 = R.string.aua;
            }
            this.f96202e.setText(i2);
            this.f96202e.setTextColor(resources.getColor(R.color.sv));
            this.f96202e.setBackgroundResource(R.drawable.m8);
        } else {
            if (i == 4) {
                this.f96202e.setBackgroundResource(R.drawable.m8);
                this.f96202e.setText(resources.getText(R.string.b8v));
                this.f96202e.setTextColor(resources.getColor(R.color.sv));
            }
        }
    }

    /* renamed from: a */
    private static void m118224a(Activity activity) {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        C7573i.m23582a((Object) privacyAccountFollowCount, "prefCacheItem");
        Integer num = (Integer) privacyAccountFollowCount.mo59877d();
        if (num != null && num.intValue() == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        } else {
            C7573i.m23582a((Object) num, "followCount");
            int intValue = num.intValue();
            if (1 <= intValue && 3 >= intValue) {
                C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
            }
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(num.intValue() + 1));
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.x_) {
            C36635a aVar = this.f96204g;
            if (aVar != null) {
                User user = this.f96198a;
                if (user == null) {
                    C7573i.m23583a("mUser");
                }
                aVar.mo92951a(user, this.f96203f);
            }
        } else if (id == R.id.ic) {
            C36631a aVar2 = this.f96208k;
            if (aVar2 != null) {
                User user2 = this.f96198a;
                if (user2 == null) {
                    C7573i.m23583a("mUser");
                }
                aVar2.mo92147d(user2, this.f96203f);
            }
            User user3 = this.f96198a;
            if (user3 == null) {
                C7573i.m23583a("mUser");
            }
            if (user3 != null) {
                Context context = this.f96206i;
                C42914ab a = C42914ab.m136242a();
                String str = "uid";
                User user4 = this.f96198a;
                if (user4 == null) {
                    C7573i.m23583a("mUser");
                }
                C42914ab a2 = a.mo104633a(str, user4.getUid());
                String str2 = "sec_user_id";
                User user5 = this.f96198a;
                if (user5 == null) {
                    C7573i.m23583a("mUser");
                }
                C42914ab a3 = a2.mo104633a(str2, user5.getSecUid()).mo104633a("enter_from", m118228d()).mo104633a("enter_from_request_id", this.f96210m).mo104633a("extra_previous_page_position", "card_head").mo104630a("need_track_compare_recommend_reason", 1);
                String str3 = "previous_recommend_reason";
                User user6 = this.f96198a;
                if (user6 == null) {
                    C7573i.m23583a("mUser");
                }
                UserProfileActivity.m117386a(context, a3.mo104633a(str3, user6.getRecommendReason()).mo104633a("recommend_from_type", "card").f111445a);
            }
        } else if (id == R.id.anj) {
            C36631a aVar3 = this.f96208k;
            if (aVar3 != null) {
                User user7 = this.f96198a;
                if (user7 == null) {
                    C7573i.m23583a("mUser");
                }
                aVar3.mo92146c(user7, this.f96203f);
            }
            m118226c();
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C7573i.m23587b(followStatus, "followStatus");
        CharSequence charSequence = followStatus.userId;
        User user = this.f96198a;
        if (user == null) {
            C7573i.m23583a("mUser");
        }
        if (TextUtils.equals(charSequence, user.getUid())) {
            User user2 = this.f96198a;
            if (user2 == null) {
                C7573i.m23583a("mUser");
            }
            user2.setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            User user3 = this.f96198a;
            if (user3 == null) {
                C7573i.m23583a("mUser");
            }
            C42961az.m136380a(new C23661d(i, user3));
            m118225b(followStatus.followStatus);
            Context context = this.f96206i;
            User user4 = this.f96198a;
            if (user4 == null) {
                C7573i.m23583a("mUser");
            }
            if (C36748p.m118458a(context, user4, followStatus)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(this.f96206i);
                User user5 = this.f96198a;
                if (user5 == null) {
                    C7573i.m23583a("mUser");
                }
                remarkEditDialog.f96236f = user5;
                remarkEditDialog.f96237g = followStatus.contactName;
                remarkEditDialog.f96238h = 1;
                remarkEditDialog.f96235e = new C36639e(this);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0) {
                User user6 = this.f96198a;
                if (user6 == null) {
                    C7573i.m23583a("mUser");
                }
                if (!TextUtils.isEmpty(user6.getRemarkName())) {
                    User user7 = this.f96198a;
                    if (user7 == null) {
                        C7573i.m23583a("mUser");
                    }
                    user7.setRemarkName("");
                    User user8 = this.f96198a;
                    if (user8 == null) {
                        C7573i.m23583a("mUser");
                    }
                    mo92957a(user8);
                }
            }
        }
    }

    public RecommendUserCardViewHolderMus(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f96206i = context;
        View findViewById = view.findViewById(R.id.ic);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.avatar)");
        this.f96199b = (AvatarImageWithVerifyMus) findViewById;
        View findViewById2 = view.findViewById(R.id.cwi);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.root)");
        this.f96209l = findViewById2;
        View findViewById3 = view.findViewById(R.id.e9m);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.user_name)");
        this.f96200c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cpb);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.recommend_reason)");
        this.f96201d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.anj);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.follow)");
        this.f96202e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.close)");
        this.f96212o = (ImageView) findViewById6;
        OnClickListener onClickListener = this;
        this.f96212o.setOnClickListener(onClickListener);
        this.f96212o.setImageResource(R.drawable.apf);
        LayoutParams layoutParams = this.f96212o.getLayoutParams();
        C7573i.m23582a((Object) layoutParams, "mClose.layoutParams");
        layoutParams.width = (int) C9738o.m28708b(this.f96206i, -2.0f);
        layoutParams.height = (int) C9738o.m28708b(this.f96206i, -2.0f);
        this.f96212o.setLayoutParams(layoutParams);
        this.f96199b.setOnClickListener(onClickListener);
        this.f96202e.setOnClickListener(onClickListener);
        if (this.f96207j == null) {
            this.f96207j = new C36031j();
            C36031j jVar = this.f96207j;
            if (jVar != null) {
                jVar.mo66537a(this);
            }
        }
        this.f96211n = i;
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            this.f96209l.setBackgroundResource(R.color.a6m);
        }
    }

    /* renamed from: a */
    public final void mo92958a(User user, int i, C36635a aVar, C36636b bVar, C36631a aVar2, int i2, String str) {
        if (user != null) {
            this.f96208k = aVar2;
            this.f96198a = user;
            this.f96204g = aVar;
            this.f96205h = bVar;
            this.f96203f = i;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f96199b.setUserData(userVerify);
            this.f96199b.mo60896b();
            User user2 = this.f96198a;
            if (user2 == null) {
                C7573i.m23583a("mUser");
            }
            mo92957a(user2);
            StringBuilder sb = new StringBuilder("@");
            User user3 = this.f96198a;
            if (user3 == null) {
                C7573i.m23583a("mUser");
            }
            sb.append(user3.getUniqueId());
            this.f96201d.setText(sb.toString());
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            C43126fg.m136801a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f96201d);
            User user4 = this.f96198a;
            if (user4 == null) {
                C7573i.m23583a("mUser");
            }
            m118225b(user4.getFollowStatus());
            LayoutParams layoutParams = this.f96209l.getLayoutParams();
            if (layoutParams != null) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (i != 0) {
                    i2 = 0;
                }
                layoutParams2.leftMargin = i2;
                this.f96209l.setLayoutParams(layoutParams2);
                this.f96210m = str;
                if (this.f96210m == null) {
                    this.f96210m = "";
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }
}
