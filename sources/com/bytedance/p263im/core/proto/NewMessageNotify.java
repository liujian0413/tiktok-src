package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.NewMessageNotify */
public final class NewMessageNotify extends Message<NewMessageNotify, Builder> {
    public static final ProtoAdapter<NewMessageNotify> ADAPTER = new ProtoAdapter_NewMessageNotify();
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = Long.valueOf(0);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    public static final NewMessageNotifyType DEFAULT_NOTIFY_TYPE = NewMessageNotifyType.PER_USER;
    public static final Long DEFAULT_PREVIOUS_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 8)
    public final Long index_in_conversation;
    @WireField(adapter = "com.bytedance.im.core.proto.MessageBody#ADAPTER", tag = 5)
    public final MessageBody message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long next_cursor;
    @WireField(adapter = "com.bytedance.im.core.proto.NewMessageNotifyType#ADAPTER", tag = 4)
    public final NewMessageNotifyType notify_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long previous_cursor;

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotify$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NewMessageNotify, Builder> {
        public String conversation_id;
        public Integer conversation_type;
        public Long index_in_conversation;
        public MessageBody message;
        public Long next_cursor;
        public NewMessageNotifyType notify_type;
        public Long previous_cursor;

        public final NewMessageNotify build() {
            NewMessageNotify newMessageNotify = new NewMessageNotify(this.conversation_id, this.conversation_type, this.notify_type, this.message, this.previous_cursor, this.next_cursor, this.index_in_conversation, super.buildUnknownFields());
            return newMessageNotify;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder index_in_conversation(Long l) {
            this.index_in_conversation = l;
            return this;
        }

        public final Builder message(MessageBody messageBody) {
            this.message = messageBody;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder notify_type(NewMessageNotifyType newMessageNotifyType) {
            this.notify_type = newMessageNotifyType;
            return this;
        }

        public final Builder previous_cursor(Long l) {
            this.previous_cursor = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotify$ProtoAdapter_NewMessageNotify */
    static final class ProtoAdapter_NewMessageNotify extends ProtoAdapter<NewMessageNotify> {
        public ProtoAdapter_NewMessageNotify() {
            super(FieldEncoding.LENGTH_DELIMITED, NewMessageNotify.class);
        }

        public final NewMessageNotify redact(NewMessageNotify newMessageNotify) {
            Builder newBuilder = newMessageNotify.newBuilder();
            if (newBuilder.message != null) {
                newBuilder.message = (MessageBody) MessageBody.ADAPTER.redact(newBuilder.message);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(NewMessageNotify newMessageNotify) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, newMessageNotify.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, newMessageNotify.conversation_type) + NewMessageNotifyType.ADAPTER.encodedSizeWithTag(4, newMessageNotify.notify_type) + MessageBody.ADAPTER.encodedSizeWithTag(5, newMessageNotify.message) + ProtoAdapter.INT64.encodedSizeWithTag(6, newMessageNotify.previous_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(7, newMessageNotify.next_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(8, newMessageNotify.index_in_conversation) + newMessageNotify.unknownFields().size();
        }

        public final NewMessageNotify decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.notify_type((NewMessageNotifyType) NewMessageNotifyType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.message((MessageBody) MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.previous_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.index_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, NewMessageNotify newMessageNotify) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, newMessageNotify.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, newMessageNotify.conversation_type);
            NewMessageNotifyType.ADAPTER.encodeWithTag(protoWriter, 4, newMessageNotify.notify_type);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 5, newMessageNotify.message);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, newMessageNotify.previous_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, newMessageNotify.next_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, newMessageNotify.index_in_conversation);
            protoWriter.writeBytes(newMessageNotify.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.notify_type = this.notify_type;
        builder.message = this.message;
        builder.previous_cursor = this.previous_cursor;
        builder.next_cursor = this.next_cursor;
        builder.index_in_conversation = this.index_in_conversation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.notify_type != null) {
            i3 = this.notify_type.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.message != null) {
            i4 = this.message.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.previous_cursor != null) {
            i5 = this.previous_cursor.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.next_cursor != null) {
            i6 = this.next_cursor.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.index_in_conversation != null) {
            i8 = this.index_in_conversation.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.notify_type != null) {
            sb.append(", notify_type=");
            sb.append(this.notify_type);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.previous_cursor != null) {
            sb.append(", previous_cursor=");
            sb.append(this.previous_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        StringBuilder replace = sb.replace(0, 2, "NewMessageNotify{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMessageNotify)) {
            return false;
        }
        NewMessageNotify newMessageNotify = (NewMessageNotify) obj;
        if (!unknownFields().equals(newMessageNotify.unknownFields()) || !Internal.equals(this.conversation_id, newMessageNotify.conversation_id) || !Internal.equals(this.conversation_type, newMessageNotify.conversation_type) || !Internal.equals(this.notify_type, newMessageNotify.notify_type) || !Internal.equals(this.message, newMessageNotify.message) || !Internal.equals(this.previous_cursor, newMessageNotify.previous_cursor) || !Internal.equals(this.next_cursor, newMessageNotify.next_cursor) || !Internal.equals(this.index_in_conversation, newMessageNotify.index_in_conversation)) {
            return false;
        }
        return true;
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l, Long l2, Long l3) {
        this(str, num, newMessageNotifyType, messageBody, l, l2, l3, ByteString.EMPTY);
    }

    public NewMessageNotify(String str, Integer num, NewMessageNotifyType newMessageNotifyType, MessageBody messageBody, Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.notify_type = newMessageNotifyType;
        this.message = messageBody;
        this.previous_cursor = l;
        this.next_cursor = l2;
        this.index_in_conversation = l3;
    }
}
