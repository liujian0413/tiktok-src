package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.z */
public final class C25386z {

    /* renamed from: a */
    public static final C25386z f66807a;

    /* renamed from: b */
    private static List<String> f66808b = new ArrayList();

    /* renamed from: c */
    private static List<String> f66809c = new ArrayList();

    /* renamed from: d */
    private static String f66810d = "";

    /* renamed from: e */
    private static String f66811e;

    /* renamed from: f */
    private static final C22555a f66812f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.z$a */
    public static final class C25387a extends C22555a {

        /* renamed from: c */
        final /* synthetic */ C25386z f66813c;

        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl<Long> adSouthNorthFirstSupportTime = inst.getAdSouthNorthFirstSupportTime();
            C7573i.m23582a((Object) adSouthNorthFirstSupportTime, "SharePrefCache.inst().adSouthNorthFirstSupportTime");
            return adSouthNorthFirstSupportTime;
        }

        C25387a(C25386z zVar, int i) {
            this.f66813c = zVar;
            super(0);
        }
    }

    private C25386z() {
    }

    static {
        C25386z zVar = new C25386z();
        f66807a = zVar;
        f66812f = new C25387a(zVar, 0);
    }

    /* renamed from: a */
    private static String m83537a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (f66812f.mo59197b(currentTimeMillis)) {
            f66812f.mo59196a(currentTimeMillis);
            return null;
        }
        if (TextUtils.isEmpty(f66811e)) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl adSouthNorthFirstSupportTeam = inst.getAdSouthNorthFirstSupportTeam();
            C7573i.m23582a((Object) adSouthNorthFirstSupportTeam, "SharePrefCache.inst().adSouthNorthFirstSupportTeam");
            f66811e = (String) adSouthNorthFirstSupportTeam.mo59877d();
        }
        return f66811e;
    }

    /* renamed from: b */
    private static void m83540b(String str) {
        f66811e = str;
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl adSouthNorthFirstSupportTeam = inst.getAdSouthNorthFirstSupportTeam();
        C7573i.m23582a((Object) adSouthNorthFirstSupportTeam, "SharePrefCache.inst().adSouthNorthFirstSupportTeam");
        adSouthNorthFirstSupportTeam.mo59871a(str);
    }

    /* renamed from: a */
    public static boolean m83539a(String str) {
        if (C7525m.m23496a((Iterable<? extends T>) f66808b, str) || C7525m.m23496a((Iterable<? extends T>) f66809c, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static String m83541c(String str) {
        if (C7525m.m23496a((Iterable<? extends T>) f66808b, str)) {
            String str2 = f66810d;
            int hashCode = str2.hashCode();
            if (hashCode != 3317767) {
                if (hashCode == 108511772 && str2.equals("right")) {
                    return "south";
                }
            } else if (str2.equals("left")) {
                return "north";
            }
            return null;
        } else if (!C7525m.m23496a((Iterable<? extends T>) f66809c, str)) {
            return null;
        } else {
            String str3 = f66810d;
            int hashCode2 = str3.hashCode();
            if (hashCode2 != 3317767) {
                if (hashCode2 == 108511772 && str3.equals("right")) {
                    return "north";
                }
            } else if (str3.equals("left")) {
                return "south";
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void mo65948b(Context context, BusinessExtraData businessExtraData) {
        String str;
        C7573i.m23587b(context, "context");
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        if (m83539a(str)) {
            AdSouthNorthStickerPage.f66962i.mo66071b(context);
        }
    }

    /* renamed from: a */
    public final void mo65946a(Context context, BusinessExtraData businessExtraData) {
        String str;
        C7573i.m23587b(context, "context");
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        if (str != null) {
            String interactionUrl = businessExtraData.getInteractionUrl();
            if (interactionUrl != null) {
                String queryParameter = Uri.parse(interactionUrl).getQueryParameter("awe_region");
                if (queryParameter != null) {
                    int hashCode = queryParameter.hashCode();
                    if (hashCode != 105007365) {
                        if (hashCode == 109627853 && queryParameter.equals("south")) {
                            f66809c.add(str);
                        }
                    } else if (queryParameter.equals("north")) {
                        f66808b.add(str);
                    }
                }
                if (m83539a(str)) {
                    AdSouthNorthStickerPage.f66962i.mo66069a(interactionUrl, context);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m83538a(RectF rectF, float f, float f2) {
        String str;
        C7573i.m23587b(rectF, "rect");
        if (f < rectF.centerX()) {
            str = "left";
        } else {
            str = "right";
        }
        f66810d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65947a(com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r7, com.p280ss.android.ugc.aweme.sticker.C41850e r8, com.p280ss.android.ugc.aweme.feed.model.Aweme r9, android.content.Context r10) {
        /*
            r6 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            if (r7 == 0) goto L_0x000b
            java.lang.String r1 = r7.getStickerId()
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r2 = m83537a()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0022
            java.lang.String r1 = m83541c(r1)
            m83540b(r1)
        L_0x0022:
            java.lang.String r1 = r7.getInteractionUrl()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$a r1 = com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage.f66962i
            java.lang.String r2 = m83537a()
            boolean r1 = r1.mo66070a(r10, r2)
            if (r1 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.router.s r1 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r2 = r7.getInteractionUrl()
            r1.mo18682a(r2)
        L_0x0045:
            java.lang.String r1 = m83537a()
            if (r1 != 0) goto L_0x004c
            goto L_0x006f
        L_0x004c:
            int r2 = r1.hashCode()
            r3 = 105007365(0x6424905, float:3.654099E-35)
            if (r2 == r3) goto L_0x0065
            r3 = 109627853(0x688c9cd, float:5.1454034E-35)
            if (r2 == r3) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            java.lang.String r2 = "south"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006f
            r1 = 2
            goto L_0x0070
        L_0x0065:
            java.lang.String r2 = "north"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006f
            r1 = 1
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            java.lang.String r2 = "function_prop_label_click"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "prop_id"
            java.lang.String r5 = r7.getStickerId()
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "enter_from"
            if (r8 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.sticker.d r5 = r8.f108861n
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = r5.f108842b
            goto L_0x008c
        L_0x008b:
            r5 = r0
        L_0x008c:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "log_pb"
            if (r8 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.sticker.d r5 = r8.f108861n
            if (r5 == 0) goto L_0x009b
            java.lang.String r5 = r5.f108845e
            goto L_0x009c
        L_0x009b:
            r5 = r0
        L_0x009c:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "author_id"
            if (r8 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.sticker.d r5 = r8.f108861n
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = r5.f108843c
            goto L_0x00ac
        L_0x00ab:
            r5 = r0
        L_0x00ac:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "group_id"
            if (r8 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.sticker.d r8 = r8.f108861n
            if (r8 == 0) goto L_0x00ba
            java.lang.String r0 = r8.f108844d
        L_0x00ba:
            com.ss.android.ugc.aweme.app.g.d r8 = r3.mo59973a(r4, r0)
            java.lang.String r0 = "enter_method"
            java.lang.String r3 = r7.getInteractionUrl()
            java.lang.String r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130159a(r3)
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r3)
            java.lang.String r0 = "url"
            java.lang.String r7 = r7.getInteractionUrl()
            com.ss.android.ugc.aweme.app.g.d r7 = r8.mo59973a(r0, r7)
            java.lang.String r8 = "support_team"
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59970a(r8, r1)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r7)
            if (r9 == 0) goto L_0x00ee
            boolean r7 = r9.isAd()
            if (r7 == 0) goto L_0x00ee
            java.lang.String r7 = "sticker"
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82204e(r10, r9, r7)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25386z.mo65947a(com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData, com.ss.android.ugc.aweme.sticker.e, com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):void");
    }
}
