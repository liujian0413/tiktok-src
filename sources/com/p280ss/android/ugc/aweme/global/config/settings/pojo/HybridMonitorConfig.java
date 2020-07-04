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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig */
public final class HybridMonitorConfig extends Message<HybridMonitorConfig, Builder> {
    public static final DefaultValueProtoAdapter<HybridMonitorConfig> ADAPTER = new ProtoAdapter_HybridMonitorConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean h5_static_resource_report_enabled;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 5)
    public final List<String> h5_static_resource_report_white_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> perf_monitor_regex_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer rn_timing_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String slardar_sdk_config;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HybridMonitorConfig, Builder> {
        public Boolean h5_static_resource_report_enabled;
        public List<String> h5_static_resource_report_white_list = Internal.newMutableList();
        public List<String> perf_monitor_regex_list = Internal.newMutableList();
        public Integer rn_timing_interval;
        public String slardar_sdk_config;

        public final HybridMonitorConfig build() {
            HybridMonitorConfig hybridMonitorConfig = new HybridMonitorConfig(this.slardar_sdk_config, this.perf_monitor_regex_list, this.rn_timing_interval, this.h5_static_resource_report_enabled, this.h5_static_resource_report_white_list, super.buildUnknownFields());
            return hybridMonitorConfig;
        }

        public final Builder h5_static_resource_report_enabled(Boolean bool) {
            this.h5_static_resource_report_enabled = bool;
            return this;
        }

        public final Builder rn_timing_interval(Integer num) {
            this.rn_timing_interval = num;
            return this;
        }

        public final Builder slardar_sdk_config(String str) {
            this.slardar_sdk_config = str;
            return this;
        }

        public final Builder h5_static_resource_report_white_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.h5_static_resource_report_white_list = list;
            return this;
        }

        public final Builder perf_monitor_regex_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.perf_monitor_regex_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig$ProtoAdapter_HybridMonitorConfig */
    static final class ProtoAdapter_HybridMonitorConfig extends DefaultValueProtoAdapter<HybridMonitorConfig> {
        public final HybridMonitorConfig redact(HybridMonitorConfig hybridMonitorConfig) {
            return hybridMonitorConfig;
        }

        public ProtoAdapter_HybridMonitorConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, HybridMonitorConfig.class);
        }

        public final HybridMonitorConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (HybridMonitorConfig) null);
        }

        public final int encodedSize(HybridMonitorConfig hybridMonitorConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, hybridMonitorConfig.slardar_sdk_config) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, hybridMonitorConfig.perf_monitor_regex_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, hybridMonitorConfig.rn_timing_interval) + ProtoAdapter.BOOL.encodedSizeWithTag(4, hybridMonitorConfig.h5_static_resource_report_enabled) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, hybridMonitorConfig.h5_static_resource_report_white_list) + hybridMonitorConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, HybridMonitorConfig hybridMonitorConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, hybridMonitorConfig.slardar_sdk_config);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, hybridMonitorConfig.perf_monitor_regex_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, hybridMonitorConfig.rn_timing_interval);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, hybridMonitorConfig.h5_static_resource_report_enabled);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, hybridMonitorConfig.h5_static_resource_report_white_list);
            protoWriter.writeBytes(hybridMonitorConfig.unknownFields());
        }

        public final HybridMonitorConfig decode(ProtoReader protoReader, HybridMonitorConfig hybridMonitorConfig) throws IOException {
            Builder builder;
            HybridMonitorConfig hybridMonitorConfig2 = (HybridMonitorConfig) C10938a.m32097a().mo26425a(HybridMonitorConfig.class, hybridMonitorConfig);
            if (hybridMonitorConfig2 != null) {
                builder = hybridMonitorConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.slardar_sdk_config((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.rn_timing_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.h5_static_resource_report_enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (hybridMonitorConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.perf_monitor_regex_list = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.h5_static_resource_report_white_list = newMutableList2;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getH5StaticResourceReportWhiteList() {
        return this.h5_static_resource_report_white_list;
    }

    public final List<String> getPerfMonitorRegexList() {
        return this.perf_monitor_regex_list;
    }

    public final Boolean getH5StaticResourceReportEnabled() throws NullValueException {
        if (this.h5_static_resource_report_enabled != null) {
            return this.h5_static_resource_report_enabled;
        }
        throw new NullValueException();
    }

    public final Integer getRnTimingInterval() throws NullValueException {
        if (this.rn_timing_interval != null) {
            return this.rn_timing_interval;
        }
        throw new NullValueException();
    }

    public final String getSlardarSdkConfig() throws NullValueException {
        if (this.slardar_sdk_config != null) {
            return this.slardar_sdk_config;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.slardar_sdk_config = this.slardar_sdk_config;
        builder.perf_monitor_regex_list = Internal.copyOf("perf_monitor_regex_list", this.perf_monitor_regex_list);
        builder.rn_timing_interval = this.rn_timing_interval;
        builder.h5_static_resource_report_enabled = this.h5_static_resource_report_enabled;
        builder.h5_static_resource_report_white_list = Internal.copyOf("h5_static_resource_report_white_list", this.h5_static_resource_report_white_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.slardar_sdk_config != null) {
            i = this.slardar_sdk_config.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.perf_monitor_regex_list.hashCode()) * 37;
        if (this.rn_timing_interval != null) {
            i2 = this.rn_timing_interval.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode2 + i2) * 37;
        if (this.h5_static_resource_report_enabled != null) {
            i4 = this.h5_static_resource_report_enabled.hashCode();
        }
        int hashCode3 = ((i5 + i4) * 37) + this.h5_static_resource_report_white_list.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.slardar_sdk_config != null) {
            sb.append(", slardar_sdk_config=");
            sb.append(this.slardar_sdk_config);
        }
        if (!this.perf_monitor_regex_list.isEmpty()) {
            sb.append(", perf_monitor_regex_list=");
            sb.append(this.perf_monitor_regex_list);
        }
        if (this.rn_timing_interval != null) {
            sb.append(", rn_timing_interval=");
            sb.append(this.rn_timing_interval);
        }
        if (this.h5_static_resource_report_enabled != null) {
            sb.append(", h5_static_resource_report_enabled=");
            sb.append(this.h5_static_resource_report_enabled);
        }
        if (!this.h5_static_resource_report_white_list.isEmpty()) {
            sb.append(", h5_static_resource_report_white_list=");
            sb.append(this.h5_static_resource_report_white_list);
        }
        StringBuilder replace = sb.replace(0, 2, "HybridMonitorConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HybridMonitorConfig)) {
            return false;
        }
        HybridMonitorConfig hybridMonitorConfig = (HybridMonitorConfig) obj;
        if (!unknownFields().equals(hybridMonitorConfig.unknownFields()) || !Internal.equals(this.slardar_sdk_config, hybridMonitorConfig.slardar_sdk_config) || !this.perf_monitor_regex_list.equals(hybridMonitorConfig.perf_monitor_regex_list) || !Internal.equals(this.rn_timing_interval, hybridMonitorConfig.rn_timing_interval) || !Internal.equals(this.h5_static_resource_report_enabled, hybridMonitorConfig.h5_static_resource_report_enabled) || !this.h5_static_resource_report_white_list.equals(hybridMonitorConfig.h5_static_resource_report_white_list)) {
            return false;
        }
        return true;
    }

    public HybridMonitorConfig(String str, List<String> list, Integer num, Boolean bool, List<String> list2) {
        this(str, list, num, bool, list2, ByteString.EMPTY);
    }

    public HybridMonitorConfig(String str, List<String> list, Integer num, Boolean bool, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.slardar_sdk_config = str;
        this.perf_monitor_regex_list = Internal.immutableCopyOf("perf_monitor_regex_list", list);
        this.rn_timing_interval = num;
        this.h5_static_resource_report_enabled = bool;
        this.h5_static_resource_report_white_list = Internal.immutableCopyOf("h5_static_resource_report_white_list", list2);
    }
}
