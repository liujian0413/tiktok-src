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

/* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggMaterialDataV2 */
final class ItemCommentEggMaterialDataV2 extends Message<ItemCommentEggMaterialDataV2, Builder> {
    public static final ProtoAdapter<ItemCommentEggMaterialDataV2> ADAPTER = new ProtoAdapter_ItemCommentEggMaterialDataV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String egg_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String file_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String material_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String regex;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggMaterialDataV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ItemCommentEggMaterialDataV2, Builder> {
        public String egg_id;
        public String file_type;
        public String material_url;
        public String open_url;
        public String regex;
        public String web_url;

        public final ItemCommentEggMaterialDataV2 build() {
            ItemCommentEggMaterialDataV2 itemCommentEggMaterialDataV2 = new ItemCommentEggMaterialDataV2(this.file_type, this.material_url, this.open_url, this.web_url, this.regex, this.egg_id, super.buildUnknownFields());
            return itemCommentEggMaterialDataV2;
        }

        public final Builder egg_id(String str) {
            this.egg_id = str;
            return this;
        }

        public final Builder file_type(String str) {
            this.file_type = str;
            return this;
        }

        public final Builder material_url(String str) {
            this.material_url = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder regex(String str) {
            this.regex = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ItemCommentEggMaterialDataV2$ProtoAdapter_ItemCommentEggMaterialDataV2 */
    static final class ProtoAdapter_ItemCommentEggMaterialDataV2 extends ProtoAdapter<ItemCommentEggMaterialDataV2> {
        public ProtoAdapter_ItemCommentEggMaterialDataV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ItemCommentEggMaterialDataV2.class);
        }

        public final int encodedSize(ItemCommentEggMaterialDataV2 itemCommentEggMaterialDataV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, itemCommentEggMaterialDataV2.file_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, itemCommentEggMaterialDataV2.material_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, itemCommentEggMaterialDataV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(4, itemCommentEggMaterialDataV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, itemCommentEggMaterialDataV2.regex) + ProtoAdapter.STRING.encodedSizeWithTag(6, itemCommentEggMaterialDataV2.egg_id) + itemCommentEggMaterialDataV2.unknownFields().size();
        }

        public final ItemCommentEggMaterialDataV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.file_type((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.material_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.regex((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.egg_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ItemCommentEggMaterialDataV2 itemCommentEggMaterialDataV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, itemCommentEggMaterialDataV2.file_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, itemCommentEggMaterialDataV2.material_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, itemCommentEggMaterialDataV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, itemCommentEggMaterialDataV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, itemCommentEggMaterialDataV2.regex);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, itemCommentEggMaterialDataV2.egg_id);
            protoWriter.writeBytes(itemCommentEggMaterialDataV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.file_type = this.file_type;
        builder.material_url = this.material_url;
        builder.open_url = this.open_url;
        builder.web_url = this.web_url;
        builder.regex = this.regex;
        builder.egg_id = this.egg_id;
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
        if (this.file_type != null) {
            i = this.file_type.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.material_url != null) {
            i2 = this.material_url.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.open_url != null) {
            i3 = this.open_url.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.web_url != null) {
            i4 = this.web_url.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.regex != null) {
            i5 = this.regex.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.egg_id != null) {
            i7 = this.egg_id.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.file_type != null) {
            sb.append(", file_type=");
            sb.append(this.file_type);
        }
        if (this.material_url != null) {
            sb.append(", material_url=");
            sb.append(this.material_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.regex != null) {
            sb.append(", regex=");
            sb.append(this.regex);
        }
        if (this.egg_id != null) {
            sb.append(", egg_id=");
            sb.append(this.egg_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ItemCommentEggMaterialDataV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemCommentEggMaterialDataV2)) {
            return false;
        }
        ItemCommentEggMaterialDataV2 itemCommentEggMaterialDataV2 = (ItemCommentEggMaterialDataV2) obj;
        if (!unknownFields().equals(itemCommentEggMaterialDataV2.unknownFields()) || !Internal.equals(this.file_type, itemCommentEggMaterialDataV2.file_type) || !Internal.equals(this.material_url, itemCommentEggMaterialDataV2.material_url) || !Internal.equals(this.open_url, itemCommentEggMaterialDataV2.open_url) || !Internal.equals(this.web_url, itemCommentEggMaterialDataV2.web_url) || !Internal.equals(this.regex, itemCommentEggMaterialDataV2.regex) || !Internal.equals(this.egg_id, itemCommentEggMaterialDataV2.egg_id)) {
            return false;
        }
        return true;
    }

    public ItemCommentEggMaterialDataV2(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public ItemCommentEggMaterialDataV2(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.file_type = str;
        this.material_url = str2;
        this.open_url = str3;
        this.web_url = str4;
        this.regex = str5;
        this.egg_id = str6;
    }
}
