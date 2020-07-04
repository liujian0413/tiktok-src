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

/* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoResponseBody */
public final class GetConversationCoreInfoResponseBody extends Message<GetConversationCoreInfoResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationCoreInfoResponseBody> ADAPTER = new ProtoAdapter_GetConversationCoreInfoResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationCoreInfo#ADAPTER", tag = 1)
    public final ConversationCoreInfo conversation_core_info;

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationCoreInfoResponseBody, Builder> {
        public ConversationCoreInfo conversation_core_info;

        public final GetConversationCoreInfoResponseBody build() {
            return new GetConversationCoreInfoResponseBody(this.conversation_core_info, super.buildUnknownFields());
        }

        public final Builder conversation_core_info(ConversationCoreInfo conversationCoreInfo) {
            this.conversation_core_info = conversationCoreInfo;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationCoreInfoResponseBody$ProtoAdapter_GetConversationCoreInfoResponseBody */
    static final class ProtoAdapter_GetConversationCoreInfoResponseBody extends ProtoAdapter<GetConversationCoreInfoResponseBody> {
        public ProtoAdapter_GetConversationCoreInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationCoreInfoResponseBody.class);
        }

        public final int encodedSize(GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody) {
            return ConversationCoreInfo.ADAPTER.encodedSizeWithTag(1, getConversationCoreInfoResponseBody.conversation_core_info) + getConversationCoreInfoResponseBody.unknownFields().size();
        }

        public final GetConversationCoreInfoResponseBody redact(GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody) {
            Builder newBuilder = getConversationCoreInfoResponseBody.newBuilder();
            if (newBuilder.conversation_core_info != null) {
                newBuilder.conversation_core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.conversation_core_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationCoreInfoResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_core_info((ConversationCoreInfo) ConversationCoreInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody) throws IOException {
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 1, getConversationCoreInfoResponseBody.conversation_core_info);
            protoWriter.writeBytes(getConversationCoreInfoResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.conversation_core_info != null) {
            i = this.conversation_core_info.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_core_info = this.conversation_core_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationCoreInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo) {
        this(conversationCoreInfo, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationCoreInfoResponseBody)) {
            return false;
        }
        GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody = (GetConversationCoreInfoResponseBody) obj;
        if (!unknownFields().equals(getConversationCoreInfoResponseBody.unknownFields()) || !Internal.equals(this.conversation_core_info, getConversationCoreInfoResponseBody.conversation_core_info)) {
            return false;
        }
        return true;
    }

    public GetConversationCoreInfoResponseBody(ConversationCoreInfo conversationCoreInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_core_info = conversationCoreInfo;
    }
}
