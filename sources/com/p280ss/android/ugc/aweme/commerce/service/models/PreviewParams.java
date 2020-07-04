package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion.SourceType;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PreviewParams */
public final class PreviewParams implements Serializable {
    public static final C24482a Companion = new C24482a(null);
    private String action;
    private String activityId;
    private String adItemId;
    private AdLogExtra adLogExtra;
    private CommerceUser author;
    private String awemeId;
    private String backUrl;
    private String carrierType;
    private long currentPosition;
    private String enterFrom;
    private String enterMethod;
    private String entranceInfo;
    private Boolean isAppoint;
    private boolean isFromOthers;
    private boolean isV1Ad;
    private String logPb;
    private String metaParam;
    private String newSourceId;
    private String newSourceType;
    private boolean noCache;
    private String orderType;
    private String originUserId;
    private String previousPage;
    private String productId;
    private String promotionId;
    private long promotionSource;
    private String referSeedId;
    private String referSeedName;
    private boolean replay;
    private String searchKeyword;
    private boolean showOthers;
    private long startPreviewTime;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PreviewParams$a */
    public static final class C24482a {
        private C24482a() {
        }

        public /* synthetic */ C24482a(C7571f fVar) {
            this();
        }
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getAdItemId() {
        return this.adItemId;
    }

    public final AdLogExtra getAdLogExtra() {
        return this.adLogExtra;
    }

    public final CommerceUser getAuthor() {
        return this.author;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getBackUrl() {
        return this.backUrl;
    }

    public final String getCarrierType() {
        return this.carrierType;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEntranceInfo() {
        return this.entranceInfo;
    }

    public final String getLogPb() {
        return this.logPb;
    }

    public final String getMetaParam() {
        return this.metaParam;
    }

    public final String getNewSourceId() {
        return this.newSourceId;
    }

    public final String getNewSourceType() {
        return this.newSourceType;
    }

    public final boolean getNoCache() {
        return this.noCache;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getOriginUserId() {
        return this.originUserId;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final long getPromotionSource() {
        return this.promotionSource;
    }

    public final String getReferSeedId() {
        return this.referSeedId;
    }

    public final String getReferSeedName() {
        return this.referSeedName;
    }

    public final boolean getReplay() {
        return this.replay;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public final boolean getShowOthers() {
        return this.showOthers;
    }

    public final long getStartPreviewTime() {
        return this.startPreviewTime;
    }

    public final Boolean isAppoint() {
        return this.isAppoint;
    }

    public final boolean isFromOthers() {
        return this.isFromOthers;
    }

    public final boolean isV1Ad() {
        return this.isV1Ad;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityId(String str) {
        this.activityId = str;
    }

    public final void setAdItemId(String str) {
        this.adItemId = str;
    }

    public final void setAdLogExtra(AdLogExtra adLogExtra2) {
        this.adLogExtra = adLogExtra2;
    }

    public final void setAppoint(Boolean bool) {
        this.isAppoint = bool;
    }

    public final void setAuthor(CommerceUser commerceUser) {
        this.author = commerceUser;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setBackUrl(String str) {
        this.backUrl = str;
    }

    public final void setCarrierType(String str) {
        this.carrierType = str;
    }

    public final void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public final void setEntranceInfo(String str) {
        this.entranceInfo = str;
    }

    public final void setFromOthers(boolean z) {
        this.isFromOthers = z;
    }

    public final void setLogPb(String str) {
        this.logPb = str;
    }

    public final void setMetaParam(String str) {
        this.metaParam = str;
    }

    public final void setNewSourceId(String str) {
        this.newSourceId = str;
    }

    public final void setNewSourceType(String str) {
        this.newSourceType = str;
    }

    public final void setNoCache(boolean z) {
        this.noCache = z;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(long j) {
        this.promotionSource = j;
    }

    public final void setReferSeedId(String str) {
        this.referSeedId = str;
    }

    public final void setReferSeedName(String str) {
        this.referSeedName = str;
    }

    public final void setReplay(boolean z) {
        this.replay = z;
    }

    public final void setSearchKeyword(String str) {
        this.searchKeyword = str;
    }

    public final void setShowOthers(boolean z) {
        this.showOthers = z;
    }

    public final void setStartPreviewTime(long j) {
        this.startPreviewTime = j;
    }

    public final void setV1Ad(boolean z) {
        this.isV1Ad = z;
    }

    public final void setEnterFrom(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.enterMethod = str;
    }

    public PreviewParams(String str, String str2, long j) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        this.enterFrom = str;
        this.enterMethod = str2;
        this.startPreviewTime = j;
        this.showOthers = true;
        this.promotionSource = SourceType.UNKNOWN.getType();
    }

    public /* synthetic */ PreviewParams(String str, String str2, long j, int i, C7571f fVar) {
        if ((i & 4) != 0) {
            j = SystemClock.uptimeMillis();
        }
        this(str, str2, j);
    }
}
