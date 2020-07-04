package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.comment.IGifEmojiService;
import com.p280ss.android.ugc.aweme.comment.list.C24187m;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.ISearchMixViewHolderExperiment;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.CommentFollowFeedMomentViewHolder */
public class CommentFollowFeedMomentViewHolder extends C1293v {

    /* renamed from: a */
    public Comment f89195a;

    /* renamed from: b */
    public String f89196b;

    /* renamed from: c */
    public int f89197c;

    /* renamed from: d */
    public String f89198d;

    /* renamed from: e */
    public String f89199e;
    MentionTextView mTvComment;

    /* renamed from: a */
    public final void mo86954a(Comment comment) {
        if (comment != null) {
            this.f89195a = comment;
            if (this.mTvComment != null) {
                this.mTvComment.post(new C34267b(this, comment));
                if (this.f89197c == 9 && C6384b.m19835a().mo15287a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", C6384b.m19835a().mo15295d().search_mix_display_type, 0) != 0) {
                    this.mTvComment.setLineSpacing(C9738o.m28708b(this.itemView.getContext(), 1.2f), 1.0f);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86955b(Comment comment) {
        String str;
        List list;
        CommentService a = C24217a.m79549a();
        if (C29369d.m96463a()) {
            str = C24217a.m79549a().getDisplayTextForIns(this.f89195a, this.mTvComment.getPaint(), this.mTvComment.getMeasuredWidth());
        } else {
            str = C24217a.m79549a().getDisplayTextForMoment(this.f89195a, this.mTvComment.getPaint(), this.mTvComment.getMeasuredWidth());
        }
        String textWithGifEmojiDetailTail = a.getTextWithGifEmojiDetailTail(comment, str);
        if (!TextUtils.isEmpty(textWithGifEmojiDetailTail)) {
            this.mTvComment.setText(textWithGifEmojiDetailTail);
            C27608b.m90502a((TextView) this.mTvComment);
        }
        if (C24217a.m79549a().hasTextExtra(comment)) {
            this.mTvComment.setSpanColor(this.mTvComment.getResources().getColor(R.color.a4q));
            this.mTvComment.setOnSpanClickListener(new C34268c(this));
            if (C29369d.m96463a()) {
                list = C24217a.m79549a().getDisplayTextExtraForIns(comment);
            } else {
                list = C24217a.m79549a().getDispalyTextExtraForMoment(comment);
            }
            Emoji emoji = comment.getEmoji();
            if (emoji != null) {
                int length = textWithGifEmojiDetailTail.length();
                list.addAll(((IGifEmojiService) ServiceManager.get().getService(IGifEmojiService.class)).getGifEmojiDetailTailSpan(emoji, length - 1, length));
            }
            this.mTvComment.mo105184a(list, (C43346d) new C41656f(true));
            this.mTvComment.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86953a(C24090a aVar, View view) {
        if (aVar != null) {
            aVar.mo62443a((C24187m) null, this.f89195a);
        }
    }

    public CommentFollowFeedMomentViewHolder(View view, C24090a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        if (C29369d.m96463a()) {
            LayoutParams layoutParams = (LayoutParams) this.mTvComment.getLayoutParams();
            layoutParams.topMargin = (int) C9738o.m28708b(C6399b.m19921a(), 3.0f);
            this.mTvComment.setLayoutParams(layoutParams);
        }
        view.setOnClickListener(new C34266a(this, aVar));
        this.mTvComment.setHighlightColor(this.mTvComment.getResources().getColor(R.color.ac4));
        if (VERSION.SDK_INT >= 23) {
            this.mTvComment.setBreakStrategy(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86952a(View view, TextExtraStruct textExtraStruct) {
        if (C6405d.m19984g() != null) {
            C7195s a = C7195s.m22438a();
            Activity g = C6405d.m19984g();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo18679a(g, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", textExtraStruct.getSecUid()).mo18695a());
        }
        C6907h.m21518a(this.mTvComment.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", this.f89196b).mo59973a("to_user_id", textExtraStruct.getUserId()).mo59973a("group_id", this.f89198d).mo59973a("author_id", this.f89199e).mo59973a("enter_method", "click_comment_name").f60753a);
        C28580o.m93830a(PAGE.PROFILE);
    }
}
