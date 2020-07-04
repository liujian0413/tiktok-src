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

/* renamed from: com.ss.ugc.aweme.proto.CategoryCoverStructV2 */
public final class CategoryCoverStructV2 extends Message<CategoryCoverStructV2, Builder> {
    public static final ProtoAdapter<CategoryCoverStructV2> ADAPTER = new ProtoAdapter_CategoryCoverStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String aweme_id;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 cover;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 dynamic_cover;

    /* renamed from: com.ss.ugc.aweme.proto.CategoryCoverStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CategoryCoverStructV2, Builder> {
        public String aweme_id;
        public UrlStructV2 cover;
        public UrlStructV2 dynamic_cover;

        public final CategoryCoverStructV2 build() {
            return new CategoryCoverStructV2(this.aweme_id, this.cover, this.dynamic_cover, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder cover(UrlStructV2 urlStructV2) {
            this.cover = urlStructV2;
            return this;
        }

        public final Builder dynamic_cover(UrlStructV2 urlStructV2) {
            this.dynamic_cover = urlStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CategoryCoverStructV2$ProtoAdapter_CategoryCoverStructV2 */
    static final class ProtoAdapter_CategoryCoverStructV2 extends ProtoAdapter<CategoryCoverStructV2> {
        public ProtoAdapter_CategoryCoverStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryCoverStructV2.class);
        }

        public final int encodedSize(CategoryCoverStructV2 categoryCoverStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryCoverStructV2.aweme_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, categoryCoverStructV2.cover) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, categoryCoverStructV2.dynamic_cover) + categoryCoverStructV2.unknownFields().size();
        }

        public final CategoryCoverStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.dynamic_cover((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CategoryCoverStructV2 categoryCoverStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, categoryCoverStructV2.aweme_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, categoryCoverStructV2.cover);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, categoryCoverStructV2.dynamic_cover);
            protoWriter.writeBytes(categoryCoverStructV2.unknownFields());
        }
    }

    public CategoryCoverStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.cover = this.cover;
        builder.dynamic_cover = this.dynamic_cover;
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
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.cover != null) {
            i2 = this.cover.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.dynamic_cover != null) {
            i4 = this.dynamic_cover.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.dynamic_cover != null) {
            sb.append(", dynamic_cover=");
            sb.append(this.dynamic_cover);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryCoverStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryCoverStructV2)) {
            return false;
        }
        CategoryCoverStructV2 categoryCoverStructV2 = (CategoryCoverStructV2) obj;
        if (!unknownFields().equals(categoryCoverStructV2.unknownFields()) || !Internal.equals(this.aweme_id, categoryCoverStructV2.aweme_id) || !Internal.equals(this.cover, categoryCoverStructV2.cover) || !Internal.equals(this.dynamic_cover, categoryCoverStructV2.dynamic_cover)) {
            return false;
        }
        return true;
    }

    public CategoryCoverStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(str, urlStructV2, urlStructV22, ByteString.EMPTY);
    }

    public CategoryCoverStructV2(String str, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.cover = urlStructV2;
        this.dynamic_cover = urlStructV22;
    }
}
