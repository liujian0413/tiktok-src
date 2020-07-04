package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.l */
public final class C27709l extends BaseResponse {

    /* renamed from: l */
    public static final C27710a f73054l = new C27710a(null);
    @C6593c(mo15949a = "poi_collection")

    /* renamed from: a */
    public final C27695a<C27702g> f73055a;
    @C6593c(mo15949a = "aweme_collection")

    /* renamed from: b */
    public final C27695a<Aweme> f73056b;
    @C6593c(mo15949a = "music_collection")

    /* renamed from: c */
    public final C27695a<Music> f73057c;
    @C6593c(mo15949a = "challenge_collection")

    /* renamed from: d */
    public final C27695a<Challenge> f73058d;
    @C6593c(mo15949a = "sticker_collection")

    /* renamed from: e */
    public final C27695a<NewFaceStickerBean> f73059e;
    @C6593c(mo15949a = "willing_collection")

    /* renamed from: f */
    public final C27695a<C27711m> f73060f;
    @C6593c(mo15949a = "mix_collection")

    /* renamed from: g */
    public final C27695a<MixStruct> f73061g;
    @C6593c(mo15949a = "micro_app_collection")

    /* renamed from: h */
    public final C27695a<C33460e> f73062h;
    @C6593c(mo15949a = "anchor_medium_collection")

    /* renamed from: i */
    public final C27695a<C27699d> f73063i;
    @C6593c(mo15949a = "count")

    /* renamed from: j */
    public final long f73064j;
    @C6593c(mo15949a = "collection_tabs")

    /* renamed from: k */
    public final List<C27697b> f73065k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.a.l$a */
    public static final class C27710a {
        private C27710a() {
        }

        public /* synthetic */ C27710a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27709l) {
                C27709l lVar = (C27709l) obj;
                if (C7573i.m23585a((Object) this.f73055a, (Object) lVar.f73055a) && C7573i.m23585a((Object) this.f73056b, (Object) lVar.f73056b) && C7573i.m23585a((Object) this.f73057c, (Object) lVar.f73057c) && C7573i.m23585a((Object) this.f73058d, (Object) lVar.f73058d) && C7573i.m23585a((Object) this.f73059e, (Object) lVar.f73059e) && C7573i.m23585a((Object) this.f73060f, (Object) lVar.f73060f) && C7573i.m23585a((Object) this.f73061g, (Object) lVar.f73061g) && C7573i.m23585a((Object) this.f73062h, (Object) lVar.f73062h) && C7573i.m23585a((Object) this.f73063i, (Object) lVar.f73063i)) {
                    if (!(this.f73064j == lVar.f73064j) || !C7573i.m23585a((Object) this.f73065k, (Object) lVar.f73065k)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C27695a<C27702g> aVar = this.f73055a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C27695a<Aweme> aVar2 = this.f73056b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C27695a<Music> aVar3 = this.f73057c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C27695a<Challenge> aVar4 = this.f73058d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        C27695a<NewFaceStickerBean> aVar5 = this.f73059e;
        int hashCode5 = (hashCode4 + (aVar5 != null ? aVar5.hashCode() : 0)) * 31;
        C27695a<C27711m> aVar6 = this.f73060f;
        int hashCode6 = (hashCode5 + (aVar6 != null ? aVar6.hashCode() : 0)) * 31;
        C27695a<MixStruct> aVar7 = this.f73061g;
        int hashCode7 = (hashCode6 + (aVar7 != null ? aVar7.hashCode() : 0)) * 31;
        C27695a<C33460e> aVar8 = this.f73062h;
        int hashCode8 = (hashCode7 + (aVar8 != null ? aVar8.hashCode() : 0)) * 31;
        C27695a<C27699d> aVar9 = this.f73063i;
        int hashCode9 = (((hashCode8 + (aVar9 != null ? aVar9.hashCode() : 0)) * 31) + Long.hashCode(this.f73064j)) * 31;
        List<C27697b> list = this.f73065k;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserCollectionResponse(poiCollectionStruct=");
        sb.append(this.f73055a);
        sb.append(", awemeCollectionStruct=");
        sb.append(this.f73056b);
        sb.append(", musicCollectionStruct=");
        sb.append(this.f73057c);
        sb.append(", challengeCollectionStruct=");
        sb.append(this.f73058d);
        sb.append(", stickerCollectionStruct=");
        sb.append(this.f73059e);
        sb.append(", willingCollectionStruct=");
        sb.append(this.f73060f);
        sb.append(", mixCollectionStruct=");
        sb.append(this.f73061g);
        sb.append(", microAppCollectionStruct=");
        sb.append(this.f73062h);
        sb.append(", anchorMediumCollectionStruct=");
        sb.append(this.f73063i);
        sb.append(", count=");
        sb.append(this.f73064j);
        sb.append(", collectionTabs=");
        sb.append(this.f73065k);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final C27695a<?> mo71169a(int i) {
        switch (i) {
            case 1:
                return this.f73057c;
            case 2:
                return this.f73056b;
            case 3:
                return this.f73058d;
            case 4:
                return this.f73055a;
            case 5:
                return this.f73059e;
            case 6:
                return this.f73060f;
            case 7:
                return this.f73061g;
            case 8:
                return this.f73062h;
            case 9:
                return this.f73063i;
            default:
                return null;
        }
    }
}
