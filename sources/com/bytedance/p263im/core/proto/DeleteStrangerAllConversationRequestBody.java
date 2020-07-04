package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody */
public final class DeleteStrangerAllConversationRequestBody extends Message<DeleteStrangerAllConversationRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerAllConversationRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerAllConversationRequestBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerAllConversationRequestBody, Builder> {
        public final DeleteStrangerAllConversationRequestBody build() {
            return new DeleteStrangerAllConversationRequestBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationRequestBody$ProtoAdapter_DeleteStrangerAllConversationRequestBody */
    static final class ProtoAdapter_DeleteStrangerAllConversationRequestBody extends ProtoAdapter<DeleteStrangerAllConversationRequestBody> {
        public ProtoAdapter_DeleteStrangerAllConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerAllConversationRequestBody.class);
        }

        public final int encodedSize(DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            return deleteStrangerAllConversationRequestBody.unknownFields().size();
        }

        public final DeleteStrangerAllConversationRequestBody redact(DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) {
            Builder newBuilder = deleteStrangerAllConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DeleteStrangerAllConversationRequestBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerAllConversationRequestBody deleteStrangerAllConversationRequestBody) throws IOException {
            protoWriter.writeBytes(deleteStrangerAllConversationRequestBody.unknownFields());
        }
    }

    public DeleteStrangerAllConversationRequestBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteStrangerAllConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteStrangerAllConversationRequestBody;
    }

    public DeleteStrangerAllConversationRequestBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
