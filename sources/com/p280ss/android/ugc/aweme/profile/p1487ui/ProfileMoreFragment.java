package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.profile.api.BlockApi;
import com.p280ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p280ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35669g;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36530bb;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragment */
public class ProfileMoreFragment extends AmeBaseFragment implements C6310a {

    /* renamed from: e */
    private User f95167e;

    /* renamed from: f */
    private String f95168f;

    /* renamed from: g */
    private String f95169g;

    /* renamed from: h */
    private String f95170h;

    /* renamed from: i */
    private String f95171i;

    /* renamed from: j */
    private String f95172j;

    /* renamed from: k */
    private int f95173k;

    /* renamed from: l */
    private RemarkApi f95174l;

    /* renamed from: m */
    private List<Aweme> f95175m;
    protected AvatarImageView mAvatarIv;
    protected View mBackBtn;
    protected CommonItemView mBlock;
    protected CommonItemView mRemarkName;
    protected View mRemarkNameUnderline;
    protected CommonItemView mRemoveFollower;
    protected View mRemoveFollowerUnderline;
    protected RemoteImageView mSendMsgImage;
    protected ButtonTitleBar mTitleBar;

    /* renamed from: n */
    private C6309f f95176n;

    /* renamed from: o */
    private FollowViewModel f95177o;
    protected View shareView;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92312a(Throwable th) throws Exception {
        if (th instanceof ApiServerException) {
            C22814a.m75242a((Context) getActivity(), (ApiServerException) th);
        } else {
            C6921a.m21559a(th);
        }
    }

    /* renamed from: j */
    private FollowViewModel m117240j() {
        if (this.f95177o == null) {
            this.f95177o = new FollowViewModel(this);
        }
        return this.f95177o;
    }

    /* renamed from: a */
    private void m117233a() {
        if (!C6399b.m19944t()) {
            this.shareView.setContentDescription(getResources().getString(R.string.dsh));
        }
    }

    /* renamed from: d */
    private void m117235d() {
        if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo59877d()).booleanValue() || this.f95167e.getFollowerStatus() != 1) {
            this.mRemoveFollower.setVisibility(8);
        } else {
            this.mRemoveFollower.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m117236e() {
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105746a((Fragment) this, this.f95168f, "click_block");
            return;
        }
        if (this.f95167e != null) {
            if (this.f95167e.isBlock()) {
                m117238g();
                return;
            }
            m117237f();
        }
    }

    /* renamed from: f */
    private void m117237f() {
        boolean z = false;
        C36430dq dqVar = new C36430dq(this, 0);
        if (this.f95167e.getFollowStatus() == 2) {
            z = true;
        }
        C30553b.m99810g().wrapperSyncXBlockWithDialog(getContext(), z, dqVar);
        C30560g.m99818a("others_homepage", this.f95167e.getUid(), "");
        C6907h.m21524a("click_block", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
    }

    /* renamed from: g */
    private void m117238g() {
        BlockApi.m115435a(this.f95176n, this.f95167e.getUid(), 0, 0);
        C30560g.m99817a("others_homepage", this.f95167e.getUid());
        this.mBlock.setLeftText(getResources().getString(R.string.tj));
        C6907h.m21524a("click_unblock", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
    }

    /* renamed from: i */
    private void m117239i() {
        if (this.f95173k == 0 || this.f95173k == 4 || !TextUtils.isEmpty(this.f95167e.getEnterpriseVerifyReason())) {
            this.mRemarkName.setVisibility(8);
            this.mRemarkNameUnderline.findViewById(R.id.crl).setVisibility(8);
        } else if (TextUtils.isEmpty(this.f95167e.getRemarkName())) {
            this.mRemarkName.setRightText(getString(R.string.a5a));
        } else {
            this.mRemarkName.setRightText(this.f95167e.getRemarkName());
        }
    }

    /* renamed from: a */
    public static ProfileMoreFragment m117232a(Bundle bundle) {
        ProfileMoreFragment profileMoreFragment = new ProfileMoreFragment();
        profileMoreFragment.setArguments(bundle);
        return profileMoreFragment;
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("user", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getActivity(), this.mTitleBar, shareCompleteEvent);
        }
    }

    /* renamed from: a */
    private void m117234a(boolean z) {
        this.f95167e.setBlock(z);
        if (z && this.f95173k != 0) {
            this.f95167e.setFollowStatus(0);
        }
        C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f95167e);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid()) {
            if ((!C43122ff.m136769b(this.f95167e, false) || followStatus.followStatus != 1) && TextUtils.equals(followStatus.userId, this.f95167e.getUid())) {
                this.f95173k = followStatus.followStatus;
                m117239i();
            }
        }
    }

    public void handleMsg(Message message) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            int i = message.what;
            Object obj = message.obj;
            if (i == 31) {
                if (obj instanceof ApiServerException) {
                    C10761a.m31403c(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg()).mo25750a();
                } else if (obj instanceof Exception) {
                    C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
                } else if (obj instanceof BlockStruct) {
                    int i2 = ((BlockStruct) obj).blockStatus;
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    m117234a(z);
                    this.f95167e.setRemarkName("");
                    if (this.f95173k != 0) {
                        this.f95173k = 0;
                        C42961az.m136380a(new FollowStatus(this.f95167e.getUid(), this.f95173k));
                    }
                    C42961az.m136380a(new C35669g(this.f95167e.getUid(), i2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92307a(C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.dic).mo25750a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) hVar.mo6890e();
            if (commitRemarkNameResponse.isOK()) {
                this.f95167e.setRemarkName(((CommitRemarkNameResponse) hVar.mo6890e()).remarkName);
                C30553b.m99810g().updateIMUser(C30553b.m99780a(this.f95167e));
                this.mRemarkName.setRightText(this.f95167e.getRemarkName());
                C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f95167e);
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.dea).mo25750a();
            } else {
                C10761a.m31403c((Context) getActivity(), commitRemarkNameResponse.statusMsg).mo25750a();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92310a(BaseResponse baseResponse) throws Exception {
        this.f95167e.setFollowerStatus(0);
        if (this.f95167e.getFollowStatus() == 2) {
            this.f95167e.setFollowStatus(1);
        }
        m117235d();
        C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f95167e);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.jo) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == R.id.crk) {
            if (getActivity() != null) {
                C0633q a = getActivity().getSupportFragmentManager().mo2645a();
                a.mo2584a(R.anim.c4, R.anim.cc, R.anim.c2, R.anim.cf);
                a.mo2585a((int) R.id.aoy, (Fragment) MultilineInputFragment.m116672a(R.string.ayy, R.string.de_, R.string.cv6, 20, this.f95167e.getRemarkName(), this.f95167e.getUid()));
                a.mo2589a((String) null);
                a.mo2604c();
            }
            C6907h.m21524a("click_edit_remarks", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
        } else if (view.getId() == R.id.crz) {
            if (!C21115b.m71197a().isLogin()) {
                C32656f.m105746a((Fragment) this, this.f95168f, "report");
            } else if (this.f95167e != null) {
                String str = "";
                C6711m mVar = new C6711m();
                try {
                    mVar.mo16147a("nickname", this.f95167e.getNickname());
                    mVar.mo16147a("uid", this.f95167e.getUid());
                    str = C42996by.m136485a(mVar);
                } catch (Exception unused) {
                }
                ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "user", new Builder().appendQueryParameter("owner_id", this.f95167e.getUid()).appendQueryParameter("object_id", this.f95167e.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str), null);
                C6907h.m21524a("click_report", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
            }
        } else if (view.getId() == R.id.mt) {
            m117236e();
        } else if (view.getId() == R.id.d37) {
            if (this.f95167e != null) {
                C30560g.m99816a(this.f95167e.getUid());
                C30560g.m99819a(this.f95167e.getUid(), this.f95169g, this.f95168f, this.f95170h, "click_stranger_chat_button");
                C30553b.m99810g().wrapperChatWithSyncXAlert(getActivity(), C30553b.m99780a(this.f95167e), 3);
            }
        } else if (view.getId() == R.id.d4i) {
            if (this.f95167e != null) {
                GeneralPermission generalPermission = this.f95167e.getGeneralPermission();
                if (generalPermission != null) {
                    if (!C6399b.m19944t() && generalPermission.getShareToast() == 1) {
                        C10761a.m31409e((Context) getActivity(), (int) R.string.qd).mo25750a();
                        return;
                    } else if (C6399b.m19944t() && !TextUtils.isEmpty(generalPermission.getShareProfileToast())) {
                        C10761a.m31403c((Context) getActivity(), generalPermission.getShareProfileToast()).mo25750a();
                        return;
                    }
                }
                C36717ag.m118374a((Activity) getActivity(), this.f95167e, this.f95171i, this.f95175m);
                C6907h.m21524a("click_share_person", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
            }
        } else if (view.getId() == R.id.crn) {
            C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
            Dialog b = new C10741a(getContext()).mo25649a((int) R.string.def).mo25657b((int) R.string.dee).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ded, (OnClickListener) new C36429dp(this)).mo25656a().mo25638b();
            if (b.findViewById(R.id.e0u) instanceof TextView) {
                ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92311a(String str) {
        C6907h.m21524a("edit_remarks", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("account_type", "click").mo59973a("to_user_id", this.f95167e.getUid()).f60753a);
        if (this.f95174l == null) {
            this.f95174l = (RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RemarkApi.class);
        }
        this.f95174l.commitRemarkName(str, this.f95167e.getUid(), this.f95167e.getSecUid()).mo6876a((C1591g<TResult, TContinuationResult>) new C36433dt<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92309a(DialogInterface dialogInterface, int i) {
        C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
        m117240j().mo93105a(this.f95167e.getUid(), new C36431dr(this), new C36432ds(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f95176n = new C6309f(this);
        this.f95167e = (User) getArguments().getSerializable("user");
        this.f95168f = getArguments().getString("enter_from");
        this.f95169g = getArguments().getString("aweme_id");
        this.f95170h = getArguments().getString("request_id");
        this.f95171i = getArguments().getString("from");
        this.f95172j = getArguments().getString("profile_from");
        this.f95173k = getArguments().getInt("follow_status");
        this.f95175m = (List) getArguments().getSerializable("aweme_list");
        if (this.f95167e != null && this.f95167e.isSecret()) {
            this.shareView.setVisibility(8);
        }
        this.mTitleBar.setTitle((int) R.string.c_z);
        if (!C6399b.m19944t()) {
            this.mBackBtn.setContentDescription(getString(R.string.pp));
        }
        C23323e.m76524b(this.mAvatarIv, C43122ff.m136778i(this.f95167e));
        C43122ff.m136766b(getActivity(), this.mAvatarIv, this.f95167e);
        ((TextView) view.findViewById(R.id.c4a)).setText(this.f95167e.getNickname());
        TextView textView = (TextView) view.findViewById(R.id.e9_);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.dut));
        sb.append(C43122ff.m136777h(this.f95167e));
        textView.setText(sb.toString());
        m117239i();
        if (!C30553b.m99785a() || (!C43122ff.m136783n(this.f95167e) && C36530bb.m117956c())) {
            this.mSendMsgImage.setVisibility(8);
        } else if (!C6399b.m19944t()) {
            C30553b.m99810g().wrapperSendMessageSyncXIcon(this.mSendMsgImage, 3);
            C30560g.m99815a(getContext());
        }
        if (this.f95167e.isBlock()) {
            this.mBlock.setLeftText(getResources().getString(R.string.fip));
        }
        C23352a.m76612a().mo60651a("aweme.main.profile.multi_line_input.remark_name", String.class).observe(this, new C36428do(this));
        m117235d();
        m117233a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.q8, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92308a(int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i2 == -2 || i2 != -1) {
            C30560g.m99818a("cancel", this.f95167e.getUid(), "others_homepage");
            return;
        }
        BlockApi.m115435a(this.f95176n, this.f95167e.getUid(), 1, i);
        C30560g.m99818a("success", this.f95167e.getUid(), "others_homepage");
        if (TextUtils.equals(this.f95172j, "chat")) {
            C30560g.m99821b(this.f95167e.getUid());
        }
        this.mBlock.setLeftText(getResources().getString(R.string.fip));
    }
}
