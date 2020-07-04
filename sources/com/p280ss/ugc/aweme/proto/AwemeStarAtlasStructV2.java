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

/* renamed from: com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2 */
public final class AwemeStarAtlasStructV2 extends Message<AwemeStarAtlasStructV2, Builder> {
    public static final ProtoAdapter<AwemeStarAtlasStructV2> ADAPTER = new ProtoAdapter_AwemeStarAtlasStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.StarAtlasLinkStructV2#ADAPTER", tag = 2)
    public StarAtlasLinkStructV2 link_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer review_status;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeStarAtlasStructV2, Builder> {
        public StarAtlasLinkStructV2 link_info;
        public Integer review_status;

        public final AwemeStarAtlasStructV2 build() {
            return new AwemeStarAtlasStructV2(this.review_status, this.link_info, super.buildUnknownFields());
        }

        public final Builder link_info(StarAtlasLinkStructV2 starAtlasLinkStructV2) {
            this.link_info = starAtlasLinkStructV2;
            return this;
        }

        public final Builder review_status(Integer num) {
            this.review_status = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeStarAtlasStructV2$ProtoAdapter_AwemeStarAtlasStructV2 */
    static final class ProtoAdapter_AwemeStarAtlasStructV2 extends ProtoAdapter<AwemeStarAtlasStructV2> {
        public ProtoAdapter_AwemeStarAtlasStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeStarAtlasStructV2.class);
        }

        public final int encodedSize(AwemeStarAtlasStructV2 awemeStarAtlasStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeStarAtlasStructV2.review_status) + StarAtlasLinkStructV2.ADAPTER.encodedSizeWithTag(2, awemeStarAtlasStructV2.link_info) + awemeStarAtlasStructV2.unknownFields().size();
        }

        public final AwemeStarAtlasStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.review_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.link_info((StarAtlasLinkStructV2) StarAtlasLinkStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeStarAtlasStructV2 awemeStarAtlasStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeStarAtlasStructV2.review_status);
            StarAtlasLinkStructV2.ADAPTER.encodeWithTag(protoWriter, 2, awemeStarAtlasStructV2.link_info);
            protoWriter.writeBytes(awemeStarAtlasStructV2.unknownFields());
        }
    }

    public AwemeStarAtlasStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.review_status = this.review_status;
        builder.link_info = this.link_info;
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
        if (this.review_status != null) {
            i = this.review_status.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.link_info != null) {
            i3 = this.link_info.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.review_status != null) {
            sb.append(", review_status=");
            sb.append(this.review_status);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeStarAtlasStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeStarAtlasStructV2)) {
            return false;
        }
        AwemeStarAtlasStructV2 awemeStarAtlasStructV2 = (AwemeStarAtlasStructV2) obj;
        if (!unknownFields().equals(awemeStarAtlasStructV2.unknownFields()) || !Internal.equals(this.review_status, awemeStarAtlasStructV2.review_status) || !Internal.equals(this.link_info, awemeStarAtlasStructV2.link_info)) {
            return false;
        }
        return true;
    }

    public AwemeStarAtlasStructV2(Integer num, StarAtlasLinkStructV2 starAtlasLinkStructV2) {
        this(num, starAtlasLinkStructV2, ByteString.EMPTY);
    }

    public AwemeStarAtlasStructV2(Integer num, StarAtlasLinkStructV2 starAtlasLinkStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.review_status = num;
        this.link_info = starAtlasLinkStructV2;
    }
}
