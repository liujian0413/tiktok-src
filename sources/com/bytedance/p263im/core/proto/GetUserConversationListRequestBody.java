package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetUserConversationListRequestBody */
public final class GetUserConversationListRequestBody extends Message<GetUserConversationListRequestBody, Builder> {
    public static final ProtoAdapter<GetUserConversationListRequestBody> ADAPTER = new ProtoAdapter_GetUserConversationListRequestBody();
    public static final ConversationType DEFAULT_CON_TYPE = ConversationType.ONE_TO_ONE_CHAT;
    public static final Long DEFAULT_CURSOR = Long.valueOf(0);
    public static final SortType DEFAULT_SORT_TYPE = SortType.JOIN_TIME;
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationType#ADAPTER", tag = 3)
    public final ConversationType con_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long cursor;
    @WireField(adapter = "com.bytedance.im.core.proto.SortType#ADAPTER", tag = 1)
    public final SortType sort_type;

    /* renamed from: com.bytedance.im.core.proto.GetUserConversationListRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetUserConversationListRequestBody, Builder> {
        public ConversationType con_type;
        public Long cursor;
        public SortType sort_type;

        public final GetUserConversationListRequestBody build() {
            return new GetUserConversationListRequestBody(this.sort_type, this.cursor, this.con_type, super.buildUnknownFields());
        }

        public final Builder con_type(ConversationType conversationType) {
            this.con_type = conversationType;
            return this;
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder sort_type(SortType sortType) {
            this.sort_type = sortType;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetUserConversationListRequestBody$ProtoAdapter_GetUserConversationListRequestBody */
    static final class ProtoAdapter_GetUserConversationListRequestBody extends ProtoAdapter<GetUserConversationListRequestBody> {
        public ProtoAdapter_GetUserConversationListRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserConversationListRequestBody.class);
        }

        public final GetUserConversationListRequestBody redact(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            Builder newBuilder = getUserConversationListRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(GetUserConversationListRequestBody getUserConversationListRequestBody) {
            return SortType.ADAPTER.encodedSizeWithTag(1, getUserConversationListRequestBody.sort_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, getUserConversationListRequestBody.cursor) + ConversationType.ADAPTER.encodedSizeWithTag(3, getUserConversationListRequestBody.con_type) + getUserConversationListRequestBody.unknownFields().size();
        }

        public final GetUserConversationListRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.sort_type((SortType) SortType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            builder.cursor((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.con_type((ConversationType) ConversationType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, GetUserConversationListRequestBody getUserConversationListRequestBody) throws IOException {
            SortType.ADAPTER.encodeWithTag(protoWriter, 1, getUserConversationListRequestBody.sort_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getUserConversationListRequestBody.cursor);
            ConversationType.ADAPTER.encodeWithTag(protoWriter, 3, getUserConversationListRequestBody.con_type);
            protoWriter.writeBytes(getUserConversationListRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.sort_type = this.sort_type;
        builder.cursor = this.cursor;
        builder.con_type = this.con_type;
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
        if (this.sort_type != null) {
            i = this.sort_type.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.cursor != null) {
            i2 = this.cursor.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.con_type != null) {
            i4 = this.con_type.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sort_type != null) {
            sb.append(", sort_type=");
            sb.append(this.sort_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.con_type != null) {
            sb.append(", con_type=");
            sb.append(this.con_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserConversationListRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserConversationListRequestBody)) {
            return false;
        }
        GetUserConversationListRequestBody getUserConversationListRequestBody = (GetUserConversationListRequestBody) obj;
        if (!unknownFields().equals(getUserConversationListRequestBody.unknownFields()) || !Internal.equals(this.sort_type, getUserConversationListRequestBody.sort_type) || !Internal.equals(this.cursor, getUserConversationListRequestBody.cursor) || !Internal.equals(this.con_type, getUserConversationListRequestBody.con_type)) {
            return false;
        }
        return true;
    }

    public GetUserConversationListRequestBody(SortType sortType, Long l, ConversationType conversationType) {
        this(sortType, l, conversationType, ByteString.EMPTY);
    }

    public GetUserConversationListRequestBody(SortType sortType, Long l, ConversationType conversationType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sort_type = sortType;
        this.cursor = l;
        this.con_type = conversationType;
    }
}
