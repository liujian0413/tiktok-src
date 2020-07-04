package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.digg.LikeUsersFragment.C26336a;
import com.p280ss.android.ugc.aweme.digg.p1172b.C26353a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29401d;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.CommentLikeListView.C29389b;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
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

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView */
public final class CommentListLikeListView extends CommentLikeListView {

    /* renamed from: b */
    public static final C24266a f64083b = new C24266a(null);

    /* renamed from: a */
    public int f64084a;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$a */
    public static final class C24266a {
        private C24266a() {
        }

        public /* synthetic */ C24266a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$b */
    public final class C24267b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f64085a;

        /* renamed from: b */
        private final User f64086b;

        /* renamed from: c */
        private final int f64087c;

        /* renamed from: d */
        private final C29389b f64088d;

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f64087c);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            if (!C27326a.m89578a(view)) {
                C29389b bVar = this.f64088d;
                if (bVar != null) {
                    bVar.mo63108a(view, this.f64086b);
                }
            }
        }

        public C24267b(CommentListLikeListView commentListLikeListView, User user, int i, C29389b bVar) {
            C7573i.m23587b(user, "mUser");
            this.f64085a = commentListLikeListView;
            this.f64086b = user;
            this.f64087c = i;
            this.f64088d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$c */
    static final class C24268c implements C29389b {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f64089a;

        /* renamed from: b */
        final /* synthetic */ User f64090b;

        C24268c(CommentListLikeListView commentListLikeListView, User user) {
            this.f64089a = commentListLikeListView;
            this.f64090b = user;
        }

        /* renamed from: a */
        public final void mo63108a(View view, User user) {
            String str;
            if (C23764b.m77913a(this.f64090b.getUid())) {
                C7195s a = C7195s.m22438a();
                Context context = this.f64089a.getContext();
                if (context != null) {
                    Activity activity = (Activity) context;
                    StringBuilder sb = new StringBuilder("aweme://user/profile/");
                    sb.append(this.f64090b.getUid());
                    Aweme aweme = this.f64089a.f77441e;
                    C7573i.m23582a((Object) aweme, "mAweme");
                    a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from_request_id", aweme.getRequestId()).mo18694a("enter_from", this.f64089a.f77442f).mo18694a("sec_user_id", this.f64090b.getSecUid()).mo18695a());
                    String str2 = "enter_personal_detail";
                    Aweme aweme2 = this.f64089a.f77441e;
                    C7573i.m23582a((Object) aweme2, "mAweme");
                    Aweme aweme3 = this.f64089a.f77441e;
                    C7573i.m23582a((Object) aweme3, "mAweme");
                    C22984d a2 = C22984d.m75611a().mo59973a("group_id", aweme2.getAid()).mo59973a("to_user_id", this.f64090b.getUid()).mo59973a("enter_from", this.f64089a.f77442f).mo59973a("author_id", aweme3.getAuthorUid()).mo59973a("enter_method", "click_like_name");
                    String str3 = "relation_type";
                    if (C43122ff.m136786q(this.f64090b)) {
                        str = "follow";
                    } else {
                        str = "unfollow";
                    }
                    C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f64089a.f77441e))).mo59973a("video_type", C33230ac.m107247v(this.f64089a.f77441e)).mo59973a("rec_uid", C33230ac.m107248w(this.f64089a.f77441e)).f60753a);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$d */
    static final class C24269d implements EllipsizeCallback {

        /* renamed from: a */
        final /* synthetic */ int[] f64091a;

        /* renamed from: b */
        final /* synthetic */ int f64092b;

        C24269d(int[] iArr, int i) {
            this.f64091a = iArr;
            this.f64092b = i;
        }

        public final void ellipsized(int i, int i2) {
            if (i2 - i <= 0) {
                this.f64091a[0] = -1;
            } else {
                this.f64091a[0] = this.f64092b + i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentListLikeListView$e */
    static final class C24270e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentListLikeListView f64093a;

        C24270e(CommentListLikeListView commentListLikeListView) {
            this.f64093a = commentListLikeListView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity g = C6405d.m19984g();
            if (!(g instanceof FragmentActivity)) {
                g = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) g;
            if (fragmentActivity != null) {
                Aweme aweme = this.f64093a.f77441e;
                C7573i.m23582a((Object) aweme, "mAweme");
                String aid = aweme.getAid();
                Aweme aweme2 = this.f64093a.f77441e;
                C7573i.m23582a((Object) aweme2, "mAweme");
                int awemeType = aweme2.getAwemeType();
                String a = C42996by.m136485a(this.f64093a.f77440d);
                int i = this.f64093a.f64084a;
                String str = this.f64093a.f77442f;
                C7573i.m23582a((Object) str, "mEventType");
                C26336a.m86666a(aid, awemeType, a, true, i, str, "video_like_list").show(fragmentActivity.getSupportFragmentManager(), "LikeUsersFragment");
                this.f64093a.mo63103b();
            }
        }
    }

    public CommentListLikeListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentListLikeListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getLayoutId() {
        return R.layout.a4z;
    }

    /* renamed from: e */
    private final void m79854e() {
        OnClickListener eVar = new C24270e(this);
        setBackgroundResource(R.drawable.jj);
        this.mTvContent.setOnClickListener(eVar);
        setOnClickListener(eVar);
    }

    /* renamed from: a */
    public final void mo63101a() {
        AvatarWithBorderView[] avatarWithBorderViewArr;
        for (AvatarWithBorderView avatarWithBorderView : this.f77439c) {
            avatarWithBorderView.setBorderColor(R.color.az3);
            avatarWithBorderView.setBorderWidth(2);
        }
    }

    /* renamed from: b */
    public final void mo63103b() {
        if (this.f77441e != null) {
            Aweme aweme = this.f77441e;
            C7573i.m23582a((Object) aweme, "mAweme");
            String aid = aweme.getAid();
            Aweme aweme2 = this.f77441e;
            C7573i.m23582a((Object) aweme2, "mAweme");
            C26353a.m86680a(this.f77442f, aweme2.getAuthorUid(), aid, C33230ac.m107248w(this.f77441e));
        }
    }

    /* renamed from: d */
    private final void m79853d() {
        if (C6307b.m19566a((Collection<T>) this.f77440d)) {
            Drawable a = C0683b.m2903a(getContext(), (int) R.drawable.a_y);
            if (a != null) {
                a.setBounds(0, 0, a.getMinimumWidth(), a.getMinimumHeight());
            }
            this.mTvContent.setCompoundDrawables(a, null, null, null);
            DmtTextView dmtTextView = this.mTvContent;
            C7573i.m23582a((Object) dmtTextView, "mTvContent");
            dmtTextView.setCompoundDrawablePadding((int) C9738o.m28708b(getContext(), 14.0f));
            ViewGroup viewGroup = this.mHeadViews;
            C7573i.m23582a((Object) viewGroup, "mHeadViews");
            viewGroup.setVisibility(8);
            return;
        }
        this.mTvContent.setCompoundDrawables(null, null, null, null);
        DmtTextView dmtTextView2 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView2, "mTvContent");
        dmtTextView2.setCompoundDrawablePadding(0);
        ViewGroup viewGroup2 = this.mHeadViews;
        C7573i.m23582a((Object) viewGroup2, "mHeadViews");
        viewGroup2.setVisibility(0);
    }

    public final void setLikeUsersDialogHeight(int i) {
        this.f64084a = i;
    }

    /* renamed from: b */
    private final float m79852b(int i) {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        Resources resources = context.getResources();
        float dimension = (resources.getDimension(R.dimen.ds) * 2.0f) + resources.getDimension(R.dimen.dq);
        if (i > 0) {
            return dimension + ((float) ((int) (resources.getDimension(R.dimen.dr) + (C9738o.m28708b(getContext(), 2.0f) * 2.0f) + (((float) (i - 1)) * resources.getDimension(R.dimen.f124292do)))));
        }
        return dimension;
    }

    /* renamed from: a */
    private final void m79851a(SpannableStringBuilder spannableStringBuilder, int i) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0683b.m2912c(getContext(), R.color.auw)), i, spannableStringBuilder.toString().length(), 33);
    }

    public CommentListLikeListView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo63102a(List<? extends User> list, int i, Aweme aweme) {
        int i2;
        String str;
        String str2;
        String str3;
        List<? extends User> list2 = list;
        int i3 = i;
        this.f77440d = list2;
        this.f77441e = aweme;
        mo63101a();
        m79853d();
        m79854e();
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
        if (C6307b.m19566a((Collection<T>) list2)) {
            mo75177c();
            spannableStringBuilder.append(getContext().getString(R.string.b86, new Object[]{C30537o.m99738a((long) i3)}));
            m79851a(spannableStringBuilder, 0);
            DmtTextView dmtTextView4 = this.mTvContent;
            C7573i.m23582a((Object) dmtTextView4, "mTvContent");
            dmtTextView4.setText(spannableStringBuilder);
            return;
        }
        if (list2 == null) {
            C7573i.m23580a();
        }
        if (list.size() < i3) {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b87, new Object[]{C30537o.m99738a((long) i3)}));
        } else {
            spannableStringBuilder.append(" ").append(getContext().getString(R.string.b85));
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (list.size() > 3) {
            i2 = 3;
        } else {
            i2 = list.size();
        }
        for (int i4 = 0; i4 <= 2; i4++) {
            if (i4 < i2) {
                C23323e.m76524b(this.f77439c[i4], ((User) list2.get(i4)).getAvatarThumb());
                AvatarWithBorderView avatarWithBorderView = this.f77439c[i4];
                C7573i.m23582a((Object) avatarWithBorderView, "mAvatar[i]");
                avatarWithBorderView.setVisibility(0);
            } else {
                AvatarWithBorderView avatarWithBorderView2 = this.f77439c[i4];
                C7573i.m23582a((Object) avatarWithBorderView2, "mAvatar[i]");
                avatarWithBorderView2.setVisibility(8);
            }
        }
        String str4 = "...";
        StringBuilder sb = new StringBuilder();
        sb.append(spannableStringBuilder.toString());
        sb.append(str4);
        float measureText = paint.measureText(sb.toString());
        float a = ((((float) C9738o.m28691a(getContext())) - m79852b(i2)) - ((float) paddingLeft)) - ((float) paddingRight);
        for (int i5 = 0; i5 < i2; i5++) {
            User user = (User) list2.get(i5);
            if (TextUtils.isEmpty(user.getRemarkName())) {
                str2 = user.getNickname();
            } else {
                str2 = user.getRemarkName();
            }
            spannableStringBuilder2.append(str2);
            if (i5 < i2 - 1) {
                str3 = "、";
            } else {
                str3 = "";
            }
            spannableStringBuilder2.append(str3);
        }
        C7573i.m23582a((Object) paint, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        int a2 = mo63100a(paint, charSequence, 2, (int) a, (int) (a - measureText));
        if (a2 != -1) {
            spannableStringBuilder2.delete(a2, spannableStringBuilder2.length());
            spannableStringBuilder2.append(str4);
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            User user2 = (User) list2.get(i6);
            if (TextUtils.isEmpty(user2.getRemarkName())) {
                str = user2.getNickname();
            } else {
                str = user2.getRemarkName();
            }
            int length = str.length() + i7 + 1;
            if (length > spannableStringBuilder2.length()) {
                length = spannableStringBuilder2.length();
            }
            spannableStringBuilder2.setSpan(new C24267b(this, user2, C0683b.m2912c(getContext(), R.color.auw), new C24268c(this, user2)), i7, length, 17);
            if (length >= spannableStringBuilder2.length()) {
                break;
            }
            i6++;
            i7 = length;
        }
        int length2 = spannableStringBuilder2.toString().length();
        SpannableStringBuilder append = spannableStringBuilder2.append(spannableStringBuilder);
        C7573i.m23582a((Object) append, "spanBuilder.append(likeStringBuilder)");
        m79851a(append, length2);
        DmtTextView dmtTextView5 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView5, "mTvContent");
        dmtTextView5.setText(charSequence);
        if (VERSION.SDK_INT >= 23) {
            DmtTextView dmtTextView6 = this.mTvContent;
            C7573i.m23582a((Object) dmtTextView6, "mTvContent");
            dmtTextView6.setBreakStrategy(0);
        }
        DmtTextView dmtTextView7 = this.mTvContent;
        C7573i.m23582a((Object) dmtTextView7, "mTvContent");
        dmtTextView7.setMovementMethod(C29401d.m96615a(0));
    }

    public /* synthetic */ CommentListLikeListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
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
            TextUtils.ellipsize(charSequence.subSequence(lineStart, charSequence.length()), textPaint, (float) i3, TruncateAt.END, false, new C24269d(iArr, lineStart));
        }
        return iArr[0];
    }
}
