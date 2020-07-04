package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.C2342e;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;

public class RoomStats implements C2342e {
    final int INT_31 = 31;
    final int INT_32 = 32;
    @C6593c(mo15949a = "dou_plus_promotion")
    String douPlusPromotion;
    @C6593c(mo15949a = "enter_count")
    int enterCount;
    @C6593c(mo15949a = "follow_count")
    int followCount;
    @C6593c(mo15949a = "gift_uv_count")
    int giftUVCount;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    long f7713id;
    @C6593c(mo15949a = "id_str")
    String idStr;
    @C6593c(mo15949a = "money")
    long money;
    @C6593c(mo15949a = "fan_ticket")
    long ticket;
    @C6593c(mo15949a = "total_user")
    int totalUser;
    @C6593c(mo15949a = "user_count_composition")
    public C2349a userComposition;
    @C6593c(mo15949a = "watermelon")
    int watermelon;

    /* renamed from: com.bytedance.android.live.base.model.live.RoomStats$a */
    public static class C2349a {
        @C6593c(mo15949a = "city")

        /* renamed from: a */
        public double f7714a;
        @C6593c(mo15949a = "video_detail")

        /* renamed from: b */
        public double f7715b;
        @C6593c(mo15949a = "my_follow")

        /* renamed from: c */
        public double f7716c;
        @C6593c(mo15949a = "other")

        /* renamed from: d */
        public double f7717d;
    }

    public String getDouPlusPromotion() {
        return this.douPlusPromotion;
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    public int getFollowCount() {
        return this.followCount;
    }

    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    public long getId() {
        return this.f7713id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public long getMoney() {
        return this.money;
    }

    public long getTicket() {
        return this.ticket;
    }

    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public int hashCode() {
        int i;
        int i2 = ((((((((((((int) (this.f7713id ^ (this.f7713id >>> 32))) * 31) + ((int) (this.ticket ^ (this.ticket >>> 32)))) * 31) + ((int) (this.money ^ (this.money >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        if (this.idStr != null) {
            i = this.idStr.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void setDouPlusPromotion(String str) {
        this.douPlusPromotion = str;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.f7713id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setMoney(long j) {
        this.money = j;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }

    public static RoomStats from(C2342e eVar) {
        if (eVar == null) {
            return null;
        }
        if (eVar instanceof RoomStats) {
            C6600e a = C2317a.m9932a();
            return (RoomStats) a.mo15974a(a.mo15979b((Object) eVar), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(eVar);
        return roomStats;
    }

    private void initWith(C2342e eVar) {
        this.f7713id = eVar.getId();
        this.ticket = eVar.getTicket();
        this.money = eVar.getMoney();
        this.totalUser = eVar.getTotalUser();
        this.followCount = eVar.getFollowCount();
        this.giftUVCount = eVar.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomStats roomStats = (RoomStats) obj;
        if (this.f7713id != roomStats.f7713id || this.ticket != roomStats.ticket || this.money != roomStats.money || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
            return false;
        }
        if (this.idStr == null ? roomStats.idStr != null : !this.idStr.equals(roomStats.idStr)) {
            return false;
        }
        if (this.totalUser == roomStats.totalUser) {
            return true;
        }
        return false;
    }
}
