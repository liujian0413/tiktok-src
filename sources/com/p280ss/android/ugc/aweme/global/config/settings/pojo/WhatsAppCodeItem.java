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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem */
public final class WhatsAppCodeItem extends Message<WhatsAppCodeItem, Builder> {
    public static final DefaultValueProtoAdapter<WhatsAppCodeItem> ADAPTER = new ProtoAdapter_WhatsAppCodeItem();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String calling_code;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean whatsapp_first;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WhatsAppCodeItem, Builder> {
        public String calling_code;
        public Boolean whatsapp_first;

        public final WhatsAppCodeItem build() {
            return new WhatsAppCodeItem(this.calling_code, this.whatsapp_first, super.buildUnknownFields());
        }

        public final Builder calling_code(String str) {
            this.calling_code = str;
            return this;
        }

        public final Builder whatsapp_first(Boolean bool) {
            this.whatsapp_first = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem$ProtoAdapter_WhatsAppCodeItem */
    static final class ProtoAdapter_WhatsAppCodeItem extends DefaultValueProtoAdapter<WhatsAppCodeItem> {
        public final WhatsAppCodeItem redact(WhatsAppCodeItem whatsAppCodeItem) {
            return whatsAppCodeItem;
        }

        public ProtoAdapter_WhatsAppCodeItem() {
            super(FieldEncoding.LENGTH_DELIMITED, WhatsAppCodeItem.class);
        }

        public final WhatsAppCodeItem decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (WhatsAppCodeItem) null);
        }

        public final int encodedSize(WhatsAppCodeItem whatsAppCodeItem) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, whatsAppCodeItem.calling_code) + ProtoAdapter.BOOL.encodedSizeWithTag(2, whatsAppCodeItem.whatsapp_first) + whatsAppCodeItem.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WhatsAppCodeItem whatsAppCodeItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, whatsAppCodeItem.calling_code);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, whatsAppCodeItem.whatsapp_first);
            protoWriter.writeBytes(whatsAppCodeItem.unknownFields());
        }

        public final WhatsAppCodeItem decode(ProtoReader protoReader, WhatsAppCodeItem whatsAppCodeItem) throws IOException {
            Builder builder;
            WhatsAppCodeItem whatsAppCodeItem2 = (WhatsAppCodeItem) C10938a.m32097a().mo26425a(WhatsAppCodeItem.class, whatsAppCodeItem);
            if (whatsAppCodeItem2 != null) {
                builder = whatsAppCodeItem2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.calling_code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.whatsapp_first((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (whatsAppCodeItem2 != null) {
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

    public final String getCallingCode() throws NullValueException {
        if (this.calling_code != null) {
            return this.calling_code;
        }
        throw new NullValueException();
    }

    public final Boolean getWhatsappFirst() throws NullValueException {
        if (this.whatsapp_first != null) {
            return this.whatsapp_first;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.calling_code = this.calling_code;
        builder.whatsapp_first = this.whatsapp_first;
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
        if (this.calling_code != null) {
            i = this.calling_code.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.whatsapp_first != null) {
            i3 = this.whatsapp_first.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.calling_code != null) {
            sb.append(", calling_code=");
            sb.append(this.calling_code);
        }
        if (this.whatsapp_first != null) {
            sb.append(", whatsapp_first=");
            sb.append(this.whatsapp_first);
        }
        StringBuilder replace = sb.replace(0, 2, "WhatsAppCodeItem{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WhatsAppCodeItem)) {
            return false;
        }
        WhatsAppCodeItem whatsAppCodeItem = (WhatsAppCodeItem) obj;
        if (!unknownFields().equals(whatsAppCodeItem.unknownFields()) || !Internal.equals(this.calling_code, whatsAppCodeItem.calling_code) || !Internal.equals(this.whatsapp_first, whatsAppCodeItem.whatsapp_first)) {
            return false;
        }
        return true;
    }

    public WhatsAppCodeItem(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public WhatsAppCodeItem(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calling_code = str;
        this.whatsapp_first = bool;
    }
}
