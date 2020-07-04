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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadSettings */
public final class DownloadSettings extends Message<DownloadSettings, Builder> {
    public static final DefaultValueProtoAdapter<DownloadSettings> ADAPTER = new ProtoAdapter_DownloadSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings#ADAPTER", tag = 1)
    public final DownloadDialogSettings download_dialog_config;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer download_lib_switch;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DownloadSettings, Builder> {
        public DownloadDialogSettings download_dialog_config;
        public Integer download_lib_switch;

        public final DownloadSettings build() {
            return new DownloadSettings(this.download_dialog_config, this.download_lib_switch, super.buildUnknownFields());
        }

        public final Builder download_dialog_config(DownloadDialogSettings downloadDialogSettings) {
            this.download_dialog_config = downloadDialogSettings;
            return this;
        }

        public final Builder download_lib_switch(Integer num) {
            this.download_lib_switch = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadSettings$ProtoAdapter_DownloadSettings */
    static final class ProtoAdapter_DownloadSettings extends DefaultValueProtoAdapter<DownloadSettings> {
        public final DownloadSettings redact(DownloadSettings downloadSettings) {
            return downloadSettings;
        }

        public ProtoAdapter_DownloadSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadSettings.class);
        }

        public final DownloadSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DownloadSettings) null);
        }

        public final int encodedSize(DownloadSettings downloadSettings) {
            return DownloadDialogSettings.ADAPTER.encodedSizeWithTag(1, downloadSettings.download_dialog_config) + ProtoAdapter.INT32.encodedSizeWithTag(2, downloadSettings.download_lib_switch) + downloadSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DownloadSettings downloadSettings) throws IOException {
            DownloadDialogSettings.ADAPTER.encodeWithTag(protoWriter, 1, downloadSettings.download_dialog_config);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, downloadSettings.download_lib_switch);
            protoWriter.writeBytes(downloadSettings.unknownFields());
        }

        public final DownloadSettings decode(ProtoReader protoReader, DownloadSettings downloadSettings) throws IOException {
            Builder builder;
            DownloadSettings downloadSettings2 = (DownloadSettings) C10938a.m32097a().mo26425a(DownloadSettings.class, downloadSettings);
            if (downloadSettings2 != null) {
                builder = downloadSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.download_dialog_config((DownloadDialogSettings) DownloadDialogSettings.ADAPTER.decode(protoReader, builder.download_dialog_config));
                            break;
                        case 2:
                            builder.download_lib_switch((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (downloadSettings2 != null) {
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

    public final DownloadDialogSettings getDownloadDialogConfig() throws NullValueException {
        if (this.download_dialog_config != null) {
            return this.download_dialog_config;
        }
        throw new NullValueException();
    }

    public final Integer getDownloadLibSwitch() throws NullValueException {
        if (this.download_lib_switch != null) {
            return this.download_lib_switch;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.download_dialog_config = this.download_dialog_config;
        builder.download_lib_switch = this.download_lib_switch;
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
        if (this.download_dialog_config != null) {
            i = this.download_dialog_config.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.download_lib_switch != null) {
            i3 = this.download_lib_switch.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.download_dialog_config != null) {
            sb.append(", download_dialog_config=");
            sb.append(this.download_dialog_config);
        }
        if (this.download_lib_switch != null) {
            sb.append(", download_lib_switch=");
            sb.append(this.download_lib_switch);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadSettings)) {
            return false;
        }
        DownloadSettings downloadSettings = (DownloadSettings) obj;
        if (!unknownFields().equals(downloadSettings.unknownFields()) || !Internal.equals(this.download_dialog_config, downloadSettings.download_dialog_config) || !Internal.equals(this.download_lib_switch, downloadSettings.download_lib_switch)) {
            return false;
        }
        return true;
    }

    public DownloadSettings(DownloadDialogSettings downloadDialogSettings, Integer num) {
        this(downloadDialogSettings, num, ByteString.EMPTY);
    }

    public DownloadSettings(DownloadDialogSettings downloadDialogSettings, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_dialog_config = downloadDialogSettings;
        this.download_lib_switch = num;
    }
}
