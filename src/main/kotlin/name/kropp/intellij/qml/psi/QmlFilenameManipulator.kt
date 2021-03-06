package name.kropp.intellij.qml.psi

import com.intellij.openapi.util.TextRange
import com.intellij.psi.ElementManipulator

class QmlFilenameManipulator : ElementManipulator<QmlFilename> {
  override fun handleContentChange(element: QmlFilename, range: TextRange, newContent: String?): QmlFilename {
    val oldText = element.text
    val newText = oldText.substring(0, range.startOffset) + newContent + oldText.substring(range.endOffset, oldText.length)
    return element.updateText(newText)
  }

  override fun handleContentChange(element: QmlFilename, newContent: String?) = handleContentChange(element, getRangeInElement(element), newContent)

  override fun getRangeInElement(element: QmlFilename) = TextRange(1, element.textRange.length - 1)
}