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

/* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody */
public final class GetConversationInfoListByTopV2ResponseBody extends Message<GetConversationInfoListByTopV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoListByTopV2ResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfoV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ConversationInfoV2> conversation_info_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_more;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetConversationInfoListByTopV2ResponseBody, Builder> {
        public List<ConversationInfoV2> conversation_info_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;

        public final GetConversationInfoListByTopV2ResponseBody build() {
            return new GetConversationInfoListByTopV2ResponseBody(this.conversation_info_list, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder conversation_info_list(List<ConversationInfoV2> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_info_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody$ProtoAdapter_GetConversationInfoListByTopV2ResponseBody */
    static final class ProtoAdapter_GetConversationInfoListByTopV2ResponseBody extends ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> {
        public ProtoAdapter_GetConversationInfoListByTopV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoListByTopV2ResponseBody.class);
        }

        public final GetConversationInfoListByTopV2ResponseBody redact(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            Builder newBuilder = getConversationInfoListByTopV2ResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_info_list, ConversationInfoV2.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByTopV2ResponseBody.conversation_info_list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByTopV2ResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByTopV2ResponseBody.next_cursor) + getConversationInfoListByTopV2ResponseBody.unknownFields().size();
        }

        public final GetConversationInfoListByTopV2ResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_info_list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) throws IOException {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListByTopV2ResponseBody.conversation_info_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getConversationInfoListByTopV2ResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getConversationInfoListByTopV2ResponseBody.next_cursor);
            protoWriter.writeBytes(getConversationInfoListByTopV2ResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info_list = Internal.copyOf("conversation_info_list", this.conversation_info_list);
        builder.has_more = this.has_more;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.conversation_info_list.hashCode()) * 37;
        int i3 = 0;
        if (this.has_more != null) {
            i = this.has_more.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.next_cursor != null) {
            i3 = this.next_cursor.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conversation_info_list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConversationInfoListByTopV2ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetConversationInfoListByTopV2ResponseBody)) {
            return false;
        }
        GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody = (GetConversationInfoListByTopV2ResponseBody) obj;
        if (!unknownFields().equals(getConversationInfoListByTopV2ResponseBody.unknownFields()) || !this.conversation_info_list.equals(getConversationInfoListByTopV2ResponseBody.conversation_info_list) || !Internal.equals(this.has_more, getConversationInfoListByTopV2ResponseBody.has_more) || !Internal.equals(this.next_cursor, getConversationInfoListByTopV2ResponseBody.next_cursor)) {
            return false;
        }
        return true;
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = Internal.immutableCopyOf("conversation_info_list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
