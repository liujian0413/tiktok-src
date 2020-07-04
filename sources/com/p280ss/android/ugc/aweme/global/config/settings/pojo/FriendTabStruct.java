package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FriendTabStruct */
public final class FriendTabStruct extends Message<FriendTabStruct, Builder> {
    public static final DefaultValueProtoAdapter<FriendTabStruct> ADAPTER = new ProtoAdapter_FriendTabStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean default_follow_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String friend_tab_desc;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FriendTabStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FriendTabStruct, Builder> {
        public Boolean default_follow_tab;
        public String friend_tab_desc;

        public final FriendTabStruct build() {
            return new FriendTabStruct(this.friend_tab_desc, this.default_follow_tab, super.buildUnknownFields());
        }

        public final Builder default_follow_tab(Boolean bool) {
            this.default_follow_tab = bool;
            return this;
        }

        public final Builder friend_tab_desc(String str) {
            this.friend_tab_desc = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FriendTabStruct$ProtoAdapter_FriendTabStruct */
    static final class ProtoAdapter_FriendTabStruct extends DefaultValueProtoAdapter<FriendTabStruct> {
        public final FriendTabStruct redact(FriendTabStruct friendTabStruct) {
            return friendTabStruct;
        }

        public ProtoAdapter_FriendTabStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, FriendTabStruct.class);
        }

        public final FriendTabStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FriendTabStruct) null);
        }

        public final int encodedSize(FriendTabStruct friendTabStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, friendTabStruct.friend_tab_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(2, friendTabStruct.default_follow_tab) + friendTabStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FriendTabStruct friendTabStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, friendTabStruct.friend_tab_desc);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, friendTabStruct.default_follow_tab);
            protoWriter.writeBytes(friendTabStruct.unknownFields());
        }

        public final FriendTabStruct decode(ProtoReader protoReader, FriendTabStruct friendTabStruct) throws IOException {
            Builder builder;
            FriendTabStruct friendTabStruct2 = (FriendTabStruct) C10938a.m32097a().mo26425a(FriendTabStruct.class, friendTabStruct);
            if (friendTabStruct2 != null) {
                builder = friendTabStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.friend_tab_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.default_follow_tab((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (friendTabStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getDefaultFollowTab() throws NullValueException {
        if (this.default_follow_tab != null) {
            return this.default_follow_tab;
        }
        throw new NullValueException();
    }

    public final String getFriendTabDesc() throws NullValueException {
        if (this.friend_tab_desc != null) {
            return this.friend_tab_desc;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.friend_tab_desc = this.friend_tab_desc;
        builder.default_follow_tab = this.default_follow_tab;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.friend_tab_desc != null) {
            i = this.friend_tab_desc.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.default_follow_tab != null) {
            i3 = this.default_follow_tab.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.friend_tab_desc != null) {
            sb.append(", friend_tab_desc=");
            sb.append(this.friend_tab_desc);
        }
        if (this.default_follow_tab != null) {
            sb.append(", default_follow_tab=");
            sb.append(this.default_follow_tab);
        }
        StringBuilder replace = sb.replace(0, 2, "FriendTabStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendTabStruct)) {
            return false;
        }
        FriendTabStruct friendTabStruct = (FriendTabStruct) obj;
        if (!unknownFields().equals(friendTabStruct.unknownFields()) || !Internal.equals(this.friend_tab_desc, friendTabStruct.friend_tab_desc) || !Internal.equals(this.default_follow_tab, friendTabStruct.default_follow_tab)) {
            return false;
        }
        return true;
    }

    public FriendTabStruct(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public FriendTabStruct(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.friend_tab_desc = str;
        this.default_follow_tab = bool;
    }
}
