package com.p280ss.android.ugc.aweme.discover.adapter;

import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerifyAndLive;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25240an;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27035bc;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29552a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36728am;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder */
public class SearchUserViewHolder extends AbsSearchViewHolder implements OnClickListener {

    /* renamed from: c */
    User f69826c;
    ViewStub cardViewStub;

    /* renamed from: d */
    public SearchAdData f69827d;

    /* renamed from: e */
    C1293v f69828e;

    /* renamed from: f */
    ViewGroup f69829f;

    /* renamed from: g */
    C29748a f69830g;

    /* renamed from: h */
    private C28826b f69831h;

    /* renamed from: i */
    private SearchUser f69832i;

    /* renamed from: j */
    private int f69833j = 56;

    /* renamed from: k */
    private C29548a f69834k;
    FollowUserBtn mBtnFollow;
    AvatarImageWithVerifyAndLive mIvAvator;
    LiveCircleView mLiveCircle;
    ImageView mLiveTag;
    TextView mTvAwemeId;
    TextView mTvDesc;
    TextView mTvFansCnt;
    TextView mTvRecommendReason;
    TextView mTvUsername;

    /* renamed from: d */
    public final View mo67902d() {
        return this.itemView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo68097h() {
        m87110a("click_follow_button");
    }

    /* renamed from: A */
    private void m87106A() {
        if (C6399b.m19944t()) {
            this.mIvAvator.mo60896b();
        }
    }

    /* renamed from: B */
    private void m87107B() {
        this.mLiveCircle.setVisibility(8);
        this.mLiveTag.setVisibility(8);
    }

    /* renamed from: o */
    private boolean m87117o() {
        if (C43122ff.m136767b()) {
            return true;
        }
        return m87118p();
    }

    /* renamed from: p */
    private static boolean m87118p() {
        int f = C37380c.m119979f();
        if (f == 1 || f == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m87126x() {
        this.mIvAvator.mo60905a(true);
        this.mLiveCircle.setVisibility(0);
    }

    /* renamed from: y */
    private void m87127y() {
        this.mIvAvator.mo60905a(false);
        this.mLiveCircle.setVisibility(8);
    }

    /* renamed from: z */
    private void m87128z() {
        this.mIvAvator.mo60896b();
        this.mLiveTag.setVisibility(0);
    }

    /* renamed from: g */
    public final String mo68096g() {
        if (this.f69405b == null || !this.f69405b.f69897a) {
            return "search_result";
        }
        return "general_search";
    }

    /* renamed from: i */
    private void m87111i() {
        if (m87117o()) {
            this.mBtnFollow.setVisibility(8);
        } else {
            this.f69834k.mo75558a(this.f69826c);
        }
    }

    /* renamed from: l */
    private void m87114l() {
        if (this.f69827d != null && this.f69827d.brandInfo != null) {
            C25240an.m82970a(this.mTvUsername, this.f69827d.brandInfo, 4);
        }
    }

    /* renamed from: j */
    private void m87112j() {
        UserVerify userVerify;
        if (this.f69826c != null) {
            userVerify = new UserVerify(this.f69826c.getAvatarThumb(), this.f69826c.getCustomVerify(), this.f69826c.getEnterpriseVerifyReason(), Integer.valueOf(this.f69826c.getVerificationType()), this.f69826c.getWeiboVerify());
        } else {
            userVerify = null;
        }
        this.mIvAvator.setUserData(userVerify);
        m87109a(this.f69826c);
        m87106A();
    }

    /* renamed from: n */
    private void m87116n() {
        SpannableString spannableString;
        if (C43122ff.m136755C(this.f69826c)) {
            spannableString = m87122t();
        } else {
            spannableString = m87120r();
        }
        if (m87118p()) {
            this.mTvAwemeId.setText(spannableString);
            return;
        }
        this.mTvAwemeId.setText(spannableString);
        if (!C6399b.m19944t()) {
            this.mTvFansCnt.setVisibility(8);
            return;
        }
        this.mTvFansCnt.setVisibility(0);
        this.mTvFansCnt.setText(m87123u());
    }

    /* renamed from: s */
    private SpannableString m87121s() {
        String str;
        if (TextUtils.isEmpty(this.f69826c.getUniqueId())) {
            str = this.f69826c.getShortId();
        } else {
            str = this.f69826c.getUniqueId();
        }
        return C23472a.m77059a(this.itemView.getContext(), str, this.f69832i.uniqidPosition);
    }

    /* renamed from: t */
    private SpannableString m87122t() {
        if (!TextUtils.isEmpty(this.f69826c.getRemarkName())) {
            return C23472a.m77059a(this.mIvAvator.getContext(), this.f69826c.getRemarkName(), this.f69832i.remarkPosition);
        }
        return C23472a.m77059a(this.mIvAvator.getContext(), this.f69826c.getNickname(), this.f69832i.position);
    }

    /* renamed from: v */
    private String m87124v() {
        String a = C30537o.m99738a((long) this.f69826c.getAwemeCount());
        String string = this.itemView.getContext().getResources().getString(R.string.fph);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: w */
    private String m87125w() {
        int followStatus = this.f69826c.getFollowStatus();
        if (followStatus == 1) {
            return this.itemView.getContext().getResources().getString(R.string.b92);
        }
        if (followStatus == 2) {
            return this.itemView.getContext().getResources().getString(R.string.aua);
        }
        return "";
    }

    /* renamed from: r */
    private SpannableString m87120r() {
        String str;
        if (TextUtils.isEmpty(this.f69826c.getUniqueId())) {
            str = this.f69826c.getShortId();
        } else {
            str = this.f69826c.getUniqueId();
        }
        String a = C27035bc.m88797a(this.itemView.getContext());
        int indexOf = a.indexOf("%1");
        if (indexOf == -1) {
            indexOf = 0;
        }
        String a2 = C1642a.m8034a(a, new Object[]{str});
        if (C6399b.m19946v() && m87118p() && a2.endsWith(",")) {
            a2 = a2.substring(0, a2.length() - 1);
        }
        return C23472a.m77060a(this.itemView.getContext(), a2, this.f69832i.uniqidPosition, indexOf);
    }

    /* renamed from: u */
    private String m87123u() {
        String a = C30537o.m99738a((long) this.f69826c.getFollowerCount());
        if (C6399b.m19944t()) {
            String string = this.itemView.getContext().getResources().getString(R.string.b94);
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(" ");
            sb.append(string);
            return sb.toString();
        }
        return this.itemView.getContext().getString(R.string.b3x, new Object[]{a});
    }

    /* renamed from: e */
    public final Map<String, String> mo67903e() {
        String str;
        Map<String, String> e = super.mo67903e();
        if (this.f69832i.cardType() == 1) {
            e.put("token_type", "stardom");
            if (C6399b.m19944t()) {
                e.put("token_type", "hot_user");
                e.put("user_name", this.f69832i.user.getUniqueId());
                e.put("search_result_id", this.f69832i.user.getUid());
            }
        } else if (this.f69832i.cardType() == 2) {
            e.put("token_type", "musician");
        } else if (this.f69832i.cardType() == 3) {
            e.put("token_type", "artist");
        }
        String str2 = "is_aladdin";
        if (this.f69832i.isAladdin()) {
            str = "1";
        } else {
            str = "0";
        }
        e.put(str2, str);
        return e;
    }

    /* renamed from: f */
    public final Map<String, String> mo67904f() {
        String str;
        Map<String, String> f = super.mo67904f();
        if (this.f69832i.cardType() == 1) {
            f.put("token_type", "stardom");
            if (C6399b.m19944t()) {
                f.put("token_type", "hot_user");
                f.put("user_name", this.f69832i.user.getUniqueId());
                f.put("search_result_id", this.f69832i.user.getUid());
            }
        } else if (this.f69832i.cardType() == 2) {
            f.put("token_type", "musician");
        } else if (this.f69832i.cardType() == 3) {
            f.put("token_type", "artist");
        }
        String str2 = "is_aladdin";
        if (this.f69832i.isAladdin()) {
            str = "1";
        } else {
            str = "0";
        }
        f.put(str2, str);
        return f;
    }

    /* renamed from: k */
    private void m87113k() {
        UserVerify userVerify;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C43122ff.m136755C(this.f69826c)) {
            spannableStringBuilder.append(m87121s());
        } else {
            spannableStringBuilder.append(m87122t());
        }
        if (C6399b.m19944t()) {
            if (this.f69826c != null) {
                userVerify = new UserVerify(null, this.f69826c.getCustomVerify(), this.f69826c.getEnterpriseVerifyReason(), Integer.valueOf(-1), null);
            } else {
                userVerify = null;
            }
            if (C43126fg.m136802a(userVerify)) {
                String str = " T";
                spannableStringBuilder.append(str);
                spannableStringBuilder.setSpan(new C36728am(mo67898b(), R.drawable.a3r, 1), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 17);
            }
        }
        if (m87118p() && !TextUtils.isEmpty(m87125w())) {
            spannableStringBuilder.append(" · ");
            SpannableString spannableString = new SpannableString(m87125w());
            spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.itemView.getContext(), R.color.a53)), 0, spannableString.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(14, true), 0, spannableString.length(), 33);
            spannableStringBuilder.append(spannableString);
        }
        this.mTvUsername.setText(spannableStringBuilder);
        C30357c.m99190a(this.mTvUsername, this.f69826c.getStarBillboardRank(), 4, mo68096g(), null);
        m87114l();
    }

    /* renamed from: m */
    private void m87115m() {
        this.mTvDesc.setVisibility(0);
        this.mTvDesc.setCompoundDrawables(null, null, null, null);
        this.mTvDesc.setCompoundDrawablePadding(0);
        if (!C6399b.m19944t()) {
            this.mTvDesc.setText(m87123u());
        } else if (m87118p()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m87123u());
            sb.append(" · ");
            sb.append(m87124v());
            this.mTvDesc.setText(sb.toString());
        } else if (!TextUtils.isEmpty(this.f69826c.getRemarkName())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            this.mTvDesc.setText(spannableStringBuilder.append(new SpannableString(C23487o.m77158e(mo67902d()).getString(R.string.b8x))).append(C23472a.m77059a(this.mIvAvator.getContext(), this.f69826c.getNickname(), this.f69832i.position)));
        } else if (TextUtils.isEmpty(this.f69826c.getSignature())) {
            this.mTvDesc.setVisibility(8);
        } else {
            this.mTvDesc.setText(this.f69826c.getSignature());
        }
    }

    /* renamed from: q */
    private void m87119q() {
        if (TextUtils.isEmpty(this.f69826c.getRecommendReason())) {
            this.mTvRecommendReason.setVisibility(8);
            return;
        }
        Drawable drawable = this.mTvRecommendReason.getContext().getResources().getDrawable(R.drawable.ahi);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable.setAlpha(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        if (this.mTvDesc.getVisibility() != 0) {
            this.mTvRecommendReason.setVisibility(8);
            this.mTvDesc.setVisibility(0);
            this.mTvDesc.setCompoundDrawablePadding(C23486n.m77122a(2.0d));
            this.mTvDesc.setCompoundDrawables(drawable, null, null, null);
            this.mTvDesc.setText(this.f69826c.getRecommendReason());
            return;
        }
        this.mTvRecommendReason.setVisibility(0);
        this.mTvRecommendReason.setCompoundDrawablePadding(C23486n.m77122a(2.0d));
        this.mTvRecommendReason.setCompoundDrawables(drawable, null, null, null);
        this.mTvRecommendReason.setText(this.f69826c.getRecommendReason());
    }

    /* renamed from: a */
    public final void mo67897a(Map<String, String> map) {
        if (this.f69832i.isAladdin()) {
            super.mo67897a(map);
        }
    }

    /* renamed from: a */
    public final void mo68095a(SuggestUser suggestUser) {
        if (suggestUser != null && suggestUser.user != null) {
            mo68094a(new SearchUser().setUser(suggestUser.user));
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C27326a.m89578a(view)) {
            m87110a("click_info");
            if (view.getId() != R.id.b64 || !BusinessComponentServiceUtils.getLiveAllService().mo103113a(this.f69826c)) {
                this.f69830g.mo68088a(this.f69826c, getAdapterPosition());
            } else {
                BusinessComponentServiceUtils.getLiveAllService().mo103110a(view.getContext(), this.f69826c, mo68096g());
            }
        }
    }

    /* renamed from: a */
    private void m87109a(User user) {
        if (this.f69831h == null) {
            this.f69831h = new C28826b(true, this.mIvAvator, this.mIvAvator, this.mLiveCircle);
        }
        if (user != null) {
            this.f69831h.mo74071a(user, getClass(), null);
            if (BusinessComponentServiceUtils.getLiveAllService().mo103113a(user)) {
                C41989d.m133483a(user.getUid(), user.roomId, mo68096g(), "others_photo", user.getRequestId(), -1, C6399b.m19946v(), "");
                if (C6399b.m19944t()) {
                    m87126x();
                } else {
                    m87128z();
                }
            } else if (C6399b.m19944t()) {
                m87127y();
            } else {
                m87107B();
            }
        }
    }

    /* renamed from: a */
    private void m87110a(String str) {
        String str2;
        Map f = mo67904f();
        f.put("aladin_button_type", str);
        String str3 = "is_aladdin";
        if (this.f69832i.isAladdin()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        f.put(str3, str2);
        if (this.f69832i.cardType() == 1) {
            f.put("token_type", "stardom");
            mo67900b(f);
        } else if (this.f69832i.cardType() == 2) {
            f.put("token_type", "musician");
            mo67900b(f);
        } else {
            if (this.f69832i.cardType() == 3) {
                f.put("token_type", "musician");
                mo67900b(f);
            }
        }
    }

    /* renamed from: a */
    public final void mo68094a(SearchUser searchUser) {
        if (searchUser != null && searchUser.user != null) {
            this.f69832i = searchUser;
            this.f69826c = searchUser.user;
            m87113k();
            m87116n();
            m87115m();
            m87119q();
            m87112j();
            m87111i();
            if (searchUser.cardType() != 0) {
                if (this.f69829f == null) {
                    this.f69829f = (ViewGroup) this.cardViewStub.inflate();
                }
                this.f69829f.setVisibility(0);
                this.f69828e = C37385g.f97617a.getAladdinCard(this.f69829f, searchUser);
                if (!C6399b.m19945u()) {
                    this.f69829f.setPadding(0, (int) C9738o.m28708b(mo67898b(), 4.0f), 0, 0);
                }
                if (searchUser.cardType() == 1) {
                    mo67897a(null);
                } else if (searchUser.cardType() == 2) {
                    mo67897a(null);
                } else if (searchUser.cardType() == 3) {
                    mo67897a(null);
                }
            } else if (this.f69829f != null) {
                this.f69829f.setVisibility(8);
            }
        }
    }

    private SearchUserViewHolder(final View view, C29748a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(this);
        this.mIvAvator.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.mIvAvator.setOnClickListener(this);
        if (C6399b.m19944t()) {
            this.mIvAvator.setPlaceHolder(R.drawable.amg);
        }
        this.f69830g = aVar;
        this.f69834k = new C29548a(this.mBtnFollow, new C29556e() {
            /* renamed from: a */
            public final String mo68099a() {
                return "search_result";
            }

            /* renamed from: b */
            public final String mo68100b() {
                return "click_follow";
            }

            /* renamed from: c */
            public final int mo68101c() {
                return 14;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                SearchUserViewHolder.this.f69830g.mo68090a(user);
            }
        });
        this.f69834k.f77866c = new C29552a() {
            /* renamed from: a */
            public final void mo68102a(FollowStatus followStatus) {
                C36102u.f94392a.showRemindUserCompleteProfileDialogAfterFollow(view.getContext(), SearchUserViewHolder.this.mo68096g(), "follow", SearchUserViewHolder.this.f69826c, followStatus.followStatus);
            }
        };
        this.f69834k.f77868e = new C26481af(this);
    }

    /* renamed from: a */
    public static SearchUserViewHolder m87108a(ViewGroup viewGroup, C29748a aVar) {
        View view;
        if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_user, viewGroup, false);
        } else {
            view = ((C23149d) viewGroup.getContext()).getInflater().mo60290a(R.layout.item_search_user);
        }
        return new SearchUserViewHolder(view, aVar);
    }
}
