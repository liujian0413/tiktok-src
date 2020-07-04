package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig */
public final class PublishSyncDuoshanAllConfig extends Message<PublishSyncDuoshanAllConfig, Builder> {
    public static final DefaultValueProtoAdapter<PublishSyncDuoshanAllConfig> ADAPTER = new ProtoAdapter_PublishSyncDuoshanAllConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig#ADAPTER", tag = 1)
    public final PublishSyncDuoshanConfig register_duoshan;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanConfig#ADAPTER", tag = 2)
    public final PublishSyncDuoshanConfig ungister_duoshan;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PublishSyncDuoshanAllConfig, Builder> {
        public PublishSyncDuoshanConfig register_duoshan;
        public PublishSyncDuoshanConfig ungister_duoshan;

        public final PublishSyncDuoshanAllConfig build() {
            return new PublishSyncDuoshanAllConfig(this.register_duoshan, this.ungister_duoshan, super.buildUnknownFields());
        }

        public final Builder register_duoshan(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            this.register_duoshan = publishSyncDuoshanConfig;
            return this;
        }

        public final Builder ungister_duoshan(PublishSyncDuoshanConfig publishSyncDuoshanConfig) {
            this.ungister_duoshan = publishSyncDuoshanConfig;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig$ProtoAdapter_PublishSyncDuoshanAllConfig */
    static final class ProtoAdapter_PublishSyncDuoshanAllConfig extends DefaultValueProtoAdapter<PublishSyncDuoshanAllConfig> {
        public final PublishSyncDuoshanAllConfig redact(PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) {
            return publishSyncDuoshanAllConfig;
        }

        public ProtoAdapter_PublishSyncDuoshanAllConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, PublishSyncDuoshanAllConfig.class);
        }

        public final PublishSyncDuoshanAllConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (PublishSyncDuoshanAllConfig) null);
        }

        public final int encodedSize(PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) {
            return PublishSyncDuoshanConfig.ADAPTER.encodedSizeWithTag(1, publishSyncDuoshanAllConfig.register_duoshan) + PublishSyncDuoshanConfig.ADAPTER.encodedSizeWithTag(2, publishSyncDuoshanAllConfig.ungister_duoshan) + publishSyncDuoshanAllConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) throws IOException {
            PublishSyncDuoshanConfig.ADAPTER.encodeWithTag(protoWriter, 1, publishSyncDuoshanAllConfig.register_duoshan);
            PublishSyncDuoshanConfig.ADAPTER.encodeWithTag(protoWriter, 2, publishSyncDuoshanAllConfig.ungister_duoshan);
            protoWriter.writeBytes(publishSyncDuoshanAllConfig.unknownFields());
        }

        public final PublishSyncDuoshanAllConfig decode(ProtoReader protoReader, PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig) throws IOException {
            Builder builder;
            PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig2 = (PublishSyncDuoshanAllConfig) C10938a.m32097a().mo26425a(PublishSyncDuoshanAllConfig.class, publishSyncDuoshanAllConfig);
            if (publishSyncDuoshanAllConfig2 != null) {
                builder = publishSyncDuoshanAllConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.register_duoshan((PublishSyncDuoshanConfig) PublishSyncDuoshanConfig.ADAPTER.decode(protoReader, builder.register_duoshan));
                            break;
                        case 2:
                            builder.ungister_duoshan((PublishSyncDuoshanConfig) PublishSyncDuoshanConfig.ADAPTER.decode(protoReader, builder.ungister_duoshan));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (publishSyncDuoshanAllConfig2 != null) {
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

    public final PublishSyncDuoshanConfig getRegisterDuoshan() throws NullValueException {
        if (this.register_duoshan != null) {
            return this.register_duoshan;
        }
        throw new NullValueException();
    }

    public final PublishSyncDuoshanConfig getUngisterDuoshan() throws NullValueException {
        if (this.ungister_duoshan != null) {
            return this.ungister_duoshan;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.register_duoshan = this.register_duoshan;
        builder.ungister_duoshan = this.ungister_duoshan;
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
        if (this.register_duoshan != null) {
            i = this.register_duoshan.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.ungister_duoshan != null) {
            i3 = this.ungister_duoshan.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.register_duoshan != null) {
            sb.append(", register_duoshan=");
            sb.append(this.register_duoshan);
        }
        if (this.ungister_duoshan != null) {
            sb.append(", ungister_duoshan=");
            sb.append(this.ungister_duoshan);
        }
        StringBuilder replace = sb.replace(0, 2, "PublishSyncDuoshanAllConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublishSyncDuoshanAllConfig)) {
            return false;
        }
        PublishSyncDuoshanAllConfig publishSyncDuoshanAllConfig = (PublishSyncDuoshanAllConfig) obj;
        if (!unknownFields().equals(publishSyncDuoshanAllConfig.unknownFields()) || !Internal.equals(this.register_duoshan, publishSyncDuoshanAllConfig.register_duoshan) || !Internal.equals(this.ungister_duoshan, publishSyncDuoshanAllConfig.ungister_duoshan)) {
            return false;
        }
        return true;
    }

    public PublishSyncDuoshanAllConfig(PublishSyncDuoshanConfig publishSyncDuoshanConfig, PublishSyncDuoshanConfig publishSyncDuoshanConfig2) {
        this(publishSyncDuoshanConfig, publishSyncDuoshanConfig2, ByteString.EMPTY);
    }

    public PublishSyncDuoshanAllConfig(PublishSyncDuoshanConfig publishSyncDuoshanConfig, PublishSyncDuoshanConfig publishSyncDuoshanConfig2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.register_duoshan = publishSyncDuoshanConfig;
        this.ungister_duoshan = publishSyncDuoshanConfig2;
    }
}
