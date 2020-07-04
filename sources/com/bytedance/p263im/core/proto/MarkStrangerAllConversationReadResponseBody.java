package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody */
public final class MarkStrangerAllConversationReadResponseBody extends Message<MarkStrangerAllConversationReadResponseBody, Builder> {
    public static final ProtoAdapter<MarkStrangerAllConversationReadResponseBody> ADAPTER = new ProtoAdapter_MarkStrangerAllConversationReadResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MarkStrangerAllConversationReadResponseBody, Builder> {
        public final MarkStrangerAllConversationReadResponseBody build() {
            return new MarkStrangerAllConversationReadResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody$ProtoAdapter_MarkStrangerAllConversationReadResponseBody */
    static final class ProtoAdapter_MarkStrangerAllConversationReadResponseBody extends ProtoAdapter<MarkStrangerAllConversationReadResponseBody> {
        public ProtoAdapter_MarkStrangerAllConversationReadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerAllConversationReadResponseBody.class);
        }

        public final int encodedSize(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            return markStrangerAllConversationReadResponseBody.unknownFields().size();
        }

        public final MarkStrangerAllConversationReadResponseBody redact(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            Builder newBuilder = markStrangerAllConversationReadResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MarkStrangerAllConversationReadResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) throws IOException {
            protoWriter.writeBytes(markStrangerAllConversationReadResponseBody.unknownFields());
        }
    }

    public MarkStrangerAllConversationReadResponseBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "MarkStrangerAllConversationReadResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof MarkStrangerAllConversationReadResponseBody;
    }

    public MarkStrangerAllConversationReadResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
