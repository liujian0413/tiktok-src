package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.content.Context;
import android.net.Uri.Builder;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29360a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout.C29395a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.InsFollowFeedCommentLayout */
public final class InsFollowFeedCommentLayout extends FollowFeedCommentLayout {

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.InsFollowFeedCommentLayout$a */
    static final class C29397a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowFeedCommentLayout f77473a;

        /* renamed from: b */
        final /* synthetic */ C29395a f77474b;

        /* renamed from: c */
        final /* synthetic */ Aweme f77475c;

        /* renamed from: d */
        final /* synthetic */ List f77476d;

        C29397a(InsFollowFeedCommentLayout insFollowFeedCommentLayout, C29395a aVar, Aweme aweme, List list) {
            this.f77473a = insFollowFeedCommentLayout;
            this.f77474b = aVar;
            this.f77475c = aweme;
            this.f77476d = list;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C29395a aVar = this.f77474b;
            if (aVar != null) {
                aVar.mo75057a(this.f77473a.mShowAllComments, this.f77475c, this.f77476d, false, "click_more_comment");
            }
        }
    }

    public InsFollowFeedCommentLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        RecyclerView recyclerView = this.mRecComments;
        C7573i.m23582a((Object) recyclerView, "mRecComments");
        recyclerView.setFocusableInTouchMode(false);
    }

    /* renamed from: c */
    public final void mo75191c() {
        int i;
        if (mo75190b()) {
            if (this.f77454d != null) {
                Aweme aweme = this.f77454d;
                C7573i.m23582a((Object) aweme, "mAweme");
                if (aweme.getStatistics() != null) {
                    Aweme aweme2 = this.f77454d;
                    C7573i.m23582a((Object) aweme2, "mAweme");
                    AwemeStatistics statistics = aweme2.getStatistics();
                    C7573i.m23582a((Object) statistics, "mAweme.statistics");
                    i = statistics.getCommentCount();
                    if (i > 0 || this.f77453c == null || i <= this.f77453c.size()) {
                        DmtTextView dmtTextView = this.mShowAllComments;
                        C7573i.m23582a((Object) dmtTextView, "mShowAllComments");
                        dmtTextView.setVisibility(8);
                        this.mLayoutAddComment.setPadding(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d));
                    }
                    DmtTextView dmtTextView2 = this.mShowAllComments;
                    C7573i.m23582a((Object) dmtTextView2, "mShowAllComments");
                    dmtTextView2.setVisibility(0);
                    DmtTextView dmtTextView3 = this.mShowAllComments;
                    C7573i.m23582a((Object) dmtTextView3, "mShowAllComments");
                    String string = getResources().getString(R.string.du7);
                    C7573i.m23582a((Object) string, "resources.getString(R.string.show_all_comment)");
                    String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{C30537o.m99738a((long) i)}, 1));
                    C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                    dmtTextView3.setText(a);
                    this.mLayoutAddComment.setPadding(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d));
                    return;
                }
            }
            i = 0;
            if (i > 0) {
            }
            DmtTextView dmtTextView4 = this.mShowAllComments;
            C7573i.m23582a((Object) dmtTextView4, "mShowAllComments");
            dmtTextView4.setVisibility(8);
            this.mLayoutAddComment.setPadding(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d));
        }
    }

    public final void setDisplayType(int i) {
        this.f77456f = i;
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        C7573i.m23582a((Object) commentLikeListView, "mLayoutLikes");
        commentLikeListView.setVisibility(0);
        LinearLayout linearLayout = this.mLayoutAddComment;
        C7573i.m23582a((Object) linearLayout, "mLayoutAddComment");
        linearLayout.setVisibility(0);
        DmtTextView dmtTextView = this.mShowAllComments;
        C7573i.m23582a((Object) dmtTextView, "mShowAllComments");
        dmtTextView.setVisibility(0);
        m96578a(this.mShowAllComments, 0);
        CircleImageView circleImageView = this.mImgAvatar;
        C7573i.m23582a((Object) circleImageView, "mImgAvatar");
        LayoutParams layoutParams = circleImageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = C23486n.m77122a(24.0d);
            layoutParams2.height = C23486n.m77122a(24.0d);
            CircleImageView circleImageView2 = this.mImgAvatar;
            C7573i.m23582a((Object) circleImageView2, "mImgAvatar");
            circleImageView2.setLayoutParams(layoutParams2);
            this.mImgAvatar.mo60914a(false, false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo75188a(Aweme aweme, List<? extends Comment> list, List<? extends User> list2, C29395a aVar) {
        this.f77453c = list;
        this.f77454d = aweme;
        this.f77455e = list2;
        mo75191c();
        this.mShowAllComments.setOnClickListener(new C29397a(this, aVar, aweme, list2));
        mo75193d();
        this.mLayoutLikes.setEventType(this.f77452b);
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        Aweme aweme2 = this.f77454d;
        C7573i.m23582a((Object) aweme2, "mAweme");
        commentLikeListView.setAuthorId(aweme2.getAuthorUid());
        CommentLikeListView commentLikeListView2 = this.mLayoutLikes;
        Aweme aweme3 = this.f77454d;
        C7573i.m23582a((Object) aweme3, "mAweme");
        commentLikeListView2.setAwemeId(aweme3.getAid());
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        if (curUser.getAvatarThumb() != null) {
            RemoteImageView remoteImageView = this.mImgAvatar;
            IAccountUserService f2 = C6861a.m21337f();
            C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
            User curUser2 = f2.getCurUser();
            C7573i.m23582a((Object) curUser2, "AccountProxyService.userService().curUser");
            C23323e.m76506a(remoteImageView, curUser2.getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            this.mImgAvatar.setImageURI(new Builder().scheme("res").path("2131231787").build());
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            RecyclerView recyclerView = this.mRecComments;
            C7573i.m23582a((Object) recyclerView, "mRecComments");
            recyclerView.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = this.mRecComments;
            C7573i.m23582a((Object) recyclerView2, "mRecComments");
            recyclerView2.setVisibility(0);
        }
        RecyclerView recyclerView3 = this.mRecComments;
        C7573i.m23582a((Object) recyclerView3, "mRecComments");
        recyclerView3.setLayoutManager(new InsFollowFeedCommentLayout$bind$2(this, getContext()));
        this.f77457g = C29363d.m96452b().mo75021a(aweme, list2, aVar, true);
        C29360a b = C29363d.m96452b();
        BaseAdapter baseAdapter = this.f77457g;
        C7573i.m23582a((Object) baseAdapter, "mCommentAdapter");
        b.mo75025a(baseAdapter, this.f77452b);
        C29360a b2 = C29363d.m96452b();
        BaseAdapter baseAdapter2 = this.f77457g;
        C7573i.m23582a((Object) baseAdapter2, "mCommentAdapter");
        b2.mo75024a(baseAdapter2, this.f77451a);
        BaseAdapter baseAdapter3 = this.f77457g;
        C7573i.m23582a((Object) baseAdapter3, "mCommentAdapter");
        baseAdapter3.mo66516d(false);
        BaseAdapter baseAdapter4 = this.f77457g;
        C7573i.m23582a((Object) baseAdapter4, "mCommentAdapter");
        baseAdapter4.mo58045a(this.f77453c);
        RecyclerView recyclerView4 = this.mRecComments;
        C7573i.m23582a((Object) recyclerView4, "mRecComments");
        recyclerView4.setAdapter(this.f77457g);
        RecyclerView recyclerView5 = this.mRecComments;
        C7573i.m23582a((Object) recyclerView5, "mRecComments");
        recyclerView5.setFocusable(false);
    }

    public /* synthetic */ InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
