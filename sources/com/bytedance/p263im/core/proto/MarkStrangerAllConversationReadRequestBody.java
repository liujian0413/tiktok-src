package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody */
public final class MarkStrangerAllConversationReadRequestBody extends Message<MarkStrangerAllConversationReadRequestBody, Builder> {
    public static final ProtoAdapter<MarkStrangerAllConversationReadRequestBody> ADAPTER = new ProtoAdapter_MarkStrangerAllConversationReadRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MarkStrangerAllConversationReadRequestBody, Builder> {
        public final MarkStrangerAllConversationReadRequestBody build() {
            return new MarkStrangerAllConversationReadRequestBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody$ProtoAdapter_MarkStrangerAllConversationReadRequestBody */
    static final class ProtoAdapter_MarkStrangerAllConversationReadRequestBody extends ProtoAdapter<MarkStrangerAllConversationReadRequestBody> {
        public ProtoAdapter_MarkStrangerAllConversationReadRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkStrangerAllConversationReadRequestBody.class);
        }

        public final int encodedSize(MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            return markStrangerAllConversationReadRequestBody.unknownFields().size();
        }

        public final MarkStrangerAllConversationReadRequestBody redact(MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) {
            Builder newBuilder = markStrangerAllConversationReadRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final MarkStrangerAllConversationReadRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, MarkStrangerAllConversationReadRequestBody markStrangerAllConversationReadRequestBody) throws IOException {
            protoWriter.writeBytes(markStrangerAllConversationReadRequestBody.unknownFields());
        }
    }

    public MarkStrangerAllConversationReadRequestBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "MarkStrangerAllConversationReadRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof MarkStrangerAllConversationReadRequestBody;
    }

    public MarkStrangerAllConversationReadRequestBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
