package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.MessageBody */
public final class MessageBody extends Message<MessageBody, Builder> {
    public static final ProtoAdapter<MessageBody> ADAPTER = new ProtoAdapter_MessageBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CREATE_TIME = Long.valueOf(0);
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = Long.valueOf(0);
    public static final Integer DEFAULT_MESSAGE_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_ORDER_IN_CONVERSATION = Long.valueOf(0);
    public static final Long DEFAULT_SENDER = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    public static final Long DEFAULT_VERSION = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long create_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final Map<String, String> ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long index_in_conversation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer message_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long order_in_conversation;
    @WireField(adapter = "com.bytedance.im.core.proto.PropertyItemList#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final Map<String, PropertyItemList> property_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String sec_sender;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long sender;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long server_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long version;

    /* renamed from: com.bytedance.im.core.proto.MessageBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MessageBody, Builder> {
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long create_time;
        public Map<String, String> ext = Internal.newMutableMap();
        public Long index_in_conversation;
        public Integer message_type;
        public Long order_in_conversation;
        public Map<String, PropertyItemList> property_list = Internal.newMutableMap();
        public String sec_sender;
        public Long sender;
        public Long server_message_id;
        public Integer status;
        public Long version;

        public final MessageBody build() {
            MessageBody messageBody = new MessageBody(this.conversation_id, this.conversation_type, this.server_message_id, this.index_in_conversation, this.conversation_short_id, this.message_type, this.sender, this.content, this.ext, this.create_time, this.version, this.status, this.order_in_conversation, this.sec_sender, this.property_list, super.buildUnknownFields());
            return messageBody;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder create_time(Long l) {
            this.create_time = l;
            return this;
        }

        public final Builder index_in_conversation(Long l) {
            this.index_in_conversation = l;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder order_in_conversation(Long l) {
            this.order_in_conversation = l;
            return this;
        }

        public final Builder sec_sender(String str) {
            this.sec_sender = str;
            return this;
        }

        public final Builder sender(Long l) {
            this.sender = l;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder version(Long l) {
            this.version = l;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder property_list(Map<String, PropertyItemList> map) {
            Internal.checkElementsNotNull(map);
            this.property_list = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.MessageBody$ProtoAdapter_MessageBody */
    static final class ProtoAdapter_MessageBody extends ProtoAdapter<MessageBody> {
        private final ProtoAdapter<Map<String, String>> ext;
        private final ProtoAdapter<Map<String, PropertyItemList>> property_list = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PropertyItemList.ADAPTER);

        public ProtoAdapter_MessageBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final MessageBody redact(MessageBody messageBody) {
            Builder newBuilder = messageBody.newBuilder();
            Internal.redactElements(newBuilder.property_list, PropertyItemList.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(MessageBody messageBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, messageBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, messageBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, messageBody.server_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(4, messageBody.index_in_conversation) + ProtoAdapter.INT64.encodedSizeWithTag(5, messageBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, messageBody.message_type) + ProtoAdapter.INT64.encodedSizeWithTag(7, messageBody.sender) + ProtoAdapter.STRING.encodedSizeWithTag(8, messageBody.content) + this.ext.encodedSizeWithTag(9, messageBody.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, messageBody.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(11, messageBody.version) + ProtoAdapter.INT32.encodedSizeWithTag(12, messageBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(13, messageBody.order_in_conversation) + ProtoAdapter.STRING.encodedSizeWithTag(14, messageBody.sec_sender) + this.property_list.encodedSizeWithTag(15, messageBody.property_list) + messageBody.unknownFields().size();
        }

        public final MessageBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.index_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.message_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.sender((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 10:
                            builder.create_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 11:
                            builder.version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 12:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 13:
                            builder.order_in_conversation((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 14:
                            builder.sec_sender((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.property_list.putAll((Map) this.property_list.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessageBody messageBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messageBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageBody.server_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageBody.index_in_conversation);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messageBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, messageBody.message_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, messageBody.sender);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messageBody.content);
            this.ext.encodeWithTag(protoWriter, 9, messageBody.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, messageBody.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, messageBody.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, messageBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, messageBody.order_in_conversation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, messageBody.sec_sender);
            this.property_list.encodeWithTag(protoWriter, 15, messageBody.property_list);
            protoWriter.writeBytes(messageBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.server_message_id = this.server_message_id;
        builder.index_in_conversation = this.index_in_conversation;
        builder.conversation_short_id = this.conversation_short_id;
        builder.message_type = this.message_type;
        builder.sender = this.sender;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.create_time = this.create_time;
        builder.version = this.version;
        builder.status = this.status;
        builder.order_in_conversation = this.order_in_conversation;
        builder.sec_sender = this.sec_sender;
        builder.property_list = Internal.copyOf("property_list", this.property_list);
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i14 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 37;
        if (this.server_message_id != null) {
            i3 = this.server_message_id.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 37;
        if (this.index_in_conversation != null) {
            i4 = this.index_in_conversation.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 37;
        if (this.conversation_short_id != null) {
            i5 = this.conversation_short_id.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 37;
        if (this.message_type != null) {
            i6 = this.message_type.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 37;
        if (this.sender != null) {
            i7 = this.sender.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 37;
        if (this.content != null) {
            i8 = this.content.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode2 = (((i21 + i8) * 37) + this.ext.hashCode()) * 37;
        if (this.create_time != null) {
            i9 = this.create_time.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (hashCode2 + i9) * 37;
        if (this.version != null) {
            i10 = this.version.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        if (this.status != null) {
            i11 = this.status.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 37;
        if (this.order_in_conversation != null) {
            i12 = this.order_in_conversation.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 37;
        if (this.sec_sender != null) {
            i14 = this.sec_sender.hashCode();
        }
        int hashCode3 = ((i25 + i14) * 37) + this.property_list.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.order_in_conversation != null) {
            sb.append(", order_in_conversation=");
            sb.append(this.order_in_conversation);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
        if (!this.property_list.isEmpty()) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageBody)) {
            return false;
        }
        MessageBody messageBody = (MessageBody) obj;
        if (!unknownFields().equals(messageBody.unknownFields()) || !Internal.equals(this.conversation_id, messageBody.conversation_id) || !Internal.equals(this.conversation_type, messageBody.conversation_type) || !Internal.equals(this.server_message_id, messageBody.server_message_id) || !Internal.equals(this.index_in_conversation, messageBody.index_in_conversation) || !Internal.equals(this.conversation_short_id, messageBody.conversation_short_id) || !Internal.equals(this.message_type, messageBody.message_type) || !Internal.equals(this.sender, messageBody.sender) || !Internal.equals(this.content, messageBody.content) || !this.ext.equals(messageBody.ext) || !Internal.equals(this.create_time, messageBody.create_time) || !Internal.equals(this.version, messageBody.version) || !Internal.equals(this.status, messageBody.status) || !Internal.equals(this.order_in_conversation, messageBody.order_in_conversation) || !Internal.equals(this.sec_sender, messageBody.sec_sender) || !this.property_list.equals(messageBody.property_list)) {
            return false;
        }
        return true;
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2) {
        this(str, num, l, l2, l3, num2, l4, str2, map, l5, l6, num3, l7, str3, map2, ByteString.EMPTY);
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.server_message_id = l;
        this.index_in_conversation = l2;
        this.conversation_short_id = l3;
        this.message_type = num2;
        this.sender = l4;
        this.content = str2;
        Map<String, String> map3 = map;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.create_time = l5;
        this.version = l6;
        this.status = num3;
        this.order_in_conversation = l7;
        this.sec_sender = str3;
        this.property_list = Internal.immutableCopyOf("property_list", map2);
    }
}
