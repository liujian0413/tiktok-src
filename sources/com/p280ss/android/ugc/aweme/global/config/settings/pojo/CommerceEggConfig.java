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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig */
public final class CommerceEggConfig extends Message<CommerceEggConfig, Builder> {
    public static final DefaultValueProtoAdapter<CommerceEggConfig> ADAPTER = new ProtoAdapter_CommerceEggConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean enable_comment_egg_refactor;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enable_digg_egg_refactor;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean enable_search_egg_refactor;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommerceEggConfig, Builder> {
        public Boolean enable_comment_egg_refactor = Boolean.valueOf(false);
        public Boolean enable_digg_egg_refactor = Boolean.valueOf(false);
        public Boolean enable_search_egg_refactor = Boolean.valueOf(false);

        public final CommerceEggConfig build() {
            return new CommerceEggConfig(this.enable_digg_egg_refactor, this.enable_comment_egg_refactor, this.enable_search_egg_refactor, super.buildUnknownFields());
        }

        public final Builder enable_comment_egg_refactor(Boolean bool) {
            this.enable_comment_egg_refactor = bool;
            return this;
        }

        public final Builder enable_digg_egg_refactor(Boolean bool) {
            this.enable_digg_egg_refactor = bool;
            return this;
        }

        public final Builder enable_search_egg_refactor(Boolean bool) {
            this.enable_search_egg_refactor = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig$ProtoAdapter_CommerceEggConfig */
    static final class ProtoAdapter_CommerceEggConfig extends DefaultValueProtoAdapter<CommerceEggConfig> {
        public final CommerceEggConfig redact(CommerceEggConfig commerceEggConfig) {
            return commerceEggConfig;
        }

        public ProtoAdapter_CommerceEggConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceEggConfig.class);
        }

        public final CommerceEggConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CommerceEggConfig) null);
        }

        public final int encodedSize(CommerceEggConfig commerceEggConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, commerceEggConfig.enable_digg_egg_refactor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, commerceEggConfig.enable_comment_egg_refactor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, commerceEggConfig.enable_search_egg_refactor) + commerceEggConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CommerceEggConfig commerceEggConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, commerceEggConfig.enable_digg_egg_refactor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, commerceEggConfig.enable_comment_egg_refactor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, commerceEggConfig.enable_search_egg_refactor);
            protoWriter.writeBytes(commerceEggConfig.unknownFields());
        }

        public final CommerceEggConfig decode(ProtoReader protoReader, CommerceEggConfig commerceEggConfig) throws IOException {
            Builder builder;
            CommerceEggConfig commerceEggConfig2 = (CommerceEggConfig) C10938a.m32097a().mo26425a(CommerceEggConfig.class, commerceEggConfig);
            if (commerceEggConfig2 != null) {
                builder = commerceEggConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.enable_digg_egg_refactor((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_comment_egg_refactor((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.enable_search_egg_refactor((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (commerceEggConfig2 != null) {
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

    public final Boolean getEnableCommentEggRefactor() throws NullValueException {
        if (this.enable_comment_egg_refactor != null) {
            return this.enable_comment_egg_refactor;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableDiggEggRefactor() throws NullValueException {
        if (this.enable_digg_egg_refactor != null) {
            return this.enable_digg_egg_refactor;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableSearchEggRefactor() throws NullValueException {
        if (this.enable_search_egg_refactor != null) {
            return this.enable_search_egg_refactor;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable_digg_egg_refactor = this.enable_digg_egg_refactor;
        builder.enable_comment_egg_refactor = this.enable_comment_egg_refactor;
        builder.enable_search_egg_refactor = this.enable_search_egg_refactor;
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
        if (this.enable_digg_egg_refactor != null) {
            i = this.enable_digg_egg_refactor.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.enable_comment_egg_refactor != null) {
            i2 = this.enable_comment_egg_refactor.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.enable_search_egg_refactor != null) {
            i4 = this.enable_search_egg_refactor.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_digg_egg_refactor != null) {
            sb.append(", enable_digg_egg_refactor=");
            sb.append(this.enable_digg_egg_refactor);
        }
        if (this.enable_comment_egg_refactor != null) {
            sb.append(", enable_comment_egg_refactor=");
            sb.append(this.enable_comment_egg_refactor);
        }
        if (this.enable_search_egg_refactor != null) {
            sb.append(", enable_search_egg_refactor=");
            sb.append(this.enable_search_egg_refactor);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceEggConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceEggConfig)) {
            return false;
        }
        CommerceEggConfig commerceEggConfig = (CommerceEggConfig) obj;
        if (!unknownFields().equals(commerceEggConfig.unknownFields()) || !Internal.equals(this.enable_digg_egg_refactor, commerceEggConfig.enable_digg_egg_refactor) || !Internal.equals(this.enable_comment_egg_refactor, commerceEggConfig.enable_comment_egg_refactor) || !Internal.equals(this.enable_search_egg_refactor, commerceEggConfig.enable_search_egg_refactor)) {
            return false;
        }
        return true;
    }

    public CommerceEggConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public CommerceEggConfig(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_digg_egg_refactor = bool;
        this.enable_comment_egg_refactor = bool2;
        this.enable_search_egg_refactor = bool3;
    }
}
