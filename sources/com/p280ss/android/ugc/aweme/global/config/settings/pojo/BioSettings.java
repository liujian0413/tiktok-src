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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BioSettings */
public final class BioSettings extends Message<BioSettings, Builder> {
    public static final DefaultValueProtoAdapter<BioSettings> ADAPTER = new ProtoAdapter_BioSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean enable_bio_email;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean enable_bio_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BioSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BioSettings, Builder> {
        public Boolean enable_bio_email;
        public Boolean enable_bio_url;

        public final BioSettings build() {
            return new BioSettings(this.enable_bio_url, this.enable_bio_email, super.buildUnknownFields());
        }

        public final Builder enable_bio_email(Boolean bool) {
            this.enable_bio_email = bool;
            return this;
        }

        public final Builder enable_bio_url(Boolean bool) {
            this.enable_bio_url = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BioSettings$ProtoAdapter_BioSettings */
    static final class ProtoAdapter_BioSettings extends DefaultValueProtoAdapter<BioSettings> {
        public final BioSettings redact(BioSettings bioSettings) {
            return bioSettings;
        }

        public ProtoAdapter_BioSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, BioSettings.class);
        }

        public final BioSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (BioSettings) null);
        }

        public final int encodedSize(BioSettings bioSettings) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, bioSettings.enable_bio_url) + ProtoAdapter.BOOL.encodedSizeWithTag(2, bioSettings.enable_bio_email) + bioSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, BioSettings bioSettings) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, bioSettings.enable_bio_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, bioSettings.enable_bio_email);
            protoWriter.writeBytes(bioSettings.unknownFields());
        }

        public final BioSettings decode(ProtoReader protoReader, BioSettings bioSettings) throws IOException {
            Builder builder;
            BioSettings bioSettings2 = (BioSettings) C10938a.m32097a().mo26425a(BioSettings.class, bioSettings);
            if (bioSettings2 != null) {
                builder = bioSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.enable_bio_url((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.enable_bio_email((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (bioSettings2 != null) {
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

    public final Boolean getEnableBioEmail() throws NullValueException {
        if (this.enable_bio_email != null) {
            return this.enable_bio_email;
        }
        throw new NullValueException();
    }

    public final Boolean getEnableBioUrl() throws NullValueException {
        if (this.enable_bio_url != null) {
            return this.enable_bio_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable_bio_url = this.enable_bio_url;
        builder.enable_bio_email = this.enable_bio_email;
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
        if (this.enable_bio_url != null) {
            i = this.enable_bio_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.enable_bio_email != null) {
            i3 = this.enable_bio_email.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_bio_url != null) {
            sb.append(", enable_bio_url=");
            sb.append(this.enable_bio_url);
        }
        if (this.enable_bio_email != null) {
            sb.append(", enable_bio_email=");
            sb.append(this.enable_bio_email);
        }
        StringBuilder replace = sb.replace(0, 2, "BioSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BioSettings)) {
            return false;
        }
        BioSettings bioSettings = (BioSettings) obj;
        if (!unknownFields().equals(bioSettings.unknownFields()) || !Internal.equals(this.enable_bio_url, bioSettings.enable_bio_url) || !Internal.equals(this.enable_bio_email, bioSettings.enable_bio_email)) {
            return false;
        }
        return true;
    }

    public BioSettings(Boolean bool, Boolean bool2) {
        this(bool, bool2, ByteString.EMPTY);
    }

    public BioSettings(Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_bio_url = bool;
        this.enable_bio_email = bool2;
    }
}
