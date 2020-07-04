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

/* renamed from: com.bytedance.im.core.proto.ConversationCoreInfo */
public final class ConversationCoreInfo extends Message<ConversationCoreInfo, Builder> {
    public static final ProtoAdapter<ConversationCoreInfo> ADAPTER = new ProtoAdapter_ConversationCoreInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_INFO_VERSION = Long.valueOf(0);
    public static final Long DEFAULT_OWNER = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final Map<String, String> ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public final Integer inbox_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long info_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String notice;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 12)
    public final Long owner;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public final String sec_owner;

    /* renamed from: com.bytedance.im.core.proto.ConversationCoreInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationCoreInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public String desc;
        public Map<String, String> ext = Internal.newMutableMap();
        public String icon;
        public Integer inbox_type;
        public Long info_version;
        public String name;
        public String notice;
        public Long owner;
        public String sec_owner;

        public final ConversationCoreInfo build() {
            ConversationCoreInfo conversationCoreInfo = new ConversationCoreInfo(this.conversation_id, this.conversation_short_id, this.conversation_type, this.info_version, this.name, this.desc, this.icon, this.inbox_type, this.notice, this.ext, this.owner, this.sec_owner, super.buildUnknownFields());
            return conversationCoreInfo;
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

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder info_version(Long l) {
            this.info_version = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder notice(String str) {
            this.notice = str;
            return this;
        }

        public final Builder owner(Long l) {
            this.owner = l;
            return this;
        }

        public final Builder sec_owner(String str) {
            this.sec_owner = str;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationCoreInfo$ProtoAdapter_ConversationCoreInfo */
    static final class ProtoAdapter_ConversationCoreInfo extends ProtoAdapter<ConversationCoreInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        public ProtoAdapter_ConversationCoreInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationCoreInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ConversationCoreInfo redact(ConversationCoreInfo conversationCoreInfo) {
            Builder newBuilder = conversationCoreInfo.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final ConversationCoreInfo decode(ProtoReader protoReader) throws IOException {
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
                            builder.info_version((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.notice((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.ext.putAll((Map) this.ext.decode(protoReader));
                            break;
                        case 12:
                            builder.owner((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 13:
                            builder.sec_owner((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(ConversationCoreInfo conversationCoreInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationCoreInfo.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationCoreInfo.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationCoreInfo.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, conversationCoreInfo.info_version) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationCoreInfo.name) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationCoreInfo.desc) + ProtoAdapter.STRING.encodedSizeWithTag(7, conversationCoreInfo.icon) + ProtoAdapter.INT32.encodedSizeWithTag(8, conversationCoreInfo.inbox_type) + ProtoAdapter.STRING.encodedSizeWithTag(9, conversationCoreInfo.notice) + this.ext.encodedSizeWithTag(11, conversationCoreInfo.ext) + ProtoAdapter.INT64.encodedSizeWithTag(12, conversationCoreInfo.owner) + ProtoAdapter.STRING.encodedSizeWithTag(13, conversationCoreInfo.sec_owner) + conversationCoreInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ConversationCoreInfo conversationCoreInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationCoreInfo.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationCoreInfo.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationCoreInfo.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, conversationCoreInfo.info_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationCoreInfo.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationCoreInfo.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, conversationCoreInfo.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, conversationCoreInfo.inbox_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, conversationCoreInfo.notice);
            this.ext.encodeWithTag(protoWriter, 11, conversationCoreInfo.ext);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, conversationCoreInfo.owner);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, conversationCoreInfo.sec_owner);
            protoWriter.writeBytes(conversationCoreInfo.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.info_version = this.info_version;
        builder.name = this.name;
        builder.desc = this.desc;
        builder.icon = this.icon;
        builder.inbox_type = this.inbox_type;
        builder.notice = this.notice;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.owner = this.owner;
        builder.sec_owner = this.sec_owner;
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
        if (this.info_version != null) {
            i4 = this.info_version.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        if (this.name != null) {
            i5 = this.name.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        if (this.desc != null) {
            i6 = this.desc.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        if (this.icon != null) {
            i7 = this.icon.hashCode();
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
        if (this.notice != null) {
            i9 = this.notice.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((i20 + i9) * 37) + this.ext.hashCode()) * 37;
        if (this.owner != null) {
            i10 = this.owner.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (hashCode2 + i10) * 37;
        if (this.sec_owner != null) {
            i12 = this.sec_owner.hashCode();
        }
        int i22 = i21 + i12;
        this.hashCode = i22;
        return i22;
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
        if (this.info_version != null) {
            sb.append(", info_version=");
            sb.append(this.info_version);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        if (!this.ext.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.sec_owner != null) {
            sb.append(", sec_owner=");
            sb.append(this.sec_owner);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationCoreInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationCoreInfo)) {
            return false;
        }
        ConversationCoreInfo conversationCoreInfo = (ConversationCoreInfo) obj;
        if (!unknownFields().equals(conversationCoreInfo.unknownFields()) || !Internal.equals(this.conversation_id, conversationCoreInfo.conversation_id) || !Internal.equals(this.conversation_short_id, conversationCoreInfo.conversation_short_id) || !Internal.equals(this.conversation_type, conversationCoreInfo.conversation_type) || !Internal.equals(this.info_version, conversationCoreInfo.info_version) || !Internal.equals(this.name, conversationCoreInfo.name) || !Internal.equals(this.desc, conversationCoreInfo.desc) || !Internal.equals(this.icon, conversationCoreInfo.icon) || !Internal.equals(this.inbox_type, conversationCoreInfo.inbox_type) || !Internal.equals(this.notice, conversationCoreInfo.notice) || !this.ext.equals(conversationCoreInfo.ext) || !Internal.equals(this.owner, conversationCoreInfo.owner) || !Internal.equals(this.sec_owner, conversationCoreInfo.sec_owner)) {
            return false;
        }
        return true;
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6) {
        this(str, l, num, l2, str2, str3, str4, num2, str5, map, l3, str6, ByteString.EMPTY);
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.info_version = l2;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.inbox_type = num2;
        this.notice = str5;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.owner = l3;
        this.sec_owner = str6;
    }
}
