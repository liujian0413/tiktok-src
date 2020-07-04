package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationInfoV2 */
public final class ConversationInfoV2 extends Message<ConversationInfoV2, Builder> {
    public static final ProtoAdapter<ConversationInfoV2> ADAPTER = new ProtoAdapter_ConversationInfoV2();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Boolean DEFAULT_IS_PARTICIPANT = Boolean.valueOf(false);
    public static final Integer DEFAULT_PARTICIPANTS_COUNT = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationCoreInfo#ADAPTER", tag = 50)
    public final ConversationCoreInfo conversation_core_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationSettingInfo#ADAPTER", tag = 51)
    public final ConversationSettingInfo conversation_setting_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.bytedance.im.core.proto.ParticipantsPage#ADAPTER", tag = 6)
    public final ParticipantsPage first_page_participants;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer inbox_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean is_participant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer participants_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String ticket;
    @WireField(adapter = "com.bytedance.im.core.proto.Participant#ADAPTER", tag = 20)
    public final Participant user_info;

    /* renamed from: com.bytedance.im.core.proto.ConversationInfoV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationInfoV2, Builder> {
        public ConversationCoreInfo conversation_core_info;
        public String conversation_id;
        public ConversationSettingInfo conversation_setting_info;
        public Long conversation_short_id;
        public Integer conversation_type;
        public ParticipantsPage first_page_participants;
        public Integer inbox_type;
        public Boolean is_participant;
        public Integer participants_count;
        public String ticket;
        public Participant user_info;

        public final ConversationInfoV2 build() {
            ConversationInfoV2 conversationInfoV2 = new ConversationInfoV2(this.conversation_id, this.conversation_short_id, this.conversation_type, this.ticket, this.first_page_participants, this.participants_count, this.is_participant, this.inbox_type, this.user_info, this.conversation_core_info, this.conversation_setting_info, super.buildUnknownFields());
            return conversationInfoV2;
        }

        public final Builder conversation_core_info(ConversationCoreInfo conversationCoreInfo) {
            this.conversation_core_info = conversationCoreInfo;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.conversation_setting_info = conversationSettingInfo;
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

        public final Builder first_page_participants(ParticipantsPage participantsPage) {
            this.first_page_participants = participantsPage;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder is_participant(Boolean bool) {
            this.is_participant = bool;
            return this;
        }

        public final Builder participants_count(Integer num) {
            this.participants_count = num;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder user_info(Participant participant) {
            this.user_info = participant;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationInfoV2$ProtoAdapter_ConversationInfoV2 */
    static final class ProtoAdapter_ConversationInfoV2 extends ProtoAdapter<ConversationInfoV2> {
        public ProtoAdapter_ConversationInfoV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationInfoV2.class);
        }

        public final int encodedSize(ConversationInfoV2 conversationInfoV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationInfoV2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationInfoV2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationInfoV2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationInfoV2.ticket) + ParticipantsPage.ADAPTER.encodedSizeWithTag(6, conversationInfoV2.first_page_participants) + ProtoAdapter.INT32.encodedSizeWithTag(7, conversationInfoV2.participants_count) + ProtoAdapter.BOOL.encodedSizeWithTag(8, conversationInfoV2.is_participant) + ProtoAdapter.INT32.encodedSizeWithTag(9, conversationInfoV2.inbox_type) + Participant.ADAPTER.encodedSizeWithTag(20, conversationInfoV2.user_info) + ConversationCoreInfo.ADAPTER.encodedSizeWithTag(50, conversationInfoV2.conversation_core_info) + ConversationSettingInfo.ADAPTER.encodedSizeWithTag(51, conversationInfoV2.conversation_setting_info) + conversationInfoV2.unknownFields().size();
        }

        public final ConversationInfoV2 redact(ConversationInfoV2 conversationInfoV2) {
            Builder newBuilder = conversationInfoV2.newBuilder();
            if (newBuilder.first_page_participants != null) {
                newBuilder.first_page_participants = (ParticipantsPage) ParticipantsPage.ADAPTER.redact(newBuilder.first_page_participants);
            }
            if (newBuilder.user_info != null) {
                newBuilder.user_info = (Participant) Participant.ADAPTER.redact(newBuilder.user_info);
            }
            if (newBuilder.conversation_core_info != null) {
                newBuilder.conversation_core_info = (ConversationCoreInfo) ConversationCoreInfo.ADAPTER.redact(newBuilder.conversation_core_info);
            }
            if (newBuilder.conversation_setting_info != null) {
                newBuilder.conversation_setting_info = (ConversationSettingInfo) ConversationSettingInfo.ADAPTER.redact(newBuilder.conversation_setting_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ConversationInfoV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 20) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            switch (nextTag) {
                                case 6:
                                    builder.first_page_participants((ParticipantsPage) ParticipantsPage.ADAPTER.decode(protoReader));
                                    break;
                                case 7:
                                    builder.participants_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                                    break;
                                case 8:
                                    builder.is_participant((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                                    break;
                                case 9:
                                    builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                                    break;
                                default:
                                    switch (nextTag) {
                                        case 50:
                                            builder.conversation_core_info((ConversationCoreInfo) ConversationCoreInfo.ADAPTER.decode(protoReader));
                                            break;
                                        case 51:
                                            builder.conversation_setting_info((ConversationSettingInfo) ConversationSettingInfo.ADAPTER.decode(protoReader));
                                            break;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                            }
                    }
                } else {
                    builder.user_info((Participant) Participant.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationInfoV2 conversationInfoV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationInfoV2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationInfoV2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationInfoV2.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationInfoV2.ticket);
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 6, conversationInfoV2.first_page_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, conversationInfoV2.participants_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, conversationInfoV2.is_participant);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, conversationInfoV2.inbox_type);
            Participant.ADAPTER.encodeWithTag(protoWriter, 20, conversationInfoV2.user_info);
            ConversationCoreInfo.ADAPTER.encodeWithTag(protoWriter, 50, conversationInfoV2.conversation_core_info);
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 51, conversationInfoV2.conversation_setting_info);
            protoWriter.writeBytes(conversationInfoV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.ticket = this.ticket;
        builder.first_page_participants = this.first_page_participants;
        builder.participants_count = this.participants_count;
        builder.is_participant = this.is_participant;
        builder.inbox_type = this.inbox_type;
        builder.user_info = this.user_info;
        builder.conversation_core_info = this.conversation_core_info;
        builder.conversation_setting_info = this.conversation_setting_info;
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
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i12 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i13 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 37;
        if (this.conversation_type != null) {
            i3 = this.conversation_type.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 37;
        if (this.ticket != null) {
            i4 = this.ticket.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        if (this.first_page_participants != null) {
            i5 = this.first_page_participants.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        if (this.participants_count != null) {
            i6 = this.participants_count.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        if (this.is_participant != null) {
            i7 = this.is_participant.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        if (this.inbox_type != null) {
            i8 = this.inbox_type.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        if (this.user_info != null) {
            i9 = this.user_info.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        if (this.conversation_core_info != null) {
            i10 = this.conversation_core_info.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        if (this.conversation_setting_info != null) {
            i12 = this.conversation_setting_info.hashCode();
        }
        int i23 = i22 + i12;
        this.hashCode = i23;
        return i23;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.first_page_participants != null) {
            sb.append(", first_page_participants=");
            sb.append(this.first_page_participants);
        }
        if (this.participants_count != null) {
            sb.append(", participants_count=");
            sb.append(this.participants_count);
        }
        if (this.is_participant != null) {
            sb.append(", is_participant=");
            sb.append(this.is_participant);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.conversation_core_info != null) {
            sb.append(", conversation_core_info=");
            sb.append(this.conversation_core_info);
        }
        if (this.conversation_setting_info != null) {
            sb.append(", conversation_setting_info=");
            sb.append(this.conversation_setting_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationInfoV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationInfoV2)) {
            return false;
        }
        ConversationInfoV2 conversationInfoV2 = (ConversationInfoV2) obj;
        if (!unknownFields().equals(conversationInfoV2.unknownFields()) || !Internal.equals(this.conversation_id, conversationInfoV2.conversation_id) || !Internal.equals(this.conversation_short_id, conversationInfoV2.conversation_short_id) || !Internal.equals(this.conversation_type, conversationInfoV2.conversation_type) || !Internal.equals(this.ticket, conversationInfoV2.ticket) || !Internal.equals(this.first_page_participants, conversationInfoV2.first_page_participants) || !Internal.equals(this.participants_count, conversationInfoV2.participants_count) || !Internal.equals(this.is_participant, conversationInfoV2.is_participant) || !Internal.equals(this.inbox_type, conversationInfoV2.inbox_type) || !Internal.equals(this.user_info, conversationInfoV2.user_info) || !Internal.equals(this.conversation_core_info, conversationInfoV2.conversation_core_info) || !Internal.equals(this.conversation_setting_info, conversationInfoV2.conversation_setting_info)) {
            return false;
        }
        return true;
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo) {
        this(str, l, num, str2, participantsPage, num2, bool, num3, participant, conversationCoreInfo, conversationSettingInfo, ByteString.EMPTY);
    }

    public ConversationInfoV2(String str, Long l, Integer num, String str2, ParticipantsPage participantsPage, Integer num2, Boolean bool, Integer num3, Participant participant, ConversationCoreInfo conversationCoreInfo, ConversationSettingInfo conversationSettingInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.ticket = str2;
        this.first_page_participants = participantsPage;
        this.participants_count = num2;
        this.is_participant = bool;
        this.inbox_type = num3;
        this.user_info = participant;
        this.conversation_core_info = conversationCoreInfo;
        this.conversation_setting_info = conversationSettingInfo;
    }
}
