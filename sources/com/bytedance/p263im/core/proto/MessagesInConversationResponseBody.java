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

/* renamed from: com.bytedance.im.core.proto.MessagesInConversationResponseBody */
public final class MessagesInConversationResponseBody extends Message<MessagesInConversationResponseBody, Builder> {
    public static final ProtoAdapter<MessagesInConversationResponseBody> ADAPTER = new ProtoAdapter_MessagesInConversationResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean has_more;
    @WireField(adapter = "com.bytedance.im.core.proto.MessageBody#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<MessageBody> messages;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.MessagesInConversationResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessagesInConversationResponseBody, Builder> {
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;

        public final MessagesInConversationResponseBody build() {
            return new MessagesInConversationResponseBody(this.messages, this.next_cursor, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessagesInConversationResponseBody$ProtoAdapter_MessagesInConversationResponseBody */
    static final class ProtoAdapter_MessagesInConversationResponseBody extends ProtoAdapter<MessagesInConversationResponseBody> {
        public ProtoAdapter_MessagesInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesInConversationResponseBody.class);
        }

        public final MessagesInConversationResponseBody redact(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            Builder newBuilder = messagesInConversationResponseBody.newBuilder();
            Internal.redactElements(newBuilder.messages, MessageBody.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesInConversationResponseBody.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesInConversationResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesInConversationResponseBody.has_more) + messagesInConversationResponseBody.unknownFields().size();
        }

        public final MessagesInConversationResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.has_more((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesInConversationResponseBody messagesInConversationResponseBody) throws IOException {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesInConversationResponseBody.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesInConversationResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messagesInConversationResponseBody.has_more);
            protoWriter.writeBytes(messagesInConversationResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.messages.hashCode()) * 37;
        int i3 = 0;
        if (this.next_cursor != null) {
            i = this.next_cursor.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.has_more != null) {
            i3 = this.has_more.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesInConversationResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessagesInConversationResponseBody)) {
            return false;
        }
        MessagesInConversationResponseBody messagesInConversationResponseBody = (MessagesInConversationResponseBody) obj;
        if (!unknownFields().equals(messagesInConversationResponseBody.unknownFields()) || !this.messages.equals(messagesInConversationResponseBody.messages) || !Internal.equals(this.next_cursor, messagesInConversationResponseBody.next_cursor) || !Internal.equals(this.has_more, messagesInConversationResponseBody.has_more)) {
            return false;
        }
        return true;
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool) {
        this(list, l, bool, ByteString.EMPTY);
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
    }
}
