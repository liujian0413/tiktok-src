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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel */
public final class C30207xa03e9512 extends Message<C30207xa03e9512, Builder> {
    public static final DefaultValueProtoAdapter<C30207xa03e9512> ADAPTER = new C30208x89d8df3a();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 267416772)
    public final Boolean enabled;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C30207xa03e9512, Builder> {
        public Boolean enabled;

        public final C30207xa03e9512 build() {
            return new C30207xa03e9512(this.enabled, super.buildUnknownFields());
        }

        public final Builder enabled(Boolean bool) {
            this.enabled = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel$ProtoAdapter_com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel */
    static final class C30208x89d8df3a extends DefaultValueProtoAdapter<C30207xa03e9512> {
        public final C30207xa03e9512 redact(C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) {
            return com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel;
        }

        public C30208x89d8df3a() {
            super(FieldEncoding.LENGTH_DELIMITED, C30207xa03e9512.class);
        }

        public final C30207xa03e9512 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C30207xa03e9512) null);
        }

        public final int encodedSize(C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(267416772, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled) + com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 267416772, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields());
        }

        public final C30207xa03e9512 decode(ProtoReader protoReader, C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel) throws IOException {
            Builder builder;
            C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 = (C30207xa03e9512) C10938a.m32097a().mo26425a(C30207xa03e9512.class, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel);
            if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 != null) {
                builder = com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 267416772) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.enabled((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final Boolean getEnabled() throws NullValueException {
        if (this.enabled != null) {
            return this.enabled;
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
        if (this.enabled != null) {
            i = this.enabled.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enabled = this.enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enabled != null) {
            sb.append(", enabled=");
            sb.append(this.enabled);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_commercialize_model_AwemeAdRankSettingsModel{");
        replace.append('}');
        return replace.toString();
    }

    public C30207xa03e9512(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30207xa03e9512)) {
            return false;
        }
        C30207xa03e9512 com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel = (C30207xa03e9512) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.unknownFields()) || !Internal.equals(this.enabled, com_ss_android_ugc_aweme_commercialize_model_awemeadranksettingsmodel.enabled)) {
            return false;
        }
        return true;
    }

    public C30207xa03e9512(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enabled = bool;
    }
}
