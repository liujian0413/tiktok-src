package com.p280ss.android.ugc.trill.share;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12196a;
import com.bytedance.lobby.auth.C12198c;
import com.bytedance.lobby.auth.C12198c.C12200a;
import com.bytedance.lobby.internal.C12226d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23495a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.share.C38247o;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.shortvideo.festival.FestivalBlockInsShareViewModel;
import com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a;
import com.p280ss.android.ugc.trill.p1765g.C44998b;
import com.p280ss.android.ugc.trill.share.helo.C45123a;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45138a;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45139b;
import com.p280ss.android.ugc.trill.share.helo.p1769b.C45144b;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b;
import com.p280ss.android.ugc.trill.share.p1767a.C45078a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.SyncShareView */
public class SyncShareView extends C38247o {

    /* renamed from: b */
    private C10730a f115831b;

    /* renamed from: c */
    private String f115832c = "";

    /* renamed from: d */
    private int f115833d;

    /* renamed from: e */
    private Unbinder f115834e;

    /* renamed from: f */
    private boolean f115835f;

    /* renamed from: g */
    private int f115836g;
    CanCancelRadioButton mBtnHelo;
    CanCancelRadioButton mBtnIns;
    CanCancelRadioButton mBtnInsStory;
    CanCancelRadioButton mBtnSave;
    ImageView mBtnTwitter;
    RadioGroup mGroupHelo;
    LinearLayout mLayoutAutoShare;
    RadioGroup mRadioGroup;
    TextView mSyncTitle;

    /* renamed from: m */
    private void m142164m() {
        m142165n();
    }

    /* renamed from: a */
    public final void mo95855a() {
        if (this.f115834e != null) {
            this.f115834e.unbind();
        }
        C45123a.m142285c().mo107688b().mo107690a();
    }

    /* renamed from: a */
    public final void mo95856a(int i) {
        boolean z = i != 0;
        this.f115836g = i;
        SharePrefCache.inst().getIsAwemePrivate().mo59871a(Boolean.valueOf(z));
        ((C45078a) C23336d.m76560a(getContext(), C45078a.class)).mo60411a(z);
        m142155b(z);
        m142151a(z);
        if (z) {
            m142150a(this.mBtnTwitter, false);
        } else {
            m142150a(this.mBtnTwitter, getTwitterRealStatus());
        }
    }

    /* renamed from: a */
    public final void mo95858a(int i, C23495a aVar) {
        if (i == 1) {
            this.mBtnSave.mo61105a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo95857a(int i, int i2, Intent intent) {
        if (TextUtils.equals("helo", this.f115832c)) {
            C45123a.m142285c().mo107688b().mo107691a(i, i2, intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo107617a(AuthResult authResult) {
        if (authResult.f32438a) {
            String str = authResult.f32443f;
            String str2 = authResult.f32444g;
            m142150a(this.mBtnTwitter, true);
            C21115b.m71197a().updateHasTwitterToken(true);
            C21115b.m71197a().updateTwExpireTime();
            SharePrefCache.inst().getTwitterAccessToken().mo59871a(str);
            SharePrefCache.inst().getTwitterSecret().mo59871a(str2);
            SharePrefCache.inst().getAutoSendTwitter().mo59871a(Boolean.valueOf(true));
            C44985a.m141940a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo95859a(int i, boolean z) {
        if (i == 1) {
            this.mBtnSave.setChecked(z);
            if (z) {
                this.mRadioGroup.check(R.id.re);
            } else if (this.mRadioGroup.getCheckedRadioButtonId() == R.id.re) {
                this.mRadioGroup.clearCheck();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo107616a(View view) {
        m142152a(this.mRadioGroup.getCheckedRadioButtonId() == R.id.re, "download");
    }

    /* renamed from: o */
    private static boolean m142166o() {
        C45123a.m142285c();
        return C45123a.m142284a();
    }

    /* renamed from: g */
    private boolean m142158g() {
        if (this.mBtnHelo == null || !this.mBtnHelo.f61972a) {
            return false;
        }
        return true;
    }

    private int getLayoutResId() {
        if (this.f115833d == 0) {
            return R.layout.b5a;
        }
        return R.layout.ck;
    }

    /* renamed from: c */
    public final boolean mo107621c() {
        if (this.mBtnHelo == null || !this.mBtnHelo.isChecked()) {
            return false;
        }
        return true;
    }

    private String getUserName() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService.getCurrentUser() == null) {
            return "";
        }
        return iUserService.getCurrentUser().getNickname();
    }

    /* renamed from: h */
    private void m142159h() {
        if (C6399b.m19946v()) {
            C45123a.m142285c().mo107684a(getContext(), new C45149b(TutorialVideoApiManager.f89507a, "https://open-api.musical.ly"));
        }
    }

    /* renamed from: j */
    private static boolean m142161j() {
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d == null || !d.enableSyncToHeloEntry) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m142162k() {
        int i;
        try {
            i = C30199h.m98861a().getCloseSyncToHeloEntry().intValue();
        } catch (NullValueException unused) {
            i = 0;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private static boolean m142173v() {
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser == null || !curUser.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo107622d() {
        if (!this.f115835f) {
            this.f115835f = true;
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        }
    }

    /* renamed from: e */
    private void m142156e() {
        if (this.f115836g == 2) {
            C10761a.m31410e(getContext(), getContext().getString(R.string.w8)).mo25750a();
        } else {
            C10761a.m31410e(getContext(), getContext().getString(R.string.d5g)).mo25750a();
        }
    }

    /* renamed from: f */
    private void m142157f() {
        C45123a.m142285c().mo107688b().mo107692a((Activity) getFragment().getActivity(), new C45148a(getUserName(), getUserAvatarUrl()), new C45138a() {
            /* renamed from: a */
            public final void mo107625a() {
                SyncShareView.this.mBtnHelo.setCanChecked(true);
                SyncShareView.this.mBtnHelo.setChecked(true);
                C45144b.m142321c().mo107695b(SyncShareView.this.mo107621c());
                C45144b.m142321c().mo107693a(true);
            }

            /* renamed from: a */
            public final void mo107626a(int i, String str, String str2) {
                SyncShareView.this.mBtnHelo.setCanChecked(false);
                SyncShareView.this.mBtnHelo.setChecked(false);
                C45144b.m142321c().mo107695b(SyncShareView.this.mo107621c());
                C45144b.m142321c().mo107693a(false);
            }
        });
    }

    private boolean getTwitterRealStatus() {
        if (!C21115b.m71197a().getCurUser().isHasTwitterToken() || C21115b.m71197a().getCurUser().isTwitterExpire() || !((Boolean) SharePrefCache.inst().getAutoSendTwitter().mo59877d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m142160i() {
        SharePrefCache inst = SharePrefCache.inst();
        m142150a(this.mBtnTwitter, getTwitterRealStatus());
        SharePrefCache.inst().getAutoSendTwitter().mo59871a(Boolean.valueOf(getTwitterRealStatus()));
        if (((Boolean) inst.getIsAwemePrivate().mo59877d()).booleanValue()) {
            m142150a(this.mBtnTwitter, false);
        }
        m142163l();
    }

    /* renamed from: p */
    private void m142167p() {
        m142168q();
        this.mBtnIns.setOnClickListener(new C45116e(this));
        this.mBtnInsStory.setOnClickListener(new C45117f(this));
        this.mBtnSave.setOnClickListener(new C45118g(this));
        this.mRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.re) {
                    C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(1));
                    SyncShareView.this.mo107622d();
                } else if (i == R.id.qf) {
                    C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(2));
                    SyncShareView.this.mo107622d();
                } else if (i == R.id.qg) {
                    C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(3));
                    SyncShareView.this.mo107622d();
                } else {
                    C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(0));
                }
            }
        });
    }

    /* renamed from: t */
    private boolean m142171t() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableUploadSyncTwitter() && !m142173v()) {
            return true;
        }
        this.mBtnTwitter.setVisibility(8);
        return false;
    }

    /* renamed from: u */
    private boolean m142172u() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableSaveUploadVideo()) {
            return true;
        }
        this.mRadioGroup.setVisibility(8);
        C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(0));
        return false;
    }

    public int getSaveUploadType() {
        int i = 0;
        if (this.mRadioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = this.mRadioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.re) {
            i = 1;
        } else if (checkedRadioButtonId == R.id.qf) {
            i = 2;
        } else if (checkedRadioButtonId == R.id.qg) {
            i = 3;
        }
        return i;
    }

    private String getUserAvatarUrl() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService.getCurrentUser() == null || iUserService.getCurrentUser().getAvatarMedium() == null || iUserService.getCurrentUser().getAvatarMedium().getUrlList() == null || iUserService.getCurrentUser().getAvatarMedium().getUrlList().size() == 0) {
            return "";
        }
        return (String) iUserService.getCurrentUser().getAvatarMedium().getUrlList().get(0);
    }

    /* renamed from: l */
    private void m142163l() {
        boolean z;
        if (this.mGroupHelo != null) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (C6399b.m19946v() && !m142162k() && !m142161j() && iUserService.isLogin()) {
                boolean z2 = false;
                this.mGroupHelo.setVisibility(0);
                C45078a aVar = (C45078a) C23336d.m76560a(getContext(), C45078a.class);
                final boolean b = C45144b.m142321c().mo107696b();
                final boolean z3 = !aVar.mo60412b(false);
                CanCancelRadioButton canCancelRadioButton = this.mBtnHelo;
                if (!z3 || !m142166o()) {
                    z = false;
                } else {
                    z = true;
                }
                canCancelRadioButton.setCanChecked(z);
                CanCancelRadioButton canCancelRadioButton2 = this.mBtnHelo;
                if (z3 && m142166o() && b) {
                    z2 = true;
                }
                canCancelRadioButton2.setChecked(z2);
                C45123a.m142285c().mo107687a(new C45139b() {
                    /* renamed from: a */
                    public final void mo107627a(boolean z, boolean z2) {
                        boolean z3;
                        boolean z4;
                        CanCancelRadioButton canCancelRadioButton = SyncShareView.this.mBtnHelo;
                        boolean z5 = true;
                        if (!z3 || !z || !z2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        canCancelRadioButton.setCanChecked(z3);
                        CanCancelRadioButton canCancelRadioButton2 = SyncShareView.this.mBtnHelo;
                        if (!z3 || !z || !z2 || !b) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        canCancelRadioButton2.setChecked(z4);
                        C45144b.m142321c().mo107695b(SyncShareView.this.mo107621c());
                        C45144b c = C45144b.m142321c();
                        if (!z || !z2) {
                            z5 = false;
                        }
                        c.mo107693a(z5);
                    }
                });
            }
        }
    }

    /* renamed from: n */
    private void m142165n() {
        C10741a aVar = new C10741a(getContext());
        if (C21115b.m71197a().getCurUser().isHasTwitterToken()) {
            aVar.mo25660b(getContext().getString(R.string.bfh, new Object[]{"Twitter"}));
        } else {
            aVar.mo25660b(getContext().getString(R.string.bfg, new Object[]{"Twitter", "Twitter"}));
        }
        aVar.mo25654a(getContext().getString(R.string.bfe), (OnClickListener) new C45106c(this));
        aVar.mo25661b(getContext().getString(R.string.bff), C45107d.f115941a);
        this.f115831b = aVar.mo25656a();
    }

    /* renamed from: r */
    private boolean m142169r() {
        if (new C38307i().mo95743a(getContext()) && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableUploadSyncIns() && !m142173v() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableInstagramSilentShare() && !m142153a((FragmentActivity) getContext())) {
            return true;
        }
        this.mBtnIns.setVisibility(8);
        return false;
    }

    /* renamed from: s */
    private boolean m142170s() {
        if (new C38309j().mo95743a(getContext()) && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableUploadSyncInsStory() && !m142173v() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableInstagramSilentShare() && !m142153a((FragmentActivity) getContext())) {
            return true;
        }
        this.mBtnInsStory.setVisibility(8);
        return false;
    }

    /* renamed from: b */
    public final String mo95860b() {
        ArrayList arrayList = new ArrayList();
        if (mo107621c()) {
            arrayList.add(Integer.valueOf(100));
        }
        if (m142154a(this.mBtnTwitter)) {
            arrayList.add(Integer.valueOf(BaseNotice.HASHTAG));
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C44998b.m141974a(";", arrayList);
    }

    /* renamed from: q */
    private void m142168q() {
        if (m142172u()) {
            boolean r = m142169r();
            boolean s = m142170s();
            switch (((Integer) C23060u.m75742a().mo60034D().mo59877d()).intValue()) {
                case 1:
                    this.mBtnSave.setChecked(true);
                    break;
                case 2:
                    if (r) {
                        this.mBtnIns.setChecked(true);
                        break;
                    } else {
                        C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(0));
                        break;
                    }
                case 3:
                    if (s) {
                        this.mBtnInsStory.setChecked(true);
                        break;
                    } else {
                        C23060u.m75742a().mo60034D().mo59871a(Integer.valueOf(0));
                        break;
                    }
                default:
                    this.mRadioGroup.clearCheck();
                    break;
            }
            if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d()).booleanValue()) {
                m142155b(true);
            }
        }
    }

    public void setSyncShareViewTextColor(int i) {
        this.mSyncTitle.setTextColor(i);
    }

    public void setSyncShareViewTextSize(float f) {
        this.mSyncTitle.setTextSize(f);
    }

    public void setSyncShareViewTitle(String str) {
        this.mSyncTitle.setText(str);
    }

    /* renamed from: a */
    private static String m142147a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public void setSaveLocalEnabled(boolean z) {
        int i;
        CanCancelRadioButton canCancelRadioButton = this.mBtnSave;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        canCancelRadioButton.setVisibility(i);
    }

    /* renamed from: a */
    private void m142148a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this, true);
        this.f115834e = ButterKnife.bind(inflate);
        if (m142171t() || m142172u()) {
            m142160i();
            m142164m();
            m142159h();
            m142167p();
            return;
        }
        inflate.setVisibility(8);
    }

    /* renamed from: b */
    private void m142155b(boolean z) {
        if (z) {
            int checkedRadioButtonId = this.mRadioGroup.getCheckedRadioButtonId();
            this.mBtnIns.setCanChecked(false);
            this.mBtnInsStory.setCanChecked(false);
            if (checkedRadioButtonId == this.mBtnIns.getId() || checkedRadioButtonId == this.mBtnInsStory.getId()) {
                this.mRadioGroup.check(-1);
            }
            return;
        }
        this.mBtnIns.setCanChecked(true);
        this.mBtnInsStory.setCanChecked(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo107620c(View view) {
        boolean z;
        if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d()).booleanValue()) {
            C10761a.m31410e(getContext(), getContext().getString(R.string.d5g)).mo25750a();
            return;
        }
        if (this.mRadioGroup.getCheckedRadioButtonId() == R.id.qf) {
            z = true;
        } else {
            z = false;
        }
        m142152a(z, "ins");
    }

    public void setSyncIconSize(int i) {
        LayoutParams layoutParams = this.mBtnTwitter.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        LayoutParams layoutParams2 = this.mBtnIns.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        LayoutParams layoutParams3 = this.mBtnInsStory.getLayoutParams();
        layoutParams3.width = i;
        layoutParams3.height = i;
        LayoutParams layoutParams4 = this.mBtnSave.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.height = i;
    }

    public void onClickHelo(View view) {
        C45078a aVar = (C45078a) C23336d.m76560a(getContext(), C45078a.class);
        if (m142158g()) {
            C45144b.m142321c().mo107695b(mo107621c());
            m142152a(mo107621c(), "helo");
            return;
        }
        this.mBtnHelo.toggle();
        if (aVar.mo60412b(false)) {
            m142156e();
            return;
        }
        if (!m142166o()) {
            this.f115832c = "helo";
            m142157f();
        }
    }

    /* renamed from: a */
    private void m142151a(boolean z) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (C6399b.m19946v() && !m142162k() && !m142161j() && iUserService.isLogin()) {
            if (z) {
                this.mBtnHelo.setCanChecked(false);
                if (this.mGroupHelo != null && this.mGroupHelo.getCheckedRadioButtonId() == this.mBtnHelo.getId()) {
                    this.mGroupHelo.check(-1);
                }
            } else {
                this.mBtnHelo.setCanChecked(m142166o());
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.rv) {
            if (m142154a(this.mBtnTwitter)) {
                m142150a(this.mBtnTwitter, false);
                SharePrefCache.inst().getAutoSendTwitter().mo59871a(Boolean.valueOf(false));
                m142152a(false, "twitter");
            } else if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d()).booleanValue()) {
                m142156e();
            } else if (!C21115b.m71197a().getCurUser().isHasTwitterToken() || C21115b.m71197a().getCurUser().isTwitterExpire()) {
                this.f115831b.mo25637a();
                C6907h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("show"));
            } else {
                m142150a(this.mBtnTwitter, true);
                SharePrefCache.inst().getAutoSendTwitter().mo59871a(Boolean.valueOf(true));
                m142152a(true, "twitter");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo107619b(View view) {
        boolean z;
        if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo59877d()).booleanValue()) {
            C10761a.m31410e(getContext(), getContext().getString(R.string.d5g)).mo25750a();
            return;
        }
        if (this.mRadioGroup.getCheckedRadioButtonId() == R.id.qg) {
            z = true;
        } else {
            z = false;
        }
        m142152a(z, "ins_story");
    }

    /* renamed from: a */
    private static boolean m142153a(FragmentActivity fragmentActivity) {
        return ((FestivalBlockInsShareViewModel) C0069x.m159a(fragmentActivity).mo147a(FestivalBlockInsShareViewModel.class)).f103589a;
    }

    /* renamed from: a */
    private static boolean m142154a(ImageView imageView) {
        if (imageView == null || imageView.getAlpha() != 1.0f) {
            return false;
        }
        return true;
    }

    public SyncShareView(Context context, int i) {
        super(context);
        this.f115833d = i;
        m142148a(context);
    }

    /* renamed from: a */
    static final /* synthetic */ void m142149a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C6907h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("cancel"));
    }

    /* renamed from: a */
    private static void m142150a(ImageView imageView, boolean z) {
        if (imageView.getId() == R.id.rv) {
            if (z) {
                imageView.setBackgroundResource(R.drawable.an0);
            } else {
                imageView.setBackgroundResource(R.drawable.b2i);
            }
        }
        if (z) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.99f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo107618b(DialogInterface dialogInterface, int i) {
        if (!(getContext() instanceof FragmentActivity)) {
            if (C7163a.m22363a()) {
                C10761a.m31403c(getContext(), "Dialog context error, cannot login to twitter").mo25750a();
            }
            return;
        }
        C6907h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("success"));
        this.f115832c = "twitter";
        C12198c a = new C12200a((FragmentActivity) getContext()).mo29933a("twitter").mo29932a((C12196a) new C45119h(this)).mo29934a();
        C12226d.m35546a();
        C12226d.m35547a(a);
    }

    /* renamed from: a */
    private void m142152a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (tag instanceof Map) {
            Map map = (Map) tag;
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            C6907h.m21524a(str2, (Map) C22984d.m75611a().mo59973a("creation_id", m142147a(map.get("creation_id"))).mo59973a("enter_from", m142147a(map.get("enter_from"))).mo59973a("content_type", m142147a(map.get("content_type"))).mo59973a("shoot_way", m142147a(map.get("shoot_way"))).mo59973a("share_to", str).f60753a);
        }
    }
}
