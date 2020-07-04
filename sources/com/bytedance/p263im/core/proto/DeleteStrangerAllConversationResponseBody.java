package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody */
public final class DeleteStrangerAllConversationResponseBody extends Message<DeleteStrangerAllConversationResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerAllConversationResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerAllConversationResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerAllConversationResponseBody, Builder> {
        public final DeleteStrangerAllConversationResponseBody build() {
            return new DeleteStrangerAllConversationResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody$ProtoAdapter_DeleteStrangerAllConversationResponseBody */
    static final class ProtoAdapter_DeleteStrangerAllConversationResponseBody extends ProtoAdapter<DeleteStrangerAllConversationResponseBody> {
        public ProtoAdapter_DeleteStrangerAllConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerAllConversationResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            return deleteStrangerAllConversationResponseBody.unknownFields().size();
        }

        public final DeleteStrangerAllConversationResponseBody redact(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            Builder newBuilder = deleteStrangerAllConversationResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DeleteStrangerAllConversationResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) throws IOException {
            protoWriter.writeBytes(deleteStrangerAllConversationResponseBody.unknownFields());
        }
    }

    public DeleteStrangerAllConversationResponseBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteStrangerAllConversationResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteStrangerAllConversationResponseBody;
    }

    public DeleteStrangerAllConversationResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
