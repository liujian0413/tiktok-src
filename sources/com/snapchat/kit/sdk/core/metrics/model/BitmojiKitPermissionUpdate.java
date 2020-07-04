package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class BitmojiKitPermissionUpdate extends Message<BitmojiKitPermissionUpdate, Builder> {
    public static final ProtoAdapter<BitmojiKitPermissionUpdate> ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdate();
    public static final BitmojiKitPermissionUpdateStatus DEFAULT_STATUS = BitmojiKitPermissionUpdateStatus.UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitPermissionUpdateStatus#ADAPTER", tag = 2)
    public final BitmojiKitPermissionUpdateStatus status;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitPermissionUpdate, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitPermissionUpdateStatus status;

        public final BitmojiKitPermissionUpdate build() {
            return new BitmojiKitPermissionUpdate(this.bitmoji_kit_event_base, this.status, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder status(BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
            this.status = bitmojiKitPermissionUpdateStatus;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitPermissionUpdate extends ProtoAdapter<BitmojiKitPermissionUpdate> {
        public ProtoAdapter_BitmojiKitPermissionUpdate() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitPermissionUpdate.class);
        }

        public final int encodedSize(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) + BitmojiKitPermissionUpdateStatus.ADAPTER.encodedSizeWithTag(2, bitmojiKitPermissionUpdate.status) + bitmojiKitPermissionUpdate.unknownFields().size();
        }

        public final BitmojiKitPermissionUpdate redact(BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) {
            Builder newBuilder = bitmojiKitPermissionUpdate.newBuilder();
            if (newBuilder.bitmoji_kit_event_base != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(newBuilder.bitmoji_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BitmojiKitPermissionUpdate decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.bitmoji_kit_event_base((BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            try {
                                builder.status((BitmojiKitPermissionUpdateStatus) BitmojiKitPermissionUpdateStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitPermissionUpdate.bitmoji_kit_event_base);
            BitmojiKitPermissionUpdateStatus.ADAPTER.encodeWithTag(protoWriter, 2, bitmojiKitPermissionUpdate.status);
            protoWriter.writeBytes(bitmojiKitPermissionUpdate.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.status = this.status;
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
        if (this.bitmoji_kit_event_base != null) {
            i = this.bitmoji_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.status != null) {
            i3 = this.status.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitPermissionUpdate{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitPermissionUpdate)) {
            return false;
        }
        BitmojiKitPermissionUpdate bitmojiKitPermissionUpdate = (BitmojiKitPermissionUpdate) obj;
        if (!unknownFields().equals(bitmojiKitPermissionUpdate.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitPermissionUpdate.bitmoji_kit_event_base) || !Internal.equals(this.status, bitmojiKitPermissionUpdate.status)) {
            return false;
        }
        return true;
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus) {
        this(bitmojiKitEventBase, bitmojiKitPermissionUpdateStatus, ByteString.EMPTY);
    }

    public BitmojiKitPermissionUpdate(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitPermissionUpdateStatus bitmojiKitPermissionUpdateStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.status = bitmojiKitPermissionUpdateStatus;
    }
}
