package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody */
public final class DeleteStrangerConversationResponseBody extends Message<DeleteStrangerConversationResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerConversationResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerConversationResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerConversationResponseBody, Builder> {
        public final DeleteStrangerConversationResponseBody build() {
            return new DeleteStrangerConversationResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody$ProtoAdapter_DeleteStrangerConversationResponseBody */
    static final class ProtoAdapter_DeleteStrangerConversationResponseBody extends ProtoAdapter<DeleteStrangerConversationResponseBody> {
        public ProtoAdapter_DeleteStrangerConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerConversationResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            return deleteStrangerConversationResponseBody.unknownFields().size();
        }

        public final DeleteStrangerConversationResponseBody redact(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            Builder newBuilder = deleteStrangerConversationResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DeleteStrangerConversationResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) throws IOException {
            protoWriter.writeBytes(deleteStrangerConversationResponseBody.unknownFields());
        }
    }

    public DeleteStrangerConversationResponseBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteStrangerConversationResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteStrangerConversationResponseBody;
    }

    public DeleteStrangerConversationResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
