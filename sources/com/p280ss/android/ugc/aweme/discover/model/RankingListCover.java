package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commerce.service.models.DiscoveryTopGoods;
import com.p280ss.android.ugc.aweme.music.model.BrandBillboard;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RankingListCover */
public final class RankingListCover extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "top_brand")
    private BrandBillboard topBrand;
    @C6593c(mo15949a = "top_promotion")
    private DiscoveryTopGoods topGoods;
    @C6593c(mo15949a = "top_music")
    private Music topMusic;
    @C6593c(mo15949a = "top_star")
    private User topStar;

    public final BrandBillboard getTopBrand() {
        return this.topBrand;
    }

    public final DiscoveryTopGoods getTopGoods() {
        return this.topGoods;
    }

    public final Music getTopMusic() {
        return this.topMusic;
    }

    public final User getTopStar() {
        return this.topStar;
    }

    public final int hashCode() {
        int i;
        int i2;
        Music music = this.topMusic;
        int i3 = 0;
        if (music != null) {
            i = music.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        User user = this.topStar;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        DiscoveryTopGoods discoveryTopGoods = this.topGoods;
        if (discoveryTopGoods != null) {
            i3 = discoveryTopGoods.hashCode();
        }
        return i5 + i3;
    }

    public final void setTopBrand(BrandBillboard brandBillboard) {
        this.topBrand = brandBillboard;
    }

    public final void setTopGoods(DiscoveryTopGoods discoveryTopGoods) {
        this.topGoods = discoveryTopGoods;
    }

    public final void setTopMusic(Music music) {
        this.topMusic = music;
    }

    public final void setTopStar(User user) {
        this.topStar = user;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        if (this == obj) {
            return true;
        }
        Class cls = getClass();
        String str = null;
        if (obj != null) {
            obj2 = obj.getClass();
        } else {
            obj2 = null;
        }
        if (!C7573i.m23585a((Object) cls, obj2)) {
            return false;
        }
        if (obj != null) {
            Music music = this.topMusic;
            if (music != null) {
                obj3 = Long.valueOf(music.getId());
            } else {
                obj3 = null;
            }
            RankingListCover rankingListCover = (RankingListCover) obj;
            Music music2 = rankingListCover.topMusic;
            if (music2 != null) {
                obj4 = Long.valueOf(music2.getId());
            } else {
                obj4 = null;
            }
            if (!C7573i.m23585a(obj3, obj4)) {
                return false;
            }
            User user = this.topStar;
            if (user != null) {
                obj5 = user.getUid();
            } else {
                obj5 = null;
            }
            User user2 = rankingListCover.topStar;
            if (user2 != null) {
                obj6 = user2.getUid();
            } else {
                obj6 = null;
            }
            if (!C7573i.m23585a(obj5, obj6)) {
                return false;
            }
            DiscoveryTopGoods discoveryTopGoods = this.topGoods;
            if (discoveryTopGoods != null) {
                obj7 = discoveryTopGoods.getTitle();
            } else {
                obj7 = null;
            }
            DiscoveryTopGoods discoveryTopGoods2 = rankingListCover.topGoods;
            if (discoveryTopGoods2 != null) {
                str = discoveryTopGoods2.getTitle();
            }
            if (!C7573i.m23585a(obj7, (Object) str)) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.RankingListCover");
    }
}
