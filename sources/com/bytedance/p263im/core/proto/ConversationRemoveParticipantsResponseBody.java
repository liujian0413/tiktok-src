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

/* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody */
public final class ConversationRemoveParticipantsResponseBody extends Message<ConversationRemoveParticipantsResponseBody, Builder> {
    public static final ProtoAdapter<ConversationRemoveParticipantsResponseBody> ADAPTER = new ProtoAdapter_ConversationRemoveParticipantsResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String check_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String extra_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 1)
    public final List<Long> failed_participants;
    @WireField(adapter = "com.bytedance.im.core.proto.SecUidPair#ADAPTER", label = Label.REPEATED, tag = 6)
    public final List<SecUidPair> failed_sec_participants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer status;

    /* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationRemoveParticipantsResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public List<Long> failed_participants = Internal.newMutableList();
        public List<SecUidPair> failed_sec_participants = Internal.newMutableList();
        public Integer status;

        public final ConversationRemoveParticipantsResponseBody build() {
            ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = new ConversationRemoveParticipantsResponseBody(this.failed_participants, this.status, this.extra_info, this.check_code, this.check_message, this.failed_sec_participants, super.buildUnknownFields());
            return conversationRemoveParticipantsResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
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

        public final Builder failed_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_participants = list;
            return this;
        }

        public final Builder failed_sec_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.failed_sec_participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody$ProtoAdapter_ConversationRemoveParticipantsResponseBody */
    static final class ProtoAdapter_ConversationRemoveParticipantsResponseBody extends ProtoAdapter<ConversationRemoveParticipantsResponseBody> {
        public ProtoAdapter_ConversationRemoveParticipantsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsResponseBody.class);
        }

        public final ConversationRemoveParticipantsResponseBody redact(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            Builder newBuilder = conversationRemoveParticipantsResponseBody.newBuilder();
            Internal.redactElements(newBuilder.failed_sec_participants, SecUidPair.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, conversationRemoveParticipantsResponseBody.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRemoveParticipantsResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, conversationRemoveParticipantsResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationRemoveParticipantsResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationRemoveParticipantsResponseBody.check_message) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(6, conversationRemoveParticipantsResponseBody.failed_sec_participants) + conversationRemoveParticipantsResponseBody.unknownFields().size();
        }

        public final ConversationRemoveParticipantsResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
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
                        case 6:
                            builder.failed_sec_participants.add(SecUidPair.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, conversationRemoveParticipantsResponseBody.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationRemoveParticipantsResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsResponseBody.check_message);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, conversationRemoveParticipantsResponseBody.failed_sec_participants);
            protoWriter.writeBytes(conversationRemoveParticipantsResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.failed_sec_participants = Internal.copyOf("failed_sec_participants", this.failed_sec_participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.failed_participants.hashCode()) * 37;
        int i5 = 0;
        if (this.status != null) {
            i = this.status.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.extra_info != null) {
            i2 = this.extra_info.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.check_code != null) {
            i3 = this.check_code.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.check_message != null) {
            i5 = this.check_message.hashCode();
        }
        int hashCode2 = ((i8 + i5) * 37) + this.failed_sec_participants.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.failed_participants.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
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
        if (!this.failed_sec_participants.isEmpty()) {
            sb.append(", failed_sec_participants=");
            sb.append(this.failed_sec_participants);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationRemoveParticipantsResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationRemoveParticipantsResponseBody)) {
            return false;
        }
        ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = (ConversationRemoveParticipantsResponseBody) obj;
        if (!unknownFields().equals(conversationRemoveParticipantsResponseBody.unknownFields()) || !this.failed_participants.equals(conversationRemoveParticipantsResponseBody.failed_participants) || !Internal.equals(this.status, conversationRemoveParticipantsResponseBody.status) || !Internal.equals(this.extra_info, conversationRemoveParticipantsResponseBody.extra_info) || !Internal.equals(this.check_code, conversationRemoveParticipantsResponseBody.check_code) || !Internal.equals(this.check_message, conversationRemoveParticipantsResponseBody.check_message) || !this.failed_sec_participants.equals(conversationRemoveParticipantsResponseBody.failed_sec_participants)) {
            return false;
        }
        return true;
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2) {
        this(list, num, str, l, str2, list2, ByteString.EMPTY);
    }

    public ConversationRemoveParticipantsResponseBody(List<Long> list, Integer num, String str, Long l, String str2, List<SecUidPair> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.failed_sec_participants = Internal.immutableCopyOf("failed_sec_participants", list2);
    }
}
