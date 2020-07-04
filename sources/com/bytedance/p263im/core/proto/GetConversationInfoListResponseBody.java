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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListResponseBody */
public final class GetConversationInfoListResponseBody extends Message<GetConversationInfoListResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfo#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ConversationInfo> conversation_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoListResponseBody, Builder> {
        public List<ConversationInfo> conversation_info_list = Internal.newMutableList();

        public final GetConversationInfoListResponseBody build() {
            return new GetConversationInfoListResponseBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<ConversationInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListResponseBody$ProtoAdapter_GetConversationInfoListResponseBody */
    static final class ProtoAdapter_GetConversationInfoListResponseBody extends ProtoAdapter<GetConversationInfoListResponseBody> {
        public ProtoAdapter_GetConversationInfoListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoListResponseBody getConversationInfoListResponseBody) {
            return ConversationInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListResponseBody.conversation_info_list) + getConversationInfoListResponseBody.unknownFields().size();
        }

        public final GetConversationInfoListResponseBody redact(GetConversationInfoListResponseBody getConversationInfoListResponseBody) {
            Builder newBuilder = getConversationInfoListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_info_list, ConversationInfo.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoListResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_info_list.add(ConversationInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListResponseBody getConversationInfoListResponseBody) throws IOException {
            ConversationInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListResponseBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.conversation_info_list.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_info_list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoListResponseBody(List<ConversationInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoListResponseBody)) {
            return false;
        }
        GetConversationInfoListResponseBody getConversationInfoListResponseBody = (GetConversationInfoListResponseBody) obj;
        if (!unknownFields().equals(getConversationInfoListResponseBody.unknownFields()) || !this.conversation_info_list.equals(getConversationInfoListResponseBody.conversation_info_list)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoListResponseBody(List<ConversationInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
