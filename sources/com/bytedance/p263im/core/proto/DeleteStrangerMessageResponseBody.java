package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody */
public final class DeleteStrangerMessageResponseBody extends Message<DeleteStrangerMessageResponseBody, Builder> {
    public static final ProtoAdapter<DeleteStrangerMessageResponseBody> ADAPTER = new ProtoAdapter_DeleteStrangerMessageResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteStrangerMessageResponseBody, Builder> {
        public final DeleteStrangerMessageResponseBody build() {
            return new DeleteStrangerMessageResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody$ProtoAdapter_DeleteStrangerMessageResponseBody */
    static final class ProtoAdapter_DeleteStrangerMessageResponseBody extends ProtoAdapter<DeleteStrangerMessageResponseBody> {
        public ProtoAdapter_DeleteStrangerMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteStrangerMessageResponseBody.class);
        }

        public final int encodedSize(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            return deleteStrangerMessageResponseBody.unknownFields().size();
        }

        public final DeleteStrangerMessageResponseBody redact(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            Builder newBuilder = deleteStrangerMessageResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final DeleteStrangerMessageResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) throws IOException {
            protoWriter.writeBytes(deleteStrangerMessageResponseBody.unknownFields());
        }
    }

    public DeleteStrangerMessageResponseBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteStrangerMessageResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof DeleteStrangerMessageResponseBody;
    }

    public DeleteStrangerMessageResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
