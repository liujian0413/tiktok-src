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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserPreferSettings */
public final class UserPreferSettings extends Message<UserPreferSettings, Builder> {
    public static final DefaultValueProtoAdapter<UserPreferSettings> ADAPTER = new ProtoAdapter_UserPreferSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer display_time;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)

    /* renamed from: n */
    public final Integer f79484n;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)

    /* renamed from: t */
    public final Integer f79485t;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)

    /* renamed from: v */
    public final Integer f79486v;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserPreferSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UserPreferSettings, Builder> {
        public Integer display_time;

        /* renamed from: n */
        public Integer f79487n;

        /* renamed from: t */
        public Integer f79488t;

        /* renamed from: v */
        public Integer f79489v;

        public final UserPreferSettings build() {
            UserPreferSettings userPreferSettings = new UserPreferSettings(this.f79487n, this.f79488t, this.f79489v, this.display_time, super.buildUnknownFields());
            return userPreferSettings;
        }

        public final Builder display_time(Integer num) {
            this.display_time = num;
            return this;
        }

        /* renamed from: n */
        public final Builder mo79374n(Integer num) {
            this.f79487n = num;
            return this;
        }

        /* renamed from: t */
        public final Builder mo79375t(Integer num) {
            this.f79488t = num;
            return this;
        }

        /* renamed from: v */
        public final Builder mo79376v(Integer num) {
            this.f79489v = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserPreferSettings$ProtoAdapter_UserPreferSettings */
    static final class ProtoAdapter_UserPreferSettings extends DefaultValueProtoAdapter<UserPreferSettings> {
        public final UserPreferSettings redact(UserPreferSettings userPreferSettings) {
            return userPreferSettings;
        }

        public ProtoAdapter_UserPreferSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, UserPreferSettings.class);
        }

        public final UserPreferSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UserPreferSettings) null);
        }

        public final int encodedSize(UserPreferSettings userPreferSettings) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, userPreferSettings.f79484n) + ProtoAdapter.INT32.encodedSizeWithTag(2, userPreferSettings.f79485t) + ProtoAdapter.INT32.encodedSizeWithTag(3, userPreferSettings.f79486v) + ProtoAdapter.INT32.encodedSizeWithTag(4, userPreferSettings.display_time) + userPreferSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UserPreferSettings userPreferSettings) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, userPreferSettings.f79484n);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, userPreferSettings.f79485t);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, userPreferSettings.f79486v);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, userPreferSettings.display_time);
            protoWriter.writeBytes(userPreferSettings.unknownFields());
        }

        public final UserPreferSettings decode(ProtoReader protoReader, UserPreferSettings userPreferSettings) throws IOException {
            Builder builder;
            UserPreferSettings userPreferSettings2 = (UserPreferSettings) C10938a.m32097a().mo26425a(UserPreferSettings.class, userPreferSettings);
            if (userPreferSettings2 != null) {
                builder = userPreferSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo79374n((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.mo79375t((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.mo79376v((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.display_time((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (userPreferSettings2 != null) {
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

    public final Integer getDisplayTime() throws NullValueException {
        if (this.display_time != null) {
            return this.display_time;
        }
        throw new NullValueException();
    }

    public final Integer getN() throws NullValueException {
        if (this.f79484n != null) {
            return this.f79484n;
        }
        throw new NullValueException();
    }

    public final Integer getT() throws NullValueException {
        if (this.f79485t != null) {
            return this.f79485t;
        }
        throw new NullValueException();
    }

    public final Integer getV() throws NullValueException {
        if (this.f79486v != null) {
            return this.f79486v;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f79487n = this.f79484n;
        builder.f79488t = this.f79485t;
        builder.f79489v = this.f79486v;
        builder.display_time = this.display_time;
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
        if (this.f79484n != null) {
            i = this.f79484n.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.f79485t != null) {
            i2 = this.f79485t.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.f79486v != null) {
            i3 = this.f79486v.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.display_time != null) {
            i5 = this.display_time.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f79484n != null) {
            sb.append(", n=");
            sb.append(this.f79484n);
        }
        if (this.f79485t != null) {
            sb.append(", t=");
            sb.append(this.f79485t);
        }
        if (this.f79486v != null) {
            sb.append(", v=");
            sb.append(this.f79486v);
        }
        if (this.display_time != null) {
            sb.append(", display_time=");
            sb.append(this.display_time);
        }
        StringBuilder replace = sb.replace(0, 2, "UserPreferSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPreferSettings)) {
            return false;
        }
        UserPreferSettings userPreferSettings = (UserPreferSettings) obj;
        if (!unknownFields().equals(userPreferSettings.unknownFields()) || !Internal.equals(this.f79484n, userPreferSettings.f79484n) || !Internal.equals(this.f79485t, userPreferSettings.f79485t) || !Internal.equals(this.f79486v, userPreferSettings.f79486v) || !Internal.equals(this.display_time, userPreferSettings.display_time)) {
            return false;
        }
        return true;
    }

    public UserPreferSettings(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public UserPreferSettings(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f79484n = num;
        this.f79485t = num2;
        this.f79486v = num3;
        this.display_time = num4;
    }
}
