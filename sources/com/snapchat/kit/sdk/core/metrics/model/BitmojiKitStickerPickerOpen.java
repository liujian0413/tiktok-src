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

public final class BitmojiKitStickerPickerOpen extends Message<BitmojiKitStickerPickerOpen, Builder> {
    public static final ProtoAdapter<BitmojiKitStickerPickerOpen> ADAPTER = new ProtoAdapter_BitmojiKitStickerPickerOpen();
    public static final BitmojiKitStickerPickerView DEFAULT_STICKER_PICKER_VIEW = BitmojiKitStickerPickerView.UNKNOWN_BITMOJI_KIT_PICKER_VIEW;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitStickerPickerView#ADAPTER", tag = 2)
    public final BitmojiKitStickerPickerView sticker_picker_view;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitStickerPickerOpen, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitStickerPickerView sticker_picker_view;

        public final BitmojiKitStickerPickerOpen build() {
            return new BitmojiKitStickerPickerOpen(this.bitmoji_kit_event_base, this.sticker_picker_view, super.buildUnknownFields());
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder sticker_picker_view(BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
            this.sticker_picker_view = bitmojiKitStickerPickerView;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitStickerPickerOpen extends ProtoAdapter<BitmojiKitStickerPickerOpen> {
        public ProtoAdapter_BitmojiKitStickerPickerOpen() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitStickerPickerOpen.class);
        }

        public final int encodedSize(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base) + BitmojiKitStickerPickerView.ADAPTER.encodedSizeWithTag(2, bitmojiKitStickerPickerOpen.sticker_picker_view) + bitmojiKitStickerPickerOpen.unknownFields().size();
        }

        public final BitmojiKitStickerPickerOpen redact(BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) {
            Builder newBuilder = bitmojiKitStickerPickerOpen.newBuilder();
            if (newBuilder.bitmoji_kit_event_base != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(newBuilder.bitmoji_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final BitmojiKitStickerPickerOpen decode(ProtoReader protoReader) throws IOException {
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
                                builder.sticker_picker_view((BitmojiKitStickerPickerView) BitmojiKitStickerPickerView.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base);
            BitmojiKitStickerPickerView.ADAPTER.encodeWithTag(protoWriter, 2, bitmojiKitStickerPickerOpen.sticker_picker_view);
            protoWriter.writeBytes(bitmojiKitStickerPickerOpen.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.sticker_picker_view = this.sticker_picker_view;
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
        if (this.sticker_picker_view != null) {
            i3 = this.sticker_picker_view.hashCode();
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
        if (this.sticker_picker_view != null) {
            sb.append(", sticker_picker_view=");
            sb.append(this.sticker_picker_view);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitStickerPickerOpen{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitStickerPickerOpen)) {
            return false;
        }
        BitmojiKitStickerPickerOpen bitmojiKitStickerPickerOpen = (BitmojiKitStickerPickerOpen) obj;
        if (!unknownFields().equals(bitmojiKitStickerPickerOpen.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitStickerPickerOpen.bitmoji_kit_event_base) || !Internal.equals(this.sticker_picker_view, bitmojiKitStickerPickerOpen.sticker_picker_view)) {
            return false;
        }
        return true;
    }

    public BitmojiKitStickerPickerOpen(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitStickerPickerView bitmojiKitStickerPickerView) {
        this(bitmojiKitEventBase, bitmojiKitStickerPickerView, ByteString.EMPTY);
    }

    public BitmojiKitStickerPickerOpen(BitmojiKitEventBase bitmojiKitEventBase, BitmojiKitStickerPickerView bitmojiKitStickerPickerView, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.sticker_picker_view = bitmojiKitStickerPickerView;
    }
}
