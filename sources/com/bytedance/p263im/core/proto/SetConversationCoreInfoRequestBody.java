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

/* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody */
public final class SetConversationCoreInfoRequestBody extends Message<SetConversationCoreInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetConversationCoreInfoRequestBody> ADAPTER = new ProtoAdapter_SetConversationCoreInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Boolean DEFAULT_IS_DESC_SET = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_ICON_SET = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_NAME_SET = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_NOTICE_SET = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean is_desc_set;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 10)
    public final Boolean is_icon_set;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 8)
    public final Boolean is_name_set;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 11)
    public final Boolean is_notice_set;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String notice;

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetConversationCoreInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public String desc;
        public String icon;
        public Boolean is_desc_set;
        public Boolean is_icon_set;
        public Boolean is_name_set;
        public Boolean is_notice_set;
        public String name;
        public String notice;

        public final SetConversationCoreInfoRequestBody build() {
            SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody = new SetConversationCoreInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.name, this.desc, this.icon, this.notice, this.is_name_set, this.is_desc_set, this.is_icon_set, this.is_notice_set, super.buildUnknownFields());
            return setConversationCoreInfoRequestBody;
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

        public final Builder is_desc_set(Boolean bool) {
            this.is_desc_set = bool;
            return this;
        }

        public final Builder is_icon_set(Boolean bool) {
            this.is_icon_set = bool;
            return this;
        }

        public final Builder is_name_set(Boolean bool) {
            this.is_name_set = bool;
            return this;
        }

        public final Builder is_notice_set(Boolean bool) {
            this.is_notice_set = bool;
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
    }

    /* renamed from: com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody$ProtoAdapter_SetConversationCoreInfoRequestBody */
    static final class ProtoAdapter_SetConversationCoreInfoRequestBody extends ProtoAdapter<SetConversationCoreInfoRequestBody> {
        public ProtoAdapter_SetConversationCoreInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationCoreInfoRequestBody.class);
        }

        public final SetConversationCoreInfoRequestBody redact(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            Builder newBuilder = setConversationCoreInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationCoreInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationCoreInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationCoreInfoRequestBody.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, setConversationCoreInfoRequestBody.name) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationCoreInfoRequestBody.desc) + ProtoAdapter.STRING.encodedSizeWithTag(6, setConversationCoreInfoRequestBody.icon) + ProtoAdapter.STRING.encodedSizeWithTag(7, setConversationCoreInfoRequestBody.notice) + ProtoAdapter.BOOL.encodedSizeWithTag(8, setConversationCoreInfoRequestBody.is_name_set) + ProtoAdapter.BOOL.encodedSizeWithTag(9, setConversationCoreInfoRequestBody.is_desc_set) + ProtoAdapter.BOOL.encodedSizeWithTag(10, setConversationCoreInfoRequestBody.is_icon_set) + ProtoAdapter.BOOL.encodedSizeWithTag(11, setConversationCoreInfoRequestBody.is_notice_set) + setConversationCoreInfoRequestBody.unknownFields().size();
        }

        public final SetConversationCoreInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.notice((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.is_name_set((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 9:
                            builder.is_desc_set((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 10:
                            builder.is_icon_set((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 11:
                            builder.is_notice_set((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationCoreInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationCoreInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationCoreInfoRequestBody.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setConversationCoreInfoRequestBody.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationCoreInfoRequestBody.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, setConversationCoreInfoRequestBody.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, setConversationCoreInfoRequestBody.notice);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, setConversationCoreInfoRequestBody.is_name_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, setConversationCoreInfoRequestBody.is_desc_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, setConversationCoreInfoRequestBody.is_icon_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, setConversationCoreInfoRequestBody.is_notice_set);
            protoWriter.writeBytes(setConversationCoreInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.name = this.name;
        builder.desc = this.desc;
        builder.icon = this.icon;
        builder.notice = this.notice;
        builder.is_name_set = this.is_name_set;
        builder.is_desc_set = this.is_desc_set;
        builder.is_icon_set = this.is_icon_set;
        builder.is_notice_set = this.is_notice_set;
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
        if (this.name != null) {
            i4 = this.name.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 37;
        if (this.desc != null) {
            i5 = this.desc.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 37;
        if (this.icon != null) {
            i6 = this.icon.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 37;
        if (this.notice != null) {
            i7 = this.notice.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 37;
        if (this.is_name_set != null) {
            i8 = this.is_name_set.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 37;
        if (this.is_desc_set != null) {
            i9 = this.is_desc_set.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 37;
        if (this.is_icon_set != null) {
            i10 = this.is_icon_set.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 37;
        if (this.is_notice_set != null) {
            i12 = this.is_notice_set.hashCode();
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
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        if (this.is_name_set != null) {
            sb.append(", is_name_set=");
            sb.append(this.is_name_set);
        }
        if (this.is_desc_set != null) {
            sb.append(", is_desc_set=");
            sb.append(this.is_desc_set);
        }
        if (this.is_icon_set != null) {
            sb.append(", is_icon_set=");
            sb.append(this.is_icon_set);
        }
        if (this.is_notice_set != null) {
            sb.append(", is_notice_set=");
            sb.append(this.is_notice_set);
        }
        StringBuilder replace = sb.replace(0, 2, "SetConversationCoreInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetConversationCoreInfoRequestBody)) {
            return false;
        }
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody = (SetConversationCoreInfoRequestBody) obj;
        if (!unknownFields().equals(setConversationCoreInfoRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, setConversationCoreInfoRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, setConversationCoreInfoRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, setConversationCoreInfoRequestBody.conversation_type) || !Internal.equals(this.name, setConversationCoreInfoRequestBody.name) || !Internal.equals(this.desc, setConversationCoreInfoRequestBody.desc) || !Internal.equals(this.icon, setConversationCoreInfoRequestBody.icon) || !Internal.equals(this.notice, setConversationCoreInfoRequestBody.notice) || !Internal.equals(this.is_name_set, setConversationCoreInfoRequestBody.is_name_set) || !Internal.equals(this.is_desc_set, setConversationCoreInfoRequestBody.is_desc_set) || !Internal.equals(this.is_icon_set, setConversationCoreInfoRequestBody.is_icon_set) || !Internal.equals(this.is_notice_set, setConversationCoreInfoRequestBody.is_notice_set)) {
            return false;
        }
        return true;
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(str, l, num, str2, str3, str4, str5, bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.notice = str5;
        this.is_name_set = bool;
        this.is_desc_set = bool2;
        this.is_icon_set = bool3;
        this.is_notice_set = bool4;
    }
}
