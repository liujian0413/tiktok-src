package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody */
public final class DeleteStrangerConversationRequestBody extends Message<DeleteStrangerConversationRequestBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerConversationRequestBody> ADAPTER = new ProtoAdapter_DeleteStrangerConversationRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long conversation_short_id;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerConversationRequestBody, Builder> {
        public Long conversation_short_id;

        public final DeleteStrangerConversationRequestBody build() {
            return new DeleteStrangerConversationRequestBody(this.conversation_short_id, super.buildUnknownFields());
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody$ProtoAdapter_DeleteStrangerConversationRequestBody */
    static final class ProtoAdapter_DeleteStrangerConversationRequestBody extends ProtoAdapter<DeleteStrangerConversationRequestBody> {
        public ProtoAdapter_DeleteStrangerConversationRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerConversationRequestBody.class);
        }

        public final DeleteStrangerConversationRequestBody redact(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            Builder newBuilder = deleteStrangerConversationRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerConversationRequestBody.conversation_short_id) + deleteStrangerConversationRequestBody.unknownFields().size();
        }

        public final DeleteStrangerConversationRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerConversationRequestBody.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerConversationRequestBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.conversation_short_id != null) {
            i = this.conversation_short_id.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteStrangerConversationRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteStrangerConversationRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteStrangerConversationRequestBody)) {
            return false;
        }
        DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody = (DeleteStrangerConversationRequestBody) obj;
        if (!unknownFields().equals(deleteStrangerConversationRequestBody.unknownFields()) || !Internal.equals(this.conversation_short_id, deleteStrangerConversationRequestBody.conversation_short_id)) {
            return false;
        }
        return true;
    }

    public DeleteStrangerConversationRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
