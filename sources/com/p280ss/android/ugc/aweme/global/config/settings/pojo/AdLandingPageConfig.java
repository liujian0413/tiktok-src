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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig */
public final class AdLandingPageConfig extends Message<AdLandingPageConfig, Builder> {
    public static final DefaultValueProtoAdapter<AdLandingPageConfig> ADAPTER = new ProtoAdapter_AdLandingPageConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 3)
    public final List<String> ad_landing_page_auto_jump_allow_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean ad_landing_page_auto_jump_control_enabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 4)
    public final List<String> ad_landing_page_auto_jump_intercept_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean ad_landing_page_click_jump_control_enabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer ad_landing_page_click_jump_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String ad_landing_page_click_jump_interval_tips;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 8)
    public final List<String> ad_landing_page_pause_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer ad_landing_page_preload_cache_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 9)
    public final List<String> ad_landing_page_preload_common_channel;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 10)
    public final List<String> ad_landing_page_preload_common_prefix;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 14)
    public final Integer ad_landing_page_report_limit_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 13)
    public final Integer ad_landing_page_report_page_count;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String ad_landing_page_report_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public final Boolean ad_landing_page_report_wifi_only_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean enable_dynamic_navbar;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AdLandingPageConfig, Builder> {
        public List<String> ad_landing_page_auto_jump_allow_list = Internal.newMutableList();
        public Boolean ad_landing_page_auto_jump_control_enabled;
        public List<String> ad_landing_page_auto_jump_intercept_list = Internal.newMutableList();
        public Boolean ad_landing_page_click_jump_control_enabled;
        public Integer ad_landing_page_click_jump_interval;
        public String ad_landing_page_click_jump_interval_tips;
        public List<String> ad_landing_page_pause_list = Internal.newMutableList();
        public Integer ad_landing_page_preload_cache_count;
        public List<String> ad_landing_page_preload_common_channel = Internal.newMutableList();
        public List<String> ad_landing_page_preload_common_prefix = Internal.newMutableList();
        public Integer ad_landing_page_report_limit_times;
        public Integer ad_landing_page_report_page_count;
        public String ad_landing_page_report_url;
        public Boolean ad_landing_page_report_wifi_only_enable;
        public Boolean enable_dynamic_navbar;

        public final AdLandingPageConfig build() {
            AdLandingPageConfig adLandingPageConfig = new AdLandingPageConfig(this.ad_landing_page_auto_jump_control_enabled, this.ad_landing_page_click_jump_control_enabled, this.ad_landing_page_auto_jump_allow_list, this.ad_landing_page_auto_jump_intercept_list, this.ad_landing_page_click_jump_interval, this.ad_landing_page_click_jump_interval_tips, this.enable_dynamic_navbar, this.ad_landing_page_pause_list, this.ad_landing_page_preload_common_channel, this.ad_landing_page_preload_common_prefix, this.ad_landing_page_preload_cache_count, this.ad_landing_page_report_wifi_only_enable, this.ad_landing_page_report_page_count, this.ad_landing_page_report_limit_times, this.ad_landing_page_report_url, super.buildUnknownFields());
            return adLandingPageConfig;
        }

        public final Builder ad_landing_page_auto_jump_control_enabled(Boolean bool) {
            this.ad_landing_page_auto_jump_control_enabled = bool;
            return this;
        }

        public final Builder ad_landing_page_click_jump_control_enabled(Boolean bool) {
            this.ad_landing_page_click_jump_control_enabled = bool;
            return this;
        }

        public final Builder ad_landing_page_click_jump_interval(Integer num) {
            this.ad_landing_page_click_jump_interval = num;
            return this;
        }

        public final Builder ad_landing_page_click_jump_interval_tips(String str) {
            this.ad_landing_page_click_jump_interval_tips = str;
            return this;
        }

        public final Builder ad_landing_page_preload_cache_count(Integer num) {
            this.ad_landing_page_preload_cache_count = num;
            return this;
        }

        public final Builder ad_landing_page_report_limit_times(Integer num) {
            this.ad_landing_page_report_limit_times = num;
            return this;
        }

        public final Builder ad_landing_page_report_page_count(Integer num) {
            this.ad_landing_page_report_page_count = num;
            return this;
        }

        public final Builder ad_landing_page_report_url(String str) {
            this.ad_landing_page_report_url = str;
            return this;
        }

        public final Builder ad_landing_page_report_wifi_only_enable(Boolean bool) {
            this.ad_landing_page_report_wifi_only_enable = bool;
            return this;
        }

        public final Builder enable_dynamic_navbar(Boolean bool) {
            this.enable_dynamic_navbar = bool;
            return this;
        }

        public final Builder ad_landing_page_auto_jump_allow_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_auto_jump_allow_list = list;
            return this;
        }

        public final Builder ad_landing_page_auto_jump_intercept_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_auto_jump_intercept_list = list;
            return this;
        }

        public final Builder ad_landing_page_pause_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_pause_list = list;
            return this;
        }

        public final Builder ad_landing_page_preload_common_channel(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_preload_common_channel = list;
            return this;
        }

        public final Builder ad_landing_page_preload_common_prefix(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ad_landing_page_preload_common_prefix = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig$ProtoAdapter_AdLandingPageConfig */
    static final class ProtoAdapter_AdLandingPageConfig extends DefaultValueProtoAdapter<AdLandingPageConfig> {
        public final AdLandingPageConfig redact(AdLandingPageConfig adLandingPageConfig) {
            return adLandingPageConfig;
        }

        public ProtoAdapter_AdLandingPageConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, AdLandingPageConfig.class);
        }

        public final AdLandingPageConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AdLandingPageConfig) null);
        }

        public final int encodedSize(AdLandingPageConfig adLandingPageConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, adLandingPageConfig.ad_landing_page_auto_jump_control_enabled) + ProtoAdapter.BOOL.encodedSizeWithTag(2, adLandingPageConfig.ad_landing_page_click_jump_control_enabled) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, adLandingPageConfig.ad_landing_page_auto_jump_allow_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, adLandingPageConfig.ad_landing_page_auto_jump_intercept_list) + ProtoAdapter.INT32.encodedSizeWithTag(5, adLandingPageConfig.ad_landing_page_click_jump_interval) + ProtoAdapter.STRING.encodedSizeWithTag(6, adLandingPageConfig.ad_landing_page_click_jump_interval_tips) + ProtoAdapter.BOOL.encodedSizeWithTag(7, adLandingPageConfig.enable_dynamic_navbar) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, adLandingPageConfig.ad_landing_page_pause_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, adLandingPageConfig.ad_landing_page_preload_common_channel) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, adLandingPageConfig.ad_landing_page_preload_common_prefix) + ProtoAdapter.INT32.encodedSizeWithTag(11, adLandingPageConfig.ad_landing_page_preload_cache_count) + ProtoAdapter.BOOL.encodedSizeWithTag(12, adLandingPageConfig.ad_landing_page_report_wifi_only_enable) + ProtoAdapter.INT32.encodedSizeWithTag(13, adLandingPageConfig.ad_landing_page_report_page_count) + ProtoAdapter.INT32.encodedSizeWithTag(14, adLandingPageConfig.ad_landing_page_report_limit_times) + ProtoAdapter.STRING.encodedSizeWithTag(15, adLandingPageConfig.ad_landing_page_report_url) + adLandingPageConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AdLandingPageConfig adLandingPageConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, adLandingPageConfig.ad_landing_page_auto_jump_control_enabled);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, adLandingPageConfig.ad_landing_page_click_jump_control_enabled);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, adLandingPageConfig.ad_landing_page_auto_jump_allow_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, adLandingPageConfig.ad_landing_page_auto_jump_intercept_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, adLandingPageConfig.ad_landing_page_click_jump_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, adLandingPageConfig.ad_landing_page_click_jump_interval_tips);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, adLandingPageConfig.enable_dynamic_navbar);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, adLandingPageConfig.ad_landing_page_pause_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, adLandingPageConfig.ad_landing_page_preload_common_channel);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, adLandingPageConfig.ad_landing_page_preload_common_prefix);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, adLandingPageConfig.ad_landing_page_preload_cache_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, adLandingPageConfig.ad_landing_page_report_wifi_only_enable);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, adLandingPageConfig.ad_landing_page_report_page_count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, adLandingPageConfig.ad_landing_page_report_limit_times);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, adLandingPageConfig.ad_landing_page_report_url);
            protoWriter.writeBytes(adLandingPageConfig.unknownFields());
        }

        public final AdLandingPageConfig decode(ProtoReader protoReader, AdLandingPageConfig adLandingPageConfig) throws IOException {
            Builder builder;
            AdLandingPageConfig adLandingPageConfig2 = (AdLandingPageConfig) C10938a.m32097a().mo26425a(AdLandingPageConfig.class, adLandingPageConfig);
            if (adLandingPageConfig2 != null) {
                builder = adLandingPageConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            List<String> newMutableList3 = Internal.newMutableList();
            List<String> newMutableList4 = Internal.newMutableList();
            List<String> newMutableList5 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ad_landing_page_auto_jump_control_enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_landing_page_click_jump_control_enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.ad_landing_page_click_jump_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.ad_landing_page_click_jump_interval_tips((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.enable_dynamic_navbar((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            newMutableList3.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            newMutableList4.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            newMutableList5.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.ad_landing_page_preload_cache_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 12:
                            builder.ad_landing_page_report_wifi_only_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 13:
                            builder.ad_landing_page_report_page_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 14:
                            builder.ad_landing_page_report_limit_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 15:
                            builder.ad_landing_page_report_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (adLandingPageConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.ad_landing_page_auto_jump_allow_list = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.ad_landing_page_auto_jump_intercept_list = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder.ad_landing_page_pause_list = newMutableList3;
                    }
                    if (!newMutableList4.isEmpty()) {
                        builder.ad_landing_page_preload_common_channel = newMutableList4;
                    }
                    if (!newMutableList5.isEmpty()) {
                        builder.ad_landing_page_preload_common_prefix = newMutableList5;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getAdLandingPageAutoJumpAllowList() {
        return this.ad_landing_page_auto_jump_allow_list;
    }

    public final List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.ad_landing_page_auto_jump_intercept_list;
    }

    public final List<String> getAdLandingPagePauseList() {
        return this.ad_landing_page_pause_list;
    }

    public final List<String> getAdLandingPagePreloadCommonChannel() {
        return this.ad_landing_page_preload_common_channel;
    }

    public final List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.ad_landing_page_preload_common_prefix;
    }

    public final Boolean getAdLandingPageAutoJumpControlEnabled() throws NullValueException {
        if (this.ad_landing_page_auto_jump_control_enabled != null) {
            return this.ad_landing_page_auto_jump_control_enabled;
        }
        throw new NullValueException();
    }

    public final Boolean getAdLandingPageClickJumpControlEnabled() throws NullValueException {
        if (this.ad_landing_page_click_jump_control_enabled != null) {
            return this.ad_landing_page_click_jump_control_enabled;
        }
        throw new NullValueException();
    }

    public final Integer getAdLandingPageClickJumpInterval() throws NullValueException {
        if (this.ad_landing_page_click_jump_interval != null) {
            return this.ad_landing_page_click_jump_interval;
        }
        throw new NullValueException();
    }

    public final String getAdLandingPageClickJumpIntervalTips() throws NullValueException {
        if (this.ad_landing_page_click_jump_interval_tips != null) {
            return this.ad_landing_page_click_jump_interval_tips;
        }
        throw new NullValueException();
    }

    public final Integer getAdLandingPagePreloadCacheCount() throws NullValueException {
        if (this.ad_landing_page_preload_cache_count != null) {
            return this.ad_landing_page_preload_cache_count;
        }
        throw new NullValueException();
    }

    public final Integer getAdLandingPageReportLimitTimes() throws NullValueException {
        if (this.ad_landing_page_report_limit_times != null) {
            return this.ad_landing_page_report_limit_times;
        }
        throw new NullValueException();
    }

    public final Integer getAdLandingPageReportPageCount() throws NullValueException {
        if (this.ad_landing_page_report_page_count != null) {
            return this.ad_landing_page_report_page_count;
        }
        throw new NullValueException();
    }

    public final String getAdLandingPageReportUrl() throws NullValueException {
        if (this.ad_landing_page_report_url != null) {
            return this.ad_landing_page_report_url;
        }
        throw new NullValueException();
    }

    public final Boolean getAdLandingPageReportWifiOnlyEnable() throws NullValueException {
        if (this.ad_landing_page_report_wifi_only_enable != null) {
            return this.ad_landing_page_report_wifi_only_enable;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDynamicNavbar() throws NullValueException {
        if (this.enable_dynamic_navbar != null) {
            return this.enable_dynamic_navbar;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_landing_page_auto_jump_control_enabled = this.ad_landing_page_auto_jump_control_enabled;
        builder.ad_landing_page_click_jump_control_enabled = this.ad_landing_page_click_jump_control_enabled;
        builder.ad_landing_page_auto_jump_allow_list = Internal.copyOf("ad_landing_page_auto_jump_allow_list", this.ad_landing_page_auto_jump_allow_list);
        builder.ad_landing_page_auto_jump_intercept_list = Internal.copyOf("ad_landing_page_auto_jump_intercept_list", this.ad_landing_page_auto_jump_intercept_list);
        builder.ad_landing_page_click_jump_interval = this.ad_landing_page_click_jump_interval;
        builder.ad_landing_page_click_jump_interval_tips = this.ad_landing_page_click_jump_interval_tips;
        builder.enable_dynamic_navbar = this.enable_dynamic_navbar;
        builder.ad_landing_page_pause_list = Internal.copyOf("ad_landing_page_pause_list", this.ad_landing_page_pause_list);
        builder.ad_landing_page_preload_common_channel = Internal.copyOf("ad_landing_page_preload_common_channel", this.ad_landing_page_preload_common_channel);
        builder.ad_landing_page_preload_common_prefix = Internal.copyOf("ad_landing_page_preload_common_prefix", this.ad_landing_page_preload_common_prefix);
        builder.ad_landing_page_preload_cache_count = this.ad_landing_page_preload_cache_count;
        builder.ad_landing_page_report_wifi_only_enable = this.ad_landing_page_report_wifi_only_enable;
        builder.ad_landing_page_report_page_count = this.ad_landing_page_report_page_count;
        builder.ad_landing_page_report_limit_times = this.ad_landing_page_report_limit_times;
        builder.ad_landing_page_report_url = this.ad_landing_page_report_url;
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
        if (this.ad_landing_page_auto_jump_control_enabled != null) {
            i = this.ad_landing_page_auto_jump_control_enabled.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.ad_landing_page_click_jump_control_enabled != null) {
            i2 = this.ad_landing_page_click_jump_control_enabled.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((((i12 + i2) * 37) + this.ad_landing_page_auto_jump_allow_list.hashCode()) * 37) + this.ad_landing_page_auto_jump_intercept_list.hashCode()) * 37;
        if (this.ad_landing_page_click_jump_interval != null) {
            i3 = this.ad_landing_page_click_jump_interval.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (hashCode2 + i3) * 37;
        if (this.ad_landing_page_click_jump_interval_tips != null) {
            i4 = this.ad_landing_page_click_jump_interval_tips.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.enable_dynamic_navbar != null) {
            i5 = this.enable_dynamic_navbar.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode3 = (((((((i14 + i5) * 37) + this.ad_landing_page_pause_list.hashCode()) * 37) + this.ad_landing_page_preload_common_channel.hashCode()) * 37) + this.ad_landing_page_preload_common_prefix.hashCode()) * 37;
        if (this.ad_landing_page_preload_cache_count != null) {
            i6 = this.ad_landing_page_preload_cache_count.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (hashCode3 + i6) * 37;
        if (this.ad_landing_page_report_wifi_only_enable != null) {
            i7 = this.ad_landing_page_report_wifi_only_enable.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.ad_landing_page_report_page_count != null) {
            i8 = this.ad_landing_page_report_page_count.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 37;
        if (this.ad_landing_page_report_limit_times != null) {
            i9 = this.ad_landing_page_report_limit_times.hashCode();
        } else {
            i9 = 0;
        }
        int i18 = (i17 + i9) * 37;
        if (this.ad_landing_page_report_url != null) {
            i11 = this.ad_landing_page_report_url.hashCode();
        }
        int i19 = i18 + i11;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_landing_page_auto_jump_control_enabled != null) {
            sb.append(", ad_landing_page_auto_jump_control_enabled=");
            sb.append(this.ad_landing_page_auto_jump_control_enabled);
        }
        if (this.ad_landing_page_click_jump_control_enabled != null) {
            sb.append(", ad_landing_page_click_jump_control_enabled=");
            sb.append(this.ad_landing_page_click_jump_control_enabled);
        }
        if (!this.ad_landing_page_auto_jump_allow_list.isEmpty()) {
            sb.append(", ad_landing_page_auto_jump_allow_list=");
            sb.append(this.ad_landing_page_auto_jump_allow_list);
        }
        if (!this.ad_landing_page_auto_jump_intercept_list.isEmpty()) {
            sb.append(", ad_landing_page_auto_jump_intercept_list=");
            sb.append(this.ad_landing_page_auto_jump_intercept_list);
        }
        if (this.ad_landing_page_click_jump_interval != null) {
            sb.append(", ad_landing_page_click_jump_interval=");
            sb.append(this.ad_landing_page_click_jump_interval);
        }
        if (this.ad_landing_page_click_jump_interval_tips != null) {
            sb.append(", ad_landing_page_click_jump_interval_tips=");
            sb.append(this.ad_landing_page_click_jump_interval_tips);
        }
        if (this.enable_dynamic_navbar != null) {
            sb.append(", enable_dynamic_navbar=");
            sb.append(this.enable_dynamic_navbar);
        }
        if (!this.ad_landing_page_pause_list.isEmpty()) {
            sb.append(", ad_landing_page_pause_list=");
            sb.append(this.ad_landing_page_pause_list);
        }
        if (!this.ad_landing_page_preload_common_channel.isEmpty()) {
            sb.append(", ad_landing_page_preload_common_channel=");
            sb.append(this.ad_landing_page_preload_common_channel);
        }
        if (!this.ad_landing_page_preload_common_prefix.isEmpty()) {
            sb.append(", ad_landing_page_preload_common_prefix=");
            sb.append(this.ad_landing_page_preload_common_prefix);
        }
        if (this.ad_landing_page_preload_cache_count != null) {
            sb.append(", ad_landing_page_preload_cache_count=");
            sb.append(this.ad_landing_page_preload_cache_count);
        }
        if (this.ad_landing_page_report_wifi_only_enable != null) {
            sb.append(", ad_landing_page_report_wifi_only_enable=");
            sb.append(this.ad_landing_page_report_wifi_only_enable);
        }
        if (this.ad_landing_page_report_page_count != null) {
            sb.append(", ad_landing_page_report_page_count=");
            sb.append(this.ad_landing_page_report_page_count);
        }
        if (this.ad_landing_page_report_limit_times != null) {
            sb.append(", ad_landing_page_report_limit_times=");
            sb.append(this.ad_landing_page_report_limit_times);
        }
        if (this.ad_landing_page_report_url != null) {
            sb.append(", ad_landing_page_report_url=");
            sb.append(this.ad_landing_page_report_url);
        }
        StringBuilder replace = sb.replace(0, 2, "AdLandingPageConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdLandingPageConfig)) {
            return false;
        }
        AdLandingPageConfig adLandingPageConfig = (AdLandingPageConfig) obj;
        if (!unknownFields().equals(adLandingPageConfig.unknownFields()) || !Internal.equals(this.ad_landing_page_auto_jump_control_enabled, adLandingPageConfig.ad_landing_page_auto_jump_control_enabled) || !Internal.equals(this.ad_landing_page_click_jump_control_enabled, adLandingPageConfig.ad_landing_page_click_jump_control_enabled) || !this.ad_landing_page_auto_jump_allow_list.equals(adLandingPageConfig.ad_landing_page_auto_jump_allow_list) || !this.ad_landing_page_auto_jump_intercept_list.equals(adLandingPageConfig.ad_landing_page_auto_jump_intercept_list) || !Internal.equals(this.ad_landing_page_click_jump_interval, adLandingPageConfig.ad_landing_page_click_jump_interval) || !Internal.equals(this.ad_landing_page_click_jump_interval_tips, adLandingPageConfig.ad_landing_page_click_jump_interval_tips) || !Internal.equals(this.enable_dynamic_navbar, adLandingPageConfig.enable_dynamic_navbar) || !this.ad_landing_page_pause_list.equals(adLandingPageConfig.ad_landing_page_pause_list) || !this.ad_landing_page_preload_common_channel.equals(adLandingPageConfig.ad_landing_page_preload_common_channel) || !this.ad_landing_page_preload_common_prefix.equals(adLandingPageConfig.ad_landing_page_preload_common_prefix) || !Internal.equals(this.ad_landing_page_preload_cache_count, adLandingPageConfig.ad_landing_page_preload_cache_count) || !Internal.equals(this.ad_landing_page_report_wifi_only_enable, adLandingPageConfig.ad_landing_page_report_wifi_only_enable) || !Internal.equals(this.ad_landing_page_report_page_count, adLandingPageConfig.ad_landing_page_report_page_count) || !Internal.equals(this.ad_landing_page_report_limit_times, adLandingPageConfig.ad_landing_page_report_limit_times) || !Internal.equals(this.ad_landing_page_report_url, adLandingPageConfig.ad_landing_page_report_url)) {
            return false;
        }
        return true;
    }

    public AdLandingPageConfig(Boolean bool, Boolean bool2, List<String> list, List<String> list2, Integer num, String str, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, Integer num2, Boolean bool4, Integer num3, Integer num4, String str2) {
        this(bool, bool2, list, list2, num, str, bool3, list3, list4, list5, num2, bool4, num3, num4, str2, ByteString.EMPTY);
    }

    public AdLandingPageConfig(Boolean bool, Boolean bool2, List<String> list, List<String> list2, Integer num, String str, Boolean bool3, List<String> list3, List<String> list4, List<String> list5, Integer num2, Boolean bool4, Integer num3, Integer num4, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_landing_page_auto_jump_control_enabled = bool;
        this.ad_landing_page_click_jump_control_enabled = bool2;
        List<String> list6 = list;
        this.ad_landing_page_auto_jump_allow_list = Internal.immutableCopyOf("ad_landing_page_auto_jump_allow_list", list);
        List<String> list7 = list2;
        this.ad_landing_page_auto_jump_intercept_list = Internal.immutableCopyOf("ad_landing_page_auto_jump_intercept_list", list2);
        this.ad_landing_page_click_jump_interval = num;
        this.ad_landing_page_click_jump_interval_tips = str;
        this.enable_dynamic_navbar = bool3;
        List<String> list8 = list3;
        this.ad_landing_page_pause_list = Internal.immutableCopyOf("ad_landing_page_pause_list", list3);
        List<String> list9 = list4;
        this.ad_landing_page_preload_common_channel = Internal.immutableCopyOf("ad_landing_page_preload_common_channel", list4);
        List<String> list10 = list5;
        this.ad_landing_page_preload_common_prefix = Internal.immutableCopyOf("ad_landing_page_preload_common_prefix", list5);
        this.ad_landing_page_preload_cache_count = num2;
        this.ad_landing_page_report_wifi_only_enable = bool4;
        this.ad_landing_page_report_page_count = num3;
        this.ad_landing_page_report_limit_times = num4;
        this.ad_landing_page_report_url = str2;
    }
}
