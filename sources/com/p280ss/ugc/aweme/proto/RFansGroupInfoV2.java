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

/* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2 */
public final class RFansGroupInfoV2 extends Message<RFansGroupInfoV2, Builder> {
    public static final ProtoAdapter<RFansGroupInfoV2> ADAPTER = new ProtoAdapter_RFansGroupInfoV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String download_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String token;

    /* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<RFansGroupInfoV2, Builder> {
        public String download_url;
        public String schema;
        public String token;

        public final RFansGroupInfoV2 build() {
            return new RFansGroupInfoV2(this.schema, this.token, this.download_url, super.buildUnknownFields());
        }

        public final Builder download_url(String str) {
            this.download_url = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.RFansGroupInfoV2$ProtoAdapter_RFansGroupInfoV2 */
    static final class ProtoAdapter_RFansGroupInfoV2 extends ProtoAdapter<RFansGroupInfoV2> {
        public ProtoAdapter_RFansGroupInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, RFansGroupInfoV2.class);
        }

        public final int encodedSize(RFansGroupInfoV2 rFansGroupInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, rFansGroupInfoV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, rFansGroupInfoV2.token) + ProtoAdapter.STRING.encodedSizeWithTag(3, rFansGroupInfoV2.download_url) + rFansGroupInfoV2.unknownFields().size();
        }

        public final RFansGroupInfoV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.token((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.download_url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, RFansGroupInfoV2 rFansGroupInfoV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, rFansGroupInfoV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, rFansGroupInfoV2.token);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, rFansGroupInfoV2.download_url);
            protoWriter.writeBytes(rFansGroupInfoV2.unknownFields());
        }
    }

    public RFansGroupInfoV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.token = this.token;
        builder.download_url = this.download_url;
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
        if (this.schema != null) {
            i = this.schema.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.token != null) {
            i2 = this.token.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.download_url != null) {
            i4 = this.download_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.download_url != null) {
            sb.append(", download_url=");
            sb.append(this.download_url);
        }
        StringBuilder replace = sb.replace(0, 2, "RFansGroupInfoV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RFansGroupInfoV2)) {
            return false;
        }
        RFansGroupInfoV2 rFansGroupInfoV2 = (RFansGroupInfoV2) obj;
        if (!unknownFields().equals(rFansGroupInfoV2.unknownFields()) || !Internal.equals(this.schema, rFansGroupInfoV2.schema) || !Internal.equals(this.token, rFansGroupInfoV2.token) || !Internal.equals(this.download_url, rFansGroupInfoV2.download_url)) {
            return false;
        }
        return true;
    }

    public RFansGroupInfoV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public RFansGroupInfoV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
        this.token = str2;
        this.download_url = str3;
    }
}
