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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings */
public final class AdFeSettings extends Message<AdFeSettings, Builder> {
    public static final DefaultValueProtoAdapter<AdFeSettings> ADAPTER = new ProtoAdapter_AdFeSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String legal_page;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AdFeSettings, Builder> {
        public String legal_page;

        public final AdFeSettings build() {
            return new AdFeSettings(this.legal_page, super.buildUnknownFields());
        }

        public final Builder legal_page(String str) {
            this.legal_page = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings$ProtoAdapter_AdFeSettings */
    static final class ProtoAdapter_AdFeSettings extends DefaultValueProtoAdapter<AdFeSettings> {
        public final AdFeSettings redact(AdFeSettings adFeSettings) {
            return adFeSettings;
        }

        public ProtoAdapter_AdFeSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, AdFeSettings.class);
        }

        public final AdFeSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AdFeSettings) null);
        }

        public final int encodedSize(AdFeSettings adFeSettings) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, adFeSettings.legal_page) + adFeSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AdFeSettings adFeSettings) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, adFeSettings.legal_page);
            protoWriter.writeBytes(adFeSettings.unknownFields());
        }

        public final AdFeSettings decode(ProtoReader protoReader, AdFeSettings adFeSettings) throws IOException {
            Builder builder;
            AdFeSettings adFeSettings2 = (AdFeSettings) C10938a.m32097a().mo26425a(AdFeSettings.class, adFeSettings);
            if (adFeSettings2 != null) {
                builder = adFeSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (adFeSettings2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.legal_page((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getLegalPage() throws NullValueException {
        if (this.legal_page != null) {
            return this.legal_page;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.legal_page != null) {
            i = this.legal_page.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.legal_page = this.legal_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.legal_page != null) {
            sb.append(", legal_page=");
            sb.append(this.legal_page);
        }
        StringBuilder replace = sb.replace(0, 2, "AdFeSettings{");
        replace.append('}');
        return replace.toString();
    }

    public AdFeSettings(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdFeSettings)) {
            return false;
        }
        AdFeSettings adFeSettings = (AdFeSettings) obj;
        if (!unknownFields().equals(adFeSettings.unknownFields()) || !Internal.equals(this.legal_page, adFeSettings.legal_page)) {
            return false;
        }
        return true;
    }

    public AdFeSettings(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.legal_page = str;
    }
}
