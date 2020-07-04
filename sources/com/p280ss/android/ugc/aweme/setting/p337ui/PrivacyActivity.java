package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.Divider;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.followrequest.C29865c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.DmtStatusViewDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37649i;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37643i;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37644j;
import com.p280ss.android.ugc.aweme.setting.secret.p1526a.C37699a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.setting.verification.C37939a;
import com.p280ss.android.ugc.aweme.setting.verification.C37940b;
import com.p280ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacyActivity */
public class PrivacyActivity extends AmeBaseActivity implements OnClickListener, C36046t, C37644j, C37709b {

    /* renamed from: c */
    private static final boolean f98478c = C7163a.m22363a();

    /* renamed from: A */
    private Role f98479A = Role.NONE;

    /* renamed from: B */
    private C27870d f98480B;

    /* renamed from: a */
    protected List<CommonItemView> f98481a = new ArrayList();

    /* renamed from: b */
    protected C36011ai f98482b;
    protected CommonItemView contactItem;

    /* renamed from: d */
    private boolean f98483d = false;

    /* renamed from: e */
    private C37643i f98484e;
    ImageView mBack;
    protected CommonItemView mBlockListItem;
    protected CommonItemView mCommentFilterItem;
    protected CommonItemView mCommentManagerItem;
    protected CommonItemView mDownloadItem;
    protected CommonItemView mDuetItem;
    protected CommonItemView mPersonalizationItem;
    protected CommonItemView mPrivacyManagerItem;
    protected LinearLayout mPrivacyParent;
    protected CommonItemView mPrivateAccount;
    protected CommonItemView mReactItem;
    protected TextView mTitle;
    CommonItemView mWhoCanSeeMyLikeListItem;
    protected View personalizationDiv;

    /* renamed from: q */
    private C37716e f98485q;

    /* renamed from: r */
    private C37940b f98486r;

    /* renamed from: s */
    private int f98487s = -1;
    protected View safeDivider;

    /* renamed from: t */
    private int f98488t = 0;

    /* renamed from: u */
    private int f98489u = 0;

    /* renamed from: v */
    private int f98490v = 0;

    /* renamed from: w */
    private int f98491w = 0;

    /* renamed from: x */
    private int f98492x = -1;

    /* renamed from: y */
    private int f98493y = -1;

    /* renamed from: z */
    private boolean f98494z = false;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.e3;
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public void back() {
        finish();
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo80278i() {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    /* renamed from: p */
    private void m120885p() {
        WhoCanSeeMyLikeListActivity.m121112a(this, this.f98491w, 7);
    }

    /* renamed from: t */
    private void m120889t() {
        CommentControlSettingActivity.m120701a(this, this.f98487s, 3);
    }

    /* renamed from: r */
    private void m120887r() {
        if (!isFinishing()) {
            ReactControlSettingActivity.m120947a(this, this.f98489u, 5);
        }
    }

    /* renamed from: v */
    private void m120891v() {
        if (!isFinishing()) {
            DuetControlSettingActivity.m120781a(this, this.f98490v, 2);
        }
    }

    /* renamed from: w */
    private void m120892w() {
        if (!isFinishing()) {
            DownloadControlSettingActivity.m120775a(this, this.f98488t, 4);
        }
    }

    /* renamed from: x */
    private static boolean m120893x() {
        if (((Integer) SharePrefCache.inst().getPrivacyDownloadSetting().mo59877d()).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo59893d() {
        startActivity(new Intent(this, BlackListActivity.class));
        C6907h.onEvent(new MobClick().setEventName("black_list").setLabelName("message"));
    }

    public void onDestroy() {
        if (this.f98484e != null) {
            this.f98484e.mo59134U_();
        }
        if (this.f98486r != null) {
            this.f98486r.mo95385a();
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", false);
    }

    /* renamed from: l */
    public static Boolean m120881l() {
        String str;
        if (!C21115b.m71197a().isLogin()) {
            return Boolean.valueOf(false);
        }
        Boolean valueOf = Boolean.valueOf(false);
        try {
            valueOf = C30199h.m98861a().getEnableDownloadTtData();
        } catch (Exception unused) {
        }
        if (f98478c) {
            StringBuilder sb = new StringBuilder("Data download feature ");
            if (valueOf.booleanValue()) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        return valueOf;
    }

    /* renamed from: n */
    private void m120883n() {
        this.contactItem.setOnClickListener(this);
        this.mPrivacyManagerItem.setOnClickListener(this);
        this.mBlockListItem.setOnClickListener(this);
        this.mDuetItem.setOnClickListener(this);
        this.mDownloadItem.setOnClickListener(this);
        this.mCommentManagerItem.setOnClickListener(this);
        this.mReactItem.setOnClickListener(this);
        this.mCommentFilterItem.setOnClickListener(this);
        this.mWhoCanSeeMyLikeListItem.setOnClickListener(this);
    }

    /* renamed from: o */
    private void m120884o() {
        new C10741a(this).mo25657b((int) R.string.ap1).mo25649a((int) R.string.ap7).mo25650a((int) R.string.ap5, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25656a().mo25637a();
    }

    /* renamed from: q */
    private void m120886q() {
        new C10741a(this).mo25657b((int) R.string.zw).mo25649a((int) R.string.zt).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                PrivacyActivity.this.mo95212b(false);
                C29865c.m97671c();
                C37699a.m120554a(C23060u.m75742a().mo60057aa());
            }
        }).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
    }

    /* renamed from: s */
    private void m120888s() {
        if (!isFinishing()) {
            startActivityForResult(new Intent(this, CommentFilterActivity.class), 6);
            C6907h.m21524a("enter_filter_comment", (Map) new C22984d().mo59973a("enter_from", "privacy_setting").f60753a);
        }
    }

    /* renamed from: u */
    private void m120890u() {
        if (!isFinishing()) {
            if (this.f98493y == 3 && this.f98479A == Role.UNLINK_LOCKED) {
                C10761a.m31403c((Context) this, getString(R.string.b3a)).mo25750a();
            } else {
                ChatControlSettingActivity.m120692a((Activity) this, this.f98492x, this.f98494z, 1);
            }
        }
    }

    public final void aZ_() {
        String str;
        this.contactItem.setChecked(!this.contactItem.mo25778c());
        C21115b.m71197a().updateCurHideSearch(!this.contactItem.mo25778c());
        if (this.contactItem.mo25778c()) {
            str = "shield_on";
        } else {
            str = "shield_off";
        }
        C33228ab.m107200a(str).mo85057b("type", "contact").mo85252e();
    }

    /* renamed from: j */
    private void m120880j() {
        this.f98481a.add(this.contactItem);
        this.f98481a.add(this.mPrivacyManagerItem);
        this.f98481a.add(this.mBlockListItem);
        this.f98481a.add(this.mReactItem);
        this.f98481a.add(this.mDuetItem);
        this.f98481a.add(this.mDownloadItem);
        this.f98481a.add(this.mCommentManagerItem);
        this.f98481a.add(this.mPrivateAccount);
        this.f98481a.add(this.mCommentFilterItem);
        this.f98481a.add(this.mWhoCanSeeMyLikeListItem);
        this.f98481a.add(this.mPersonalizationItem);
        if (C6399b.m19944t()) {
            for (CommonItemView rightIconRes : this.f98481a) {
                rightIconRes.setRightIconRes(0);
            }
        }
    }

    /* renamed from: m */
    private void m120882m() {
        this.f98484e = new C37643i();
        this.f98484e.mo66537a(this);
        this.f98485q = new C37716e();
        this.f98485q.mo66537a(this);
        this.f98485q.mo56976a(new Object[0]);
        this.f98486r = new C37940b();
        this.f98482b = new C36011ai();
        this.f98482b.f94200a = this;
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            this.f98483d = curUser.isSecret();
            this.mPrivateAccount.setChecked(this.f98483d);
        }
        this.f98480B = C27870d.m91297a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo95214k() {
        boolean z;
        if (!C6861a.m21337f().isLogin()) {
            this.mPersonalizationItem.setLeftText(getString(R.string.dpg));
            this.mPersonalizationItem.setLeftIcon(R.drawable.aav);
            if (this.personalizationDiv instanceof Divider) {
                ((Divider) this.personalizationDiv).setLeftText(getString(R.string.dph));
            } else if (this.personalizationDiv instanceof Divider) {
                ((Divider) this.personalizationDiv).getTxtLeft().setText(R.string.dph);
            }
            View[] viewArr = {this.mPersonalizationItem, this.personalizationDiv};
            int childCount = this.mPrivacyParent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.mPrivacyParent.getChildAt(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    } else if (viewArr[i2] == childAt) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z && childAt.getVisibility() != 8) {
                    childAt.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo58711c() {
        int i;
        m120880j();
        CommonItemView commonItemView = this.mPrivacyManagerItem;
        int i2 = 8;
        if (ParentalPlatformConfig.f60133a.mo59218f()) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView.setVisibility(i);
        this.contactItem.setChecked(!C21115b.m71197a().getCurUser().isHideSearch());
        if (!C6399b.m19944t()) {
            this.contactItem.setVisibility(8);
        }
        if (C37649i.m120470a()) {
            this.mCommentManagerItem.setVisibility(0);
        } else {
            this.mCommentManagerItem.setVisibility(8);
        }
        if (m120893x()) {
            this.mDownloadItem.setVisibility(0);
        }
        if (!C6399b.m19944t() || !C7213d.m22500a().mo18712E()) {
            this.mCommentFilterItem.setVisibility(8);
        } else {
            this.mCommentFilterItem.setVisibility(0);
        }
        this.mPrivateAccount.setOnClickListener(this);
        CommonItemView commonItemView2 = this.mReactItem;
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableReact()) {
            i2 = 0;
        }
        commonItemView2.setVisibility(i2);
    }

    /* renamed from: c */
    private void m120876c(boolean z) {
        int i;
        this.mPrivateAccount.setChecked(z);
        if (z) {
            i = 3;
        } else {
            i = 0;
        }
        m120877d(i);
    }

    /* renamed from: b */
    public final void mo94939b(Exception exc) {
        C10761a.m31399c((Context) this, (int) R.string.cr9).mo25750a();
    }

    /* renamed from: b */
    public final void mo95212b(boolean z) {
        this.f98483d = z;
        m120876c(z);
        this.f98482b.mo91644a(z);
    }

    /* renamed from: a */
    private void m120872a(int i) {
        this.f98490v = i;
        if (i == 0) {
            this.mDuetItem.setRightText(getResources().getString(R.string.hw));
        } else if (i == 1) {
            this.mDuetItem.setRightText(getResources().getString(R.string.cqw));
        } else {
            if (i == 3) {
                this.mDuetItem.setRightText(getResources().getString(R.string.cqf));
            }
        }
    }

    /* renamed from: b */
    private void m120874b(int i) {
        this.f98487s = i;
        String[] stringArray = getResources().getStringArray(R.array.l);
        if (i == C37649i.f98118a) {
            this.mCommentManagerItem.setRightText(stringArray[0]);
        } else if (i == C37649i.f98119b) {
            this.mCommentManagerItem.setRightText(stringArray[1]);
        } else {
            if (i == C37649i.f98121d) {
                this.mCommentManagerItem.setRightText(stringArray[3]);
            }
        }
    }

    /* renamed from: c */
    private void m120875c(int i) {
        this.f98489u = i;
        if (i == 0) {
            this.mReactItem.setRightText(getResources().getString(R.string.hw));
        } else if (i == 1) {
            this.mReactItem.setRightText(getResources().getString(R.string.cqw));
        } else {
            if (i == 3) {
                this.mReactItem.setRightText(getResources().getString(R.string.cqf));
            }
        }
    }

    /* renamed from: d */
    private void m120877d(int i) {
        int i2;
        if (this.f98483d) {
            this.f98488t = 3;
            this.mDownloadItem.setRightText(getResources().getString(R.string.cqf));
            return;
        }
        this.f98488t = i;
        if (i == 0) {
            if (C6399b.m19946v()) {
                i2 = R.string.ave;
            } else {
                i2 = R.string.hw;
            }
            this.mDownloadItem.setRightText(getString(i2));
            return;
        }
        this.mDownloadItem.setRightText(getString(R.string.cqf));
    }

    /* renamed from: e */
    private void m120878e(int i) {
        this.f98491w = i;
        C23060u.m75742a().mo60075e().mo59871a(Integer.valueOf(i));
        C42961az.m136380a(new C37897ax());
        if (i == 0) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(R.string.hw));
            return;
        }
        if (i == 1) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(R.string.cqx));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitle.setText(R.string.dpe);
        mo58711c();
        m120882m();
        m120883n();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onCreate", false);
    }

    public void onShieldSwitcherClick(View view) {
        if (this.contactItem.mo25778c()) {
            this.f98484e.mo56976a(Integer.valueOf(1));
            return;
        }
        this.f98484e.mo56976a(Integer.valueOf(0));
    }

    /* renamed from: f */
    private void m120879f(int i) {
        int i2;
        this.f98492x = i;
        if ((this.f98492x == 0 || (this.f98492x == 1 && !this.f98494z)) && C6399b.m19946v()) {
            try {
                if (C30199h.m98861a().getEnableTImChatEveryone().booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.f98492x = i2;
            } catch (NullValueException unused) {
            }
        }
        if (this.f98492x == 1) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.hw));
        } else if (this.f98492x == 2) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.cqw));
        } else {
            if (this.f98492x == 3) {
                this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.cqf));
            }
        }
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        if (bVar != null) {
            this.f98494z = bVar.f98289y;
            this.f98479A = ParentalPlatformConfig.m74613b(bVar);
            m120872a(bVar.f98278n);
            m120875c(bVar.f98279o);
            m120874b(bVar.f98277m);
            m120877d(bVar.f98280p);
            int i = bVar.f98287w;
            this.f98493y = bVar.f98288x;
            m120879f(i);
            int i2 = bVar.f98251I;
            int i3 = bVar.f98252J;
            String curUserId = C21115b.m71197a().getCurUserId();
            C27870d dVar = this.f98480B;
            StringBuilder sb = new StringBuilder("comment_filter_status_");
            sb.append(curUserId);
            dVar.mo71351b(sb.toString(), Integer.valueOf(i2));
            C27870d dVar2 = this.f98480B;
            StringBuilder sb2 = new StringBuilder("comment_offensive_filter_");
            sb2.append(curUserId);
            dVar2.mo71351b(sb2.toString(), Integer.valueOf(i3));
            m120873a(i2, i3);
            m120878e(bVar.f98243A);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.cjl) {
            onShieldSwitcherClick(view);
        } else if (id == R.id.cjq) {
            m120890u();
        } else if (id == R.id.cjk) {
            mo59893d();
        } else if (id == R.id.zh) {
            m120889t();
        } else if (id == R.id.cjn) {
            m120891v();
        } else if (id == R.id.cjp) {
            m120887r();
        } else if (id == R.id.cjm) {
            m120892w();
        } else {
            if (id == R.id.cjo) {
                User curUser = C21115b.m71197a().getCurUser();
                if (curUser != null && curUser.isProAccount() && !curUser.isSecret() && !this.f98483d) {
                    m120884o();
                } else if (this.f98483d) {
                    C29865c.m97666a();
                    m120886q();
                } else {
                    final DmtStatusViewDialog dmtStatusViewDialog = new DmtStatusViewDialog(this);
                    dmtStatusViewDialog.show();
                    this.f98486r.mo95387b(curUser, new C37939a() {
                        /* renamed from: a */
                        public final void mo95177a() {
                            C37931v.m121193a(dmtStatusViewDialog);
                        }

                        /* renamed from: a */
                        public final void mo92278a(VerificationResponse verificationResponse) {
                            if (verificationResponse.shouldShowChangeMobileDialog()) {
                                new C10741a(PrivacyActivity.this).mo25660b(PrivacyActivity.this.getString(R.string.dg8)).mo25653a(PrivacyActivity.this.getString(R.string.dg9)).mo25650a((int) R.string.dg3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        C29865c.m97669b();
                                        PrivacyActivity.this.mo95212b(true);
                                    }
                                }).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
                                return;
                            }
                            C29865c.m97669b();
                            PrivacyActivity.this.mo95212b(true);
                        }
                    });
                }
            } else if (id == R.id.za) {
                m120888s();
            } else if (id == R.id.eh2) {
                m120885p();
            }
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        this.f98483d = user.isSecret();
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (i == 122) {
            this.f98483d = !this.f98483d;
            m120876c(this.f98483d);
            C10761a.m31399c((Context) this, (int) R.string.cr9).mo25750a();
        }
    }

    /* renamed from: a */
    private void m120873a(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4 = false;
        try {
            z = C30199h.m98861a().getEnableCommentOffensiveFilterSwitch().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (i2 != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((z && z2) || z3) {
            z4 = true;
        }
        CommonItemView commonItemView = this.mCommentFilterItem;
        if (z4) {
            i3 = R.string.ave;
        } else {
            i3 = R.string.cqf;
        }
        commonItemView.setRightText(getString(i3));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1 == i && i2 == -1) {
            int intExtra = intent.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra || intExtra == this.f98492x)) {
                m120879f(intExtra);
            }
        } else if (3 == i && i2 == -1) {
            int intExtra2 = intent.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra2 || intExtra2 == this.f98487s)) {
                m120874b(intExtra2);
            }
        } else if (4 == i && i2 == -1) {
            m120877d(intent.getIntExtra("currentSettingsValue", 0));
        } else if (5 == i && i2 == -1) {
            m120875c(intent.getIntExtra("currentSettingsValue", 0));
        } else if (2 == i && i2 == -1) {
            m120872a(intent.getIntExtra("currentSettingsValue", 0));
        } else if (6 == i && i2 == -1) {
            m120873a(intent.getIntExtra("comment_filter_status", 0), intent.getIntExtra("comment_offensive_filter", 0));
        } else if (6 == i && i2 == 0) {
            this.f98485q.mo56976a(new Object[0]);
        } else {
            if (7 == i && i2 == -1) {
                int intExtra3 = intent.getIntExtra("currentSettingsValue", -1);
                if (!(-1 == intExtra3 || intExtra3 == this.f98491w)) {
                    m120878e(intExtra3);
                }
            }
        }
    }
}
