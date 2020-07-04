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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig */
public final class FEConfig extends Message<FEConfig, Builder> {
    public static final DefaultValueProtoAdapter<FEConfig> ADAPTER = new ProtoAdapter_FEConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String fallback_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String schema;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FEConfig, Builder> {
        public String fallback_url;
        public String schema;

        public final FEConfig build() {
            return new FEConfig(this.fallback_url, this.schema, super.buildUnknownFields());
        }

        public final Builder fallback_url(String str) {
            this.fallback_url = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FEConfig$ProtoAdapter_FEConfig */
    static final class ProtoAdapter_FEConfig extends DefaultValueProtoAdapter<FEConfig> {
        public final FEConfig redact(FEConfig fEConfig) {
            return fEConfig;
        }

        public ProtoAdapter_FEConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, FEConfig.class);
        }

        public final FEConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FEConfig) null);
        }

        public final int encodedSize(FEConfig fEConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fEConfig.fallback_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, fEConfig.schema) + fEConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FEConfig fEConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fEConfig.fallback_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, fEConfig.schema);
            protoWriter.writeBytes(fEConfig.unknownFields());
        }

        public final FEConfig decode(ProtoReader protoReader, FEConfig fEConfig) throws IOException {
            Builder builder;
            FEConfig fEConfig2 = (FEConfig) C10938a.m32097a().mo26425a(FEConfig.class, fEConfig);
            if (fEConfig2 != null) {
                builder = fEConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.fallback_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (fEConfig2 != null) {
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

    public final String getFallbackUrl() throws NullValueException {
        if (this.fallback_url != null) {
            return this.fallback_url;
        }
        throw new NullValueException();
    }

    public final String getSchema() throws NullValueException {
        if (this.schema != null) {
            return this.schema;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.fallback_url = this.fallback_url;
        builder.schema = this.schema;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.fallback_url != null) {
            i = this.fallback_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.schema != null) {
            i3 = this.schema.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fallback_url != null) {
            sb.append(", fallback_url=");
            sb.append(this.fallback_url);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        StringBuilder replace = sb.replace(0, 2, "FEConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FEConfig)) {
            return false;
        }
        FEConfig fEConfig = (FEConfig) obj;
        if (!unknownFields().equals(fEConfig.unknownFields()) || !Internal.equals(this.fallback_url, fEConfig.fallback_url) || !Internal.equals(this.schema, fEConfig.schema)) {
            return false;
        }
        return true;
    }

    public FEConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public FEConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fallback_url = str;
        this.schema = str2;
    }
}
