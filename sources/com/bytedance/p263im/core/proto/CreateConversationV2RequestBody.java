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
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.CreateConversationV2RequestBody */
public final class CreateConversationV2RequestBody extends Message<CreateConversationV2RequestBody, Builder> {
    public static final ProtoAdapter<CreateConversationV2RequestBody> ADAPTER = new ProtoAdapter_CreateConversationV2RequestBody();
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Boolean DEFAULT_PERSISTENT = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String avatar_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final Map<String, String> biz_ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String idempotent_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 2)
    public final List<Long> participants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean persistent;

    /* renamed from: com.bytedance.im.core.proto.CreateConversationV2RequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CreateConversationV2RequestBody, Builder> {
        public String avatar_url;
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public Integer conversation_type;
        public String description;
        public String idempotent_id;
        public String name;
        public List<Long> participants = Internal.newMutableList();
        public Boolean persistent;

        public final CreateConversationV2RequestBody build() {
            CreateConversationV2RequestBody createConversationV2RequestBody = new CreateConversationV2RequestBody(this.conversation_type, this.participants, this.persistent, this.idempotent_id, this.name, this.avatar_url, this.description, this.biz_ext, super.buildUnknownFields());
            return createConversationV2RequestBody;
        }

        public final Builder avatar_url(String str) {
            this.avatar_url = str;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder idempotent_id(String str) {
            this.idempotent_id = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder persistent(Boolean bool) {
            this.persistent = bool;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.CreateConversationV2RequestBody$ProtoAdapter_CreateConversationV2RequestBody */
    static final class ProtoAdapter_CreateConversationV2RequestBody extends ProtoAdapter<CreateConversationV2RequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        public ProtoAdapter_CreateConversationV2RequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateConversationV2RequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final CreateConversationV2RequestBody redact(CreateConversationV2RequestBody createConversationV2RequestBody) {
            Builder newBuilder = createConversationV2RequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(CreateConversationV2RequestBody createConversationV2RequestBody) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, createConversationV2RequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, createConversationV2RequestBody.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(3, createConversationV2RequestBody.persistent) + ProtoAdapter.STRING.encodedSizeWithTag(4, createConversationV2RequestBody.idempotent_id) + ProtoAdapter.STRING.encodedSizeWithTag(6, createConversationV2RequestBody.name) + ProtoAdapter.STRING.encodedSizeWithTag(7, createConversationV2RequestBody.avatar_url) + ProtoAdapter.STRING.encodedSizeWithTag(8, createConversationV2RequestBody.description) + this.biz_ext.encodedSizeWithTag(11, createConversationV2RequestBody.biz_ext) + createConversationV2RequestBody.unknownFields().size();
        }

        public final CreateConversationV2RequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.persistent((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.idempotent_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.avatar_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.biz_ext.putAll((Map) this.biz_ext.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CreateConversationV2RequestBody createConversationV2RequestBody) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, createConversationV2RequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, createConversationV2RequestBody.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createConversationV2RequestBody.persistent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createConversationV2RequestBody.idempotent_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createConversationV2RequestBody.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, createConversationV2RequestBody.avatar_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, createConversationV2RequestBody.description);
            this.biz_ext.encodeWithTag(protoWriter, 11, createConversationV2RequestBody.biz_ext);
            protoWriter.writeBytes(createConversationV2RequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.persistent = this.persistent;
        builder.idempotent_id = this.idempotent_id;
        builder.name = this.name;
        builder.avatar_url = this.avatar_url;
        builder.description = this.description;
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.conversation_type != null) {
            i = this.conversation_type.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.participants.hashCode()) * 37;
        if (this.persistent != null) {
            i2 = this.persistent.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode2 + i2) * 37;
        if (this.idempotent_id != null) {
            i3 = this.idempotent_id.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.name != null) {
            i4 = this.name.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.avatar_url != null) {
            i5 = this.avatar_url.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        if (this.description != null) {
            i7 = this.description.hashCode();
        }
        int hashCode3 = ((i11 + i7) * 37) + this.biz_ext.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.persistent != null) {
            sb.append(", persistent=");
            sb.append(this.persistent);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.biz_ext.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateConversationV2RequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateConversationV2RequestBody)) {
            return false;
        }
        CreateConversationV2RequestBody createConversationV2RequestBody = (CreateConversationV2RequestBody) obj;
        if (!unknownFields().equals(createConversationV2RequestBody.unknownFields()) || !Internal.equals(this.conversation_type, createConversationV2RequestBody.conversation_type) || !this.participants.equals(createConversationV2RequestBody.participants) || !Internal.equals(this.persistent, createConversationV2RequestBody.persistent) || !Internal.equals(this.idempotent_id, createConversationV2RequestBody.idempotent_id) || !Internal.equals(this.name, createConversationV2RequestBody.name) || !Internal.equals(this.avatar_url, createConversationV2RequestBody.avatar_url) || !Internal.equals(this.description, createConversationV2RequestBody.description) || !this.biz_ext.equals(createConversationV2RequestBody.biz_ext)) {
            return false;
        }
        return true;
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map) {
        this(num, list, bool, str, str2, str3, str4, map, ByteString.EMPTY);
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.persistent = bool;
        this.idempotent_id = str;
        this.name = str2;
        this.avatar_url = str3;
        this.description = str4;
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
