package com.p280ss.android.ugc.aweme.comment.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.experiment.CommentLikedByCreatorExperiment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1097d.C24099a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24141a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24159i;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24159i.C24160a;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24335r;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27636g;
import com.p280ss.android.ugc.aweme.emoji.utils.C27640i;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.notification.util.C34626j.C34631a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.views.RelationLabelTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolderNewStyle */
public class CommentViewHolderNewStyle extends CommentViewHolder {

    /* renamed from: j */
    public boolean f63645j;

    /* renamed from: k */
    private String f63646k;

    /* renamed from: l */
    private C27640i f63647l;

    /* renamed from: m */
    private final int f63648m = ((int) C9738o.m28708b(C6399b.m19921a(), 100.0f));
    DmtTextView mCommentSplitView;
    TextView mCommentStyleView;
    protected TextView mCommentTimeView;
    TextView mDiggCountView;
    View mDiggLayout;
    ImageView mDiggView;
    protected RemoteImageView mGifEmojiView;
    DmtTextView mPostStatus;
    DmtTextView mReplyCommentSplitView;
    TextView mReplyCommentStyleView;
    DmtTextView mTvLikedByCreator;
    protected RelationLabelTextView mTvRelationLabel;
    protected RelationLabelTextView mTvReplyCommentRelationLabel;

    /* renamed from: n */
    private final int f63649n = ((int) C9738o.m28708b(C6399b.m19921a(), 180.0f));

    /* renamed from: o */
    private final int f63650o = ((int) C9738o.m28708b(C6399b.m19921a(), 12.0f));

    /* renamed from: p */
    private final int f63651p = ((int) C9738o.m28708b(C6399b.m19921a(), 8.0f));

    /* renamed from: q */
    private C24335r f63652q = new C24335r() {
        /* renamed from: a */
        public final void mo62335a(View view) {
            Comment comment;
            String str;
            if (CommentViewHolderNewStyle.this.f63627a != null && CommentViewHolderNewStyle.this.f63635i != null) {
                String str2 = "";
                String str3 = "";
                if (view.getId() == R.id.e0i) {
                    if (CommentViewHolderNewStyle.this.f63627a.getRelationLabel() != null) {
                        str = CommentViewHolderNewStyle.this.f63627a.getRelationLabel().getUserId();
                    } else {
                        str = "";
                    }
                    str2 = str;
                    str3 = CommentViewHolderNewStyle.this.f63627a.getUser().getSecUid();
                } else {
                    if (!C6307b.m19566a((Collection<T>) CommentViewHolderNewStyle.this.f63627a.getReplyComments())) {
                        comment = (Comment) CommentViewHolderNewStyle.this.f63627a.getReplyComments().get(0);
                    } else {
                        comment = null;
                    }
                    if (comment != null) {
                        if (comment.getRelationLabel() != null) {
                            str2 = comment.getRelationLabel().getUserId();
                        } else {
                            str2 = "";
                        }
                        str3 = comment.getUser().getSecUid();
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    CommentViewHolderNewStyle.this.f63635i.mo62450b(str2, str3);
                }
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo62380l() {
        return C24071b.m79000a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62359a() {
        this.mCommentSplitView.setTypeface(this.mTitleView.getTypeface());
        this.mCommentSplitView.getPaint().setFakeBoldText(this.mTitleView.getPaint().isFakeBoldText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62366b() {
        this.mReplyCommentSplitView.setTypeface(this.mReplyTitleView.getTypeface());
        this.mReplyCommentSplitView.getPaint().setFakeBoldText(this.mReplyTitleView.getPaint().isFakeBoldText());
    }

    /* renamed from: m */
    public final void mo62384m() {
        if (this.f63627a != null) {
            m78975a(this.f63627a.isUserDigged(), this.f63627a.getDiggCount(), false, this.f63627a.isAuthorDigged());
        }
    }

    /* renamed from: n */
    private void m78976n() {
        if (this.mGifEmojiView != null && this.mCommentTimeView != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mCommentTimeView.getLayoutParams();
            if (this.f63627a.getEmoji() == null || mo62375j()) {
                marginLayoutParams.topMargin = this.f63651p;
                this.mGifEmojiView.setVisibility(8);
            } else {
                this.mGifEmojiView.setVisibility(0);
                marginLayoutParams.topMargin = this.f63650o;
                m78974a(this.f63627a.getEmoji());
            }
            this.mCommentTimeView.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    public final void mo62370d() {
        if (this.f63627a != null) {
            int i = 4;
            if (C24191m.f63849a.mo62632a(this.f63627a)) {
                if (this.mCommentTimeView != null) {
                    this.mCommentTimeView.setVisibility(8);
                }
                this.mDiggCountView.setVisibility(4);
                this.mDiggLayout.setVisibility(4);
                this.mDiggView.setVisibility(4);
            } else {
                if (this.mCommentTimeView != null) {
                    if (this.f63627a.getEmoji() != null) {
                        this.mCommentTimeView.setVisibility(0);
                        this.mCommentTimeView.setText(C43110ev.m136734c(this.itemView.getContext(), ((long) this.f63627a.getCreateTime()) * 1000));
                    } else {
                        this.mCommentTimeView.setVisibility(8);
                    }
                }
                TextView textView = this.mDiggCountView;
                if (this.f63627a.getDiggCount() != 0) {
                    i = 0;
                }
                textView.setVisibility(i);
                this.mDiggLayout.setVisibility(0);
                this.mDiggView.setVisibility(0);
            }
            C24191m.m79479a(this.f63627a, this.mPostStatus);
            mo62371e();
        }
    }

    /* renamed from: a */
    public final void mo62364a(String str) {
        this.f63646k = str;
    }

    public boolean onLongClick(View view) {
        if (this.f63627a != null && !this.f63645j) {
            C24069a.m78997a(view, this.f63627a.getEmoji(), this.f63635i);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62383a(View view) {
        if (this.f63635i != null && C24191m.m79482b(this.f63627a)) {
            this.f63635i.mo62444a(this.f63627a);
        }
    }

    /* renamed from: a */
    private void m78974a(Emoji emoji) {
        if (this.mGifEmojiView != null) {
            UrlModel animateUrl = emoji.getAnimateUrl();
            LayoutParams layoutParams = this.mGifEmojiView.getLayoutParams();
            int width = emoji.getWidth();
            int height = emoji.getHeight();
            if (animateUrl != null && (width == 0 || height == 0)) {
                width = animateUrl.getWidth();
                height = animateUrl.getHeight();
            }
            int i = this.f63648m;
            if (width > 0 && height > 0) {
                i = (width * this.f63648m) / height;
                if (i > this.f63649n) {
                    i = this.f63649n;
                }
            }
            layoutParams.width = i;
            if (this.f63647l == null) {
                this.f63647l = new C27640i() {
                    public final void am_() {
                    }

                    public final void an_() {
                        CommentViewHolderNewStyle.this.mGifEmojiView.setBackgroundResource(R.color.a6k);
                        ((C13438a) CommentViewHolderNewStyle.this.mGifEmojiView.getHierarchy()).mo32896a(C13423b.f35598f);
                        CommentViewHolderNewStyle.this.mGifEmojiView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(CommentViewHolderNewStyle.this.mGifEmojiView.getController())).mo32748b(ImageRequestBuilder.m40864a((int) R.drawable.b75).mo33467a(new C13595c().mo33153a(Config.ARGB_8888).mo33151a()).mo33476b())).mo32730f());
                        CommentViewHolderNewStyle.this.f63645j = true;
                    }
                };
            }
            C27636g.m90610a(this.mGifEmojiView, animateUrl, this.f63647l);
        }
    }

    public void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.bh7) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105743a(C6405d.m19984g(), this.f63646k, "like_comment", C42914ab.m136242a().mo104633a("login_title", view.getContext().getString(R.string.bz5)).mo104633a("group_id", this.f63630d).mo104633a("log_pb", C33230ac.m107234j(this.f63630d)).f111445a);
            } else if (!(this.f63627a == null || this.f63635i == null)) {
                if (C24099a.m79167a(this.f63627a)) {
                    boolean z = !this.f63627a.isUserDigged();
                    boolean isAuthorDigged = this.f63627a.isAuthorDigged();
                    if (TextUtils.equals(this.f63631e, C6861a.m21337f().getCurUserId()) && !TextUtils.equals(this.f63631e, Comment.getAuthorUid(this.f63627a))) {
                        if (z) {
                            C24130a.m79275b(this.f63646k, this.f63630d, this.f63631e, this.f63627a.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f63627a.getDiggCount();
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    m78975a(z, diggCount + i, true, isAuthorDigged);
                }
                this.f63635i.mo62445a(this.f63627a, getAdapterPosition());
            }
        } else if (id == R.id.aqf && this.f63645j) {
            C27636g.m90610a(this.mGifEmojiView, this.f63627a.getEmoji().getAnimateUrl(), this.f63647l);
        }
    }

    /* renamed from: a */
    public final void mo62363a(Comment comment, Rect rect) {
        int i;
        super.mo62363a(comment, rect);
        if (this.f63627a != null && comment != null) {
            this.f63645j = false;
            this.mDiggLayout.setVisibility(0);
            this.mCommentStyleView.setVisibility(0);
            int diggCount = comment.getDiggCount();
            this.mDiggCountView.setText(C30537o.m99738a((long) diggCount));
            m78975a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            TextView textView = this.mDiggCountView;
            if (diggCount == 0) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.mTvLikedByCreator != null && (this.mRootView instanceof ConstraintLayout)) {
                C24160a a = new C24159i((ConstraintLayout) this.mRootView).mo62587a();
                if (a != null) {
                    if (!C24148e.m79342a() || !this.f63634h || this.mReplyContainer.getVisibility() != 0) {
                        a.mo62588a(R.id.dnl, R.id.zu);
                        a.mo62588a(R.id.blz, R.id.dnl);
                        a.mo62588a(R.id.cio, R.id.crv);
                    } else {
                        a.mo62588a(R.id.blz, R.id.zu);
                        a.mo62588a(R.id.dnl, R.id.crv);
                        a.mo62588a(R.id.cio, R.id.dnl);
                    }
                    a.mo62589a();
                } else {
                    return;
                }
            }
            C24141a.m79326a(comment, this.mCommentSplitView);
            C24141a.m79327a(comment, this.mCommentStyleView, m78946i());
            this.mTvRelationLabel.mo105199a(comment.getRelationLabel());
            this.mTvRelationLabel.setBackgroundResource(R.drawable.xm);
            this.mTvRelationLabel.setTextColor(this.mTvRelationLabel.getResources().getColor(R.color.a5d));
            if (this.mReplyContainer.getVisibility() == 0) {
                Comment comment2 = (Comment) comment.getReplyComments().get(0);
                C24141a.m79326a(comment2, this.mReplyCommentSplitView);
                C24141a.m79327a(comment2, this.mReplyCommentStyleView, m78946i());
                this.mTvReplyCommentRelationLabel.mo105199a(comment2.getRelationLabel());
                this.mTvReplyCommentRelationLabel.setBackgroundResource(R.drawable.xm);
                this.mTvReplyCommentRelationLabel.setTextColor(this.mTvReplyCommentRelationLabel.getResources().getColor(R.color.a5d));
            }
            C24071b.m78999a(this.mTitleView.getContext(), this, comment);
            m78976n();
        }
    }

    public CommentViewHolderNewStyle(View view, C24090a aVar, String str) {
        super(view, aVar);
        this.f63628b = str;
        this.mMenuItem.setVisibility(8);
        view.setOnLongClickListener(new C24056a());
        this.mTvRelationLabel.setOnTouchListener(this.f63652q);
        this.mTvReplyCommentRelationLabel.setOnTouchListener(this.f63652q);
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new C34631a());
            this.mPostStatus.setOnClickListener(new C24079j(this));
        }
    }

    /* renamed from: a */
    private void m78975a(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        Resources resources;
        TextView textView;
        int i3;
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    CommentViewHolderNewStyle.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.mDiggCountView.setText(C30537o.m99738a((long) i));
        TextView textView2 = this.mDiggCountView;
        int i4 = 0;
        if (i == 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        boolean z4 = true;
        if (z) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5l));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            i3 = R.color.a79;
        } else {
            this.mDiggView.setSelected(false);
            if (mo62380l()) {
                this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5n));
            } else {
                this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5m));
            }
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (mo62380l()) {
                i3 = R.color.a6h;
            } else {
                i3 = R.color.lz;
            }
        }
        textView.setTextColor(resources.getColor(i3));
        if (C6384b.m19835a().mo15292a(CommentLikedByCreatorExperiment.class, true, "enable_like_by_author", C6384b.m19835a().mo15295d().enable_like_by_author, false) && this.mTvLikedByCreator != null) {
            if (!z3 || TextUtils.equals(this.f63631e, Comment.getAuthorUid(this.f63627a))) {
                z4 = false;
            }
            DmtTextView dmtTextView = this.mTvLikedByCreator;
            if (!z4) {
                i4 = 8;
            }
            dmtTextView.setVisibility(i4);
            if (m78946i()) {
                this.mTvLikedByCreator.setBackgroundResource(R.drawable.j9);
                this.mTvLikedByCreator.setTextColor(C0683b.m2912c(this.mTvLikedByCreator.getContext(), R.color.sh));
            }
        }
    }
}
