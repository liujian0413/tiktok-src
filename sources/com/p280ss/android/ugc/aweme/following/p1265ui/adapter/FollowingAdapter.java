package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowingFollowerPageParam;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RemarkEditDialog;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36698b;
import com.p280ss.android.ugc.aweme.profile.util.C36727al;
import com.p280ss.android.ugc.aweme.profile.util.C36748p;
import com.p280ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter */
public class FollowingAdapter extends RecyclerHeaderViewAdapter<User> {

    /* renamed from: g */
    public static final String f78247g = "FollowingAdapter";

    /* renamed from: e */
    public boolean f78248e;

    /* renamed from: f */
    public C29748a f78249f;

    /* renamed from: h */
    protected FollowingFollowerPageParam f78250h;

    /* renamed from: i */
    public boolean f78251i;

    /* renamed from: j */
    public boolean f78252j = (!C6399b.m19944t());

    /* renamed from: k */
    public HashMap<String, Boolean> f78253k = new HashMap<>();

    /* renamed from: w */
    public C0043i f78254w;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter$ViewHolder */
    class ViewHolder extends C1293v {

        /* renamed from: a */
        C29548a f78256a;

        /* renamed from: b */
        FollowViewModel f78257b;
        View editRemark;
        AvatarImageWithVerify ivAvatar;
        View more;
        TextView txtDesc;
        FollowUserBtn txtFollow;
        TextView txtUserName;

        /* renamed from: a */
        private static boolean m97470a(int i) {
            return i == 1 || i == 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75728a(CharSequence[] charSequenceArr, User user, Resources resources, View view) {
            C25712a aVar = new C25712a(view.getContext());
            aVar.mo66614a(charSequenceArr, (OnClickListener) new C29751d(this, view, user, resources));
            aVar.mo66615b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75727a(Throwable th) throws Exception {
            Throwable a = C22814a.m75241a(th);
            if (a instanceof ApiServerException) {
                C22814a.m75242a(this.itemView.getContext(), (ApiServerException) a);
            } else {
                C6921a.m21559a(a);
            }
        }

        /* renamed from: a */
        private FollowViewModel m97469a() {
            if (this.f78257b == null) {
                this.f78257b = new FollowViewModel(FollowingAdapter.this.f78254w);
            }
            return this.f78257b;
        }

        /* renamed from: a */
        public final void mo75722a(final User user) {
            UserVerify userVerify;
            this.itemView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    FollowingAdapter.this.f78249f.mo68088a(user, ViewHolder.this.getAdapterPosition());
                }
            });
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            } else {
                userVerify = null;
            }
            this.ivAvatar.setUserData(userVerify);
            if (C6399b.m19944t()) {
                this.ivAvatar.mo60896b();
            }
            mo75723a(user, user.getFollowStatus());
            m97471b(user, user.getFollowStatus());
            this.f78256a.f77866c = new C29749b(this, user);
            if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo59877d()).booleanValue() || !FollowingAdapter.this.f78250h.isMine() || FollowingAdapter.this.f78250h == null || FollowingAdapter.this.f78250h.getPageType() != PageType.follower) {
                this.more.getLayoutParams().width = 0;
            } else {
                Resources resources = this.more.getResources();
                this.more.setOnClickListener(new C29750c(this, new CharSequence[]{resources.getString(R.string.deb), resources.getString(R.string.w_)}, user, resources));
                this.more.getLayoutParams().width = -2;
            }
            this.f78256a.mo75558a(user);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo75729b(User user, FollowStatus followStatus) {
            mo75723a(user, followStatus.followStatus);
        }

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f78256a = new C29548a(this.txtFollow, FollowingAdapter.this.mo75720f());
        }

        /* renamed from: b */
        private void m97471b(final User user, int i) {
            if (C7213d.m22500a().mo18785ax() == 2 || C7213d.m22500a().mo18785ax() == 3) {
                if (FollowingAdapter.this.f78253k != null && FollowingAdapter.this.f78253k.get(user.getUid()) != null) {
                    C36694aa.m118342a(user, i, this.editRemark, "fans", ((Boolean) FollowingAdapter.this.f78253k.get(user.getUid())).booleanValue(), (C36698b) new C36698b() {
                        /* renamed from: b */
                        public final void mo75709b() {
                        }

                        /* renamed from: a */
                        public final void mo71634a() {
                            ViewHolder.this.mo75723a(user, user.getFollowStatus());
                        }
                    });
                    FollowingAdapter.this.f78253k.put(user.getUid(), Boolean.valueOf(false));
                } else if (this.editRemark != null) {
                    this.editRemark.setVisibility(8);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75725a(User user, BaseResponse baseResponse) throws Exception {
            user.setFollowerStatus(0);
            if (user.getFollowStatus() == 2) {
                user.setFollowStatus(1);
            }
            int indexOf = FollowingAdapter.this.mo62312a().indexOf(user);
            FollowingAdapter.this.mo62312a().remove(indexOf);
            FollowingAdapter.this.notifyItemRemoved(indexOf);
        }

        /* renamed from: a */
        public final void mo75723a(User user, int i) {
            boolean z;
            boolean z2;
            this.txtDesc.setVisibility(0);
            if (C6399b.m19946v()) {
                this.txtUserName.setText(user.getNickname());
                TextView textView = this.txtDesc;
                StringBuilder sb = new StringBuilder("@");
                sb.append(C36727al.m136753A(user));
                textView.setText(sb.toString());
            } else {
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    this.txtUserName.setText(user.getRemarkName());
                    this.txtDesc.setText(this.itemView.getContext().getResources().getString(R.string.b8j, new Object[]{user.getNickname()}));
                    z2 = false;
                    z = true;
                } else {
                    this.txtUserName.setText(user.getNickname());
                    if (TextUtils.isEmpty(user.getSignature())) {
                        if (FollowingAdapter.this.f78252j) {
                            this.txtDesc.setVisibility(8);
                        } else {
                            this.txtDesc.setText(R.string.dum);
                        }
                        z2 = false;
                    } else {
                        this.txtDesc.setText(user.getSignature());
                        z2 = true;
                    }
                    z = false;
                }
                if (FollowingAdapter.this.f78248e) {
                    boolean isEmpty = true ^ TextUtils.isEmpty(user.getRecommendReason());
                    if (m97470a(i) || !isEmpty) {
                        this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        if (!isEmpty || FollowingAdapter.this.f78253k == null || FollowingAdapter.this.f78253k.get(user.getUid()) == null) {
                            if (z2) {
                                this.txtDesc.setText("");
                                this.txtDesc.setVisibility(8);
                            }
                        } else if (!z) {
                            this.txtDesc.setText(user.getRecommendReason());
                            this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aza, 0, 0, 0);
                            C9738o.m28712b((View) this.txtDesc, 0);
                        }
                    } else {
                        this.txtDesc.setText(user.getRecommendReason());
                        this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(R.drawable.aza, 0, 0, 0);
                        C9738o.m28712b((View) this.txtDesc, 0);
                    }
                }
            }
            if (C6399b.m19944t()) {
                C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.txtUserName);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75726a(User user, FollowStatus followStatus) {
            if (followStatus != null) {
                if (FollowingAdapter.this.f78253k != null) {
                    FollowingAdapter.this.f78253k.put(user.getUid(), Boolean.valueOf(true));
                }
                m97471b(user, followStatus.followStatus);
                mo75723a(user, followStatus.followStatus);
                if (this.itemView != null && C36748p.m118458a(this.itemView.getContext(), user, followStatus)) {
                    RemarkEditDialog remarkEditDialog = new RemarkEditDialog(this.itemView.getContext());
                    remarkEditDialog.f96236f = user;
                    remarkEditDialog.f96237g = followStatus.contactName;
                    remarkEditDialog.f96238h = 1;
                    remarkEditDialog.f96235e = new C29755h(this, user, followStatus);
                    remarkEditDialog.show();
                }
                if (followStatus.followStatus == 0 && !TextUtils.isEmpty(user.getRemarkName())) {
                    user.setRemarkName("");
                    mo75723a(user, followStatus.followStatus);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75724a(User user, DialogInterface dialogInterface, int i) {
            C6907h.m21524a("remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "fans").f60753a);
            m97469a().mo93105a(user.getUid(), new C29753f(this, user), new C29754g(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo75721a(View view, User user, Resources resources, DialogInterface dialogInterface, int i) {
            String str;
            if (i == 0) {
                C6907h.m21524a("click_remove_fans", (Map) C22984d.m75611a().mo59973a("enter_from", "fans").f60753a);
                C10741a a = new C10741a(view.getContext()).mo25649a((int) R.string.def);
                if (C6399b.m19944t()) {
                    str = C1642a.m8034a(view.getResources().getString(R.string.dee), new Object[]{C43122ff.m136777h(user)});
                } else {
                    str = view.getResources().getString(R.string.dee);
                }
                Dialog b = a.mo25660b(str).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ded, (OnClickListener) new C29752e(this, user)).mo25656a().mo25638b();
                if (b.findViewById(R.id.e0u) instanceof TextView) {
                    ((TextView) b.findViewById(R.id.e0u)).setTextColor(resources.getColor(R.color.lk));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter$ViewHolder_ViewBinding */
    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f78263a;

        public void unbind() {
            ViewHolder viewHolder = this.f78263a;
            if (viewHolder != null) {
                this.f78263a = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.txtFollow = null;
                viewHolder.editRemark = null;
                viewHolder.more = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f78263a = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, R.id.b64, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, R.id.e7f, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.e6j, "field 'txtDesc'", TextView.class);
            viewHolder.txtFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, R.id.e6o, "field 'txtFollow'", FollowUserBtn.class);
            viewHolder.editRemark = Utils.findRequiredView(view, R.id.b8s, "field 'editRemark'");
            viewHolder.more = Utils.findRequiredView(view, R.id.bzu, "field 'more'");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C29556e mo75720f() {
        return new C29556e() {
            /* renamed from: b */
            public final String mo68100b() {
                return "click_follow";
            }

            /* renamed from: a */
            public final String mo68099a() {
                return FollowingAdapter.m97457b(FollowingAdapter.this.f78250h);
            }

            /* renamed from: c */
            public final int mo68101c() {
                if (FollowingAdapter.this.f78250h.isMine()) {
                    if (FollowingAdapter.this.f78250h.getPageType() == PageType.follower) {
                        return 9;
                    }
                    return 0;
                } else if (FollowingAdapter.this.f78250h.getPageType() == PageType.follower) {
                    return 11;
                } else {
                    return 10;
                }
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                String str;
                String str2;
                MobClick obtain = MobClick.obtain();
                if (i == 1) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                C6907h.onEvent(obtain.setEventName(str).setLabelName(FollowingAdapter.m97457b(FollowingAdapter.this.f78250h)).setValue(String.valueOf(user.getUid())));
                if (i == 1) {
                    String str3 = "follow";
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", FollowingAdapter.m97457b(FollowingAdapter.this.f78250h)).mo59973a("to_user_id", user.getUid());
                    String str4 = "previous_page";
                    if (FollowingAdapter.this.f78250h.isMine()) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("previous_page_position", "other_places").mo59973a("enter_method", "follow_button").mo59975b().f60753a);
                }
            }
        };
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
    }

    /* renamed from: b */
    public final int mo75719b(String str) {
        int d = m97458d(str);
        if (d == -1 || !mo61150d()) {
            return d;
        }
        return d + 1;
    }

    public FollowingAdapter(C0043i iVar) {
        this.f78254w = iVar;
    }

    /* renamed from: b */
    public static String m97457b(FollowingFollowerPageParam followingFollowerPageParam) {
        if (followingFollowerPageParam.isMine()) {
            if (followingFollowerPageParam.getPageType() == PageType.follower) {
                return "fans";
            }
            return "following";
        } else if (followingFollowerPageParam.getPageType() == PageType.follower) {
            return "other_fans";
        } else {
            return "other_following";
        }
    }

    /* renamed from: d */
    private int m97458d(String str) {
        if (mo60557c() == 0) {
            return -1;
        }
        int size = this.f67539l.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f67539l.get(i);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final User mo75717a(String str) {
        if (this.f67539l == null) {
            return null;
        }
        for (User user : this.f67539l) {
            if (TextUtils.equals(user.getUid(), str)) {
                return user;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo75718a(FollowingFollowerPageParam followingFollowerPageParam) {
        boolean z;
        this.f78250h = followingFollowerPageParam;
        boolean z2 = true;
        if (!C36337ai.m117567a(followingFollowerPageParam.getUser()) || followingFollowerPageParam.getPageType() != PageType.follower) {
            z = false;
        } else {
            z = true;
        }
        this.f78251i = z;
        if (followingFollowerPageParam.isMine()) {
            if (!C7213d.m22500a().mo18786ay() || C6399b.m19944t() || followingFollowerPageParam.getPageType() != PageType.follower) {
                z2 = false;
            }
            this.f78248e = z2;
            return;
        }
        if (!C7213d.m22500a().mo18786ay() || C6399b.m19944t()) {
            z2 = false;
        }
        this.f78248e = z2;
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w4, viewGroup, false));
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        ((ViewHolder) vVar).mo75722a((User) this.f67539l.get(i));
    }
}
