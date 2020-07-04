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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserAntiAddiction */
public final class UserAntiAddiction extends Message<UserAntiAddiction, Builder> {
    public static final DefaultValueProtoAdapter<UserAntiAddiction> ADAPTER = new ProtoAdapter_UserAntiAddiction();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String aweme_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String popup_text;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserAntiAddiction$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UserAntiAddiction, Builder> {
        public String aweme_id;
        public String popup_text;

        public final UserAntiAddiction build() {
            return new UserAntiAddiction(this.aweme_id, this.popup_text, super.buildUnknownFields());
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder popup_text(String str) {
            this.popup_text = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserAntiAddiction$ProtoAdapter_UserAntiAddiction */
    static final class ProtoAdapter_UserAntiAddiction extends DefaultValueProtoAdapter<UserAntiAddiction> {
        public final UserAntiAddiction redact(UserAntiAddiction userAntiAddiction) {
            return userAntiAddiction;
        }

        public ProtoAdapter_UserAntiAddiction() {
            super(FieldEncoding.LENGTH_DELIMITED, UserAntiAddiction.class);
        }

        public final UserAntiAddiction decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UserAntiAddiction) null);
        }

        public final int encodedSize(UserAntiAddiction userAntiAddiction) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, userAntiAddiction.aweme_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, userAntiAddiction.popup_text) + userAntiAddiction.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UserAntiAddiction userAntiAddiction) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userAntiAddiction.aweme_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, userAntiAddiction.popup_text);
            protoWriter.writeBytes(userAntiAddiction.unknownFields());
        }

        public final UserAntiAddiction decode(ProtoReader protoReader, UserAntiAddiction userAntiAddiction) throws IOException {
            Builder builder;
            UserAntiAddiction userAntiAddiction2 = (UserAntiAddiction) C10938a.m32097a().mo26425a(UserAntiAddiction.class, userAntiAddiction);
            if (userAntiAddiction2 != null) {
                builder = userAntiAddiction2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.popup_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (userAntiAddiction2 != null) {
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

    public final String getAwemeId() throws NullValueException {
        if (this.aweme_id != null) {
            return this.aweme_id;
        }
        throw new NullValueException();
    }

    public final String getPopupText() throws NullValueException {
        if (this.popup_text != null) {
            return this.popup_text;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.popup_text = this.popup_text;
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
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.popup_text != null) {
            i3 = this.popup_text.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.popup_text != null) {
            sb.append(", popup_text=");
            sb.append(this.popup_text);
        }
        StringBuilder replace = sb.replace(0, 2, "UserAntiAddiction{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAntiAddiction)) {
            return false;
        }
        UserAntiAddiction userAntiAddiction = (UserAntiAddiction) obj;
        if (!unknownFields().equals(userAntiAddiction.unknownFields()) || !Internal.equals(this.aweme_id, userAntiAddiction.aweme_id) || !Internal.equals(this.popup_text, userAntiAddiction.popup_text)) {
            return false;
        }
        return true;
    }

    public UserAntiAddiction(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public UserAntiAddiction(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = str;
        this.popup_text = str2;
    }
}
