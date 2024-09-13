package language;

import com.intellij.openapi.fileTypes.LanguageFileType;

import javax.swing.Icon;

public class GwendolenFileType  extends LanguageFileType {

    public static final GwendolenFileType INSTANCE = new GwendolenFileType();

    private GwendolenFileType() {
        super(GwendolenLanguage.INSTANCE);
    }

    public String getName() {
        return "Gwendolen File";
    }

    public String getDescription() {
        return "Gwendolen language file";
    }

    public String getDefaultExtension() {
        return "gwen";
    }

    public Icon getIcon() {
        return GwenIcons.FILE;
    }
}
