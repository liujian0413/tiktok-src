package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class BitmojiKitShare extends Message<BitmojiKitShare, Builder> {
    public static final ProtoAdapter<BitmojiKitShare> ADAPTER = new ProtoAdapter_BitmojiKitShare();
    public static final BitmojiKitSearchCategory DEFAULT_SEARCH_CATEGORY = BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
    public static final BitmojiKitShareCategory DEFAULT_SHARE_CATEGORY = BitmojiKitShareCategory.UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory#ADAPTER", tag = 5)
    public final BitmojiKitSearchCategory search_category;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory#ADAPTER", tag = 4)
    public final BitmojiKitShareCategory share_category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String sticker_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 2)
    public final List<String> subject_user_ids;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitShare, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitSearchCategory search_category;
        public BitmojiKitShareCategory share_category;
        public String sticker_id;
        public List<String> subject_user_ids = Internal.newMutableList();

        public final BitmojiKitShare build() {
            BitmojiKitShare bitmojiKitShare = new BitmojiKitShare(this.bitmoji_kit_event_base, this.subject_user_ids, this.sticker_id, this.share_category, this.search_category, super.buildUnknownFields());
            return bitmojiKitShare;
        }

        public final Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public final Builder search_category(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            this.search_category = bitmojiKitSearchCategory;
            return this;
        }

        public final Builder share_category(BitmojiKitShareCategory bitmojiKitShareCategory) {
            this.share_category = bitmojiKitShareCategory;
            return this;
        }

        public final Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }

        public final Builder subject_user_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.subject_user_ids = list;
            return this;
        }
    }

    static final class ProtoAdapter_BitmojiKitShare extends ProtoAdapter<BitmojiKitShare> {
        public ProtoAdapter_BitmojiKitShare() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitShare.class);
        }

        public final BitmojiKitShare redact(BitmojiKitShare bitmojiKitShare) {
            Builder newBuilder = bitmojiKitShare.newBuilder();
            if (newBuilder.bitmoji_kit_event_base != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(newBuilder.bitmoji_kit_event_base);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(BitmojiKitShare bitmojiKitShare) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitShare.bitmoji_kit_event_base) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, bitmojiKitShare.subject_user_ids) + ProtoAdapter.STRING.encodedSizeWithTag(3, bitmojiKitShare.sticker_id) + BitmojiKitShareCategory.ADAPTER.encodedSizeWithTag(4, bitmojiKitShare.share_category) + BitmojiKitSearchCategory.ADAPTER.encodedSizeWithTag(5, bitmojiKitShare.search_category) + bitmojiKitShare.unknownFields().size();
        }

        public final BitmojiKitShare decode(ProtoReader protoReader) throws IOException {
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
                            builder.subject_user_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.sticker_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.share_category((BitmojiKitShareCategory) BitmojiKitShareCategory.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                builder.search_category((BitmojiKitSearchCategory) BitmojiKitSearchCategory.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
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

        public final void encode(ProtoWriter protoWriter, BitmojiKitShare bitmojiKitShare) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitShare.bitmoji_kit_event_base);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, bitmojiKitShare.subject_user_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bitmojiKitShare.sticker_id);
            BitmojiKitShareCategory.ADAPTER.encodeWithTag(protoWriter, 4, bitmojiKitShare.share_category);
            BitmojiKitSearchCategory.ADAPTER.encodeWithTag(protoWriter, 5, bitmojiKitShare.search_category);
            protoWriter.writeBytes(bitmojiKitShare.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.subject_user_ids = Internal.copyOf("subject_user_ids", this.subject_user_ids);
        builder.sticker_id = this.sticker_id;
        builder.share_category = this.share_category;
        builder.search_category = this.search_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.bitmoji_kit_event_base != null) {
            i = this.bitmoji_kit_event_base.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.subject_user_ids.hashCode()) * 37;
        if (this.sticker_id != null) {
            i2 = this.sticker_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode2 + i2) * 37;
        if (this.share_category != null) {
            i3 = this.share_category.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        if (this.search_category != null) {
            i5 = this.search_category.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        if (!this.subject_user_ids.isEmpty()) {
            sb.append(", subject_user_ids=");
            sb.append(this.subject_user_ids);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.share_category != null) {
            sb.append(", share_category=");
            sb.append(this.share_category);
        }
        if (this.search_category != null) {
            sb.append(", search_category=");
            sb.append(this.search_category);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitShare{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitShare)) {
            return false;
        }
        BitmojiKitShare bitmojiKitShare = (BitmojiKitShare) obj;
        if (!unknownFields().equals(bitmojiKitShare.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitShare.bitmoji_kit_event_base) || !this.subject_user_ids.equals(bitmojiKitShare.subject_user_ids) || !Internal.equals(this.sticker_id, bitmojiKitShare.sticker_id) || !Internal.equals(this.share_category, bitmojiKitShare.share_category) || !Internal.equals(this.search_category, bitmojiKitShare.search_category)) {
            return false;
        }
        return true;
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, List<String> list, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory) {
        this(bitmojiKitEventBase, list, str, bitmojiKitShareCategory, bitmojiKitSearchCategory, ByteString.EMPTY);
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, List<String> list, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.subject_user_ids = Internal.immutableCopyOf("subject_user_ids", list);
        this.sticker_id = str;
        this.share_category = bitmojiKitShareCategory;
        this.search_category = bitmojiKitSearchCategory;
    }
}
