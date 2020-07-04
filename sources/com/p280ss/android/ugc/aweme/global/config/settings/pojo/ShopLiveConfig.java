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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig */
public final class ShopLiveConfig extends Message<ShopLiveConfig, Builder> {
    public static final DefaultValueProtoAdapter<ShopLiveConfig> ADAPTER = new ProtoAdapter_ShopLiveConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String merch_picker_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShopLiveConfig, Builder> {
        public String merch_picker_url;

        public final ShopLiveConfig build() {
            return new ShopLiveConfig(this.merch_picker_url, super.buildUnknownFields());
        }

        public final Builder merch_picker_url(String str) {
            this.merch_picker_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig$ProtoAdapter_ShopLiveConfig */
    static final class ProtoAdapter_ShopLiveConfig extends DefaultValueProtoAdapter<ShopLiveConfig> {
        public final ShopLiveConfig redact(ShopLiveConfig shopLiveConfig) {
            return shopLiveConfig;
        }

        public ProtoAdapter_ShopLiveConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, ShopLiveConfig.class);
        }

        public final ShopLiveConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShopLiveConfig) null);
        }

        public final int encodedSize(ShopLiveConfig shopLiveConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shopLiveConfig.merch_picker_url) + shopLiveConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShopLiveConfig shopLiveConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shopLiveConfig.merch_picker_url);
            protoWriter.writeBytes(shopLiveConfig.unknownFields());
        }

        public final ShopLiveConfig decode(ProtoReader protoReader, ShopLiveConfig shopLiveConfig) throws IOException {
            Builder builder;
            ShopLiveConfig shopLiveConfig2 = (ShopLiveConfig) C10938a.m32097a().mo26425a(ShopLiveConfig.class, shopLiveConfig);
            if (shopLiveConfig2 != null) {
                builder = shopLiveConfig2.newBuilder();
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
                        if (shopLiveConfig2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.merch_picker_url((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getMerchPickerUrl() throws NullValueException {
        if (this.merch_picker_url != null) {
            return this.merch_picker_url;
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
        if (this.merch_picker_url != null) {
            i = this.merch_picker_url.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.merch_picker_url = this.merch_picker_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.merch_picker_url != null) {
            sb.append(", merch_picker_url=");
            sb.append(this.merch_picker_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShopLiveConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ShopLiveConfig(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopLiveConfig)) {
            return false;
        }
        ShopLiveConfig shopLiveConfig = (ShopLiveConfig) obj;
        if (!unknownFields().equals(shopLiveConfig.unknownFields()) || !Internal.equals(this.merch_picker_url, shopLiveConfig.merch_picker_url)) {
            return false;
        }
        return true;
    }

    public ShopLiveConfig(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.merch_picker_url = str;
    }
}
