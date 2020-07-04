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

public final class BitmojiKitSnapchatLinkTap extends Message<BitmojiKitSnapchatLinkTap, Builder> {
    public static final ProtoAdapter<BitmojiKitSnapchatLinkTap> ADAPTER = new ProtoAdapter_BitmojiKitSnapchatLinkTap();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitSnapchatLinkTap, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;

        public final BitmojiKitSnapchatLinkTap build() {
            return new BitmojiKitSnapchatLinkTap(this.bitmoji_kit_event_base, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitSnapchatLinkTap extends ProtoAdapter<BitmojiKitSnapchatLinkTap> {
        public ProtoAdapter_BitmojiKitSnapchatLinkTap() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSnapchatLinkTap.class);
        }

        public final int encodedSize(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base) + bitmojiKitSnapchatLinkTap.unknownFields().size();
        }

        public final BitmojiKitSnapchatLinkTap redact(BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) {
            Builder newBuilder = bitmojiKitSnapchatLinkTap.newBuilder();
            if (newBuilder.bitmoji_kit_event_base != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(newBuilder.bitmoji_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BitmojiKitSnapchatLinkTap decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base);
            protoWriter.writeBytes(bitmojiKitSnapchatLinkTap.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitSnapchatLinkTap{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitSnapchatLinkTap(BitmojiKitEventBase bitmojiKitEventBase) {
        this(bitmojiKitEventBase, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSnapchatLinkTap)) {
            return false;
        }
        BitmojiKitSnapchatLinkTap bitmojiKitSnapchatLinkTap = (BitmojiKitSnapchatLinkTap) obj;
        if (!unknownFields().equals(bitmojiKitSnapchatLinkTap.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitSnapchatLinkTap.bitmoji_kit_event_base)) {
            return false;
        }
        return true;
    }

    public BitmojiKitSnapchatLinkTap(BitmojiKitEventBase bitmojiKitEventBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
    }
}
