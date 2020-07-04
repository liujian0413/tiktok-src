package com.p280ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p280ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.i */
public final class C24792i {

    /* renamed from: a */
    public static final C24792i f65289a = new C24792i();

    /* renamed from: b */
    private static List<String> f65290b = C7525m.m23466c("dou+", "company_link", "iron_man", "shopping_cart", "star_atlas_link", "national_task_link", "link", "poi", "open_platform", "movie", "sticker");

    private C24792i() {
    }

    /* renamed from: a */
    public static final boolean m81332a(Aweme aweme) {
        return m81342b(aweme, false, 0, 6, null);
    }

    /* renamed from: b */
    public static final boolean m81339b(Aweme aweme) {
        return m81346c(aweme, false, 0, 6, null);
    }

    /* renamed from: c */
    public static final boolean m81344c(Aweme aweme) {
        return m81349d(aweme, false, 0, 6, null);
    }

    /* renamed from: d */
    public static final boolean m81347d(Aweme aweme) {
        return m81352e(aweme, false, 0, 6, null);
    }

    /* renamed from: e */
    public static final boolean m81350e(Aweme aweme) {
        return m81360h(aweme, false, 0);
    }

    /* renamed from: f */
    public static final boolean m81353f(Aweme aweme) {
        return m81365j(aweme, false, 0);
    }

    /* renamed from: g */
    public static final boolean m81356g(Aweme aweme) {
        return m81367k(aweme, false, 0);
    }

    /* renamed from: h */
    public static final boolean m81359h(Aweme aweme) {
        return m81368l(aweme, false, 0);
    }

    /* renamed from: a */
    public static final void m81331a(AwemeSettings awemeSettings) {
        if (!(awemeSettings == null || awemeSettings.adLinkPriority == null || awemeSettings.adLinkPriority.isEmpty())) {
            List<String> list = awemeSettings.adLinkPriority;
            C7573i.m23582a((Object) list, "it.adLinkPriority");
            f65290b = list;
        }
    }

    /* renamed from: i */
    public static final boolean m81362i(Aweme aweme) {
        StarAtlasLink starAtlasLink;
        if (aweme == null || C25352e.m83311V(aweme)) {
            return false;
        }
        LinkData a = C25268bg.m83039a(aweme);
        if (a != null && a.showOnFeed()) {
            return false;
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        NationalTaskLink nationalTaskLink = null;
        if (starAtlasInfo != null) {
            starAtlasLink = starAtlasInfo.getStarAtlasLink();
        } else {
            starAtlasLink = null;
        }
        if (starAtlasLink != null) {
            return false;
        }
        AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
        if (awemeNationalTask != null) {
            nationalTaskLink = awemeNationalTask.getNationalTaskLink();
        }
        if (nationalTaskLink != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m81333a(Aweme aweme, int i) {
        return m81337a("poi", aweme, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m81340b(Aweme aweme, int i) {
        return m81337a("shopping_cart", aweme, i);
    }

    /* renamed from: c */
    private static final String m81343c(Aweme aweme, int i) {
        CardStruct cardStruct = null;
        if (aweme == null) {
            return null;
        }
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                cardStruct = awemeRawAd.getDefaultCardInfo();
            }
            if (cardStruct != null) {
                return "ad_card";
            }
        }
        return m81369m(aweme, false, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m81363i(Aweme aweme, boolean z, int i) {
        return m81338a("shopping_cart", aweme, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m81365j(Aweme aweme, boolean z, int i) {
        return m81338a("dou+", aweme, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m81367k(Aweme aweme, boolean z, int i) {
        return m81338a("movie", aweme, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m81368l(Aweme aweme, boolean z, int i) {
        return m81338a("sticker", aweme, z, i);
    }

    /* renamed from: d */
    private static boolean m81348d(Aweme aweme, boolean z, int i) {
        return m81338a("star_atlas_link", aweme, z, i);
    }

    /* renamed from: e */
    private static boolean m81351e(Aweme aweme, boolean z, int i) {
        return m81338a("national_task_link", aweme, z, i);
    }

    /* renamed from: f */
    private static boolean m81354f(Aweme aweme, boolean z, int i) {
        return m81338a("iron_man", aweme, z, i);
    }

    /* renamed from: g */
    private static boolean m81357g(Aweme aweme, boolean z, int i) {
        return m81338a("poi", aweme, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m81360h(Aweme aweme, boolean z, int i) {
        return m81338a("open_platform", aweme, z, i);
    }

    /* renamed from: b */
    public static final boolean m81341b(Aweme aweme, boolean z, int i) {
        return m81338a("company_link", aweme, false, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m81345c(Aweme aweme, boolean z, int i) {
        if (m81338a("company_link", aweme, z, i) || m81338a("link", aweme, z, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m81335a(Aweme aweme, boolean z, int i) {
        return m81338a("link", aweme, false, 0);
    }

    /* renamed from: a */
    private static boolean m81337a(String str, Aweme aweme, int i) {
        return TextUtils.equals(str, m81343c(aweme, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0178, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0178, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0178 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String m81369m(com.p280ss.android.ugc.aweme.feed.model.Aweme r7, boolean r8, int r9) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.List<java.lang.String> r1 = f65290b
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 1
            r5 = 0
            switch(r3) {
                case -1890252483: goto L_0x016c;
                case -1648893033: goto L_0x0131;
                case -309942941: goto L_0x0121;
                case -261388249: goto L_0x0109;
                case -210508088: goto L_0x00dd;
                case 111178: goto L_0x00b6;
                case 3089441: goto L_0x00a8;
                case 3321850: goto L_0x0078;
                case 104087344: goto L_0x006a;
                case 711707451: goto L_0x0051;
                case 1429828220: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0178
        L_0x0021:
            java.lang.String r3 = "company_link"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.commercialize.model.LinkData r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg.m83039a(r7)
            if (r3 == 0) goto L_0x0038
            int r4 = r3.getLinkType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0039
        L_0x0038:
            r4 = r0
        L_0x0039:
            if (r4 != 0) goto L_0x003d
            goto L_0x0178
        L_0x003d:
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x0178
            if (r8 == 0) goto L_0x004c
            boolean r3 = r3.showOnComment()
        L_0x0049:
            r5 = r3
            goto L_0x0178
        L_0x004c:
            boolean r3 = r3.showOnFeed()
            goto L_0x0049
        L_0x0051:
            java.lang.String r3 = "star_atlas_link"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas r3 = r7.getStarAtlasInfo()
            if (r3 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.feed.model.StarAtlasLink r3 = r3.getStarAtlasLink()
            goto L_0x0065
        L_0x0064:
            r3 = r0
        L_0x0065:
            if (r3 == 0) goto L_0x0178
        L_0x0067:
            r5 = 1
            goto L_0x0178
        L_0x006a:
            java.lang.String r3 = "movie"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            boolean r5 = com.p280ss.android.ugc.aweme.movie.p1404c.C33651a.C33652a.m108591a(r7)
            goto L_0x0178
        L_0x0078:
            java.lang.String r3 = "link"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.commercialize.model.LinkData r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg.m83039a(r7)
            if (r3 == 0) goto L_0x008f
            int r6 = r3.getLinkType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0090
        L_0x008f:
            r6 = r0
        L_0x0090:
            if (r6 != 0) goto L_0x0094
            goto L_0x0178
        L_0x0094:
            int r6 = r6.intValue()
            if (r6 != r4) goto L_0x0178
            if (r3 == 0) goto L_0x0178
            if (r8 == 0) goto L_0x00a3
            boolean r3 = r3.showOnComment()
            goto L_0x0049
        L_0x00a3:
            boolean r3 = r3.showOnFeed()
            goto L_0x0049
        L_0x00a8:
            java.lang.String r3 = "dou+"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            boolean r5 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83311V(r7)
            goto L_0x0178
        L_0x00b6:
            java.lang.String r3 = "poi"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r7.getPoiStruct()
            if (r3 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.poi.service.IPoiService> r6 = com.p280ss.android.ugc.aweme.poi.service.IPoiService.class
            java.lang.Object r3 = r3.getService(r6)
            com.ss.android.ugc.aweme.poi.service.IPoiService r3 = (com.p280ss.android.ugc.aweme.poi.service.IPoiService) r3
            boolean r3 = r3.showPoiEntrance()
            if (r3 != 0) goto L_0x0067
        L_0x00d6:
            boolean r3 = com.p280ss.android.ugc.aweme.p1500r.p1501a.C37124b.m119338a(r7)
            if (r3 == 0) goto L_0x0178
            goto L_0x0067
        L_0x00dd:
            java.lang.String r3 = "open_platform"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            if (r8 != 0) goto L_0x0178
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct r3 = r7.getOpenPlatformStruct()
            if (r3 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData r3 = r3.getRawData()
            if (r3 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.opensdk.model.AnchorInfo r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = r3.getName()
            goto L_0x00ff
        L_0x00fe:
            r3 = r0
        L_0x00ff:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0178
            goto L_0x0067
        L_0x0109:
            java.lang.String r3 = "national_task_link"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.feed.model.AwemeNationalTask r3 = r7.getAwemeNationalTask()
            if (r3 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.feed.model.NationalTaskLink r3 = r3.getNationalTaskLink()
            goto L_0x011d
        L_0x011c:
            r3 = r0
        L_0x011d:
            if (r3 == 0) goto L_0x0178
            goto L_0x0067
        L_0x0121:
            java.lang.String r3 = "iron_man"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo r3 = r7.getMicroAppInfo()
            if (r3 == 0) goto L_0x0178
            goto L_0x0067
        L_0x0131:
            java.lang.String r3 = "shopping_cart"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            if (r8 == 0) goto L_0x0166
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion r3 = r7.getPromotion()
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.app.u r3 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r6 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r6)
            com.ss.android.ugc.aweme.app.bl r3 = r3.mo60042L()
            java.lang.String r6 = "CommonSharePrefCache.inst().enableShoppingTotal"
            kotlin.jvm.internal.C7573i.m23582a(r3, r6)
            java.lang.Object r3 = r3.mo59877d()
            java.lang.String r6 = "CommonSharePrefCache.ins…enableShoppingTotal.cache"
            kotlin.jvm.internal.C7573i.m23582a(r3, r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0178
            goto L_0x0067
        L_0x0166:
            boolean r4 = com.p280ss.android.ugc.aweme.commercialize.utils.C25243ap.m82983a(r7, r9)
            r5 = r4
            goto L_0x0178
        L_0x016c:
            java.lang.String r3 = "sticker"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0178
            boolean r5 = com.p280ss.android.ugc.aweme.feed.p1238ui.C28994s.m95220a(r7)
        L_0x0178:
            if (r5 == 0) goto L_0x000a
            return r2
        L_0x017b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.link.C24792i.m81369m(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m81338a(String str, Aweme aweme, boolean z, int i) {
        return TextUtils.equals(str, m81369m(aweme, z, i));
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m81346c(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m81351e(aweme, z, 0);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m81349d(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m81354f(aweme, z, 0);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m81352e(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m81357g(aweme, z, 0);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m81342b(Aweme aweme, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m81348d(aweme, z, 0);
    }
}
