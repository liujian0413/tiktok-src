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

/* renamed from: com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody */
public final class SetConversationSettingInfoRequestBody extends Message<SetConversationSettingInfoRequestBody, Builder> {
    public static final ProtoAdapter<SetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter_SetConversationSettingInfoRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Boolean DEFAULT_SET_FAVORITE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_SET_MUTE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_SET_STICK_ON_TOP = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean set_favorite;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean set_mute;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean set_stick_on_top;

    /* renamed from: com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SetConversationSettingInfoRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Boolean set_favorite;
        public Boolean set_mute;
        public Boolean set_stick_on_top;

        public final SetConversationSettingInfoRequestBody build() {
            SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody = new SetConversationSettingInfoRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.set_stick_on_top, this.set_mute, this.set_favorite, super.buildUnknownFields());
            return setConversationSettingInfoRequestBody;
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

        public final Builder set_favorite(Boolean bool) {
            this.set_favorite = bool;
            return this;
        }

        public final Builder set_mute(Boolean bool) {
            this.set_mute = bool;
            return this;
        }

        public final Builder set_stick_on_top(Boolean bool) {
            this.set_stick_on_top = bool;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody$ProtoAdapter_SetConversationSettingInfoRequestBody */
    static final class ProtoAdapter_SetConversationSettingInfoRequestBody extends ProtoAdapter<SetConversationSettingInfoRequestBody> {
        public ProtoAdapter_SetConversationSettingInfoRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationSettingInfoRequestBody.class);
        }

        public final SetConversationSettingInfoRequestBody redact(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            Builder newBuilder = setConversationSettingInfoRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setConversationSettingInfoRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationSettingInfoRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationSettingInfoRequestBody.conversation_type) + ProtoAdapter.BOOL.encodedSizeWithTag(4, setConversationSettingInfoRequestBody.set_stick_on_top) + ProtoAdapter.BOOL.encodedSizeWithTag(5, setConversationSettingInfoRequestBody.set_mute) + ProtoAdapter.BOOL.encodedSizeWithTag(6, setConversationSettingInfoRequestBody.set_favorite) + setConversationSettingInfoRequestBody.unknownFields().size();
        }

        public final SetConversationSettingInfoRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.set_stick_on_top((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.set_mute((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.set_favorite((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setConversationSettingInfoRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationSettingInfoRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationSettingInfoRequestBody.conversation_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setConversationSettingInfoRequestBody.set_stick_on_top);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, setConversationSettingInfoRequestBody.set_mute);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, setConversationSettingInfoRequestBody.set_favorite);
            protoWriter.writeBytes(setConversationSettingInfoRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.set_stick_on_top = this.set_stick_on_top;
        builder.set_mute = this.set_mute;
        builder.set_favorite = this.set_favorite;
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
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.conversation_type != null) {
            i3 = this.conversation_type.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.set_stick_on_top != null) {
            i4 = this.set_stick_on_top.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.set_mute != null) {
            i5 = this.set_mute.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.set_favorite != null) {
            i7 = this.set_favorite.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
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
        if (this.set_stick_on_top != null) {
            sb.append(", set_stick_on_top=");
            sb.append(this.set_stick_on_top);
        }
        if (this.set_mute != null) {
            sb.append(", set_mute=");
            sb.append(this.set_mute);
        }
        if (this.set_favorite != null) {
            sb.append(", set_favorite=");
            sb.append(this.set_favorite);
        }
        StringBuilder replace = sb.replace(0, 2, "SetConversationSettingInfoRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetConversationSettingInfoRequestBody)) {
            return false;
        }
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody = (SetConversationSettingInfoRequestBody) obj;
        if (!unknownFields().equals(setConversationSettingInfoRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, setConversationSettingInfoRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, setConversationSettingInfoRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, setConversationSettingInfoRequestBody.conversation_type) || !Internal.equals(this.set_stick_on_top, setConversationSettingInfoRequestBody.set_stick_on_top) || !Internal.equals(this.set_mute, setConversationSettingInfoRequestBody.set_mute) || !Internal.equals(this.set_favorite, setConversationSettingInfoRequestBody.set_favorite)) {
            return false;
        }
        return true;
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        this(str, l, num, bool, bool2, bool3, ByteString.EMPTY);
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.set_stick_on_top = bool;
        this.set_mute = bool2;
        this.set_favorite = bool3;
    }
}
