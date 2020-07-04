package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.EllipsizeCallback;
import android.text.TextUtils.TruncateAt;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.digg.LikeUsersFragment.C26336a;
import com.p280ss.android.ugc.aweme.digg.p1172b.C26353a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29401d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView.C29389b;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView.C29390c;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView */
public class InsBoldTextCommentLikeListView extends InsCommentLikeListView {

    /* renamed from: a */
    public static final C34156a f89049a = new C34156a(null);

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$BoldTextForegroundSpan */
    final class BoldTextForegroundSpan extends ForegroundColorSpan {
        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "textPaint");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(true);
        }

        public BoldTextForegroundSpan(int i) {
            super(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$a */
    public static final class C34156a {
        private C34156a() {
        }

        public /* synthetic */ C34156a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$b */
    static final class C34157b implements C29389b {

        /* renamed from: a */
        final /* synthetic */ InsBoldTextCommentLikeListView f89051a;

        /* renamed from: b */
        final /* synthetic */ User f89052b;

        C34157b(InsBoldTextCommentLikeListView insBoldTextCommentLikeListView, User user) {
            this.f89051a = insBoldTextCommentLikeListView;
            this.f89052b = user;
        }

        /* renamed from: a */
        public final void mo63108a(View view, User user) {
            String str;
            if (this.f89052b.getUid() != null) {
                C7195s a = C7195s.m22438a();
                Context context = this.f89051a.getContext();
                if (context != null) {
                    Activity activity = (Activity) context;
                    StringBuilder sb = new StringBuilder("aweme://user/profile/");
                    sb.append(this.f89052b.getUid());
                    Aweme aweme = this.f89051a.f77441e;
                    C7573i.m23582a((Object) aweme, "mAweme");
                    a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from_request_id", aweme.getRequestId()).mo18694a("enter_from", this.f89051a.f77442f).mo18694a("sec_user_id", this.f89052b.getSecUid()).mo18695a());
                    String str2 = "enter_personal_detail";
                    Aweme aweme2 = this.f89051a.f77441e;
                    C7573i.m23582a((Object) aweme2, "mAweme");
                    Aweme aweme3 = this.f89051a.f77441e;
                    C7573i.m23582a((Object) aweme3, "mAweme");
                    C22984d a2 = C22984d.m75611a().mo59973a("group_id", aweme2.getAid()).mo59973a("to_user_id", this.f89052b.getUid()).mo59973a("enter_from", this.f89051a.f77442f).mo59973a("author_id", aweme3.getAuthorUid()).mo59973a("enter_method", "click_like_name");
                    String str3 = "relation_type";
                    if (C43122ff.m136786q(this.f89052b)) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f89051a.f77441e))).mo59973a("video_type", C33230ac.m107247v(this.f89051a.f77441e)).mo59973a("rec_uid", C33230ac.m107248w(this.f89051a.f77441e)).f60753a);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$c */
    static final class C34158c implements EllipsizeCallback {

        /* renamed from: a */
        final /* synthetic */ int[] f89053a;

        /* renamed from: b */
        final /* synthetic */ int f89054b;

        C34158c(int[] iArr, int i) {
            this.f89053a = iArr;
            this.f89054b = i;
        }

        public final void ellipsized(int i, int i2) {
            if (i2 - i <= 0) {
                this.f89053a[0] = -1;
            } else {
                this.f89053a[0] = this.f89054b + i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.InsBoldTextCommentLikeListView$d */
    static final class C34159d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsBoldTextCommentLikeListView f89055a;

        C34159d(InsBoldTextCommentLikeListView insBoldTextCommentLikeListView) {
            this.f89055a = insBoldTextCommentLikeListView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity g = C6405d.m19984g();
            if (!(g instanceof FragmentActivity)) {
                g = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            if (fragmentActivity != null) {
                Aweme aweme = this.f89055a.f77441e;
                C7573i.m23582a((Object) aweme, "mAweme");
                String aid = aweme.getAid();
                Aweme aweme2 = this.f89055a.f77441e;
                C7573i.m23582a((Object) aweme2, "mAweme");
                int awemeType = aweme2.getAwemeType();
                String a = C42996by.m136485a(this.f89055a.f77440d);
                String str = this.f89055a.f77442f;
                C7573i.m23582a((Object) str, "mEventType");
                C26336a.m86666a(aid, awemeType, a, false, 0, str, "video_like_list").show(fragmentActivity.getSupportFragmentManager(), "LikeUsersFragment");
                this.f89055a.mo86874b();
            }
        }
    }

    public InsBoldTextCommentLikeListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: d */
    private final void m110127d() {
        OnClickListener dVar = new C34159d(this);
        this.mHeadViews.setOnClickListener(dVar);
        this.mTvContent.setOnClickListener(dVar);
    }

    /* renamed from: b */
    public final void mo86874b() {
        if (this.f77441e != null) {
            Aweme aweme = this.f77441e;
            C7573i.m23582a((Object) aweme, "mAweme");
            String aid = aweme.getAid();
            Aweme aweme2 = this.f77441e;
            C7573i.m23582a((Object) aweme2, "mAweme");
            C26353a.m86680a(this.f77442f, aweme2.getAuthorUid(), aid, C33230ac.m107248w(this.f77441e));
        }
    }

    /* renamed from: a */
    private final void m110126a(SpannableStringBuilder spannableStringBuilder, int i) {
        spannableStringBuilder.setSpan(new BoldTextForegroundSpan(C0683b.m2912c(getContext(), R.color.a4x)), i, spannableStringBuilder.toString().length(), 17);
    }

    public InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo63102a(List<? extends User> list, int i, Aweme aweme) {
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        List<? extends User> list2 = list;
        int i4 = i;
        this.f77440d = list2;
        this.f77441e = aweme;
        mo63101a();
        m110127d();
        if (this.f77445i != null) {
            this.f77445i.mo75182a(i4);
        }
        if (i4 <= 0) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        DmtTextView dmtTextView = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView, "mTvContent");
        TextPaint paint = dmtTextView.getPaint();
        DmtTextView dmtTextView2 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView2, "mTvContent");
        int paddingLeft = dmtTextView2.getPaddingLeft();
        DmtTextView dmtTextView3 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView3, "mTvContent");
        int paddingRight = dmtTextView3.getPaddingRight();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 1;
        if (C6307b.m19566a((Collection<T>) list2)) {
            mo75177c();
            spannableStringBuilder.append(getContext().getString(R.string.b86, new Object[]{C30537o.m99738a((long) i4)}));
            m110126a(spannableStringBuilder, 0);
            DmtTextView dmtTextView4 = this.mTvContent;
            C7573i.m23582a((Object) dmtTextView4, "mTvContent");
            dmtTextView4.setText(spannableStringBuilder);
            return;
        }
        if (list2 == null) {
            C7573i.m23580a();
        }
        if (list.size() < i4) {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b87, new Object[]{C30537o.m99738a((long) i4)}));
        } else {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b85));
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (list.size() > 3) {
            i2 = 3;
        } else {
            i2 = list.size();
        }
        for (int i6 = 0; i6 <= 2; i6++) {
            if (i6 < i2) {
                AvatarWithBorderView avatarWithBorderView = this.f77439c[i6];
                if (avatarWithBorderView == null) {
                    C7573i.m23580a();
                }
                C23323e.m76524b(avatarWithBorderView, ((User) list2.get(i6)).getAvatarThumb());
                AvatarWithBorderView avatarWithBorderView2 = this.f77439c[i6];
                C7573i.m23582a((Object) avatarWithBorderView2, "mAvatar[i]");
                avatarWithBorderView2.setVisibility(0);
            } else {
                AvatarWithBorderView avatarWithBorderView3 = this.f77439c[i6];
                C7573i.m23582a((Object) avatarWithBorderView3, "mAvatar[i]");
                avatarWithBorderView3.setVisibility(8);
            }
        }
        String str4 = "...";
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.toString());
        sb.append(str4);
        float measureText = paint.measureText(sb.toString());
        float a = ((((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 32.0f)) - ((float) paddingLeft)) - ((float) paddingRight);
        for (int i7 = 0; i7 < i2; i7++) {
            User user = (User) list2.get(i7);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            spannableStringBuilder2.append(str2);
            if (i7 < i2 - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            spannableStringBuilder2.append(str3);
        }
        if (i2 > 0) {
            int b = (int) C9738o.m28708b(getContext(), (float) (((i2 - 1) * 12) + 24));
            spannableStringBuilder2.setSpan(new Standard(b, 0), 0, spannableStringBuilder2.length(), 17);
            i3 = b;
        } else {
            i3 = 0;
        }
        C7573i.m23582a((Object) paint, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        CharSequence charSequence2 = charSequence;
        int a2 = mo63100a(paint, charSequence, 2, (int) a, (int) (a - measureText));
        if (a2 != -1) {
            spannableStringBuilder2.delete(a2, spannableStringBuilder2.length());
            spannableStringBuilder2.append(str4);
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
            int length = str.length() + i9 + i5;
            if (length > spannableStringBuilder2.length()) {
                length = spannableStringBuilder2.length();
            }
            C29389b bVar = new C34157b(this, user2);
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            spannableStringBuilder2.setSpan(new C29390c(user2, bVar, context.getResources().getColor(R.color.lu)), i9, length, 17);
            if (length >= spannableStringBuilder2.length()) {
                break;
            }
            i8++;
            i9 = length;
            i5 = 1;
        }
        int length2 = spannableStringBuilder2.length();
        SpannableStringBuilder append = spannableStringBuilder2.append(spannableStringBuilder);
        C7573i.m23582a((Object) append, "spanBuilder.append(likeStringBuilder)");
        m110126a(append, length2);
        DmtTextView dmtTextView5 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView5, "mTvContent");
        dmtTextView5.setText(charSequence2);
        if (VERSION.SDK_INT >= 23) {
            DmtTextView dmtTextView6 = this.mTvContent;
            C7573i.m23582a((Object) dmtTextView6, "mTvContent");
            dmtTextView6.setBreakStrategy(0);
        }
        DmtTextView dmtTextView7 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView7, "mTvContent");
        dmtTextView7.setMovementMethod(C29401d.m96615a(i3));
    }

    public /* synthetic */ InsBoldTextCommentLikeListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final int mo63100a(TextPaint textPaint, CharSequence charSequence, int i, int i2, int i3) {
        C7573i.m23587b(textPaint, "tp");
        C7573i.m23587b(charSequence, "cs");
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i2, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int[] iArr = {-1};
        if (dynamicLayout.getLineCount() >= 2) {
            int lineStart = dynamicLayout.getLineStart(1);
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i3, TruncateAt.END, false, new C34158c(iArr, lineStart));
        }
        return iArr[0];
    }
}
