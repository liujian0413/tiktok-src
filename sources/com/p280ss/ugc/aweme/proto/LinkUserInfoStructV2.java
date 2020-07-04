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

/* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2 */
public final class LinkUserInfoStructV2 extends Message<LinkUserInfoStructV2, Builder> {
    public static final ProtoAdapter<LinkUserInfoStructV2> ADAPTER = new ProtoAdapter_LinkUserInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer auth_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer auth_type;

    /* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LinkUserInfoStructV2, Builder> {
        public Integer auth_status;
        public Integer auth_type;

        public final LinkUserInfoStructV2 build() {
            return new LinkUserInfoStructV2(this.auth_status, this.auth_type, super.buildUnknownFields());
        }

        public final Builder auth_status(Integer num) {
            this.auth_status = num;
            return this;
        }

        public final Builder auth_type(Integer num) {
            this.auth_type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LinkUserInfoStructV2$ProtoAdapter_LinkUserInfoStructV2 */
    static final class ProtoAdapter_LinkUserInfoStructV2 extends ProtoAdapter<LinkUserInfoStructV2> {
        public ProtoAdapter_LinkUserInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LinkUserInfoStructV2.class);
        }

        public final int encodedSize(LinkUserInfoStructV2 linkUserInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, linkUserInfoStructV2.auth_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, linkUserInfoStructV2.auth_type) + linkUserInfoStructV2.unknownFields().size();
        }

        public final LinkUserInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.auth_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.auth_type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, LinkUserInfoStructV2 linkUserInfoStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, linkUserInfoStructV2.auth_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, linkUserInfoStructV2.auth_type);
            protoWriter.writeBytes(linkUserInfoStructV2.unknownFields());
        }
    }

    public LinkUserInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.auth_status = this.auth_status;
        builder.auth_type = this.auth_type;
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
        if (this.auth_status != null) {
            i = this.auth_status.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.auth_type != null) {
            i3 = this.auth_type.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.auth_status != null) {
            sb.append(", auth_status=");
            sb.append(this.auth_status);
        }
        if (this.auth_type != null) {
            sb.append(", auth_type=");
            sb.append(this.auth_type);
        }
        StringBuilder replace = sb.replace(0, 2, "LinkUserInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkUserInfoStructV2)) {
            return false;
        }
        LinkUserInfoStructV2 linkUserInfoStructV2 = (LinkUserInfoStructV2) obj;
        if (!unknownFields().equals(linkUserInfoStructV2.unknownFields()) || !Internal.equals(this.auth_status, linkUserInfoStructV2.auth_status) || !Internal.equals(this.auth_type, linkUserInfoStructV2.auth_type)) {
            return false;
        }
        return true;
    }

    public LinkUserInfoStructV2(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public LinkUserInfoStructV2(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auth_status = num;
        this.auth_type = num2;
    }
}
