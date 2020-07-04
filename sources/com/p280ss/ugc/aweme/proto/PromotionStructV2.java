package com.p280ss.ugc.aweme.proto;

import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PromotionStructV2 */
final class PromotionStructV2 extends Message<PromotionStructV2, Builder> {
    public static final ProtoAdapter<PromotionStructV2> ADAPTER = new ProtoAdapter_PromotionStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 33)
    public UrlStructV2 brand_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 28)
    public Integer clicks;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public Long cos_fee;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 20)
    public Double cos_radio;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = Label.REPEATED, tag = 16)
    public List<UrlStructV2> elastic_img;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public String elastic_introduction;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String elastic_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 25)
    public Integer elastic_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public Boolean favorited;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String gid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 19)
    public String h5_url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 image;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = Label.REPEATED, tag = 23)
    public List<UrlStructV2> imgs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 9)
    public Long item_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 17)
    public List<String> label;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public String last_aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public String logo;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long market_price;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public Long price;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String promotion_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 24)
    public Integer promotion_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 29)
    public Integer rank;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 30)
    public String rank_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public Long sales;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 34)
    public String small_app_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 22)
    public String source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 26)
    public String title_prefix;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 31)
    public String trace_author_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 32)
    public String trace_aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String url;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UserShopCategoryV2#ADAPTER", label = Label.REPEATED, tag = 35)
    public List<UserShopCategoryV2> user_shop_categories;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 27)
    public Integer views;
    @WireField(adapter = "com.ss.ugc.aweme.proto.PromotionVisitorV2#ADAPTER", tag = 18)
    public PromotionVisitorV2 visitor;

    /* renamed from: com.ss.ugc.aweme.proto.PromotionStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PromotionStructV2, Builder> {
        public UrlStructV2 brand_icon;
        public Integer clicks;
        public Long cos_fee;
        public Double cos_radio;
        public List<UrlStructV2> elastic_img = Internal.newMutableList();
        public String elastic_introduction;
        public String elastic_title;
        public Integer elastic_type;
        public String extra;
        public Boolean favorited;
        public String gid;
        public String h5_url;
        public UrlStructV2 image;
        public List<UrlStructV2> imgs = Internal.newMutableList();
        public Long item_type;
        public List<String> label = Internal.newMutableList();
        public String last_aweme_id;
        public String logo;
        public Long market_price;
        public Long price;
        public String promotion_id;
        public Integer promotion_source;
        public Integer rank;
        public String rank_url;
        public Long sales;
        public String small_app_url;
        public String source;
        public String title;
        public String title_prefix;
        public String trace_author_id;
        public String trace_aweme_id;
        public String url;
        public List<UserShopCategoryV2> user_shop_categories = Internal.newMutableList();
        public Integer views;
        public PromotionVisitorV2 visitor;

        public final PromotionStructV2 build() {
            PromotionStructV2 promotionStructV2 = new PromotionStructV2(this.promotion_id, this.gid, this.title, this.image, this.price, this.market_price, this.cos_fee, this.url, this.item_type, this.sales, this.extra, this.favorited, this.last_aweme_id, this.elastic_title, this.elastic_introduction, this.elastic_img, this.label, this.visitor, this.h5_url, this.imgs, this.promotion_source, this.elastic_type, this.title_prefix, this.views, this.clicks, this.rank, this.rank_url, this.trace_author_id, this.trace_aweme_id, this.cos_radio, this.logo, this.source, this.brand_icon, this.small_app_url, this.user_shop_categories, super.buildUnknownFields());
            return promotionStructV2;
        }

        public final Builder brand_icon(UrlStructV2 urlStructV2) {
            this.brand_icon = urlStructV2;
            return this;
        }

        public final Builder clicks(Integer num) {
            this.clicks = num;
            return this;
        }

        public final Builder cos_fee(Long l) {
            this.cos_fee = l;
            return this;
        }

        public final Builder cos_radio(Double d) {
            this.cos_radio = d;
            return this;
        }

        public final Builder elastic_introduction(String str) {
            this.elastic_introduction = str;
            return this;
        }

        public final Builder elastic_title(String str) {
            this.elastic_title = str;
            return this;
        }

        public final Builder elastic_type(Integer num) {
            this.elastic_type = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder favorited(Boolean bool) {
            this.favorited = bool;
            return this;
        }

        public final Builder gid(String str) {
            this.gid = str;
            return this;
        }

        public final Builder h5_url(String str) {
            this.h5_url = str;
            return this;
        }

        public final Builder image(UrlStructV2 urlStructV2) {
            this.image = urlStructV2;
            return this;
        }

        public final Builder item_type(Long l) {
            this.item_type = l;
            return this;
        }

        public final Builder last_aweme_id(String str) {
            this.last_aweme_id = str;
            return this;
        }

        public final Builder logo(String str) {
            this.logo = str;
            return this;
        }

        public final Builder market_price(Long l) {
            this.market_price = l;
            return this;
        }

        public final Builder price(Long l) {
            this.price = l;
            return this;
        }

        public final Builder promotion_id(String str) {
            this.promotion_id = str;
            return this;
        }

        public final Builder promotion_source(Integer num) {
            this.promotion_source = num;
            return this;
        }

        public final Builder rank(Integer num) {
            this.rank = num;
            return this;
        }

        public final Builder rank_url(String str) {
            this.rank_url = str;
            return this;
        }

        public final Builder sales(Long l) {
            this.sales = l;
            return this;
        }

        public final Builder small_app_url(String str) {
            this.small_app_url = str;
            return this;
        }

        public final Builder source(String str) {
            this.source = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder title_prefix(String str) {
            this.title_prefix = str;
            return this;
        }

        public final Builder trace_author_id(String str) {
            this.trace_author_id = str;
            return this;
        }

        public final Builder trace_aweme_id(String str) {
            this.trace_aweme_id = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }

        public final Builder views(Integer num) {
            this.views = num;
            return this;
        }

        public final Builder visitor(PromotionVisitorV2 promotionVisitorV2) {
            this.visitor = promotionVisitorV2;
            return this;
        }

        public final Builder elastic_img(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.elastic_img = list;
            return this;
        }

        public final Builder imgs(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.imgs = list;
            return this;
        }

        public final Builder label(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.label = list;
            return this;
        }

        public final Builder user_shop_categories(List<UserShopCategoryV2> list) {
            Internal.checkElementsNotNull(list);
            this.user_shop_categories = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PromotionStructV2$ProtoAdapter_PromotionStructV2 */
    static final class ProtoAdapter_PromotionStructV2 extends ProtoAdapter<PromotionStructV2> {
        public ProtoAdapter_PromotionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PromotionStructV2.class);
        }

        public final int encodedSize(PromotionStructV2 promotionStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, promotionStructV2.promotion_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, promotionStructV2.gid) + ProtoAdapter.STRING.encodedSizeWithTag(3, promotionStructV2.title) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, promotionStructV2.image) + ProtoAdapter.INT64.encodedSizeWithTag(5, promotionStructV2.price) + ProtoAdapter.INT64.encodedSizeWithTag(6, promotionStructV2.market_price) + ProtoAdapter.INT64.encodedSizeWithTag(7, promotionStructV2.cos_fee) + ProtoAdapter.STRING.encodedSizeWithTag(8, promotionStructV2.url) + ProtoAdapter.INT64.encodedSizeWithTag(9, promotionStructV2.item_type) + ProtoAdapter.INT64.encodedSizeWithTag(10, promotionStructV2.sales) + ProtoAdapter.STRING.encodedSizeWithTag(11, promotionStructV2.extra) + ProtoAdapter.BOOL.encodedSizeWithTag(12, promotionStructV2.favorited) + ProtoAdapter.STRING.encodedSizeWithTag(13, promotionStructV2.last_aweme_id) + ProtoAdapter.STRING.encodedSizeWithTag(14, promotionStructV2.elastic_title) + ProtoAdapter.STRING.encodedSizeWithTag(15, promotionStructV2.elastic_introduction) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(16, promotionStructV2.elastic_img) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(17, promotionStructV2.label) + PromotionVisitorV2.ADAPTER.encodedSizeWithTag(18, promotionStructV2.visitor) + ProtoAdapter.STRING.encodedSizeWithTag(19, promotionStructV2.h5_url) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(23, promotionStructV2.imgs) + ProtoAdapter.INT32.encodedSizeWithTag(24, promotionStructV2.promotion_source) + ProtoAdapter.INT32.encodedSizeWithTag(25, promotionStructV2.elastic_type) + ProtoAdapter.STRING.encodedSizeWithTag(26, promotionStructV2.title_prefix) + ProtoAdapter.INT32.encodedSizeWithTag(27, promotionStructV2.views) + ProtoAdapter.INT32.encodedSizeWithTag(28, promotionStructV2.clicks) + ProtoAdapter.INT32.encodedSizeWithTag(29, promotionStructV2.rank) + ProtoAdapter.STRING.encodedSizeWithTag(30, promotionStructV2.rank_url) + ProtoAdapter.STRING.encodedSizeWithTag(31, promotionStructV2.trace_author_id) + ProtoAdapter.STRING.encodedSizeWithTag(32, promotionStructV2.trace_aweme_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(20, promotionStructV2.cos_radio) + ProtoAdapter.STRING.encodedSizeWithTag(21, promotionStructV2.logo) + ProtoAdapter.STRING.encodedSizeWithTag(22, promotionStructV2.source) + UrlStructV2.ADAPTER.encodedSizeWithTag(33, promotionStructV2.brand_icon) + ProtoAdapter.STRING.encodedSizeWithTag(34, promotionStructV2.small_app_url) + UserShopCategoryV2.ADAPTER.asRepeated().encodedSizeWithTag(35, promotionStructV2.user_shop_categories) + promotionStructV2.unknownFields().size();
        }

        public final PromotionStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.promotion_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.gid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.image((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.price((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.market_price((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.cos_fee((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.item_type((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 10:
                            builder.sales((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 11:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.favorited((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 13:
                            builder.last_aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.elastic_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.elastic_introduction((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.elastic_img.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 17:
                            builder.label.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 18:
                            builder.visitor((PromotionVisitorV2) PromotionVisitorV2.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            builder.h5_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 20:
                            builder.cos_radio((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 21:
                            builder.logo((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 22:
                            builder.source((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 23:
                            builder.imgs.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 24:
                            builder.promotion_source((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 25:
                            builder.elastic_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                            builder.title_prefix((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                            builder.views((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 28:
                            builder.clicks((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 29:
                            builder.rank((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 30:
                            builder.rank_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 31:
                            builder.trace_author_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 32:
                            builder.trace_aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 33:
                            builder.brand_icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case BaseNotice.CHALLENGE /*34*/:
                            builder.small_app_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 35:
                            builder.user_shop_categories.add(UserShopCategoryV2.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PromotionStructV2 promotionStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, promotionStructV2.promotion_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, promotionStructV2.gid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, promotionStructV2.title);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, promotionStructV2.image);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, promotionStructV2.price);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, promotionStructV2.market_price);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, promotionStructV2.cos_fee);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, promotionStructV2.url);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, promotionStructV2.item_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, promotionStructV2.sales);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, promotionStructV2.extra);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, promotionStructV2.favorited);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, promotionStructV2.last_aweme_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, promotionStructV2.elastic_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, promotionStructV2.elastic_introduction);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, promotionStructV2.elastic_img);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 17, promotionStructV2.label);
            PromotionVisitorV2.ADAPTER.encodeWithTag(protoWriter, 18, promotionStructV2.visitor);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, promotionStructV2.h5_url);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 23, promotionStructV2.imgs);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 24, promotionStructV2.promotion_source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 25, promotionStructV2.elastic_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, promotionStructV2.title_prefix);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 27, promotionStructV2.views);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 28, promotionStructV2.clicks);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 29, promotionStructV2.rank);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, promotionStructV2.rank_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 31, promotionStructV2.trace_author_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 32, promotionStructV2.trace_aweme_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 20, promotionStructV2.cos_radio);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, promotionStructV2.logo);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 22, promotionStructV2.source);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 33, promotionStructV2.brand_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, promotionStructV2.small_app_url);
            UserShopCategoryV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 35, promotionStructV2.user_shop_categories);
            protoWriter.writeBytes(promotionStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.promotion_id = this.promotion_id;
        builder.gid = this.gid;
        builder.title = this.title;
        builder.image = this.image;
        builder.price = this.price;
        builder.market_price = this.market_price;
        builder.cos_fee = this.cos_fee;
        builder.url = this.url;
        builder.item_type = this.item_type;
        builder.sales = this.sales;
        builder.extra = this.extra;
        builder.favorited = this.favorited;
        builder.last_aweme_id = this.last_aweme_id;
        builder.elastic_title = this.elastic_title;
        builder.elastic_introduction = this.elastic_introduction;
        builder.elastic_img = Internal.copyOf("elastic_img", this.elastic_img);
        builder.label = Internal.copyOf("label", this.label);
        builder.visitor = this.visitor;
        builder.h5_url = this.h5_url;
        builder.imgs = Internal.copyOf("imgs", this.imgs);
        builder.promotion_source = this.promotion_source;
        builder.elastic_type = this.elastic_type;
        builder.title_prefix = this.title_prefix;
        builder.views = this.views;
        builder.clicks = this.clicks;
        builder.rank = this.rank;
        builder.rank_url = this.rank_url;
        builder.trace_author_id = this.trace_author_id;
        builder.trace_aweme_id = this.trace_aweme_id;
        builder.cos_radio = this.cos_radio;
        builder.logo = this.logo;
        builder.source = this.source;
        builder.brand_icon = this.brand_icon;
        builder.small_app_url = this.small_app_url;
        builder.user_shop_categories = Internal.copyOf("user_shop_categories", this.user_shop_categories);
        builder.addUnknownFields(unknownFields());
        return builder;
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
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31 = this.hashCode;
        if (i31 != 0) {
            return i31;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i32 = 0;
        if (this.promotion_id != null) {
            i = this.promotion_id.hashCode();
        } else {
            i = 0;
        }
        int i33 = (hashCode + i) * 37;
        if (this.gid != null) {
            i2 = this.gid.hashCode();
        } else {
            i2 = 0;
        }
        int i34 = (i33 + i2) * 37;
        if (this.title != null) {
            i3 = this.title.hashCode();
        } else {
            i3 = 0;
        }
        int i35 = (i34 + i3) * 37;
        if (this.image != null) {
            i4 = this.image.hashCode();
        } else {
            i4 = 0;
        }
        int i36 = (i35 + i4) * 37;
        if (this.price != null) {
            i5 = this.price.hashCode();
        } else {
            i5 = 0;
        }
        int i37 = (i36 + i5) * 37;
        if (this.market_price != null) {
            i6 = this.market_price.hashCode();
        } else {
            i6 = 0;
        }
        int i38 = (i37 + i6) * 37;
        if (this.cos_fee != null) {
            i7 = this.cos_fee.hashCode();
        } else {
            i7 = 0;
        }
        int i39 = (i38 + i7) * 37;
        if (this.url != null) {
            i8 = this.url.hashCode();
        } else {
            i8 = 0;
        }
        int i40 = (i39 + i8) * 37;
        if (this.item_type != null) {
            i9 = this.item_type.hashCode();
        } else {
            i9 = 0;
        }
        int i41 = (i40 + i9) * 37;
        if (this.sales != null) {
            i10 = this.sales.hashCode();
        } else {
            i10 = 0;
        }
        int i42 = (i41 + i10) * 37;
        if (this.extra != null) {
            i11 = this.extra.hashCode();
        } else {
            i11 = 0;
        }
        int i43 = (i42 + i11) * 37;
        if (this.favorited != null) {
            i12 = this.favorited.hashCode();
        } else {
            i12 = 0;
        }
        int i44 = (i43 + i12) * 37;
        if (this.last_aweme_id != null) {
            i13 = this.last_aweme_id.hashCode();
        } else {
            i13 = 0;
        }
        int i45 = (i44 + i13) * 37;
        if (this.elastic_title != null) {
            i14 = this.elastic_title.hashCode();
        } else {
            i14 = 0;
        }
        int i46 = (i45 + i14) * 37;
        if (this.elastic_introduction != null) {
            i15 = this.elastic_introduction.hashCode();
        } else {
            i15 = 0;
        }
        int hashCode2 = (((((i46 + i15) * 37) + this.elastic_img.hashCode()) * 37) + this.label.hashCode()) * 37;
        if (this.visitor != null) {
            i16 = this.visitor.hashCode();
        } else {
            i16 = 0;
        }
        int i47 = (hashCode2 + i16) * 37;
        if (this.h5_url != null) {
            i17 = this.h5_url.hashCode();
        } else {
            i17 = 0;
        }
        int hashCode3 = (((i47 + i17) * 37) + this.imgs.hashCode()) * 37;
        if (this.promotion_source != null) {
            i18 = this.promotion_source.hashCode();
        } else {
            i18 = 0;
        }
        int i48 = (hashCode3 + i18) * 37;
        if (this.elastic_type != null) {
            i19 = this.elastic_type.hashCode();
        } else {
            i19 = 0;
        }
        int i49 = (i48 + i19) * 37;
        if (this.title_prefix != null) {
            i20 = this.title_prefix.hashCode();
        } else {
            i20 = 0;
        }
        int i50 = (i49 + i20) * 37;
        if (this.views != null) {
            i21 = this.views.hashCode();
        } else {
            i21 = 0;
        }
        int i51 = (i50 + i21) * 37;
        if (this.clicks != null) {
            i22 = this.clicks.hashCode();
        } else {
            i22 = 0;
        }
        int i52 = (i51 + i22) * 37;
        if (this.rank != null) {
            i23 = this.rank.hashCode();
        } else {
            i23 = 0;
        }
        int i53 = (i52 + i23) * 37;
        if (this.rank_url != null) {
            i24 = this.rank_url.hashCode();
        } else {
            i24 = 0;
        }
        int i54 = (i53 + i24) * 37;
        if (this.trace_author_id != null) {
            i25 = this.trace_author_id.hashCode();
        } else {
            i25 = 0;
        }
        int i55 = (i54 + i25) * 37;
        if (this.trace_aweme_id != null) {
            i26 = this.trace_aweme_id.hashCode();
        } else {
            i26 = 0;
        }
        int i56 = (i55 + i26) * 37;
        if (this.cos_radio != null) {
            i27 = this.cos_radio.hashCode();
        } else {
            i27 = 0;
        }
        int i57 = (i56 + i27) * 37;
        if (this.logo != null) {
            i28 = this.logo.hashCode();
        } else {
            i28 = 0;
        }
        int i58 = (i57 + i28) * 37;
        if (this.source != null) {
            i29 = this.source.hashCode();
        } else {
            i29 = 0;
        }
        int i59 = (i58 + i29) * 37;
        if (this.brand_icon != null) {
            i30 = this.brand_icon.hashCode();
        } else {
            i30 = 0;
        }
        int i60 = (i59 + i30) * 37;
        if (this.small_app_url != null) {
            i32 = this.small_app_url.hashCode();
        }
        int hashCode4 = ((i60 + i32) * 37) + this.user_shop_categories.hashCode();
        this.hashCode = hashCode4;
        return hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.promotion_id != null) {
            sb.append(", promotion_id=");
            sb.append(this.promotion_id);
        }
        if (this.gid != null) {
            sb.append(", gid=");
            sb.append(this.gid);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.price != null) {
            sb.append(", price=");
            sb.append(this.price);
        }
        if (this.market_price != null) {
            sb.append(", market_price=");
            sb.append(this.market_price);
        }
        if (this.cos_fee != null) {
            sb.append(", cos_fee=");
            sb.append(this.cos_fee);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.item_type != null) {
            sb.append(", item_type=");
            sb.append(this.item_type);
        }
        if (this.sales != null) {
            sb.append(", sales=");
            sb.append(this.sales);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.favorited != null) {
            sb.append(", favorited=");
            sb.append(this.favorited);
        }
        if (this.last_aweme_id != null) {
            sb.append(", last_aweme_id=");
            sb.append(this.last_aweme_id);
        }
        if (this.elastic_title != null) {
            sb.append(", elastic_title=");
            sb.append(this.elastic_title);
        }
        if (this.elastic_introduction != null) {
            sb.append(", elastic_introduction=");
            sb.append(this.elastic_introduction);
        }
        if (!this.elastic_img.isEmpty()) {
            sb.append(", elastic_img=");
            sb.append(this.elastic_img);
        }
        if (!this.label.isEmpty()) {
            sb.append(", label=");
            sb.append(this.label);
        }
        if (this.visitor != null) {
            sb.append(", visitor=");
            sb.append(this.visitor);
        }
        if (this.h5_url != null) {
            sb.append(", h5_url=");
            sb.append(this.h5_url);
        }
        if (!this.imgs.isEmpty()) {
            sb.append(", imgs=");
            sb.append(this.imgs);
        }
        if (this.promotion_source != null) {
            sb.append(", promotion_source=");
            sb.append(this.promotion_source);
        }
        if (this.elastic_type != null) {
            sb.append(", elastic_type=");
            sb.append(this.elastic_type);
        }
        if (this.title_prefix != null) {
            sb.append(", title_prefix=");
            sb.append(this.title_prefix);
        }
        if (this.views != null) {
            sb.append(", views=");
            sb.append(this.views);
        }
        if (this.clicks != null) {
            sb.append(", clicks=");
            sb.append(this.clicks);
        }
        if (this.rank != null) {
            sb.append(", rank=");
            sb.append(this.rank);
        }
        if (this.rank_url != null) {
            sb.append(", rank_url=");
            sb.append(this.rank_url);
        }
        if (this.trace_author_id != null) {
            sb.append(", trace_author_id=");
            sb.append(this.trace_author_id);
        }
        if (this.trace_aweme_id != null) {
            sb.append(", trace_aweme_id=");
            sb.append(this.trace_aweme_id);
        }
        if (this.cos_radio != null) {
            sb.append(", cos_radio=");
            sb.append(this.cos_radio);
        }
        if (this.logo != null) {
            sb.append(", logo=");
            sb.append(this.logo);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.brand_icon != null) {
            sb.append(", brand_icon=");
            sb.append(this.brand_icon);
        }
        if (this.small_app_url != null) {
            sb.append(", small_app_url=");
            sb.append(this.small_app_url);
        }
        if (!this.user_shop_categories.isEmpty()) {
            sb.append(", user_shop_categories=");
            sb.append(this.user_shop_categories);
        }
        StringBuilder replace = sb.replace(0, 2, "PromotionStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionStructV2)) {
            return false;
        }
        PromotionStructV2 promotionStructV2 = (PromotionStructV2) obj;
        if (!unknownFields().equals(promotionStructV2.unknownFields()) || !Internal.equals(this.promotion_id, promotionStructV2.promotion_id) || !Internal.equals(this.gid, promotionStructV2.gid) || !Internal.equals(this.title, promotionStructV2.title) || !Internal.equals(this.image, promotionStructV2.image) || !Internal.equals(this.price, promotionStructV2.price) || !Internal.equals(this.market_price, promotionStructV2.market_price) || !Internal.equals(this.cos_fee, promotionStructV2.cos_fee) || !Internal.equals(this.url, promotionStructV2.url) || !Internal.equals(this.item_type, promotionStructV2.item_type) || !Internal.equals(this.sales, promotionStructV2.sales) || !Internal.equals(this.extra, promotionStructV2.extra) || !Internal.equals(this.favorited, promotionStructV2.favorited) || !Internal.equals(this.last_aweme_id, promotionStructV2.last_aweme_id) || !Internal.equals(this.elastic_title, promotionStructV2.elastic_title) || !Internal.equals(this.elastic_introduction, promotionStructV2.elastic_introduction) || !this.elastic_img.equals(promotionStructV2.elastic_img) || !this.label.equals(promotionStructV2.label) || !Internal.equals(this.visitor, promotionStructV2.visitor) || !Internal.equals(this.h5_url, promotionStructV2.h5_url) || !this.imgs.equals(promotionStructV2.imgs) || !Internal.equals(this.promotion_source, promotionStructV2.promotion_source) || !Internal.equals(this.elastic_type, promotionStructV2.elastic_type) || !Internal.equals(this.title_prefix, promotionStructV2.title_prefix) || !Internal.equals(this.views, promotionStructV2.views) || !Internal.equals(this.clicks, promotionStructV2.clicks) || !Internal.equals(this.rank, promotionStructV2.rank) || !Internal.equals(this.rank_url, promotionStructV2.rank_url) || !Internal.equals(this.trace_author_id, promotionStructV2.trace_author_id) || !Internal.equals(this.trace_aweme_id, promotionStructV2.trace_aweme_id) || !Internal.equals(this.cos_radio, promotionStructV2.cos_radio) || !Internal.equals(this.logo, promotionStructV2.logo) || !Internal.equals(this.source, promotionStructV2.source) || !Internal.equals(this.brand_icon, promotionStructV2.brand_icon) || !Internal.equals(this.small_app_url, promotionStructV2.small_app_url) || !this.user_shop_categories.equals(promotionStructV2.user_shop_categories)) {
            return false;
        }
        return true;
    }

    public PromotionStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, Long l, Long l2, Long l3, String str4, Long l4, Long l5, String str5, Boolean bool, String str6, String str7, String str8, List<UrlStructV2> list, List<String> list2, PromotionVisitorV2 promotionVisitorV2, String str9, List<UrlStructV2> list3, Integer num, Integer num2, String str10, Integer num3, Integer num4, Integer num5, String str11, String str12, String str13, Double d, String str14, String str15, UrlStructV2 urlStructV22, String str16, List<UserShopCategoryV2> list4) {
        this(str, str2, str3, urlStructV2, l, l2, l3, str4, l4, l5, str5, bool, str6, str7, str8, list, list2, promotionVisitorV2, str9, list3, num, num2, str10, num3, num4, num5, str11, str12, str13, d, str14, str15, urlStructV22, str16, list4, ByteString.EMPTY);
    }

    public PromotionStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, Long l, Long l2, Long l3, String str4, Long l4, Long l5, String str5, Boolean bool, String str6, String str7, String str8, List<UrlStructV2> list, List<String> list2, PromotionVisitorV2 promotionVisitorV2, String str9, List<UrlStructV2> list3, Integer num, Integer num2, String str10, Integer num3, Integer num4, Integer num5, String str11, String str12, String str13, Double d, String str14, String str15, UrlStructV2 urlStructV22, String str16, List<UserShopCategoryV2> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.promotion_id = str;
        this.gid = str2;
        this.title = str3;
        this.image = urlStructV2;
        this.price = l;
        this.market_price = l2;
        this.cos_fee = l3;
        this.url = str4;
        this.item_type = l4;
        this.sales = l5;
        this.extra = str5;
        this.favorited = bool;
        this.last_aweme_id = str6;
        this.elastic_title = str7;
        this.elastic_introduction = str8;
        this.elastic_img = Internal.immutableCopyOf("elastic_img", list);
        this.label = Internal.immutableCopyOf("label", list2);
        this.visitor = promotionVisitorV2;
        this.h5_url = str9;
        this.imgs = Internal.immutableCopyOf("imgs", list3);
        this.promotion_source = num;
        this.elastic_type = num2;
        this.title_prefix = str10;
        this.views = num3;
        this.clicks = num4;
        this.rank = num5;
        this.rank_url = str11;
        this.trace_author_id = str12;
        this.trace_aweme_id = str13;
        this.cos_radio = d;
        this.logo = str14;
        this.source = str15;
        this.brand_icon = urlStructV22;
        this.small_app_url = str16;
        this.user_shop_categories = Internal.immutableCopyOf("user_shop_categories", list4);
    }
}
