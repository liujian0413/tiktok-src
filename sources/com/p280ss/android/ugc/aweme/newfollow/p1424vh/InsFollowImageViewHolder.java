package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29368c;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedTagLayout2;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemImageViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.opensdk.model.BaseInfo;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43347e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder */
public class InsFollowImageViewHolder extends FollowFlowItemImageViewHolder {

    /* renamed from: aA */
    public static final C34238a f89294aA = new C34238a(null);

    /* renamed from: az */
    public final C21743a f89295az;

    /* renamed from: d */
    private final View f89296d = this.itemView.findViewById(R.id.bs6);

    /* renamed from: e */
    public final FollowFeedLayout f89297e;

    /* renamed from: f */
    public final C21744b f89298f;

    /* renamed from: g */
    public final C29376j f89299g;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder$a */
    public static final class C34238a {
        private C34238a() {
        }

        public /* synthetic */ C34238a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder$b */
    static final class C34239b implements C43347e {

        /* renamed from: a */
        final /* synthetic */ InsFollowImageViewHolder f89300a;

        C34239b(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f89300a = insFollowImageViewHolder;
        }

        /* renamed from: a */
        public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
            if (this.f89300a.f77550n != null) {
                this.f89300a.f77550n.mo58082a(view, textExtraStruct, this.f89300a.itemView, this.f89300a.f77546j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder$c */
    static final class C34240c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowImageViewHolder f89301a;

        C34240c(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f89301a = insFollowImageViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FollowFeedTagLayout2 followFeedTagLayout2 = this.f89301a.f77486B;
            if (followFeedTagLayout2 != null) {
                followFeedTagLayout2.mo75210e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder$d */
    static final class C34241d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowImageViewHolder f89302a;

        C34241d(InsFollowImageViewHolder insFollowImageViewHolder) {
            this.f89302a = insFollowImageViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f89302a.f77550n != null) {
                this.f89302a.f77550n.mo58086b(this.f89302a.f89297e, this.f89302a.itemView, this.f89302a.f77546j);
            }
        }
    }

    /* renamed from: d */
    public void mo68504d() {
    }

    /* renamed from: q */
    public final boolean mo75289q() {
        return true;
    }

    /* renamed from: w */
    public final void mo75295w() {
    }

    /* renamed from: a */
    public final void mo68499a() {
        super.mo68499a();
        mo75309ag();
    }

    /* renamed from: C */
    public final void mo75227C() {
        View view = this.f77508X;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: B */
    public void mo75226B() {
        super.mo75226B();
        FollowFeedTagLayout2 followFeedTagLayout2 = this.f77486B;
        if (followFeedTagLayout2 != null && followFeedTagLayout2.getVisibility() == 0) {
            View view = this.f89296d;
            if (view != null) {
                view.setOnClickListener(new C34240c(this));
            }
        }
    }

    /* renamed from: ag */
    public void mo75309ag() {
        FollowFeedTagLayout2 followFeedTagLayout2 = this.f77486B;
        if (followFeedTagLayout2 == null || followFeedTagLayout2.getVisibility() != 0) {
            TextView textView = this.f77495K;
            if (textView != null && textView.getVisibility() == 8) {
                View view = this.f89296d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: A */
    public void mo75225A() {
        super.mo75225A();
        TextView textView = this.f77495K;
        if (textView != null && textView.getVisibility() == 0) {
            TextView textView2 = this.f77495K;
            if (textView2 != null) {
                textView2.setClickable(false);
            }
            View view = this.f89296d;
            if (view != null) {
                view.setOnClickListener(new C34241d(this));
            }
        }
    }

    /* renamed from: J */
    public final List<String> mo75234J() {
        ArrayList arrayList = new ArrayList();
        if (!C28482e.m93606a(this.f77546j) && C43122ff.m136762a(this.f77546j)) {
            arrayList.add(mo75261ab().getString(R.string.fll));
        }
        return arrayList;
    }

    /* renamed from: ae */
    public final void mo75306ae() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            mo68521f();
        } else {
            super.mo75306ae();
        }
    }

    /* renamed from: m */
    public final void mo68532m() {
        if (!C28482e.m93615h(this.f77546j) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            C23487o.m77140a((View) this.f77507W, 8);
        } else {
            C23487o.m77140a((View) this.f77507W, 0);
        }
    }

    /* renamed from: b */
    public final void mo68502b() {
        Context ab = mo75261ab();
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String d = C43110ev.m136735d(ab, aweme.getCreateTime() * 1000);
        Aweme aweme2 = this.f77546j;
        if (aweme2 != null) {
            OpenPlatformStruct openPlatformStruct = aweme2.getOpenPlatformStruct();
            if (openPlatformStruct != null) {
                OpenPlatformRawData rawData = openPlatformStruct.getRawData();
                if (rawData != null) {
                    BaseInfo base = rawData.getBase();
                    if (base != null) {
                        String appName = base.getAppName();
                        if (appName != null && !TextUtils.isEmpty(appName)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(d);
                            sb.append("  ");
                            sb.append(appName);
                            d = sb.toString();
                        }
                    }
                }
            }
        }
        TextView textView = this.f77558v;
        if (textView == null) {
            C7573i.m23580a();
        }
        textView.setText(mo75261ab().getString(R.string.b83, new Object[]{d}));
    }

    /* renamed from: z */
    public final void mo75298z() {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        if (aweme.getAuthor() != null) {
            if (C21740a.m72687c(this.f77546j)) {
                ImageView imageView = this.f77492H;
                if (imageView == null) {
                    C7573i.m23580a();
                }
                imageView.setImageResource(R.drawable.auv);
                TextView textView = this.f77493I;
                if (textView == null) {
                    C7573i.m23580a();
                }
                textView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f77492H;
            if (imageView2 == null) {
                C7573i.m23580a();
            }
            imageView2.setImageResource(R.drawable.ai0);
            TextView textView2 = this.f77493I;
            if (textView2 == null) {
                C7573i.m23580a();
            }
            textView2.setVisibility(0);
        }
    }

    /* renamed from: j */
    public final void mo68525j() {
        if (!C6399b.m19944t()) {
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            if (!aweme.isHashTag()) {
                C21740a.m72693i(this.f77546j);
            }
        }
        this.f77487C.setMaxSize(C28511z.m93720a());
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        String desc = aweme2.getDesc();
        if (!TextUtils.isEmpty(desc)) {
            SpannableString f = mo75273f(desc);
            MentionTextView mentionTextView = this.f77487C;
            C7573i.m23582a((Object) mentionTextView, "mDescView");
            mentionTextView.setText(f);
            MentionTextView mentionTextView2 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView2, "mDescView");
            mentionTextView2.setVisibility(0);
            MentionTextView mentionTextView3 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView3, "mDescView");
            mentionTextView3.setSpanSize(C9738o.m28690a(mo75261ab(), 15.0f));
            this.f77487C.setOnSpanClickListener(new C34239b(this));
            MentionTextView mentionTextView4 = this.f77487C;
            Aweme aweme3 = this.f77546j;
            C7573i.m23582a((Object) aweme3, "mAweme");
            mentionTextView4.mo105184a(C29368c.m96459a(aweme3), (C43346d) new C41656f(true));
            MentionTextView mentionTextView5 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView5, "mDescView");
            mentionTextView5.setMovementMethod(LinkMovementMethod.getInstance());
            MentionTextView mentionTextView6 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView6, "mDescView");
            MentionTextView mentionTextView7 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView7, "mDescView");
            mentionTextView6.setHighlightColor(mentionTextView7.getResources().getColor(R.color.ac4));
            return;
        }
        MentionTextView mentionTextView8 = this.f77487C;
        C7573i.m23582a((Object) mentionTextView8, "mDescView");
        mentionTextView8.setVisibility(8);
    }

    /* renamed from: a */
    public void mo68500a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        ViewStub viewStub5;
        View view5;
        ViewStub viewStub6;
        View view6 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.dc_);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a7t);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo75253a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.a6s);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo75253a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a6e);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        mo75255a(view4, 12.0f, 0.0f, 0.0f, 0.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(R.layout.a7r);
        }
        if (viewStub4 != null) {
            viewStub4.inflate();
        }
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(R.layout.a7s);
        }
        if (viewStub5 != null) {
            view5 = viewStub5.inflate();
        } else {
            view5 = null;
        }
        mo75253a(view5, 16.0f);
        if (view != null) {
            viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        } else {
            viewStub6 = null;
        }
        if (viewStub6 != null) {
            viewStub6.setLayoutResource(R.layout.a7o);
        }
        if (viewStub6 != null) {
            view6 = viewStub6.inflate();
        }
        mo75254a(view6, 0.0f, 4.0f);
    }

    /* renamed from: a */
    private static void m110590a(int i, float f, int[] iArr) {
        iArr[0] = i;
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
        } else {
            iArr[1] = (int) (((float) i) * f);
        }
    }

    /* renamed from: a */
    public void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m110590a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89297e = followFeedLayout;
        this.f89298f = bVar;
        this.f89299g = jVar;
        this.f89295az = aVar;
        FollowFeedCommentLayout followFeedCommentLayout = this.f77502R;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
    }
}
