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

/* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody */
public final class CheckMessagesPerUserResponseBody extends Message<CheckMessagesPerUserResponseBody, Builder> {
    public static final ProtoAdapter<CheckMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter_CheckMessagesPerUserResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<InboxMessagesPerUserResponseBody> messages;

    /* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CheckMessagesPerUserResponseBody, Builder> {
        public List<InboxMessagesPerUserResponseBody> messages = Internal.newMutableList();

        public final CheckMessagesPerUserResponseBody build() {
            return new CheckMessagesPerUserResponseBody(this.messages, super.buildUnknownFields());
        }

        public final Builder messages(List<InboxMessagesPerUserResponseBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody$ProtoAdapter_CheckMessagesPerUserResponseBody */
    static final class ProtoAdapter_CheckMessagesPerUserResponseBody extends ProtoAdapter<CheckMessagesPerUserResponseBody> {
        public ProtoAdapter_CheckMessagesPerUserResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckMessagesPerUserResponseBody.class);
        }

        public final int encodedSize(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            return InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagesPerUserResponseBody.messages) + checkMessagesPerUserResponseBody.unknownFields().size();
        }

        public final CheckMessagesPerUserResponseBody redact(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            Builder newBuilder = checkMessagesPerUserResponseBody.newBuilder();
            Internal.redactElements(newBuilder.messages, InboxMessagesPerUserResponseBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final CheckMessagesPerUserResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.messages.add(InboxMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) throws IOException {
            InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagesPerUserResponseBody.messages);
            protoWriter.writeBytes(checkMessagesPerUserResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "CheckMessagesPerUserResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckMessagesPerUserResponseBody)) {
            return false;
        }
        CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = (CheckMessagesPerUserResponseBody) obj;
        if (!unknownFields().equals(checkMessagesPerUserResponseBody.unknownFields()) || !this.messages.equals(checkMessagesPerUserResponseBody.messages)) {
            return false;
        }
        return true;
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
