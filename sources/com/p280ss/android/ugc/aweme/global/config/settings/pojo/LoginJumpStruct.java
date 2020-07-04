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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct */
public final class LoginJumpStruct extends Message<LoginJumpStruct, Builder> {
    public static final DefaultValueProtoAdapter<LoginJumpStruct> ADAPTER = new ProtoAdapter_LoginJumpStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer jump_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String jump_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer login_platform;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LoginJumpStruct, Builder> {
        public Integer jump_type;
        public String jump_url;
        public Integer login_platform;

        public final LoginJumpStruct build() {
            return new LoginJumpStruct(this.login_platform, this.jump_type, this.jump_url, super.buildUnknownFields());
        }

        public final Builder jump_type(Integer num) {
            this.jump_type = num;
            return this;
        }

        public final Builder jump_url(String str) {
            this.jump_url = str;
            return this;
        }

        public final Builder login_platform(Integer num) {
            this.login_platform = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct$ProtoAdapter_LoginJumpStruct */
    static final class ProtoAdapter_LoginJumpStruct extends DefaultValueProtoAdapter<LoginJumpStruct> {
        public final LoginJumpStruct redact(LoginJumpStruct loginJumpStruct) {
            return loginJumpStruct;
        }

        public ProtoAdapter_LoginJumpStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginJumpStruct.class);
        }

        public final LoginJumpStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LoginJumpStruct) null);
        }

        public final int encodedSize(LoginJumpStruct loginJumpStruct) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, loginJumpStruct.login_platform) + ProtoAdapter.INT32.encodedSizeWithTag(2, loginJumpStruct.jump_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, loginJumpStruct.jump_url) + loginJumpStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LoginJumpStruct loginJumpStruct) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, loginJumpStruct.login_platform);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, loginJumpStruct.jump_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, loginJumpStruct.jump_url);
            protoWriter.writeBytes(loginJumpStruct.unknownFields());
        }

        public final LoginJumpStruct decode(ProtoReader protoReader, LoginJumpStruct loginJumpStruct) throws IOException {
            Builder builder;
            LoginJumpStruct loginJumpStruct2 = (LoginJumpStruct) C10938a.m32097a().mo26425a(LoginJumpStruct.class, loginJumpStruct);
            if (loginJumpStruct2 != null) {
                builder = loginJumpStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.login_platform((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.jump_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.jump_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (loginJumpStruct2 != null) {
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

    public final Integer getJumpType() throws NullValueException {
        if (this.jump_type != null) {
            return this.jump_type;
        }
        throw new NullValueException();
    }

    public final String getJumpUrl() throws NullValueException {
        if (this.jump_url != null) {
            return this.jump_url;
        }
        throw new NullValueException();
    }

    public final Integer getLoginPlatform() throws NullValueException {
        if (this.login_platform != null) {
            return this.login_platform;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.login_platform = this.login_platform;
        builder.jump_type = this.jump_type;
        builder.jump_url = this.jump_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.login_platform != null) {
            i = this.login_platform.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.jump_type != null) {
            i2 = this.jump_type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.jump_url != null) {
            i4 = this.jump_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.login_platform != null) {
            sb.append(", login_platform=");
            sb.append(this.login_platform);
        }
        if (this.jump_type != null) {
            sb.append(", jump_type=");
            sb.append(this.jump_type);
        }
        if (this.jump_url != null) {
            sb.append(", jump_url=");
            sb.append(this.jump_url);
        }
        StringBuilder replace = sb.replace(0, 2, "LoginJumpStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginJumpStruct)) {
            return false;
        }
        LoginJumpStruct loginJumpStruct = (LoginJumpStruct) obj;
        if (!unknownFields().equals(loginJumpStruct.unknownFields()) || !Internal.equals(this.login_platform, loginJumpStruct.login_platform) || !Internal.equals(this.jump_type, loginJumpStruct.jump_type) || !Internal.equals(this.jump_url, loginJumpStruct.jump_url)) {
            return false;
        }
        return true;
    }

    public LoginJumpStruct(Integer num, Integer num2, String str) {
        this(num, num2, str, ByteString.EMPTY);
    }

    public LoginJumpStruct(Integer num, Integer num2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.login_platform = num;
        this.jump_type = num2;
        this.jump_url = str;
    }
}
