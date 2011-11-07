package pl.mjedynak.idea.plugins.builder.factory;

import com.intellij.openapi.ui.popup.PopupChooserBuilder;

import javax.swing.*;

public interface PopupChooserBuilderFactory {
    PopupChooserBuilder getPopupChooserBuilder(JList list);
}
