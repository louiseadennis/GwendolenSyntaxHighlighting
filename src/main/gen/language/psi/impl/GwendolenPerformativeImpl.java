// This is a generated file. Not intended for manual editing.
package language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static language.psi.GwendolenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import language.psi.*;

public class GwendolenPerformativeImpl extends ASTWrapperPsiElement implements GwendolenPerformative {

  public GwendolenPerformativeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GwendolenVisitor visitor) {
    visitor.visitPerformative(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GwendolenVisitor) accept((GwendolenVisitor)visitor);
    else super.accept(visitor);
  }

}
