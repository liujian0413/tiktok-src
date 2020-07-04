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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings */
public final class AgeGateSettings extends Message<AgeGateSettings, Builder> {
    public static final DefaultValueProtoAdapter<AgeGateSettings> ADAPTER = new ProtoAdapter_AgeGateSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer initial_date;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AgeGateSettings, Builder> {
        public Integer initial_date;

        public final AgeGateSettings build() {
            return new AgeGateSettings(this.initial_date, super.buildUnknownFields());
        }

        public final Builder initial_date(Integer num) {
            this.initial_date = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AgeGateSettings$ProtoAdapter_AgeGateSettings */
    static final class ProtoAdapter_AgeGateSettings extends DefaultValueProtoAdapter<AgeGateSettings> {
        public final AgeGateSettings redact(AgeGateSettings ageGateSettings) {
            return ageGateSettings;
        }

        public ProtoAdapter_AgeGateSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, AgeGateSettings.class);
        }

        public final AgeGateSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AgeGateSettings) null);
        }

        public final int encodedSize(AgeGateSettings ageGateSettings) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, ageGateSettings.initial_date) + ageGateSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AgeGateSettings ageGateSettings) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, ageGateSettings.initial_date);
            protoWriter.writeBytes(ageGateSettings.unknownFields());
        }

        public final AgeGateSettings decode(ProtoReader protoReader, AgeGateSettings ageGateSettings) throws IOException {
            Builder builder;
            AgeGateSettings ageGateSettings2 = (AgeGateSettings) C10938a.m32097a().mo26425a(AgeGateSettings.class, ageGateSettings);
            if (ageGateSettings2 != null) {
                builder = ageGateSettings2.newBuilder();
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
                        if (ageGateSettings2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.initial_date((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getInitialDate() throws NullValueException {
        if (this.initial_date != null) {
            return this.initial_date;
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
        if (this.initial_date != null) {
            i = this.initial_date.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.initial_date = this.initial_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.initial_date != null) {
            sb.append(", initial_date=");
            sb.append(this.initial_date);
        }
        StringBuilder replace = sb.replace(0, 2, "AgeGateSettings{");
        replace.append('}');
        return replace.toString();
    }

    public AgeGateSettings(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgeGateSettings)) {
            return false;
        }
        AgeGateSettings ageGateSettings = (AgeGateSettings) obj;
        if (!unknownFields().equals(ageGateSettings.unknownFields()) || !Internal.equals(this.initial_date, ageGateSettings.initial_date)) {
            return false;
        }
        return true;
    }

    public AgeGateSettings(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.initial_date = num;
    }
}
