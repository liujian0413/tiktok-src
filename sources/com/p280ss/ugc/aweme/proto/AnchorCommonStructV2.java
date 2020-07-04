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

/* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2 */
public final class AnchorCommonStructV2 extends Message<AnchorCommonStructV2, Builder> {
    public static final ProtoAdapter<AnchorCommonStructV2> ADAPTER = new ProtoAdapter_AnchorCommonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    /* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AnchorCommonStructV2, Builder> {
        public String keyword;
        public String url;

        public final AnchorCommonStructV2 build() {
            return new AnchorCommonStructV2(this.keyword, this.url, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorCommonStructV2$ProtoAdapter_AnchorCommonStructV2 */
    static final class ProtoAdapter_AnchorCommonStructV2 extends ProtoAdapter<AnchorCommonStructV2> {
        public ProtoAdapter_AnchorCommonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorCommonStructV2.class);
        }

        public final int encodedSize(AnchorCommonStructV2 anchorCommonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorCommonStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorCommonStructV2.url) + anchorCommonStructV2.unknownFields().size();
        }

        public final AnchorCommonStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.keyword((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AnchorCommonStructV2 anchorCommonStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorCommonStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorCommonStructV2.url);
            protoWriter.writeBytes(anchorCommonStructV2.unknownFields());
        }
    }

    public AnchorCommonStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.url = this.url;
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
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.url != null) {
            i3 = this.url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "AnchorCommonStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorCommonStructV2)) {
            return false;
        }
        AnchorCommonStructV2 anchorCommonStructV2 = (AnchorCommonStructV2) obj;
        if (!unknownFields().equals(anchorCommonStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorCommonStructV2.keyword) || !Internal.equals(this.url, anchorCommonStructV2.url)) {
            return false;
        }
        return true;
    }

    public AnchorCommonStructV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AnchorCommonStructV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.url = str2;
    }
}
