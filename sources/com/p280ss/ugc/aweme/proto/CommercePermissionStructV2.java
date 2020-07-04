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

/* renamed from: com.ss.ugc.aweme.proto.CommercePermissionStructV2 */
public final class CommercePermissionStructV2 extends Message<CommercePermissionStructV2, Builder> {
    public static final ProtoAdapter<CommercePermissionStructV2> ADAPTER = new ProtoAdapter_CommercePermissionStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer ad_link;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer star_atlas_order;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer top_item;

    /* renamed from: com.ss.ugc.aweme.proto.CommercePermissionStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommercePermissionStructV2, Builder> {
        public Integer ad_link;
        public Integer star_atlas_order;
        public Integer top_item;

        public final CommercePermissionStructV2 build() {
            return new CommercePermissionStructV2(this.top_item, this.ad_link, this.star_atlas_order, super.buildUnknownFields());
        }

        public final Builder ad_link(Integer num) {
            this.ad_link = num;
            return this;
        }

        public final Builder star_atlas_order(Integer num) {
            this.star_atlas_order = num;
            return this;
        }

        public final Builder top_item(Integer num) {
            this.top_item = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommercePermissionStructV2$ProtoAdapter_CommercePermissionStructV2 */
    static final class ProtoAdapter_CommercePermissionStructV2 extends ProtoAdapter<CommercePermissionStructV2> {
        public ProtoAdapter_CommercePermissionStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommercePermissionStructV2.class);
        }

        public final int encodedSize(CommercePermissionStructV2 commercePermissionStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, commercePermissionStructV2.top_item) + ProtoAdapter.INT32.encodedSizeWithTag(2, commercePermissionStructV2.ad_link) + ProtoAdapter.INT32.encodedSizeWithTag(3, commercePermissionStructV2.star_atlas_order) + commercePermissionStructV2.unknownFields().size();
        }

        public final CommercePermissionStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.top_item((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_link((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.star_atlas_order((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommercePermissionStructV2 commercePermissionStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, commercePermissionStructV2.top_item);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, commercePermissionStructV2.ad_link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, commercePermissionStructV2.star_atlas_order);
            protoWriter.writeBytes(commercePermissionStructV2.unknownFields());
        }
    }

    public CommercePermissionStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.top_item = this.top_item;
        builder.ad_link = this.ad_link;
        builder.star_atlas_order = this.star_atlas_order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.top_item != null) {
            i = this.top_item.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.ad_link != null) {
            i2 = this.ad_link.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.star_atlas_order != null) {
            i4 = this.star_atlas_order.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.top_item != null) {
            sb.append(", top_item=");
            sb.append(this.top_item);
        }
        if (this.ad_link != null) {
            sb.append(", ad_link=");
            sb.append(this.ad_link);
        }
        if (this.star_atlas_order != null) {
            sb.append(", star_atlas_order=");
            sb.append(this.star_atlas_order);
        }
        StringBuilder replace = sb.replace(0, 2, "CommercePermissionStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommercePermissionStructV2)) {
            return false;
        }
        CommercePermissionStructV2 commercePermissionStructV2 = (CommercePermissionStructV2) obj;
        if (!unknownFields().equals(commercePermissionStructV2.unknownFields()) || !Internal.equals(this.top_item, commercePermissionStructV2.top_item) || !Internal.equals(this.ad_link, commercePermissionStructV2.ad_link) || !Internal.equals(this.star_atlas_order, commercePermissionStructV2.star_atlas_order)) {
            return false;
        }
        return true;
    }

    public CommercePermissionStructV2(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public CommercePermissionStructV2(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top_item = num;
        this.ad_link = num2;
        this.star_atlas_order = num3;
    }
}
