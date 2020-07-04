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

/* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStructV2 */
public final class AwemeCommerceStructV2 extends Message<AwemeCommerceStructV2, Builder> {
    public static final ProtoAdapter<AwemeCommerceStructV2> ADAPTER = new ProtoAdapter_AwemeCommerceStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer ad_auth_status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer ad_source;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean avoid_global_pendant;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeCommerceStructV2, Builder> {
        public Integer ad_auth_status;
        public Integer ad_source;
        public Boolean avoid_global_pendant;

        public final AwemeCommerceStructV2 build() {
            return new AwemeCommerceStructV2(this.ad_auth_status, this.ad_source, this.avoid_global_pendant, super.buildUnknownFields());
        }

        public final Builder ad_auth_status(Integer num) {
            this.ad_auth_status = num;
            return this;
        }

        public final Builder ad_source(Integer num) {
            this.ad_source = num;
            return this;
        }

        public final Builder avoid_global_pendant(Boolean bool) {
            this.avoid_global_pendant = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeCommerceStructV2$ProtoAdapter_AwemeCommerceStructV2 */
    static final class ProtoAdapter_AwemeCommerceStructV2 extends ProtoAdapter<AwemeCommerceStructV2> {
        public ProtoAdapter_AwemeCommerceStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeCommerceStructV2.class);
        }

        public final int encodedSize(AwemeCommerceStructV2 awemeCommerceStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeCommerceStructV2.ad_auth_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, awemeCommerceStructV2.ad_source) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeCommerceStructV2.avoid_global_pendant) + awemeCommerceStructV2.unknownFields().size();
        }

        public final AwemeCommerceStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.ad_auth_status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.ad_source((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.avoid_global_pendant((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeCommerceStructV2 awemeCommerceStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeCommerceStructV2.ad_auth_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, awemeCommerceStructV2.ad_source);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeCommerceStructV2.avoid_global_pendant);
            protoWriter.writeBytes(awemeCommerceStructV2.unknownFields());
        }
    }

    public AwemeCommerceStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.ad_auth_status = this.ad_auth_status;
        builder.ad_source = this.ad_source;
        builder.avoid_global_pendant = this.avoid_global_pendant;
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
        if (this.ad_auth_status != null) {
            i = this.ad_auth_status.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.ad_source != null) {
            i2 = this.ad_source.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.avoid_global_pendant != null) {
            i4 = this.avoid_global_pendant.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ad_auth_status != null) {
            sb.append(", ad_auth_status=");
            sb.append(this.ad_auth_status);
        }
        if (this.ad_source != null) {
            sb.append(", ad_source=");
            sb.append(this.ad_source);
        }
        if (this.avoid_global_pendant != null) {
            sb.append(", avoid_global_pendant=");
            sb.append(this.avoid_global_pendant);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeCommerceStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeCommerceStructV2)) {
            return false;
        }
        AwemeCommerceStructV2 awemeCommerceStructV2 = (AwemeCommerceStructV2) obj;
        if (!unknownFields().equals(awemeCommerceStructV2.unknownFields()) || !Internal.equals(this.ad_auth_status, awemeCommerceStructV2.ad_auth_status) || !Internal.equals(this.ad_source, awemeCommerceStructV2.ad_source) || !Internal.equals(this.avoid_global_pendant, awemeCommerceStructV2.avoid_global_pendant)) {
            return false;
        }
        return true;
    }

    public AwemeCommerceStructV2(Integer num, Integer num2, Boolean bool) {
        this(num, num2, bool, ByteString.EMPTY);
    }

    public AwemeCommerceStructV2(Integer num, Integer num2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ad_auth_status = num;
        this.ad_source = num2;
        this.avoid_global_pendant = bool;
    }
}
