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

/* renamed from: com.ss.ugc.aweme.proto.ImageInfoStructV2 */
public final class ImageInfoStructV2 extends Message<ImageInfoStructV2, Builder> {
    public static final ProtoAdapter<ImageInfoStructV2> ADAPTER = new ProtoAdapter_ImageInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer height;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 label_large;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 4)
    public UrlStructV2 label_thumb;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer width;

    /* renamed from: com.ss.ugc.aweme.proto.ImageInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ImageInfoStructV2, Builder> {
        public Integer height;
        public UrlStructV2 label_large;
        public UrlStructV2 label_thumb;
        public Integer width;

        public final ImageInfoStructV2 build() {
            ImageInfoStructV2 imageInfoStructV2 = new ImageInfoStructV2(this.height, this.width, this.label_large, this.label_thumb, super.buildUnknownFields());
            return imageInfoStructV2;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder label_large(UrlStructV2 urlStructV2) {
            this.label_large = urlStructV2;
            return this;
        }

        public final Builder label_thumb(UrlStructV2 urlStructV2) {
            this.label_thumb = urlStructV2;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ImageInfoStructV2$ProtoAdapter_ImageInfoStructV2 */
    static final class ProtoAdapter_ImageInfoStructV2 extends ProtoAdapter<ImageInfoStructV2> {
        public ProtoAdapter_ImageInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageInfoStructV2.class);
        }

        public final int encodedSize(ImageInfoStructV2 imageInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, imageInfoStructV2.height) + ProtoAdapter.INT32.encodedSizeWithTag(2, imageInfoStructV2.width) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, imageInfoStructV2.label_large) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, imageInfoStructV2.label_thumb) + imageInfoStructV2.unknownFields().size();
        }

        public final ImageInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.height((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.width((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.label_large((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.label_thumb((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ImageInfoStructV2 imageInfoStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, imageInfoStructV2.height);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, imageInfoStructV2.width);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, imageInfoStructV2.label_large);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, imageInfoStructV2.label_thumb);
            protoWriter.writeBytes(imageInfoStructV2.unknownFields());
        }
    }

    public ImageInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.height = this.height;
        builder.width = this.width;
        builder.label_large = this.label_large;
        builder.label_thumb = this.label_thumb;
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
        if (this.height != null) {
            i = this.height.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.width != null) {
            i2 = this.width.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.label_large != null) {
            i3 = this.label_large.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.label_thumb != null) {
            i5 = this.label_thumb.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.label_large != null) {
            sb.append(", label_large=");
            sb.append(this.label_large);
        }
        if (this.label_thumb != null) {
            sb.append(", label_thumb=");
            sb.append(this.label_thumb);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageInfoStructV2)) {
            return false;
        }
        ImageInfoStructV2 imageInfoStructV2 = (ImageInfoStructV2) obj;
        if (!unknownFields().equals(imageInfoStructV2.unknownFields()) || !Internal.equals(this.height, imageInfoStructV2.height) || !Internal.equals(this.width, imageInfoStructV2.width) || !Internal.equals(this.label_large, imageInfoStructV2.label_large) || !Internal.equals(this.label_thumb, imageInfoStructV2.label_thumb)) {
            return false;
        }
        return true;
    }

    public ImageInfoStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22) {
        this(num, num2, urlStructV2, urlStructV22, ByteString.EMPTY);
    }

    public ImageInfoStructV2(Integer num, Integer num2, UrlStructV2 urlStructV2, UrlStructV2 urlStructV22, ByteString byteString) {
        super(ADAPTER, byteString);
        this.height = num;
        this.width = num2;
        this.label_large = urlStructV2;
        this.label_thumb = urlStructV22;
    }
}
