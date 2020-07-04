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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingNewbieHelp */
public final class ShoppingNewbieHelp extends Message<ShoppingNewbieHelp, Builder> {
    public static final DefaultValueProtoAdapter<ShoppingNewbieHelp> ADAPTER = new ProtoAdapter_ShoppingNewbieHelp();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String shop_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingNewbieHelp$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShoppingNewbieHelp, Builder> {
        public String shop_url;

        public final ShoppingNewbieHelp build() {
            return new ShoppingNewbieHelp(this.shop_url, super.buildUnknownFields());
        }

        public final Builder shop_url(String str) {
            this.shop_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShoppingNewbieHelp$ProtoAdapter_ShoppingNewbieHelp */
    static final class ProtoAdapter_ShoppingNewbieHelp extends DefaultValueProtoAdapter<ShoppingNewbieHelp> {
        public final ShoppingNewbieHelp redact(ShoppingNewbieHelp shoppingNewbieHelp) {
            return shoppingNewbieHelp;
        }

        public ProtoAdapter_ShoppingNewbieHelp() {
            super(FieldEncoding.LENGTH_DELIMITED, ShoppingNewbieHelp.class);
        }

        public final ShoppingNewbieHelp decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShoppingNewbieHelp) null);
        }

        public final int encodedSize(ShoppingNewbieHelp shoppingNewbieHelp) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, shoppingNewbieHelp.shop_url) + shoppingNewbieHelp.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShoppingNewbieHelp shoppingNewbieHelp) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shoppingNewbieHelp.shop_url);
            protoWriter.writeBytes(shoppingNewbieHelp.unknownFields());
        }

        public final ShoppingNewbieHelp decode(ProtoReader protoReader, ShoppingNewbieHelp shoppingNewbieHelp) throws IOException {
            Builder builder;
            ShoppingNewbieHelp shoppingNewbieHelp2 = (ShoppingNewbieHelp) C10938a.m32097a().mo26425a(ShoppingNewbieHelp.class, shoppingNewbieHelp);
            if (shoppingNewbieHelp2 != null) {
                builder = shoppingNewbieHelp2.newBuilder();
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
                        if (shoppingNewbieHelp2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.shop_url((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getShopUrl() throws NullValueException {
        if (this.shop_url != null) {
            return this.shop_url;
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
        if (this.shop_url != null) {
            i = this.shop_url.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.shop_url = this.shop_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.shop_url != null) {
            sb.append(", shop_url=");
            sb.append(this.shop_url);
        }
        StringBuilder replace = sb.replace(0, 2, "ShoppingNewbieHelp{");
        replace.append('}');
        return replace.toString();
    }

    public ShoppingNewbieHelp(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShoppingNewbieHelp)) {
            return false;
        }
        ShoppingNewbieHelp shoppingNewbieHelp = (ShoppingNewbieHelp) obj;
        if (!unknownFields().equals(shoppingNewbieHelp.unknownFields()) || !Internal.equals(this.shop_url, shoppingNewbieHelp.shop_url)) {
            return false;
        }
        return true;
    }

    public ShoppingNewbieHelp(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shop_url = str;
    }
}
