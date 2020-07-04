package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.api.BlockApi;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35669g;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2 */
public final class ProfileMoreFragmentV2 extends BottomSheetDialogFragment implements C6310a {

    /* renamed from: a */
    public User f95178a;

    /* renamed from: b */
    public String f95179b;

    /* renamed from: c */
    public final C6309f f95180c = new C6309f(this);

    /* renamed from: d */
    private String f95181d;

    /* renamed from: e */
    private String f95182e;

    /* renamed from: f */
    private String f95183f;

    /* renamed from: g */
    private String f95184g;

    /* renamed from: h */
    private List<? extends Aweme> f95185h;

    /* renamed from: i */
    private int f95186i;

    /* renamed from: j */
    private FollowViewModel f95187j;

    /* renamed from: k */
    private HashMap f95188k;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$a */
    static final class C36273a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileMoreFragmentV2 f95189a;

        C36273a(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            this.f95189a = profileMoreFragmentV2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (i != -1) {
                C30560g.m99818a("cancel", ProfileMoreFragmentV2.m117250a(this.f95189a).getUid(), "others_homepage");
            } else {
                BlockApi.m115435a(this.f95189a.f95180c, ProfileMoreFragmentV2.m117250a(this.f95189a).getUid(), 1, 0);
                C30560g.m99818a("success", ProfileMoreFragmentV2.m117250a(this.f95189a).getUid(), "others_homepage");
                if (TextUtils.equals(ProfileMoreFragmentV2.m117252b(this.f95189a), "chat")) {
                    C30560g.m99821b(ProfileMoreFragmentV2.m117250a(this.f95189a).getUid());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$b */
    static final class C36274b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileMoreFragmentV2 f95190a;

        C36274b(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            this.f95190a = profileMoreFragmentV2;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
            this.f95190a.mo92316a().mo93105a(ProfileMoreFragmentV2.m117250a(this.f95190a).getUid(), new C7326g<BaseResponse>(this) {

                /* renamed from: a */
                final /* synthetic */ C36274b f95191a;

                {
                    this.f95191a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(BaseResponse baseResponse) {
                    ProfileMoreFragmentV2.m117250a(this.f95191a.f95190a).setFollowerStatus(0);
                    if (ProfileMoreFragmentV2.m117250a(this.f95191a.f95190a).getFollowStatus() == 2) {
                        ProfileMoreFragmentV2.m117250a(this.f95191a.f95190a).setFollowStatus(1);
                    }
                    C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(ProfileMoreFragmentV2.m117250a(this.f95191a.f95190a));
                }
            }, new C7326g<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C36274b f95192a;

                {
                    this.f95192a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    if (th instanceof ApiServerException) {
                        C22814a.m75242a((Context) this.f95192a.f95190a.getActivity(), (ApiServerException) th);
                    } else {
                        C6921a.m21559a(th);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$c */
    static final /* synthetic */ class C36277c extends FunctionReference implements C7562b<View, C7581n> {
        C36277c(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117260a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117260a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$d */
    static final /* synthetic */ class C36278d extends FunctionReference implements C7562b<View, C7581n> {
        C36278d(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117261a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117261a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$e */
    static final /* synthetic */ class C36279e extends FunctionReference implements C7562b<View, C7581n> {
        C36279e(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117262a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117262a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$f */
    static final /* synthetic */ class C36280f extends FunctionReference implements C7562b<View, C7581n> {
        C36280f(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117263a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117263a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$g */
    static final /* synthetic */ class C36281g extends FunctionReference implements C7562b<View, C7581n> {
        C36281g(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117264a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117264a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$h */
    static final /* synthetic */ class C36282h extends FunctionReference implements C7562b<View, C7581n> {
        C36282h(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117265a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117265a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$i */
    static final /* synthetic */ class C36283i extends FunctionReference implements C7562b<View, C7581n> {
        C36283i(ProfileMoreFragmentV2 profileMoreFragmentV2) {
            super(1, profileMoreFragmentV2);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ProfileMoreFragmentV2.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117266a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117266a(View view) {
            C7573i.m23587b(view, "p1");
            ((ProfileMoreFragmentV2) this.receiver).mo92317a(view);
        }
    }

    /* renamed from: a */
    private View m117249a(int i) {
        if (this.f95188k == null) {
            this.f95188k = new HashMap();
        }
        View view = (View) this.f95188k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f95188k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    private void m117255d() {
        if (this.f95188k != null) {
            this.f95188k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m117255d();
    }

    /* renamed from: b */
    private final void m117253b() {
        boolean z;
        IIMService g = C30553b.m99810g();
        Context context = getContext();
        User user = this.f95178a;
        if (user == null) {
            C7573i.m23583a("user");
        }
        if (user.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        g.wrapperSyncXBlockWithDialog(context, z, new C36273a(this));
        String str = "others_homepage";
        User user2 = this.f95178a;
        if (user2 == null) {
            C7573i.m23583a("user");
        }
        C30560g.m99818a(str, user2.getUid(), "");
        String str2 = "click_block";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
        String str3 = "to_user_id";
        User user3 = this.f95178a;
        if (user3 == null) {
            C7573i.m23583a("user");
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, user3.getUid()).f60753a);
    }

    /* renamed from: c */
    private final void m117254c() {
        Handler handler = this.f95180c;
        User user = this.f95178a;
        if (user == null) {
            C7573i.m23583a("user");
        }
        BlockApi.m115435a(handler, user.getUid(), 0, 0);
        String str = "others_homepage";
        User user2 = this.f95178a;
        if (user2 == null) {
            C7573i.m23583a("user");
        }
        C30560g.m99817a(str, user2.getUid());
        ((DmtTextView) m117249a((int) R.id.mw)).setText(R.string.tj);
        String str2 = "click_unblock";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
        String str3 = "to_user_id";
        User user3 = this.f95178a;
        if (user3 == null) {
            C7573i.m23583a("user");
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, user3.getUid()).f60753a);
    }

    /* renamed from: a */
    public final FollowViewModel mo92316a() {
        FollowViewModel followViewModel = this.f95187j;
        if (followViewModel == null) {
            return new FollowViewModel(this);
        }
        return followViewModel;
    }

    /* renamed from: a */
    public static final /* synthetic */ User m117250a(ProfileMoreFragmentV2 profileMoreFragmentV2) {
        User user = profileMoreFragmentV2.f95178a;
        if (user == null) {
            C7573i.m23583a("user");
        }
        return user;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m117252b(ProfileMoreFragmentV2 profileMoreFragmentV2) {
        String str = profileMoreFragmentV2.f95179b;
        if (str == null) {
            C7573i.m23583a("profileFrom");
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BottomSheetDialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        return new BottomSheetDialog(context, R.style.w1);
    }

    /* renamed from: a */
    private final void m117251a(boolean z) {
        User user = this.f95178a;
        if (user == null) {
            C7573i.m23583a("user");
        }
        user.setBlock(z);
        if (z && this.f95186i != 0) {
            User user2 = this.f95178a;
            if (user2 == null) {
                C7573i.m23583a("user");
            }
            user2.setFollowStatus(0);
        }
        C23084b a = C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class);
        User user3 = this.f95178a;
        if (user3 == null) {
            C7573i.m23583a("user");
        }
        a.postValue(user3);
    }

    public final void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
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
                m117251a(z);
                User user = this.f95178a;
                if (user == null) {
                    C7573i.m23583a("user");
                }
                user.setRemarkName("");
                if (this.f95186i != 0) {
                    this.f95186i = 0;
                    User user2 = this.f95178a;
                    if (user2 == null) {
                        C7573i.m23583a("user");
                    }
                    C42961az.m136380a(new FollowStatus(user2.getUid(), this.f95186i));
                }
                User user3 = this.f95178a;
                if (user3 == null) {
                    C7573i.m23583a("user");
                }
                String uid = user3.getUid();
                C7573i.m23582a((Object) uid, "user.uid");
                C42961az.m136380a(new C35669g(uid, i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo92317a(View view) {
        int id = view.getId();
        if (id == R.id.b8s) {
            Intent intent = new Intent(getActivity(), ProfileMoreActivity.class);
            intent.putExtra("init_page_type", 1);
            String str = "remark";
            User user = this.f95178a;
            if (user == null) {
                C7573i.m23583a("user");
            }
            intent.putExtra(str, user.getRemarkName());
            String str2 = "uid";
            User user2 = this.f95178a;
            if (user2 == null) {
                C7573i.m23583a("user");
            }
            intent.putExtra(str2, user2.getUid());
            String str3 = "user";
            User user3 = this.f95178a;
            if (user3 == null) {
                C7573i.m23583a("user");
            }
            intent.putExtra(str3, user3);
            intent.putExtra("need_commit_remark_immediate", true);
            startActivity(intent);
            dismiss();
            String str4 = "click_edit_remarks";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
            String str5 = "to_user_id";
            User user4 = this.f95178a;
            if (user4 == null) {
                C7573i.m23583a("user");
            }
            C6907h.m21524a(str4, (Map) a.mo59973a(str5, user4.getUid()).f60753a);
        } else if (id == R.id.d65) {
            User user5 = this.f95178a;
            if (user5 == null) {
                C7573i.m23583a("user");
            }
            GeneralPermission generalPermission = user5.getGeneralPermission();
            if (generalPermission != null) {
                if (!C6399b.m19944t() && generalPermission.getShareToast() == 1) {
                    C10761a.m31409e((Context) getActivity(), (int) R.string.qd).mo25750a();
                    dismiss();
                    return;
                } else if (C6399b.m19944t() && !TextUtils.isEmpty(generalPermission.getShareProfileToast())) {
                    C10761a.m31403c((Context) getActivity(), generalPermission.getShareProfileToast()).mo25750a();
                    dismiss();
                    return;
                }
            }
            Activity activity = getActivity();
            User user6 = this.f95178a;
            if (user6 == null) {
                C7573i.m23583a("user");
            }
            String str6 = this.f95184g;
            if (str6 == null) {
                C7573i.m23583a("from");
            }
            List<? extends Aweme> list = this.f95185h;
            if (list == null) {
                C7573i.m23583a("awemeList");
            }
            C36717ag.m118374a(activity, user6, str6, list);
            dismiss();
            String str7 = "click_share_person";
            C22984d a2 = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
            String str8 = "to_user_id";
            User user7 = this.f95178a;
            if (user7 == null) {
                C7573i.m23583a("user");
            }
            C6907h.m21524a(str7, (Map) a2.mo59973a(str8, user7.getUid()).f60753a);
        } else if (id == R.id.d3a) {
            User user8 = this.f95178a;
            if (user8 == null) {
                C7573i.m23583a("user");
            }
            C30560g.m99816a(user8.getUid());
            User user9 = this.f95178a;
            if (user9 == null) {
                C7573i.m23583a("user");
            }
            String uid = user9.getUid();
            String str9 = this.f95182e;
            if (str9 == null) {
                C7573i.m23583a("awemeId");
            }
            String str10 = this.f95181d;
            if (str10 == null) {
                C7573i.m23583a("enterFrom");
            }
            String str11 = this.f95183f;
            if (str11 == null) {
                C7573i.m23583a("requestId");
            }
            C30560g.m99819a(uid, str9, str10, str11, "click_stranger_chat_button");
            IIMService g = C30553b.m99810g();
            Activity activity2 = getActivity();
            User user10 = this.f95178a;
            if (user10 == null) {
                C7573i.m23583a("user");
            }
            g.wrapperChatWithSyncXAlert(activity2, C30553b.m99780a(user10), 3);
            dismiss();
        } else if (id == R.id.cs4) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!f.isLogin()) {
                Fragment fragment = this;
                String str12 = this.f95181d;
                if (str12 == null) {
                    C7573i.m23583a("enterFrom");
                }
                C32656f.m105746a(fragment, str12, "report");
                return;
            }
            String str13 = "";
            C6711m mVar = new C6711m();
            String str14 = "nickname";
            try {
                User user11 = this.f95178a;
                if (user11 == null) {
                    C7573i.m23583a("user");
                }
                mVar.mo16147a(str14, user11.getNickname());
                String str15 = "uid";
                User user12 = this.f95178a;
                if (user12 == null) {
                    C7573i.m23583a("user");
                }
                mVar.mo16147a(str15, user12.getUid());
                String a3 = C42996by.m136485a(mVar);
                C7573i.m23582a((Object) a3, "GsonUtil.toJson(jsonObject)");
                str13 = a3;
            } catch (Exception unused) {
            }
            Builder builder = new Builder();
            String str16 = "owner_id";
            User user13 = this.f95178a;
            if (user13 == null) {
                C7573i.m23583a("user");
            }
            Builder appendQueryParameter = builder.appendQueryParameter(str16, user13.getUid());
            String str17 = "object_id";
            User user14 = this.f95178a;
            if (user14 == null) {
                C7573i.m23583a("user");
            }
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "user", appendQueryParameter.appendQueryParameter(str17, user14.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str13), null);
            dismiss();
            String str18 = "click_report";
            C22984d a4 = C22984d.m75611a().mo59973a("enter_from", "others_homepage");
            String str19 = "to_user_id";
            User user15 = this.f95178a;
            if (user15 == null) {
                C7573i.m23583a("user");
            }
            C6907h.m21524a(str18, (Map) a4.mo59973a(str19, user15.getUid()).f60753a);
        } else if (id == R.id.mw) {
            IAccountUserService f2 = C6861a.m21337f();
            C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
            if (!f2.isLogin()) {
                Fragment fragment2 = this;
                String str20 = this.f95181d;
                if (str20 == null) {
                    C7573i.m23583a("enterFrom");
                }
                C32656f.m105746a(fragment2, str20, "click_block");
                return;
            }
            User user16 = this.f95178a;
            if (user16 == null) {
                C7573i.m23583a("user");
            }
            if (user16.isBlock()) {
                m117254c();
            } else {
                m117253b();
            }
            dismiss();
        } else if (id == R.id.crp) {
            C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").f60753a);
            Dialog b = new C10741a(getContext()).mo25649a((int) R.string.def).mo25657b((int) R.string.dee).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ded, (OnClickListener) new C36274b(this)).mo25656a().mo25638b();
            if (b.findViewById(R.id.e0u) instanceof TextView) {
                ((TextView) b.findViewById(R.id.e0u)).setTextColor(getResources().getColor(R.color.lk));
            }
            dismiss();
        } else {
            if (id == R.id.sp) {
                dismiss();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035c, code lost:
        if (r4.getFollowerStatus() == 1) goto L_0x0361;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            super.onViewCreated(r8, r9)
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x0011
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0011:
            java.lang.String r9 = "user"
            java.io.Serializable r8 = r8.getSerializable(r9)
            if (r8 == 0) goto L_0x0396
            com.ss.android.ugc.aweme.profile.model.User r8 = (com.p280ss.android.ugc.aweme.profile.model.User) r8
            r7.f95178a = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x0026
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0026:
            java.lang.String r9 = "enter_from"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0030
            java.lang.String r8 = ""
        L_0x0030:
            r7.f95181d = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x003b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003b:
            java.lang.String r9 = "aweme_id"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0045
            java.lang.String r8 = ""
        L_0x0045:
            r7.f95182e = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x0050
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0050:
            java.lang.String r9 = "request_id"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x005a
            java.lang.String r8 = ""
        L_0x005a:
            r7.f95183f = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x0065
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0065:
            java.lang.String r9 = "from"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x006f
            java.lang.String r8 = ""
        L_0x006f:
            r7.f95184g = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x007a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007a:
            java.lang.String r9 = "profile_from"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x0084
            java.lang.String r8 = ""
        L_0x0084:
            r7.f95179b = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x008f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x008f:
            java.lang.String r9 = "follow_status"
            r0 = 0
            int r8 = r8.getInt(r9, r0)
            r7.f95186i = r8
            android.os.Bundle r8 = r7.getArguments()
            if (r8 != 0) goto L_0x00a1
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a1:
            java.lang.String r9 = "aweme_list"
            java.io.Serializable r8 = r8.getSerializable(r9)
            boolean r9 = r8 instanceof java.util.List
            if (r9 != 0) goto L_0x00ac
            r8 = 0
        L_0x00ac:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x00b4
            java.util.List r8 = kotlin.collections.C7525m.m23461a()
        L_0x00b4:
            r7.f95185h = r8
            r8 = 2131298937(0x7f090a79, float:1.8215861E38)
            android.view.View r9 = r7.m117249a(r8)
            com.ss.android.ugc.aweme.views.AutoRTLImageView r9 = (com.p280ss.android.ugc.aweme.views.AutoRTLImageView) r9
            java.lang.String r1 = "iv_edit_remark"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            int r1 = r7.f95186i
            r2 = 8
            if (r1 == 0) goto L_0x00e7
            int r1 = r7.f95186i
            r3 = 4
            if (r1 == r3) goto L_0x00e7
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f95178a
            if (r1 != 0) goto L_0x00d8
            java.lang.String r3 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00d8:
            java.lang.String r1 = r1.getEnterpriseVerifyReason()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r1 = 0
            goto L_0x00e9
        L_0x00e7:
            r1 = 8
        L_0x00e9:
            r9.setVisibility(r1)
            android.view.View r8 = r7.m117249a(r8)
            com.ss.android.ugc.aweme.views.AutoRTLImageView r8 = (com.p280ss.android.ugc.aweme.views.AutoRTLImageView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$c r9 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$c
            r1 = r7
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2 r1 = (com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileMoreFragmentV2) r1
            r9.<init>(r1)
            kotlin.jvm.a.b r9 = (kotlin.jvm.p357a.C7562b) r9
            com.ss.android.ugc.aweme.profile.ui.du r3 = new com.ss.android.ugc.aweme.profile.ui.du
            r3.<init>(r9)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r8.setOnClickListener(r3)
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f95178a
            if (r8 != 0) goto L_0x010f
            java.lang.String r9 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r9)
        L_0x010f:
            java.lang.String r8 = r8.getRemarkName()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9 = 1
            if (r8 == 0) goto L_0x0121
            int r8 = r8.length()
            if (r8 != 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r8 = 0
            goto L_0x0122
        L_0x0121:
            r8 = 1
        L_0x0122:
            r3 = 2131300138(0x7f090f2a, float:1.8218297E38)
            r4 = 2131300139(0x7f090f2b, float:1.82183E38)
            if (r8 == 0) goto L_0x0156
            android.view.View r8 = r7.m117249a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "nickName_or_remark"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            com.ss.android.ugc.aweme.profile.model.User r3 = r7.f95178a
            if (r3 != 0) goto L_0x013e
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x013e:
            java.lang.String r3 = r3.getNickname()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r8.setText(r3)
            android.view.View r8 = r7.m117249a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "nick_name"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            r8.setVisibility(r2)
            goto L_0x01a9
        L_0x0156:
            android.view.View r8 = r7.m117249a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "nickName_or_remark"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            com.ss.android.ugc.aweme.profile.model.User r3 = r7.f95178a
            if (r3 != 0) goto L_0x016a
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x016a:
            java.lang.String r3 = r3.getRemarkName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r8.setText(r3)
            android.view.View r8 = r7.m117249a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "nick_name"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            r8.getVisibility()
            android.view.View r8 = r7.m117249a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "nick_name"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            r3 = 2131825904(0x7f1114f0, float:1.9284677E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            com.ss.android.ugc.aweme.profile.model.User r5 = r7.f95178a
            if (r5 != 0) goto L_0x019a
            java.lang.String r6 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x019a:
            java.lang.String r5 = r5.getNickname()
            r4[r0] = r5
            java.lang.String r3 = r7.getString(r3, r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r8.setText(r3)
        L_0x01a9:
            r8 = 2131303064(0x7f091a98, float:1.8224232E38)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            java.lang.String r3 = "user_id"
            kotlin.jvm.internal.C7573i.m23582a(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 2131826820(0x7f111884, float:1.9286535E38)
            java.lang.String r4 = r7.getString(r4)
            r3.append(r4)
            com.ss.android.ugc.aweme.profile.model.User r4 = r7.f95178a
            if (r4 != 0) goto L_0x01cf
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01cf:
            java.lang.String r4 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136777h(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r8.setText(r3)
            r8 = 2131301576(0x7f0914c8, float:1.8221214E38)
            android.view.View r3 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r3
            java.lang.String r4 = "share_view"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.profile.model.User r4 = r7.f95178a
            if (r4 != 0) goto L_0x01f6
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x01f6:
            boolean r4 = r4.isSecret()
            if (r4 == 0) goto L_0x01ff
            r4 = 8
            goto L_0x0200
        L_0x01ff:
            r4 = 0
        L_0x0200:
            r3.setVisibility(r4)
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r3 != 0) goto L_0x0224
            android.view.View r3 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r3
            java.lang.String r4 = "share_view"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.content.res.Resources r4 = r7.getResources()
            r5 = 2131826734(0x7f11182e, float:1.928636E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setContentDescription(r4)
        L_0x0224:
            r3 = 2131301577(0x7f0914c9, float:1.8221216E38)
            android.view.View r3 = r7.m117249a(r3)
            java.lang.String r4 = "share_view_divide_line"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.view.View r4 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r4
            java.lang.String r5 = "share_view"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            int r4 = r4.getVisibility()
            r3.setVisibility(r4)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$d r3 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$d
            r3.<init>(r1)
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            com.ss.android.ugc.aweme.profile.ui.du r4 = new com.ss.android.ugc.aweme.profile.ui.du
            r4.<init>(r3)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r8.setOnClickListener(r4)
            r8 = 2131301471(0x7f09145f, float:1.8221E38)
            android.view.View r3 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r3
            java.lang.String r4 = "send_msg"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            boolean r4 = com.p280ss.android.ugc.aweme.p313im.C30553b.m99785a()
            if (r4 == 0) goto L_0x0291
            com.ss.android.ugc.aweme.profile.model.User r4 = r7.f95178a
            if (r4 != 0) goto L_0x0276
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0276:
            boolean r4 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136783n(r4)
            if (r4 != 0) goto L_0x0282
            boolean r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36530bb.m117956c()
            if (r4 != 0) goto L_0x0291
        L_0x0282:
            boolean r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r4 != 0) goto L_0x028f
            android.content.Context r4 = r7.getContext()
            com.p280ss.android.ugc.aweme.p313im.C30560g.m99815a(r4)
        L_0x028f:
            r4 = 0
            goto L_0x0293
        L_0x0291:
            r4 = 8
        L_0x0293:
            r3.setVisibility(r4)
            r3 = 2131301472(0x7f091460, float:1.8221003E38)
            android.view.View r3 = r7.m117249a(r3)
            java.lang.String r4 = "send_msg_divide_line"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.view.View r4 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r4
            java.lang.String r5 = "send_msg"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            int r4 = r4.getVisibility()
            r3.setVisibility(r4)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$e r3 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$e
            r3.<init>(r1)
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            com.ss.android.ugc.aweme.profile.ui.du r4 = new com.ss.android.ugc.aweme.profile.ui.du
            r4.<init>(r3)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r8.setOnClickListener(r4)
            r8 = 2131301057(0x7f0912c1, float:1.8220161E38)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$f r3 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$f
            r3.<init>(r1)
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            com.ss.android.ugc.aweme.profile.ui.du r4 = new com.ss.android.ugc.aweme.profile.ui.du
            r4.<init>(r3)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r8.setOnClickListener(r4)
            r8 = 2131296759(0x7f0901f7, float:1.8211444E38)
            android.view.View r3 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r3
            com.ss.android.ugc.aweme.profile.model.User r4 = r7.f95178a
            if (r4 != 0) goto L_0x02f7
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x02f7:
            boolean r4 = r4.isBlock()
            if (r4 == 0) goto L_0x0301
            r4 = 2131829164(0x7f1121ac, float:1.929129E38)
            goto L_0x0304
        L_0x0301:
            r4 = 2131821292(0x7f1102ec, float:1.9275323E38)
        L_0x0304:
            r3.setText(r4)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$g r3 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$g
            r3.<init>(r1)
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            com.ss.android.ugc.aweme.profile.ui.du r4 = new com.ss.android.ugc.aweme.profile.ui.du
            r4.<init>(r3)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r8.setOnClickListener(r4)
            r8 = 2131301042(0x7f0912b2, float:1.822013E38)
            android.view.View r3 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r3
            java.lang.String r4 = "remove_follower_view"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.app.bl r4 = r4.getRemoveFollowerSwitch()
            java.lang.String r5 = "SharePrefCache.inst().removeFollowerSwitch"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = r4.mo59877d()
            java.lang.String r5 = "SharePrefCache.inst().removeFollowerSwitch.cache"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x035f
            com.ss.android.ugc.aweme.profile.model.User r4 = r7.f95178a
            if (r4 != 0) goto L_0x0358
            java.lang.String r5 = "user"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0358:
            int r4 = r4.getFollowerStatus()
            if (r4 != r9) goto L_0x035f
            goto L_0x0361
        L_0x035f:
            r0 = 8
        L_0x0361:
            r3.setVisibility(r0)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$h r9 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$h
            r9.<init>(r1)
            kotlin.jvm.a.b r9 = (kotlin.jvm.p357a.C7562b) r9
            com.ss.android.ugc.aweme.profile.ui.du r0 = new com.ss.android.ugc.aweme.profile.ui.du
            r0.<init>(r9)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r8.setOnClickListener(r0)
            r8 = 2131296974(0x7f0902ce, float:1.821188E38)
            android.view.View r8 = r7.m117249a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r8
            com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$i r9 = new com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragmentV2$i
            r9.<init>(r1)
            kotlin.jvm.a.b r9 = (kotlin.jvm.p357a.C7562b) r9
            com.ss.android.ugc.aweme.profile.ui.du r0 = new com.ss.android.ugc.aweme.profile.ui.du
            r0.<init>(r9)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r8.setOnClickListener(r0)
            return
        L_0x0396:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileMoreFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.q9, viewGroup, false);
        if (inflate == null) {
            C7573i.m23580a();
        }
        return inflate;
    }
}
