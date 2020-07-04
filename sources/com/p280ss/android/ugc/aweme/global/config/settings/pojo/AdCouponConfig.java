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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdCouponConfig */
public final class AdCouponConfig extends Message<AdCouponConfig, Builder> {
    public static final DefaultValueProtoAdapter<AdCouponConfig> ADAPTER = new ProtoAdapter_AdCouponConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdCouponConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AdCouponConfig, Builder> {
        public Integer show;

        public final AdCouponConfig build() {
            return new AdCouponConfig(this.show, super.buildUnknownFields());
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdCouponConfig$ProtoAdapter_AdCouponConfig */
    static final class ProtoAdapter_AdCouponConfig extends DefaultValueProtoAdapter<AdCouponConfig> {
        public final AdCouponConfig redact(AdCouponConfig adCouponConfig) {
            return adCouponConfig;
        }

        public ProtoAdapter_AdCouponConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, AdCouponConfig.class);
        }

        public final AdCouponConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AdCouponConfig) null);
        }

        public final int encodedSize(AdCouponConfig adCouponConfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, adCouponConfig.show) + adCouponConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AdCouponConfig adCouponConfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, adCouponConfig.show);
            protoWriter.writeBytes(adCouponConfig.unknownFields());
        }

        public final AdCouponConfig decode(ProtoReader protoReader, AdCouponConfig adCouponConfig) throws IOException {
            Builder builder;
            AdCouponConfig adCouponConfig2 = (AdCouponConfig) C10938a.m32097a().mo26425a(AdCouponConfig.class, adCouponConfig);
            if (adCouponConfig2 != null) {
                builder = adCouponConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (adCouponConfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.show((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getShow() throws NullValueException {
        if (this.show != null) {
            return this.show;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.show != null) {
            i = this.show.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show = this.show;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show != null) {
            sb.append(", show=");
            sb.append(this.show);
        }
        StringBuilder replace = sb.replace(0, 2, "AdCouponConfig{");
        replace.append('}');
        return replace.toString();
    }

    public AdCouponConfig(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCouponConfig)) {
            return false;
        }
        AdCouponConfig adCouponConfig = (AdCouponConfig) obj;
        if (!unknownFields().equals(adCouponConfig.unknownFields()) || !Internal.equals(this.show, adCouponConfig.show)) {
            return false;
        }
        return true;
    }

    public AdCouponConfig(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
    }
}
