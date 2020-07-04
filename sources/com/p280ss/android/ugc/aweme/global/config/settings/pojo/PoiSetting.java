package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting */
public final class PoiSetting extends Message<PoiSetting, Builder> {
    public static final DefaultValueProtoAdapter<PoiSetting> ADAPTER = new ProtoAdapter_PoiSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer collect_hint_action_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public final Integer collect_hint_display_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String life_service_assistant_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer location_update_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer max_pic_size;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String merchant_management_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String merchant_settle_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 10)
    public final Integer nearby_location_prompt_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 17)
    public final Integer poi_location_cache_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 18)
    public final Long poi_location_delay_upload;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 16)
    public final Integer poi_open_regeo;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String poi_qa_list_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String poi_region_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 9)
    public final Boolean report_at_start;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer report_bss_max;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 5)
    public final Boolean report_gps;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 8)
    public final Integer report_interval_seconds;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer report_wifi_max;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PoiSetting, Builder> {
        public Integer collect_hint_action_interval = Integer.valueOf(5);
        public Integer collect_hint_display_interval = Integer.valueOf(5);
        public String life_service_assistant_url;
        public Integer location_update_interval = Integer.valueOf(0);
        public Integer max_pic_size;
        public String merchant_management_url;
        public String merchant_settle_url;
        public Integer nearby_location_prompt_interval = Integer.valueOf(0);
        public Integer poi_location_cache_duration = Integer.valueOf(10);
        public Long poi_location_delay_upload = Long.valueOf(0);
        public Integer poi_open_regeo = Integer.valueOf(0);
        public String poi_qa_list_url;
        public String poi_region_list;
        public Boolean report_at_start = Boolean.valueOf(true);
        public Integer report_bss_max = Integer.valueOf(0);
        public Boolean report_gps = Boolean.valueOf(true);
        public Integer report_interval_seconds = Integer.valueOf(600);
        public Integer report_wifi_max = Integer.valueOf(0);

        public final PoiSetting build() {
            if (this.location_update_interval != null && this.report_gps != null && this.report_interval_seconds != null && this.report_at_start != null && this.nearby_location_prompt_interval != null) {
                return new PoiSetting(this, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.location_update_interval, "location_update_interval", this.report_gps, "report_gps", this.report_interval_seconds, "report_interval_seconds", this.report_at_start, "report_at_start", this.nearby_location_prompt_interval, "nearby_location_prompt_interval");
        }

        public final Builder collect_hint_action_interval(Integer num) {
            this.collect_hint_action_interval = num;
            return this;
        }

        public final Builder collect_hint_display_interval(Integer num) {
            this.collect_hint_display_interval = num;
            return this;
        }

        public final Builder life_service_assistant_url(String str) {
            this.life_service_assistant_url = str;
            return this;
        }

        public final Builder location_update_interval(Integer num) {
            this.location_update_interval = num;
            return this;
        }

        public final Builder max_pic_size(Integer num) {
            this.max_pic_size = num;
            return this;
        }

        public final Builder merchant_management_url(String str) {
            this.merchant_management_url = str;
            return this;
        }

        public final Builder merchant_settle_url(String str) {
            this.merchant_settle_url = str;
            return this;
        }

        public final Builder nearby_location_prompt_interval(Integer num) {
            this.nearby_location_prompt_interval = num;
            return this;
        }

        public final Builder poi_location_cache_duration(Integer num) {
            this.poi_location_cache_duration = num;
            return this;
        }

        public final Builder poi_location_delay_upload(Long l) {
            this.poi_location_delay_upload = l;
            return this;
        }

        public final Builder poi_open_regeo(Integer num) {
            this.poi_open_regeo = num;
            return this;
        }

        public final Builder poi_qa_list_url(String str) {
            this.poi_qa_list_url = str;
            return this;
        }

        public final Builder poi_region_list(String str) {
            this.poi_region_list = str;
            return this;
        }

        public final Builder report_at_start(Boolean bool) {
            this.report_at_start = bool;
            return this;
        }

        public final Builder report_bss_max(Integer num) {
            this.report_bss_max = num;
            return this;
        }

        public final Builder report_gps(Boolean bool) {
            this.report_gps = bool;
            return this;
        }

        public final Builder report_interval_seconds(Integer num) {
            this.report_interval_seconds = num;
            return this;
        }

        public final Builder report_wifi_max(Integer num) {
            this.report_wifi_max = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting$ProtoAdapter_PoiSetting */
    static final class ProtoAdapter_PoiSetting extends DefaultValueProtoAdapter<PoiSetting> {
        public final PoiSetting redact(PoiSetting poiSetting) {
            return poiSetting;
        }

        public ProtoAdapter_PoiSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiSetting.class);
        }

        public final PoiSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PoiSetting) null);
        }

        public final int encodedSize(PoiSetting poiSetting) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, poiSetting.location_update_interval) + ProtoAdapter.STRING.encodedSizeWithTag(2, poiSetting.merchant_settle_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, poiSetting.life_service_assistant_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, poiSetting.merchant_management_url) + ProtoAdapter.BOOL.encodedSizeWithTag(5, poiSetting.report_gps) + ProtoAdapter.INT32.encodedSizeWithTag(6, poiSetting.report_bss_max) + ProtoAdapter.INT32.encodedSizeWithTag(7, poiSetting.report_wifi_max) + ProtoAdapter.INT32.encodedSizeWithTag(8, poiSetting.report_interval_seconds) + ProtoAdapter.BOOL.encodedSizeWithTag(9, poiSetting.report_at_start) + ProtoAdapter.INT32.encodedSizeWithTag(10, poiSetting.nearby_location_prompt_interval) + ProtoAdapter.INT32.encodedSizeWithTag(11, poiSetting.max_pic_size) + ProtoAdapter.INT32.encodedSizeWithTag(12, poiSetting.collect_hint_action_interval) + ProtoAdapter.INT32.encodedSizeWithTag(13, poiSetting.collect_hint_display_interval) + ProtoAdapter.STRING.encodedSizeWithTag(14, poiSetting.poi_qa_list_url) + ProtoAdapter.STRING.encodedSizeWithTag(15, poiSetting.poi_region_list) + ProtoAdapter.INT32.encodedSizeWithTag(16, poiSetting.poi_open_regeo) + ProtoAdapter.INT32.encodedSizeWithTag(17, poiSetting.poi_location_cache_duration) + ProtoAdapter.INT64.encodedSizeWithTag(18, poiSetting.poi_location_delay_upload) + poiSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PoiSetting poiSetting) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, poiSetting.location_update_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, poiSetting.merchant_settle_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, poiSetting.life_service_assistant_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, poiSetting.merchant_management_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, poiSetting.report_gps);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, poiSetting.report_bss_max);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, poiSetting.report_wifi_max);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, poiSetting.report_interval_seconds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, poiSetting.report_at_start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, poiSetting.nearby_location_prompt_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, poiSetting.max_pic_size);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, poiSetting.collect_hint_action_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, poiSetting.collect_hint_display_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, poiSetting.poi_qa_list_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, poiSetting.poi_region_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, poiSetting.poi_open_regeo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, poiSetting.poi_location_cache_duration);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 18, poiSetting.poi_location_delay_upload);
            protoWriter.writeBytes(poiSetting.unknownFields());
        }

        public final PoiSetting decode(ProtoReader protoReader, PoiSetting poiSetting) throws IOException {
            Builder builder;
            PoiSetting poiSetting2 = (PoiSetting) C10938a.m32097a().mo26425a(PoiSetting.class, poiSetting);
            if (poiSetting2 != null) {
                builder = poiSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.location_update_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.merchant_settle_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.life_service_assistant_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.merchant_management_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.report_gps((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.report_bss_max((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.report_wifi_max((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.report_interval_seconds((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.report_at_start((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 10:
                            builder.nearby_location_prompt_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 11:
                            builder.max_pic_size((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.collect_hint_action_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.collect_hint_display_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.poi_qa_list_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.poi_region_list((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.poi_open_regeo((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.poi_location_cache_duration((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 18:
                            builder.poi_location_delay_upload((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (poiSetting2 != null) {
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

    public final Integer getLocationUpdateInterval() {
        return this.location_update_interval;
    }

    public final Integer getNearbyLocationPromptInterval() {
        return this.nearby_location_prompt_interval;
    }

    public final Boolean getReportAtStart() {
        return this.report_at_start;
    }

    public final Boolean getReportGps() {
        return this.report_gps;
    }

    public final Integer getReportIntervalSeconds() {
        return this.report_interval_seconds;
    }

    public final Integer getCollectHintActionInterval() throws NullValueException {
        if (this.collect_hint_action_interval != null) {
            return this.collect_hint_action_interval;
        }
        throw new NullValueException();
    }

    public final Integer getCollectHintDisplayInterval() throws NullValueException {
        if (this.collect_hint_display_interval != null) {
            return this.collect_hint_display_interval;
        }
        throw new NullValueException();
    }

    public final String getLifeServiceAssistantUrl() throws NullValueException {
        if (this.life_service_assistant_url != null) {
            return this.life_service_assistant_url;
        }
        throw new NullValueException();
    }

    public final Integer getMaxPicSize() throws NullValueException {
        if (this.max_pic_size != null) {
            return this.max_pic_size;
        }
        throw new NullValueException();
    }

    public final String getMerchantManagementUrl() throws NullValueException {
        if (this.merchant_management_url != null) {
            return this.merchant_management_url;
        }
        throw new NullValueException();
    }

    public final String getMerchantSettleUrl() throws NullValueException {
        if (this.merchant_settle_url != null) {
            return this.merchant_settle_url;
        }
        throw new NullValueException();
    }

    public final Integer getPoiLocationCacheDuration() throws NullValueException {
        if (this.poi_location_cache_duration != null) {
            return this.poi_location_cache_duration;
        }
        throw new NullValueException();
    }

    public final Long getPoiLocationDelayUpload() throws NullValueException {
        if (this.poi_location_delay_upload != null) {
            return this.poi_location_delay_upload;
        }
        throw new NullValueException();
    }

    public final Integer getPoiOpenRegeo() throws NullValueException {
        if (this.poi_open_regeo != null) {
            return this.poi_open_regeo;
        }
        throw new NullValueException();
    }

    public final String getPoiQaListUrl() throws NullValueException {
        if (this.poi_qa_list_url != null) {
            return this.poi_qa_list_url;
        }
        throw new NullValueException();
    }

    public final String getPoiRegionList() throws NullValueException {
        if (this.poi_region_list != null) {
            return this.poi_region_list;
        }
        throw new NullValueException();
    }

    public final Integer getReportBssMax() throws NullValueException {
        if (this.report_bss_max != null) {
            return this.report_bss_max;
        }
        throw new NullValueException();
    }

    public final Integer getReportWifiMax() throws NullValueException {
        if (this.report_wifi_max != null) {
            return this.report_wifi_max;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.location_update_interval = this.location_update_interval;
        builder.merchant_settle_url = this.merchant_settle_url;
        builder.life_service_assistant_url = this.life_service_assistant_url;
        builder.merchant_management_url = this.merchant_management_url;
        builder.report_gps = this.report_gps;
        builder.report_bss_max = this.report_bss_max;
        builder.report_wifi_max = this.report_wifi_max;
        builder.report_interval_seconds = this.report_interval_seconds;
        builder.report_at_start = this.report_at_start;
        builder.nearby_location_prompt_interval = this.nearby_location_prompt_interval;
        builder.max_pic_size = this.max_pic_size;
        builder.collect_hint_action_interval = this.collect_hint_action_interval;
        builder.collect_hint_display_interval = this.collect_hint_display_interval;
        builder.poi_qa_list_url = this.poi_qa_list_url;
        builder.poi_region_list = this.poi_region_list;
        builder.poi_open_regeo = this.poi_open_regeo;
        builder.poi_location_cache_duration = this.poi_location_cache_duration;
        builder.poi_location_delay_upload = this.poi_location_delay_upload;
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
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.location_update_interval.hashCode()) * 37;
        int i14 = 0;
        if (this.merchant_settle_url != null) {
            i = this.merchant_settle_url.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 37;
        if (this.life_service_assistant_url != null) {
            i2 = this.life_service_assistant_url.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 37;
        if (this.merchant_management_url != null) {
            i3 = this.merchant_management_url.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((i16 + i3) * 37) + this.report_gps.hashCode()) * 37;
        if (this.report_bss_max != null) {
            i4 = this.report_bss_max.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (hashCode2 + i4) * 37;
        if (this.report_wifi_max != null) {
            i5 = this.report_wifi_max.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode3 = (((((((i17 + i5) * 37) + this.report_interval_seconds.hashCode()) * 37) + this.report_at_start.hashCode()) * 37) + this.nearby_location_prompt_interval.hashCode()) * 37;
        if (this.max_pic_size != null) {
            i6 = this.max_pic_size.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (hashCode3 + i6) * 37;
        if (this.collect_hint_action_interval != null) {
            i7 = this.collect_hint_action_interval.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        if (this.collect_hint_display_interval != null) {
            i8 = this.collect_hint_display_interval.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        if (this.poi_qa_list_url != null) {
            i9 = this.poi_qa_list_url.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        if (this.poi_region_list != null) {
            i10 = this.poi_region_list.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        if (this.poi_open_regeo != null) {
            i11 = this.poi_open_regeo.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        if (this.poi_location_cache_duration != null) {
            i12 = this.poi_location_cache_duration.hashCode();
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 37;
        if (this.poi_location_delay_upload != null) {
            i14 = this.poi_location_delay_upload.hashCode();
        }
        int i25 = i24 + i14;
        this.hashCode = i25;
        return i25;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", location_update_interval=");
        sb.append(this.location_update_interval);
        if (this.merchant_settle_url != null) {
            sb.append(", merchant_settle_url=");
            sb.append(this.merchant_settle_url);
        }
        if (this.life_service_assistant_url != null) {
            sb.append(", life_service_assistant_url=");
            sb.append(this.life_service_assistant_url);
        }
        if (this.merchant_management_url != null) {
            sb.append(", merchant_management_url=");
            sb.append(this.merchant_management_url);
        }
        sb.append(", report_gps=");
        sb.append(this.report_gps);
        if (this.report_bss_max != null) {
            sb.append(", report_bss_max=");
            sb.append(this.report_bss_max);
        }
        if (this.report_wifi_max != null) {
            sb.append(", report_wifi_max=");
            sb.append(this.report_wifi_max);
        }
        sb.append(", report_interval_seconds=");
        sb.append(this.report_interval_seconds);
        sb.append(", report_at_start=");
        sb.append(this.report_at_start);
        sb.append(", nearby_location_prompt_interval=");
        sb.append(this.nearby_location_prompt_interval);
        if (this.max_pic_size != null) {
            sb.append(", max_pic_size=");
            sb.append(this.max_pic_size);
        }
        if (this.collect_hint_action_interval != null) {
            sb.append(", collect_hint_action_interval=");
            sb.append(this.collect_hint_action_interval);
        }
        if (this.collect_hint_display_interval != null) {
            sb.append(", collect_hint_display_interval=");
            sb.append(this.collect_hint_display_interval);
        }
        if (this.poi_qa_list_url != null) {
            sb.append(", poi_qa_list_url=");
            sb.append(this.poi_qa_list_url);
        }
        if (this.poi_region_list != null) {
            sb.append(", poi_region_list=");
            sb.append(this.poi_region_list);
        }
        if (this.poi_open_regeo != null) {
            sb.append(", poi_open_regeo=");
            sb.append(this.poi_open_regeo);
        }
        if (this.poi_location_cache_duration != null) {
            sb.append(", poi_location_cache_duration=");
            sb.append(this.poi_location_cache_duration);
        }
        if (this.poi_location_delay_upload != null) {
            sb.append(", poi_location_delay_upload=");
            sb.append(this.poi_location_delay_upload);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiSetting)) {
            return false;
        }
        PoiSetting poiSetting = (PoiSetting) obj;
        if (!unknownFields().equals(poiSetting.unknownFields()) || !this.location_update_interval.equals(poiSetting.location_update_interval) || !Internal.equals(this.merchant_settle_url, poiSetting.merchant_settle_url) || !Internal.equals(this.life_service_assistant_url, poiSetting.life_service_assistant_url) || !Internal.equals(this.merchant_management_url, poiSetting.merchant_management_url) || !this.report_gps.equals(poiSetting.report_gps) || !Internal.equals(this.report_bss_max, poiSetting.report_bss_max) || !Internal.equals(this.report_wifi_max, poiSetting.report_wifi_max) || !this.report_interval_seconds.equals(poiSetting.report_interval_seconds) || !this.report_at_start.equals(poiSetting.report_at_start) || !this.nearby_location_prompt_interval.equals(poiSetting.nearby_location_prompt_interval) || !Internal.equals(this.max_pic_size, poiSetting.max_pic_size) || !Internal.equals(this.collect_hint_action_interval, poiSetting.collect_hint_action_interval) || !Internal.equals(this.collect_hint_display_interval, poiSetting.collect_hint_display_interval) || !Internal.equals(this.poi_qa_list_url, poiSetting.poi_qa_list_url) || !Internal.equals(this.poi_region_list, poiSetting.poi_region_list) || !Internal.equals(this.poi_open_regeo, poiSetting.poi_open_regeo) || !Internal.equals(this.poi_location_cache_duration, poiSetting.poi_location_cache_duration) || !Internal.equals(this.poi_location_delay_upload, poiSetting.poi_location_delay_upload)) {
            return false;
        }
        return true;
    }

    public PoiSetting(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.location_update_interval = builder.location_update_interval;
        this.merchant_settle_url = builder.merchant_settle_url;
        this.life_service_assistant_url = builder.life_service_assistant_url;
        this.merchant_management_url = builder.merchant_management_url;
        this.report_gps = builder.report_gps;
        this.report_bss_max = builder.report_bss_max;
        this.report_wifi_max = builder.report_wifi_max;
        this.report_interval_seconds = builder.report_interval_seconds;
        this.report_at_start = builder.report_at_start;
        this.nearby_location_prompt_interval = builder.nearby_location_prompt_interval;
        this.max_pic_size = builder.max_pic_size;
        this.collect_hint_action_interval = builder.collect_hint_action_interval;
        this.collect_hint_display_interval = builder.collect_hint_display_interval;
        this.poi_qa_list_url = builder.poi_qa_list_url;
        this.poi_region_list = builder.poi_region_list;
        this.poi_open_regeo = builder.poi_open_regeo;
        this.poi_location_cache_duration = builder.poi_location_cache_duration;
        this.poi_location_delay_upload = builder.poi_location_delay_upload;
    }
}
