package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

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
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy */
public final class FlexibleUpdateStrategy extends Message<FlexibleUpdateStrategy, Builder> {
    public static final DefaultValueProtoAdapter<FlexibleUpdateStrategy> ADAPTER = new ProtoAdapter_FlexibleUpdateStrategy();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer allow_show_all_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer interval_days;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FlexibleUpdateStrategy, Builder> {
        public Integer allow_show_all_times = Integer.valueOf(0);
        public Integer interval_days = Integer.valueOf(0);

        public final FlexibleUpdateStrategy build() {
            if (this.interval_days != null && this.allow_show_all_times != null) {
                return new FlexibleUpdateStrategy(this.interval_days, this.allow_show_all_times, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.interval_days, "interval_days", this.allow_show_all_times, "allow_show_all_times");
        }

        public final Builder allow_show_all_times(Integer num) {
            this.allow_show_all_times = num;
            return this;
        }

        public final Builder interval_days(Integer num) {
            this.interval_days = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlexibleUpdateStrategy$ProtoAdapter_FlexibleUpdateStrategy */
    static final class ProtoAdapter_FlexibleUpdateStrategy extends DefaultValueProtoAdapter<FlexibleUpdateStrategy> {
        public final FlexibleUpdateStrategy redact(FlexibleUpdateStrategy flexibleUpdateStrategy) {
            return flexibleUpdateStrategy;
        }

        public ProtoAdapter_FlexibleUpdateStrategy() {
            super(FieldEncoding.LENGTH_DELIMITED, FlexibleUpdateStrategy.class);
        }

        public final FlexibleUpdateStrategy decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FlexibleUpdateStrategy) null);
        }

        public final int encodedSize(FlexibleUpdateStrategy flexibleUpdateStrategy) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, flexibleUpdateStrategy.interval_days) + ProtoAdapter.INT32.encodedSizeWithTag(2, flexibleUpdateStrategy.allow_show_all_times) + flexibleUpdateStrategy.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FlexibleUpdateStrategy flexibleUpdateStrategy) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, flexibleUpdateStrategy.interval_days);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, flexibleUpdateStrategy.allow_show_all_times);
            protoWriter.writeBytes(flexibleUpdateStrategy.unknownFields());
        }

        public final FlexibleUpdateStrategy decode(ProtoReader protoReader, FlexibleUpdateStrategy flexibleUpdateStrategy) throws IOException {
            Builder builder;
            FlexibleUpdateStrategy flexibleUpdateStrategy2 = (FlexibleUpdateStrategy) C10938a.m32097a().mo26425a(FlexibleUpdateStrategy.class, flexibleUpdateStrategy);
            if (flexibleUpdateStrategy2 != null) {
                builder = flexibleUpdateStrategy2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.interval_days((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.allow_show_all_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (flexibleUpdateStrategy2 != null) {
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

    public final Integer getAllowShowAllTimes() {
        return this.allow_show_all_times;
    }

    public final Integer getIntervalDays() {
        return this.interval_days;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.interval_days = this.interval_days;
        builder.allow_show_all_times = this.allow_show_all_times;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.interval_days.hashCode()) * 37) + this.allow_show_all_times.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", interval_days=");
        sb.append(this.interval_days);
        sb.append(", allow_show_all_times=");
        sb.append(this.allow_show_all_times);
        StringBuilder replace = sb.replace(0, 2, "FlexibleUpdateStrategy{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FlexibleUpdateStrategy)) {
            return false;
        }
        FlexibleUpdateStrategy flexibleUpdateStrategy = (FlexibleUpdateStrategy) obj;
        if (!unknownFields().equals(flexibleUpdateStrategy.unknownFields()) || !this.interval_days.equals(flexibleUpdateStrategy.interval_days) || !this.allow_show_all_times.equals(flexibleUpdateStrategy.allow_show_all_times)) {
            return false;
        }
        return true;
    }

    public FlexibleUpdateStrategy(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public FlexibleUpdateStrategy(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.interval_days = num;
        this.allow_show_all_times = num2;
    }
}
