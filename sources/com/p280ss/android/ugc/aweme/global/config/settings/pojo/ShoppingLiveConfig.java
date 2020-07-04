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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig */
public final class ShoppingLiveConfig extends Message<ShoppingLiveConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingLiveConfig> ADAPTER = new ProtoAdapter_ShoppingLiveConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean compatible_with_old_version;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer disable_taobao;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShoppingLiveConfig, Builder> {
        public Boolean compatible_with_old_version;
        public Integer disable_taobao;

        public final ShoppingLiveConfig build() {
            return new ShoppingLiveConfig(this.compatible_with_old_version, this.disable_taobao, super.buildUnknownFields());
        }

        public final Builder compatible_with_old_version(Boolean bool) {
            this.compatible_with_old_version = bool;
            return this;
        }

        public final Builder disable_taobao(Integer num) {
            this.disable_taobao = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingLiveConfig$ProtoAdapter_ShoppingLiveConfig */
    static final class ProtoAdapter_ShoppingLiveConfig extends DefaultValueProtoAdapter<ShoppingLiveConfig> {
        public final ShoppingLiveConfig redact(ShoppingLiveConfig shoppingLiveConfig) {
            return shoppingLiveConfig;
        }

        public ProtoAdapter_ShoppingLiveConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingLiveConfig.class);
        }

        public final ShoppingLiveConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShoppingLiveConfig) null);
        }

        public final int encodedSize(ShoppingLiveConfig shoppingLiveConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, shoppingLiveConfig.compatible_with_old_version) + ProtoAdapter.INT32.encodedSizeWithTag(2, shoppingLiveConfig.disable_taobao) + shoppingLiveConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingLiveConfig shoppingLiveConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, shoppingLiveConfig.compatible_with_old_version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, shoppingLiveConfig.disable_taobao);
            protoWriter.writeBytes(shoppingLiveConfig.unknownFields());
        }

        public final ShoppingLiveConfig decode(ProtoReader protoReader, ShoppingLiveConfig shoppingLiveConfig) throws IOException {
            Builder builder;
            ShoppingLiveConfig shoppingLiveConfig2 = (ShoppingLiveConfig) C10938a.m32097a().mo26425a(ShoppingLiveConfig.class, shoppingLiveConfig);
            if (shoppingLiveConfig2 != null) {
                builder = shoppingLiveConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.compatible_with_old_version((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.disable_taobao((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (shoppingLiveConfig2 != null) {
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

    public final Boolean getCompatibleWithOldVersion() throws NullValueException {
        if (this.compatible_with_old_version != null) {
            return this.compatible_with_old_version;
        }
        throw new NullValueException();
    }

    public final Integer getDisableTaobao() throws NullValueException {
        if (this.disable_taobao != null) {
            return this.disable_taobao;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.compatible_with_old_version = this.compatible_with_old_version;
        builder.disable_taobao = this.disable_taobao;
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
        if (this.compatible_with_old_version != null) {
            i = this.compatible_with_old_version.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.disable_taobao != null) {
            i3 = this.disable_taobao.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.compatible_with_old_version != null) {
            sb.append(", compatible_with_old_version=");
            sb.append(this.compatible_with_old_version);
        }
        if (this.disable_taobao != null) {
            sb.append(", disable_taobao=");
            sb.append(this.disable_taobao);
        }
        StringBuilder replace = sb.replace(0, 2, "ShoppingLiveConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShoppingLiveConfig)) {
            return false;
        }
        ShoppingLiveConfig shoppingLiveConfig = (ShoppingLiveConfig) obj;
        if (!unknownFields().equals(shoppingLiveConfig.unknownFields()) || !Internal.equals(this.compatible_with_old_version, shoppingLiveConfig.compatible_with_old_version) || !Internal.equals(this.disable_taobao, shoppingLiveConfig.disable_taobao)) {
            return false;
        }
        return true;
    }

    public ShoppingLiveConfig(Boolean bool, Integer num) {
        this(bool, num, ByteString.EMPTY);
    }

    public ShoppingLiveConfig(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.compatible_with_old_version = bool;
        this.disable_taobao = num;
    }
}
