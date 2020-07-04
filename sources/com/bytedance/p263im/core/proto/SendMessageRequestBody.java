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
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SendMessageRequestBody */
public final class SendMessageRequestBody extends Message<SendMessageRequestBody, Builder> {
    public static final ProtoAdapter<SendMessageRequestBody> ADAPTER = new ProtoAdapter_SendMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_MESSAGE_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String client_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, String> ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 9)
    public final List<Long> mentioned_users;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer message_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.SendMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendMessageRequestBody, Builder> {
        public String client_message_id;
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public List<Long> mentioned_users = Internal.newMutableList();
        public Integer message_type;
        public String ticket;

        public final SendMessageRequestBody build() {
            SendMessageRequestBody sendMessageRequestBody = new SendMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.content, this.ext, this.message_type, this.ticket, this.client_message_id, this.mentioned_users, super.buildUnknownFields());
            return sendMessageRequestBody;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
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

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder mentioned_users(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.mentioned_users = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SendMessageRequestBody$ProtoAdapter_SendMessageRequestBody */
    static final class ProtoAdapter_SendMessageRequestBody extends ProtoAdapter<SendMessageRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_SendMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final SendMessageRequestBody redact(SendMessageRequestBody sendMessageRequestBody) {
            Builder newBuilder = sendMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SendMessageRequestBody sendMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendMessageRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, sendMessageRequestBody.content) + this.ext.encodedSizeWithTag(5, sendMessageRequestBody.ext) + ProtoAdapter.INT32.encodedSizeWithTag(6, sendMessageRequestBody.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, sendMessageRequestBody.ticket) + ProtoAdapter.STRING.encodedSizeWithTag(8, sendMessageRequestBody.client_message_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(9, sendMessageRequestBody.mentioned_users) + sendMessageRequestBody.unknownFields().size();
        }

        public final SendMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 6:
                            builder.message_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.mentioned_users.add(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendMessageRequestBody sendMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendMessageRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendMessageRequestBody.content);
            this.ext.encodeWithTag(protoWriter, 5, sendMessageRequestBody.ext);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, sendMessageRequestBody.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sendMessageRequestBody.ticket);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sendMessageRequestBody.client_message_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 9, sendMessageRequestBody.mentioned_users);
            protoWriter.writeBytes(sendMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.message_type = this.message_type;
        builder.ticket = this.ticket;
        builder.client_message_id = this.client_message_id;
        builder.mentioned_users = Internal.copyOf("mentioned_users", this.mentioned_users);
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
        if (this.conversation_short_id != null) {
            i3 = this.conversation_short_id.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.content != null) {
            i4 = this.content.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i11 + i4) * 37) + this.ext.hashCode()) * 37;
        if (this.message_type != null) {
            i5 = this.message_type.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (hashCode2 + i5) * 37;
        if (this.ticket != null) {
            i6 = this.ticket.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        if (this.client_message_id != null) {
            i8 = this.client_message_id.hashCode();
        }
        int hashCode3 = ((i13 + i8) * 37) + this.mentioned_users.hashCode();
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
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (!this.mentioned_users.isEmpty()) {
            sb.append(", mentioned_users=");
            sb.append(this.mentioned_users);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendMessageRequestBody)) {
            return false;
        }
        SendMessageRequestBody sendMessageRequestBody = (SendMessageRequestBody) obj;
        if (!unknownFields().equals(sendMessageRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, sendMessageRequestBody.conversation_id) || !Internal.equals(this.conversation_type, sendMessageRequestBody.conversation_type) || !Internal.equals(this.conversation_short_id, sendMessageRequestBody.conversation_short_id) || !Internal.equals(this.content, sendMessageRequestBody.content) || !this.ext.equals(sendMessageRequestBody.ext) || !Internal.equals(this.message_type, sendMessageRequestBody.message_type) || !Internal.equals(this.ticket, sendMessageRequestBody.ticket) || !Internal.equals(this.client_message_id, sendMessageRequestBody.client_message_id) || !this.mentioned_users.equals(sendMessageRequestBody.mentioned_users)) {
            return false;
        }
        return true;
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list) {
        this(str, num, l, str2, map, num2, str3, str4, list, ByteString.EMPTY);
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.content = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.message_type = num2;
        this.ticket = str3;
        this.client_message_id = str4;
        this.mentioned_users = Internal.immutableCopyOf("mentioned_users", list);
    }
}
