package com.p280ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.metrics.C33258c;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.b */
public final class C26781b {
    /* renamed from: a */
    public static void m87970a(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        C26791l lVar = new C26791l(str, str2, str3, str4, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) lVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87972a(String str, String str2, String str3, String str4, long j, int i, LogPbBean logPbBean) {
        C26795p pVar = new C26795p(str, str2, str3, str4, j, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) pVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87971a(String str, String str2, String str3, String str4, int i, String str5, LogPbBean logPbBean) {
        C26784e eVar = new C26784e(str, str2, str3, str4, str5, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) eVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87973a(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C26785f fVar = new C26785f(str, str2, str3, str4, str5, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) fVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public static void m87983b(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C26788i iVar = new C26788i(str, str2, str3, str4, str5, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) iVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87974a(String str, String str2, String str3, String str4, String str5, long j, int i, LogPbBean logPbBean) {
        C26790k kVar = new C26790k(str, str2, str3, str4, str5, j, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) kVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87962a() {
        C1592h.m7855a(C26783d.f70641a, (Executor) C6907h.m21516a());
        C28580o.m93830a(PAGE.DISCOVER);
    }

    /* renamed from: a */
    public static void m87964a(String str) {
        C1592h.m7855a((Callable<TResult>) new C26798s<TResult>(str), (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m87977b(String str, String str2) throws Exception {
        if (TextUtils.equals("homepage_hot", str)) {
            C6907h.m21524a("enter_discovery_page", (Map) C22984d.m75611a().mo59973a("previous_page", str).mo59973a("enter_method", str2).mo59973a("group_id", C33258c.m107471a()).mo59973a("author_id", C33258c.m107473b()).f60753a);
        } else {
            C6907h.m21524a("enter_discovery_page", (Map) C22984d.m75611a().mo59973a("previous_page", str).mo59973a("enter_method", str2).f60753a);
        }
        return null;
    }

    /* renamed from: a */
    public static void m87966a(String str, String str2) {
        C1592h.m7855a((Callable<TResult>) new C26782c<TResult>(str, str2), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87965a(String str, int i, LogPbBean logPbBean) {
        C1592h.m7855a((Callable<TResult>) new C26796q<TResult>(str, i, logPbBean), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87963a(C22984d dVar, String str, String str2) {
        if (dVar != null && C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) > 0) {
            if (C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0) == 1) {
                dVar.mo59973a("discovery_category", str);
            } else {
                dVar.mo59973a("tab_name", str);
            }
            dVar.mo59973a(POIService.KEY_ORDER, str2);
        }
    }

    /* renamed from: b */
    public static void m87981b(String str, int i, LogPbBean logPbBean) {
        C1592h.m7855a((Callable<TResult>) new C26797r<TResult>(str, i, logPbBean), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87967a(String str, String str2, int i, String str3, LogPbBean logPbBean) {
        C26786g gVar = new C26786g(str, str2, str3, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) gVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87968a(String str, String str2, String str3, int i, LogPbBean logPbBean) {
        C26787h hVar = new C26787h(str, str2, str3, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) hVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: c */
    public static void m87986c(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        C26794o oVar = new C26794o(str, str2, str3, str4, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) oVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public static void m87969a(String str, String str2, String str3, int i, String str4, LogPbBean logPbBean) {
        C26792m mVar = new C26792m(str, str2, str3, str4, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) mVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public static void m87982b(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        C26793n nVar = new C26793n(str, str2, str3, str4, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) nVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: c */
    public static void m87987c(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C26789j jVar = new C26789j(str, str2, str3, str4, str5, i, logPbBean);
        C1592h.m7855a((Callable<TResult>) jVar, (Executor) C6907h.m21516a());
    }
}
