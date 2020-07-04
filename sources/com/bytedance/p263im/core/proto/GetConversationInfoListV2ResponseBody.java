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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody */
public final class GetConversationInfoListV2ResponseBody extends Message<GetConversationInfoListV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListV2ResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfoV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ConversationInfoV2> conversation_info_list;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoListV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();

        public final GetConversationInfoListV2ResponseBody build() {
            return new GetConversationInfoListV2ResponseBody(this.conversation_info_list, super.buildUnknownFields());
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody$ProtoAdapter_GetConversationInfoListV2ResponseBody */
    static final class ProtoAdapter_GetConversationInfoListV2ResponseBody extends ProtoAdapter<GetConversationInfoListV2ResponseBody> {
        public ProtoAdapter_GetConversationInfoListV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListV2ResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2ResponseBody.conversation_info_list) + getConversationInfoListV2ResponseBody.unknownFields().size();
        }

        public final GetConversationInfoListV2ResponseBody redact(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            Builder newBuilder = getConversationInfoListV2ResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_info_list, ConversationInfoV2.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetConversationInfoListV2ResponseBody decode(ProtoReader protoReader) throws IOException {
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
                    builder.conversation_info_list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) throws IOException {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2ResponseBody.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2ResponseBody.unknownFields());
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
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoListV2ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list) {
        this(list, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoListV2ResponseBody)) {
            return false;
        }
        GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody = (GetConversationInfoListV2ResponseBody) obj;
        if (!unknownFields().equals(getConversationInfoListV2ResponseBody.unknownFields()) || !this.conversation_info_list.equals(getConversationInfoListV2ResponseBody.conversation_info_list)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
    }
}
