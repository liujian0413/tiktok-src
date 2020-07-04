package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PromotionVisitorV2 */
final class PromotionVisitorV2 extends Message<PromotionVisitorV2, Builder> {
    public static final ProtoAdapter<PromotionVisitorV2> ADAPTER = new ProtoAdapter_PromotionVisitorV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public List<UrlStructV2> avatar;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long count;

    /* renamed from: com.ss.ugc.aweme.proto.PromotionVisitorV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PromotionVisitorV2, Builder> {
        public List<UrlStructV2> avatar = Internal.newMutableList();
        public Long count;

        public final PromotionVisitorV2 build() {
            return new PromotionVisitorV2(this.avatar, this.count, super.buildUnknownFields());
        }

        public final Builder count(Long l) {
            this.count = l;
            return this;
        }

        public final Builder avatar(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.avatar = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PromotionVisitorV2$ProtoAdapter_PromotionVisitorV2 */
    static final class ProtoAdapter_PromotionVisitorV2 extends ProtoAdapter<PromotionVisitorV2> {
        public ProtoAdapter_PromotionVisitorV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PromotionVisitorV2.class);
        }

        public final int encodedSize(PromotionVisitorV2 promotionVisitorV2) {
            return UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(1, promotionVisitorV2.avatar) + ProtoAdapter.INT64.encodedSizeWithTag(2, promotionVisitorV2.count) + promotionVisitorV2.unknownFields().size();
        }

        public final PromotionVisitorV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.avatar.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.count((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PromotionVisitorV2 promotionVisitorV2) throws IOException {
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, promotionVisitorV2.avatar);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, promotionVisitorV2.count);
            protoWriter.writeBytes(promotionVisitorV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar = Internal.copyOf("avatar", this.avatar);
        builder.count = this.count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.avatar.hashCode()) * 37;
        if (this.count != null) {
            i = this.count.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.avatar.isEmpty()) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "PromotionVisitorV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionVisitorV2)) {
            return false;
        }
        PromotionVisitorV2 promotionVisitorV2 = (PromotionVisitorV2) obj;
        if (!unknownFields().equals(promotionVisitorV2.unknownFields()) || !this.avatar.equals(promotionVisitorV2.avatar) || !Internal.equals(this.count, promotionVisitorV2.count)) {
            return false;
        }
        return true;
    }

    public PromotionVisitorV2(List<UrlStructV2> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public PromotionVisitorV2(List<UrlStructV2> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar = Internal.immutableCopyOf("avatar", list);
        this.count = l;
    }
}
