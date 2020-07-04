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

/* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2 */
public final class ItemLikeEggDataV2 extends Message<ItemLikeEggDataV2, Builder> {
    public static final ProtoAdapter<ItemLikeEggDataV2> ADAPTER = new ProtoAdapter_ItemLikeEggDataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String file_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String material_url;

    /* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ItemLikeEggDataV2, Builder> {
        public String file_type;
        public String material_url;

        public final ItemLikeEggDataV2 build() {
            return new ItemLikeEggDataV2(this.material_url, this.file_type, super.buildUnknownFields());
        }

        public final Builder file_type(String str) {
            this.file_type = str;
            return this;
        }

        public final Builder material_url(String str) {
            this.material_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ItemLikeEggDataV2$ProtoAdapter_ItemLikeEggDataV2 */
    static final class ProtoAdapter_ItemLikeEggDataV2 extends ProtoAdapter<ItemLikeEggDataV2> {
        public ProtoAdapter_ItemLikeEggDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ItemLikeEggDataV2.class);
        }

        public final int encodedSize(ItemLikeEggDataV2 itemLikeEggDataV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, itemLikeEggDataV2.material_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, itemLikeEggDataV2.file_type) + itemLikeEggDataV2.unknownFields().size();
        }

        public final ItemLikeEggDataV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.material_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.file_type((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ItemLikeEggDataV2 itemLikeEggDataV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, itemLikeEggDataV2.material_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, itemLikeEggDataV2.file_type);
            protoWriter.writeBytes(itemLikeEggDataV2.unknownFields());
        }
    }

    public ItemLikeEggDataV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.material_url = this.material_url;
        builder.file_type = this.file_type;
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
        if (this.material_url != null) {
            i = this.material_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.file_type != null) {
            i3 = this.file_type.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.material_url != null) {
            sb.append(", material_url=");
            sb.append(this.material_url);
        }
        if (this.file_type != null) {
            sb.append(", file_type=");
            sb.append(this.file_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ItemLikeEggDataV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemLikeEggDataV2)) {
            return false;
        }
        ItemLikeEggDataV2 itemLikeEggDataV2 = (ItemLikeEggDataV2) obj;
        if (!unknownFields().equals(itemLikeEggDataV2.unknownFields()) || !Internal.equals(this.material_url, itemLikeEggDataV2.material_url) || !Internal.equals(this.file_type, itemLikeEggDataV2.file_type)) {
            return false;
        }
        return true;
    }

    public ItemLikeEggDataV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public ItemLikeEggDataV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.material_url = str;
        this.file_type = str2;
    }
}
