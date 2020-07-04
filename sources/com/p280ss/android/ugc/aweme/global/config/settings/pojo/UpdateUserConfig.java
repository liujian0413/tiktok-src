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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UpdateUserConfig */
public final class UpdateUserConfig extends Message<UpdateUserConfig, Builder> {
    public static final DefaultValueProtoAdapter<UpdateUserConfig> ADAPTER = new ProtoAdapter_UpdateUserConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String wx_toast_content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean wx_toast_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer wx_toast_frequence;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer wx_toast_position;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UpdateUserConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UpdateUserConfig, Builder> {
        public String wx_toast_content;
        public Boolean wx_toast_enable;
        public Integer wx_toast_frequence;
        public Integer wx_toast_position;

        public final UpdateUserConfig build() {
            UpdateUserConfig updateUserConfig = new UpdateUserConfig(this.wx_toast_position, this.wx_toast_content, this.wx_toast_enable, this.wx_toast_frequence, super.buildUnknownFields());
            return updateUserConfig;
        }

        public final Builder wx_toast_content(String str) {
            this.wx_toast_content = str;
            return this;
        }

        public final Builder wx_toast_enable(Boolean bool) {
            this.wx_toast_enable = bool;
            return this;
        }

        public final Builder wx_toast_frequence(Integer num) {
            this.wx_toast_frequence = num;
            return this;
        }

        public final Builder wx_toast_position(Integer num) {
            this.wx_toast_position = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UpdateUserConfig$ProtoAdapter_UpdateUserConfig */
    static final class ProtoAdapter_UpdateUserConfig extends DefaultValueProtoAdapter<UpdateUserConfig> {
        public final UpdateUserConfig redact(UpdateUserConfig updateUserConfig) {
            return updateUserConfig;
        }

        public ProtoAdapter_UpdateUserConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserConfig.class);
        }

        public final UpdateUserConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UpdateUserConfig) null);
        }

        public final int encodedSize(UpdateUserConfig updateUserConfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, updateUserConfig.wx_toast_position) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateUserConfig.wx_toast_content) + ProtoAdapter.BOOL.encodedSizeWithTag(3, updateUserConfig.wx_toast_enable) + ProtoAdapter.INT32.encodedSizeWithTag(4, updateUserConfig.wx_toast_frequence) + updateUserConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UpdateUserConfig updateUserConfig) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, updateUserConfig.wx_toast_position);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateUserConfig.wx_toast_content);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateUserConfig.wx_toast_enable);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, updateUserConfig.wx_toast_frequence);
            protoWriter.writeBytes(updateUserConfig.unknownFields());
        }

        public final UpdateUserConfig decode(ProtoReader protoReader, UpdateUserConfig updateUserConfig) throws IOException {
            Builder builder;
            UpdateUserConfig updateUserConfig2 = (UpdateUserConfig) C10938a.m32097a().mo26425a(UpdateUserConfig.class, updateUserConfig);
            if (updateUserConfig2 != null) {
                builder = updateUserConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.wx_toast_position((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.wx_toast_content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.wx_toast_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.wx_toast_frequence((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (updateUserConfig2 != null) {
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

    public final String getWxToastContent() throws NullValueException {
        if (this.wx_toast_content != null) {
            return this.wx_toast_content;
        }
        throw new NullValueException();
    }

    public final Boolean getWxToastEnable() throws NullValueException {
        if (this.wx_toast_enable != null) {
            return this.wx_toast_enable;
        }
        throw new NullValueException();
    }

    public final Integer getWxToastFrequence() throws NullValueException {
        if (this.wx_toast_frequence != null) {
            return this.wx_toast_frequence;
        }
        throw new NullValueException();
    }

    public final Integer getWxToastPosition() throws NullValueException {
        if (this.wx_toast_position != null) {
            return this.wx_toast_position;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.wx_toast_position = this.wx_toast_position;
        builder.wx_toast_content = this.wx_toast_content;
        builder.wx_toast_enable = this.wx_toast_enable;
        builder.wx_toast_frequence = this.wx_toast_frequence;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.wx_toast_position != null) {
            i = this.wx_toast_position.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.wx_toast_content != null) {
            i2 = this.wx_toast_content.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.wx_toast_enable != null) {
            i3 = this.wx_toast_enable.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.wx_toast_frequence != null) {
            i5 = this.wx_toast_frequence.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.wx_toast_position != null) {
            sb.append(", wx_toast_position=");
            sb.append(this.wx_toast_position);
        }
        if (this.wx_toast_content != null) {
            sb.append(", wx_toast_content=");
            sb.append(this.wx_toast_content);
        }
        if (this.wx_toast_enable != null) {
            sb.append(", wx_toast_enable=");
            sb.append(this.wx_toast_enable);
        }
        if (this.wx_toast_frequence != null) {
            sb.append(", wx_toast_frequence=");
            sb.append(this.wx_toast_frequence);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateUserConfig)) {
            return false;
        }
        UpdateUserConfig updateUserConfig = (UpdateUserConfig) obj;
        if (!unknownFields().equals(updateUserConfig.unknownFields()) || !Internal.equals(this.wx_toast_position, updateUserConfig.wx_toast_position) || !Internal.equals(this.wx_toast_content, updateUserConfig.wx_toast_content) || !Internal.equals(this.wx_toast_enable, updateUserConfig.wx_toast_enable) || !Internal.equals(this.wx_toast_frequence, updateUserConfig.wx_toast_frequence)) {
            return false;
        }
        return true;
    }

    public UpdateUserConfig(Integer num, String str, Boolean bool, Integer num2) {
        this(num, str, bool, num2, ByteString.EMPTY);
    }

    public UpdateUserConfig(Integer num, String str, Boolean bool, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.wx_toast_position = num;
        this.wx_toast_content = str;
        this.wx_toast_enable = bool;
        this.wx_toast_frequence = num2;
    }
}
