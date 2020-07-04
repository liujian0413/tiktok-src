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

/* renamed from: com.bytedance.im.core.proto.ConversationSettingInfo */
public final class ConversationSettingInfo extends Message<ConversationSettingInfo, Builder> {
    public static final ProtoAdapter<ConversationSettingInfo> ADAPTER = new ProtoAdapter_ConversationSettingInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_FAVORITE = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_MIN_INDEX = Long.valueOf(0);
    public static final Integer DEFAULT_MUTE = Integer.valueOf(0);
    public static final Long DEFAULT_READ_INDEX = Long.valueOf(0);
    public static final Long DEFAULT_SETTING_VERSION = Long.valueOf(0);
    public static final Integer DEFAULT_STICK_ON_TOP = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final Map<String, String> ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 11)
    public final Integer favorite;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer inbox_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long min_index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long read_index;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 10)
    public final Long setting_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer stick_on_top;

    /* renamed from: com.bytedance.im.core.proto.ConversationSettingInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationSettingInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public Integer favorite;
        public Integer inbox_type;
        public Long min_index;
        public Integer mute;
        public Long read_index;
        public Long setting_version;
        public Integer stick_on_top;

        public final ConversationSettingInfo build() {
            ConversationSettingInfo conversationSettingInfo = new ConversationSettingInfo(this.conversation_id, this.conversation_short_id, this.conversation_type, this.min_index, this.read_index, this.mute, this.stick_on_top, this.inbox_type, this.ext, this.setting_version, this.favorite, super.buildUnknownFields());
            return conversationSettingInfo;
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

        public final Builder favorite(Integer num) {
            this.favorite = num;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
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

        public final Builder read_index(Long l) {
            this.read_index = l;
            return this;
        }

        public final Builder setting_version(Long l) {
            this.setting_version = l;
            return this;
        }

        public final Builder stick_on_top(Integer num) {
            this.stick_on_top = num;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationSettingInfo$ProtoAdapter_ConversationSettingInfo */
    static final class ProtoAdapter_ConversationSettingInfo extends ProtoAdapter<ConversationSettingInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_ConversationSettingInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationSettingInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ConversationSettingInfo redact(ConversationSettingInfo conversationSettingInfo) {
            Builder newBuilder = conversationSettingInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationSettingInfo conversationSettingInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationSettingInfo.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationSettingInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationSettingInfo.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationSettingInfo.min_index) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationSettingInfo.read_index) + ProtoAdapter.INT32.encodedSizeWithTag(6, conversationSettingInfo.mute) + ProtoAdapter.INT32.encodedSizeWithTag(7, conversationSettingInfo.stick_on_top) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationSettingInfo.inbox_type) + this.ext.encodedSizeWithTag(9, conversationSettingInfo.ext) + ProtoAdapter.INT64.encodedSizeWithTag(10, conversationSettingInfo.setting_version) + ProtoAdapter.INT32.encodedSizeWithTag(11, conversationSettingInfo.favorite) + conversationSettingInfo.unknownFields().size();
        }

        public final ConversationSettingInfo decode(ProtoReader protoReader) throws IOException {
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
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.min_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.read_index((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.mute((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.stick_on_top((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 8:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 10:
                            builder.setting_version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 11:
                            builder.favorite((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationSettingInfo conversationSettingInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationSettingInfo.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationSettingInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationSettingInfo.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationSettingInfo.min_index);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationSettingInfo.read_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, conversationSettingInfo.mute);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, conversationSettingInfo.stick_on_top);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationSettingInfo.inbox_type);
            this.ext.encodeWithTag(protoWriter, 9, conversationSettingInfo.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, conversationSettingInfo.setting_version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, conversationSettingInfo.favorite);
            protoWriter.writeBytes(conversationSettingInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.min_index = this.min_index;
        builder.read_index = this.read_index;
        builder.mute = this.mute;
        builder.stick_on_top = this.stick_on_top;
        builder.inbox_type = this.inbox_type;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.setting_version = this.setting_version;
        builder.favorite = this.favorite;
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
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i11 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 37;
        if (this.conversation_type != null) {
            i3 = this.conversation_type.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        if (this.min_index != null) {
            i4 = this.min_index.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        if (this.read_index != null) {
            i5 = this.read_index.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        if (this.mute != null) {
            i6 = this.mute.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        if (this.stick_on_top != null) {
            i7 = this.stick_on_top.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        if (this.inbox_type != null) {
            i8 = this.inbox_type.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode2 = (((i18 + i8) * 37) + this.ext.hashCode()) * 37;
        if (this.setting_version != null) {
            i9 = this.setting_version.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (hashCode2 + i9) * 37;
        if (this.favorite != null) {
            i11 = this.favorite.hashCode();
        }
        int i20 = i19 + i11;
        this.hashCode = i20;
        return i20;
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
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.setting_version != null) {
            sb.append(", setting_version=");
            sb.append(this.setting_version);
        }
        if (this.favorite != null) {
            sb.append(", favorite=");
            sb.append(this.favorite);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationSettingInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationSettingInfo)) {
            return false;
        }
        ConversationSettingInfo conversationSettingInfo = (ConversationSettingInfo) obj;
        if (!unknownFields().equals(conversationSettingInfo.unknownFields()) || !Internal.equals(this.conversation_id, conversationSettingInfo.conversation_id) || !Internal.equals(this.conversation_short_id, conversationSettingInfo.conversation_short_id) || !Internal.equals(this.conversation_type, conversationSettingInfo.conversation_type) || !Internal.equals(this.min_index, conversationSettingInfo.min_index) || !Internal.equals(this.read_index, conversationSettingInfo.read_index) || !Internal.equals(this.mute, conversationSettingInfo.mute) || !Internal.equals(this.stick_on_top, conversationSettingInfo.stick_on_top) || !Internal.equals(this.inbox_type, conversationSettingInfo.inbox_type) || !this.ext.equals(conversationSettingInfo.ext) || !Internal.equals(this.setting_version, conversationSettingInfo.setting_version) || !Internal.equals(this.favorite, conversationSettingInfo.favorite)) {
            return false;
        }
        return true;
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5) {
        this(str, l, num, l2, l3, num2, num3, num4, map, l4, num5, ByteString.EMPTY);
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.min_index = l2;
        this.read_index = l3;
        this.mute = num2;
        this.stick_on_top = num3;
        this.inbox_type = num4;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.setting_version = l4;
        this.favorite = num5;
    }
}
