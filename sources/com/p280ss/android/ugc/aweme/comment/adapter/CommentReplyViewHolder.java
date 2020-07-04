package com.p280ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c.C10791a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.experiment.CommentLikedByCreatorExperiment;
import com.p280ss.android.ugc.aweme.comment.list.C24186l;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1097d.C24099a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24141a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24335r;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24337t;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.widget.C24373a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27636g;
import com.p280ss.android.ugc.aweme.emoji.utils.C27640i;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43071dt;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.aweme.views.RelationLabelTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder */
public class CommentReplyViewHolder extends C1293v implements C24186l {

    /* renamed from: a */
    public C24090a f63589a;

    /* renamed from: b */
    public Comment f63590b;

    /* renamed from: c */
    public boolean f63591c = false;

    /* renamed from: d */
    private C24373a f63592d;

    /* renamed from: e */
    private C27640i f63593e;

    /* renamed from: f */
    private String f63594f;

    /* renamed from: g */
    private String f63595g;

    /* renamed from: h */
    private String f63596h;

    /* renamed from: i */
    private final int f63597i = ((int) C9738o.m28708b(C6399b.m19921a(), 100.0f));

    /* renamed from: j */
    private final int f63598j = ((int) C9738o.m28708b(C6399b.m19921a(), 180.0f));

    /* renamed from: k */
    private C24335r f63599k = new C24335r() {
        /* renamed from: a */
        public final void mo62335a(View view) {
            if (CommentReplyViewHolder.this.f63590b != null && !C27326a.m89578a(view)) {
                User user = CommentReplyViewHolder.this.f63590b.getUser();
                if (!TextUtils.isEmpty(user.getUid()) && CommentReplyViewHolder.this.f63589a != null) {
                    CommentReplyViewHolder.this.f63589a.mo62448a(user.getUid(), user.getSecUid());
                }
            }
        }
    };

    /* renamed from: l */
    private C24335r f63600l = new C24335r() {
        /* renamed from: a */
        public final void mo62335a(View view) {
            Comment comment;
            String str;
            if (CommentReplyViewHolder.this.f63590b != null && CommentReplyViewHolder.this.f63589a != null) {
                String str2 = "";
                String str3 = "";
                if (view.getId() == R.id.e0i) {
                    if (CommentReplyViewHolder.this.f63590b.getRelationLabel() != null) {
                        str = CommentReplyViewHolder.this.f63590b.getRelationLabel().getUserId();
                    } else {
                        str = "";
                    }
                    str2 = str;
                    str3 = CommentReplyViewHolder.this.f63590b.getUser().getSecUid();
                } else {
                    if (!C6307b.m19566a((Collection<T>) CommentReplyViewHolder.this.f63590b.getReplyComments())) {
                        comment = (Comment) CommentReplyViewHolder.this.f63590b.getReplyComments().get(0);
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
                    CommentReplyViewHolder.this.f63589a.mo62450b(str2, str3);
                }
            }
        }
    };
    SmartCircleImageView mAvatarView;
    View mBgView;
    DmtTextView mCommentSplitView;
    TextView mCommentStyleView;
    protected TextView mCommentTimeView;
    MentionTextView mContentView;
    TextView mDiggCountView;
    View mDiggLayout;
    ImageView mDiggView;
    protected RemoteImageView mGifEmojiView;
    DmtTextView mPostStatus;
    View mRootView;
    DmtTextView mTitleView;
    CommentTranslationStatusView mTranslationView;
    DmtTextView mTvLikedByCreator;
    RelationLabelTextView mTvRelationLabel;

    /* renamed from: d */
    public final Comment mo62347d() {
        return this.f63590b;
    }

    /* renamed from: a */
    public final void mo62339a(Comment comment) {
        if (comment != null) {
            if (C24220a.m79551a().isBlackBackground()) {
                this.mRootView.setBackgroundResource(R.drawable.ji);
            } else {
                this.mRootView.setBackgroundResource(R.drawable.jh);
            }
            this.f63590b = comment;
            this.f63592d.mo63296a(this.mContentView.getContext(), comment, new C24337t(this.mContentView.getContext(), this.mContentView), new C24337t(this.mContentView.getContext(), null), this.mTranslationView);
            mo62336a();
            m78924h();
            m78920a(this.f63590b.getUser());
            this.mDiggCountView.setText(C30537o.m99738a((long) comment.getDiggCount()));
            m78921a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            C24141a.m79326a(comment, this.mCommentSplitView);
            C24141a.m79327a(comment, this.mCommentStyleView, m78925i());
            this.mTvRelationLabel.mo105199a(comment.getRelationLabel());
        }
    }

    /* renamed from: f */
    private void m78922f() {
        this.f63592d = new C24373a(this.mContentView.getContext());
    }

    /* renamed from: i */
    private static boolean m78925i() {
        return C24220a.m79551a().isBlackBackground();
    }

    /* renamed from: b */
    public final void mo62341b() {
        if (this.f63590b != null) {
            m78921a(this.f63590b.isUserDigged(), this.f63590b.getDiggCount(), false, this.f63590b.isAuthorDigged());
        }
    }

    /* renamed from: c */
    public final void mo62344c() {
        if (this.f63590b != null && this.f63590b.isNeedHint() && this.mBgView != null) {
            this.mBgView.postDelayed(new C24076g(this), 150);
        }
    }

    /* renamed from: h */
    private void m78924h() {
        if (this.mGifEmojiView != null) {
            if (this.f63590b.getEmoji() != null) {
                this.mGifEmojiView.setVisibility(0);
                m78919a(this.f63590b.getEmoji());
                return;
            }
            this.mGifEmojiView.setVisibility(8);
        }
    }

    /* renamed from: g */
    private void m78923g() {
        boolean z;
        if (C24191m.f63849a.mo62632a(this.f63590b) || this.f63590b.getEmoji() != null) {
            z = true;
        } else {
            z = false;
        }
        String a = C24148e.m79336a(this.f63590b, !z);
        if (!TextUtils.isEmpty(a)) {
            this.mContentView.setText(a);
            this.mContentView.setVisibility(0);
            C27608b.m90502a((TextView) this.mContentView);
        } else {
            this.mContentView.setVisibility(8);
        }
        C24148e.m79352f(this.f63590b);
        this.mContentView.setSpanColor(this.mContentView.getResources().getColor(R.color.a4q));
        this.mContentView.setOnSpanClickListener(new C24075f(this));
        this.mContentView.mo105184a(C24148e.m79344b(this.f63590b), (C43346d) new C41656f(C24220a.m79551a().isChallengeToHashTag()));
        this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo62348e() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.mBgView, "backgroundColor", new int[]{this.mBgView.getResources().getColor(R.color.l1), this.mBgView.getResources().getColor(R.color.ac4)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        this.f63590b.setNeedHint(false);
    }

    /* renamed from: a */
    public final void mo62336a() {
        if (this.f63590b != null) {
            int i = 4;
            if (C24191m.f63849a.mo62632a(this.f63590b)) {
                if (this.mCommentTimeView != null) {
                    this.mCommentTimeView.setVisibility(8);
                }
                this.mDiggCountView.setVisibility(4);
                this.mDiggLayout.setVisibility(4);
                this.mDiggView.setVisibility(4);
            } else {
                if (this.mCommentTimeView != null) {
                    if (this.f63590b.getEmoji() != null) {
                        this.mCommentTimeView.setVisibility(0);
                        this.mCommentTimeView.setText(C43110ev.m136734c(this.itemView.getContext(), ((long) this.f63590b.getCreateTime()) * 1000));
                    } else {
                        this.mCommentTimeView.setVisibility(8);
                    }
                }
                TextView textView = this.mDiggCountView;
                if (this.f63590b.getDiggCount() != 0) {
                    i = 0;
                }
                textView.setVisibility(i);
                this.mDiggLayout.setVisibility(0);
                this.mDiggView.setVisibility(0);
            }
            C24191m.m79479a(this.f63590b, this.mPostStatus);
            m78923g();
        }
    }

    /* renamed from: a */
    public final void mo62340a(String str) {
        this.f63594f = str;
    }

    /* renamed from: b */
    public final void mo62342b(String str) {
        this.f63595g = str;
    }

    /* renamed from: c */
    public final void mo62346c(String str) {
        this.f63596h = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62337a(View view) {
        if (this.f63589a != null && C24191m.m79482b(this.f63590b)) {
            this.f63589a.mo62444a(this.f63590b);
        }
    }

    public boolean onLongClick(View view) {
        if (this.f63590b != null && !this.f63591c) {
            C24069a.m78997a(view, this.f63590b.getEmoji(), this.f63589a);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo62343b(View view) {
        if (!(this.f63589a == null || this.f63590b == null)) {
            this.f63589a.mo62449b((C24187m) this.f63592d, this.f63590b);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo62345c(View view) {
        if (this.f63589a != null && this.f63590b != null && this.f63590b.getUser() != null && this.f63590b.getCid() != null) {
            this.f63589a.mo62443a((C24187m) this.f63592d, this.f63590b);
        }
    }

    /* renamed from: a */
    private void m78919a(Emoji emoji) {
        if (this.mGifEmojiView != null) {
            UrlModel animateUrl = emoji.getAnimateUrl();
            LayoutParams layoutParams = this.mGifEmojiView.getLayoutParams();
            int width = emoji.getWidth();
            int height = emoji.getHeight();
            if (animateUrl != null && (width == 0 || height == 0)) {
                width = animateUrl.getWidth();
                height = animateUrl.getHeight();
            }
            int i = this.f63597i;
            if (width > 0 && height > 0) {
                i = (width * this.f63597i) / height;
                if (i > this.f63598j) {
                    i = this.f63598j;
                }
            }
            layoutParams.width = i;
            if (this.f63593e == null) {
                this.f63593e = new C27640i() {
                    public final void am_() {
                    }

                    public final void an_() {
                        CommentReplyViewHolder.this.mGifEmojiView.setBackgroundResource(R.color.a6k);
                        ((C13438a) CommentReplyViewHolder.this.mGifEmojiView.getHierarchy()).mo32896a(C13423b.f35598f);
                        CommentReplyViewHolder.this.mGifEmojiView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(CommentReplyViewHolder.this.mGifEmojiView.getController())).mo32748b(ImageRequestBuilder.m40864a((int) R.drawable.b75).mo33467a(new C13595c().mo33153a(Config.ARGB_8888).mo33151a()).mo33476b())).mo32730f());
                        CommentReplyViewHolder.this.f63591c = true;
                    }
                };
            }
            C27636g.m90610a(this.mGifEmojiView, animateUrl, this.f63593e);
        }
    }

    /* renamed from: a */
    private void m78920a(User user) {
        C12139r rVar;
        int a = C23486n.m77122a(24.0d);
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                rVar = C12133n.m35298a((int) R.drawable.a_j);
            } else {
                rVar = C12133n.m35299a(C23400r.m76741a(avatarThumb));
            }
            rVar.mo29853b(C43012cg.m136513a(100)).mo29836a(a, a).mo29855c(true).mo29845a("CommentViewHolder").mo29844a((C12128i) this.mAvatarView).mo29848a();
            this.mTitleView.setText(C43122ff.m136774e(user));
        }
    }

    public void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.bh7) {
            if (!C6861a.m21337f().isLogin()) {
                C32656f.m105743a(C6405d.m19984g(), this.f63594f, "like_comment", C42914ab.m136242a().mo104633a("group_id", this.f63595g).mo104633a("log_pb", C33230ac.m107234j(this.f63595g)).f111445a);
            } else if (!(this.f63590b == null || this.f63589a == null)) {
                if (C24099a.m79167a(this.f63590b)) {
                    boolean z = !this.f63590b.isUserDigged();
                    boolean isAuthorDigged = this.f63590b.isAuthorDigged();
                    if (TextUtils.equals(this.f63596h, C6861a.m21337f().getCurUserId()) && !TextUtils.equals(this.f63596h, Comment.getAuthorUid(this.f63590b))) {
                        if (z) {
                            C24130a.m79275b(this.f63594f, this.f63595g, this.f63596h, this.f63590b.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f63590b.getDiggCount();
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    m78921a(z, diggCount + i, true, isAuthorDigged);
                }
                this.f63589a.mo62445a(this.f63590b, getAdapterPosition());
            }
        } else if (id == R.id.aqf && this.f63591c) {
            C27636g.m90610a(this.mGifEmojiView, this.f63590b.getEmoji().getAnimateUrl(), this.f63593e);
        }
    }

    public CommentReplyViewHolder(ViewGroup viewGroup, C24090a aVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u1, viewGroup, false));
        ButterKnife.bind((Object) this, this.itemView);
        this.f63589a = aVar;
        if (((C13438a) this.mAvatarView.getHierarchy()).f35619a != null) {
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32886c((float) C23486n.m77122a(0.5d));
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32885b(this.mAvatarView.getResources().getColor(R.color.li));
        }
        this.itemView.setOnClickListener(new C24072c(this));
        this.itemView.setOnLongClickListener(new C24073d(this));
        if (m78925i()) {
            this.mTitleView.setTextColor(this.itemView.getResources().getColor(R.color.a53));
            this.mCommentSplitView.setTextColor(this.itemView.getResources().getColor(R.color.a53));
            this.mContentView.setTextColor(this.itemView.getResources().getColor(R.color.a4z));
            this.mTvRelationLabel.setTextColor(this.itemView.getResources().getColor(R.color.a5h));
            this.mTvRelationLabel.setBackgroundResource(R.drawable.r7);
        }
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new C10791a());
            this.mPostStatus.setOnClickListener(new C24074e(this));
        }
        this.mAvatarView.setOnTouchListener(this.f63599k);
        this.mTitleView.setOnTouchListener(this.f63599k);
        this.mTvRelationLabel.setOnTouchListener(this.f63600l);
        m78922f();
        C43071dt.m136629a(this.mContentView);
        if (VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
        }
        if (C6399b.m19944t()) {
            this.mContentView.setLineSpacing(C9738o.m28708b(C6399b.m19921a(), 3.0f), 1.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62338a(View view, TextExtraStruct textExtraStruct) {
        if (C6405d.m19984g() != null) {
            C7195s a = C7195s.m22438a();
            Activity g = C6405d.m19984g();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18694a(C22689a.f60407a, textExtraStruct.getSecUid()).mo18695a());
        }
        C6907h.m21518a(this.mContentView.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", this.f63594f).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", this.f63595g).mo59973a("author_id", this.f63596h).mo59973a("enter_method", "comment_at").f60753a);
    }

    /* renamed from: a */
    private void m78921a(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        Resources resources;
        TextView textView;
        int i3;
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                public final void run() {
                    CommentReplyViewHolder.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
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
            i3 = R.color.lo;
        } else {
            this.mDiggView.setSelected(false);
            if (m78925i()) {
                this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5n));
            } else {
                this.mDiggView.setImageDrawable(this.mDiggView.getResources().getDrawable(R.drawable.a5m));
            }
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (m78925i()) {
                i3 = R.color.a53;
            } else {
                i3 = R.color.lz;
            }
        }
        textView.setTextColor(resources.getColor(i3));
        if (C6384b.m19835a().mo15292a(CommentLikedByCreatorExperiment.class, true, "enable_like_by_author", C6384b.m19835a().mo15295d().enable_like_by_author, false) && this.mTvLikedByCreator != null) {
            if (!z3 || TextUtils.equals(this.f63596h, Comment.getAuthorUid(this.f63590b))) {
                z4 = false;
            }
            DmtTextView dmtTextView = this.mTvLikedByCreator;
            if (!z4) {
                i4 = 8;
            }
            dmtTextView.setVisibility(i4);
            if (m78925i()) {
                this.mTvLikedByCreator.setBackgroundResource(R.drawable.j9);
                this.mTvLikedByCreator.setTextColor(C0683b.m2912c(this.mTvLikedByCreator.getContext(), R.color.sh));
            }
        }
    }
}
