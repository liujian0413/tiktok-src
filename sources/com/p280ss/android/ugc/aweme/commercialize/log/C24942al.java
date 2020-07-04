package com.p280ss.android.ugc.aweme.commercialize.log;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.al */
public final class C24942al {
    /* renamed from: a */
    public static void m81834a(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_show");
    }

    /* renamed from: b */
    public static void m81836b(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_play");
    }

    /* renamed from: c */
    public static void m81837c(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_click");
    }

    /* renamed from: d */
    public static void m81838d(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_click_account");
    }

    /* renamed from: e */
    public static void m81839e(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_like");
    }

    /* renamed from: f */
    public static void m81840f(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_comment");
    }

    /* renamed from: g */
    public static void m81841g(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_share");
    }

    /* renamed from: h */
    public static void m81842h(Context context, C24933af afVar) {
        m81835a(context, afVar, "safety_video_repost");
    }

    /* renamed from: a */
    private static void m81835a(Context context, C24933af afVar, String str) {
        if (context != null && afVar != null) {
            C24958f.m81905a().mo65266a("result_ad").mo65276b(str).mo65264a(Long.valueOf(afVar.getCreativeId())).mo65286h(afVar.getLogExtra()).mo65270a(context);
        }
    }
}
