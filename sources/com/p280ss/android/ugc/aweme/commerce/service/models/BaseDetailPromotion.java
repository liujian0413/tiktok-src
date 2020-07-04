package com.p280ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commerce.model.PromotionVisitor;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion */
public class BaseDetailPromotion implements Serializable {
    public static final C24480a Companion = new C24480a(null);
    @C6593c(mo15949a = "brand_icon")
    private UrlModel brandIcon;
    @C6593c(mo15949a = "detail_url")
    private String detailUrl = "";
    @C6593c(mo15949a = "elastic_images")
    private List<? extends UrlModel> elasticImages = C7525m.m23461a();
    @C6593c(mo15949a = "elastic_introduction")
    private String elasticIntroduction = "";
    @C6593c(mo15949a = "elastic_title")
    private String elasticTitle = "";
    @C6593c(mo15949a = "elastic_type")
    private int elasticType;
    @C6593c(mo15949a = "images")
    private List<? extends UrlModel> images = C7525m.m23461a();
    @C6593c(mo15949a = "open_app_url")
    private String jumpToAppUrl;
    @C6593c(mo15949a = "label")
    private List<String> labels = C7525m.m23461a();
    @C6593c(mo15949a = "market_price")
    private int marketPrice;
    @C6593c(mo15949a = "price")
    private int price;
    @C6593c(mo15949a = "product_id")
    private String productId = "";
    @C6593c(mo15949a = "promotion_id")
    private String promotionId = "";
    @C6593c(mo15949a = "promotion_source")
    private long promotionSource = SourceType.UNKNOWN.getType();
    @C6593c(mo15949a = "sales")
    private int sales = -1;
    @C6593c(mo15949a = "small_app_url")
    private String smallAppUrl;
    @C6593c(mo15949a = "status")
    private int status = 2;
    @C6593c(mo15949a = "taobao")
    private TaoBao taobao;
    @C6593c(mo15949a = "title")
    private String title = "";
    @C6593c(mo15949a = "toutiao")
    private PromotionToutiao toutiao;
    @C6593c(mo15949a = "visitor")
    private PromotionVisitor visitor;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion$SourceType */
    public enum SourceType {
        TAOBAO(1),
        GAME(2),
        EASY_GO(3),
        EASY_GO_SELECTED(4),
        TAOBAO_PHONE(5),
        XIAO_DIAN(6),
        TAOBAO_COMMAND(7),
        JINGDONG(8),
        KAOLA(9),
        UNKNOWN(-1);
        
        public static final C24479a Companion = null;
        private final long type;

        /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion$SourceType$a */
        public static final class C24479a {
            private C24479a() {
            }

            public /* synthetic */ C24479a(C7571f fVar) {
                this();
            }

            /* renamed from: a */
            public static boolean m80447a(Long l) {
                if (l == null) {
                    return false;
                }
                for (SourceType type : SourceType.values()) {
                    long type2 = type.getType();
                    if (l != null && type2 == l.longValue()) {
                        return true;
                    }
                }
                return false;
            }
        }

        public final long getType() {
            return this.type;
        }

        static {
            Companion = new C24479a(null);
        }

        private SourceType(long j) {
            this.type = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion$a */
    public static final class C24480a {
        private C24480a() {
        }

        public /* synthetic */ C24480a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public static boolean m80449b(long j) {
            if (j == SourceType.JINGDONG.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m80450c(long j) {
            if (j == SourceType.KAOLA.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static boolean m80448a(long j) {
            if (j == SourceType.TAOBAO.getType() || j == SourceType.TAOBAO_PHONE.getType() || j == SourceType.TAOBAO_COMMAND.getType()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public static boolean m80451d(long j) {
            if (j == SourceType.GAME.getType() || j == SourceType.EASY_GO.getType() || j == SourceType.EASY_GO_SELECTED.getType() || j == SourceType.XIAO_DIAN.getType()) {
                return true;
            }
            return false;
        }
    }

    public static final boolean isJDGood(long j) {
        return C24480a.m80449b(j);
    }

    public static final boolean isKaolaGood(long j) {
        return C24480a.m80450c(j);
    }

    public static final boolean isSelfGood(long j) {
        return C24480a.m80451d(j);
    }

    public static final boolean isTaobaoGood(long j) {
        return C24480a.m80448a(j);
    }

    public final UrlModel getBrandIcon() {
        return this.brandIcon;
    }

    public final long getCommodityType() {
        return this.promotionSource;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    public final String getElasticIntroduction() {
        return this.elasticIntroduction;
    }

    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final int getElasticType() {
        return this.elasticType;
    }

    public final List<UrlModel> getImages() {
        return this.images;
    }

    public final String getJumpToAppUrl() {
        return this.jumpToAppUrl;
    }

    public final List<String> getLabels() {
        return this.labels;
    }

    public final int getMarketPrice() {
        return this.marketPrice;
    }

    public final int getPrice() {
        return this.price;
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

    public final int getSales() {
        return this.sales;
    }

    public final String getSmallAppUrl() {
        return this.smallAppUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final TaoBao getTaobao() {
        return this.taobao;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PromotionToutiao getToutiao() {
        return this.toutiao;
    }

    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final int getFixedSales() {
        if (this.sales == -1) {
            return 0;
        }
        return this.sales;
    }

    public final boolean isAppointment() {
        PromotionAppointment promotionAppointment;
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            promotionAppointment = promotionToutiao.getAppointment();
        } else {
            promotionAppointment = null;
        }
        if (promotionAppointment != null) {
            return true;
        }
        return false;
    }

    public final boolean isJDGood() {
        return C24480a.m80449b(this.promotionSource);
    }

    public final boolean isKaolaGood() {
        return C24480a.m80450c(this.promotionSource);
    }

    public final boolean isOnSale() {
        if (this.status == 2) {
            return true;
        }
        return false;
    }

    public final boolean isOtherTypeGood() {
        if (!C24479a.m80447a(Long.valueOf(this.promotionSource))) {
            return true;
        }
        return false;
    }

    public final boolean isPreSaleGood() {
        PromotionPreSale promotionPreSale;
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            promotionPreSale = promotionToutiao.getPreSale();
        } else {
            promotionPreSale = null;
        }
        if (promotionPreSale != null) {
            return true;
        }
        return false;
    }

    public final boolean isTaobaoGood() {
        return C24480a.m80448a(this.promotionSource);
    }

    public final boolean hasCoupon() {
        if (hasTaobaoCoupon() || hasToutiaoCoupon()) {
            return true;
        }
        return false;
    }

    public final boolean hasTaobaoCoupon() {
        TaoBao taoBao = this.taobao;
        if (taoBao != null) {
            TaobaoCouponInfo coupon = taoBao.getCoupon();
            if (coupon != null && coupon.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasToutiaoCoupon() {
        List list;
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            list = promotionToutiao.getCouponRule();
        } else {
            list = null;
        }
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean isBuyWithoutCheck() {
        Boolean bool;
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            bool = promotionToutiao.getNeedCheck();
        } else {
            bool = null;
        }
        return C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(false));
    }

    public final boolean isMiniProgramGood() {
        if (this.promotionSource == SourceType.JINGDONG.getType() || this.promotionSource == SourceType.KAOLA.getType()) {
            return true;
        }
        return false;
    }

    public final boolean isSecKillGood() {
        if (!isPreSaleGood() && !isAppointment()) {
            PromotionToutiao promotionToutiao = this.toutiao;
            if (promotionToutiao != null) {
                SeckillInfo secKillInfo = promotionToutiao.getSecKillInfo();
                if (secKillInfo != null && secKillInfo.canBeShow()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isThirdParty() {
        if (isTaobaoGood() || isMiniProgramGood() || isOtherTypeGood()) {
            return true;
        }
        return false;
    }

    public final boolean isVirtualGood() {
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            VirtualPromotionBean virtualPromotion = promotionToutiao.getVirtualPromotion();
            if (virtualPromotion != null) {
                return virtualPromotion.isVirtualGoods();
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFirstFullReduction() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.commerce.service.models.PromotionToutiao r0 = r4.toutiao
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.commerce.service.models.TouTiaoFullReductionInfo r0 = r0.getReductionInfo()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.getFullReduction()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 != 0) goto L_0x002a
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.BaseDetailPromotion.getFirstFullReduction():java.lang.String");
    }

    public final boolean isGoodInAppointment() {
        if (!isAppointment()) {
            return false;
        }
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            PromotionAppointment appointment = promotionToutiao.getAppointment();
            if (appointment == null || appointment.getServerTime() >= appointment.getStartTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isGoodInPreSale() {
        if (!isPreSaleGood()) {
            return false;
        }
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            PromotionPreSale preSale = promotionToutiao.getPreSale();
            if (preSale == null || preSale.getServerTime() >= preSale.getEndTime()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isGoodInSecKill() {
        if (!isSecKillGood()) {
            return false;
        }
        PromotionToutiao promotionToutiao = this.toutiao;
        if (promotionToutiao != null) {
            SeckillInfo secKillInfo = promotionToutiao.getSecKillInfo();
            if (secKillInfo != null) {
                long beginTime = secKillInfo.getBeginTime();
                long endTime = secKillInfo.getEndTime();
                long currentTime = secKillInfo.getCurrentTime();
                if (beginTime <= currentTime && endTime >= currentTime) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final String longTitle() {
        if (!TextUtils.isEmpty(this.title)) {
            String str = this.title;
            if (str == null) {
                C7573i.m23580a();
            }
            return str;
        } else if (TextUtils.isEmpty(this.elasticTitle)) {
            return "";
        } else {
            String str2 = this.elasticTitle;
            if (str2 == null) {
                C7573i.m23580a();
            }
            return str2;
        }
    }

    public final List<UrlModel> preferredImages() {
        List<? extends UrlModel> list = this.elasticImages;
        if (list != null && (!list.isEmpty())) {
            return this.elasticImages;
        }
        List<? extends UrlModel> list2 = this.images;
        if (list2 == null || !(!list2.isEmpty())) {
            return C7525m.m23461a();
        }
        return this.images;
    }

    public final String shortTitle() {
        if (!TextUtils.isEmpty(this.elasticTitle)) {
            String str = this.elasticTitle;
            if (str == null) {
                C7573i.m23580a();
            }
            return str;
        } else if (TextUtils.isEmpty(this.title)) {
            return "";
        } else {
            String str2 = this.title;
            if (str2 == null) {
                C7573i.m23580a();
            }
            return str2;
        }
    }

    public final void setBrandIcon(UrlModel urlModel) {
        this.brandIcon = urlModel;
    }

    public final void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticIntroduction(String str) {
        this.elasticIntroduction = str;
    }

    public final void setElasticTitle(String str) {
        this.elasticTitle = str;
    }

    public final void setElasticType(int i) {
        this.elasticType = i;
    }

    public final void setImages(List<? extends UrlModel> list) {
        this.images = list;
    }

    public final void setJumpToAppUrl(String str) {
        this.jumpToAppUrl = str;
    }

    public final void setLabels(List<String> list) {
        this.labels = list;
    }

    public final void setMarketPrice(int i) {
        this.marketPrice = i;
    }

    public final void setPrice(int i) {
        this.price = i;
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

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setSmallAppUrl(String str) {
        this.smallAppUrl = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTaobao(TaoBao taoBao) {
        this.taobao = taoBao;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setToutiao(PromotionToutiao promotionToutiao) {
        this.toutiao = promotionToutiao;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }
}
