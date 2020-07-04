package com.p280ss.android.ugc.aweme.forward.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.comment.list.C24175a;
import com.p280ss.android.ugc.aweme.comment.list.C24176b;
import com.p280ss.android.ugc.aweme.comment.list.C24179e;
import com.p280ss.android.ugc.aweme.comment.list.C24180f;
import com.p280ss.android.ugc.aweme.comment.list.C24182h;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.list.C24185k;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24088b;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24091b;
import com.p280ss.android.ugc.aweme.comment.services.C24222c;
import com.p280ss.android.ugc.aweme.comment.services.C24223d;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28465q;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.adapter.FeedDetailAdapter;
import com.p280ss.android.ugc.aweme.forward.model.DetailAdapterBean;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29866a.C29867a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29866a.C29868b;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29869b;
import com.p280ss.android.ugc.aweme.forward.p1268b.C29876a;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29877a;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b.C37607a.C37608a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.forward.view.BaseAwemeDetailFragment */
public class BaseAwemeDetailFragment extends AmeBaseFragment implements C24176b, C24179e, C24185k, C24222c, C6905a, C25675c<Comment>, C28465q, C29400c, C29868b, C29869b {

    /* renamed from: e */
    public C24180f f78675e;

    /* renamed from: f */
    protected FeedDetailAdapter f78676f;

    /* renamed from: g */
    public C29359f f78677g;

    /* renamed from: h */
    public String f78678h = "homepage_follow";

    /* renamed from: i */
    public String f78679i = "";

    /* renamed from: j */
    public String f78680j = "";

    /* renamed from: k */
    public Aweme f78681k;

    /* renamed from: l */
    public Comment f78682l;

    /* renamed from: m */
    public C24088b f78683m;
    FadeImageView mAtView;
    LiveCircleView mAuthorAvatarBorderView;
    AvatarImageView mAuthorAvatarImageView;
    ViewGroup mAuthorAvatarLayout;
    AvatarImageView mAuthorAvatarLiveView;
    TextView mAuthorNameView;
    MentionEditText mEditText;
    FadeImageView mEmojiView;
    RecyclerView mRecyclerView;

    /* renamed from: n */
    public String f78684n;

    /* renamed from: o */
    private C21745c f78685o;

    /* renamed from: p */
    private C29867a f78686p;

    /* renamed from: q */
    private C28826b f78687q;

    /* renamed from: r */
    private String f78688r;

    /* renamed from: s */
    private boolean f78689s;

    /* renamed from: t */
    private C24175a f78690t;

    /* renamed from: u */
    private C24190p f78691u;

    /* renamed from: v */
    private Comment f78692v;

    /* renamed from: w */
    private boolean f78693w;

    /* renamed from: x */
    private C7326g<C32517b> f78694x;

    /* renamed from: y */
    private long f78695y;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo75143a(C29359f fVar) {
    }

    public final void aE_() {
    }

    public final void bd_() {
        mo76100x();
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List list, boolean z) {
    }

    /* renamed from: e */
    public final AbsFragment mo75873e() {
        return this;
    }

    /* renamed from: e */
    public final void mo67624e(Exception exc) {
    }

    /* renamed from: g */
    public final C28465q mo75875g() {
        return this;
    }

    /* renamed from: k */
    public final Comment mo63005k() {
        return this.f78682l;
    }

    /* renamed from: l */
    public final String mo63006l() {
        return this.f78678h;
    }

    /* renamed from: p */
    public final boolean mo63011p() {
        return C24223d.m79571a(this);
    }

    /* renamed from: q */
    public final C29869b mo75877q() {
        return this;
    }

    /* renamed from: r */
    public final C24179e mo75878r() {
        return this;
    }

    /* renamed from: s */
    public final C24185k mo75879s() {
        return this;
    }

    /* renamed from: t */
    public final Aweme mo75880t() {
        return this.f78681k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo76097u() {
    }

    /* renamed from: a */
    public final void mo75870a(String str, boolean z) {
        this.f78676f.mo75911a(str, z);
    }

    /* renamed from: a */
    public final void mo75871a(boolean z) {
        if (this.f78683m != null) {
            if (!this.f78683m.mo62433b()) {
                C10761a.m31409e(C6399b.m19921a(), (int) R.string.a9b).mo25750a();
                return;
            }
            this.f78689s = z;
            this.f78683m.mo62436f();
            if (z) {
                this.f78684n = "click_repost_button";
                C29893a.m97886a(this.f78678h, mo63004j(), C22704b.f60415d, "click_repost_button");
                return;
            }
            this.f78684n = "click_comment";
        }
    }

    /* renamed from: a */
    public void mo59099a(List<Comment> list, boolean z) {
        Aweme t = mo75880t();
        if (t == null || !t.getAwemeControl().canShowComment()) {
            list.clear();
            ae_();
        }
        this.f78676f.mo66516d(true);
        if (!z) {
            this.f78676f.ah_();
        } else {
            this.f78676f.ai_();
        }
        if (this.f78683m != null) {
            this.f78683m.mo62434c();
            this.f78683m.mo62426a(this.f78675e.mo62527e());
        }
        this.f78676f.mo61577b(FeedDetailAdapter.m97717a(this.f78681k, list));
        this.f78676f.mo75912a(true);
    }

    /* renamed from: a */
    public final void mo75144a(final Exception exc, final Aweme aweme) {
        if (isViewValid()) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        BaseAwemeDetailFragment.this.f78677g.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        BaseAwemeDetailFragment.this.f78676f.mo75909a(exc, aweme, BaseAwemeDetailFragment.this.f78677g.mo75085e());
                    }
                });
            } else {
                this.f78676f.mo75909a(exc, aweme, this.f78677g.mo75085e());
            }
        }
    }

    /* renamed from: a */
    public final void mo62995a(Exception exc, int i, Comment comment) {
        int i2 = i == 3 ? R.string.b_3 : R.string.a9a;
        int[] B = m98074B();
        if (i == 3) {
            C29893a.m97887a(this.f78678h, this.f78681k, C22704b.f60415d, this.f78684n, false);
        }
        if (!((C24182h) ServiceManager.get().getService(C24182h.class)).mo62632a(comment)) {
            m98082i(comment);
        }
        ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62633c(comment);
        if (C24217a.m79549a().handleException(this.mRecyclerView.getContext(), exc, i2, m98079a(comment, B[0], B[1]))) {
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62637h(comment);
            String fakeId = comment.getFakeId();
            int c = this.f78691u.mo62604c(fakeId);
            int a = this.f78676f.mo75907a(fakeId, c);
            if (a > 0) {
                int i3 = a - 1;
                this.f78691u.mo62593a(i3, c + i3);
            }
            return;
        }
        m98083j(comment);
    }

    /* renamed from: a */
    public final void mo62996a(String str, int i) {
        String str2;
        CommentService a = C24217a.m79549a();
        String str3 = this.f78678h;
        String aid = this.f78681k == null ? null : this.f78681k.getAid();
        if (this.f78681k == null) {
            str2 = null;
        } else {
            str2 = this.f78681k.getAuthorUid();
        }
        a.sendEmojiClickEvent(str, i, str3, aid, str2);
    }

    /* renamed from: a */
    public final void mo62619a(String str) {
        int d = this.f78691u.mo62606d(str);
        int a = this.f78676f.mo75907a(str, d);
        if (a > 0) {
            int i = a - 1;
            this.f78691u.mo62593a(i, d + i);
        }
        C37608a.m120413a(getActivity(), mo75880t(), this.f78692v);
    }

    /* renamed from: a */
    public final void mo62642a(String str, List<Comment> list) {
        if (!TextUtils.isEmpty(str) && !C6307b.m19566a((Collection<T>) list)) {
            int b = this.f78676f.mo75913b(str, 11);
            String str2 = "";
            if (b > 0 && this.f78691u != null) {
                DetailAdapterBean detailAdapterBean = (DetailAdapterBean) this.f78676f.mo62312a().get(b);
                if (detailAdapterBean != null && (detailAdapterBean.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) detailAdapterBean.getComment()).getCommentId();
                }
                this.f78691u.mo62595a(b - 1, list);
                this.f78676f.mo62312a().addAll(b, FeedDetailAdapter.m97723e(list));
                this.f78676f.notifyItemRangeInserted(b, list.size());
                FeedDetailAdapter feedDetailAdapter = this.f78676f;
                feedDetailAdapter.notifyItemRangeChanged(b, feedDetailAdapter.getItemCount() - b);
            }
            C24217a.m79549a().sendShowMoreReplyEvent(this.f78678h, this.f78681k.getAid(), str2);
        }
    }

    public final void aD_() {
        this.f78676f.ag_();
    }

    /* renamed from: f */
    public final /* synthetic */ Activity mo75874f() {
        return super.getActivity();
    }

    /* renamed from: j */
    public final Aweme mo63004j() {
        return mo75880t();
    }

    /* renamed from: D */
    private void m98075D() {
        this.f78682l = null;
        this.f78689s = false;
        if (this.f78683m != null) {
            this.f78683m.mo62438j();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (this.f78683m != null) {
            this.f78683m.mo62435d();
        }
    }

    /* renamed from: m */
    public final int mo63007m() {
        if (this.f78689s) {
            return 4;
        }
        if (this.f78682l != null) {
            return 3;
        }
        return 2;
    }

    /* renamed from: n */
    public final boolean mo63008n() {
        if (!C21115b.m71197a().isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo63009o() {
        if (!C21115b.m71197a().isLogin()) {
            return false;
        }
        return true;
    }

    public void onBack() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f78685o != null) {
            this.f78685o.mo58065k();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f78685o != null) {
            this.f78685o.aW_();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f78685o != null) {
            this.f78685o.mo58064j();
        }
    }

    /* renamed from: y */
    private void m98084y() {
        this.f78675e = C24217a.m79549a().providerCommentFetchPresenter();
        this.f78675e.mo62526a((C25675c<Comment>) this);
        this.f78675e.mo62525a(this.f78691u);
    }

    public void ae_() {
        if (this.f78683m != null) {
            this.f78683m.mo62434c();
        }
        if (this.f78676f.f67566v) {
            this.f78676f.mo66516d(false);
            this.f78676f.notifyDataSetChanged();
        }
    }

    /* renamed from: A */
    private void m98073A() {
        if (this.f78695y > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f78695y;
            this.f78695y = 0;
            C24217a.m79549a().sendCloseTextEvent(this.f78678h, this.f78681k, currentTimeMillis, C22704b.f60415d);
        }
    }

    /* renamed from: B */
    private int[] m98074B() {
        int i;
        C1273i layoutManager = this.mRecyclerView.getLayoutManager();
        int i2 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.mo5445j();
            i = linearLayoutManager.mo5447l();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    /* renamed from: z */
    private Long m98085z() {
        if (this.f78681k == null || this.f78681k.getAwemeRawAd() == null || C25352e.m83224g(this.f78681k)) {
            return null;
        }
        return this.f78681k.getAwemeRawAd().getCreativeId();
    }

    public void onAvatarClick() {
        User user;
        if (this.f78686p != null && this.f78686p.mo75861a() != null) {
            C21747e a = this.f78686p.mo75861a();
            Aweme t = mo75880t();
            if (mo75880t() != null) {
                user = mo75880t().getAuthor();
            } else {
                user = null;
            }
            a.mo58079a((View) null, (View) null, t, user);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f78675e != null) {
            this.f78675e.mo62624U_();
            this.f78675e.mo62625W_();
        }
        if (this.f78677g != null) {
            this.f78677g.mo59134U_();
            this.f78677g.mo66535W_();
            this.f78677g.mo75087g();
        }
        if (this.f78686p != null) {
            this.f78686p.mo75865e();
        }
        if (this.f78683m != null) {
            this.f78683m.mo62439m();
        }
    }

    public void onNickNameClick() {
        User user;
        if (this.f78686p != null && this.f78686p.mo75861a() != null) {
            C21747e a = this.f78686p.mo75861a();
            Aweme t = mo75880t();
            if (mo75880t() != null) {
                user = mo75880t().getAuthor();
            } else {
                user = null;
            }
            a.mo58087b(null, null, t, user);
        }
    }

    /* renamed from: x */
    public final void mo76100x() {
        if (this.f78681k != null && !this.f78693w) {
            this.f78693w = true;
            if (this.f78675e != null) {
                this.f78675e.mo62626a(Integer.valueOf(4), this.f78681k.getAid(), Integer.valueOf(2), "", "", m98085z());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo76099w() {
        if (this.f78681k != null) {
            if (C29942a.m98173a(getContext())) {
                this.f78675e.mo62626a(Integer.valueOf(1), this.f78681k.getAid(), Integer.valueOf(2), "", this.f78688r, m98085z());
                return;
            }
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (BaseAwemeDetailFragment.this.isViewValid()) {
                        C9738o.m28693a(BaseAwemeDetailFragment.this.getContext(), (int) R.string.cjs);
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo76098v() {
        boolean z;
        if (this.f78681k != null) {
            this.mAuthorAvatarLayout.setVisibility(0);
            if (this.f78681k.getAuthor() == null || !this.f78681k.getAuthor().isLive()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f78687q == null) {
                this.f78687q = new C28826b(z, this.mAuthorAvatarLiveView, this.mAuthorAvatarImageView, this.mAuthorAvatarBorderView);
            }
            if (this.f78694x == null) {
                this.f78694x = new C7326g<C32517b>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(C32517b bVar) throws Exception {
                        if (TextUtils.equals(BaseAwemeDetailFragment.this.f78681k.getAuthor().getUid(), String.valueOf(bVar.f84785a))) {
                            BaseAwemeDetailFragment.this.f78681k.getAuthor().roomId = bVar.f84786b;
                            if (!BaseAwemeDetailFragment.this.f78681k.getAuthor().isLive()) {
                                BaseAwemeDetailFragment.this.mo76098v();
                            }
                        }
                    }
                };
            }
            this.f78687q.mo74071a(this.f78681k.getAuthor(), getClass(), this.f78694x);
            int b = (int) C9738o.m28708b(getContext(), 27.0f);
            if (C21740a.m72683a(this.f78681k)) {
                this.f78687q.mo74068a(0);
                C23323e.m76506a((RemoteImageView) this.mAuthorAvatarLiveView, this.f78681k.getAuthor().getAvatarThumb(), b, b);
                C34138b.m110002c(this.f78681k);
            } else {
                this.f78687q.mo74068a(8);
                if (this.f78681k.getAuthor() != null) {
                    C23323e.m76506a((RemoteImageView) this.mAuthorAvatarImageView, this.f78681k.getAuthor().getAvatarThumb(), b, b);
                }
            }
            if (this.f78681k.getAuthor() != null) {
                this.mAuthorNameView.setText(this.f78681k.getAuthor().getNickname());
            }
        }
    }

    /* renamed from: d */
    public final void mo75872d(Comment comment) {
        this.f78684n = "click_reply_comment";
        mo76091g(comment);
    }

    /* renamed from: b */
    public final void mo62997b(Comment comment) {
        m98078a(comment, false);
    }

    /* renamed from: b_ */
    public final void mo67620b_(String str) {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: e */
    public final void mo63001e(boolean z) {
        if (z) {
            this.f78682l = null;
            this.f78689s = false;
        }
        m98073A();
    }

    /* renamed from: f */
    public final void mo63002f(boolean z) {
        if (z) {
            m98073A();
        }
    }

    /* renamed from: a */
    public final C24183i mo75867a(int i) {
        return (C24183i) this.mRecyclerView.mo5575f(i);
    }

    /* renamed from: a_ */
    public void mo59105a_(Exception exc) {
        if (this.f78683m != null) {
            this.f78683m.mo62434c();
        }
        if (this.f78676f.f67566v) {
            this.f78676f.mo66516d(false);
            this.f78676f.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f78693w = false;
        this.f78676f.mo66507h();
    }

    /* renamed from: d */
    public final void mo62623d(Exception exc) {
        if (!TextUtils.isEmpty(this.f78686p.mo75866f())) {
            C24217a.m79549a().sendLikeCommentResultEvent(this.f78678h, this.f78681k, null, false, C22704b.f60415d, null);
        }
    }

    /* renamed from: g */
    public final void mo63003g(boolean z) {
        String str;
        if (z) {
            String str2 = this.f78678h;
            Aweme j = mo63004j();
            String str3 = C22704b.f60415d;
            if (this.f78682l != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            C29893a.m97891b(str2, j, str3, str);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    /* renamed from: j */
    private void m98083j(Comment comment) {
        int i = ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62638i(comment);
        C1262a adapter = this.mRecyclerView.getAdapter();
        if (i >= 0 && adapter != null) {
            adapter.notifyItemChanged(i, Integer.valueOf(1));
        }
    }

    /* renamed from: b */
    public final void mo62622b(String str) {
        if (this.f78676f != null) {
            this.f78676f.mo75910a(str);
        }
        if (!TextUtils.isEmpty(this.f78686p.mo75866f())) {
            C24217a.m79549a().sendLikeCommentResultEvent(this.f78678h, this.f78681k, str, true, C22704b.f60415d, null);
        }
    }

    /* renamed from: d */
    public final void mo62999d(String str) {
        String str2;
        String str3;
        CommentService a = C24217a.m79549a();
        String str4 = this.f78678h;
        if (this.f78681k == null) {
            str2 = "";
        } else {
            str2 = this.f78681k.getAid();
        }
        if (this.f78681k == null) {
            str3 = "";
        } else {
            str3 = this.f78681k.getAuthorUid();
        }
        a.sendEmojiToKeyboardEvent(str, str4, str2, str3);
    }

    /* renamed from: f */
    public final void mo76090f(Comment comment) {
        if (isAdded() && this.f78683m != null) {
            this.f78689s = true;
            this.f78682l = comment;
            this.f78683m.mo62436f();
            C29893a.m97886a(this.f78678h, mo63004j(), C22704b.f60415d, "click_reply_comment");
        }
    }

    /* renamed from: g */
    public final void mo76091g(Comment comment) {
        if (isAdded()) {
            if (this.f78682l == null || !this.f78682l.equals(comment)) {
                this.f78682l = comment;
                if (this.f78683m != null) {
                    this.f78683m.mo62430a(comment.getUser());
                }
            } else {
                this.f78682l = comment;
                this.mEditText.performClick();
            }
        }
    }

    /* renamed from: h */
    public final void mo76092h(Comment comment) {
        ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(getActivity(), "comment", comment.getCid(), comment.getUser().getUid(), this.f78681k.getAuthorUid(), null);
        C24217a.m79549a().sendReportCommentEvent(this.f78678h, mo63004j(), comment.getCid(), C22704b.f60415d, "click_report_button");
    }

    /* renamed from: d */
    public final void mo63000d(boolean z) {
        if (z) {
            this.f78684n = "click_comment";
        }
        C24217a.m79549a().sendEnterTextEvent(this.f78678h, this.f78681k, C24217a.m79549a().getCommentCategory(this.f78682l), C22704b.f60415d);
        this.f78695y = System.currentTimeMillis();
    }

    /* renamed from: e */
    public final void mo76089e(Comment comment) {
        FragmentActivity activity = getActivity();
        if (activity != null && comment != null) {
            if (!C29942a.m98173a(activity)) {
                C10761a.m31409e((Context) activity, (int) R.string.cjs).mo25750a();
                return;
            }
            if (this.f78690t == null) {
                this.f78690t = C24217a.m79549a().providerCommentDeletePresenter();
                this.f78690t.mo62513a(this);
            }
            if (!TextUtils.isEmpty(comment.getCid())) {
                this.f78690t.mo62514a(comment.getCid(), this.f78681k.getAid());
                this.f78692v = comment;
            }
        }
    }

    @C7709l
    public void onEvent(C29876a aVar) {
        if (aVar != null) {
            if (aVar.f78475d != 1 || aVar.f78472a == null) {
                if (aVar.f78475d == 2 && getActivity() != null) {
                    getActivity().finish();
                }
                return;
            }
            if (aVar.f78476e == hashCode()) {
                C29893a.m97887a(this.f78678h, aVar.f78474c, C22704b.f60415d, this.f78684n, true);
            }
            if (this.f78683m != null) {
                this.f78683m.mo62437g();
            }
            m98075D();
            if (hashCode() == aVar.f78476e) {
                m98078a(aVar.f78472a.getComment(), true);
            }
            this.f78676f.mo75916m();
        }
    }

    @C7709l
    public void onReportCommentEvent(C27994k kVar) {
        if (C6399b.m19944t()) {
            try {
                if (TextUtils.equals("commentReportSuccess", kVar.f73730b.getString("eventName"))) {
                    String string = kVar.f73730b.getJSONObject("data").getString("object_id");
                    int d = this.f78691u.mo62606d(string);
                    int a = this.f78676f.mo75907a(string, d);
                    if (a > 0) {
                        int i = a - 1;
                        this.f78691u.mo62593a(i, d + i);
                    }
                    this.f78676f.mo75914b(string);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: i */
    private void m98082i(Comment comment) {
        int i;
        DetailAdapterBean detailAdapterBean = new DetailAdapterBean(comment);
        int i2 = 1;
        if (comment.getCommentType() == 2) {
            FeedDetailAdapter feedDetailAdapter = this.f78676f;
            String replyToReplyCommentId = comment.getReplyToReplyCommentId();
            if (TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                i = 1;
            } else {
                i = 2;
            }
            int b = feedDetailAdapter.mo75913b(replyToReplyCommentId, i);
            if (b > 0) {
                int i3 = b + 1;
                while (true) {
                    if (i3 >= this.f78676f.mo62312a().size()) {
                        i3 = -1;
                        break;
                    } else if (this.f78676f.getItemViewType(i3) != 2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 <= 0) {
                    i3 = this.f78676f.mo62312a().size();
                }
                int i4 = i3;
                boolean a = this.f78691u.mo62598a(comment.getReplyId(), (i4 - this.f78676f.mo75913b(comment.getReplyId(), 1)) - 1, comment);
                int i5 = i4 - 1;
                this.f78691u.mo62602b(i5, comment);
                this.f78676f.mo62316a(detailAdapterBean, i4);
                if (i4 > 0) {
                    this.f78676f.notifyItemChanged(i5);
                }
                if (a) {
                    this.f78676f.notifyItemChanged(i4 + 1);
                }
                this.mRecyclerView.mo5541b(i4 + 1);
                i2 = i4;
            } else {
                i2 = 0;
            }
        } else {
            this.f78691u.mo62594a(0, comment);
            this.f78691u.mo62602b(0, comment);
            this.f78676f.mo62316a(detailAdapterBean, 1);
            this.mRecyclerView.mo5541b(1);
        }
        ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62630a(comment, i2);
    }

    /* renamed from: c */
    public final void mo62998c(Comment comment) {
        if (this.f78682l != null && (!this.f78689s || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(this.f78682l.getUser().getUid());
            if (this.f78689s && comment.getCommentType() != 0) {
                comment.setReplyToUserName(C43122ff.m136753A(this.f78682l.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(C43122ff.m136753A(this.f78682l.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f78682l);
            comment.setReplyComments(arrayList);
        }
        if (!((C24182h) ServiceManager.get().getService(C24182h.class)).mo62635e(comment)) {
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62631a(comment, this.f78682l);
        }
        boolean z = !((C24182h) ServiceManager.get().getService(C24182h.class)).mo62632a(comment);
        if (z) {
            m98082i(comment);
        }
        if (!((C24182h) ServiceManager.get().getService(C24182h.class)).mo62635e(comment)) {
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62634d(comment);
        }
        if (!z) {
            m98083j(comment);
        }
        m98075D();
    }

    /* renamed from: a */
    public final void mo75869a(Comment comment) {
        String text = comment.getText();
        m98076a(((C24182h) ServiceManager.get().getService(C24182h.class)).mo62641m(comment), ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62639k(comment), C27608b.m90500a(text), text);
        if (this.f78683m != null) {
            this.f78683m.mo62432b(comment);
        }
    }

    /* renamed from: a */
    public final void mo75138a(Aweme aweme) {
        this.f78676f.mo75908a(aweme);
    }

    /* renamed from: b */
    public static void m98080b(C24187m mVar, Comment comment) {
        if (mVar != null) {
            mVar.mo62644a();
        }
    }

    /* renamed from: c */
    public static void m98081c(C24187m mVar, Comment comment) {
        if (mVar != null) {
            mVar.mo62645b();
        }
    }

    /* renamed from: b */
    public final void mo62643b(String str, List<Comment> list) {
        if (!TextUtils.isEmpty(str) && !C6307b.m19566a((Collection<T>) list)) {
            int b = this.f78676f.mo75913b(str, 11);
            String str2 = "";
            if (b - list.size() >= 0) {
                DetailAdapterBean detailAdapterBean = (DetailAdapterBean) this.f78676f.mo62312a().get(b);
                if (detailAdapterBean != null && (detailAdapterBean.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) detailAdapterBean.getComment()).getCommentId();
                }
                this.f78691u.mo62603b(list);
                this.f78676f.mo62312a().removeAll(FeedDetailAdapter.m97723e(list));
                int size = b - list.size();
                this.f78676f.notifyItemRangeRemoved(size, list.size());
                FeedDetailAdapter feedDetailAdapter = this.f78676f;
                feedDetailAdapter.notifyItemRangeChanged(size, feedDetailAdapter.getItemCount() - size);
            }
            C24217a.m79549a().sendHideAllReplyEvent(this.f78678h, this.f78681k.getAid(), str2);
        }
    }

    /* renamed from: a */
    public final void mo75868a(final C24187m mVar, final Comment comment) {
        String str;
        String str2;
        String str3;
        if (comment != null) {
            if (!C21115b.m71197a().isLogin()) {
                if (this.f78681k != null) {
                    str3 = this.f78681k.getAid();
                } else {
                    str3 = "";
                }
                C32656f.m105747a((Fragment) this, this.f78678h, "reply_comment", C42914ab.m136242a().mo104633a("group_id", str3).mo104633a("log_pb", C33230ac.m107234j(str3)).f111445a);
                return;
            }
            if (comment.getUser() != null) {
                str = comment.getUser().getUid();
            } else {
                str = "";
            }
            boolean equals = TextUtils.equals(str, C21115b.m71197a().getCurUserId());
            if (mo75880t() == null) {
                str2 = "";
            } else {
                str2 = mo75880t().getAuthorUid();
            }
            boolean equals2 = TextUtils.equals(str2, C21115b.m71197a().getCurUserId());
            if (this.f78683m != null) {
                this.f78683m.mo62427a(comment.getCommentType(), false, false, equals, equals2, !comment.isTranslated(), comment, new C24091b() {
                    /* renamed from: a */
                    public final void mo62452a() {
                    }

                    /* renamed from: k */
                    public final void mo62462k() {
                    }

                    /* renamed from: l */
                    public final void mo62463l() {
                    }

                    /* renamed from: b */
                    public final void mo62453b() {
                        BaseAwemeDetailFragment.this.mo76089e(comment);
                    }

                    /* renamed from: e */
                    public final void mo62456e() {
                        BaseAwemeDetailFragment.this.mo76092h(comment);
                    }

                    /* renamed from: i */
                    public final void mo62460i() {
                        BaseAwemeDetailFragment.m98080b(mVar, comment);
                    }

                    /* renamed from: j */
                    public final void mo62461j() {
                        BaseAwemeDetailFragment.m98081c(mVar, comment);
                    }

                    /* renamed from: c */
                    public final void mo62454c() {
                        BaseAwemeDetailFragment.this.f78684n = "click_reply_comment";
                        BaseAwemeDetailFragment.this.mo76091g(comment);
                    }

                    /* renamed from: d */
                    public final void mo62455d() {
                        BaseAwemeDetailFragment.this.f78684n = "click_reply_comment";
                        BaseAwemeDetailFragment.this.mo76090f(comment);
                    }

                    /* renamed from: g */
                    public final void mo62458g() {
                        BaseAwemeDetailFragment.this.f78683m.mo62429a(comment, BaseAwemeDetailFragment.this.f78678h);
                    }

                    /* renamed from: h */
                    public final void mo62459h() {
                        C24217a.m79549a().sendCloseCommentTabEvent(BaseAwemeDetailFragment.this.f78678h);
                    }

                    /* renamed from: f */
                    public final void mo62457f() {
                        BaseAwemeDetailFragment.this.f78683m.mo62428a(comment);
                        C24217a.m79549a().sendCopyCommentEvent(BaseAwemeDetailFragment.this.f78678h, comment.getUser().getUid(), comment.getCid(), BaseAwemeDetailFragment.this.mo75880t());
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<Comment> list, boolean z) {
        this.f78693w = false;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f78676f.ah_();
        } else {
            this.f78676f.ai_();
        }
        this.f78676f.mo61577b(FeedDetailAdapter.m97717a(this.f78681k, list));
    }

    /* renamed from: a */
    private void m98078a(Comment comment, boolean z) {
        int i;
        int i2;
        if (comment != null) {
            if (!((C24182h) ServiceManager.get().getService(C24182h.class)).mo62632a(comment)) {
                m98082i(comment);
            }
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62640l(comment);
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62636g(comment);
            int i3 = ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62638i(comment);
            List a = this.f78676f.mo62312a();
            if (i3 >= 0 && i3 <= a.size() - 1) {
                ((DetailAdapterBean) a.get(i3)).setComment(comment);
                this.f78676f.notifyItemChanged(i3);
            }
            List b = this.f78691u.mo62600b();
            if (b != null) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem commentReplyListItem = (CommentReplyListItem) it.next();
                    if (TextUtils.equals(commentReplyListItem.mComment.getFakeId(), comment.getFakeId())) {
                        commentReplyListItem.mComment = comment;
                    } else if (TextUtils.equals(commentReplyListItem.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list = commentReplyListItem.mReplyComments;
                        if (list == null) {
                            i2 = 0;
                        } else {
                            i2 = list.size();
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i2) {
                                break;
                            } else if (TextUtils.equals(((Comment) list.get(i4)).getFakeId(), comment.getFakeId())) {
                                list.set(i4, comment);
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
            }
            int[] B = m98074B();
            if (m98079a(comment, B[0], B[1])) {
                Context a2 = C6399b.m19921a();
                if (z) {
                    i = R.string.b_4;
                } else {
                    i = R.string.a9e;
                }
                C10761a.m31383a(a2, i).mo25750a();
            }
            ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62637h(comment);
            this.mRecyclerView.setVisibility(0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).increaseCommentCount(mo75880t().getAid());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f78678h = getArguments().getString("refer");
        this.f78679i = getArguments().getString("tab_name");
        this.f78680j = getArguments().getString("content_source");
        this.f78688r = getArguments().getString("cid");
        this.f78677g = new C29359f(this.f78678h, 0);
        this.f78677g.mo75086f();
        this.f78677g.mo66536a(new C28471v());
        this.f78677g.mo66537a((C29400c) this);
        this.f78691u = C24217a.m79549a().providerReplyCommentDataManager();
        this.f78686p = new C29877a(this, this.f78678h, this.f78691u);
        this.f78686p.mo75864d();
        this.f78676f = new FeedDetailAdapter(this.mRecyclerView, this.f78686p.mo75863c());
        this.f78676f.f78461f = this.f78678h;
        this.f78676f.f78462g = this.f78679i;
        this.f78676f.f78463h = this.f78680j;
        this.f78676f.mo66516d(false);
        this.f78676f.f78458c = this.f78677g;
        this.f78676f.f78457b = this.f78686p.mo75862b();
        this.f78676f.f78456a = this.f78686p.mo75861a();
        this.f78676f.mo66504a((C6905a) this);
        this.f78676f.f78468x = this.f78691u;
        this.f78676f.f78460e = new C21744b() {
            /* renamed from: d */
            public final String mo58075d() {
                return "key_container_forward_detail";
            }

            /* renamed from: e */
            public final Object mo58076e() {
                return null;
            }

            /* renamed from: a */
            public final boolean mo58072a() {
                return BaseAwemeDetailFragment.this.isViewValid();
            }

            /* renamed from: c */
            public final Context mo58074c() {
                return BaseAwemeDetailFragment.this.getActivity();
            }

            /* renamed from: b */
            public final boolean mo58073b() {
                return BaseAwemeDetailFragment.this.getLifecycle().mo54a().equals(State.RESUMED);
            }
        };
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mRecyclerView.setLayoutManager(wrapLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.f78676f);
        this.mRecyclerView.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int l = ((LinearLayoutManager) BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager()).mo5447l();
                int A = BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager().mo5744A();
                if (l >= 8 && A - l < 8 && BaseAwemeDetailFragment.this.f78675e.mo62524a().isHasMore()) {
                    BaseAwemeDetailFragment.this.mo76100x();
                }
            }
        });
        m98084y();
        mo76097u();
        this.f78683m = C29363d.m96452b().mo75020a((Fragment) this, hashCode(), (C24222c) this);
        C24088b bVar = this.f78683m;
        MentionEditText mentionEditText = this.mEditText;
        FadeImageView fadeImageView = this.mAtView;
        FadeImageView fadeImageView2 = this.mEmojiView;
        if (this.f78681k != null) {
            str = this.f78681k.getAid();
        } else {
            str = "";
        }
        bVar.mo62431a(mentionEditText, fadeImageView, fadeImageView2, str, this.f78678h);
        this.mEditText.setCursorVisible(false);
        this.f78685o = this.f78676f.mo75915l();
    }

    /* renamed from: a */
    public final void mo62994a(int i, int i2, String str) {
        m98076a(this.f78682l, i, i2, str);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.pr, viewGroup, false);
        C25713b.m84475a(inflate.findViewById(R.id.dal));
        return inflate;
    }

    /* renamed from: a */
    private static boolean m98079a(Comment comment, int i, int i2) {
        int i3 = ((C24182h) ServiceManager.get().getService(C24182h.class)).mo62638i(comment);
        if (i3 != -1 && i >= 0 && i2 >= 0 && i3 >= i && i3 <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m98076a(Comment comment, int i, int i2, String str) {
        m98077a(comment, i, i2, str, false);
    }

    /* renamed from: a */
    private void m98077a(Comment comment, int i, int i2, String str, boolean z) {
        String str2;
        String str3;
        Comment comment2 = comment;
        Aweme aweme = this.f78681k;
        String str4 = this.f78678h;
        String str5 = C22704b.f60415d;
        if (this.f78682l != null) {
            str2 = comment.getCid();
        } else {
            str2 = "";
        }
        C34138b.m109997b(aweme, str4, str5, str2);
        CommentService a = C24217a.m79549a();
        Aweme aweme2 = this.f78681k;
        String str6 = this.f78678h;
        String commentCategory = C24217a.m79549a().getCommentCategory(comment2);
        if (comment2 != null) {
            str3 = comment.getCid();
        } else {
            str3 = "";
        }
        a.sendPostCommentEvent(aweme2, str, str6, commentCategory, str3, C22704b.f60415d, String.valueOf(i2), 0, "");
    }
}
