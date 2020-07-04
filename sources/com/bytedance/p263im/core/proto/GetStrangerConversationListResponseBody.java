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

/* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListResponseBody */
public final class GetStrangerConversationListResponseBody extends Message<GetStrangerConversationListResponseBody, Builder> {
    public static final ProtoAdapter<GetStrangerConversationListResponseBody> ADAPTER = new ProtoAdapter_GetStrangerConversationListResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    public static final Integer DEFAULT_TOTAL_UNREAD = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.StrangerConversation#ADAPTER", label = Label.REPEATED, tag = 4)
    public final List<StrangerConversation> conversation_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_more;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long next_cursor;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer total_unread;

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetStrangerConversationListResponseBody, Builder> {
        public List<StrangerConversation> conversation_list = Internal.newMutableList();
        public Boolean has_more;
        public Long next_cursor;
        public Integer total_unread;

        public final GetStrangerConversationListResponseBody build() {
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = new GetStrangerConversationListResponseBody(this.next_cursor, this.has_more, this.total_unread, this.conversation_list, super.buildUnknownFields());
            return getStrangerConversationListResponseBody;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder total_unread(Integer num) {
            this.total_unread = num;
            return this;
        }

        public final Builder conversation_list(List<StrangerConversation> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_list = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetStrangerConversationListResponseBody$ProtoAdapter_GetStrangerConversationListResponseBody */
    static final class ProtoAdapter_GetStrangerConversationListResponseBody extends ProtoAdapter<GetStrangerConversationListResponseBody> {
        public ProtoAdapter_GetStrangerConversationListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStrangerConversationListResponseBody.class);
        }

        public final GetStrangerConversationListResponseBody redact(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            Builder newBuilder = getStrangerConversationListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.conversation_list, StrangerConversation.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerConversationListResponseBody.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(3, getStrangerConversationListResponseBody.total_unread) + StrangerConversation.ADAPTER.asRepeated().encodedSizeWithTag(4, getStrangerConversationListResponseBody.conversation_list) + getStrangerConversationListResponseBody.unknownFields().size();
        }

        public final GetStrangerConversationListResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.next_cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.total_unread((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_list.add(StrangerConversation.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerConversationListResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerConversationListResponseBody.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getStrangerConversationListResponseBody.total_unread);
            StrangerConversation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getStrangerConversationListResponseBody.conversation_list);
            protoWriter.writeBytes(getStrangerConversationListResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.total_unread = this.total_unread;
        builder.conversation_list = Internal.copyOf("conversation_list", this.conversation_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.next_cursor != null) {
            i = this.next_cursor.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.has_more != null) {
            i2 = this.has_more.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.total_unread != null) {
            i4 = this.total_unread.hashCode();
        }
        int hashCode2 = ((i6 + i4) * 37) + this.conversation_list.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total_unread != null) {
            sb.append(", total_unread=");
            sb.append(this.total_unread);
        }
        if (!this.conversation_list.isEmpty()) {
            sb.append(", conversation_list=");
            sb.append(this.conversation_list);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStrangerConversationListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStrangerConversationListResponseBody)) {
            return false;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = (GetStrangerConversationListResponseBody) obj;
        if (!unknownFields().equals(getStrangerConversationListResponseBody.unknownFields()) || !Internal.equals(this.next_cursor, getStrangerConversationListResponseBody.next_cursor) || !Internal.equals(this.has_more, getStrangerConversationListResponseBody.has_more) || !Internal.equals(this.total_unread, getStrangerConversationListResponseBody.total_unread) || !this.conversation_list.equals(getStrangerConversationListResponseBody.conversation_list)) {
            return false;
        }
        return true;
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list) {
        this(l, bool, num, list, ByteString.EMPTY);
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_cursor = l;
        this.has_more = bool;
        this.total_unread = num;
        this.conversation_list = Internal.immutableCopyOf("conversation_list", list);
    }
}
