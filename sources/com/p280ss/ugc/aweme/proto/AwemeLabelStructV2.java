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

/* renamed from: com.ss.ugc.aweme.proto.AwemeLabelStructV2 */
public final class AwemeLabelStructV2 extends Message<AwemeLabelStructV2, Builder> {
    public static final ProtoAdapter<AwemeLabelStructV2> ADAPTER = new ProtoAdapter_AwemeLabelStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer label_type;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 1)
    public UrlStructV2 label_url;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeLabelStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeLabelStructV2, Builder> {
        public Integer label_type;
        public UrlStructV2 label_url;

        public final AwemeLabelStructV2 build() {
            return new AwemeLabelStructV2(this.label_url, this.label_type, super.buildUnknownFields());
        }

        public final Builder label_type(Integer num) {
            this.label_type = num;
            return this;
        }

        public final Builder label_url(UrlStructV2 urlStructV2) {
            this.label_url = urlStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeLabelStructV2$ProtoAdapter_AwemeLabelStructV2 */
    static final class ProtoAdapter_AwemeLabelStructV2 extends ProtoAdapter<AwemeLabelStructV2> {
        public ProtoAdapter_AwemeLabelStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeLabelStructV2.class);
        }

        public final int encodedSize(AwemeLabelStructV2 awemeLabelStructV2) {
            return UrlStructV2.ADAPTER.encodedSizeWithTag(1, awemeLabelStructV2.label_url) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemeLabelStructV2.label_type) + awemeLabelStructV2.unknownFields().size();
        }

        public final AwemeLabelStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.label_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.label_type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeLabelStructV2 awemeLabelStructV2) throws IOException {
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 1, awemeLabelStructV2.label_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemeLabelStructV2.label_type);
            protoWriter.writeBytes(awemeLabelStructV2.unknownFields());
        }
    }

    public AwemeLabelStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.label_url = this.label_url;
        builder.label_type = this.label_type;
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
        if (this.label_url != null) {
            i = this.label_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.label_type != null) {
            i3 = this.label_type.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.label_url != null) {
            sb.append(", label_url=");
            sb.append(this.label_url);
        }
        if (this.label_type != null) {
            sb.append(", label_type=");
            sb.append(this.label_type);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeLabelStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeLabelStructV2)) {
            return false;
        }
        AwemeLabelStructV2 awemeLabelStructV2 = (AwemeLabelStructV2) obj;
        if (!unknownFields().equals(awemeLabelStructV2.unknownFields()) || !Internal.equals(this.label_url, awemeLabelStructV2.label_url) || !Internal.equals(this.label_type, awemeLabelStructV2.label_type)) {
            return false;
        }
        return true;
    }

    public AwemeLabelStructV2(UrlStructV2 urlStructV2, Integer num) {
        this(urlStructV2, num, ByteString.EMPTY);
    }

    public AwemeLabelStructV2(UrlStructV2 urlStructV2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_url = urlStructV2;
        this.label_type = num;
    }
}
