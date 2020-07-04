package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29368c;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b.C32721a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoForwardViewHolder;
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
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolder */
public class InsForwardVideoViewHolder extends FollowFlowItemVideoForwardViewHolder {

    /* renamed from: al */
    private final DmtTextView f89335al;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolder$a */
    static final class C34257a implements C43347e {

        /* renamed from: a */
        final /* synthetic */ InsForwardVideoViewHolder f89337a;

        C34257a(InsForwardVideoViewHolder insForwardVideoViewHolder) {
            this.f89337a = insForwardVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
            if (this.f89337a.f78550D != null) {
                this.f89337a.f78550D.mo58082a(view, textExtraStruct, this.f89337a.itemView, this.f89337a.f78552F);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolder$b */
    static final class C34258b implements C43347e {

        /* renamed from: a */
        final /* synthetic */ InsForwardVideoViewHolder f89338a;

        C34258b(InsForwardVideoViewHolder insForwardVideoViewHolder) {
            this.f89338a = insForwardVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
            if (this.f89338a.f78550D != null) {
                this.f89338a.f78550D.mo58082a(view, textExtraStruct, this.f89338a.itemView, this.f89338a.f78552F);
            }
        }
    }

    /* renamed from: J */
    public final void mo76011J() {
    }

    /* renamed from: s */
    public final boolean mo76041s() {
        return true;
    }

    /* renamed from: x */
    public final void mo76048x() {
        mo76007C();
        mo76009H();
        mo76008E();
    }

    /* renamed from: z */
    public final void mo76050z() {
        View view = this.f78599y;
        C7573i.m23582a((Object) view, "mLineDivider");
        view.setVisibility(8);
    }

    /* renamed from: E */
    public final void mo76008E() {
        if (!C28482e.m93615h(this.f78552F) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            C23487o.m77140a((View) this.f78592r, 8);
        } else {
            C23487o.m77140a((View) this.f78592r, 0);
        }
    }

    /* renamed from: L */
    public final List<String> mo76013L() {
        ArrayList arrayList = new ArrayList();
        if (!C28482e.m93606a(this.f78552F) && C43122ff.m136762a(this.f78552F)) {
            arrayList.add(mo75888b().getString(R.string.fll));
        }
        return arrayList;
    }

    /* renamed from: O */
    public final void mo76062O() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            mo76063P();
        } else {
            super.mo76062O();
        }
    }

    /* renamed from: T */
    public final void mo76067T() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            mo76063P();
        } else {
            super.mo76067T();
        }
    }

    /* renamed from: H */
    public final void mo76009H() {
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        if (aweme.getAuthor() != null) {
            if (C21740a.m72687c(this.f78552F)) {
                ImageView imageView = this.f78595u;
                if (imageView == null) {
                    C7573i.m23580a();
                }
                imageView.setImageResource(R.drawable.auv);
                TextView textView = this.f78596v;
                if (textView == null) {
                    C7573i.m23580a();
                }
                textView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f78595u;
            if (imageView2 == null) {
                C7573i.m23580a();
            }
            imageView2.setImageResource(R.drawable.ai0);
            TextView textView2 = this.f78596v;
            if (textView2 == null) {
                C7573i.m23580a();
            }
            textView2.setVisibility(0);
        }
    }

    /* renamed from: w */
    public final void mo76047w() {
        Context b = mo75888b();
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        String d = C43110ev.m136735d(b, aweme.getCreateTime() * 1000);
        Aweme aweme2 = this.f78552F;
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
        TextView textView = this.f78587m;
        C7573i.m23582a((Object) textView, "mCreateTimeView");
        textView.setText(mo75888b().getString(R.string.b83, new Object[]{d}));
    }

    /* renamed from: c */
    public void mo76029c(View view) {
        C7573i.m23587b(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        C7573i.m23582a((Object) viewStub, "headStub");
        viewStub.setLayoutResource(R.layout.a7t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        C7573i.m23582a((Object) viewStub2, "descStub");
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        C7573i.m23582a((Object) viewStub3, "contentStub");
        viewStub3.setLayoutResource(R.layout.a7w);
        mo76019a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 0.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        C7573i.m23582a((Object) viewStub4, "bottomStub");
        viewStub4.setLayoutResource(R.layout.a7s);
        mo76017a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        C7573i.m23582a((Object) viewStub5, "commentStub");
        viewStub5.setLayoutResource(R.layout.a7o);
        mo76018a(viewStub5.inflate(), 0.0f, 4.0f);
    }

    /* renamed from: a */
    public final void mo76023a(MentionTextView mentionTextView, Aweme aweme) {
        C7573i.m23587b(mentionTextView, "descView");
        if (aweme != null) {
            if (!C6399b.m19944t() && !aweme.isHashTag()) {
                C21740a.m72693i(aweme);
            }
            if (!TextUtils.isEmpty(aweme.getDesc())) {
                mentionTextView.setText(aweme.getDesc());
                mentionTextView.setVisibility(0);
                C27608b.m90502a((TextView) mentionTextView);
                mentionTextView.setSpanSize(C9738o.m28690a(mo75888b(), 15.0f));
                mentionTextView.setHighlightColor(mentionTextView.getResources().getColor(R.color.ac4));
                mentionTextView.setOnSpanClickListener(new C34257a(this));
                mentionTextView.mo105184a(C29368c.m96459a(aweme), (C43346d) new C41656f(true));
                mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            mentionTextView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo76028b(MentionTextView mentionTextView, Aweme aweme) {
        C7573i.m23587b(mentionTextView, "descView");
        if (aweme != null) {
            if (!C6399b.m19944t() && !aweme.isHashTag()) {
                C21740a.m72693i(aweme);
            }
            if (C32720b.f85295a.mo84198c(aweme)) {
                C32721a aVar = C32720b.f85295a;
                Context b = mo75888b();
                C7573i.m23582a((Object) b, "context");
                String a = C1642a.m8034a("%s%s", Arrays.copyOf(new Object[]{mo76010I(), aweme.getDesc()}, 2));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                String str = this.f78557K;
                C7573i.m23582a((Object) str, "mEventType");
                mentionTextView.setText(aVar.mo84195a(b, a, aweme, str, 0));
            } else {
                String a2 = C1642a.m8034a("%s%s", Arrays.copyOf(new Object[]{mo76010I(), aweme.getDesc()}, 2));
                C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
                mentionTextView.setText(a2);
            }
            mentionTextView.setVisibility(0);
            TextView textView = mentionTextView;
            C27608b.m90502a(textView);
            mentionTextView.setSpanSize(C9738o.m28690a(mo75888b(), 15.0f));
            mentionTextView.setOnSpanClickListener(new C34258b(this));
            mentionTextView.mo105184a(mo76015a(aweme), (C43346d) new C41656f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
            Context b2 = mo75888b();
            Aweme aweme2 = this.f78552F;
            C7573i.m23582a((Object) aweme2, "mAweme");
            C28504t.m93688a(b2, aweme2.getForwardItem(), textView);
        }
    }

    /* renamed from: a */
    public void mo76020a(View view, int i, int i2) {
        String str;
        LayoutParams layoutParams;
        int[] iArr = new int[2];
        float f = ((float) i2) / ((float) i);
        int a = C9738o.m28691a(mo75888b());
        int b = (int) C9738o.m28708b(mo75888b(), 16.0f);
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) a) * 1.2533333f);
            str = "vertical";
        } else {
            iArr[1] = (int) (((float) a) * f);
            str = "horizontal";
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.width = a;
            marginLayoutParams.height = iArr[1];
            marginLayoutParams.setMargins(0, b, 0, 0);
            C7573i.m23582a((Object) C1642a.m8034a("calculateSize: type=%s, srcWidth=%d, srcHeight=%d, dstWidth=%d, dstHeight=%d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])}, 5)), "java.lang.String.format(format, *args)");
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public InsForwardVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "itemView");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(eVar, "itemViewInteractListener");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar, true);
        View findViewById = followFeedLayout.findViewById(R.id.duw);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_forward)");
        this.f89335al = (DmtTextView) findViewById;
        this.f89335al.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ InsForwardVideoViewHolder f89336a;

            {
                this.f89336a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f89336a.mo76067T();
            }
        });
        FollowFeedCommentLayout followFeedCommentLayout = this.f78597w;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
        ViewGroup viewGroup = this.f78649ae;
        C7573i.m23582a((Object) viewGroup, "mMusicLayout");
        viewGroup.setVisibility(8);
    }
}
