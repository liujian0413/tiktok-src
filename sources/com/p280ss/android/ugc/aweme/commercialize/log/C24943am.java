package com.p280ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.C2214c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.download.api.model.C19398d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.link.p1129a.C24767a;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.am */
public final class C24943am {

    /* renamed from: a */
    public static final C24943am f65779a = new C24943am();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$a */
    static final class C24944a implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ C19398d f65780a;

        C24944a(C19398d dVar) {
            this.f65780a = dVar;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            if (C6399b.m19944t()) {
                C24958f.m81906a(str, str2, j).mo65287i("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(this.f65780a.f52474e)).mo65286h(this.f65780a.f52475f).mo65281c();
            } else {
                C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65264a(Long.valueOf(this.f65780a.f52474e)).mo65286h(this.f65780a.f52475f).mo65278b();
            }
        }
    }

    private C24943am() {
    }

    /* renamed from: a */
    private static boolean m81844a() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18802bn();
    }

    /* renamed from: b */
    public final void mo65218b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        mo65217a(awemeRawAd);
    }

    /* renamed from: a */
    public static void m81843a(C19398d dVar) {
        if (dVar != null && !C6307b.m19566a((Collection<T>) dVar.f52478i)) {
            if (m81844a()) {
                C24946ao.f65785a.mo65228a().mo7955b(null, dVar.f52474e, dVar.f52478i, false, -1, dVar.f52475f, null);
            } else {
                C24962g.m81954a((C24939aj) new C24944a(dVar), (Collection<String>) dVar.f52478i, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo65216a(Aweme aweme) {
        List list;
        if (aweme != null) {
            list = aweme.getRawAdShowTrackUrlList();
        } else {
            list = null;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (m81844a()) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C2214c a = C24946ao.f65785a.mo65228a();
                        Long creativeId = awemeRawAd.getCreativeId();
                        C7573i.m23582a((Object) creativeId, "creativeId");
                        a.mo7954a(null, creativeId.longValue(), aweme.getRawAdShowTrackUrlList(), false, -1, awemeRawAd.getLogExtra(), null);
                    }
                }
                return;
            }
            C24962g.m81956a(aweme);
        }
    }

    /* renamed from: c */
    public final void mo65219c(Aweme aweme) {
        List list;
        if (aweme != null) {
            list = aweme.getRawAdPlayTrackUrlList();
        } else {
            list = null;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (m81844a()) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C2214c a = C24946ao.f65785a.mo65228a();
                        Long creativeId = awemeRawAd.getCreativeId();
                        C7573i.m23582a((Object) creativeId, "creativeId");
                        a.mo7956c(null, creativeId.longValue(), aweme.getRawAdPlayTrackUrlList(), false, -1, awemeRawAd.getLogExtra(), null);
                    }
                }
                return;
            }
            C24962g.m81965c(aweme);
        }
    }

    /* renamed from: d */
    public final void mo65220d(Aweme aweme) {
        List list;
        if (aweme != null) {
            list = aweme.getRawAdEffectivePlayTrackUrlList();
        } else {
            list = null;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (m81844a()) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C2214c a = C24946ao.f65785a.mo65228a();
                        Long creativeId = awemeRawAd.getCreativeId();
                        C7573i.m23582a((Object) creativeId, "creativeId");
                        a.mo7957d(null, creativeId.longValue(), aweme.getRawAdEffectivePlayTrackUrlList(), false, -1, awemeRawAd.getLogExtra(), null);
                    }
                }
                return;
            }
            C24962g.m81967d(aweme);
        }
    }

    /* renamed from: e */
    public final void mo65221e(Aweme aweme) {
        List list;
        if (aweme != null) {
            list = aweme.getRawAdPlayOverTrackUrlList();
        } else {
            list = null;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (m81844a()) {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C2214c a = C24946ao.f65785a.mo65228a();
                        Long creativeId = awemeRawAd.getCreativeId();
                        C7573i.m23582a((Object) creativeId, "creativeId");
                        a.mo7959e(null, creativeId.longValue(), aweme.getRawAdPlayOverTrackUrlList(), false, -1, awemeRawAd.getLogExtra(), null);
                    }
                }
                return;
            }
            C24962g.m81969e(aweme);
        }
    }

    /* renamed from: a */
    public final void mo65215a(C24767a aVar) {
        Collection collection;
        Collection collection2;
        if (aVar != null) {
            LinkData linkData = aVar.f65239b;
            if (linkData != null) {
                if (m81844a()) {
                    List list = null;
                    if (TextUtils.equals(aVar.f65238a, "show") || TextUtils.equals(aVar.f65238a, "comment_show")) {
                        UrlModel urlModel = linkData.trackUrlList;
                        if (urlModel != null) {
                            collection = urlModel.getUrlList();
                        } else {
                            collection = null;
                        }
                        if (!C6307b.m19566a(collection)) {
                            C2214c a = C24946ao.f65785a.mo65228a();
                            String str = linkData.creativeId;
                            C7573i.m23582a((Object) str, "linkAd.creativeId");
                            long parseLong = Long.parseLong(str);
                            UrlModel urlModel2 = linkData.trackUrlList;
                            if (urlModel2 != null) {
                                list = urlModel2.getUrlList();
                            }
                            a.mo7954a(null, parseLong, list, false, -1, linkData.logExtra, null);
                            return;
                        }
                        return;
                    }
                    if (TextUtils.equals(aVar.f65238a, "click")) {
                        UrlModel urlModel3 = linkData.clickTrackUrlList;
                        if (urlModel3 != null) {
                            collection2 = urlModel3.getUrlList();
                        } else {
                            collection2 = null;
                        }
                        if (!C6307b.m19566a(collection2)) {
                            C2214c a2 = C24946ao.f65785a.mo65228a();
                            String str2 = linkData.creativeId;
                            C7573i.m23582a((Object) str2, "linkAd.creativeId");
                            long parseLong2 = Long.parseLong(str2);
                            UrlModel urlModel4 = linkData.clickTrackUrlList;
                            if (urlModel4 != null) {
                                list = urlModel4.getUrlList();
                            }
                            a2.mo7955b(null, parseLong2, list, false, -1, linkData.logExtra, null);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C24962g.m81951a(aVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65217a(com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.getClickTrackUrlList()
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r0.getUrlList()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r0 == 0) goto L_0x0017
            return
        L_0x0017:
            boolean r0 = m81844a()
            if (r0 == 0) goto L_0x004d
            if (r12 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.commercialize.log.ao r0 = com.p280ss.android.ugc.aweme.commercialize.log.C24946ao.f65785a
            com.bytedance.android.a.a.c r1 = r0.mo65228a()
            r2 = 0
            java.lang.Long r0 = r12.getCreativeId()
            java.lang.String r3 = "creativeId"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            long r3 = r0.longValue()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.getClickTrackUrlList()
            java.lang.String r5 = "clickTrackUrlList"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            java.util.List r5 = r0.getUrlList()
            r6 = 0
            r7 = -1
            java.lang.String r9 = r12.getLogExtra()
            r10 = 0
            r1.mo7955b(r2, r3, r5, r6, r7, r9, r10)
            goto L_0x0050
        L_0x004c:
            return
        L_0x004d:
            com.p280ss.android.ugc.aweme.commercialize.log.C24962g.m81958a(r12)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.log.C24943am.mo65217a(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):void");
    }
}
