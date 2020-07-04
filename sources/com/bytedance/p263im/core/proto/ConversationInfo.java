package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationInfo */
public final class ConversationInfo extends Message<ConversationInfo, Builder> {
    public static final ProtoAdapter<ConversationInfo> ADAPTER = new ProtoAdapter_ConversationInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_CONVERSATION_VERSION = Long.valueOf(0);
    public static final Boolean DEFAULT_IS_PARTICIPANT = Boolean.valueOf(false);
    public static final Long DEFAULT_LAST_MESSAGE_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_MIN_INDEX = Long.valueOf(0);
    public static final Integer DEFAULT_MUTE = Integer.valueOf(0);
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = Integer.valueOf(0);
    public static final Long DEFAULT_READ_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_SERVER_UNREAD_COUNT = Long.valueOf(0);
    public static final Integer DEFAULT_STICK_ON_TOP = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long conversation_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final Map<String, String> ext;
    @WireField(adapter = "com.bytedance.im.core.proto.ParticipantsPage#ADAPTER", tag = 3)
    public final ParticipantsPage first_page_participants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 14)
    public final Boolean is_participant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 21)
    public final Long last_message_index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long min_index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer participants_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long read_index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 20)
    public final Long server_unread_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer stick_on_top;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.ConversationInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Long conversation_version;
        public Map<String, String> ext = Internal.newMutableMap();
        public ParticipantsPage first_page_participants;
        public Boolean is_participant;
        public Long last_message_index;
        public Long min_index;
        public Integer mute;
        public Integer participants_count;
        public Long read_index;
        public Long server_unread_count;
        public Integer stick_on_top;
        public String ticket;

        public final ConversationInfo build() {
            ConversationInfo conversationInfo = new ConversationInfo(this.conversation_id, this.conversation_type, this.first_page_participants, this.participants_count, this.min_index, this.read_index, this.mute, this.stick_on_top, this.ext, this.ticket, this.conversation_short_id, this.conversation_version, this.is_participant, this.server_unread_count, this.last_message_index, super.buildUnknownFields());
            return conversationInfo;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder conversation_version(Long l) {
            this.conversation_version = l;
            return this;
        }

        public final Builder first_page_participants(ParticipantsPage participantsPage) {
            this.first_page_participants = participantsPage;
            return this;
        }

        public final Builder is_participant(Boolean bool) {
            this.is_participant = bool;
            return this;
        }

        public final Builder last_message_index(Long l) {
            this.last_message_index = l;
            return this;
        }

        public final Builder min_index(Long l) {
            this.min_index = l;
            return this;
        }

        public final Builder mute(Integer num) {
            this.mute = num;
            return this;
        }

        public final Builder participants_count(Integer num) {
            this.participants_count = num;
            return this;
        }

        public final Builder read_index(Long l) {
            this.read_index = l;
            return this;
        }

        public final Builder server_unread_count(Long l) {
            this.server_unread_count = l;
            return this;
        }

        public final Builder stick_on_top(Integer num) {
            this.stick_on_top = num;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationInfo$ProtoAdapter_ConversationInfo */
    static final class ProtoAdapter_ConversationInfo extends ProtoAdapter<ConversationInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_ConversationInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ConversationInfo redact(ConversationInfo conversationInfo) {
            Builder newBuilder = conversationInfo.newBuilder();
            if (newBuilder.first_page_participants != null) {
                newBuilder.first_page_participants = (ParticipantsPage) ParticipantsPage.ADAPTER.redact(newBuilder.first_page_participants);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationInfo conversationInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationInfo.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationInfo.conversation_type) + ParticipantsPage.ADAPTER.encodedSizeWithTag(3, conversationInfo.first_page_participants) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationInfo.participants_count) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationInfo.min_index) + ProtoAdapter.INT64.encodedSizeWithTag(6, conversationInfo.read_index) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationInfo.mute) + ProtoAdapter.INT32.encodedSizeWithTag(9, conversationInfo.stick_on_top) + this.ext.encodedSizeWithTag(10, conversationInfo.ext) + ProtoAdapter.STRING.encodedSizeWithTag(11, conversationInfo.ticket) + ProtoAdapter.INT64.encodedSizeWithTag(12, conversationInfo.conversation_short_id) + ProtoAdapter.INT64.encodedSizeWithTag(13, conversationInfo.conversation_version) + ProtoAdapter.BOOL.encodedSizeWithTag(14, conversationInfo.is_participant) + ProtoAdapter.INT64.encodedSizeWithTag(20, conversationInfo.server_unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(21, conversationInfo.last_message_index) + conversationInfo.unknownFields().size();
        }

        public final ConversationInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.first_page_participants((ParticipantsPage) ParticipantsPage.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.participants_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.min_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.read_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            builder.mute((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.stick_on_top((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 11:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 13:
                            builder.conversation_version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 14:
                            builder.is_participant((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 20:
                            builder.server_unread_count((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 21:
                            builder.last_message_index((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationInfo conversationInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationInfo.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationInfo.conversation_type);
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 3, conversationInfo.first_page_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationInfo.participants_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationInfo.min_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, conversationInfo.read_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationInfo.mute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, conversationInfo.stick_on_top);
            this.ext.encodeWithTag(protoWriter, 10, conversationInfo.ext);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, conversationInfo.ticket);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, conversationInfo.conversation_short_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, conversationInfo.conversation_version);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, conversationInfo.is_participant);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, conversationInfo.server_unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, conversationInfo.last_message_index);
            protoWriter.writeBytes(conversationInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.first_page_participants = this.first_page_participants;
        builder.participants_count = this.participants_count;
        builder.min_index = this.min_index;
        builder.read_index = this.read_index;
        builder.mute = this.mute;
        builder.stick_on_top = this.stick_on_top;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.ticket = this.ticket;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_version = this.conversation_version;
        builder.is_participant = this.is_participant;
        builder.server_unread_count = this.server_unread_count;
        builder.last_message_index = this.last_message_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.hashCode;
        if (i14 != 0) {
            return i14;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i15 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i16 = (hashCode + i) * 37;
        if (this.conversation_type != null) {
            i2 = this.conversation_type.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 37;
        if (this.first_page_participants != null) {
            i3 = this.first_page_participants.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 37;
        if (this.participants_count != null) {
            i4 = this.participants_count.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 37;
        if (this.min_index != null) {
            i5 = this.min_index.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 37;
        if (this.read_index != null) {
            i6 = this.read_index.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 37;
        if (this.mute != null) {
            i7 = this.mute.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 37;
        if (this.stick_on_top != null) {
            i8 = this.stick_on_top.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode2 = (((i22 + i8) * 37) + this.ext.hashCode()) * 37;
        if (this.ticket != null) {
            i9 = this.ticket.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (hashCode2 + i9) * 37;
        if (this.conversation_short_id != null) {
            i10 = this.conversation_short_id.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 37;
        if (this.conversation_version != null) {
            i11 = this.conversation_version.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 37;
        if (this.is_participant != null) {
            i12 = this.is_participant.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 37;
        if (this.server_unread_count != null) {
            i13 = this.server_unread_count.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 37;
        if (this.last_message_index != null) {
            i15 = this.last_message_index.hashCode();
        }
        int i28 = i27 + i15;
        this.hashCode = i28;
        return i28;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.first_page_participants != null) {
            sb.append(", first_page_participants=");
            sb.append(this.first_page_participants);
        }
        if (this.participants_count != null) {
            sb.append(", participants_count=");
            sb.append(this.participants_count);
        }
        if (this.min_index != null) {
            sb.append(", min_index=");
            sb.append(this.min_index);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.mute != null) {
            sb.append(", mute=");
            sb.append(this.mute);
        }
        if (this.stick_on_top != null) {
            sb.append(", stick_on_top=");
            sb.append(this.stick_on_top);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_version != null) {
            sb.append(", conversation_version=");
            sb.append(this.conversation_version);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.server_unread_count != null) {
            sb.append(", server_unread_count=");
            sb.append(this.server_unread_count);
        }
        if (this.last_message_index != null) {
            sb.append(", last_message_index=");
            sb.append(this.last_message_index);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) obj;
        if (!unknownFields().equals(conversationInfo.unknownFields()) || !Internal.equals(this.conversation_id, conversationInfo.conversation_id) || !Internal.equals(this.conversation_type, conversationInfo.conversation_type) || !Internal.equals(this.first_page_participants, conversationInfo.first_page_participants) || !Internal.equals(this.participants_count, conversationInfo.participants_count) || !Internal.equals(this.min_index, conversationInfo.min_index) || !Internal.equals(this.read_index, conversationInfo.read_index) || !Internal.equals(this.mute, conversationInfo.mute) || !Internal.equals(this.stick_on_top, conversationInfo.stick_on_top) || !this.ext.equals(conversationInfo.ext) || !Internal.equals(this.ticket, conversationInfo.ticket) || !Internal.equals(this.conversation_short_id, conversationInfo.conversation_short_id) || !Internal.equals(this.conversation_version, conversationInfo.conversation_version) || !Internal.equals(this.is_participant, conversationInfo.is_participant) || !Internal.equals(this.server_unread_count, conversationInfo.server_unread_count) || !Internal.equals(this.last_message_index, conversationInfo.last_message_index)) {
            return false;
        }
        return true;
    }

    public ConversationInfo(String str, Integer num, ParticipantsPage participantsPage, Integer num2, Long l, Long l2, Integer num3, Integer num4, Map<String, String> map, String str2, Long l3, Long l4, Boolean bool, Long l5, Long l6) {
        this(str, num, participantsPage, num2, l, l2, num3, num4, map, str2, l3, l4, bool, l5, l6, ByteString.EMPTY);
    }

    public ConversationInfo(String str, Integer num, ParticipantsPage participantsPage, Integer num2, Long l, Long l2, Integer num3, Integer num4, Map<String, String> map, String str2, Long l3, Long l4, Boolean bool, Long l5, Long l6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.min_index = l;
        this.read_index = l2;
        this.mute = num3;
        this.stick_on_top = num4;
        Map<String, String> map2 = map;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.ticket = str2;
        this.conversation_short_id = l3;
        this.conversation_version = l4;
        this.is_participant = bool;
        this.server_unread_count = l5;
        this.last_message_index = l6;
    }
}
