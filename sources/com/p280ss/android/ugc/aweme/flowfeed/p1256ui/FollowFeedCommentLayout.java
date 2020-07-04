package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView.C29388a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout */
public class FollowFeedCommentLayout extends LinearLayout {

    /* renamed from: a */
    protected int f77451a;

    /* renamed from: b */
    protected String f77452b;

    /* renamed from: c */
    protected List<Comment> f77453c;

    /* renamed from: d */
    protected Aweme f77454d;

    /* renamed from: e */
    protected List<User> f77455e;

    /* renamed from: f */
    protected int f77456f;

    /* renamed from: g */
    protected BaseAdapter<Comment> f77457g;
    int mAvatarSize;
    CircleImageView mImgAvatar;
    LinearLayout mLayoutAddComment;
    CommentLikeListView mLayoutLikes;
    RecyclerView mRecComments;
    DmtTextView mShowAllComments;
    View mSpace;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.FollowFeedCommentLayout$a */
    public interface C29395a {
        /* renamed from: a */
        void mo75056a(View view, Aweme aweme);

        /* renamed from: a */
        void mo75057a(View view, Aweme aweme, List<User> list, boolean z, String str);

        /* renamed from: a */
        void mo75059a(Aweme aweme, Comment comment);

        /* renamed from: a */
        void mo75060a(Aweme aweme, Comment comment, int i);

        /* renamed from: a */
        void mo75061a(Aweme aweme, String str, String str2);

        /* renamed from: a */
        void mo75063a(Aweme aweme, List<User> list, Comment comment, String str);

        /* renamed from: b */
        void mo75066b(Aweme aweme, String str, String str2);
    }

    public CommentLikeListView getLayoutLikes() {
        return this.mLayoutLikes;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo75190b() {
        if (this.f77456f > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        this.mRecComments.setFocusableInTouchMode(false);
    }

    /* renamed from: d */
    public final void mo75193d() {
        int i;
        if (mo75190b()) {
            if (this.f77454d == null || this.f77454d.getStatistics() == null) {
                i = 0;
            } else {
                i = this.f77454d.getStatistics().getDiggCount();
            }
            this.mLayoutLikes.mo63102a(this.f77455e, i, this.f77454d);
        }
    }

    /* renamed from: a */
    public final void mo75185a() {
        if (this.mLayoutAddComment.getVisibility() != 0) {
            this.mLayoutAddComment.setVisibility(0);
            m96577a(this.mLayoutAddComment, 0, this.mImgAvatar.getLayoutParams().height).start();
        }
    }

    /* renamed from: c */
    public void mo75191c() {
        int i;
        if (mo75190b()) {
            if (this.f77454d == null || this.f77454d.getStatistics() == null) {
                i = 0;
            } else {
                i = this.f77454d.getStatistics().getCommentCount();
            }
            if (i <= 0 || this.f77453c == null || i <= this.f77453c.size()) {
                this.mShowAllComments.setVisibility(8);
                this.mLayoutAddComment.setPadding(0, C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d));
                return;
            }
            this.mShowAllComments.setVisibility(0);
            this.mShowAllComments.setText(C1642a.m8034a(getResources().getString(R.string.du7), new Object[]{C30537o.m99738a((long) i)}));
            this.mLayoutAddComment.setPadding(0, C23486n.m77122a(10.0d), 0, C23486n.m77122a(12.0d));
        }
    }

    /* renamed from: e */
    private void m96580e() {
        String str;
        if (this.f77454d.isAd()) {
            AwemeStatistics statistics = this.f77454d.getStatistics();
            if (statistics == null || statistics.getCommentCount() > 0) {
                CommentStruct commentArea = this.f77454d.getAwemeRawAd().getCommentArea();
                if (this.f77454d.getAwemeRawAd().isCommentAreaSwitch() && commentArea != null && commentArea.getType() != 1 && (C6307b.m19566a((Collection<T>) this.f77453c) || !(this.f77453c.get(0) instanceof CommentStruct))) {
                    if (this.f77453c == null) {
                        this.f77453c = new ArrayList();
                    }
                    commentArea.setAid(this.f77454d.getAid());
                    commentArea.setAwemeId(this.f77454d.getAid());
                    User user = new User();
                    if (this.f77454d.getAuthor() != null) {
                        str = this.f77454d.getAuthor().getUid();
                    } else {
                        str = "";
                    }
                    user.setUid(str);
                    user.setAvatarThumb(commentArea.getAvatarIcon());
                    commentArea.setUser(user);
                    this.f77453c.add(0, commentArea);
                }
            }
        }
    }

    public void setEventType(String str) {
        this.f77452b = str;
    }

    public void setPageType(int i) {
        this.f77451a = i;
    }

    public FollowFeedCommentLayout(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void mo75192c(int i) {
        if (this.f77457g != null) {
            this.f77457g.notifyItemChanged(i, Integer.valueOf(0));
        }
    }

    public void setCommentBackground(Drawable drawable) {
        if (drawable != null) {
            this.mRecComments.setBackground(drawable);
        }
    }

    /* renamed from: b */
    public final void mo75189b(int i) {
        if (this.f77457g != null) {
            this.f77457g.notifyItemRemoved(i);
            if (C6307b.m19566a((Collection<T>) this.f77457g.mo62312a())) {
                this.mRecComments.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private static boolean m96579a(Aweme aweme) {
        if (aweme == null || aweme.isCmtSwt()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75186a(int i) {
        if (this.mRecComments.getVisibility() == 8) {
            this.mRecComments.setVisibility(0);
        }
        if (!mo75190b() && this.f77453c != null && this.f77453c.size() > 1) {
            Comment comment = (Comment) this.f77453c.get(1);
            if (!(C6861a.m21337f().getCurUser() == null || comment.getUser() == null || !TextUtils.equals(C6861a.m21337f().getCurUser().getUid(), comment.getUser().getUid()))) {
                this.f77453c.remove(1);
            }
        }
        if (this.f77457g != null) {
            this.f77457g.notifyDataSetChanged();
        }
    }

    public void setDisplayType(int i) {
        int i2;
        this.f77456f = i;
        if (mo75190b()) {
            if (this.f77456f == 1) {
                i2 = C23486n.m77122a(12.0d);
            } else {
                i2 = C23486n.m77122a(8.0d);
            }
            setBackgroundResource(R.drawable.jc);
            this.mSpace.setVisibility(0);
            this.mLayoutLikes.setVisibility(0);
            this.mLayoutAddComment.setVisibility(0);
            this.mShowAllComments.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) this.mRecComments.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = i2;
            layoutParams.leftMargin = i2;
            this.mRecComments.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) this.mLayoutAddComment.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = i2;
            layoutParams2.leftMargin = i2;
            this.mLayoutAddComment.setLayoutParams(layoutParams2);
            m96578a(this.mShowAllComments, i2);
            LayoutParams layoutParams3 = (LayoutParams) this.mLayoutLikes.getLayoutParams();
            layoutParams3.topMargin = i2;
            layoutParams3.rightMargin = i2;
            layoutParams3.leftMargin = i2;
            this.mLayoutLikes.setLayoutParams(layoutParams3);
            LayoutParams layoutParams4 = (LayoutParams) this.mImgAvatar.getLayoutParams();
            layoutParams4.width = C23486n.m77122a(16.0d);
            layoutParams4.height = C23486n.m77122a(16.0d);
            this.mImgAvatar.setLayoutParams(layoutParams4);
            this.mImgAvatar.mo60914a(false, false);
            this.mImgAvatar.setImageURI(new Builder().scheme("res").path("2131231787").build());
            return;
        }
        this.mSpace.setVisibility(8);
        this.mLayoutLikes.setVisibility(8);
        this.mLayoutAddComment.setVisibility(8);
        this.mShowAllComments.setVisibility(8);
    }

    public FollowFeedCommentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    protected static void m96578a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public FollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private ValueAnimator m96577a(final View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i2});
        ofInt.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = intValue;
                view.setLayoutParams(layoutParams);
            }
        });
        ofInt.setDuration(150);
        return ofInt;
    }

    /* renamed from: a */
    public final void mo75187a(int i, int i2, int i3, int i4) {
        this.mRecComments.setPadding(i, 0, i3, i4);
    }

    /* renamed from: a */
    public void mo75188a(final Aweme aweme, List<Comment> list, List<User> list2, final C29395a aVar) {
        this.f77453c = list;
        this.f77454d = aweme;
        this.f77455e = list2;
        m96580e();
        if (!mo75190b() && this.f77453c != null && this.f77453c.size() > 2) {
            Comment comment = (Comment) this.f77453c.get(0);
            Comment comment2 = (Comment) this.f77453c.get(1);
            this.f77453c.clear();
            this.f77453c.add(comment);
            this.f77453c.add(comment2);
        }
        if (mo75190b()) {
            mo75191c();
            this.mShowAllComments.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (aVar != null) {
                        aVar.mo75057a(FollowFeedCommentLayout.this.mShowAllComments, aweme, FollowFeedCommentLayout.this.f77455e, false, "click_more_comment");
                    }
                }
            });
            this.mLayoutLikes.setDiggCountCallback(new C29388a() {
                /* renamed from: a */
                public final void mo75182a(int i) {
                    int i2;
                    View view = FollowFeedCommentLayout.this.mSpace;
                    if (FollowFeedCommentLayout.this.f77456f == 3 || i <= 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                }
            });
            mo75193d();
            this.mLayoutLikes.setEventType(this.f77452b);
            this.mLayoutLikes.setAuthorId(this.f77454d.getAuthorUid());
            this.mLayoutLikes.setAwemeId(this.f77454d.getAid());
        } else if (C6861a.m21337f().getCurUser().getAvatarThumb() != null) {
            C23323e.m76506a((RemoteImageView) this.mImgAvatar, C6861a.m21337f().getCurUser().getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            C23323e.m76525b(this.mImgAvatar, "", this.mAvatarSize, this.mAvatarSize);
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            this.mRecComments.setVisibility(8);
        } else {
            this.mRecComments.setVisibility(0);
        }
        this.mRecComments.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
            /* renamed from: f */
            public final boolean mo5441f() {
                return false;
            }
        });
        this.f77457g = C29363d.m96452b().mo75021a(aweme, list2, aVar, mo75190b());
        C29363d.m96452b().mo75025a(this.f77457g, this.f77452b);
        C29363d.m96452b().mo75024a(this.f77457g, this.f77451a);
        this.f77457g.mo66516d(false);
        this.f77457g.mo58045a(this.f77453c);
        this.mRecComments.setAdapter(this.f77457g);
        this.mRecComments.setFocusable(false);
        if (m96579a(aweme)) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
