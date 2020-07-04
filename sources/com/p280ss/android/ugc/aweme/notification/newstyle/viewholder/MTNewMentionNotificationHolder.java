package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder */
public final class MTNewMentionNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final C34577a f90243d = new C34577a(null);

    /* renamed from: e */
    private final View f90244e;

    /* renamed from: f */
    private final AvatarImageWithVerify f90245f;

    /* renamed from: g */
    private final TextView f90246g;

    /* renamed from: k */
    private final TextView f90247k;

    /* renamed from: l */
    private final SmartRoundImageView f90248l;

    /* renamed from: m */
    private final SmartRoundImageView f90249m;

    /* renamed from: n */
    private final View f90250n;

    /* renamed from: o */
    private final TextView f90251o;

    /* renamed from: p */
    private BaseNotice f90252p;

    /* renamed from: q */
    private String f90253q;

    /* renamed from: r */
    private String f90254r;

    /* renamed from: s */
    private AtMe f90255s;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder$a */
    public static final class C34577a {
        private C34577a() {
        }

        public /* synthetic */ C34577a(C7571f fVar) {
            this();
        }
    }

    public MTNewMentionNotificationHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90244e = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90245f = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7d);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f90246g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f90247k = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.c63);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.…notification_cover_right)");
        this.f90248l = (SmartRoundImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.c62);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.…otification_cover_bottom)");
        this.f90249m = (SmartRoundImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.c7o);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.…fication_reply_container)");
        this.f90250n = findViewById7;
        View findViewById8 = view.findViewById(R.id.c7p);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.…tification_reply_content)");
        this.f90251o = (TextView) findViewById8;
        C34538e.m111690b(this.f90244e);
        C34626j.m111876a(this.f90245f);
        C34626j.m111876a(this.f90248l);
        C34626j.m111876a(this.f90249m);
        OnClickListener onClickListener = this;
        this.f90244e.setOnClickListener(onClickListener);
        this.f90245f.setOnClickListener(onClickListener);
        this.f90245f.setRequestImgSize(C43012cg.m136513a(BaseNotice.HASHTAG));
        this.f90248l.setOnClickListener(onClickListener);
        this.f90249m.setOnClickListener(onClickListener);
        ((C13438a) this.f90248l.getHierarchy()).mo32898b((int) R.color.ee);
        ((C13438a) this.f90249m.getHierarchy()).mo32898b((int) R.color.ee);
        C34538e.m111689a((View) this.f90248l);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C34592h.m111823a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
            return;
        }
        AtMe atMe = this.f90255s;
        if (atMe != null) {
            mo87668a("click", "at", this.f90252p, this.f90253q, this.f90254r);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.c6v) {
                User user = atMe.getUser();
                C7573i.m23582a((Object) user, "it.user");
                String uid = user.getUid();
                C7573i.m23582a((Object) uid, "it.user.uid");
                User user2 = atMe.getUser();
                C7573i.m23582a((Object) user2, "it.user");
                String secUid = user2.getSecUid();
                C7573i.m23582a((Object) secUid, "it.user.secUid");
                MTNewBaseNotificationHolder.m111761a((MTNewBaseNotificationHolder) this, uid, secUid, this.f90252p, false, (String) null, 24, (Object) null);
            } else {
                if ((num != null && num.intValue() == R.id.c7r) || ((num != null && num.intValue() == R.id.c63) || (num != null && num.intValue() == R.id.c62))) {
                    C7195s.m22438a().mo18682a(C7203u.m22460a(atMe.getSchemaUrl()).mo18694a("refer", "message").mo18695a());
                    if (!TextUtils.isEmpty(m111130a(atMe.getSchemaUrl()))) {
                        C34538e eVar = C34538e.f90108a;
                        Context context = this.f89761c;
                        C7573i.m23582a((Object) context, "getContext()");
                        eVar.mo87841a(context);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87876a(BaseNotice baseNotice, boolean z, String str, String str2) {
        boolean z2;
        CharSequence charSequence;
        C7573i.m23587b(baseNotice, "notice");
        C7573i.m23587b(str2, "enterFrom");
        if (baseNotice.getAtMe() != null) {
            this.f90252p = baseNotice;
            this.f90253q = str;
            this.f90254r = str2;
            mo87668a("show", "at", baseNotice, str, str2);
            this.f90255s = baseNotice.getAtMe();
            AtMe atMe = this.f90255s;
            if (atMe != null) {
                UserVerify userVerify = new UserVerify(atMe.getUser().getAvatarThumb(), atMe.getUser().getCustomVerify(), atMe.getUser().getEnterpriseVerifyReason(), Integer.valueOf(atMe.getUser().getVerificationType()), atMe.getUser().getWeiboVerify());
                this.f90245f.setUserData(userVerify);
                this.f90245f.mo60896b();
                TextView textView = this.f90246g;
                User user = atMe.getUser();
                C7573i.m23582a((Object) user, "it.user");
                mo87867a(textView, user, this.f90252p, str, str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (atMe.getSubType() == 2) {
                    this.f90248l.setVisibility(0);
                    this.f90249m.setVisibility(8);
                    TextView textView2 = this.f90247k;
                    Context context = this.f89761c;
                    C7573i.m23582a((Object) context, "getContext()");
                    textView2.setTextColor(context.getResources().getColor(R.color.a4z));
                    Comment comment = atMe.getComment();
                    if (comment != null) {
                        CharSequence cid = comment.getCid();
                        if (cid == null || cid.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            this.f90250n.setVisibility(0);
                            NoticeCommentHelperService noticeCommentHelperService = (NoticeCommentHelperService) ServiceManager.get().getService(NoticeCommentHelperService.class);
                            TextView textView3 = this.f90251o;
                            if (comment.getUser() != null) {
                                StringBuilder sb = new StringBuilder();
                                User user2 = comment.getUser();
                                C7573i.m23582a((Object) user2, "user");
                                sb.append(C34538e.m111685a(user2));
                                sb.append(": ");
                                sb.append(noticeCommentHelperService.getDisplayText(comment, false));
                                charSequence = sb.toString();
                            } else {
                                charSequence = noticeCommentHelperService.getDisplayText(comment, false);
                            }
                            textView3.setText(charSequence);
                            C27608b.m90502a(this.f90251o);
                        }
                    }
                    C12133n.m35299a(C23400r.m76741a(atMe.getImageUrl())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f90248l).mo29848a();
                    spannableStringBuilder.append(this.f89761c.getString(R.string.cpm)).append(" ").append(atMe.getContent());
                } else {
                    this.f90248l.setVisibility(8);
                    this.f90249m.setVisibility(0);
                    this.f90250n.setVisibility(8);
                    TextView textView4 = this.f90247k;
                    Context context2 = this.f89761c;
                    C7573i.m23582a((Object) context2, "getContext()");
                    textView4.setTextColor(context2.getResources().getColor(R.color.a53));
                    C12133n.m35299a(C23400r.m76741a(atMe.getImageUrl())).mo29853b(C43012cg.m136513a(VETransitionFilterParam.TransitionDuration_DEFAULT)).mo29845a("Notice").mo29844a((C12128i) this.f90249m).mo29848a();
                    if (C6399b.m19947w() && !TextUtils.isEmpty(atMe.getTitle()) && (atMe.getSubType() == 7 || atMe.getSubType() == 8)) {
                        spannableStringBuilder.append(atMe.getTitle());
                    } else if (atMe.getSubType() == 7) {
                        spannableStringBuilder.append(this.f89761c.getString(R.string.cpj));
                    } else {
                        spannableStringBuilder.append(this.f89761c.getString(R.string.cpi));
                    }
                }
                C34586c.m111818a(this.f90247k, spannableStringBuilder, baseNotice, 7, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 148.0f)));
                C27608b.m90502a(this.f90247k);
            }
        }
    }
}
