package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vast.model.Icon;
import com.p280ss.android.ugc.aweme.commercialize.model.OmVast;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bx */
public final class C25300bx {

    /* renamed from: a */
    public static final C25300bx f66661a = new C25300bx();

    private C25300bx() {
    }

    /* renamed from: a */
    public static final boolean m83124a(Aweme aweme) {
        return m83125a(aweme, 3);
    }

    /* renamed from: c */
    public static final Icon m83130c(Aweme aweme) {
        return m83123a(aweme, "AdChoices");
    }

    /* renamed from: d */
    public static final Icon m83131d(Aweme aweme) {
        return m83123a(aweme, "icon");
    }

    /* renamed from: b */
    public static final boolean m83128b(Aweme aweme) {
        if (!m83127a(aweme, false) || !m83125a(aweme, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m83125a(Aweme aweme, int i) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m83127a(Aweme aweme, boolean z) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.loaded == z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m83129b(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  
    EDGE_INSN: B:22:0x004e->B:19:0x004e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.bytedance.vast.model.Icon m83123a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.commercialize.model.OmVast r3 = r3.getOmVast()
            if (r3 == 0) goto L_0x0017
            com.bytedance.vast.model.Vast r3 = r3.vast
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            if (r3 == 0) goto L_0x0030
            java.util.List<com.bytedance.vast.model.Creative> r3 = r3.creativeList
            if (r3 == 0) goto L_0x0030
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.sequences.g r3 = kotlin.collections.C7525m.m23526p(r3)
            com.ss.android.ugc.aweme.commercialize.utils.VastBaseUtils$getIcon$$inlined$flatMapCreative$1 r1 = new com.ss.android.ugc.aweme.commercialize.utils.VastBaseUtils$getIcon$$inlined$flatMapCreative$1
            r1.<init>()
            kotlin.jvm.a.b r1 = (kotlin.jvm.p357a.C7562b) r1
            kotlin.sequences.g r3 = kotlin.sequences.C7605h.m23657c(r3, r1)
            goto L_0x0034
        L_0x0030:
            kotlin.sequences.g r3 = kotlin.sequences.C7605h.m23635a()
        L_0x0034:
            java.util.Iterator r3 = r3.mo19416a()
        L_0x0038:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r3.next()
            r2 = r1
            com.bytedance.vast.model.Icon r2 = (com.bytedance.vast.model.Icon) r2
            java.lang.String r2 = r2.program
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r4)
            if (r2 == 0) goto L_0x0038
            r0 = r1
        L_0x004e:
            com.bytedance.vast.model.Icon r0 = (com.bytedance.vast.model.Icon) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx.m83123a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.bytedance.vast.model.Icon");
    }

    /* renamed from: a */
    public static final boolean m83126a(Aweme aweme, SmartImageView smartImageView) {
        String str;
        Object obj;
        boolean z;
        if (!m83125a(aweme, 3)) {
            return false;
        }
        Icon d = m83131d(aweme);
        if (d == null) {
            return false;
        }
        Set<String> set = d.staticResource;
        if (set != null) {
            Iterator it = set.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str2 = (String) obj;
                C7573i.m23582a((Object) str2, "it");
                if (str2.length() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            String str3 = (String) obj;
            if (str3 != null) {
                C12133n.m35301a(str3).mo29844a((C12128i) smartImageView).mo29848a();
                if (C7163a.m22363a()) {
                    StringBuilder sb = new StringBuilder("bind avatar: desc=");
                    if (aweme != null) {
                        str = aweme.getDesc();
                    }
                    sb.append(str);
                    sb.append(" avatar=");
                    sb.append(str3);
                }
                return true;
            }
        }
        return false;
    }
}
