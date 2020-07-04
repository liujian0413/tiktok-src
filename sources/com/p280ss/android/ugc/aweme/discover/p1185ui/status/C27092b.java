package com.p280ss.android.ugc.aweme.discover.p1185ui.status;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.p280ss.android.ugc.aweme.discover.model.SearchNilText;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchBaseFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchFragment;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchMusicFragment;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.status.b */
public final class C27092b {

    /* renamed from: b */
    public static final C27093a f71469b = new C27093a(null);

    /* renamed from: a */
    public Context f71470a;

    /* renamed from: c */
    private SearchFragment<?> f71471c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.status.b$a */
    public static final class C27093a {
        private C27093a() {
        }

        public /* synthetic */ C27093a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27092b m88901a(Context context, SearchFragment<?> searchFragment) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(searchFragment, "searchFragment");
            return new C27092b(context, searchFragment);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.status.b$b */
    static final class C27094b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f71472a;

        /* renamed from: b */
        final /* synthetic */ String f71473b;

        C27094b(Fragment fragment, String str) {
            this.f71472a = fragment;
            this.f71473b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32656f.m105749a(this.f71472a, this.f71473b, "search_freq_control", (C23305g) C270951.f71474a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.status.b$c */
    public static final class C27096c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f71475a;

        C27096c(ObjectRef objectRef) {
            this.f71475a = objectRef;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "textView");
            C33787a a = C33786f.m108941a((String) this.f71475a.element);
            a.mo86195a("enter_from", "music_search_result");
            C7195s.m22438a().mo18682a(a.mo86194a().toString());
            C6907h.m21524a("music_search_feedback_click", (Map) C22984d.m75611a().mo59973a("enter_from", "music_search_result").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.status.b$d */
    public static final class C27097d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C27092b f71476a;

        /* renamed from: b */
        final /* synthetic */ Activity f71477b;

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            if (C6399b.m19946v()) {
                textPaint.setColor(C0683b.m2912c(this.f71476a.f71470a, R.color.w4));
            } else if (C6399b.m19947w()) {
                textPaint.setColor(C0683b.m2912c(this.f71476a.f71470a, R.color.avp));
            }
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C19290j jVar;
            C7573i.m23587b(view, "widget");
            if (C32326h.m104881e()) {
                jVar = new C19290j("https://api.tiktokv.com/magic/runtime/?id=1159");
            } else {
                jVar = new C19290j("https://support.tiktok.com/knowledge-base/community-policy");
                jVar.mo51188a("lang", C6903bc.m21475P().mo105517a(this.f71477b));
            }
            Activity activity = this.f71477b;
            if (activity != null) {
                C6903bc.m21503v().mo58105a(activity, jVar.toString(), false, activity.getString(R.string.aev));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        C27097d(C27092b bVar, Activity activity) {
            this.f71476a = bVar;
            this.f71477b = activity;
        }
    }

    /* renamed from: a */
    public final C10805b mo69880a() {
        boolean z;
        if (C6399b.m19944t()) {
            C10805b bVar = new C10806a(this.f71470a).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25993c(R.string.fid).mo25994d(SearchStatusName.EMPTY.getType()).f29135a;
            C7573i.m23582a((Object) bVar, "DmtDefaultStatus.Builder…                 .build()");
            return bVar;
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean showMusicFeedbackEntrance = a.getShowMusicFeedbackEntrance();
            C7573i.m23582a((Object) showMusicFeedbackEntrance, "SettingsReader.get().showMusicFeedbackEntrance");
            z = showMusicFeedbackEntrance.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (!(this.f71471c instanceof SearchMusicFragment) || !z) {
            C10805b bVar2 = new C10806a(this.f71470a).mo25985a((int) R.drawable.b7c).mo25990b((int) R.string.fic).mo25993c(R.string.fid).mo25994d(SearchStatusName.EMPTY.getType()).f29135a;
            C7573i.m23582a((Object) bVar2, "emptyStatus");
            return bVar2;
        }
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = "";
        try {
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = a2.getFeConfigCollection();
            C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig musicFaq = feConfigCollection.getMusicFaq();
            C7573i.m23582a((Object) musicFaq, "SettingsReader.get().feConfigCollection.musicFaq");
            T schema = musicFaq.getSchema();
            C7573i.m23582a((Object) schema, "SettingsReader.get().feC…ollection.musicFaq.schema");
            objectRef.element = schema;
        } catch (Exception unused2) {
        }
        Context context = this.f71470a;
        if (context == null) {
            C7573i.m23580a();
        }
        SpannableString spannableString = new SpannableString(context.getString(R.string.dka));
        spannableString.setSpan(new C27096c(objectRef), 8, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.f71470a, R.color.a4p)), 8, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.f71470a, R.color.a53)), 0, 9, 33);
        C10805b bVar3 = new C10806a(this.f71470a).mo25985a((int) R.drawable.b7c).mo25989a(true).mo25990b((int) R.string.fic).mo25987a((CharSequence) spannableString).f29135a;
        C7573i.m23582a((Object) bVar3, "emptyStatus");
        return bVar3;
    }

    /* renamed from: a */
    private C10805b m88897a(String str) {
        C7573i.m23587b(str, "msg");
        SearchFragment.m88505F();
        if (TextUtils.isEmpty(str) || !C6399b.m19944t()) {
            str = this.f71470a.getString(R.string.fih);
            C7573i.m23582a((Object) str, "context.getString(R.stri…uikit_search_reach_limit)");
        }
        if (C6399b.m19944t()) {
            C10805b bVar = new C10806a(this.f71470a).mo25985a((int) R.drawable.ax3).mo25988a(str).mo25994d(SearchStatusName.LIMIT.getType()).mo25992b(true).f29135a;
            C7573i.m23582a((Object) bVar, "DmtDefaultStatus.Builder…                 .build()");
            return bVar;
        }
        C10805b bVar2 = new C10806a(this.f71470a).mo25985a((int) R.drawable.b7c).mo25988a(str).mo25994d(SearchStatusName.LIMIT.getType()).mo25992b(true).f29135a;
        C7573i.m23582a((Object) bVar2, "limitStatus");
        return bVar2;
    }

    public C27092b(Context context, SearchFragment<?> searchFragment) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(searchFragment, "searchFragment");
        this.f71470a = context;
        this.f71471c = searchFragment;
    }

    /* renamed from: a */
    private C10805b m88895a(Fragment fragment, String str) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(str, "labelName");
        SearchFragment.m88505F();
        C10805b bVar = new C10806a(this.f71470a).mo25985a((int) R.drawable.b8q).mo25990b((int) R.string.fif).mo25993c(R.string.fig).mo25994d(SearchStatusName.NEED_LOGIN.getType()).mo25986a(ButtonStyle.SOLID, R.string.fie, new C27094b(fragment, str)).f29135a;
        C7573i.m23582a((Object) bVar, "loginStatus");
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ies.dmt.p262ui.widget.C10805b m88899b(com.p280ss.android.ugc.aweme.discover.model.SearchApiResult r3, java.lang.Exception r4) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.discover.ui.status.SearchStatusName r0 = m88898a(r3, r4)
            int[] r1 = com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27098c.f71478a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x002a;
                case 3: goto L_0x0017;
                case 4: goto L_0x0016;
                default: goto L_0x0010;
            }
        L_0x0010:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x0016:
            return r1
        L_0x0017:
            android.content.Context r4 = r2.f71470a
            if (r4 == 0) goto L_0x0022
            android.app.Activity r4 = (android.app.Activity) r4
            com.bytedance.ies.dmt.ui.widget.b r3 = r2.m88894a(r4, r3)
            return r3
        L_0x0022:
            kotlin.TypeCastException r3 = new kotlin.TypeCastException
            java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
            r3.<init>(r4)
            throw r3
        L_0x002a:
            boolean r3 = r4 instanceof com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException
            if (r3 != 0) goto L_0x002f
            r4 = r1
        L_0x002f:
            com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException r4 = (com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException) r4
            if (r4 == 0) goto L_0x0039
            java.lang.String r3 = r4.getErrorMsg()
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            com.bytedance.ies.dmt.ui.widget.b r3 = r2.m88897a(r3)
            return r3
        L_0x0040:
            com.ss.android.ugc.aweme.discover.ui.SearchFragment<?> r3 = r2.f71471c
            android.support.v4.app.Fragment r3 = (android.support.p022v4.app.Fragment) r3
            com.ss.android.ugc.aweme.discover.ui.SearchFragment<?> r4 = r2.f71471c
            java.lang.String r4 = r4.mo68437k()
            com.bytedance.ies.dmt.ui.widget.b r3 = r2.m88895a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27092b.m88899b(com.ss.android.ugc.aweme.discover.model.SearchApiResult, java.lang.Exception):com.bytedance.ies.dmt.ui.widget.b");
    }

    /* renamed from: a */
    private C10805b m88894a(Activity activity, SearchApiResult searchApiResult) {
        SearchNilText searchNilText;
        C7573i.m23587b(activity, "activity");
        if (searchApiResult != null) {
            searchNilText = searchApiResult.searchNilText;
        } else {
            searchNilText = null;
        }
        if (searchNilText == null) {
            return mo69880a();
        }
        String content = searchNilText.getContent();
        String link = searchNilText.getLink();
        C7573i.m23582a((Object) content, "guideline");
        CharSequence charSequence = content;
        C7573i.m23582a((Object) link, "community");
        int a = C7634n.m23730a(charSequence, link, 0, false, 6, (Object) null);
        int length = link.length() + a;
        SpannableString spannableString = new SpannableString(charSequence);
        if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(link) && a >= 0) {
            spannableString.setSpan(new C27097d(this, activity), a, length, 34);
        }
        Context context = this.f71470a;
        if (context == null) {
            C7573i.m23580a();
        }
        C10805b bVar = new C10806a(context).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25987a((CharSequence) spannableString).mo25989a(true).f29135a;
        C7573i.m23582a((Object) bVar, "DmtDefaultStatus.Builder…\n                .build()");
        return bVar;
    }

    /* renamed from: a */
    private static SearchStatusName m88898a(SearchApiResult searchApiResult, Exception exc) {
        if (exc instanceof ApiServerException) {
            switch (((ApiServerException) exc).getErrorCode()) {
                case SearchBaseFragment.f71085t /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment.t int)*/:
                    return SearchStatusName.NEED_LOGIN;
                case 2484:
                    return SearchStatusName.LIMIT;
            }
        }
        if (!(exc == null || exc.getCause() == null)) {
            Throwable cause = exc.getCause();
            if (cause == null) {
                C7573i.m23580a();
            }
            if (cause instanceof ApiServerException) {
                Throwable cause2 = exc.getCause();
                if (cause2 != null) {
                    switch (((ApiServerException) cause2).getErrorCode()) {
                        case SearchBaseFragment.f71085t /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment.t int)*/:
                            return SearchStatusName.NEED_LOGIN;
                        case 2484:
                            return SearchStatusName.LIMIT;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                }
            }
        }
        if (searchApiResult != null) {
            SearchNilInfo searchNilInfo = searchApiResult.searchNilInfo;
            if (searchNilInfo != null) {
                if (searchNilInfo.isSensitive()) {
                    return SearchStatusName.SENSITIVE;
                }
                if (searchNilInfo.isHitLimit()) {
                    return SearchStatusName.LIMIT;
                }
            }
        }
        return SearchStatusName.EMPTY;
    }

    /* renamed from: a */
    public static /* synthetic */ C10805b m88896a(C27092b bVar, SearchApiResult searchApiResult, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            searchApiResult = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        return bVar.m88899b(searchApiResult, exc);
    }
}
