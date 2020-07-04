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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig */
public final class SpringApiLimitConfig extends Message<SpringApiLimitConfig, Builder> {
    public static final DefaultValueProtoAdapter<SpringApiLimitConfig> ADAPTER = new ProtoAdapter_SpringApiLimitConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long batch_event_interval;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ApiConfigEntity#ADAPTER", label = 2, tag = 9)
    public final List<ApiConfigEntity> config_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean disable_fetch_setting;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean enable_delay_applog;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long end_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long limit_end_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long limit_start_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer send_launch_timely;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long start_time;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SpringApiLimitConfig, Builder> {
        public Long batch_event_interval;
        public List<ApiConfigEntity> config_list = Internal.newMutableList();
        public Boolean disable_fetch_setting;
        public Boolean enable_delay_applog;
        public Long end_time;
        public Long limit_end_time;
        public Long limit_start_time;
        public Integer send_launch_timely;
        public Long start_time;

        public final SpringApiLimitConfig build() {
            SpringApiLimitConfig springApiLimitConfig = new SpringApiLimitConfig(this.start_time, this.end_time, this.limit_start_time, this.limit_end_time, this.enable_delay_applog, this.batch_event_interval, this.disable_fetch_setting, this.send_launch_timely, this.config_list, super.buildUnknownFields());
            return springApiLimitConfig;
        }

        public final Builder batch_event_interval(Long l) {
            this.batch_event_interval = l;
            return this;
        }

        public final Builder disable_fetch_setting(Boolean bool) {
            this.disable_fetch_setting = bool;
            return this;
        }

        public final Builder enable_delay_applog(Boolean bool) {
            this.enable_delay_applog = bool;
            return this;
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder limit_end_time(Long l) {
            this.limit_end_time = l;
            return this;
        }

        public final Builder limit_start_time(Long l) {
            this.limit_start_time = l;
            return this;
        }

        public final Builder send_launch_timely(Integer num) {
            this.send_launch_timely = num;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder config_list(List<ApiConfigEntity> list) {
            Internal.checkElementsNotNull(list);
            this.config_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig$ProtoAdapter_SpringApiLimitConfig */
    static final class ProtoAdapter_SpringApiLimitConfig extends DefaultValueProtoAdapter<SpringApiLimitConfig> {
        public final SpringApiLimitConfig redact(SpringApiLimitConfig springApiLimitConfig) {
            return springApiLimitConfig;
        }

        public ProtoAdapter_SpringApiLimitConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, SpringApiLimitConfig.class);
        }

        public final SpringApiLimitConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (SpringApiLimitConfig) null);
        }

        public final int encodedSize(SpringApiLimitConfig springApiLimitConfig) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, springApiLimitConfig.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, springApiLimitConfig.end_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, springApiLimitConfig.limit_start_time) + ProtoAdapter.INT64.encodedSizeWithTag(4, springApiLimitConfig.limit_end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(5, springApiLimitConfig.enable_delay_applog) + ProtoAdapter.INT64.encodedSizeWithTag(6, springApiLimitConfig.batch_event_interval) + ProtoAdapter.BOOL.encodedSizeWithTag(7, springApiLimitConfig.disable_fetch_setting) + ProtoAdapter.INT32.encodedSizeWithTag(8, springApiLimitConfig.send_launch_timely) + ApiConfigEntity.ADAPTER.asRepeated().encodedSizeWithTag(9, springApiLimitConfig.config_list) + springApiLimitConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SpringApiLimitConfig springApiLimitConfig) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, springApiLimitConfig.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, springApiLimitConfig.end_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, springApiLimitConfig.limit_start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, springApiLimitConfig.limit_end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, springApiLimitConfig.enable_delay_applog);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, springApiLimitConfig.batch_event_interval);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, springApiLimitConfig.disable_fetch_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, springApiLimitConfig.send_launch_timely);
            ApiConfigEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, springApiLimitConfig.config_list);
            protoWriter.writeBytes(springApiLimitConfig.unknownFields());
        }

        public final SpringApiLimitConfig decode(ProtoReader protoReader, SpringApiLimitConfig springApiLimitConfig) throws IOException {
            Builder builder;
            SpringApiLimitConfig springApiLimitConfig2 = (SpringApiLimitConfig) C10938a.m32097a().mo26425a(SpringApiLimitConfig.class, springApiLimitConfig);
            if (springApiLimitConfig2 != null) {
                builder = springApiLimitConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<ApiConfigEntity> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.end_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.limit_start_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.limit_end_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.enable_delay_applog((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.batch_event_interval((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.disable_fetch_setting((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            builder.send_launch_timely((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            newMutableList.add(ApiConfigEntity.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(ApiConfigEntity.class)));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (springApiLimitConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.config_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<ApiConfigEntity> getConfigList() {
        return this.config_list;
    }

    public final Long getBatchEventInterval() throws NullValueException {
        if (this.batch_event_interval != null) {
            return this.batch_event_interval;
        }
        throw new NullValueException();
    }

    public final Boolean getDisableFetchSetting() throws NullValueException {
        if (this.disable_fetch_setting != null) {
            return this.disable_fetch_setting;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDelayApplog() throws NullValueException {
        if (this.enable_delay_applog != null) {
            return this.enable_delay_applog;
        }
        throw new NullValueException();
    }

    public final Long getEndTime() throws NullValueException {
        if (this.end_time != null) {
            return this.end_time;
        }
        throw new NullValueException();
    }

    public final Long getLimitEndTime() throws NullValueException {
        if (this.limit_end_time != null) {
            return this.limit_end_time;
        }
        throw new NullValueException();
    }

    public final Long getLimitStartTime() throws NullValueException {
        if (this.limit_start_time != null) {
            return this.limit_start_time;
        }
        throw new NullValueException();
    }

    public final Integer getSendLaunchTimely() throws NullValueException {
        if (this.send_launch_timely != null) {
            return this.send_launch_timely;
        }
        throw new NullValueException();
    }

    public final Long getStartTime() throws NullValueException {
        if (this.start_time != null) {
            return this.start_time;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.limit_start_time = this.limit_start_time;
        builder.limit_end_time = this.limit_end_time;
        builder.enable_delay_applog = this.enable_delay_applog;
        builder.batch_event_interval = this.batch_event_interval;
        builder.disable_fetch_setting = this.disable_fetch_setting;
        builder.send_launch_timely = this.send_launch_timely;
        builder.config_list = Internal.copyOf("config_list", this.config_list);
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.start_time != null) {
            i = this.start_time.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.end_time != null) {
            i2 = this.end_time.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.limit_start_time != null) {
            i3 = this.limit_start_time.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.limit_end_time != null) {
            i4 = this.limit_end_time.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.enable_delay_applog != null) {
            i5 = this.enable_delay_applog.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.batch_event_interval != null) {
            i6 = this.batch_event_interval.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.disable_fetch_setting != null) {
            i7 = this.disable_fetch_setting.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.send_launch_timely != null) {
            i9 = this.send_launch_timely.hashCode();
        }
        int hashCode2 = ((i16 + i9) * 37) + this.config_list.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.limit_start_time != null) {
            sb.append(", limit_start_time=");
            sb.append(this.limit_start_time);
        }
        if (this.limit_end_time != null) {
            sb.append(", limit_end_time=");
            sb.append(this.limit_end_time);
        }
        if (this.enable_delay_applog != null) {
            sb.append(", enable_delay_applog=");
            sb.append(this.enable_delay_applog);
        }
        if (this.batch_event_interval != null) {
            sb.append(", batch_event_interval=");
            sb.append(this.batch_event_interval);
        }
        if (this.disable_fetch_setting != null) {
            sb.append(", disable_fetch_setting=");
            sb.append(this.disable_fetch_setting);
        }
        if (this.send_launch_timely != null) {
            sb.append(", send_launch_timely=");
            sb.append(this.send_launch_timely);
        }
        if (!this.config_list.isEmpty()) {
            sb.append(", config_list=");
            sb.append(this.config_list);
        }
        StringBuilder replace = sb.replace(0, 2, "SpringApiLimitConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpringApiLimitConfig)) {
            return false;
        }
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) obj;
        if (!unknownFields().equals(springApiLimitConfig.unknownFields()) || !Internal.equals(this.start_time, springApiLimitConfig.start_time) || !Internal.equals(this.end_time, springApiLimitConfig.end_time) || !Internal.equals(this.limit_start_time, springApiLimitConfig.limit_start_time) || !Internal.equals(this.limit_end_time, springApiLimitConfig.limit_end_time) || !Internal.equals(this.enable_delay_applog, springApiLimitConfig.enable_delay_applog) || !Internal.equals(this.batch_event_interval, springApiLimitConfig.batch_event_interval) || !Internal.equals(this.disable_fetch_setting, springApiLimitConfig.disable_fetch_setting) || !Internal.equals(this.send_launch_timely, springApiLimitConfig.send_launch_timely) || !this.config_list.equals(springApiLimitConfig.config_list)) {
            return false;
        }
        return true;
    }

    public SpringApiLimitConfig(Long l, Long l2, Long l3, Long l4, Boolean bool, Long l5, Boolean bool2, Integer num, List<ApiConfigEntity> list) {
        this(l, l2, l3, l4, bool, l5, bool2, num, list, ByteString.EMPTY);
    }

    public SpringApiLimitConfig(Long l, Long l2, Long l3, Long l4, Boolean bool, Long l5, Boolean bool2, Integer num, List<ApiConfigEntity> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.limit_start_time = l3;
        this.limit_end_time = l4;
        this.enable_delay_applog = bool;
        this.batch_event_interval = l5;
        this.disable_fetch_setting = bool2;
        this.send_launch_timely = num;
        this.config_list = Internal.immutableCopyOf("config_list", list);
    }
}
