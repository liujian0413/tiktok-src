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

/* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody */
public final class SendMessageResponseBody extends Message<SendMessageResponseBody, Builder> {
    public static final ProtoAdapter<SendMessageResponseBody> ADAPTER = new ProtoAdapter_SendMessageResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String check_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String client_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String extra_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long server_message_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendMessageResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String client_message_id;
        public String extra_info;
        public Long server_message_id;
        public Integer status;

        public final SendMessageResponseBody build() {
            SendMessageResponseBody sendMessageResponseBody = new SendMessageResponseBody(this.server_message_id, this.extra_info, this.status, this.client_message_id, this.check_code, this.check_message, super.buildUnknownFields());
            return sendMessageResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
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
    }

    /* renamed from: com.bytedance.im.core.proto.SendMessageResponseBody$ProtoAdapter_SendMessageResponseBody */
    static final class ProtoAdapter_SendMessageResponseBody extends ProtoAdapter<SendMessageResponseBody> {
        public ProtoAdapter_SendMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageResponseBody.class);
        }

        public final SendMessageResponseBody redact(SendMessageResponseBody sendMessageResponseBody) {
            Builder newBuilder = sendMessageResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SendMessageResponseBody sendMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, sendMessageResponseBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendMessageResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, sendMessageResponseBody.client_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, sendMessageResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, sendMessageResponseBody.check_message) + sendMessageResponseBody.unknownFields().size();
        }

        public final SendMessageResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendMessageResponseBody sendMessageResponseBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sendMessageResponseBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendMessageResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendMessageResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendMessageResponseBody.client_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, sendMessageResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendMessageResponseBody.check_message);
            protoWriter.writeBytes(sendMessageResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.extra_info = this.extra_info;
        builder.status = this.status;
        builder.client_message_id = this.client_message_id;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.server_message_id != null) {
            i = this.server_message_id.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.extra_info != null) {
            i2 = this.extra_info.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.status != null) {
            i3 = this.status.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.client_message_id != null) {
            i4 = this.client_message_id.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.check_code != null) {
            i5 = this.check_code.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.check_message != null) {
            i7 = this.check_message.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMessageResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendMessageResponseBody)) {
            return false;
        }
        SendMessageResponseBody sendMessageResponseBody = (SendMessageResponseBody) obj;
        if (!unknownFields().equals(sendMessageResponseBody.unknownFields()) || !Internal.equals(this.server_message_id, sendMessageResponseBody.server_message_id) || !Internal.equals(this.extra_info, sendMessageResponseBody.extra_info) || !Internal.equals(this.status, sendMessageResponseBody.status) || !Internal.equals(this.client_message_id, sendMessageResponseBody.client_message_id) || !Internal.equals(this.check_code, sendMessageResponseBody.check_code) || !Internal.equals(this.check_message, sendMessageResponseBody.check_message)) {
            return false;
        }
        return true;
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3) {
        this(l, str, num, str2, l2, str3, ByteString.EMPTY);
    }

    public SendMessageResponseBody(Long l, String str, Integer num, String str2, Long l2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.extra_info = str;
        this.status = num;
        this.client_message_id = str2;
        this.check_code = l2;
        this.check_message = str3;
    }
}
