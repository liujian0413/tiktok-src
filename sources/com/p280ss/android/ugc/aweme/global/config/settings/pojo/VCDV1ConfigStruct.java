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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VCDV1ConfigStruct */
public final class VCDV1ConfigStruct extends Message<VCDV1ConfigStruct, Builder> {
    public static final DefaultValueProtoAdapter<VCDV1ConfigStruct> ADAPTER = new ProtoAdapter_VCDV1ConfigStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 2)
    public final UrlModel app_icon;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", tag = 14)
    public final UrlModel app_icon_big;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String app_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer app_version;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public final String text_auth_alert;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String text_first_auth;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String text_low_version;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String text_not_install;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String text_open_auth;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public final String text_open_privacy;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String title_auth_alert;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String title_first_auth;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String title_low_version;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title_not_install;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String title_open_auth;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String title_open_privacy;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VCDV1ConfigStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VCDV1ConfigStruct, Builder> {
        public UrlModel app_icon;
        public UrlModel app_icon_big;
        public String app_name;
        public Integer app_version;
        public String text_auth_alert;
        public String text_first_auth;
        public String text_low_version;
        public String text_not_install;
        public String text_open_auth;
        public String text_open_privacy;
        public String title_auth_alert;
        public String title_first_auth;
        public String title_low_version;
        public String title_not_install;
        public String title_open_auth;
        public String title_open_privacy;

        public final VCDV1ConfigStruct build() {
            return new VCDV1ConfigStruct(this, super.buildUnknownFields());
        }

        public final Builder app_icon(UrlModel urlModel) {
            this.app_icon = urlModel;
            return this;
        }

        public final Builder app_icon_big(UrlModel urlModel) {
            this.app_icon_big = urlModel;
            return this;
        }

        public final Builder app_name(String str) {
            this.app_name = str;
            return this;
        }

        public final Builder app_version(Integer num) {
            this.app_version = num;
            return this;
        }

        public final Builder text_auth_alert(String str) {
            this.text_auth_alert = str;
            return this;
        }

        public final Builder text_first_auth(String str) {
            this.text_first_auth = str;
            return this;
        }

        public final Builder text_low_version(String str) {
            this.text_low_version = str;
            return this;
        }

        public final Builder text_not_install(String str) {
            this.text_not_install = str;
            return this;
        }

        public final Builder text_open_auth(String str) {
            this.text_open_auth = str;
            return this;
        }

        public final Builder text_open_privacy(String str) {
            this.text_open_privacy = str;
            return this;
        }

        public final Builder title_auth_alert(String str) {
            this.title_auth_alert = str;
            return this;
        }

        public final Builder title_first_auth(String str) {
            this.title_first_auth = str;
            return this;
        }

        public final Builder title_low_version(String str) {
            this.title_low_version = str;
            return this;
        }

        public final Builder title_not_install(String str) {
            this.title_not_install = str;
            return this;
        }

        public final Builder title_open_auth(String str) {
            this.title_open_auth = str;
            return this;
        }

        public final Builder title_open_privacy(String str) {
            this.title_open_privacy = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VCDV1ConfigStruct$ProtoAdapter_VCDV1ConfigStruct */
    static final class ProtoAdapter_VCDV1ConfigStruct extends DefaultValueProtoAdapter<VCDV1ConfigStruct> {
        public final VCDV1ConfigStruct redact(VCDV1ConfigStruct vCDV1ConfigStruct) {
            return vCDV1ConfigStruct;
        }

        public ProtoAdapter_VCDV1ConfigStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, VCDV1ConfigStruct.class);
        }

        public final VCDV1ConfigStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VCDV1ConfigStruct) null);
        }

        public final int encodedSize(VCDV1ConfigStruct vCDV1ConfigStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, vCDV1ConfigStruct.app_name) + UrlModel.ADAPTER.encodedSizeWithTag(2, vCDV1ConfigStruct.app_icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, vCDV1ConfigStruct.app_version) + ProtoAdapter.STRING.encodedSizeWithTag(4, vCDV1ConfigStruct.title_not_install) + ProtoAdapter.STRING.encodedSizeWithTag(5, vCDV1ConfigStruct.text_not_install) + ProtoAdapter.STRING.encodedSizeWithTag(6, vCDV1ConfigStruct.title_low_version) + ProtoAdapter.STRING.encodedSizeWithTag(7, vCDV1ConfigStruct.text_low_version) + ProtoAdapter.STRING.encodedSizeWithTag(8, vCDV1ConfigStruct.title_first_auth) + ProtoAdapter.STRING.encodedSizeWithTag(9, vCDV1ConfigStruct.text_first_auth) + ProtoAdapter.STRING.encodedSizeWithTag(10, vCDV1ConfigStruct.title_open_auth) + ProtoAdapter.STRING.encodedSizeWithTag(11, vCDV1ConfigStruct.text_open_auth) + ProtoAdapter.STRING.encodedSizeWithTag(12, vCDV1ConfigStruct.title_open_privacy) + ProtoAdapter.STRING.encodedSizeWithTag(13, vCDV1ConfigStruct.text_open_privacy) + UrlModel.ADAPTER.encodedSizeWithTag(14, vCDV1ConfigStruct.app_icon_big) + ProtoAdapter.STRING.encodedSizeWithTag(15, vCDV1ConfigStruct.title_auth_alert) + ProtoAdapter.STRING.encodedSizeWithTag(16, vCDV1ConfigStruct.text_auth_alert) + vCDV1ConfigStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VCDV1ConfigStruct vCDV1ConfigStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCDV1ConfigStruct.app_name);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 2, vCDV1ConfigStruct.app_icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, vCDV1ConfigStruct.app_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vCDV1ConfigStruct.title_not_install);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, vCDV1ConfigStruct.text_not_install);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, vCDV1ConfigStruct.title_low_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, vCDV1ConfigStruct.text_low_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, vCDV1ConfigStruct.title_first_auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCDV1ConfigStruct.text_first_auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vCDV1ConfigStruct.title_open_auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, vCDV1ConfigStruct.text_open_auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, vCDV1ConfigStruct.title_open_privacy);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, vCDV1ConfigStruct.text_open_privacy);
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 14, vCDV1ConfigStruct.app_icon_big);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, vCDV1ConfigStruct.title_auth_alert);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, vCDV1ConfigStruct.text_auth_alert);
            protoWriter.writeBytes(vCDV1ConfigStruct.unknownFields());
        }

        public final VCDV1ConfigStruct decode(ProtoReader protoReader, VCDV1ConfigStruct vCDV1ConfigStruct) throws IOException {
            Builder builder;
            VCDV1ConfigStruct vCDV1ConfigStruct2 = (VCDV1ConfigStruct) C10938a.m32097a().mo26425a(VCDV1ConfigStruct.class, vCDV1ConfigStruct);
            if (vCDV1ConfigStruct2 != null) {
                builder = vCDV1ConfigStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.app_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.app_icon((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.app_icon));
                            break;
                        case 3:
                            builder.app_version((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.title_not_install((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.text_not_install((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.title_low_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.text_low_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.title_first_auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.text_first_auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.title_open_auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.text_open_auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.title_open_privacy((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.text_open_privacy((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.app_icon_big((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.app_icon_big));
                            break;
                        case 15:
                            builder.title_auth_alert((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 16:
                            builder.text_auth_alert((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (vCDV1ConfigStruct2 != null) {
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

    public final UrlModel getAppIcon() throws NullValueException {
        if (this.app_icon != null) {
            return this.app_icon;
        }
        throw new NullValueException();
    }

    public final UrlModel getAppIconBig() throws NullValueException {
        if (this.app_icon_big != null) {
            return this.app_icon_big;
        }
        throw new NullValueException();
    }

    public final String getAppName() throws NullValueException {
        if (this.app_name != null) {
            return this.app_name;
        }
        throw new NullValueException();
    }

    public final Integer getAppVersion() throws NullValueException {
        if (this.app_version != null) {
            return this.app_version;
        }
        throw new NullValueException();
    }

    public final String getTextAuthAlert() throws NullValueException {
        if (this.text_auth_alert != null) {
            return this.text_auth_alert;
        }
        throw new NullValueException();
    }

    public final String getTextFirstAuth() throws NullValueException {
        if (this.text_first_auth != null) {
            return this.text_first_auth;
        }
        throw new NullValueException();
    }

    public final String getTextLowVersion() throws NullValueException {
        if (this.text_low_version != null) {
            return this.text_low_version;
        }
        throw new NullValueException();
    }

    public final String getTextNotInstall() throws NullValueException {
        if (this.text_not_install != null) {
            return this.text_not_install;
        }
        throw new NullValueException();
    }

    public final String getTextOpenAuth() throws NullValueException {
        if (this.text_open_auth != null) {
            return this.text_open_auth;
        }
        throw new NullValueException();
    }

    public final String getTextOpenPrivacy() throws NullValueException {
        if (this.text_open_privacy != null) {
            return this.text_open_privacy;
        }
        throw new NullValueException();
    }

    public final String getTitleAuthAlert() throws NullValueException {
        if (this.title_auth_alert != null) {
            return this.title_auth_alert;
        }
        throw new NullValueException();
    }

    public final String getTitleFirstAuth() throws NullValueException {
        if (this.title_first_auth != null) {
            return this.title_first_auth;
        }
        throw new NullValueException();
    }

    public final String getTitleLowVersion() throws NullValueException {
        if (this.title_low_version != null) {
            return this.title_low_version;
        }
        throw new NullValueException();
    }

    public final String getTitleNotInstall() throws NullValueException {
        if (this.title_not_install != null) {
            return this.title_not_install;
        }
        throw new NullValueException();
    }

    public final String getTitleOpenAuth() throws NullValueException {
        if (this.title_open_auth != null) {
            return this.title_open_auth;
        }
        throw new NullValueException();
    }

    public final String getTitleOpenPrivacy() throws NullValueException {
        if (this.title_open_privacy != null) {
            return this.title_open_privacy;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.app_name = this.app_name;
        builder.app_icon = this.app_icon;
        builder.app_version = this.app_version;
        builder.title_not_install = this.title_not_install;
        builder.text_not_install = this.text_not_install;
        builder.title_low_version = this.title_low_version;
        builder.text_low_version = this.text_low_version;
        builder.title_first_auth = this.title_first_auth;
        builder.text_first_auth = this.text_first_auth;
        builder.title_open_auth = this.title_open_auth;
        builder.text_open_auth = this.text_open_auth;
        builder.title_open_privacy = this.title_open_privacy;
        builder.text_open_privacy = this.text_open_privacy;
        builder.app_icon_big = this.app_icon_big;
        builder.title_auth_alert = this.title_auth_alert;
        builder.text_auth_alert = this.text_auth_alert;
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
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.hashCode;
        if (i16 != 0) {
            return i16;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i17 = 0;
        if (this.app_name != null) {
            i = this.app_name.hashCode();
        } else {
            i = 0;
        }
        int i18 = (hashCode + i) * 37;
        if (this.app_icon != null) {
            i2 = this.app_icon.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (i18 + i2) * 37;
        if (this.app_version != null) {
            i3 = this.app_version.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 37;
        if (this.title_not_install != null) {
            i4 = this.title_not_install.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 37;
        if (this.text_not_install != null) {
            i5 = this.text_not_install.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        if (this.title_low_version != null) {
            i6 = this.title_low_version.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        if (this.text_low_version != null) {
            i7 = this.text_low_version.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        if (this.title_first_auth != null) {
            i8 = this.title_first_auth.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        if (this.text_first_auth != null) {
            i9 = this.text_first_auth.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        if (this.title_open_auth != null) {
            i10 = this.title_open_auth.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        if (this.text_open_auth != null) {
            i11 = this.text_open_auth.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        if (this.title_open_privacy != null) {
            i12 = this.title_open_privacy.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 37;
        if (this.text_open_privacy != null) {
            i13 = this.text_open_privacy.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 37;
        if (this.app_icon_big != null) {
            i14 = this.app_icon_big.hashCode();
        } else {
            i14 = 0;
        }
        int i31 = (i30 + i14) * 37;
        if (this.title_auth_alert != null) {
            i15 = this.title_auth_alert.hashCode();
        } else {
            i15 = 0;
        }
        int i32 = (i31 + i15) * 37;
        if (this.text_auth_alert != null) {
            i17 = this.text_auth_alert.hashCode();
        }
        int i33 = i32 + i17;
        this.hashCode = i33;
        return i33;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        if (this.app_icon != null) {
            sb.append(", app_icon=");
            sb.append(this.app_icon);
        }
        if (this.app_version != null) {
            sb.append(", app_version=");
            sb.append(this.app_version);
        }
        if (this.title_not_install != null) {
            sb.append(", title_not_install=");
            sb.append(this.title_not_install);
        }
        if (this.text_not_install != null) {
            sb.append(", text_not_install=");
            sb.append(this.text_not_install);
        }
        if (this.title_low_version != null) {
            sb.append(", title_low_version=");
            sb.append(this.title_low_version);
        }
        if (this.text_low_version != null) {
            sb.append(", text_low_version=");
            sb.append(this.text_low_version);
        }
        if (this.title_first_auth != null) {
            sb.append(", title_first_auth=");
            sb.append(this.title_first_auth);
        }
        if (this.text_first_auth != null) {
            sb.append(", text_first_auth=");
            sb.append(this.text_first_auth);
        }
        if (this.title_open_auth != null) {
            sb.append(", title_open_auth=");
            sb.append(this.title_open_auth);
        }
        if (this.text_open_auth != null) {
            sb.append(", text_open_auth=");
            sb.append(this.text_open_auth);
        }
        if (this.title_open_privacy != null) {
            sb.append(", title_open_privacy=");
            sb.append(this.title_open_privacy);
        }
        if (this.text_open_privacy != null) {
            sb.append(", text_open_privacy=");
            sb.append(this.text_open_privacy);
        }
        if (this.app_icon_big != null) {
            sb.append(", app_icon_big=");
            sb.append(this.app_icon_big);
        }
        if (this.title_auth_alert != null) {
            sb.append(", title_auth_alert=");
            sb.append(this.title_auth_alert);
        }
        if (this.text_auth_alert != null) {
            sb.append(", text_auth_alert=");
            sb.append(this.text_auth_alert);
        }
        StringBuilder replace = sb.replace(0, 2, "VCDV1ConfigStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VCDV1ConfigStruct)) {
            return false;
        }
        VCDV1ConfigStruct vCDV1ConfigStruct = (VCDV1ConfigStruct) obj;
        if (!unknownFields().equals(vCDV1ConfigStruct.unknownFields()) || !Internal.equals(this.app_name, vCDV1ConfigStruct.app_name) || !Internal.equals(this.app_icon, vCDV1ConfigStruct.app_icon) || !Internal.equals(this.app_version, vCDV1ConfigStruct.app_version) || !Internal.equals(this.title_not_install, vCDV1ConfigStruct.title_not_install) || !Internal.equals(this.text_not_install, vCDV1ConfigStruct.text_not_install) || !Internal.equals(this.title_low_version, vCDV1ConfigStruct.title_low_version) || !Internal.equals(this.text_low_version, vCDV1ConfigStruct.text_low_version) || !Internal.equals(this.title_first_auth, vCDV1ConfigStruct.title_first_auth) || !Internal.equals(this.text_first_auth, vCDV1ConfigStruct.text_first_auth) || !Internal.equals(this.title_open_auth, vCDV1ConfigStruct.title_open_auth) || !Internal.equals(this.text_open_auth, vCDV1ConfigStruct.text_open_auth) || !Internal.equals(this.title_open_privacy, vCDV1ConfigStruct.title_open_privacy) || !Internal.equals(this.text_open_privacy, vCDV1ConfigStruct.text_open_privacy) || !Internal.equals(this.app_icon_big, vCDV1ConfigStruct.app_icon_big) || !Internal.equals(this.title_auth_alert, vCDV1ConfigStruct.title_auth_alert) || !Internal.equals(this.text_auth_alert, vCDV1ConfigStruct.text_auth_alert)) {
            return false;
        }
        return true;
    }

    public VCDV1ConfigStruct(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_name = builder.app_name;
        this.app_icon = builder.app_icon;
        this.app_version = builder.app_version;
        this.title_not_install = builder.title_not_install;
        this.text_not_install = builder.text_not_install;
        this.title_low_version = builder.title_low_version;
        this.text_low_version = builder.text_low_version;
        this.title_first_auth = builder.title_first_auth;
        this.text_first_auth = builder.text_first_auth;
        this.title_open_auth = builder.title_open_auth;
        this.text_open_auth = builder.text_open_auth;
        this.title_open_privacy = builder.title_open_privacy;
        this.text_open_privacy = builder.text_open_privacy;
        this.app_icon_big = builder.app_icon_big;
        this.title_auth_alert = builder.title_auth_alert;
        this.text_auth_alert = builder.text_auth_alert;
    }
}
