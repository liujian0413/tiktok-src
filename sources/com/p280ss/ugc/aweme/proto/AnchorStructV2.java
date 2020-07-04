package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.AnchorStructV2 */
public final class AnchorStructV2 extends Message<AnchorStructV2, Builder> {
    public static final ProtoAdapter<AnchorStructV2> ADAPTER = new ProtoAdapter_AnchorStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String anchor_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorCommonStructV2#ADAPTER", tag = 5)
    public AnchorCommonStructV2 anchor_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer business_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorShopLinkStructV2#ADAPTER", tag = 4)
    public AnchorShopLinkStructV2 shop_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer show_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.AnchorWikipediaStructV2#ADAPTER", tag = 3)
    public AnchorWikipediaStructV2 wikipedia_info;

    /* renamed from: com.ss.ugc.aweme.proto.AnchorStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AnchorStructV2, Builder> {
        public String anchor_id;
        public AnchorCommonStructV2 anchor_info;
        public Integer business_type;
        public AnchorShopLinkStructV2 shop_link;
        public Integer show_type;
        public AnchorWikipediaStructV2 wikipedia_info;

        public final AnchorStructV2 build() {
            AnchorStructV2 anchorStructV2 = new AnchorStructV2(this.show_type, this.business_type, this.wikipedia_info, this.shop_link, this.anchor_info, this.anchor_id, super.buildUnknownFields());
            return anchorStructV2;
        }

        public final Builder anchor_id(String str) {
            this.anchor_id = str;
            return this;
        }

        public final Builder anchor_info(AnchorCommonStructV2 anchorCommonStructV2) {
            this.anchor_info = anchorCommonStructV2;
            return this;
        }

        public final Builder business_type(Integer num) {
            this.business_type = num;
            return this;
        }

        public final Builder shop_link(AnchorShopLinkStructV2 anchorShopLinkStructV2) {
            this.shop_link = anchorShopLinkStructV2;
            return this;
        }

        public final Builder show_type(Integer num) {
            this.show_type = num;
            return this;
        }

        public final Builder wikipedia_info(AnchorWikipediaStructV2 anchorWikipediaStructV2) {
            this.wikipedia_info = anchorWikipediaStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorStructV2$ProtoAdapter_AnchorStructV2 */
    static final class ProtoAdapter_AnchorStructV2 extends ProtoAdapter<AnchorStructV2> {
        public ProtoAdapter_AnchorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorStructV2.class);
        }

        public final int encodedSize(AnchorStructV2 anchorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, anchorStructV2.show_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, anchorStructV2.business_type) + AnchorWikipediaStructV2.ADAPTER.encodedSizeWithTag(3, anchorStructV2.wikipedia_info) + AnchorShopLinkStructV2.ADAPTER.encodedSizeWithTag(4, anchorStructV2.shop_link) + AnchorCommonStructV2.ADAPTER.encodedSizeWithTag(5, anchorStructV2.anchor_info) + ProtoAdapter.STRING.encodedSizeWithTag(6, anchorStructV2.anchor_id) + anchorStructV2.unknownFields().size();
        }

        public final AnchorStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.business_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.wikipedia_info((AnchorWikipediaStructV2) AnchorWikipediaStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.shop_link((AnchorShopLinkStructV2) AnchorShopLinkStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.anchor_info((AnchorCommonStructV2) AnchorCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.anchor_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AnchorStructV2 anchorStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, anchorStructV2.show_type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, anchorStructV2.business_type);
            AnchorWikipediaStructV2.ADAPTER.encodeWithTag(protoWriter, 3, anchorStructV2.wikipedia_info);
            AnchorShopLinkStructV2.ADAPTER.encodeWithTag(protoWriter, 4, anchorStructV2.shop_link);
            AnchorCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 5, anchorStructV2.anchor_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, anchorStructV2.anchor_id);
            protoWriter.writeBytes(anchorStructV2.unknownFields());
        }
    }

    public AnchorStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_type = this.show_type;
        builder.business_type = this.business_type;
        builder.wikipedia_info = this.wikipedia_info;
        builder.shop_link = this.shop_link;
        builder.anchor_info = this.anchor_info;
        builder.anchor_id = this.anchor_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.show_type != null) {
            i = this.show_type.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.business_type != null) {
            i2 = this.business_type.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.wikipedia_info != null) {
            i3 = this.wikipedia_info.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.shop_link != null) {
            i4 = this.shop_link.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.anchor_info != null) {
            i5 = this.anchor_info.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.anchor_id != null) {
            i7 = this.anchor_id.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_type != null) {
            sb.append(", show_type=");
            sb.append(this.show_type);
        }
        if (this.business_type != null) {
            sb.append(", business_type=");
            sb.append(this.business_type);
        }
        if (this.wikipedia_info != null) {
            sb.append(", wikipedia_info=");
            sb.append(this.wikipedia_info);
        }
        if (this.shop_link != null) {
            sb.append(", shop_link=");
            sb.append(this.shop_link);
        }
        if (this.anchor_info != null) {
            sb.append(", anchor_info=");
            sb.append(this.anchor_info);
        }
        if (this.anchor_id != null) {
            sb.append(", anchor_id=");
            sb.append(this.anchor_id);
        }
        StringBuilder replace = sb.replace(0, 2, "AnchorStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorStructV2)) {
            return false;
        }
        AnchorStructV2 anchorStructV2 = (AnchorStructV2) obj;
        if (!unknownFields().equals(anchorStructV2.unknownFields()) || !Internal.equals(this.show_type, anchorStructV2.show_type) || !Internal.equals(this.business_type, anchorStructV2.business_type) || !Internal.equals(this.wikipedia_info, anchorStructV2.wikipedia_info) || !Internal.equals(this.shop_link, anchorStructV2.shop_link) || !Internal.equals(this.anchor_info, anchorStructV2.anchor_info) || !Internal.equals(this.anchor_id, anchorStructV2.anchor_id)) {
            return false;
        }
        return true;
    }

    public AnchorStructV2(Integer num, Integer num2, AnchorWikipediaStructV2 anchorWikipediaStructV2, AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorCommonStructV2 anchorCommonStructV2, String str) {
        this(num, num2, anchorWikipediaStructV2, anchorShopLinkStructV2, anchorCommonStructV2, str, ByteString.EMPTY);
    }

    public AnchorStructV2(Integer num, Integer num2, AnchorWikipediaStructV2 anchorWikipediaStructV2, AnchorShopLinkStructV2 anchorShopLinkStructV2, AnchorCommonStructV2 anchorCommonStructV2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_type = num;
        this.business_type = num2;
        this.wikipedia_info = anchorWikipediaStructV2;
        this.shop_link = anchorShopLinkStructV2;
        this.anchor_info = anchorCommonStructV2;
        this.anchor_id = str;
    }
}
