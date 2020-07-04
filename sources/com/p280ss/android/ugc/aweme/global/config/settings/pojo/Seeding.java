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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding */
public final class Seeding extends Message<Seeding, Builder> {
    public static final DefaultValueProtoAdapter<Seeding> ADAPTER = new ProtoAdapter_Seeding();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String shop_wish_list_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Seeding, Builder> {
        public String shop_wish_list_url;

        public final Seeding build() {
            return new Seeding(this.shop_wish_list_url, super.buildUnknownFields());
        }

        public final Builder shop_wish_list_url(String str) {
            this.shop_wish_list_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.Seeding$ProtoAdapter_Seeding */
    static final class ProtoAdapter_Seeding extends DefaultValueProtoAdapter<Seeding> {
        public final Seeding redact(Seeding seeding) {
            return seeding;
        }

        public ProtoAdapter_Seeding() {
            super(FieldEncoding.LENGTH_DELIMITED, Seeding.class);
        }

        public final Seeding decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (Seeding) null);
        }

        public final int encodedSize(Seeding seeding) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, seeding.shop_wish_list_url) + seeding.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, Seeding seeding) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, seeding.shop_wish_list_url);
            protoWriter.writeBytes(seeding.unknownFields());
        }

        public final Seeding decode(ProtoReader protoReader, Seeding seeding) throws IOException {
            Builder builder;
            Seeding seeding2 = (Seeding) C10938a.m32097a().mo26425a(Seeding.class, seeding);
            if (seeding2 != null) {
                builder = seeding2.newBuilder();
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
                        if (seeding2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.shop_wish_list_url((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getShopWishListUrl() throws NullValueException {
        if (this.shop_wish_list_url != null) {
            return this.shop_wish_list_url;
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
        if (this.shop_wish_list_url != null) {
            i = this.shop_wish_list_url.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.shop_wish_list_url = this.shop_wish_list_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.shop_wish_list_url != null) {
            sb.append(", shop_wish_list_url=");
            sb.append(this.shop_wish_list_url);
        }
        StringBuilder replace = sb.replace(0, 2, "Seeding{");
        replace.append('}');
        return replace.toString();
    }

    public Seeding(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Seeding)) {
            return false;
        }
        Seeding seeding = (Seeding) obj;
        if (!unknownFields().equals(seeding.unknownFields()) || !Internal.equals(this.shop_wish_list_url, seeding.shop_wish_list_url)) {
            return false;
        }
        return true;
    }

    public Seeding(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shop_wish_list_url = str;
    }
}
