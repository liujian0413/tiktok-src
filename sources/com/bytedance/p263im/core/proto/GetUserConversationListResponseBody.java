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

/* renamed from: com.bytedance.im.core.proto.GetUserConversationListResponseBody */
public final class GetUserConversationListResponseBody extends Message<GetUserConversationListResponseBody, Builder> {
    public static final ProtoAdapter<GetUserConversationListResponseBody> ADAPTER = new ProtoAdapter_GetUserConversationListResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = Boolean.valueOf(false);
    public static final Long DEFAULT_NEXT_CURSOR = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean has_more;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfoV2#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<ConversationInfoV2> list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long next_cursor;

    /* renamed from: com.bytedance.im.core.proto.GetUserConversationListResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetUserConversationListResponseBody, Builder> {
        public Boolean has_more;
        public List<ConversationInfoV2> list = Internal.newMutableList();
        public Long next_cursor;

        public final GetUserConversationListResponseBody build() {
            return new GetUserConversationListResponseBody(this.list, this.has_more, this.next_cursor, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l) {
            this.next_cursor = l;
            return this;
        }

        public final Builder list(List<ConversationInfoV2> list2) {
            Internal.checkElementsNotNull(list2);
            this.list = list2;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetUserConversationListResponseBody$ProtoAdapter_GetUserConversationListResponseBody */
    static final class ProtoAdapter_GetUserConversationListResponseBody extends ProtoAdapter<GetUserConversationListResponseBody> {
        public ProtoAdapter_GetUserConversationListResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListResponseBody.class);
        }

        public final GetUserConversationListResponseBody redact(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            Builder newBuilder = getUserConversationListResponseBody.newBuilder();
            Internal.redactElements(newBuilder.list, ConversationInfoV2.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserConversationListResponseBody.list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserConversationListResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getUserConversationListResponseBody.next_cursor) + getUserConversationListResponseBody.unknownFields().size();
        }

        public final GetUserConversationListResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.list.add(ConversationInfoV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, GetUserConversationListResponseBody getUserConversationListResponseBody) throws IOException {
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserConversationListResponseBody.list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserConversationListResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getUserConversationListResponseBody.next_cursor);
            protoWriter.writeBytes(getUserConversationListResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.list = Internal.copyOf("list", this.list);
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
        int hashCode = ((unknownFields().hashCode() * 37) + this.list.hashCode()) * 37;
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
        if (!this.list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserConversationListResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserConversationListResponseBody)) {
            return false;
        }
        GetUserConversationListResponseBody getUserConversationListResponseBody = (GetUserConversationListResponseBody) obj;
        if (!unknownFields().equals(getUserConversationListResponseBody.unknownFields()) || !this.list.equals(getUserConversationListResponseBody.list) || !Internal.equals(this.has_more, getUserConversationListResponseBody.has_more) || !Internal.equals(this.next_cursor, getUserConversationListResponseBody.next_cursor)) {
            return false;
        }
        return true;
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list2, Boolean bool, Long l) {
        this(list2, bool, l, ByteString.EMPTY);
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list2, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.list = Internal.immutableCopyOf("list", list2);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
