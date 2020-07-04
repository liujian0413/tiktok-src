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

/* renamed from: com.ss.ugc.aweme.proto.AwemeNationalTaskStructV2 */
public final class AwemeNationalTaskStructV2 extends Message<AwemeNationalTaskStructV2, Builder> {
    public static final ProtoAdapter<AwemeNationalTaskStructV2> ADAPTER = new ProtoAdapter_AwemeNationalTaskStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.NationalTaskLinkStructV2#ADAPTER", tag = 1)
    public NationalTaskLinkStructV2 link_info;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeNationalTaskStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeNationalTaskStructV2, Builder> {
        public NationalTaskLinkStructV2 link_info;

        public final AwemeNationalTaskStructV2 build() {
            return new AwemeNationalTaskStructV2(this.link_info, super.buildUnknownFields());
        }

        public final Builder link_info(NationalTaskLinkStructV2 nationalTaskLinkStructV2) {
            this.link_info = nationalTaskLinkStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeNationalTaskStructV2$ProtoAdapter_AwemeNationalTaskStructV2 */
    static final class ProtoAdapter_AwemeNationalTaskStructV2 extends ProtoAdapter<AwemeNationalTaskStructV2> {
        public ProtoAdapter_AwemeNationalTaskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeNationalTaskStructV2.class);
        }

        public final int encodedSize(AwemeNationalTaskStructV2 awemeNationalTaskStructV2) {
            return NationalTaskLinkStructV2.ADAPTER.encodedSizeWithTag(1, awemeNationalTaskStructV2.link_info) + awemeNationalTaskStructV2.unknownFields().size();
        }

        public final AwemeNationalTaskStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.link_info((NationalTaskLinkStructV2) NationalTaskLinkStructV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeNationalTaskStructV2 awemeNationalTaskStructV2) throws IOException {
            NationalTaskLinkStructV2.ADAPTER.encodeWithTag(protoWriter, 1, awemeNationalTaskStructV2.link_info);
            protoWriter.writeBytes(awemeNationalTaskStructV2.unknownFields());
        }
    }

    public AwemeNationalTaskStructV2() {
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.link_info != null) {
            i = this.link_info.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.link_info = this.link_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeNationalTaskStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public AwemeNationalTaskStructV2(NationalTaskLinkStructV2 nationalTaskLinkStructV2) {
        this(nationalTaskLinkStructV2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeNationalTaskStructV2)) {
            return false;
        }
        AwemeNationalTaskStructV2 awemeNationalTaskStructV2 = (AwemeNationalTaskStructV2) obj;
        if (!unknownFields().equals(awemeNationalTaskStructV2.unknownFields()) || !Internal.equals(this.link_info, awemeNationalTaskStructV2.link_info)) {
            return false;
        }
        return true;
    }

    public AwemeNationalTaskStructV2(NationalTaskLinkStructV2 nationalTaskLinkStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_info = nationalTaskLinkStructV2;
    }
}
