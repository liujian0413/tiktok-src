package com.p280ss.android.ugc.aweme.movie.p1404c;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment;
import com.p280ss.android.ugc.aweme.movie.view.FeedMvTagView;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.movie.c.a */
public final class C33651a {

    /* renamed from: b */
    public static final C33652a f87818b = new C33652a(null);

    /* renamed from: a */
    public String f87819a;

    /* renamed from: c */
    private FeedMvTagView f87820c;

    /* renamed from: d */
    private Aweme f87821d;

    /* renamed from: e */
    private JSONObject f87822e;

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$a */
    public static final class C33652a {
        private C33652a() {
        }

        public /* synthetic */ C33652a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m108591a(Aweme aweme) {
            String str;
            C7573i.m23587b(aweme, "aweme");
            if (aweme.getUploadMiscInfoStruct() != null) {
                AVUploadMiscInfoStruct uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct != null) {
                    str = uploadMiscInfoStruct.mvThemeId;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && C6384b.m19835a().mo15292a(MovieDetailExperiment.class, true, "mv_theme_mode_switch", C6384b.m19835a().mo15295d().mv_theme_mode_switch, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$b */
    static final class C33653b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C33651a f87823a;

        /* renamed from: b */
        final /* synthetic */ String f87824b;

        /* renamed from: c */
        final /* synthetic */ LogPbBean f87825c;

        /* renamed from: d */
        final /* synthetic */ Aweme f87826d;

        C33653b(C33651a aVar, String str, LogPbBean logPbBean, Aweme aweme) {
            this.f87823a = aVar;
            this.f87824b = str;
            this.f87825c = logPbBean;
            this.f87826d = aweme;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            C6907h.m21525a(this.f87824b, new C6909j().mo16966a("log_pb", C28199ae.m92689a().mo71790a(this.f87825c)).mo16966a("author_id", this.f87826d.getAuthorUid()).mo16966a("group_id", this.f87826d.getAid()).mo16966a("enter_from", this.f87823a.f87819a).mo16966a("mv_id", this.f87826d.getUploadMiscInfoStruct().mvThemeId).mo16966a("anchor_type", "mv_page").mo16967a());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$c */
    static final class C33654c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33651a f87827a;

        /* renamed from: b */
        final /* synthetic */ Aweme f87828b;

        C33654c(C33651a aVar, Aweme aweme) {
            this.f87827a = aVar;
            this.f87828b = aweme;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C33651a aVar = this.f87827a;
            AVUploadMiscInfoStruct uploadMiscInfoStruct = this.f87828b.getUploadMiscInfoStruct();
            if (uploadMiscInfoStruct != null) {
                str = uploadMiscInfoStruct.mvThemeId;
            } else {
                str = null;
            }
            aVar.mo86035a(str);
        }
    }

    /* renamed from: b */
    public static final boolean m108584b(Aweme aweme) {
        return C33652a.m108591a(aweme);
    }

    /* renamed from: a */
    public final void mo86030a() {
        FeedMvTagView feedMvTagView = this.f87820c;
        if (feedMvTagView != null) {
            feedMvTagView.setVisibility(8);
        }
    }

    public C33651a(FeedMvTagView feedMvTagView) {
        this.f87820c = feedMvTagView;
    }

    /* renamed from: a */
    public final void mo86033a(Integer num) {
        FeedMvTagView feedMvTagView = this.f87820c;
        if (feedMvTagView != null) {
            feedMvTagView.setBackground(num);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86031a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r2 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            r2.f87821d = r3
            boolean r0 = com.p280ss.android.ugc.aweme.movie.p1404c.C33651a.C33652a.m108591a(r3)
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r0 = r2.f87820c
            if (r0 == 0) goto L_0x0015
            r1 = 0
            r0.setVisibility(r1)
        L_0x0015:
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r0 = r2.f87820c
            if (r0 == 0) goto L_0x002e
            com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r1 = r3.getUploadMiscInfoStruct()
            if (r1 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r1 = r1.mvInfo
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r1 = ""
        L_0x002b:
            r0.setTagName(r1)
        L_0x002e:
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r0 = r2.f87820c
            if (r0 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.movie.c.a$c r1 = new com.ss.android.ugc.aweme.movie.c.a$c
            r1.<init>(r2, r3)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x003c:
            boolean r3 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95568d(r3)
            if (r3 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r3 = r2.f87820c
            if (r3 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.h.c r0 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.h.c r0 = com.p280ss.android.ugc.aweme.festival.christmas.C29132a.m95572g()
            if (r0 != 0) goto L_0x0055
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0055:
            java.lang.String r0 = r0.f79518h
            goto L_0x005a
        L_0x0058:
            java.lang.String r0 = ""
        L_0x005a:
            java.lang.String r1 = "if (CommonFestivalActivi…se\n                    \"\""
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r3.setFestivalName(r0)
            return
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.movie.p1404c.C33651a.mo86031a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86035a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000a
            return
        L_0x000a:
            com.ss.android.ugc.aweme.movie.view.FeedMvTagView r0 = r3.f87820c
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f87821d
            if (r1 == 0) goto L_0x0017
            java.lang.String r2 = "anchor_entrance_click"
            r3.mo86032a(r1, r2)
        L_0x0017:
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "//movie/detail"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r1)
            java.lang.String r1 = "mv_id"
            if (r4 != 0) goto L_0x0027
            java.lang.String r4 = ""
        L_0x0027:
            com.bytedance.router.SmartRoute r4 = r0.withParam(r1, r4)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = r3.f87819a
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = ""
        L_0x0033:
            com.bytedance.router.SmartRoute r4 = r4.withParam(r0, r1)
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f87821d
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = r1.getAid()
            if (r1 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r1 = ""
        L_0x0045:
            com.bytedance.router.SmartRoute r4 = r4.withParam(r0, r1)
            r0 = 10086(0x2766, float:1.4133E-41)
            r4.open(r0)
            return
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.movie.p1404c.C33651a.mo86035a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo86032a(Aweme aweme, String str) {
        String str2;
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventName");
        if (this.f87822e == null) {
            str2 = "";
        } else {
            JSONObject jSONObject = this.f87822e;
            if (jSONObject != null) {
                str2 = jSONObject.optString("request_id");
            } else {
                str2 = null;
            }
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str2);
        C1592h.m7855a((Callable<TResult>) new C33653b<TResult>(this, str, logPbBean, aweme), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public final void mo86034a(Integer num, String str, JSONObject jSONObject) {
        this.f87819a = str;
        this.f87822e = jSONObject;
    }
}
