package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView.C29390c;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsCommentLikeListView */
public class InsCommentLikeListView extends CommentLikeListView {
    public int getLayoutId() {
        return R.layout.a7q;
    }

    /* renamed from: a */
    public final void mo63101a() {
        for (AvatarWithBorderView borderColor : this.f77439c) {
            borderColor.setBorderColor(R.color.sn);
        }
    }

    public InsCommentLikeListView(Context context) {
        this(context, null);
    }

    public InsCommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InsCommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86878b(User user, View view, User user2) {
        if (user.getUid() != null) {
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) getContext();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from", "homepage_follow").mo18694a("sec_user_id", user.getSecUid()).mo18695a());
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("group_id", this.f77443g).mo59973a("enter_from", this.f77442f).mo59973a("to_user_id", user.getUid()).mo59973a("author_id", this.f77444h).mo59973a("enter_method", "click_like_name").f60753a);
        }
    }

    /* renamed from: a */
    public void mo63102a(List<User> list, int i, Aweme aweme) {
        int i2;
        String str;
        String str2;
        String str3;
        List<User> list2 = list;
        int i3 = i;
        this.f77440d = list2;
        this.f77441e = aweme;
        mo63101a();
        if (this.f77445i != null) {
            this.f77445i.mo75182a(i3);
        }
        if (i3 <= 0) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        StringBuilder sb = new StringBuilder();
        if (C6307b.m19566a((Collection<T>) list)) {
            mo75177c();
            sb.append(getContext().getString(R.string.b86, new Object[]{C30537o.m99738a((long) i3)}));
            this.mTvContent.setText(sb.toString());
            return;
        }
        if (list.size() < i3) {
            sb.append(" ");
            sb.append(getContext().getString(R.string.b87, new Object[]{C30537o.m99738a((long) i3)}));
        } else {
            sb.append(" ");
            sb.append(getContext().getString(R.string.b85));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list.size() > 3) {
            i2 = 3;
        } else {
            i2 = list.size();
        }
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 < i2) {
                this.f77439c[i4].setVisibility(0);
                C23323e.m76524b(this.f77439c[i4], ((User) list2.get(i4)).getAvatarThumb());
            } else {
                this.f77439c[i4].setVisibility(8);
            }
        }
        TextPaint paint = this.mTvContent.getPaint();
        int paddingLeft = this.mTvContent.getPaddingLeft();
        int paddingRight = this.mTvContent.getPaddingRight();
        float measureText = paint.measureText(String.valueOf(sb)) + (paint.getTextSize() * 3.0f);
        int i5 = 56;
        int i6 = 2;
        if (C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 2) {
            i5 = 98;
        }
        int a = (int) ((((((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), (float) i5)) - ((float) paddingLeft)) - ((float) paddingRight)) - measureText);
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < i2; i7++) {
            User user = (User) list2.get(i7);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            sb2.append(str2);
            if (i7 < i2 - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            sb2.append(str3);
        }
        int a2 = mo63100a(paint, sb2.toString(), 2, a, (int) (((float) a) + measureText));
        if (a2 != -1) {
            spannableStringBuilder.append((String) sb2.subSequence(0, a2)).append("...");
        } else {
            spannableStringBuilder.append(sb2.toString());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i2) {
            User user2 = (User) list2.get(i8);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i9 + i6;
            if (length > spannableStringBuilder.length()) {
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(new C29390c(user2, new C34169c(this, user2), getContext().getResources().getColor(R.color.lu)), i9, length, 17);
            i8++;
            i9 = length;
            i6 = 2;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.a4x));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new Standard((int) C9738o.m28708b(getContext(), (float) (((i2 - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
