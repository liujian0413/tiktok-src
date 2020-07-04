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

/* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody */
public final class SetConversationCoreInfoResponseBody extends Message<SetConversationCoreInfoResponseBody, Builder> {
    public static final ProtoAdapter<SetConversationCoreInfoResponseBody> ADAPTER = new ProtoAdapter_SetConversationCoreInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String check_message;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationCoreInfo#ADAPTER", tag = 1)
    public final ConversationCoreInfo conversation_core_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String extra_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetConversationCoreInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public ConversationCoreInfo conversation_core_info;
        public String extra_info;
        public Integer status;

        public final SetConversationCoreInfoResponseBody build() {
            SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody = new SetConversationCoreInfoResponseBody(this.conversation_core_info, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
            return setConversationCoreInfoResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder conversation_core_info(ConversationCoreInfo conversationCoreInfo) {
            this.conversation_core_info = conversationCoreInfo;
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

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody$ProtoAdapter_SetConversationCoreInfoResponseBody */
    static final class ProtoAdapter_SetConversationCoreInfoResponseBody extends ProtoAdapter<SetConversationCoreInfoResponseBody> {
        public ProtoAdapter_SetConversationCoreInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoResponseBody.class);
        }

        public final SetConversationCoreInfoResponseBody redact(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            Builder newBuilder = setConversationCoreInfoResponseBody.newBuilder();
            if (newBuilder.conversation_core_info != null) {
                newBuilder.conversation_core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.conversation_core_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, setConversationCoreInfoResponseBody.conversation_core_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationCoreInfoResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, setConversationCoreInfoResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, setConversationCoreInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationCoreInfoResponseBody.check_message) + setConversationCoreInfoResponseBody.unknownFields().size();
        }

        public final SetConversationCoreInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_core_info((ConversationCoreInfo) ConversationCoreInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
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

        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationCoreInfoResponseBody.conversation_core_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationCoreInfoResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setConversationCoreInfoResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, setConversationCoreInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationCoreInfoResponseBody.check_message);
            protoWriter.writeBytes(setConversationCoreInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_core_info = this.conversation_core_info;
        builder.status = this.status;
        builder.extra_info = this.extra_info;
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
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.conversation_core_info != null) {
            i = this.conversation_core_info.hashCode();
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
        if (this.extra_info != null) {
            i3 = this.extra_info.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.check_code != null) {
            i4 = this.check_code.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.check_message != null) {
            i6 = this.check_message.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "SetConversationCoreInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetConversationCoreInfoResponseBody)) {
            return false;
        }
        SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody = (SetConversationCoreInfoResponseBody) obj;
        if (!unknownFields().equals(setConversationCoreInfoResponseBody.unknownFields()) || !Internal.equals(this.conversation_core_info, setConversationCoreInfoResponseBody.conversation_core_info) || !Internal.equals(this.status, setConversationCoreInfoResponseBody.status) || !Internal.equals(this.extra_info, setConversationCoreInfoResponseBody.extra_info) || !Internal.equals(this.check_code, setConversationCoreInfoResponseBody.check_code) || !Internal.equals(this.check_message, setConversationCoreInfoResponseBody.check_message)) {
            return false;
        }
        return true;
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2) {
        this(conversationCoreInfo, num, str, l, str2, ByteString.EMPTY);
    }

    public SetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_core_info = conversationCoreInfo;
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
