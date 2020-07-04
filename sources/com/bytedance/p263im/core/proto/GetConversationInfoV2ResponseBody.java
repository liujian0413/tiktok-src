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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody */
public final class GetConversationInfoV2ResponseBody extends Message<GetConversationInfoV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoV2ResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfoV2#ADAPTER", tag = 1)
    public final ConversationInfoV2 conversation_info;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoV2ResponseBody, Builder> {
        public ConversationInfoV2 conversation_info;

        public final GetConversationInfoV2ResponseBody build() {
            return new GetConversationInfoV2ResponseBody(this.conversation_info, super.buildUnknownFields());
        }

        public final Builder conversation_info(ConversationInfoV2 conversationInfoV2) {
            this.conversation_info = conversationInfoV2;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody$ProtoAdapter_GetConversationInfoV2ResponseBody */
    static final class ProtoAdapter_GetConversationInfoV2ResponseBody extends ProtoAdapter<GetConversationInfoV2ResponseBody> {
        public ProtoAdapter_GetConversationInfoV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2ResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, getConversationInfoV2ResponseBody.conversation_info) + getConversationInfoV2ResponseBody.unknownFields().size();
        }

        public final GetConversationInfoV2ResponseBody redact(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            Builder newBuilder = getConversationInfoV2ResponseBody.newBuilder();
            if (newBuilder.conversation_info != null) {
                newBuilder.conversation_info = (ConversationInfoV2) ConversationInfoV2.ADAPTER.redact(newBuilder.conversation_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoV2ResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_info((ConversationInfoV2) ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) throws IOException {
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, getConversationInfoV2ResponseBody.conversation_info);
            protoWriter.writeBytes(getConversationInfoV2ResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.conversation_info != null) {
            i = this.conversation_info.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info = this.conversation_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_info != null) {
            sb.append(", conversation_info=");
            sb.append(this.conversation_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoV2ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2) {
        this(conversationInfoV2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoV2ResponseBody)) {
            return false;
        }
        GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody = (GetConversationInfoV2ResponseBody) obj;
        if (!unknownFields().equals(getConversationInfoV2ResponseBody.unknownFields()) || !Internal.equals(this.conversation_info, getConversationInfoV2ResponseBody.conversation_info)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info = conversationInfoV2;
    }
}
