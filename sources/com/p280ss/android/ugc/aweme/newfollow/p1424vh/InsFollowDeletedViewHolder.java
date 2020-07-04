package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedCommentLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b.C32721a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
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
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowDeletedViewHolder */
public final class InsFollowDeletedViewHolder extends ForwardTextViewHolder {

    /* renamed from: U */
    public final FollowFeedLayout f89288U;

    /* renamed from: V */
    public final C21744b f89289V;

    /* renamed from: W */
    public final C29376j f89290W;

    /* renamed from: X */
    public final C21747e f89291X;

    /* renamed from: Y */
    public final C21743a f89292Y;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowDeletedViewHolder$a */
    static final class C34237a implements C43347e {

        /* renamed from: a */
        final /* synthetic */ InsFollowDeletedViewHolder f89293a;

        C34237a(InsFollowDeletedViewHolder insFollowDeletedViewHolder) {
            this.f89293a = insFollowDeletedViewHolder;
        }

        /* renamed from: a */
        public final void mo62358a(View view, TextExtraStruct textExtraStruct) {
            if (this.f89293a.f78550D != null) {
                this.f89293a.f78550D.mo58082a(view, textExtraStruct, this.f89293a.itemView, this.f89293a.f78552F);
            }
        }
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
    public final void mo76029c(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        View view5;
        ViewStub viewStub5;
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
        mo76017a(view2, 4.0f);
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
        mo76017a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a8n);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        mo76018a(view4, 12.0f, 0.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(R.layout.a7s);
        }
        if (viewStub4 != null) {
            view5 = viewStub4.inflate();
        } else {
            view5 = null;
        }
        mo76017a(view5, 16.0f);
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(R.layout.a7o);
        }
        if (viewStub5 != null) {
            view6 = viewStub5.inflate();
        }
        mo76018a(view6, 0.0f, 4.0f);
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
            C27608b.m90502a((TextView) mentionTextView);
            mentionTextView.setSpanSize(C9738o.m28690a(mo75888b(), 15.0f));
            mentionTextView.setOnSpanClickListener(new C34237a(this));
            mentionTextView.mo105184a(mo76015a(aweme), (C43346d) new C41656f(true));
            mentionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public InsFollowDeletedViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(eVar, "itemViewInteractListener");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f89288U = followFeedLayout;
        this.f89289V = bVar;
        this.f89290W = jVar;
        this.f89291X = eVar;
        this.f89292Y = aVar;
        FollowFeedCommentLayout followFeedCommentLayout = this.f78597w;
        if (followFeedCommentLayout != null) {
            followFeedCommentLayout.setDisplayType(3);
        }
    }
}
