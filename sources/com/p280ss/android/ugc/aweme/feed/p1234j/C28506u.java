package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.j.u */
public final class C28506u {

    /* renamed from: a */
    public static final C28506u f75131a = new C28506u();

    private C28506u() {
    }

    /* renamed from: a */
    public static final void m93706a(boolean z, String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str5, "enterMethod");
        C6907h.m21524a(z ? "cancel_favourite_compilation" : "favourite_compilation", (Map) C22984d.m75611a().mo59973a("enter_from", str4).mo59973a("compilation_id", str).mo59973a("enter_method", str5).mo59973a("author_id", str2).mo59973a("previous_page", str3).f60753a);
    }

    /* renamed from: a */
    public static final void m93705a(String str, String str2, String str3, boolean z) {
        C6907h.m21524a("unfold_compilation_description", (Map) C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("compilation_id", str).mo59973a("author_id", str2).mo59973a("to_status", z ? "close" : "open").f60753a);
    }

    /* renamed from: a */
    public static final void m93704a(String str, String str2, String str3, String str4) {
        C6907h.m21524a("open_compilation_share_board", (Map) C22984d.m75611a().mo59973a("enter_from", str4).mo59973a("compilation_id", str).mo59973a("author_id", str2).mo59973a("previous_page", str3).f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m93698a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "show_compilation_entrance"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.g.d r5 = r1.mo59973a(r2, r5)
            java.lang.String r1 = "compilation_id"
            r2 = 0
            if (r4 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.MixStruct r3 = r4.getMixInfo()
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.mixId
            goto L_0x001b
        L_0x001a:
            r3 = r2
        L_0x001b:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r3)
            java.lang.String r1 = "author_id"
            if (r4 == 0) goto L_0x0028
            java.lang.String r3 = r4.getAuthorUid()
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r3)
            java.lang.String r1 = "group_id"
            if (r4 == 0) goto L_0x0035
            java.lang.String r2 = r4.getAid()
        L_0x0035:
            com.ss.android.ugc.aweme.app.g.d r4 = r5.mo59973a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1234j.C28506u.m93698a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    /* renamed from: b */
    public static void m93707b(String str, String str2, String str3) {
        C6907h.m21524a("click_compilation_head", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("previous_page", str2).mo59973a("compilation_id", str3).f60753a);
    }

    /* renamed from: a */
    public static final void m93702a(String str, String str2, String str3) {
        C7573i.m23587b(str3, "status");
        C6907h.m21524a("slide_video_list", (Map) C22984d.m75611a().mo59973a("enter_from", str2).mo59973a("compilation_id", str).mo59973a("direction", str3).f60753a);
    }

    /* renamed from: b */
    public static final void m93708b(String str, String str2, String str3, String str4) {
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", str4).mo59973a("compilation_id", str).mo59973a("to_user_id", str2).mo59973a("previous_page", str3).f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m93699a(com.p280ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "compilation_first_video_play"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.app.g.d r5 = r1.mo59973a(r2, r5)
            java.lang.String r1 = "compilation_id"
            r2 = 0
            if (r4 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.MixStruct r3 = r4.getMixInfo()
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.mixId
            goto L_0x001b
        L_0x001a:
            r3 = r2
        L_0x001b:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r3)
            java.lang.String r1 = "group_id"
            if (r4 == 0) goto L_0x0028
            java.lang.String r3 = r4.getAid()
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r3)
            java.lang.String r1 = "author_id"
            if (r4 == 0) goto L_0x0036
            java.lang.String r3 = r4.getAuthorUid()
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r3)
            java.lang.String r1 = "order"
            if (r4 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r4.getMixInfo()
            if (r4 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.MixStatisStruct r4 = r4.statis
            if (r4 == 0) goto L_0x004f
            long r2 = r4.currentEpisode
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x004f:
            com.ss.android.ugc.aweme.app.g.d r4 = r5.mo59972a(r1, r2)
            java.lang.String r5 = "from_order"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r7)
            java.lang.String r5 = "previous_page"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1234j.C28506u.m93699a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static final void m93701a(String str, String str2, long j, String str3) {
        C6907h.m21524a("stay_time", (Map) C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("compilation_id", str).mo59973a("author_id", str2).mo59971a("duration", j).f60753a);
    }

    /* renamed from: a */
    public static void m93703a(String str, String str2, String str3, Long l) {
        C6907h.m21524a("compilation_continue", (Map) new C22984d().mo59973a("enter_from", str).mo59973a("previous_page", str2).mo59973a("compilation_id", str3).mo59972a("to_order", (Object) l).f60753a);
    }

    /* renamed from: a */
    public static final void m93700a(Aweme aweme, String str, String str2, String str3, String str4) {
        C7573i.m23587b(str4, "enterMethod");
        C6907h.m21524a("enter_compilation_detail", (Map) C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("compilation_id", str).mo59973a("impr_type", C33230ac.m107245t(null)).mo59973a("author_id", str2).mo59973a("enter_method", str4).mo59973a("group_id", (String) null).f60753a);
    }
}
