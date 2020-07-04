package com.p280ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.comment.api.ICommentVideoDescHolder;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43347e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentVideoDescViewHolder */
public final class CommentVideoDescViewHolder extends ICommentVideoDescHolder implements OnClickListener {

    /* renamed from: d */
    public static final C24050a f63614d = new C24050a(null);

    /* renamed from: a */
    public String f63615a;

    /* renamed from: b */
    public String f63616b;

    /* renamed from: c */
    public final C24090a f63617c;

    /* renamed from: f */
    private final Context f63618f;

    /* renamed from: g */
    private final Activity f63619g;

    /* renamed from: h */
    private final SmartAvatarImageView f63620h;

    /* renamed from: i */
    private final DmtTextView f63621i;

    /* renamed from: j */
    private final MentionTextView f63622j;

    /* renamed from: k */
    private final int f63623k;

    /* renamed from: l */
    private User f63624l;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentVideoDescViewHolder$a */
    public static final class C24050a {
        private C24050a() {
        }

        public /* synthetic */ C24050a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentVideoDescViewHolder$b */
    static final class C24051b implements C43347e {

        /* renamed from: a */
        final /* synthetic */ CommentVideoDescViewHolder f63625a;

        /* renamed from: b */
        final /* synthetic */ Comment f63626b;

        C24051b(CommentVideoDescViewHolder commentVideoDescViewHolder, Comment comment) {
            this.f63625a = commentVideoDescViewHolder;
            this.f63626b = comment;
        }

        /* renamed from: a */
        public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
            this.f63625a.mo62356a(this.f63626b, textExtraStruct);
        }
    }

    public final void onClick(View view) {
        Integer num;
        CharSequence charSequence;
        String str;
        ClickInstrumentation.onClick(view);
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (((num != null && num.intValue() == R.id.ic) || (num != null && num.intValue() == R.id.title)) && !C27326a.m89578a(view)) {
            User user = this.f63624l;
            if (user != null) {
                charSequence = user.getUid();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C24090a aVar = this.f63617c;
                if (aVar != null) {
                    User user2 = this.f63624l;
                    if (user2 != null) {
                        str = user2.getUid();
                    } else {
                        str = null;
                    }
                    User user3 = this.f63624l;
                    if (user3 != null) {
                        str2 = user3.getSecUid();
                    }
                    aVar.mo62448a(str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62355a(Comment comment) {
        C7573i.m23587b(comment, "comment");
        this.f63624l = comment.getUser();
        User user = this.f63624l;
        if (user != null) {
            C12133n.m35299a(C23400r.m76741a(user.getAvatarThumb())).mo29853b(C43012cg.m136513a(100)).mo29836a(this.f63623k, this.f63623k).mo29855c(true).mo29844a((C12128i) this.f63620h).mo29848a();
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f63621i.setText(user.getRemarkName());
            } else {
                this.f63621i.setText(user.getNickname());
            }
        }
        m78941a(comment, this.f63622j);
    }

    /* renamed from: a */
    private final void m78941a(Comment comment, MentionTextView mentionTextView) {
        CharSequence a = C24148e.m79338a(comment, false, false, 3, null);
        if (!TextUtils.isEmpty(a)) {
            mentionTextView.setText(a);
            mentionTextView.setVisibility(0);
            C27608b.m90502a((TextView) mentionTextView);
        } else {
            mentionTextView.setVisibility(8);
        }
        C24148e.m79352f(comment);
        Context context = this.f63618f;
        C7573i.m23582a((Object) context, "mContext");
        mentionTextView.setSpanColor(context.getResources().getColor(R.color.a4q));
        mentionTextView.setOnSpanClickListener(new C24051b(this, comment));
        mentionTextView.mo105184a(C24148e.m79344b(comment), (C43346d) new C41656f(C24220a.m79551a().isChallengeToHashTag()));
        mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public CommentVideoDescViewHolder(View view, C24090a aVar) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f63617c = aVar;
        this.f63618f = view.getContext();
        Context context = view.getContext();
        if (context != null) {
            this.f63619g = (Activity) context;
            View findViewById = view.findViewById(R.id.ic);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.avatar)");
            this.f63620h = (SmartAvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.title);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.title)");
            this.f63621i = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.a1q);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.content)");
            this.f63622j = (MentionTextView) findViewById3;
            this.f63623k = (int) C9738o.m28708b(this.f63618f, 32.0f);
            C13438a aVar2 = (C13438a) this.f63620h.getHierarchy();
            C7573i.m23582a((Object) aVar2, "mAvatarIv.hierarchy");
            RoundingParams roundingParams = aVar2.f35619a;
            if (roundingParams != null) {
                roundingParams.mo32886c((float) C23486n.m77122a(0.5d));
                roundingParams.mo32885b(this.f63620h.getResources().getColor(R.color.li));
            }
            OnClickListener onClickListener = this;
            this.f63620h.setOnClickListener(onClickListener);
            this.f63621i.setOnClickListener(onClickListener);
            TextPaint paint = this.f63621i.getPaint();
            C7573i.m23582a((Object) paint, "mNameTv.paint");
            paint.setFakeBoldText(true);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public final void mo62356a(Comment comment, TextExtraStruct textExtraStruct) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (textExtraStruct != null) {
            num = Integer.valueOf(textExtraStruct.getType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            SmartRouter.buildRoute((Context) this.f63619g, "//challenge/detail").withParam("aweme_id", comment.getAwemeId()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_from", this.f63615a).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", true).open();
            return;
        }
        C7195s a = C7195s.m22438a();
        Activity activity = this.f63619g;
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        if (textExtraStruct != null) {
            str = textExtraStruct.getUserId();
        } else {
            str = null;
        }
        sb.append(str);
        C7203u a2 = C7203u.m22460a(sb.toString());
        String str5 = C22689a.f60407a;
        if (textExtraStruct != null) {
            str2 = textExtraStruct.getSecUid();
        } else {
            str2 = null;
        }
        a.mo18679a(activity, a2.mo18694a(str5, str2).mo18695a());
        Context context = this.f63618f;
        String str6 = "name";
        String str7 = "comment_at";
        if (textExtraStruct != null) {
            str3 = textExtraStruct.getUserId();
        } else {
            str3 = null;
        }
        C6907h.m21518a(context, str6, str7, str3, 0);
        String str8 = "enter_personal_detail";
        C22984d a3 = C22984d.m75611a();
        String str9 = "enter_from";
        String str10 = this.f63615a;
        if (str10 == null) {
            str10 = "";
        }
        C22984d a4 = a3.mo59973a(str9, str10);
        String str11 = "to_user_id";
        if (textExtraStruct != null) {
            str4 = textExtraStruct.getUserId();
        }
        C6907h.m21524a(str8, (Map) a4.mo59973a(str11, str4).mo59973a("group_id", comment.getAwemeId()).mo59973a("author_id", this.f63616b).mo59973a("enter_method", "comment_at").f60753a);
        C28580o.m93830a(PAGE.PROFILE);
    }
}
