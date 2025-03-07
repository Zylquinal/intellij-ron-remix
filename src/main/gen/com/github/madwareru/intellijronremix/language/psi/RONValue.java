// This is a generated file. Not intended for manual editing.
package com.github.madwareru.intellijronremix.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RONValue extends PsiElement {

  @Nullable
  RONBool getBool();

  @Nullable
  RONEnum getEnum();

  @Nullable
  RONList getList();

  @Nullable
  RONMap getMap();

  @Nullable
  RONObject getObject();

  @Nullable
  RONOption getOption();

  @Nullable
  PsiElement getFloat();

  @Nullable
  PsiElement getInteger();

}
