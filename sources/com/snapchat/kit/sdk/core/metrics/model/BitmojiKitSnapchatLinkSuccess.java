package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BitmojiKitSnapchatLinkSuccess extends Message<BitmojiKitSnapchatLinkSuccess, Builder> {
    public static final ProtoAdapter<BitmojiKitSnapchatLinkSuccess> ADAPTER = new ProtoAdapter_BitmojiKitSnapchatLinkSuccess();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitSnapchatLinkSuccess, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;

        public final BitmojiKitSnapchatLinkSuccess build() {
            return new BitmojiKitSnapchatLinkSuccess(this.bitmoji_kit_event_base, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitSnapchatLinkSuccess extends ProtoAdapter<BitmojiKitSnapchatLinkSuccess> {
        public ProtoAdapter_BitmojiKitSnapchatLinkSuccess() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSnapchatLinkSuccess.class);
        }

        public final int encodedSize(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitSnapchatLinkSuccess.bitmoji_kit_event_base) + bitmojiKitSnapchatLinkSuccess.unknownFields().size();
        }

        public final BitmojiKitSnapchatLinkSuccess redact(BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) {
            Builder newBuilder = bitmojiKitSnapchatLinkSuccess.newBuilder();
            if (newBuilder.bitmoji_kit_event_base != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(newBuilder.bitmoji_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BitmojiKitSnapchatLinkSuccess decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.bitmoji_kit_event_base((BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSnapchatLinkSuccess.bitmoji_kit_event_base);
            protoWriter.writeBytes(bitmojiKitSnapchatLinkSuccess.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.bitmoji_kit_event_base != null) {
            i = this.bitmoji_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitSnapchatLinkSuccess{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitSnapchatLinkSuccess(BitmojiKitEventBase bitmojiKitEventBase) {
        this(bitmojiKitEventBase, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSnapchatLinkSuccess)) {
            return false;
        }
        BitmojiKitSnapchatLinkSuccess bitmojiKitSnapchatLinkSuccess = (BitmojiKitSnapchatLinkSuccess) obj;
        if (!unknownFields().equals(bitmojiKitSnapchatLinkSuccess.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitSnapchatLinkSuccess.bitmoji_kit_event_base)) {
            return false;
        }
        return true;
    }

    public BitmojiKitSnapchatLinkSuccess(BitmojiKitEventBase bitmojiKitEventBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
    }
}
