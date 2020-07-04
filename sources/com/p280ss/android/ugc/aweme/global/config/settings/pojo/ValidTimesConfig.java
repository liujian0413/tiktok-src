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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig */
public final class ValidTimesConfig extends Message<ValidTimesConfig, Builder> {
    public static final DefaultValueProtoAdapter<ValidTimesConfig> ADAPTER = new ProtoAdapter_ValidTimesConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = 0, tag = 2)
    public final Long end_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = 0, tag = 1)
    public final Long start_time;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ValidTimesConfig, Builder> {
        public Long end_time = Long.valueOf(0);
        public Long start_time = Long.valueOf(0);

        public final ValidTimesConfig build() {
            if (this.start_time != null && this.end_time != null) {
                return new ValidTimesConfig(this.start_time, this.end_time, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.start_time, "start_time", this.end_time, "end_time");
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig$ProtoAdapter_ValidTimesConfig */
    static final class ProtoAdapter_ValidTimesConfig extends DefaultValueProtoAdapter<ValidTimesConfig> {
        public final ValidTimesConfig redact(ValidTimesConfig validTimesConfig) {
            return validTimesConfig;
        }

        public ProtoAdapter_ValidTimesConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ValidTimesConfig.class);
        }

        public final ValidTimesConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ValidTimesConfig) null);
        }

        public final int encodedSize(ValidTimesConfig validTimesConfig) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, validTimesConfig.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, validTimesConfig.end_time) + validTimesConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ValidTimesConfig validTimesConfig) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, validTimesConfig.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, validTimesConfig.end_time);
            protoWriter.writeBytes(validTimesConfig.unknownFields());
        }

        public final ValidTimesConfig decode(ProtoReader protoReader, ValidTimesConfig validTimesConfig) throws IOException {
            Builder builder;
            ValidTimesConfig validTimesConfig2 = (ValidTimesConfig) C10938a.m32097a().mo26425a(ValidTimesConfig.class, validTimesConfig);
            if (validTimesConfig2 != null) {
                builder = validTimesConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
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
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (validTimesConfig2 != null) {
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

    public final Long getEndTime() {
        return this.end_time;
    }

    public final Long getStartTime() {
        return this.start_time;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.start_time.hashCode()) * 37) + this.end_time.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        StringBuilder replace = sb.replace(0, 2, "ValidTimesConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidTimesConfig)) {
            return false;
        }
        ValidTimesConfig validTimesConfig = (ValidTimesConfig) obj;
        if (!unknownFields().equals(validTimesConfig.unknownFields()) || !this.start_time.equals(validTimesConfig.start_time) || !this.end_time.equals(validTimesConfig.end_time)) {
            return false;
        }
        return true;
    }

    public ValidTimesConfig(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public ValidTimesConfig(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
    }
}
