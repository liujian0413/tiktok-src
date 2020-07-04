package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceUser */
public final class CommerceUser implements Serializable {
    private UrlModel avatarMedium;
    private String bindPhone;
    private Integer followStatus;
    private boolean isHasOrders;
    private String nickname;
    private String shopMicroApp;
    private String uid;
    private int verifyStatus;
    private boolean withCommerceNewbieTask;
    private boolean withCommerceRights;
    private boolean withItemCommerceEntry;
    private boolean withNewGoods;
    private boolean withShopEntry;

    public static /* synthetic */ CommerceUser copy$default(CommerceUser commerceUser, UrlModel urlModel, String str, String str2, int i, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, Integer num, int i2, Object obj) {
        CommerceUser commerceUser2 = commerceUser;
        int i3 = i2;
        return commerceUser.copy((i3 & 1) != 0 ? commerceUser2.avatarMedium : urlModel, (i3 & 2) != 0 ? commerceUser2.uid : str, (i3 & 4) != 0 ? commerceUser2.nickname : str2, (i3 & 8) != 0 ? commerceUser2.verifyStatus : i, (i3 & 16) != 0 ? commerceUser2.isHasOrders : z, (i3 & 32) != 0 ? commerceUser2.bindPhone : str3, (i3 & 64) != 0 ? commerceUser2.withCommerceRights : z2, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? commerceUser2.withShopEntry : z3, (i3 & 256) != 0 ? commerceUser2.withNewGoods : z4, (i3 & 512) != 0 ? commerceUser2.withCommerceNewbieTask : z5, (i3 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? commerceUser2.withItemCommerceEntry : z6, (i3 & 2048) != 0 ? commerceUser2.shopMicroApp : str4, (i3 & 4096) != 0 ? commerceUser2.followStatus : num);
    }

    public final UrlModel component1() {
        return this.avatarMedium;
    }

    public final boolean component10() {
        return this.withCommerceNewbieTask;
    }

    public final boolean component11() {
        return this.withItemCommerceEntry;
    }

    public final String component12() {
        return this.shopMicroApp;
    }

    public final Integer component13() {
        return this.followStatus;
    }

    public final String component2() {
        return this.uid;
    }

    public final String component3() {
        return this.nickname;
    }

    public final int component4() {
        return this.verifyStatus;
    }

    public final boolean component5() {
        return this.isHasOrders;
    }

    public final String component6() {
        return this.bindPhone;
    }

    public final boolean component7() {
        return this.withCommerceRights;
    }

    public final boolean component8() {
        return this.withShopEntry;
    }

    public final boolean component9() {
        return this.withNewGoods;
    }

    public final CommerceUser copy(UrlModel urlModel, String str, String str2, int i, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, Integer num) {
        String str5 = str;
        C7573i.m23587b(str5, "uid");
        CommerceUser commerceUser = new CommerceUser(urlModel, str5, str2, i, z, str3, z2, z3, z4, z5, z6, str4, num);
        return commerceUser;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceUser) {
                CommerceUser commerceUser = (CommerceUser) obj;
                if (C7573i.m23585a((Object) this.avatarMedium, (Object) commerceUser.avatarMedium) && C7573i.m23585a((Object) this.uid, (Object) commerceUser.uid) && C7573i.m23585a((Object) this.nickname, (Object) commerceUser.nickname)) {
                    if (this.verifyStatus == commerceUser.verifyStatus) {
                        if ((this.isHasOrders == commerceUser.isHasOrders) && C7573i.m23585a((Object) this.bindPhone, (Object) commerceUser.bindPhone)) {
                            if (this.withCommerceRights == commerceUser.withCommerceRights) {
                                if (this.withShopEntry == commerceUser.withShopEntry) {
                                    if (this.withNewGoods == commerceUser.withNewGoods) {
                                        if (this.withCommerceNewbieTask == commerceUser.withCommerceNewbieTask) {
                                            if (!(this.withItemCommerceEntry == commerceUser.withItemCommerceEntry) || !C7573i.m23585a((Object) this.shopMicroApp, (Object) commerceUser.shopMicroApp) || !C7573i.m23585a((Object) this.followStatus, (Object) commerceUser.followStatus)) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final String getBindPhone() {
        return this.bindPhone;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int getVerifyStatus() {
        return this.verifyStatus;
    }

    public final boolean getWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public final boolean getWithCommerceRights() {
        return this.withCommerceRights;
    }

    public final boolean getWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public final boolean getWithNewGoods() {
        return this.withNewGoods;
    }

    public final boolean getWithShopEntry() {
        return this.withShopEntry;
    }

    public final int hashCode() {
        UrlModel urlModel = this.avatarMedium;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.nickname;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.verifyStatus) * 31;
        boolean z = this.isHasOrders;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.bindPhone;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.withCommerceRights;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.withShopEntry;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.withNewGoods;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.withCommerceNewbieTask;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.withItemCommerceEntry;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        String str4 = this.shopMicroApp;
        int hashCode5 = (i7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.followStatus;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean isHasOrders() {
        return this.isHasOrders;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceUser(avatarMedium=");
        sb.append(this.avatarMedium);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", verifyStatus=");
        sb.append(this.verifyStatus);
        sb.append(", isHasOrders=");
        sb.append(this.isHasOrders);
        sb.append(", bindPhone=");
        sb.append(this.bindPhone);
        sb.append(", withCommerceRights=");
        sb.append(this.withCommerceRights);
        sb.append(", withShopEntry=");
        sb.append(this.withShopEntry);
        sb.append(", withNewGoods=");
        sb.append(this.withNewGoods);
        sb.append(", withCommerceNewbieTask=");
        sb.append(this.withCommerceNewbieTask);
        sb.append(", withItemCommerceEntry=");
        sb.append(this.withItemCommerceEntry);
        sb.append(", shopMicroApp=");
        sb.append(this.shopMicroApp);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(")");
        return sb.toString();
    }

    public CommerceUser() {
        this(null, "", "", 0, false, "", false, false, false, false, false, null, null, 7680, null);
    }

    public final boolean isMe() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String str = this.uid;
        C7573i.m23582a((Object) iUserService, "userService");
        return C6319n.m19594a(str, iUserService.getCurrentUserID());
    }

    public final void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public final void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setHasOrders(boolean z) {
        this.isHasOrders = z;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setShopMicroApp(String str) {
        this.shopMicroApp = str;
    }

    public final void setVerifyStatus(int i) {
        this.verifyStatus = i;
    }

    public final void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public final void setWithCommerceRights(boolean z) {
        this.withCommerceRights = z;
    }

    public final void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public final void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public final void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public final void setUid(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.uid = str;
    }

    public CommerceUser(UrlModel urlModel, String str, String str2, int i, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, Integer num) {
        C7573i.m23587b(str, "uid");
        this.avatarMedium = urlModel;
        this.uid = str;
        this.nickname = str2;
        this.verifyStatus = i;
        this.isHasOrders = z;
        this.bindPhone = str3;
        this.withCommerceRights = z2;
        this.withShopEntry = z3;
        this.withNewGoods = z4;
        this.withCommerceNewbieTask = z5;
        this.withItemCommerceEntry = z6;
        this.shopMicroApp = str4;
        this.followStatus = num;
    }

    public /* synthetic */ CommerceUser(UrlModel urlModel, String str, String str2, int i, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, Integer num, int i2, C7571f fVar) {
        String str5;
        String str6;
        String str7;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str8;
        Integer num2;
        int i3 = i2;
        if ((i3 & 2) != 0) {
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i3 & 4) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i3 & 32) != 0) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i3 & 64) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i3 & 256) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i3 & 512) != 0) {
            z10 = false;
        } else {
            z10 = z5;
        }
        if ((i3 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            z11 = false;
        } else {
            z11 = z6;
        }
        if ((i3 & 2048) != 0) {
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i3 & 4096) != 0) {
            num2 = Integer.valueOf(-1);
        } else {
            num2 = num;
        }
        this(urlModel, str5, str6, i, z, str7, z7, z8, z9, z10, z11, str8, num2);
    }
}
