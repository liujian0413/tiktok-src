package com.p280ss.android.ugc.aweme.flowfeed.p1256ui;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView */
public class CommentLikeListView extends FrameLayout {

    /* renamed from: c */
    protected AvatarWithBorderView[] f77439c;

    /* renamed from: d */
    public List<User> f77440d;

    /* renamed from: e */
    public Aweme f77441e;

    /* renamed from: f */
    public String f77442f;

    /* renamed from: g */
    protected String f77443g;

    /* renamed from: h */
    protected String f77444h;

    /* renamed from: i */
    protected C29388a f77445i;
    protected ViewGroup mHeadViews;
    protected ViewGroup mLikeListLayout;
    protected DmtTextView mTvContent;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$a */
    public interface C29388a {
        /* renamed from: a */
        void mo75182a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$b */
    public interface C29389b {
        /* renamed from: a */
        void mo63108a(View view, User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.ui.CommentLikeListView$c */
    public class C29390c extends ClickableSpan {

        /* renamed from: b */
        private User f77447b;

        /* renamed from: c */
        private C29389b f77448c;

        /* renamed from: d */
        private int f77449d;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f77449d);
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public final void onClick(View view) {
            if (!C27326a.m89578a(view) && this.f77448c != null) {
                this.f77448c.mo63108a(view, this.f77447b);
            }
        }

        public C29390c(User user, C29389b bVar, int i) {
            this.f77447b = user;
            this.f77448c = bVar;
            this.f77449d = i;
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.a6h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63101a() {
        for (AvatarWithBorderView borderColor : this.f77439c) {
            borderColor.setBorderColor(R.color.az3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo75177c() {
        for (int i = 0; i < 3; i++) {
            this.f77439c[i].setVisibility(8);
        }
    }

    public void setAuthorId(String str) {
        this.f77444h = str;
    }

    public void setAwemeId(String str) {
        this.f77443g = str;
    }

    public void setDiggCountCallback(C29388a aVar) {
        this.f77445i = aVar;
    }

    public void setEventType(String str) {
        this.f77442f = str;
    }

    public CommentLikeListView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo75175a(int i) {
        mo63102a(this.f77440d, i, this.f77441e);
    }

    /* renamed from: a */
    private void m96567a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        ButterKnife.bind((Object) this, inflate);
        this.mTvContent.setHighlightColor(C0683b.m2912c(context, 17170445));
        this.f77439c[0] = (AvatarWithBorderView) inflate.findViewById(R.id.blp);
        this.f77439c[1] = (AvatarWithBorderView) inflate.findViewById(R.id.blq);
        this.f77439c[2] = (AvatarWithBorderView) inflate.findViewById(R.id.blr);
    }

    public CommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77439c = new AvatarWithBorderView[3];
        m96567a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75176a(User user, View view, User user2) {
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
            spannableStringBuilder.setSpan(new C29390c(user2, new C29398a(this, user2), getContext().getResources().getColor(R.color.lu)), i9, length, 17);
            i8++;
            i9 = length;
            i6 = 2;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.e1));
        int length2 = spannableStringBuilder.toString().length();
        spannableStringBuilder.append(sb);
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.toString().length(), 33);
        if (i2 > 0) {
            spannableStringBuilder.setSpan(new Standard((int) C9738o.m28708b(getContext(), (float) (((i2 - 1) * 12) + 24)), 0), 0, spannableStringBuilder.length(), 17);
        }
        this.mTvContent.setText(spannableStringBuilder);
        this.mTvContent.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    static final /* synthetic */ void m96568a(int[] iArr, int i, int i2, int i3) {
        if (i3 - i2 <= 0) {
            iArr[0] = -1;
        } else {
            iArr[0] = i + i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo63100a(TextPaint textPaint, CharSequence charSequence, int i, int i2, int i3) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int[] iArr = {-1};
        if (staticLayout.getLineCount() >= 2) {
            int lineStart = staticLayout.getLineStart(1);
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i2, TruncateAt.END, false, new C29399b(iArr, lineStart));
        }
        return iArr[0];
    }
}
