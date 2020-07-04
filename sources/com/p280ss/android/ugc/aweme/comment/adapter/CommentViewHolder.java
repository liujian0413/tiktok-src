package com.p280ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.C24191m;
import com.p280ss.android.ugc.aweme.comment.IGifEmojiService;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.list.C24188n;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24335r;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24337t;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentTranslationStatusView;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.widget.C24373a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43071dt;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.C43134fm;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43347e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder */
public class CommentViewHolder extends C1293v implements C24188n {

    /* renamed from: a */
    public Comment f63627a;

    /* renamed from: b */
    protected String f63628b;

    /* renamed from: c */
    protected String f63629c;

    /* renamed from: d */
    protected String f63630d;

    /* renamed from: e */
    protected String f63631e;

    /* renamed from: f */
    protected int f63632f;

    /* renamed from: g */
    protected C24373a f63633g;

    /* renamed from: h */
    protected boolean f63634h = true;

    /* renamed from: i */
    protected C24090a f63635i;

    /* renamed from: j */
    private C24335r f63636j = new C24335r() {
        /* renamed from: a */
        public final void mo62335a(View view) {
            if (CommentViewHolder.this.f63627a != null && !C27326a.m89578a(view)) {
                User user = CommentViewHolder.this.f63627a.getUser();
                if (!TextUtils.isEmpty(user.getUid()) && CommentViewHolder.this.f63635i != null) {
                    CommentViewHolder.this.f63635i.mo62448a(user.getUid(), user.getSecUid());
                }
            }
        }
    };
    SmartAvatarImageView mAvatarView;
    View mBgView;
    protected MentionTextView mContentView;
    ImageView mMenuItem;
    public View mReplyContainer;
    protected MentionTextView mReplyContentView;
    protected View mReplyDivider;
    DmtTextView mReplyTitleView;
    View mRootView;
    DmtTextView mTitleView;
    CommentTranslationStatusView mTranslationView;
    int size;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder$a */
    class C24056a implements OnClickListener, OnLongClickListener {
        C24056a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CommentViewHolder.this.f63635i != null && CommentViewHolder.this.f63627a != null) {
                CommentViewHolder.this.f63635i.mo62443a((C24187m) CommentViewHolder.this.f63633g, CommentViewHolder.this.f63627a);
            }
        }

        public final boolean onLongClick(View view) {
            if (!(CommentViewHolder.this.f63635i == null || CommentViewHolder.this.f63627a == null)) {
                CommentViewHolder.this.f63635i.mo62449b((C24187m) CommentViewHolder.this.f63633g, CommentViewHolder.this.f63627a);
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62359a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62366b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo62369c() {
        return true;
    }

    /* renamed from: d */
    public void mo62370d() {
        mo62371e();
    }

    /* renamed from: f */
    public final Comment mo62372f() {
        return this.f63627a;
    }

    /* renamed from: g */
    public final View mo62373g() {
        return this.itemView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo62375j() {
        return false;
    }

    /* renamed from: i */
    protected static boolean m78946i() {
        return C24220a.m79551a().isBlackBackground();
    }

    /* renamed from: l */
    private void mo62380l() {
        this.f63633g = new C24373a(this.mContentView.getContext());
    }

    /* renamed from: h */
    public final void mo62374h() {
        if (this.f63627a != null && this.f63627a.isNeedHint() && this.mBgView != null) {
            this.mBgView.postDelayed(new C24078i(this), 150);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo62376k() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.mBgView, "backgroundColor", new int[]{this.mBgView.getResources().getColor(R.color.l1), this.mBgView.getResources().getColor(R.color.ac4)});
        ofInt.setDuration(3000);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        this.f63627a.setNeedHint(false);
    }

    /* renamed from: m */
    private void mo62384m() {
        boolean c = mo62369c();
        if (!this.f63634h || !c || C6307b.m19566a((Collection<T>) this.f63627a.getReplyComments())) {
            this.mReplyContainer.setVisibility(8);
        } else {
            Comment comment = (Comment) this.f63627a.getReplyComments().get(0);
            final User user = comment.getUser();
            String e = C43122ff.m136774e(user);
            if (user != null) {
                this.mReplyContainer.setVisibility(0);
                this.mReplyTitleView.setText(e);
                C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.mReplyTitleView);
                this.mReplyTitleView.setTag(user.getUid());
                this.mReplyTitleView.setOnTouchListener(new C24335r() {
                    /* renamed from: a */
                    public final void mo62335a(View view) {
                        if (!TextUtils.isEmpty(user.getUid()) && CommentViewHolder.this.f63635i != null) {
                            CommentViewHolder.this.f63635i.mo62448a(user.getUid(), user.getSecUid());
                        }
                    }
                });
                if (C24148e.m79342a()) {
                    mo62366b();
                }
                String a = C24148e.m79334a(comment, C24148e.m79332a(comment));
                this.mReplyContentView.setText(a);
                C27608b.m90502a((TextView) this.mReplyContentView);
                C24148e.m79352f(comment);
                this.mReplyContentView.setSpanColor(this.mReplyContentView.getResources().getColor(R.color.a4q));
                this.mReplyContentView.setOnSpanClickListener(new C43347e() {
                    /* renamed from: a */
                    public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
                        if (C6405d.m19984g() != null) {
                            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", CommentViewHolder.this.f63629c).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", CommentViewHolder.this.f63630d).mo59973a("author_id", CommentViewHolder.this.f63631e).mo59973a("enter_method", "comment_at").f60753a);
                            C28580o.m93830a(PAGE.PROFILE);
                            C7195s a = C7195s.m22438a();
                            Activity g = C6405d.m19984g();
                            StringBuilder sb = new StringBuilder("aweme://user/profile/");
                            sb.append(textExtraStruct.getUserId());
                            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18694a(C22689a.f60407a, textExtraStruct.getSecUid()).mo18695a());
                        }
                    }
                });
                List b = C24148e.m79344b(comment);
                Emoji emoji = comment.getEmoji();
                if (emoji != null) {
                    int length = a.length();
                    b.addAll(((IGifEmojiService) ServiceManager.get().getService(IGifEmojiService.class)).getGifEmojiDetailTailSpan(emoji, length - 1, length));
                }
                this.mReplyContentView.mo105184a(b, (C43346d) new C41656f(C24220a.m79551a().isChallengeToHashTag()));
                this.mReplyContentView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                this.mReplyContainer.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo62371e() {
        boolean z;
        boolean z2;
        String str;
        if (C24191m.f63849a.mo62632a(this.f63627a) || this.f63627a.getEmoji() != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f63627a.getCommentType() == 2 || C6399b.m19944t() || !TextUtils.equals(this.f63628b, C6861a.m21337f().getCurUserId()) || !C43122ff.m136783n(C6861a.m21337f().getCurUser()) || this.f63627a.getStickPosition() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (mo62375j()) {
            str = C24148e.m79353g(this.f63627a);
        } else {
            str = C24148e.m79337a(this.f63627a, !z, z2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.mContentView.setText(str);
            this.mContentView.setVisibility(0);
            C27608b.m90502a((TextView) this.mContentView);
        } else {
            this.mContentView.setVisibility(8);
        }
        C24148e.m79352f(this.f63627a);
        this.mContentView.setSpanColor(this.mContentView.getResources().getColor(R.color.a4q));
        this.mContentView.setOnSpanClickListener(new C24077h(this));
        List b = C24148e.m79344b(this.f63627a);
        Emoji emoji = this.f63627a.getEmoji();
        if (emoji != null && mo62375j()) {
            int length = str.length();
            b.addAll(((IGifEmojiService) ServiceManager.get().getService(IGifEmojiService.class)).getGifEmojiDetailTailSpan(emoji, length - 1, length));
        }
        this.mContentView.mo105184a(b, (C43346d) new C41656f(C24220a.m79551a().isChallengeToHashTag()));
        this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: c */
    public final void mo62368c(String str) {
        this.f63631e = str;
    }

    /* renamed from: a */
    public final void mo62360a(int i) {
        this.f63632f = i;
    }

    /* renamed from: b */
    public final void mo62367b(String str) {
        this.f63630d = str;
    }

    /* renamed from: a */
    public void mo62362a(Comment comment) {
        mo62363a(comment, (Rect) null);
    }

    /* renamed from: a */
    public void mo62364a(String str) {
        this.f63629c = str;
    }

    /* renamed from: a */
    public final void mo62365a(boolean z) {
        this.f63634h = z;
    }

    /* renamed from: a */
    private void m78945a(User user) {
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0)) {
                C12133n.m35299a(C23400r.m76741a(avatarThumb)).mo29853b(C43012cg.m136513a(100)).mo29836a(this.size, this.size).mo29855c(true).mo29845a("CommentViewHolder").mo29844a((C12128i) this.mAvatarView).mo29848a();
            }
            this.mTitleView.setText(C43122ff.m136774e(user));
            C43126fg.m136801a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.mTitleView);
            if (C24148e.m79342a()) {
                mo62359a();
            }
        }
    }

    public CommentViewHolder(View view, C24090a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f63635i = aVar;
        if (((C13438a) this.mAvatarView.getHierarchy()).f35619a != null) {
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32886c((float) C23486n.m77122a(0.5d));
            ((C13438a) this.mAvatarView.getHierarchy()).f35619a.mo32885b(this.mAvatarView.getResources().getColor(R.color.li));
        }
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (CommentViewHolder.this.f63635i != null && CommentViewHolder.this.f63627a != null && CommentViewHolder.this.f63627a.getUser() != null && CommentViewHolder.this.f63627a.getCid() != null) {
                    CommentViewHolder.this.f63635i.mo62443a((C24187m) CommentViewHolder.this.f63633g, CommentViewHolder.this.f63627a);
                }
            }
        });
        mo62380l();
        C43071dt.m136629a(this.mContentView);
        C43071dt.m136629a(this.mReplyContentView);
        this.mAvatarView.setOnTouchListener(this.f63636j);
        this.mTitleView.setOnTouchListener(this.f63636j);
        if (VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
            this.mReplyContentView.setBreakStrategy(0);
        }
        if (C6399b.m19944t()) {
            float b = C9738o.m28708b(C6399b.m19921a(), 3.0f);
            this.mContentView.setLineSpacing(b, 1.0f);
            this.mReplyContentView.setLineSpacing(b, 1.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62361a(View view, TextExtraStruct textExtraStruct) {
        if (C6405d.m19984g() != null) {
            C7195s a = C7195s.m22438a();
            Activity g = C6405d.m19984g();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18694a(C22689a.f60407a, textExtraStruct.getSecUid()).mo18695a());
        }
        C6907h.m21518a(this.mContentView.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", this.f63629c).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", this.f63630d).mo59973a("author_id", this.f63631e).mo59973a("enter_method", "comment_at").f60753a);
        C28580o.m93830a(PAGE.PROFILE);
    }

    /* renamed from: a */
    public void mo62363a(Comment comment, Rect rect) {
        if (comment != null && this.mContentView != null) {
            C43134fm.m136820a(rect, this.mRootView);
            this.f63627a = comment;
            this.f63633g.mo63296a(this.mContentView.getContext(), comment, new C24337t(this.mContentView.getContext(), this.mContentView), new C24337t(this.mContentView.getContext(), this.mReplyContentView), this.mTranslationView);
            mo62384m();
            mo62370d();
            m78945a(comment.getUser());
        }
    }
}
