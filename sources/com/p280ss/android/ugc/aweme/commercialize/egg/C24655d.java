package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24653c.C24654a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.EditHint;
import com.p280ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p280ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import com.p280ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.d */
public final class C24655d {

    /* renamed from: a */
    public static C24641b f65013a;

    /* renamed from: b */
    public static List<C24641b> f65014b;

    /* renamed from: c */
    public static List<? extends EditHint> f65015c;

    /* renamed from: d */
    public static boolean f65016d;

    /* renamed from: e */
    public static boolean f65017e;

    /* renamed from: f */
    public static final C24655d f65018f = new C24655d();

    private C24655d() {
    }

    /* renamed from: a */
    public static final void m80819a(Aweme aweme) {
        List<? extends EditHint> list;
        if (aweme != null) {
            ItemCommentEggGroup commentEggGroup = aweme.getCommentEggGroup();
            if (commentEggGroup != null) {
                list = commentEggGroup.getEditintist();
                f65015c = list;
            }
        }
        list = null;
        f65015c = list;
    }

    /* renamed from: b */
    public static final String m80822b(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        List<? extends EditHint> list = f65015c;
        if (list == null) {
            return null;
        }
        for (EditHint editHint : list) {
            if (TextUtils.equals(charSequence, editHint.getLanguage())) {
                return editHint.getHint();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C24641b m80818a(String str) {
        List<C24641b> list = f65014b;
        if (list == null || str == null) {
            return null;
        }
        for (C24641b bVar : list) {
            C24635a aVar = bVar.f64977c;
            if (aVar != null) {
                String str2 = aVar.f64960b;
                if (str2 != null) {
                    if (new Regex(str2).matches(str)) {
                        return bVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m80820a(ItemCommentEggData itemCommentEggData) {
        if (itemCommentEggData == null) {
            return false;
        }
        String[] strArr = {itemCommentEggData.getEggId(), itemCommentEggData.getFileType(), itemCommentEggData.getMaterialUrl(), itemCommentEggData.getRegex()};
        for (int i = 0; i < 4; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m80821a(ItemLikeEggData itemLikeEggData) {
        if (itemLikeEggData != null && !TextUtils.isEmpty(itemLikeEggData.getFileType()) && !TextUtils.isEmpty(itemLikeEggData.getMaterialUrl())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r2 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == null) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b m80816a(com.p280ss.android.ugc.aweme.feed.model.Aweme r2, java.lang.String r3) {
        /*
            com.ss.android.ugc.aweme.commercialize.egg.a.c r0 = new com.ss.android.ugc.aweme.commercialize.egg.a.c
            r0.<init>()
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = r2.getAid()
            if (r1 != 0) goto L_0x000f
        L_0x000d:
            java.lang.String r1 = ""
        L_0x000f:
            r0.mo64508a(r1)
            if (r2 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x0020
            java.lang.String r2 = r2.getUid()
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r2 = ""
        L_0x0022:
            r0.mo64509b(r2)
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = ""
        L_0x0029:
            r0.mo64510c(r3)
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = (com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.C24655d.m80816a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.ss.android.ugc.aweme.commercialize.egg.a.b");
    }

    /* renamed from: b */
    public static final void m80823b(Aweme aweme, boolean z) {
        String str;
        String str2;
        if (aweme != null) {
            ItemCommentEggGroup commentEggGroup = aweme.getCommentEggGroup();
            if (commentEggGroup != null) {
                List<ItemCommentEggData> commentEggData = commentEggGroup.getCommentEggData();
                if (commentEggData != null) {
                    String str3 = "comment";
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        str = awemeRawAd.getCreativeIdStr();
                    } else {
                        str = null;
                    }
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        str2 = awemeRawAd2.getLogExtra();
                    } else {
                        str2 = null;
                    }
                    C24657f fVar = new C24657f(str3, str, str2, aweme.getAid(), null, 16, null);
                    ArrayList arrayList = new ArrayList();
                    for (ItemCommentEggData itemCommentEggData : commentEggData) {
                        if (m80820a(itemCommentEggData)) {
                            C24641b a = C24654a.m80813a(itemCommentEggData, true, fVar);
                            if (a != null) {
                                arrayList.add(a);
                                C24659h.m80825a(a);
                            }
                        }
                    }
                    f65014b = arrayList;
                }
            }
        }
    }

    /* renamed from: a */
    public static final C24641b m80817a(Aweme aweme, boolean z) {
        String str;
        String str2;
        if (aweme != null && m80821a(aweme.getCommerceAdLikeDigg())) {
            String str3 = "like";
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getLogExtra();
            } else {
                str2 = null;
            }
            C24657f fVar = new C24657f(str3, str, str2, aweme.getAid(), null, 16, null);
            C24641b a = C24654a.m80814a(aweme.getCommerceAdLikeDigg(), true, fVar);
            if (a != null) {
                C24659h.m80825a(a);
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r3 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b m80815a(com.p280ss.android.ugc.aweme.feed.model.Aweme r2, com.p280ss.android.ugc.aweme.commercialize.egg.C24641b r3, java.lang.String r4, java.lang.String r5) {
        /*
            com.ss.android.ugc.aweme.commercialize.egg.a.a r0 = new com.ss.android.ugc.aweme.commercialize.egg.a.a
            r0.<init>()
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.commercialize.egg.a r3 = r3.f64977c
            if (r3 == 0) goto L_0x0026
            java.lang.String r1 = r3.f64959a
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = ""
        L_0x0011:
            r0.mo64501a(r1)
            java.lang.String r1 = r3.f64961c
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = ""
        L_0x001a:
            r0.mo64503c(r1)
            java.lang.String r3 = r3.f64962d
            if (r3 != 0) goto L_0x0023
            java.lang.String r3 = ""
        L_0x0023:
            r0.mo64504d(r3)
        L_0x0026:
            if (r4 != 0) goto L_0x002a
            java.lang.String r4 = ""
        L_0x002a:
            r0.mo64502b(r4)
            if (r2 == 0) goto L_0x0035
            java.lang.String r3 = r2.getAid()
            if (r3 != 0) goto L_0x0037
        L_0x0035:
            java.lang.String r3 = ""
        L_0x0037:
            r0.mo64505e(r3)
            if (r2 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.getUid()
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r2 = ""
        L_0x004a:
            r0.mo64506f(r2)
            if (r5 != 0) goto L_0x0051
            java.lang.String r5 = ""
        L_0x0051:
            r0.mo64507g(r5)
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = (com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.C24655d.m80815a(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.egg.b, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.commercialize.egg.a.b");
    }
}
