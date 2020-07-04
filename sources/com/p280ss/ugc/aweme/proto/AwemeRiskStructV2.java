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

/* renamed from: com.ss.ugc.aweme.proto.AwemeRiskStructV2 */
public final class AwemeRiskStructV2 extends Message<AwemeRiskStructV2, Builder> {
    public static final ProtoAdapter<AwemeRiskStructV2> ADAPTER = new ProtoAdapter_AwemeRiskStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean risk_sink;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean vote;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean warn;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeRiskStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeRiskStructV2, Builder> {
        public String content;
        public Boolean risk_sink;
        public Integer type;
        public Boolean vote;
        public Boolean warn;

        public final AwemeRiskStructV2 build() {
            AwemeRiskStructV2 awemeRiskStructV2 = new AwemeRiskStructV2(this.vote, this.warn, this.risk_sink, this.type, this.content, super.buildUnknownFields());
            return awemeRiskStructV2;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder risk_sink(Boolean bool) {
            this.risk_sink = bool;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder vote(Boolean bool) {
            this.vote = bool;
            return this;
        }

        public final Builder warn(Boolean bool) {
            this.warn = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeRiskStructV2$ProtoAdapter_AwemeRiskStructV2 */
    static final class ProtoAdapter_AwemeRiskStructV2 extends ProtoAdapter<AwemeRiskStructV2> {
        public ProtoAdapter_AwemeRiskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeRiskStructV2.class);
        }

        public final int encodedSize(AwemeRiskStructV2 awemeRiskStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, awemeRiskStructV2.vote) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeRiskStructV2.warn) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeRiskStructV2.risk_sink) + ProtoAdapter.INT32.encodedSizeWithTag(4, awemeRiskStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeRiskStructV2.content) + awemeRiskStructV2.unknownFields().size();
        }

        public final AwemeRiskStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.vote((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.warn((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.risk_sink((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeRiskStructV2 awemeRiskStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, awemeRiskStructV2.vote);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeRiskStructV2.warn);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeRiskStructV2.risk_sink);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, awemeRiskStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeRiskStructV2.content);
            protoWriter.writeBytes(awemeRiskStructV2.unknownFields());
        }
    }

    public AwemeRiskStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.vote = this.vote;
        builder.warn = this.warn;
        builder.risk_sink = this.risk_sink;
        builder.type = this.type;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.vote != null) {
            i = this.vote.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.warn != null) {
            i2 = this.warn.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.risk_sink != null) {
            i3 = this.risk_sink.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.type != null) {
            i4 = this.type.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.content != null) {
            i6 = this.content.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.vote != null) {
            sb.append(", vote=");
            sb.append(this.vote);
        }
        if (this.warn != null) {
            sb.append(", warn=");
            sb.append(this.warn);
        }
        if (this.risk_sink != null) {
            sb.append(", risk_sink=");
            sb.append(this.risk_sink);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeRiskStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeRiskStructV2)) {
            return false;
        }
        AwemeRiskStructV2 awemeRiskStructV2 = (AwemeRiskStructV2) obj;
        if (!unknownFields().equals(awemeRiskStructV2.unknownFields()) || !Internal.equals(this.vote, awemeRiskStructV2.vote) || !Internal.equals(this.warn, awemeRiskStructV2.warn) || !Internal.equals(this.risk_sink, awemeRiskStructV2.risk_sink) || !Internal.equals(this.type, awemeRiskStructV2.type) || !Internal.equals(this.content, awemeRiskStructV2.content)) {
            return false;
        }
        return true;
    }

    public AwemeRiskStructV2(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str) {
        this(bool, bool2, bool3, num, str, ByteString.EMPTY);
    }

    public AwemeRiskStructV2(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.vote = bool;
        this.warn = bool2;
        this.risk_sink = bool3;
        this.type = num;
        this.content = str;
    }
}
