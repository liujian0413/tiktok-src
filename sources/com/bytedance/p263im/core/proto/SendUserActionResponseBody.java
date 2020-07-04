package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody */
public final class SendUserActionResponseBody extends Message<SendUserActionResponseBody, Builder> {
    public static final ProtoAdapter<SendUserActionResponseBody> ADAPTER = new ProtoAdapter_SendUserActionResponseBody();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendUserActionResponseBody, Builder> {
        public final SendUserActionResponseBody build() {
            return new SendUserActionResponseBody(super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SendUserActionResponseBody$ProtoAdapter_SendUserActionResponseBody */
    static final class ProtoAdapter_SendUserActionResponseBody extends ProtoAdapter<SendUserActionResponseBody> {
        public ProtoAdapter_SendUserActionResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendUserActionResponseBody.class);
        }

        public final int encodedSize(SendUserActionResponseBody sendUserActionResponseBody) {
            return sendUserActionResponseBody.unknownFields().size();
        }

        public final SendUserActionResponseBody redact(SendUserActionResponseBody sendUserActionResponseBody) {
            Builder newBuilder = sendUserActionResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final SendUserActionResponseBody decode(ProtoReader protoReader) throws IOException {
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

        public final void encode(ProtoWriter protoWriter, SendUserActionResponseBody sendUserActionResponseBody) throws IOException {
            protoWriter.writeBytes(sendUserActionResponseBody.unknownFields());
        }
    }

    public SendUserActionResponseBody() {
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
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendUserActionResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        return obj instanceof SendUserActionResponseBody;
    }

    public SendUserActionResponseBody(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
