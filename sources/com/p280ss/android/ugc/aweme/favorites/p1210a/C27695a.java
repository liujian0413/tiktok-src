package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.commerce.WillingListItemSeed;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.a */
public final class C27695a<T> {

    /* renamed from: c */
    public static final C27696a f73002c = new C27696a(null);
    @C6593c(mo15949a = "count")

    /* renamed from: a */
    public final long f73003a;
    @C6593c(mo15949a = "mix_list", mo15950b = {"willing_list", "sticker_list", "challenge_list", "music_list", "aweme_list", "poi_collect_list", "micro_app_list", "anchor_medium_list"})

    /* renamed from: b */
    public final List<T> f73004b;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.a$a */
    public static final class C27696a {
        private C27696a() {
        }

        public /* synthetic */ C27696a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27695a) {
                C27695a aVar = (C27695a) obj;
                if (!(this.f73003a == aVar.f73003a) || !C7573i.m23585a((Object) this.f73004b, (Object) aVar.f73004b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f73003a) * 31;
        List<T> list = this.f73004b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionStruct(count=");
        sb.append(this.f73003a);
        sb.append(", items=");
        sb.append(this.f73004b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m90855a(C27711m mVar) {
        boolean z;
        Integer num = mVar.f73076k;
        if (num != null && num.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mVar = null;
        }
        if (mVar != null) {
            WillingListItemSeed willingListItemSeed = mVar.f73077l;
            if (willingListItemSeed != null) {
                mVar.mo71175c(willingListItemSeed.getTitle());
                mVar.mo71172a(willingListItemSeed.getCover());
                mVar.f73074i = willingListItemSeed.getUrl();
                mVar.mo71174b(willingListItemSeed.getSeedId());
                mVar.mo71173a(willingListItemSeed.getSeedId());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j mo71145a(java.lang.String r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            java.lang.String r1 = "title"
            r3 = r15
            kotlin.jvm.internal.C7573i.m23587b(r15, r1)
            java.util.List<T> r1 = r0.f73004b
            r2 = 0
            if (r1 != 0) goto L_0x000d
            return r2
        L_0x000d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            java.util.List<T> r1 = r0.f73004b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01e0
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.music.model.Music
            if (r5 == 0) goto L_0x00bc
            r5 = r4
            com.ss.android.ugc.aweme.music.model.Music r5 = (com.p280ss.android.ugc.aweme.music.model.Music) r5
            long r11 = r5.getId()
            java.lang.String r7 = java.lang.String.valueOf(r11)
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverMedium()
            if (r7 == 0) goto L_0x0072
            java.util.List r7 = r7.getUrlList()
            if (r7 == 0) goto L_0x0072
            java.lang.Object r7 = kotlin.collections.C7525m.m23513g(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverMedium()
            boolean r7 = r6.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0094
        L_0x0072:
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverThumb()
            if (r7 == 0) goto L_0x0093
            java.util.List r7 = r7.getUrlList()
            if (r7 == 0) goto L_0x0093
            java.lang.Object r7 = kotlin.collections.C7525m.m23513g(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverThumb()
            boolean r7 = r6.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0094
        L_0x0093:
            r7 = r2
        L_0x0094:
            if (r7 == 0) goto L_0x009a
            r7.booleanValue()
            goto L_0x00b0
        L_0x009a:
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverLarge()
            if (r7 == 0) goto L_0x00a9
            java.util.List r7 = r7.getUrlList()
            if (r7 == 0) goto L_0x00a9
            kotlin.collections.C7525m.m23513g(r7)
        L_0x00a9:
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverLarge()
            r6.add(r7)
        L_0x00b0:
            java.lang.String r5 = r5.getMusicName()
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x00bc:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.feed.model.Aweme
            if (r5 == 0) goto L_0x00fb
            r5 = r4
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r5
            java.lang.String r7 = r5.getAid()
            r8.add(r7)
            com.ss.android.ugc.aweme.feed.model.Video r7 = r5.getVideo()
            if (r7 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.getCover()
            if (r7 == 0) goto L_0x00da
            r6.add(r7)
            goto L_0x00f1
        L_0x00da:
            java.util.List r5 = r5.getImageInfos()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = kotlin.collections.C7525m.m23513g(r5)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r5 = (com.p280ss.android.ugc.aweme.feed.model.ImageInfo) r5
            if (r5 == 0) goto L_0x00ed
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getLabelThumb()
            goto L_0x00ee
        L_0x00ed:
            r5 = r2
        L_0x00ee:
            r6.add(r5)
        L_0x00f1:
            java.lang.String r5 = ""
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x00fb:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.discover.model.Challenge
            if (r5 == 0) goto L_0x011c
            r5 = r4
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = (com.p280ss.android.ugc.aweme.discover.model.Challenge) r5
            java.lang.String r7 = r5.getCid()
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.getCoverItem()
            r6.add(r7)
            java.lang.String r5 = r5.getChallengeName()
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x011c:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g
            if (r5 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.favorites.a.g r4 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g) r4
            java.lang.String r5 = r4.mo71156a()
            r8.add(r5)
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r4.mo71158c()
            r6.add(r5)
            java.lang.String r5 = r4.mo71157b()
            r9.add(r5)
            java.lang.Object r4 = r4.mo71159d()
            r10.add(r4)
            goto L_0x0035
        L_0x0140:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean
            if (r5 == 0) goto L_0x015b
            r5 = r4
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r5 = (com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean) r5
            java.lang.String r7 = r5.f108868id
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.iconUrl
            r6.add(r7)
            java.lang.String r5 = r5.name
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x015b:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.favorites.p1210a.C27711m
            if (r5 == 0) goto L_0x0179
            r5 = r4
            com.ss.android.ugc.aweme.favorites.a.m r5 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27711m) r5
            m90855a(r5)
            java.lang.String r7 = r5.f73067b
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.f73070e
            r6.add(r7)
            java.lang.String r5 = r5.f73069d
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x0179:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.feed.model.MixStruct
            if (r5 == 0) goto L_0x0194
            r5 = r4
            com.ss.android.ugc.aweme.feed.model.MixStruct r5 = (com.p280ss.android.ugc.aweme.feed.model.MixStruct) r5
            java.lang.String r7 = r5.mixId
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.cover
            r6.add(r7)
            java.lang.String r5 = r5.mixName
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x0194:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e
            if (r5 == 0) goto L_0x01c5
            r5 = r4
            com.ss.android.ugc.aweme.miniapp_api.model.e r5 = (com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e) r5
            java.lang.String r7 = r5.f87343a
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r7.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
            r7.setUrlList(r11)
            java.util.List r11 = r7.getUrlList()
            java.lang.String r12 = r5.f87345c
            r11.add(r12)
            r6.add(r7)
            java.lang.String r5 = r5.f87344b
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x01c5:
            boolean r5 = r4 instanceof com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d
            if (r5 == 0) goto L_0x0035
            r5 = r4
            com.ss.android.ugc.aweme.favorites.a.d r5 = (com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d) r5
            java.lang.String r7 = r5.f73013a
            r8.add(r7)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r5.f73020h
            r6.add(r7)
            java.lang.String r5 = r5.f73014b
            r9.add(r5)
            r10.add(r4)
            goto L_0x0035
        L_0x01e0:
            com.ss.android.ugc.aweme.favorites.a.j r1 = new com.ss.android.ugc.aweme.favorites.a.j
            long r4 = r0.f73003a
            r11 = 0
            r12 = 128(0x80, float:1.794E-43)
            r13 = 0
            r2 = r1
            r3 = r15
            r7 = r16
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.p1210a.C27695a.mo71145a(java.lang.String, int):com.ss.android.ugc.aweme.favorites.a.j");
    }
}
