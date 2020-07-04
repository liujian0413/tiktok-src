package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs */
public final class AwemeFEConfigs extends Message<AwemeFEConfigs, Builder> {
    public static final DefaultValueProtoAdapter<AwemeFEConfigs> ADAPTER = new ProtoAdapter_AwemeFEConfigs();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BusinessEC#ADAPTER", tag = 1)
    public final BusinessEC business_ec;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.GoodsReport#ADAPTER", tag = 5)
    public final GoodsReport goods_report;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan#ADAPTER", tag = 3)
    public final LinkPlan link_plan;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig#ADAPTER", tag = 8)
    public final ShopLiveConfig live;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.MpTab#ADAPTER", tag = 6)
    public final MpTab mp_tab;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PoiConfig#ADAPTER", tag = 4)
    public final PoiConfig poi_error_report;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String seed_label;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding#ADAPTER", tag = 7)
    public final Seeding seeding;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasOrder#ADAPTER", tag = 2)
    public final StarAtlasOrder star_atlas_order;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.VideoAuth#ADAPTER", tag = 10)
    public final VideoAuth video_auth;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeFEConfigs, Builder> {
        public BusinessEC business_ec;
        public GoodsReport goods_report;
        public LinkPlan link_plan;
        public ShopLiveConfig live;
        public MpTab mp_tab;
        public PoiConfig poi_error_report;
        public String seed_label;
        public Seeding seeding;
        public StarAtlasOrder star_atlas_order;
        public VideoAuth video_auth;

        public final AwemeFEConfigs build() {
            AwemeFEConfigs awemeFEConfigs = new AwemeFEConfigs(this.business_ec, this.star_atlas_order, this.link_plan, this.poi_error_report, this.goods_report, this.mp_tab, this.seeding, this.live, this.seed_label, this.video_auth, super.buildUnknownFields());
            return awemeFEConfigs;
        }

        public final Builder business_ec(BusinessEC businessEC) {
            this.business_ec = businessEC;
            return this;
        }

        public final Builder goods_report(GoodsReport goodsReport) {
            this.goods_report = goodsReport;
            return this;
        }

        public final Builder link_plan(LinkPlan linkPlan) {
            this.link_plan = linkPlan;
            return this;
        }

        public final Builder live(ShopLiveConfig shopLiveConfig) {
            this.live = shopLiveConfig;
            return this;
        }

        public final Builder mp_tab(MpTab mpTab) {
            this.mp_tab = mpTab;
            return this;
        }

        public final Builder poi_error_report(PoiConfig poiConfig) {
            this.poi_error_report = poiConfig;
            return this;
        }

        public final Builder seed_label(String str) {
            this.seed_label = str;
            return this;
        }

        public final Builder seeding(Seeding seeding2) {
            this.seeding = seeding2;
            return this;
        }

        public final Builder star_atlas_order(StarAtlasOrder starAtlasOrder) {
            this.star_atlas_order = starAtlasOrder;
            return this;
        }

        public final Builder video_auth(VideoAuth videoAuth) {
            this.video_auth = videoAuth;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs$ProtoAdapter_AwemeFEConfigs */
    static final class ProtoAdapter_AwemeFEConfigs extends DefaultValueProtoAdapter<AwemeFEConfigs> {
        public final AwemeFEConfigs redact(AwemeFEConfigs awemeFEConfigs) {
            return awemeFEConfigs;
        }

        public ProtoAdapter_AwemeFEConfigs() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeFEConfigs.class);
        }

        public final AwemeFEConfigs decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AwemeFEConfigs) null);
        }

        public final int encodedSize(AwemeFEConfigs awemeFEConfigs) {
            return BusinessEC.ADAPTER.encodedSizeWithTag(1, awemeFEConfigs.business_ec) + StarAtlasOrder.ADAPTER.encodedSizeWithTag(2, awemeFEConfigs.star_atlas_order) + LinkPlan.ADAPTER.encodedSizeWithTag(3, awemeFEConfigs.link_plan) + PoiConfig.ADAPTER.encodedSizeWithTag(4, awemeFEConfigs.poi_error_report) + GoodsReport.ADAPTER.encodedSizeWithTag(5, awemeFEConfigs.goods_report) + MpTab.ADAPTER.encodedSizeWithTag(6, awemeFEConfigs.mp_tab) + Seeding.ADAPTER.encodedSizeWithTag(7, awemeFEConfigs.seeding) + ShopLiveConfig.ADAPTER.encodedSizeWithTag(8, awemeFEConfigs.live) + ProtoAdapter.STRING.encodedSizeWithTag(9, awemeFEConfigs.seed_label) + VideoAuth.ADAPTER.encodedSizeWithTag(10, awemeFEConfigs.video_auth) + awemeFEConfigs.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AwemeFEConfigs awemeFEConfigs) throws IOException {
            BusinessEC.ADAPTER.encodeWithTag(protoWriter, 1, awemeFEConfigs.business_ec);
            StarAtlasOrder.ADAPTER.encodeWithTag(protoWriter, 2, awemeFEConfigs.star_atlas_order);
            LinkPlan.ADAPTER.encodeWithTag(protoWriter, 3, awemeFEConfigs.link_plan);
            PoiConfig.ADAPTER.encodeWithTag(protoWriter, 4, awemeFEConfigs.poi_error_report);
            GoodsReport.ADAPTER.encodeWithTag(protoWriter, 5, awemeFEConfigs.goods_report);
            MpTab.ADAPTER.encodeWithTag(protoWriter, 6, awemeFEConfigs.mp_tab);
            Seeding.ADAPTER.encodeWithTag(protoWriter, 7, awemeFEConfigs.seeding);
            ShopLiveConfig.ADAPTER.encodeWithTag(protoWriter, 8, awemeFEConfigs.live);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, awemeFEConfigs.seed_label);
            VideoAuth.ADAPTER.encodeWithTag(protoWriter, 10, awemeFEConfigs.video_auth);
            protoWriter.writeBytes(awemeFEConfigs.unknownFields());
        }

        public final AwemeFEConfigs decode(ProtoReader protoReader, AwemeFEConfigs awemeFEConfigs) throws IOException {
            Builder builder;
            AwemeFEConfigs awemeFEConfigs2 = (AwemeFEConfigs) C10938a.m32097a().mo26425a(AwemeFEConfigs.class, awemeFEConfigs);
            if (awemeFEConfigs2 != null) {
                builder = awemeFEConfigs2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.business_ec((BusinessEC) BusinessEC.ADAPTER.decode(protoReader, builder.business_ec));
                            break;
                        case 2:
                            builder.star_atlas_order((StarAtlasOrder) StarAtlasOrder.ADAPTER.decode(protoReader, builder.star_atlas_order));
                            break;
                        case 3:
                            builder.link_plan((LinkPlan) LinkPlan.ADAPTER.decode(protoReader, builder.link_plan));
                            break;
                        case 4:
                            builder.poi_error_report((PoiConfig) PoiConfig.ADAPTER.decode(protoReader, builder.poi_error_report));
                            break;
                        case 5:
                            builder.goods_report((GoodsReport) GoodsReport.ADAPTER.decode(protoReader, builder.goods_report));
                            break;
                        case 6:
                            builder.mp_tab((MpTab) MpTab.ADAPTER.decode(protoReader, builder.mp_tab));
                            break;
                        case 7:
                            builder.seeding((Seeding) Seeding.ADAPTER.decode(protoReader, builder.seeding));
                            break;
                        case 8:
                            builder.live((ShopLiveConfig) ShopLiveConfig.ADAPTER.decode(protoReader, builder.live));
                            break;
                        case 9:
                            builder.seed_label((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.video_auth((VideoAuth) VideoAuth.ADAPTER.decode(protoReader, builder.video_auth));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (awemeFEConfigs2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final BusinessEC getBusinessEc() throws NullValueException {
        if (this.business_ec != null) {
            return this.business_ec;
        }
        throw new NullValueException();
    }

    public final GoodsReport getGoodsReport() throws NullValueException {
        if (this.goods_report != null) {
            return this.goods_report;
        }
        throw new NullValueException();
    }

    public final LinkPlan getLinkPlan() throws NullValueException {
        if (this.link_plan != null) {
            return this.link_plan;
        }
        throw new NullValueException();
    }

    public final ShopLiveConfig getLive() throws NullValueException {
        if (this.live != null) {
            return this.live;
        }
        throw new NullValueException();
    }

    public final MpTab getMpTab() throws NullValueException {
        if (this.mp_tab != null) {
            return this.mp_tab;
        }
        throw new NullValueException();
    }

    public final PoiConfig getPoiErrorReport() throws NullValueException {
        if (this.poi_error_report != null) {
            return this.poi_error_report;
        }
        throw new NullValueException();
    }

    public final String getSeedLabel() throws NullValueException {
        if (this.seed_label != null) {
            return this.seed_label;
        }
        throw new NullValueException();
    }

    public final Seeding getSeeding() throws NullValueException {
        if (this.seeding != null) {
            return this.seeding;
        }
        throw new NullValueException();
    }

    public final StarAtlasOrder getStarAtlasOrder() throws NullValueException {
        if (this.star_atlas_order != null) {
            return this.star_atlas_order;
        }
        throw new NullValueException();
    }

    public final VideoAuth getVideoAuth() throws NullValueException {
        if (this.video_auth != null) {
            return this.video_auth;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.business_ec = this.business_ec;
        builder.star_atlas_order = this.star_atlas_order;
        builder.link_plan = this.link_plan;
        builder.poi_error_report = this.poi_error_report;
        builder.goods_report = this.goods_report;
        builder.mp_tab = this.mp_tab;
        builder.seeding = this.seeding;
        builder.live = this.live;
        builder.seed_label = this.seed_label;
        builder.video_auth = this.video_auth;
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
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i11 = 0;
        if (this.business_ec != null) {
            i = this.business_ec.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.star_atlas_order != null) {
            i2 = this.star_atlas_order.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 37;
        if (this.link_plan != null) {
            i3 = this.link_plan.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        if (this.poi_error_report != null) {
            i4 = this.poi_error_report.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        if (this.goods_report != null) {
            i5 = this.goods_report.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        if (this.mp_tab != null) {
            i6 = this.mp_tab.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        if (this.seeding != null) {
            i7 = this.seeding.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        if (this.live != null) {
            i8 = this.live.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        if (this.seed_label != null) {
            i9 = this.seed_label.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        if (this.video_auth != null) {
            i11 = this.video_auth.hashCode();
        }
        int i21 = i20 + i11;
        this.hashCode = i21;
        return i21;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.business_ec != null) {
            sb.append(", business_ec=");
            sb.append(this.business_ec);
        }
        if (this.star_atlas_order != null) {
            sb.append(", star_atlas_order=");
            sb.append(this.star_atlas_order);
        }
        if (this.link_plan != null) {
            sb.append(", link_plan=");
            sb.append(this.link_plan);
        }
        if (this.poi_error_report != null) {
            sb.append(", poi_error_report=");
            sb.append(this.poi_error_report);
        }
        if (this.goods_report != null) {
            sb.append(", goods_report=");
            sb.append(this.goods_report);
        }
        if (this.mp_tab != null) {
            sb.append(", mp_tab=");
            sb.append(this.mp_tab);
        }
        if (this.seeding != null) {
            sb.append(", seeding=");
            sb.append(this.seeding);
        }
        if (this.live != null) {
            sb.append(", live=");
            sb.append(this.live);
        }
        if (this.seed_label != null) {
            sb.append(", seed_label=");
            sb.append(this.seed_label);
        }
        if (this.video_auth != null) {
            sb.append(", video_auth=");
            sb.append(this.video_auth);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeFEConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeFEConfigs)) {
            return false;
        }
        AwemeFEConfigs awemeFEConfigs = (AwemeFEConfigs) obj;
        if (!unknownFields().equals(awemeFEConfigs.unknownFields()) || !Internal.equals(this.business_ec, awemeFEConfigs.business_ec) || !Internal.equals(this.star_atlas_order, awemeFEConfigs.star_atlas_order) || !Internal.equals(this.link_plan, awemeFEConfigs.link_plan) || !Internal.equals(this.poi_error_report, awemeFEConfigs.poi_error_report) || !Internal.equals(this.goods_report, awemeFEConfigs.goods_report) || !Internal.equals(this.mp_tab, awemeFEConfigs.mp_tab) || !Internal.equals(this.seeding, awemeFEConfigs.seeding) || !Internal.equals(this.live, awemeFEConfigs.live) || !Internal.equals(this.seed_label, awemeFEConfigs.seed_label) || !Internal.equals(this.video_auth, awemeFEConfigs.video_auth)) {
            return false;
        }
        return true;
    }

    public AwemeFEConfigs(BusinessEC businessEC, StarAtlasOrder starAtlasOrder, LinkPlan linkPlan, PoiConfig poiConfig, GoodsReport goodsReport, MpTab mpTab, Seeding seeding2, ShopLiveConfig shopLiveConfig, String str, VideoAuth videoAuth) {
        this(businessEC, starAtlasOrder, linkPlan, poiConfig, goodsReport, mpTab, seeding2, shopLiveConfig, str, videoAuth, ByteString.EMPTY);
    }

    public AwemeFEConfigs(BusinessEC businessEC, StarAtlasOrder starAtlasOrder, LinkPlan linkPlan, PoiConfig poiConfig, GoodsReport goodsReport, MpTab mpTab, Seeding seeding2, ShopLiveConfig shopLiveConfig, String str, VideoAuth videoAuth, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_ec = businessEC;
        this.star_atlas_order = starAtlasOrder;
        this.link_plan = linkPlan;
        this.poi_error_report = poiConfig;
        this.goods_report = goodsReport;
        this.mp_tab = mpTab;
        this.seeding = seeding2;
        this.live = shopLiveConfig;
        this.seed_label = str;
        this.video_auth = videoAuth;
    }
}
