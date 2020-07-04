package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody */
public final class GetStrangerMessagesResponseBody extends Message<GetStrangerMessagesResponseBody, Builder> {
    public static final ProtoAdapter<GetStrangerMessagesResponseBody> ADAPTER = new ProtoAdapter_GetStrangerMessagesResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.MessageBody#ADAPTER", label = Label.REPEATED, tag = 3)
    public final List<MessageBody> messages;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetStrangerMessagesResponseBody, Builder> {
        public List<MessageBody> messages = Internal.newMutableList();

        public final GetStrangerMessagesResponseBody build() {
            return new GetStrangerMessagesResponseBody(this.messages, super.buildUnknownFields());
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerMessagesResponseBody$ProtoAdapter_GetStrangerMessagesResponseBody */
    static final class ProtoAdapter_GetStrangerMessagesResponseBody extends ProtoAdapter<GetStrangerMessagesResponseBody> {
        public ProtoAdapter_GetStrangerMessagesResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerMessagesResponseBody.class);
        }

        public final int encodedSize(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(3, getStrangerMessagesResponseBody.messages) + getStrangerMessagesResponseBody.unknownFields().size();
        }

        public final GetStrangerMessagesResponseBody redact(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            Builder newBuilder = getStrangerMessagesResponseBody.newBuilder();
            Internal.redactElements(newBuilder.messages, MessageBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetStrangerMessagesResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) throws IOException {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getStrangerMessagesResponseBody.messages);
            protoWriter.writeBytes(getStrangerMessagesResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.messages.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStrangerMessagesResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStrangerMessagesResponseBody)) {
            return false;
        }
        GetStrangerMessagesResponseBody getStrangerMessagesResponseBody = (GetStrangerMessagesResponseBody) obj;
        if (!unknownFields().equals(getStrangerMessagesResponseBody.unknownFields()) || !this.messages.equals(getStrangerMessagesResponseBody.messages)) {
            return false;
        }
        return true;
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
