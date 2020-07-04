package com.p280ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.model.C25007p;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct;
import com.p280ss.android.ugc.aweme.discover.alading.C26554c;
import com.p280ss.android.ugc.aweme.discover.model.RelatedSearchWordItem;
import com.p280ss.android.ugc.aweme.discover.model.SearchCarBrandAladdin;
import com.p280ss.android.ugc.aweme.discover.model.SearchCarModelAladdin;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.p280ss.android.ugc.aweme.discover.model.SearchHomeStay;
import com.p280ss.android.ugc.aweme.discover.model.SearchMovie;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusicAladdin;
import com.p280ss.android.ugc.aweme.discover.model.SearchOperationInfo;
import com.p280ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.model.SearchXiGuaVideo;
import com.p280ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.newfollow.model.C34144a;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d */
public final class C26754d extends C34145b {
    @C6593c(mo15949a = "type")

    /* renamed from: A */
    private int f70524A;
    @C6593c(mo15949a = "aweme_info")

    /* renamed from: B */
    private Aweme f70525B;
    @C6593c(mo15949a = "comment_list")

    /* renamed from: C */
    private List<Comment> f70526C;

    /* renamed from: a */
    public String f70527a;
    @C6593c(mo15949a = "user_list")

    /* renamed from: b */
    public List<SearchUser> f70528b;
    @C6593c(mo15949a = "hotspot_info")

    /* renamed from: c */
    public C26554c f70529c;
    @C6593c(mo15949a = "music_list")

    /* renamed from: d */
    public List<Music> f70530d;
    @C6593c(mo15949a = "challenge_list")

    /* renamed from: e */
    public List<SearchChallenge> f70531e;
    @C6593c(mo15949a = "has_top_user")

    /* renamed from: f */
    public boolean f70532f;
    @C6593c(mo15949a = "article_list")

    /* renamed from: g */
    public List<C34144a> f70533g;
    @C6593c(mo15949a = "related_word_list")

    /* renamed from: h */
    public List<RelatedSearchWordItem> f70534h;
    @C6593c(mo15949a = "poi_info_list")

    /* renamed from: i */
    public List<SearchPoi> f70535i;
    @C6593c(mo15949a = "micro_app_info")

    /* renamed from: j */
    public C33460e f70536j;
    @C6593c(mo15949a = "goods_list")

    /* renamed from: k */
    public List<SearchCommodity> f70537k;
    @C6593c(mo15949a = "movie_info")

    /* renamed from: l */
    public SearchMovie f70538l;
    @C6593c(mo15949a = "car_brand")

    /* renamed from: m */
    public SearchCarBrandAladdin f70539m;
    @C6593c(mo15949a = "car_model")

    /* renamed from: n */
    public SearchCarModelAladdin f70540n;
    @C6593c(mo15949a = "music")

    /* renamed from: o */
    public SearchMusicAladdin f70541o;
    @C6593c(mo15949a = "activity_info")

    /* renamed from: p */
    public SearchOperationInfo f70542p;
    @C6593c(mo15949a = "has_more_goods")

    /* renamed from: q */
    public boolean f70543q;
    @C6593c(mo15949a = "xigua_video_list")

    /* renamed from: r */
    public List<SearchXiGuaVideo> f70544r;
    @C6593c(mo15949a = "hotel_info")

    /* renamed from: s */
    public SearchHomeStay f70545s;
    @C6593c(mo15949a = "aweme_mix_info")

    /* renamed from: t */
    public C26753c f70546t;
    @C6593c(mo15949a = "view_more")

    /* renamed from: u */
    public boolean f70547u = true;
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")

    /* renamed from: v */
    public SearchAdData f70548v;
    @C6593c(mo15949a = "ad_module_info")

    /* renamed from: w */
    public C25007p f70549w;
    @C6593c(mo15949a = "words_query_record")

    /* renamed from: x */
    public RecommendWordMob f70550x;
    @C6593c(mo15949a = "commerce_info")

    /* renamed from: y */
    public List<SearchCommerceInfoStruct> f70551y;

    /* renamed from: z */
    public LogPbBean f70552z;

    public final Aweme getAweme() {
        return this.f70525B;
    }

    public final boolean needUpdateComment() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo68495a() {
        if (this.f70524A == 1) {
            return true;
        }
        return false;
    }

    public final List<Comment> getCommentList() {
        if (this.f70526C == null || this.f70525B == null || !this.f70525B.getAwemeControl().canShowComment()) {
            this.f70526C = new ArrayList();
        }
        return this.f70526C;
    }

    public final int getFeedType() {
        int i = this.f70524A;
        if (i == Integer.MAX_VALUE) {
            return 65462;
        }
        switch (i) {
            case 1:
                return 65280;
            case 2:
                return 65456;
            case 3:
                return 65457;
            case 4:
                return 65458;
            case 5:
                return 65285;
            case 6:
                return 65459;
            case 7:
                return 65460;
            case 8:
                return 65461;
            case 9:
                return 65463;
            case 10:
                return 65464;
            case 11:
                return 65466;
            case 12:
                return 65467;
            case 13:
                return 65468;
            case 14:
                return 65469;
            case 15:
                return 65471;
            case 16:
                return 65470;
            default:
                switch (i) {
                    case 19:
                        return 65472;
                    case 20:
                        return 65504;
                    case 21:
                        return 65505;
                    case 22:
                        return 65506;
                    default:
                        return this.f70524A;
                }
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f70524A * 31;
        int i17 = 0;
        if (this.f70525B != null) {
            i = this.f70525B.hashCode();
        } else {
            i = 0;
        }
        int i18 = (i16 + i) * 31;
        if (this.f70528b != null) {
            i2 = this.f70528b.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (i18 + i2) * 31;
        if (this.f70530d != null) {
            i3 = this.f70530d.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 31;
        if (this.f70531e != null) {
            i4 = this.f70531e.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 31;
        if (this.f70533g != null) {
            i5 = this.f70533g.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 31;
        if (this.f70534h != null) {
            i6 = this.f70534h.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 31;
        if (this.f70535i != null) {
            i7 = this.f70535i.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 31;
        if (this.f70536j != null) {
            i8 = this.f70536j.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 31;
        if (this.f70537k != null) {
            i9 = this.f70537k.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 31;
        if (this.f70538l != null) {
            i10 = this.f70538l.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 31;
        if (this.f70544r != null) {
            i11 = this.f70544r.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 31;
        if (this.f70548v != null) {
            i12 = this.f70548v.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 31;
        if (this.f70551y != null) {
            i13 = this.f70551y.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 31;
        if (this.f70551y != null) {
            i14 = this.f70551y.hashCode();
        } else {
            i14 = 0;
        }
        int i31 = (i30 + i14) * 31;
        if (this.f70539m != null) {
            i15 = this.f70539m.hashCode();
        } else {
            i15 = 0;
        }
        int i32 = (i31 + i15) * 31;
        if (this.f70540n != null) {
            i17 = this.f70540n.hashCode();
        }
        return i32 + i17;
    }

    public final void setAweme(Aweme aweme) {
        this.f70525B = aweme;
    }

    public final void setCommentList(List<Comment> list) {
        this.f70526C = list;
    }

    public final void setFeedType(int i) {
        this.f70524A = i;
    }

    /* renamed from: a */
    public final void mo68494a(String str) {
        if (this.f70535i != null) {
            for (SearchPoi searchPoi : this.f70535i) {
                searchPoi.logPb = str;
            }
        }
    }

    public final void setRequestId(String str) {
        super.setRequestId(str);
        if (this.f70525B != null) {
            this.f70525B.setRequestId(str);
        }
        if (!C6307b.m19566a((Collection<T>) this.f70533g)) {
            for (C34144a aVar : this.f70533g) {
                if (aVar != null) {
                    aVar.f88972a = str;
                }
            }
        }
        if (this.f70538l != null && this.f70538l.getAweme() != null) {
            this.f70538l.getAweme().setRequestId(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26754d)) {
            return false;
        }
        C26754d dVar = (C26754d) obj;
        if (this.f70524A == dVar.f70524A && C23480h.m77087a(this.f70525B, dVar.f70525B) && C23480h.m77087a(this.f70528b, dVar.f70528b) && C23480h.m77087a(this.f70530d, dVar.f70530d) && C23480h.m77087a(this.f70531e, dVar.f70531e) && C23480h.m77087a(this.f70533g, dVar.f70533g) && C23480h.m77087a(this.f70534h, dVar.f70534h) && C23480h.m77087a(this.f70535i, dVar.f70535i) && C23480h.m77087a(this.f70536j, dVar.f70536j) && C23480h.m77087a(this.f70537k, dVar.f70537k) && C23480h.m77087a(this.f70538l, dVar.f70538l) && C23480h.m77087a(this.f70544r, dVar.f70544r) && C23480h.m77087a(this.f70551y, dVar.f70551y) && C23480h.m77087a(this.f70539m, dVar.f70539m) && C23480h.m77087a(this.f70540n, dVar.f70540n)) {
            return C23480h.m77087a(this.f70548v, dVar.f70548v);
        }
        return false;
    }
}
