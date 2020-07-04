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

/* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody */
public final class ConversationAddParticipantsResponseBody extends Message<ConversationAddParticipantsResponseBody, Builder> {
    public static final ProtoAdapter<ConversationAddParticipantsResponseBody> ADAPTER = new ProtoAdapter_ConversationAddParticipantsResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long check_code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String check_message;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String extra_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 2)
    public final List<Long> failed_participants;
    @WireField(adapter = "com.bytedance.im.core.proto.SecUidPair#ADAPTER", label = Label.REPEATED, tag = 8)
    public final List<SecUidPair> sec_failed_participants;
    @WireField(adapter = "com.bytedance.im.core.proto.SecUidPair#ADAPTER", label = Label.REPEATED, tag = 7)
    public final List<SecUidPair> sec_success_participants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer status;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 1)
    public final List<Long> success_participants;

    /* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationAddParticipantsResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public List<Long> failed_participants = Internal.newMutableList();
        public List<SecUidPair> sec_failed_participants = Internal.newMutableList();
        public List<SecUidPair> sec_success_participants = Internal.newMutableList();
        public Integer status;
        public List<Long> success_participants = Internal.newMutableList();

        public final ConversationAddParticipantsResponseBody build() {
            ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = new ConversationAddParticipantsResponseBody(this.success_participants, this.failed_participants, this.status, this.extra_info, this.check_code, this.check_message, this.sec_success_participants, this.sec_failed_participants, super.buildUnknownFields());
            return conversationAddParticipantsResponseBody;
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

        public final Builder sec_failed_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.sec_failed_participants = list;
            return this;
        }

        public final Builder sec_success_participants(List<SecUidPair> list) {
            Internal.checkElementsNotNull(list);
            this.sec_success_participants = list;
            return this;
        }

        public final Builder success_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.success_participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody$ProtoAdapter_ConversationAddParticipantsResponseBody */
    static final class ProtoAdapter_ConversationAddParticipantsResponseBody extends ProtoAdapter<ConversationAddParticipantsResponseBody> {
        public ProtoAdapter_ConversationAddParticipantsResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationAddParticipantsResponseBody.class);
        }

        public final ConversationAddParticipantsResponseBody redact(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            Builder newBuilder = conversationAddParticipantsResponseBody.newBuilder();
            Internal.redactElements(newBuilder.sec_success_participants, SecUidPair.ADAPTER);
            Internal.redactElements(newBuilder.sec_failed_participants, SecUidPair.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, conversationAddParticipantsResponseBody.success_participants) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, conversationAddParticipantsResponseBody.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationAddParticipantsResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationAddParticipantsResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationAddParticipantsResponseBody.check_message) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(7, conversationAddParticipantsResponseBody.sec_success_participants) + SecUidPair.ADAPTER.asRepeated().encodedSizeWithTag(8, conversationAddParticipantsResponseBody.sec_failed_participants) + conversationAddParticipantsResponseBody.unknownFields().size();
        }

        public final ConversationAddParticipantsResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.success_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.sec_success_participants.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.sec_failed_participants.add(SecUidPair.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, conversationAddParticipantsResponseBody.success_participants);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, conversationAddParticipantsResponseBody.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationAddParticipantsResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationAddParticipantsResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationAddParticipantsResponseBody.check_message);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, conversationAddParticipantsResponseBody.sec_success_participants);
            SecUidPair.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, conversationAddParticipantsResponseBody.sec_failed_participants);
            protoWriter.writeBytes(conversationAddParticipantsResponseBody.unknownFields());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = ((((unknownFields().hashCode() * 37) + this.success_participants.hashCode()) * 37) + this.failed_participants.hashCode()) * 37;
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
        int hashCode2 = ((((i8 + i5) * 37) + this.sec_success_participants.hashCode()) * 37) + this.sec_failed_participants.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.success_participants = Internal.copyOf("success_participants", this.success_participants);
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.sec_success_participants = Internal.copyOf("sec_success_participants", this.sec_success_participants);
        builder.sec_failed_participants = Internal.copyOf("sec_failed_participants", this.sec_failed_participants);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.success_participants.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
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
        if (!this.sec_success_participants.isEmpty()) {
            sb.append(", sec_success_participants=");
            sb.append(this.sec_success_participants);
        }
        if (!this.sec_failed_participants.isEmpty()) {
            sb.append(", sec_failed_participants=");
            sb.append(this.sec_failed_participants);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationAddParticipantsResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationAddParticipantsResponseBody)) {
            return false;
        }
        ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = (ConversationAddParticipantsResponseBody) obj;
        if (!unknownFields().equals(conversationAddParticipantsResponseBody.unknownFields()) || !this.success_participants.equals(conversationAddParticipantsResponseBody.success_participants) || !this.failed_participants.equals(conversationAddParticipantsResponseBody.failed_participants) || !Internal.equals(this.status, conversationAddParticipantsResponseBody.status) || !Internal.equals(this.extra_info, conversationAddParticipantsResponseBody.extra_info) || !Internal.equals(this.check_code, conversationAddParticipantsResponseBody.check_code) || !Internal.equals(this.check_message, conversationAddParticipantsResponseBody.check_message) || !this.sec_success_participants.equals(conversationAddParticipantsResponseBody.sec_success_participants) || !this.sec_failed_participants.equals(conversationAddParticipantsResponseBody.sec_failed_participants)) {
            return false;
        }
        return true;
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4) {
        this(list, list2, num, str, l, str2, list3, list4, ByteString.EMPTY);
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_participants = Internal.immutableCopyOf("success_participants", list);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list2);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.sec_success_participants = Internal.immutableCopyOf("sec_success_participants", list3);
        this.sec_failed_participants = Internal.immutableCopyOf("sec_failed_participants", list4);
    }
}
