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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WalletConfig */
public final class WalletConfig extends Message<WalletConfig, Builder> {
    public static final DefaultValueProtoAdapter<WalletConfig> ADAPTER = new ProtoAdapter_WalletConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String page_charge_schema;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String page_index_schema;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WalletConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WalletConfig, Builder> {
        public String page_charge_schema;
        public String page_index_schema;

        public final WalletConfig build() {
            return new WalletConfig(this.page_charge_schema, this.page_index_schema, super.buildUnknownFields());
        }

        public final Builder page_charge_schema(String str) {
            this.page_charge_schema = str;
            return this;
        }

        public final Builder page_index_schema(String str) {
            this.page_index_schema = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WalletConfig$ProtoAdapter_WalletConfig */
    static final class ProtoAdapter_WalletConfig extends DefaultValueProtoAdapter<WalletConfig> {
        public final WalletConfig redact(WalletConfig walletConfig) {
            return walletConfig;
        }

        public ProtoAdapter_WalletConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, WalletConfig.class);
        }

        public final WalletConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (WalletConfig) null);
        }

        public final int encodedSize(WalletConfig walletConfig) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, walletConfig.page_charge_schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, walletConfig.page_index_schema) + walletConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WalletConfig walletConfig) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, walletConfig.page_charge_schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, walletConfig.page_index_schema);
            protoWriter.writeBytes(walletConfig.unknownFields());
        }

        public final WalletConfig decode(ProtoReader protoReader, WalletConfig walletConfig) throws IOException {
            Builder builder;
            WalletConfig walletConfig2 = (WalletConfig) C10938a.m32097a().mo26425a(WalletConfig.class, walletConfig);
            if (walletConfig2 != null) {
                builder = walletConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.page_charge_schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.page_index_schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (walletConfig2 != null) {
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

    public final String getPageChargeSchema() throws NullValueException {
        if (this.page_charge_schema != null) {
            return this.page_charge_schema;
        }
        throw new NullValueException();
    }

    public final String getPageIndexSchema() throws NullValueException {
        if (this.page_index_schema != null) {
            return this.page_index_schema;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.page_charge_schema = this.page_charge_schema;
        builder.page_index_schema = this.page_index_schema;
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
        if (this.page_charge_schema != null) {
            i = this.page_charge_schema.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.page_index_schema != null) {
            i3 = this.page_index_schema.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.page_charge_schema != null) {
            sb.append(", page_charge_schema=");
            sb.append(this.page_charge_schema);
        }
        if (this.page_index_schema != null) {
            sb.append(", page_index_schema=");
            sb.append(this.page_index_schema);
        }
        StringBuilder replace = sb.replace(0, 2, "WalletConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WalletConfig)) {
            return false;
        }
        WalletConfig walletConfig = (WalletConfig) obj;
        if (!unknownFields().equals(walletConfig.unknownFields()) || !Internal.equals(this.page_charge_schema, walletConfig.page_charge_schema) || !Internal.equals(this.page_index_schema, walletConfig.page_index_schema)) {
            return false;
        }
        return true;
    }

    public WalletConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public WalletConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_charge_schema = str;
        this.page_index_schema = str2;
    }
}
