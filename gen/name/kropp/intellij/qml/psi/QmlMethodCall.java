// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlMethodCall extends PsiElement {

  @NotNull
  List<QmlArgument> getArgumentList();

  @NotNull
  QmlMethod getMethod();

}