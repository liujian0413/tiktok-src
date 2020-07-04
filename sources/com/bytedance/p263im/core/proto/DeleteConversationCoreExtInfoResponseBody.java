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

/* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody */
public final class DeleteConversationCoreExtInfoResponseBody extends Message<DeleteConversationCoreExtInfoResponseBody, Builder> {
    public static final ProtoAdapter<DeleteConversationCoreExtInfoResponseBody> ADAPTER = new ProtoAdapter_DeleteConversationCoreExtInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String check_message;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationCoreInfo#ADAPTER", tag = 1)
    public final ConversationCoreInfo core_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String extra_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeleteConversationCoreExtInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo core_info;
        public String extra_info;
        public Integer status;

        public final DeleteConversationCoreExtInfoResponseBody build() {
            DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody = new DeleteConversationCoreExtInfoResponseBody(this.core_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
            return deleteConversationCoreExtInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder core_info(ConversationCoreInfo conversationCoreInfo) {
            this.core_info = conversationCoreInfo;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody$ProtoAdapter_DeleteConversationCoreExtInfoResponseBody */
    static final class ProtoAdapter_DeleteConversationCoreExtInfoResponseBody extends ProtoAdapter<DeleteConversationCoreExtInfoResponseBody> {
        public ProtoAdapter_DeleteConversationCoreExtInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteConversationCoreExtInfoResponseBody.class);
        }

        public final DeleteConversationCoreExtInfoResponseBody redact(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            Builder newBuilder = deleteConversationCoreExtInfoResponseBody.newBuilder();
            if (newBuilder.core_info != null) {
                newBuilder.core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.core_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, deleteConversationCoreExtInfoResponseBody.core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, deleteConversationCoreExtInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, deleteConversationCoreExtInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, deleteConversationCoreExtInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, deleteConversationCoreExtInfoResponseBody.extra_info) + deleteConversationCoreExtInfoResponseBody.unknownFields().size();
        }

        public final DeleteConversationCoreExtInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.core_info((ConversationCoreInfo) ConversationCoreInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, deleteConversationCoreExtInfoResponseBody.core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, deleteConversationCoreExtInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, deleteConversationCoreExtInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, deleteConversationCoreExtInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, deleteConversationCoreExtInfoResponseBody.extra_info);
            protoWriter.writeBytes(deleteConversationCoreExtInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.core_info = this.core_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.core_info != null) {
            i = this.core_info.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.status != null) {
            i2 = this.status.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.check_code != null) {
            i3 = this.check_code.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.check_message != null) {
            i4 = this.check_message.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.extra_info != null) {
            i6 = this.extra_info.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.core_info != null) {
            sb.append(", core_info=");
            sb.append(this.core_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteConversationCoreExtInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteConversationCoreExtInfoResponseBody)) {
            return false;
        }
        DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody = (DeleteConversationCoreExtInfoResponseBody) obj;
        if (!unknownFields().equals(deleteConversationCoreExtInfoResponseBody.unknownFields()) || !Internal.equals(this.core_info, deleteConversationCoreExtInfoResponseBody.core_info) || !Internal.equals(this.status, deleteConversationCoreExtInfoResponseBody.status) || !Internal.equals(this.check_code, deleteConversationCoreExtInfoResponseBody.check_code) || !Internal.equals(this.check_message, deleteConversationCoreExtInfoResponseBody.check_message) || !Internal.equals(this.extra_info, deleteConversationCoreExtInfoResponseBody.extra_info)) {
            return false;
        }
        return true;
    }

    public DeleteConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2) {
        this(conversationCoreInfo, num, l, str, str2, ByteString.EMPTY);
    }

    public DeleteConversationCoreExtInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.core_info = conversationCoreInfo;
        this.status = num;
        this.check_code = l;
        this.check_message = str;
        this.extra_info = str2;
    }
}
