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

/* renamed from: com.ss.ugc.aweme.proto.LogPbStructV2 */
public final class LogPbStructV2 extends Message<LogPbStructV2, Builder> {
    public static final ProtoAdapter<LogPbStructV2> ADAPTER = new ProtoAdapter_LogPbStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String impr_id;

    /* renamed from: com.ss.ugc.aweme.proto.LogPbStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LogPbStructV2, Builder> {
        public String impr_id;

        public final LogPbStructV2 build() {
            return new LogPbStructV2(this.impr_id, super.buildUnknownFields());
        }

        public final Builder impr_id(String str) {
            this.impr_id = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.LogPbStructV2$ProtoAdapter_LogPbStructV2 */
    static final class ProtoAdapter_LogPbStructV2 extends ProtoAdapter<LogPbStructV2> {
        public ProtoAdapter_LogPbStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, LogPbStructV2.class);
        }

        public final int encodedSize(LogPbStructV2 logPbStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, logPbStructV2.impr_id) + logPbStructV2.unknownFields().size();
        }

        public final LogPbStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.impr_id((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, LogPbStructV2 logPbStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, logPbStructV2.impr_id);
            protoWriter.writeBytes(logPbStructV2.unknownFields());
        }
    }

    public LogPbStructV2() {
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.impr_id != null) {
            i = this.impr_id.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.impr_id = this.impr_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "LogPbStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public LogPbStructV2(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogPbStructV2)) {
            return false;
        }
        LogPbStructV2 logPbStructV2 = (LogPbStructV2) obj;
        if (!unknownFields().equals(logPbStructV2.unknownFields()) || !Internal.equals(this.impr_id, logPbStructV2.impr_id)) {
            return false;
        }
        return true;
    }

    public LogPbStructV2(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
