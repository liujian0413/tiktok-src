package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody */
public final class MarkStrangerConversationReadResponseBody extends Message<MarkStrangerConversationReadResponseBody, Builder> {
    public static final ProtoAdapter<MarkStrangerConversationReadResponseBody> ADAPTER = new ProtoAdapter_MarkStrangerConversationReadResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MarkStrangerConversationReadResponseBody, Builder> {
        public final MarkStrangerConversationReadResponseBody build() {
            return new MarkStrangerConversationReadResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody$ProtoAdapter_MarkStrangerConversationReadResponseBody */
    static final class ProtoAdapter_MarkStrangerConversationReadResponseBody extends ProtoAdapter<MarkStrangerConversationReadResponseBody> {
        public ProtoAdapter_MarkStrangerConversationReadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerConversationReadResponseBody.class);
        }

        public final int encodedSize(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            return markStrangerConversationReadResponseBody.unknownFields().size();
        }

        public final MarkStrangerConversationReadResponseBody redact(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            Builder newBuilder = markStrangerConversationReadResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MarkStrangerConversationReadResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) throws IOException {
            protoWriter.writeBytes(markStrangerConversationReadResponseBody.unknownFields());
        }
    }

    public MarkStrangerConversationReadResponseBody() {
        this(ByteString.EMPTY);
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "MarkStrangerConversationReadResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof MarkStrangerConversationReadResponseBody;
    }

    public MarkStrangerConversationReadResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
