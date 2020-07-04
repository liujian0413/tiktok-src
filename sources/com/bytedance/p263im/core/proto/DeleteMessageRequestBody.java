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

/* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody */
public final class DeleteMessageRequestBody extends Message<DeleteMessageRequestBody, Builder> {
    public static final ProtoAdapter<DeleteMessageRequestBody> ADAPTER = new ProtoAdapter_DeleteMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_MESSAGE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long message_id;

    /* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteMessageRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long message_id;

        public final DeleteMessageRequestBody build() {
            DeleteMessageRequestBody deleteMessageRequestBody = new DeleteMessageRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.message_id, super.buildUnknownFields());
            return deleteMessageRequestBody;
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

        public final Builder message_id(Long l) {
            this.message_id = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteMessageRequestBody$ProtoAdapter_DeleteMessageRequestBody */
    static final class ProtoAdapter_DeleteMessageRequestBody extends ProtoAdapter<DeleteMessageRequestBody> {
        public ProtoAdapter_DeleteMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMessageRequestBody.class);
        }

        public final DeleteMessageRequestBody redact(DeleteMessageRequestBody deleteMessageRequestBody) {
            Builder newBuilder = deleteMessageRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteMessageRequestBody deleteMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteMessageRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, deleteMessageRequestBody.message_id) + deleteMessageRequestBody.unknownFields().size();
        }

        public final DeleteMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.message_id((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteMessageRequestBody deleteMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteMessageRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, deleteMessageRequestBody.message_id);
            protoWriter.writeBytes(deleteMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.message_id = this.message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.conversation_type != null) {
            i3 = this.conversation_type.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.message_id != null) {
            i5 = this.message_id.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteMessageRequestBody)) {
            return false;
        }
        DeleteMessageRequestBody deleteMessageRequestBody = (DeleteMessageRequestBody) obj;
        if (!unknownFields().equals(deleteMessageRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, deleteMessageRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, deleteMessageRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, deleteMessageRequestBody.conversation_type) || !Internal.equals(this.message_id, deleteMessageRequestBody.message_id)) {
            return false;
        }
        return true;
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, ByteString.EMPTY);
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.message_id = l2;
    }
}
