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

public final class BitmojiKitEventBase extends Message<BitmojiKitEventBase, Builder> {
    public static final ProtoAdapter<BitmojiKitEventBase> ADAPTER = new ProtoAdapter_BitmojiKitEventBase();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitEventBase#ADAPTER", tag = 1)
    public final KitEventBase kit_event_base;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sticker_picker_session_id;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitEventBase, Builder> {
        public KitEventBase kit_event_base;
        public String sticker_picker_session_id;

        public final BitmojiKitEventBase build() {
            return new BitmojiKitEventBase(this.kit_event_base, this.sticker_picker_session_id, super.buildUnknownFields());
        }

        public final Builder kit_event_base(KitEventBase kitEventBase) {
            this.kit_event_base = kitEventBase;
            return this;
        }

        public final Builder sticker_picker_session_id(String str) {
            this.sticker_picker_session_id = str;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitEventBase extends ProtoAdapter<BitmojiKitEventBase> {
        public ProtoAdapter_BitmojiKitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitEventBase.class);
        }

        public final int encodedSize(BitmojiKitEventBase bitmojiKitEventBase) {
            return KitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitEventBase.kit_event_base) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitEventBase.sticker_picker_session_id) + bitmojiKitEventBase.unknownFields().size();
        }

        public final BitmojiKitEventBase redact(BitmojiKitEventBase bitmojiKitEventBase) {
            Builder newBuilder = bitmojiKitEventBase.newBuilder();
            if (newBuilder.kit_event_base != null) {
                newBuilder.kit_event_base = (KitEventBase) KitEventBase.ADAPTER.redact(newBuilder.kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BitmojiKitEventBase decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.kit_event_base((KitEventBase) KitEventBase.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.sticker_picker_session_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, BitmojiKitEventBase bitmojiKitEventBase) throws IOException {
            KitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitEventBase.kit_event_base);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitEventBase.sticker_picker_session_id);
            protoWriter.writeBytes(bitmojiKitEventBase.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.kit_event_base = this.kit_event_base;
        builder.sticker_picker_session_id = this.sticker_picker_session_id;
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
        if (this.kit_event_base != null) {
            i = this.kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.sticker_picker_session_id != null) {
            i3 = this.sticker_picker_session_id.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.kit_event_base != null) {
            sb.append(", kit_event_base=");
            sb.append(this.kit_event_base);
        }
        if (this.sticker_picker_session_id != null) {
            sb.append(", sticker_picker_session_id=");
            sb.append(this.sticker_picker_session_id);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitEventBase{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitEventBase)) {
            return false;
        }
        BitmojiKitEventBase bitmojiKitEventBase = (BitmojiKitEventBase) obj;
        if (!unknownFields().equals(bitmojiKitEventBase.unknownFields()) || !Internal.equals(this.kit_event_base, bitmojiKitEventBase.kit_event_base) || !Internal.equals(this.sticker_picker_session_id, bitmojiKitEventBase.sticker_picker_session_id)) {
            return false;
        }
        return true;
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str) {
        this(kitEventBase, str, ByteString.EMPTY);
    }

    public BitmojiKitEventBase(KitEventBase kitEventBase, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.kit_event_base = kitEventBase;
        this.sticker_picker_session_id = str;
    }
}
