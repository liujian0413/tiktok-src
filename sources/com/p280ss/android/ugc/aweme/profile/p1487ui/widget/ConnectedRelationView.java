package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowRelationTabActivity.C29624a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView */
public final class ConnectedRelationView extends FrameLayout {

    /* renamed from: a */
    private final View f96021a;

    /* renamed from: b */
    private final ImageView f96022b;

    /* renamed from: c */
    private final ImageView f96023c;

    /* renamed from: d */
    private final DmtTextView f96024d;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ConnectedRelationView$a */
    static final class C36596a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationView f96025a;

        /* renamed from: b */
        final /* synthetic */ User f96026b;

        C36596a(ConnectedRelationView connectedRelationView, User user) {
            this.f96025a = connectedRelationView;
            this.f96026b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("enter_relation_tab", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("enter_method", "click_relation").f60753a);
            if (C43122ff.m136794y(this.f96026b)) {
                C10761a.m31399c(this.f96025a.getContext(), (int) R.string.d7u).mo25750a();
                return;
            }
            Context context = this.f96025a.getContext();
            C7573i.m23582a((Object) context, "context");
            C29624a.m97195a(context, this.f96026b, "common_relation");
        }
    }

    public ConnectedRelationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ConnectedRelationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    private final void m118089b(User user) {
        this.f96022b.setAlpha(0.5f);
        this.f96024d.setAlpha(0.5f);
        DmtTextView dmtTextView = this.f96024d;
        dmtTextView.setAlpha(0.5f);
        dmtTextView.setText(user.getRecommendReasonRelation());
        this.f96023c.setVisibility(8);
        setOnClickListener(null);
    }

    /* renamed from: c */
    private final void m118090c(User user) {
        this.f96022b.setAlpha(1.0f);
        DmtTextView dmtTextView = this.f96024d;
        dmtTextView.setAlpha(1.0f);
        String recommendReasonRelation = user.getRecommendReasonRelation();
        C7573i.m23582a((Object) recommendReasonRelation, "user.recommendReasonRelation");
        dmtTextView.setText(m118088a(recommendReasonRelation));
        this.f96023c.setVisibility(0);
        setOnClickListener(new C36596a(this, user));
    }

    /* renamed from: a */
    public final void mo92819a(User user) {
        C7573i.m23587b(user, "user");
        if (TextUtils.isEmpty(user.getRecommendReasonRelation())) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (C43122ff.m136795z(user)) {
            m118090c(user);
        } else {
            m118089b(user);
        }
    }

    /* renamed from: a */
    private final SpannableStringBuilder m118088a(String str) {
        CharSequence charSequence = str;
        int a = C7634n.m23730a(charSequence, "<b>", 0, false, 6, (Object) null);
        int length = str.length() - (C7634n.m23760b(charSequence, "</b>", 0, false, 6, (Object) null) + 4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str));
        if (a > 0) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.avh)), 0, a, 33);
        }
        if (length > 0) {
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context2.getResources().getColor(R.color.avh)), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public ConnectedRelationView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.b2s, this);
        C7573i.m23582a((Object) inflate, "View.inflate(context, R.…cted_relation_view, this)");
        this.f96021a = inflate;
        View findViewById = this.f96021a.findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.icon)");
        this.f96022b = (ImageView) findViewById;
        View findViewById2 = this.f96021a.findViewById(R.id.bzu);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById(R.id.more)");
        this.f96023c = (ImageView) findViewById2;
        View findViewById3 = this.f96021a.findViewById(R.id.e0c);
        C7573i.m23582a((Object) findViewById3, "mRootView.findViewById(R.id.tv_recommend_reason)");
        this.f96024d = (DmtTextView) findViewById3;
    }

    public /* synthetic */ ConnectedRelationView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
